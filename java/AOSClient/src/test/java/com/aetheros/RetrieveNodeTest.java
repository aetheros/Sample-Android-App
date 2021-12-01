// Copyright (c) Aetheros, Inc.  See COPYRIGHT

package com.aetheros;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

import java.io.File;
import java.io.FileWriter;
import java.util.List;
import java.util.Scanner;

import com.aetheros.aos.onem2m.client.AOSClient;
import com.aetheros.aos.onem2m.client.cse.CSE;
import com.aetheros.aos.onem2m.common.resources.AE;
import com.aetheros.aos.onem2m.common.resources.Child;
import com.aetheros.aos.onem2m.common.resources.ExternalConnectivityMonitor;
import com.aetheros.aos.onem2m.common.resources.Node;

public class RetrieveNodeTest {
    @Test public void retrieveNodeTest() {
        // Server.
        final String PROTOCOL = "coap";
        final String DEVICE_GATEWAY = "192.168.225.1";
        final int PORT = 8100;
        
        // File aei will be persisted to.
        final String AE_FILE_TXT = "ae.id";

        // Create an instance of the AOSClient.
        AOSClient aos = new AOSClient();

        // AE args.
        final String aeAppId = "Na1.com.aetheros.iot";
        final String aeAppName = "demo-test-app";
        final String[] poa = new String[] { String.format("%s://%s:%d", PROTOCOL, DEVICE_GATEWAY, PORT)};

        // Get and instance of the CSE using the AOSClient.
        CSE mncse =  aos.getCSE(DEVICE_GATEWAY, PORT);

        try {
            // Registration.  If the aei has not been saved to disk, attempt
            // to reigster with the device.  Otherwise, use the stored aei.
            // The AE contains the aei that you need to make requests
            // the the cse.
            File aeFile = new File(AE_FILE_TXT);

            // Create the ae to send to the cse.
            AE ae = new AE(aeAppId, aeAppName, poa);

            // Check if the aei has already been stored to disk.
            if(aeFile.exists()) {
                // Read the contents - aei - from the file and add it to 
                // the ae instance.
                Scanner scanner = new Scanner(aeFile);
                String aei = scanner.next();
                scanner.close();

                ae.setAei(aei);
            } else {
                // Register with the device.  Override the existing ae with the
                // one returned from the cse registration call.
                // This instance of ae will contain the aei needed to make future
                // requests to the cse.
                ae = mncse.register(ae);

                // Create the file to store the aei.
                if(aeFile.createNewFile()) {
                    // Write the aei to file.
                    FileWriter fileWriter = new FileWriter(AE_FILE_TXT);
                    fileWriter.write(ae.getAei());
                    fileWriter.close();
                } else {
                    System.out.println("There was an error writing the AE to file.");
                }
            }

            // Use the ae to retrieve the node from the cse.
            Node node = mncse.retrieveNode(ae);

            // Get the children.
            List<Child> children = node.getChildren();

            // Find the rsrp and rsrq.
            for(Child child: children) {
                if(child instanceof ExternalConnectivityMonitor) {
                    ExternalConnectivityMonitor cmext = (ExternalConnectivityMonitor) child;
                    System.out.println(cmext.getRsrp());
                    System.out.println(cmext.getRsrq());
                }
            }

            assertThat(node, instanceOf(Node.class));
        } catch(Exception ex) {
            // handle exceptions...
        }
    }
}