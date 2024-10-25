package com.forsale.app.features.categories.listingdetails.buyerscreen.views;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.runtime.c0;
import androidx.compose.ui.c;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.text.w;
import androidx.compose.ui.unit.LayoutDirection;
import b2.l;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.buttons.ButtonData;
import com.forsale.designSystem.buttons.ButtonsKt;
import com.forsale.designSystem.iconography.IconKt;
import com.forsale.designSystem.layouts.SectionTitleKt;
import e2.h;
import g00.a;
import g00.q;
import j0.d1;
import j0.e1;
import j0.k;
import j0.k0;
import j0.v0;
import kotlin.jvm.internal.o;
import p1.e;
import p1.g;
import sj.d;
import t9.y0;
import v0.b;
import w.f;
import w.t;
import wz.p;
/* compiled from: BuyerDescriptionView.kt */
/* loaded from: classes2.dex */
public final class BuyerDescriptionViewKt {
    public static final void a(final String description, final a<p> showMoreClicked, final a<p> showLessClicked, androidx.compose.runtime.a aVar, final int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int b11;
        int d11;
        final a<p> aVar2;
        androidx.compose.runtime.a aVar3;
        int i16;
        int i17;
        int i18;
        o.i(description, "description");
        o.i(showMoreClicked, "showMoreClicked");
        o.i(showLessClicked, "showLessClicked");
        androidx.compose.runtime.a h11 = aVar.h(-1277996729);
        if ((i11 & 14) == 0) {
            if (h11.T(description)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i12 = i18 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.F(showMoreClicked)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i12 |= i17;
        }
        if ((i11 & 896) == 0) {
            if (h11.F(showLessClicked)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i12 |= i16;
        }
        int i19 = i12;
        if ((i19 & 731) == 146 && h11.i()) {
            h11.L();
            aVar3 = h11;
            aVar2 = showMoreClicked;
        } else {
            if (c.I()) {
                c.U(-1277996729, i19, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerDescriptionView (BuyerDescriptionView.kt:30)");
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
            h11.C(-492369756);
            Object D2 = h11.D();
            if (D2 == c0064a.a()) {
                D2 = c0.e(Boolean.FALSE, null, 2, null);
                h11.u(D2);
            }
            h11.S();
            final k0 k0Var2 = (k0) D2;
            if (b(k0Var)) {
                h11.C(-260708801);
                i13 = y0.S0;
            } else {
                h11.C(-260708738);
                i13 = y0.T0;
            }
            final String b12 = g.b(i13, h11, 0);
            h11.S();
            if (b(k0Var)) {
                h11.C(-260708617);
                i14 = d.f68675l;
            } else {
                h11.C(-260708533);
                i14 = d.f68671h;
            }
            final Painter d12 = e.d(i14, h11, 0);
            h11.S();
            h11.C(-260708439);
            if (b(k0Var)) {
                i15 = ((Number) h11.q(TextKt.i())).intValue();
            } else {
                i15 = 3;
            }
            int i21 = i15;
            h11.S();
            if (b(k0Var)) {
                b11 = l.f16120a.c();
            } else {
                b11 = l.f16120a.b();
            }
            int i22 = b11;
            LayoutDirection layoutDirection = (LayoutDirection) h11.q(CompositionLocalsKt.j());
            c.a aVar4 = androidx.compose.ui.c.f7566a;
            androidx.compose.ui.c i23 = PaddingKt.i(SizeKt.h(aVar4, 0.0f, 1, null), h.l(16));
            h11.C(-483455358);
            a0 a11 = androidx.compose.foundation.layout.e.a(Arrangement.f3698a.h(), b.f74009a.k(), h11, 0);
            h11.C(-1323940314);
            int a12 = j0.e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(i23);
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
            g00.p<ComposeUiNode, Integer, p> b13 = companion.b();
            if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.p(Integer.valueOf(a12), b13);
            }
            c11.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            f fVar = f.f74891a;
            SectionTitleKt.a(null, null, ComposableSingletons$BuyerDescriptionViewKt.f26864a.a(), null, null, null, h11, 384, 59);
            androidx.compose.ui.c a15 = TestTagKt.a(PaddingKt.k(SizeKt.h(aVar4, 0.0f, 1, null), 0.0f, h.l(8), 1, null), "txtDesc");
            dk.a aVar5 = dk.a.f54291a;
            int i24 = dk.a.f54292b;
            yj.d e11 = aVar5.a(h11, i24).e();
            int i25 = yj.d.f76453b;
            long j11 = e11.j(h11, i25);
            androidx.compose.ui.text.a0 d13 = aVar5.c(h11, i24).d();
            if (layoutDirection == LayoutDirection.Rtl) {
                d11 = b2.h.f16095b.e();
            } else {
                d11 = b2.h.f16095b.d();
            }
            int i26 = d11;
            h11.C(1157296644);
            boolean T = h11.T(k0Var2);
            Object D3 = h11.D();
            if (T || D3 == c0064a.a()) {
                D3 = new g00.l<w, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerDescriptionViewKt$BuyerDescriptionView$1$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void b(w it2) {
                        o.i(it2, "it");
                        BuyerDescriptionViewKt.e(k0Var2, it2.i());
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ p invoke(w wVar) {
                        b(wVar);
                        return p.f75480a;
                    }
                };
                h11.u(D3);
            }
            h11.S();
            TextKt.a(description, a15, 0, i22, false, i21, 0, (g00.l) D3, d13, j11, i26, h11, (i19 & 14) | 48, 0, 84);
            h11.C(-260707394);
            if (!d(k0Var2) && !b(k0Var)) {
                aVar2 = showMoreClicked;
                aVar3 = h11;
            } else {
                yj.d f11 = aVar5.a(h11, i24).f();
                w.o a16 = PaddingKt.a(h.l(0));
                ButtonData e12 = ButtonData.f40994a.e();
                androidx.compose.ui.c a17 = TestTagKt.a(aVar4, "btnShow");
                h11.C(1618982084);
                boolean T2 = h11.T(k0Var) | h11.T(showMoreClicked) | h11.T(showLessClicked);
                Object D4 = h11.D();
                if (T2 || D4 == c0064a.a()) {
                    D4 = new g00.a<p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerDescriptionViewKt$BuyerDescriptionView$1$2$1
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
                            boolean b14;
                            boolean b15;
                            k0<Boolean> k0Var3 = k0Var;
                            b14 = BuyerDescriptionViewKt.b(k0Var3);
                            BuyerDescriptionViewKt.c(k0Var3, !b14);
                            b15 = BuyerDescriptionViewKt.b(k0Var);
                            (b15 ? showMoreClicked : showLessClicked).invoke();
                        }
                    };
                    h11.u(D4);
                }
                h11.S();
                aVar2 = showMoreClicked;
                aVar3 = h11;
                ButtonsKt.l((g00.a) D4, a17, e12, false, a16, f11, null, null, null, null, r0.b.b(h11, -837536261, true, new q<t, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerDescriptionViewKt$BuyerDescriptionView$1$3
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    public final void b(t TextButton, androidx.compose.runtime.a aVar6, int i27) {
                        o.i(TextButton, "$this$TextButton");
                        if ((i27 & 81) == 16 && aVar6.i()) {
                            aVar6.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(-837536261, i27, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerDescriptionView.<anonymous>.<anonymous> (BuyerDescriptionView.kt:85)");
                        }
                        TextKt.a(b12, null, 0, 0, false, 0, 0, null, null, 0L, 0, aVar6, 0, 0, 2046);
                        IconKt.a(d12, null, null, dk.a.f54291a.a(aVar6, dk.a.f54292b).f().i(aVar6, yj.d.f76453b), false, 0.0f, aVar6, 8, 54);
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                    }

                    @Override // g00.q
                    public /* bridge */ /* synthetic */ p invoke(t tVar, androidx.compose.runtime.a aVar6, Integer num) {
                        b(tVar, aVar6, num.intValue());
                        return p.f75480a;
                    }
                }), h11, (ButtonData.f40995b << 6) | 24624 | (i25 << 15), 6, 968);
            }
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
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerDescriptionViewKt$BuyerDescriptionView$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar6, int i27) {
                    BuyerDescriptionViewKt.a(description, aVar2, showLessClicked, aVar6, v0.a(i11 | 1));
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
    public static final boolean b(k0<Boolean> k0Var) {
        return k0Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(k0<Boolean> k0Var, boolean z11) {
        k0Var.setValue(Boolean.valueOf(z11));
    }

    private static final boolean d(k0<Boolean> k0Var) {
        return k0Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(k0<Boolean> k0Var, boolean z11) {
        k0Var.setValue(Boolean.valueOf(z11));
    }
}
