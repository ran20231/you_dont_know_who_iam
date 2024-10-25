package com.forsale.app.features.more.user.editprofile.editpersonalinfo;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.r;
import androidx.compose.material.DividerKt;
import androidx.compose.material.IconButtonKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.z;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.fragment.app.w;
import androidx.lifecycle.l;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import com.forsale.app.features.auth.views.EmailTextFieldKt;
import com.forsale.app.features.auth.views.NameTextFieldKt;
import com.forsale.app.features.auth.views.textfieldstates.TextFieldState;
import com.forsale.app.features.more.user.editprofile.g;
import com.forsale.app.feedback.FeedbackSnackBarComponentKt;
import com.forsale.app.ui.dialogs.LoadingDialogKt;
import com.forsale.designSystem.buttons.ButtonData;
import com.forsale.designSystem.buttons.ButtonsKt;
import com.forsale.designSystem.layouts.NavBarsKt;
import com.forsale.designSystem.theme.ThemeKt;
import g00.q;
import j0.d1;
import j0.e;
import j0.e1;
import j0.k;
import j0.n1;
import j0.u;
import j0.v0;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import q1.n;
import t9.z0;
import v0.b;
import w.f;
import w.x;
import w.y;
import w3.a;
import wz.h;
import wz.p;
/* compiled from: EditPersonalInformationDialogFragment.kt */
/* loaded from: classes2.dex */
public final class EditPersonalInformationDialogFragment extends d {

    /* renamed from: f  reason: collision with root package name */
    private final h f33283f;

