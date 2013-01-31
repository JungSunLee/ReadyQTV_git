package com.caf.readyqtv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class more_profile01 extends Activity {
	Button button_more_profile01_back_left, button_more_profile01_edit, button_more_profile01_edit_to_account;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_more_profile01);
	    // TODO Auto-generated method stub
	    
	 // profile01 back button
	    button_more_profile01_back_left = (Button)  findViewById(R.id.button_profile01_back_left);
	    button_more_profile01_back_left.setOnClickListener(new OnClickListener(){
	    	public void onClick(View v) {
	    		Intent intent_button_more_profile01_back_left = new Intent(more_profile01.this, more_main.class);
	    		startActivity(intent_button_more_profile01_back_left);
	    	}
	    });
	    //end
	    
	 // profile01 edit button
	    button_more_profile01_edit = (Button)  findViewById(R.id.button_profile_edit);
	    button_more_profile01_edit.setOnClickListener(new OnClickListener(){
	    	public void onClick(View v) {
	    		Intent intent_button_more_profile01_edit = new Intent(more_profile01.this, more_profile02.class);
	    		startActivity(intent_button_more_profile01_edit);
	    	}
	    });
	    //end
	    
	 // profile01 email to account button
	    button_more_profile01_edit_to_account = (Button)  findViewById(R.id.button_profile_email_arrow);
	    button_more_profile01_edit_to_account.setOnClickListener(new OnClickListener(){
	    	public void onClick(View v) {
	    		Intent intent_button_more_profile01_edit_to_account = new Intent(more_profile01.this, more_account.class);
	    		startActivity(intent_button_more_profile01_edit_to_account);
	    	}
	    });
	    //end
	}

}
