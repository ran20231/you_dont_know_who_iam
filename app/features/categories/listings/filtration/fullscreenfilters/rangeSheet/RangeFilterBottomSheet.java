package com.forsale.app.features.categories.listings.filtration.fullscreenfilters.rangeSheet;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.z;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.t0;
import com.forsale.app.datalayer.database.ExtraAttributeEntity;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.a;
import com.forsale.app.features.categories.listings.filtration.fullscreenfilters.rangeSheet.RangeFilterViewModel;
import com.forsale.app.features.categories.listings.filtration.views.CommonViewsKt;
import com.forsale.app.features.categories.listings.filtration.views.SheetsViewKt;
import com.forsale.app.utils.LifeCycleUtilsKt;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7;
import com.forsale.app.utils.analytics.listingfiltration.FilterPlaces;
import com.forsale.designSystem.theme.ThemeKt;
import com.google.android.gms.common.api.Api;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import fc.c;
import g00.l;
import g00.q;
import j0.d1;
import j0.n1;
import j0.v0;
import kotlin.LazyThreadSafetyMode;
import kotlin.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import t9.z0;
import wz.h;
import wz.p;
/* compiled from: RangeFilterBottomSheet.kt */
/* loaded from: classes2.dex */
public final class RangeFilterBottomSheet extends com.forsale.app.features.categories.listings.filtration.fullscreenfilters.rangeSheet.a {

    /* renamed from: x  reason: collision with root package name */
    public static final a f29900x = new a(null);

    /* renamed from: y  reason: collision with root package name */
    public static final int f29901y = 8;

    /* renamed from: g  reason: collision with root package name */
    private l<? super c, p> f29902g;

    /* renamed from: h  reason: collision with root package name */
    private a.c f29903h;

    /* renamed from: i  reason: collision with root package name */
    public RangeFilterViewModel.b f29904i;

    /* renamed from: j  reason: collision with root package name */
    private final h f29905j;

    /* compiled from: RangeFilterBottomSheet.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(FragmentManager fragmentManager, a.c filterCapsule, l<? super c, p> onActionDone) {
            o.i(fragmentManager, "fragmentManager");
            o.i(filterCapsule, "filterCapsule");
            o.i(onActionDone, "onActionDone");
            RangeFilterBottomSheet rangeFilterBottomSheet = new RangeFilterBottomSheet();
            rangeFilterBottomSheet.f29903h = filterCapsule;
            rangeFilterBottomSheet.f29902g = onActionDone;
            rangeFilterBottomSheet.show(fragmentManager, "RangeFilterDialogFragment");
        }
    }

    public RangeFilterBottomSheet() {
        h b11;
        g00.a<t0.b> aVar = new g00.a<t0.b>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.rangeSheet.RangeFilterBottomSheet$special$$inlined$assistedViewModel$1

            /* compiled from: ViewModelHiltExtension.kt */
            /* loaded from: classes2.dex */
            public static final class a extends androidx.lifecycle.a {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ RangeFilterBottomSheet f29908f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Fragment fragment, Bundle bundle, RangeFilterBottomSheet rangeFilterBottomSheet) {
                    super(fragment, bundle);
                    this.f29908f = rangeFilterBottomSheet;
                }

