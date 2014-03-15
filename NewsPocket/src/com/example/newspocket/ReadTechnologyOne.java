package com.example.newspocket;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class ReadTechnologyOne extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.readtechnologyone);
		
		ActionBar actionBar = getActionBar();
		actionBar.setBackgroundDrawable(getResources().getDrawable(R.color.action_bar));
		actionBar.setDisplayHomeAsUpEnabled(true);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.readnews, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		    case android.R.id.home:
		    	onBackPressed();
		        return true;
		    case R.id.action_share:
		    	/*Intent intent = new Intent(Intent.ACTION_SEND);
		    	intent.setType("text/plain");

		    	intent.putExtra(Intent.EXTRA_SUBJECT, "App Name");
		    	intent.putExtra(Intent.EXTRA_TEXT, "Check out this cool app http://market.android.com/details?id=com.example.yourpackagename");

		    	Intent chooser = Intent.createChooser(intent, "Tell a friend about App Name");
		    	startActivity(chooser);*/
		    	
		    	Intent sharingIntent = new Intent(Intent.ACTION_SEND);
		    	sharingIntent.setType("text/plain");
		    	sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, "Text");
		    	sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "NewsPocket");
		    	startActivity(Intent.createChooser(sharingIntent, "Share using"));
		    	//return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
