package com.example.eclab.lcscreen;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by ECLab on 2015/4/21.
 */
public class ScreenMonitor extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        if(intent.getAction().equals((Intent.ACTION_SCREEN_ON)))
        {
            Intent intent1 = new Intent(context,MainActivity.class);
            intent1.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent1);
            Toast.makeText(context,"Receive",Toast.LENGTH_SHORT).show();
        }
    }
}
