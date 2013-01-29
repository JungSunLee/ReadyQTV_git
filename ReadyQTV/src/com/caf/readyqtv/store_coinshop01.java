package com.caf.readyqtv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class store_coinshop01 extends Activity {
	Button button_coin_back;
	Button button_coin_buy_5000, button_star_buy_27500, button_star_buy_60000, button_star_buy_200000, button_star_buy_375000;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_store_coinshop);
	    // TODO Auto-generated method stub
	    
	 // coin back button
	    button_coin_back = (Button)  findViewById(R.id.button_coin_back);
	    button_coin_back.setOnClickListener(new OnClickListener(){
	    	public void onClick(View v) {
	    		Intent intent_button_coin_close = new Intent(store_coinshop01.this, store_main01.class);
	    		intent_button_coin_close.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	    		startActivity(intent_button_coin_close);
	    	}
	    });
	    //end
	    
	    /** coin buy button**/
		 // coin buy_5000 button
		    button_coin_buy_5000 = (Button)  findViewById(R.id.button_buy_coin_5000);
		    button_coin_buy_5000.setOnClickListener(new OnClickListener(){
		    	public void onClick(View v) {
		    		Intent intent_button_coin_buy_5000 = new Intent(store_coinshop01.this, store_ticketshop01_popup01.class);
		    		intent_button_coin_buy_5000.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		    		startActivity(intent_button_coin_buy_5000);
		    	}
		    });
		    //end
		    
		 // coin buy_27500 button
		    button_star_buy_27500 = (Button)  findViewById(R.id.button_buy_coin_27500);
		    button_star_buy_27500.setOnClickListener(new OnClickListener(){
		    	public void onClick(View v) {
		    		Intent intent_button_star_buy_27500 = new Intent(store_coinshop01.this, store_ticketshop01_popup01.class);
		    		intent_button_star_buy_27500.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		    		startActivity(intent_button_star_buy_27500);
		    	}
		    });
		    //end
		    
		 // coin buy_60000 button
		    button_star_buy_60000 = (Button)  findViewById(R.id.button_buy_coin_60000);
		    button_star_buy_60000.setOnClickListener(new OnClickListener(){
		    	public void onClick(View v) {
		    		Intent intent_button_star_buy_60000 = new Intent(store_coinshop01.this, store_ticketshop01_popup01.class);
		    		intent_button_star_buy_60000.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		    		startActivity(intent_button_star_buy_60000);
		    	}
		    });
		    //end
		    
		 // coin buy_200000 button
		    button_star_buy_200000 = (Button)  findViewById(R.id.button_buy_coin_200000);
		    button_star_buy_200000.setOnClickListener(new OnClickListener(){
		    	public void onClick(View v) {
		    		Intent intent_button_star_buy_200000 = new Intent(store_coinshop01.this, store_ticketshop01_popup01.class);
		    		intent_button_star_buy_200000.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		    		startActivity(intent_button_star_buy_200000);
		    	}
		    });
		    //end
		    
		 // coin buy_375000 button
		    button_star_buy_375000 = (Button)  findViewById(R.id.button_buy_coin_375000);
		    button_star_buy_375000.setOnClickListener(new OnClickListener(){
		    	public void onClick(View v) {
		    		Intent intent_button_star_buy_375000 = new Intent(store_coinshop01.this, store_ticketshop01_popup01.class);
		    		intent_button_star_buy_375000.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		    		startActivity(intent_button_star_buy_375000);
		    	}
		    });
		    //end
		    /** coin buy button**/
	}

}
