package com.forsale.adserver.adviews.baseViews.webView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.forsale.adserver.adviews.baseViews.g;
import java.util.Calendar;
import kotlin.jvm.internal.o;
import p8.a;
import p8.b;
/* compiled from: MyWebView.kt */
/* loaded from: classes2.dex */
public final class MyWebView extends FrameLayout implements g {

    /* renamed from: a */
    private WebView f20598a;

    /* renamed from: b */
    private long f20599b;

    /* renamed from: c */
    private final long f20600c;

    /* renamed from: d */
    private ViewTreeObserver.OnScrollChangedListener f20601d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyWebView(Context context) {
        super(context);
        o.i(context, "context");
        this.f20600c = 500L;
        c();
    }

    @SuppressLint({"SetJavaScriptEnabled", "ClickableViewAccessibility"})
    private final void c() {
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        WebView webView = new WebView(getContext());
        this.f20598a = webView;
        webView.setClickable(false);
        WebView webView2 = this.f20598a;
        if (webView2 != null) {
            webView2.setOnTouchListener(new a(this));
        }
        webView.setWebViewClient(new b());
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setCacheMode(2);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        addView(this.f20598a);
    }

    public static final boolean d(MyWebView this$0, View view, MotionEvent motionEvent) {
        o.i(this$0, "this$0");
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 && Calendar.getInstance().getTimeInMillis() - this$0.f20599b < this$0.f20600c) {
                super.performClick();
            }
        } else {
            this$0.f20599b = Calendar.getInstance().getTimeInMillis();
        }
        return true;
    }

    @Override // com.forsale.adserver.adviews.baseViews.g
    public void a(ViewTreeObserver.OnScrollChangedListener onScroll) {
        o.i(onScroll, "onScroll");
        this.f20601d = onScroll;
    }

    public final void e(String url) {
        o.i(url, "url");
        WebView webView = this.f20598a;
        o.f(webView);
        webView.loadUrl(url);
    }

    public final ViewTreeObserver.OnScrollChangedListener getOnScrollListener() {
        return this.f20601d;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = this.f20601d;
        if (onScrollChangedListener != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(onScrollChangedListener);
            sb2.append(" is removed");
            getViewTreeObserver().removeOnScrollChangedListener(onScrollChangedListener);
        }
        super.onDetachedFromWindow();
    }

    public final void setOnScrollListener(ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.f20601d = onScrollChangedListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyWebView(Context context, AttributeSet attrs) {
        super(context, attrs);
        o.i(context, "context");
        o.i(attrs, "attrs");
        this.f20600c = 500L;
        c();
    }
}
