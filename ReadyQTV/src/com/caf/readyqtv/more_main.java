package com.caf.readyqtv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class more_main extends Activity {
	Button button_more_account, button_more_profile, button_more_main_back, button_more_notification,button_more_event, button_more_setting;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_more_main);
	    // TODO Auto-generated method stub
	    
	 // more main back button
	    button_more_main_back = (Button)  findViewById(R.id.button_more_main_back_left);
	    button_more_main_back.setOnClickListener(new OnClickListener(){
	    	public void onClick(View v) {
	    		Intent intent_button_more_main_back = new Intent(more_main.this, main01.class);
	    		startActivity(intent_button_more_main_back);
	    	}
	    });
	    //end
	    
	 // account button
	    button_more_account = (Button)  findViewById(R.id.button_more_account);
	    button_more_account.setOnClickListener(new OnClickListener(){
	    	public void onClick(View v) {
	    		Intent intent_button_more_account = new Intent(more_main.this, more_account.class);
	    		startActivity(intent_button_more_account);
	    	}
	    });
	    //end
	    
	 // profile button
	    button_more_profile = (Button)  findViewById(R.id.button_more_profile);
	    button_more_profile.setOnClickListener(new OnClickListener(){
	    	public void onClick(View v) {
	    		Intent intent_button_more_profile = new Intent(more_main.this, more_profile01.class);
	    		startActivity(intent_button_more_profile);
	    	}
	    });
	    //end
	    
	 // notification button
	    button_more_notification = (Button) findViewById(R.id.button_more_notification);
	    button_more_notification.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent_button_more_notification = new Intent(more_main.this, more_notification01.class);
				startActivity(intent_button_more_notification);
			}
		});
	    //end
	    
	 //events button
	    button_more_event = (Button) findViewById(R.id.button_more_event);
	    button_more_event.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent_button_more_event = new Intent (more_main.this, more_events.class);
				startActivity(intent_button_more_event);
			}
		});
	    
	 // setting button
	    button_more_setting = (Button) findViewById(R.id.button_more_setting);
	    button_more_setting.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent_button_more_setting = new Intent(more_main.this, more_setting.class);
				startActivity(intent_button_more_setting);
			}
		});
	    //end
	}

}
