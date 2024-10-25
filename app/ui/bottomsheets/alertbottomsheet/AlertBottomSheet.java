package com.forsale.app.ui.bottomsheets.alertbottomsheet;

import aa.o1;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.DividerKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.t0;
import com.forsale.app.ui.bottomsheets.alertbottomsheet.b;
import com.forsale.app.ui.bottomsheets.alertbottomsheet.items.models.ActionModel;
import com.forsale.app.ui.bottomsheets.alertbottomsheet.items.models.AlertActionTypes;
import com.forsale.app.ui.bottomsheets.alertbottomsheet.items.models.AlertModel;
import com.forsale.app.ui.bottomsheets.alertbottomsheet.items.models.ImageModel;
import com.forsale.app.ui.bottomsheets.alertbottomsheet.items.models.TextModel;
import com.forsale.app.ui.bottomsheets.alertbottomsheet.items.models.TextModelCustom;
import com.forsale.app.utils.CrashlyticsUtilsKt;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7;
import com.forsale.app.utils.itemutils.ComposeViewPadding;
import com.forsale.app.utils.itemutils.TextHolder;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.buttons.ButtonsKt;
import com.forsale.designSystem.theme.ThemeKt;
import com.google.android.gms.ads.AdRequest;
import g00.q;
import j0.d1;
import j0.e;
import j0.e1;
import j0.k;
import j0.v0;
import kotlin.LazyThreadSafetyMode;
import kotlin.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.FlowCollector;
import t9.t0;
import t9.z0;
import v0.b;
import w.f;
import w.t;
import w.u;
import wz.h;
import wz.p;
/* compiled from: AlertBottomSheet.kt */
/* loaded from: classes3.dex */
public final class AlertBottomSheet extends eg.b<o1, com.forsale.app.ui.bottomsheets.alertbottomsheet.b> {
    public static final a D = new a(null);
    public static final int E = 8;
    private g00.a<p> A;
    public b.a B;
    private final h C;

    /* renamed from: j */
    private final int f37933j = t0.L;

    /* renamed from: x */
    private final h f37934x;

    /* renamed from: y */
    private g00.a<p> f37935y;

    /* renamed from: z */
    private g00.a<p> f37936z;

    /* compiled from: AlertBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void a(AlertBottomSheet alertBottomSheet, g00.a<p> aVar, g00.a<p> aVar2, g00.a<p> aVar3) {
            alertBottomSheet.f37935y = aVar3;
            alertBottomSheet.f37936z = aVar;
            alertBottomSheet.A = aVar2;
        }

        public static /* synthetic */ void c(a aVar, AlertModel alertModel, g00.a aVar2, g00.a aVar3, g00.a aVar4, FragmentManager fragmentManager, int i11, Object obj) {
            g00.a aVar5;
            g00.a aVar6;
            g00.a aVar7;
            if ((i11 & 2) != 0) {
                aVar5 = null;
            } else {
                aVar5 = aVar2;
            }
            if ((i11 & 4) != 0) {
                aVar6 = null;
            } else {
                aVar6 = aVar3;
            }
            if ((i11 & 8) != 0) {
                aVar7 = null;
            } else {
                aVar7 = aVar4;
            }
            aVar.b(alertModel, aVar5, aVar6, aVar7, fragmentManager);
        }

