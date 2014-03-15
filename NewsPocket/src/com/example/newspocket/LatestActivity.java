package com.example.newspocket;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class LatestActivity extends Activity {
	
	Intent backIntent;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);  
		setContentView(R.layout.latest);
		
		backIntent = getIntent();
		ActionBar actionBar = getActionBar();
		actionBar.setBackgroundDrawable(getResources().getDrawable(R.color.action_bar));
		actionBar.setDisplayHomeAsUpEnabled(true);		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.newslist, menu);
		return true;
	}
	
	public void readLatestOne(View v) {
		Intent redirectLatestOne = new Intent(getApplicationContext(), ReadLatestOne.class);
		redirectLatestOne.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(redirectLatestOne);
	}
	
	public void readLatestTwo(View v) {
		Intent redirectLatestTwo = new Intent(getApplicationContext(), ReadLatestTwo.class);
		redirectLatestTwo.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(redirectLatestTwo);
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
