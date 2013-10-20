package com.usf.strides;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class FindStriderActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.find_strider_page);
	}
	
	
	public void btnSpecificClicked(View v) {
		Intent myFindSpecificIntent = new Intent(v.getContext(), StriderProfilePageActivity.class);
		startActivityForResult(myFindSpecificIntent, 0);
		Toast.makeText(getBaseContext(), "Specific Clicked", Toast.LENGTH_SHORT).show();
	}
	
	public void btnAssClicked(View v) {
		Intent myFindAllIntent = new Intent(v.getContext(), StriderProfilePageActivity.class);
		startActivityForResult(myFindAllIntent, 0);
		Toast.makeText(getBaseContext(), "Specific Clicked", Toast.LENGTH_SHORT).show();
	}
}
