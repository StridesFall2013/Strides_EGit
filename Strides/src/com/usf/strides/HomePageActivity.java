package com.usf.strides;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
//import android.widget.TextView;
import android.widget.Toast;

public class HomePageActivity extends Activity{
//	TextView Welcome = (TextView) findViewById(R.id.tv_welcomeStrider);
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home_page);
//		setWelcomeText();
	}
	
//	public void setWelcomeText() {
//		Welcome.setText("Welcome Guest Strider!");
//		Welcome.setTextSize((float) 30);
//	}
	
	public void newStrideClicked (View v) {
		Intent myIntent = new Intent(v.getContext(), AddStrideActivity.class);
		startActivityForResult(myIntent, 0);
	}
	
	public void findStriderClicked (View v) {
		Toast.makeText(getBaseContext(), "You have clicked find strider", Toast.LENGTH_SHORT).show();
	}
}
