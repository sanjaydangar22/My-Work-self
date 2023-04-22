package com.example.web2app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String url = "https://www.youtube.com/@sd.knowledge_world2595";
        webView = findViewById(R.id.webview);

        webView.loadUrl(url);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setBuiltInZoomControls(true);
    }
    @Override
    public  void onBackPressed(){
        if(webView.canGoBack()){
            webView.canGoBack();
        }
        else {
            super.onBackPressed();
        }
    }

}