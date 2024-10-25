package com.forsale.app.features.categories.listings.category;

import aa.q7;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.c0;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import androidx.navigation.NavController;
import androidx.navigation.h;
import androidx.paging.PagedList;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.base.ViewStates;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.network.requestsbodies.GetListingsBody;
import com.forsale.app.features.categories.listings.ListingsIntention;
import com.forsale.app.features.categories.listings.ListingsLayoutManager;
import com.forsale.app.features.categories.listings.category.CategoryListingsFragment$onScrollListener$2;
import com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.OpenFilterInNewScreenHandlerKt;
import com.forsale.app.features.maincontainer.MainContainerViewModel;
import com.forsale.app.features.search.SearchAnalyticsData;
import com.forsale.app.notifications.fcm.FCMTopLevelFunctionsKt;
import com.forsale.app.utils.CrashlyticsUtilsKt;
import com.forsale.app.utils.LifeCycleUtilsKt;
import com.forsale.app.utils.analytics.HomeVisitedSources;
import com.forsale.app.utils.analytics.SearchSource;
import com.forsale.app.utils.analytics.listingfiltration.ListingsAnalytics$FiltersPlace;
import com.forsale.designSystem.theme.ThemeKt;
import g00.l;
import java.util.Arrays;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.r;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.w;
import kr.b;
import kr.m;
import lj.a;
import t9.y0;
import w3.a;
import wc.a;
import wz.h;
import wz.p;
import z3.n;
/* compiled from: CategoryListingsFragment.kt */
/* loaded from: classes2.dex */
public final class CategoryListingsFragment extends zb.g<q7, CategoryListingsViewModel> {
    private final h A;
    private final h B;
    private final int C;
    private final boolean D;
    private final lr.a<m<?>> E;
    private final int F;
    private final h G;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CategoryListingsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements c0<PagedList<x9.b<?>>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ rr.a<x9.b<?>, m<?>> f28296a;

        a(rr.a<x9.b<?>, m<?>> aVar) {
            this.f28296a = aVar;
        }

