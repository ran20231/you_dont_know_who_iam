package com.forsale.app.features.postad.plfWebView;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.webkit.WebSettings;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.app.BaseContextWrappingDelegate;
import androidx.appcompat.app.g;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.e;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c0;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import c0.f;
import com.forsale.app.datalayer.network.entities.PostListingIntention;
import com.forsale.app.features.more.WebActivity;
import com.forsale.app.features.more.WebType;
import com.forsale.app.features.more.support.SupportActivity;
import com.forsale.app.features.webBrowser.WebViewKt;
import com.forsale.app.features.webBrowser.jsCommunicationInterfaces.PLFCommunication;
import com.forsale.app.ui.dialogs.LoadingDialogKt;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.buttons.ButtonData;
import com.forsale.designSystem.theme.ThemeKt;
import com.google.android.gms.ads.AdRequest;
import dj.i;
import g00.l;
import g00.q;
import j0.d1;
import j0.e1;
import j0.k;
import j0.k0;
import j0.v0;
import java.io.Serializable;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import t9.y0;
import v0.b;
import w.u;
import wz.h;
import wz.p;
/* compiled from: PLFWebViewActivity.kt */
/* loaded from: classes2.dex */
public final class PLFWebViewActivity extends com.forsale.app.features.postad.plfWebView.a {

    /* renamed from: e  reason: collision with root package name */
    public gf.a f36398e;

    /* renamed from: f  reason: collision with root package name */
    private final h f36399f;

    /* renamed from: g  reason: collision with root package name */
    private final h f36400g;

    /* renamed from: h  reason: collision with root package name */
    private final h f36401h;

    /* renamed from: i  reason: collision with root package name */
    private final androidx.activity.result.b<Intent> f36402i;

    /* renamed from: j  reason: collision with root package name */
    private final h f36403j;

    /* compiled from: PLFWebViewActivity.kt */
    /* loaded from: classes2.dex */
    static final class a implements androidx.activity.result.a<ActivityResult> {
        a() {
        }

        @Override // androidx.activity.result.a
        /* renamed from: b */
        public final void a(ActivityResult activityResult) {
            PLFWebViewActivity.this.I0().c();
        }
    }

