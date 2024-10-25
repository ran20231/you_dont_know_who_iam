package com.forsale.app.features.categories.home.maincategories.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.e;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.runtime.c0;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import c0.g;
import com.forsale.app.features.categories.listings.items.dfp.GamComposeKt;
import com.forsale.app.features.categories.listings.items.dfp.GamStates;
import com.forsale.designSystem.dividers.DividersKt;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import e2.h;
import g00.l;
import g00.q;
import j0.d;
import j0.d1;
import j0.e1;
import j0.g1;
import j0.i0;
import j0.k;
import j0.k0;
import j0.v0;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.o;
import t9.y0;
import v0.b;
import w.f;
import wz.p;
/* compiled from: EnterpriseBanner.kt */
/* loaded from: classes2.dex */
public final class EnterpriseBannerKt {
    public static final void a(final AdManagerAdRequest gamRequest, final boolean z11, a aVar, final int i11) {
        o.i(gamRequest, "gamRequest");
        a h11 = aVar.h(1512685219);
        if (c.I()) {
            c.U(1512685219, i11, -1, "com.forsale.app.features.categories.home.maincategories.ui.EnterpriseBanner (EnterpriseBanner.kt:29)");
        }
        h11.C(-492369756);
        Object D = h11.D();
        a.C0064a c0064a = a.f7182a;
        if (D == c0064a.a()) {
            D = c0.e(GamStates.IS_LOADING, null, 2, null);
            h11.u(D);
        }
        h11.S();
        final k0 k0Var = (k0) D;
        h11.C(-492369756);
        Object D2 = h11.D();
        if (D2 == c0064a.a()) {
            D2 = g1.a(0);
            h11.u(D2);
        }
        h11.S();
        final i0 i0Var = (i0) D2;
        Arrangement.f b11 = Arrangement.f3698a.b();
        b.a aVar2 = b.f74009a;
        b.InterfaceC0889b g11 = aVar2.g();
        c.a aVar3 = androidx.compose.ui.c.f7566a;
        androidx.compose.ui.c i12 = SizeKt.i(aVar3, h.l(i0Var.d()));
        h11.C(-483455358);
        a0 a11 = e.a(b11, g11, h11, 54);
        h11.C(-1323940314);
        int a12 = j0.e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        q<e1<ComposeUiNode>, a, Integer, p> c11 = LayoutKt.c(i12);
        if (!(h11.k() instanceof d)) {
            j0.e.c();
        }
        h11.I();
        if (h11.f()) {
            h11.y(a13);
        } else {
            h11.t();
        }
        a a14 = Updater.a(h11);
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
        float f11 = 4;
        float l11 = h.l(f11);
        dk.a aVar4 = dk.a.f54291a;
        int i13 = dk.a.f54292b;
        yj.d e11 = aVar4.a(h11, i13).e();
        int i14 = yj.d.f76453b;
        DividersKt.a(null, l11, e11.h(h11, i14), h11, 48, 1);
        androidx.compose.ui.c a15 = TestTagKt.a(BackgroundKt.b(SizeKt.h(aVar3, 0.0f, 1, null), aVar4.a(h11, i13).e().h(h11, i14), null, 2, null), "enterpriseHomeSection");
        h11.C(733328855);
        a0 g12 = BoxKt.g(aVar2.o(), false, h11, 0);
        h11.C(-1323940314);
        int a16 = j0.e.a(h11, 0);
        k s12 = h11.s();
        g00.a<ComposeUiNode> a17 = companion.a();
        q<e1<ComposeUiNode>, a, Integer, p> c12 = LayoutKt.c(a15);
        if (!(h11.k() instanceof d)) {
            j0.e.c();
        }
        h11.I();
        if (h11.f()) {
            h11.y(a17);
        } else {
            h11.t();
        }
        a a18 = Updater.a(h11);
        Updater.c(a18, g12, companion.e());
        Updater.c(a18, s12, companion.g());
        g00.p<ComposeUiNode, Integer, p> b13 = companion.b();
        if (a18.f() || !o.d(a18.D(), Integer.valueOf(a16))) {
            a18.u(Integer.valueOf(a16));
            a18.p(Integer.valueOf(a16), b13);
        }
        c12.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        androidx.compose.ui.c e12 = BoxScopeInstance.f3756a.e(y0.e.a(PaddingKt.j(aVar3, h.l(16), h.l(12)), g.c(h.l(8))), aVar2.e());
        String b14 = p1.g.b(y0.f70461g, h11, 0);
        AdSize[] b15 = b(320, 100, h11, 54);
        AdSize[] adSizeArr = (AdSize[]) Arrays.copyOf(b15, b15.length);
        Boolean valueOf = Boolean.valueOf(z11);
        h11.C(1618982084);
        boolean T = h11.T(valueOf) | h11.T(i0Var) | h11.T(k0Var);
        Object D3 = h11.D();
        if (T || D3 == c0064a.a()) {
            D3 = new l<GamStates, p>() { // from class: com.forsale.app.features.categories.home.maincategories.ui.EnterpriseBannerKt$EnterpriseBanner$1$1$1$1

                /* compiled from: EnterpriseBanner.kt */
                /* loaded from: classes2.dex */
                public /* synthetic */ class a {

                    /* renamed from: a  reason: collision with root package name */
                    public static final /* synthetic */ int[] f24422a;

                    static {
                        int[] iArr = new int[GamStates.values().length];
                        try {
                            iArr[GamStates.SUCCESS.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        f24422a = iArr;
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void b(GamStates it2) {
                    o.i(it2, "it");
                    if (a.f24422a[it2.ordinal()] == 1) {
                        if (z11) {
                            i0Var.g(0);
                            return;
                        } else {
                            i0Var.g(120);
                            return;
                        }
                    }
                    k0Var.setValue(it2);
                    i0Var.g(0);
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(GamStates gamStates) {
                    b(gamStates);
                    return p.f75480a;
                }
            };
            h11.u(D3);
        }
        h11.S();
        GamComposeKt.a(b14, adSizeArr, gamRequest, false, e12, (l) D3, h11, 3648, 0);
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        DividersKt.a(null, h.l(f11), aVar4.a(h11, i13).e().h(h11, i14), h11, 48, 1);
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l12 = h11.l();
        if (l12 != null) {
            l12.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.home.maincategories.ui.EnterpriseBannerKt$EnterpriseBanner$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar5, int i15) {
                    EnterpriseBannerKt.a(AdManagerAdRequest.this, z11, aVar5, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar5, Integer num) {
                    b(aVar5, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    private static final AdSize[] b(int i11, int i12, a aVar, int i13) {
        List e11;
        aVar.C(361267260);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(361267260, i13, -1, "com.forsale.app.features.categories.home.maincategories.ui.adSizes (EnterpriseBanner.kt:79)");
        }
        e11 = kotlin.collections.q.e(new AdSize(i11, i12));
        AdSize[] adSizeArr = (AdSize[]) e11.toArray(new AdSize[0]);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        aVar.S();
        return adSizeArr;
    }
}
