package com.rahmadid.plugin;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

import android.util.Log;

public class MyPlugin extends CordovaPlugin {
	private static final String TAG = MyPlugin.class.getSimpleName();

	@Override
	public boolean execute(String sAction, JSONArray args, CallbackContext cbContext) throws JSONException {
		if (sAction.equals("getPlatform")) {
			String sPlatform = "";

			if (p_getString(System.getProperty("os.name")).equalsIgnoreCase("qnx")) {
				sPlatform = "android-bb10";
			}

			cbContext.success(sPlatform);
			return true;
		}

		Log.e(TAG, "Unkown action: " + sAction);
		return false; // Returning false results in a "MethodNotFound" error.
	}

	private String p_getString(String s) {
		if (s == null) {
			return "";
		}

		return s;
	}
}
