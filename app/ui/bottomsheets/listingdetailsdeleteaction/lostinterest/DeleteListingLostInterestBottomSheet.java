package com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.lostinterest;

import aa.s2;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.network.responses.listingdetails.ItemStatus;
import com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel;
import com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.DeleteUtils;
import com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.lostinterest.DeleteListingLostInterestViewModel;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7;
import g00.l;
import kotlin.LazyThreadSafetyMode;
import kotlin.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.FlowCollector;
import t9.t0;
import t9.z0;
import wz.h;
import wz.p;
/* compiled from: DeleteListingLostInterestBottomSheet.kt */
/* loaded from: classes3.dex */
public final class DeleteListingLostInterestBottomSheet extends qg.b<s2, DeleteListingLostInterestViewModel> {
    public static final a D = new a(null);
    public static final int E = 8;
    private final h A;
    public DeleteListingLostInterestViewModel.a B;
    private final h C;

    /* renamed from: j  reason: collision with root package name */
    private final l<Boolean, p> f38202j;

    /* renamed from: x  reason: collision with root package name */
    private final int f38203x;

    /* renamed from: y  reason: collision with root package name */
    private final h f38204y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f38205z;

    /* compiled from: DeleteListingLostInterestBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(int i11, FragmentManager fragmentManager, l<? super Boolean, p> onActionDone) {
            o.i(fragmentManager, "fragmentManager");
            o.i(onActionDone, "onActionDone");
            DeleteListingLostInterestBottomSheet deleteListingLostInterestBottomSheet = new DeleteListingLostInterestBottomSheet(onActionDone);
            Bundle bundle = new Bundle();
            bundle.putInt("ad_id", i11);
            deleteListingLostInterestBottomSheet.setArguments(bundle);
            deleteListingLostInterestBottomSheet.show(fragmentManager, "DeleteListingLostInterestBottomSheet");
        }
    }

    /* compiled from: DeleteListingLostInterestBottomSheet.kt */
    /* loaded from: classes3.dex */
    static final class b implements FlowCollector<p> {
        b() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(p pVar, zz.a<? super p> aVar) {
            DeleteListingLostInterestBottomSheet.this.dismiss();
            return p.f75480a;
        }
    }

    /* compiled from: DeleteListingLostInterestBottomSheet.kt */
    /* loaded from: classes3.dex */
    static final class c implements FlowCollector<Boolean> {
        c() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(Boolean bool, zz.a<? super p> aVar) {
            ItemStatus itemStatus;
            boolean z11;
            if (bool != null) {
                DeleteListingLostInterestBottomSheet deleteListingLostInterestBottomSheet = DeleteListingLostInterestBottomSheet.this;
                boolean booleanValue = bool.booleanValue();
                ListingItemDetails value = DeleteListingLostInterestBottomSheet.this.H().Y0().getValue();
                if (value != null) {
                    itemStatus = value.getStatus();
                } else {
                    itemStatus = null;
                }
                if (itemStatus == ItemStatus.DRAFT) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                DeleteUtils.b(deleteListingLostInterestBottomSheet, booleanValue, z11, false, null, DeleteListingLostInterestBottomSheet.this.f38202j, 24, null);
            }
            return p.f75480a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeleteListingLostInterestBottomSheet(l<? super Boolean, p> onActionDone) {
        h a11;
        h b11;
        o.i(onActionDone, "onActionDone");
        this.f38202j = onActionDone;
        this.f38203x = t0.f70176b0;
        a11 = d.a(new g00.a<Integer>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.lostinterest.DeleteListingLostInterestBottomSheet$adId$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // g00.a
            public final Integer invoke() {
                Bundle arguments = DeleteListingLostInterestBottomSheet.this.getArguments();
                return Integer.valueOf(arguments != null ? arguments.getInt("ad_id", -1) : -1);
            }
        });
        this.f38204y = a11;
        this.f38205z = true;
        this.A = FragmentViewModelLazyKt.b(this, s.b(ListingDetailsViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.lostinterest.DeleteListingLostInterestBottomSheet$special$$inlined$activityViewModels$default$1
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
        }, new g00.a<w3.a>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.lostinterest.DeleteListingLostInterestBottomSheet$special$$inlined$activityViewModels$default$2
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
        }, new g00.a<t0.b>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.lostinterest.DeleteListingLostInterestBottomSheet$special$$inlined$activityViewModels$default$3
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
        g00.a<t0.b> aVar = new g00.a<t0.b>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.lostinterest.DeleteListingLostInterestBottomSheet$special$$inlined$assistedViewModel$1

            /* compiled from: ViewModelHiltExtension.kt */
            /* loaded from: classes3.dex */
            public static final class a extends androidx.lifecycle.a {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ DeleteListingLostInterestBottomSheet f38212f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Fragment fragment, Bundle bundle, DeleteListingLostInterestBottomSheet deleteListingLostInterestBottomSheet) {
                    super(fragment, bundle);
                    this.f38212f = deleteListingLostInterestBottomSheet;
                }

                @Override // androidx.lifecycle.a
                protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                    int E;
                    o.i(key, "key");
                    o.i(modelClass, "modelClass");
                    o.i(handle, "handle");
                    DeleteListingLostInterestViewModel.a G = this.f38212f.G();
                    E = this.f38212f.E();
                    DeleteListingLostInterestViewModel a11 = G.a(E, this.f38212f.H());
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
        this.C = FragmentViewModelLazyKt.b(this, s.b(DeleteListingLostInterestViewModel.class), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6(b11), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7(null, b11), aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int E() {
        return ((Number) this.f38204y.getValue()).intValue();
    }

    public final DeleteListingLostInterestViewModel.a G() {
        DeleteListingLostInterestViewModel.a aVar = this.B;
        if (aVar != null) {
            return aVar;
        }
        o.w("factory");
        return null;
    }

    public final ListingDetailsViewModel H() {
        return (ListingDetailsViewModel) this.A.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // w9.b
    /* renamed from: I */
    public DeleteListingLostInterestViewModel t() {
        return (DeleteListingLostInterestViewModel) this.C.getValue();
    }

    @Override // w9.b, androidx.fragment.app.j
    public int getTheme() {
        return z0.f70801k;
    }

    @Override // w9.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.i(view, "view");
        super.onViewCreated(view, bundle);
        OneShotEventHandler<p> A0 = t().A0();
        androidx.lifecycle.s viewLifecycleOwner = getViewLifecycleOwner();
        o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        A0.h(viewLifecycleOwner, new b());
        OneShotEventHandler<Boolean> z02 = t().z0();
        androidx.lifecycle.s viewLifecycleOwner2 = getViewLifecycleOwner();
        o.h(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        z02.h(viewLifecycleOwner2, new c());
    }

    @Override // w9.b
    protected int s() {
        return this.f38203x;
    }

    @Override // w9.b
    public boolean w() {
        return this.f38205z;
    }
}
