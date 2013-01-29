package com.caf.readyqtv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class more_account_signup extends Activity {
	Button button_more_account_signup_back_left;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_more_account_signup);
	    // TODO Auto-generated method stub
	    
	 // account signup back button
	    button_more_account_signup_back_left = (Button)  findViewById(R.id.button_account_signup_back_left);
	    button_more_account_signup_back_left.setOnClickListener(new OnClickListener(){
	    	public void onClick(View v) {
	    		Intent intent_button_more_account_signup_back_left = new Intent(more_account_signup.this, more_account.class);
	    		startActivity(intent_button_more_account_signup_back_left);
	    	}
	    });
	    //end
	}

}
