package com.longdg.altp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class huongdan extends Activity {
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.huongdan);
        Button back = (Button) findViewById(R.id.btnBack);
        
        back.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				finish();
				
			}
		});
        
    }
}
