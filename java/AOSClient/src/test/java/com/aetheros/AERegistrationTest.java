// Copyright (c) Aetheros, Inc.  See COPYRIGHT

package com.aetheros;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

import java.io.File;
import java.io.FileWriter;

import com.aetheros.aos.onem2m.client.AOSClient;
import com.aetheros.aos.onem2m.client.cse.CSE;
import com.aetheros.aos.onem2m.common.resources.AE;

public class AERegistrationTest {
    // Server.
    final String PROTOCOL = "coap";
    final String DEVICE_GATEWAY = "192.168.225.1";
    final int PORT = 8100;

    // File aei will be persisted to.
    final String AE_FILE_TXT = "ae.reg.example.id";

    @Test
    public void aeRegistrationTest() {
        // Create an instance of the AOSClient.
        AOSClient aos = new AOSClient();

        // AE args.
        final String aeAppId = "Na1.com.aetheros.iot";
        final String aeAppName = "reg-test-app";
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
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}