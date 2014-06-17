package com.L3corte.eval2014.maury;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class L3MyP extends Activity{

	WebView displayMap;
	private static double latitude;
	private static double longitude;
	private static String lat;
	private static String lon;
	
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sl3myp);
		
		latitude =  41.9400308;
		longitude = 8.7542065;

		displayMap = (WebView) findViewById(R.id.webview);
		displayMap.getSettings().setJavaScriptEnabled(true);
		displayMap.getSettings().setBuiltInZoomControls(true);
		displayMap.getSettings().setSupportZoom(true);

		lat = String.valueOf(latitude);
		lon = String.valueOf(longitude);

		displayMap.setWebViewClient(new WebViewClient());
	
		displayMap.loadUrl("http://www.google.com/maps?q=" + lat + "," + lon);
	}
	
}
