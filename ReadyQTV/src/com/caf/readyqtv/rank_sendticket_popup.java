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

public class rank_sendticket_popup extends Activity {
	Button button_rank_sendticket_cancel, button_rank_sendticket_yes;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    requestWindowFeature(Window.FEATURE_NO_TITLE);
	    setContentView(R.layout.activity_rank_sendticket_confirm_popup);
	    // TODO Auto-generated method stub
	    
	 //  Send ticket cancel button
	    button_rank_sendticket_cancel = (Button)  findViewById(R.id.button_rank_send_ticket_close);
	    button_rank_sendticket_cancel.setOnClickListener(new OnClickListener(){
	    	public void onClick(View v) {
	    		Intent intent_button_rank_sendticket_cancel = new Intent(rank_sendticket_popup.this, rank.class);
	    		intent_button_rank_sendticket_cancel.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	    		startActivity(intent_button_rank_sendticket_cancel);
	    	}
	    });
	    //end
	    
	 // Send ticket yes button
	    button_rank_sendticket_yes = (Button)  findViewById(R.id.button_rank_sendticket_yes);
	    button_rank_sendticket_yes.setOnClickListener(new OnClickListener(){
	    	public void onClick(View v) {
	    		Intent intent_button_rank_sendticket_yes = new Intent(rank_sendticket_popup.this, rank.class);
	    		intent_button_rank_sendticket_yes.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
	    		startActivity(intent_button_rank_sendticket_yes);
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
