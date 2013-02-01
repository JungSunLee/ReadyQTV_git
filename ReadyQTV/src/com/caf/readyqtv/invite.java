package com.caf.readyqtv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class invite extends Activity {
	Button button_invite_close;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_invite);
	    // TODO Auto-generated method stub
	    
	 // Invite close button
	    button_invite_close = (Button)  findViewById(R.id.button_invite_close);
	    button_invite_close.setOnClickListener(new OnClickListener(){
	    	public void onClick(View v) {
	    		Intent intent_button_invite_close = new Intent(invite.this, main01.class);
	    		intent_button_invite_close.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	    		startActivity(intent_button_invite_close);
	    	}
	    });
	    //end
	}

}
