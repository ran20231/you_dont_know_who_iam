package com.forsale.app.features.more.newprofile;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.e;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.runtime.z;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import com.forsale.app.features.auth.UserStatus;
import com.forsale.app.features.more.newprofile.contactus.ContactUsSectionKt;
import com.forsale.app.features.more.newprofile.header.MainHeaderKt;
import com.forsale.app.features.more.newprofile.myaccount.MyAccountSectionKt;
import com.forsale.app.features.more.newprofile.others.OthersSectionKt;
import com.forsale.app.features.more.newprofile.setting.SettingSectionKt;
import com.forsale.app.features.more.newprofile.socialmedia.SocialMediaKt;
import com.forsale.app.features.more.user.profile.NewProfileViewModel;
import com.forsale.app.utils.Languages;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.buttons.ButtonsKt;
import com.forsale.designSystem.dividers.DividersKt;
import e2.h;
import g00.q;
import j0.d;
import j0.d1;
import j0.e1;
import j0.k;
import j0.n1;
import j0.v0;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.w;
import p1.g;
import t9.y0;
import v0.b;
import w.f;
import w.u;
import wz.p;
/* compiled from: NewProfileScreen.kt */
/* loaded from: classes2.dex */
public final class NewProfileScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final String str, a aVar, final int i11) {
        int i12;
        a aVar2;
        int i13;
        a h11 = aVar.h(285723771);
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
            if (c.I()) {
                c.U(285723771, i11, -1, "com.forsale.app.features.more.newprofile.AppVersionSection (NewProfileScreen.kt:117)");
            }
            float f11 = 16;
            androidx.compose.ui.c i14 = PaddingKt.i(IntrinsicKt.a(SizeKt.h(androidx.compose.ui.c.f7566a, 0.0f, 1, null), IntrinsicSize.Min), h.l(f11));
            b.InterfaceC0889b g11 = b.f74009a.g();
            Arrangement.f o11 = Arrangement.f3698a.o(h.l(f11));
            h11.C(-483455358);
            a0 a11 = e.a(o11, g11, h11, 54);
            h11.C(-1323940314);
            int a12 = j0.e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, p> c11 = LayoutKt.c(i14);
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
            g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
            if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.p(Integer.valueOf(a12), b11);
            }
            c11.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            f fVar = f.f74891a;
            w wVar = w.f61809a;
            String format = String.format(new Locale(Languages.Companion.b().getValue()), g.b(y0.Xc, h11, 0), Arrays.copyOf(new Object[]{str}, 1));
            o.h(format, "format(...)");
            dk.a aVar3 = dk.a.f54291a;
            int i15 = dk.a.f54292b;
            long j11 = aVar3.a(h11, i15).e().j(h11, yj.d.f76453b);
            androidx.compose.ui.text.a0 h12 = aVar3.c(h11, i15).h();
            aVar2 = h11;
            TextKt.a(format, null, 0, 0, false, 0, 0, null, h12, j11, 0, h11, 0, 0, 1278);
            aVar2.S();
            aVar2.w();
            aVar2.S();
            aVar2.S();
            if (c.I()) {
                c.T();
            }
        }
        d1 l11 = aVar2.l();
        if (l11 != null) {
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.more.newprofile.NewProfileScreenKt$AppVersionSection$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar4, int i16) {
                    NewProfileScreenKt.a(str, aVar4, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void b(final NewProfileViewModel viewModel, a aVar, final int i11) {
        o.i(viewModel, "viewModel");
        a h11 = aVar.h(-2130048258);
        if (c.I()) {
            c.U(-2130048258, i11, -1, "com.forsale.app.features.more.newprofile.NewProfileScreen (NewProfileScreen.kt:45)");
        }
        h11.C(-483455358);
        c.a aVar2 = androidx.compose.ui.c.f7566a;
        a0 a11 = e.a(Arrangement.f3698a.h(), b.f74009a.k(), h11, 0);
        h11.C(-1323940314);
        int a12 = j0.e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        q<e1<ComposeUiNode>, a, Integer, p> c11 = LayoutKt.c(aVar2);
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
        g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
        if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
            a14.u(Integer.valueOf(a12));
            a14.p(Integer.valueOf(a12), b11);
        }
        c11.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        f fVar = f.f74891a;
        n1 b12 = z.b(viewModel.J(), null, h11, 8, 1);
        e(new g00.a<p>() { // from class: com.forsale.app.features.more.newprofile.NewProfileScreenKt$NewProfileScreen$1$1
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
                NewProfileViewModel.this.d0();
            }
        }, h11, 0);
        SpacerKt.a(PaddingKt.i(aVar2, h.l(4)), h11, 6);
        d(viewModel, c(b12), h11, 8);
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.more.newprofile.NewProfileScreenKt$NewProfileScreen$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar3, int i12) {
                    NewProfileScreenKt.b(NewProfileViewModel.this, aVar3, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    private static final UserStatus c(n1<? extends UserStatus> n1Var) {
        return n1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(final NewProfileViewModel newProfileViewModel, final UserStatus userStatus, a aVar, final int i11) {
        a h11 = aVar.h(1727271504);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(1727271504, i11, -1, "com.forsale.app.features.more.newprofile.NewProfileUISetup (NewProfileScreen.kt:77)");
        }
        c.a aVar2 = androidx.compose.ui.c.f7566a;
        androidx.compose.ui.c f11 = ScrollKt.f(aVar2, ScrollKt.c(0, h11, 0, 1), false, null, false, 14, null);
        h11.C(-483455358);
        a0 a11 = e.a(Arrangement.f3698a.h(), b.f74009a.k(), h11, 0);
        h11.C(-1323940314);
        int a12 = j0.e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        q<e1<ComposeUiNode>, a, Integer, p> c11 = LayoutKt.c(f11);
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
        g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
        if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
            a14.u(Integer.valueOf(a12));
            a14.p(Integer.valueOf(a12), b11);
        }
        c11.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        f fVar = f.f74891a;
        int i12 = (i11 & 112) | 8;
        MainHeaderKt.d(newProfileViewModel, userStatus, h11, i12);
        float f12 = 8;
        androidx.compose.ui.c i13 = SizeKt.i(aVar2, h.l(f12));
        dk.a aVar3 = dk.a.f54291a;
        int i14 = dk.a.f54292b;
        yj.d e11 = aVar3.a(h11, i14).e();
        int i15 = yj.d.f76453b;
        DividersKt.a(i13, 0.0f, e11.h(h11, i15), h11, 6, 2);
        h11.C(352502116);
        if (userStatus == UserStatus.LoggedIn || userStatus == UserStatus.NotLoggedIn) {
            MyAccountSectionKt.c(newProfileViewModel, userStatus, h11, i12);
        }
        h11.S();
        DividersKt.a(SizeKt.i(aVar2, h.l(f12)), 0.0f, aVar3.a(h11, i14).e().h(h11, i15), h11, 6, 2);
        SettingSectionKt.b(userStatus, new g00.a<p>() { // from class: com.forsale.app.features.more.newprofile.NewProfileScreenKt$NewProfileUISetup$1$1
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
                NewProfileViewModel.this.Y();
            }
        }, new g00.a<p>() { // from class: com.forsale.app.features.more.newprofile.NewProfileScreenKt$NewProfileUISetup$1$2
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
                NewProfileViewModel.this.T();
            }
        }, h11, (i11 >> 3) & 14);
        DividersKt.a(SizeKt.i(aVar2, h.l(f12)), 0.0f, aVar3.a(h11, i14).e().h(h11, i15), h11, 6, 2);
        ContactUsSectionKt.b(new g00.a<p>() { // from class: com.forsale.app.features.more.newprofile.NewProfileScreenKt$NewProfileUISetup$1$3
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
                NewProfileViewModel.this.M();
            }
        }, new g00.a<p>() { // from class: com.forsale.app.features.more.newprofile.NewProfileScreenKt$NewProfileUISetup$1$4
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
                NewProfileViewModel.this.i0();
            }
        }, h11, 0);
        DividersKt.a(SizeKt.i(aVar2, h.l(f12)), 0.0f, aVar3.a(h11, i14).e().h(h11, i15), h11, 6, 2);
        OthersSectionKt.b(new g00.a<p>() { // from class: com.forsale.app.features.more.newprofile.NewProfileScreenKt$NewProfileUISetup$1$5
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
                NewProfileViewModel.this.j0();
            }
        }, new g00.a<p>() { // from class: com.forsale.app.features.more.newprofile.NewProfileScreenKt$NewProfileUISetup$1$6
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
                NewProfileViewModel.this.L();
            }
        }, h11, 0);
        SocialMediaKt.c(newProfileViewModel, h11, 8);
        a(newProfileViewModel.y(), h11, 0);
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.more.newprofile.NewProfileScreenKt$NewProfileUISetup$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar4, int i16) {
                    NewProfileScreenKt.d(NewProfileViewModel.this, userStatus, aVar4, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void e(final g00.a<p> onNotificationsClicked, a aVar, final int i11) {
        int i12;
        int i13;
        o.i(onNotificationsClicked, "onNotificationsClicked");
        a h11 = aVar.h(-1673931024);
        if ((i11 & 14) == 0) {
            if (h11.F(onNotificationsClicked)) {
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
                androidx.compose.runtime.c.U(-1673931024, i12, -1, "com.forsale.app.features.more.newprofile.TopToolBar (NewProfileScreen.kt:54)");
            }
            float f11 = 12;
            androidx.compose.ui.c m11 = PaddingKt.m(SizeKt.h(androidx.compose.ui.c.f7566a, 0.0f, 1, null), h.l(f11), h.l(f11), h.l(f11), 0.0f, 8, null);
            Arrangement arrangement = Arrangement.f3698a;
            float l11 = h.l(f11);
            b.a aVar2 = b.f74009a;
            Arrangement.e p11 = arrangement.p(l11, aVar2.j());
            h11.C(693286680);
            a0 a11 = androidx.compose.foundation.layout.o.a(p11, aVar2.l(), h11, 6);
            h11.C(-1323940314);
            int a12 = j0.e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, p> c11 = LayoutKt.c(m11);
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
            g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
            if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.p(Integer.valueOf(a12), b11);
            }
            c11.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            u uVar = u.f74924a;
            h11.C(1157296644);
            boolean T = h11.T(onNotificationsClicked);
            Object D = h11.D();
            if (T || D == a.f7182a.a()) {
                D = new g00.a<p>() { // from class: com.forsale.app.features.more.newprofile.NewProfileScreenKt$TopToolBar$1$1$1
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
                        onNotificationsClicked.invoke();
                    }
                };
                h11.u(D);
            }
            h11.S();
            ButtonsKt.g((g00.a) D, null, false, null, null, ComposableSingletons$NewProfileScreenKt.f32056a.a(), h11, 196608, 30);
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l12 = h11.l();
        if (l12 != null) {
            l12.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.more.newprofile.NewProfileScreenKt$TopToolBar$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar3, int i14) {
                    NewProfileScreenKt.e(onNotificationsClicked, aVar3, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }
}
