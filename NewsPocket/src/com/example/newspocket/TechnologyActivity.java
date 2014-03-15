package com.example.newspocket;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class TechnologyActivity extends Activity {
	
	Intent backIntent;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.technology);
		
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
	
	public void onTechnologyClickOne(View v){
		Intent redirectTechnology = new Intent(getApplicationContext(), ReadTechnologyOne.class);
		redirectTechnology.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(redirectTechnology);
	}
	
	public void onTechnologyClickTwo(View v){
		Intent redirectTechnology = new Intent(getApplicationContext(), ReadTechnologyTwo.class);
		redirectTechnology.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(redirectTechnology);
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