        @Override // androidx.lifecycle.c0
        /* renamed from: a */
        public final void onChanged(PagedList<x9.b<?>> pagedList) {
            this.f28296a.o(pagedList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CategoryListingsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b implements c0, k {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f28298a;

        b(l function) {
            o.i(function, "function");
            this.f28298a = function;
        }

        @Override // kotlin.jvm.internal.k
        public final wz.e<?> c() {
            return this.f28298a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof c0) || !(obj instanceof k)) {
                return false;
            }
            return o.d(c(), ((k) obj).c());
        }

        public final int hashCode() {
            return c().hashCode();
        }

        @Override // androidx.lifecycle.c0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f28298a.invoke(obj);
        }
    }

    public CategoryListingsFragment() {
        final h b11;
        h a11;
        final g00.a<Fragment> aVar = new g00.a<Fragment>() { // from class: com.forsale.app.features.categories.listings.category.CategoryListingsFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        b11 = kotlin.d.b(LazyThreadSafetyMode.NONE, new g00.a<x0>() { // from class: com.forsale.app.features.categories.listings.category.CategoryListingsFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final x0 invoke() {
                return (x0) g00.a.this.invoke();
            }
        });
        this.A = FragmentViewModelLazyKt.b(this, s.b(CategoryListingsViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.features.categories.listings.category.CategoryListingsFragment$special$$inlined$viewModels$default$3
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
        }, new g00.a<w3.a>() { // from class: com.forsale.app.features.categories.listings.category.CategoryListingsFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final w3.a invoke() {
                x0 c11;
                androidx.lifecycle.l lVar;
                w3.a aVar2;
                g00.a aVar3 = g00.a.this;
                if (aVar3 == null || (aVar2 = (w3.a) aVar3.invoke()) == null) {
                    c11 = FragmentViewModelLazyKt.c(b11);
                    if (c11 instanceof androidx.lifecycle.l) {
                        lVar = (androidx.lifecycle.l) c11;
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
        }, new g00.a<t0.b>() { // from class: com.forsale.app.features.categories.listings.category.CategoryListingsFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final t0.b invoke() {
                x0 c11;
                androidx.lifecycle.l lVar;
                t0.b defaultViewModelProviderFactory;
                c11 = FragmentViewModelLazyKt.c(b11);
                if (c11 instanceof androidx.lifecycle.l) {
                    lVar = (androidx.lifecycle.l) c11;
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
        this.B = FragmentViewModelLazyKt.b(this, s.b(MainContainerViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.features.categories.listings.category.CategoryListingsFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final w0 invoke() {
                w0 viewModelStore = Fragment.this.requireActivity().getViewModelStore();
                o.h(viewModelStore, "requireActivity().viewModelStore");
                return viewModelStore;
            }
        }, new g00.a<w3.a>() { // from class: com.forsale.app.features.categories.listings.category.CategoryListingsFragment$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final w3.a invoke() {
                w3.a aVar2;
                g00.a aVar3 = g00.a.this;
                if (aVar3 == null || (aVar2 = (w3.a) aVar3.invoke()) == null) {
                    w3.a defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                    o.h(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                    return defaultViewModelCreationExtras;
                }
                return aVar2;
            }
        }, new g00.a<t0.b>() { // from class: com.forsale.app.features.categories.listings.category.CategoryListingsFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final t0.b invoke() {
                t0.b defaultViewModelProviderFactory = Fragment.this.requireActivity().getDefaultViewModelProviderFactory();
                o.h(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
        this.C = t9.t0.f70324w1;
        this.E = new lr.a<>();
        this.F = 15;
        a11 = kotlin.d.a(new g00.a<CategoryListingsFragment$onScrollListener$2.a>() { // from class: com.forsale.app.features.categories.listings.category.CategoryListingsFragment$onScrollListener$2

            /* compiled from: CategoryListingsFragment.kt */
            /* loaded from: classes2.dex */
            public static final class a extends RecyclerView.t {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ CategoryListingsFragment f28304a;

                a(CategoryListingsFragment categoryListingsFragment) {
                    this.f28304a = categoryListingsFragment;
                }

                @Override // androidx.recyclerview.widget.RecyclerView.t
                public void onScrollStateChanged(RecyclerView recyclerView, int i11) {
                    LinearLayoutManager linearLayoutManager;
                    int i12;
                    o.i(recyclerView, "recyclerView");
                    CategoryListingsViewModel B = this.f28304a.B();
                    RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                    if (layoutManager instanceof LinearLayoutManager) {
                        linearLayoutManager = (LinearLayoutManager) layoutManager;
                    } else {
                        linearLayoutManager = null;
                    }
                    if (linearLayoutManager != null) {
                        i12 = linearLayoutManager.s2();
                    } else {
                        i12 = 0;
                    }
                    B.D3(i12);
                    super.onScrollStateChanged(recyclerView, i11);
                }

                @Override // androidx.recyclerview.widget.RecyclerView.t
                public void onScrolled(RecyclerView recyclerView, int i11, int i12) {
                    LinearLayoutManager linearLayoutManager;
                    int i13;
                    boolean z11;
                    o.i(recyclerView, "recyclerView");
                    super.onScrolled(recyclerView, i11, i12);
                    RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                    if (layoutManager instanceof LinearLayoutManager) {
                        linearLayoutManager = (LinearLayoutManager) layoutManager;
                    } else {
                        linearLayoutManager = null;
                    }
                    boolean z12 = false;
                    if (linearLayoutManager != null) {
                        i13 = linearLayoutManager.s2();
                    } else {
                        i13 = 0;
                    }
                    CategoryListingsViewModel B = this.f28304a.B();
                    if (i13 < 3 && i13 != -1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    B.Z2(z11);
                    this.f28304a.B().C3(i13);
                    if ((-this.f28304a.V()) > i12 || i12 > this.f28304a.V()) {
                        CategoryListingsViewModel B2 = this.f28304a.B();
                        if (i12 > 0) {
                            z12 = true;
                        }
                        B2.H3(z12);
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final a invoke() {
                return new a(CategoryListingsFragment.this);
            }
        });
        this.G = a11;
    }

    public static final /* synthetic */ q7 I(CategoryListingsFragment categoryListingsFragment) {
        return (q7) categoryListingsFragment.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(String str) {
        Pair<m<?>, Integer> pair;
        kr.b<m<?>> a11 = this.E.a();
        if (a11 != null) {
            pair = a11.o(wc.a.f75193k.a());
        } else {
            pair = null;
        }
        if (pair == null) {
            wc.b bVar = new wc.b(str, new g00.a<p>() { // from class: com.forsale.app.features.categories.listings.category.CategoryListingsFragment$addReloadErrorItem$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(0);
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    CategoryListingsFragment.this.B().A3();
                }

                @Override // g00.a
                public /* bridge */ /* synthetic */ p invoke() {
                    invoke2();
                    return p.f75480a;
                }
            });
            androidx.lifecycle.s viewLifecycleOwner = getViewLifecycleOwner();
            o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            this.E.n(new wc.a(bVar, viewLifecycleOwner));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MainContainerViewModel S() {
        return (MainContainerViewModel) this.B.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y(CategoryEntity categoryEntity, HomeVisitedSources homeVisitedSources) {
        androidx.navigation.fragment.a.a(this).d0(com.forsale.app.features.categories.listings.category.b.f28671a.c(categoryEntity, homeVisitedSources));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a0(String str, SearchSource searchSource, CategoryEntity categoryEntity, GetListingsBody.FiltrationData filtrationData, ListingsIntention listingsIntention, SearchAnalyticsData searchAnalyticsData, Integer num) {
        androidx.navigation.h hVar;
        NavController a11 = androidx.navigation.fragment.a.a(this);
        n b11 = com.forsale.app.features.categories.listings.category.b.f28671a.b(categoryEntity, str, listingsIntention, filtrationData, searchSource, searchAnalyticsData);
        if (num != null) {
            hVar = h.a.i(new h.a(), num.intValue(), false, false, 4, null).a();
        } else {
            hVar = null;
        }
        a11.e0(b11, hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b0() {
        B().d3();
        if (!B().W2().getValue().booleanValue() && B().I2() != SearchSource.MATCHING_CATEGORIES) {
            androidx.fragment.app.p requireActivity = requireActivity();
            o.h(requireActivity, "requireActivity(...)");
            w wVar = w.f61809a;
            String string = ((q7) m()).getRoot().getContext().getString(y0.R2);
            o.h(string, "getString(...)");
            String format = String.format(string, Arrays.copyOf(new Object[0], 0));
            o.h(format, "format(...)");
            FCMTopLevelFunctionsKt.b(requireActivity, Uri.parse(format).toString());
            return;
        }
        androidx.navigation.fragment.a.a(this).j0();
    }

    private final void c0() {
        B().v0().observe(getViewLifecycleOwner(), new b(new l<ViewStates, p>() { // from class: com.forsale.app.features.categories.listings.category.CategoryListingsFragment$popUpsObserver$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(ViewStates viewStates) {
                if (viewStates == ViewStates.CONTENT) {
                    CategoryListingsFragment.this.B().V1();
                }
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(ViewStates viewStates) {
                b(viewStates);
                return p.f75480a;
            }
        }));
        LifeCycleUtilsKt.b(this, new CategoryListingsFragment$popUpsObserver$2(this, null));
        LifeCycleUtilsKt.b(this, new CategoryListingsFragment$popUpsObserver$3(this, null));
    }

    private final void d0() {
        OpenFilterInNewScreenHandlerKt.a(this, B().v2(), new g00.p<com.forsale.app.utils.analytics.listingfiltration.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.category.CategoryListingsFragment$registerFiltrationObservers$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            public final void b(com.forsale.app.utils.analytics.listingfiltration.a filterAnalyticsTypes, int i11) {
                o.i(filterAnalyticsTypes, "filterAnalyticsTypes");
                CategoryListingsFragment.this.B().E3(filterAnalyticsTypes, i11);
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ p invoke(com.forsale.app.utils.analytics.listingfiltration.a aVar, Integer num) {
                b(aVar, num.intValue());
                return p.f75480a;
            }
        });
        LifeCycleUtilsKt.b(this, new CategoryListingsFragment$registerFiltrationObservers$2(this, null));
    }

    private final void e0(final CategoryListingsViewModel categoryListingsViewModel, androidx.lifecycle.s sVar) {
        List q11;
        PagedCategoryListingsAdapter pagedCategoryListingsAdapter = PagedCategoryListingsAdapter.f28629a;
        androidx.lifecycle.s viewLifecycleOwner = getViewLifecycleOwner();
        o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        rr.a<x9.b<?>, m<?>> invoke = pagedCategoryListingsAdapter.invoke(viewLifecycleOwner);
        b.a aVar = kr.b.f61943t;
        q11 = r.q(invoke, this.E);
        final kr.b g11 = aVar.g(q11);
        categoryListingsViewModel.P2().observe(sVar, new c0<Integer>() { // from class: com.forsale.app.features.categories.listings.category.CategoryListingsFragment$registerListingsObservers$1
            @Override // androidx.lifecycle.c0
            /* renamed from: a */
            public final void onChanged(Integer num) {
                RecyclerView recyclerView = CategoryListingsFragment.I(CategoryListingsFragment.this).P;
                kr.b<m<?>> bVar = g11;
                CategoryListingsFragment categoryListingsFragment = CategoryListingsFragment.this;
                CategoryListingsViewModel categoryListingsViewModel2 = categoryListingsViewModel;
                recyclerView.setAdapter(bVar);
                Context context = recyclerView.getContext();
                o.h(context, "getContext(...)");
                ListingsLayoutManager listingsLayoutManager = new ListingsLayoutManager(context, 1, bVar, new CategoryListingsFragment$registerListingsObservers$1$onChanged$1$1(categoryListingsFragment.B()));
                listingsLayoutManager.y1(a.C0733a.b(categoryListingsViewModel2, null, 1, null));
                CategoryListingsFragment.I(categoryListingsFragment).P.n(categoryListingsFragment.T());
                recyclerView.setLayoutManager(listingsLayoutManager);
            }
        });
        categoryListingsViewModel.s2().observe(sVar, new a(invoke));
        LifeCycleUtilsKt.b(this, new CategoryListingsFragment$registerListingsObservers$3(this, null));
        LifeCycleUtilsKt.b(this, new CategoryListingsFragment$registerListingsObservers$4(this, null));
        LifeCycleUtilsKt.b(this, new CategoryListingsFragment$registerListingsObservers$5(this, null));
    }

    private final void f0() {
        LifeCycleUtilsKt.b(this, new CategoryListingsFragment$registerNavigationObservers$1(this, null));
    }

    private final void g0(CategoryListingsViewModel categoryListingsViewModel, androidx.lifecycle.s sVar) {
        d0();
        c0();
        e0(categoryListingsViewModel, sVar);
        h0();
        f0();
    }

    private final void h0() {
        LifeCycleUtilsKt.b(this, new CategoryListingsFragment$registerSortingOptionsObservers$1(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i0() {
        Integer d11;
        kr.b<m<?>> a11 = this.E.a();
        if (a11 != null) {
            a.C0913a c0913a = wc.a.f75193k;
            Pair<m<?>, Integer> o11 = a11.o(c0913a.a());
            if (o11 != null && (d11 = o11.d()) != null) {
                d11.intValue();
                this.E.A(c0913a.a());
            }
        }
    }

    @Override // com.forsale.app.base.fragments.BaseViewModelFragment
    protected boolean A() {
        return this.D;
    }

    public final RecyclerView.t T() {
        return (RecyclerView.t) this.G.getValue();
    }

    public final int V() {
        return this.F;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.fragments.BaseViewModelFragment
    /* renamed from: X */
    public CategoryListingsViewModel B() {
        return (CategoryListingsViewModel) this.A.getValue();
    }

    @Override // com.forsale.app.base.fragments.a
    protected int o() {
        return this.C;
    }

    @Override // com.forsale.app.base.fragments.BaseViewModelFragment, com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.i(inflater, "inflater");
        super.onCreateView(inflater, viewGroup, bundle);
        Context requireContext = requireContext();
        o.h(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.f8797b);
        composeView.setContent(r0.b.c(-1374605834, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.category.CategoryListingsFragment$onCreateView$1$1
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
                    androidx.compose.runtime.c.U(-1374605834, i11, -1, "com.forsale.app.features.categories.listings.category.CategoryListingsFragment.onCreateView.<anonymous>.<anonymous> (CategoryListingsFragment.kt:79)");
                }
                final CategoryListingsFragment categoryListingsFragment = CategoryListingsFragment.this;
                ThemeKt.a(null, null, r0.b.b(aVar, 1313337791, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.category.CategoryListingsFragment$onCreateView$1$1.1
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i12) {
                        if ((i12 & 11) == 2 && aVar2.i()) {
                            aVar2.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(1313337791, i12, -1, "com.forsale.app.features.categories.listings.category.CategoryListingsFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (CategoryListingsFragment.kt:80)");
                        }
                        CategoryListingsViewModel B = CategoryListingsFragment.this.B();
                        q7 I = CategoryListingsFragment.I(CategoryListingsFragment.this);
                        final CategoryListingsFragment categoryListingsFragment2 = CategoryListingsFragment.this;
                        g00.a<p> aVar3 = new g00.a<p>() { // from class: com.forsale.app.features.categories.listings.category.CategoryListingsFragment.onCreateView.1.1.1.1
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
                                androidx.navigation.fragment.a.a(CategoryListingsFragment.this).j0();
                            }
                        };
                        final CategoryListingsFragment categoryListingsFragment3 = CategoryListingsFragment.this;
                        CategoryListingsViewKt.f(B, I, aVar3, new g00.a<p>() { // from class: com.forsale.app.features.categories.listings.category.CategoryListingsFragment.onCreateView.1.1.1.2
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
                                CategoryListingsFragment.this.b0();
                            }
                        }, aVar2, 72);
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

    @Override // com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public void onDestroy() {
        S().J1(false);
        S().N1(SearchSource.NONE);
        super.onDestroy();
    }

    @Override // com.forsale.app.base.fragments.BaseViewModelFragment, com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Parcelable parcelable;
        B().N3(false);
        CategoryListingsViewModel B = B();
        RecyclerView.o layoutManager = ((q7) m()).P.getLayoutManager();
        if (layoutManager != null) {
            parcelable = layoutManager.z1();
        } else {
            parcelable = null;
        }
        a.C0733a.d(B, parcelable, null, 2, null);
        RecyclerView recyclerView = ((q7) m()).P;
        recyclerView.setAdapter(null);
        recyclerView.setLayoutManager(null);
        recyclerView.k1(T());
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        B().M3();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        S().J1(B().W2().getValue().booleanValue());
        B().J3();
        S().N1(B().I2());
        B().M3();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        B().v3();
        B().B3();
        super.onStop();
    }

    @Override // com.forsale.app.base.fragments.BaseViewModelFragment, com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.i(view, "view");
        super.onViewCreated(view, bundle);
        S().J1(B().W2().getValue().booleanValue());
        B().N3(true);
        CrashlyticsUtilsKt.a("Category Listings", new l<tn.b, p>() { // from class: com.forsale.app.features.categories.listings.category.CategoryListingsFragment$onViewCreated$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(tn.b logScreenVisited) {
                o.i(logScreenVisited, "$this$logScreenVisited");
                if (CategoryListingsFragment.this.B().z2() != null) {
                    CategoryEntity z22 = CategoryListingsFragment.this.B().z2();
                    o.f(z22);
                    logScreenVisited.b("category_name", z22.getNameEn());
                    CategoryEntity z23 = CategoryListingsFragment.this.B().z2();
                    o.f(z23);
                    logScreenVisited.b("category_id", String.valueOf(z23.getId()));
                }
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(tn.b bVar) {
                b(bVar);
                return p.f75480a;
            }
        });
        androidx.fragment.app.w.c(this, "all_filters_request", new g00.p<String, Bundle, p>() { // from class: com.forsale.app.features.categories.listings.category.CategoryListingsFragment$onViewCreated$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            public final void b(String key, Bundle bundle2) {
                GetListingsBody.FiltrationData filtrationData;
                Object parcelable;
                o.i(key, "key");
                o.i(bundle2, "bundle");
                boolean z11 = bundle2.getBoolean("is_all_filters_changed_filters");
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = bundle2.getParcelable("all_filters_changed_filters", GetListingsBody.FiltrationData.class);
                    filtrationData = (GetListingsBody.FiltrationData) parcelable;
                } else {
                    filtrationData = (GetListingsBody.FiltrationData) bundle2.getParcelable("all_filters_changed_filters");
                }
                if (z11) {
                    CategoryListingsFragment.this.B().O3(filtrationData, ListingsAnalytics$FiltersPlace.ALL_FILTERS);
                }
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ p invoke(String str, Bundle bundle2) {
                b(str, bundle2);
                return p.f75480a;
            }
        });
        CategoryListingsViewModel B = B();
        androidx.lifecycle.s viewLifecycleOwner = getViewLifecycleOwner();
        o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        g0(B, viewLifecycleOwner);
    }
}
