package com.forsale.app.features.categories.normal;

import aa.qa;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.c0;
import androidx.lifecycle.l;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.database.CategoryWithSubCategories;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.features.categories.listings.ListingsAdapter;
import com.forsale.app.features.categories.listings.category.CategoryListingsAnalyticSource;
import com.forsale.app.features.categories.listings.items.promotedPost.PromotedPostItem;
import com.forsale.app.features.categories.normal.b;
import com.forsale.app.features.maincontainer.MainContainerViewModel;
import com.forsale.app.utils.CrashlyticsUtilsKt;
import com.forsale.app.utils.LifeCycleUtilsKt;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.TypeExtensionsKt;
import com.forsale.app.utils.analytics.SubCategoriesPosition;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import java.io.Serializable;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.q;
import kotlin.collections.r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.FlowCollector;
import kr.b;
import kr.m;
import kr.n;
import lj.a;
import lr.c;
import t9.y0;
import w3.a;
import wz.h;
import wz.p;
/* compiled from: SubCategoriesFragment.kt */
/* loaded from: classes2.dex */
public final class SubCategoriesFragment extends id.c<qa, SubCategoriesViewModel> {
    public static final a Q = new a(null);
    public static final int R = 8;
    private final wz.h A;
    private final wz.h B;
    private final int C;
    private final boolean D;
    private final wz.h E;
    private final wz.h F;
    private final wz.h G;
    private final lr.a<m<?>> H;
    private final lr.a<m<?>> I;
    private final lr.a<m<?>> J;
    private final wz.h K;
    private final kr.b<m<?>> L;
    private final wz.h M;
    private final wz.h N;
    private final wz.h O;
    public ApplicationResourcesRepository P;

