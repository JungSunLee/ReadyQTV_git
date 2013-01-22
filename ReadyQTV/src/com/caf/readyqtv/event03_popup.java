package com.caf.readyqtv;

import android.R.style;
import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Window;

public class event03_popup extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    requestWindowFeature(Window.FEATURE_NO_TITLE);
	    setContentView(R.layout.activity_event03_popup);
	    // TODO Auto-generated method stub
	}
	
	// FrameLayout white 테두리 없애는 함수
	protected void onApplyThemeResource(Resources.Theme theme, int resid, boolean first) {
		super.onApplyThemeResource(theme, resid, first);
		theme.applyStyle(style.Theme_Panel, true);
	}

}
