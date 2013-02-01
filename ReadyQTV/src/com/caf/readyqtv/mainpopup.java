package com.caf.readyqtv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;


public class mainpopup extends Activity {
	Button button_close;
	ImageButton imagebutton_store, imagebutton_quiz_start, imagebutton_coin_mini, imagebutton_star_mini, imagebutton_rank, imagebutton_invite;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    requestWindowFeature(Window.FEATURE_NO_TITLE);
	   // getWindow().setFlags(WindowManager.LayoutParams.FLAG_BLUR_BEHIND, WindowManager.LayoutParams.FLAG_BLUR_BEHIND);
	    setContentView(R.layout.activity_mainpopup01);
	    // TODO Auto-generated method stub
	    
	 // Close button
	    button_close = (Button)  findViewById(R.id.button_main_popup_close);
	    button_close.setOnClickListener(new OnClickListener(){
	    	public void onClick(View v) {
	    		Intent intent_button_close = new Intent(mainpopup.this, main01.class);
	    		intent_button_close.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	    		startActivity(intent_button_close);
	    	}
	    });
	    //end
	    
	 // Store button
	    imagebutton_store = (ImageButton)  findViewById(R.id.imageButton_store);
	    imagebutton_store.setOnClickListener(new OnClickListener(){
	    	public void onClick(View v) {
	    		Intent intent_button_store = new Intent(mainpopup.this, store_main01.class);
	    		intent_button_store.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
	    		startActivity(intent_button_store);
	    	}
	    });
	    //end
	    
	 // Rank button
	    imagebutton_rank = (ImageButton) findViewById(R.id.imageButton_rank);
	    imagebutton_rank.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent_button_rank = new Intent(mainpopup.this, rank.class);
				intent_button_rank.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
	    		startActivity(intent_button_rank);
			}
		});
	    //end
	    
	 // Invite button
	    imagebutton_invite = (ImageButton) findViewById(R.id.imageButton_invite);
	    imagebutton_invite.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent_button_invite = new Intent(mainpopup.this, invite.class);
				intent_button_invite.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
	    		startActivity(intent_button_invite);
			}
		});
	    //end
	    
	 // coin_mini button
	    imagebutton_coin_mini = (ImageButton)  findViewById(R.id.imageButton_plusbar1);
	    imagebutton_coin_mini.setOnClickListener(new OnClickListener(){
	    	public void onClick(View v) {
	    		Intent intent_button_store = new Intent(mainpopup.this, store_coinshop01.class);
	    		intent_button_store.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
	    		startActivity(intent_button_store);
	    	}
	    });
	    //end
	    
	 // star_mini button
	    imagebutton_star_mini = (ImageButton)  findViewById(R.id.imageButton_plusbar2);
	    imagebutton_star_mini.setOnClickListener(new OnClickListener(){
	    	public void onClick(View v) {
	    		Intent intent_button_store = new Intent(mainpopup.this, store_starshop01.class);
	    		intent_button_store.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
	    		startActivity(intent_button_store);
	    	}
	    });
	    //end
	    
	 // Start button
	    imagebutton_quiz_start = (ImageButton)  findViewById(R.id.imageButton_start);
	    imagebutton_quiz_start.setOnClickListener(new OnClickListener(){
	    	public void onClick(View v) {
	    		Intent intent_button_quiz_start = new Intent(mainpopup.this, quiz01.class);
	    		intent_button_quiz_start.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
	    		startActivity(intent_button_quiz_start);
	    	}
	    });
	    //end
	}

}
