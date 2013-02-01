package com.caf.readyqtv;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

public class more_notification01 extends Activity {
	Button button_more_notification_back_left;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_more_notification);
	    // TODO Auto-generated method stub
	    
	 // account back button
	    button_more_notification_back_left = (Button)  findViewById(R.id.button_notification_back_left);
	    button_more_notification_back_left.setOnClickListener(new OnClickListener(){
	    	public void onClick(View v) {
	    		Intent intent_button_more_notification_back_left = new Intent(more_notification01.this, more_main.class);
	    		startActivity(intent_button_more_notification_back_left);
	    	}
	    });
	    //end
	    
//	    ArrayList<more_notification> m_orders = new ArrayList<more_notification>();
//	    
//	    more_notification list01 = new more_notification("New ReadyQTV for Android v1.0.0","02/01");
//	    more_notification list02 = new more_notification("New ReadyQTV for Iphone v1.0.0", "02/01");
//	    
//	    m_orders.add(list01);
//	    m_orders.add(list02);
//	    
//	    more_notificationAdapter m_adapter = new more_notificationAdapter(this, R.layout.activity_more_notification_listview_layout, m_orders);
//	    setListAdapter(m_adapter);
//	}
//
//	
//
//	private class more_notificationAdapter extends ArrayAdapter<more_notification> {
//		private ArrayList<more_notification> items;
//		public more_notificationAdapter(Context context, int textViewResourceId, ArrayList<more_notification> items) {
//			super(context, textViewResourceId, items);
//			this.items = items;
//		}
//		@Override
//		public View getView(int position, View convertView, ViewGroup parent) {
//			View v = convertView;
//			if(v == null) {
//				LayoutInflater vi = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//				v = vi.inflate(R.layout.activity_more_notification_listview_layout, null);
//			}
//			more_notification list = items.get(position);
//			if(list != null) { 
//				TextView tt = (TextView) v.findViewById(R.id.textView_more_notification_01);
//				TextView bt = (TextView) v.findViewById(R.id.textView_more_notification_02);
//				if(tt != null) {
//					tt.setText(list.getName());
//				}
//				if(bt != null) {
//					bt.setText(list.getNumber());
//				}
//			}
//			return v;
//		}
//	}
//	class more_notification {
//		private String Name;
//		private String Number;
//		
//		
//		
//		public more_notification(String Name, String Number) {
//			// TODO Auto-generated constructor stub
//			this.Name = Name;
//			this.Number = Number;
//		}
//
//		public String getName() {
//			return Name;
//		}
//		
//		public String getNumber() {
//			return Number;
//		}
	}
}
