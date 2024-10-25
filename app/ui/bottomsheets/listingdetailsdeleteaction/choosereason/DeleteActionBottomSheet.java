package com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.choosereason;

import aa.mf;
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
import com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.choosereason.b;
import com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.lostinterest.DeleteListingLostInterestBottomSheet;
import com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.sold.DeleteListingSoldBottomSheet;
import com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.toomanycalls.DeleteListingManyCallsBottomSheet;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7;
import g00.l;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.FlowCollector;
import t9.t0;
import t9.z0;
import wz.h;
import wz.p;
/* compiled from: DeleteActionBottomSheet.kt */
/* loaded from: classes3.dex */
public final class DeleteActionBottomSheet extends pg.b<mf, com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.choosereason.b> {
    public static final a D = new a(null);
    public static final int E = 8;
    public b.a A;
    private final h B;
    private final h C;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f38180j;

    /* renamed from: x  reason: collision with root package name */
    private final l<Boolean, p> f38181x;

    /* renamed from: y  reason: collision with root package name */
    private final int f38182y;

    /* renamed from: z  reason: collision with root package name */
    private final h f38183z;

    /* compiled from: DeleteActionBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void b(a aVar, int i11, FragmentManager fragmentManager, boolean z11, l lVar, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                z11 = false;
            }
            aVar.a(i11, fragmentManager, z11, lVar);
        }

        public final void a(int i11, FragmentManager fragmentManager, boolean z11, l<? super Boolean, p> onActionDone) {
            o.i(fragmentManager, "fragmentManager");
            o.i(onActionDone, "onActionDone");
            DeleteActionBottomSheet deleteActionBottomSheet = new DeleteActionBottomSheet(z11, onActionDone);
            Bundle bundle = new Bundle();
            bundle.putInt("ad_id", i11);
            deleteActionBottomSheet.setArguments(bundle);
            deleteActionBottomSheet.show(fragmentManager, "DeleteActionBottomSheet");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeleteActionBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class b implements FlowCollector<p> {
        b() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(p pVar, zz.a<? super p> aVar) {
            DeleteActionBottomSheet.this.dismiss();
            return p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeleteActionBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class c implements FlowCollector<Integer> {
        c() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(Integer num, zz.a<? super p> aVar) {
            if (num != null) {
                DeleteListingSoldBottomSheet.a aVar2 = DeleteListingSoldBottomSheet.F;
                FragmentManager childFragmentManager = DeleteActionBottomSheet.this.getChildFragmentManager();
                o.h(childFragmentManager, "getChildFragmentManager(...)");
                DeleteListingSoldBottomSheet.a.b(aVar2, childFragmentManager, num.intValue(), DeleteActionBottomSheet.this.I().Y0().getValue(), false, null, DeleteActionBottomSheet.this.f38181x, 24, null);
            }
            return p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeleteActionBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class d implements FlowCollector<Integer> {
        d() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(Integer num, zz.a<? super p> aVar) {
            if (num != null) {
                DeleteListingLostInterestBottomSheet.a aVar2 = DeleteListingLostInterestBottomSheet.D;
                int intValue = num.intValue();
                FragmentManager childFragmentManager = DeleteActionBottomSheet.this.getChildFragmentManager();
                o.h(childFragmentManager, "getChildFragmentManager(...)");
                aVar2.a(intValue, childFragmentManager, DeleteActionBottomSheet.this.f38181x);
            }
            return p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeleteActionBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class e implements FlowCollector<p> {
        e() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(p pVar, zz.a<? super p> aVar) {
            DeleteListingManyCallsBottomSheet.a aVar2 = DeleteListingManyCallsBottomSheet.C;
            FragmentManager childFragmentManager = DeleteActionBottomSheet.this.getChildFragmentManager();
            o.h(childFragmentManager, "getChildFragmentManager(...)");
            aVar2.a(childFragmentManager, DeleteActionBottomSheet.this.f38181x);
            return p.f75480a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeleteActionBottomSheet(boolean z11, l<? super Boolean, p> onActionDone) {
        h a11;
        h b11;
        o.i(onActionDone, "onActionDone");
        this.f38180j = z11;
        this.f38181x = onActionDone;
        this.f38182y = t0.B3;
        a11 = kotlin.d.a(new g00.a<Integer>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.choosereason.DeleteActionBottomSheet$adId$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // g00.a
            public final Integer invoke() {
                Bundle arguments = DeleteActionBottomSheet.this.getArguments();
                return Integer.valueOf(arguments != null ? arguments.getInt("ad_id", -1) : -1);
            }
        });
        this.f38183z = a11;
        g00.a<t0.b> aVar = new g00.a<t0.b>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.choosereason.DeleteActionBottomSheet$special$$inlined$assistedViewModel$1

            /* compiled from: ViewModelHiltExtension.kt */
            /* loaded from: classes3.dex */
            public static final class a extends androidx.lifecycle.a {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ DeleteActionBottomSheet f38190f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Fragment fragment, Bundle bundle, DeleteActionBottomSheet deleteActionBottomSheet) {
                    super(fragment, bundle);
                    this.f38190f = deleteActionBottomSheet;
                }

