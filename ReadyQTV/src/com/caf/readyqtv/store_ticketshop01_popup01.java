package com.caf.readyqtv;

import android.R.style;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;

public class store_ticketshop01_popup01 extends Activity {
	Button button_ticket_buy_cancel, button_ticket_buy_yes;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    requestWindowFeature(Window.FEATURE_NO_TITLE);
	    setContentView(R.layout.activity_ticketshop_popup01);
	    // TODO Auto-generated method stub
	    
	 // ticket buy cancel button
	    button_ticket_buy_cancel = (Button)  findViewById(R.id.button_ticketshop_popup_close);
	    button_ticket_buy_cancel.setOnClickListener(new OnClickListener(){
	    	public void onClick(View v) {
	    		Intent intent_button_ticket_buy_cancel = new Intent(store_ticketshop01_popup01.this, store_ticketshop01.class);
	    		intent_button_ticket_buy_cancel.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	    		startActivity(intent_button_ticket_buy_cancel);
	    	}
	    });
	    //end
	    
	 // ticket buy yes button
	    button_ticket_buy_yes = (Button)  findViewById(R.id.button_buy_yes);
	    button_ticket_buy_yes.setOnClickListener(new OnClickListener(){
	    	public void onClick(View v) {
	    		Intent intent_button_ticket_buy_yes = new Intent(store_ticketshop01_popup01.this, store_buy_complete_popup.class);
	    		intent_button_ticket_buy_yes.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
	    		startActivity(intent_button_ticket_buy_yes);
	    	}
	    });
	    //end
	}
	
	// FrameLayout white 테두리 없애는 함수
		protected void onApplyThemeResource(Resources.Theme theme, int resid, boolean first) {
			super.onApplyThemeResource(theme, resid, first);
			theme.applyStyle(style.Theme_Panel, true);
		}

}
