package com.forsale.app.features.postad.addons;

import aa.y8;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.t;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import androidx.navigation.NavDestination;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.base.ViewStates;
import com.forsale.app.datalayer.network.entities.PostListingIntention;
import com.forsale.app.features.postad.PostAdUtilsKt;
import com.forsale.app.features.postad.PostAdViewModel;
import com.forsale.app.features.postad.addons.PostAdAddonsViewModel;
import com.forsale.app.features.postad.addons.featured.FeaturedAddonItem;
import com.forsale.app.utils.CrashlyticsUtilsKt;
import com.forsale.app.utils.LifeCycleUtilsKt;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7;
import g00.l;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.r;
import kotlin.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kr.m;
import t9.r0;
import wz.h;
import wz.p;
import z3.i;
/* compiled from: PostAdAddonsFragment.kt */
/* loaded from: classes2.dex */
public final class PostAdAddonsFragment extends ke.a<y8, PostAdAddonsViewModel> {
    public static final a S = new a(null);
    public static final int T = 8;
    private final i E = new i(s.b(ke.b.class), new g00.a<Bundle>() { // from class: com.forsale.app.features.postad.addons.PostAdAddonsFragment$special$$inlined$navArgs$1
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
    private final h F;
    public PostAdViewModel.a G;
    private final h H;
    public PostAdAddonsViewModel.b I;
    private final h J;
    private final int K;
    private final int L;
    private final lr.a<m<?>> M;
    private final lr.a<FeaturedAddonItem> N;
    private final lr.a<m<?>> O;
    private final lr.a<m<?>> P;
    private final List<lr.a<? extends m<?>>> Q;
    private final kr.b<m<?>> R;

    /* compiled from: PostAdAddonsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public PostAdAddonsFragment() {
        h a11;
        h b11;
        List<lr.a<? extends m<?>>> q11;
        a11 = d.a(new g00.a<PostListingIntention>() { // from class: com.forsale.app.features.postad.addons.PostAdAddonsFragment$intention$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final PostListingIntention invoke() {
                ke.b g02;
                g02 = PostAdAddonsFragment.this.g0();
                return g02.a();
            }
        });
        this.F = a11;
        this.H = FragmentViewModelLazyKt.b(this, s.b(PostAdViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.features.postad.addons.PostAdAddonsFragment$special$$inlined$activityViewModels$default$1
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
        }, new g00.a<w3.a>() { // from class: com.forsale.app.features.postad.addons.PostAdAddonsFragment$special$$inlined$activityViewModels$default$2
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
                    o.h(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                    return defaultViewModelCreationExtras;
                }
                return aVar;
            }
        }, new g00.a<t0.b>() { // from class: com.forsale.app.features.postad.addons.PostAdAddonsFragment$special$$inlined$activityViewModels$default$3
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
        g00.a<t0.b> aVar = new g00.a<t0.b>() { // from class: com.forsale.app.features.postad.addons.PostAdAddonsFragment$special$$inlined$assistedViewModel$1

            /* compiled from: ViewModelHiltExtension.kt */
            /* loaded from: classes2.dex */
            public static final class a extends androidx.lifecycle.a {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ PostAdAddonsFragment f34207f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Fragment fragment, Bundle bundle, PostAdAddonsFragment postAdAddonsFragment) {
                    super(fragment, bundle);
                    this.f34207f = postAdAddonsFragment;
                }

                @Override // androidx.lifecycle.a
                protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                    PostAdViewModel i02;
                    o.i(key, "key");
                    o.i(modelClass, "modelClass");
                    o.i(handle, "handle");
                    PostAdAddonsViewModel.b h02 = this.f34207f.h0();
                    i02 = this.f34207f.i0();
                    PostAdAddonsViewModel a11 = h02.a(i02, handle);
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
        this.J = FragmentViewModelLazyKt.b(this, s.b(PostAdAddonsViewModel.class), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6(b11), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7(null, b11), aVar);
        this.K = t9.t0.N1;
        this.L = t9.t0.N3;
        lr.a<m<?>> aVar2 = new lr.a<>();
        this.M = aVar2;
        lr.a<FeaturedAddonItem> aVar3 = new lr.a<>();
        this.N = aVar3;
        lr.a<m<?>> aVar4 = new lr.a<>();
        this.O = aVar4;
        lr.a<m<?>> aVar5 = new lr.a<>();
        this.P = aVar5;
        q11 = r.q(aVar2, aVar3, aVar4, aVar5);
        this.Q = q11;
        this.R = kr.b.f61943t.g(q11);
    }

    public static final /* synthetic */ y8 S(PostAdAddonsFragment postAdAddonsFragment) {
        return (y8) postAdAddonsFragment.m();
    }

    private final void d0() {
        Iterator<T> it2 = this.Q.iterator();
        while (it2.hasNext()) {
            lr.a aVar = (lr.a) it2.next();
            if (aVar.r().size() != 0) {
                aVar.q();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int e0() {
        NavDestination F = androidx.navigation.fragment.a.a(this).F();
        if (F != null) {
            return F.q();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PostListingIntention f0() {
        return (PostListingIntention) this.F.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ke.b g0() {
        return (ke.b) this.E.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PostAdViewModel i0() {
        return (PostAdViewModel) this.H.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k0() {
        if (B().T0(e0())) {
            o0();
            B().w1();
        }
    }

    private final void l0() {
        LifeCycleUtilsKt.b(this, new PostAdAddonsFragment$registerObservers$1(this, null));
        LifeCycleUtilsKt.b(this, new PostAdAddonsFragment$registerObservers$2(this, null));
    }

    private final void m0() {
        androidx.lifecycle.s viewLifecycleOwner = getViewLifecycleOwner();
        o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(t.a(viewLifecycleOwner), null, null, new PostAdAddonsFragment$setupBinding$1(this, null), 3, null);
        LifeCycleUtilsKt.b(this, new PostAdAddonsFragment$setupBinding$2(this, null));
        LifeCycleUtilsKt.b(this, new PostAdAddonsFragment$setupBinding$3(this, null));
        LifeCycleUtilsKt.b(this, new PostAdAddonsFragment$setupBinding$4(this, null));
        androidx.lifecycle.s viewLifecycleOwner2 = getViewLifecycleOwner();
        o.h(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(t.a(viewLifecycleOwner2), null, null, new PostAdAddonsFragment$setupBinding$5(this, null), 3, null);
        LifeCycleUtilsKt.b(this, new PostAdAddonsFragment$setupBinding$6(this, null));
        PostAdUtilsKt.c(this, i0());
        LifeCycleUtilsKt.b(this, new PostAdAddonsFragment$setupBinding$7(this, null));
        androidx.lifecycle.s viewLifecycleOwner3 = getViewLifecycleOwner();
        o.h(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(t.a(viewLifecycleOwner3), null, null, new PostAdAddonsFragment$setupBinding$8(this, null), 3, null);
        androidx.lifecycle.s viewLifecycleOwner4 = getViewLifecycleOwner();
        o.h(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(t.a(viewLifecycleOwner4), null, null, new PostAdAddonsFragment$setupBinding$9(this, null), 3, null);
        androidx.lifecycle.s viewLifecycleOwner5 = getViewLifecycleOwner();
        o.h(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(t.a(viewLifecycleOwner5), null, null, new PostAdAddonsFragment$setupBinding$10(this, null), 3, null);
        androidx.lifecycle.s viewLifecycleOwner6 = getViewLifecycleOwner();
        o.h(viewLifecycleOwner6, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(t.a(viewLifecycleOwner6), null, null, new PostAdAddonsFragment$setupBinding$11(this, null), 3, null);
        androidx.lifecycle.s viewLifecycleOwner7 = getViewLifecycleOwner();
        o.h(viewLifecycleOwner7, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(t.a(viewLifecycleOwner7), null, null, new PostAdAddonsFragment$setupBinding$12(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(t.a(this), null, null, new PostAdAddonsFragment$setupBinding$13(this, null), 3, null);
        androidx.lifecycle.s viewLifecycleOwner8 = getViewLifecycleOwner();
        o.h(viewLifecycleOwner8, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(t.a(viewLifecycleOwner8), null, null, new PostAdAddonsFragment$setupBinding$14(this, null), 3, null);
        androidx.lifecycle.s viewLifecycleOwner9 = getViewLifecycleOwner();
        o.h(viewLifecycleOwner9, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(t.a(viewLifecycleOwner9), null, null, new PostAdAddonsFragment$setupBinding$15(this, null), 3, null);
        androidx.lifecycle.s viewLifecycleOwner10 = getViewLifecycleOwner();
        o.h(viewLifecycleOwner10, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(t.a(viewLifecycleOwner10), null, null, new PostAdAddonsFragment$setupBinding$16(this, null), 3, null);
    }

    private final void o0() {
        d0();
        if (o.d(B().g1().getValue(), Boolean.FALSE)) {
            this.R.setHasStableIds(true);
        }
        this.O.n(new ji.a(B().l1(), this));
        RecyclerView recyclerView = ((y8) m()).O;
        recyclerView.setHasFixedSize(true);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(this.R);
    }

    @Override // com.forsale.app.base.fragments.b
    protected int I() {
        return this.L;
    }

    public final PostAdAddonsViewModel.b h0() {
        PostAdAddonsViewModel.b bVar = this.I;
        if (bVar != null) {
            return bVar;
        }
        o.w("postAdAddonsVMFactory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.fragments.BaseViewModelFragment
    /* renamed from: j0 */
    public PostAdAddonsViewModel B() {
        return (PostAdAddonsViewModel) this.J.getValue();
    }

    @Override // com.forsale.app.base.fragments.a
    protected int o() {
        return this.K;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        o0();
        m0();
        B().q1();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 == 1000) {
            B().Z0();
        }
    }

    @Override // com.forsale.app.base.fragments.BaseViewModelFragment, com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public void onDestroyView() {
        B().C1(false);
        ((y8) m()).O.setAdapter(null);
        super.onDestroyView();
        d0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        CrashlyticsUtilsKt.a("post ad addons", new l<tn.b, p>() { // from class: com.forsale.app.features.postad.addons.PostAdAddonsFragment$onResume$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(tn.b logScreenVisited) {
                PostAdViewModel i02;
                o.i(logScreenVisited, "$this$logScreenVisited");
                i02 = PostAdAddonsFragment.this.i0();
                logScreenVisited.b("intention", i02.k2().name());
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(tn.b bVar) {
                b(bVar);
                return p.f75480a;
            }
        });
        k0();
    }

    @Override // com.forsale.app.base.fragments.BaseViewModelFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        o.i(outState, "outState");
        super.onSaveInstanceState(outState);
        kr.b.V(this.R, outState, null, 2, null);
    }

    @v9.d
    public final void onStateChange(ViewStates newState) {
        boolean z11;
        Integer b12;
        TextView textView;
        o.i(newState, "newState");
        if (newState == ViewStates.LOADING) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            newState = null;
        }
        if (newState != null && (b12 = B().b1()) != null) {
            int intValue = b12.intValue();
            View view = getView();
            if (view != null && (textView = (TextView) view.findViewById(r0.O5)) != null) {
                textView.setText(intValue);
            }
        }
    }

    @Override // com.forsale.app.base.fragments.BaseViewModelFragment, com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.i(view, "view");
        super.onViewCreated(view, bundle);
        l0();
    }
}
