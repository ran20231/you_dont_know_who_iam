package com.forsale.app.features.categories.listings.filtration.allFilters;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.k;
import androidx.activity.o;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.z;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.l;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.OpenFilterInNewScreenHandlerKt;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel;
import com.forsale.app.features.categories.listings.filtration.views.SheetsViewKt;
import com.forsale.app.utils.LifeCycleUtilsKt;
import com.forsale.designSystem.theme.ThemeKt;
import g00.p;
import g00.q;
import j0.d1;
import j0.e1;
import j0.n1;
import j0.v0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import p1.g;
import t9.y0;
import t9.z0;
import w.f;
import w3.a;
import wz.h;
/* compiled from: AllFiltersDialogFragment.kt */
/* loaded from: classes2.dex */
public final class AllFiltersDialogFragment extends e {

    /* renamed from: g  reason: collision with root package name */
    public static final a f28957g = new a(null);

    /* renamed from: h  reason: collision with root package name */
    public static final int f28958h = 8;

    /* renamed from: f  reason: collision with root package name */
    private final h f28959f;

    /* compiled from: AllFiltersDialogFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: AllFiltersDialogFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends o {
        b() {
            super(true);
        }

        @Override // androidx.activity.o
        public void d() {
            AllFiltersDialogFragment.this.y().C0();
        }
    }

    public AllFiltersDialogFragment() {
        final h b11;
        final g00.a<Fragment> aVar = new g00.a<Fragment>() { // from class: com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersDialogFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        b11 = kotlin.d.b(LazyThreadSafetyMode.NONE, new g00.a<x0>() { // from class: com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersDialogFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final x0 invoke() {
                return (x0) g00.a.this.invoke();
            }
        });
        this.f28959f = FragmentViewModelLazyKt.b(this, s.b(AllFiltersViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersDialogFragment$special$$inlined$viewModels$default$3
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
        }, new g00.a<w3.a>() { // from class: com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersDialogFragment$special$$inlined$viewModels$default$4
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
        }, new g00.a<t0.b>() { // from class: com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersDialogFragment$special$$inlined$viewModels$default$5
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
                    kotlin.jvm.internal.o.h(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                    return defaultViewModelProviderFactory2;
                }
                return defaultViewModelProviderFactory;
            }
        });
    }

    private static final boolean s(n1<Boolean> n1Var) {
        return n1Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<FilterViewModel<?, ?, ?>> t(n1<? extends List<? extends FilterViewModel<?, ?, ?>>> n1Var) {
        return (List) n1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AllFiltersViewModel y() {
        return (AllFiltersViewModel) this.f28959f.getValue();
    }

    @Override // androidx.fragment.app.j
    public int getTheme() {
        return z0.f70797g;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.o.i(inflater, "inflater");
        Context requireContext = requireContext();
        kotlin.jvm.internal.o.h(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(r0.b.c(-777915166, true, new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersDialogFragment$onCreateView$1$1
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
                    androidx.compose.runtime.c.U(-777915166, i11, -1, "com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersDialogFragment.onCreateView.<anonymous>.<anonymous> (AllFiltersDialogFragment.kt:47)");
                }
                final AllFiltersDialogFragment allFiltersDialogFragment = AllFiltersDialogFragment.this;
                ThemeKt.a(null, null, r0.b.b(aVar, 14901177, true, new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersDialogFragment$onCreateView$1$1.1
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i12) {
                        if ((i12 & 11) == 2 && aVar2.i()) {
                            aVar2.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(14901177, i12, -1, "com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersDialogFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (AllFiltersDialogFragment.kt:48)");
                        }
                        AllFiltersDialogFragment.this.q(aVar2, 8);
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                        b(aVar2, num.intValue());
                        return wz.p.f75480a;
                    }
                }), aVar, 384, 3);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar, Integer num) {
                b(aVar, num.intValue());
                return wz.p.f75480a;
            }
        }));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        WindowManager.LayoutParams layoutParams;
        k kVar;
        OnBackPressedDispatcher onBackPressedDispatcher;
        Window window;
        kotlin.jvm.internal.o.i(view, "view");
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            layoutParams = window.getAttributes();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            layoutParams.windowAnimations = z0.f70795e;
        }
        Dialog requireDialog = requireDialog();
        if (requireDialog instanceof k) {
            kVar = (k) requireDialog;
        } else {
            kVar = null;
        }
        if (kVar != null && (onBackPressedDispatcher = kVar.getOnBackPressedDispatcher()) != null) {
            androidx.lifecycle.s viewLifecycleOwner = getViewLifecycleOwner();
            kotlin.jvm.internal.o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            onBackPressedDispatcher.i(viewLifecycleOwner, new b());
        }
        OpenFilterInNewScreenHandlerKt.b(this, y().I0(), null, 2, null);
        LifeCycleUtilsKt.b(this, new AllFiltersDialogFragment$onViewCreated$2(this, null));
        super.onViewCreated(view, bundle);
    }

    public final void q(androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.runtime.a h11 = aVar.h(1522255944);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(1522255944, i11, -1, "com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersDialogFragment.AllFilters (AllFiltersDialogFragment.kt:89)");
        }
        n1 a11 = z.a(y().K0(), Boolean.FALSE, null, h11, 56, 2);
        final z0.d dVar = (z0.d) h11.q(CompositionLocalsKt.f());
        SheetsViewKt.c(g.b(y0.B, h11, 0), s(a11), sj.d.f68681r, new g00.a<wz.p>() { // from class: com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersDialogFragment$AllFilters$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            public /* bridge */ /* synthetic */ wz.p invoke() {
                invoke2();
                return wz.p.f75480a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                AllFiltersDialogFragment.this.y().Q0();
            }
        }, new g00.a<wz.p>() { // from class: com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersDialogFragment$AllFilters$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            public /* bridge */ /* synthetic */ wz.p invoke() {
                invoke2();
                return wz.p.f75480a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                AllFiltersDialogFragment.this.y().C0();
            }
        }, new g00.a<wz.p>() { // from class: com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersDialogFragment$AllFilters$3
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            public /* bridge */ /* synthetic */ wz.p invoke() {
                invoke2();
                return wz.p.f75480a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                AllFiltersDialogFragment.this.y().L0();
            }
        }, null, r0.b.b(h11, -1477170554, true, new q<androidx.compose.ui.c, androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersDialogFragment$AllFilters$4
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            public final void b(androidx.compose.ui.c it2, androidx.compose.runtime.a aVar2, int i12) {
                int i13;
                int i14;
                kotlin.jvm.internal.o.i(it2, "it");
                if ((i12 & 14) == 0) {
                    if (aVar2.T(it2)) {
                        i14 = 4;
                    } else {
                        i14 = 2;
                    }
                    i13 = i14 | i12;
                } else {
                    i13 = i12;
                }
                if ((i13 & 91) == 18 && aVar2.i()) {
                    aVar2.L();
                    return;
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(-1477170554, i12, -1, "com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersDialogFragment.AllFilters.<anonymous> (AllFiltersDialogFragment.kt:99)");
                }
                androidx.compose.ui.c b11 = BackgroundKt.b(it2, dk.a.f54291a.a(aVar2, dk.a.f54292b).e().h(aVar2, yj.d.f76453b), null, 2, null);
                AllFiltersDialogFragment allFiltersDialogFragment = AllFiltersDialogFragment.this;
                z0.d dVar2 = dVar;
                aVar2.C(-483455358);
                a0 a12 = androidx.compose.foundation.layout.e.a(Arrangement.f3698a.h(), v0.b.f74009a.k(), aVar2, 0);
                aVar2.C(-1323940314);
                int a13 = j0.e.a(aVar2, 0);
                j0.k s11 = aVar2.s();
                ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                g00.a<ComposeUiNode> a14 = companion.a();
                q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c11 = LayoutKt.c(b11);
                if (!(aVar2.k() instanceof j0.d)) {
                    j0.e.c();
                }
                aVar2.I();
                if (aVar2.f()) {
                    aVar2.y(a14);
                } else {
                    aVar2.t();
                }
                androidx.compose.runtime.a a15 = Updater.a(aVar2);
                Updater.c(a15, a12, companion.e());
                Updater.c(a15, s11, companion.g());
                p<ComposeUiNode, Integer, wz.p> b12 = companion.b();
                if (a15.f() || !kotlin.jvm.internal.o.d(a15.D(), Integer.valueOf(a13))) {
                    a15.u(Integer.valueOf(a13));
                    a15.p(Integer.valueOf(a13), b12);
                }
                c11.invoke(e1.a(e1.b(aVar2)), aVar2, 0);
                aVar2.C(2058660585);
                f fVar = f.f74891a;
                allFiltersDialogFragment.r(androidx.compose.ui.c.f7566a, dVar2, aVar2, 582, 0);
                aVar2.S();
                aVar2.w();
                aVar2.S();
                aVar2.S();
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }

            @Override // g00.q
            public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.ui.c cVar, androidx.compose.runtime.a aVar2, Integer num) {
                b(cVar, aVar2, num.intValue());
                return wz.p.f75480a;
            }
        }), h11, 12582912, 64);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersDialogFragment$AllFilters$5
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i12) {
                    AllFiltersDialogFragment.this.q(aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }

    public final void r(androidx.compose.ui.c cVar, final z0.d focusManager, androidx.compose.runtime.a aVar, final int i11, final int i12) {
        final androidx.compose.ui.c cVar2;
        kotlin.jvm.internal.o.i(focusManager, "focusManager");
        androidx.compose.runtime.a h11 = aVar.h(-169822222);
        if ((i12 & 1) != 0) {
            cVar2 = androidx.compose.ui.c.f7566a;
        } else {
            cVar2 = cVar;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-169822222, i11, -1, "com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersDialogFragment.AllFilters (AllFiltersDialogFragment.kt:108)");
        }
        n1 b11 = z.b(y().H0(), null, h11, 8, 1);
        if (!t(b11).isEmpty()) {
            LazyDslKt.a(SizeKt.h(cVar2, 0.0f, 1, null), null, PaddingKt.a(e2.h.l(16)), false, null, v0.b.f74009a.g(), null, false, new AllFiltersDialogFragment$AllFilters$6(b11, focusManager, this), h11, 196992, 218);
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersDialogFragment$AllFilters$7
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i13) {
                    AllFiltersDialogFragment.this.r(cVar2, focusManager, aVar2, v0.a(i11 | 1), i12);
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }
}
