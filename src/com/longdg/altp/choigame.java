package com.longdg.altp;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class choigame extends Activity {
	String cauHoi[][]={{"Câu 1 : Thủ đô nước Anh là",
		"Câu 1 : Hồ nước ng�?t nào lớn nhất theo thê tích và sâu nhất thê giới ?"},
						{"Câu 2 :Hoàn thành câu sau 'Không ... đố mày làm nên' ",
			"Câu 2 :  Nơi có hải cảng sầm uất nhất thế giới , bạn cho biết tên  thành phố này ?"},
						{"Câu 3 :Trong  truyên ngắn�? ông lão đánh cá và con cá vàng �? , ông lão đã ra biển mấy lần ? ",
				"Câu 3 : Con sên có mấy cái mũi  ?"},
						{"Câu 4 : CLb Real Madrid �?ã  bao nhiêu lần vô địch  Cúp C1  Châu âu ?",
					"Câu 4 :  Ông tổ  Của �? �?�?n ca tài tử �? ?"},
						{"Câu 5 :Cây Ca cao có nguồn gốc  từ châu lục nào ?",
						"Câu 5 : Năm 1928  , nhân vật hoạt hình nào lần đầu tiên xuất hiện ?"},
						{"Câu 6 :Núi lửa hoạt động lớn nhất thế giới hiện nay nằm ở đâu ?",
							"Câu 6 : Thuật Ngữ Tôn giáo co nguồn gốc từ đâu ?"},
						{"Câu 7 :�?ất nước nào trên thế giới có hình dạng giống Quả ớt ?",
								"Câu 7 : Văn Miếu , trư�?ng đại h�?c đầu tiên của việt nam , được xây dựng dưới  tri�?u đại nào ?"},
						{"Câu 8 : Tác giả Của bài Thơ �? Nhớ Con Sông Quê hương�? ?",
									"Câu  8 :  Hoa Hậu Hoàng Vũ năm 2007 Thuộc Quốc gia nào ?"},
						{"Câu 9 :Tên tiếng anh viết tắt hệ thống ti�?n tệ chạu âu  là gì ?",
										"Câu  9 : Một Mét Khối nước tương đương  với bao nhiêu lít nươc ?"},
						{"Câu 10 :Vị Trạng Nguyên Nh�? tuổi nhất trong lịch sử Việt Nam ?",
											"Câu 10 : Bộ tem  bưu chính  đầu tiên của Việt Nam in Hình gì  ?"}
						};
	String dapAnDung[][]={{"London","Hồ Baikal"},
						{"Thầy","Thượng hải"},
						{"6","4"},
						{"9","Cao Văn Lầu"},
						{"Châu Mỹ","Chuột Mickey"},
						{"Quần đảo Hawai","Phương tây"},
						{"Chile","Nhà H�? Lý"},
						{"Tế Hanh","Nhật Bản"},
						{"EMS","1000"},
						{"Nguyễn Hi�?n","Chân Dung Hồ Chí Minh"}
						};
	String dapAn[][]={{"London","Berlin","Bangkok","Hà Nội","Hồ Baikal","Hồ Tây","Hồ Lockness","Hồ Gươm"},
					{"Thầy","Bạn","Cha","Mẹ","Thượng hải","Tokyo","Sysney","Singapore"},
					{"3","4","5","6","4","3","2","1"},
					{"3","5","7","9","Cao Văn Lầu","Nguyễn Trãi","Ngô Thì Nhậm","Ngô Quy�?n"},
					{"Châu �?","Châu Âu","Châu Mỹ","Châu phi","Chuột Mickey","Tom & Jerry","Tôn Ngộ Không","Vịt Donal"},
					{"Quần đảo Hawai","Nhật Bản","Indonesia","Malaysia","Phương tây","Phương đông","Ấn �?ộ","Tất cả các đáp án"},
					{"Chile","Cube","Italia","Brazil","Nhà H�? Lý","Nhà Hồ","Nhà Trần","Nhà Nguyễn"},
					{"Nguyễn Thi","Nguyễn Du","Tế Hanh","Quang Dũng","Mỹ","Việt Nam","Nga","Nhật Bản"},
					{"EMU","EMS","FIFA","ECU","10","100","1000","10000"},
					{"Nguyễn Hi�?n","Nguyễn Kì","Lê Văn Thịnh","Vũ Tuấn Chiêu","Hoa sen","Chân Dung Hồ Chí Minh","Khuê Văn Các","Cảng Hải Phòng"}
						};
	Button bSubmit,bEscape,radA1,radA2,radA3,radA4;
	TextView txtDiem,txtQuestion,txtNamePlayer,txtTg,txtRQ;
	CountDownTimer demtg;
	RadioGroup g;
	int diem = 0;

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playgame);
        Intent callerIntent=getIntent();
        Bundle packageFromCaller=callerIntent.getBundleExtra("MyPackage");
        String Name = packageFromCaller.getString("pName");
    	bSubmit = (Button) findViewById(R.id.btnSubmit);
    	bEscape = (Button) findViewById(R.id.btnEscape);
    	radA1 = (Button) findViewById(R.id.radA1);
    	radA2 = (Button) findViewById(R.id.radA2);
    	radA3 = (Button) findViewById(R.id.radA3);
    	radA4 = (Button) findViewById(R.id.radA4);
    	txtDiem = (TextView) findViewById(R.id.textView1);
    	txtTg = (TextView) findViewById(R.id.textView2);
    	txtRQ = (TextView) findViewById(R.id.textView3);
    	txtQuestion = (TextView) findViewById(R.id.txtS5);
    	txtNamePlayer = (TextView) findViewById(R.id.txtN5);
    	txtNamePlayer.setText(Name);
    	//x = randomQ();
    	thoigian();
    	showQuestion(diem);
        bSubmit.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				checkA(diem);
			}
		});
        bEscape.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				demtg.cancel();
				showWindialog();
			}
		});
	}
	public int randomQ(){
		int j=(int)(Math.random()*2);
		return j;
	}
	public void showQuestion(int i){
		txtQuestion.setText(cauHoi[i][0]+"");
		int a=1,b=2,c=3,d=4;
		a=1+(int)(Math.random()*4);
		b=1+(int)(Math.random()*4);
		while(b==a)
		{
			b=1+(int)(Math.random()*4);
		};
		c=1+(int)(Math.random()*4);
		while(c==b|c==a)
		{
			c=1+(int)(Math.random()*4);
		};
		d=10-(a+b+c);
		radA1.setText(dapAn[i][a-1]+"");
		radA2.setText(dapAn[i][b-1]+"");
		radA3.setText(dapAn[i][c-1]+"");
		radA4.setText(dapAn[i][d-1]+"");
	}
	public void showWindialog(){
		AlertDialog.Builder b=new AlertDialog.Builder(choigame.this);
		b.setTitle("Thắng cuộc");
		
		b.setMessage("�?iểm của bạn: "+diem);
		b.setPositiveButton("Chơi lại", new DialogInterface. OnClickListener() {
		@Override
		public void onClick(DialogInterface dialog, int which)
		{
		diem=0;
		thoigian();
		txtDiem.setText("�?iểm của bạn: "+diem);
		showQuestion(diem);
		resetCheck();
		}});
		b.setNegativeButton("Thoát", new DialogInterface.OnClickListener() {

			@Override

			public void onClick(DialogInterface dialog, int which)

			{

				finish();

			}

			});
		b.create().show();
		
		
	}
	public void thoigian() {
		demtg = new CountDownTimer(30000, 1000) {

			@Override
			public void onTick(long millisUntilFinished) {
				txtTg.setText(millisUntilFinished / 1000+" giây");
			}

			@Override
			public void onFinish() {
				showTimeOutDialog();
			}
		};
		demtg.start();
	}
	public void showTimeOutDialog(){
		AlertDialog.Builder b=new AlertDialog.Builder(choigame.this);
		b.setTitle("Thua cuộc");
		
		b.setMessage("�?iểm của bạn: "+diem);
		b.setPositiveButton("Chơi lại", new DialogInterface. OnClickListener() {
		@Override
		public void onClick(DialogInterface dialog, int which)
		{
		diem=0;
		demtg.cancel();
		demtg =null;
		thoigian();
		txtDiem.setText("�?iểm của bạn: "+diem);
		showQuestion(diem);
		resetCheck();
		}});
		b.setNegativeButton("Thoát", new DialogInterface.OnClickListener() {

			@Override

			public void onClick(DialogInterface dialog, int which)

			{
				finish();

			}

			});
		b.create().show();
		
		
	}
	public void resetCheck(){
		g = (RadioGroup) findViewById(R.id.radioGroup1); 
		g.clearCheck();
	}
	public void checkA(int i){
		demtg.cancel();
		g = (RadioGroup) findViewById(R.id.radioGroup1);
		int idChecked = g.getCheckedRadioButtonId();
		
		if(idChecked==-1){
			Toast.makeText(this,"Bạn chưa ch�?n đáp án", Toast.LENGTH_LONG).show();
			return;
		}
		RadioButton rad=(RadioButton) findViewById(idChecked);
		String a = "";
		a=rad.getText().toString();
		
			if(a.equals(dapAnDung[i][0])){
				diem = diem + 1;
				if(diem==10){
					showWindialog();
				}
				else{
				txtDiem.setText("�?iểm của bạn : "+diem);
				demtg =null;
				thoigian();
				resetCheck();
				showQuestion(diem);
				}
			}
			else{
				AlertDialog.Builder b=new AlertDialog.Builder(choigame.this);
				b.setTitle("Thua cuộc");
				b.setMessage("�?iểm của bạn: "+diem);
				b.setPositiveButton("Chơi lại", new DialogInterface. OnClickListener() {
				@Override
				public void onClick(DialogInterface dialog, int which)
				{
				
				diem=0;
				//demtg.cancel();
				demtg =null;
				thoigian();
				txtDiem.setText("0");
				showQuestion(diem);
				resetCheck();
				
				}});
//				b.setNeutralButton("Lưu điểm", new DialogInterface.OnClickListener() {
//
//				@Override
//
//				public void onClick(DialogInterface dialog, int which)
//
//				{
//					Intent myIntent=new Intent(choigame.this,diemcao.class);
//					Bundle bundle=new Bundle();
//					String b = txtNamePlayer.getText().toString();
//					int a = Integer.parseInt(txtDiem.getText().toString());
//					bundle.putInt("pScore", a);
//					bundle.putString("pName", b);
//					myIntent.putExtra("MyPackage",bundle);
//			    	startActivity(myIntent);
//				}
//
//				});
				
				b.setNegativeButton("Thoát", new DialogInterface.OnClickListener() {

					@Override

					public void onClick(DialogInterface dialog, int which)

					{

						finish();

					}

					});
				

				b.create().show();
			}
		
		
	}
}