                @Override // androidx.lifecycle.a
                protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                    int G;
                    boolean z11;
                    o.i(key, "key");
                    o.i(modelClass, "modelClass");
                    o.i(handle, "handle");
                    b.a H = this.f38190f.H();
                    G = this.f38190f.G();
                    z11 = this.f38190f.f38180j;
                    b a11 = H.a(G, z11);
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
        this.B = FragmentViewModelLazyKt.b(this, s.b(com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.choosereason.b.class), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6(b11), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7(null, b11), aVar);
        this.C = FragmentViewModelLazyKt.b(this, s.b(ListingDetailsViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.choosereason.DeleteActionBottomSheet$special$$inlined$activityViewModels$default$1
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
        }, new g00.a<w3.a>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.choosereason.DeleteActionBottomSheet$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final w3.a invoke() {
                w3.a aVar2;
                g00.a aVar3 = g00.a.this;
                if (aVar3 == null || (aVar2 = (w3.a) aVar3.invoke()) == null) {
                    w3.a defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                    o.h(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                    return defaultViewModelCreationExtras;
                }
                return aVar2;
            }
        }, new g00.a<t0.b>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.choosereason.DeleteActionBottomSheet$special$$inlined$activityViewModels$default$3
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int G() {
        return ((Number) this.f38183z.getValue()).intValue();
    }

    private final void K() {
        OneShotEventHandler<p> v02 = t().v0();
        androidx.lifecycle.s viewLifecycleOwner = getViewLifecycleOwner();
        o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        v02.h(viewLifecycleOwner, new b());
        OneShotEventHandler<Integer> y02 = t().y0();
        androidx.lifecycle.s viewLifecycleOwner2 = getViewLifecycleOwner();
        o.h(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        y02.h(viewLifecycleOwner2, new c());
        OneShotEventHandler<Integer> w02 = t().w0();
        androidx.lifecycle.s viewLifecycleOwner3 = getViewLifecycleOwner();
        o.h(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        w02.h(viewLifecycleOwner3, new d());
        OneShotEventHandler<p> z02 = t().z0();
        androidx.lifecycle.s viewLifecycleOwner4 = getViewLifecycleOwner();
        o.h(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        z02.h(viewLifecycleOwner4, new e());
    }

    public final b.a H() {
        b.a aVar = this.A;
        if (aVar != null) {
            return aVar;
        }
        o.w("factory");
        return null;
    }

    public final ListingDetailsViewModel I() {
        return (ListingDetailsViewModel) this.C.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // w9.b
    /* renamed from: J */
    public com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.choosereason.b t() {
        return (com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.choosereason.b) this.B.getValue();
    }

    @Override // w9.b, androidx.fragment.app.j
    public int getTheme() {
        return z0.f70801k;
    }

    @Override // w9.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.i(view, "view");
        super.onViewCreated(view, bundle);
        K();
    }

    @Override // w9.b
    protected int s() {
        return this.f38182y;
    }
}
