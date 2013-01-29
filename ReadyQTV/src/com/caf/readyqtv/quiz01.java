package com.caf.readyqtv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class quiz01 extends Activity {
	private TextView textView_question_timing;
	private float value = 20;
	private CountDownTimer timer;
	Button button_quiz01_out;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.quiz01);
	    // TODO Auto-generated method stub
	    
	 // Quiz out button
	    button_quiz01_out = (Button)  findViewById(R.id.button_quiz01_out);
	    button_quiz01_out.setOnClickListener(new OnClickListener(){
	    	public void onClick(View v) {
	    		Intent intent_button_quiz01_out = new Intent(quiz01.this, quiz_option_popup.class);
	    		startActivity(intent_button_quiz01_out);
	    	}
	    });
	    //end
	    
	    textView_question_timing = (TextView) findViewById(R.id.textView_question_timing);
	    
	    timer = new CountDownTimer(21*1000, 1000) {
	    	@Override
	    	public void onTick (long millisUntilFinished) {
	    		value--;
	    		textView_question_timing.setText(">"+value);
	    		
	    		//if(value == 20) timer.cancel();
	    	}
	    	@Override
	    	public void onFinish(){
//	    		Intent intent1 = new Intent(quiz01.this, mainpopup.class);
//	    		startActivity(intent1);
	    	}
	    }.start();
	}

}
