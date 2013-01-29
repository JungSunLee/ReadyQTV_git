package com.caf.readyqtv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class store_main01 extends Activity {
	Button button_shop_star, button_shop_coin, button_shop_ticket, button_chat, button_store_close;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_store_main01);
	    // TODO Auto-generated method stub
	    
	 // starshop button
	    button_shop_star = (Button)  findViewById(R.id.button_starshop);
	    button_shop_star.setOnClickListener(new OnClickListener(){
	    	public void onClick(View v) {
	    		Intent intent_button_shop_star = new Intent(store_main01.this, store_starshop01.class);
	    		intent_button_shop_star.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	    		startActivity(intent_button_shop_star);
	    	}
	    });
	    //end
	    
	 // coinshop button
	    button_shop_coin = (Button)  findViewById(R.id.button_coinshop);
	    button_shop_coin.setOnClickListener(new OnClickListener(){
	    	public void onClick(View v) {
	    		Intent intent_button_shop_coin = new Intent(store_main01.this, store_coinshop01.class);
	    		intent_button_shop_coin.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	    		startActivity(intent_button_shop_coin);
	    	}
	    });
	    //end
	    
	 // ticketshop button
	    button_shop_ticket = (Button)  findViewById(R.id.button_ticketshop);
	    button_shop_ticket.setOnClickListener(new OnClickListener(){
	    	public void onClick(View v) {
	    		Intent intent_button_shop_ticket = new Intent(store_main01.this, store_ticketshop01.class);
	    		intent_button_shop_ticket.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	    		startActivity(intent_button_shop_ticket);
	    	}
	    });
	    //end
	    
	 // chat button
	    button_chat = (Button)  findViewById(R.id.button_chat);
	    button_chat.setOnClickListener(new OnClickListener(){
	    	public void onClick(View v) {
	    		Intent intent_button_chat = new Intent(store_main01.this, main01.class);
	    		intent_button_chat.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	    		startActivity(intent_button_chat);
	    	}
	    });
	    //end
	    
	 // store close button
	    button_store_close = (Button)  findViewById(R.id.button_store_main_close);
	    button_store_close.setOnClickListener(new OnClickListener(){
	    	public void onClick(View v) {
	    		Intent intent_button_store_close = new Intent(store_main01.this, main01.class);
	    		intent_button_store_close.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	    		startActivity(intent_button_store_close);
	    	}
	    });
	    //end
	}

}
