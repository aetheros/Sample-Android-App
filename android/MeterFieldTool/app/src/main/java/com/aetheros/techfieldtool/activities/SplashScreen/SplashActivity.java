// Copyright (c) Aetheros, Inc.  See COPYRIGHT

package com.aetheros.techfieldtool.activities.SplashScreen;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.aetheros.techfieldtool.activities.AvailableDevices.AvailableDevicesActivity;
import com.aetheros.techfieldtool.activities.ConnectionMethods.ConnectionMethodsActivity;
import com.aetheros.techfieldtool.utils.Bluetooth;
import com.aetheros.techfieldtool.utils.alerts.ErrorAlert;

public class SplashActivity extends AppCompatActivity {
    private final String TAG = "SplashActivity";
    private final int SPLASH_DELAY = 1000;
    private final int REQUEST_ENABLE_BT = 1;

    @Override
    protected void onCreate(Bundle savedInstanceBundle) {
        super.onCreate(savedInstanceBundle);

        // No content view is set in this activity.  The activity theme is responsible
        // for the splash screen graphics.  The splash screen will show for SPLASH_DELAY
        // ms before it checks that bluetooth is both support and enabled by the device.
        Handler handler = new Handler();
//        handler.postDelayed(checkBluetoothAvailability(new Bluetooth(this)), SPLASH_DELAY);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startConnectionMethodsActivity();
            }
        }, SPLASH_DELAY);
    }

    /**
     * Checks is the device supports bluetooth and if it is enabled.
     * If the device does not support bt, the app displays an error dialog
     * and exits.  If the device supports bt, but it is not enabled, it
     * presents the user with a dialog box to enable it in app.
     *
     * @param bt Instance of Bluetooth.
     * @return An instance of runnable.
     */
    private Runnable checkBluetoothAvailability(Bluetooth bt) {
        class CheckBluetooth implements Runnable {
            Bluetooth bt;

            CheckBluetooth(Bluetooth bt) {
                this.bt = bt;
            }

            @Override
            public void run() {
                // Determine if the device supports bluetooth and if it is enabled.
                if (bt.isSupported()) {
                    if (!bt.isEnabled()) {
                        Log.i(TAG, "Bluetooth is NOT enabled.");

                        // Ask the user to enabled bluetooth in app.
                        Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
                        startActivityForResult(enableBtIntent, REQUEST_ENABLE_BT);

                    } else {
                        Log.i(TAG, "Bluetooth IS enabled.");

                        startAvailableDevicesActivity();
                    }
                } else {
                    Log.i(TAG, "Bluetooth is NOT supported");

                    ErrorAlert errorAlert = new ErrorAlert(getBaseContext(), "Bluetooth is not supported by this device.");
                    errorAlert.show();
                }
            }
        }

        return new Thread(new CheckBluetooth(bt));
    }


    /**
     * This is called when startActivityForResult returns.
     *
     * @param requestCode
     * @param resultCode
     * @param data
     */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_ENABLE_BT) {
            if (resultCode == RESULT_OK) {
                // If the user enabled blue tooth start the AvailableDevicesActivity.
                startAvailableDevicesActivity();
            } else {
                ErrorAlert errorAlert = new ErrorAlert(this, "You must enable Bluetooth to use this app.");
                errorAlert.show();
            }
        }
    }

    /**
     * Starts the connection methods activity.
     */
    private void startConnectionMethodsActivity() {
        Intent intent = new Intent(getBaseContext(), ConnectionMethodsActivity.class);
        startActivity(intent);
        finish();
    }

    /**
     * Starts the available devices activity.
     */
    private void startAvailableDevicesActivity() {
        Intent intent = new Intent(getBaseContext(), AvailableDevicesActivity.class);
        startActivity(intent);
        finish();
    }
}
