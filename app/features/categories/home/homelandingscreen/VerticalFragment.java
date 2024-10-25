package com.forsale.app.features.categories.home.homelandingscreen;

import aa.ua;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.fragment.app.p;
import androidx.lifecycle.c0;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.t;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.base.ActionViewsMode;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.features.categories.home.CategoriesNavGraphViewModel;
import com.forsale.app.features.categories.home.homelandingscreen.b;
import com.forsale.app.features.categories.listingdetails.ListingDetailsActivity;
import com.forsale.app.features.categories.listingdetails.ListingDetailsOwnerActions;
import com.forsale.app.features.categories.listings.ListingsTypes;
import com.forsale.app.features.categories.listings.category.CategoryListingsAnalyticSource;
import com.forsale.app.features.categories.normal.SubCategoryAnalyticsSource;
import com.forsale.app.features.maincontainer.MainContainerActivity;
import com.forsale.app.features.maincontainer.MainContainerViewModel;
import com.forsale.app.utils.CrashlyticsUtilsKt;
import com.forsale.app.utils.FragmentsExtensionsKt;
import com.forsale.app.utils.LifeCycleUtilsKt;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedNavGraphViewModel$$inlined$navGraphViewModels$default$1;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedNavGraphViewModel$$inlined$navGraphViewModels$default$2;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedNavGraphViewModel$$inlined$navGraphViewModels$default$3;
import com.forsale.app.utils.analytics.AnalyticsDetailsSource;
import com.forsale.app.utils.analytics.SubCategoriesPosition;
import com.forsale.app.utils.itemutils.TextHolder;
import com.forsale.app.utils.popUpsPrioritizer.PopUpType;
import com.google.android.gms.ads.AdRequest;
import g00.l;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.q;
import kotlin.collections.r;
import kotlin.d;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kr.b;
import kr.m;
import kr.n;
import lj.a;
import lr.c;
import okhttp3.internal.http2.Http2;
import t9.p0;
import t9.r0;
import w3.a;
import wz.e;
import wz.h;
import z3.i;
/* compiled from: VerticalFragment.kt */
/* loaded from: classes2.dex */
public final class VerticalFragment extends ra.a<ua, VerticalViewModel> {
    private final h E;
    private final int F;
    private final int G;
    private final int H;
    private ij.a I;
    private ij.a J;
    public CategoriesNavGraphViewModel.b K;
    private final h L;
    public cx.a<ag.a> M;
    private final i N;
    private final h O;
    private final h P;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VerticalFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements c0<List<? extends x9.b<?>>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c<x9.b<?>, m<?>> f23842a;

        a(c<x9.b<?>, m<?>> cVar) {
            this.f23842a = cVar;
        }

