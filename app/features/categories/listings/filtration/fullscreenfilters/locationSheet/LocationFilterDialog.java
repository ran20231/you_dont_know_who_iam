package com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.z;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.input.v;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.t0;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.a;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.filterModels.FilterScreenTypes;
import com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel;
import com.forsale.app.features.categories.listings.filtration.views.SheetsViewKt;
import com.forsale.app.utils.LifeCycleUtilsKt;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7;
import com.forsale.app.utils.analytics.listingfiltration.FilterPlaces;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.inputs.InputsKt;
import com.forsale.designSystem.theme.ThemeKt;
import fc.c;
import g00.l;
import g00.q;
import j0.d1;
import j0.n1;
import j0.v0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.r;
import kotlin.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import p1.g;
import t9.y0;
import t9.z0;
import wz.h;
import wz.p;
/* compiled from: LocationFilterDialog.kt */
/* loaded from: classes2.dex */
public final class LocationFilterDialog extends com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.a {

    /* renamed from: j  reason: collision with root package name */
    public static final a f29794j = new a(null);

    /* renamed from: x  reason: collision with root package name */
    public static final int f29795x = 8;

    /* renamed from: f  reason: collision with root package name */
    private l<? super c, p> f29796f;

    /* renamed from: g  reason: collision with root package name */
    private a.b f29797g;

    /* renamed from: h  reason: collision with root package name */
    public LocationFilterViewModel.b f29798h;

    /* renamed from: i  reason: collision with root package name */
    private final h f29799i;

    /* compiled from: LocationFilterDialog.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(FragmentManager fragmentManager, a.b filterCapsule, l<? super c, p> onActionDone) {
            o.i(fragmentManager, "fragmentManager");
            o.i(filterCapsule, "filterCapsule");
            o.i(onActionDone, "onActionDone");
            LocationFilterDialog locationFilterDialog = new LocationFilterDialog();
            locationFilterDialog.f29797g = filterCapsule;
            locationFilterDialog.f29796f = onActionDone;
            locationFilterDialog.show(fragmentManager, "FullScreenLocationFilterDialogFragment");
        }
    }

    public LocationFilterDialog() {
        h b11;
        g00.a<t0.b> aVar = new g00.a<t0.b>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterDialog$special$$inlined$assistedViewModel$1

            /* compiled from: ViewModelHiltExtension.kt */
            /* loaded from: classes2.dex */
            public static final class a extends androidx.lifecycle.a {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ LocationFilterDialog f29802f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Fragment fragment, Bundle bundle, LocationFilterDialog locationFilterDialog) {
                    super(fragment, bundle);
                    this.f29802f = locationFilterDialog;
                }

