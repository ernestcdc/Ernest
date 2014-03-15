package com.example.newspocket;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Settings extends Activity {

	int selected = 0; 
	int buffKey = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.settings);
		
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
	
	public void onFrequencyClicked(View view) {
				
	    AlertDialog.Builder builder = new AlertDialog.Builder(this);
	    builder.setTitle("Update frequency");
	      
	    final CharSequence[] choiceList = {"Every 2 hours", "Every 6 hours", "Every 24 hours"};
	    
	    builder.setSingleChoiceItems(choiceList, selected, new DialogInterface.OnClickListener() {
	        @Override
	        public void onClick(DialogInterface dialog, int which) {
	            //set to buffKey instead of selected 
	            //(when cancel not save to selected)
	            buffKey = which;
	        }
	    })
	    .setCancelable(false)
	    .setPositiveButton("OK", 
	        new DialogInterface.OnClickListener() 
	        {
	            @Override
	            public void onClick(DialogInterface dialog, int which) {
	                //set buff to selected
	                selected = buffKey;
	            }
	        }
	    )
	    .setNegativeButton("Cancel", 
	        new DialogInterface.OnClickListener() 
	        {
	            @Override
	            public void onClick(DialogInterface dialog, int which) {

	            }
	        }
	    );
	     
	    AlertDialog alert = builder.create();
	    alert.show();
	}
	
	public void onOrientationClicked(View view) {
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
	    builder.setTitle("Screen Orientation");
	      
	    final CharSequence[] choiceList = {"Automatic", "Portrait", "Landscape"};
	    
	    builder.setSingleChoiceItems(choiceList, selected, new DialogInterface.OnClickListener() {
	        @Override
	        public void onClick(DialogInterface dialog, int which) {
	            //set to buffKey instead of selected 
	            //(when cancel not save to selected)
	            buffKey = which;
	        }
	    })
	    .setCancelable(false)
	    .setPositiveButton("OK", 
	        new DialogInterface.OnClickListener() 
	        {
	            @Override
	            public void onClick(DialogInterface dialog, int which) {
	                //set buff to selected
	                selected = buffKey;
	            }
	        }
	    )
	    .setNegativeButton("Cancel", 
	        new DialogInterface.OnClickListener() 
	        {
	            @Override
	            public void onClick(DialogInterface dialog, int which) {

	            }
	        }
	    );
	     
	    AlertDialog alert = builder.create();
	    alert.show();
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle item selection
	    switch (item.getItemId()) {
	    case android.R.id.home:
	    	onBackPressed();
	    	return true;
	    default:
	        return super.onOptionsItemSelected(item);
	    }
	}
}
