package com.forsale.app.ui.bottomsheets.listingdetailsselleraction;

import aa.c3;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.b0;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.network.services.MyListingsService;
import com.forsale.app.datalayer.repositories.SessionRepository;
import com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType;
import com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItemViewModel;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.g;
import com.forsale.app.utils.v;
import g00.l;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowCollector;
import kr.m;
import t9.t0;
import t9.z0;
import w3.a;
import wz.h;
import wz.p;
/* compiled from: SellerActionBottomSheet.kt */
/* loaded from: classes3.dex */
public final class SellerActionBottomSheet extends vg.a<c3, SellerActionViewModel> {
    public static final a K = new a(null);
    public static final int L = 8;
    private final int A;
    private final h B;
    private final lr.a<m<?>> C;
    private final kr.b<m<?>> D;
    private boolean E;
    public MyListingsService F;
    public g G;
    public SessionRepository H;
    public v.a I;
    public SellerActionManualRepostItemViewModel.a J;

    /* renamed from: j  reason: collision with root package name */
    private final SellerActionType f38489j;

    /* renamed from: x  reason: collision with root package name */
    private final ListingItemDetails f38490x;

    /* renamed from: y  reason: collision with root package name */
    private final AggregatedAllAnalyticsLogger.AnalyticsPosition f38491y;

    /* renamed from: z  reason: collision with root package name */
    private final l<Boolean, p> f38492z;

    /* compiled from: SellerActionBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void b(a aVar, SellerActionType sellerActionType, ListingItemDetails listingItemDetails, AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition, FragmentManager fragmentManager, l lVar, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                analyticsPosition = null;
            }
            aVar.a(sellerActionType, listingItemDetails, analyticsPosition, fragmentManager, lVar);
        }

        public final void a(SellerActionType sellerActionType, ListingItemDetails listingItemDetails, AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition, FragmentManager fragmentManager, l<? super Boolean, p> onActionDone) {
            o.i(sellerActionType, "sellerActionType");
            o.i(listingItemDetails, "listingItemDetails");
            o.i(fragmentManager, "fragmentManager");
            o.i(onActionDone, "onActionDone");
            new SellerActionBottomSheet(sellerActionType, listingItemDetails, analyticsPosition, onActionDone).show(fragmentManager, "SellerActionBottomSheet");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SellerActionBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class b implements FlowCollector<Boolean> {
        b() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(Boolean bool, zz.a<? super p> aVar) {
            SellerActionBottomSheet.this.dismiss();
            return p.f75480a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SellerActionBottomSheet(SellerActionType sellerActionType, ListingItemDetails listingItemDetails, AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition, l<? super Boolean, p> onActionDone) {
        final h b11;
        o.i(sellerActionType, "sellerActionType");
        o.i(listingItemDetails, "listingItemDetails");
        o.i(onActionDone, "onActionDone");
        this.f38489j = sellerActionType;
        this.f38490x = listingItemDetails;
        this.f38491y = analyticsPosition;
        this.f38492z = onActionDone;
        this.A = t0.f70211g0;
        final g00.a<Fragment> aVar = new g00.a<Fragment>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionBottomSheet$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        b11 = kotlin.d.b(LazyThreadSafetyMode.NONE, new g00.a<x0>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionBottomSheet$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final x0 invoke() {
                return (x0) g00.a.this.invoke();
            }
        });
        this.B = FragmentViewModelLazyKt.b(this, s.b(SellerActionViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionBottomSheet$special$$inlined$viewModels$default$3
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
        }, new g00.a<w3.a>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionBottomSheet$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final w3.a invoke() {
                x0 c11;
                androidx.lifecycle.l lVar;
                w3.a aVar2;
                g00.a aVar3 = g00.a.this;
                if (aVar3 == null || (aVar2 = (w3.a) aVar3.invoke()) == null) {
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
                return aVar2;
            }
        }, new g00.a<t0.b>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionBottomSheet$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final t0.b invoke() {
                x0 c11;
                androidx.lifecycle.l lVar;
                t0.b defaultViewModelProviderFactory;
                c11 = FragmentViewModelLazyKt.c(b11);
                if (c11 instanceof androidx.lifecycle.l) {
                    lVar = (androidx.lifecycle.l) c11;
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
        lr.a<m<?>> aVar2 = new lr.a<>();
        this.C = aVar2;
        this.D = kr.b.f61943t.i(aVar2);
        this.E = true;
    }

    private final void H() {
        BuildersKt__Builders_commonKt.launch$default(t(), null, null, new SellerActionBottomSheet$bindActions$1(this, null), 3, null);
    }

    private final void M() {
        OneShotEventHandler<Boolean> y02 = t().y0();
        androidx.lifecycle.s viewLifecycleOwner = getViewLifecycleOwner();
        o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        y02.h(viewLifecycleOwner, new b());
    }

    private final void O() {
        RecyclerView recyclerView = ((c3) r()).O;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setHasFixedSize(false);
        recyclerView.setAdapter(this.D);
    }

    public final SellerActionManualRepostItemViewModel.a I() {
        SellerActionManualRepostItemViewModel.a aVar = this.J;
        if (aVar != null) {
            return aVar;
        }
        o.w("manualRepostItemFactory");
        return null;
    }

    public final MyListingsService J() {
        MyListingsService myListingsService = this.F;
        if (myListingsService != null) {
            return myListingsService;
        }
        o.w("myListingService");
        return null;
    }

    public final v.a K() {
        v.a aVar = this.I;
        if (aVar != null) {
            return aVar;
        }
        o.w("phoneParsingFactory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // w9.b
    /* renamed from: L */
    public SellerActionViewModel t() {
        return (SellerActionViewModel) this.B.getValue();
    }

    @Override // w9.b, androidx.fragment.app.j
    public int getTheme() {
        return z0.f70801k;
    }

    @Override // androidx.fragment.app.j, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Boolean bool;
        o.i(dialog, "dialog");
        l<Boolean, p> lVar = this.f38492z;
        b0<Boolean> z02 = t().z0();
        if (z02 == null || (bool = z02.getValue()) == null) {
            bool = Boolean.FALSE;
        }
        lVar.invoke(bool);
        super.onDismiss(dialog);
    }

    @Override // w9.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.i(view, "view");
        super.onViewCreated(view, bundle);
        O();
        M();
        H();
    }

    @Override // w9.b
    protected int s() {
        return this.A;
    }

    @Override // w9.b
    public boolean w() {
        return this.E;
    }
}