                @Override // androidx.lifecycle.a
                protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                    a.c cVar;
                    o.i(key, "key");
                    o.i(modelClass, "modelClass");
                    o.i(handle, "handle");
                    RangeFilterViewModel.b G = this.f29908f.G();
                    cVar = this.f29908f.f29903h;
                    o.f(cVar);
                    RangeFilterViewModel a11 = G.a(cVar);
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
        this.f29905j = FragmentViewModelLazyKt.b(this, s.b(RangeFilterViewModel.class), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6(b11), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7(null, b11), aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RangeFilterViewModel H() {
        return (RangeFilterViewModel) this.f29905j.getValue();
    }

    private static final int x(n1<Integer> n1Var) {
        return n1Var.getValue().intValue();
    }

    private static final int y(n1<Integer> n1Var) {
        return n1Var.getValue().intValue();
    }

    private static final ExtraAttributeEntity.LocalUnit z(n1<ExtraAttributeEntity.LocalUnit> n1Var) {
        return n1Var.getValue();
    }

    public final RangeFilterViewModel.b G() {
        RangeFilterViewModel.b bVar = this.f29904i;
        if (bVar != null) {
            return bVar;
        }
        o.w("factory");
        return null;
    }

    @Override // androidx.fragment.app.j
    public int getTheme() {
        return z0.f70803m;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.i(inflater, "inflater");
        Context requireContext = requireContext();
        o.h(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(r0.b.c(379500908, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.rangeSheet.RangeFilterBottomSheet$onCreateView$1$1
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
                    androidx.compose.runtime.c.U(379500908, i11, -1, "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.rangeSheet.RangeFilterBottomSheet.onCreateView.<anonymous>.<anonymous> (RangeFilterBottomSheet.kt:50)");
                }
                final RangeFilterBottomSheet rangeFilterBottomSheet = RangeFilterBottomSheet.this;
                ThemeKt.a(null, null, r0.b.b(aVar, 1365565443, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.rangeSheet.RangeFilterBottomSheet$onCreateView$1$1.1
                    {
                        super(2);
                    }

                    private static final boolean c(n1<Boolean> n1Var) {
                        return n1Var.getValue().booleanValue();
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i12) {
                        RangeFilterViewModel H;
                        RangeFilterViewModel H2;
                        int i13;
                        RangeFilterViewModel H3;
                        if ((i12 & 11) == 2 && aVar2.i()) {
                            aVar2.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(1365565443, i12, -1, "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.rangeSheet.RangeFilterBottomSheet.onCreateView.<anonymous>.<anonymous>.<anonymous> (RangeFilterBottomSheet.kt:51)");
                        }
                        H = RangeFilterBottomSheet.this.H();
                        n1 a11 = z.a(H.E0(), Boolean.FALSE, null, aVar2, 56, 2);
                        H2 = RangeFilterBottomSheet.this.H();
                        if (H2.y0().a().d().c() == FilterPlaces.ALL_FILTERS) {
                            i13 = sj.d.f68672i;
                        } else {
                            i13 = sj.d.f68681r;
                        }
                        int i14 = i13;
                        H3 = RangeFilterBottomSheet.this.H();
                        String a12 = H3.y0().a().a();
                        boolean c11 = c(a11);
                        final RangeFilterBottomSheet rangeFilterBottomSheet2 = RangeFilterBottomSheet.this;
                        g00.a<p> aVar3 = new g00.a<p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.rangeSheet.RangeFilterBottomSheet.onCreateView.1.1.1.1
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
                                RangeFilterViewModel H4;
                                H4 = RangeFilterBottomSheet.this.H();
                                H4.I0();
                            }
                        };
                        final RangeFilterBottomSheet rangeFilterBottomSheet3 = RangeFilterBottomSheet.this;
                        g00.a<p> aVar4 = new g00.a<p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.rangeSheet.RangeFilterBottomSheet.onCreateView.1.1.1.2
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
                                RangeFilterBottomSheet.this.dismiss();
                            }
                        };
                        final RangeFilterBottomSheet rangeFilterBottomSheet4 = RangeFilterBottomSheet.this;
                        g00.a<p> aVar5 = new g00.a<p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.rangeSheet.RangeFilterBottomSheet.onCreateView.1.1.1.3
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
                                RangeFilterViewModel H4;
                                H4 = RangeFilterBottomSheet.this.H();
                                H4.w0();
                            }
                        };
                        final RangeFilterBottomSheet rangeFilterBottomSheet5 = RangeFilterBottomSheet.this;
                        SheetsViewKt.b(a12, c11, i14, aVar3, aVar4, aVar5, null, r0.b.b(aVar2, 2141661878, true, new q<androidx.compose.ui.c, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.rangeSheet.RangeFilterBottomSheet.onCreateView.1.1.1.4
                            {
                                super(3);
                            }

                            public final void b(androidx.compose.ui.c it2, androidx.compose.runtime.a aVar6, int i15) {
                                int i16;
                                o.i(it2, "it");
                                if ((i15 & 14) == 0) {
                                    if (aVar6.T(it2)) {
                                        i16 = 4;
                                    } else {
                                        i16 = 2;
                                    }
                                    i15 |= i16;
                                }
                                if ((i15 & 91) == 18 && aVar6.i()) {
                                    aVar6.L();
                                    return;
                                }
                                if (androidx.compose.runtime.c.I()) {
                                    androidx.compose.runtime.c.U(2141661878, i15, -1, "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.rangeSheet.RangeFilterBottomSheet.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RangeFilterBottomSheet.kt:66)");
                                }
                                RangeFilterBottomSheet.this.w(it2, aVar6, (i15 & 14) | 64);
                                if (androidx.compose.runtime.c.I()) {
                                    androidx.compose.runtime.c.T();
                                }
                            }

                            @Override // g00.q
                            public /* bridge */ /* synthetic */ p invoke(androidx.compose.ui.c cVar, androidx.compose.runtime.a aVar6, Integer num) {
                                b(cVar, aVar6, num.intValue());
                                return p.f75480a;
                            }
                        }), aVar2, 12582912, 64);
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
        com.google.android.material.bottomsheet.c cVar;
        super.onStart();
        Dialog dialog = getDialog();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = null;
        if (dialog instanceof com.google.android.material.bottomsheet.c) {
            cVar = (com.google.android.material.bottomsheet.c) dialog;
        } else {
            cVar = null;
        }
        if (cVar != null) {
            bottomSheetBehavior = cVar.getBehavior();
        }
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.t0(3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.i(view, "view");
        super.onViewCreated(view, bundle);
        if (this.f29903h == null) {
            dismiss();
        } else {
            LifeCycleUtilsKt.b(this, new RangeFilterBottomSheet$onViewCreated$1(this, null));
        }
    }

    public final void w(final androidx.compose.ui.c modifier, androidx.compose.runtime.a aVar, final int i11) {
        o.i(modifier, "modifier");
        androidx.compose.runtime.a h11 = aVar.h(-316301123);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-316301123, i11, -1, "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.rangeSheet.RangeFilterBottomSheet.RangeView (RangeFilterBottomSheet.kt:101)");
        }
        CommonViewsKt.h(modifier, (z0.d) h11.q(CompositionLocalsKt.f()), H().B0(), H().z0(), x(z.a(H().C0(), 0, null, h11, 56, 2)), y(z.a(H().A0(), Integer.valueOf((int) Api.BaseClientBuilder.API_PRIORITY_OTHER), null, h11, 56, 2)), z(z.a(H().G0(), null, null, h11, 56, 2)), h11, (i11 & 14) | 4672, 0);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.rangeSheet.RangeFilterBottomSheet$RangeView$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i12) {
                    RangeFilterBottomSheet.this.w(modifier, aVar2, v0.a(i11 | 1));
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
