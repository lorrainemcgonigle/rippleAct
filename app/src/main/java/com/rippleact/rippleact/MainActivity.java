package com.rippleact.rippleact;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webview = (WebView)findViewById(R.id.webView);

        webview.setWebViewClient(new WebViewClient());
        webview.getSettings().setJavaScriptEnabled(true);
        //can be set to false if we want to prevent local storage from being used.
        webview.getSettings().setDomStorageEnabled(true);
        //webview.setOverScrollMode(WebView.OVER_SCROLL_NEVER);
        webview.loadUrl("https://www.rippleact.com");
    }

    @Override
    public void onBackPressed (){

        if (webview.isFocused() && webview.canGoBack()) {
            webview.goBack();

        }else{
            super.onBackPressed();
        }

    }
}