                @Override // androidx.lifecycle.a
                protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                    a.b bVar;
                    o.i(key, "key");
                    o.i(modelClass, "modelClass");
                    o.i(handle, "handle");
                    LocationFilterViewModel.b B = this.f29802f.B();
                    bVar = this.f29802f.f29797g;
                    o.f(bVar);
                    LocationFilterViewModel a11 = B.a(bVar);
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
        this.f29799i = FragmentViewModelLazyKt.b(this, s.b(LocationFilterViewModel.class), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6(b11), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7(null, b11), aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LocationFilterViewModel C() {
        return (LocationFilterViewModel) this.f29799i.getValue();
    }

    private static final boolean r(n1<Boolean> n1Var) {
        return n1Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String s(n1<String> n1Var) {
        return n1Var.getValue();
    }

    public final LocationFilterViewModel.b B() {
        LocationFilterViewModel.b bVar = this.f29798h;
        if (bVar != null) {
            return bVar;
        }
        o.w("factory");
        return null;
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
        composeView.setContent(r0.b.c(-1404221560, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterDialog$onCreateView$1$1
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
                    androidx.compose.runtime.c.U(-1404221560, i11, -1, "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterDialog.onCreateView.<anonymous>.<anonymous> (LocationFilterDialog.kt:62)");
                }
                final LocationFilterDialog locationFilterDialog = LocationFilterDialog.this;
                ThemeKt.a(null, null, r0.b.b(aVar, -1788055023, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterDialog$onCreateView$1$1.1
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i12) {
                        if ((i12 & 11) == 2 && aVar2.i()) {
                            aVar2.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(-1788055023, i12, -1, "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterDialog.onCreateView.<anonymous>.<anonymous>.<anonymous> (LocationFilterDialog.kt:63)");
                        }
                        LocationFilterDialog.this.q(aVar2, 8);
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

    @Override // androidx.fragment.app.j, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        l<? super c, p> lVar;
        List n11;
        o.i(dialog, "dialog");
        if (this.f29797g != null && C().P0().getValue().booleanValue() && (lVar = this.f29796f) != null) {
            n11 = r.n();
            lVar.invoke(new c.a(n11, null, 2, null));
        }
        super.onDismiss(dialog);
    }

    @Override // androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        FilterPlaces filterPlaces;
        fc.a a11;
        FilterScreenTypes.NewScreen d11;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            a.b bVar = this.f29797g;
            if (bVar != null && (a11 = bVar.a()) != null && (d11 = a11.d()) != null) {
                filterPlaces = d11.c();
            } else {
                filterPlaces = null;
            }
            if (filterPlaces == FilterPlaces.ALL_FILTERS) {
                window.setWindowAnimations(z0.f70796f);
            } else {
                window.setWindowAnimations(z0.f70795e);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.i(view, "view");
        super.onViewCreated(view, bundle);
        if (this.f29797g == null) {
            dismiss();
        } else {
            LifeCycleUtilsKt.b(this, new LocationFilterDialog$onViewCreated$1(this, null));
        }
    }

    public final void q(androidx.compose.runtime.a aVar, final int i11) {
        int i12;
        androidx.compose.runtime.a h11 = aVar.h(-733816089);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-733816089, i11, -1, "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterDialog.Filters (LocationFilterDialog.kt:107)");
        }
        n1 a11 = z.a(C().Q0(), Boolean.FALSE, null, h11, 56, 2);
        h11.C(-492369756);
        Object D = h11.D();
        if (D == androidx.compose.runtime.a.f7182a.a()) {
            D = c0.e("", null, 2, null);
            h11.u(D);
        }
        h11.S();
        final j0.k0 k0Var = (j0.k0) D;
        final z0.d dVar = (z0.d) h11.q(CompositionLocalsKt.f());
        if (C().J0().a().d().c() == FilterPlaces.ALL_FILTERS) {
            i12 = sj.d.f68672i;
        } else {
            i12 = sj.d.f68681r;
        }
        int i13 = i12;
        final n1 a12 = z.a(C().M0(), "", null, h11, 56, 2);
        SheetsViewKt.c(C().J0().a().a(), r(a11), i13, new g00.a<p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterDialog$Filters$1
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
                LocationFilterViewModel C;
                C = LocationFilterDialog.this.C();
                C.T0();
            }
        }, new g00.a<p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterDialog$Filters$2
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
                LocationFilterDialog.this.dismiss();
            }
        }, new g00.a<p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterDialog$Filters$3
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
                LocationFilterViewModel C;
                C = LocationFilterDialog.this.C();
                C.E0();
            }
        }, r0.b.b(h11, -93407729, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterDialog$Filters$4
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void b(androidx.compose.runtime.a aVar2, int i14) {
                if ((i14 & 11) == 2 && aVar2.i()) {
                    aVar2.L();
                    return;
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(-93407729, i14, -1, "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterDialog.Filters.<anonymous> (LocationFilterDialog.kt:128)");
                }
                float f11 = 16;
                float f12 = 8;
                androidx.compose.ui.c l11 = PaddingKt.l(SizeKt.h(androidx.compose.ui.c.f7566a, 0.0f, 1, null), e2.h.l(f11), e2.h.l(f12), e2.h.l(f11), e2.h.l(f12));
                String value = k0Var.getValue();
                androidx.compose.foundation.text.c cVar = new androidx.compose.foundation.text.c(0, false, 0, v.f9508b.b(), null, 23, null);
                final z0.d dVar2 = dVar;
                androidx.compose.foundation.text.b bVar = new androidx.compose.foundation.text.b(new l<d0.h, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterDialog$Filters$4.1
                    {
                        super(1);
                    }

                    public final void b(d0.h $receiver) {
                        o.i($receiver, "$this$$receiver");
                        z0.d.j(z0.d.this, false, 1, null);
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ p invoke(d0.h hVar) {
                        b(hVar);
                        return p.f75480a;
                    }
                }, null, null, null, null, null, 62, null);
                final j0.k0<String> k0Var2 = k0Var;
                final LocationFilterDialog locationFilterDialog = this;
                l<String, p> lVar = new l<String, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterDialog$Filters$4.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void b(String it2) {
                        LocationFilterViewModel C;
                        o.i(it2, "it");
                        k0Var2.setValue(it2);
                        C = locationFilterDialog.C();
                        C.Y0(it2);
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ p invoke(String str) {
                        b(str);
                        return p.f75480a;
                    }
                };
                final n1<String> n1Var = a12;
                InputsKt.i(l11, value, lVar, null, false, 0, 0, r0.b.b(aVar2, 339080239, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterDialog$Filters$4.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar3, int i15) {
                        String s11;
                        String c11;
                        if ((i15 & 11) == 2 && aVar3.i()) {
                            aVar3.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(339080239, i15, -1, "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterDialog.Filters.<anonymous>.<anonymous> (LocationFilterDialog.kt:131)");
                        }
                        s11 = LocationFilterDialog.s(n1Var);
                        aVar3.C(-437828640);
                        if (s11 == null) {
                            c11 = null;
                        } else {
                            c11 = g.c(y0.f70789zd, new Object[]{s11}, aVar3, 64);
                        }
                        aVar3.S();
                        if (c11 == null) {
                            c11 = "";
                        }
                        TextKt.a(c11, null, 0, 0, false, 0, 0, null, null, 0L, 0, aVar3, 0, 0, 2046);
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                        b(aVar3, num.intValue());
                        return p.f75480a;
                    }
                }), dVar, null, null, cVar, bVar, null, 20, aVar2, 146800640, 24624, 9848);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                b(aVar2, num.intValue());
                return p.f75480a;
            }
        }), r0.b.b(h11, -1756624987, true, new q<androidx.compose.ui.c, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterDialog$Filters$5
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(3);
            }

            public final void b(androidx.compose.ui.c it2, androidx.compose.runtime.a aVar2, int i14) {
                LocationFilterViewModel C;
                int i15;
                o.i(it2, "it");
                if ((i14 & 14) == 0) {
                    if (aVar2.T(it2)) {
                        i15 = 4;
                    } else {
                        i15 = 2;
                    }
                    i14 |= i15;
                }
                if ((i14 & 91) == 18 && aVar2.i()) {
                    aVar2.L();
                    return;
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(-1756624987, i14, -1, "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterDialog.Filters.<anonymous> (LocationFilterDialog.kt:140)");
                }
                C = LocationFilterDialog.this.C();
                LocationFilterBSViewKt.a(it2, C, aVar2, (i14 & 14) | 64);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }

            @Override // g00.q
            public /* bridge */ /* synthetic */ p invoke(androidx.compose.ui.c cVar, androidx.compose.runtime.a aVar2, Integer num) {
                b(cVar, aVar2, num.intValue());
                return p.f75480a;
            }
        }), h11, 14155776, 0);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterDialog$Filters$6
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i14) {
                    LocationFilterDialog.this.q(aVar2, v0.a(i11 | 1));
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
