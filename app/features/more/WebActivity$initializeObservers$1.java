package com.forsale.app.features.more;

import android.webkit.WebSettings;
import android.webkit.WebView;
import com.forsale.app.utils.ViewsExtensionsKt;
import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WebActivity.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.WebActivity$initializeObservers$1", f = "WebActivity.kt", l = {61}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class WebActivity$initializeObservers$1 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f31602a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ WebActivity f31603b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WebActivity.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.WebActivity$initializeObservers$1$1", f = "WebActivity.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.more.WebActivity$initializeObservers$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<WebModel, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f31604a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f31605b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ WebActivity f31606c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(WebActivity webActivity, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f31606c = webActivity;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(WebModel webModel, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(webModel, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f31606c, aVar);
            anonymousClass1.f31605b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean booleanValue;
            kotlin.coroutines.intrinsics.b.f();
            if (this.f31604a == 0) {
                f.b(obj);
                WebModel webModel = (WebModel) this.f31605b;
                WebSettings settings = WebActivity.O0(this.f31606c).S.getSettings();
                WebActivity webActivity = this.f31606c;
                Boolean j11 = webActivity.x0().I0().j();
                if (j11 == null) {
                    booleanValue = false;
                } else {
                    o.f(j11);
                    booleanValue = j11.booleanValue();
                }
                settings.setJavaScriptEnabled(booleanValue);
                Boolean j12 = webActivity.x0().J0().j();
                if (j12 == null) {
                    j12 = kotlin.coroutines.jvm.internal.a.a(false);
                }
                o.f(j12);
                settings.setSupportZoom(j12.booleanValue());
                settings.setDomStorageEnabled(true);
                settings.setLoadWithOverviewMode(true);
                settings.setUseWideViewPort(true);
                if (webModel != null) {
                    WebView webView = WebActivity.O0(this.f31606c).S;
                    o.h(webView, "webView");
                    ViewsExtensionsKt.t(webView, webModel.a(), webModel.b(), this.f31606c.x0().v0(), webModel.c());
                    this.f31606c.x0().A0();
                }
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebActivity$initializeObservers$1(WebActivity webActivity, zz.a<? super WebActivity$initializeObservers$1> aVar) {
        super(1, aVar);
        this.f31603b = webActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new WebActivity$initializeObservers$1(this.f31603b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f31602a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            StateFlow<WebModel> K0 = this.f31603b.x0().K0();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f31603b, null);
            this.f31602a = 1;
            if (FlowKt.collectLatest(K0, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((WebActivity$initializeObservers$1) create(aVar)).invokeSuspend(p.f75480a);
    }
}
