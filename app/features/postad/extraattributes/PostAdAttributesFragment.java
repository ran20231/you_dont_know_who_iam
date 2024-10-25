package com.forsale.app.features.postad.extraattributes;

import aa.a9;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.features.postad.PostAdUtilsKt;
import com.forsale.app.features.postad.PostAdViewModel;
import com.forsale.app.features.postad.extraattributes.PostAdAttributesViewModel;
import com.forsale.app.utils.CrashlyticsUtilsKt;
import com.forsale.app.utils.LifeCycleUtilsKt;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7;
import dj.b;
import g00.l;
import java.io.File;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.r;
import kotlin.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kr.b;
import kr.m;
import t9.y0;
import wz.h;
import wz.p;
/* compiled from: PostAdAttributesFragment.kt */
/* loaded from: classes2.dex */
public final class PostAdAttributesFragment extends qe.a<a9, PostAdAttributesViewModel> {
    public static final a O = new a(null);
    public static final int P = 8;
    private final h E = FragmentViewModelLazyKt.b(this, s.b(PostAdViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.features.postad.extraattributes.PostAdAttributesFragment$special$$inlined$activityViewModels$default$1
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
    }, new g00.a<w3.a>() { // from class: com.forsale.app.features.postad.extraattributes.PostAdAttributesFragment$special$$inlined$activityViewModels$default$2
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
    }, new g00.a<t0.b>() { // from class: com.forsale.app.features.postad.extraattributes.PostAdAttributesFragment$special$$inlined$activityViewModels$default$3
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
    public PostAdAttributesViewModel.c F;
    private final h G;
    private final int H;
    private final int I;
    private final lr.a<m<?>> J;
    private final lr.a<m<?>> K;
    private final lr.a<m<?>> L;
    private final kr.b<m<?>> M;
    private final h N;

    /* compiled from: PostAdAttributesFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public PostAdAttributesFragment() {
        h b11;
        List q11;
        h a11;
        g00.a<t0.b> aVar = new g00.a<t0.b>() { // from class: com.forsale.app.features.postad.extraattributes.PostAdAttributesFragment$special$$inlined$assistedViewModel$1

            /* compiled from: ViewModelHiltExtension.kt */
            /* loaded from: classes2.dex */
            public static final class a extends androidx.lifecycle.a {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ PostAdAttributesFragment f35093f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Fragment fragment, Bundle bundle, PostAdAttributesFragment postAdAttributesFragment) {
                    super(fragment, bundle);
                    this.f35093f = postAdAttributesFragment;
                }

                @Override // androidx.lifecycle.a
                protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                    PostAdViewModel e02;
                    o.i(key, "key");
                    o.i(modelClass, "modelClass");
                    o.i(handle, "handle");
                    PostAdAttributesViewModel.c d02 = this.f35093f.d0();
                    e02 = this.f35093f.e0();
                    PostAdAttributesViewModel a11 = d02.a(e02);
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
        this.G = FragmentViewModelLazyKt.b(this, s.b(PostAdAttributesViewModel.class), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6(b11), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7(null, b11), aVar);
        this.H = t9.t0.O1;
        this.I = y0.f70479h0;
        lr.a<m<?>> aVar2 = new lr.a<>();
        this.J = aVar2;
        lr.a<m<?>> aVar3 = new lr.a<>();
        this.K = aVar3;
        lr.a<m<?>> aVar4 = new lr.a<>();
        this.L = aVar4;
        b.a aVar5 = kr.b.f61943t;
        q11 = r.q(aVar2, aVar3, aVar4);
        this.M = aVar5.g(q11);
        a11 = d.a(new g00.a<dj.a>() { // from class: com.forsale.app.features.postad.extraattributes.PostAdAttributesFragment$fileChooser$2
            @Override // g00.a
            /* renamed from: b */
            public final dj.a invoke() {
                return new dj.a();
            }
        });
        this.N = a11;
    }

    public static final /* synthetic */ a9 S(PostAdAttributesFragment postAdAttributesFragment) {
        return (a9) postAdAttributesFragment.m();
    }

    private final void X() {
        b0();
        Y();
        a0();
    }

    private final void Y() {
        if (this.K.r().size() != 0) {
            this.K.q();
        }
    }

    private final void a0() {
        if (this.L.r().size() != 0) {
            this.L.q();
        }
    }

    private final void b0() {
        if (this.J.r().size() != 0) {
            this.J.q();
        }
    }

    private final dj.a c0() {
        return (dj.a) this.N.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PostAdViewModel e0() {
        return (PostAdViewModel) this.E.getValue();
    }

    private final void h0() {
        RecyclerView recyclerView = ((a9) m()).O;
        recyclerView.setHasFixedSize(true);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(this.M);
    }

    private final void i0() {
        X();
        this.M.setHasStableIds(true);
        this.J.n(new se.a());
        B().L0().clear();
        B().K0();
    }

    public final void V(int i11) {
        B().b1(i11);
        b.a.a(c0(), this, 48, 0, 4, null);
    }

    public final PostAdAttributesViewModel.c d0() {
        PostAdAttributesViewModel.c cVar = this.F;
        if (cVar != null) {
            return cVar;
        }
        o.w("postAdAttrsVMFactory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.fragments.BaseViewModelFragment
    /* renamed from: f0 */
    public PostAdAttributesViewModel B() {
        return (PostAdAttributesViewModel) this.G.getValue();
    }

    public final void g0(int i11) {
        B().Y0(i11);
    }

    @Override // com.forsale.app.base.fragments.a
    protected int o() {
        return this.H;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        i0();
        h0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i11, int i12, Intent intent) {
        List<String> e11;
        Object m02;
        super.onActivityResult(i11, i12, intent);
        if (i12 == -1 && i11 == 48 && intent != null && (e11 = c0().e(intent)) != null) {
            m02 = CollectionsKt___CollectionsKt.m0(e11);
            String str = (String) m02;
            if (str != null) {
                B().Z0(new File(str));
            }
        }
    }

    @Override // com.forsale.app.base.fragments.BaseViewModelFragment, com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public void onDestroyView() {
        ((a9) m()).O.setAdapter(null);
        super.onDestroyView();
        X();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        CrashlyticsUtilsKt.a("post ad attributes", new l<tn.b, p>() { // from class: com.forsale.app.features.postad.extraattributes.PostAdAttributesFragment$onResume$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(tn.b logScreenVisited) {
                PostAdViewModel e02;
                o.i(logScreenVisited, "$this$logScreenVisited");
                e02 = PostAdAttributesFragment.this.e0();
                logScreenVisited.b("intention", e02.k2().name());
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(tn.b bVar) {
                b(bVar);
                return p.f75480a;
            }
        });
    }

    @Override // com.forsale.app.base.fragments.BaseViewModelFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        o.i(outState, "outState");
        super.onSaveInstanceState(outState);
        kr.b.V(this.M, outState, null, 2, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        B().d1();
    }

    @Override // com.forsale.app.base.fragments.BaseViewModelFragment, com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.i(view, "view");
        super.onViewCreated(view, bundle);
        LifeCycleUtilsKt.b(this, new PostAdAttributesFragment$onViewCreated$1(this, null));
        LifeCycleUtilsKt.b(this, new PostAdAttributesFragment$onViewCreated$2(this, null));
        LifeCycleUtilsKt.b(this, new PostAdAttributesFragment$onViewCreated$3(this, null));
        LifeCycleUtilsKt.b(this, new PostAdAttributesFragment$onViewCreated$4(this, null));
        PostAdUtilsKt.c(this, e0());
        PostAdUtilsKt.b(this, e0());
        B().W0();
    }
}
