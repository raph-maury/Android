package com.L3corte.eval2014.maury;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.TextView;

public class L3GPS extends Activity{
	
	TextView latitude;
	TextView longitude;
	
    public static final String PREFS_NAME = "MyPrefsFile";

	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.l3gps);
		
		
		latitude=(TextView) findViewById(R.id.textView4);
		longitude=(TextView) findViewById(R.id.textView5);
		
		
		LocationManager geoloc = (LocationManager)getSystemService(Context.LOCATION_SERVICE);
		List<String> providers = geoloc.getAllProviders();
		
		SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
		SharedPreferences.Editor editor = preferences.edit();
		//editor.putString(PREFS_NAME, latitude, longitude);
		editor.commit();
		
		geoloc.requestLocationUpdates(providers.get(0), 3000, 0,new LocationListener(){@Override
		
		public void onLocationChanged(Location loc) {
			latitude.setText(loc.getLatitude()+"");
			longitude.setText(loc.getLongitude()+"");
		}@Override
		public void onProviderDisabled(String provider) {
			
		}@Override
		public void onProviderEnabled(String provider) {
			
		}public void onStatusChanged(String provider,int status,Bundle extras) {
			
		}
		});}}
