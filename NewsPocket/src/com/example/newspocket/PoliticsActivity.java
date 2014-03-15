package com.example.newspocket;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class PoliticsActivity extends Activity {
	
	Intent backIntent;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.politics);
		
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
	
	public void onPoliticsClickOne(View v){
		Intent redirectPolitics = new Intent(getApplicationContext(), ReadPoliticsOne.class);
		redirectPolitics.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(redirectPolitics);
	}
	
	public void onPoliticsClickTwo(View v){
		Intent redirectPolitics = new Intent(getApplicationContext(), ReadPoliticsTwo.class);
		redirectPolitics.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(redirectPolitics);
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
