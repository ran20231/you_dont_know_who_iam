package com.forsale.app.features.auth.verification;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.z;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.platform.x3;
import androidx.compose.ui.text.input.b0;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.q0;
import androidx.lifecycle.t0;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.x0;
import com.forsale.app.features.auth.AuthActivity;
import com.forsale.app.features.auth.AuthViewModel;
import com.forsale.app.features.auth.b;
import com.forsale.app.features.auth.utils.ComponentsTags;
import com.forsale.app.features.auth.views.ClickableTextKt;
import com.forsale.app.features.auth.views.textfieldstates.TextFieldState;
import com.forsale.app.feedback.FeedbackSnackBarComponentKt;
import com.forsale.app.ui.dialogs.LoadingDialogKt;
import com.forsale.app.utils.ContextExtensionsKt;
import com.forsale.app.utils.Languages;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.buttons.ButtonsKt;
import com.forsale.designSystem.inputs.InputsKt;
import com.forsale.designSystem.theme.ThemeKt;
import e2.h;
import g00.l;
import g00.q;
import j0.d;
import j0.d1;
import j0.e;
import j0.e1;
import j0.k;
import j0.k0;
import j0.n1;
import j0.t0;
import j0.u;
import j0.v0;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import p1.g;
import rj.a;
import t9.y0;
import tv.teads.sdk.engine.bridges.network.NetworkResponse;
import v0.b;
import w.f;
import w3.a;
import wz.p;
/* compiled from: VerificationScreen.kt */
/* loaded from: classes2.dex */
public final class VerificationScreenKt {
    public static final void a(final int i11, final q<? super Integer, ? super a, ? super Integer, p> content, a aVar, final int i12) {
        int i13;
        int i14;
        int i15;
        o.i(content, "content");
        a h11 = aVar.h(538610924);
        if ((i12 & 14) == 0) {
            if (h11.d(i11)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i13 = i15 | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            if (h11.F(content)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i13 |= i14;
        }
        if ((i13 & 91) == 18 && h11.i()) {
            h11.L();
        } else {
            if (c.I()) {
                c.U(538610924, i13, -1, "com.forsale.app.features.auth.verification.Countdown (VerificationScreen.kt:338)");
            }
            h11.C(-492369756);
            Object D = h11.D();
            a.C0064a c0064a = a.f7182a;
            if (D == c0064a.a()) {
                D = c0.e(Integer.valueOf(i11), null, 2, null);
                h11.u(D);
            }
            h11.S();
            k0 k0Var = (k0) D;
            content.invoke(Integer.valueOf(b(k0Var)), h11, Integer.valueOf(i13 & 112));
            Integer valueOf = Integer.valueOf(b(k0Var));
            h11.C(1157296644);
            boolean T = h11.T(k0Var);
            Object D2 = h11.D();
            if (T || D2 == c0064a.a()) {
                D2 = new VerificationScreenKt$Countdown$1$1(k0Var, null);
                h11.u(D2);
            }
            h11.S();
            u.d(valueOf, (g00.p) D2, h11, 64);
            if (c.I()) {
                c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.auth.verification.VerificationScreenKt$Countdown$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(a aVar2, int i16) {
                    VerificationScreenKt.a(i11, content, aVar2, v0.a(i12 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(k0<Integer> k0Var) {
        return k0Var.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(k0<Integer> k0Var, int i11) {
        k0Var.setValue(Integer.valueOf(i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(final VerificationScreenViewModel verificationScreenViewModel, final b.a aVar, final AuthViewModel authViewModel, a aVar2, final int i11) {
        a h11 = aVar2.h(437291461);
        if (c.I()) {
            c.U(437291461, i11, -1, "com.forsale.app.features.auth.verification.LogScreenError (VerificationScreen.kt:360)");
        }
        String y11 = verificationScreenViewModel.y();
        if (o.d(y11, VerificationScreenIntention.SIGNUP.getValue())) {
            verificationScreenViewModel.L(authViewModel.j(), authViewModel.m(), aVar.a());
        } else if (o.d(y11, VerificationScreenIntention.FORGET_PASSWORD.getValue())) {
            verificationScreenViewModel.H(authViewModel.j(), authViewModel.m(), aVar.a());
        }
        if (c.I()) {
            c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.auth.verification.VerificationScreenKt$LogScreenError$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar3, int i12) {
                    VerificationScreenKt.d(VerificationScreenViewModel.this, aVar, authViewModel, aVar3, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(final VerificationScreenViewModel verificationScreenViewModel, final TextFieldState textFieldState, final l<? super String, p> lVar, a aVar, final int i11) {
        a h11 = aVar.h(1545347170);
        if (c.I()) {
            c.U(1545347170, i11, -1, "com.forsale.app.features.auth.verification.RegisterObserver (VerificationScreen.kt:384)");
        }
        Object q11 = h11.q(AndroidCompositionLocals_androidKt.g());
        o.g(q11, "null cannot be cast to non-null type com.forsale.app.features.auth.AuthActivity");
        p pVar = p.f75480a;
        u.d(pVar, new VerificationScreenKt$RegisterObserver$1(verificationScreenViewModel, textFieldState, null), h11, 70);
        u.d(pVar, new VerificationScreenKt$RegisterObserver$2(verificationScreenViewModel, lVar, textFieldState, null), h11, 70);
        u.d(pVar, new VerificationScreenKt$RegisterObserver$3(verificationScreenViewModel, (AuthActivity) q11, null), h11, 70);
        if (c.I()) {
            c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.auth.verification.VerificationScreenKt$RegisterObserver$4
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(a aVar2, int i12) {
                    VerificationScreenKt.e(VerificationScreenViewModel.this, textFieldState, lVar, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(final VerificationScreenViewModel verificationScreenViewModel, final AuthViewModel authViewModel, final boolean z11, final l<? super String, p> lVar, a aVar, final int i11) {
        a h11 = aVar.h(-203522257);
        if (c.I()) {
            c.U(-203522257, i11, -1, "com.forsale.app.features.auth.verification.RenderOnStartVerificationScreen (VerificationScreen.kt:93)");
        }
        StateFlow<b> F = verificationScreenViewModel.F();
        b.C0253b c0253b = b.C0253b.f22616a;
        b bVar = (b) z.a(F, c0253b, null, h11, 56, 2).getValue();
        if (o.d(bVar, c0253b)) {
            h11.C(1151876977);
            h11.S();
            verificationScreenViewModel.O(authViewModel.j(), authViewModel.m());
            verificationScreenViewModel.X(z11);
            lVar.invoke(verificationScreenViewModel.y());
        } else if (o.d(bVar, b.c.f22617a)) {
            h11.C(1151877279);
            h11.S();
            verificationScreenViewModel.w(true);
        } else if (bVar instanceof b.d) {
            h11.C(1151877376);
            verificationScreenViewModel.w(false);
            if (o.d(verificationScreenViewModel.y(), VerificationScreenIntention.SIGNUP.getValue()) && o.d(((b.d) bVar).a(), Boolean.TRUE)) {
                FeedbackSnackBarComponentKt.a(PaddingKt.i(androidx.compose.ui.c.f7566a, h.l(16)), verificationScreenViewModel.D(), h11, 70, 0);
            }
            h11.S();
        } else if (bVar instanceof b.a) {
            h11.C(1151877788);
            verificationScreenViewModel.w(false);
            d(verificationScreenViewModel, (b.a) bVar, authViewModel, h11, NetworkResponse.UNKNOWN_ERROR_CODE);
            h11.S();
        } else {
            h11.C(1151877930);
            h11.S();
        }
        if (c.I()) {
            c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.auth.verification.VerificationScreenKt$RenderOnStartVerificationScreen$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(a aVar2, int i12) {
                    VerificationScreenKt.f(VerificationScreenViewModel.this, authViewModel, z11, lVar, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(final String str, final g00.a<p> aVar, a aVar2, final int i11) {
        final int i12;
        int i13;
        int i14;
        a h11 = aVar2.h(-644852652);
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
        if ((i12 & 91) == 18 && h11.i()) {
            h11.L();
        } else {
            if (c.I()) {
                c.U(-644852652, i12, -1, "com.forsale.app.features.auth.verification.SetupChangePhoneSection (VerificationScreen.kt:181)");
            }
            b.c i15 = v0.b.f74009a.i();
            h11.C(693286680);
            c.a aVar3 = androidx.compose.ui.c.f7566a;
            a0 a11 = androidx.compose.foundation.layout.o.a(Arrangement.f3698a.g(), i15, h11, 48);
            h11.C(-1323940314);
            int a12 = e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, p> c11 = LayoutKt.c(aVar3);
            if (!(h11.k() instanceof d)) {
                e.c();
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
            w.u uVar = w.u.f74924a;
            CompositionLocalKt.a(CompositionLocalsKt.j().c(LayoutDirection.Ltr), r0.b.b(h11, -1069565832, true, new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.auth.verification.VerificationScreenKt$SetupChangePhoneSection$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar4, int i16) {
                    if ((i16 & 11) == 2 && aVar4.i()) {
                        aVar4.L();
                        return;
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(-1069565832, i16, -1, "com.forsale.app.features.auth.verification.SetupChangePhoneSection.<anonymous>.<anonymous> (VerificationScreen.kt:184)");
                    }
                    String str2 = str;
                    dk.a aVar5 = dk.a.f54291a;
                    int i17 = dk.a.f54292b;
                    TextKt.a(str2, null, 0, 0, false, 0, 0, null, aVar5.c(aVar4, i17).a(), aVar5.a(aVar4, i17).e().m(aVar4, yj.d.f76453b), 0, aVar4, i12 & 14, 0, 1278);
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return p.f75480a;
                }
            }), h11, 0 | t0.f59917d | 48);
            SpacerKt.a(PaddingKt.i(aVar3, h.l(4)), h11, 6);
            ClickableTextKt.a(TestTagKt.a(aVar3, ComponentsTags.CHANGE_PHONE_NUMBER_BUTTON.getTag()), y0.Ue, aVar, h11, ((i12 << 3) & 896) | 6, 0);
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
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.auth.verification.VerificationScreenKt$SetupChangePhoneSection$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar4, int i16) {
                    VerificationScreenKt.g(str, aVar, aVar4, v0.a(i11 | 1));
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
    public static final void h(final q<? super ResendOTPMethods, ? super ja.a, ? super String, p> qVar, final ja.a aVar, final String str, a aVar2, final int i11) {
        a h11 = aVar2.h(1113246216);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(1113246216, i11, -1, "com.forsale.app.features.auth.verification.SetupResendMethodsSection (VerificationScreen.kt:299)");
        }
        h11.C(-483455358);
        c.a aVar3 = androidx.compose.ui.c.f7566a;
        Arrangement arrangement = Arrangement.f3698a;
        Arrangement.m h12 = arrangement.h();
        b.a aVar4 = v0.b.f74009a;
        a0 a11 = androidx.compose.foundation.layout.e.a(h12, aVar4.k(), h11, 0);
        h11.C(-1323940314);
        int a12 = e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        q<e1<ComposeUiNode>, a, Integer, p> c11 = LayoutKt.c(aVar3);
        if (!(h11.k() instanceof d)) {
            e.c();
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
        String b12 = g.b(y0.Ze, h11, 0);
        dk.a aVar5 = dk.a.f54291a;
        int i12 = dk.a.f54292b;
        yj.d e11 = aVar5.a(h11, i12).e();
        int i13 = yj.d.f76453b;
        long j11 = e11.j(h11, i13);
        TextKt.a(b12, fVar.b(aVar3, aVar4.g()), 0, 0, false, 0, 0, null, aVar5.c(h11, i12).c(), j11, 0, h11, 0, 0, 1276);
        Arrangement.f o11 = arrangement.o(h.l(4));
        b.c i14 = aVar4.i();
        h11.C(693286680);
        a0 a15 = androidx.compose.foundation.layout.o.a(o11, i14, h11, 54);
        h11.C(-1323940314);
        int a16 = e.a(h11, 0);
        k s12 = h11.s();
        g00.a<ComposeUiNode> a17 = companion.a();
        q<e1<ComposeUiNode>, a, Integer, p> c12 = LayoutKt.c(aVar3);
        if (!(h11.k() instanceof d)) {
            e.c();
        }
        h11.I();
        if (h11.f()) {
            h11.y(a17);
        } else {
            h11.t();
        }
        a a18 = Updater.a(h11);
        Updater.c(a18, a15, companion.e());
        Updater.c(a18, s12, companion.g());
        g00.p<ComposeUiNode, Integer, p> b13 = companion.b();
        if (a18.f() || !o.d(a18.D(), Integer.valueOf(a16))) {
            a18.u(Integer.valueOf(a16));
            a18.p(Integer.valueOf(a16), b13);
        }
        c12.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        w.u uVar = w.u.f74924a;
        ClickableTextKt.a(TestTagKt.a(aVar3, ComponentsTags.SMS_BUTTON.getTag()), y0.f70375af, new g00.a<p>() { // from class: com.forsale.app.features.auth.verification.VerificationScreenKt$SetupResendMethodsSection$1$1$1
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
                qVar.invoke(ResendOTPMethods.SMS, aVar, str);
            }
        }, h11, 6, 0);
        TextKt.a(g.b(y0.Xe, h11, 0), null, 0, 0, false, 0, 0, null, aVar5.c(h11, i12).c(), aVar5.a(h11, i12).e().j(h11, i13), 0, h11, 0, 0, 1278);
        ClickableTextKt.a(TestTagKt.a(aVar3, ComponentsTags.PHONE_CALL_BUTTON.getTag()), y0.Se, new g00.a<p>() { // from class: com.forsale.app.features.auth.verification.VerificationScreenKt$SetupResendMethodsSection$1$1$2
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
                qVar.invoke(ResendOTPMethods.AutomatedCall, aVar, str);
            }
        }, h11, 6, 0);
        TextKt.a(g.b(y0.Xe, h11, 0), null, 0, 0, false, 0, 0, null, aVar5.c(h11, i12).c(), aVar5.a(h11, i12).e().j(h11, i13), 0, h11, 0, 0, 1278);
        ClickableTextKt.a(TestTagKt.a(aVar3, ComponentsTags.WHATS_APP_BUTTON.getTag()), y0.f70409cf, new g00.a<p>() { // from class: com.forsale.app.features.auth.verification.VerificationScreenKt$SetupResendMethodsSection$1$1$3
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
                qVar.invoke(ResendOTPMethods.Whatsapp, aVar, str);
            }
        }, h11, 6, 0);
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
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.auth.verification.VerificationScreenKt$SetupResendMethodsSection$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(a aVar6, int i15) {
                    VerificationScreenKt.h(qVar, aVar, str, aVar6, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar6, Integer num) {
                    b(aVar6, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(final VerificationScreenViewModel verificationScreenViewModel, final boolean z11, a aVar, final int i11) {
        char c11;
        a.b bVar;
        androidx.compose.runtime.a h11 = aVar.h(882321268);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(882321268, i11, -1, "com.forsale.app.features.auth.verification.SetupScreenDetailsSection (VerificationScreen.kt:155)");
        }
        h11.C(-483455358);
        c.a aVar2 = androidx.compose.ui.c.f7566a;
        a0 a11 = androidx.compose.foundation.layout.e.a(Arrangement.f3698a.h(), v0.b.f74009a.k(), h11, 0);
        h11.C(-1323940314);
        int a12 = e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c12 = LayoutKt.c(aVar2);
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
        g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
        if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
            a14.u(Integer.valueOf(a12));
            a14.p(Integer.valueOf(a12), b11);
        }
        c12.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        f fVar = f.f74891a;
        String b12 = g.b(y0.R3, h11, 0);
        dk.a aVar3 = dk.a.f54291a;
        int i12 = dk.a.f54292b;
        androidx.compose.ui.text.a0 k11 = aVar3.c(h11, i12).k();
        yj.d e11 = aVar3.a(h11, i12).e();
        int i13 = yj.d.f76453b;
        TextKt.a(b12, null, 0, 0, false, 0, 0, null, k11, e11.m(h11, i13), 0, h11, 0, 0, 1278);
        int i14 = y0.Ve;
        Object[] objArr = new Object[1];
        SharedFlow<rj.a> C = verificationScreenViewModel.C();
        if (z11) {
            c11 = 0;
            bVar = new a.b(y0.f70409cf, new Object[0]);
        } else {
            c11 = 0;
            bVar = new a.b(y0.f70375af, new Object[0]);
        }
        String lowerCase = ((rj.a) z.a(C, bVar, null, h11, (a.b.f68044d << 3) | 8, 2).getValue()).a(h11, rj.a.f68042a).toLowerCase(Locale.ROOT);
        o.h(lowerCase, "toLowerCase(...)");
        objArr[c11] = lowerCase;
        TextKt.a(g.c(i14, objArr, h11, 64), null, 0, 0, false, 0, 0, null, aVar3.c(h11, i12).b(), aVar3.a(h11, i12).e().k(h11, i13), 0, h11, 0, 0, 1278);
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.auth.verification.VerificationScreenKt$SetupScreenDetailsSection$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar4, int i15) {
                    VerificationScreenKt.i(VerificationScreenViewModel.this, z11, aVar4, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void j(final VerificationScreenViewModel viewModel, final String phonePrefix, final ja.a userModel, androidx.compose.runtime.a aVar, final int i11) {
        o.i(viewModel, "viewModel");
        o.i(phonePrefix, "phonePrefix");
        o.i(userModel, "userModel");
        androidx.compose.runtime.a h11 = aVar.h(1321449087);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(1321449087, i11, -1, "com.forsale.app.features.auth.verification.SetupTimer (VerificationScreen.kt:264)");
        }
        boolean booleanValue = ((Boolean) z.a(viewModel.E(), Boolean.FALSE, null, h11, 56, 2).getValue()).booleanValue();
        if (booleanValue) {
            h11.C(-103659547);
            h11.C(693286680);
            c.a aVar2 = androidx.compose.ui.c.f7566a;
            a0 a11 = androidx.compose.foundation.layout.o.a(Arrangement.f3698a.g(), v0.b.f74009a.l(), h11, 0);
            h11.C(-1323940314);
            int a12 = e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(aVar2);
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
            g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
            if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.p(Integer.valueOf(a12), b11);
            }
            c11.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            w.u uVar = w.u.f74924a;
            a(59, r0.b.b(h11, 471508869, true, new q<Integer, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.auth.verification.VerificationScreenKt$SetupTimer$1$1

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: VerificationScreen.kt */
                /* renamed from: com.forsale.app.features.auth.verification.VerificationScreenKt$SetupTimer$1$1$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements q<ResendOTPMethods, ja.a, String, p> {
                    AnonymousClass1(Object obj) {
                        super(3, obj, VerificationScreenViewModel.class, "resendOTP", "resendOTP(Lcom/forsale/app/features/auth/verification/ResendOTPMethods;Lcom/forsale/app/features/auth/models/UserModel;Ljava/lang/String;)V", 0);
                    }

                    @Override // g00.q
                    public /* bridge */ /* synthetic */ p invoke(ResendOTPMethods resendOTPMethods, ja.a aVar, String str) {
                        m(resendOTPMethods, aVar, str);
                        return p.f75480a;
                    }

                    public final void m(ResendOTPMethods p02, ja.a p12, String p22) {
                        o.i(p02, "p0");
                        o.i(p12, "p1");
                        o.i(p22, "p2");
                        ((VerificationScreenViewModel) this.receiver).Q(p02, p12, p22);
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                public final void b(int i12, androidx.compose.runtime.a aVar3, int i13) {
                    int i14;
                    int i15;
                    if ((i13 & 14) == 0) {
                        if (aVar3.d(i12)) {
                            i15 = 4;
                        } else {
                            i15 = 2;
                        }
                        i14 = i15 | i13;
                    } else {
                        i14 = i13;
                    }
                    if ((i14 & 91) == 18 && aVar3.i()) {
                        aVar3.L();
                        return;
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(471508869, i13, -1, "com.forsale.app.features.auth.verification.SetupTimer.<anonymous>.<anonymous> (VerificationScreen.kt:269)");
                    }
                    if (i12 == 0) {
                        aVar3.C(-2024575735);
                        VerificationScreenKt.h(new AnonymousClass1(VerificationScreenViewModel.this), userModel, phonePrefix, aVar3, ((i11 << 3) & 896) | 64);
                        VerificationScreenViewModel.this.Y();
                        aVar3.S();
                    } else {
                        aVar3.C(-2024575557);
                        String b12 = g.b(y0.Ye, aVar3, 0);
                        dk.a aVar4 = dk.a.f54291a;
                        int i16 = dk.a.f54292b;
                        yj.d e11 = aVar4.a(aVar3, i16).e();
                        int i17 = yj.d.f76453b;
                        TextKt.a(b12, null, 0, 0, false, 0, 0, null, aVar4.c(aVar3, i16).c(), e11.j(aVar3, i17), 0, aVar3, 0, 0, 1278);
                        w wVar = w.f61809a;
                        String format = String.format(new Locale(Languages.Companion.b().getValue()), g.b(y0.f70392bf, aVar3, 0), Arrays.copyOf(new Object[]{0, Integer.valueOf(i12)}, 2));
                        o.h(format, "format(...)");
                        TextKt.a(" " + format + " ", null, 0, 0, false, 0, 0, null, aVar4.c(aVar3, i16).c(), aVar4.a(aVar3, i16).e().j(aVar3, i17), 0, aVar3, 0, 0, 1278);
                        aVar3.S();
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                }

                @Override // g00.q
                public /* bridge */ /* synthetic */ p invoke(Integer num, androidx.compose.runtime.a aVar3, Integer num2) {
                    b(num.intValue(), aVar3, num2.intValue());
                    return p.f75480a;
                }
            }), h11, 54);
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            h11.S();
        } else if (!booleanValue) {
            h11.C(-103658478);
            h(new VerificationScreenKt$SetupTimer$2(viewModel), userModel, phonePrefix, h11, ((i11 << 3) & 896) | 64);
            h11.S();
        } else {
            h11.C(-103658379);
            h11.S();
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.auth.verification.VerificationScreenKt$SetupTimer$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar3, int i12) {
                    VerificationScreenKt.j(VerificationScreenViewModel.this, phonePrefix, userModel, aVar3, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(final VerificationScreenViewModel verificationScreenViewModel, final AuthViewModel authViewModel, final TextFieldState textFieldState, androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.runtime.a h11 = aVar.h(969432266);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(969432266, i11, -1, "com.forsale.app.features.auth.verification.SetupVerificationInputsSection (VerificationScreen.kt:205)");
        }
        final x3 x3Var = (x3) h11.q(CompositionLocalsKt.l());
        c.a aVar2 = androidx.compose.ui.c.f7566a;
        androidx.compose.ui.c a11 = TestTagKt.a(androidx.compose.ui.focus.b.a(aVar2, new l<z0.l, p>() { // from class: com.forsale.app.features.auth.verification.VerificationScreenKt$SetupVerificationInputsSection$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(z0.l focusState) {
                o.i(focusState, "focusState");
                TextFieldState.this.h(focusState.isFocused());
                if (!focusState.isFocused()) {
                    TextFieldState.this.a();
                }
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(z0.l lVar) {
                b(lVar);
                return p.f75480a;
            }
        }), ComponentsTags.OTP_FILED.getTag());
        String e11 = textFieldState.e();
        androidx.compose.foundation.text.c cVar = new androidx.compose.foundation.text.c(0, false, b0.f9448a.d(), 0, null, 27, null);
        l<String, p> lVar = new l<String, p>() { // from class: com.forsale.app.features.auth.verification.VerificationScreenKt$SetupVerificationInputsSection$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(String it2) {
                x3 x3Var2;
                o.i(it2, "it");
                TextFieldState.this.m(it2);
                if (TextFieldState.this.e().length() == 5 && (x3Var2 = x3Var) != null) {
                    x3Var2.a();
                }
                verificationScreenViewModel.v();
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(String str) {
                b(str);
                return p.f75480a;
            }
        };
        r0.a b11 = r0.b.b(h11, 851401280, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.auth.verification.VerificationScreenKt$SetupVerificationInputsSection$3
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            public final void b(androidx.compose.runtime.a aVar3, int i12) {
                String str;
                if ((i12 & 11) == 2 && aVar3.i()) {
                    aVar3.L();
                    return;
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(851401280, i12, -1, "com.forsale.app.features.auth.verification.SetupVerificationInputsSection.<anonymous> (VerificationScreen.kt:226)");
                }
                if (TextFieldState.this.n()) {
                    String str2 = null;
                    rj.a aVar4 = (rj.a) z.b(TextFieldState.this.c(), null, aVar3, 8, 1).getValue();
                    aVar3.C(1427071775);
                    if (aVar4 != null) {
                        str2 = aVar4.a(aVar3, rj.a.f68042a);
                    }
                    aVar3.S();
                    if (str2 == null) {
                        str = "";
                    } else {
                        str = str2;
                    }
                    TextKt.a(str, TestTagKt.a(androidx.compose.ui.c.f7566a, ComponentsTags.PHONE_NUMBER_VALIDATION_MESSAGE.getTag()), 0, 0, false, 0, 0, null, dk.a.f54291a.c(aVar3, dk.a.f54292b).h(), 0L, 0, aVar3, 48, 0, 1788);
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                b(aVar3, num.intValue());
                return p.f75480a;
            }
        });
        ComposableSingletons$VerificationScreenKt composableSingletons$VerificationScreenKt = ComposableSingletons$VerificationScreenKt.f22928a;
        InputsKt.k(a11, e11, lVar, true, textFieldState.n(), false, null, null, null, null, null, b11, composableSingletons$VerificationScreenKt.a(), null, (z0.d) h11.q(CompositionLocalsKt.f()), null, null, cVar, null, null, null, h11, 3072, 12616112, 0, 1943520);
        SpacerKt.a(SizeKt.i(aVar2, h.l(12)), h11, 6);
        ButtonsKt.j(new g00.a<p>() { // from class: com.forsale.app.features.auth.verification.VerificationScreenKt$SetupVerificationInputsSection$4
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
                ma.a.a(TextFieldState.this);
                verificationScreenViewModel.N(authViewModel.j(), authViewModel.m(), TextFieldState.this.e());
            }
        }, TestTagKt.a(SizeKt.i(SizeKt.h(aVar2, 0.0f, 1, null), h.l(48)), ComponentsTags.VERIFY_OTP_BUTTON.getTag()), null, null, false, false, null, composableSingletons$VerificationScreenKt.b(), h11, 12582960, 124);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.auth.verification.VerificationScreenKt$SetupVerificationInputsSection$5
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar3, int i12) {
                    VerificationScreenKt.k(VerificationScreenViewModel.this, authViewModel, textFieldState, aVar3, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void l(final AuthViewModel sharedViewModel, final AuthActivity context, VerificationScreenViewModel verificationScreenViewModel, final l<? super String, p> onNavigateCreateNewPassword, final g00.a<p> onNavigateBackToChangePhoneNumber, final l<? super String, p> onScreenLoaded, androidx.compose.runtime.a aVar, final int i11, final int i12) {
        VerificationScreenViewModel verificationScreenViewModel2;
        final int i13;
        w3.a aVar2;
        o.i(sharedViewModel, "sharedViewModel");
        o.i(context, "context");
        o.i(onNavigateCreateNewPassword, "onNavigateCreateNewPassword");
        o.i(onNavigateBackToChangePhoneNumber, "onNavigateBackToChangePhoneNumber");
        o.i(onScreenLoaded, "onScreenLoaded");
        androidx.compose.runtime.a h11 = aVar.h(-754228814);
        if ((i12 & 4) != 0) {
            h11.C(1890788296);
            x0 a11 = LocalViewModelStoreOwner.f12907a.a(h11, LocalViewModelStoreOwner.f12909c);
            if (a11 != null) {
                t0.b a12 = r3.a.a(a11, h11, 0);
                h11.C(1729797275);
                if (a11 instanceof androidx.lifecycle.l) {
                    aVar2 = ((androidx.lifecycle.l) a11).getDefaultViewModelCreationExtras();
                } else {
                    aVar2 = a.C0905a.f75031b;
                }
                q0 b11 = x3.a.b(VerificationScreenViewModel.class, a11, null, a12, aVar2, h11, 36936, 0);
                h11.S();
                h11.S();
                verificationScreenViewModel2 = (VerificationScreenViewModel) b11;
                i13 = i11 & (-897);
            } else {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
        } else {
            verificationScreenViewModel2 = verificationScreenViewModel;
            i13 = i11;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-754228814, i13, -1, "com.forsale.app.features.auth.verification.VerificationScreen (VerificationScreen.kt:68)");
        }
        h11.C(-492369756);
        Object D = h11.D();
        a.C0064a c0064a = androidx.compose.runtime.a.f7182a;
        if (D == c0064a.a()) {
            D = new TextFieldState(new VerificationScreenKt$VerificationScreen$otpFieldState$1$1(verificationScreenViewModel2), verificationScreenViewModel2.A());
            h11.u(D);
        }
        h11.S();
        final TextFieldState textFieldState = (TextFieldState) D;
        h11.C(-492369756);
        Object D2 = h11.D();
        if (D2 == c0064a.a()) {
            D2 = Boolean.valueOf(ContextExtensionsKt.x(context));
            h11.u(D2);
        }
        h11.S();
        final boolean booleanValue = ((Boolean) D2).booleanValue();
        final VerificationScreenViewModel verificationScreenViewModel3 = verificationScreenViewModel2;
        final VerificationScreenViewModel verificationScreenViewModel4 = verificationScreenViewModel2;
        ThemeKt.a(null, null, r0.b.b(h11, -1211110405, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.auth.verification.VerificationScreenKt$VerificationScreen$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void b(androidx.compose.runtime.a aVar3, int i14) {
                if ((i14 & 11) == 2 && aVar3.i()) {
                    aVar3.L();
                    return;
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(-1211110405, i14, -1, "com.forsale.app.features.auth.verification.VerificationScreen.<anonymous> (VerificationScreen.kt:78)");
                }
                AuthViewModel authViewModel = AuthViewModel.this;
                VerificationScreenViewModel verificationScreenViewModel5 = verificationScreenViewModel3;
                boolean z11 = booleanValue;
                g00.a<p> aVar4 = onNavigateBackToChangePhoneNumber;
                TextFieldState textFieldState2 = textFieldState;
                int i15 = i13;
                l<String, p> lVar = onNavigateCreateNewPassword;
                l<String, p> lVar2 = onScreenLoaded;
                aVar3.C(-483455358);
                c.a aVar5 = androidx.compose.ui.c.f7566a;
                a0 a13 = androidx.compose.foundation.layout.e.a(Arrangement.f3698a.h(), v0.b.f74009a.k(), aVar3, 0);
                aVar3.C(-1323940314);
                int a14 = e.a(aVar3, 0);
                k s11 = aVar3.s();
                ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                g00.a<ComposeUiNode> a15 = companion.a();
                q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(aVar5);
                if (!(aVar3.k() instanceof d)) {
                    e.c();
                }
                aVar3.I();
                if (aVar3.f()) {
                    aVar3.y(a15);
                } else {
                    aVar3.t();
                }
                androidx.compose.runtime.a a16 = Updater.a(aVar3);
                Updater.c(a16, a13, companion.e());
                Updater.c(a16, s11, companion.g());
                g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
                if (a16.f() || !o.d(a16.D(), Integer.valueOf(a14))) {
                    a16.u(Integer.valueOf(a14));
                    a16.p(Integer.valueOf(a14), b12);
                }
                c11.invoke(e1.a(e1.b(aVar3)), aVar3, 0);
                aVar3.C(2058660585);
                f fVar = f.f74891a;
                int i16 = i15 >> 3;
                VerificationScreenKt.m(authViewModel, verificationScreenViewModel5, z11, aVar4, textFieldState2, aVar3, (i16 & 7168) | 33224);
                VerificationScreenKt.e(verificationScreenViewModel5, textFieldState2, lVar, aVar3, (i16 & 896) | 72);
                SpacerKt.a(w.e.c(fVar, aVar5, 1.0f, false, 2, null), aVar3, 0);
                VerificationScreenKt.f(verificationScreenViewModel5, authViewModel, z11, lVar2, aVar3, ((i15 >> 6) & 7168) | 456);
                aVar3.S();
                aVar3.w();
                aVar3.S();
                aVar3.S();
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                b(aVar3, num.intValue());
                return p.f75480a;
            }
        }), h11, 384, 3);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.auth.verification.VerificationScreenKt$VerificationScreen$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar3, int i14) {
                    VerificationScreenKt.l(AuthViewModel.this, context, verificationScreenViewModel4, onNavigateCreateNewPassword, onNavigateBackToChangePhoneNumber, onScreenLoaded, aVar3, v0.a(i11 | 1), i12);
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(final AuthViewModel authViewModel, final VerificationScreenViewModel verificationScreenViewModel, final boolean z11, final g00.a<p> aVar, final TextFieldState textFieldState, androidx.compose.runtime.a aVar2, final int i11) {
        androidx.compose.runtime.a h11 = aVar2.h(256347844);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(256347844, i11, -1, "com.forsale.app.features.auth.verification.VerificationScreenContent (VerificationScreen.kt:132)");
        }
        h11.C(-492369756);
        Object D = h11.D();
        if (D == androidx.compose.runtime.a.f7182a.a()) {
            D = authViewModel.j() + authViewModel.m().f();
            h11.u(D);
        }
        h11.S();
        String str = (String) D;
        n1 b11 = z.b(verificationScreenViewModel.z(), null, h11, 8, 1);
        h11.C(-1815144041);
        if (n(b11)) {
            LoadingDialogKt.a(h11, 0);
        }
        h11.S();
        c.a aVar3 = androidx.compose.ui.c.f7566a;
        float f11 = 16;
        androidx.compose.ui.c m11 = PaddingKt.m(aVar3, h.l(f11), 0.0f, h.l(f11), 0.0f, 10, null);
        h11.C(-483455358);
        Arrangement.m h12 = Arrangement.f3698a.h();
        b.a aVar4 = v0.b.f74009a;
        a0 a11 = androidx.compose.foundation.layout.e.a(h12, aVar4.k(), h11, 0);
        h11.C(-1323940314);
        int a12 = e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(m11);
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
        f fVar = f.f74891a;
        SpacerKt.a(PaddingKt.m(aVar3, 0.0f, h.l(f11), 0.0f, 0.0f, 13, null), h11, 6);
        i(verificationScreenViewModel, z11, h11, ((i11 >> 3) & 112) | 8);
        g(str, aVar, h11, ((i11 >> 6) & 112) | 6);
        SpacerKt.a(PaddingKt.i(aVar3, h.l(4)), h11, 6);
        k(verificationScreenViewModel, authViewModel, textFieldState, h11, 584);
        SpacerKt.a(PaddingKt.i(aVar3, h.l(8)), h11, 6);
        androidx.compose.ui.c b13 = fVar.b(aVar3, aVar4.g());
        h11.C(733328855);
        a0 g11 = BoxKt.g(aVar4.o(), false, h11, 0);
        h11.C(-1323940314);
        int a15 = e.a(h11, 0);
        k s12 = h11.s();
        g00.a<ComposeUiNode> a16 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c12 = LayoutKt.c(b13);
        if (!(h11.k() instanceof d)) {
            e.c();
        }
        h11.I();
        if (h11.f()) {
            h11.y(a16);
        } else {
            h11.t();
        }
        androidx.compose.runtime.a a17 = Updater.a(h11);
        Updater.c(a17, g11, companion.e());
        Updater.c(a17, s12, companion.g());
        g00.p<ComposeUiNode, Integer, p> b14 = companion.b();
        if (a17.f() || !o.d(a17.D(), Integer.valueOf(a15))) {
            a17.u(Integer.valueOf(a15));
            a17.p(Integer.valueOf(a15), b14);
        }
        c12.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
        j(verificationScreenViewModel, authViewModel.j(), authViewModel.m(), h11, NetworkResponse.UNKNOWN_ERROR_CODE);
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
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.auth.verification.VerificationScreenKt$VerificationScreenContent$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar5, int i12) {
                    VerificationScreenKt.m(AuthViewModel.this, verificationScreenViewModel, z11, aVar, textFieldState, aVar5, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar5, Integer num) {
                    b(aVar5, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    private static final boolean n(n1<Boolean> n1Var) {
        return n1Var.getValue().booleanValue();
    }
}
