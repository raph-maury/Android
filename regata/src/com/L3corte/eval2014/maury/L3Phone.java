package com.L3corte.eval2014.maury;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class L3Phone extends Activity{
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sl3phone);

	}
	public void call(View view){
		String number = "0495461712";
		Intent i = new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+number));
        startActivity(i);
	}
	public void call2(View view){
		String number = "0800848037";
		Intent i = new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+number));
        startActivity(i);
	}

}