    public PLFWebViewActivity() {
        h a11;
        h a12;
        h a13;
        h a14;
        a11 = kotlin.d.a(new g00.a<BaseContextWrappingDelegate>() { // from class: com.forsale.app.features.postad.plfWebView.PLFWebViewActivity$baseContextWrappingDelegate$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final BaseContextWrappingDelegate invoke() {
                g delegate;
                delegate = super/*androidx.appcompat.app.d*/.getDelegate();
                o.h(delegate, "access$getDelegate$s-847601390(...)");
                return new BaseContextWrappingDelegate(delegate);
            }
        });
        this.f36399f = a11;
        a12 = kotlin.d.a(new g00.a<String>() { // from class: com.forsale.app.features.postad.plfWebView.PLFWebViewActivity$plfUrl$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            public final String invoke() {
                return PLFWebViewActivity.this.getIntent().getStringExtra("PLF_WEB_VIEW_URL");
            }
        });
        this.f36400g = a12;
        a13 = kotlin.d.a(new g00.a<PostListingIntention>() { // from class: com.forsale.app.features.postad.plfWebView.PLFWebViewActivity$intention$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final PostListingIntention invoke() {
                PostListingIntention postListingIntention;
                Serializable serializableExtra;
                if (Build.VERSION.SDK_INT >= 33) {
                    serializableExtra = PLFWebViewActivity.this.getIntent().getSerializableExtra("intention_key", PostListingIntention.class);
                    postListingIntention = (PostListingIntention) serializableExtra;
                } else {
                    Serializable serializableExtra2 = PLFWebViewActivity.this.getIntent().getSerializableExtra("intention_key");
                    if (serializableExtra2 instanceof PostListingIntention) {
                        postListingIntention = (PostListingIntention) serializableExtra2;
                    } else {
                        postListingIntention = null;
                    }
                }
                if (postListingIntention == null) {
                    return PostListingIntention.FULL_EDIT;
                }
                return postListingIntention;
            }
        });
        this.f36401h = a13;
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new e.d(), new a());
        o.h(registerForActivityResult, "registerForActivityResult(...)");
        this.f36402i = registerForActivityResult;
        a14 = kotlin.d.a(new g00.a<PLFCommunication>() { // from class: com.forsale.app.features.postad.plfWebView.PLFWebViewActivity$plfWithWebViewCommunication$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final PLFCommunication invoke() {
                final PLFWebViewActivity pLFWebViewActivity = PLFWebViewActivity.this;
                l<PLFCommunication.PLFResultAction, p> lVar = new l<PLFCommunication.PLFResultAction, p>() { // from class: com.forsale.app.features.postad.plfWebView.PLFWebViewActivity$plfWithWebViewCommunication$2.1

                    /* compiled from: PLFWebViewActivity.kt */
                    /* renamed from: com.forsale.app.features.postad.plfWebView.PLFWebViewActivity$plfWithWebViewCommunication$2$1$a */
                    /* loaded from: classes2.dex */
                    public /* synthetic */ class a {

                        /* renamed from: a  reason: collision with root package name */
                        public static final /* synthetic */ int[] f36443a;

                        static {
                            int[] iArr = new int[PLFCommunication.PLFResultAction.values().length];
                            try {
                                iArr[PLFCommunication.PLFResultAction.NONE.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[PLFCommunication.PLFResultAction.REFRESH.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            f36443a = iArr;
                        }
                    }

                    {
                        super(1);
                    }

                    public final void b(PLFCommunication.PLFResultAction it2) {
                        PostListingIntention G0;
                        o.i(it2, "it");
                        if (a.f36443a[it2.ordinal()] == 2) {
                            PLFWebViewActivity pLFWebViewActivity2 = PLFWebViewActivity.this;
                            Intent intent = new Intent();
                            G0 = PLFWebViewActivity.this.G0();
                            intent.putExtra("intention_key", G0);
                            intent.putExtra("IS_SUCCESS", true);
                            p pVar = p.f75480a;
                            pLFWebViewActivity2.setResult(-1, intent);
                        }
                        PLFWebViewActivity.this.finish();
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ p invoke(PLFCommunication.PLFResultAction pLFResultAction) {
                        b(pLFResultAction);
                        return p.f75480a;
                    }
                };
                final PLFWebViewActivity pLFWebViewActivity2 = PLFWebViewActivity.this;
                g00.a<p> aVar = new g00.a<p>() { // from class: com.forsale.app.features.postad.plfWebView.PLFWebViewActivity$plfWithWebViewCommunication$2.2
                    {
                        super(0);
                    }

                    @Override // g00.a
                    public /* bridge */ /* synthetic */ p invoke() {
                        invoke2();
                        return p.f75480a;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        SupportActivity.f32788x.a(PLFWebViewActivity.this);
                    }
                };
                final PLFWebViewActivity pLFWebViewActivity3 = PLFWebViewActivity.this;
                g00.a<p> aVar2 = new g00.a<p>() { // from class: com.forsale.app.features.postad.plfWebView.PLFWebViewActivity$plfWithWebViewCommunication$2.3
                    {
                        super(0);
                    }

                    @Override // g00.a
                    public /* bridge */ /* synthetic */ p invoke() {
                        invoke2();
                        return p.f75480a;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        PLFWebViewActivity pLFWebViewActivity4 = PLFWebViewActivity.this;
                        Intent intent = new Intent();
                        intent.putExtra("navigatingDeepLink", PLFWebViewActivity.this.getString(y0.B5));
                        p pVar = p.f75480a;
                        pLFWebViewActivity4.setResult(-1, intent);
                        PLFWebViewActivity.this.finish();
                    }
                };
                final PLFWebViewActivity pLFWebViewActivity4 = PLFWebViewActivity.this;
                return new PLFCommunication(lVar, aVar, aVar2, new l<String, p>() { // from class: com.forsale.app.features.postad.plfWebView.PLFWebViewActivity$plfWithWebViewCommunication$2.4
                    {
                        super(1);
                    }

                    public final void b(String paymentUrl) {
                        androidx.activity.result.b bVar;
                        o.i(paymentUrl, "paymentUrl");
                        bVar = PLFWebViewActivity.this.f36402i;
                        WebActivity.a aVar3 = WebActivity.I;
                        PLFWebViewActivity pLFWebViewActivity5 = PLFWebViewActivity.this;
                        WebType webType = WebType.PAYMENT;
                        String string = pLFWebViewActivity5.getString(y0.Sa);
                        o.h(string, "getString(...)");
                        bVar.a(WebActivity.a.b(aVar3, pLFWebViewActivity5, webType, string, paymentUrl, 1, null, 32, null));
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ p invoke(String str) {
                        b(str);
                        return p.f75480a;
                    }
                });
            }
        });
        this.f36403j = a14;
    }

    private final g E0() {
        return (g) this.f36399f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PostListingIntention G0() {
        return (PostListingIntention) this.f36401h.getValue();
    }

    private final String H0() {
        return (String) this.f36400g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PLFCommunication I0() {
        return (PLFCommunication) this.f36403j.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean t0(k0<Boolean> k0Var) {
        return k0Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u0(k0<Boolean> k0Var, boolean z11) {
        k0Var.setValue(Boolean.valueOf(z11));
    }

    private static final boolean v0(k0<Boolean> k0Var) {
        return k0Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w0(k0<Boolean> k0Var, boolean z11) {
        k0Var.setValue(Boolean.valueOf(z11));
    }

    public final gf.a J0() {
        gf.a aVar = this.f36398e;
        if (aVar != null) {
            return aVar;
        }
        o.w("updateAmplitudeWebViewCookieInteractor");
        return null;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Context createConfigurationContext(Configuration overrideConfiguration) {
        Object runBlocking$default;
        o.i(overrideConfiguration, "overrideConfiguration");
        Context createConfigurationContext = super.createConfigurationContext(overrideConfiguration);
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new PLFWebViewActivity$createConfigurationContext$1(createConfigurationContext, null), 1, null);
        super.attachBaseContext((Context) runBlocking$default);
        o.f(createConfigurationContext);
        return createConfigurationContext;
    }

    @Override // androidx.appcompat.app.d
    public g getDelegate() {
        return E0();
    }

    @Override // com.forsale.app.features.postad.plfWebView.a, androidx.fragment.app.p, androidx.activity.ComponentActivity, androidx.core.app.l, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        gf.a.b(J0(), false, 1, null);
        c.b.b(this, null, r0.b.c(-982853823, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.postad.plfWebView.PLFWebViewActivity$onCreate$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            public final void b(androidx.compose.runtime.a aVar, int i11) {
                if ((i11 & 11) == 2 && aVar.i()) {
                    aVar.L();
                    return;
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(-982853823, i11, -1, "com.forsale.app.features.postad.plfWebView.PLFWebViewActivity.onCreate.<anonymous> (PLFWebViewActivity.kt:131)");
                }
                final PLFWebViewActivity pLFWebViewActivity = PLFWebViewActivity.this;
                ThemeKt.a(null, null, r0.b.b(aVar, 721692568, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.postad.plfWebView.PLFWebViewActivity$onCreate$1.1
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i12) {
                        if ((i12 & 11) == 2 && aVar2.i()) {
                            aVar2.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(721692568, i12, -1, "com.forsale.app.features.postad.plfWebView.PLFWebViewActivity.onCreate.<anonymous>.<anonymous> (PLFWebViewActivity.kt:132)");
                        }
                        PLFWebViewActivity.this.s0(null, aVar2, 64, 1);
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                        b(aVar2, num.intValue());
                        return p.f75480a;
                    }
                }), aVar, 384, 3);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar, Integer num) {
                b(aVar, num.intValue());
                return p.f75480a;
            }
        }), 1, null);
    }

    @Override // com.forsale.app.features.postad.plfWebView.a, androidx.appcompat.app.d, androidx.fragment.app.p, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        p pVar = p.f75480a;
        J0().a(true);
    }

    public final void r0(final g00.a<p> onLeaveClicked, final g00.a<p> onStayClicked, final g00.a<p> onDismiss, androidx.compose.runtime.a aVar, final int i11) {
        final int i12;
        int i13;
        int i14;
        int i15;
        o.i(onLeaveClicked, "onLeaveClicked");
        o.i(onStayClicked, "onStayClicked");
        o.i(onDismiss, "onDismiss");
        androidx.compose.runtime.a h11 = aVar.h(642057545);
        if ((i11 & 14) == 0) {
            if (h11.F(onLeaveClicked)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.F(onStayClicked)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 896) == 0) {
            if (h11.F(onDismiss)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 731) == 146 && h11.i()) {
            h11.L();
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(642057545, i12, -1, "com.forsale.app.features.postad.plfWebView.PLFWebViewActivity.ExitPLFDialog (PLFWebViewActivity.kt:195)");
            }
            androidx.compose.ui.window.a aVar2 = new androidx.compose.ui.window.a(false, false, null, false, false, 23, null);
            h11.C(1157296644);
            boolean T = h11.T(onDismiss);
            Object D = h11.D();
            if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                D = new g00.a<p>() { // from class: com.forsale.app.features.postad.plfWebView.PLFWebViewActivity$ExitPLFDialog$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // g00.a
                    public /* bridge */ /* synthetic */ p invoke() {
                        invoke2();
                        return p.f75480a;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        onDismiss.invoke();
                    }
                };
                h11.u(D);
            }
            h11.S();
            AndroidDialog_androidKt.a((g00.a) D, aVar2, r0.b.b(h11, -862323424, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.postad.plfWebView.PLFWebViewActivity$ExitPLFDialog$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar3, int i16) {
                    if ((i16 & 11) == 2 && aVar3.i()) {
                        aVar3.L();
                        return;
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(-862323424, i16, -1, "com.forsale.app.features.postad.plfWebView.PLFWebViewActivity.ExitPLFDialog.<anonymous> (PLFWebViewActivity.kt:199)");
                    }
                    androidx.compose.ui.c k11 = PaddingKt.k(SizeKt.h(androidx.compose.ui.c.f7566a, 0.0f, 1, null), e2.h.l(32), 0.0f, 2, null);
                    f c11 = c0.g.c(e2.h.l(8));
                    final g00.a<p> aVar4 = onStayClicked;
                    final g00.a<p> aVar5 = onDismiss;
                    final int i17 = i12;
                    final g00.a<p> aVar6 = onLeaveClicked;
                    e.a(k11, c11, 0L, 0L, null, 0.0f, r0.b.b(aVar3, 1053690435, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.postad.plfWebView.PLFWebViewActivity$ExitPLFDialog$2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r42v0, types: [androidx.compose.runtime.a, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r6v10 */
                        /* JADX WARN: Type inference failed for: r7v16 */
                        public final void b(androidx.compose.runtime.a aVar7, int i18) {
                            if ((i18 & 11) == 2 && aVar7.i()) {
                                aVar7.L();
                                return;
                            }
                            if (androidx.compose.runtime.c.I()) {
                                androidx.compose.runtime.c.U(1053690435, i18, -1, "com.forsale.app.features.postad.plfWebView.PLFWebViewActivity.ExitPLFDialog.<anonymous>.<anonymous> (PLFWebViewActivity.kt:205)");
                            }
                            final g00.a<p> aVar8 = aVar4;
                            final g00.a<p> aVar9 = aVar5;
                            final g00.a<p> aVar10 = aVar6;
                            aVar7.C(-483455358);
                            c.a aVar11 = androidx.compose.ui.c.f7566a;
                            Arrangement arrangement = Arrangement.f3698a;
                            Arrangement.m h12 = arrangement.h();
                            b.a aVar12 = v0.b.f74009a;
                            a0 a11 = androidx.compose.foundation.layout.e.a(h12, aVar12.k(), aVar7, 0);
                            aVar7.C(-1323940314);
                            int a12 = j0.e.a(aVar7, 0);
                            k s11 = aVar7.s();
                            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                            g00.a<ComposeUiNode> a13 = companion.a();
                            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c12 = LayoutKt.c(aVar11);
                            if (!(aVar7.k() instanceof j0.d)) {
                                j0.e.c();
                            }
                            aVar7.I();
                            if (aVar7.f()) {
                                aVar7.y(a13);
                            } else {
                                aVar7.t();
                            }
                            androidx.compose.runtime.a a14 = Updater.a(aVar7);
                            Updater.c(a14, a11, companion.e());
                            Updater.c(a14, s11, companion.g());
                            g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
                            if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                                a14.u(Integer.valueOf(a12));
                                a14.p(Integer.valueOf(a12), b11);
                            }
                            c12.invoke(e1.a(e1.b(aVar7)), aVar7, 0);
                            aVar7.C(2058660585);
                            w.f fVar = w.f.f74891a;
                            androidx.compose.ui.c i19 = PaddingKt.i(aVar11, e2.h.l(16));
                            float f11 = 8;
                            Arrangement.f o11 = arrangement.o(e2.h.l(f11));
                            aVar7.C(-483455358);
                            a0 a15 = androidx.compose.foundation.layout.e.a(o11, aVar12.k(), aVar7, 6);
                            aVar7.C(-1323940314);
                            int a16 = j0.e.a(aVar7, 0);
                            k s12 = aVar7.s();
                            g00.a<ComposeUiNode> a17 = companion.a();
                            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c13 = LayoutKt.c(i19);
                            if (!(aVar7.k() instanceof j0.d)) {
                                j0.e.c();
                            }
                            aVar7.I();
                            if (aVar7.f()) {
                                aVar7.y(a17);
                            } else {
                                aVar7.t();
                            }
                            androidx.compose.runtime.a a18 = Updater.a(aVar7);
                            Updater.c(a18, a15, companion.e());
                            Updater.c(a18, s12, companion.g());
                            g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
                            if (a18.f() || !o.d(a18.D(), Integer.valueOf(a16))) {
                                a18.u(Integer.valueOf(a16));
                                a18.p(Integer.valueOf(a16), b12);
                            }
                            c13.invoke(e1.a(e1.b(aVar7)), aVar7, 0);
                            aVar7.C(2058660585);
                            androidx.compose.ui.c a19 = TestTagKt.a(aVar11, "lblExitDialogTitle");
                            String b13 = p1.g.b(y0.Hb, aVar7, 0);
                            dk.a aVar13 = dk.a.f54291a;
                            int i21 = dk.a.f54292b;
                            androidx.compose.ui.text.a0 l11 = aVar13.c(aVar7, i21).l();
                            yj.d e11 = aVar13.a(aVar7, i21).e();
                            int i22 = yj.d.f76453b;
                            TextKt.a(b13, a19, 0, 0, false, 0, 0, null, l11, e11.m(aVar7, i22), 0, aVar7, 48, 0, 1276);
                            TextKt.a(p1.g.b(y0.Eb, aVar7, 0), TestTagKt.a(aVar11, "lblExitDialogMessage"), 0, 0, false, 0, 0, null, aVar13.c(aVar7, i21).d(), aVar13.a(aVar7, i21).e().j(aVar7, i22), 0, aVar7, 48, 0, 1276);
                            aVar7.S();
                            aVar7.w();
                            aVar7.S();
                            aVar7.S();
                            androidx.compose.ui.c m11 = PaddingKt.m(SizeKt.h(aVar11, 0.0f, 1, null), e2.h.l(f11), 0.0f, e2.h.l(f11), e2.h.l(f11), 2, null);
                            Arrangement.e p11 = arrangement.p(e2.h.l(f11), aVar12.j());
                            aVar7.C(693286680);
                            a0 a21 = androidx.compose.foundation.layout.o.a(p11, aVar12.l(), aVar7, 6);
                            aVar7.C(-1323940314);
                            int a22 = j0.e.a(aVar7, 0);
                            k s13 = aVar7.s();
                            g00.a<ComposeUiNode> a23 = companion.a();
                            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c14 = LayoutKt.c(m11);
                            if (!(aVar7.k() instanceof j0.d)) {
                                j0.e.c();
                            }
                            aVar7.I();
                            if (aVar7.f()) {
                                aVar7.y(a23);
                            } else {
                                aVar7.t();
                            }
                            androidx.compose.runtime.a a24 = Updater.a(aVar7);
                            Updater.c(a24, a21, companion.e());
                            Updater.c(a24, s13, companion.g());
                            g00.p<ComposeUiNode, Integer, p> b14 = companion.b();
                            if (a24.f() || !o.d(a24.D(), Integer.valueOf(a22))) {
                                a24.u(Integer.valueOf(a22));
                                a24.p(Integer.valueOf(a22), b14);
                            }
                            c14.invoke(e1.a(e1.b(aVar7)), aVar7, 0);
                            aVar7.C(2058660585);
                            u uVar = u.f74924a;
                            androidx.compose.ui.c a25 = TestTagKt.a(aVar11, "btnExitPositiveAction");
                            ButtonData.a aVar14 = ButtonData.f40994a;
                            ButtonData c15 = aVar14.c();
                            float f12 = 12;
                            float f13 = 10;
                            w.o b15 = PaddingKt.b(e2.h.l(f12), e2.h.l(f13));
                            aVar7.C(511388516);
                            boolean T2 = aVar7.T(aVar8) | aVar7.T(aVar9);
                            Object D2 = aVar7.D();
                            if (T2 || D2 == androidx.compose.runtime.a.f7182a.a()) {
                                D2 = 
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0315: CONSTRUCTOR  (r6v9 'D2' java.lang.Object) = (r14v0 'aVar8' g00.a<wz.p> A[DONT_INLINE]), (r13v0 'aVar9' g00.a<wz.p> A[DONT_INLINE]) call: com.forsale.app.features.postad.plfWebView.PLFWebViewActivity$ExitPLFDialog$2$1$1$2$1$1.<init>(g00.a, g00.a):void type: CONSTRUCTOR in method: com.forsale.app.features.postad.plfWebView.PLFWebViewActivity$ExitPLFDialog$2.1.b(androidx.compose.runtime.a, int):void, file: classes2.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:309)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:272)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
                                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
                                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.postad.plfWebView.PLFWebViewActivity$ExitPLFDialog$2$1$1$2$1$1, state: NOT_LOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                                    	... 25 more
                                    */
                                /*
                                    Method dump skipped, instructions count: 980
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.plfWebView.PLFWebViewActivity$ExitPLFDialog$2.AnonymousClass1.b(androidx.compose.runtime.a, int):void");
                            }

                            @Override // g00.p
                            public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar7, Integer num) {
                                b(aVar7, num.intValue());
                                return p.f75480a;
                            }
                        }), aVar3, 1572870, 60);
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                        b(aVar3, num.intValue());
                        return p.f75480a;
                    }
                }), h11, 432, 0);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }
            d1 l11 = h11.l();
            if (l11 != null) {
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.postad.plfWebView.PLFWebViewActivity$ExitPLFDialog$3
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar3, int i16) {
                        PLFWebViewActivity.this.r0(onLeaveClicked, onStayClicked, onDismiss, aVar3, v0.a(i11 | 1));
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                        b(aVar3, num.intValue());
                        return p.f75480a;
                    }
                });
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v10 */
        public final void s0(androidx.compose.ui.c cVar, androidx.compose.runtime.a aVar, final int i11, final int i12) {
            c.a aVar2;
            int i13;
            p pVar;
            final androidx.compose.ui.c cVar2;
            androidx.compose.runtime.a aVar3;
            androidx.compose.runtime.a h11 = aVar.h(-1547627267);
            if ((i12 & 1) != 0) {
                aVar2 = androidx.compose.ui.c.f7566a;
            } else {
                aVar2 = cVar;
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-1547627267, i11, -1, "com.forsale.app.features.postad.plfWebView.PLFWebViewActivity.PLFWebView (PLFWebViewActivity.kt:147)");
            }
            h11.C(-492369756);
            Object D = h11.D();
            a.C0064a c0064a = androidx.compose.runtime.a.f7182a;
            if (D == c0064a.a()) {
                D = c0.e(Boolean.TRUE, null, 2, null);
                h11.u(D);
            }
            h11.S();
            final k0 k0Var = (k0) D;
            h11.C(-492369756);
            Object D2 = h11.D();
            if (D2 == c0064a.a()) {
                D2 = c0.e(Boolean.FALSE, null, 2, null);
                h11.u(D2);
            }
            h11.S();
            final k0 k0Var2 = (k0) D2;
            int i14 = i11 & 14;
            h11.C(733328855);
            int i15 = i14 >> 3;
            a0 g11 = BoxKt.g(v0.b.f74009a.o(), false, h11, (i15 & 112) | (i15 & 14));
            h11.C(-1323940314);
            int a11 = j0.e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a12 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(aVar2);
            int i16 = ((((i14 << 3) & 112) << 9) & 7168) | 6;
            if (!(h11.k() instanceof j0.d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a12);
            } else {
                h11.t();
            }
            androidx.compose.runtime.a a13 = Updater.a(h11);
            Updater.c(a13, g11, companion.e());
            Updater.c(a13, s11, companion.g());
            g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
            if (a13.f() || !o.d(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.p(Integer.valueOf(a11), b11);
            }
            c11.invoke(e1.a(e1.b(h11)), h11, Integer.valueOf((i16 >> 3) & 112));
            h11.C(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
            String H0 = H0();
            h11.C(664627334);
            if (H0 == null) {
                i13 = 0;
                pVar = null;
            } else {
                androidx.compose.ui.c f11 = SizeKt.f(androidx.compose.ui.c.f7566a, 0.0f, 1, null);
                PLFCommunication I0 = I0();
                o.f(H0);
                PLFWebViewActivity$PLFWebView$1$1$1 pLFWebViewActivity$PLFWebView$1$1$1 = new l<WebSettings, p>() { // from class: com.forsale.app.features.postad.plfWebView.PLFWebViewActivity$PLFWebView$1$1$1
                    public final void b(WebSettings ForSaleWebView) {
                        o.i(ForSaleWebView, "$this$ForSaleWebView");
                        ForSaleWebView.setJavaScriptEnabled(true);
                        ForSaleWebView.setDomStorageEnabled(true);
                        ForSaleWebView.setAllowFileAccess(true);
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ p invoke(WebSettings webSettings) {
                        b(webSettings);
                        return p.f75480a;
                    }
                };
                h11.C(511388516);
                boolean T = h11.T(k0Var) | h11.T(k0Var2);
                Object D3 = h11.D();
                if (T || D3 == c0064a.a()) {
                    D3 = new g00.a<p>() { // from class: com.forsale.app.features.postad.plfWebView.PLFWebViewActivity$PLFWebView$1$1$2$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // g00.a
                        public /* bridge */ /* synthetic */ p invoke() {
                            invoke2();
                            return p.f75480a;
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            boolean t02;
                            t02 = PLFWebViewActivity.t0(k0Var);
                            if (t02) {
                                return;
                            }
                            PLFWebViewActivity.w0(k0Var2, true);
                        }
                    };
                    h11.u(D3);
                }
                h11.S();
                g00.a aVar4 = (g00.a) D3;
                h11.C(1157296644);
                boolean T2 = h11.T(k0Var);
                Object D4 = h11.D();
                if (T2 || D4 == c0064a.a()) {
                    D4 = new g00.a<p>() { // from class: com.forsale.app.features.postad.plfWebView.PLFWebViewActivity$PLFWebView$1$1$3$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // g00.a
                        public /* bridge */ /* synthetic */ p invoke() {
                            invoke2();
                            return p.f75480a;
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            PLFWebViewActivity.u0(k0Var, false);
                        }
                    };
                    h11.u(D4);
                }
                h11.S();
                i13 = 0;
                WebViewKt.b(f11, H0, pLFWebViewActivity$PLFWebView$1$1$1, true, true, true, aVar4, (g00.a) D4, I0, null, h11, 134442374, AdRequest.MAX_CONTENT_URL_LENGTH);
                pVar = p.f75480a;
            }
            h11.S();
            h11.C(664627326);
            if (pVar == null) {
                TextKt.a("Error happened", null, 0, 0, false, 0, 0, null, null, 0L, 0, h11, 6, 0, 2046);
                p pVar2 = p.f75480a;
                i.f54287a.invoke().c("PLF url is null");
            }
            h11.S();
            h11.C(664628270);
            if (t0(k0Var)) {
                LoadingDialogKt.a(h11, i13);
            }
            h11.S();
            h11.C(665927517);
            if (v0(k0Var2)) {
                g00.a<p> aVar5 = new g00.a<p>() { // from class: com.forsale.app.features.postad.plfWebView.PLFWebViewActivity$PLFWebView$1$3
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(0);
                    }

                    @Override // g00.a
                    public /* bridge */ /* synthetic */ p invoke() {
                        invoke2();
                        return p.f75480a;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        PLFWebViewActivity.this.finish();
                    }
                };
                PLFWebViewActivity$PLFWebView$1$4 pLFWebViewActivity$PLFWebView$1$4 = new g00.a<p>() { // from class: com.forsale.app.features.postad.plfWebView.PLFWebViewActivity$PLFWebView$1$4
                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // g00.a
                    public /* bridge */ /* synthetic */ p invoke() {
                        invoke2();
                        return p.f75480a;
                    }
                };
                h11.C(1157296644);
                boolean T3 = h11.T(k0Var2);
                Object D5 = h11.D();
                if (T3 || D5 == c0064a.a()) {
                    D5 = new g00.a<p>() { // from class: com.forsale.app.features.postad.plfWebView.PLFWebViewActivity$PLFWebView$1$5$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // g00.a
                        public /* bridge */ /* synthetic */ p invoke() {
                            invoke2();
                            return p.f75480a;
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            PLFWebViewActivity.w0(k0Var2, false);
                        }
                    };
                    h11.u(D5);
                }
                h11.S();
                cVar2 = aVar2;
                aVar3 = h11;
                r0(aVar5, pLFWebViewActivity$PLFWebView$1$4, D5, h11, 4144);
            } else {
                cVar2 = aVar2;
                aVar3 = h11;
            }
            aVar3.S();
            aVar3.S();
            aVar3.w();
            aVar3.S();
            aVar3.S();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            d1 l11 = aVar3.l();
            if (l11 != null) {
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.postad.plfWebView.PLFWebViewActivity$PLFWebView$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar6, int i17) {
                        PLFWebViewActivity.this.s0(cVar2, aVar6, v0.a(i11 | 1), i12);
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar6, Integer num) {
                        b(aVar6, num.intValue());
                        return p.f75480a;
                    }
                });
            }
        }
    }
