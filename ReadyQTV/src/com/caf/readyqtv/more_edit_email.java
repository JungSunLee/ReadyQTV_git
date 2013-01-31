package com.caf.readyqtv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class more_edit_email extends Activity {
	Button button_more_editemail_back_left;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_more_edit_email);
	    // TODO Auto-generated method stub
	    
	 // edit email back button
	    button_more_editemail_back_left = (Button)  findViewById(R.id.button_more_editemail_back_left);
	    button_more_editemail_back_left.setOnClickListener(new OnClickListener(){
	    	public void onClick(View v) {
	    		Intent intent_button_more_editemail_back_left = new Intent(more_edit_email.this, more_account.class);
	    		startActivity(intent_button_more_editemail_back_left);
	    	}
	    });
	    //end
	}

}
