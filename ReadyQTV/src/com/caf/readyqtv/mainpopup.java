package com.caf.readyqtv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;


public class mainpopup extends Activity {
	Button button_close;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    requestWindowFeature(Window.FEATURE_NO_TITLE);
	   // getWindow().setFlags(WindowManager.LayoutParams.FLAG_BLUR_BEHIND, WindowManager.LayoutParams.FLAG_BLUR_BEHIND);
	    setContentView(R.layout.activity_mainpopup01);
	    // TODO Auto-generated method stub
	    
	 // Close button
	    button_close = (Button)  findViewById(R.id.button_close);
	    button_close.setOnClickListener(new OnClickListener(){
	    	public void onClick(View v) {
	    		Intent intent_button_close = new Intent(mainpopup.this, main01.class);
	    		intent_button_close.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	    		startActivity(intent_button_close);
	    	}
	    });
	    //end
	}

}
