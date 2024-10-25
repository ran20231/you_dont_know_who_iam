package com.forsale.app.features.categories.listingdetails.buyerscreen.views;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.selection.SelectionContainerKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.runtime.c0;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.platform.f1;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.buttons.ButtonData;
import com.forsale.designSystem.buttons.ButtonsKt;
import e2.h;
import g00.l;
import g00.q;
import j0.d;
import j0.d1;
import j0.e;
import j0.e1;
import j0.k;
import j0.k0;
import j0.v0;
import kotlin.jvm.internal.o;
import lf.a;
import p1.g;
import rj.a;
import t9.y0;
import v0.b;
import w.t;
import w.u;
import wz.p;
/* compiled from: BuyerAdId.kt */
/* loaded from: classes2.dex */
public final class BuyerAdIdKt {
    public static final void a(final String adId, final l<? super String, p> onReportAbuseClicked, final l<? super a, p> onAdIdCopied, androidx.compose.runtime.a aVar, final int i11) {
        int i12;
        androidx.compose.runtime.a aVar2;
        int i13;
        int i14;
        int i15;
        o.i(adId, "adId");
        o.i(onReportAbuseClicked, "onReportAbuseClicked");
        o.i(onAdIdCopied, "onAdIdCopied");
        androidx.compose.runtime.a h11 = aVar.h(1494317155);
        if ((i11 & 14) == 0) {
            if (h11.T(adId)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.F(onReportAbuseClicked)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 896) == 0) {
            if (h11.F(onAdIdCopied)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 731) == 146 && h11.i()) {
            h11.L();
            aVar2 = h11;
        } else {
            if (c.I()) {
                c.U(1494317155, i12, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerAdId (BuyerAdId.kt:31)");
            }
            final f1 f1Var = (f1) h11.q(CompositionLocalsKt.d());
            h11.C(-492369756);
            Object D = h11.D();
            a.C0064a c0064a = androidx.compose.runtime.a.f7182a;
            if (D == c0064a.a()) {
                D = c0.e(adId, null, 2, null);
                h11.u(D);
            }
            h11.S();
            final k0 k0Var = (k0) D;
            final String b11 = g.b(y0.O0, h11, 0);
            c.a aVar3 = androidx.compose.ui.c.f7566a;
            androidx.compose.ui.c i16 = PaddingKt.i(SizeKt.h(aVar3, 0.0f, 1, null), h.l(15));
            Arrangement arrangement = Arrangement.f3698a;
            Arrangement.f o11 = arrangement.o(h.l(12));
            h11.C(693286680);
            b.a aVar4 = b.f74009a;
            a0 a11 = androidx.compose.foundation.layout.o.a(o11, aVar4.l(), h11, 6);
            h11.C(-1323940314);
            int a12 = e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(i16);
            if (!(h11.k() instanceof d)) {
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
            g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
            if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.p(Integer.valueOf(a12), b12);
            }
            c11.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            androidx.compose.ui.c d11 = t.d(u.f74924a, aVar3, 1.0f, false, 2, null);
            h11.C(693286680);
            a0 a15 = androidx.compose.foundation.layout.o.a(arrangement.g(), aVar4.l(), h11, 0);
            h11.C(-1323940314);
            int a16 = e.a(h11, 0);
            k s12 = h11.s();
            g00.a<ComposeUiNode> a17 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c12 = LayoutKt.c(d11);
            if (!(h11.k() instanceof d)) {
                e.c();
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
            String b14 = g.b(y0.f70581n1, h11, 0);
            dk.a aVar5 = dk.a.f54291a;
            int i17 = dk.a.f54292b;
            androidx.compose.ui.text.a0 c13 = aVar5.c(h11, i17).c();
            yj.d e11 = aVar5.a(h11, i17).e();
            int i18 = yj.d.f76453b;
            TextKt.a(b14, null, 0, 0, false, 0, 0, null, c13, e11.j(h11, i18), 0, h11, 0, 0, 1278);
            SelectionContainerKt.b(TestTagKt.a(ClickableKt.h(aVar3, false, null, null, null, new g00.a<p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerAdIdKt$BuyerAdId$1$1$1
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
                    f1.this.b(new androidx.compose.ui.text.c(k0Var.getValue(), null, null, 6, null));
                    onAdIdCopied.invoke(new lf.a(null, new a.C0804a(b11), 1, null));
                }
            }, null, new g00.a<p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerAdIdKt$BuyerAdId$1$1$2
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // g00.a
                public /* bridge */ /* synthetic */ p invoke() {
                    invoke2();
                    return p.f75480a;
                }
            }, 47, null), "btnCopy"), r0.b.b(h11, -391140968, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerAdIdKt$BuyerAdId$1$1$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar6, int i19) {
                    if ((i19 & 11) == 2 && aVar6.i()) {
                        aVar6.L();
                        return;
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(-391140968, i19, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerAdId.<anonymous>.<anonymous>.<anonymous> (BuyerAdId.kt:53)");
                    }
                    String value = k0Var.getValue();
                    dk.a aVar7 = dk.a.f54291a;
                    int i21 = dk.a.f54292b;
                    TextKt.a(" " + ((Object) value), null, 0, 0, false, 0, 0, null, aVar7.c(aVar6, i21).c(), aVar7.a(aVar6, i21).e().j(aVar6, yj.d.f76453b), 0, aVar6, 0, 0, 1278);
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar6, Integer num) {
                    b(aVar6, num.intValue());
                    return p.f75480a;
                }
            }), h11, 48, 0);
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            ButtonData c14 = ButtonData.f40994a.c();
            yj.d d12 = aVar5.a(h11, i17).d();
            w.o a19 = PaddingKt.a(h.l(0));
            androidx.compose.ui.c a21 = TestTagKt.a(aVar3, "btnReport");
            h11.C(511388516);
            boolean T = h11.T(onReportAbuseClicked) | h11.T(adId);
            Object D2 = h11.D();
            if (T || D2 == c0064a.a()) {
                D2 = new g00.a<p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerAdIdKt$BuyerAdId$1$2$1
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
                        onReportAbuseClicked.invoke(adId);
                    }
                };
                h11.u(D2);
            }
            h11.S();
            aVar2 = h11;
            ButtonsKt.l((g00.a) D2, a21, c14, false, a19, d12, null, null, null, null, ComposableSingletons$BuyerAdIdKt.f26861a.a(), aVar2, (ButtonData.f40995b << 6) | 24624 | (i18 << 15), 6, 968);
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
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerAdIdKt$BuyerAdId$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar6, int i19) {
                    BuyerAdIdKt.a(adId, onReportAbuseClicked, onAdIdCopied, aVar6, v0.a(i11 | 1));
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
