package com.caf.readyqtv;

import android.R.style;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;

public class store_buy_complete_popup extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_store_buy_complete_popup);
	    // TODO Auto-generated method stub
	    
	    Handler ticket_buy_complet = new Handler();
	    ticket_buy_complet.postDelayed(new Runnable() {
        	@Override
        	public void run() {
        		Intent intent_ticket_buy_complet = new Intent(store_buy_complete_popup.this, store_ticketshop01.class);
        		//intent_ticket_buy_complet.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        		startActivity(intent_ticket_buy_complet);
        		
        		finish();
        	}
        }, 1500);
	}
	
	// FrameLayout white 테두리 없애는 함수
			protected void onApplyThemeResource(Resources.Theme theme, int resid, boolean first) {
				super.onApplyThemeResource(theme, resid, first);
				theme.applyStyle(style.Theme_Panel, true);
			}

}
