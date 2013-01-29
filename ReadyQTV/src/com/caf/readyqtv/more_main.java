package com.caf.readyqtv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class more_main extends Activity {
	Button button_more_account;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_more_main);
	    // TODO Auto-generated method stub
	    
	 // account button
	    button_more_account = (Button)  findViewById(R.id.button_more_account);
	    button_more_account.setOnClickListener(new OnClickListener(){
	    	public void onClick(View v) {
	    		Intent intent_button_more_account = new Intent(more_main.this, more_account.class);
	    		startActivity(intent_button_more_account);
	    	}
	    });
	    //end
	}

}
