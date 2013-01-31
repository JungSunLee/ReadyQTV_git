package com.caf.readyqtv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class more_profile02 extends Activity {
	Button button_more_profile02_back_left;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_more_profile02);
	    // TODO Auto-generated method stub
	    
	 // profile02 back button
	    button_more_profile02_back_left = (Button)  findViewById(R.id.button_profile02_back_left);
	    button_more_profile02_back_left.setOnClickListener(new OnClickListener(){
	    	public void onClick(View v) {
	    		Intent intent_button_more_profile02_back_left = new Intent(more_profile02.this, more_profile01.class);
	    		startActivity(intent_button_more_profile02_back_left);
	    	}
	    });
	    //end
	}

}
