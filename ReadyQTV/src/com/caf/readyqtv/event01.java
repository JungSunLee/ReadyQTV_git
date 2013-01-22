package com.caf.readyqtv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class event01 extends Activity {
	ImageButton button_eventbar;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_event01);
	    // TODO Auto-generated method stub
	    
	 // Event ÀÀ¸ð button
	    button_eventbar = (ImageButton)  findViewById(R.id.imageButton_eventbar1);
	    button_eventbar.setOnClickListener(new OnClickListener(){
	    	public void onClick(View v) {
	    		Intent intent_button_event = new Intent(event01.this, event02.class);
	    		startActivity(intent_button_event);
	    	}
	    });
	    //end
	}

}
