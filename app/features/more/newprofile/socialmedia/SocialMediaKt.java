package com.forsale.app.features.more.newprofile.socialmedia;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.c;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import c0.g;
import com.forsale.app.features.more.user.profile.NewProfileViewModel;
import e2.h;
import g00.a;
import g00.q;
import j0.d1;
import j0.e;
import j0.e1;
import j0.k;
import j0.v0;
import kotlin.jvm.internal.o;
import t9.q0;
import v0.b;
import w.u;
import wz.p;
import yj.d;
/* compiled from: SocialMedia.kt */
/* loaded from: classes2.dex */
public final class SocialMediaKt {
    public static final void a(final a<p> onClick, androidx.compose.runtime.a aVar, final int i11) {
        int i12;
        int i13;
        o.i(onClick, "onClick");
        androidx.compose.runtime.a h11 = aVar.h(-283153925);
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
        } else {
            if (c.I()) {
                c.U(-283153925, i12, -1, "com.forsale.app.features.more.newprofile.socialmedia.Facebook (SocialMedia.kt:43)");
            }
            c.a aVar2 = androidx.compose.ui.c.f7566a;
            float f11 = 48;
            androidx.compose.ui.c a11 = BackgroundKt.a(SizeKt.i(SizeKt.u(aVar2, h.l(f11)), h.l(f11)), dk.a.f54291a.a(h11, dk.a.f54292b).e().h(h11, d.f76453b), g.f());
            h11.C(1157296644);
            boolean T = h11.T(onClick);
            Object D = h11.D();
            if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                D = new a<p>() { // from class: com.forsale.app.features.more.newprofile.socialmedia.SocialMediaKt$Facebook$1$1
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
            androidx.compose.ui.c e11 = ClickableKt.e(a11, false, null, null, (a) D, 7, null);
            h11.C(733328855);
            b.a aVar3 = b.f74009a;
            a0 g11 = BoxKt.g(aVar3.o(), false, h11, 0);
            h11.C(-1323940314);
            int a12 = e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(e11);
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
            Updater.c(a14, g11, companion.e());
            Updater.c(a14, s11, companion.g());
            g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
            if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.p(Integer.valueOf(a12), b11);
            }
            c11.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            ImageKt.a(p1.e.d(q0.D, h11, 0), null, BoxScopeInstance.f3756a.e(aVar2, aVar3.e()), null, null, 0.0f, null, h11, 56, 120);
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
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.newprofile.socialmedia.SocialMediaKt$Facebook$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar4, int i14) {
                    SocialMediaKt.a(onClick, aVar4, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void b(final a<p> onClick, androidx.compose.runtime.a aVar, final int i11) {
        int i12;
        int i13;
        o.i(onClick, "onClick");
        androidx.compose.runtime.a h11 = aVar.h(-1907416245);
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
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-1907416245, i12, -1, "com.forsale.app.features.more.newprofile.socialmedia.Instagram (SocialMedia.kt:52)");
            }
            c.a aVar2 = androidx.compose.ui.c.f7566a;
            float f11 = 48;
            androidx.compose.ui.c a11 = BackgroundKt.a(SizeKt.i(SizeKt.u(aVar2, h.l(f11)), h.l(f11)), dk.a.f54291a.a(h11, dk.a.f54292b).e().h(h11, d.f76453b), g.f());
            h11.C(1157296644);
            boolean T = h11.T(onClick);
            Object D = h11.D();
            if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                D = new a<p>() { // from class: com.forsale.app.features.more.newprofile.socialmedia.SocialMediaKt$Instagram$1$1
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
            androidx.compose.ui.c e11 = ClickableKt.e(a11, false, null, null, (a) D, 7, null);
            h11.C(733328855);
            b.a aVar3 = b.f74009a;
            a0 g11 = BoxKt.g(aVar3.o(), false, h11, 0);
            h11.C(-1323940314);
            int a12 = e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(e11);
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
            Updater.c(a14, g11, companion.e());
            Updater.c(a14, s11, companion.g());
            g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
            if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.p(Integer.valueOf(a12), b11);
            }
            c11.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            ImageKt.a(p1.e.d(q0.D2, h11, 0), null, BoxScopeInstance.f3756a.e(aVar2, aVar3.e()), null, null, 0.0f, null, h11, 56, 120);
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
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.newprofile.socialmedia.SocialMediaKt$Instagram$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar4, int i14) {
                    SocialMediaKt.b(onClick, aVar4, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void c(final NewProfileViewModel viewModel, androidx.compose.runtime.a aVar, final int i11) {
        o.i(viewModel, "viewModel");
        androidx.compose.runtime.a h11 = aVar.h(1787079763);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(1787079763, i11, -1, "com.forsale.app.features.more.newprofile.socialmedia.SocialMedia (SocialMedia.kt:25)");
        }
        float f11 = 16;
        androidx.compose.ui.c m11 = PaddingKt.m(IntrinsicKt.a(SizeKt.h(androidx.compose.ui.c.f7566a, 0.0f, 1, null), IntrinsicSize.Min), 0.0f, h.l(f11), 0.0f, h.l(f11), 5, null);
        Arrangement arrangement = Arrangement.f3698a;
        float l11 = h.l(f11);
        b.a aVar2 = b.f74009a;
        Arrangement.e p11 = arrangement.p(l11, aVar2.g());
        h11.C(693286680);
        a0 a11 = androidx.compose.foundation.layout.o.a(p11, aVar2.l(), h11, 6);
        h11.C(-1323940314);
        int a12 = e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        a<ComposeUiNode> a13 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(m11);
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
        if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
            a14.u(Integer.valueOf(a12));
            a14.p(Integer.valueOf(a12), b11);
        }
        c11.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        u uVar = u.f74924a;
        a(new a<p>() { // from class: com.forsale.app.features.more.newprofile.socialmedia.SocialMediaKt$SocialMedia$1$1
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
                NewProfileViewModel.this.O();
            }
        }, h11, 0);
        d(new a<p>() { // from class: com.forsale.app.features.more.newprofile.socialmedia.SocialMediaKt$SocialMedia$1$2
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
                NewProfileViewModel.this.k0();
            }
        }, h11, 0);
        b(new a<p>() { // from class: com.forsale.app.features.more.newprofile.socialmedia.SocialMediaKt$SocialMedia$1$3
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
                NewProfileViewModel.this.X();
            }
        }, h11, 0);
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l12 = h11.l();
        if (l12 != null) {
            l12.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.newprofile.socialmedia.SocialMediaKt$SocialMedia$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar3, int i12) {
                    SocialMediaKt.c(NewProfileViewModel.this, aVar3, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void d(final a<p> onClick, androidx.compose.runtime.a aVar, final int i11) {
        int i12;
        int i13;
        o.i(onClick, "onClick");
        androidx.compose.runtime.a h11 = aVar.h(157146892);
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
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(157146892, i12, -1, "com.forsale.app.features.more.newprofile.socialmedia.Twitter (SocialMedia.kt:61)");
            }
            c.a aVar2 = androidx.compose.ui.c.f7566a;
            float f11 = 48;
            androidx.compose.ui.c a11 = BackgroundKt.a(SizeKt.i(SizeKt.u(aVar2, h.l(f11)), h.l(f11)), dk.a.f54291a.a(h11, dk.a.f54292b).e().h(h11, d.f76453b), g.f());
            h11.C(1157296644);
            boolean T = h11.T(onClick);
            Object D = h11.D();
            if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                D = new a<p>() { // from class: com.forsale.app.features.more.newprofile.socialmedia.SocialMediaKt$Twitter$1$1
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
            androidx.compose.ui.c e11 = ClickableKt.e(a11, false, null, null, (a) D, 7, null);
            h11.C(733328855);
            b.a aVar3 = b.f74009a;
            a0 g11 = BoxKt.g(aVar3.o(), false, h11, 0);
            h11.C(-1323940314);
            int a12 = e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(e11);
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
            Updater.c(a14, g11, companion.e());
            Updater.c(a14, s11, companion.g());
            g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
            if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.p(Integer.valueOf(a12), b11);
            }
            c11.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            ImageKt.a(p1.e.d(sj.d.Q, h11, 0), null, BoxScopeInstance.f3756a.e(aVar2, aVar3.e()), null, null, 0.0f, null, h11, 56, 120);
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
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.newprofile.socialmedia.SocialMediaKt$Twitter$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar4, int i14) {
                    SocialMediaKt.d(onClick, aVar4, v0.a(i11 | 1));
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
