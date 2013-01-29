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

public class event03_popup extends Activity {
	Button button_event_popup_yes, button_event_popup_no;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    requestWindowFeature(Window.FEATURE_NO_TITLE);
	    setContentView(R.layout.activity_event03_popup);
	    // TODO Auto-generated method stub
	    
	 // Event popup_yes button
	    button_event_popup_yes = (Button)  findViewById(R.id.button_event_popup_yes);
	    button_event_popup_yes.setOnClickListener(new OnClickListener(){
	    	public void onClick(View v) {
	    		Intent intent_button_event_popup_yes = new Intent(event03_popup.this, event01.class);
	    		startActivity(intent_button_event_popup_yes);
	    	}
	    });
	    //end
	    
	 // Event popup_no button
	    button_event_popup_no = (Button)  findViewById(R.id.button_event_popup_no);
	    button_event_popup_no.setOnClickListener(new OnClickListener(){
	    	public void onClick(View v) {
	    		Intent intent_button_event_popup_no = new Intent(event03_popup.this, event01.class);
	    		startActivity(intent_button_event_popup_no);
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
