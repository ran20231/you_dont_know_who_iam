package com.forsale.app.features.more.buymoretoken.paymentoption;

import aa.w8;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.t0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.base.ActionViewsMode;
import com.forsale.app.datalayer.network.entities.PaymentOptionEntity;
import com.forsale.app.features.more.buymoretoken.paymentoption.PaymentOptionsViewModel;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.FlowCollector;
import kr.m;
import rd.d;
import wz.h;
import wz.p;
import z3.i;
/* compiled from: PaymentOptionsFragment.kt */
/* loaded from: classes2.dex */
public final class PaymentOptionsFragment extends rd.a<w8, PaymentOptionsViewModel> {
    private final i E = new i(s.b(d.class), new g00.a<Bundle>() { // from class: com.forsale.app.features.more.buymoretoken.paymentoption.PaymentOptionsFragment$special$$inlined$navArgs$1
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
    private final h G;
    public PaymentOptionsViewModel.a H;
    private final h I;
    private final int J;
    private final lr.a<m<?>> K;

    /* compiled from: PaymentOptionsFragment.kt */
    /* loaded from: classes2.dex */
    static final class a implements FlowCollector<PaymentOptionEntity> {
        a() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(PaymentOptionEntity paymentOptionEntity, zz.a<? super p> aVar) {
            if (paymentOptionEntity != null) {
                androidx.navigation.fragment.a.a(PaymentOptionsFragment.this).d0(com.forsale.app.features.more.buymoretoken.paymentoption.b.f31839a.a(paymentOptionEntity, PaymentOptionsFragment.this.B().x0(), PaymentOptionsFragment.this.B().y0()));
            }
            return p.f75480a;
        }
    }

    /* compiled from: PaymentOptionsFragment.kt */
    /* loaded from: classes2.dex */
    static final class b implements FlowCollector<List<? extends PaymentOptionEntity>> {
        b() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(List<PaymentOptionEntity> list, zz.a<? super p> aVar) {
            if (list != null) {
                PaymentOptionsFragment.this.d0((PaymentOptionEntity[]) list.toArray(new PaymentOptionEntity[0]));
            }
            return p.f75480a;
        }
    }

    public PaymentOptionsFragment() {
        h a11;
        h a12;
        h b11;
        a11 = kotlin.d.a(new g00.a<Boolean>() { // from class: com.forsale.app.features.more.buymoretoken.paymentoption.PaymentOptionsFragment$fromPlf$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // g00.a
            public final Boolean invoke() {
                d a02;
                a02 = PaymentOptionsFragment.this.a0();
                return Boolean.valueOf(a02.a());
            }
        });
        this.F = a11;
        a12 = kotlin.d.a(new g00.a<String>() { // from class: com.forsale.app.features.more.buymoretoken.paymentoption.PaymentOptionsFragment$plfIntention$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            public final String invoke() {
                d a02;
                a02 = PaymentOptionsFragment.this.a0();
                return a02.b();
            }
        });
        this.G = a12;
        g00.a<t0.b> aVar = new g00.a<t0.b>() { // from class: com.forsale.app.features.more.buymoretoken.paymentoption.PaymentOptionsFragment$special$$inlined$assistedViewModel$1

            /* compiled from: ViewModelHiltExtension.kt */
            /* loaded from: classes2.dex */
            public static final class a extends androidx.lifecycle.a {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ PaymentOptionsFragment f31813f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Fragment fragment, Bundle bundle, PaymentOptionsFragment paymentOptionsFragment) {
                    super(fragment, bundle);
                    this.f31813f = paymentOptionsFragment;
                }

                @Override // androidx.lifecycle.a
                protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                    boolean Y;
                    String b02;
                    o.i(key, "key");
                    o.i(modelClass, "modelClass");
                    o.i(handle, "handle");
                    PaymentOptionsViewModel.a X = this.f31813f.X();
                    Y = this.f31813f.Y();
                    b02 = this.f31813f.b0();
                    PaymentOptionsViewModel a11 = X.a(Y, b02);
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
        this.I = FragmentViewModelLazyKt.b(this, s.b(PaymentOptionsViewModel.class), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6(b11), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7(null, b11), aVar);
        this.J = t9.t0.M1;
        this.K = new lr.a<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean Y() {
        return ((Boolean) this.F.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d a0() {
        return (d) this.E.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String b0() {
        return (String) this.G.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d0(PaymentOptionEntity[] paymentOptionEntityArr) {
        for (PaymentOptionEntity paymentOptionEntity : paymentOptionEntityArr) {
            this.K.n(new com.forsale.app.features.more.buymoretoken.paymentoption.a(new rd.c(paymentOptionEntity), Y(), b0()));
        }
    }

    private final void e0() {
        RecyclerView recyclerView = ((w8) m()).O;
        Context context = recyclerView.getContext();
        if (context != null) {
            o.f(context);
            androidx.recyclerview.widget.i iVar = new androidx.recyclerview.widget.i(context, 1);
            Drawable drawable = androidx.core.content.b.getDrawable(context, t9.q0.M);
            if (drawable != null) {
                iVar.f(drawable);
            }
            recyclerView.setAdapter(kr.b.f61943t.i(this.K));
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
            recyclerView.j(iVar);
        }
    }

    public final PaymentOptionsViewModel.a X() {
        PaymentOptionsViewModel.a aVar = this.H;
        if (aVar != null) {
            return aVar;
        }
        o.w("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.fragments.BaseViewModelFragment
    /* renamed from: c0 */
    public PaymentOptionsViewModel B() {
        return (PaymentOptionsViewModel) this.I.getValue();
    }

    @Override // com.forsale.app.base.fragments.a
    protected int o() {
        return this.J;
    }

    @Override // com.forsale.app.base.fragments.b, com.forsale.app.base.fragments.BaseViewModelFragment, com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.i(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        e0();
        B().D0();
        return onCreateView;
    }

    @Override // com.forsale.app.base.fragments.BaseViewModelFragment, com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public void onDestroyView() {
        ((w8) m()).O.setAdapter(null);
        super.onDestroyView();
    }

    @v9.a(viewId = {ActionViewsMode.ERROR_RELOAD, ActionViewsMode.ERROR_REFRESH})
    public final void onError(View view) {
        o.i(view, "view");
        B().B0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        B().B0();
    }

    @Override // com.forsale.app.base.fragments.BaseViewModelFragment, com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.i(view, "view");
        super.onViewCreated(view, bundle);
        OneShotEventHandler<PaymentOptionEntity> z02 = B().z0();
        androidx.lifecycle.s viewLifecycleOwner = getViewLifecycleOwner();
        o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        z02.h(viewLifecycleOwner, new a());
        OneShotEventHandler<List<PaymentOptionEntity>> A0 = B().A0();
        androidx.lifecycle.s viewLifecycleOwner2 = getViewLifecycleOwner();
        o.h(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        A0.h(viewLifecycleOwner2, new b());
    }
}
