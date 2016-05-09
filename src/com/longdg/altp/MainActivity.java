package com.longdg.altp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bhd  = (Button) findViewById(R.id.btnHuongdan);
        //Button bdc = (Button) findViewById(R.id.btnDiemcao);
        Button bexit = (Button) findViewById(R.id.btnThoat);
        Button bplay = (Button) findViewById(R.id.btnBatdau);
        bhd.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				OpenHD();
				
			}
		});
        bplay.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				OpenGame();
				
			}
		});
//        bdc.setOnClickListener(new View.OnClickListener() {
//			
//			@Override
//			public void onClick(View v) {
//				OpenDC();
//				
//			}
//		});
        bexit.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				System.exit(0);
				
			}
		});
        
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    public void OpenHD() {                         
    	Intent myIntent=new Intent(this,huongdan.class);
    	 startActivity(myIntent);
    }
    public void OpenDC() {                         
    	Intent myIntent=new Intent(this,diemcao.class);
		Bundle bundle=new Bundle();
		bundle.putInt("pScore", -1);
		myIntent.putExtra("MyPackage",bundle);
    	startActivity(myIntent);
    }
    public void OpenGame() {                         
    	Intent myIntent=new Intent(this,nameplayer.class);
    	 startActivity(myIntent);
    }
    
    
}
