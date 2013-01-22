package com.caf.readyqtv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class event03 extends Activity {
	Button button_event_enterpopup;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_event03);
	    // TODO Auto-generated method stub
	    
	 // Event enter button
	    button_event_enterpopup = (Button)  findViewById(R.id.button_event_enterpopup);
	    button_event_enterpopup.setOnClickListener(new OnClickListener(){
	    	public void onClick(View v) {
	    		Intent intent_button_event = new Intent(event03.this, event03_popup.class);
	    		startActivity(intent_button_event);
	    	}
	    });
	    //end
	}

}
