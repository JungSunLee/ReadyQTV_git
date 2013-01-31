package com.caf.readyqtv;

import java.util.Calendar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class main01 extends Activity implements OnTouchListener {
	private TextView mDateDisplay;
	private int mYear, mMonth, mDay;
	int flipperIndex;
	CheckBox checkBox;
	ViewFlipper flipper;
	RadioGroup radios;
	RadioButton radio1;
	RadioButton radio2;
	RadioButton radio3;
	// 터치 이벤트 발생 지점의 x좌표 저장
	float previousDown;
	float xAtDown;
	float xAtUp;
	
	Button Button_channel1 , Button_channel2, Button_channel3;
	ImageButton button_event, button_contents, button_more;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_main01);
	    // TODO Auto-generated method stub
	    
	    radios = (RadioGroup) findViewById(R.id.radios);
	    radio1 = (RadioButton) findViewById(R.id.radio1);
	    radio2 = (RadioButton) findViewById(R.id.radio2);
	    radio3 = (RadioButton) findViewById(R.id.radio3);
	    
	    radio1.setOnCheckedChangeListener(new OnCheckedChangeListener(){
	    	@Override
	    	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
	    		switch(buttonView.getId()) {
	    		case R.id.radio1 :
	    			if (radio1.isChecked()) {
	    				radio1.setChecked(true);
	    				radio1.setButtonDrawable(R.drawable.scrollbar_gold);
	    			} else if (radio1.isEnabled()) {
	    				radio1.setChecked(false);	
	    				radio1.setButtonDrawable(R.drawable.scrollbar_grey);
	    			}
	    		}
	    	}
	    });
	    
	    radio2.setOnCheckedChangeListener(new OnCheckedChangeListener(){
	    	@Override
	    	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
	    		switch(buttonView.getId()) {
	    		case R.id.radio2 :
	    			if (radio2.isChecked()) {
	    				radio2.setChecked(true);
	    				radio2.setButtonDrawable(R.drawable.scrollbar_gold);
	    			} else if (radio2.isEnabled()) {
	    				radio2.setChecked(false);
	    				radio2.setButtonDrawable(R.drawable.scrollbar_grey);
	    			}
	    		}
	    	}
	    });
	    
	    radio3.setOnCheckedChangeListener(new OnCheckedChangeListener(){
	    	@Override
	    	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
	    		switch(buttonView.getId()) {
	    		case R.id.radio3 :
	    			if (radio3.isChecked()) {
	    				radio3.setChecked(true);
	    				radio3.setButtonDrawable(R.drawable.scrollbar_gold);
	    			} else if (radio3.isEnabled()) {
	    				radio3.setChecked(false);
	    				radio3.setButtonDrawable(R.drawable.scrollbar_grey);
	    			}
	    		}
	    	}
	    });
	    
	    radio1.setChecked(true);
	    flipper = (ViewFlipper) findViewById(R.id.viewFlipper1);
	    flipper.setOnTouchListener(this);
	    
	    Button_channel1 = (Button) findViewById(R.id.imageButton_channel1);
        Button_channel1.setOnClickListener(new OnClickListener(){
        	public void onClick(View v){
        		Intent intent_imageButton_channel1 = new Intent(main01.this , mainpopup.class);
        		startActivity(intent_imageButton_channel1);
        	}
        });
	    Button_channel2 = (Button) findViewById(R.id.imageButton_channel2);
	    Button_channel3 = (Button) findViewById(R.id.imageButton_channel3);

	    // Event button
	    button_event = (ImageButton)  findViewById(R.id.imageButton_event);
	    button_event.setOnClickListener(new OnClickListener(){
	    	public void onClick(View v) {
	    		Intent intent_button_event = new Intent(main01.this, event01.class);
	    		startActivity(intent_button_event);
	    		overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
	    	}
	    });
	    //end
	    
	 // Contents button
	    button_contents = (ImageButton)  findViewById(R.id.imageButton_contents);
	    button_contents.setOnClickListener(new OnClickListener(){
	    	public void onClick(View v) {
	    		Intent intent_button_contents = new Intent(main01.this, contents01.class);
	    		startActivity(intent_button_contents);
	    	}
	    });
	    //end
	    
	 // More button
	    button_more = (ImageButton)  findViewById(R.id.imageButton_more);
	    button_more.setOnClickListener(new OnClickListener(){
	    	public void onClick(View v) {
	    		Intent intent_button_setting = new Intent(main01.this, more_main.class);
	    		startActivity(intent_button_setting);
	    		overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
	    	}
	    });
	    //end
	    
	    // date display(auto)
	    mDateDisplay = (TextView) findViewById(R.id.textView_date);
	    final Calendar c = Calendar.getInstance();
	    mYear = c.get(Calendar.YEAR);
	    mMonth = c.get(Calendar.MONTH)+1;
	    mDay = c.get(Calendar.DAY_OF_MONTH);
	    updateDisplay();
	    //end
	}

	
	private void updateDisplay() {
		// TODO Auto-generated method stub
		mDateDisplay.setText(mYear+"년"+mMonth+"월"+mDay+"일");
	}

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		if(v != flipper)
			return false;
		if(event.getAction() == MotionEvent.ACTION_DOWN) {
			xAtDown = event.getX();
		}
		else if(event.getAction() == MotionEvent.ACTION_UP) {
			xAtUp = event.getX();
			
			if(xAtUp < xAtDown) {
				flipper.setInAnimation(AnimationUtils.loadAnimation(this, R.anim.push_left_in));
				flipper.setOutAnimation(AnimationUtils.loadAnimation(this, R.anim.push_left_out));
				flipper.showNext();
			}
			else if(xAtUp > xAtDown) {
				flipper.setInAnimation(AnimationUtils.loadAnimation(this, R.anim.push_right_in));
				flipper.setOutAnimation(AnimationUtils.loadAnimation(this, R.anim.push_right_out));
				flipper.showPrevious();
			}
			checkView();
		}
		return true;
		// TODO Auto-generated method stub		
	}


	private void checkView() {
		// TODO Auto-generated method stub
		Button temp = (Button) flipper.getCurrentView();
		if (temp.equals(Button_channel1)) {
			radio1.setChecked(true);
		}
		if (temp.equals(Button_channel2)) {
			radio2.setChecked(true);
		}
		if (temp.equals(Button_channel3)) {
			radio3.setChecked(true);
		}
	}
	
	
	}


