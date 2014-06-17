package com.L3corte.eval2014.maury;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.content.Intent;

public class L3Master extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
	  
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
  }
  
  public void gogps(View view){
	  Intent i = new Intent("com.L3corte.eval2014.maury.L3GPS");
	  startActivity(i);
  }
  public void goinfo(View view){
	  Intent i = new Intent("com.L3corte.eval2014.maury.L3INFO");
	  startActivity(i);
  }
  public void goappel(View view){
	  Intent i = new Intent("com.L3corte.eval2014.maury.L3PHONE");
	  startActivity(i);
  }
  public void gogps2(View view){
	  Intent i = new Intent("com.L3corte.eval2014.maury.L3MYP");
	  startActivity(i);
  }
  public void gosite(View view) {
	  Intent i = new Intent("com.L3corte.eval2014.maury.L3MYW");
	  startActivity(i);
	}
}
