package com.forsale.app.features.more.buymoretoken.billingpackage;

import aa.k7;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.c0;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.t0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.base.ActionViewsMode;
import com.forsale.app.base.activities.BaseViewModelActivity;
import com.forsale.app.datalayer.network.entities.PaymentOptionEntity;
import com.forsale.app.datalayer.network.responses.BillingPackagesResponse;
import com.forsale.app.features.more.buymoretoken.billingpackage.BillingPackagesViewModel;
import com.forsale.app.features.more.buymoretoken.billingpackage.g;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import t9.t0;
import wz.p;
/* compiled from: BillingPackageFragment.kt */
/* loaded from: classes2.dex */
public final class BillingPackageFragment extends h<k7, BillingPackagesViewModel> {
    public static final a O = new a(null);
    public static final int P = 8;
    private final lr.a<kr.m<?>> E = new lr.a<>();
    private final z3.i F = new z3.i(s.b(com.forsale.app.features.more.buymoretoken.billingpackage.a.class), new g00.a<Bundle>() { // from class: com.forsale.app.features.more.buymoretoken.billingpackage.BillingPackageFragment$special$$inlined$navArgs$1
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
    private final wz.h G;
    private final wz.h H;
    private final wz.h I;
    public BillingPackagesViewModel.a J;
    private final int K;
    private final wz.h L;
    private final int M;
    public g.a N;

    /* compiled from: BillingPackageFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BillingPackageFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b implements c0, kotlin.jvm.internal.k {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ g00.l f31726a;

        b(g00.l function) {
            o.i(function, "function");
            this.f31726a = function;
        }

        @Override // kotlin.jvm.internal.k
        public final wz.e<?> c() {
            return this.f31726a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof c0) || !(obj instanceof kotlin.jvm.internal.k)) {
                return false;
            }
            return o.d(c(), ((kotlin.jvm.internal.k) obj).c());
        }

        public final int hashCode() {
            return c().hashCode();
        }

        @Override // androidx.lifecycle.c0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f31726a.invoke(obj);
        }
    }

    public BillingPackageFragment() {
        wz.h a11;
        wz.h a12;
        wz.h a13;
        wz.h b11;
        a11 = kotlin.d.a(new g00.a<PaymentOptionEntity>() { // from class: com.forsale.app.features.more.buymoretoken.billingpackage.BillingPackageFragment$paymentOption$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final PaymentOptionEntity invoke() {
                a d02;
                d02 = BillingPackageFragment.this.d0();
                return d02.b();
            }
        });
        this.G = a11;
        a12 = kotlin.d.a(new g00.a<Boolean>() { // from class: com.forsale.app.features.more.buymoretoken.billingpackage.BillingPackageFragment$fromPlf$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // g00.a
            public final Boolean invoke() {
                a d02;
                d02 = BillingPackageFragment.this.d0();
                return Boolean.valueOf(d02.a());
            }
        });
        this.H = a12;
        a13 = kotlin.d.a(new g00.a<String>() { // from class: com.forsale.app.features.more.buymoretoken.billingpackage.BillingPackageFragment$plfIntention$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            public final String invoke() {
                a d02;
                d02 = BillingPackageFragment.this.d0();
                return d02.c();
            }
        });
        this.I = a13;
        this.K = t0.f70303t1;
        g00.a<t0.b> aVar = new g00.a<t0.b>() { // from class: com.forsale.app.features.more.buymoretoken.billingpackage.BillingPackageFragment$special$$inlined$assistedViewModel$1

            /* compiled from: ViewModelHiltExtension.kt */
            /* loaded from: classes2.dex */
            public static final class a extends androidx.lifecycle.a {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ BillingPackageFragment f31724f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Fragment fragment, Bundle bundle, BillingPackageFragment billingPackageFragment) {
                    super(fragment, bundle);
                    this.f31724f = billingPackageFragment;
                }

                @Override // androidx.lifecycle.a
                protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                    boolean c02;
                    String f02;
                    o.i(key, "key");
                    o.i(modelClass, "modelClass");
                    o.i(handle, "handle");
                    BillingPackagesViewModel.a b02 = this.f31724f.b0();
                    c02 = this.f31724f.c0();
                    f02 = this.f31724f.f0();
                    BillingPackagesViewModel a11 = b02.a(c02, f02, handle);
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
        b11 = kotlin.d.b(LazyThreadSafetyMode.NONE, new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5(new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4(this)));
        this.L = FragmentViewModelLazyKt.b(this, s.b(BillingPackagesViewModel.class), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6(b11), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7(null, b11), aVar);
        this.M = t9.t0.F;
    }

    private final androidx.recyclerview.widget.i Y(Context context) {
        androidx.recyclerview.widget.i iVar = new androidx.recyclerview.widget.i(context, 1);
        Drawable drawable = androidx.core.content.b.getDrawable(context, t9.q0.M);
        if (drawable != null) {
            iVar.f(drawable);
        }
        return iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean c0() {
        return ((Boolean) this.H.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.forsale.app.features.more.buymoretoken.billingpackage.a d0() {
        return (com.forsale.app.features.more.buymoretoken.billingpackage.a) this.F.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentOptionEntity e0() {
        return (PaymentOptionEntity) this.G.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String f0() {
        return (String) this.I.getValue();
    }

    private final void h0() {
        k0();
        i0();
    }

    private final void i0() {
        B().z0().observe(getViewLifecycleOwner(), new b(new g00.l<List<? extends BillingPackagesResponse.Package>, p>() { // from class: com.forsale.app.features.more.buymoretoken.billingpackage.BillingPackageFragment$registerObservers$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(List<BillingPackagesResponse.Package> list) {
                lr.a aVar;
                PaymentOptionEntity e02;
                o.f(list);
                BillingPackageFragment billingPackageFragment = BillingPackageFragment.this;
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    aVar = billingPackageFragment.E;
                    g.a a02 = billingPackageFragment.a0();
                    e02 = billingPackageFragment.e0();
                    aVar.n(new f(a02.a((BillingPackagesResponse.Package) it2.next(), e02), billingPackageFragment));
                }
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(List<? extends BillingPackagesResponse.Package> list) {
                b(list);
                return p.f75480a;
            }
        }));
    }

    private final void j0() {
        if (getActivity() instanceof BaseViewModelActivity) {
            androidx.fragment.app.p activity = getActivity();
            o.g(activity, "null cannot be cast to non-null type com.forsale.app.base.activities.BaseViewModelActivity<*, *>");
            androidx.appcompat.app.a supportActionBar = ((BaseViewModelActivity) activity).getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.D(e0().getName());
            }
        }
    }

    private final void k0() {
        RecyclerView recyclerView = ((k7) m()).O;
        recyclerView.setAdapter(kr.b.f61943t.i(this.E));
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        Context context = recyclerView.getContext();
        o.h(context, "getContext(...)");
        recyclerView.j(Y(context));
    }

    @Override // com.forsale.app.base.fragments.b
    protected int G() {
        return this.M;
    }

    public final g.a a0() {
        g.a aVar = this.N;
        if (aVar != null) {
            return aVar;
        }
        o.w("billingPackageVMFactory");
        return null;
    }

    public final BillingPackagesViewModel.a b0() {
        BillingPackagesViewModel.a aVar = this.J;
        if (aVar != null) {
            return aVar;
        }
        o.w("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.fragments.BaseViewModelFragment
    /* renamed from: g0 */
    public BillingPackagesViewModel B() {
        return (BillingPackagesViewModel) this.L.getValue();
    }

    @Override // com.forsale.app.base.fragments.a
    protected int o() {
        return this.K;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 == 50 && getChildFragmentManager() != null) {
            androidx.navigation.fragment.a.a(this).d0(com.forsale.app.features.more.buymoretoken.billingpackage.b.f31770a.a(B().y0(), B().B0()));
        }
    }

    @Override // com.forsale.app.base.fragments.b, com.forsale.app.base.fragments.BaseViewModelFragment, com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.i(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        h0();
        B().E0();
        j0();
        return onCreateView;
    }

    @Override // com.forsale.app.base.fragments.BaseViewModelFragment, com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public void onDestroyView() {
        ((k7) m()).O.setAdapter(null);
        super.onDestroyView();
    }

    @v9.a(viewId = {ActionViewsMode.ERROR_RELOAD, ActionViewsMode.ERROR_REFRESH})
    public final void onError(View view) {
        o.i(view, "view");
        B().C0();
    }
}
