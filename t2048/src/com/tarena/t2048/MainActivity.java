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
		//ʵ����һ��webview���� wv
		WebView wv = new WebView(getApplicationContext());
		
		//����wv		
		wv.getSettings().setJavaScriptEnabled(true);
		
		//����ָ������ҳ
		wv.loadUrl("file:///android_asset/2048.html");
		
		//���ô�ӡ����̨��־��Ϣ
		wv.setWebChromeClient(new WebChromeClient(){
			@Override
			public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
				// TODO Auto-generated method stub
				return super.onConsoleMessage(consoleMessage);
			}
		});
		
		
		//��wv����ΪappҪ��ʾ��������ͼ
		setContentView(wv);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
