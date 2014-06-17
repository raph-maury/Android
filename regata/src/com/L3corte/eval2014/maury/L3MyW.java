package com.L3corte.eval2014.maury;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class L3MyW extends Activity{
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sl3myw);
		
		WebView myWebView = (WebView) findViewById(R.id.webview);
		myWebView.loadUrl("http://www.ffvoile.fr/ffv/web/");
	}

}
