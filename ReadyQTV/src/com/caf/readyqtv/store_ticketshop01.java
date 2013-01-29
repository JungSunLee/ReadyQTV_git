package com.caf.readyqtv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class store_ticketshop01 extends Activity {
	Button button_ticket_back;
	Button button_ticket_buy_5, button_ticket_buy_11, button_ticket_buy_23, button_ticket_buy_50,button_ticket_buy_130;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_store_ticketshop);
	    // TODO Auto-generated method stub
	    
	 // ticket back button
	    button_ticket_back = (Button)  findViewById(R.id.button_ticket_back);
	    button_ticket_back.setOnClickListener(new OnClickListener(){
	    	public void onClick(View v) {
	    		Intent intent_button_ticket_close = new Intent(store_ticketshop01.this, store_main01.class);
	    		intent_button_ticket_close.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	    		startActivity(intent_button_ticket_close);
	    	}
	    });
	    //end
	    /** ticket buy button**/
	 // ticket buy_5 button
	    button_ticket_buy_5 = (Button)  findViewById(R.id.button_buy_ticket_5);
	    button_ticket_buy_5.setOnClickListener(new OnClickListener(){
	    	public void onClick(View v) {
	    		Intent intent_button_ticket_buy_5 = new Intent(store_ticketshop01.this, store_ticketshop01_popup01.class);
	    		intent_button_ticket_buy_5.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	    		startActivity(intent_button_ticket_buy_5);
	    	}
	    });
	    //end
	    
	 // ticket buy_11 button
	    button_ticket_buy_11 = (Button)  findViewById(R.id.button_buy_ticket_11);
	    button_ticket_buy_11.setOnClickListener(new OnClickListener(){
	    	public void onClick(View v) {
	    		Intent intent_button_ticket_buy_11 = new Intent(store_ticketshop01.this, store_ticketshop01_popup01.class);
	    		intent_button_ticket_buy_11.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	    		startActivity(intent_button_ticket_buy_11);
	    	}
	    });
	    //end
	    
	 // ticket buy_23 button
	    button_ticket_buy_23 = (Button)  findViewById(R.id.button_buy_ticket_23);
	    button_ticket_buy_23.setOnClickListener(new OnClickListener(){
	    	public void onClick(View v) {
	    		Intent intent_button_ticket_buy_23 = new Intent(store_ticketshop01.this, store_ticketshop01_popup01.class);
	    		intent_button_ticket_buy_23.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	    		startActivity(intent_button_ticket_buy_23);
	    	}
	    });
	    //end
	    
	 // ticket buy_50 button
	    button_ticket_buy_50 = (Button)  findViewById(R.id.button_buy_ticket_50);
	    button_ticket_buy_50.setOnClickListener(new OnClickListener(){
	    	public void onClick(View v) {
	    		Intent intent_button_ticket_buy_50 = new Intent(store_ticketshop01.this, store_ticketshop01_popup01.class);
	    		intent_button_ticket_buy_50.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	    		startActivity(intent_button_ticket_buy_50);
	    	}
	    });
	    //end
	    
	 // ticket buy_130 button
	    button_ticket_buy_130 = (Button)  findViewById(R.id.button_buy_ticket_130);
	    button_ticket_buy_130.setOnClickListener(new OnClickListener(){
	    	public void onClick(View v) {
	    		Intent intent_button_ticket_buy_130 = new Intent(store_ticketshop01.this, store_ticketshop01_popup01.class);
	    		intent_button_ticket_buy_130.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	    		startActivity(intent_button_ticket_buy_130);
	    	}
	    });
	    //end
	    /** ticket buy button**/
	}

}
