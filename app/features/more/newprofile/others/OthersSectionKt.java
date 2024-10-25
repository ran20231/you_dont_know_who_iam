package com.forsale.app.features.more.newprofile.others;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.e;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.c;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.dividers.DividersKt;
import com.forsale.designSystem.layouts.ListItemKt;
import e2.h;
import g00.a;
import g00.q;
import j0.d;
import j0.d1;
import j0.e1;
import j0.k;
import j0.v0;
import kotlin.jvm.internal.o;
import p1.g;
import t9.y0;
import v0.b;
import w.f;
import w.t;
import wz.p;
/* compiled from: OthersSection.kt */
/* loaded from: classes2.dex */
public final class OthersSectionKt {
    public static final void a(final a<p> onClick, androidx.compose.runtime.a aVar, final int i11) {
        int i12;
        androidx.compose.runtime.a aVar2;
        int i13;
        o.i(onClick, "onClick");
        androidx.compose.runtime.a h11 = aVar.h(1589951919);
        if ((i11 & 14) == 0) {
            if (h11.F(onClick)) {
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
                c.U(1589951919, i12, -1, "com.forsale.app.features.more.newprofile.others.AboutUsRow (OthersSection.kt:74)");
            }
            c.a aVar3 = androidx.compose.ui.c.f7566a;
            androidx.compose.ui.c h12 = SizeKt.h(aVar3, 0.0f, 1, null);
            h11.C(1157296644);
            boolean T = h11.T(onClick);
            Object D = h11.D();
            if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                D = new a<p>() { // from class: com.forsale.app.features.more.newprofile.others.OthersSectionKt$AboutUsRow$1$1
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
                        onClick.invoke();
                    }
                };
                h11.u(D);
            }
            h11.S();
            androidx.compose.ui.c e11 = ClickableKt.e(h12, false, null, null, (a) D, 7, null);
            ComposableSingletons$OthersSectionKt composableSingletons$OthersSectionKt = ComposableSingletons$OthersSectionKt.f32556a;
            q<t, androidx.compose.runtime.a, Integer, p> d11 = composableSingletons$OthersSectionKt.d();
            q<t, androidx.compose.runtime.a, Integer, p> e12 = composableSingletons$OthersSectionKt.e();
            q<w.c, androidx.compose.runtime.a, Integer, p> f11 = composableSingletons$OthersSectionKt.f();
            h11.C(1157296644);
            boolean T2 = h11.T(onClick);
            Object D2 = h11.D();
            if (T2 || D2 == androidx.compose.runtime.a.f7182a.a()) {
                D2 = new a<p>() { // from class: com.forsale.app.features.more.newprofile.others.OthersSectionKt$AboutUsRow$2$1
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
                        onClick.invoke();
                    }
                };
                h11.u(D2);
            }
            h11.S();
            aVar2 = h11;
            ListItemKt.a(e11, false, d11, e12, null, null, null, null, f11, false, 0.0f, 0.0f, 0.0f, (a) D2, aVar2, 100666752, 0, 7922);
            DividersKt.a(PaddingKt.k(aVar3, h.l(16), 0.0f, 2, null), 0.0f, 0L, aVar2, 6, 6);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = aVar2.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.newprofile.others.OthersSectionKt$AboutUsRow$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar4, int i14) {
                    OthersSectionKt.a(onClick, aVar4, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void b(final a<p> onTermsAndConditionsClick, final a<p> onAboutUsClick, androidx.compose.runtime.a aVar, final int i11) {
        int i12;
        androidx.compose.runtime.a aVar2;
        int i13;
        int i14;
        o.i(onTermsAndConditionsClick, "onTermsAndConditionsClick");
        o.i(onAboutUsClick, "onAboutUsClick");
        androidx.compose.runtime.a h11 = aVar.h(1847639660);
        if ((i11 & 14) == 0) {
            if (h11.F(onTermsAndConditionsClick)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.F(onAboutUsClick)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && h11.i()) {
            h11.L();
            aVar2 = h11;
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(1847639660, i12, -1, "com.forsale.app.features.more.newprofile.others.OthersSection (OthersSection.kt:29)");
            }
            c.a aVar3 = androidx.compose.ui.c.f7566a;
            androidx.compose.ui.c a11 = IntrinsicKt.a(SizeKt.h(aVar3, 0.0f, 1, null), IntrinsicSize.Min);
            Arrangement.f o11 = Arrangement.f3698a.o(h.l(4));
            h11.C(-483455358);
            a0 a12 = e.a(o11, b.f74009a.k(), h11, 6);
            h11.C(-1323940314);
            int a13 = j0.e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            a<ComposeUiNode> a14 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(a11);
            if (!(h11.k() instanceof d)) {
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
            if (a15.f() || !o.d(a15.D(), Integer.valueOf(a13))) {
                a15.u(Integer.valueOf(a13));
                a15.p(Integer.valueOf(a13), b11);
            }
            c11.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            f fVar = f.f74891a;
            String b12 = g.b(y0.f70475gd, h11, 0);
            dk.a aVar4 = dk.a.f54291a;
            int i15 = dk.a.f54292b;
            TextKt.a(b12, PaddingKt.m(aVar3, h.l(16), h.l(12), 0.0f, 0.0f, 12, null), 0, 0, false, 0, 0, null, aVar4.c(h11, i15).h(), aVar4.a(h11, i15).f().i(h11, yj.d.f76453b), 0, h11, 48, 0, 1276);
            aVar2 = h11;
            aVar2.C(1157296644);
            boolean T = aVar2.T(onTermsAndConditionsClick);
            Object D = aVar2.D();
            if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                D = new a<p>() { // from class: com.forsale.app.features.more.newprofile.others.OthersSectionKt$OthersSection$1$1$1
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
                        onTermsAndConditionsClick.invoke();
                    }
                };
                aVar2.u(D);
            }
            aVar2.S();
            c((a) D, aVar2, 0);
            aVar2.C(1157296644);
            boolean T2 = aVar2.T(onAboutUsClick);
            Object D2 = aVar2.D();
            if (T2 || D2 == androidx.compose.runtime.a.f7182a.a()) {
                D2 = new a<p>() { // from class: com.forsale.app.features.more.newprofile.others.OthersSectionKt$OthersSection$1$2$1
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
                        onAboutUsClick.invoke();
                    }
                };
                aVar2.u(D2);
            }
            aVar2.S();
            a((a) D2, aVar2, 0);
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
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.newprofile.others.OthersSectionKt$OthersSection$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar5, int i16) {
                    OthersSectionKt.b(onTermsAndConditionsClick, onAboutUsClick, aVar5, v0.a(i11 | 1));
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
    public static final void c(final a<p> aVar, androidx.compose.runtime.a aVar2, final int i11) {
        int i12;
        androidx.compose.runtime.a aVar3;
        int i13;
        androidx.compose.runtime.a h11 = aVar2.h(520382019);
        if ((i11 & 14) == 0) {
            if (h11.F(aVar)) {
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
            aVar3 = h11;
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(520382019, i12, -1, "com.forsale.app.features.more.newprofile.others.TermsConditionsRow (OthersSection.kt:48)");
            }
            c.a aVar4 = androidx.compose.ui.c.f7566a;
            androidx.compose.ui.c h12 = SizeKt.h(aVar4, 0.0f, 1, null);
            h11.C(1157296644);
            boolean T = h11.T(aVar);
            Object D = h11.D();
            if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                D = new a<p>() { // from class: com.forsale.app.features.more.newprofile.others.OthersSectionKt$TermsConditionsRow$1$1
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
            androidx.compose.ui.c e11 = ClickableKt.e(h12, false, null, null, (a) D, 7, null);
            ComposableSingletons$OthersSectionKt composableSingletons$OthersSectionKt = ComposableSingletons$OthersSectionKt.f32556a;
            q<t, androidx.compose.runtime.a, Integer, p> a11 = composableSingletons$OthersSectionKt.a();
            q<t, androidx.compose.runtime.a, Integer, p> b11 = composableSingletons$OthersSectionKt.b();
            q<w.c, androidx.compose.runtime.a, Integer, p> c11 = composableSingletons$OthersSectionKt.c();
            h11.C(1157296644);
            boolean T2 = h11.T(aVar);
            Object D2 = h11.D();
            if (T2 || D2 == androidx.compose.runtime.a.f7182a.a()) {
                D2 = new a<p>() { // from class: com.forsale.app.features.more.newprofile.others.OthersSectionKt$TermsConditionsRow$2$1
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
                h11.u(D2);
            }
            h11.S();
            aVar3 = h11;
            ListItemKt.a(e11, false, a11, b11, null, null, null, null, c11, false, 0.0f, 0.0f, 0.0f, (a) D2, aVar3, 100666752, 0, 7922);
            DividersKt.a(PaddingKt.k(aVar4, h.l(16), 0.0f, 2, null), 0.0f, 0L, aVar3, 6, 6);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = aVar3.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.newprofile.others.OthersSectionKt$TermsConditionsRow$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar5, int i14) {
                    OthersSectionKt.c(aVar, aVar5, v0.a(i11 | 1));
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
