package com.forsale.app.features.search;

import aa.ia;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.t0;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.network.requestsbodies.GetListingsBody;
import com.forsale.app.features.categories.listings.ListingsIntention;
import com.forsale.app.features.maincontainer.MainContainerActivity;
import com.forsale.app.features.search.SearchFocusViewModel;
import com.forsale.app.features.search.SearchSharedViewModel;
import com.forsale.app.features.search.a0;
import com.forsale.app.utils.CrashlyticsUtilsKt;
import com.forsale.app.utils.LifeCycleUtilsKt;
import com.forsale.app.utils.NavigationUtilsKt;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7;
import com.forsale.app.utils.analytics.HomeVisitedSources;
import com.forsale.app.utils.analytics.SearchSource;
import com.forsale.designSystem.theme.ThemeKt;
import com.forsale.ui.components.SearchToolbarKt;
import j0.d1;
import j0.e1;
import j0.v0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import okhttp3.internal.http2.Http2Connection;
import t9.t0;
import t9.y0;
import w3.a;
/* compiled from: SearchFocusFragment.kt */
/* loaded from: classes2.dex */
public final class SearchFocusFragment extends c<ia, SearchFocusViewModel> {
    private final int A = t0.f70206f2;
    private final z3.i B = new z3.i(kotlin.jvm.internal.s.b(z.class), new g00.a<Bundle>() { // from class: com.forsale.app.features.search.SearchFocusFragment$special$$inlined$navArgs$1
        {
            super(0);
        }

        @Override // g00.a
        /* renamed from: b */
        public final Bundle invoke() {
            Bundle arguments = Fragment.this.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " has null arguments");
        }
    });
    private final wz.h C;
    private final wz.h D;
    private final wz.h E;
    private final wz.h F;
    private final wz.h G;
    public SearchSharedViewModel.a H;
    private final wz.h I;
    public SearchFocusViewModel.b J;
    private final wz.h K;

    public SearchFocusFragment() {
        wz.h a11;
        wz.h a12;
        wz.h a13;
        wz.h a14;
        wz.h a15;
        wz.h b11;
        a11 = kotlin.d.a(new g00.a<String>() { // from class: com.forsale.app.features.search.SearchFocusFragment$searchKeyword$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            public final String invoke() {
                z g02;
                g02 = SearchFocusFragment.this.g0();
                if (g02 != null) {
                    return g02.d();
                }
                return null;
            }
        });
        this.C = a11;
        a12 = kotlin.d.a(new g00.a<Boolean>() { // from class: com.forsale.app.features.search.SearchFocusFragment$goToSearchResults$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // g00.a
            public final Boolean invoke() {
                z g02;
                g02 = SearchFocusFragment.this.g0();
                if (g02 != null) {
                    return Boolean.valueOf(g02.a());
                }
                return null;
            }
        });
        this.D = a12;
        a13 = kotlin.d.a(new g00.a<SearchSource>() { // from class: com.forsale.app.features.search.SearchFocusFragment$searchSource$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final SearchSource invoke() {
                z g02;
                SearchSource e11;
                g02 = SearchFocusFragment.this.g0();
                if (g02 == null || (e11 = g02.e()) == null) {
                    return SearchSource.SEARCH_BAR;
                }
                return e11;
            }
        });
        this.E = a13;
        a14 = kotlin.d.a(new g00.a<Integer>() { // from class: com.forsale.app.features.search.SearchFocusFragment$searchItemOrder$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // g00.a
            public final Integer invoke() {
                z g02;
                g02 = SearchFocusFragment.this.g0();
                return Integer.valueOf(g02 != null ? g02.c() : -1);
            }
        });
        this.F = a14;
        a15 = kotlin.d.a(new g00.a<Integer>() { // from class: com.forsale.app.features.search.SearchFocusFragment$searchHistoryCount$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // g00.a
            public final Integer invoke() {
                z g02;
                g02 = SearchFocusFragment.this.g0();
                return Integer.valueOf(g02 != null ? g02.b() : 0);
            }
        });
        this.G = a15;
        this.I = FragmentViewModelLazyKt.b(this, kotlin.jvm.internal.s.b(SearchSharedViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.utils.ViewModelHiltExtensionKt$assistedActivityViewModel$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final w0 invoke() {
                w0 viewModelStore = Fragment.this.requireActivity().getViewModelStore();
                kotlin.jvm.internal.o.h(viewModelStore, "requireActivity().viewModelStore");
                return viewModelStore;
            }
        }, new g00.a<w3.a>() { // from class: com.forsale.app.utils.ViewModelHiltExtensionKt$assistedActivityViewModel$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final w3.a invoke() {
                w3.a aVar;
                g00.a aVar2 = g00.a.this;
                if (aVar2 == null || (aVar = (w3.a) aVar2.invoke()) == null) {
                    w3.a defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                    kotlin.jvm.internal.o.h(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                    return defaultViewModelCreationExtras;
                }
                return aVar;
            }
        }, new g00.a<t0.b>() { // from class: com.forsale.app.features.search.SearchFocusFragment$special$$inlined$assistedActivityViewModel$1

            /* compiled from: ViewModelHiltExtension.kt */
            /* loaded from: classes2.dex */
            public static final class a extends androidx.lifecycle.a {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ SearchFocusFragment f36652f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Fragment fragment, Bundle bundle, SearchFocusFragment searchFocusFragment) {
                    super(fragment, bundle);
                    this.f36652f = searchFocusFragment;
                }

                @Override // androidx.lifecycle.a
                protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                    String i02;
                    kotlin.jvm.internal.o.i(key, "key");
                    kotlin.jvm.internal.o.i(modelClass, "modelClass");
                    kotlin.jvm.internal.o.i(handle, "handle");
                    SearchSharedViewModel.a e02 = this.f36652f.e0();
                    i02 = this.f36652f.i0();
                    if (i02 == null) {
                        i02 = "";
                    }
                    SearchSharedViewModel a11 = e02.a(i02);
                    kotlin.jvm.internal.o.g(a11, "null cannot be cast to non-null type T of com.forsale.app.utils.ViewModelHiltExtensionKt.assistedActivityViewModel.<no name provided>.invoke.<no name provided>.create");
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
        });
        g00.a<t0.b> aVar = new g00.a<t0.b>() { // from class: com.forsale.app.features.search.SearchFocusFragment$special$$inlined$assistedViewModel$1

            /* compiled from: ViewModelHiltExtension.kt */
            /* loaded from: classes2.dex */
            public static final class a extends androidx.lifecycle.a {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ SearchFocusFragment f36655f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Fragment fragment, Bundle bundle, SearchFocusFragment searchFocusFragment) {
                    super(fragment, bundle);
                    this.f36655f = searchFocusFragment;
                }

                @Override // androidx.lifecycle.a
                protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                    String i02;
                    Boolean f02;
                    SearchSource j02;
                    int h02;
                    kotlin.jvm.internal.o.i(key, "key");
                    kotlin.jvm.internal.o.i(modelClass, "modelClass");
                    kotlin.jvm.internal.o.i(handle, "handle");
                    SearchFocusViewModel.b d02 = this.f36655f.d0();
                    i02 = this.f36655f.i0();
                    f02 = this.f36655f.f0();
                    j02 = this.f36655f.j0();
                    h02 = this.f36655f.h0();
                    SearchFocusViewModel a11 = d02.a(i02, true, f02, j02, Integer.valueOf(h02));
                    kotlin.jvm.internal.o.g(a11, "null cannot be cast to non-null type T of com.forsale.app.utils.ViewModelHiltExtensionKt.assistedViewModel.<no name provided>.invoke.<no name provided>.create");
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
        b11 = kotlin.d.b(LazyThreadSafetyMode.NONE, new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5(new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4(this)));
        this.K = FragmentViewModelLazyKt.b(this, kotlin.jvm.internal.s.b(SearchFocusViewModel.class), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6(b11), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7(null, b11), aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.runtime.a h11 = aVar.h(-1438087206);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-1438087206, i11, -1, "com.forsale.app.features.search.SearchFocusFragment.ObserveUiState (SearchFocusFragment.kt:187)");
        }
        j0.u.d(B().U0(), new SearchFocusFragment$ObserveUiState$1(this, null), h11, 72);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.search.SearchFocusFragment$ObserveUiState$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i12) {
                    SearchFocusFragment.this.H(aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(SearchFocusViewModel searchFocusViewModel, androidx.compose.runtime.a aVar, final int i11, final int i12) {
        final SearchFocusViewModel searchFocusViewModel2;
        w3.a aVar2;
        androidx.compose.runtime.a h11 = aVar.h(-458110698);
        if ((i12 & 1) != 0) {
            h11.C(1729797275);
            x0 a11 = LocalViewModelStoreOwner.f12907a.a(h11, 6);
            if (a11 != null) {
                if (a11 instanceof androidx.lifecycle.l) {
                    aVar2 = ((androidx.lifecycle.l) a11).getDefaultViewModelCreationExtras();
                } else {
                    aVar2 = a.C0905a.f75031b;
                }
                q0 b11 = x3.a.b(SearchFocusViewModel.class, a11, null, null, aVar2, h11, 36936, 0);
                h11.S();
                searchFocusViewModel2 = (SearchFocusViewModel) b11;
            } else {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
        } else {
            searchFocusViewModel2 = searchFocusViewModel;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-458110698, i11, -1, "com.forsale.app.features.search.SearchFocusFragment.ScreenContent (SearchFocusFragment.kt:105)");
        }
        final SearchFocusViewModel searchFocusViewModel3 = searchFocusViewModel2;
        LazyDslKt.a(PaddingKt.m(androidx.compose.ui.c.f7566a, 0.0f, 0.0f, 0.0f, e2.h.l(16), 7, null), null, null, false, null, null, null, false, new g00.l<LazyListScope, wz.p>() { // from class: com.forsale.app.features.search.SearchFocusFragment$ScreenContent$1

            /* compiled from: SearchFocusFragment.kt */
            /* loaded from: classes2.dex */
            public /* synthetic */ class a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f36670a;

                static {
                    int[] iArr = new int[SearchFocusViewModel.SearchState.ViewMode.values().length];
                    try {
                        iArr[SearchFocusViewModel.SearchState.ViewMode.OpenSearchMode.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[SearchFocusViewModel.SearchState.ViewMode.TypingMode.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    f36670a = iArr;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(LazyListScope LazyColumn) {
                kotlin.jvm.internal.o.i(LazyColumn, "$this$LazyColumn");
                int i13 = a.f36670a[SearchFocusViewModel.this.U0().m().ordinal()];
                if (i13 != 1) {
                    if (i13 == 2) {
                        final SearchFocusViewModel searchFocusViewModel4 = SearchFocusViewModel.this;
                        LazyListScope.l(LazyColumn, null, null, r0.b.c(708360971, true, new g00.q<x.a, androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.search.SearchFocusFragment$ScreenContent$1.2
                            {
                                super(3);
                            }

                            public final void b(x.a item, androidx.compose.runtime.a aVar3, int i14) {
                                kotlin.jvm.internal.o.i(item, "$this$item");
                                if ((i14 & 81) == 16 && aVar3.i()) {
                                    aVar3.L();
                                    return;
                                }
                                if (androidx.compose.runtime.c.I()) {
                                    androidx.compose.runtime.c.U(708360971, i14, -1, "com.forsale.app.features.search.SearchFocusFragment.ScreenContent.<anonymous>.<anonymous> (SearchFocusFragment.kt:115)");
                                }
                                List<CategoryEntity> g11 = SearchFocusViewModel.this.U0().g();
                                String h12 = SearchFocusViewModel.this.U0().h();
                                final SearchFocusViewModel searchFocusViewModel5 = SearchFocusViewModel.this;
                                MatchedCategoriesKt.a(g11, h12, false, new g00.l<CategoryEntity, wz.p>() { // from class: com.forsale.app.features.search.SearchFocusFragment.ScreenContent.1.2.1
                                    {
                                        super(1);
                                    }

                                    public final void b(CategoryEntity it2) {
                                        kotlin.jvm.internal.o.i(it2, "it");
                                        SearchFocusViewModel.this.n1(new o(SearchFocusViewModel.this.U0().h(), it2, SearchFocusViewModel.this.U0().c()));
                                    }

                                    @Override // g00.l
                                    public /* bridge */ /* synthetic */ wz.p invoke(CategoryEntity categoryEntity) {
                                        b(categoryEntity);
                                        return wz.p.f75480a;
                                    }
                                }, aVar3, 8, 4);
                                if (androidx.compose.runtime.c.I()) {
                                    androidx.compose.runtime.c.T();
                                }
                            }

                            @Override // g00.q
                            public /* bridge */ /* synthetic */ wz.p invoke(x.a aVar3, androidx.compose.runtime.a aVar4, Integer num) {
                                b(aVar3, aVar4, num.intValue());
                                return wz.p.f75480a;
                            }
                        }), 3, null);
                        if (SearchFocusViewModel.this.U0().e().b()) {
                            ItemListContainerKt.c(LazyColumn);
                            return;
                        } else {
                            ItemListContainerKt.a(LazyColumn, SearchFocusViewModel.this);
                            return;
                        }
                    }
                    return;
                }
                ItemListContainerKt.h(LazyColumn, SearchFocusViewModel.this);
                final SearchFocusFragment searchFocusFragment = this;
                final SearchFocusViewModel searchFocusViewModel5 = SearchFocusViewModel.this;
                LazyListScope.l(LazyColumn, null, null, r0.b.c(763978658, true, new g00.q<x.a, androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.search.SearchFocusFragment$ScreenContent$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    public final void b(x.a item, androidx.compose.runtime.a aVar3, int i14) {
                        kotlin.jvm.internal.o.i(item, "$this$item");
                        if ((i14 & 81) == 16 && aVar3.i()) {
                            aVar3.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(763978658, i14, -1, "com.forsale.app.features.search.SearchFocusFragment.ScreenContent.<anonymous>.<anonymous> (SearchFocusFragment.kt:112)");
                        }
                        SearchFocusFragment.this.K(searchFocusViewModel5, aVar3, 72);
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                    }

                    @Override // g00.q
                    public /* bridge */ /* synthetic */ wz.p invoke(x.a aVar3, androidx.compose.runtime.a aVar4, Integer num) {
                        b(aVar3, aVar4, num.intValue());
                        return wz.p.f75480a;
                    }
                }), 3, null);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(LazyListScope lazyListScope) {
                b(lazyListScope);
                return wz.p.f75480a;
            }
        }, h11, 6, 254);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.search.SearchFocusFragment$ScreenContent$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar3, int i13) {
                    SearchFocusFragment.this.I(searchFocusViewModel3, aVar3, v0.a(i11 | 1), i12);
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a h11 = aVar.h(-263091608);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-263091608, i11, -1, "com.forsale.app.features.search.SearchFocusFragment.SearchBar (SearchFocusFragment.kt:144)");
        }
        h11.C(-492369756);
        Object D = h11.D();
        a.C0064a c0064a = androidx.compose.runtime.a.f7182a;
        if (D == c0064a.a()) {
            D = new FocusRequester();
            h11.u(D);
        }
        h11.S();
        FocusRequester focusRequester = (FocusRequester) D;
        if (r0(h11, 8)) {
            final z0.d dVar = (z0.d) h11.q(CompositionLocalsKt.f());
            String h12 = B().U0().h();
            String b11 = p1.g.b(y0.f70773yd, h11, 0);
            SearchToolbarKt.b(h12, new g00.l<String, wz.p>() { // from class: com.forsale.app.features.search.SearchFocusFragment$SearchBar$2
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                public final void b(String it2) {
                    kotlin.jvm.internal.o.i(it2, "it");
                    SearchFocusFragment.this.B().n1(new r(it2));
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ wz.p invoke(String str) {
                    b(str);
                    return wz.p.f75480a;
                }
            }, new g00.a<wz.p>() { // from class: com.forsale.app.features.search.SearchFocusFragment$SearchBar$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    SearchFocusFragment.this.B().n1(p.f37017a);
                    z0.d.j(dVar, false, 1, null);
                }
            }, androidx.compose.ui.focus.b.a(androidx.compose.ui.focus.h.a(androidx.compose.ui.c.f7566a, focusRequester), new g00.l<z0.l, wz.p>() { // from class: com.forsale.app.features.search.SearchFocusFragment$SearchBar$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                public final void b(z0.l it2) {
                    kotlin.jvm.internal.o.i(it2, "it");
                    if (it2.isFocused()) {
                        SearchFocusFragment.this.B().n1(s.f37020a);
                    }
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ wz.p invoke(z0.l lVar) {
                    b(lVar);
                    return wz.p.f75480a;
                }
            }), false, new g00.a<wz.p>() { // from class: com.forsale.app.features.search.SearchFocusFragment$SearchBar$4
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
                    SearchFocusFragment.this.B().n1(q.f37018a);
                }
            }, b11, dVar, null, null, new g00.a<wz.p>() { // from class: com.forsale.app.features.search.SearchFocusFragment$SearchBar$5
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
                    SearchFocusFragment.this.B().n1(t.f37021a);
                }
            }, 50, false, h11, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE, 48, 4880);
            wz.p pVar = wz.p.f75480a;
            aVar2 = h11;
            aVar2.C(1157296644);
            boolean T = aVar2.T(focusRequester);
            Object D2 = aVar2.D();
            if (T || D2 == c0064a.a()) {
                D2 = new SearchFocusFragment$SearchBar$6$1(focusRequester, null);
                aVar2.u(D2);
            }
            aVar2.S();
            j0.u.d(pVar, (g00.p) D2, aVar2, 70);
        } else {
            aVar2 = h11;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = aVar2.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.search.SearchFocusFragment$SearchBar$7
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar3, int i12) {
                    SearchFocusFragment.this.J(aVar3, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Boolean f0() {
        return (Boolean) this.D.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z g0() {
        return (z) this.B.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int h0() {
        return ((Number) this.F.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String i0() {
        return (String) this.C.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SearchSource j0() {
        return (SearchSource) this.E.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m0(CategoryEntity categoryEntity, HomeVisitedSources homeVisitedSources) {
        NavigationUtilsKt.d(androidx.navigation.fragment.a.a(this), a0.c.b(a0.f36940a, categoryEntity, homeVisitedSources, null, 4, null), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o0(String str, SearchSource searchSource, CategoryEntity categoryEntity, GetListingsBody.FiltrationData filtrationData, ListingsIntention listingsIntention, SearchAnalyticsData searchAnalyticsData) {
        NavigationUtilsKt.d(androidx.navigation.fragment.a.a(this), a0.c.d(a0.f36940a, categoryEntity, null, str, listingsIntention, null, null, filtrationData, searchSource, searchAnalyticsData, false, 562, null), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p0() {
        if (getActivity() instanceof SearchActivity) {
            androidx.fragment.app.p activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        androidx.navigation.fragment.a.a(this).h0();
    }

    private final void q0() {
        LifeCycleUtilsKt.b(this, new SearchFocusFragment$registerObservers$1(this, null));
    }

    private final boolean r0(androidx.compose.runtime.a aVar, int i11) {
        aVar.C(1126197934);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(1126197934, i11, -1, "com.forsale.app.features.search.SearchFocusFragment.showFocusedSearchBar (SearchFocusFragment.kt:287)");
        }
        androidx.fragment.app.p activity = getActivity();
        boolean z11 = true;
        if (activity instanceof SearchActivity) {
            if (((Boolean) androidx.compose.runtime.z.a(k0().z0(), Boolean.FALSE, null, aVar, 56, 2).getValue()).booleanValue()) {
                z11 = false;
            }
        } else if (activity instanceof MainContainerActivity) {
            z11 = B().U0().l();
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        aVar.S();
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s0(String str) {
        if (getActivity() instanceof SearchActivity) {
            k0().D0(str);
        } else if (getActivity() instanceof MainContainerActivity) {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.o.g(activity, "null cannot be cast to non-null type com.forsale.app.features.maincontainer.MainContainerActivity");
            ((MainContainerActivity) activity).b2(str);
        }
    }

    public final void K(final SearchFocusViewModel viewModel, androidx.compose.runtime.a aVar, final int i11) {
        kotlin.jvm.internal.o.i(viewModel, "viewModel");
        androidx.compose.runtime.a h11 = aVar.h(-1439759099);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-1439759099, i11, -1, "com.forsale.app.features.search.SearchFocusFragment.TrendingContainer (SearchFocusFragment.kt:134)");
        }
        j0.u.d(viewModel.U0(), new SearchFocusFragment$TrendingContainer$1(viewModel, null), h11, 72);
        if (!viewModel.U0().i().isEmpty()) {
            TrendingKt.b(viewModel.U0().i(), viewModel.U0().j(), new SearchFocusFragment$TrendingContainer$2(viewModel), 0.0f, h11, 8, 8);
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.search.SearchFocusFragment$TrendingContainer$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i12) {
                    SearchFocusFragment.this.K(viewModel, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }

    public final SearchFocusViewModel.b d0() {
        SearchFocusViewModel.b bVar = this.J;
        if (bVar != null) {
            return bVar;
        }
        kotlin.jvm.internal.o.w("factory");
        return null;
    }

    public final SearchSharedViewModel.a e0() {
        SearchSharedViewModel.a aVar = this.H;
        if (aVar != null) {
            return aVar;
        }
        kotlin.jvm.internal.o.w("factorySearchSharedViewModel");
        return null;
    }

    public final SearchSharedViewModel k0() {
        return (SearchSharedViewModel) this.I.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.fragments.BaseViewModelFragment
    /* renamed from: l0 */
    public SearchFocusViewModel B() {
        return (SearchFocusViewModel) this.K.getValue();
    }

    @Override // com.forsale.app.base.fragments.a
    protected int o() {
        return this.A;
    }

    @Override // com.forsale.app.base.fragments.BaseViewModelFragment, com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.o.i(inflater, "inflater");
        super.onCreateView(inflater, viewGroup, bundle);
        Context requireContext = requireContext();
        kotlin.jvm.internal.o.h(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.f8797b);
        composeView.setContent(r0.b.c(-1342216839, true, new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.search.SearchFocusFragment$onCreateView$1$1
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
                    androidx.compose.runtime.c.U(-1342216839, i11, -1, "com.forsale.app.features.search.SearchFocusFragment.onCreateView.<anonymous>.<anonymous> (SearchFocusFragment.kt:88)");
                }
                final SearchFocusFragment searchFocusFragment = SearchFocusFragment.this;
                ThemeKt.a(null, null, r0.b.b(aVar, 1680837954, true, new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.search.SearchFocusFragment$onCreateView$1$1.1
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i12) {
                        if ((i12 & 11) == 2 && aVar2.i()) {
                            aVar2.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(1680837954, i12, -1, "com.forsale.app.features.search.SearchFocusFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (SearchFocusFragment.kt:89)");
                        }
                        SearchFocusFragment.this.H(aVar2, 8);
                        SearchFocusFragment searchFocusFragment2 = SearchFocusFragment.this;
                        aVar2.C(-483455358);
                        c.a aVar3 = androidx.compose.ui.c.f7566a;
                        androidx.compose.ui.layout.a0 a11 = androidx.compose.foundation.layout.e.a(Arrangement.f3698a.h(), v0.b.f74009a.k(), aVar2, 0);
                        aVar2.C(-1323940314);
                        int a12 = j0.e.a(aVar2, 0);
                        j0.k s11 = aVar2.s();
                        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                        g00.a<ComposeUiNode> a13 = companion.a();
                        g00.q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c11 = LayoutKt.c(aVar3);
                        if (!(aVar2.k() instanceof j0.d)) {
                            j0.e.c();
                        }
                        aVar2.I();
                        if (aVar2.f()) {
                            aVar2.y(a13);
                        } else {
                            aVar2.t();
                        }
                        androidx.compose.runtime.a a14 = Updater.a(aVar2);
                        Updater.c(a14, a11, companion.e());
                        Updater.c(a14, s11, companion.g());
                        g00.p<ComposeUiNode, Integer, wz.p> b11 = companion.b();
                        if (a14.f() || !kotlin.jvm.internal.o.d(a14.D(), Integer.valueOf(a12))) {
                            a14.u(Integer.valueOf(a12));
                            a14.p(Integer.valueOf(a12), b11);
                        }
                        c11.invoke(e1.a(e1.b(aVar2)), aVar2, 0);
                        aVar2.C(2058660585);
                        w.f fVar = w.f.f74891a;
                        searchFocusFragment2.J(aVar2, 8);
                        searchFocusFragment2.I(null, aVar2, 64, 1);
                        aVar2.S();
                        aVar2.w();
                        aVar2.S();
                        aVar2.S();
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
    public void onResume() {
        super.onResume();
        CrashlyticsUtilsKt.b("post ad search focus", null, 2, null);
        B().x1();
    }

    @Override // com.forsale.app.base.fragments.BaseViewModelFragment, com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.o.i(view, "view");
        super.onViewCreated(view, bundle);
        q0();
    }
}
