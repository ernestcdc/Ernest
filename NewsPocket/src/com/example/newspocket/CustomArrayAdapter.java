package com.example.newspocket;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class CustomArrayAdapter extends ArrayAdapter<String> {
	private final Context context;
	private final String[] values;
	
	public CustomArrayAdapter(Context context, String[] values) {
		super(context, R.layout.rowlayout, values);
		this.context = context;
		this.values = values;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View rowView = null;
		if(convertView!=null) {
			rowView = convertView;
		}
		else if(convertView==null){
			rowView = inflater.inflate(R.layout.rowlayout, parent, false);
		}
		final View newRowView = rowView;
		RelativeLayout rLayout = (RelativeLayout) rowView.findViewById(R.id.wholerow);
		rLayout.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				CheckBox checkBox = (CheckBox) newRowView.findViewById(R.id.checkBox1);
				if(checkBox.isChecked())
					checkBox.setChecked(false);
				else
					checkBox.setChecked(true);
			}
		});
		
		String newsName = values[position];
		CheckBox checkBox = (CheckBox) rowView.findViewById(R.id.checkBox1);
		TextView textView = (TextView) rowView.findViewById(R.id.label);
		textView.setText(newsName);
        //checkBox.setChecked(true);
		if(newsName.startsWith("LATEST") || newsName.startsWith("BUSINESS") || newsName.startsWith("TECHNOLOGY") || newsName.startsWith("POLITICS") || 
				newsName.startsWith("SCIENCE AND ENVIRONMENT") || newsName.startsWith("WEATHER") || newsName.startsWith("CURRENCIES")) {
			checkBox.setChecked(true);
		}
		return rowView;
	}
	
	

}
