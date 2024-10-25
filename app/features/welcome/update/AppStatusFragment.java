package com.forsale.app.features.welcome.update;

import aa.i7;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.l;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import androidx.navigation.NavController;
import com.forsale.app.features.welcome.update.b;
import com.forsale.app.ui.StatefulLayout;
import com.forsale.app.utils.ContextExtensionsKt;
import com.forsale.app.utils.OneShotEventHandler;
import kf.d;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.FlowCollector;
import t9.t0;
import t9.y0;
import w3.a;
import wz.h;
import wz.p;
/* compiled from: AppStatusFragment.kt */
/* loaded from: classes2.dex */
public final class AppStatusFragment extends d<i7, AppStatusViewModel> {
    private final int E = t0.f70296s1;
    private final h F;
    private final boolean G;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppStatusFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements FlowCollector<p> {
        a() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(p pVar, zz.a<? super p> aVar) {
            AppStatusFragment.this.V();
            return p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppStatusFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b implements FlowCollector<p> {
        b() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(p pVar, zz.a<? super p> aVar) {
            AppStatusFragment.this.Y();
            return p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppStatusFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c implements FlowCollector<p> {
        c() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(p pVar, zz.a<? super p> aVar) {
            Context context = AppStatusFragment.this.getContext();
            if (context != null) {
                ContextExtensionsKt.G(context);
            }
            return p.f75480a;
        }
    }

    public AppStatusFragment() {
        final h b11;
        final g00.a<Fragment> aVar = new g00.a<Fragment>() { // from class: com.forsale.app.features.welcome.update.AppStatusFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        b11 = kotlin.d.b(LazyThreadSafetyMode.NONE, new g00.a<x0>() { // from class: com.forsale.app.features.welcome.update.AppStatusFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final x0 invoke() {
                return (x0) g00.a.this.invoke();
            }
        });
        this.F = FragmentViewModelLazyKt.b(this, s.b(AppStatusViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.features.welcome.update.AppStatusFragment$special$$inlined$viewModels$default$3
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
        }, new g00.a<w3.a>() { // from class: com.forsale.app.features.welcome.update.AppStatusFragment$special$$inlined$viewModels$default$4
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
        }, new g00.a<t0.b>() { // from class: com.forsale.app.features.welcome.update.AppStatusFragment$special$$inlined$viewModels$default$5
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V() {
        StatefulLayout statefulLayout = ((i7) m()).P;
        statefulLayout.c(t9.t0.Z0);
        View rootView = statefulLayout.getRootView();
        o.h(rootView, "getRootView(...)");
        setStateViewsActions(rootView);
    }

    private final void X() {
        OneShotEventHandler<p> x02 = B().x0();
        androidx.lifecycle.s viewLifecycleOwner = getViewLifecycleOwner();
        o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        x02.h(viewLifecycleOwner, new a());
        OneShotEventHandler<p> z02 = B().z0();
        androidx.lifecycle.s viewLifecycleOwner2 = getViewLifecycleOwner();
        o.h(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        z02.h(viewLifecycleOwner2, new b());
        OneShotEventHandler<p> A0 = B().A0();
        androidx.lifecycle.s viewLifecycleOwner3 = getViewLifecycleOwner();
        o.h(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        A0.h(viewLifecycleOwner3, new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y() {
        try {
            androidx.navigation.fragment.a.a(this).d0(b.C0427b.b(com.forsale.app.features.welcome.update.b.f37419a, null, false, 3, null));
        } catch (Exception unused) {
            NavController a11 = androidx.navigation.fragment.a.a(this);
            String string = getString(y0.f70765y5);
            o.h(string, "getString(...)");
            a11.W(Uri.parse(string));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.fragments.BaseViewModelFragment
    /* renamed from: T */
    public AppStatusViewModel B() {
        return (AppStatusViewModel) this.F.getValue();
    }

    @Override // com.forsale.app.base.fragments.a
    protected int o() {
        return this.E;
    }

    @Override // com.forsale.app.base.fragments.BaseViewModelFragment, com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.i(view, "view");
        super.onViewCreated(view, bundle);
        B().w0();
        B().D0();
        X();
    }

    @Override // com.forsale.app.base.fragments.a
    public boolean p() {
        return this.G;
    }
}
