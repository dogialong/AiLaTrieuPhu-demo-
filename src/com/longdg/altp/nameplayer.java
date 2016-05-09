package com.longdg.altp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class nameplayer extends Activity  {
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nameplayer);
        final EditText txtName = (EditText) findViewById(R.id.editText1);
        Button btnSaveName = (Button) findViewById(R.id.button1);
        Button btnExit = (Button) findViewById(R.id.button2);
        btnSaveName.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent myIntent=new Intent(nameplayer.this,choigame.class);
				Bundle bundle=new Bundle();
				String a = txtName.getText().toString();
				bundle.putString("pName", a);
				myIntent.putExtra("MyPackage", bundle);
	        	startActivity(myIntent);
				
			}
		});
        btnExit.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				finish();
				
			}
		});
        }
	}
	
