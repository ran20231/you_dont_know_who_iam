package com.forsale.app.features.auth.forgotpassword;

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
import androidx.compose.ui.platform.TestTagKt;
import androidx.lifecycle.l;
import androidx.lifecycle.q0;
import androidx.lifecycle.t0;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.x0;
import com.forsale.app.features.auth.AuthViewModel;
import com.forsale.app.features.auth.utils.ComponentsTags;
import com.forsale.app.features.auth.views.PasswordTextFieldKt;
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
import kotlin.jvm.internal.o;
import p1.g;
import t9.y0;
import v0.b;
import w.f;
import w3.a;
import wz.p;
/* compiled from: ResetPasswordRoute.kt */
/* loaded from: classes2.dex */
public final class ResetPasswordRouteKt {
    public static final void a(final AuthViewModel sharedViewModel, ResetPasswordViewModel resetPasswordViewModel, final a<p> onNavigateToLogin, androidx.compose.runtime.a aVar, final int i11, final int i12) {
        ResetPasswordViewModel resetPasswordViewModel2;
        int i13;
        w3.a aVar2;
        o.i(sharedViewModel, "sharedViewModel");
        o.i(onNavigateToLogin, "onNavigateToLogin");
        androidx.compose.runtime.a h11 = aVar.h(1810336023);
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
                q0 b11 = x3.a.b(ResetPasswordViewModel.class, a11, null, a12, aVar2, h11, 36936, 0);
                h11.S();
                h11.S();
                i13 = i11 & (-113);
                resetPasswordViewModel2 = (ResetPasswordViewModel) b11;
            } else {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
        } else {
            resetPasswordViewModel2 = resetPasswordViewModel;
            i13 = i11;
        }
        if (c.I()) {
            c.U(1810336023, i13, -1, "com.forsale.app.features.auth.forgotpassword.ResetPasswordRoute (ResetPasswordRoute.kt:43)");
        }
        n1 b12 = z.b(resetPasswordViewModel2.p(), null, h11, 8, 1);
        h11.C(-492369756);
        Object D = h11.D();
        a.C0064a c0064a = androidx.compose.runtime.a.f7182a;
        if (D == c0064a.a()) {
            D = new TextFieldState(new ResetPasswordRouteKt$ResetPasswordRoute$passwordTextFieldState$1$1(resetPasswordViewModel2), resetPasswordViewModel2.r());
            h11.u(D);
        }
        h11.S();
        final TextFieldState textFieldState = (TextFieldState) D;
        h11.C(-492369756);
        Object D2 = h11.D();
        if (D2 == c0064a.a()) {
            D2 = new com.forsale.app.features.auth.views.textfieldstates.a(textFieldState, new ResetPasswordRouteKt$ResetPasswordRoute$confirmPasswordTextFieldState$1$1(resetPasswordViewModel2), resetPasswordViewModel2.o());
            h11.u(D2);
        }
        h11.S();
        final com.forsale.app.features.auth.views.textfieldstates.a aVar3 = (com.forsale.app.features.auth.views.textfieldstates.a) D2;
        u.d(p.f75480a, new ResetPasswordRouteKt$ResetPasswordRoute$1(resetPasswordViewModel2, sharedViewModel, null), h11, 70);
        c(resetPasswordViewModel2, sharedViewModel, onNavigateToLogin, h11, (i13 & 896) | 72);
        h11.C(1968388200);
        if (b(b12)) {
            LoadingDialogKt.a(h11, 0);
        }
        h11.S();
        c.a aVar4 = androidx.compose.ui.c.f7566a;
        float f11 = 16;
        androidx.compose.ui.c m11 = PaddingKt.m(aVar4, h.l(f11), h.l(f11), h.l(f11), 0.0f, 8, null);
        h11.C(-483455358);
        a0 a13 = e.a(Arrangement.f3698a.h(), b.f74009a.k(), h11, 0);
        h11.C(-1323940314);
        int a14 = j0.e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
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
        g00.p<ComposeUiNode, Integer, p> b13 = companion.b();
        if (a16.f() || !o.d(a16.D(), Integer.valueOf(a14))) {
            a16.u(Integer.valueOf(a14));
            a16.p(Integer.valueOf(a14), b13);
        }
        c11.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        f fVar = f.f74891a;
        String b14 = g.b(y0.f70741wd, h11, 0);
        dk.a aVar5 = dk.a.f54291a;
        int i14 = dk.a.f54292b;
        androidx.compose.ui.text.a0 k11 = aVar5.c(h11, i14).k();
        yj.d e11 = aVar5.a(h11, i14).e();
        int i15 = yj.d.f76453b;
        final ResetPasswordViewModel resetPasswordViewModel3 = resetPasswordViewModel2;
        TextKt.a(b14, null, 0, 0, false, 0, 0, null, k11, e11.m(h11, i15), 0, h11, 0, 0, 1278);
        TextKt.a(g.b(y0.f70725vd, h11, 0), null, 0, 0, false, 0, 0, null, aVar5.c(h11, i14).b(), aVar5.a(h11, i14).e().k(h11, i15), 0, h11, 0, 0, 1278);
        TextKt.a(ka.b.b(sharedViewModel.m().f(), sharedViewModel.j()), null, 0, 0, false, 0, 0, null, aVar5.c(h11, i14).a(), aVar5.a(h11, i14).e().m(h11, i15), 0, h11, 0, 0, 1278);
        float f12 = 8;
        SpacerKt.a(SizeKt.i(aVar4, h.l(f12)), h11, 6);
        PasswordTextFieldKt.a(sharedViewModel.m(), TestTagKt.a(aVar4, ComponentsTags.PASSWORD_FIELD.getTag()), textFieldState, new g00.l<Boolean, p>() { // from class: com.forsale.app.features.auth.forgotpassword.ResetPasswordRouteKt$ResetPasswordRoute$2$1
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
                AuthViewModel.this.r(z11, AuthenticationType.FORGET_PASSWORD);
            }
        }, 0, false, false, null, h11, 1573432, 176);
        SpacerKt.a(SizeKt.i(aVar4, h.l(f12)), h11, 6);
        PasswordTextFieldKt.a(sharedViewModel.m(), TestTagKt.a(aVar4, ComponentsTags.PASSWORD_CONFIRMATION_FIELD.getTag()), aVar3, new g00.l<Boolean, p>() { // from class: com.forsale.app.features.auth.forgotpassword.ResetPasswordRouteKt$ResetPasswordRoute$2$2
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
                AuthViewModel.this.r(z11, AuthenticationType.FORGET_PASSWORD);
            }
        }, y0.B0, false, false, null, h11, 1770040, 128);
        SpacerKt.a(SizeKt.i(aVar4, h.l(f11)), h11, 6);
        ButtonsKt.j(new g00.a<p>() { // from class: com.forsale.app.features.auth.forgotpassword.ResetPasswordRouteKt$ResetPasswordRoute$2$3
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
                ma.a.a(TextFieldState.this, aVar3);
                resetPasswordViewModel3.y(ka.b.a(sharedViewModel.m().f(), sharedViewModel.j()), TextFieldState.this.e(), aVar3.e());
            }
        }, TestTagKt.a(SizeKt.i(SizeKt.h(aVar4, 0.0f, 1, null), h.l(48)), ComponentsTags.RESET_PASSWORD_BUTTON.getTag()), null, null, false, false, null, ComposableSingletons$ResetPasswordRouteKt.f22628a.a(), h11, 12582960, 124);
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.auth.forgotpassword.ResetPasswordRouteKt$ResetPasswordRoute$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar6, int i16) {
                    ResetPasswordRouteKt.a(AuthViewModel.this, resetPasswordViewModel3, onNavigateToLogin, aVar6, v0.a(i11 | 1), i12);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(final ResetPasswordViewModel resetPasswordViewModel, final AuthViewModel authViewModel, final g00.a<p> aVar, androidx.compose.runtime.a aVar2, final int i11) {
        androidx.compose.runtime.a h11 = aVar2.h(611692433);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(611692433, i11, -1, "com.forsale.app.features.auth.forgotpassword.ViewModelObservers (ResetPasswordRoute.kt:137)");
        }
        u.d(p.f75480a, new ResetPasswordRouteKt$ViewModelObservers$1(resetPasswordViewModel, authViewModel, aVar, null), h11, 70);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.auth.forgotpassword.ResetPasswordRouteKt$ViewModelObservers$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar3, int i12) {
                    ResetPasswordRouteKt.c(ResetPasswordViewModel.this, authViewModel, aVar, aVar3, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }
}
