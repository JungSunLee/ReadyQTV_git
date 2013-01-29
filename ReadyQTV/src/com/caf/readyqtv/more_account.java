package com.caf.readyqtv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class more_account extends Activity {
	Button button_more_account_back_left, button_more_account_login_progress, button_more_account_signup_progress;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_more_account);
	    // TODO Auto-generated method stub
	    
	 // account back button
	    button_more_account_back_left = (Button)  findViewById(R.id.button_account_back_left);
	    button_more_account_back_left.setOnClickListener(new OnClickListener(){
	    	public void onClick(View v) {
	    		Intent intent_button_more_account_back_left = new Intent(more_account.this, more_main.class);
	    		startActivity(intent_button_more_account_back_left);
	    	}
	    });
	    //end
	    
	 // account login progress button
	    button_more_account_login_progress = (Button)  findViewById(R.id.button_account_login_progress);
	    button_more_account_login_progress.setOnClickListener(new OnClickListener(){
	    	public void onClick(View v) {
	    		Intent intent_button_more_account_login_progress = new Intent(more_account.this, more_account_login.class);
	    		startActivity(intent_button_more_account_login_progress);
	    	}
	    });
	    //end
	    
	 // account signup progress button
	    button_more_account_signup_progress = (Button)  findViewById(R.id.button_account_signup_progress);
	    button_more_account_signup_progress.setOnClickListener(new OnClickListener(){
	    	public void onClick(View v) {
	    		Intent intent_button_more_account_signup_progress = new Intent(more_account.this, more_account_signup.class);
	    		startActivity(intent_button_more_account_signup_progress);
	    	}
	    });
	    //end
	}

}
