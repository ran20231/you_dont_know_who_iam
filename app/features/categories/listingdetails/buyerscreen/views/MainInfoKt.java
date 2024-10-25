package com.forsale.app.features.categories.listingdetails.buyerscreen.views;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.c;
import androidx.compose.ui.c;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import com.forsale.app.features.categories.listingdetails.buyerscreen.utils.BuyerDetailsComponentTags;
import com.forsale.app.features.categories.listingdetails.models.CommonData;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.buttons.ButtonData;
import com.forsale.designSystem.buttons.ButtonsKt;
import com.forsale.designSystem.dividers.DividersKt;
import com.forsale.designSystem.iconography.IconKt;
import com.google.android.gms.ads.AdRequest;
import e2.h;
import g00.a;
import g00.l;
import g00.q;
import j0.d1;
import j0.e1;
import j0.k;
import j0.v0;
import p1.e;
import p1.g;
import r0.b;
import t9.q0;
import t9.y0;
import v0.b;
import w.f;
import w.o;
import w.t;
import w.u;
import wz.p;
import yj.d;
/* compiled from: MainInfo.kt */
/* loaded from: classes2.dex */
public final class MainInfoKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final String str, final a<p> aVar, androidx.compose.runtime.a aVar2, final int i11) {
        int i12;
        androidx.compose.runtime.a aVar3;
        int i13;
        int i14;
        androidx.compose.runtime.a h11 = aVar2.h(1426879008);
        if ((i11 & 14) == 0) {
            if (h11.T(str)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.F(aVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        final int i15 = i12;
        if ((i15 & 91) == 18 && h11.i()) {
            h11.L();
            aVar3 = h11;
        } else {
            if (c.I()) {
                c.U(1426879008, i15, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.views.Breadcrumbs (MainInfo.kt:165)");
            }
            c.a aVar4 = androidx.compose.ui.c.f7566a;
            float f11 = 8;
            SpacerKt.a(SizeKt.u(aVar4, h.l(f11)), h11, 6);
            androidx.compose.ui.c i16 = SizeKt.i(SizeKt.u(aVar4, h.l(1)), h.l(20));
            dk.a aVar5 = dk.a.f54291a;
            int i17 = dk.a.f54292b;
            d e11 = aVar5.a(h11, i17).e();
            int i18 = d.f76453b;
            DividersKt.a(i16, 0.0f, e11.d(h11, i18), h11, 6, 2);
            androidx.compose.ui.c m11 = PaddingKt.m(aVar4, h.l(f11), 0.0f, 0.0f, 0.0f, 14, null);
            d f12 = aVar5.a(h11, i17).f();
            o a11 = PaddingKt.a(h.l(0));
            ButtonData e12 = ButtonData.f40994a.e();
            h11.C(1157296644);
            boolean T = h11.T(aVar);
            Object D = h11.D();
            if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                D = new a<p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.MainInfoKt$Breadcrumbs$1$1
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
            aVar3 = h11;
            ButtonsKt.l((a) D, m11, e12, false, a11, f12, null, null, null, null, b.b(h11, -1378499301, true, new q<t, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.MainInfoKt$Breadcrumbs$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                public final void b(t TextButton, androidx.compose.runtime.a aVar6, int i19) {
                    kotlin.jvm.internal.o.i(TextButton, "$this$TextButton");
                    if ((i19 & 81) == 16 && aVar6.i()) {
                        aVar6.L();
                        return;
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(-1378499301, i19, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.views.Breadcrumbs.<anonymous> (MainInfo.kt:182)");
                    }
                    TextKt.a(str, null, 0, 0, false, 0, 0, null, null, 0L, 0, aVar6, i15 & 14, 0, 2046);
                    float f13 = 16;
                    IconKt.a(e.d(sj.d.f68674k, aVar6, 0), SizeKt.i(SizeKt.u(androidx.compose.ui.c.f7566a, h.l(f13)), h.l(f13)), null, dk.a.f54291a.a(aVar6, dk.a.f54292b).f().i(aVar6, d.f76453b), false, 0.0f, aVar6, 56, 52);
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                }

                @Override // g00.q
                public /* bridge */ /* synthetic */ p invoke(t tVar, androidx.compose.runtime.a aVar6, Integer num) {
                    b(tVar, aVar6, num.intValue());
                    return p.f75480a;
                }
            }), h11, (ButtonData.f40995b << 6) | 24624 | (i18 << 15), 6, 968);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = aVar3.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.MainInfoKt$Breadcrumbs$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar6, int i19) {
                    MainInfoKt.a(str, aVar, aVar6, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar6, Integer num) {
                    b(aVar6, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final String str, androidx.compose.runtime.a aVar, final int i11) {
        int i12;
        androidx.compose.runtime.a aVar2;
        int i13;
        androidx.compose.runtime.a h11 = aVar.h(-1983184467);
        if ((i11 & 14) == 0) {
            if (h11.T(str)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 11) == 2 && h11.i()) {
            h11.L();
            aVar2 = h11;
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-1983184467, i12, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.views.Location (MainInfo.kt:141)");
            }
            if (str == null) {
                aVar2 = h11;
            } else {
                h11.C(693286680);
                c.a aVar3 = androidx.compose.ui.c.f7566a;
                a0 a11 = androidx.compose.foundation.layout.o.a(Arrangement.f3698a.g(), v0.b.f74009a.l(), h11, 0);
                h11.C(-1323940314);
                int a12 = j0.e.a(h11, 0);
                k s11 = h11.s();
                ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                a<ComposeUiNode> a13 = companion.a();
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
                Painter d11 = e.d(q0.f69735c1, h11, 0);
                dk.a aVar4 = dk.a.f54291a;
                int i14 = dk.a.f54292b;
                d e11 = aVar4.a(h11, i14).e();
                int i15 = d.f76453b;
                long j11 = e11.j(h11, i15);
                float f11 = 20;
                IconKt.a(d11, SizeKt.i(SizeKt.u(PaddingKt.m(aVar3, 0.0f, 0.0f, h.l(4), 0.0f, 11, null), h.l(f11)), h.l(f11)), null, j11, false, 0.0f, h11, 56, 52);
                aVar2 = h11;
                TextKt.a(str, TestTagKt.a(aVar3, BuyerDetailsComponentTags.LOCATION.getTag()), 0, 0, false, 0, 0, null, aVar4.c(h11, i14).c(), aVar4.a(h11, i14).e().j(h11, i15), 0, h11, (i12 & 14) | 48, 0, 1276);
                aVar2.S();
                aVar2.w();
                aVar2.S();
                aVar2.S();
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = aVar2.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.MainInfoKt$Location$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar5, int i16) {
                    MainInfoKt.b(str, aVar5, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar5, Integer num) {
                    b(aVar5, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void c(final com.forsale.app.features.categories.listingdetails.buyerscreen.q state, final androidx.compose.ui.c modifier, final l<? super cb.a, p> onBreadCrumbsClicked, androidx.compose.runtime.a aVar, final int i11) {
        kotlin.jvm.internal.o.i(state, "state");
        kotlin.jvm.internal.o.i(modifier, "modifier");
        kotlin.jvm.internal.o.i(onBreadCrumbsClicked, "onBreadCrumbsClicked");
        androidx.compose.runtime.a h11 = aVar.h(-743220790);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-743220790, i11, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.views.MainInfo (MainInfo.kt:38)");
        }
        h11.C(733328855);
        c.a aVar2 = androidx.compose.ui.c.f7566a;
        b.a aVar3 = v0.b.f74009a;
        a0 g11 = BoxKt.g(aVar3.o(), false, h11, 0);
        h11.C(-1323940314);
        int a11 = j0.e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        a<ComposeUiNode> a12 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(aVar2);
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
        if (a13.f() || !kotlin.jvm.internal.o.d(a13.D(), Integer.valueOf(a11))) {
            a13.u(Integer.valueOf(a11));
            a13.p(Integer.valueOf(a11), b11);
        }
        c11.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        androidx.compose.ui.c e11 = BoxScopeInstance.f3756a.e(modifier, aVar3.o());
        Arrangement.m q11 = Arrangement.f3698a.q(h.l(4), aVar3.i());
        h11.C(-483455358);
        a0 a14 = androidx.compose.foundation.layout.e.a(q11, aVar3.k(), h11, 6);
        h11.C(-1323940314);
        int a15 = j0.e.a(h11, 0);
        k s12 = h11.s();
        a<ComposeUiNode> a16 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c12 = LayoutKt.c(e11);
        if (!(h11.k() instanceof j0.d)) {
            j0.e.c();
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
        h11.C(-60158051);
        CommonData d11 = state.c().d();
        f(d11.I(), d11.n(), state.d(), new a<p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.MainInfoKt$MainInfo$1$1$1$1
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
                onBreadCrumbsClicked.invoke(state.d());
            }
        }, h11, AdRequest.MAX_CONTENT_URL_LENGTH);
        e(d11.E(), h11, 0);
        d(d11.y(), h11, 0);
        b(d11.q(), h11, 0);
        h11.S();
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
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.MainInfoKt$MainInfo$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar4, int i12) {
                    MainInfoKt.c(com.forsale.app.features.categories.listingdetails.buyerscreen.q.this, modifier, onBreadCrumbsClicked, aVar4, v0.a(i11 | 1));
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
    public static final void d(final String str, androidx.compose.runtime.a aVar, final int i11) {
        int i12;
        androidx.compose.runtime.a aVar2;
        int i13;
        androidx.compose.runtime.a h11 = aVar.h(861968037);
        if ((i11 & 14) == 0) {
            if (h11.T(str)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 11) == 2 && h11.i()) {
            h11.L();
            aVar2 = h11;
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(861968037, i12, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.views.Price (MainInfo.kt:127)");
            }
            if (str != null) {
                h11.C(693286680);
                c.a aVar3 = androidx.compose.ui.c.f7566a;
                a0 a11 = androidx.compose.foundation.layout.o.a(Arrangement.f3698a.g(), v0.b.f74009a.l(), h11, 0);
                h11.C(-1323940314);
                int a12 = j0.e.a(h11, 0);
                k s11 = h11.s();
                ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                a<ComposeUiNode> a13 = companion.a();
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
                dk.a aVar4 = dk.a.f54291a;
                int i14 = dk.a.f54292b;
                aVar2 = h11;
                TextKt.a(str, TestTagKt.a(aVar3, BuyerDetailsComponentTags.PRICE.getTag()), 0, 0, false, 0, 0, null, aVar4.c(h11, i14).l(), aVar4.a(h11, i14).f().i(h11, d.f76453b), 0, h11, (i12 & 14) | 48, 0, 1276);
                aVar2.S();
                aVar2.w();
                aVar2.S();
                aVar2.S();
            } else {
                aVar2 = h11;
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = aVar2.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.MainInfoKt$Price$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar5, int i15) {
                    MainInfoKt.d(str, aVar5, v0.a(i11 | 1));
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
    public static final void e(final String str, androidx.compose.runtime.a aVar, final int i11) {
        int i12;
        androidx.compose.runtime.a aVar2;
        int i13;
        androidx.compose.runtime.a h11 = aVar.h(-156185484);
        if ((i11 & 14) == 0) {
            if (h11.T(str)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 11) == 2 && h11.i()) {
            h11.L();
            aVar2 = h11;
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-156185484, i12, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.views.Title (MainInfo.kt:115)");
            }
            h11.C(693286680);
            c.a aVar3 = androidx.compose.ui.c.f7566a;
            a0 a11 = androidx.compose.foundation.layout.o.a(Arrangement.f3698a.g(), v0.b.f74009a.l(), h11, 0);
            h11.C(-1323940314);
            int a12 = j0.e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            a<ComposeUiNode> a13 = companion.a();
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
            dk.a aVar4 = dk.a.f54291a;
            int i14 = dk.a.f54292b;
            aVar2 = h11;
            TextKt.a(str, TestTagKt.a(aVar3, BuyerDetailsComponentTags.TITLE.getTag()), 0, 0, false, 0, 0, null, aVar4.c(h11, i14).a(), aVar4.a(h11, i14).e().m(h11, d.f76453b), 0, h11, (i12 & 14) | 48, 0, 1276);
            aVar2.S();
            aVar2.w();
            aVar2.S();
            aVar2.S();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = aVar2.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.MainInfoKt$Title$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar5, int i15) {
                    MainInfoKt.e(str, aVar5, v0.a(i11 | 1));
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
    public static final void f(final int i11, final String str, final cb.a aVar, final a<p> aVar2, androidx.compose.runtime.a aVar3, final int i12) {
        String str2;
        boolean z11;
        androidx.compose.runtime.a h11 = aVar3.h(1804419601);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(1804419601, i12, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.views.ViewsCountAndDate (MainInfo.kt:65)");
        }
        b.c i13 = v0.b.f74009a.i();
        h11.C(693286680);
        c.a aVar4 = androidx.compose.ui.c.f7566a;
        a0 a11 = androidx.compose.foundation.layout.o.a(Arrangement.f3698a.g(), i13, h11, 48);
        h11.C(-1323940314);
        int a12 = j0.e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        a<ComposeUiNode> a13 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(aVar4);
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
        Painter d11 = e.d(q0.f69812v2, h11, 0);
        dk.a aVar5 = dk.a.f54291a;
        int i14 = dk.a.f54292b;
        d e11 = aVar5.a(h11, i14).e();
        int i15 = d.f76453b;
        float f11 = 4;
        float f12 = 16;
        IconKt.a(d11, SizeKt.i(SizeKt.u(PaddingKt.m(aVar4, 0.0f, 0.0f, h.l(f11), 0.0f, 11, null), h.l(f12)), h.l(f12)), null, e11.j(h11, i15), false, 0.0f, h11, 56, 52);
        float f13 = 8;
        TextKt.a(g.c(y0.f70429e1, new Object[]{Integer.valueOf(i11)}, h11, 64), TestTagKt.a(PaddingKt.m(aVar4, 0.0f, 0.0f, h.l(f13), 0.0f, 11, null), BuyerDetailsComponentTags.VIEWS_COUNT.getTag()), 0, 0, false, 0, 0, null, aVar5.c(h11, i14).h(), aVar5.a(h11, i14).e().j(h11, i15), 0, h11, 48, 0, 1276);
        DividersKt.a(SizeKt.i(SizeKt.u(aVar4, h.l(1)), h.l(20)), 0.0f, aVar5.a(h11, i14).e().d(h11, i15), h11, 6, 2);
        IconKt.a(e.d(q0.f69782o0, h11, 0), SizeKt.i(SizeKt.u(PaddingKt.m(aVar4, h.l(f13), 0.0f, h.l(f11), 0.0f, 10, null), h.l(f12)), h.l(f12)), null, aVar5.a(h11, i14).e().j(h11, i15), false, 0.0f, h11, 56, 52);
        TextKt.a(String.valueOf(g.c(y0.R0, new Object[]{str}, h11, 64)), TestTagKt.a(aVar4, BuyerDetailsComponentTags.DATE_SORT.getTag()), 0, 0, false, 0, 0, null, aVar5.c(h11, i14).h(), aVar5.a(h11, i14).e().j(h11, i15), 0, h11, 48, 0, 1276);
        h11.C(505252389);
        if (aVar != null) {
            str2 = aVar.a();
        } else {
            str2 = null;
        }
        if (str2 != null && str2.length() != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11) {
            a((aVar == null || (r0 = aVar.a()) == null) ? "" : "", aVar2, h11, (i12 >> 6) & 112);
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
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.MainInfoKt$ViewsCountAndDate$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar6, int i16) {
                    MainInfoKt.f(i11, str, aVar, aVar2, aVar6, v0.a(i12 | 1));
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
