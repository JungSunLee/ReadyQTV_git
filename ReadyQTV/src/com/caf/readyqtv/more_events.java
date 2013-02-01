package com.caf.readyqtv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class more_events extends Activity {
	Button button_more_events_back;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_more_events);
	    // TODO Auto-generated method stub
	    
	 // more events back button
	    button_more_events_back = (Button)  findViewById(R.id.button_more_events_back_left);
	    button_more_events_back.setOnClickListener(new OnClickListener(){
	    	public void onClick(View v) {
	    		Intent intent_button_more_events_back = new Intent(more_events.this, more_main.class);
	    		startActivity(intent_button_more_events_back);
	    	}
	    });
	    //end
	}

}
