package com.forsale.app.features.categories.listings.items.dfp;

import android.content.Context;
import android.view.View;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.e;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c0;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import b1.t1;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.iconography.IconKt;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import e2.h;
import g00.l;
import g00.q;
import j0.d;
import j0.d1;
import j0.e1;
import j0.k;
import j0.k0;
import j0.t0;
import j0.v0;
import java.util.Arrays;
import kotlin.jvm.internal.o;
import p1.g;
import t9.q0;
import t9.y0;
import v0.b;
import w.f;
import w.u;
import wz.p;
/* compiled from: GamCompose.kt */
/* loaded from: classes2.dex */
public final class GamComposeKt {

    /* compiled from: GamCompose.kt */
    /* loaded from: classes2.dex */
    public static final class a extends AdListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l<GamStates, p> f30630a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GamStates f30631b;

        /* JADX WARN: Multi-variable type inference failed */
        a(l<? super GamStates, p> lVar, GamStates gamStates) {
            this.f30630a = lVar;
            this.f30631b = gamStates;
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(LoadAdError p02) {
            o.i(p02, "p0");
            super.onAdFailedToLoad(p02);
            this.f30630a.invoke(GamStates.FAILED);
            GamStates gamStates = this.f30631b;
            x10.a.b("Gam: onAdFailedToLoad " + gamStates, new Object[0]);
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            super.onAdLoaded();
            this.f30630a.invoke(GamStates.SUCCESS);
            GamStates gamStates = this.f30631b;
            x10.a.b("Gam: onAdLoaded " + gamStates, new Object[0]);
        }
    }

    /* compiled from: View.kt */
    /* loaded from: classes2.dex */
    public static final class b implements View.OnLayoutChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GamStates f30632a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AdManagerAdView f30633b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AdManagerAdRequest f30634c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ l f30635d;

