package com.forsale.app.ui.bottomsheets.listingdetailspreviewalert;

import aa.a3;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel;
import com.forsale.app.features.maincontainer.MainContainerActivity;
import com.forsale.app.ui.bottomsheets.listingdetailspreviewalert.b;
import com.forsale.app.utils.ContextExtensionsKt;
import com.forsale.app.utils.CrashlyticsUtilsKt;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.FlowCollector;
import t9.t0;
import t9.z0;
import wz.h;
import wz.p;
/* compiled from: PreviewAlertBottomSheet.kt */
/* loaded from: classes3.dex */
public final class PreviewAlertBottomSheet extends ug.a<a3, com.forsale.app.ui.bottomsheets.listingdetailspreviewalert.b> {
    public static final a A = new a(null);
    public static final int B = 8;

    /* renamed from: j  reason: collision with root package name */
    private final int f38473j = t0.f70204f0;

    /* renamed from: x  reason: collision with root package name */
    private final h f38474x = FragmentViewModelLazyKt.b(this, s.b(ListingDetailsViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailspreviewalert.PreviewAlertBottomSheet$special$$inlined$activityViewModels$default$1
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
    }, new g00.a<w3.a>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailspreviewalert.PreviewAlertBottomSheet$special$$inlined$activityViewModels$default$2
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
    }, new g00.a<t0.b>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailspreviewalert.PreviewAlertBottomSheet$special$$inlined$activityViewModels$default$3
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

    /* renamed from: y  reason: collision with root package name */
    public b.a f38475y;

    /* renamed from: z  reason: collision with root package name */
    private final h f38476z;

    /* compiled from: PreviewAlertBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(FragmentManager fragmentManager) {
            o.i(fragmentManager, "fragmentManager");
            new PreviewAlertBottomSheet().show(fragmentManager, "PreviewAlertBottomSheet");
        }
    }

    /* compiled from: PreviewAlertBottomSheet.kt */
    /* loaded from: classes3.dex */
    static final class b implements FlowCollector<p> {
        b() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(p pVar, zz.a<? super p> aVar) {
            PreviewAlertBottomSheet.this.dismiss();
            return p.f75480a;
        }
    }

    /* compiled from: PreviewAlertBottomSheet.kt */
    /* loaded from: classes3.dex */
    static final class c implements FlowCollector<p> {
        c() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(p pVar, zz.a<? super p> aVar) {
            d l11;
            Context context = PreviewAlertBottomSheet.this.getContext();
            if (context != null && (l11 = ContextExtensionsKt.l(context)) != null) {
                MainContainerActivity.a.c(MainContainerActivity.O, l11, null, 1, null);
            }
            PreviewAlertBottomSheet.this.dismiss();
            return p.f75480a;
        }
    }

    public PreviewAlertBottomSheet() {
        h b11;
        g00.a<t0.b> aVar = new g00.a<t0.b>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailspreviewalert.PreviewAlertBottomSheet$special$$inlined$assistedViewModel$1

            /* compiled from: ViewModelHiltExtension.kt */
            /* loaded from: classes3.dex */
            public static final class a extends androidx.lifecycle.a {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ PreviewAlertBottomSheet f38483f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Fragment fragment, Bundle bundle, PreviewAlertBottomSheet previewAlertBottomSheet) {
                    super(fragment, bundle);
                    this.f38483f = previewAlertBottomSheet;
                }

                @Override // androidx.lifecycle.a
                protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                    ListingDetailsViewModel E;
                    o.i(key, "key");
                    o.i(modelClass, "modelClass");
                    o.i(handle, "handle");
                    b.a D = this.f38483f.D();
                    E = this.f38483f.E();
                    b a11 = D.a(E);
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
        this.f38476z = FragmentViewModelLazyKt.b(this, s.b(com.forsale.app.ui.bottomsheets.listingdetailspreviewalert.b.class), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6(b11), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7(null, b11), aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ListingDetailsViewModel E() {
        return (ListingDetailsViewModel) this.f38474x.getValue();
    }

    public final b.a D() {
        b.a aVar = this.f38475y;
        if (aVar != null) {
            return aVar;
        }
        o.w("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // w9.b
    /* renamed from: G */
    public com.forsale.app.ui.bottomsheets.listingdetailspreviewalert.b t() {
        return (com.forsale.app.ui.bottomsheets.listingdetailspreviewalert.b) this.f38476z.getValue();
    }

    @Override // w9.b, androidx.fragment.app.j
    public int getTheme() {
        return z0.f70801k;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        CrashlyticsUtilsKt.b("PreviewAlertBottomSheet", null, 2, null);
    }

    @Override // w9.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.i(view, "view");
        super.onViewCreated(view, bundle);
        OneShotEventHandler<p> w02 = t().w0();
        androidx.lifecycle.s viewLifecycleOwner = getViewLifecycleOwner();
        o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        w02.h(viewLifecycleOwner, new b());
        OneShotEventHandler<p> v02 = t().v0();
        androidx.lifecycle.s viewLifecycleOwner2 = getViewLifecycleOwner();
        o.h(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        v02.h(viewLifecycleOwner2, new c());
    }

    @Override // w9.b
    protected int s() {
        return this.f38473j;
    }
}