    public EditPersonalInformationDialogFragment() {
        final h b11;
        final g00.a<Fragment> aVar = new g00.a<Fragment>() { // from class: com.forsale.app.features.more.user.editprofile.editpersonalinfo.EditPersonalInformationDialogFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        b11 = kotlin.d.b(LazyThreadSafetyMode.NONE, new g00.a<x0>() { // from class: com.forsale.app.features.more.user.editprofile.editpersonalinfo.EditPersonalInformationDialogFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final x0 invoke() {
                return (x0) g00.a.this.invoke();
            }
        });
        this.f33283f = FragmentViewModelLazyKt.b(this, s.b(EditPersonalInformationViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.features.more.user.editprofile.editpersonalinfo.EditPersonalInformationDialogFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final w0 invoke() {
                x0 c11;
                c11 = FragmentViewModelLazyKt.c(h.this);
                return c11.getViewModelStore();
            }
        }, new g00.a<w3.a>() { // from class: com.forsale.app.features.more.user.editprofile.editpersonalinfo.EditPersonalInformationDialogFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final w3.a invoke() {
                x0 c11;
                l lVar;
                w3.a aVar2;
                g00.a aVar3 = g00.a.this;
                if (aVar3 == null || (aVar2 = (w3.a) aVar3.invoke()) == null) {
                    c11 = FragmentViewModelLazyKt.c(b11);
                    if (c11 instanceof l) {
                        lVar = (l) c11;
                    } else {
                        lVar = null;
                    }
                    if (lVar != null) {
                        return lVar.getDefaultViewModelCreationExtras();
                    }
                    return a.C0905a.f75031b;
                }
                return aVar2;
            }
        }, new g00.a<t0.b>() { // from class: com.forsale.app.features.more.user.editprofile.editpersonalinfo.EditPersonalInformationDialogFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final t0.b invoke() {
                x0 c11;
                l lVar;
                t0.b defaultViewModelProviderFactory;
                c11 = FragmentViewModelLazyKt.c(b11);
                if (c11 instanceof l) {
                    lVar = (l) c11;
                } else {
                    lVar = null;
                }
                if (lVar == null || (defaultViewModelProviderFactory = lVar.getDefaultViewModelProviderFactory()) == null) {
                    t0.b defaultViewModelProviderFactory2 = Fragment.this.getDefaultViewModelProviderFactory();
                    o.h(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                    return defaultViewModelProviderFactory2;
                }
                return defaultViewModelProviderFactory;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EditPersonalInformationViewModel C() {
        return (EditPersonalInformationViewModel) this.f33283f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(final w.o oVar, androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.runtime.a h11 = aVar.h(2033477041);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(2033477041, i11, -1, "com.forsale.app.features.more.user.editprofile.editpersonalinfo.EditPersonalInformationDialogFragment.EditPersonalInformationScreen (EditPersonalInformationDialogFragment.kt:133)");
        }
        n1 b11 = z.b(C().z(), null, h11, 8, 1);
        n1 b12 = z.b(C().A(), null, h11, 8, 1);
        h11.C(-492369756);
        Object D = h11.D();
        a.C0064a c0064a = androidx.compose.runtime.a.f7182a;
        if (D == c0064a.a()) {
            D = new TextFieldState(new EditPersonalInformationDialogFragment$EditPersonalInformationScreen$nameTextFieldState$1$1(C()), C().y());
            h11.u(D);
        }
        h11.S();
        final TextFieldState textFieldState = (TextFieldState) D;
        h11.C(-492369756);
        Object D2 = h11.D();
        if (D2 == c0064a.a()) {
            D2 = new TextFieldState(new EditPersonalInformationDialogFragment$EditPersonalInformationScreen$emailTextFieldState$1$1(C()), C().w());
            h11.u(D2);
        }
        h11.S();
        final TextFieldState textFieldState2 = (TextFieldState) D2;
        w(C(), textFieldState2, textFieldState, h11, 4680);
        c.a aVar2 = androidx.compose.ui.c.f7566a;
        androidx.compose.ui.c d11 = WindowInsetsPaddingKt.d(WindowInsetsPaddingKt.a(PaddingKt.h(SizeKt.f(aVar2, 0.0f, 1, null), oVar), oVar), x.h(androidx.compose.foundation.layout.s.b(r.f3992a, h11, 8), y.f74929a.h()));
        h11.C(733328855);
        b.a aVar3 = v0.b.f74009a;
        a0 g11 = BoxKt.g(aVar3.o(), false, h11, 0);
        h11.C(-1323940314);
        int a11 = e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a12 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(d11);
        if (!(h11.k() instanceof j0.d)) {
            e.c();
        }
        h11.I();
        if (h11.f()) {
            h11.y(a12);
        } else {
            h11.t();
        }
        androidx.compose.runtime.a a13 = Updater.a(h11);
        Updater.c(a13, g11, companion.e());
        Updater.c(a13, s11, companion.g());
        g00.p<ComposeUiNode, Integer, p> b13 = companion.b();
        if (a13.f() || !o.d(a13.D(), Integer.valueOf(a11))) {
            a13.u(Integer.valueOf(a11));
            a13.p(Integer.valueOf(a11), b13);
        }
        c11.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
        float f11 = 16;
        androidx.compose.ui.c i12 = PaddingKt.i(SizeKt.h(aVar2, 0.0f, 1, null), e2.h.l(f11));
        Arrangement arrangement = Arrangement.f3698a;
        Arrangement.f o11 = arrangement.o(e2.h.l(8));
        h11.C(-483455358);
        a0 a14 = androidx.compose.foundation.layout.e.a(o11, aVar3.k(), h11, 6);
        h11.C(-1323940314);
        int a15 = e.a(h11, 0);
        k s12 = h11.s();
        g00.a<ComposeUiNode> a16 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c12 = LayoutKt.c(i12);
        if (!(h11.k() instanceof j0.d)) {
            e.c();
        }
        h11.I();
        if (h11.f()) {
            h11.y(a16);
        } else {
            h11.t();
        }
        androidx.compose.runtime.a a17 = Updater.a(h11);
        Updater.c(a17, a14, companion.e());
        Updater.c(a17, s12, companion.g());
        g00.p<ComposeUiNode, Integer, p> b14 = companion.b();
        if (a17.f() || !o.d(a17.D(), Integer.valueOf(a15))) {
            a17.u(Integer.valueOf(a15));
            a17.p(Integer.valueOf(a15), b14);
        }
        c12.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        f fVar = f.f74891a;
        NameTextFieldKt.a(t(b12), textFieldState, new EditPersonalInformationDialogFragment$EditPersonalInformationScreen$1$1$1(C()), h11, 72);
        EmailTextFieldKt.a(t(b12), textFieldState2, new EditPersonalInformationDialogFragment$EditPersonalInformationScreen$1$1$2(C()), h11, 72);
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        androidx.compose.ui.c e11 = boxScopeInstance.e(SizeKt.h(aVar2, 0.0f, 1, null), aVar3.b());
        h11.C(-483455358);
        a0 a18 = androidx.compose.foundation.layout.e.a(arrangement.h(), aVar3.k(), h11, 0);
        h11.C(-1323940314);
        int a19 = e.a(h11, 0);
        k s13 = h11.s();
        g00.a<ComposeUiNode> a21 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c13 = LayoutKt.c(e11);
        if (!(h11.k() instanceof j0.d)) {
            e.c();
        }
        h11.I();
        if (h11.f()) {
            h11.y(a21);
        } else {
            h11.t();
        }
        androidx.compose.runtime.a a22 = Updater.a(h11);
        Updater.c(a22, a18, companion.e());
        Updater.c(a22, s13, companion.g());
        g00.p<ComposeUiNode, Integer, p> b15 = companion.b();
        if (a22.f() || !o.d(a22.D(), Integer.valueOf(a19))) {
            a22.u(Integer.valueOf(a19));
            a22.p(Integer.valueOf(a19), b15);
        }
        c13.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        DividerKt.a(null, 0L, 0.0f, 0.0f, h11, 0, 15);
        ButtonsKt.d(new g00.a<p>() { // from class: com.forsale.app.features.more.user.editprofile.editpersonalinfo.EditPersonalInformationDialogFragment$EditPersonalInformationScreen$1$2$1
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
                ma.a.a(TextFieldState.this, textFieldState2);
                this.C().E(this.C().A().getValue());
            }
        }, PaddingKt.i(SizeKt.h(aVar2, 0.0f, 1, null), e2.h.l(f11)), ButtonData.f40994a.a(), null, null, null, null, false, null, null, ComposableSingletons$EditPersonalInformationDialogFragmentKt.f33276a.c(), h11, (ButtonData.f40995b << 6) | 48, 6, 1016);
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        q(s(b11), h11, 64);
        androidx.compose.ui.c e12 = boxScopeInstance.e(aVar2, aVar3.b());
        h11.C(-483455358);
        a0 a23 = androidx.compose.foundation.layout.e.a(arrangement.h(), aVar3.k(), h11, 0);
        h11.C(-1323940314);
        int a24 = e.a(h11, 0);
        k s14 = h11.s();
        g00.a<ComposeUiNode> a25 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c14 = LayoutKt.c(e12);
        if (!(h11.k() instanceof j0.d)) {
            e.c();
        }
        h11.I();
        if (h11.f()) {
            h11.y(a25);
        } else {
            h11.t();
        }
        androidx.compose.runtime.a a26 = Updater.a(h11);
        Updater.c(a26, a23, companion.e());
        Updater.c(a26, s14, companion.g());
        g00.p<ComposeUiNode, Integer, p> b16 = companion.b();
        if (a26.f() || !o.d(a26.D(), Integer.valueOf(a24))) {
            a26.u(Integer.valueOf(a24));
            a26.p(Integer.valueOf(a24), b16);
        }
        c14.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        FeedbackSnackBarComponentKt.a(PaddingKt.l(aVar2, e2.h.l(f11), e2.h.l(f11), e2.h.l(f11), e2.h.l(80)), C().x(), h11, 70, 0);
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
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.user.editprofile.editpersonalinfo.EditPersonalInformationDialogFragment$EditPersonalInformationScreen$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar4, int i13) {
                    EditPersonalInformationDialogFragment.this.r(oVar, aVar4, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    private static final g s(n1<? extends g> n1Var) {
        return n1Var.getValue();
    }

    private static final ja.a t(n1<ja.a> n1Var) {
        return n1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(final EditPersonalInformationViewModel editPersonalInformationViewModel, final TextFieldState textFieldState, final TextFieldState textFieldState2, androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.runtime.a h11 = aVar.h(-1877974223);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-1877974223, i11, -1, "com.forsale.app.features.more.user.editprofile.editpersonalinfo.EditPersonalInformationDialogFragment.FieldsServerErrorObservers (EditPersonalInformationDialogFragment.kt:238)");
        }
        p pVar = p.f75480a;
        u.d(pVar, new EditPersonalInformationDialogFragment$FieldsServerErrorObservers$1(editPersonalInformationViewModel, textFieldState, null), h11, 70);
        u.d(pVar, new EditPersonalInformationDialogFragment$FieldsServerErrorObservers$2(editPersonalInformationViewModel, textFieldState2, null), h11, 70);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.user.editprofile.editpersonalinfo.EditPersonalInformationDialogFragment$FieldsServerErrorObservers$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i12) {
                    EditPersonalInformationDialogFragment.this.w(editPersonalInformationViewModel, textFieldState, textFieldState2, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.runtime.a h11 = aVar.h(994137139);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(994137139, i11, -1, "com.forsale.app.features.more.user.editprofile.editpersonalinfo.EditPersonalInformationDialogFragment.ScreenContent (EditPersonalInformationDialogFragment.kt:99)");
        }
        ScaffoldKt.b(n.c(androidx.compose.ui.c.f7566a, false, new g00.l<q1.s, p>() { // from class: com.forsale.app.features.more.user.editprofile.editpersonalinfo.EditPersonalInformationDialogFragment$ScreenContent$1
            public final void b(q1.s semantics) {
                o.i(semantics, "$this$semantics");
                q1.r.a(semantics, true);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(q1.s sVar) {
                b(sVar);
                return p.f75480a;
            }
        }, 1, null), ScaffoldKt.l(null, null, h11, 0, 3), r0.b.b(h11, -1993208200, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.user.editprofile.editpersonalinfo.EditPersonalInformationDialogFragment$ScreenContent$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            public final void b(androidx.compose.runtime.a aVar2, int i12) {
                if ((i12 & 11) == 2 && aVar2.i()) {
                    aVar2.L();
                    return;
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(-1993208200, i12, -1, "com.forsale.app.features.more.user.editprofile.editpersonalinfo.EditPersonalInformationDialogFragment.ScreenContent.<anonymous> (EditPersonalInformationDialogFragment.kt:104)");
                }
                final EditPersonalInformationDialogFragment editPersonalInformationDialogFragment = EditPersonalInformationDialogFragment.this;
                NavBarsKt.a(null, r0.b.b(aVar2, -432401486, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.user.editprofile.editpersonalinfo.EditPersonalInformationDialogFragment$ScreenContent$2.1
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar3, int i13) {
                        if ((i13 & 11) == 2 && aVar3.i()) {
                            aVar3.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(-432401486, i13, -1, "com.forsale.app.features.more.user.editprofile.editpersonalinfo.EditPersonalInformationDialogFragment.ScreenContent.<anonymous>.<anonymous> (EditPersonalInformationDialogFragment.kt:106)");
                        }
                        final EditPersonalInformationDialogFragment editPersonalInformationDialogFragment2 = EditPersonalInformationDialogFragment.this;
                        IconButtonKt.a(new g00.a<p>() { // from class: com.forsale.app.features.more.user.editprofile.editpersonalinfo.EditPersonalInformationDialogFragment.ScreenContent.2.1.1
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
                                EditPersonalInformationDialogFragment.this.dismiss();
                            }
                        }, null, false, null, ComposableSingletons$EditPersonalInformationDialogFragmentKt.f33276a.a(), aVar3, 24576, 14);
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                        b(aVar3, num.intValue());
                        return p.f75480a;
                    }
                }), ComposableSingletons$EditPersonalInformationDialogFragmentKt.f33276a.b(), null, true, aVar2, 25008, 9);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                b(aVar2, num.intValue());
                return p.f75480a;
            }
        }), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, r0.b.b(h11, 188655089, true, new q<w.o, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.user.editprofile.editpersonalinfo.EditPersonalInformationDialogFragment$ScreenContent$3
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(3);
            }

            public final void b(w.o padding, androidx.compose.runtime.a aVar2, int i12) {
                int i13;
                o.i(padding, "padding");
                if ((i12 & 14) == 0) {
                    if (aVar2.T(padding)) {
                        i13 = 4;
                    } else {
                        i13 = 2;
                    }
                    i12 |= i13;
                }
                if ((i12 & 91) == 18 && aVar2.i()) {
                    aVar2.L();
                    return;
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(188655089, i12, -1, "com.forsale.app.features.more.user.editprofile.editpersonalinfo.EditPersonalInformationDialogFragment.ScreenContent.<anonymous> (EditPersonalInformationDialogFragment.kt:127)");
                }
                EditPersonalInformationDialogFragment.this.r(padding, aVar2, (i12 & 14) | 64);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }

            @Override // g00.q
            public /* bridge */ /* synthetic */ p invoke(w.o oVar, androidx.compose.runtime.a aVar2, Integer num) {
                b(oVar, aVar2, num.intValue());
                return p.f75480a;
            }
        }), h11, 384, 12582912, 131064);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.user.editprofile.editpersonalinfo.EditPersonalInformationDialogFragment$ScreenContent$4
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i12) {
                    EditPersonalInformationDialogFragment.this.x(aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    @Override // androidx.fragment.app.j
    public int getTheme() {
        return z0.f70797g;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.i(inflater, "inflater");
        Context requireContext = requireContext();
        o.h(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        Window window = requireDialog().getWindow();
        if (window != null) {
            window.setSoftInputMode(16);
        }
        androidx.lifecycle.s viewLifecycleOwner = getViewLifecycleOwner();
        o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        composeView.setViewCompositionStrategy(new ViewCompositionStrategy.b(viewLifecycleOwner));
        composeView.setContent(r0.b.c(-1112736862, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.user.editprofile.editpersonalinfo.EditPersonalInformationDialogFragment$onCreateView$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            public final void b(androidx.compose.runtime.a aVar, int i11) {
                if ((i11 & 11) == 2 && aVar.i()) {
                    aVar.L();
                    return;
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(-1112736862, i11, -1, "com.forsale.app.features.more.user.editprofile.editpersonalinfo.EditPersonalInformationDialogFragment.onCreateView.<anonymous>.<anonymous> (EditPersonalInformationDialogFragment.kt:84)");
                }
                final EditPersonalInformationDialogFragment editPersonalInformationDialogFragment = EditPersonalInformationDialogFragment.this;
                ThemeKt.a(null, null, r0.b.b(aVar, 1069764331, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.user.editprofile.editpersonalinfo.EditPersonalInformationDialogFragment$onCreateView$1$1.1
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i12) {
                        if ((i12 & 11) == 2 && aVar2.i()) {
                            aVar2.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(1069764331, i12, -1, "com.forsale.app.features.more.user.editprofile.editpersonalinfo.EditPersonalInformationDialogFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (EditPersonalInformationDialogFragment.kt:85)");
                        }
                        EditPersonalInformationDialogFragment.this.x(aVar2, 8);
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                        b(aVar2, num.intValue());
                        return p.f75480a;
                    }
                }), aVar, 384, 3);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar, Integer num) {
                b(aVar, num.intValue());
                return p.f75480a;
            }
        }));
        return composeView;
    }

    @Override // androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (window != null) {
            window.setWindowAnimations(z0.f70795e);
        }
    }

    public final void q(final g state, androidx.compose.runtime.a aVar, final int i11) {
        o.i(state, "state");
        androidx.compose.runtime.a h11 = aVar.h(368072731);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(368072731, i11, -1, "com.forsale.app.features.more.user.editprofile.editpersonalinfo.EditPersonalInformationDialogFragment.EditPersonalInfoUIStates (EditPersonalInformationDialogFragment.kt:220)");
        }
        if (o.d(state, g.c.f33382a)) {
            LoadingDialogKt.a(h11, 0);
        } else if (state instanceof g.d) {
            Bundle bundle = new Bundle();
            p pVar = p.f75480a;
            w.b(this, "editPersonalInformation", bundle);
            dismiss();
        } else if (o.d(state, g.e.f33385a)) {
            dismiss();
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.user.editprofile.editpersonalinfo.EditPersonalInformationDialogFragment$EditPersonalInfoUIStates$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i12) {
                    EditPersonalInformationDialogFragment.this.q(state, aVar2, v0.a(i11 | 1));
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