        public b(GamStates gamStates, AdManagerAdView adManagerAdView, AdManagerAdRequest adManagerAdRequest, l lVar) {
            this.f30632a = gamStates;
            this.f30633b = adManagerAdView;
            this.f30634c = adManagerAdRequest;
            this.f30635d = lVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            view.removeOnLayoutChangeListener(this);
            if (this.f30632a == GamStates.IS_LOADING) {
                this.f30633b.loadAd(this.f30634c);
            }
            GamStates gamStates = this.f30632a;
            x10.a.b("Gam: doOnLayout " + gamStates, new Object[0]);
            this.f30633b.setAdListener(GamComposeKt.p(this.f30632a, new GamComposeKt$onGamUpdate$1$1$1(this.f30635d)));
        }
    }

    public static final void a(final String adUnitId, final AdSize[] adSizes, final AdManagerAdRequest adManagerAdRequest, final boolean z11, final c modifier, l<? super GamStates, p> lVar, androidx.compose.runtime.a aVar, final int i11, final int i12) {
        final l<? super GamStates, p> lVar2;
        o.i(adUnitId, "adUnitId");
        o.i(adSizes, "adSizes");
        o.i(adManagerAdRequest, "adManagerAdRequest");
        o.i(modifier, "modifier");
        androidx.compose.runtime.a h11 = aVar.h(-67587854);
        if ((i12 & 32) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-67587854, i11, -1, "com.forsale.app.features.categories.listings.items.dfp.Gam (GamCompose.kt:38)");
        }
        c h12 = SizeKt.h(c.f7566a, 0.0f, 1, null);
        Arrangement.f b11 = Arrangement.f3698a.b();
        b.InterfaceC0889b g11 = v0.b.f74009a.g();
        h11.C(-483455358);
        a0 a11 = e.a(b11, g11, h11, 54);
        h11.C(-1323940314);
        int a12 = j0.e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(h12);
        if (!(h11.k() instanceof d)) {
            j0.e.c();
        }
        h11.I();
        if (h11.f()) {
            h11.y(a13);
        } else {
            h11.t();
        }
        androidx.compose.runtime.a a14 = Updater.a(h11);
        Updater.c(a14, a11, companion.e());
        Updater.c(a14, s11, companion.g());
        g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
        if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
            a14.u(Integer.valueOf(a12));
            a14.p(Integer.valueOf(a12), b12);
        }
        c11.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        f fVar = f.f74891a;
        b(adUnitId, (AdSize[]) Arrays.copyOf(adSizes, adSizes.length), adManagerAdRequest, z11, modifier, lVar2, h11, (i11 & 14) | 576 | (i11 & 7168) | (57344 & i11) | (458752 & i11), 0);
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.items.dfp.GamComposeKt$Gam$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(a aVar2, int i13) {
                    String str = adUnitId;
                    AdSize[] adSizeArr = adSizes;
                    GamComposeKt.a(str, (AdSize[]) Arrays.copyOf(adSizeArr, adSizeArr.length), adManagerAdRequest, z11, modifier, lVar2, aVar2, v0.a(i11 | 1), i12);
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final String str, final AdSize[] adSizeArr, final AdManagerAdRequest adManagerAdRequest, final boolean z11, final c cVar, l<? super GamStates, p> lVar, androidx.compose.runtime.a aVar, final int i11, final int i12) {
        l<? super GamStates, p> lVar2;
        int i13;
        final k0 k0Var;
        androidx.compose.runtime.a h11 = aVar.h(-1963063451);
        if ((i12 & 32) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-1963063451, i11, -1, "com.forsale.app.features.categories.listings.items.dfp.GamComponent (GamCompose.kt:63)");
        }
        h11.C(-492369756);
        Object D = h11.D();
        a.C0064a c0064a = androidx.compose.runtime.a.f7182a;
        if (D == c0064a.a()) {
            D = c0.e(GamStates.IS_LOADING, null, 2, null);
            h11.u(D);
        }
        h11.S();
        final k0 k0Var2 = (k0) D;
        h11.C(1157296644);
        boolean T = h11.T(adManagerAdRequest);
        Object D2 = h11.D();
        if (T || D2 == c0064a.a()) {
            D2 = c0.e(adManagerAdRequest, null, 2, null);
            h11.u(D2);
        }
        h11.S();
        k0 k0Var3 = (k0) D2;
        if (lVar2 != null) {
            lVar2.invoke(c(k0Var2));
        }
        h11.C(-1139141300);
        if (c(k0Var2) != GamStates.FAILED) {
            int i14 = (i11 >> 12) & 14;
            h11.C(693286680);
            int i15 = i14 >> 3;
            a0 a11 = androidx.compose.foundation.layout.o.a(Arrangement.f3698a.g(), v0.b.f74009a.l(), h11, (i15 & 112) | (i15 & 14));
            h11.C(-1323940314);
            int a12 = j0.e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(cVar);
            int i16 = ((((i14 << 3) & 112) << 9) & 7168) | 6;
            if (!(h11.k() instanceof d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a13);
            } else {
                h11.t();
            }
            androidx.compose.runtime.a a14 = Updater.a(h11);
            Updater.c(a14, a11, companion.e());
            Updater.c(a14, s11, companion.g());
            g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
            if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.p(Integer.valueOf(a12), b11);
            }
            c11.invoke(e1.a(e1.b(h11)), h11, Integer.valueOf((i16 >> 3) & 112));
            h11.C(2058660585);
            u uVar = u.f74924a;
            c.a aVar2 = c.f7566a;
            i13 = 1157296644;
            c g11 = g(BackgroundKt.b(aVar2, t1.f15974b.d(), null, 2, null), c(k0Var2), adSizeArr, false, h11, 518, 4);
            l<Context, AdManagerAdView> lVar3 = new l<Context, AdManagerAdView>() { // from class: com.forsale.app.features.categories.listings.items.dfp.GamComposeKt$GamComponent$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // g00.l
                /* renamed from: b */
                public final AdManagerAdView invoke(Context context) {
                    GamStates c12;
                    AdManagerAdView q11;
                    o.i(context, "context");
                    c12 = GamComposeKt.c(k0Var2);
                    x10.a.b("Gam: factory " + c12, new Object[0]);
                    AdSize[] adSizeArr2 = adSizeArr;
                    q11 = GamComposeKt.q(context, (AdSize[]) Arrays.copyOf(adSizeArr2, adSizeArr2.length));
                    return q11;
                }
            };
            h11.C(1618982084);
            k0Var = k0Var3;
            boolean T2 = h11.T(str) | h11.T(k0Var) | h11.T(k0Var2);
            Object D3 = h11.D();
            if (T2 || D3 == c0064a.a()) {
                D3 = new l<AdManagerAdView, p>() { // from class: com.forsale.app.features.categories.listings.items.dfp.GamComposeKt$GamComponent$1$2$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void b(AdManagerAdView adView) {
                        AdManagerAdRequest e11;
                        GamStates c12;
                        o.i(adView, "adView");
                        String str2 = str;
                        e11 = GamComposeKt.e(k0Var);
                        c12 = GamComposeKt.c(k0Var2);
                        final k0<GamStates> k0Var4 = k0Var2;
                        GamComposeKt.r(str2, adView, e11, c12, new l<GamStates, p>() { // from class: com.forsale.app.features.categories.listings.items.dfp.GamComposeKt$GamComponent$1$2$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public final void b(GamStates it2) {
                                o.i(it2, "it");
                                GamComposeKt.d(k0Var4, it2);
                            }

                            @Override // g00.l
                            public /* bridge */ /* synthetic */ p invoke(GamStates gamStates) {
                                b(gamStates);
                                return p.f75480a;
                            }
                        });
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ p invoke(AdManagerAdView adManagerAdView) {
                        b(adManagerAdView);
                        return p.f75480a;
                    }
                };
                h11.u(D3);
            }
            h11.S();
            AndroidView_androidKt.a(lVar3, g11, (l) D3, h11, 0, 0);
            h11.C(-1139140662);
            if (c(k0Var2) == GamStates.IS_LOADING) {
                f(c(k0Var2), adSizeArr, h11, 64);
            }
            h11.S();
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            if (z11) {
                SpacerKt.a(SizeKt.i(aVar2, h.l(12)), h11, 6);
            }
        } else {
            i13 = 1157296644;
            k0Var = k0Var3;
        }
        h11.S();
        AdManagerAdRequest e11 = e(k0Var);
        h11.C(i13);
        boolean T3 = h11.T(k0Var2);
        Object D4 = h11.D();
        if (T3 || D4 == c0064a.a()) {
            D4 = new GamComposeKt$GamComponent$2$1(k0Var2, null);
            h11.u(D4);
        }
        h11.S();
        j0.u.d(e11, (g00.p) D4, h11, 72);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            final l<? super GamStates, p> lVar4 = lVar2;
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.items.dfp.GamComposeKt$GamComponent$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(a aVar3, int i17) {
                    String str2 = str;
                    AdSize[] adSizeArr2 = adSizeArr;
                    GamComposeKt.b(str2, (AdSize[]) Arrays.copyOf(adSizeArr2, adSizeArr2.length), adManagerAdRequest, z11, cVar, lVar4, aVar3, v0.a(i11 | 1), i12);
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GamStates c(k0<GamStates> k0Var) {
        return k0Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(k0<GamStates> k0Var, GamStates gamStates) {
        k0Var.setValue(gamStates);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdManagerAdRequest e(k0<AdManagerAdRequest> k0Var) {
        return k0Var.getValue();
    }

    public static final void f(final GamStates gamState, final AdSize[] adSizes, androidx.compose.runtime.a aVar, final int i11) {
        o.i(gamState, "gamState");
        o.i(adSizes, "adSizes");
        androidx.compose.runtime.a h11 = aVar.h(1763285873);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(1763285873, i11, -1, "com.forsale.app.features.categories.listings.items.dfp.GamPlaceholder (GamCompose.kt:177)");
        }
        CompositionLocalKt.a(CompositionLocalsKt.j().c(LayoutDirection.Ltr), r0.b.b(h11, -1199378383, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.items.dfp.GamComposeKt$GamPlaceholder$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void b(a aVar2, int i12) {
                c g11;
                if ((i12 & 11) == 2 && aVar2.i()) {
                    aVar2.L();
                    return;
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(-1199378383, i12, -1, "com.forsale.app.features.categories.listings.items.dfp.GamPlaceholder.<anonymous> (GamCompose.kt:180)");
                }
                c.a aVar3 = c.f7566a;
                g11 = GamComposeKt.g(aVar3, GamStates.this, adSizes, true, aVar2, ((i11 << 3) & 112) | 3590, 0);
                dk.a aVar4 = dk.a.f54291a;
                int i13 = dk.a.f54292b;
                yj.d e11 = aVar4.a(aVar2, i13).e();
                int i14 = yj.d.f76453b;
                c b11 = BackgroundKt.b(g11, e11.d(aVar2, i14), null, 2, null);
                b.a aVar5 = b.f74009a;
                b.InterfaceC0889b g12 = aVar5.g();
                aVar2.C(-483455358);
                Arrangement arrangement = Arrangement.f3698a;
                a0 a11 = e.a(arrangement.h(), g12, aVar2, 48);
                aVar2.C(-1323940314);
                int a12 = j0.e.a(aVar2, 0);
                k s11 = aVar2.s();
                ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                g00.a<ComposeUiNode> a13 = companion.a();
                q<e1<ComposeUiNode>, a, Integer, p> c11 = LayoutKt.c(b11);
                if (!(aVar2.k() instanceof d)) {
                    j0.e.c();
                }
                aVar2.I();
                if (aVar2.f()) {
                    aVar2.y(a13);
                } else {
                    aVar2.t();
                }
                a a14 = Updater.a(aVar2);
                Updater.c(a14, a11, companion.e());
                Updater.c(a14, s11, companion.g());
                g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
                if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                    a14.u(Integer.valueOf(a12));
                    a14.p(Integer.valueOf(a12), b12);
                }
                c11.invoke(e1.a(e1.b(aVar2)), aVar2, 0);
                aVar2.C(2058660585);
                f fVar = f.f74891a;
                aVar2.C(733328855);
                a0 g13 = BoxKt.g(aVar5.o(), false, aVar2, 0);
                aVar2.C(-1323940314);
                int a15 = j0.e.a(aVar2, 0);
                k s12 = aVar2.s();
                g00.a<ComposeUiNode> a16 = companion.a();
                q<e1<ComposeUiNode>, a, Integer, p> c12 = LayoutKt.c(aVar3);
                if (!(aVar2.k() instanceof d)) {
                    j0.e.c();
                }
                aVar2.I();
                if (aVar2.f()) {
                    aVar2.y(a16);
                } else {
                    aVar2.t();
                }
                a a17 = Updater.a(aVar2);
                Updater.c(a17, g13, companion.e());
                Updater.c(a17, s12, companion.g());
                g00.p<ComposeUiNode, Integer, p> b13 = companion.b();
                if (a17.f() || !o.d(a17.D(), Integer.valueOf(a15))) {
                    a17.u(Integer.valueOf(a15));
                    a17.p(Integer.valueOf(a15), b13);
                }
                c12.invoke(e1.a(e1.b(aVar2)), aVar2, 0);
                aVar2.C(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
                c f11 = SizeKt.f(aVar3, 0.0f, 1, null);
                b.c i15 = aVar5.i();
                Arrangement.f b14 = arrangement.b();
                aVar2.C(693286680);
                a0 a18 = androidx.compose.foundation.layout.o.a(b14, i15, aVar2, 54);
                aVar2.C(-1323940314);
                int a19 = j0.e.a(aVar2, 0);
                k s13 = aVar2.s();
                g00.a<ComposeUiNode> a21 = companion.a();
                q<e1<ComposeUiNode>, a, Integer, p> c13 = LayoutKt.c(f11);
                if (!(aVar2.k() instanceof d)) {
                    j0.e.c();
                }
                aVar2.I();
                if (aVar2.f()) {
                    aVar2.y(a21);
                } else {
                    aVar2.t();
                }
                a a22 = Updater.a(aVar2);
                Updater.c(a22, a18, companion.e());
                Updater.c(a22, s13, companion.g());
                g00.p<ComposeUiNode, Integer, p> b15 = companion.b();
                if (a22.f() || !o.d(a22.D(), Integer.valueOf(a19))) {
                    a22.u(Integer.valueOf(a19));
                    a22.p(Integer.valueOf(a19), b15);
                }
                c13.invoke(e1.a(e1.b(aVar2)), aVar2, 0);
                aVar2.C(2058660585);
                u uVar = u.f74924a;
                float f12 = 12;
                TextKt.a(g.b(y0.f70410d, aVar2, 0), PaddingKt.m(aVar3, 0.0f, 0.0f, h.l(f12), 0.0f, 11, null), 0, 0, false, 0, 0, null, aVar4.c(aVar2, i13).b(), aVar4.a(aVar2, i13).e().g(aVar2, i14), 0, aVar2, 48, 0, 1276);
                IconKt.a(p1.e.d(q0.S, aVar2, 0), PaddingKt.m(aVar3, 0.0f, 0.0f, h.l(f12), 0.0f, 11, null), null, aVar4.a(aVar2, i13).e().g(aVar2, i14), false, 0.0f, aVar2, 440, 48);
                TextKt.a(g.b(y0.f70393c, aVar2, 0), null, 0, 0, false, 0, 0, null, aVar4.c(aVar2, i13).b(), aVar4.a(aVar2, i13).e().g(aVar2, i14), 0, aVar2, 0, 0, 1278);
                aVar2.S();
                aVar2.w();
                aVar2.S();
                aVar2.S();
                aVar2.S();
                aVar2.w();
                aVar2.S();
                aVar2.S();
                aVar2.S();
                aVar2.w();
                aVar2.S();
                aVar2.S();
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ p invoke(a aVar2, Integer num) {
                b(aVar2, num.intValue());
                return p.f75480a;
            }
        }), h11, t0.f59917d | 0 | 48);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.items.dfp.GamComposeKt$GamPlaceholder$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar2, int i12) {
                    GamComposeKt.f(GamStates.this, adSizes, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c g(c cVar, GamStates gamStates, AdSize[] adSizeArr, boolean z11, androidx.compose.runtime.a aVar, int i11, int i12) {
        aVar.C(2135754742);
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(2135754742, i11, -1, "com.forsale.app.features.categories.listings.items.dfp.GetGamDimension (GamCompose.kt:152)");
        }
        GamStates gamStates2 = GamStates.IS_LOADING;
        if (gamStates == gamStates2 && !z11) {
            float f11 = 0;
            cVar = SizeKt.u(SizeKt.i(cVar, h.l(f11)), h.l(f11));
        } else if (gamStates == gamStates2 && z11) {
            cVar = SizeKt.u(SizeKt.i(cVar, h.l(adSizeArr[0].getHeight())), h.l(adSizeArr[0].getWidth()));
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        aVar.S();
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdListener p(GamStates gamStates, l<? super GamStates, p> lVar) {
        return new a(lVar, gamStates);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdManagerAdView q(Context context, AdSize... adSizeArr) {
        AdManagerAdView adManagerAdView = new AdManagerAdView(context);
        adManagerAdView.setAdSizes((AdSize[]) Arrays.copyOf(adSizeArr, adSizeArr.length));
        return adManagerAdView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(String str, AdManagerAdView adManagerAdView, AdManagerAdRequest adManagerAdRequest, GamStates gamStates, l<? super GamStates, p> lVar) {
        boolean z11;
        String adUnitId = adManagerAdView.getAdUnitId();
        if (adUnitId != null && adUnitId.length() != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            adManagerAdView.setAdUnitId(str);
        }
        x10.a.b("Gam: update " + gamStates, new Object[0]);
        if (androidx.core.view.t1.V(adManagerAdView) && !adManagerAdView.isLayoutRequested()) {
            if (gamStates == GamStates.IS_LOADING) {
                adManagerAdView.loadAd(adManagerAdRequest);
            }
            x10.a.b("Gam: doOnLayout " + gamStates, new Object[0]);
            adManagerAdView.setAdListener(p(gamStates, new GamComposeKt$onGamUpdate$1$1$1(lVar)));
            return;
        }
        adManagerAdView.addOnLayoutChangeListener(new b(gamStates, adManagerAdView, adManagerAdRequest, lVar));
    }
}
