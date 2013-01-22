package com.caf.readyqtv;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class Logo01 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo01);
        
        Handler logo01 = new Handler();
        logo01.postDelayed(new Runnable() {
        	@Override
        	public void run() {
        		Intent intent_logo01 = new Intent(Logo01.this, main01.class);
        		intent_logo01.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        		startActivity(intent_logo01);
        		
        		finish();
        	}
        }, 1500);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_logo01, menu);
        return true;
    }
    
}
