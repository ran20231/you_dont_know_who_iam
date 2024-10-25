package com.forsale.app.features.search;

import aa.ga;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.base.ActionViewsMode;
import com.forsale.app.datalayer.database.TrendEntity;
import com.forsale.app.features.categories.listings.ListingsTypes;
import com.forsale.app.features.maincontainer.MainContainerActivity;
import com.forsale.app.features.maincontainer.MainContainerViewModel;
import com.forsale.app.features.search.SearchActivity;
import com.forsale.app.features.search.SearchViewModel;
import com.forsale.app.features.search.e0;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7;
import com.forsale.app.utils.analytics.AnalyticsListingsSource;
import com.forsale.app.utils.analytics.PLFSource;
import com.forsale.app.utils.analytics.SearchSource;
import com.google.android.gms.ads.AdRequest;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Triple;
import kotlinx.coroutines.flow.FlowCollector;
import lj.a;
import okhttp3.internal.http2.Http2;
import t9.p0;
import t9.t0;
import t9.y0;
/* compiled from: SearchFragment.kt */
/* loaded from: classes2.dex */
public final class SearchFragment extends com.forsale.app.features.search.d<ga, SearchViewModel> {
    private final int E = t0.f70199e2;
    private final int F = t0.V0;
    private final int G = t0.S0;
    private final wz.h H = FragmentViewModelLazyKt.b(this, kotlin.jvm.internal.s.b(MainContainerViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.features.search.SearchFragment$special$$inlined$activityViewModels$default$1
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
    }, new g00.a<w3.a>() { // from class: com.forsale.app.features.search.SearchFragment$special$$inlined$activityViewModels$default$2
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
    }, new g00.a<t0.b>() { // from class: com.forsale.app.features.search.SearchFragment$special$$inlined$activityViewModels$default$3
        {
            super(0);
        }

        @Override // g00.a
        /* renamed from: b */
        public final t0.b invoke() {
            t0.b defaultViewModelProviderFactory = Fragment.this.requireActivity().getDefaultViewModelProviderFactory();
            kotlin.jvm.internal.o.h(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    });
    public SearchViewModel.a I;
    private final wz.h J;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements FlowCollector<wz.p> {
        a() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(wz.p pVar, zz.a<? super wz.p> aVar) {
            Context context = SearchFragment.this.getContext();
            if (context != null) {
                SearchActivity.a.b(SearchActivity.B, context, null, 1, null);
            }
            return wz.p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b implements FlowCollector<wz.p> {
        b() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(wz.p pVar, zz.a<? super wz.p> aVar) {
            z3.n a11;
            a11 = e0.f36983a.a((r32 & 1) != 0 ? ListingsTypes.NORMAL_LISTINGS : ListingsTypes.SPOTLIGHT_ALL, (r32 & 2) != 0 ? null : SearchFragment.this.getString(y0.f70459fe), (r32 & 4) != 0 ? -1 : 0, (r32 & 8) != 0 ? null : null, (r32 & 16) != 0 ? null : null, (r32 & 32) != 0 ? null : null, (r32 & 64) != 0 ? AnalyticsListingsSource.MORE : null, (r32 & 128) != 0 ? null : null, (r32 & 256) != 0 ? -1 : 0, (r32 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? SearchSource.SEARCH_BAR : null, (r32 & 1024) != 0 ? 0 : 0, (r32 & RecyclerView.l.FLAG_MOVED) == 0 ? 0 : -1, (r32 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0, (r32 & 8192) != 0 ? p0.f69709i : p0.f69712l, (r32 & Http2.INITIAL_MAX_FRAME_SIZE) == 0 ? null : null);
            androidx.navigation.fragment.a.a(SearchFragment.this).d0(a11);
            return wz.p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c implements FlowCollector<PLFSource> {
        c() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(PLFSource pLFSource, zz.a<? super wz.p> aVar) {
            SearchFragment.this.c0(pLFSource);
            return wz.p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchFragment.kt */
    /* loaded from: classes2.dex */
    public static final class d implements androidx.lifecycle.c0<List<? extends TrendEntity>> {
        d() {
        }

        @Override // androidx.lifecycle.c0
        /* renamed from: a */
        public final void onChanged(List<TrendEntity> list) {
            SearchViewModel B = SearchFragment.this.B();
            kotlin.jvm.internal.o.f(list);
            B.D1(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchFragment.kt */
    /* loaded from: classes2.dex */
    public static final class e implements FlowCollector<Triple<? extends String, ? extends SearchSource, ? extends Integer>> {
        e() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(Triple<String, ? extends SearchSource, Integer> triple, zz.a<? super wz.p> aVar) {
            if (triple != null) {
                SearchFragment.this.Y().K1(triple.d());
                SearchFragment.this.b0(triple.d(), triple.e(), triple.f().intValue());
            }
            return wz.p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchFragment.kt */
    /* loaded from: classes2.dex */
    public static final class f implements androidx.lifecycle.c0<Boolean> {
        f() {
        }

        @Override // androidx.lifecycle.c0
        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            kotlin.jvm.internal.o.f(bool);
            if (bool.booleanValue()) {
                SearchFragment.Q(SearchFragment.this).P.c();
            } else {
                SearchFragment.Q(SearchFragment.this).P.d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchFragment.kt */
    /* loaded from: classes2.dex */
    public static final class g implements androidx.lifecycle.c0, kotlin.jvm.internal.k {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ g00.l f36809a;

        g(g00.l function) {
            kotlin.jvm.internal.o.i(function, "function");
            this.f36809a = function;
        }

        @Override // kotlin.jvm.internal.k
        public final wz.e<?> c() {
            return this.f36809a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.c0) || !(obj instanceof kotlin.jvm.internal.k)) {
                return false;
            }
            return kotlin.jvm.internal.o.d(c(), ((kotlin.jvm.internal.k) obj).c());
        }

        public final int hashCode() {
            return c().hashCode();
        }

        @Override // androidx.lifecycle.c0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f36809a.invoke(obj);
        }
    }

    public SearchFragment() {
        wz.h b11;
        g00.a<t0.b> aVar = new g00.a<t0.b>() { // from class: com.forsale.app.features.search.SearchFragment$special$$inlined$assistedViewModel$1

            /* compiled from: ViewModelHiltExtension.kt */
            /* loaded from: classes2.dex */
            public static final class a extends androidx.lifecycle.a {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ SearchFragment f36802f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Fragment fragment, Bundle bundle, SearchFragment searchFragment) {
                    super(fragment, bundle);
                    this.f36802f = searchFragment;
                }

                @Override // androidx.lifecycle.a
                protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                    kotlin.jvm.internal.o.i(key, "key");
                    kotlin.jvm.internal.o.i(modelClass, "modelClass");
                    kotlin.jvm.internal.o.i(handle, "handle");
                    SearchViewModel a11 = this.f36802f.X().a();
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
        this.J = FragmentViewModelLazyKt.b(this, kotlin.jvm.internal.s.b(SearchViewModel.class), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6(b11), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7(null, b11), aVar);
    }

    public static final /* synthetic */ ga Q(SearchFragment searchFragment) {
        return (ga) searchFragment.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MainContainerViewModel Y() {
        return (MainContainerViewModel) this.H.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b0(String str, SearchSource searchSource, int i11) {
        androidx.navigation.fragment.a.a(this).d0(e0.c.d(e0.f36983a, str, true, searchSource, 0, i11, 8, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0(PLFSource pLFSource) {
        Context context = getContext();
        if (context != null && (context instanceof MainContainerActivity)) {
            ((MainContainerActivity) context).s(pLFSource);
        }
    }

    private final void d0() {
        SearchAdapter searchAdapter = SearchAdapter.f36631a;
        androidx.lifecycle.s viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        final lr.c<x9.b<?>, kr.m<?>> invoke = searchAdapter.invoke(viewLifecycleOwner);
        final kr.b i11 = kr.b.f61943t.i(invoke);
        OneShotEventHandler<wz.p> m12 = B().m1();
        androidx.lifecycle.s viewLifecycleOwner2 = getViewLifecycleOwner();
        kotlin.jvm.internal.o.h(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        m12.h(viewLifecycleOwner2, new a());
        OneShotEventHandler<wz.p> n12 = B().n1();
        androidx.lifecycle.s viewLifecycleOwner3 = getViewLifecycleOwner();
        kotlin.jvm.internal.o.h(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        n12.h(viewLifecycleOwner3, new b());
        OneShotEventHandler<PLFSource> i12 = B().i1();
        androidx.lifecycle.s viewLifecycleOwner4 = getViewLifecycleOwner();
        kotlin.jvm.internal.o.h(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        i12.h(viewLifecycleOwner4, new c());
        B().l1().observe(getViewLifecycleOwner(), new g(new g00.l<List<? extends x9.b<?>>, wz.p>() { // from class: com.forsale.app.features.search.SearchFragment$registerObservers$4
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(List<? extends x9.b<?>> list) {
                RecyclerView recyclerView = SearchFragment.Q(SearchFragment.this).O;
                SearchFragment searchFragment = SearchFragment.this;
                kr.b<kr.m<?>> bVar = i11;
                RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.y1(a.C0733a.b(searchFragment.B(), null, 1, null));
                }
                recyclerView.setAdapter(bVar);
                lr.c<x9.b<?>, kr.m<?>> cVar = invoke;
                kotlin.jvm.internal.o.f(list);
                cVar.C(list);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(List<? extends x9.b<?>> list) {
                b(list);
                return wz.p.f75480a;
            }
        }));
        FlowLiveDataConversions.c(B().p1(), null, 0L, 3, null).observe(getViewLifecycleOwner(), new d());
        OneShotEventHandler<Triple<String, SearchSource, Integer>> j12 = B().j1();
        androidx.lifecycle.s viewLifecycleOwner5 = getViewLifecycleOwner();
        kotlin.jvm.internal.o.h(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
        j12.h(viewLifecycleOwner5, new e());
        B().o1().observe(getViewLifecycleOwner(), new f());
    }

    @Override // com.forsale.app.base.fragments.b
    protected int E() {
        return this.G;
    }

    @Override // com.forsale.app.base.fragments.b
    protected int H() {
        return this.F;
    }

    public final SearchViewModel.a X() {
        SearchViewModel.a aVar = this.I;
        if (aVar != null) {
            return aVar;
        }
        kotlin.jvm.internal.o.w("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.fragments.BaseViewModelFragment
    /* renamed from: a0 */
    public SearchViewModel B() {
        return (SearchViewModel) this.J.getValue();
    }

    @Override // com.forsale.app.base.fragments.a
    protected int o() {
        return this.E;
    }

    @Override // com.forsale.app.base.fragments.BaseViewModelFragment, com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Parcelable parcelable;
        SearchViewModel B = B();
        RecyclerView.o layoutManager = ((ga) m()).O.getLayoutManager();
        if (layoutManager != null) {
            parcelable = layoutManager.z1();
        } else {
            parcelable = null;
        }
        a.C0733a.d(B, parcelable, null, 2, null);
        ((ga) m()).O.setAdapter(null);
        super.onDestroyView();
    }

    @v9.a(viewId = {ActionViewsMode.ERROR_REFRESH})
    public final void onError(View view) {
        kotlin.jvm.internal.o.i(view, "view");
        B().t1();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        B().J1();
        B().N1();
        super.onResume();
    }

    @Override // com.forsale.app.base.fragments.BaseViewModelFragment, com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.o.i(view, "view");
        super.onViewCreated(view, bundle);
        B().e1();
        d0();
    }
}
