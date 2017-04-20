package com.tarena.t2048;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//实例化一个webview对象 wv
		WebView wv = new WebView(getApplicationContext());
		
		//配置wv		
		wv.getSettings().setJavaScriptEnabled(true);
		
		//载入指定的网页
		wv.loadUrl("file:///android_asset/2048.html");
		
		//设置打印控制台日志信息
		wv.setWebChromeClient(new WebChromeClient(){
			@Override
			public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
				// TODO Auto-generated method stub
				return super.onConsoleMessage(consoleMessage);
			}
		});
		
		
		//将wv设置为app要显示的内容视图
		setContentView(wv);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
