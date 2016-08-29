package com.hfad.joke.webview;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class Main2Activity extends BroadcastReceiver {

    private static final String TAG = "Main2Activity";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(TAG, "onReceive: " + intent.getAction());
        if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
            Toast.makeText(context, "Connetcivity Changed", Toast.LENGTH_SHORT).show();

        } else if (intent.getAction().equals("android.net.wifi.WIFI_STATE_CHANGED")) {
            Toast.makeText(context, "wifi state Changed", Toast.LENGTH_SHORT).show();

        }
    }
}