    /* compiled from: SubCategoriesFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SubCategoriesFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b implements FlowCollector<List<? extends CategoryWithSubCategories>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CategoryEntity f31017a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SubCategoriesFragment f31018b;

        b(CategoryEntity categoryEntity, SubCategoriesFragment subCategoriesFragment) {
            this.f31017a = categoryEntity;
            this.f31018b = subCategoriesFragment;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(List<CategoryWithSubCategories> list, zz.a<? super p> aVar) {
            if (list != null) {
                if (TypeExtensionsKt.i0(this.f31017a.isExpendable())) {
                    this.f31018b.a0(list, this.f31017a.getFullPath());
                } else {
                    this.f31018b.d0(this.f31017a.getId(), this.f31017a.getFullPath(), list);
                }
            }
            return p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SubCategoriesFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c implements c0<List<? extends qc.b<?>>> {
        c() {
        }

        @Override // androidx.lifecycle.c0
        /* renamed from: a */
        public final void onChanged(List<? extends qc.b<?>> list) {
            lr.c k02 = SubCategoriesFragment.this.k0();
            o.f(list);
            n.a.a(k02, list, false, 2, null);
            if (list.isEmpty()) {
                SubCategoriesFragment.this.B0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SubCategoriesFragment.kt */
    /* loaded from: classes2.dex */
    public static final class d implements FlowCollector<p> {
        d() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(p pVar, zz.a<? super p> aVar) {
            SubCategoriesFragment.this.D0();
            return p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SubCategoriesFragment.kt */
    /* loaded from: classes2.dex */
    public static final class e implements FlowCollector<p> {
        e() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(p pVar, zz.a<? super p> aVar) {
            x10.a.b("PROMOTED: hidePromotedPost.observe", new Object[0]);
            SubCategoriesFragment.this.s0();
            return p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SubCategoriesFragment.kt */
    /* loaded from: classes2.dex */
    public static final class f implements c0<Boolean> {
        f() {
        }

        @Override // androidx.lifecycle.c0
        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            if (a.C0733a.b(SubCategoriesFragment.this.B(), null, 1, null) == null) {
                o.f(bool);
                if (bool.booleanValue()) {
                    SubCategoriesFragment.this.k0().A(ed.a.f54783j.a());
                } else {
                    SubCategoriesFragment.this.k0().n(SubCategoriesFragment.this.B().U0());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SubCategoriesFragment.kt */
    /* loaded from: classes2.dex */
    public static final class g implements FlowCollector<CategoryEntity> {
        g() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(CategoryEntity categoryEntity, zz.a<? super p> aVar) {
            SubCategoriesFragment.this.w0(categoryEntity);
            return p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SubCategoriesFragment.kt */
    /* loaded from: classes2.dex */
    public static final class h implements FlowCollector<CategoryEntity> {
        h() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(CategoryEntity categoryEntity, zz.a<? super p> aVar) {
            SubCategoriesFragment.this.v0(categoryEntity);
            return p.f75480a;
        }
    }

    public SubCategoriesFragment() {
        final wz.h b11;
        wz.h a11;
        wz.h a12;
        wz.h a13;
        wz.h a14;
        List e11;
        wz.h a15;
        wz.h a16;
        wz.h a17;
        final g00.a<Fragment> aVar = new g00.a<Fragment>() { // from class: com.forsale.app.features.categories.normal.SubCategoriesFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        b11 = kotlin.d.b(LazyThreadSafetyMode.NONE, new g00.a<x0>() { // from class: com.forsale.app.features.categories.normal.SubCategoriesFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final x0 invoke() {
                return (x0) g00.a.this.invoke();
            }
        });
        this.A = FragmentViewModelLazyKt.b(this, s.b(SubCategoriesViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.features.categories.normal.SubCategoriesFragment$special$$inlined$viewModels$default$3
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
        }, new g00.a<w3.a>() { // from class: com.forsale.app.features.categories.normal.SubCategoriesFragment$special$$inlined$viewModels$default$4
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
        }, new g00.a<t0.b>() { // from class: com.forsale.app.features.categories.normal.SubCategoriesFragment$special$$inlined$viewModels$default$5
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
        this.B = FragmentViewModelLazyKt.b(this, s.b(MainContainerViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.features.categories.normal.SubCategoriesFragment$special$$inlined$activityViewModels$default$1
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
        }, new g00.a<w3.a>() { // from class: com.forsale.app.features.categories.normal.SubCategoriesFragment$special$$inlined$activityViewModels$default$2
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
        }, new g00.a<t0.b>() { // from class: com.forsale.app.features.categories.normal.SubCategoriesFragment$special$$inlined$activityViewModels$default$3
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
        this.C = t9.t0.f70234j2;
        a11 = kotlin.d.a(new g00.a<CategoryEntity>() { // from class: com.forsale.app.features.categories.normal.SubCategoriesFragment$parentCategory$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final CategoryEntity invoke() {
                Bundle arguments = SubCategoriesFragment.this.getArguments();
                if (arguments != null) {
                    return (CategoryEntity) arguments.getParcelable("PARENT_CATEGORY");
                }
                return null;
            }
        });
        this.E = a11;
        a12 = kotlin.d.a(new g00.a<SubCategoriesPosition>() { // from class: com.forsale.app.features.categories.normal.SubCategoriesFragment$position$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final SubCategoriesPosition invoke() {
                Bundle arguments = SubCategoriesFragment.this.getArguments();
                if (arguments == null) {
                    return null;
                }
                Serializable serializable = arguments.getSerializable("SUB_CATEGORIES_POSITION");
                if (!(serializable instanceof SubCategoriesPosition)) {
                    return null;
                }
                return (SubCategoriesPosition) serializable;
            }
        });
        this.F = a12;
        a13 = kotlin.d.a(new g00.a<lr.c<x9.b<?>, m<?>>>() { // from class: com.forsale.app.features.categories.normal.SubCategoriesFragment$featuredAdsAdapter$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final c<x9.b<?>, m<?>> invoke() {
                ListingsAdapter listingsAdapter = ListingsAdapter.f27997a;
                androidx.lifecycle.s viewLifecycleOwner = SubCategoriesFragment.this.getViewLifecycleOwner();
                o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                return listingsAdapter.invoke(viewLifecycleOwner);
            }
        });
        this.G = a13;
        this.H = new lr.a<>();
        this.I = new lr.a<>();
        lr.a<m<?>> aVar2 = new lr.a<>();
        this.J = aVar2;
        a14 = kotlin.d.a(new g00.a<kr.b<m<?>>>() { // from class: com.forsale.app.features.categories.normal.SubCategoriesFragment$fastAdapter$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final kr.b<m<?>> invoke() {
                lr.a aVar3;
                List q11;
                b.a aVar4 = kr.b.f61943t;
                aVar3 = SubCategoriesFragment.this.I;
                q11 = r.q(SubCategoriesFragment.this.k0(), aVar3);
                return aVar4.g(q11);
            }
        });
        this.K = a14;
        b.a aVar3 = kr.b.f61943t;
        e11 = q.e(aVar2);
        this.L = aVar3.g(e11);
        a15 = kotlin.d.a(new g00.a<kr.b<m<?>>>() { // from class: com.forsale.app.features.categories.normal.SubCategoriesFragment$fastAdapterPromoted$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final kr.b<m<?>> invoke() {
                lr.a aVar4;
                List e12;
                b.a aVar5 = kr.b.f61943t;
                aVar4 = SubCategoriesFragment.this.H;
                e12 = q.e(aVar4);
                return aVar5.g(e12);
            }
        });
        this.M = a15;
        a16 = kotlin.d.a(new g00.a<FrameLayout>() { // from class: com.forsale.app.features.categories.normal.SubCategoriesFragment$fixedBanner$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final FrameLayout invoke() {
                return SubCategoriesFragment.J(SubCategoriesFragment.this).O;
            }
        });
        this.N = a16;
        a17 = kotlin.d.a(new g00.a<AdManagerAdView>() { // from class: com.forsale.app.features.categories.normal.SubCategoriesFragment$adView$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final AdManagerAdView invoke() {
                Context context = SubCategoriesFragment.this.getContext();
                if (context != null) {
                    SubCategoriesFragment subCategoriesFragment = SubCategoriesFragment.this;
                    AdManagerAdView adManagerAdView = new AdManagerAdView(context);
                    adManagerAdView.setAdSizes(AdSize.BANNER);
                    adManagerAdView.setAdUnitId(subCategoriesFragment.getString(y0.f70444f));
                    return adManagerAdView;
                }
                return null;
            }
        });
        this.O = a17;
    }

    private final void A0() {
        if (!this.H.r().isEmpty()) {
            this.H.r().clear();
            this.H.q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B0() {
        ((qa) m()).R.C1(-10);
    }

    private final void C0() {
        g0();
        f0();
        e0();
        u0();
        b0();
        Y();
        c0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D0() {
        Pair<m<?>, Integer> pair;
        kr.b<m<?>> a11 = this.H.a();
        if (a11 != null) {
            pair = a11.o(PromotedPostItem.f30847k.a());
        } else {
            pair = null;
        }
        if (pair == null) {
            x10.a.b("PROMOTED: showPromotedPost", new Object[0]);
            PromotedPostItem promotedPostItem = new PromotedPostItem(B().Z0(), this);
            promotedPostItem.o(PromotedPostItem.f30847k.a());
            this.H.n(promotedPostItem);
            return;
        }
        B().Z0().Y();
    }

    public static final /* synthetic */ qa J(SubCategoriesFragment subCategoriesFragment) {
        return (qa) subCategoriesFragment.m();
    }

    private final void Y() {
        B().C0();
        CategoryEntity o02 = o0();
        if (o02 != null) {
            OneShotEventHandler<List<CategoryWithSubCategories>> x02 = B().x0();
            androidx.lifecycle.s viewLifecycleOwner = getViewLifecycleOwner();
            o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            x02.h(viewLifecycleOwner, new b(o02, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a0(List<CategoryWithSubCategories> list, String str) {
        for (CategoryWithSubCategories categoryWithSubCategories : list) {
            this.I.n(new oa.a(new oa.b(categoryWithSubCategories, B().d1(), str), this, q0()));
        }
    }

    private final void b0() {
        B().V0().observe(getViewLifecycleOwner(), new c());
    }

    private final void c0() {
        FrameLayout l02 = l0();
        l02.removeAllViewsInLayout();
        l02.addView(h0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d0(int i11, String str, List<CategoryWithSubCategories> list) {
        this.I.n(new id.b(i11, str, list, B().d1(), this, q0()));
    }

    private final void e0() {
        LifeCycleUtilsKt.b(this, new SubCategoriesFragment$bindObservers$1(this, null));
        OneShotEventHandler<p> c12 = B().c1();
        androidx.lifecycle.s viewLifecycleOwner = getViewLifecycleOwner();
        o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        c12.h(viewLifecycleOwner, new d());
        OneShotEventHandler<p> X0 = B().X0();
        androidx.lifecycle.s viewLifecycleOwner2 = getViewLifecycleOwner();
        o.h(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        X0.h(viewLifecycleOwner2, new e());
        B().W0().observe(getViewLifecycleOwner(), new f());
    }

    private final void f0() {
        RecyclerView recyclerView = ((qa) m()).R;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(i0());
        RecyclerView recyclerView2 = ((qa) m()).P;
        recyclerView2.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext()));
        recyclerView2.setAdapter(this.L);
        RecyclerView recyclerView3 = ((qa) m()).Q;
        recyclerView3.setLayoutManager(new LinearLayoutManager(recyclerView3.getContext()));
        recyclerView3.setAdapter(j0());
    }

    private final void g0() {
        A0();
        if (!k0().r().isEmpty()) {
            k0().r().clear();
            k0().q();
        }
        if (!this.I.r().isEmpty()) {
            this.I.r().clear();
            this.I.q();
        }
        z0();
    }

    private final AdManagerAdView h0() {
        return (AdManagerAdView) this.O.getValue();
    }

    private final kr.b<m<?>> i0() {
        return (kr.b) this.K.getValue();
    }

    private final kr.b<m<?>> j0() {
        return (kr.b) this.M.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final lr.c<x9.b<?>, m<?>> k0() {
        return (lr.c) this.G.getValue();
    }

    private final FrameLayout l0() {
        return (FrameLayout) this.N.getValue();
    }

    private final MainContainerViewModel m0() {
        return (MainContainerViewModel) this.B.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CategoryEntity o0() {
        return (CategoryEntity) this.E.getValue();
    }

    private final SubCategoriesPosition p0() {
        return (SubCategoriesPosition) this.F.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s0() {
        A0();
        RecyclerView.Adapter adapter = ((qa) m()).Q.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    private final void t0(int i11) {
        AdManagerAdRequest R0 = B().R0(i11);
        AdManagerAdView h02 = h0();
        if (h02 != null) {
            h02.loadAd(R0);
        }
    }

    private final void u0() {
        RecyclerView.o layoutManager;
        p pVar = null;
        Parcelable b11 = a.C0733a.b(B(), null, 1, null);
        if (b11 != null && (layoutManager = ((qa) m()).R.getLayoutManager()) != null) {
            layoutManager.y1(b11);
            pVar = p.f75480a;
        }
        if (pVar == null) {
            B().Y0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v0(CategoryEntity categoryEntity) {
        if (categoryEntity != null) {
            androidx.navigation.fragment.a.a(this).d0(b.c.d(com.forsale.app.features.categories.normal.b.f31081a, categoryEntity, categoryEntity.getName(), new CategoryListingsAnalyticSource.SubCategoryPage(null, 1, null), null, null, null, null, null, false, 504, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w0(CategoryEntity categoryEntity) {
        String str;
        b.c cVar = com.forsale.app.features.categories.normal.b.f31081a;
        if (categoryEntity != null) {
            str = categoryEntity.getName();
        } else {
            str = null;
        }
        androidx.navigation.fragment.a.a(this).d0(b.c.b(cVar, categoryEntity, str, null, null, 12, null));
    }

    private final void y0() {
        OneShotEventHandler<CategoryEntity> A0 = B().A0();
        androidx.lifecycle.s viewLifecycleOwner = getViewLifecycleOwner();
        o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        A0.h(viewLifecycleOwner, new g());
        OneShotEventHandler<CategoryEntity> z02 = B().z0();
        androidx.lifecycle.s viewLifecycleOwner2 = getViewLifecycleOwner();
        o.h(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        z02.h(viewLifecycleOwner2, new h());
    }

    private final void z0() {
        if (!this.J.r().isEmpty()) {
            this.J.r().clear();
            this.J.q();
        }
    }

    @Override // com.forsale.app.base.fragments.BaseViewModelFragment
    protected boolean A() {
        return this.D;
    }

    @Override // com.forsale.app.base.fragments.a
    protected int o() {
        return this.C;
    }

    @Override // com.forsale.app.base.fragments.BaseViewModelFragment, com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        CategoryEntity o02 = o0();
        if (o02 != null) {
            t0(o02.getId());
        }
    }

    @Override // com.forsale.app.base.fragments.BaseViewModelFragment, com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.i(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        String str = null;
        if (onCreateView == null) {
            return null;
        }
        MainContainerViewModel m02 = m0();
        CategoryEntity o02 = o0();
        if (o02 != null) {
            str = o02.getName();
        }
        m02.K1(str);
        C0();
        y0();
        B().E0(p0());
        return onCreateView;
    }

    @Override // com.forsale.app.base.fragments.BaseViewModelFragment, com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Parcelable parcelable;
        SubCategoriesViewModel B = B();
        RecyclerView.o layoutManager = ((qa) m()).R.getLayoutManager();
        if (layoutManager != null) {
            parcelable = layoutManager.z1();
        } else {
            parcelable = null;
        }
        a.C0733a.d(B, parcelable, null, 2, null);
        ((qa) m()).R.setAdapter(null);
        super.onDestroyView();
        g0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z11) {
        super.onHiddenChanged(z11);
        if (!z11) {
            B().E0(p0());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        B().S0();
        B().i1();
    }

    @Override // com.forsale.app.base.fragments.BaseViewModelFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        B().T0();
    }

    @Override // com.forsale.app.base.fragments.BaseViewModelFragment, com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.i(view, "view");
        super.onViewCreated(view, bundle);
        CrashlyticsUtilsKt.a("Sub Categories", new g00.l<tn.b, p>() { // from class: com.forsale.app.features.categories.normal.SubCategoriesFragment$onViewCreated$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(tn.b logScreenVisited) {
                CategoryEntity o02;
                CategoryEntity o03;
                String num;
                String nameEn;
                o.i(logScreenVisited, "$this$logScreenVisited");
                o02 = SubCategoriesFragment.this.o0();
                if (o02 != null && (nameEn = o02.getNameEn()) != null) {
                    logScreenVisited.b("category_name", nameEn);
                }
                o03 = SubCategoriesFragment.this.o0();
                if (o03 != null && (num = Integer.valueOf(o03.getId()).toString()) != null) {
                    logScreenVisited.b("category_id", num);
                }
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(tn.b bVar) {
                b(bVar);
                return p.f75480a;
            }
        });
    }

    public final ApplicationResourcesRepository q0() {
        ApplicationResourcesRepository applicationResourcesRepository = this.P;
        if (applicationResourcesRepository != null) {
            return applicationResourcesRepository;
        }
        o.w("resourcesRepository");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.fragments.BaseViewModelFragment
    /* renamed from: r0 */
    public SubCategoriesViewModel B() {
        return (SubCategoriesViewModel) this.A.getValue();
    }

    public final void x0(CategoryEntity categoryEntity) {
        B().w0(categoryEntity);
    }
}
