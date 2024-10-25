package com.forsale.app.features.more.buymoretoken.billingpackage;

import aa.sg;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import androidx.navigation.NavController;
import androidx.navigation.h;
import com.forsale.app.features.maincontainer.HomeTabs;
import com.forsale.app.features.maincontainer.MainContainerActivity;
import com.forsale.app.features.more.buymoretoken.billingpackage.m;
import com.forsale.app.features.postad.PLFActivity;
import com.forsale.app.utils.OneShotEventHandler;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.FlowCollector;
import t9.r0;
import t9.y0;
import t9.z0;
import uf.b;
import w3.a;
import wz.p;
/* compiled from: PaymentBottomSheet.kt */
/* loaded from: classes2.dex */
public final class PaymentBottomSheet extends i {

    /* renamed from: g  reason: collision with root package name */
    private final z3.i f31745g = new z3.i(s.b(j.class), new g00.a<Bundle>() { // from class: com.forsale.app.features.more.buymoretoken.billingpackage.PaymentBottomSheet$special$$inlined$navArgs$1
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

    /* renamed from: h  reason: collision with root package name */
    private final wz.h f31746h;

    /* renamed from: i  reason: collision with root package name */
    private final wz.h f31747i;

    /* renamed from: j  reason: collision with root package name */
    public m.a f31748j;

    /* renamed from: x  reason: collision with root package name */
    private final wz.h f31749x;

    /* renamed from: y  reason: collision with root package name */
    private sg f31750y;

    /* compiled from: PaymentBottomSheet.kt */
    /* loaded from: classes2.dex */
    static final class a implements FlowCollector<p> {
        a() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(p pVar, zz.a<? super p> aVar) {
            PaymentBottomSheet.this.M();
            return p.f75480a;
        }
    }

    /* compiled from: PaymentBottomSheet.kt */
    /* loaded from: classes2.dex */
    static final class b implements FlowCollector<p> {
        b() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(p pVar, zz.a<? super p> aVar) {
            PaymentBottomSheet.this.L();
            return p.f75480a;
        }
    }

    /* compiled from: PaymentBottomSheet.kt */
    /* loaded from: classes2.dex */
    static final class c implements FlowCollector<p> {
        c() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(p pVar, zz.a<? super p> aVar) {
            PaymentBottomSheet.this.O();
            return p.f75480a;
        }
    }

    /* compiled from: PaymentBottomSheet.kt */
    /* loaded from: classes2.dex */
    static final class d implements FlowCollector<p> {
        d() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(p pVar, zz.a<? super p> aVar) {
            PaymentBottomSheet.this.D();
            return p.f75480a;
        }
    }

    public PaymentBottomSheet() {
        wz.h a11;
        wz.h a12;
        final wz.h b11;
        a11 = kotlin.d.a(new g00.a<Boolean>() { // from class: com.forsale.app.features.more.buymoretoken.billingpackage.PaymentBottomSheet$fromPlf$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // g00.a
            public final Boolean invoke() {
                j I;
                I = PaymentBottomSheet.this.I();
                return Boolean.valueOf(I.a());
            }
        });
        this.f31746h = a11;
        a12 = kotlin.d.a(new g00.a<String>() { // from class: com.forsale.app.features.more.buymoretoken.billingpackage.PaymentBottomSheet$intentionPLF$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            public final String invoke() {
                j I;
                I = PaymentBottomSheet.this.I();
                return I.b();
            }
        });
        this.f31747i = a12;
        g00.a<t0.b> aVar = new g00.a<t0.b>() { // from class: com.forsale.app.features.more.buymoretoken.billingpackage.PaymentBottomSheet$special$$inlined$assistedViewModel$1

            /* compiled from: ViewModelHiltExtensions.kt */
            /* loaded from: classes2.dex */
            public static final class a extends androidx.lifecycle.a {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ PaymentBottomSheet f31753f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Fragment fragment, Bundle bundle, PaymentBottomSheet paymentBottomSheet) {
                    super(fragment, bundle);
                    this.f31753f = paymentBottomSheet;
                }

                @Override // androidx.lifecycle.a
                protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                    boolean G;
                    String H;
                    o.i(key, "key");
                    o.i(modelClass, "modelClass");
                    o.i(handle, "handle");
                    m.a E = this.f31753f.E();
                    G = this.f31753f.G();
                    H = this.f31753f.H();
                    m a11 = E.a(G, H);
                    o.g(a11, "null cannot be cast to non-null type T of com.forsale.adserver.utils.ViewModelHiltExtensionsKt.assistedViewModel.<no name provided>.invoke.<no name provided>.create");
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
        final g00.a<Fragment> aVar2 = new g00.a<Fragment>() { // from class: com.forsale.app.features.more.buymoretoken.billingpackage.PaymentBottomSheet$special$$inlined$assistedViewModel$2
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        b11 = kotlin.d.b(LazyThreadSafetyMode.NONE, new g00.a<x0>() { // from class: com.forsale.app.features.more.buymoretoken.billingpackage.PaymentBottomSheet$special$$inlined$assistedViewModel$3
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final x0 invoke() {
                return (x0) g00.a.this.invoke();
            }
        });
        this.f31749x = FragmentViewModelLazyKt.b(this, s.b(m.class), new g00.a<w0>() { // from class: com.forsale.app.features.more.buymoretoken.billingpackage.PaymentBottomSheet$special$$inlined$assistedViewModel$4
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final w0 invoke() {
                x0 c11;
                c11 = FragmentViewModelLazyKt.c(wz.h.this);
                return c11.getViewModelStore();
            }
        }, new g00.a<w3.a>() { // from class: com.forsale.app.features.more.buymoretoken.billingpackage.PaymentBottomSheet$special$$inlined$assistedViewModel$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final w3.a invoke() {
                x0 c11;
                androidx.lifecycle.l lVar;
                w3.a aVar3;
                g00.a aVar4 = g00.a.this;
                if (aVar4 == null || (aVar3 = (w3.a) aVar4.invoke()) == null) {
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
                return aVar3;
            }
        }, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D() {
        androidx.navigation.fragment.a.a(this).k0(r0.A6, false);
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean G() {
        return ((Boolean) this.f31746h.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String H() {
        return (String) this.f31747i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j I() {
        return (j) this.f31745g.getValue();
    }

    private final androidx.navigation.h J() {
        androidx.fragment.app.p activity = getActivity();
        if (activity instanceof PLFActivity) {
            return h.a.i(new h.a(), androidx.navigation.fragment.a.a(this).H().q(), true, false, 4, null).a();
        }
        if (activity instanceof MainContainerActivity) {
            return h.a.i(new h.a(), r0.W5, false, false, 4, null).a();
        }
        return null;
    }

    private final m K() {
        return (m) this.f31749x.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L() {
        MainContainerActivity mainContainerActivity;
        MainContainerActivity mainContainerActivity2;
        androidx.fragment.app.p activity = getActivity();
        if (activity instanceof PLFActivity) {
            androidx.fragment.app.p activity2 = getActivity();
            if (activity2 != null) {
                activity2.finish();
            }
            androidx.fragment.app.p requireActivity = requireActivity();
            if (requireActivity instanceof MainContainerActivity) {
                mainContainerActivity2 = (MainContainerActivity) requireActivity;
            } else {
                mainContainerActivity2 = null;
            }
            if (mainContainerActivity2 != null) {
                MainContainerActivity.K1(mainContainerActivity2, HomeTabs.INDEX_HOME, null, 2, null);
            }
        } else if (activity instanceof MainContainerActivity) {
            androidx.navigation.fragment.a.a(this).k0(r0.W5, false);
            androidx.fragment.app.p requireActivity2 = requireActivity();
            if (requireActivity2 instanceof MainContainerActivity) {
                mainContainerActivity = (MainContainerActivity) requireActivity2;
            } else {
                mainContainerActivity = null;
            }
            if (mainContainerActivity != null) {
                MainContainerActivity.K1(mainContainerActivity, HomeTabs.INDEX_HOME, null, 2, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M() {
        NavController a11 = androidx.navigation.fragment.a.a(this);
        String string = getResources().getString(y0.E5);
        o.h(string, "getString(...)");
        a11.X(Uri.parse(string), J());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O() {
        MainContainerActivity mainContainerActivity;
        NavController a11 = androidx.navigation.fragment.a.a(this);
        if (a11 != null) {
            a11.k0(r0.W5, false);
            androidx.fragment.app.p requireActivity = requireActivity();
            if (requireActivity instanceof MainContainerActivity) {
                mainContainerActivity = (MainContainerActivity) requireActivity;
            } else {
                mainContainerActivity = null;
            }
            if (mainContainerActivity != null) {
                b.a.a(mainContainerActivity, null, 1, null);
            }
        }
    }

    public final m.a E() {
        m.a aVar = this.f31748j;
        if (aVar != null) {
            return aVar;
        }
        o.w("factory");
        return null;
    }

    @Override // androidx.fragment.app.j
    public int getTheme() {
        return z0.f70792b;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.i(inflater, "inflater");
        sg f02 = sg.f0(inflater, viewGroup, false);
        o.h(f02, "inflate(...)");
        this.f31750y = f02;
        sg sgVar = null;
        if (f02 == null) {
            o.w("binding");
            f02 = null;
        }
        View root = f02.getRoot();
        sg sgVar2 = this.f31750y;
        if (sgVar2 == null) {
            o.w("binding");
        } else {
            sgVar = sgVar2;
        }
        sgVar.h0(K());
        OneShotEventHandler<p> z02 = K().z0();
        androidx.lifecycle.s viewLifecycleOwner = getViewLifecycleOwner();
        o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        z02.h(viewLifecycleOwner, new a());
        OneShotEventHandler<p> y02 = K().y0();
        androidx.lifecycle.s viewLifecycleOwner2 = getViewLifecycleOwner();
        o.h(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        y02.h(viewLifecycleOwner2, new b());
        OneShotEventHandler<p> A0 = K().A0();
        androidx.lifecycle.s viewLifecycleOwner3 = getViewLifecycleOwner();
        o.h(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        A0.h(viewLifecycleOwner3, new c());
        OneShotEventHandler<p> w02 = K().w0();
        androidx.lifecycle.s viewLifecycleOwner4 = getViewLifecycleOwner();
        o.h(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        w02.h(viewLifecycleOwner4, new d());
        return root;
    }
}
