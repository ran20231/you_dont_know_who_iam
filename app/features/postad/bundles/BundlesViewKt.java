package com.forsale.app.features.postad.bundles;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.o;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.IconKt;
import androidx.compose.material.RadioButtonKt;
import androidx.compose.material.d0;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.z;
import androidx.compose.ui.c;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import b1.t1;
import coil.compose.SingletonAsyncImageKt;
import com.forsale.app.datalayer.network.responses.Addon;
import com.forsale.app.datalayer.network.responses.Bundle;
import com.forsale.app.datalayer.network.responses.BundleFeature;
import com.forsale.app.features.postad.bundles.b;
import com.forsale.app.utils.TypeExtensionsKt;
import com.forsale.app.utils.composeUtils.TestTagIdKt;
import com.forsale.designSystem.ClickableSingleKt;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.buttons.ButtonsKt;
import com.forsale.designSystem.dividers.DividersKt;
import com.forsale.ui.components.StateKt;
import com.google.logging.type.LogSeverity;
import e2.v;
import g00.l;
import g00.q;
import j0.d1;
import j0.e1;
import j0.k;
import j0.n1;
import j0.v0;
import java.util.List;
import t9.q0;
import t9.y0;
import tv.teads.sdk.engine.bridges.network.NetworkResponse;
import v0.b;
import w.t;
import w.u;
import wz.p;
/* compiled from: BundlesView.kt */
/* loaded from: classes2.dex */
public final class BundlesViewKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final g00.a<p> aVar, final String str, final boolean z11, androidx.compose.runtime.a aVar2, final int i11) {
        int i12;
        androidx.compose.runtime.a aVar3;
        int i13;
        int i14;
        int i15;
        androidx.compose.runtime.a h11 = aVar2.h(-1482727156);
        if ((i11 & 14) == 0) {
            if (h11.F(aVar)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.T(str)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 896) == 0) {
            if (h11.a(z11)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        final int i16 = i12;
        if ((i16 & 731) == 146 && h11.i()) {
            h11.L();
            aVar3 = h11;
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-1482727156, i16, -1, "com.forsale.app.features.postad.bundles.ActionButton (BundlesView.kt:452)");
            }
            DividersKt.a(null, 0.0f, 0L, h11, 0, 7);
            c.a aVar4 = androidx.compose.ui.c.f7566a;
            androidx.compose.ui.c b11 = BackgroundKt.b(SizeKt.h(aVar4, 0.0f, 1, null), dk.a.f54291a.a(h11, dk.a.f54292b).g().c(h11, yj.d.f76453b), null, 2, null);
            h11.C(693286680);
            Arrangement arrangement = Arrangement.f3698a;
            Arrangement.e g11 = arrangement.g();
            b.a aVar5 = v0.b.f74009a;
            a0 a11 = o.a(g11, aVar5.l(), h11, 0);
            h11.C(-1323940314);
            int a12 = j0.e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(b11);
            if (!(h11.k() instanceof j0.d)) {
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
            if (a14.f() || !kotlin.jvm.internal.o.d(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.p(Integer.valueOf(a12), b12);
            }
            c11.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            u uVar = u.f74924a;
            androidx.compose.ui.c i17 = PaddingKt.i(SizeKt.h(aVar4, 0.0f, 1, null), e2.h.l(24));
            h11.C(-483455358);
            a0 a15 = androidx.compose.foundation.layout.e.a(arrangement.h(), aVar5.k(), h11, 0);
            h11.C(-1323940314);
            int a16 = j0.e.a(h11, 0);
            k s12 = h11.s();
            g00.a<ComposeUiNode> a17 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c12 = LayoutKt.c(i17);
            if (!(h11.k() instanceof j0.d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a17);
            } else {
                h11.t();
            }
            androidx.compose.runtime.a a18 = Updater.a(h11);
            Updater.c(a18, a15, companion.e());
            Updater.c(a18, s12, companion.g());
            g00.p<ComposeUiNode, Integer, p> b13 = companion.b();
            if (a18.f() || !kotlin.jvm.internal.o.d(a18.D(), Integer.valueOf(a16))) {
                a18.u(Integer.valueOf(a16));
                a18.p(Integer.valueOf(a16), b13);
            }
            c12.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            w.f fVar = w.f.f74891a;
            aVar3 = h11;
            ButtonsKt.d(aVar, TestTagIdKt.a(SizeKt.h(aVar4, 0.0f, 1, null), BundlesSemantics.NextStepCTA.getTestTag()), null, null, null, null, null, z11, null, null, r0.b.b(h11, 2115835714, true, new q<t, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.postad.bundles.BundlesViewKt$ActionButton$1$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                public final void b(t FilledButton, androidx.compose.runtime.a aVar6, int i18) {
                    kotlin.jvm.internal.o.i(FilledButton, "$this$FilledButton");
                    if ((i18 & 81) == 16 && aVar6.i()) {
                        aVar6.L();
                        return;
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(2115835714, i18, -1, "com.forsale.app.features.postad.bundles.ActionButton.<anonymous>.<anonymous>.<anonymous> (BundlesView.kt:471)");
                    }
                    TextKt.a(str, null, 0, 0, false, 0, 0, null, null, 0L, 0, aVar6, (i16 >> 3) & 14, 0, 2046);
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                }

                @Override // g00.q
                public /* bridge */ /* synthetic */ p invoke(t tVar, androidx.compose.runtime.a aVar6, Integer num) {
                    b(tVar, aVar6, num.intValue());
                    return p.f75480a;
                }
            }), h11, (i16 & 14) | ((i16 << 15) & 29360128), 6, 892);
            aVar3.S();
            aVar3.w();
            aVar3.S();
            aVar3.S();
            aVar3.S();
            aVar3.w();
            aVar3.S();
            aVar3.S();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = aVar3.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.postad.bundles.BundlesViewKt$ActionButton$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar6, int i18) {
                    BundlesViewKt.a(aVar, str, z11, aVar6, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar6, Integer num) {
                    b(aVar6, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final java.lang.String r27, final java.lang.String r28, com.forsale.app.datalayer.network.responses.Hint r29, androidx.compose.runtime.a r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 773
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.bundles.BundlesViewKt.b(java.lang.String, java.lang.String, com.forsale.app.datalayer.network.responses.Hint, androidx.compose.runtime.a, int, int):void");
    }

    public static final void c(androidx.compose.ui.c cVar, final Bundle bundle, final boolean z11, final String currency, final g00.p<? super String, ? super String, p> onDoubleViewClicked, androidx.compose.runtime.a aVar, final int i11, final int i12) {
        c.a aVar2;
        long d11;
        String recommended;
        kotlin.jvm.internal.o.i(bundle, "bundle");
        kotlin.jvm.internal.o.i(currency, "currency");
        kotlin.jvm.internal.o.i(onDoubleViewClicked, "onDoubleViewClicked");
        androidx.compose.runtime.a h11 = aVar.h(951314911);
        if ((i12 & 1) != 0) {
            aVar2 = androidx.compose.ui.c.f7566a;
        } else {
            aVar2 = cVar;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(951314911, i11, -1, "com.forsale.app.features.postad.bundles.BundleCard (BundlesView.kt:217)");
        }
        if (z11) {
            h11.C(-496266500);
            d11 = dk.a.f54291a.a(h11, dk.a.f54292b).f().i(h11, yj.d.f76453b);
        } else {
            h11.C(-496266452);
            d11 = dk.a.f54291a.a(h11, dk.a.f54292b).e().d(h11, yj.d.f76453b);
        }
        h11.S();
        n1<t1> a11 = q.p.a(d11, null, "borderColor", null, h11, 384, 10);
        h11.C(733328855);
        c.a aVar3 = androidx.compose.ui.c.f7566a;
        b.a aVar4 = v0.b.f74009a;
        a0 g11 = BoxKt.g(aVar4.o(), false, h11, 0);
        h11.C(-1323940314);
        int a12 = j0.e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(aVar3);
        if (!(h11.k() instanceof j0.d)) {
            j0.e.c();
        }
        h11.I();
        if (h11.f()) {
            h11.y(a13);
        } else {
            h11.t();
        }
        androidx.compose.runtime.a a14 = Updater.a(h11);
        Updater.c(a14, g11, companion.e());
        Updater.c(a14, s11, companion.g());
        g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
        if (a14.f() || !kotlin.jvm.internal.o.d(a14.D(), Integer.valueOf(a12))) {
            a14.u(Integer.valueOf(a12));
            a14.p(Integer.valueOf(a12), b11);
        }
        c11.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
        float f11 = 8;
        androidx.compose.ui.c i13 = PaddingKt.i(BorderKt.f(BackgroundKt.a(SizeKt.h(aVar2, 0.0f, 1, null), dk.a.f54291a.a(h11, dk.a.f54292b).g().c(h11, yj.d.f76453b), c0.g.c(e2.h.l(f11))), e2.h.l(1), d(a11), c0.g.c(e2.h.l(f11))), e2.h.l(12));
        Arrangement.f o11 = Arrangement.f3698a.o(e2.h.l(f11));
        h11.C(-483455358);
        a0 a15 = androidx.compose.foundation.layout.e.a(o11, aVar4.k(), h11, 6);
        h11.C(-1323940314);
        int a16 = j0.e.a(h11, 0);
        k s12 = h11.s();
        g00.a<ComposeUiNode> a17 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c12 = LayoutKt.c(i13);
        if (!(h11.k() instanceof j0.d)) {
            j0.e.c();
        }
        h11.I();
        if (h11.f()) {
            h11.y(a17);
        } else {
            h11.t();
        }
        androidx.compose.runtime.a a18 = Updater.a(h11);
        Updater.c(a18, a15, companion.e());
        Updater.c(a18, s12, companion.g());
        g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
        if (a18.f() || !kotlin.jvm.internal.o.d(a18.D(), Integer.valueOf(a16))) {
            a18.u(Integer.valueOf(a16));
            a18.p(Integer.valueOf(a16), b12);
        }
        c12.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        w.f fVar = w.f.f74891a;
        f(z11, bundle, currency, h11, ((i11 >> 6) & 14) | 64 | ((i11 >> 3) & 896));
        DividersKt.a(null, 0.0f, 0L, h11, 0, 7);
        e(bundle, onDoubleViewClicked, h11, ((i11 >> 9) & 112) | 8);
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        h11.C(-496265694);
        if (bundle.getHasTag() && (recommended = bundle.getRecommended()) != null) {
            BundleCardTagKt.a(OffsetKt.b(aVar3, e2.h.l(0), e2.h.l(-10)), recommended, h11, 6, 0);
        }
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
            final androidx.compose.ui.c cVar2 = aVar2;
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.postad.bundles.BundlesViewKt$BundleCard$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar5, int i14) {
                    BundlesViewKt.c(androidx.compose.ui.c.this, bundle, z11, currency, onDoubleViewClicked, aVar5, v0.a(i11 | 1), i12);
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar5, Integer num) {
                    b(aVar5, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    private static final long d(n1<t1> n1Var) {
        return n1Var.getValue().y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(final Bundle bundle, final g00.p<? super String, ? super String, p> pVar, androidx.compose.runtime.a aVar, final int i11) {
        String visibilityLink;
        androidx.compose.runtime.a h11 = aVar.h(613876160);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(613876160, i11, -1, "com.forsale.app.features.postad.bundles.BundleCardContent (BundlesView.kt:258)");
        }
        b.a aVar2 = v0.b.f74009a;
        b.c i12 = aVar2.i();
        Arrangement arrangement = Arrangement.f3698a;
        float f11 = 8;
        Arrangement.f o11 = arrangement.o(e2.h.l(f11));
        h11.C(693286680);
        c.a aVar3 = androidx.compose.ui.c.f7566a;
        a0 a11 = o.a(o11, i12, h11, 54);
        h11.C(-1323940314);
        int a12 = j0.e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(aVar3);
        if (!(h11.k() instanceof j0.d)) {
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
        if (a14.f() || !kotlin.jvm.internal.o.d(a14.D(), Integer.valueOf(a12))) {
            a14.u(Integer.valueOf(a12));
            a14.p(Integer.valueOf(a12), b11);
        }
        c11.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        androidx.compose.ui.c d11 = t.d(u.f74924a, PaddingKt.m(aVar3, e2.h.l(4), 0.0f, 0.0f, 0.0f, 14, null), 0.7f, false, 2, null);
        Arrangement.m q11 = arrangement.q(e2.h.l(f11), aVar2.l());
        b.InterfaceC0889b k11 = aVar2.k();
        h11.C(-483455358);
        a0 a15 = androidx.compose.foundation.layout.e.a(q11, k11, h11, 54);
        h11.C(-1323940314);
        int a16 = j0.e.a(h11, 0);
        k s12 = h11.s();
        g00.a<ComposeUiNode> a17 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c12 = LayoutKt.c(d11);
        if (!(h11.k() instanceof j0.d)) {
            j0.e.c();
        }
        h11.I();
        if (h11.f()) {
            h11.y(a17);
        } else {
            h11.t();
        }
        androidx.compose.runtime.a a18 = Updater.a(h11);
        Updater.c(a18, a15, companion.e());
        Updater.c(a18, s12, companion.g());
        g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
        if (a18.f() || !kotlin.jvm.internal.o.d(a18.D(), Integer.valueOf(a16))) {
            a18.u(Integer.valueOf(a16));
            a18.p(Integer.valueOf(a16), b12);
        }
        c12.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        w.f fVar = w.f.f74891a;
        List<BundleFeature> bundleFeatures = bundle.getBundleFeatures();
        h11.C(-163523478);
        if (bundleFeatures != null) {
            for (BundleFeature bundleFeature : bundleFeatures) {
                b(bundleFeature.getName(), bundleFeature.getImage(), null, h11, 0, 4);
            }
        }
        h11.S();
        List<Addon> addons = bundle.getAddons();
        h11.C(-1821673411);
        if (addons != null) {
            for (Addon addon : addons) {
                b(addon.getName(), addon.getImage(), addon.getHint(), h11, 0, 0);
            }
        }
        h11.S();
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        h11.C(-2048855401);
        if (bundle.getHasViews() && (visibilityLink = bundle.getVisibilityLink()) != null) {
            Integer views = bundle.getViews();
            kotlin.jvm.internal.o.f(views);
            k(visibilityLink, views.intValue(), bundle.getBadgeUrl(), pVar, h11, (i11 << 6) & 7168);
        }
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
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.postad.bundles.BundlesViewKt$BundleCardContent$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar4, int i13) {
                    BundlesViewKt.e(Bundle.this, pVar, aVar4, v0.a(i11 | 1));
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
    public static final void f(final boolean z11, final Bundle bundle, final String str, androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a h11 = aVar.h(-1246094877);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-1246094877, i11, -1, "com.forsale.app.features.postad.bundles.BundleCardHeader (BundlesView.kt:356)");
        }
        b.c i12 = v0.b.f74009a.i();
        h11.C(693286680);
        c.a aVar3 = androidx.compose.ui.c.f7566a;
        a0 a11 = o.a(Arrangement.f3698a.g(), i12, h11, 48);
        h11.C(-1323940314);
        int a12 = j0.e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(aVar3);
        if (!(h11.k() instanceof j0.d)) {
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
        if (a14.f() || !kotlin.jvm.internal.o.d(a14.D(), Integer.valueOf(a12))) {
            a14.u(Integer.valueOf(a12));
            a14.p(Integer.valueOf(a12), b11);
        }
        c11.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        u uVar = u.f74924a;
        d0 d0Var = d0.f6593a;
        dk.a aVar4 = dk.a.f54291a;
        int i13 = dk.a.f54292b;
        yj.d f11 = aVar4.a(h11, i13).f();
        int i14 = yj.d.f76453b;
        RadioButtonKt.a(z11, null, null, false, null, d0Var.a(f11.i(h11, i14), aVar4.a(h11, i13).e().g(h11, i14), 0L, h11, (d0.f6594b | 0) << 9, 4), h11, (i11 & 14) | 48, 28);
        SpacerKt.a(SizeKt.u(aVar3, e2.h.l(12)), h11, 6);
        TextKt.a(bundle.getName(), null, 0, 0, false, 0, 0, null, aVar4.c(h11, i13).l(), aVar4.a(h11, i13).e().m(h11, i14), 0, h11, 0, 0, 1278);
        SpacerKt.a(t.d(uVar, aVar3, 1.0f, false, 2, null), h11, 0);
        h11.C(-360848671);
        if (!TypeExtensionsKt.i0(bundle.isFree())) {
            TextKt.a(TypeExtensionsKt.p(bundle.getPrice()), uVar.b(aVar3), 0, 0, false, 0, 0, null, aVar4.c(h11, i13).l(), aVar4.a(h11, i13).e().m(h11, i14), 0, h11, 0, 0, 1276);
            SpacerKt.a(SizeKt.u(aVar3, e2.h.l(4)), h11, 6);
            aVar2 = h11;
            TextKt.a(str, uVar.b(aVar3), 0, 0, false, 0, 0, null, aVar4.c(h11, i13).b(), aVar4.a(h11, i13).e().j(h11, i14), 0, h11, (i11 >> 6) & 14, 0, 1276);
        } else {
            aVar2 = h11;
        }
        aVar2.S();
        aVar2.S();
        aVar2.w();
        aVar2.S();
        aVar2.S();
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = aVar2.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.postad.bundles.BundlesViewKt$BundleCardHeader$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar5, int i15) {
                    BundlesViewKt.f(z11, bundle, str, aVar5, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar5, Integer num) {
                    b(aVar5, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(final boolean z11, final g00.a<p> aVar, final g00.a<p> aVar2, androidx.compose.runtime.a aVar3, final int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        androidx.compose.runtime.a h11 = aVar3.h(-318619254);
        if ((i11 & 14) == 0) {
            if (h11.a(z11)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.F(aVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 896) == 0) {
            if (h11.F(aVar2)) {
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
                androidx.compose.runtime.c.U(-318619254, i12, -1, "com.forsale.app.features.postad.bundles.BundleErrorView (BundlesView.kt:438)");
            }
            if (z11) {
                h11.C(463526728);
                h11.C(1157296644);
                boolean T = h11.T(aVar);
                Object D = h11.D();
                if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                    D = new g00.a<p>() { // from class: com.forsale.app.features.postad.bundles.BundlesViewKt$BundleErrorView$1$1
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
                            aVar.invoke();
                        }
                    };
                    h11.u(D);
                }
                h11.S();
                StateKt.a(null, 0, 0, 0, (g00.a) D, h11, 0, 15);
                h11.S();
            } else {
                h11.C(463526801);
                h11.C(1157296644);
                boolean T2 = h11.T(aVar2);
                Object D2 = h11.D();
                if (T2 || D2 == androidx.compose.runtime.a.f7182a.a()) {
                    D2 = new g00.a<p>() { // from class: com.forsale.app.features.postad.bundles.BundlesViewKt$BundleErrorView$2$1
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
                            aVar2.invoke();
                        }
                    };
                    h11.u(D2);
                }
                h11.S();
                StateKt.b(null, null, 0, 0, 0, (g00.a) D2, h11, 0, 31);
                h11.S();
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.postad.bundles.BundlesViewKt$BundleErrorView$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar4, int i16) {
                    BundlesViewKt.g(z11, aVar, aVar2, aVar4, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void h(final PostAdBundlesViewModel viewModel, final l<? super Bundle, p> onBundleSelection, final g00.p<? super String, ? super String, p> onDoubleViewClicked, final g00.a<p> onOldExperienceClicked, final g00.a<p> onNextButtonClicked, final String nextButtonText, final boolean z11, final boolean z12, androidx.compose.runtime.a aVar, final int i11) {
        kotlin.jvm.internal.o.i(viewModel, "viewModel");
        kotlin.jvm.internal.o.i(onBundleSelection, "onBundleSelection");
        kotlin.jvm.internal.o.i(onDoubleViewClicked, "onDoubleViewClicked");
        kotlin.jvm.internal.o.i(onOldExperienceClicked, "onOldExperienceClicked");
        kotlin.jvm.internal.o.i(onNextButtonClicked, "onNextButtonClicked");
        kotlin.jvm.internal.o.i(nextButtonText, "nextButtonText");
        androidx.compose.runtime.a h11 = aVar.h(2116071027);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(2116071027, i11, -1, "com.forsale.app.features.postad.bundles.BundlesView (BundlesView.kt:72)");
        }
        n1 b11 = z.b(viewModel.v(), null, h11, 8, 1);
        n1 b12 = z.b(viewModel.B(), null, h11, 8, 1);
        b i12 = i(b11);
        if (kotlin.jvm.internal.o.d(i12, b.C0393b.f35065a)) {
            h11.C(-1135850920);
            h11.S();
            x10.a.b("Bundle: Idle", new Object[0]);
        } else if (kotlin.jvm.internal.o.d(i12, b.c.f35066a)) {
            h11.C(-1135850838);
            BundlesShimmerKt.c(h11, 0);
            h11.S();
        } else if (i12 instanceof b.a) {
            h11.C(-1135850757);
            b i13 = i(b11);
            kotlin.jvm.internal.o.g(i13, "null cannot be cast to non-null type com.forsale.app.features.postad.bundles.BundlesState.Error");
            g(((b.a) i13).a(), new g00.a<p>() { // from class: com.forsale.app.features.postad.bundles.BundlesViewKt$BundlesView$1
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
                    PostAdBundlesViewModel.this.K();
                }
            }, new g00.a<p>() { // from class: com.forsale.app.features.postad.bundles.BundlesViewKt$BundlesView$2
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
                    PostAdBundlesViewModel.this.K();
                }
            }, h11, 0);
            h11.S();
        } else if (i12 instanceof b.d) {
            h11.C(-1135850420);
            b i14 = i(b11);
            kotlin.jvm.internal.o.g(i14, "null cannot be cast to non-null type com.forsale.app.features.postad.bundles.BundlesState.Success");
            int i15 = i11 << 6;
            l(((b.d) i14).a(), onBundleSelection, j(b12), onOldExperienceClicked, (String) z.b(viewModel.w(), null, h11, 8, 1).getValue(), new g00.p<String, String, p>() { // from class: com.forsale.app.features.postad.bundles.BundlesViewKt$BundlesView$3
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(2);
                }

                public final void b(String title, String url) {
                    kotlin.jvm.internal.o.i(title, "title");
                    kotlin.jvm.internal.o.i(url, "url");
                    PostAdBundlesViewModel.this.F(title, url);
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(String str, String str2) {
                    b(str, str2);
                    return p.f75480a;
                }
            }, onNextButtonClicked, nextButtonText, z11, z12, h11, (i11 & 112) | NetworkResponse.UNKNOWN_ERROR_CODE | (i11 & 7168) | (3670016 & i15) | (29360128 & i15) | (234881024 & i15) | (i15 & 1879048192));
            h11.S();
        } else {
            h11.C(-1135849680);
            h11.S();
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.postad.bundles.BundlesViewKt$BundlesView$4
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i16) {
                    BundlesViewKt.h(PostAdBundlesViewModel.this, onBundleSelection, onDoubleViewClicked, onOldExperienceClicked, onNextButtonClicked, nextButtonText, z11, z12, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    private static final b i(n1<? extends b> n1Var) {
        return n1Var.getValue();
    }

    private static final Bundle j(n1<Bundle> n1Var) {
        return n1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(final String str, final int i11, final String str2, final g00.p<? super String, ? super String, p> pVar, androidx.compose.runtime.a aVar, final int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        androidx.compose.runtime.a h11 = aVar.h(996185665);
        if ((i12 & 14) == 0) {
            if (h11.T(str)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i13 = i17 | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            if (h11.d(i11)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i13 |= i16;
        }
        if ((i12 & 896) == 0) {
            if (h11.T(str2)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i13 |= i15;
        }
        if ((i12 & 7168) == 0) {
            if (h11.F(pVar)) {
                i14 = RecyclerView.l.FLAG_MOVED;
            } else {
                i14 = 1024;
            }
            i13 |= i14;
        }
        int i18 = i13;
        if ((i18 & 5851) == 1170 && h11.i()) {
            h11.L();
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(996185665, i18, -1, "com.forsale.app.features.postad.bundles.DoubleViews (BundlesView.kt:297)");
            }
            final Context context = (Context) h11.q(AndroidCompositionLocals_androidKt.g());
            c.a aVar2 = androidx.compose.ui.c.f7566a;
            androidx.compose.ui.c a11 = ClickableSingleKt.a(aVar2, false, null, null, null, null, new g00.a<p>() { // from class: com.forsale.app.features.postad.bundles.BundlesViewKt$DoubleViews$1
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
                    g00.p<String, String, p> pVar2 = pVar;
                    String string = context.getString(y0.f70489ha);
                    kotlin.jvm.internal.o.h(string, "getString(...)");
                    pVar2.invoke(string, str);
                }
            }, h11, 24582, 23);
            Arrangement arrangement = Arrangement.f3698a;
            Arrangement.m h12 = arrangement.h();
            b.a aVar3 = v0.b.f74009a;
            b.InterfaceC0889b g11 = aVar3.g();
            h11.C(-483455358);
            a0 a12 = androidx.compose.foundation.layout.e.a(h12, g11, h11, 54);
            h11.C(-1323940314);
            int a13 = j0.e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a14 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(a11);
            if (!(h11.k() instanceof j0.d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a14);
            } else {
                h11.t();
            }
            androidx.compose.runtime.a a15 = Updater.a(h11);
            Updater.c(a15, a12, companion.e());
            Updater.c(a15, s11, companion.g());
            g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
            if (a15.f() || !kotlin.jvm.internal.o.d(a15.D(), Integer.valueOf(a13))) {
                a15.u(Integer.valueOf(a13));
                a15.p(Integer.valueOf(a13), b11);
            }
            c11.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            w.f fVar = w.f.f74891a;
            v0.b e11 = aVar3.e();
            h11.C(733328855);
            a0 g12 = BoxKt.g(e11, false, h11, 6);
            h11.C(-1323940314);
            int a16 = j0.e.a(h11, 0);
            k s12 = h11.s();
            g00.a<ComposeUiNode> a17 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c12 = LayoutKt.c(aVar2);
            if (!(h11.k() instanceof j0.d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a17);
            } else {
                h11.t();
            }
            androidx.compose.runtime.a a18 = Updater.a(h11);
            Updater.c(a18, g12, companion.e());
            Updater.c(a18, s12, companion.g());
            g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
            if (a18.f() || !kotlin.jvm.internal.o.d(a18.D(), Integer.valueOf(a16))) {
                a18.u(Integer.valueOf(a16));
                a18.p(Integer.valueOf(a16), b12);
            }
            c12.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
            SingletonAsyncImageKt.a(str2, p1.g.b(y0.f70489ha, h11, 0), SizeKt.u(aVar2, e2.h.l(80)), null, null, null, null, 0.0f, null, 0, h11, ((i18 >> 6) & 14) | 384, 1016);
            b.c i19 = aVar3.i();
            androidx.compose.ui.c e12 = boxScopeInstance.e(aVar2, aVar3.b());
            h11.C(693286680);
            a0 a19 = o.a(arrangement.g(), i19, h11, 48);
            h11.C(-1323940314);
            int a21 = j0.e.a(h11, 0);
            k s13 = h11.s();
            g00.a<ComposeUiNode> a22 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c13 = LayoutKt.c(e12);
            if (!(h11.k() instanceof j0.d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a22);
            } else {
                h11.t();
            }
            androidx.compose.runtime.a a23 = Updater.a(h11);
            Updater.c(a23, a19, companion.e());
            Updater.c(a23, s13, companion.g());
            g00.p<ComposeUiNode, Integer, p> b13 = companion.b();
            if (a23.f() || !kotlin.jvm.internal.o.d(a23.D(), Integer.valueOf(a21))) {
                a23.u(Integer.valueOf(a21));
                a23.p(Integer.valueOf(a21), b13);
            }
            c13.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            u uVar = u.f74924a;
            Painter d11 = p1.e.d(q0.X, h11, 0);
            dk.a aVar4 = dk.a.f54291a;
            int i21 = dk.a.f54292b;
            yj.d e13 = aVar4.a(h11, i21).e();
            int i22 = yj.d.f76453b;
            IconKt.a(d11, null, null, e13.j(h11, i22), h11, 56, 4);
            float f11 = 2;
            SpacerKt.a(SizeKt.u(aVar2, e2.h.l(f11)), h11, 6);
            TextKt.a(TypeExtensionsKt.p(i11), null, 0, 0, false, 0, 0, null, aVar4.c(h11, i21).l(), aVar4.a(h11, i21).h().j(h11, i22), 0, h11, 0, 0, 1278);
            SpacerKt.a(SizeKt.u(aVar2, e2.h.l(10)), h11, 6);
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            SpacerKt.a(SizeKt.i(aVar2, e2.h.l(f11)), h11, 6);
            String b14 = p1.g.b(y0.f70489ha, h11, 0);
            androidx.compose.ui.text.a0 h13 = aVar4.c(h11, i21).h();
            androidx.compose.material.TextKt.b(b14, null, aVar4.a(h11, i21).e().m(h11, i22), v.d(10), null, new androidx.compose.ui.text.font.p(LogSeverity.ERROR_VALUE), w1.d.a(androidx.compose.ui.text.font.h.b(sj.e.f68693d, null, 0, 0, 14, null)), 0L, b2.g.f16090b.d(), null, 0L, 0, false, 1, 0, null, h13, h11, 100862976, 3072, 56978);
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.postad.bundles.BundlesViewKt$DoubleViews$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar5, int i23) {
                    BundlesViewKt.k(str, i11, str2, pVar, aVar5, v0.a(i12 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar5, Integer num) {
                    b(aVar5, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(final List<Bundle> list, final l<? super Bundle, p> lVar, final Bundle bundle, final g00.a<p> aVar, final String str, final g00.p<? super String, ? super String, p> pVar, final g00.a<p> aVar2, final String str2, final boolean z11, final boolean z12, androidx.compose.runtime.a aVar3, final int i11) {
        androidx.compose.runtime.a h11 = aVar3.h(839063643);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(839063643, i11, -1, "com.forsale.app.features.postad.bundles.ScreenContent (BundlesView.kt:127)");
        }
        c.a aVar4 = androidx.compose.ui.c.f7566a;
        androidx.compose.ui.c f11 = SizeKt.f(aVar4, 0.0f, 1, null);
        h11.C(-483455358);
        Arrangement arrangement = Arrangement.f3698a;
        a0 a11 = androidx.compose.foundation.layout.e.a(arrangement.h(), v0.b.f74009a.k(), h11, 0);
        h11.C(-1323940314);
        int a12 = j0.e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(f11);
        if (!(h11.k() instanceof j0.d)) {
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
        if (a14.f() || !kotlin.jvm.internal.o.d(a14.D(), Integer.valueOf(a12))) {
            a14.u(Integer.valueOf(a12));
            a14.p(Integer.valueOf(a12), b11);
        }
        c11.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        w.f fVar = w.f.f74891a;
        LazyDslKt.a(w.e.c(fVar, aVar4, 1.0f, false, 2, null), null, null, false, arrangement.o(e2.h.l(12)), null, null, false, new l<LazyListScope, p>() { // from class: com.forsale.app.features.postad.bundles.BundlesViewKt$ScreenContent$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final void b(LazyListScope LazyColumn) {
                kotlin.jvm.internal.o.i(LazyColumn, "$this$LazyColumn");
                ComposableSingletons$BundlesViewKt composableSingletons$BundlesViewKt = ComposableSingletons$BundlesViewKt.f34929a;
                LazyListScope.l(LazyColumn, null, null, composableSingletons$BundlesViewKt.a(), 3, null);
                final List<Bundle> list2 = list;
                final Bundle bundle2 = bundle;
                final String str3 = str;
                final g00.p<String, String, p> pVar2 = pVar;
                final int i12 = i11;
                final l<Bundle, p> lVar2 = lVar;
                final BundlesViewKt$ScreenContent$1$1$invoke$$inlined$items$default$1 bundlesViewKt$ScreenContent$1$1$invoke$$inlined$items$default$1 = BundlesViewKt$ScreenContent$1$1$invoke$$inlined$items$default$1.f34830a;
                LazyColumn.f(list2.size(), null, 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003e: INVOKE  
                      (r17v0 'LazyColumn' androidx.compose.foundation.lazy.LazyListScope)
                      (wrap: int : 0x0026: INVOKE  (r2v1 int A[REMOVE]) = (r10v0 'list2' java.util.List<com.forsale.app.datalayer.network.responses.Bundle>) type: INTERFACE call: java.util.List.size():int)
                      (null g00.l<? super java.lang.Integer, ? extends java.lang.Object>)
                      (wrap: g00.l<java.lang.Integer, java.lang.Object> : 0x002c: CONSTRUCTOR  (r3v1 g00.l<java.lang.Integer, java.lang.Object> A[REMOVE]) = 
                      (r1v2 'bundlesViewKt$ScreenContent$1$1$invoke$$inlined$items$default$1' com.forsale.app.features.postad.bundles.BundlesViewKt$ScreenContent$1$1$invoke$$inlined$items$default$1 A[DONT_INLINE])
                      (r10v0 'list2' java.util.List<com.forsale.app.datalayer.network.responses.Bundle> A[DONT_INLINE])
                     call: com.forsale.app.features.postad.bundles.BundlesViewKt$ScreenContent$1$1$invoke$$inlined$items$default$3.<init>(g00.l, java.util.List):void type: CONSTRUCTOR)
                      (wrap: r0.a : 0x0039: INVOKE  (r1v4 r0.a A[REMOVE]) = 
                      (-632812321 int)
                      true
                      (wrap: g00.r<x.a, java.lang.Integer, androidx.compose.runtime.a, java.lang.Integer, wz.p> : 0x0032: CONSTRUCTOR  (r1v3 g00.r<x.a, java.lang.Integer, androidx.compose.runtime.a, java.lang.Integer, wz.p> A[REMOVE]) = 
                      (r10v0 'list2' java.util.List<com.forsale.app.datalayer.network.responses.Bundle> A[DONT_INLINE])
                      (r11v0 'bundle2' com.forsale.app.datalayer.network.responses.Bundle A[DONT_INLINE])
                      (r12v0 'str3' java.lang.String A[DONT_INLINE])
                      (r13v0 'pVar2' g00.p<java.lang.String, java.lang.String, wz.p> A[DONT_INLINE])
                      (r14v0 'i12' int A[DONT_INLINE])
                      (r15v0 'lVar2' g00.l<com.forsale.app.datalayer.network.responses.Bundle, wz.p> A[DONT_INLINE])
                     call: com.forsale.app.features.postad.bundles.BundlesViewKt$ScreenContent$1$1$invoke$$inlined$items$default$4.<init>(java.util.List, com.forsale.app.datalayer.network.responses.Bundle, java.lang.String, g00.p, int, g00.l):void type: CONSTRUCTOR)
                     type: STATIC call: r0.b.c(int, boolean, java.lang.Object):r0.a)
                     type: INTERFACE call: androidx.compose.foundation.lazy.LazyListScope.f(int, g00.l, g00.l, g00.r):void in method: com.forsale.app.features.postad.bundles.BundlesViewKt$ScreenContent$1$1.b(androidx.compose.foundation.lazy.LazyListScope):void, file: classes2.dex
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.postad.bundles.BundlesViewKt$ScreenContent$1$1$invoke$$inlined$items$default$3, state: NOT_LOADED
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
                    r7 = r17
                    java.lang.String r1 = "$this$LazyColumn"
                    kotlin.jvm.internal.o.i(r7, r1)
                    r2 = 0
                    r3 = 0
                    com.forsale.app.features.postad.bundles.ComposableSingletons$BundlesViewKt r8 = com.forsale.app.features.postad.bundles.ComposableSingletons$BundlesViewKt.f34929a
                    g00.q r4 = r8.a()
                    r5 = 3
                    r6 = 0
                    r1 = r17
                    androidx.compose.foundation.lazy.LazyListScope.l(r1, r2, r3, r4, r5, r6)
                    java.util.List<com.forsale.app.datalayer.network.responses.Bundle> r10 = r1
                    com.forsale.app.datalayer.network.responses.Bundle r11 = r2
                    java.lang.String r12 = r3
                    g00.p<java.lang.String, java.lang.String, wz.p> r13 = r4
                    int r14 = r5
                    g00.l<com.forsale.app.datalayer.network.responses.Bundle, wz.p> r15 = r6
                    com.forsale.app.features.postad.bundles.BundlesViewKt$ScreenContent$1$1$invoke$$inlined$items$default$1 r1 = com.forsale.app.features.postad.bundles.BundlesViewKt$ScreenContent$1$1$invoke$$inlined$items$default$1.f34830a
                    int r2 = r10.size()
                    com.forsale.app.features.postad.bundles.BundlesViewKt$ScreenContent$1$1$invoke$$inlined$items$default$3 r3 = new com.forsale.app.features.postad.bundles.BundlesViewKt$ScreenContent$1$1$invoke$$inlined$items$default$3
                    r3.<init>(r1, r10)
                    com.forsale.app.features.postad.bundles.BundlesViewKt$ScreenContent$1$1$invoke$$inlined$items$default$4 r1 = new com.forsale.app.features.postad.bundles.BundlesViewKt$ScreenContent$1$1$invoke$$inlined$items$default$4
                    r9 = r1
                    r9.<init>(r10, r11, r12, r13, r14, r15)
                    r4 = -632812321(0xffffffffda480cdf, float:-1.40772868E16)
                    r9 = 1
                    r0.a r1 = r0.b.c(r4, r9, r1)
                    r4 = 0
                    r7.f(r2, r4, r3, r1)
                    r2 = 0
                    r3 = 0
                    g00.q r4 = r8.b()
                    r1 = r17
                    androidx.compose.foundation.lazy.LazyListScope.l(r1, r2, r3, r4, r5, r6)
                    com.forsale.app.features.postad.bundles.BundlesViewKt$ScreenContent$1$1$2 r1 = new com.forsale.app.features.postad.bundles.BundlesViewKt$ScreenContent$1$1$2
                    g00.a<wz.p> r4 = r7
                    int r5 = r5
                    r1.<init>()
                    r4 = -153835303(0xfffffffff6d4a8d9, float:-2.1566242E33)
                    r0.a r4 = r0.b.c(r4, r9, r1)
                    r5 = 3
                    r1 = r17
                    androidx.compose.foundation.lazy.LazyListScope.l(r1, r2, r3, r4, r5, r6)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.bundles.BundlesViewKt$ScreenContent$1$1.b(androidx.compose.foundation.lazy.LazyListScope):void");
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(LazyListScope lazyListScope) {
                b(lazyListScope);
                return p.f75480a;
            }
        }, h11, 24576, 238);
        h11.C(174026901);
        if (z11) {
            int i12 = i11 >> 18;
            a(aVar2, str2, z12, h11, (i12 & 112) | (i12 & 14) | ((i11 >> 21) & 896));
        }
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
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.postad.bundles.BundlesViewKt$ScreenContent$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar5, int i13) {
                    BundlesViewKt.l(list, lVar, bundle, aVar, str, pVar, aVar2, str2, z11, z12, aVar5, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar5, Integer num) {
                    b(aVar5, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }
}
