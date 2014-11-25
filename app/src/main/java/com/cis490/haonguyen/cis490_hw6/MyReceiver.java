package com.cis490.haonguyen.cis490_hw6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Hao on 11/24/2014.
 */
public class MyReceiver extends BroadcastReceiver {
	@Override
	public void onReceive(Context context, Intent intent) {
		Toast.makeText(context, "Intent Detected.", Toast.LENGTH_LONG).show();
	}
}
