package com.forsale.app.features.auth.login;

import androidx.compose.foundation.layout.Arrangement;
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
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.lifecycle.l;
import androidx.lifecycle.q0;
import androidx.lifecycle.t0;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.x0;
import com.forsale.app.features.auth.AuthActivity;
import com.forsale.app.features.auth.AuthViewModel;
import com.forsale.app.features.auth.utils.ComponentsTags;
import com.forsale.app.features.auth.views.BlockedUserViewKt;
import com.forsale.app.features.auth.views.ClickableTextKt;
import com.forsale.app.features.auth.views.PasswordTextFieldKt;
import com.forsale.app.features.auth.views.PhoneFieldKt;
import com.forsale.app.features.auth.views.textfieldstates.TextFieldState;
import com.forsale.app.ui.dialogs.LoadingDialogKt;
import com.forsale.app.utils.analytics.auth.AuthenticationType;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.buttons.ButtonsKt;
import e2.h;
import g00.a;
import g00.q;
import j0.d;
import j0.d1;
import j0.e1;
import j0.k;
import j0.n1;
import j0.u;
import j0.v0;
import kotlin.Pair;
import kotlin.jvm.internal.o;
import p1.g;
import t9.y0;
import v0.b;
import w.f;
import w3.a;
import wz.p;
/* compiled from: SignInRoute.kt */
/* loaded from: classes2.dex */
public final class SignInRouteKt {
    public static final void a(final AuthViewModel sharedViewModel, SignInViewModel signInViewModel, final a<p> onNavigateToSignUp, final a<p> onNavigateToForgotPassword, final a<p> onContactSupportClicked, androidx.compose.runtime.a aVar, final int i11, final int i12) {
        SignInViewModel signInViewModel2;
        int i13;
        TextFieldState textFieldState;
        TextFieldState textFieldState2;
        float f11;
        int i14;
        w3.a aVar2;
        o.i(sharedViewModel, "sharedViewModel");
        o.i(onNavigateToSignUp, "onNavigateToSignUp");
        o.i(onNavigateToForgotPassword, "onNavigateToForgotPassword");
        o.i(onContactSupportClicked, "onContactSupportClicked");
        androidx.compose.runtime.a h11 = aVar.h(509395777);
        if ((i12 & 2) != 0) {
            h11.C(1890788296);
            x0 a11 = LocalViewModelStoreOwner.f12907a.a(h11, LocalViewModelStoreOwner.f12909c);
            if (a11 != null) {
                t0.b a12 = r3.a.a(a11, h11, 0);
                h11.C(1729797275);
                if (a11 instanceof l) {
                    aVar2 = ((l) a11).getDefaultViewModelCreationExtras();
                } else {
                    aVar2 = a.C0905a.f75031b;
                }
                q0 b11 = x3.a.b(SignInViewModel.class, a11, null, a12, aVar2, h11, 36936, 0);
                h11.S();
                h11.S();
                i13 = i11 & (-113);
                signInViewModel2 = (SignInViewModel) b11;
            } else {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
        } else {
            signInViewModel2 = signInViewModel;
            i13 = i11;
        }
        if (c.I()) {
            c.U(509395777, i13, -1, "com.forsale.app.features.auth.login.SignInScreen (SignInRoute.kt:49)");
        }
        n1 b12 = z.b(signInViewModel2.A(), null, h11, 8, 1);
        n1 b13 = z.b(signInViewModel2.G(), null, h11, 8, 1);
        h11.C(-492369756);
        Object D = h11.D();
        a.C0064a c0064a = androidx.compose.runtime.a.f7182a;
        if (D == c0064a.a()) {
            D = new TextFieldState(new SignInRouteKt$SignInScreen$passwordState$1$1(signInViewModel2), signInViewModel2.C());
            h11.u(D);
        }
        h11.S();
        TextFieldState textFieldState3 = (TextFieldState) D;
        h11.C(-492369756);
        Object D2 = h11.D();
        if (D2 == c0064a.a()) {
            D2 = new TextFieldState(new SignInRouteKt$SignInScreen$phoneNumberState$1$1(signInViewModel2), signInViewModel2.D());
            h11.u(D2);
        }
        h11.S();
        TextFieldState textFieldState4 = (TextFieldState) D2;
        d(signInViewModel2, textFieldState3, textFieldState4, h11, 584);
        u.d(p.f75480a, new SignInRouteKt$SignInScreen$1(signInViewModel2, sharedViewModel, null), h11, 70);
        h11.C(-1474398595);
        if (b(b12)) {
            LoadingDialogKt.a(h11, 0);
        }
        h11.S();
        c.a aVar3 = androidx.compose.ui.c.f7566a;
        float f12 = 16;
        androidx.compose.ui.c m11 = PaddingKt.m(aVar3, h.l(f12), h.l(f12), h.l(f12), 0.0f, 8, null);
        h11.C(-483455358);
        Arrangement.m h12 = Arrangement.f3698a.h();
        b.a aVar4 = b.f74009a;
        a0 a13 = e.a(h12, aVar4.k(), h11, 0);
        h11.C(-1323940314);
        int a14 = j0.e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        int i15 = i13;
        g00.a<ComposeUiNode> a15 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(m11);
        if (!(h11.k() instanceof d)) {
            j0.e.c();
        }
        h11.I();
        if (h11.f()) {
            h11.y(a15);
        } else {
            h11.t();
        }
        androidx.compose.runtime.a a16 = Updater.a(h11);
        Updater.c(a16, a13, companion.e());
        Updater.c(a16, s11, companion.g());
        g00.p<ComposeUiNode, Integer, p> b14 = companion.b();
        if (a16.f() || !o.d(a16.D(), Integer.valueOf(a14))) {
            a16.u(Integer.valueOf(a14));
            a16.p(Integer.valueOf(a14), b14);
        }
        c11.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        f fVar = f.f74891a;
        String c12 = c(b13);
        h11.C(-2003920537);
        if (c12 == null) {
            textFieldState2 = textFieldState3;
            f11 = f12;
            textFieldState = textFieldState4;
            i14 = 8;
        } else {
            h11.C(1157296644);
            boolean T = h11.T(onContactSupportClicked);
            Object D3 = h11.D();
            if (T || D3 == c0064a.a()) {
                D3 = new g00.a<p>() { // from class: com.forsale.app.features.auth.login.SignInRouteKt$SignInScreen$2$1$1$1
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
                        onContactSupportClicked.invoke();
                    }
                };
                h11.u(D3);
            }
            h11.S();
            textFieldState = textFieldState4;
            textFieldState2 = textFieldState3;
            f11 = f12;
            i14 = 8;
            BlockedUserViewKt.a(null, c12, (g00.a) D3, h11, 0, 1);
            SpacerKt.a(SizeKt.i(aVar3, h.l(f11)), h11, 6);
        }
        h11.S();
        int i16 = rj.a.f68042a;
        String a17 = ((rj.a) ((Pair) z.b(signInViewModel2.F(), null, h11, i14, 1).getValue()).c()).a(h11, i16);
        dk.a aVar5 = dk.a.f54291a;
        int i17 = dk.a.f54292b;
        androidx.compose.ui.text.a0 k11 = aVar5.c(h11, i17).k();
        yj.d e11 = aVar5.a(h11, i17).e();
        int i18 = yj.d.f76453b;
        TextKt.a(a17, null, 0, 0, false, 0, 0, null, k11, e11.m(h11, i18), 0, h11, 0, 0, 1278);
        float f13 = i14;
        TextKt.a(((rj.a) ((Pair) z.b(signInViewModel2.F(), null, h11, i14, 1).getValue()).d()).a(h11, i16), PaddingKt.m(aVar3, 0.0f, 0.0f, 0.0f, h.l(f13), 7, null), 0, 0, false, 0, 0, null, aVar5.c(h11, i17).b(), aVar5.a(h11, i17).e().k(h11, i18), 0, h11, 48, 0, 1276);
        final SignInViewModel signInViewModel3 = signInViewModel2;
        PhoneFieldKt.a(sharedViewModel, textFieldState, new SignInRouteKt$SignInScreen$2$2(signInViewModel2), h11, 72, 0);
        SpacerKt.a(SizeKt.i(aVar3, h.l(f13)), h11, 6);
        PasswordTextFieldKt.a(sharedViewModel.m(), PaddingKt.m(aVar3, 0.0f, 0.0f, 0.0f, h.l(4), 7, null), textFieldState2, new g00.l<Boolean, p>() { // from class: com.forsale.app.features.auth.login.SignInRouteKt$SignInScreen$2$4
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return p.f75480a;
            }

            public final void invoke(boolean z11) {
                AuthViewModel.this.r(z11, AuthenticationType.LOGIN);
            }
        }, 0, false, false, new SignInRouteKt$SignInScreen$2$3(signInViewModel3), h11, 197176, 80);
        ClickableTextKt.a(TestTagKt.a(PaddingKt.m(aVar3, 0.0f, 0.0f, 0.0f, h.l(f11), 7, null), ComponentsTags.FORGOT_PASSWORD_BUTTON.getTag()), y0.D0, onNavigateToForgotPassword, h11, ((i15 >> 3) & 896) | 6, 0);
        final TextFieldState textFieldState5 = textFieldState;
        final TextFieldState textFieldState6 = textFieldState2;
        ButtonsKt.j(new g00.a<p>() { // from class: com.forsale.app.features.auth.login.SignInRouteKt$SignInScreen$2$5
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
                ma.a.a(TextFieldState.this, textFieldState5);
                signInViewModel3.J(textFieldState5.e(), TextFieldState.this.e());
            }
        }, TestTagKt.a(SizeKt.i(SizeKt.h(aVar3, 0.0f, 1, null), h.l(48)), ComponentsTags.LOGIN_BUTTON.getTag()), null, null, false, false, null, ComposableSingletons$SignInRouteKt.f22742a.a(), h11, 12582960, 124);
        androidx.compose.ui.c a18 = TestTagKt.a(PaddingKt.m(fVar.b(aVar3, aVar4.g()), 0.0f, h.l(26), 0.0f, 0.0f, 13, null), ComponentsTags.SIGN_UP_BUTTON.getTag());
        String b15 = g.b(y0.f70631q0, h11, 0);
        int i19 = y0.A0;
        h11.C(1157296644);
        boolean T2 = h11.T(onNavigateToSignUp);
        Object D4 = h11.D();
        if (T2 || D4 == c0064a.a()) {
            D4 = new g00.a<p>() { // from class: com.forsale.app.features.auth.login.SignInRouteKt$SignInScreen$2$6$1
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
                    onNavigateToSignUp.invoke();
                }
            };
            h11.u(D4);
        }
        h11.S();
        ClickableTextKt.b(a18, b15, i19, (g00.a) D4, h11, 0, 0);
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.auth.login.SignInRouteKt$SignInScreen$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar6, int i21) {
                    SignInRouteKt.a(AuthViewModel.this, signInViewModel3, onNavigateToSignUp, onNavigateToForgotPassword, onContactSupportClicked, aVar6, v0.a(i11 | 1), i12);
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar6, Integer num) {
                    b(aVar6, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    private static final boolean b(n1<Boolean> n1Var) {
        return n1Var.getValue().booleanValue();
    }

    private static final String c(n1<String> n1Var) {
        return n1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(final SignInViewModel signInViewModel, final TextFieldState textFieldState, final TextFieldState textFieldState2, androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.runtime.a h11 = aVar.h(-1938153974);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-1938153974, i11, -1, "com.forsale.app.features.auth.login.ViewModelObservers (SignInRoute.kt:148)");
        }
        Object q11 = h11.q(AndroidCompositionLocals_androidKt.g());
        o.g(q11, "null cannot be cast to non-null type com.forsale.app.features.auth.AuthActivity");
        p pVar = p.f75480a;
        u.d(pVar, new SignInRouteKt$ViewModelObservers$1(signInViewModel, textFieldState, null), h11, 70);
        u.d(pVar, new SignInRouteKt$ViewModelObservers$2(signInViewModel, textFieldState2, null), h11, 70);
        u.d(pVar, new SignInRouteKt$ViewModelObservers$3(signInViewModel, (AuthActivity) q11, null), h11, 70);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.auth.login.SignInRouteKt$ViewModelObservers$4
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i12) {
                    SignInRouteKt.d(SignInViewModel.this, textFieldState, textFieldState2, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }
}
