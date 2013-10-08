package com.usf.strides;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SignInActivity extends Activity {	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.signin_page);
	}
	
	// TODO: Use an AsyncTask to either hash the user name and password, or
	//		 go to the social network affiliate they used to sign in...
	// An example here: C:\Users\Zach\workspace\BasicView2\src\com\zblizzard\basicview2 (line 37)
	public void signInBtnClicked(View v) {
		Intent myIntent = new Intent(v.getContext(), HomePageActivity.class);
		startActivityForResult(myIntent, 0);
	}
	
	public void createBtnClicked(View v) {
		Intent myIntent = new Intent(v.getContext(), CreateActivity.class);
		startActivityForResult(myIntent, 0);
	}
	
	// TODO: Save info in a text file so you text boxes know everything
	public void rememberMeClicked(View v) {
		Toast.makeText(getBaseContext(), "We will remember you...", Toast.LENGTH_SHORT).show();
	}
}
