package com.example.gotosleep;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.SystemClock;
import android.util.Log;
import android.view.KeyEvent;

public class MainActivity extends Activity {
	
	private static final String TAG = MainActivity.class.getSimpleName();
	PowerManager pm;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
        pm = (PowerManager)getSystemService(Context.POWER_SERVICE);
	}
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
//		return super.onKeyDown(keyCode, event);
		switch (keyCode) {
		case 19:
			Log.i(TAG, "===== + pressed ===== ");
            pm.goToSleep(SystemClock.uptimeMillis());
			break;

		default:
			break;
		}
		return true;
	}
	
}
