// Copyright (c) Aetheros, Inc.  See COPYRIGHT

package com.aetheros.techfieldtool.activities.AccessPointDiscovery.wifi;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.aetheros.techfieldtool.R;
import com.aetheros.techfieldtool.activities.DeviceCommands.DeviceCommandsActivity;
import com.aetheros.techfieldtool.components.Toolbar.ToolbarComponent;
import com.aetheros.techfieldtool.utils.DeviceCommand;

import java.util.ArrayList;

public class SelectSSIDDiscoveryMethodActivity extends AppCompatActivity {
    private final String TAG = "SelectSSIDDiscovery";

    private ListView mListView;
//    private DeviceCommandListAdapter mListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_ssid_discovery_method);

        ToolbarComponent tb = findViewById(R.id.toolbar);
        tb.setSubtitle(getResources().getString(R.string.title_activity_select_ssid_discovery_method));

        Button scanWifiBtn = findViewById(R.id.scan_wifi_btn);
        scanWifiBtn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                switch(motionEvent.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        Log.i(TAG, "Button is down");
                        view.setBackgroundColor(getResources().getColor(R.color.clicked_button));
                        break;
                    case MotionEvent.ACTION_UP:
                        Log.i(TAG, "Button is up");
                        view.setBackgroundColor(getResources().getColor(R.color.white));
//                        view.performClick();
                }

                return false;
            }

        });

        scanWifiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWifiScanActivity();
            }
        });


        Button configureHiddenSSIDBtn = findViewById(R.id.configure_hidden_ssid_btn);
        configureHiddenSSIDBtn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                switch(motionEvent.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        Log.i(TAG, "Button is down");
                        view.setBackgroundColor(getResources().getColor(R.color.clicked_button));
                        break;
                    case MotionEvent.ACTION_UP:
                        Log.i(TAG, "Button is up");
                        view.setBackgroundColor(getResources().getColor(R.color.white));
//                        view.performClick();
                }

                return false;
            }

        });

        configureHiddenSSIDBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openConfigureHiddenSSIDBtn();
            }
        });
    }

    private void openWifiScanActivity() {
        Intent intent = new Intent(getApplicationContext(), WifiScanActivity.class);
        startActivity(intent);
        finish();
    }

    private void openConfigureHiddenSSIDBtn() {
        Intent intent = new Intent(getApplicationContext(), ConfigureHiddenSSIDConnectionActivity.class);
        startActivity(intent);
    }

}