        @Override // androidx.lifecycle.c0
        /* renamed from: a */
        public final void onChanged(List<? extends x9.b<?>> list) {
            if (this.f23842a.e() > 0) {
                return;
            }
            c<x9.b<?>, m<?>> cVar = this.f23842a;
            o.f(list);
            n.a.a(cVar, list, false, 2, null);
        }
    }

    /* compiled from: VerticalFragment.kt */
    /* loaded from: classes2.dex */
    static final class b implements c0, k {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f23843a;

        b(l function) {
            o.i(function, "function");
            this.f23843a = function;
        }

        @Override // kotlin.jvm.internal.k
        public final e<?> c() {
            return this.f23843a;
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
            this.f23843a.invoke(obj);
        }
    }

    public VerticalFragment() {
        final h b11;
        h a11;
        h a12;
        final g00.a<Fragment> aVar = new g00.a<Fragment>() { // from class: com.forsale.app.features.categories.home.homelandingscreen.VerticalFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        b11 = d.b(LazyThreadSafetyMode.NONE, new g00.a<x0>() { // from class: com.forsale.app.features.categories.home.homelandingscreen.VerticalFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final x0 invoke() {
                return (x0) g00.a.this.invoke();
            }
        });
        this.E = FragmentViewModelLazyKt.b(this, s.b(VerticalViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.features.categories.home.homelandingscreen.VerticalFragment$special$$inlined$viewModels$default$3
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
        }, new g00.a<w3.a>() { // from class: com.forsale.app.features.categories.home.homelandingscreen.VerticalFragment$special$$inlined$viewModels$default$4
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
        }, new g00.a<t0.b>() { // from class: com.forsale.app.features.categories.home.homelandingscreen.VerticalFragment$special$$inlined$viewModels$default$5
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
        this.F = t9.t0.f70248l2;
        this.G = t9.t0.V0;
        this.H = t9.t0.S0;
        int i11 = r0.f69875d6;
        g00.a<t0.b> aVar2 = new g00.a<t0.b>() { // from class: com.forsale.app.features.categories.home.homelandingscreen.VerticalFragment$special$$inlined$assistedNavGraphViewModel$1

            /* compiled from: ViewModelHiltExtension.kt */
            /* loaded from: classes2.dex */
            public static final class a extends androidx.lifecycle.a {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ VerticalFragment f23833f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Fragment fragment, Bundle bundle, VerticalFragment verticalFragment) {
                    super(fragment, bundle);
                    this.f23833f = verticalFragment;
                }

                @Override // androidx.lifecycle.a
                protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                    o.i(key, "key");
                    o.i(modelClass, "modelClass");
                    o.i(handle, "handle");
                    CategoriesNavGraphViewModel a11 = this.f23833f.p0().a(handle);
                    o.g(a11, "null cannot be cast to non-null type T of com.forsale.app.utils.ViewModelHiltExtensionKt.assistedNavGraphViewModel.<no name provided>.invoke.<no name provided>.create");
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
        a11 = d.a(new ViewModelHiltExtensionKt$assistedNavGraphViewModel$$inlined$navGraphViewModels$default$1(this, i11));
        this.L = FragmentViewModelLazyKt.b(this, s.b(CategoriesNavGraphViewModel.class), new ViewModelHiltExtensionKt$assistedNavGraphViewModel$$inlined$navGraphViewModels$default$2(a11), new ViewModelHiltExtensionKt$assistedNavGraphViewModel$$inlined$navGraphViewModels$default$3(null, a11), aVar2);
        this.N = new i(s.b(com.forsale.app.features.categories.home.homelandingscreen.a.class), new g00.a<Bundle>() { // from class: com.forsale.app.features.categories.home.homelandingscreen.VerticalFragment$special$$inlined$navArgs$1
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
        a12 = d.a(new g00.a<CategoryEntity>() { // from class: com.forsale.app.features.categories.home.homelandingscreen.VerticalFragment$parentCategory$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final CategoryEntity invoke() {
                a m02;
                m02 = VerticalFragment.this.m0();
                return m02.a();
            }
        });
        this.O = a12;
        this.P = FragmentViewModelLazyKt.b(this, s.b(MainContainerViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.features.categories.home.homelandingscreen.VerticalFragment$special$$inlined$activityViewModels$default$1
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
        }, new g00.a<w3.a>() { // from class: com.forsale.app.features.categories.home.homelandingscreen.VerticalFragment$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final w3.a invoke() {
                w3.a aVar3;
                g00.a aVar4 = g00.a.this;
                if (aVar4 == null || (aVar3 = (w3.a) aVar4.invoke()) == null) {
                    w3.a defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                    o.h(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                    return defaultViewModelCreationExtras;
                }
                return aVar3;
            }
        }, new g00.a<t0.b>() { // from class: com.forsale.app.features.categories.home.homelandingscreen.VerticalFragment$special$$inlined$activityViewModels$default$3
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
    }

    public static final /* synthetic */ ua Q(VerticalFragment verticalFragment) {
        return (ua) verticalFragment.m();
    }

    private final void h0() {
        List e11;
        c<x9.b<?>, m<?>> invoke = VerticalAdapter.f23825a.invoke(this);
        b.a aVar = kr.b.f61943t;
        e11 = q.e(invoke);
        kr.b g11 = aVar.g(e11);
        RecyclerView recyclerView = ((ua) m()).R;
        recyclerView.setAdapter(g11);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(recyclerView.getContext());
        linearLayoutManager.y1(a.C0733a.b(B(), null, 1, null));
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setItemViewCacheSize(4);
        B().s1().observe(getViewLifecycleOwner(), new a(invoke));
    }

    private final ij.a i0() {
        return new ij.a(PopUpType.IS_HOME_LOADING, B().D1(), B().k1());
    }

    private final ij.a j0() {
        return new ij.a(PopUpType.INTERSTITIALS, B().E1(), B().l1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CategoriesNavGraphViewModel k0() {
        return (CategoriesNavGraphViewModel) this.L.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MainContainerViewModel l0() {
        return (MainContainerViewModel) this.P.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.forsale.app.features.categories.home.homelandingscreen.a m0() {
        return (com.forsale.app.features.categories.home.homelandingscreen.a) this.N.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CategoryEntity o0() {
        return (CategoryEntity) this.O.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r0() {
        BuildersKt__Builders_commonKt.launch$default(t.a(this), null, null, new VerticalFragment$initializeInterstitial$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s0(int i11, AnalyticsDetailsSource analyticsDetailsSource, ListingDetailsOwnerActions listingDetailsOwnerActions) {
        Context context = getContext();
        if (context != null) {
            ListingDetailsActivity.R.a(context, (r33 & 1) != 0 ? null : null, (r33 & 2) != 0 ? null : null, (r33 & 4) != 0 ? -1 : i11, (r33 & 8) != 0 ? null : null, (r33 & 16) != 0 ? ListingsTypes.NORMAL_LISTINGS : null, (r33 & 32) != 0 ? null : analyticsDetailsSource.getValue(), (r33 & 64) != 0 ? null : null, (r33 & 128) != 0 ? null : listingDetailsOwnerActions, (r33 & 256) != 0 ? null : null, (r33 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : null, (r33 & 1024) != 0 ? false : false, (r33 & RecyclerView.l.FLAG_MOVED) == 0 ? 0 : -1, (r33 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : null, (r33 & 8192) == 0 ? null : null, (r33 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? r.n() : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void t0(VerticalFragment verticalFragment, int i11, AnalyticsDetailsSource analyticsDetailsSource, ListingDetailsOwnerActions listingDetailsOwnerActions, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            listingDetailsOwnerActions = null;
        }
        verticalFragment.s0(i11, analyticsDetailsSource, listingDetailsOwnerActions);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z3.n u0(CategoryEntity categoryEntity) {
        z3.n b11 = b.d.b(com.forsale.app.features.categories.home.homelandingscreen.b.f24084a, categoryEntity, categoryEntity.getName(), new CategoryListingsAnalyticSource.VerticalPage(null, 1, null), null, null, null, null, null, false, 504, null);
        FragmentsExtensionsKt.a(this, b11);
        return b11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v0(int i11) {
        String str;
        z<String> e11;
        b.d dVar = com.forsale.app.features.categories.home.homelandingscreen.b.f24084a;
        ListingsTypes listingsTypes = ListingsTypes.HOT_ZONES;
        TextHolder value = B().h1().getValue();
        if (value != null && (e11 = value.e()) != null) {
            str = e11.getValue();
        } else {
            str = null;
        }
        androidx.navigation.fragment.a.a(this).d0(b.d.d(dVar, listingsTypes, str, 0, null, null, null, i11, false, p0.f69712l, 0, null, null, 0, null, 15932, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z3.n w0(CategoryEntity categoryEntity, SubCategoriesPosition subCategoriesPosition) {
        z3.n e11 = com.forsale.app.features.categories.home.homelandingscreen.b.f24084a.e(categoryEntity, categoryEntity.getName(), subCategoriesPosition, new SubCategoryAnalyticsSource.VerticalPage(null, 1, null));
        FragmentsExtensionsKt.a(this, e11);
        return e11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x0(CategoryEntity categoryEntity) {
        String str;
        p requireActivity = requireActivity();
        o.g(requireActivity, "null cannot be cast to non-null type com.forsale.app.features.maincontainer.MainContainerActivity");
        Toolbar u12 = ((MainContainerActivity) requireActivity).u1();
        u12.setNavigationIcon(t9.q0.f69764j2);
        if (categoryEntity != null) {
            str = categoryEntity.getName();
        } else {
            str = null;
        }
        u12.setTitle(str);
    }

    private final void y0() {
        h0();
    }

    @Override // com.forsale.app.base.fragments.b
    protected int E() {
        return this.H;
    }

    @Override // com.forsale.app.base.fragments.b
    protected int H() {
        return this.G;
    }

    @Override // com.forsale.app.base.fragments.a
    protected int o() {
        return this.F;
    }

    @Override // com.forsale.app.base.fragments.b, com.forsale.app.base.fragments.BaseViewModelFragment, com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.i(inflater, "inflater");
        super.onCreateView(inflater, viewGroup, bundle);
        x0(o0());
        this.I = j0();
        r0();
        this.J = i0();
        BuildersKt__Builders_commonKt.launch$default(t.a(this), null, null, new VerticalFragment$onCreateView$1(this, null), 3, null);
        LifeCycleUtilsKt.b(this, new VerticalFragment$onCreateView$2(this, null));
        LifeCycleUtilsKt.b(this, new VerticalFragment$onCreateView$3(this, null));
        LifeCycleUtilsKt.b(this, new VerticalFragment$onCreateView$4(this, null));
        return ((ua) m()).getRoot();
    }

    @Override // com.forsale.app.base.fragments.BaseViewModelFragment, com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Parcelable parcelable;
        VerticalViewModel B = B();
        RecyclerView.o layoutManager = ((ua) m()).R.getLayoutManager();
        if (layoutManager != null) {
            parcelable = layoutManager.z1();
        } else {
            parcelable = null;
        }
        a.C0733a.d(B, parcelable, null, 2, null);
        RecyclerView recyclerView = ((ua) m()).R;
        recyclerView.setAdapter(null);
        recyclerView.setLayoutManager(null);
        super.onDestroyView();
        BuildersKt__Builders_commonKt.launch$default(t.a(this), null, null, new VerticalFragment$onDestroyView$2(this, null), 3, null);
    }

    @v9.a(viewId = {ActionViewsMode.ERROR_REFRESH})
    public final void onError(View view) {
        o.i(view, "view");
        x10.a.b("Reload:Home", new Object[0]);
        VerticalViewModel.f1(B(), true, null, 2, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        CrashlyticsUtilsKt.a("vertical screen", new l<tn.b, wz.p>() { // from class: com.forsale.app.features.categories.home.homelandingscreen.VerticalFragment$onResume$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(tn.b logScreenVisited) {
                CategoryEntity o02;
                o.i(logScreenVisited, "$this$logScreenVisited");
                o02 = VerticalFragment.this.o0();
                if (o02 != null) {
                    logScreenVisited.b("category_id", String.valueOf(o02.getId()));
                    logScreenVisited.b("category_name", o02.getNameEn());
                }
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(tn.b bVar) {
                b(bVar);
                return wz.p.f75480a;
            }
        });
        B().R1();
    }

    @Override // com.forsale.app.base.fragments.BaseViewModelFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        VerticalViewModel.f1(B(), false, null, 2, null);
    }

    @Override // com.forsale.app.base.fragments.BaseViewModelFragment, com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.i(view, "view");
        super.onViewCreated(view, bundle);
        y0();
        LifeCycleUtilsKt.b(this, new VerticalFragment$onViewCreated$1(this, null));
        LifeCycleUtilsKt.b(this, new VerticalFragment$onViewCreated$2(this, null));
        LifeCycleUtilsKt.b(this, new VerticalFragment$onViewCreated$3(this, null));
        LifeCycleUtilsKt.b(this, new VerticalFragment$onViewCreated$4(this, null));
        LifeCycleUtilsKt.b(this, new VerticalFragment$onViewCreated$5(this, null));
        LifeCycleUtilsKt.b(this, new VerticalFragment$onViewCreated$6(this, null));
        LifeCycleUtilsKt.b(this, new VerticalFragment$onViewCreated$7(this, null));
        LifeCycleUtilsKt.b(this, new VerticalFragment$onViewCreated$8(this, null));
        LifeCycleUtilsKt.b(this, new VerticalFragment$onViewCreated$9(this, null));
        LifeCycleUtilsKt.b(this, new VerticalFragment$onViewCreated$10(this, null));
        LifeCycleUtilsKt.b(this, new VerticalFragment$onViewCreated$11(this, null));
        LifeCycleUtilsKt.b(this, new VerticalFragment$onViewCreated$12(this, null));
        B().g1().observe(getViewLifecycleOwner(), new b(new l<CategoryEntity, wz.p>() { // from class: com.forsale.app.features.categories.home.homelandingscreen.VerticalFragment$onViewCreated$13
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(CategoryEntity categoryEntity) {
                MainContainerViewModel l02;
                VerticalFragment.this.x0(categoryEntity);
                VerticalViewModel B = VerticalFragment.this.B();
                o.f(categoryEntity);
                B.U1(categoryEntity);
                l02 = VerticalFragment.this.l0();
                l02.K1(categoryEntity.getName());
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(CategoryEntity categoryEntity) {
                b(categoryEntity);
                return wz.p.f75480a;
            }
        }));
        LifeCycleUtilsKt.b(this, new VerticalFragment$onViewCreated$14(this, null));
    }

    public final CategoriesNavGraphViewModel.b p0() {
        CategoriesNavGraphViewModel.b bVar = this.K;
        if (bVar != null) {
            return bVar;
        }
        o.w("sharedFactory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.fragments.BaseViewModelFragment
    /* renamed from: q0 */
    public VerticalViewModel B() {
        return (VerticalViewModel) this.E.getValue();
    }
}
