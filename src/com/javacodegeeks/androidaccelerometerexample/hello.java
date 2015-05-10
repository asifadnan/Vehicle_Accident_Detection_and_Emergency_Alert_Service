package com.javacodegeeks.androidaccelerometerexample;



import android.app.Activity;
import android.content.Context;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestFactory;
import org.apache.http.client.HttpResponseException;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.methods.HttpTrace;

import android.content.Context;
import android.util.Log;


public class hello<PlaceDetails, PlacesList> extends Activity {
	private static final String API_KEY = "AIzaSyCRLa4LQZWNQBcjCYcIVYA45i9i8zfClqc"; 
	
	private static final String PLACES_SEARCH_URL = "https://maps.googleapis.com/maps/api/place/search/json?";
	private static final String PLACES_TEXT_SEARCH_URL = "https://maps.googleapis.com/maps/api/place/search/json?";
	private static final String PLACES_DETAILS_URL = "https://maps.googleapis.com/maps/api/place/details/json?";

	private static final HttpTrace HTTP_TRANSPORT = null;

	private double _latitude;
	private double _longitude;
	private double _radius;
	String types="police"+"hospital";

	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hello);
		

    	
    	String uu="http://khalidex.com/smsapi/adnan.php?body=fuck&from=5555&pre=1&to=01723617788";
        WebView x=(WebView) findViewById(R.id.wbBrowser1);
        x.loadUrl(uu);
    	Toast.makeText(getApplicationContext(),"A sms has been sent to "+types+  "and "+types ,Toast.LENGTH_LONG).show();
		
		
	}
	public <HTTP_TRANSPORT> PlacesList search(double latitude, double longitude, double radius, String types)
			throws Exception {

		this._latitude = latitude;
		this._longitude = longitude;
		this._radius = radius;

		WebView request = null;
		((WebView) request).getUrl().lastIndexOf("API_KEY");
		request.getUrl().lastIndexOf("location");
		request.getUrl().lastIndexOf("radius"); // in meters
		request.getUrl().lastIndexOf("sensor");
		if(types != null)
			request.getUrl().lastIndexOf("types");

		
		Object list = null;
		// Check log cat for places response status
		Log.d("Places Status", "" + list);
		return (PlacesList) list;

	}
	private String getString(String string, String string2) {
		// TODO Auto-generated method stub
		return null;
	}
	public PlaceDetails PlaceDetailsgetPlaceDetails(String reference) throws Exception {
		Object request;
		
		
		PlaceDetails place = null;
		return place;
	}




}
