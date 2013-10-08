package com.usf.strides;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	
	// Maybe use a splash screen to start the application...
	// See example here: http://stackoverflow.com/questions/9533024/how-to-create-a-good-gui-for-welcome-screen
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	// Start button Clicked
	public void startBtnClicked(View v) {
		// Intent allows the application to know what the next activity is to do
		Intent myIntent = new Intent(v.getContext(), SignInActivity.class);
		startActivityForResult(myIntent, 0);
	}

	// Info button clicked
	public void infoBtnClicked(View v) {
		Intent myIntent = new Intent(v.getContext(), InfoActivity.class);
		startActivityForResult(myIntent, 0);
	}
}
