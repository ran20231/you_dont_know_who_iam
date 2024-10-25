package com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.sold;

import aa.u2;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.t0;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.network.responses.listingdetails.ItemStatus;
import com.forsale.app.features.expiresoon.ExpireSoonCoordinator;
import com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.DeleteUtils;
import com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.sold.DeleteListingSoldViewModel;
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
/* compiled from: DeleteListingSoldBottomSheet.kt */
/* loaded from: classes3.dex */
public final class DeleteListingSoldBottomSheet extends rg.b<u2, DeleteListingSoldViewModel> {
    public static final a F = new a(null);
    public static final int G = 8;
    private boolean A;
    private final h B;
    private final h C;
    public DeleteListingSoldViewModel.a D;
    private final h E;

    /* renamed from: j */
    private final ListingItemDetails f38227j;

    /* renamed from: x */
    private final ExpireSoonCoordinator f38228x;

    /* renamed from: y */
    private final l<Boolean, p> f38229y;

    /* renamed from: z */
    private final int f38230z;

    /* compiled from: DeleteListingSoldBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void b(a aVar, FragmentManager fragmentManager, int i11, ListingItemDetails listingItemDetails, boolean z11, ExpireSoonCoordinator expireSoonCoordinator, l lVar, int i12, Object obj) {
            ListingItemDetails listingItemDetails2;
            boolean z12;
            ExpireSoonCoordinator expireSoonCoordinator2;
            if ((i12 & 4) != 0) {
                listingItemDetails2 = null;
            } else {
                listingItemDetails2 = listingItemDetails;
            }
            if ((i12 & 8) != 0) {
                z12 = false;
            } else {
                z12 = z11;
            }
            if ((i12 & 16) != 0) {
                expireSoonCoordinator2 = null;
            } else {
                expireSoonCoordinator2 = expireSoonCoordinator;
            }
            aVar.a(fragmentManager, i11, listingItemDetails2, z12, expireSoonCoordinator2, lVar);
        }

        public final void a(FragmentManager fragmentManager, int i11, ListingItemDetails listingItemDetails, boolean z11, ExpireSoonCoordinator expireSoonCoordinator, l<? super Boolean, p> onActionDone) {
            o.i(fragmentManager, "fragmentManager");
            o.i(onActionDone, "onActionDone");
            DeleteListingSoldBottomSheet deleteListingSoldBottomSheet = new DeleteListingSoldBottomSheet(listingItemDetails, expireSoonCoordinator, onActionDone);
            Bundle bundle = new Bundle();
            bundle.putInt("ad_id", i11);
            bundle.putBoolean("is_expire_soon_item", z11);
            deleteListingSoldBottomSheet.setArguments(bundle);
            deleteListingSoldBottomSheet.show(fragmentManager, "DeleteListingSoldBottomSheet");
        }
    }

    /* compiled from: DeleteListingSoldBottomSheet.kt */
    /* loaded from: classes3.dex */
    static final class b implements FlowCollector<p> {
        b() {
            DeleteListingSoldBottomSheet.this = r1;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(p pVar, zz.a<? super p> aVar) {
            DeleteListingSoldBottomSheet.this.dismiss();
            return p.f75480a;
        }
    }

