package com.example.test;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	protected String[] employees = {"Christophe Coenraets", "John Smith"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		findViewById(R.id.button1).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.button2).setOnClickListener(mGlobal_OnClickListener);ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, employees);
        ListView employeeList = (ListView) findViewById(R.id.list);
        employeeList.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	//Global On click listener for all views
    final OnClickListener mGlobal_OnClickListener = new OnClickListener() {
        public void onClick(final View v) {
            switch(v.getId()) {
                case R.id.button1:
                    //Inform the user the button1 has been clicked
                    Toast.makeText(getApplicationContext(), "Button1 clicked.", Toast.LENGTH_SHORT).show();
                    TextView t = (TextView)findViewById(R.id.TextView01);
                    t.setText("Updated");
                break;
                case R.id.button2:
                    //Inform the user the button2 has been clicked
                    Toast.makeText(getApplicationContext(), "Button2 clicked.", Toast.LENGTH_SHORT).show();                
                break;
            }
        }
    };

}