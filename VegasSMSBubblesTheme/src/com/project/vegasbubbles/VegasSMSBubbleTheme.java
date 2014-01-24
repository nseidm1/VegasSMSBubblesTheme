package com.project.vegasbubbles;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class VegasSMSBubbleTheme extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		overridePendingTransition(0, 0);
		try {
			Intent intent = new Intent("com.project.vegassms.VEGAS_MESSAGER_THEME_PICKER");
			startActivity(intent);
		} catch(ActivityNotFoundException e) {
			startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/details?id=com.project.vegassms")));
		}
		finish();
		overridePendingTransition(0, 0);
	}
}