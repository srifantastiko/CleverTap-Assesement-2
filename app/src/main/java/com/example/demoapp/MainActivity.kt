package com.example.demoapp


import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_main)
        val webView = findViewById<WebView>(R.id.webView)

        // Enable JavaScript
        webView.getSettings().setJavaScriptEnabled(true);

        // Set WebView client to handle redirects and load URLs
        webView.setWebViewClient(WebViewClient());

        // Set WebChromeClient for handling JavaScript alerts
        webView.setWebChromeClient( WebChromeClient());

        // Load the HTML file from the assets folder
        webView.loadUrl("file:///android_asset/index.html");


    }
}

