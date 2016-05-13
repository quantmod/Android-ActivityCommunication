package cn.itcast.activitys;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class OtherActivity extends Activity {



	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.other);
		
		TextView textView = (TextView) this.findViewById(R.id.textView);
		
		Intent intent = getIntent();//获取用于激活它的意图对象
	/*	String company = intent.getStringExtra("company");
		int age = intent.getIntExtra("age", 0);
	*/
		Bundle bundle = intent.getExtras();
		String company = bundle.getString("company");
		int age = bundle.getInt("age");
		
		textView.setText("公司名称："+ company+ ",年限："+ age);
	}

	public void closeActivity(View v){
		Intent intent = new Intent();
		intent.putExtra("result", "老方与丽丽的故事，后面省略2000字");
		setResult(20, intent);//设置返回数据
		finish();//关闭Activity(关闭窗口)
	}
	
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.d("otherActivity", "onDestroy执行了");
		
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.d("otherActivity", "onPause执行了");
		
	}

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		Log.d("otherActivity", "onRestart执行了");
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.d("otherActivity", "onResume执行了");	
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Log.d("otherActivity", "onStart执行了");	
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.d("otherActivity", "onStop执行了");	
	}
}
