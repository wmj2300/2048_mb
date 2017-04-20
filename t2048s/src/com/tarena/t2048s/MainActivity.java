package com.tarena.t2048s;

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

		//ʵ����webview���
		WebView wv = new WebView(getApplicationContext());
		
		//js
		wv.getSettings().setJavaScriptEnabled(true);
		
		//����url
		wv.loadUrl("http://1.2048test.applinzi.com/");
		
		//��eclipse���ṩ��logcatȥ�鿴ǰ��console����Ϣ������:
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
