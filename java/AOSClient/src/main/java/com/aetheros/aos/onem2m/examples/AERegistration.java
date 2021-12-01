// Copyright (c) Aetheros, Inc.  See COPYRIGHT

package com.aetheros.aos.onem2m.examples;

import java.io.File;
import java.io.FileWriter;

import com.aetheros.aos.onem2m.client.AOSClient;
import com.aetheros.aos.onem2m.client.cse.CSE;
import com.aetheros.aos.onem2m.common.resources.AE;

/**
 * Register an AE with a CSE.
 */
public class AERegistration {
    public static void main() {
        // Server.
        final String PROTOCOL = "coap";
        final String DEVICE_GATEWAY = "192.168.225.1";
        final int PORT = 8100;

        // File aei will be persisted to.
        final String AE_FILE_TXT = "ae.example.id";
        
        // Create an instance of the AOSClient.
        AOSClient aos = new AOSClient();

        // AE args.
        final String aeAppId = "Na1.com.aetheros.iot";
        final String aeAppName = "demo-test-app";
        final String[] poa = new String[] { String.format("%s://%s:%d", PROTOCOL, DEVICE_GATEWAY, PORT) };

        // Get and instance of the CSE using the AOSClient.
        CSE mncse = aos.getCSE(DEVICE_GATEWAY, PORT);

        try {
            // Registration. If the aei has not been saved to disk, attempt
            // to reigster with the device. Otherwise, use the stored aei.
            // The AE contains the aei that you need to make requests
            // the the cse.
            File aeFile = new File(AE_FILE_TXT);

            // Create the ae to send to the cse.
            AE ae = mncse.register(new AE(aeAppId, aeAppName, poa));


            // Create the file to store the aei.
            if (aeFile.createNewFile()) {
                // Write the aei to file.
                FileWriter fileWriter = new FileWriter(AE_FILE_TXT);
                fileWriter.write(ae.getAei());
                fileWriter.close();
            } else {
                System.out.println("There was an error writing the AE to file.");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}