package com.longdg.altp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class diemcao extends Activity {
	String arrN[] = {"player1","player2","player3","player4","player5",""};
	String arrS[] = {"7","5","4","3","2",""};
	ListView lv1,lv2;
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diemcao);
        //LoadArr();
        Intent callerIntent=getIntent();
        Bundle packageFromCaller=callerIntent.getBundleExtra("MyPackage");
        int s = packageFromCaller.getInt("pScore");
        if(s!=-1){
        	String n = packageFromCaller.getString("pName");
        	arrS[5]=s+"";
			arrN[5]=n;
        	xapSep(s+"",n);
        	
        }
        else{
        	LoadArr();
        }
        
        Button back = (Button) findViewById(R.id.btnBack);
        Button play = (Button) findViewById(R.id.btnPlay);
        back.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				finish();
				
			}
		});
        play.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				OpenGame();
			}
		});
    }
	public void OpenGame() {                         
    	Intent myIntent=new Intent(this,nameplayer.class);
    	 startActivity(myIntent);
    }
	public void LoadArr(){
		lv1=(ListView) findViewById(R.id.listView1);
        ArrayAdapter<String>adapter=new ArrayAdapter<String>
        (this, android.R.layout.simple_list_item_1, arrS);
        lv1.setAdapter(adapter);
        lv2=(ListView) findViewById(R.id.listView2);
        ArrayAdapter<String>adapter2=new ArrayAdapter<String>
        (this, android.R.layout.simple_list_item_1, arrN);
        lv2.setAdapter(adapter2);
	}
//	public void InnitHighScore(){
//		txts1 = (TextView) findViewById(R.id.txtS1);
//		txts2 = (TextView) findViewById(R.id.txtS2);
//		txts3 = (TextView) findViewById(R.id.txtS3);
//		txts4 = (TextView) findViewById(R.id.txtS4);
//		txts5 = (TextView) findViewById(R.id.txtS5);
//		txtn1 = (TextView) findViewById(R.id.txtN1);
//		txtn2 = (TextView) findViewById(R.id.txtN2);
//		txtn3 = (TextView) findViewById(R.id.txtN3);
//		txtn4 = (TextView) findViewById(R.id.txtN4);
//		txtn5 = (TextView) findViewById(R.id.txtN5);
//		txts1.setText(arrS[0]+"");
//		txts2.setText(arrS[1]+"");
//		txts3.setText(arrS[2]+"");
//		txts4.setText(arrS[3]+"");
//		txts5.setText(arrS[4]+"");
//		txtn1.setText(arrN[0]);
//		txtn2.setText(arrN[1]);
//		txtn3.setText(arrN[2]);
//		txtn4.setText(arrN[3]);
//		txtn5.setText(arrN[4]);
//	}
	public void xapSep(String i,String n){
		int y = Integer.parseInt(i.toString());
		if(y>Integer.parseInt(arrS[4].toString())){
			String tg2,tg1;
			for(int x=4;x<0;x--){
				if(Integer.parseInt(arrS[x].toString())<Integer.parseInt(arrS[x+1].toString())){
					tg1=arrS[x];
					arrS[x]=arrS[x+1];
					arrS[x+1]=tg1;
					tg2=arrN[x];
					arrN[x]=arrN[x+1];
					arrN[x+1]=tg2;
					
				}
				else{
					break;
				}
				
			}
			LoadArr();
		}
		else{
			LoadArr();
			Toast toast=Toast.makeText(diemcao.this,"Ban k du diem vao top", Toast.LENGTH_SHORT);
			toast.show();
		}
	}
}
