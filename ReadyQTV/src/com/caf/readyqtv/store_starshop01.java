package com.caf.readyqtv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class store_starshop01 extends Activity {
	Button button_star_back;
	Button button_star_buy_10, button_star_buy_55, button_star_buy_120, button_star_buy_400, button_star_buy_750;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_store_starshop);
	    // TODO Auto-generated method stub
	    
	 // star back button
	    button_star_back = (Button)  findViewById(R.id.button_star_back);
	    button_star_back.setOnClickListener(new OnClickListener(){
	    	public void onClick(View v) {
	    		Intent intent_button_star_close = new Intent(store_starshop01.this, store_main01.class);
	    		intent_button_star_close.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	    		startActivity(intent_button_star_close);
	    	}
	    });
	    //end
	    
	    /** star buy button**/
		 // star buy_10 button
		    button_star_buy_10 = (Button)  findViewById(R.id.button_buy_star_10);
		    button_star_buy_10.setOnClickListener(new OnClickListener(){
		    	public void onClick(View v) {
		    		Intent intent_button_ticket_buy_5 = new Intent(store_starshop01.this, store_ticketshop01_popup01.class);
		    		intent_button_ticket_buy_5.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		    		startActivity(intent_button_ticket_buy_5);
		    	}
		    });
		    //end
		    
		 // star buy_55 button
		    button_star_buy_55 = (Button)  findViewById(R.id.button_buy_star_55);
		    button_star_buy_55.setOnClickListener(new OnClickListener(){
		    	public void onClick(View v) {
		    		Intent intent_button_star_buy_55 = new Intent(store_starshop01.this, store_ticketshop01_popup01.class);
		    		intent_button_star_buy_55.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		    		startActivity(intent_button_star_buy_55);
		    	}
		    });
		    //end
		    
		 // star buy_120 button
		    button_star_buy_120 = (Button)  findViewById(R.id.button_buy_star_120);
		    button_star_buy_120.setOnClickListener(new OnClickListener(){
		    	public void onClick(View v) {
		    		Intent intent_button_star_buy_120 = new Intent(store_starshop01.this, store_ticketshop01_popup01.class);
		    		intent_button_star_buy_120.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		    		startActivity(intent_button_star_buy_120);
		    	}
		    });
		    //end
		    
		 //star buy_400 button
		    button_star_buy_400 = (Button)  findViewById(R.id.button_buy_star_400);
		    button_star_buy_400.setOnClickListener(new OnClickListener(){
		    	public void onClick(View v) {
		    		Intent intent_button_star_buy_400 = new Intent(store_starshop01.this, store_ticketshop01_popup01.class);
		    		intent_button_star_buy_400.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		    		startActivity(intent_button_star_buy_400);
		    	}
		    });
		    //end
		    
		 //star buy_750 button
		    button_star_buy_750 = (Button)  findViewById(R.id.button_buy_star_750);
		    button_star_buy_750.setOnClickListener(new OnClickListener(){
		    	public void onClick(View v) {
		    		Intent intent_button_star_buy_750 = new Intent(store_starshop01.this, store_ticketshop01_popup01.class);
		    		intent_button_star_buy_750.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		    		startActivity(intent_button_star_buy_750);
		    	}
		    });
		    //end
		    /** star buy button**/
	}

}
