package com.example.newspocket;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.ListActivity;
import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;

public class EditActivity extends ListActivity {

	Intent backIntent;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		String[] values = new String[] {"LATEST", "BUSINESS", "SCIENCE AND ENVIRONMENT", "TECHNOLOGY", "HEALTH", "SPORTS", "POLITICS", "WEATHER", "CURRENCIES"};
		//ArrayAdapter<String> adapter = new ArrayAdapter <String> (this, R.layout.rowlayout, R.id.label, values);
		
		backIntent = getIntent();
		ActionBar actionBar = getActionBar();
		actionBar.setBackgroundDrawable(getResources().getDrawable(R.color.action_bar));
		actionBar.setDisplayHomeAsUpEnabled(true);
		
		//setListAdapter(adapter);
		CustomArrayAdapter adapter = new CustomArrayAdapter(this, values);
		setListAdapter(adapter);
		
		//setContentView(R.layout.activity_main);
	}

	
	
	
	
	/*protected void onListItemClick(ListView l, View v, int position, long id) {
		String item = (String) getListAdapter().getItem(position);
		Toast.makeText(this, item + "selected", Toast.LENGTH_LONG).show();
	}*/
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.done, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		    case android.R.id.home:
		    	NavUtils.navigateUpTo(this, backIntent);
		        return true;
		    case R.id.action_done:
		    	NavUtils.navigateUpTo(this, backIntent);
		        return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
