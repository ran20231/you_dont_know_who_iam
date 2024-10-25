package com.forsale.adserver.view.screens.webViewScreen;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.d;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.g;
import kotlin.jvm.internal.o;
import l8.h;
import m9.f;
import q9.b;
import t8.e;
/* compiled from: BrowserActivity.kt */
/* loaded from: classes2.dex */
public final class BrowserActivity extends d {

    /* renamed from: a */
    public e f21601a;

    /* compiled from: BrowserActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a extends WebViewClient {

        /* renamed from: b */
        final /* synthetic */ WebView f21603b;

        a(WebView webView) {
            BrowserActivity.this = r1;
            this.f21603b = webView;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            String string;
            super.onPageFinished(webView, str);
            TextView textView = BrowserActivity.this.o0().Q;
            if (webView == null || (string = webView.getTitle()) == null) {
                string = this.f21603b.getResources().getString(h.f62338g);
            }
            textView.setText(string);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            BrowserActivity.this.o0().Q.setText(h.f62344m);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView view, int i11, String description, String failingUrl) {
            o.i(view, "view");
            o.i(description, "description");
            o.i(failingUrl, "failingUrl");
            Toast.makeText(BrowserActivity.this, description, 0).show();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView view, WebResourceRequest req, WebResourceError rerr) {
            o.i(view, "view");
            o.i(req, "req");
            o.i(rerr, "rerr");
            int errorCode = rerr.getErrorCode();
            String obj = rerr.getDescription().toString();
            String uri = req.getUrl().toString();
            o.h(uri, "toString(...)");
            onReceivedError(view, errorCode, obj, uri);
        }
    }

    public static final void p0(BrowserActivity this$0, View view) {
        o.i(this$0, "this$0");
        this$0.finish();
    }

    public static final void q0(String str, BrowserActivity this$0, View view) {
        o.i(this$0, "this$0");
        if (str != null) {
            f.k(this$0, str);
        }
    }

    public final e o0() {
        e eVar = this.f21601a;
        if (eVar != null) {
            return eVar;
        }
        o.w("binding");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, androidx.core.app.l, android.app.Activity
    @SuppressLint({"SetJavaScriptEnabled"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding j11 = g.j(this, l8.g.f62315c);
        o.h(j11, "setContentView(...)");
        r0((e) j11);
        String stringExtra = getIntent().getStringExtra("TARGET_URL");
        setSupportActionBar(o0().P);
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.w(4.0f);
        }
        WebView webView = o0().S;
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new a(webView));
        if (stringExtra != null) {
            webView.loadUrl(stringExtra);
        }
        o0().O.setOnClickListener(new q9.a(this));
        o0().R.setOnClickListener(new b(stringExtra, this));
    }

    public final void r0(e eVar) {
        o.i(eVar, "<set-?>");
        this.f21601a = eVar;
    }
}