        public final void b(AlertModel alertModel, g00.a<p> aVar, g00.a<p> aVar2, g00.a<p> aVar3, FragmentManager fragmentManager) {
            o.i(alertModel, "alertModel");
            o.i(fragmentManager, "fragmentManager");
            AlertBottomSheet alertBottomSheet = new AlertBottomSheet();
            Bundle bundle = new Bundle();
            bundle.putParcelable("ALERT_MODEL", alertModel);
            alertBottomSheet.setCancelable(alertModel.h());
            alertBottomSheet.setArguments(bundle);
            AlertBottomSheet.D.a(alertBottomSheet, aVar, aVar2, aVar3);
            alertBottomSheet.show(fragmentManager, "ALERT_BOTTOM_SHEET");
        }
    }

    /* compiled from: AlertBottomSheet.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37980a;

        static {
            int[] iArr = new int[AlertActionTypes.values().length];
            try {
                iArr[AlertActionTypes.TWO_ACTIONS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AlertActionTypes.ONE_ACTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f37980a = iArr;
        }
    }

    /* compiled from: AlertBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class c implements FlowCollector<p> {
        c() {
            AlertBottomSheet.this = r1;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(p pVar, zz.a<? super p> aVar) {
            AlertBottomSheet.this.dismiss();
            return p.f75480a;
        }
    }

    public AlertBottomSheet() {
        h a11;
        h b11;
        a11 = d.a(new g00.a<AlertModel>() { // from class: com.forsale.app.ui.bottomsheets.alertbottomsheet.AlertBottomSheet$alertModel$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final AlertModel invoke() {
                Bundle arguments = AlertBottomSheet.this.getArguments();
                if (arguments != null) {
                    return (AlertModel) arguments.getParcelable("ALERT_MODEL");
                }
                return null;
            }
        });
        this.f37934x = a11;
        g00.a<t0.b> aVar = new g00.a<t0.b>() { // from class: com.forsale.app.ui.bottomsheets.alertbottomsheet.AlertBottomSheet$special$$inlined$assistedViewModel$1

            /* compiled from: ViewModelHiltExtension.kt */
            /* loaded from: classes3.dex */
            public static final class a extends androidx.lifecycle.a {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ AlertBottomSheet f37939f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Fragment fragment, Bundle bundle, AlertBottomSheet alertBottomSheet) {
                    super(fragment, bundle);
                    this.f37939f = alertBottomSheet;
                }

                @Override // androidx.lifecycle.a
                protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                    AlertModel l02;
                    g00.a<p> aVar;
                    o.i(key, "key");
                    o.i(modelClass, "modelClass");
                    o.i(handle, "handle");
                    b.a m02 = this.f37939f.m0();
                    l02 = this.f37939f.l0();
                    aVar = this.f37939f.f37935y;
                    b a11 = m02.a(l02, aVar);
                    o.g(a11, "null cannot be cast to non-null type T of com.forsale.app.utils.ViewModelHiltExtensionKt.assistedViewModel.<no name provided>.invoke.<no name provided>.create");
                    return a11;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final t0.b invoke() {
                return new a(Fragment.this, Fragment.this.getArguments(), this);
            }
        };
        b11 = d.b(LazyThreadSafetyMode.NONE, new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5(new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4(this)));
        this.C = FragmentViewModelLazyKt.b(this, s.b(com.forsale.app.ui.bottomsheets.alertbottomsheet.b.class), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6(b11), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7(null, b11), aVar);
    }

    public final void C(final TextModelCustom textModelCustom, androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.runtime.a h11 = aVar.h(-217297100);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-217297100, i11, -1, "com.forsale.app.ui.bottomsheets.alertbottomsheet.AlertBottomSheet.AddCustomDescription (AlertBottomSheet.kt:158)");
        }
        h11.C(693286680);
        c.a aVar2 = androidx.compose.ui.c.f7566a;
        Arrangement arrangement = Arrangement.f3698a;
        Arrangement.e g11 = arrangement.g();
        b.a aVar3 = v0.b.f74009a;
        a0 a11 = androidx.compose.foundation.layout.o.a(g11, aVar3.l(), h11, 0);
        h11.C(-1323940314);
        int a12 = e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(aVar2);
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
        androidx.compose.ui.c m11 = PaddingKt.m(SizeKt.h(aVar2, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, e2.h.l(24), 7, null);
        b.InterfaceC0889b g12 = aVar3.g();
        h11.C(-483455358);
        a0 a15 = androidx.compose.foundation.layout.e.a(arrangement.h(), g12, h11, 48);
        h11.C(-1323940314);
        int a16 = e.a(h11, 0);
        k s12 = h11.s();
        g00.a<ComposeUiNode> a17 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c12 = LayoutKt.c(m11);
        if (!(h11.k() instanceof j0.d)) {
            e.c();
        }
        h11.I();
        if (h11.f()) {
            h11.y(a17);
        } else {
            h11.t();
        }
        androidx.compose.runtime.a a18 = Updater.a(h11);
        Updater.c(a18, a15, companion.e());
        Updater.c(a18, s12, companion.g());
        g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
        if (a18.f() || !o.d(a18.D(), Integer.valueOf(a16))) {
            a18.u(Integer.valueOf(a16));
            a18.p(Integer.valueOf(a16), b12);
        }
        c12.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        f fVar = f.f74891a;
        J(textModelCustom.c(), h11, 72);
        E(textModelCustom.a(), h11, 64);
        TextModel b13 = textModelCustom.b();
        h11.C(2025706570);
        if (b13 != null) {
            H(b13, h11, 72);
        }
        h11.S();
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
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.ui.bottomsheets.alertbottomsheet.AlertBottomSheet$AddCustomDescription$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar4, int i12) {
                    AlertBottomSheet.this.C(textModelCustom, aVar4, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public final void D(final TextModel textModel, androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a h11 = aVar.h(476799316);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(476799316, i11, -1, "com.forsale.app.ui.bottomsheets.alertbottomsheet.AlertBottomSheet.AddDescription (AlertBottomSheet.kt:140)");
        }
        TextHolder c11 = textModel.c();
        if (c11 == null) {
            aVar2 = h11;
        } else {
            h11.C(-492369756);
            Object D2 = h11.D();
            if (D2 == androidx.compose.runtime.a.f7182a.a()) {
                D2 = o0(c11);
                h11.u(D2);
            }
            h11.S();
            String str = (String) D2;
            h11.C(693286680);
            c.a aVar3 = androidx.compose.ui.c.f7566a;
            a0 a11 = androidx.compose.foundation.layout.o.a(Arrangement.f3698a.g(), v0.b.f74009a.l(), h11, 0);
            h11.C(-1323940314);
            int a12 = e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c12 = LayoutKt.c(aVar3);
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
            c12.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            u uVar = u.f74924a;
            int a15 = b2.f.f16081b.a();
            int b12 = textModel.b();
            dk.a aVar4 = dk.a.f54291a;
            int i12 = dk.a.f54292b;
            androidx.compose.ui.text.a0 b13 = aVar4.c(h11, i12).b();
            long j11 = aVar4.a(h11, i12).e().j(h11, yj.d.f76453b);
            androidx.compose.ui.c r02 = r0(textModel.a(), h11, 64);
            if (r02 == null) {
                float f11 = 32;
                r02 = PaddingKt.l(aVar3, e2.h.l(f11), e2.h.l(4), e2.h.l(f11), e2.h.l(24));
            }
            aVar2 = h11;
            TextKt.a(str, r02, a15, 0, false, b12, 0, null, b13, j11, 0, h11, 6, 0, 1240);
            aVar2.S();
            aVar2.w();
            aVar2.S();
            aVar2.S();
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = aVar2.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.ui.bottomsheets.alertbottomsheet.AlertBottomSheet$AddDescription$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar5, int i13) {
                    AlertBottomSheet.this.D(textModel, aVar5, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar5, Integer num) {
                    b(aVar5, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public final void G(final ImageModel imageModel, final boolean z11, androidx.compose.runtime.a aVar, final int i11) {
        int i12;
        androidx.compose.runtime.a h11 = aVar.h(1062684961);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(1062684961, i11, -1, "com.forsale.app.ui.bottomsheets.alertbottomsheet.AlertBottomSheet.AddImage (AlertBottomSheet.kt:98)");
        }
        h11.C(-492369756);
        Object D2 = h11.D();
        if (D2 == androidx.compose.runtime.a.f7182a.a()) {
            D2 = Integer.valueOf(imageModel.b());
            h11.u(D2);
        }
        h11.S();
        int intValue = ((Number) D2).intValue();
        if (z11) {
            i12 = 8;
        } else {
            i12 = 16;
        }
        c.a aVar2 = androidx.compose.ui.c.f7566a;
        androidx.compose.ui.c h12 = SizeKt.h(aVar2, 0.0f, 1, null);
        h11.C(693286680);
        Arrangement arrangement = Arrangement.f3698a;
        Arrangement.e g11 = arrangement.g();
        b.a aVar3 = v0.b.f74009a;
        a0 a11 = androidx.compose.foundation.layout.o.a(g11, aVar3.l(), h11, 0);
        h11.C(-1323940314);
        int a12 = e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(h12);
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
        androidx.compose.ui.c h13 = SizeKt.h(aVar2, 0.0f, 1, null);
        b.InterfaceC0889b g12 = aVar3.g();
        h11.C(-483455358);
        a0 a15 = androidx.compose.foundation.layout.e.a(arrangement.h(), g12, h11, 48);
        h11.C(-1323940314);
        int a16 = e.a(h11, 0);
        k s12 = h11.s();
        g00.a<ComposeUiNode> a17 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c12 = LayoutKt.c(h13);
        if (!(h11.k() instanceof j0.d)) {
            e.c();
        }
        h11.I();
        if (h11.f()) {
            h11.y(a17);
        } else {
            h11.t();
        }
        androidx.compose.runtime.a a18 = Updater.a(h11);
        Updater.c(a18, a15, companion.e());
        Updater.c(a18, s12, companion.g());
        g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
        if (a18.f() || !o.d(a18.D(), Integer.valueOf(a16))) {
            a18.u(Integer.valueOf(a16));
            a18.p(Integer.valueOf(a16), b12);
        }
        c12.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        f fVar = f.f74891a;
        Painter d11 = p1.e.d(intValue, h11, 6);
        androidx.compose.ui.layout.c d12 = androidx.compose.ui.layout.c.f8188a.d();
        androidx.compose.ui.c r02 = r0(imageModel.a(), h11, 64);
        if (r02 == null) {
            r02 = PaddingKt.m(aVar2, 0.0f, e2.h.l(i12), 0.0f, 0.0f, 13, null);
        }
        ImageKt.a(d11, null, r02, null, d12, 0.0f, null, h11, 24632, 104);
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
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.ui.bottomsheets.alertbottomsheet.AlertBottomSheet$AddImage$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar4, int i13) {
                    AlertBottomSheet.this.G(imageModel, z11, aVar4, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public final void I(final ActionModel actionModel, androidx.compose.runtime.a aVar, final int i11) {
        float l11;
        float l12;
        float l13;
        float l14;
        androidx.compose.runtime.a h11 = aVar.h(420262362);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(420262362, i11, -1, "com.forsale.app.ui.bottomsheets.alertbottomsheet.AlertBottomSheet.AddOneActionButtons (AlertBottomSheet.kt:274)");
        }
        h11.C(-492369756);
        Object D2 = h11.D();
        if (D2 == androidx.compose.runtime.a.f7182a.a()) {
            D2 = o0(actionModel.a());
            h11.u(D2);
        }
        h11.S();
        final String str = (String) D2;
        c.a aVar2 = androidx.compose.ui.c.f7566a;
        ComposeViewPadding b11 = actionModel.b();
        if (b11 != null) {
            l11 = b11.c();
        } else {
            l11 = e2.h.l(24);
        }
        float f11 = l11;
        ComposeViewPadding b12 = actionModel.b();
        if (b12 != null) {
            l12 = b12.b();
        } else {
            l12 = e2.h.l(24);
        }
        androidx.compose.ui.c m11 = PaddingKt.m(aVar2, f11, 0.0f, l12, 0.0f, 10, null);
        h11.C(-483455358);
        Arrangement arrangement = Arrangement.f3698a;
        Arrangement.m h12 = arrangement.h();
        b.a aVar3 = v0.b.f74009a;
        a0 a11 = androidx.compose.foundation.layout.e.a(h12, aVar3.k(), h11, 0);
        h11.C(-1323940314);
        int a12 = e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
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
        g00.p<ComposeUiNode, Integer, p> b13 = companion.b();
        if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
            a14.u(Integer.valueOf(a12));
            a14.p(Integer.valueOf(a12), b13);
        }
        c11.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        f fVar = f.f74891a;
        O(h11, 8);
        ComposeViewPadding b14 = actionModel.b();
        if (b14 != null) {
            l13 = b14.d();
        } else {
            l13 = e2.h.l(24);
        }
        float f12 = l13;
        ComposeViewPadding b15 = actionModel.b();
        if (b15 != null) {
            l14 = b15.a();
        } else {
            l14 = e2.h.l(24);
        }
        androidx.compose.ui.c m12 = PaddingKt.m(aVar2, 0.0f, f12, 0.0f, l14, 5, null);
        h11.C(693286680);
        a0 a15 = androidx.compose.foundation.layout.o.a(arrangement.g(), aVar3.l(), h11, 0);
        h11.C(-1323940314);
        int a16 = e.a(h11, 0);
        k s12 = h11.s();
        g00.a<ComposeUiNode> a17 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c12 = LayoutKt.c(m12);
        if (!(h11.k() instanceof j0.d)) {
            e.c();
        }
        h11.I();
        if (h11.f()) {
            h11.y(a17);
        } else {
            h11.t();
        }
        androidx.compose.runtime.a a18 = Updater.a(h11);
        Updater.c(a18, a15, companion.e());
        Updater.c(a18, s12, companion.g());
        g00.p<ComposeUiNode, Integer, p> b16 = companion.b();
        if (a18.f() || !o.d(a18.D(), Integer.valueOf(a16))) {
            a18.u(Integer.valueOf(a16));
            a18.p(Integer.valueOf(a16), b16);
        }
        c12.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        u uVar = u.f74924a;
        ButtonsKt.j(new g00.a<p>() { // from class: com.forsale.app.ui.bottomsheets.alertbottomsheet.AlertBottomSheet$AddOneActionButtons$1$1$1
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
                g00.a aVar4;
                OneShotEventHandler.d(AlertBottomSheet.this.t().y0(), null, 1, null);
                aVar4 = AlertBottomSheet.this.f37936z;
                if (aVar4 != null) {
                    aVar4.invoke();
                }
            }
        }, SizeKt.h(aVar2, 0.0f, 1, null), null, null, false, false, null, r0.b.b(h11, 1697488462, true, new q<t, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.ui.bottomsheets.alertbottomsheet.AlertBottomSheet$AddOneActionButtons$1$1$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            public final void b(t PrimaryButton, androidx.compose.runtime.a aVar4, int i12) {
                o.i(PrimaryButton, "$this$PrimaryButton");
                if ((i12 & 81) == 16 && aVar4.i()) {
                    aVar4.L();
                    return;
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(1697488462, i12, -1, "com.forsale.app.ui.bottomsheets.alertbottomsheet.AlertBottomSheet.AddOneActionButtons.<anonymous>.<anonymous>.<anonymous> (AlertBottomSheet.kt:292)");
                }
                TextKt.a(str, null, 0, 0, false, 0, 0, null, null, 0L, 0, aVar4, 6, 0, 2046);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }

            @Override // g00.q
            public /* bridge */ /* synthetic */ p invoke(t tVar, androidx.compose.runtime.a aVar4, Integer num) {
                b(tVar, aVar4, num.intValue());
                return p.f75480a;
            }
        }), h11, 12582960, 124);
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
        d1 l15 = h11.l();
        if (l15 != null) {
            l15.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.ui.bottomsheets.alertbottomsheet.AlertBottomSheet$AddOneActionButtons$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar4, int i12) {
                    AlertBottomSheet.this.I(actionModel, aVar4, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public final void K(final TextModel textModel, androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.ui.c cVar;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a h11 = aVar.h(-868030608);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-868030608, i11, -1, "com.forsale.app.ui.bottomsheets.alertbottomsheet.AlertBottomSheet.AddTitle (AlertBottomSheet.kt:118)");
        }
        TextHolder c11 = textModel.c();
        if (c11 == null) {
            aVar2 = h11;
        } else {
            h11.C(-492369756);
            Object D2 = h11.D();
            if (D2 == androidx.compose.runtime.a.f7182a.a()) {
                D2 = o0(c11);
                h11.u(D2);
            }
            h11.S();
            String str = (String) D2;
            c.a aVar3 = androidx.compose.ui.c.f7566a;
            androidx.compose.ui.c h12 = SizeKt.h(aVar3, 0.0f, 1, null);
            h11.C(693286680);
            Arrangement arrangement = Arrangement.f3698a;
            Arrangement.e g11 = arrangement.g();
            b.a aVar4 = v0.b.f74009a;
            a0 a11 = androidx.compose.foundation.layout.o.a(g11, aVar4.l(), h11, 0);
            h11.C(-1323940314);
            int a12 = e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c12 = LayoutKt.c(h12);
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
            c12.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            u uVar = u.f74924a;
            androidx.compose.ui.c h13 = SizeKt.h(aVar3, 0.0f, 1, null);
            b.InterfaceC0889b g12 = aVar4.g();
            h11.C(-483455358);
            a0 a15 = androidx.compose.foundation.layout.e.a(arrangement.h(), g12, h11, 48);
            h11.C(-1323940314);
            int a16 = e.a(h11, 0);
            k s12 = h11.s();
            g00.a<ComposeUiNode> a17 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c13 = LayoutKt.c(h13);
            if (!(h11.k() instanceof j0.d)) {
                e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a17);
            } else {
                h11.t();
            }
            androidx.compose.runtime.a a18 = Updater.a(h11);
            Updater.c(a18, a15, companion.e());
            Updater.c(a18, s12, companion.g());
            g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
            if (a18.f() || !o.d(a18.D(), Integer.valueOf(a16))) {
                a18.u(Integer.valueOf(a16));
                a18.p(Integer.valueOf(a16), b12);
            }
            c13.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            f fVar = f.f74891a;
            int a19 = b2.f.f16081b.a();
            dk.a aVar5 = dk.a.f54291a;
            int i12 = dk.a.f54292b;
            androidx.compose.ui.text.a0 k11 = aVar5.c(h11, i12).k();
            long m11 = aVar5.a(h11, i12).e().m(h11, yj.d.f76453b);
            androidx.compose.ui.c r02 = r0(textModel.a(), h11, 64);
            if (r02 == null) {
                cVar = PaddingKt.m(aVar3, 0.0f, e2.h.l(4), 0.0f, 0.0f, 13, null);
            } else {
                cVar = r02;
            }
            aVar2 = h11;
            TextKt.a(str, cVar, a19, 0, false, 0, 0, null, k11, m11, 0, h11, 6, 0, 1272);
            aVar2.S();
            aVar2.w();
            aVar2.S();
            aVar2.S();
            aVar2.S();
            aVar2.w();
            aVar2.S();
            aVar2.S();
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = aVar2.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.ui.bottomsheets.alertbottomsheet.AlertBottomSheet$AddTitle$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar6, int i13) {
                    AlertBottomSheet.this.K(textModel, aVar6, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar6, Integer num) {
                    b(aVar6, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public final void L(final ActionModel actionModel, final ActionModel actionModel2, androidx.compose.runtime.a aVar, final int i11) {
        float l11;
        float l12;
        float l13;
        float l14;
        float l15;
        float l16;
        androidx.compose.runtime.a h11 = aVar.h(1261189819);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(1261189819, i11, -1, "com.forsale.app.ui.bottomsheets.alertbottomsheet.AlertBottomSheet.AddTwoActionButtons (AlertBottomSheet.kt:233)");
        }
        h11.C(-492369756);
        Object D2 = h11.D();
        a.C0064a c0064a = androidx.compose.runtime.a.f7182a;
        if (D2 == c0064a.a()) {
            D2 = o0(actionModel.a());
            h11.u(D2);
        }
        h11.S();
        final String str = (String) D2;
        h11.C(-492369756);
        Object D3 = h11.D();
        if (D3 == c0064a.a()) {
            D3 = o0(actionModel2.a());
            h11.u(D3);
        }
        h11.S();
        final String str2 = (String) D3;
        c.a aVar2 = androidx.compose.ui.c.f7566a;
        ComposeViewPadding b11 = actionModel.b();
        if (b11 != null) {
            l11 = b11.c();
        } else {
            l11 = e2.h.l(24);
        }
        float f11 = l11;
        ComposeViewPadding b12 = actionModel.b();
        if (b12 != null) {
            l12 = b12.b();
        } else {
            l12 = e2.h.l(24);
        }
        androidx.compose.ui.c m11 = PaddingKt.m(aVar2, f11, 0.0f, l12, 0.0f, 10, null);
        h11.C(-483455358);
        Arrangement arrangement = Arrangement.f3698a;
        Arrangement.m h12 = arrangement.h();
        b.a aVar3 = v0.b.f74009a;
        a0 a11 = androidx.compose.foundation.layout.e.a(h12, aVar3.k(), h11, 0);
        h11.C(-1323940314);
        int a12 = e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
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
        g00.p<ComposeUiNode, Integer, p> b13 = companion.b();
        if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
            a14.u(Integer.valueOf(a12));
            a14.p(Integer.valueOf(a12), b13);
        }
        c11.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        f fVar = f.f74891a;
        O(h11, 8);
        ComposeViewPadding b14 = actionModel.b();
        if (b14 != null) {
            l13 = b14.d();
        } else {
            l13 = e2.h.l(24);
        }
        float f12 = l13;
        ComposeViewPadding b15 = actionModel.b();
        if (b15 != null) {
            l14 = b15.a();
        } else {
            l14 = e2.h.l(0);
        }
        androidx.compose.ui.c m12 = PaddingKt.m(aVar2, 0.0f, f12, 0.0f, l14, 5, null);
        h11.C(693286680);
        a0 a15 = androidx.compose.foundation.layout.o.a(arrangement.g(), aVar3.l(), h11, 0);
        h11.C(-1323940314);
        int a16 = e.a(h11, 0);
        k s12 = h11.s();
        g00.a<ComposeUiNode> a17 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c12 = LayoutKt.c(m12);
        if (!(h11.k() instanceof j0.d)) {
            e.c();
        }
        h11.I();
        if (h11.f()) {
            h11.y(a17);
        } else {
            h11.t();
        }
        androidx.compose.runtime.a a18 = Updater.a(h11);
        Updater.c(a18, a15, companion.e());
        Updater.c(a18, s12, companion.g());
        g00.p<ComposeUiNode, Integer, p> b16 = companion.b();
        if (a18.f() || !o.d(a18.D(), Integer.valueOf(a16))) {
            a18.u(Integer.valueOf(a16));
            a18.p(Integer.valueOf(a16), b16);
        }
        c12.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        u uVar = u.f74924a;
        ButtonsKt.j(new g00.a<p>() { // from class: com.forsale.app.ui.bottomsheets.alertbottomsheet.AlertBottomSheet$AddTwoActionButtons$1$1$1
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
                g00.a aVar4;
                OneShotEventHandler.d(AlertBottomSheet.this.t().y0(), null, 1, null);
                aVar4 = AlertBottomSheet.this.f37936z;
                if (aVar4 != null) {
                    aVar4.invoke();
                }
            }
        }, SizeKt.h(aVar2, 0.0f, 1, null), null, null, false, false, null, r0.b.b(h11, 1151998255, true, new q<t, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.ui.bottomsheets.alertbottomsheet.AlertBottomSheet$AddTwoActionButtons$1$1$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            public final void b(t PrimaryButton, androidx.compose.runtime.a aVar4, int i12) {
                o.i(PrimaryButton, "$this$PrimaryButton");
                if ((i12 & 81) == 16 && aVar4.i()) {
                    aVar4.L();
                    return;
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(1151998255, i12, -1, "com.forsale.app.ui.bottomsheets.alertbottomsheet.AlertBottomSheet.AddTwoActionButtons.<anonymous>.<anonymous>.<anonymous> (AlertBottomSheet.kt:252)");
                }
                TextKt.a(str, null, 0, 0, false, 0, 0, null, null, 0L, 0, aVar4, 6, 0, 2046);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }

            @Override // g00.q
            public /* bridge */ /* synthetic */ p invoke(t tVar, androidx.compose.runtime.a aVar4, Integer num) {
                b(tVar, aVar4, num.intValue());
                return p.f75480a;
            }
        }), h11, 12582960, 124);
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        androidx.compose.ui.c r02 = r0(actionModel2.b(), h11, 64);
        if (r02 == null) {
            ComposeViewPadding b17 = actionModel.b();
            if (b17 != null) {
                l15 = b17.d();
            } else {
                l15 = e2.h.l(8);
            }
            float f13 = l15;
            ComposeViewPadding b18 = actionModel.b();
            if (b18 != null) {
                l16 = b18.a();
            } else {
                l16 = e2.h.l(24);
            }
            r02 = PaddingKt.m(aVar2, 0.0f, f13, 0.0f, l16, 5, null);
        }
        h11.C(693286680);
        a0 a19 = androidx.compose.foundation.layout.o.a(arrangement.g(), aVar3.l(), h11, 0);
        h11.C(-1323940314);
        int a21 = e.a(h11, 0);
        k s13 = h11.s();
        g00.a<ComposeUiNode> a22 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c13 = LayoutKt.c(r02);
        if (!(h11.k() instanceof j0.d)) {
            e.c();
        }
        h11.I();
        if (h11.f()) {
            h11.y(a22);
        } else {
            h11.t();
        }
        androidx.compose.runtime.a a23 = Updater.a(h11);
        Updater.c(a23, a19, companion.e());
        Updater.c(a23, s13, companion.g());
        g00.p<ComposeUiNode, Integer, p> b19 = companion.b();
        if (a23.f() || !o.d(a23.D(), Integer.valueOf(a21))) {
            a23.u(Integer.valueOf(a21));
            a23.p(Integer.valueOf(a21), b19);
        }
        c13.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        ButtonsKt.e(new g00.a<p>() { // from class: com.forsale.app.ui.bottomsheets.alertbottomsheet.AlertBottomSheet$AddTwoActionButtons$1$2$1
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
                g00.a aVar4;
                OneShotEventHandler.d(AlertBottomSheet.this.t().y0(), null, 1, null);
                aVar4 = AlertBottomSheet.this.A;
                if (aVar4 != null) {
                    aVar4.invoke();
                }
            }
        }, SizeKt.h(aVar2, 0.0f, 1, null), null, false, false, null, r0.b.b(h11, 1545207380, true, new q<t, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.ui.bottomsheets.alertbottomsheet.AlertBottomSheet$AddTwoActionButtons$1$2$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            public final void b(t GhostButton, androidx.compose.runtime.a aVar4, int i12) {
                o.i(GhostButton, "$this$GhostButton");
                if ((i12 & 81) == 16 && aVar4.i()) {
                    aVar4.L();
                    return;
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(1545207380, i12, -1, "com.forsale.app.ui.bottomsheets.alertbottomsheet.AlertBottomSheet.AddTwoActionButtons.<anonymous>.<anonymous>.<anonymous> (AlertBottomSheet.kt:267)");
                }
                TextKt.a(str2, null, 0, 0, false, 0, 0, null, null, 0L, 0, aVar4, 6, 0, 2046);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }

            @Override // g00.q
            public /* bridge */ /* synthetic */ p invoke(t tVar, androidx.compose.runtime.a aVar4, Integer num) {
                b(tVar, aVar4, num.intValue());
                return p.f75480a;
            }
        }), h11, 1572912, 60);
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
        d1 l17 = h11.l();
        if (l17 != null) {
            l17.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.ui.bottomsheets.alertbottomsheet.AlertBottomSheet$AddTwoActionButtons$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar4, int i12) {
                    AlertBottomSheet.this.L(actionModel, actionModel2, aVar4, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public final void M(androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.runtime.a h11 = aVar.h(1228337676);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(1228337676, i11, -1, "com.forsale.app.ui.bottomsheets.alertbottomsheet.AlertBottomSheet.Container (AlertBottomSheet.kt:85)");
        }
        androidx.compose.ui.c h12 = SizeKt.h(androidx.compose.ui.c.f7566a, 0.0f, 1, null);
        h11.C(-483455358);
        a0 a11 = androidx.compose.foundation.layout.e.a(Arrangement.f3698a.h(), v0.b.f74009a.k(), h11, 0);
        h11.C(-1323940314);
        int a12 = e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(h12);
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
        f fVar = f.f74891a;
        AlertModel l02 = l0();
        h11.C(2101204671);
        if (l02 != null) {
            ImageModel f11 = l02.f();
            h11.C(259024637);
            if (f11 != null) {
                G(f11, l02.h(), h11, AdRequest.MAX_CONTENT_URL_LENGTH);
            }
            h11.S();
            TextModel g11 = l02.g();
            h11.C(259024737);
            if (g11 != null) {
                K(g11, h11, 72);
            }
            h11.S();
            TextModel d11 = l02.d();
            h11.C(259024811);
            if (d11 != null) {
                D(d11, h11, 72);
            }
            h11.S();
            TextModelCustom c12 = l02.c();
            h11.C(259024909);
            if (c12 != null) {
                C(c12, h11, 72);
            }
            h11.S();
            q0(h11, 8);
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
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.ui.bottomsheets.alertbottomsheet.AlertBottomSheet$Container$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i12) {
                    AlertBottomSheet.this.M(aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    private final void k0() {
        OneShotEventHandler<p> y02 = t().y0();
        androidx.lifecycle.s viewLifecycleOwner = getViewLifecycleOwner();
        o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        y02.h(viewLifecycleOwner, new c());
    }

    public final AlertModel l0() {
        return (AlertModel) this.f37934x.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String o0(com.forsale.app.utils.itemutils.TextHolder r9) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.ui.bottomsheets.alertbottomsheet.AlertBottomSheet.o0(com.forsale.app.utils.itemutils.TextHolder):java.lang.String");
    }

    public final void q0(androidx.compose.runtime.a aVar, final int i11) {
        ActionModel actionModel;
        androidx.compose.runtime.a h11 = aVar.h(56214840);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(56214840, i11, -1, "com.forsale.app.ui.bottomsheets.alertbottomsheet.AlertBottomSheet.handleActions (AlertBottomSheet.kt:222)");
        }
        AlertActionTypes w02 = t().w0();
        if (w02 != null) {
            int i12 = b.f37980a[w02.ordinal()];
            ActionModel actionModel2 = null;
            if (i12 != 1) {
                if (i12 != 2) {
                    h11.C(-529530944);
                    h11.S();
                } else {
                    h11.C(398560284);
                    AlertModel l02 = l0();
                    if (l02 != null) {
                        actionModel2 = l02.a();
                    }
                    o.f(actionModel2);
                    I(actionModel2, h11, 72);
                    h11.S();
                }
            } else {
                h11.C(398560167);
                AlertModel l03 = l0();
                if (l03 != null) {
                    actionModel = l03.a();
                } else {
                    actionModel = null;
                }
                o.f(actionModel);
                AlertModel l04 = l0();
                if (l04 != null) {
                    actionModel2 = l04.b();
                }
                o.f(actionModel2);
                L(actionModel, actionModel2, h11, 584);
                h11.S();
            }
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.ui.bottomsheets.alertbottomsheet.AlertBottomSheet$handleActions$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i13) {
                    AlertBottomSheet.this.q0(aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public final void E(final String str, androidx.compose.runtime.a aVar, final int i11) {
        int i12;
        androidx.compose.runtime.a aVar2;
        int i13;
        androidx.compose.runtime.a h11 = aVar.h(-827287118);
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
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-827287118, i11, -1, "com.forsale.app.ui.bottomsheets.alertbottomsheet.AlertBottomSheet.AddErrors (AlertBottomSheet.kt:190)");
            }
            if (str == null) {
                aVar2 = h11;
            } else {
                h11.C(693286680);
                c.a aVar3 = androidx.compose.ui.c.f7566a;
                a0 a11 = androidx.compose.foundation.layout.o.a(Arrangement.f3698a.g(), v0.b.f74009a.l(), h11, 0);
                h11.C(-1323940314);
                int a12 = e.a(h11, 0);
                k s11 = h11.s();
                ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                g00.a<ComposeUiNode> a13 = companion.a();
                q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(aVar3);
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
                int a15 = b2.f.f16081b.a();
                dk.a aVar4 = dk.a.f54291a;
                int i14 = dk.a.f54292b;
                float f11 = 32;
                aVar2 = h11;
                TextKt.a(str, PaddingKt.m(aVar3, e2.h.l(f11), e2.h.l(4), e2.h.l(f11), 0.0f, 8, null), a15, 0, false, 0, 0, null, aVar4.c(h11, i14).b(), aVar4.a(h11, i14).d().i(h11, yj.d.f76453b), 0, h11, 0, 0, 1272);
                aVar2.S();
                aVar2.w();
                aVar2.S();
                aVar2.S();
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = aVar2.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.ui.bottomsheets.alertbottomsheet.AlertBottomSheet$AddErrors$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar5, int i15) {
                    AlertBottomSheet.this.E(str, aVar5, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar5, Integer num) {
                    b(aVar5, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public final void H(final TextModel textModel, androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.ui.c cVar;
        androidx.compose.runtime.a aVar2;
        o.i(textModel, "textModel");
        androidx.compose.runtime.a h11 = aVar.h(-478013095);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-478013095, i11, -1, "com.forsale.app.ui.bottomsheets.alertbottomsheet.AlertBottomSheet.AddNotes (AlertBottomSheet.kt:205)");
        }
        TextHolder c11 = textModel.c();
        if (c11 == null) {
            aVar2 = h11;
        } else {
            h11.C(-492369756);
            Object D2 = h11.D();
            if (D2 == androidx.compose.runtime.a.f7182a.a()) {
                D2 = o0(c11);
                h11.u(D2);
            }
            h11.S();
            String str = (String) D2;
            h11.C(693286680);
            c.a aVar3 = androidx.compose.ui.c.f7566a;
            a0 a11 = androidx.compose.foundation.layout.o.a(Arrangement.f3698a.g(), v0.b.f74009a.l(), h11, 0);
            h11.C(-1323940314);
            int a12 = e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c12 = LayoutKt.c(aVar3);
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
            c12.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            u uVar = u.f74924a;
            int a15 = b2.f.f16081b.a();
            dk.a aVar4 = dk.a.f54291a;
            int i12 = dk.a.f54292b;
            androidx.compose.ui.text.a0 b12 = aVar4.c(h11, i12).b();
            long j11 = aVar4.a(h11, i12).e().j(h11, yj.d.f76453b);
            androidx.compose.ui.c r02 = r0(textModel.a(), h11, 64);
            if (r02 == null) {
                float f11 = 32;
                cVar = PaddingKt.m(aVar3, e2.h.l(f11), e2.h.l(4), e2.h.l(f11), 0.0f, 8, null);
            } else {
                cVar = r02;
            }
            aVar2 = h11;
            TextKt.a(str, cVar, a15, 0, false, 0, 0, null, b12, j11, 0, aVar2, 6, 0, 1272);
            aVar2.S();
            aVar2.w();
            aVar2.S();
            aVar2.S();
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = aVar2.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.ui.bottomsheets.alertbottomsheet.AlertBottomSheet$AddNotes$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar5, int i13) {
                    AlertBottomSheet.this.H(textModel, aVar5, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar5, Integer num) {
                    b(aVar5, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public final void J(final TextModel textModel, androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.ui.c cVar;
        androidx.compose.runtime.a aVar2;
        o.i(textModel, "textModel");
        androidx.compose.runtime.a h11 = aVar.h(161737174);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(161737174, i11, -1, "com.forsale.app.ui.bottomsheets.alertbottomsheet.AlertBottomSheet.AddSubTitle (AlertBottomSheet.kt:173)");
        }
        TextHolder c11 = textModel.c();
        if (c11 == null) {
            aVar2 = h11;
        } else {
            h11.C(-492369756);
            Object D2 = h11.D();
            if (D2 == androidx.compose.runtime.a.f7182a.a()) {
                D2 = o0(c11);
                h11.u(D2);
            }
            h11.S();
            String str = (String) D2;
            h11.C(693286680);
            c.a aVar3 = androidx.compose.ui.c.f7566a;
            a0 a11 = androidx.compose.foundation.layout.o.a(Arrangement.f3698a.g(), v0.b.f74009a.l(), h11, 0);
            h11.C(-1323940314);
            int a12 = e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c12 = LayoutKt.c(aVar3);
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
            c12.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            u uVar = u.f74924a;
            int a15 = b2.f.f16081b.a();
            dk.a aVar4 = dk.a.f54291a;
            int i12 = dk.a.f54292b;
            androidx.compose.ui.text.a0 b12 = aVar4.c(h11, i12).b();
            long j11 = aVar4.a(h11, i12).e().j(h11, yj.d.f76453b);
            androidx.compose.ui.c r02 = r0(textModel.a(), h11, 64);
            if (r02 == null) {
                cVar = PaddingKt.m(aVar3, 0.0f, e2.h.l(4), 0.0f, 0.0f, 13, null);
            } else {
                cVar = r02;
            }
            aVar2 = h11;
            TextKt.a(str, cVar, a15, 0, false, 0, 0, null, b12, j11, 0, aVar2, 6, 0, 1272);
            aVar2.S();
            aVar2.w();
            aVar2.S();
            aVar2.S();
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = aVar2.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.ui.bottomsheets.alertbottomsheet.AlertBottomSheet$AddSubTitle$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar5, int i13) {
                    AlertBottomSheet.this.J(textModel, aVar5, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar5, Integer num) {
                    b(aVar5, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public final void O(androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.runtime.a h11 = aVar.h(-1594145789);
        if ((i11 & 1) == 0 && h11.i()) {
            h11.L();
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-1594145789, i11, -1, "com.forsale.app.ui.bottomsheets.alertbottomsheet.AlertBottomSheet.DividerCustom (AlertBottomSheet.kt:323)");
            }
            DividerKt.a(null, dk.a.f54291a.a(h11, dk.a.f54292b).e().d(h11, yj.d.f76453b), e2.h.l(1), 0.0f, h11, 384, 9);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.ui.bottomsheets.alertbottomsheet.AlertBottomSheet$DividerCustom$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i12) {
                    AlertBottomSheet.this.O(aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    @Override // w9.b, androidx.fragment.app.j
    public int getTheme() {
        return z0.f70791a;
    }

    public final b.a m0() {
        b.a aVar = this.B;
        if (aVar != null) {
            return aVar;
        }
        o.w("factory");
        return null;
    }

    @Override // androidx.fragment.app.j, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        o.i(dialog, "dialog");
        super.onDismiss(dialog);
        t().v0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        CrashlyticsUtilsKt.b("alertBottomSheet", null, 2, null);
    }

    @Override // w9.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.i(view, "view");
        super.onViewCreated(view, bundle);
        k0();
        ((o1) r()).O.setContent(r0.b.c(1162707282, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.ui.bottomsheets.alertbottomsheet.AlertBottomSheet$onViewCreated$1
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
                    androidx.compose.runtime.c.U(1162707282, i11, -1, "com.forsale.app.ui.bottomsheets.alertbottomsheet.AlertBottomSheet.onViewCreated.<anonymous> (AlertBottomSheet.kt:65)");
                }
                final AlertBottomSheet alertBottomSheet = AlertBottomSheet.this;
                ThemeKt.a(null, null, r0.b.b(aVar, 234227497, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.ui.bottomsheets.alertbottomsheet.AlertBottomSheet$onViewCreated$1.1
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i12) {
                        if ((i12 & 11) == 2 && aVar2.i()) {
                            aVar2.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(234227497, i12, -1, "com.forsale.app.ui.bottomsheets.alertbottomsheet.AlertBottomSheet.onViewCreated.<anonymous>.<anonymous> (AlertBottomSheet.kt:65)");
                        }
                        AlertBottomSheet.this.M(aVar2, 8);
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
    }

    @Override // w9.b
    /* renamed from: p0 */
    public com.forsale.app.ui.bottomsheets.alertbottomsheet.b t() {
        return (com.forsale.app.ui.bottomsheets.alertbottomsheet.b) this.C.getValue();
    }

    public final androidx.compose.ui.c r0(ComposeViewPadding composeViewPadding, androidx.compose.runtime.a aVar, int i11) {
        androidx.compose.ui.c cVar;
        aVar.C(-1373589981);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-1373589981, i11, -1, "com.forsale.app.ui.bottomsheets.alertbottomsheet.AlertBottomSheet.mapPadding (AlertBottomSheet.kt:329)");
        }
        if (composeViewPadding != null) {
            cVar = PaddingKt.l(androidx.compose.ui.c.f7566a, composeViewPadding.c(), composeViewPadding.d(), composeViewPadding.b(), composeViewPadding.a());
        } else {
            cVar = null;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        aVar.S();
        return cVar;
    }

    @Override // w9.b
    protected int s() {
        return this.f37933j;
    }
}
