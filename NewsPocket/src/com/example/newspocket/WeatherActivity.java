package com.example.newspocket;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;

public class WeatherActivity extends Activity {

	Intent backIntent;
	/*ListView list;
	
    String[] weather = {
        "Now",
            "At 8:45 PM",
            "At Midnight"
    } ;
    String[] desc = {
    	"32° Celsius -> Sunny Skies",
    		"24° Celsius -> Cloudy Skies with 80% chance of rainfall",
    		"24° Celsius -> Heavy rainfall"
    };
    Integer[] imageId = {
            R.drawable.sunny,
            R.drawable.cloudy,
            R.drawable.rainy
    };*/
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.weather);
		
		backIntent = getIntent();
		ActionBar actionBar = getActionBar();
		actionBar.setBackgroundDrawable(getResources().getDrawable(R.color.action_bar));
		actionBar.setDisplayHomeAsUpEnabled(true);		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		    case android.R.id.home:
		    	NavUtils.navigateUpTo(this, backIntent);
		        return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
