package com.caf.readyqtv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class rank extends Activity {
	Button button_rank_close, button_rank_send_ticket01, button_rank_send_ticket02, button_rank_send_ticket03, button_rank_send_ticket04;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_rank);
	    // TODO Auto-generated method stub
	    
	 // Rank close button
	    button_rank_close = (Button)  findViewById(R.id.button_rank_close);
	    button_rank_close.setOnClickListener(new OnClickListener(){
	    	public void onClick(View v) {
	    		Intent intent_button_rank_close = new Intent(rank.this, main01.class);
	    		intent_button_rank_close.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	    		startActivity(intent_button_rank_close);
	    	}
	    });
	    //end
	    
	 // Rank01 send ticket button
	    button_rank_send_ticket01 = (Button)  findViewById(R.id.button_rank_send_ticket01);
	    button_rank_send_ticket01.setOnClickListener(new OnClickListener(){
	    	public void onClick(View v) {
	    		Intent intent_button_rank_send_ticket01 = new Intent(rank.this, rank_sendticket_popup.class);
	    		startActivity(intent_button_rank_send_ticket01);
	    	}
	    });
	    //end
	    
	 // Rank02 send ticket button
	    button_rank_send_ticket02 = (Button)  findViewById(R.id.button_rank_send_ticket02);
	    button_rank_send_ticket02.setOnClickListener(new OnClickListener(){
	    	public void onClick(View v) {
	    		Intent intent_button_rank_send_ticket02 = new Intent(rank.this, rank_sendticket_popup.class);
	    		startActivity(intent_button_rank_send_ticket02);
	    	}
	    });
	    //end
	    
	 // Rank03 send ticket button
	    button_rank_send_ticket03 = (Button)  findViewById(R.id.button_rank_send_ticket03);
	    button_rank_send_ticket03.setOnClickListener(new OnClickListener(){
	    	public void onClick(View v) {
	    		Intent intent_button_rank_send_ticket03 = new Intent(rank.this, rank_sendticket_popup.class);
	    		startActivity(intent_button_rank_send_ticket03);
	    	}
	    });
	    //end
	    
	 // Rank04 send ticket button
	    button_rank_send_ticket04 = (Button)  findViewById(R.id.button_rank_send_ticket04);
	    button_rank_send_ticket04.setOnClickListener(new OnClickListener(){
	    	public void onClick(View v) {
	    		Intent intent_button_rank_send_ticket04 = new Intent(rank.this, rank_sendticket_popup.class);
	    		startActivity(intent_button_rank_send_ticket04);
	    	}
	    });
	    //end
	}

}
