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
import com.forsale.app.features.auth.AuthActivity;
import com.forsale.app.features.auth.AuthViewModel;
import com.forsale.app.features.auth.utils.ComponentsTags;
import com.forsale.app.features.auth.views.BlockedUserViewKt;
import com.forsale.app.features.auth.views.PhoneFieldKt;
import com.forsale.app.features.auth.views.textfieldstates.TextFieldState;
import com.forsale.app.ui.dialogs.LoadingDialogKt;
import com.forsale.app.utils.ContextExtensionsKt;
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
/* compiled from: ForgotPasswordRoute.kt */
/* loaded from: classes2.dex */
public final class ForgotPasswordRouteKt {
    public static final void a(final AuthViewModel sharedViewModel, ForgotPasswordViewModel forgotPasswordViewModel, final AuthActivity context, final a<p> onNavigateToOtpVerification, final a<p> onContactSupportClicked, androidx.compose.runtime.a aVar, final int i11, final int i12) {
        ForgotPasswordViewModel forgotPasswordViewModel2;
        int i13;
        TextFieldState textFieldState;
        w3.a aVar2;
        o.i(sharedViewModel, "sharedViewModel");
        o.i(context, "context");
        o.i(onNavigateToOtpVerification, "onNavigateToOtpVerification");
        o.i(onContactSupportClicked, "onContactSupportClicked");
        androidx.compose.runtime.a h11 = aVar.h(-1363290064);
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
                q0 b11 = x3.a.b(ForgotPasswordViewModel.class, a11, null, a12, aVar2, h11, 36936, 0);
                h11.S();
                h11.S();
                i13 = i11 & (-113);
                forgotPasswordViewModel2 = (ForgotPasswordViewModel) b11;
            } else {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
        } else {
            forgotPasswordViewModel2 = forgotPasswordViewModel;
            i13 = i11;
        }
        if (c.I()) {
            c.U(-1363290064, i13, -1, "com.forsale.app.features.auth.forgotpassword.VerifyPhoneNumberRoute (ForgotPasswordRoute.kt:44)");
        }
        n1 b12 = z.b(forgotPasswordViewModel2.r(), null, h11, 8, 1);
        n1 b13 = z.b(forgotPasswordViewModel2.w(), null, h11, 8, 1);
        h11.C(-492369756);
        Object D = h11.D();
        a.C0064a c0064a = androidx.compose.runtime.a.f7182a;
        if (D == c0064a.a()) {
            D = new TextFieldState(new ForgotPasswordRouteKt$VerifyPhoneNumberRoute$phoneNumberState$1$1(forgotPasswordViewModel2), forgotPasswordViewModel2.s());
            h11.u(D);
        }
        h11.S();
        TextFieldState textFieldState2 = (TextFieldState) D;
        u.d(p.f75480a, new ForgotPasswordRouteKt$VerifyPhoneNumberRoute$1(forgotPasswordViewModel2, null), h11, 70);
        d(forgotPasswordViewModel2, textFieldState2, onNavigateToOtpVerification, h11, ((i13 >> 3) & 896) | 72);
        h11.C(1847380326);
        if (b(b12)) {
            LoadingDialogKt.a(h11, 0);
        }
        h11.S();
        c.a aVar3 = androidx.compose.ui.c.f7566a;
        float f11 = 16;
        androidx.compose.ui.c m11 = PaddingKt.m(aVar3, h.l(f11), h.l(f11), h.l(f11), 0.0f, 8, null);
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
        g00.p<ComposeUiNode, Integer, p> b14 = companion.b();
        if (a16.f() || !o.d(a16.D(), Integer.valueOf(a14))) {
            a16.u(Integer.valueOf(a14));
            a16.p(Integer.valueOf(a14), b14);
        }
        c11.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        f fVar = f.f74891a;
        String c12 = c(b13);
        h11.C(-1215622832);
        if (c12 == null) {
            textFieldState = textFieldState2;
        } else {
            h11.C(1157296644);
            boolean T = h11.T(onContactSupportClicked);
            Object D2 = h11.D();
            if (T || D2 == c0064a.a()) {
                D2 = new g00.a<p>() { // from class: com.forsale.app.features.auth.forgotpassword.ForgotPasswordRouteKt$VerifyPhoneNumberRoute$2$1$1$1
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
                h11.u(D2);
            }
            h11.S();
            textFieldState = textFieldState2;
            BlockedUserViewKt.a(null, c12, (g00.a) D2, h11, 0, 1);
            SpacerKt.a(SizeKt.i(aVar3, h.l(f11)), h11, 6);
        }
        h11.S();
        String b15 = g.b(y0.f70700u4, h11, 0);
        dk.a aVar4 = dk.a.f54291a;
        int i14 = dk.a.f54292b;
        androidx.compose.ui.text.a0 k11 = aVar4.c(h11, i14).k();
        yj.d e11 = aVar4.a(h11, i14).e();
        int i15 = yj.d.f76453b;
        final ForgotPasswordViewModel forgotPasswordViewModel3 = forgotPasswordViewModel2;
        final TextFieldState textFieldState3 = textFieldState;
        TextKt.a(b15, null, 0, 0, false, 0, 0, null, k11, e11.m(h11, i15), 0, h11, 0, 0, 1278);
        TextKt.a(g.b(y0.f70684t4, h11, 0), PaddingKt.m(aVar3, 0.0f, 0.0f, 0.0f, h.l(8), 7, null), 0, 0, false, 0, 0, null, aVar4.c(h11, i14).b(), aVar4.a(h11, i14).e().k(h11, i15), 0, h11, 48, 0, 1276);
        PhoneFieldKt.a(sharedViewModel, textFieldState3, new ForgotPasswordRouteKt$VerifyPhoneNumberRoute$2$2(forgotPasswordViewModel3), h11, 72, 0);
        SpacerKt.a(SizeKt.i(aVar3, h.l(f11)), h11, 6);
        ButtonsKt.j(new g00.a<p>() { // from class: com.forsale.app.features.auth.forgotpassword.ForgotPasswordRouteKt$VerifyPhoneNumberRoute$2$3
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
                forgotPasswordViewModel3.q(TextFieldState.this.e(), ContextExtensionsKt.x(context));
            }
        }, TestTagKt.a(SizeKt.i(SizeKt.h(aVar3, 0.0f, 1, null), h.l(48)), ComponentsTags.FORGOT_PASSWORD_BUTTON.getTag()), null, null, false, false, null, ComposableSingletons$ForgotPasswordRouteKt.f22625a.a(), h11, 12582960, 124);
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.auth.forgotpassword.ForgotPasswordRouteKt$VerifyPhoneNumberRoute$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar5, int i16) {
                    ForgotPasswordRouteKt.a(AuthViewModel.this, forgotPasswordViewModel3, context, onNavigateToOtpVerification, onContactSupportClicked, aVar5, v0.a(i11 | 1), i12);
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar5, Integer num) {
                    b(aVar5, num.intValue());
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
    public static final void d(final ForgotPasswordViewModel forgotPasswordViewModel, final TextFieldState textFieldState, final g00.a<p> aVar, androidx.compose.runtime.a aVar2, final int i11) {
        androidx.compose.runtime.a h11 = aVar2.h(-1122917165);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-1122917165, i11, -1, "com.forsale.app.features.auth.forgotpassword.ViewModelObservers (ForgotPasswordRoute.kt:113)");
        }
        p pVar = p.f75480a;
        u.d(pVar, new ForgotPasswordRouteKt$ViewModelObservers$1(forgotPasswordViewModel, textFieldState, null), h11, 70);
        u.d(pVar, new ForgotPasswordRouteKt$ViewModelObservers$2(forgotPasswordViewModel, aVar, null), h11, 70);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.auth.forgotpassword.ForgotPasswordRouteKt$ViewModelObservers$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar3, int i12) {
                    ForgotPasswordRouteKt.d(ForgotPasswordViewModel.this, textFieldState, aVar, aVar3, v0.a(i11 | 1));
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
