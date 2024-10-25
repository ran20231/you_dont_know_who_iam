package com.forsale.adserver.view.screens.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.c;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import b1.t1;
import c0.g;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.buttons.ButtonData;
import com.forsale.designSystem.buttons.ButtonsKt;
import com.forsale.designSystem.iconography.IconKt;
import e2.h;
import g00.q;
import j0.d1;
import j0.e1;
import j0.k;
import j0.v0;
import kotlin.jvm.internal.o;
import v0.b;
import w.f;
import wz.p;
import y0.e;
import yj.d;
/* compiled from: OfferSupportItem.kt */
/* loaded from: classes2.dex */
public final class OfferSupportItemKt {
    public static final void a(final g00.a<p> onOfferSupportItemClicked, androidx.compose.runtime.a aVar, final int i11) {
        int i12;
        androidx.compose.runtime.a aVar2;
        int i13;
        o.i(onOfferSupportItemClicked, "onOfferSupportItemClicked");
        androidx.compose.runtime.a h11 = aVar.h(1089274049);
        if ((i11 & 14) == 0) {
            if (h11.F(onOfferSupportItemClicked)) {
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
            if (c.I()) {
                c.U(1089274049, i12, -1, "com.forsale.adserver.view.screens.ui.OfferSupportItem (OfferSupportItem.kt:36)");
            }
            c.a aVar3 = androidx.compose.ui.c.f7566a;
            float f11 = 8;
            androidx.compose.ui.c a11 = e.a(SizeKt.u(aVar3, h.l((float) 165.5d)), g.c(h.l(f11)));
            h11.C(1157296644);
            boolean T = h11.T(onOfferSupportItemClicked);
            Object D = h11.D();
            if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                D = new g00.a<p>() { // from class: com.forsale.adserver.view.screens.ui.OfferSupportItemKt$OfferSupportItem$1$1
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
                        onOfferSupportItemClicked.invoke();
                    }
                };
                h11.u(D);
            }
            h11.S();
            androidx.compose.ui.c e11 = ClickableKt.e(a11, false, null, null, (g00.a) D, 7, null);
            dk.a aVar4 = dk.a.f54291a;
            int i14 = dk.a.f54292b;
            d f12 = aVar4.a(h11, i14).f();
            int i15 = d.f76453b;
            androidx.compose.ui.c b11 = BackgroundKt.b(e11, f12.j(h11, i15), null, 2, null);
            h11.C(733328855);
            b.a aVar5 = b.f74009a;
            a0 g11 = BoxKt.g(aVar5.o(), false, h11, 0);
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
            Updater.c(a14, g11, companion.e());
            Updater.c(a14, s11, companion.g());
            g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
            if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.p(Integer.valueOf(a12), b12);
            }
            c11.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
            ImageKt.a(p1.e.d(l8.e.f62286g, h11, 0), null, AspectRatioKt.b(SizeKt.f(aVar3, 0.0f, 1, null), 0.6465517f, false, 2, null), null, androidx.compose.ui.layout.c.f8188a.b(), 0.0f, null, h11, 25016, 104);
            b.InterfaceC0889b g12 = aVar5.g();
            Arrangement.f o11 = Arrangement.f3698a.o(h.l(f11));
            androidx.compose.ui.c h12 = SizeKt.h(PaddingKt.j(aVar3, h.l(16), h.l(24)), 0.0f, 1, null);
            h11.C(-483455358);
            a0 a15 = androidx.compose.foundation.layout.e.a(o11, g12, h11, 54);
            h11.C(-1323940314);
            int a16 = j0.e.a(h11, 0);
            k s12 = h11.s();
            g00.a<ComposeUiNode> a17 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c12 = LayoutKt.c(h12);
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
            if (a18.f() || !o.d(a18.D(), Integer.valueOf(a16))) {
                a18.u(Integer.valueOf(a16));
                a18.p(Integer.valueOf(a16), b13);
            }
            c12.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            f fVar = f.f74891a;
            IconKt.a(p1.e.d(l8.e.f62283d, h11, 0), null, null, t1.f15974b.e(), false, h.l(40), h11, 199688, 22);
            TextKt.a(p1.g.b(l8.h.f62350s, h11, 0), null, b2.f.f16081b.a(), 0, false, 0, 0, null, aVar4.c(h11, i14).a(), aVar4.a(h11, i14).e().h(h11, i15), 0, h11, 0, 0, 1274);
            androidx.compose.ui.c m11 = PaddingKt.m(aVar3, 0.0f, h.l(f11), 0.0f, 0.0f, 13, null);
            ButtonData e12 = ButtonData.f40994a.e();
            aVar2 = h11;
            long h13 = aVar4.a(aVar2, i14).e().h(aVar2, i15);
            long h14 = aVar4.a(aVar2, i14).e().h(aVar2, i15);
            long h15 = aVar4.a(aVar2, i14).e().h(aVar2, i15);
            aVar2.C(1157296644);
            boolean T2 = aVar2.T(onOfferSupportItemClicked);
            Object D2 = aVar2.D();
            if (T2 || D2 == androidx.compose.runtime.a.f7182a.a()) {
                D2 = new g00.a<p>() { // from class: com.forsale.adserver.view.screens.ui.OfferSupportItemKt$OfferSupportItem$2$1$1$1
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
                        onOfferSupportItemClicked.invoke();
                    }
                };
                aVar2.u(D2);
            }
            aVar2.S();
            ButtonsKt.h((g00.a) D2, m11, e12, false, null, t1.g(h13), t1.g(h15), t1.g(h14), null, null, ComposableSingletons$OfferSupportItemKt.f21566a.a(), aVar2, (ButtonData.f40995b << 6) | 48, 6, 792);
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
        d1 l11 = aVar2.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.adserver.view.screens.ui.OfferSupportItemKt$OfferSupportItem$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar6, int i16) {
                    OfferSupportItemKt.a(onOfferSupportItemClicked, aVar6, v0.a(i11 | 1));
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
