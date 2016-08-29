package com.hfad.joke.webview;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class WebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        WebView webView = (WebView) findViewById(R.id.webview);
        Uri uri = Uri.parse("http://www.example.com");
        Intent i = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(i);
// or way can set javascript setting demo example
// webview=(WebView)findViewById(R.id.webview1);
        //     webview.getSettings().setJavaScriptEnabled(true);
//        String customHtml ="http://10.42.0.245/jwellery2/";
//        webview.loadData(customHtml, "text/html", "UTF-8");

        //   webview.loadUrl("http://10.42.0.245/jwellery2/");

    }
}
