package com.forsale.adserver.view.screens.ui;

import android.content.Context;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.o;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.runtime.c0;
import androidx.compose.ui.c;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.FragmentManager;
import b1.t1;
import c0.g;
import coil.compose.AsyncImagePainter;
import com.forsale.adserver.utils.LocaleManager;
import com.forsale.adserver.utils.viewsUtils.UtilsKt;
import com.forsale.adserver.view.models.AdGeneralModel;
import com.forsale.adserver.view.models.AdType;
import com.forsale.adserver.view.models.AdsModel;
import com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheetKt;
import com.forsale.analytics.commercial.CommercialItemDetailsSource;
import com.forsale.analytics.commercial.CommercialPageSource;
import com.forsale.designSystem.SurfaceKt;
import com.forsale.designSystem.buttons.IconButtonKt;
import com.forsale.designSystem.buttons.IconButtonShape;
import com.forsale.designSystem.buttons.IconButtonSize;
import com.leanplum.internal.ResourceQualifiers;
import commercial.CommercialTabName;
import e2.h;
import g00.l;
import g00.q;
import g9.d;
import j0.d1;
import j0.e;
import j0.e1;
import j0.k;
import j0.k0;
import j0.v0;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;
import v0.b;
import w.f;
import w.t;
import w.u;
import wz.p;
import y.a;
/* compiled from: CommercialOffersSection.kt */
/* loaded from: classes2.dex */
public final class CommercialOffersSectionKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final l<? super String, p> lVar, final d dVar, final l<? super String, p> lVar2, androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.runtime.a h11 = aVar.h(176478516);
        if (c.I()) {
            c.U(176478516, i11, -1, "com.forsale.adserver.view.screens.ui.CommercialOfferCTAs (CommercialOffersSection.kt:149)");
        }
        c.a aVar2 = androidx.compose.ui.c.f7566a;
        androidx.compose.ui.c h12 = SizeKt.h(aVar2, 0.0f, 1, null);
        Arrangement.f o11 = Arrangement.f3698a.o(h.l(8));
        h11.C(693286680);
        a0 a11 = o.a(o11, b.f74009a.l(), h11, 6);
        h11.C(-1323940314);
        int a12 = e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(h12);
        if (!(h11.k() instanceof j0.d)) {
            e.c();
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
        if (a14.f() || !kotlin.jvm.internal.o.d(a14.D(), Integer.valueOf(a12))) {
            a14.u(Integer.valueOf(a12));
            a14.p(Integer.valueOf(a12), b11);
        }
        c11.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        u uVar = u.f74924a;
        dk.a aVar3 = dk.a.f54291a;
        int i12 = dk.a.f54292b;
        yj.d f11 = aVar3.a(h11, i12).f();
        int i13 = yj.d.f76453b;
        long i14 = f11.i(h11, i13);
        Painter d11 = p1.e.d(sj.d.f68678o, h11, 0);
        IconButtonSize iconButtonSize = IconButtonSize.Small;
        IconButtonShape iconButtonShape = IconButtonShape.Rectangle;
        long c12 = aVar3.a(h11, i12).g().c(h11, i13);
        IconButtonKt.a(new g00.a<p>() { // from class: com.forsale.adserver.view.screens.ui.CommercialOffersSectionKt$CommercialOfferCTAs$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
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
                lVar.invoke(dVar.j());
            }
        }, d11, iconButtonShape, iconButtonSize, i14, t.d(uVar, aVar2, 0.5f, false, 2, null), false, null, t1.g(c12), h11, 3520, ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_MASK);
        long i15 = aVar3.a(h11, i12).h().i(h11, i13);
        Painter d12 = p1.e.d(l8.e.f62285f, h11, 0);
        long c13 = aVar3.a(h11, i12).g().c(h11, i13);
        IconButtonKt.a(new g00.a<p>() { // from class: com.forsale.adserver.view.screens.ui.CommercialOffersSectionKt$CommercialOfferCTAs$1$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
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
                lVar2.invoke(dVar.j());
            }
        }, d12, iconButtonShape, iconButtonSize, i15, t.d(uVar, aVar2, 0.5f, false, 2, null), false, null, t1.g(c13), h11, 3520, ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_MASK);
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.adserver.view.screens.ui.CommercialOffersSectionKt$CommercialOfferCTAs$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar4, int i16) {
                    CommercialOffersSectionKt.a(lVar, dVar, lVar2, aVar4, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final d dVar, androidx.compose.runtime.a aVar, final int i11) {
        Object f11;
        c.a aVar2;
        androidx.compose.runtime.a h11 = aVar.h(1131670218);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(1131670218, i11, -1, "com.forsale.adserver.view.screens.ui.CommercialOfferImage (CommercialOffersSection.kt:177)");
        }
        h11.C(-492369756);
        Object D = h11.D();
        a.C0064a c0064a = androidx.compose.runtime.a.f7182a;
        if (D == c0064a.a()) {
            D = c0.e(Boolean.FALSE, null, 2, null);
            h11.u(D);
        }
        h11.S();
        final k0 k0Var = (k0) D;
        if (LocaleManager.f20849a.j()) {
            f11 = dVar.e();
        } else {
            f11 = dVar.f();
            if (f11 == null) {
                f11 = Integer.valueOf(sj.d.A);
            }
        }
        h11.C(1157296644);
        boolean T = h11.T(k0Var);
        Object D2 = h11.D();
        if (T || D2 == c0064a.a()) {
            D2 = new l<AsyncImagePainter.b.c, p>() { // from class: com.forsale.adserver.view.screens.ui.CommercialOffersSectionKt$CommercialOfferImage$painter$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void b(AsyncImagePainter.b.c it2) {
                    kotlin.jvm.internal.o.i(it2, "it");
                    CommercialOffersSectionKt.d(k0Var, true);
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(AsyncImagePainter.b.c cVar) {
                    b(cVar);
                    return p.f75480a;
                }
            };
            h11.u(D2);
        }
        h11.S();
        l lVar = (l) D2;
        h11.C(1157296644);
        boolean T2 = h11.T(k0Var);
        Object D3 = h11.D();
        if (T2 || D3 == c0064a.a()) {
            D3 = new l<AsyncImagePainter.b.d, p>() { // from class: com.forsale.adserver.view.screens.ui.CommercialOffersSectionKt$CommercialOfferImage$painter$2$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void b(AsyncImagePainter.b.d it2) {
                    kotlin.jvm.internal.o.i(it2, "it");
                    CommercialOffersSectionKt.d(k0Var, false);
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(AsyncImagePainter.b.d dVar2) {
                    b(dVar2);
                    return p.f75480a;
                }
            };
            h11.u(D3);
        }
        h11.S();
        AsyncImagePainter b11 = h5.d.b(f11, null, null, null, lVar, (l) D3, null, null, 0, h11, 8, 462);
        h11.C(733328855);
        c.a aVar3 = androidx.compose.ui.c.f7566a;
        a0 g11 = BoxKt.g(b.f74009a.o(), false, h11, 0);
        h11.C(-1323940314);
        int a11 = e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a12 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(aVar3);
        if (!(h11.k() instanceof j0.d)) {
            e.c();
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
        g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
        if (a13.f() || !kotlin.jvm.internal.o.d(a13.D(), Integer.valueOf(a11))) {
            a13.u(Integer.valueOf(a11));
            a13.p(Integer.valueOf(a11), b12);
        }
        c11.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
        h11.C(1619797747);
        if (c(k0Var)) {
            aVar2 = aVar3;
            SurfaceKt.c(null, g.c(h.l(8)), 0L, 0L, null, 0.0f, ComposableSingletons$CommercialOffersSectionKt.f21563a.a(), h11, 1572864, 61);
        } else {
            aVar2 = aVar3;
        }
        h11.S();
        ImageKt.a(b11, "", y0.e.a(AspectRatioKt.b(SizeKt.h(aVar2, 0.0f, 1, null), 0.7371007f, false, 2, null), g.c(h.l(8))), null, androidx.compose.ui.layout.c.f8188a.b(), 0.0f, null, h11, 24624, 104);
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.adserver.view.screens.ui.CommercialOffersSectionKt$CommercialOfferImage$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar4, int i12) {
                    CommercialOffersSectionKt.b(d.this, aVar4, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    private static final boolean c(k0<Boolean> k0Var) {
        return k0Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(k0<Boolean> k0Var, boolean z11) {
        k0Var.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(final d dVar, Boolean bool, CommercialTabName commercialTabName, final l<? super CommercialPageSource, p> lVar, final l<? super String, p> lVar2, final l<? super String, p> lVar3, androidx.compose.runtime.a aVar, final int i11, final int i12) {
        Boolean bool2;
        CommercialTabName commercialTabName2;
        androidx.compose.runtime.a h11 = aVar.h(59287063);
        if ((i12 & 2) != 0) {
            bool2 = null;
        } else {
            bool2 = bool;
        }
        if ((i12 & 4) != 0) {
            commercialTabName2 = null;
        } else {
            commercialTabName2 = commercialTabName;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(59287063, i11, -1, "com.forsale.adserver.view.screens.ui.CommercialOfferItem (CommercialOffersSection.kt:103)");
        }
        final Context context = (Context) h11.q(AndroidCompositionLocals_androidKt.g());
        c.a aVar2 = androidx.compose.ui.c.f7566a;
        float f11 = 8;
        final Boolean bool3 = bool2;
        final CommercialTabName commercialTabName3 = commercialTabName2;
        androidx.compose.ui.c e11 = ClickableKt.e(BorderKt.f(SizeKt.h(aVar2, 0.0f, 1, null), h.l(1), dk.a.f54291a.a(h11, dk.a.f54292b).e().d(h11, yj.d.f76453b), g.c(h.l(f11))), false, null, null, new g00.a<p>() { // from class: com.forsale.adserver.view.screens.ui.CommercialOffersSectionKt$CommercialOfferItem$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
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
                androidx.appcompat.app.d c11 = UtilsKt.c(context);
                if (c11 != null) {
                    Context context2 = context;
                    d dVar2 = dVar;
                    l<CommercialPageSource, p> lVar4 = lVar;
                    Boolean bool4 = bool3;
                    CommercialTabName commercialTabName4 = commercialTabName3;
                    AdsModel s11 = AdGeneralModel.s(new a9.e().a(dVar2), null, AdType.OFFER, null, null, 12, null);
                    FragmentManager supportFragmentManager = c11.getSupportFragmentManager();
                    kotlin.jvm.internal.o.h(supportFragmentManager, "getSupportFragmentManager(...)");
                    NewDetailsBottomSheetKt.f(context2, s11, lVar4, null, supportFragmentManager, null, CommercialItemDetailsSource.COMMERCIAL_SCREEN, new com.forsale.adserver.view.screens.detailsScreen.a(bool4, null, null, null, null, null, null, commercialTabName4, Integer.valueOf(dVar2.p()), WebSocketProtocol.PAYLOAD_SHORT, null), null, 148, null);
                }
            }
        }, 7, null);
        h11.C(733328855);
        b.a aVar3 = b.f74009a;
        a0 g11 = BoxKt.g(aVar3.o(), false, h11, 0);
        h11.C(-1323940314);
        int a11 = e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a12 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(e11);
        if (!(h11.k() instanceof j0.d)) {
            e.c();
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
        if (a13.f() || !kotlin.jvm.internal.o.d(a13.D(), Integer.valueOf(a11))) {
            a13.u(Integer.valueOf(a11));
            a13.p(Integer.valueOf(a11), b11);
        }
        c11.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
        androidx.compose.ui.c i13 = PaddingKt.i(SizeKt.h(aVar2, 0.0f, 1, null), h.l(f11));
        Arrangement.f o11 = Arrangement.f3698a.o(h.l(f11));
        h11.C(-483455358);
        a0 a14 = androidx.compose.foundation.layout.e.a(o11, aVar3.k(), h11, 6);
        h11.C(-1323940314);
        int a15 = e.a(h11, 0);
        k s12 = h11.s();
        g00.a<ComposeUiNode> a16 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c12 = LayoutKt.c(i13);
        if (!(h11.k() instanceof j0.d)) {
            e.c();
        }
        h11.I();
        if (h11.f()) {
            h11.y(a16);
        } else {
            h11.t();
        }
        androidx.compose.runtime.a a17 = Updater.a(h11);
        Updater.c(a17, a14, companion.e());
        Updater.c(a17, s12, companion.g());
        g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
        if (a17.f() || !kotlin.jvm.internal.o.d(a17.D(), Integer.valueOf(a15))) {
            a17.u(Integer.valueOf(a15));
            a17.p(Integer.valueOf(a15), b12);
        }
        c12.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        f fVar = f.f74891a;
        b(dVar, h11, 8);
        a(lVar2, dVar, lVar3, h11, ((i11 >> 12) & 14) | 64 | ((i11 >> 9) & 896));
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            final Boolean bool4 = bool2;
            final CommercialTabName commercialTabName4 = commercialTabName2;
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.adserver.view.screens.ui.CommercialOffersSectionKt$CommercialOfferItem$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar4, int i14) {
                    CommercialOffersSectionKt.e(d.this, bool4, commercialTabName4, lVar, lVar2, lVar3, aVar4, v0.a(i11 | 1), i12);
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void f(final List<d> list, final l<? super CommercialPageSource, p> checkAllOffersClicked, Boolean bool, CommercialTabName commercialTabName, final g00.a<p> onOfferSupportItemClicked, androidx.compose.runtime.a aVar, final int i11, final int i12) {
        Boolean bool2;
        CommercialTabName commercialTabName2;
        LazyGridState lazyGridState;
        zz.a aVar2;
        androidx.compose.runtime.a aVar3;
        kotlin.jvm.internal.o.i(checkAllOffersClicked, "checkAllOffersClicked");
        kotlin.jvm.internal.o.i(onOfferSupportItemClicked, "onOfferSupportItemClicked");
        androidx.compose.runtime.a h11 = aVar.h(1935777454);
        if ((i12 & 4) != 0) {
            bool2 = null;
        } else {
            bool2 = bool;
        }
        if ((i12 & 8) != 0) {
            commercialTabName2 = null;
        } else {
            commercialTabName2 = commercialTabName;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(1935777454, i11, -1, "com.forsale.adserver.view.screens.ui.CommercialOffersSection (CommercialOffersSection.kt:62)");
        }
        final Context context = (Context) h11.q(AndroidCompositionLocals_androidKt.g());
        LazyGridState b11 = LazyGridStateKt.b(0, 0, h11, 0, 3);
        h11.C(-612675343);
        if (list == null) {
            lazyGridState = b11;
            aVar2 = null;
            aVar3 = h11;
        } else {
            a.C0936a c0936a = new a.C0936a(2);
            Arrangement arrangement = Arrangement.f3698a;
            float f11 = 12;
            Arrangement.f o11 = arrangement.o(h.l(f11));
            Arrangement.f o12 = arrangement.o(h.l(f11));
            float f12 = 16;
            w.o e11 = PaddingKt.e(h.l(f12), 0.0f, h.l(f12), h.l(f12), 2, null);
            androidx.compose.ui.c m11 = PaddingKt.m(androidx.compose.ui.c.f7566a, 0.0f, h.l(f12), 0.0f, 0.0f, 13, null);
            final Boolean bool3 = bool2;
            final CommercialTabName commercialTabName3 = commercialTabName2;
            l<LazyGridScope, p> lVar = new l<LazyGridScope, p>() { // from class: com.forsale.adserver.view.screens.ui.CommercialOffersSectionKt$CommercialOffersSection$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                public final void b(LazyGridScope LazyVerticalGrid) {
                    kotlin.jvm.internal.o.i(LazyVerticalGrid, "$this$LazyVerticalGrid");
                    final List<d> list2 = list;
                    final Boolean bool4 = bool3;
                    final CommercialTabName commercialTabName4 = commercialTabName3;
                    final l<CommercialPageSource, p> lVar2 = checkAllOffersClicked;
                    final Context context2 = context;
                    final int i13 = i11;
                    final CommercialOffersSectionKt$CommercialOffersSection$1$1$invoke$$inlined$items$default$1 commercialOffersSectionKt$CommercialOffersSection$1$1$invoke$$inlined$items$default$1 = CommercialOffersSectionKt$CommercialOffersSection$1$1$invoke$$inlined$items$default$1.f21511a;
                    LazyVerticalGrid.k(list2.size(), null, null, 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0032: INVOKE  
                          (r17v0 'LazyVerticalGrid' androidx.compose.foundation.lazy.grid.LazyGridScope)
                          (wrap: int : 0x0017: INVOKE  (r3v0 int A[REMOVE]) = (r10v0 'list2' java.util.List<g9.d>) type: INTERFACE call: java.util.List.size():int)
                          (null g00.l<? super java.lang.Integer, ? extends java.lang.Object>)
                          (null g00.p<? super y.m, ? super java.lang.Integer, y.b>)
                          (wrap: g00.l<java.lang.Integer, java.lang.Object> : 0x001f: CONSTRUCTOR  (r6v0 g00.l<java.lang.Integer, java.lang.Object> A[REMOVE]) = 
                          (r1v1 'commercialOffersSectionKt$CommercialOffersSection$1$1$invoke$$inlined$items$default$1' com.forsale.adserver.view.screens.ui.CommercialOffersSectionKt$CommercialOffersSection$1$1$invoke$$inlined$items$default$1 A[DONT_INLINE])
                          (r10v0 'list2' java.util.List<g9.d> A[DONT_INLINE])
                         call: com.forsale.adserver.view.screens.ui.CommercialOffersSectionKt$CommercialOffersSection$1$1$invoke$$inlined$items$default$4.<init>(g00.l, java.util.List):void type: CONSTRUCTOR)
                          (wrap: r0.a : 0x002c: INVOKE  (r7v0 r0.a A[REMOVE]) = 
                          (699646206 int)
                          true
                          (wrap: g00.r<y.k, java.lang.Integer, androidx.compose.runtime.a, java.lang.Integer, wz.p> : 0x0025: CONSTRUCTOR  (r1v2 g00.r<y.k, java.lang.Integer, androidx.compose.runtime.a, java.lang.Integer, wz.p> A[REMOVE]) = 
                          (r10v0 'list2' java.util.List<g9.d> A[DONT_INLINE])
                          (r11v0 'bool4' java.lang.Boolean A[DONT_INLINE])
                          (r12v0 'commercialTabName4' commercial.CommercialTabName A[DONT_INLINE])
                          (r13v0 'lVar2' g00.l<com.forsale.analytics.commercial.CommercialPageSource, wz.p> A[DONT_INLINE])
                          (r14v0 'context2' android.content.Context A[DONT_INLINE])
                          (r15v0 'i13' int A[DONT_INLINE])
                         call: com.forsale.adserver.view.screens.ui.CommercialOffersSectionKt$CommercialOffersSection$1$1$invoke$$inlined$items$default$5.<init>(java.util.List, java.lang.Boolean, commercial.CommercialTabName, g00.l, android.content.Context, int):void type: CONSTRUCTOR)
                         type: STATIC call: r0.b.c(int, boolean, java.lang.Object):r0.a)
                         type: INTERFACE call: androidx.compose.foundation.lazy.grid.LazyGridScope.k(int, g00.l, g00.p, g00.l, g00.r):void in method: com.forsale.adserver.view.screens.ui.CommercialOffersSectionKt$CommercialOffersSection$1$1.b(androidx.compose.foundation.lazy.grid.LazyGridScope):void, file: classes2.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:309)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:272)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
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
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.adserver.view.screens.ui.CommercialOffersSectionKt$CommercialOffersSection$1$1$invoke$$inlined$items$default$4, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:144)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:120)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1097)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:872)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:421)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                        	... 15 more
                        */
                    /*
                        this = this;
                        r0 = r16
                        java.lang.String r1 = "$this$LazyVerticalGrid"
                        r8 = r17
                        kotlin.jvm.internal.o.i(r8, r1)
                        java.util.List<g9.d> r10 = r1
                        java.lang.Boolean r11 = r2
                        commercial.CommercialTabName r12 = r3
                        g00.l<com.forsale.analytics.commercial.CommercialPageSource, wz.p> r13 = r4
                        android.content.Context r14 = r5
                        int r15 = r6
                        com.forsale.adserver.view.screens.ui.CommercialOffersSectionKt$CommercialOffersSection$1$1$invoke$$inlined$items$default$1 r1 = com.forsale.adserver.view.screens.ui.CommercialOffersSectionKt$CommercialOffersSection$1$1$invoke$$inlined$items$default$1.f21511a
                        int r3 = r10.size()
                        r4 = 0
                        r5 = 0
                        com.forsale.adserver.view.screens.ui.CommercialOffersSectionKt$CommercialOffersSection$1$1$invoke$$inlined$items$default$4 r6 = new com.forsale.adserver.view.screens.ui.CommercialOffersSectionKt$CommercialOffersSection$1$1$invoke$$inlined$items$default$4
                        r6.<init>(r1, r10)
                        com.forsale.adserver.view.screens.ui.CommercialOffersSectionKt$CommercialOffersSection$1$1$invoke$$inlined$items$default$5 r1 = new com.forsale.adserver.view.screens.ui.CommercialOffersSectionKt$CommercialOffersSection$1$1$invoke$$inlined$items$default$5
                        r9 = r1
                        r9.<init>(r10, r11, r12, r13, r14, r15)
                        r2 = 699646206(0x29b3c0fe, float:7.982676E-14)
                        r9 = 1
                        r0.a r7 = r0.b.c(r2, r9, r1)
                        r2 = r17
                        r2.k(r3, r4, r5, r6, r7)
                        r3 = 0
                        com.forsale.adserver.view.screens.ui.CommercialOffersSectionKt$CommercialOffersSection$1$1$2 r1 = new com.forsale.adserver.view.screens.ui.CommercialOffersSectionKt$CommercialOffersSection$1$1$2
                        g00.a<wz.p> r2 = r7
                        int r6 = r6
                        r1.<init>()
                        r2 = -737570931(0xffffffffd4098f8d, float:-2.36327561E12)
                        r0.a r6 = r0.b.c(r2, r9, r1)
                        r7 = 7
                        r1 = 0
                        r2 = r17
                        r8 = r1
                        androidx.compose.foundation.lazy.grid.LazyGridScope.d(r2, r3, r4, r5, r6, r7, r8)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.adserver.view.screens.ui.CommercialOffersSectionKt$CommercialOffersSection$1$1.b(androidx.compose.foundation.lazy.grid.LazyGridScope):void");
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(LazyGridScope lazyGridScope) {
                    b(lazyGridScope);
                    return p.f75480a;
                }
            };
            lazyGridState = b11;
            aVar2 = null;
            aVar3 = h11;
            LazyGridDslKt.b(c0936a, m11, lazyGridState, e11, false, o12, o11, null, false, lVar, aVar3, 1772592, 400);
            p pVar = p.f75480a;
        }
        aVar3.S();
        aVar3.C(1157296644);
        boolean T = aVar3.T(lazyGridState);
        Object D = aVar3.D();
        if (T || D == androidx.compose.runtime.a.f7182a.a()) {
            D = new CommercialOffersSectionKt$CommercialOffersSection$2$1(lazyGridState, aVar2);
            aVar3.u(D);
        }
        aVar3.S();
        j0.u.d(list, (g00.p) D, aVar3, 72);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = aVar3.l();
        if (l11 != null) {
            final Boolean bool4 = bool2;
            final CommercialTabName commercialTabName4 = commercialTabName2;
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.adserver.view.screens.ui.CommercialOffersSectionKt$CommercialOffersSection$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar4, int i13) {
                    CommercialOffersSectionKt.f(list, checkAllOffersClicked, bool4, commercialTabName4, onOfferSupportItemClicked, aVar4, v0.a(i11 | 1), i12);
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }
}
