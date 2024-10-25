package com.forsale.app.features.webBrowser;

import android.webkit.WebView;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* compiled from: WebView.kt */
@d(c = "com.forsale.app.features.webBrowser.WebViewKt$ForSaleWebView$6", f = "WebView.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class WebViewKt$ForSaleWebView$6 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f37056a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ WebView f37057b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f37058c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewKt$ForSaleWebView$6(WebView webView, String str, a<? super WebViewKt$ForSaleWebView$6> aVar) {
        super(2, aVar);
        this.f37057b = webView;
        this.f37058c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new WebViewKt$ForSaleWebView$6(this.f37057b, this.f37058c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b.f();
        if (this.f37056a == 0) {
            f.b(obj);
            this.f37057b.loadUrl(this.f37058c);
            return wz.p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((WebViewKt$ForSaleWebView$6) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