    /* compiled from: DeleteListingSoldBottomSheet.kt */
    /* loaded from: classes3.dex */
    static final class c implements FlowCollector<Boolean> {
        c() {
            DeleteListingSoldBottomSheet.this = r1;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(Boolean bool, zz.a<? super p> aVar) {
            ItemStatus itemStatus;
            boolean z11;
            if (bool != null) {
                DeleteListingSoldBottomSheet deleteListingSoldBottomSheet = DeleteListingSoldBottomSheet.this;
                boolean booleanValue = bool.booleanValue();
                ListingItemDetails listingItemDetails = DeleteListingSoldBottomSheet.this.f38227j;
                if (listingItemDetails != null) {
                    itemStatus = listingItemDetails.getStatus();
                } else {
                    itemStatus = null;
                }
                if (itemStatus == ItemStatus.DRAFT) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                DeleteUtils.a(deleteListingSoldBottomSheet, booleanValue, z11, DeleteListingSoldBottomSheet.this.L(), DeleteListingSoldBottomSheet.this.f38228x, DeleteListingSoldBottomSheet.this.f38229y);
            }
            return p.f75480a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeleteListingSoldBottomSheet(ListingItemDetails listingItemDetails, ExpireSoonCoordinator expireSoonCoordinator, l<? super Boolean, p> onActionDone) {
        h a11;
        h a12;
        h b11;
        o.i(onActionDone, "onActionDone");
        this.f38227j = listingItemDetails;
        this.f38228x = expireSoonCoordinator;
        this.f38229y = onActionDone;
        this.f38230z = t0.f70183c0;
        this.A = true;
        a11 = d.a(new g00.a<Integer>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.sold.DeleteListingSoldBottomSheet$adId$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // g00.a
            public final Integer invoke() {
                Bundle arguments = DeleteListingSoldBottomSheet.this.getArguments();
                return Integer.valueOf(arguments != null ? arguments.getInt("ad_id", -1) : -1);
            }
        });
        this.B = a11;
        a12 = d.a(new g00.a<Boolean>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.sold.DeleteListingSoldBottomSheet$isExpireSoonItem$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // g00.a
            public final Boolean invoke() {
                Bundle arguments = DeleteListingSoldBottomSheet.this.getArguments();
                return Boolean.valueOf(arguments != null ? arguments.getBoolean("is_expire_soon_item", false) : false);
            }
        });
        this.C = a12;
        g00.a<t0.b> aVar = new g00.a<t0.b>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.sold.DeleteListingSoldBottomSheet$special$$inlined$assistedViewModel$1

            /* compiled from: ViewModelHiltExtension.kt */
            /* loaded from: classes3.dex */
            public static final class a extends androidx.lifecycle.a {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ DeleteListingSoldBottomSheet f38233f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Fragment fragment, Bundle bundle, DeleteListingSoldBottomSheet deleteListingSoldBottomSheet) {
                    super(fragment, bundle);
                    this.f38233f = deleteListingSoldBottomSheet;
                }

                @Override // androidx.lifecycle.a
                protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                    int I;
                    o.i(key, "key");
                    o.i(modelClass, "modelClass");
                    o.i(handle, "handle");
                    DeleteListingSoldViewModel.a J = this.f38233f.J();
                    I = this.f38233f.I();
                    DeleteListingSoldViewModel a11 = J.a(I, this.f38233f.f38227j, this.f38233f.L());
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
        this.E = FragmentViewModelLazyKt.b(this, s.b(DeleteListingSoldViewModel.class), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6(b11), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7(null, b11), aVar);
    }

    public final int I() {
        return ((Number) this.B.getValue()).intValue();
    }

    public final boolean L() {
        return ((Boolean) this.C.getValue()).booleanValue();
    }

    public final DeleteListingSoldViewModel.a J() {
        DeleteListingSoldViewModel.a aVar = this.D;
        if (aVar != null) {
            return aVar;
        }
        o.w("factory");
        return null;
    }

    @Override // w9.b
    /* renamed from: K */
    public DeleteListingSoldViewModel t() {
        return (DeleteListingSoldViewModel) this.E.getValue();
    }

    @Override // w9.b, androidx.fragment.app.j
    public int getTheme() {
        return z0.f70801k;
    }

    @Override // w9.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.i(view, "view");
        super.onViewCreated(view, bundle);
        OneShotEventHandler<p> B0 = t().B0();
        androidx.lifecycle.s viewLifecycleOwner = getViewLifecycleOwner();
        o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        B0.h(viewLifecycleOwner, new b());
        OneShotEventHandler<Boolean> A0 = t().A0();
        androidx.lifecycle.s viewLifecycleOwner2 = getViewLifecycleOwner();
        o.h(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        A0.h(viewLifecycleOwner2, new c());
        ((u2) r()).P.i0(Boolean.valueOf(t().K0()));
        ((u2) r()).P.j0(Boolean.valueOf(t().L0()));
        ((u2) r()).u();
    }

    @Override // w9.b
    protected int s() {
        return this.f38230z;
    }

    @Override // w9.b
    public boolean w() {
        return this.A;
    }
}
