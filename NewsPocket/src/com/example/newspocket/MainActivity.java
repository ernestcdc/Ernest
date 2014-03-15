package com.example.newspocket;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;



public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home);
		
		ActionBar actionBar = getActionBar();
		actionBar.setBackgroundDrawable(getResources().getDrawable(R.color.action_bar));
	    
		
		/*final int []imageArray={R.drawable.latest,R.drawable.business,R.drawable.farmer};

		final ImageView imageView = (ImageView) findViewById(R.id.imageView_latestNews);
		final Handler handler = new Handler();
		Runnable runnable = new Runnable() {
			int i=0;
			public void run() {
				imageView.setImageResource(imageArray[i]);
				i++;
				if(i>imageArray.length-1) {
					i=0;    
				}
				handler.postDelayed(this, 4000);  //for interval...
			}
		};
		handler.postDelayed(runnable, 2000); //for initial delay..
*/		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.category, menu);
		return true;
	}

	public void onLatestClick(View v){
		Intent redirectLatest = new Intent(getApplicationContext(), LatestActivity.class);
		redirectLatest.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(redirectLatest);
	}
	
	public void onWeatherClick(View v){
		Intent redirectWeather = new Intent(getApplicationContext(), WeatherActivity.class);
		redirectWeather.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(redirectWeather);
	}
	
	public void onCurrencyClick(View v){
		Intent redirectCurrency = new Intent(getApplicationContext(), CurrencyActivity.class);
		redirectCurrency.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(redirectCurrency);
	}
	
	public void onTechnologyClick(View v){
		Intent redirectTechnology = new Intent(getApplicationContext(), TechnologyActivity.class);
		redirectTechnology.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(redirectTechnology);
	}
	
	public void onPoliticsClick(View v){
		Intent redirectPolitics = new Intent(getApplicationContext(), PoliticsActivity.class);
		redirectPolitics.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(redirectPolitics);
	}
	
	public void onScienceClick(View v){
		Intent redirectScience = new Intent(getApplicationContext(), ScienceActivity.class);
		redirectScience.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(redirectScience);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle item selection
	    switch (item.getItemId()) {
	    case R.id.action_edit:
	    	Intent redirectEdit = new Intent(getApplicationContext(), EditActivity.class);
	    	redirectEdit.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	        startActivity(redirectEdit);
	        return true;
	    case R.id.action_settings:
	    	Intent redirectSettings = new Intent(getApplicationContext(), Settings.class);
	    	redirectSettings.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	        startActivity(redirectSettings);
	        return true;
	    default:
	        return super.onOptionsItemSelected(item);
	    }
	}
}
