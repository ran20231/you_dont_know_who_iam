package com.forsale.app.features.categories.listingdetails.buyerscreen.media;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import g00.l;
import g00.p;
import j0.d1;
import j0.v0;
import kotlin.jvm.internal.o;
/* compiled from: VirtualTourContainer.kt */
/* loaded from: classes2.dex */
public final class VirtualTourContainerKt {

    /* compiled from: VirtualTourContainer.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.google.accompanist.web.b {
        a() {
        }

        @Override // com.google.accompanist.web.b, android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            x10.a.b("Details:: Page started loading for " + str, new Object[0]);
        }

        @Override // com.google.accompanist.web.b, android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            x10.a.b("Details:: onReceivedError " + webResourceError, new Object[0]);
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }

        @Override // com.google.accompanist.web.b, android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            String url;
            WebChromeClient webChromeClient;
            if (webView != null && (url = webView.getUrl()) != null) {
                x10.a.b("Details:: onReceivedError " + url, new Object[0]);
                webChromeClient = webView.getWebChromeClient();
                if (webChromeClient != null) {
                    webChromeClient.getVideoLoadingProgressView();
                }
                webView.loadUrl(url);
                return true;
            }
            return true;
        }
    }

    public static final void a(final androidx.compose.ui.c cVar, final String url, androidx.compose.runtime.a aVar, final int i11, final int i12) {
        int i13;
        int i14;
        int i15;
        o.i(url, "url");
        androidx.compose.runtime.a h11 = aVar.h(809334403);
        int i16 = i12 & 1;
        if (i16 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            if (h11.T(cVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i14 | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            if (h11.T(url)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i13 |= i15;
        }
        if ((i13 & 91) == 18 && h11.i()) {
            h11.L();
        } else {
            if (i16 != 0) {
                cVar = androidx.compose.ui.c.f7566a;
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(809334403, i13, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.media.PDFWebView (VirtualTourContainer.kt:92)");
            }
            h11.C(1157296644);
            boolean T = h11.T(url);
            Object D = h11.D();
            if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                D = new l<Context, WebView>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.media.VirtualTourContainerKt$PDFWebView$1$1

                    /* compiled from: VirtualTourContainer.kt */
                    /* loaded from: classes2.dex */
                    public static final class a extends WebViewClient {

                        /* renamed from: a  reason: collision with root package name */
                        private boolean f26244a;

                        a() {
                        }

                        @Override // android.webkit.WebViewClient
                        public void onPageFinished(WebView webView, String str) {
                            x10.a.b("Details:: PDF onPageFinished loading for " + str, new Object[0]);
                            super.onPageFinished(webView, str);
                            if (!this.f26244a && webView != null) {
                                o.f(str);
                                webView.loadUrl(str);
                            }
                        }

                        @Override // android.webkit.WebViewClient
                        public void onPageStarted(WebView view, String str, Bitmap bitmap) {
                            o.i(view, "view");
                            x10.a.b("Details:: PDF onPageStarted loading for " + str, new Object[0]);
                            this.f26244a = true;
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // g00.l
                    /* renamed from: b */
                    public final WebView invoke(Context context) {
                        o.i(context, "context");
                        WebView webView = new WebView(context);
                        String str = url;
                        webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        webView.setWebViewClient(new a());
                        webView.getSettings().setJavaScriptEnabled(true);
                        webView.setLayerType(1, null);
                        webView.getSettings().setAllowFileAccess(true);
                        webView.getSettings().setBuiltInZoomControls(true);
                        webView.getSettings().setSupportZoom(true);
                        webView.getSettings().setDisplayZoomControls(false);
                        webView.getSettings().setLoadWithOverviewMode(true);
                        webView.getSettings().setUseWideViewPort(true);
                        webView.loadUrl(str);
                        return webView;
                    }
                };
                h11.u(D);
            }
            h11.S();
            AndroidView_androidKt.a((l) D, cVar, null, h11, (i13 << 3) & 112, 4);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.media.VirtualTourContainerKt$PDFWebView$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i17) {
                    VirtualTourContainerKt.a(androidx.compose.ui.c.this, url, aVar2, v0.a(i11 | 1), i12);
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final java.lang.String r18, boolean r19, final androidx.compose.ui.c r20, androidx.compose.runtime.a r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.media.VirtualTourContainerKt.b(java.lang.String, boolean, androidx.compose.ui.c, androidx.compose.runtime.a, int, int):void");
    }

    public static final com.google.accompanist.web.b c(androidx.compose.runtime.a aVar, int i11) {
        aVar.C(399855500);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(399855500, i11, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.media.virtualTourWebClient (VirtualTourContainer.kt:50)");
        }
        aVar.C(-492369756);
        Object D = aVar.D();
        if (D == androidx.compose.runtime.a.f7182a.a()) {
            D = new a();
            aVar.u(D);
        }
        aVar.S();
        a aVar2 = (a) D;
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        aVar.S();
        return aVar2;
    }
}
