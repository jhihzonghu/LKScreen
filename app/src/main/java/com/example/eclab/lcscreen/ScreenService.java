package com.example.eclab.lcscreen;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;

/**
 * Created by ECLab on 2015/4/21.
 */
public class ScreenService extends Service {
    BroadcastReceiver broadcastReceiver;
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        IntentFilter filter = new IntentFilter(Intent.ACTION_SCREEN_ON);
        filter.addAction(Intent.ACTION_SCREEN_OFF);
        broadcastReceiver = new ScreenMonitor();
        registerReceiver(broadcastReceiver,filter);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

    }
}
