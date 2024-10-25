package com.forsale.app.features.categories.tree;

import aa.ka;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.c0;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.t0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.features.categories.tree.CategorySelectionViewModel;
import com.forsale.app.utils.LifeCycleUtilsKt;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7;
import com.mikepenz.fastadapter.expandable.ExpandableExtension;
import java.util.ArrayList;
import java.util.List;
import jd.e;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.q;
import kotlin.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kr.m;
import sr.c;
import t9.r0;
import wz.h;
import z3.i;
/* compiled from: CategorySelectionFragment.kt */
/* loaded from: classes2.dex */
public final class CategorySelectionFragment extends e<ka, CategorySelectionViewModel> {
    public static final a K = new a(null);
    public static final int L = 8;
    public CategorySelectionViewModel.a E;
    private final i F = new i(s.b(jd.a.class), new g00.a<Bundle>() { // from class: com.forsale.app.features.categories.tree.CategorySelectionFragment$special$$inlined$navArgs$1
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
    private final h G;
    private final int H;
    private final lr.a<m<? extends RecyclerView.d0>> I;
    private kr.b<m<? extends RecyclerView.d0>> J;

    /* compiled from: CategorySelectionFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CategorySelectionFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b implements c0<ArrayList<m<?>>> {
        b() {
        }

        @Override // androidx.lifecycle.c0
        /* renamed from: a */
        public final void onChanged(ArrayList<m<?>> arrayList) {
            lr.a aVar = CategorySelectionFragment.this.I;
            o.f(arrayList);
            aVar.m(arrayList);
        }
    }

    public CategorySelectionFragment() {
        h b11;
        g00.a<t0.b> aVar = new g00.a<t0.b>() { // from class: com.forsale.app.features.categories.tree.CategorySelectionFragment$special$$inlined$assistedViewModel$1

            /* compiled from: ViewModelHiltExtension.kt */
            /* loaded from: classes2.dex */
            public static final class a extends androidx.lifecycle.a {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ CategorySelectionFragment f31099f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Fragment fragment, Bundle bundle, CategorySelectionFragment categorySelectionFragment) {
                    super(fragment, bundle);
                    this.f31099f = categorySelectionFragment;
                }

                @Override // androidx.lifecycle.a
                protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                    jd.a V;
                    o.i(key, "key");
                    o.i(modelClass, "modelClass");
                    o.i(handle, "handle");
                    CategorySelectionViewModel.a X = this.f31099f.X();
                    V = this.f31099f.V();
                    CategorySelectionViewModel a11 = X.a(V.a());
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
        this.G = FragmentViewModelLazyKt.b(this, s.b(CategorySelectionViewModel.class), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6(b11), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7(null, b11), aVar);
        this.H = t9.t0.f70213g2;
        this.I = lr.a.f62553j.a();
    }

    private final void T() {
        LifeCycleUtilsKt.b(this, new CategorySelectionFragment$bindObservers$1(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jd.a V() {
        return (jd.a) this.F.getValue();
    }

    private final void a0() {
        List e11;
        RecyclerView recyclerView;
        e11 = q.e(this.I);
        kr.b<m<? extends RecyclerView.d0>> g11 = kr.b.f61943t.g(e11);
        this.J = g11;
        if (g11 != null) {
            c.a(g11).y(true);
            g11.f(new ExpandableExtension(g11));
        }
        View view = getView();
        if (view != null) {
            recyclerView = (RecyclerView) view.findViewById(r0.f69864c8);
        } else {
            recyclerView = null;
        }
        o.g(recyclerView, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(this.J);
        B().D0().observe(getViewLifecycleOwner(), new b());
    }

    public final CategorySelectionViewModel.a X() {
        CategorySelectionViewModel.a aVar = this.E;
        if (aVar != null) {
            return aVar;
        }
        o.w("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.fragments.BaseViewModelFragment
    /* renamed from: Y */
    public CategorySelectionViewModel B() {
        return (CategorySelectionViewModel) this.G.getValue();
    }

    @Override // com.forsale.app.base.fragments.a
    protected int o() {
        return this.H;
    }

    @Override // com.forsale.app.base.fragments.BaseViewModelFragment, com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.i(view, "view");
        super.onViewCreated(view, bundle);
        a0();
        T();
    }
}
