package com.forsale.app.ui.bottomsheets.listingdetailsselleranalytic;

import aa.g3;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel;
import com.forsale.app.ui.bottomsheets.listingdetailsselleranalytic.SellerAnalyticsViewModel;
import com.forsale.app.utils.CrashlyticsUtilsKt;
import com.forsale.app.utils.LifeCycleUtilsKt;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7;
import kotlin.LazyThreadSafetyMode;
import kotlin.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import t9.t0;
import t9.z0;
import wz.h;
/* compiled from: SellerAnalyticsBottomSheet.kt */
/* loaded from: classes3.dex */
public final class SellerAnalyticsBottomSheet extends xg.a<g3, SellerAnalyticsViewModel> {
    public static final a B = new a(null);
    public static final int C = 8;
    private boolean A;

    /* renamed from: x  reason: collision with root package name */
    public SellerAnalyticsViewModel.a f38774x;

    /* renamed from: z  reason: collision with root package name */
    private final h f38776z;

    /* renamed from: j  reason: collision with root package name */
    private final int f38773j = t0.f70225i0;

    /* renamed from: y  reason: collision with root package name */
    private final h f38775y = FragmentViewModelLazyKt.b(this, s.b(ListingDetailsViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailsselleranalytic.SellerAnalyticsBottomSheet$special$$inlined$activityViewModels$default$1
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
    }, new g00.a<w3.a>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailsselleranalytic.SellerAnalyticsBottomSheet$special$$inlined$activityViewModels$default$2
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
    }, new g00.a<t0.b>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailsselleranalytic.SellerAnalyticsBottomSheet$special$$inlined$activityViewModels$default$3
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

    /* compiled from: SellerAnalyticsBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(FragmentManager fragmentManager) {
            o.i(fragmentManager, "fragmentManager");
            new SellerAnalyticsBottomSheet().show(fragmentManager, "SellerAnalyticsBottomSheet");
        }
    }

    public SellerAnalyticsBottomSheet() {
        h b11;
        g00.a<t0.b> aVar = new g00.a<t0.b>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailsselleranalytic.SellerAnalyticsBottomSheet$special$$inlined$assistedViewModel$1

            /* compiled from: ViewModelHiltExtension.kt */
            /* loaded from: classes3.dex */
            public static final class a extends androidx.lifecycle.a {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ SellerAnalyticsBottomSheet f38783f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Fragment fragment, Bundle bundle, SellerAnalyticsBottomSheet sellerAnalyticsBottomSheet) {
                    super(fragment, bundle);
                    this.f38783f = sellerAnalyticsBottomSheet;
                }

                @Override // androidx.lifecycle.a
                protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                    o.i(key, "key");
                    o.i(modelClass, "modelClass");
                    o.i(handle, "handle");
                    SellerAnalyticsViewModel a11 = this.f38783f.C().a(this.f38783f.D());
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
        this.f38776z = FragmentViewModelLazyKt.b(this, s.b(SellerAnalyticsViewModel.class), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6(b11), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7(null, b11), aVar);
        this.A = true;
    }

    public final SellerAnalyticsViewModel.a C() {
        SellerAnalyticsViewModel.a aVar = this.f38774x;
        if (aVar != null) {
            return aVar;
        }
        o.w("factory");
        return null;
    }

    public final ListingDetailsViewModel D() {
        return (ListingDetailsViewModel) this.f38775y.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // w9.b
    /* renamed from: E */
    public SellerAnalyticsViewModel t() {
        return (SellerAnalyticsViewModel) this.f38776z.getValue();
    }

    @Override // w9.b, androidx.fragment.app.j
    public int getTheme() {
        return z0.f70801k;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        CrashlyticsUtilsKt.b("sellerAnalyticsBottomSheet", null, 2, null);
    }

    @Override // w9.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.i(view, "view");
        super.onViewCreated(view, bundle);
        LifeCycleUtilsKt.b(this, new SellerAnalyticsBottomSheet$onViewCreated$1(this, null));
        LifeCycleUtilsKt.b(this, new SellerAnalyticsBottomSheet$onViewCreated$2(this, null));
        LifeCycleUtilsKt.b(this, new SellerAnalyticsBottomSheet$onViewCreated$3(this, null));
    }

    @Override // w9.b
    protected int s() {
        return this.f38773j;
    }

    @Override // w9.b
    public boolean w() {
        return this.A;
    }
}
