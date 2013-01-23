package com.caf.readyqtv;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

public class contents01 extends TabActivity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_contents01);
	    // TODO Auto-generated method stub
	    
	    /** TAB BAR **/
	    //
	    TabHost tab_host1 = getTabHost();
	    TabHost.TabSpec spec1;
	    
	    Intent intent_item = new Intent().setClass(this, contents01_tab_item.class);
	    spec1 = tab_host1.newTabSpec("ITEM");
	    spec1.setIndicator("ITEM");
	    spec1.setContent(intent_item);
	    tab_host1.addTab(spec1);
	    
	    //
	    TabHost tab_host2 = getTabHost();
	    TabHost.TabSpec spec2;
	    
	    Intent intent_home = new Intent().setClass(this, contents01_tab_home.class);
	    spec2 = tab_host1.newTabSpec("HOME");
	    spec2.setIndicator("HOME");
	    spec2.setContent(intent_home);
	    tab_host2.addTab(spec2);
	    
	    //
	    TabHost tab_host3 = getTabHost();
	    TabHost.TabSpec spec3;
	    
	    Intent intent_place = new Intent().setClass(this, contents01_tab_place.class);
	    spec3 = tab_host1.newTabSpec("PLACE");
	    spec3.setIndicator("PLACE");
	    spec3.setContent(intent_place);
	    tab_host3.addTab(spec3);
	    
	    tab_host1.getTabWidget().getChildAt(0).getLayoutParams().height = 35;
	    tab_host2.getTabWidget().getChildAt(1).getLayoutParams().height = 35;
	    tab_host3.getTabWidget().getChildAt(2).getLayoutParams().height = 35;
	    
//	    for(int tab = 0 ; tab_host1.getTabWidget().getChildCount() ; tab++) {
//	    	tab_host1.getTabWidget().getChildAt(tab).getLayoutParams().height = 100;
//	    }
	}

}
