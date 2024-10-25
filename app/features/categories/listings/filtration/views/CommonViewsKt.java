package com.forsale.app.features.categories.listings.filtration.views;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.e;
import androidx.compose.material.InteractiveComponentSizeKt;
import androidx.compose.material.RadioButtonKt;
import androidx.compose.material.c0;
import androidx.compose.material.d0;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.runtime.z;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import b1.t1;
import com.forsale.app.datalayer.database.ExtraAttributeEntity;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.checkboxes.CheckboxesKt;
import com.forsale.designSystem.layouts.StateKt;
import e2.h;
import g00.l;
import g00.q;
import j0.d1;
import j0.e1;
import j0.k;
import j0.n1;
import j0.t0;
import j0.v0;
import java.util.Arrays;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.flow.MutableStateFlow;
import r0.b;
import v0.b;
import w.f;
import w.t;
import w.u;
import wz.p;
import yj.d;
/* compiled from: CommonViews.kt */
/* loaded from: classes2.dex */
public final class CommonViewsKt {
    public static final void a(final boolean z11, final l<? super Boolean, p> onCheckedChanged, a aVar, final int i11) {
        int i12;
        int i13;
        int i14;
        o.i(onCheckedChanged, "onCheckedChanged");
        a h11 = aVar.h(1036259441);
        if ((i11 & 14) == 0) {
            if (h11.a(z11)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.F(onCheckedChanged)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && h11.i()) {
            h11.L();
        } else {
            if (c.I()) {
                c.U(1036259441, i12, -1, "com.forsale.app.features.categories.listings.filtration.views.FilterCheckBox (CommonViews.kt:67)");
            }
            CheckboxesKt.a(null, z11, false, null, 0.0f, null, onCheckedChanged, h11, ((i12 << 3) & 112) | ((i12 << 15) & 3670016), 61);
            if (c.I()) {
                c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.views.CommonViewsKt$FilterCheckBox$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(a aVar2, int i15) {
                    CommonViewsKt.a(z11, onCheckedChanged, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void b(final boolean z11, final g00.a<p> onClick, a aVar, final int i11) {
        final int i12;
        int i13;
        int i14;
        o.i(onClick, "onClick");
        a h11 = aVar.h(1151350708);
        if ((i11 & 14) == 0) {
            if (h11.a(z11)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.F(onClick)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && h11.i()) {
            h11.L();
        } else {
            if (c.I()) {
                c.U(1151350708, i12, -1, "com.forsale.app.features.categories.listings.filtration.views.FilterRadioButton (CommonViews.kt:73)");
            }
            CompositionLocalKt.a(InteractiveComponentSizeKt.c().c(Boolean.FALSE), b.b(h11, 878090996, true, new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.views.CommonViewsKt$FilterRadioButton$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar2, int i15) {
                    if ((i15 & 11) == 2 && aVar2.i()) {
                        aVar2.L();
                        return;
                    }
                    if (c.I()) {
                        c.U(878090996, i15, -1, "com.forsale.app.features.categories.listings.filtration.views.FilterRadioButton.<anonymous> (CommonViews.kt:75)");
                    }
                    androidx.compose.ui.c p11 = SizeKt.p(androidx.compose.ui.c.f7566a, h.l(20));
                    d0 d0Var = d0.f6593a;
                    dk.a aVar3 = dk.a.f54291a;
                    int i16 = dk.a.f54292b;
                    d f11 = aVar3.a(aVar2, i16).f();
                    int i17 = d.f76453b;
                    c0 a11 = d0Var.a(f11.i(aVar2, i17), t1.o(aVar3.a(aVar2, i16).e().g(aVar2, i17), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), aVar3.a(aVar2, i16).e().g(aVar2, i17), aVar2, (d0.f6594b | 0) << 9, 0);
                    boolean z12 = z11;
                    g00.a<p> aVar4 = onClick;
                    int i18 = i12;
                    RadioButtonKt.a(z12, aVar4, p11, false, null, a11, aVar2, (i18 & 14) | 384 | (i18 & 112), 24);
                    if (c.I()) {
                        c.T();
                    }
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            }), h11, t0.f59917d | 0 | 48);
            if (c.I()) {
                c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.views.CommonViewsKt$FilterRadioButton$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar2, int i15) {
                    CommonViewsKt.b(z11, onClick, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void c(final x.a aVar, a aVar2, final int i11) {
        int i12;
        int i13;
        o.i(aVar, "<this>");
        a h11 = aVar2.h(-993311461);
        if ((i11 & 14) == 0) {
            if (h11.T(aVar)) {
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
        } else {
            if (c.I()) {
                c.U(-993311461, i11, -1, "com.forsale.app.features.categories.listings.filtration.views.NoResultsFound (CommonViews.kt:23)");
            }
            androidx.compose.ui.c a11 = x.a.a(aVar, androidx.compose.ui.c.f7566a, 0.0f, 1, null);
            h11.C(-483455358);
            a0 a12 = e.a(Arrangement.f3698a.h(), v0.b.f74009a.k(), h11, 0);
            h11.C(-1323940314);
            int a13 = j0.e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a14 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, p> c11 = LayoutKt.c(a11);
            if (!(h11.k() instanceof j0.d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a14);
            } else {
                h11.t();
            }
            a a15 = Updater.a(h11);
            Updater.c(a15, a12, companion.e());
            Updater.c(a15, s11, companion.g());
            g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
            if (a15.f() || !o.d(a15.D(), Integer.valueOf(a13))) {
                a15.u(Integer.valueOf(a13));
                a15.p(Integer.valueOf(a13), b11);
            }
            c11.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            f fVar = f.f74891a;
            ComposableSingletons$CommonViewsKt composableSingletons$CommonViewsKt = ComposableSingletons$CommonViewsKt.f30211a;
            StateKt.a(composableSingletons$CommonViewsKt.a(), composableSingletons$CommonViewsKt.b(), null, null, null, h11, 54, 28);
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            if (c.I()) {
                c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.views.CommonViewsKt$NoResultsFound$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar3, int i14) {
                    CommonViewsKt.c(x.a.this, aVar3, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0071, code lost:
        if (r0 == null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(androidx.compose.ui.c r35, final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> r36, final g00.l<? super java.lang.Integer, wz.p> r37, final java.lang.String r38, final z0.d r39, g00.p<? super androidx.compose.runtime.a, ? super java.lang.Integer, wz.p> r40, androidx.compose.runtime.a r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.views.CommonViewsKt.d(androidx.compose.ui.c, kotlinx.coroutines.flow.MutableStateFlow, g00.l, java.lang.String, z0.d, g00.p, androidx.compose.runtime.a, int, int):void");
    }

    private static final Integer e(n1<Integer> n1Var) {
        return n1Var.getValue();
    }

    public static final void f(androidx.compose.ui.c cVar, final MutableStateFlow<Integer> value, final int i11, ExtraAttributeEntity.LocalUnit localUnit, final z0.d focusManager, final l<? super Integer, p> onTextChanged, a aVar, final int i12, final int i13) {
        c.a aVar2;
        ExtraAttributeEntity.LocalUnit localUnit2;
        final ExtraAttributeEntity.LocalUnit localUnit3;
        r0.a aVar3;
        o.i(value, "value");
        o.i(focusManager, "focusManager");
        o.i(onTextChanged, "onTextChanged");
        a h11 = aVar.h(1486674800);
        if ((i13 & 1) != 0) {
            aVar2 = androidx.compose.ui.c.f7566a;
        } else {
            aVar2 = cVar;
        }
        if ((i13 & 8) != 0) {
            localUnit2 = null;
        } else {
            localUnit2 = localUnit;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(1486674800, i12, -1, "com.forsale.app.features.categories.listings.filtration.views.RangeField (CommonViews.kt:32)");
        }
        final n1 b11 = z.b(value, null, h11, 8, 1);
        h11.C(1157296644);
        boolean T = h11.T(onTextChanged);
        Object D = h11.D();
        if (T || D == a.f7182a.a()) {
            D = new l<Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.views.CommonViewsKt$RangeField$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                public final void b(Integer num) {
                    onTextChanged.invoke(num);
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(Integer num) {
                    b(num);
                    return p.f75480a;
                }
            };
            h11.u(D);
        }
        h11.S();
        l lVar = (l) D;
        w wVar = w.f61809a;
        boolean z11 = false;
        String format = String.format("%d", Arrays.copyOf(new Object[]{Integer.valueOf(i11)}, 1));
        o.h(format, "format(...)");
        if (localUnit2 != null) {
            z11 = true;
        }
        if (z11) {
            localUnit3 = localUnit2;
        } else {
            localUnit3 = null;
        }
        if (localUnit3 != null) {
            aVar3 = b.b(h11, 1017247853, true, new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.views.CommonViewsKt$RangeField$3$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar4, int i14) {
                    Integer g11;
                    int i15;
                    if ((i14 & 11) == 2 && aVar4.i()) {
                        aVar4.L();
                        return;
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(1017247853, i14, -1, "com.forsale.app.features.categories.listings.filtration.views.RangeField.<anonymous>.<anonymous> (CommonViews.kt:42)");
                    }
                    g11 = CommonViewsKt.g(b11);
                    if (g11 != null) {
                        i15 = g11.intValue();
                    } else {
                        i15 = i11;
                    }
                    String j11 = CommonViewsKt.j(i15, localUnit3);
                    if (j11 != null) {
                        TextKt.a(j11, null, 0, 0, false, 0, 0, null, null, 0L, 0, aVar4, 0, 0, 2046);
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return p.f75480a;
                }
            });
        } else {
            aVar3 = null;
        }
        d(aVar2, value, lVar, format, focusManager, aVar3, h11, (i12 & 14) | 32832, 0);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            final androidx.compose.ui.c cVar2 = aVar2;
            final ExtraAttributeEntity.LocalUnit localUnit4 = localUnit2;
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.views.CommonViewsKt$RangeField$4
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(a aVar4, int i14) {
                    CommonViewsKt.f(androidx.compose.ui.c.this, value, i11, localUnit4, focusManager, onTextChanged, aVar4, v0.a(i12 | 1), i13);
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer g(n1<Integer> n1Var) {
        return n1Var.getValue();
    }

    public static final void h(final androidx.compose.ui.c modifier, final z0.d focusManager, final MutableStateFlow<Integer> min, final MutableStateFlow<Integer> max, final int i11, final int i12, ExtraAttributeEntity.LocalUnit localUnit, a aVar, final int i13, final int i14) {
        ExtraAttributeEntity.LocalUnit localUnit2;
        o.i(modifier, "modifier");
        o.i(focusManager, "focusManager");
        o.i(min, "min");
        o.i(max, "max");
        a h11 = aVar.h(1028854197);
        if ((i14 & 64) != 0) {
            localUnit2 = null;
        } else {
            localUnit2 = localUnit;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(1028854197, i13, -1, "com.forsale.app.features.categories.listings.filtration.views.RangeFilter (CommonViews.kt:51)");
        }
        Arrangement.f o11 = Arrangement.f3698a.o(h.l(10));
        int i15 = (i13 & 14) | 48;
        h11.C(693286680);
        b.a aVar2 = v0.b.f74009a;
        int i16 = i15 >> 3;
        a0 a11 = androidx.compose.foundation.layout.o.a(o11, aVar2.l(), h11, (i16 & 112) | (i16 & 14));
        h11.C(-1323940314);
        int a12 = j0.e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        q<e1<ComposeUiNode>, a, Integer, p> c11 = LayoutKt.c(modifier);
        int i17 = ((((i15 << 3) & 112) << 9) & 7168) | 6;
        if (!(h11.k() instanceof j0.d)) {
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
        g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
        if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
            a14.u(Integer.valueOf(a12));
            a14.p(Integer.valueOf(a12), b11);
        }
        c11.invoke(e1.a(e1.b(h11)), h11, Integer.valueOf((i17 >> 3) & 112));
        h11.C(2058660585);
        u uVar = u.f74924a;
        c.a aVar3 = androidx.compose.ui.c.f7566a;
        androidx.compose.ui.c d11 = t.d(uVar, aVar3, 1.0f, false, 2, null);
        h11.C(733328855);
        a0 g11 = BoxKt.g(aVar2.o(), false, h11, 0);
        h11.C(-1323940314);
        int a15 = j0.e.a(h11, 0);
        k s12 = h11.s();
        g00.a<ComposeUiNode> a16 = companion.a();
        q<e1<ComposeUiNode>, a, Integer, p> c12 = LayoutKt.c(d11);
        if (!(h11.k() instanceof j0.d)) {
            j0.e.c();
        }
        h11.I();
        if (h11.f()) {
            h11.y(a16);
        } else {
            h11.t();
        }
        a a17 = Updater.a(h11);
        Updater.c(a17, g11, companion.e());
        Updater.c(a17, s12, companion.g());
        g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
        if (a17.f() || !o.d(a17.D(), Integer.valueOf(a15))) {
            a17.u(Integer.valueOf(a15));
            a17.p(Integer.valueOf(a15), b12);
        }
        c12.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
        int i18 = i13 >> 9;
        int i19 = i18 & 7168;
        f(null, min, i11, localUnit2, focusManager, new l<Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.views.CommonViewsKt$RangeFilter$1$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(Integer num) {
                min.setValue(num);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(Integer num) {
                b(num);
                return p.f75480a;
            }
        }, h11, ((i13 >> 6) & 896) | 32832 | i19, 1);
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        androidx.compose.ui.c d12 = t.d(uVar, aVar3, 1.0f, false, 2, null);
        h11.C(733328855);
        a0 g12 = BoxKt.g(aVar2.o(), false, h11, 0);
        h11.C(-1323940314);
        int a18 = j0.e.a(h11, 0);
        k s13 = h11.s();
        g00.a<ComposeUiNode> a19 = companion.a();
        q<e1<ComposeUiNode>, a, Integer, p> c13 = LayoutKt.c(d12);
        if (!(h11.k() instanceof j0.d)) {
            j0.e.c();
        }
        h11.I();
        if (h11.f()) {
            h11.y(a19);
        } else {
            h11.t();
        }
        a a21 = Updater.a(h11);
        Updater.c(a21, g12, companion.e());
        Updater.c(a21, s13, companion.g());
        g00.p<ComposeUiNode, Integer, p> b13 = companion.b();
        if (a21.f() || !o.d(a21.D(), Integer.valueOf(a18))) {
            a21.u(Integer.valueOf(a18));
            a21.p(Integer.valueOf(a18), b13);
        }
        c13.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        f(null, max, i12, localUnit2, focusManager, new l<Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.views.CommonViewsKt$RangeFilter$1$2$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(Integer num) {
                max.setValue(num);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(Integer num) {
                b(num);
                return p.f75480a;
            }
        }, h11, (i18 & 896) | 32832 | i19, 1);
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
            final ExtraAttributeEntity.LocalUnit localUnit3 = localUnit2;
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.views.CommonViewsKt$RangeFilter$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar4, int i21) {
                    CommonViewsKt.h(androidx.compose.ui.c.this, focusManager, min, max, i11, i12, localUnit3, aVar4, v0.a(i13 | 1), i14);
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final String j(int i11, ExtraAttributeEntity.LocalUnit localUnit) {
        o.i(localUnit, "localUnit");
        if (i11 != 0 && i11 != 1) {
            if (i11 != 2) {
                return localUnit.getPlural();
            }
            return localUnit.getDual();
        }
        return localUnit.getSingular();
    }
}
