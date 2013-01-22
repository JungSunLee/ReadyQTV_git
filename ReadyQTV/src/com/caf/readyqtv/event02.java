package com.caf.readyqtv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class event02 extends Activity {
	Button button_event_enter, button_event_back;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_event02);
	    // TODO Auto-generated method stub
	    
	 // Event enter button
	    button_event_enter = (Button)  findViewById(R.id.button_event_enter);
	    button_event_enter.setOnClickListener(new OnClickListener(){
	    	public void onClick(View v) {
	    		Intent intent_button_event = new Intent(event02.this, event03.class);
	    		startActivity(intent_button_event);
	    	}
	    });
	    //end
	    
	 // Event back button
	    button_event_back = (Button)  findViewById(R.id.button_event_back);
	    button_event_back.setOnClickListener(new OnClickListener(){
	    	public void onClick(View v) {
	    		Intent intent_button_event = new Intent(event02.this, event01.class);
	    		startActivity(intent_button_event);
	    	}
	    });
	    //end
	}

}
