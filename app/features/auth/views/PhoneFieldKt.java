package com.forsale.app.features.auth.views;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.e;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.c;
import androidx.compose.runtime.z;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.text.input.b0;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.l;
import androidx.lifecycle.q0;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.x0;
import com.forsale.app.features.auth.AuthViewModel;
import com.forsale.app.features.auth.utils.ComponentsTags;
import com.forsale.app.features.auth.views.textfieldstates.TextFieldState;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.inputs.InputsKt;
import e2.h;
import g00.a;
import g00.q;
import j0.d;
import j0.d1;
import j0.e1;
import j0.k;
import j0.n1;
import j0.t0;
import j0.v0;
import kotlin.jvm.internal.o;
import v0.b;
import w.f;
import w.u;
import w3.a;
import wz.p;
/* compiled from: PhoneField.kt */
/* loaded from: classes2.dex */
public final class PhoneFieldKt {
    public static final void a(AuthViewModel authViewModel, final TextFieldState phoneNumberState, a<p> aVar, androidx.compose.runtime.a aVar2, final int i11, final int i12) {
        final AuthViewModel authViewModel2;
        final PhoneFieldKt$PhoneField$1 phoneFieldKt$PhoneField$1;
        a<p> aVar3;
        AuthViewModel authViewModel3;
        String str;
        w3.a aVar4;
        o.i(phoneNumberState, "phoneNumberState");
        androidx.compose.runtime.a h11 = aVar2.h(1691246297);
        if ((i12 & 1) != 0) {
            h11.C(1729797275);
            x0 a11 = LocalViewModelStoreOwner.f12907a.a(h11, 6);
            if (a11 != null) {
                if (a11 instanceof l) {
                    aVar4 = ((l) a11).getDefaultViewModelCreationExtras();
                } else {
                    aVar4 = a.C0905a.f75031b;
                }
                q0 b11 = x3.a.b(AuthViewModel.class, a11, null, null, aVar4, h11, 36936, 0);
                h11.S();
                authViewModel2 = (AuthViewModel) b11;
            } else {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
        } else {
            authViewModel2 = authViewModel;
        }
        if ((i12 & 4) != 0) {
            phoneFieldKt$PhoneField$1 = new g00.a<p>() { // from class: com.forsale.app.features.auth.views.PhoneFieldKt$PhoneField$1
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // g00.a
                public /* bridge */ /* synthetic */ p invoke() {
                    invoke2();
                    return p.f75480a;
                }
            };
        } else {
            phoneFieldKt$PhoneField$1 = aVar;
        }
        if (c.I()) {
            c.U(1691246297, i11, -1, "com.forsale.app.features.auth.views.PhoneField (PhoneField.kt:36)");
        }
        phoneNumberState.m(authViewModel2.m().f());
        String str2 = null;
        n1 b12 = z.b(phoneNumberState.c(), null, h11, 8, 1);
        h11.C(-483455358);
        c.a aVar5 = androidx.compose.ui.c.f7566a;
        a0 a12 = e.a(Arrangement.f3698a.h(), b.f74009a.k(), h11, 0);
        h11.C(-1323940314);
        int a13 = j0.e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a14 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(aVar5);
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
        g00.p<ComposeUiNode, Integer, p> b13 = companion.b();
        if (a15.f() || !o.d(a15.D(), Integer.valueOf(a13))) {
            a15.u(Integer.valueOf(a13));
            a15.p(Integer.valueOf(a13), b13);
        }
        c11.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        f fVar = f.f74891a;
        CompositionLocalKt.a(CompositionLocalsKt.j().c(LayoutDirection.Ltr), r0.b.b(h11, -846974961, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.auth.views.PhoneFieldKt$PhoneField$2$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void b(androidx.compose.runtime.a aVar6, int i13) {
                if ((i13 & 11) == 2 && aVar6.i()) {
                    aVar6.L();
                    return;
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(-846974961, i13, -1, "com.forsale.app.features.auth.views.PhoneField.<anonymous>.<anonymous> (PhoneField.kt:41)");
                }
                c.a aVar7 = androidx.compose.ui.c.f7566a;
                final TextFieldState textFieldState = TextFieldState.this;
                androidx.compose.ui.c a16 = TestTagKt.a(androidx.compose.ui.focus.b.a(aVar7, new g00.l<z0.l, p>() { // from class: com.forsale.app.features.auth.views.PhoneFieldKt$PhoneField$2$1.1
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
                }), ComponentsTags.PHONE_FILED.getTag());
                String e11 = TextFieldState.this.e();
                androidx.compose.foundation.text.c cVar = new androidx.compose.foundation.text.c(0, false, b0.f9448a.d(), 0, null, 27, null);
                final TextFieldState textFieldState2 = TextFieldState.this;
                final AuthViewModel authViewModel4 = authViewModel2;
                final g00.a<p> aVar8 = phoneFieldKt$PhoneField$1;
                g00.l<String, p> lVar = new g00.l<String, p>() { // from class: com.forsale.app.features.auth.views.PhoneFieldKt$PhoneField$2$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void b(String it2) {
                        o.i(it2, "it");
                        TextFieldState.this.m(it2);
                        authViewModel4.m().j(it2);
                        aVar8.invoke();
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ p invoke(String str3) {
                        b(str3);
                        return p.f75480a;
                    }
                };
                final AuthViewModel authViewModel5 = authViewModel2;
                InputsKt.k(a16, e11, lVar, true, TextFieldState.this.n(), false, null, null, null, r0.b.b(aVar6, 531296264, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.auth.views.PhoneFieldKt$PhoneField$2$1.3
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar9, int i14) {
                        if ((i14 & 11) == 2 && aVar9.i()) {
                            aVar9.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(531296264, i14, -1, "com.forsale.app.features.auth.views.PhoneField.<anonymous>.<anonymous>.<anonymous> (PhoneField.kt:57)");
                        }
                        Arrangement.f o11 = Arrangement.f3698a.o(h.l(4));
                        AuthViewModel authViewModel6 = AuthViewModel.this;
                        aVar9.C(693286680);
                        c.a aVar10 = androidx.compose.ui.c.f7566a;
                        a0 a17 = androidx.compose.foundation.layout.o.a(o11, b.f74009a.l(), aVar9, 6);
                        aVar9.C(-1323940314);
                        int a18 = j0.e.a(aVar9, 0);
                        k s12 = aVar9.s();
                        ComposeUiNode.Companion companion2 = ComposeUiNode.f8256m;
                        g00.a<ComposeUiNode> a19 = companion2.a();
                        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c12 = LayoutKt.c(aVar10);
                        if (!(aVar9.k() instanceof d)) {
                            j0.e.c();
                        }
                        aVar9.I();
                        if (aVar9.f()) {
                            aVar9.y(a19);
                        } else {
                            aVar9.t();
                        }
                        androidx.compose.runtime.a a21 = Updater.a(aVar9);
                        Updater.c(a21, a17, companion2.e());
                        Updater.c(a21, s12, companion2.g());
                        g00.p<ComposeUiNode, Integer, p> b14 = companion2.b();
                        if (a21.f() || !o.d(a21.D(), Integer.valueOf(a18))) {
                            a21.u(Integer.valueOf(a18));
                            a21.p(Integer.valueOf(a18), b14);
                        }
                        c12.invoke(e1.a(e1.b(aVar9)), aVar9, 0);
                        aVar9.C(2058660585);
                        u uVar = u.f74924a;
                        ImageKt.a(p1.e.d(t9.q0.F2, aVar9, 0), null, SizeKt.p(aVar10, h.l(24)), null, null, 0.0f, null, aVar9, 440, 120);
                        String j11 = authViewModel6.j();
                        dk.a aVar11 = dk.a.f54291a;
                        int i15 = dk.a.f54292b;
                        TextKt.a(j11, null, 0, 0, false, 0, 0, null, aVar11.c(aVar9, i15).b(), aVar11.a(aVar9, i15).e().m(aVar9, yj.d.f76453b), 0, aVar9, 0, 0, 1278);
                        aVar9.S();
                        aVar9.w();
                        aVar9.S();
                        aVar9.S();
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar9, Integer num) {
                        b(aVar9, num.intValue());
                        return p.f75480a;
                    }
                }), null, null, ComposableSingletons$PhoneFieldKt.f23138a.a(), null, (z0.d) aVar6.q(CompositionLocalsKt.f()), null, null, cVar, null, null, null, aVar6, 805309440, 12616064, 0, 1945056);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar6, Integer num) {
                b(aVar6, num.intValue());
                return p.f75480a;
            }
        }), h11, t0.f59917d | 0 | 48);
        h11.C(2077835659);
        if (phoneNumberState.n()) {
            rj.a b14 = b(b12);
            h11.C(1813741967);
            if (b14 != null) {
                str2 = b14.a(h11, rj.a.f68042a);
            }
            h11.S();
            if (str2 == null) {
                str = "";
            } else {
                str = str2;
            }
            dk.a aVar6 = dk.a.f54291a;
            int i13 = dk.a.f54292b;
            aVar3 = phoneFieldKt$PhoneField$1;
            authViewModel3 = authViewModel2;
            TextKt.a(str, TestTagKt.a(PaddingKt.m(aVar5, 0.0f, h.l(4), 0.0f, 0.0f, 13, null), ComponentsTags.PHONE_NUMBER_VALIDATION_MESSAGE.getTag()), 0, 0, false, 0, 0, null, aVar6.c(h11, i13).h(), aVar6.a(h11, i13).d().i(h11, yj.d.f76453b), 0, h11, 48, 0, 1276);
        } else {
            aVar3 = phoneFieldKt$PhoneField$1;
            authViewModel3 = authViewModel2;
        }
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
            final AuthViewModel authViewModel4 = authViewModel3;
            final g00.a<p> aVar7 = aVar3;
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.auth.views.PhoneFieldKt$PhoneField$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar8, int i14) {
                    PhoneFieldKt.a(AuthViewModel.this, phoneNumberState, aVar7, aVar8, v0.a(i11 | 1), i12);
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar8, Integer num) {
                    b(aVar8, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    private static final rj.a b(n1<? extends rj.a> n1Var) {
        return n1Var.getValue();
    }
}
