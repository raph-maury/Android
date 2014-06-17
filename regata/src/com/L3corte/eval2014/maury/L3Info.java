package com.L3corte.eval2014.maury;

import android.app.Activity;
import android.content.Context;
import android.hardware.*;
import android.os.Bundle;
import android.widget.TextView;


public class L3Info extends Activity implements SensorEventListener {
	
	private SensorManager gestionCapteurs;
	private Sensor orientation;
	private TextView cap, gite;
	
	@SuppressWarnings("deprecation")
	@Override
	public void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sl3info);
		
		cap = (TextView) findViewById(R.id.cap);
		gite = (TextView) findViewById(R.id.gite);
		
		gestionCapteurs = (SensorManager) getSystemService(Context.SENSOR_SERVICE); 
		orientation = gestionCapteurs.getDefaultSensor(Sensor.TYPE_ORIENTATION);
	}
	
	@Override
	protected void onStart() {
		super.onStart();
		gestionCapteurs.registerListener(this, orientation, SensorManager.SENSOR_DELAY_NORMAL);
	}
	@Override
	protected void onStop() {
		super.onStop();
		gestionCapteurs.unregisterListener(this);
	} 
 
	@SuppressWarnings("deprecation")
	public void onSensorChanged(SensorEvent evt) {
		if (evt.sensor.getType() == Sensor.TYPE_ORIENTATION) {
			cap.setText("Cap ........... : "+evt.values[0]);
			gite.setText("Le gite .......... : "+evt.values[1]);
		}
	}
	public void onAccuracyChanged(Sensor capteur, int precision) { }
	
}
