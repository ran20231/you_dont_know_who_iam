package com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.listinglifetime;

import androidx.databinding.ObservableBoolean;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.b0;
import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.network.responses.listingdetails.ListingPinOption;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.CategoriesRepositories;
import com.forsale.app.datalayer.repositories.DistrictsRepository;
import com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel;
import com.forsale.app.utils.LiveDataExtensions;
import com.forsale.app.utils.TypeExtensionsKt;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import g00.l;
import g00.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import t9.y0;
import zz.a;
/* compiled from: ListingLifeTimeItemViewModel.kt */
/* loaded from: classes2.dex */
public final class ListingLifeTimeItemViewModel {
    public static final a A = new a(null);
    public static final int B = 8;

    /* renamed from: a  reason: collision with root package name */
    private final NewListingDetailsViewModel f27803a;

    /* renamed from: b  reason: collision with root package name */
    private final ListingItemDetails f27804b;

    /* renamed from: c  reason: collision with root package name */
    private final ApplicationResourcesRepository f27805c;

    /* renamed from: d  reason: collision with root package name */
    private final CategoriesRepositories f27806d;

    /* renamed from: e  reason: collision with root package name */
    private final DistrictsRepository f27807e;

    /* renamed from: f  reason: collision with root package name */
    private final MutableSharedFlow<AggregatedAllAnalyticsLogger.AnalyticsPosition> f27808f;

    /* renamed from: g  reason: collision with root package name */
    private final SharedFlow<AggregatedAllAnalyticsLogger.AnalyticsPosition> f27809g;

    /* renamed from: h  reason: collision with root package name */
    private final MutableSharedFlow<ListingDetailsEntity> f27810h;

    /* renamed from: i  reason: collision with root package name */
    private final SharedFlow<ListingDetailsEntity> f27811i;

    /* renamed from: j  reason: collision with root package name */
    private final b0<Boolean> f27812j;

    /* renamed from: k  reason: collision with root package name */
    private final LiveData<Boolean> f27813k;

    /* renamed from: l  reason: collision with root package name */
    private final b0<String> f27814l;

    /* renamed from: m  reason: collision with root package name */
    private final LiveData<String> f27815m;

    /* renamed from: n  reason: collision with root package name */
    private final b0<List<Object>> f27816n;

    /* renamed from: o  reason: collision with root package name */
    private final LiveData<List<Object>> f27817o;

    /* renamed from: p  reason: collision with root package name */
    private final ArrayList<Object> f27818p;

    /* renamed from: q  reason: collision with root package name */
    private final b0<Boolean> f27819q;

    /* renamed from: r  reason: collision with root package name */
    private final LiveData<Boolean> f27820r;

    /* renamed from: s  reason: collision with root package name */
    private final b0<Boolean> f27821s;

    /* renamed from: t  reason: collision with root package name */
    private final LiveData<Boolean> f27822t;

    /* renamed from: u  reason: collision with root package name */
    private final ObservableBoolean f27823u;

    /* renamed from: v  reason: collision with root package name */
    private final String f27824v;

    /* renamed from: w  reason: collision with root package name */
    private final MutableStateFlow<String> f27825w;

    /* renamed from: x  reason: collision with root package name */
    private final StateFlow<String> f27826x;

    /* renamed from: y  reason: collision with root package name */
    private final b0<Boolean> f27827y;

    /* renamed from: z  reason: collision with root package name */
    private final LiveData<Boolean> f27828z;

    /* compiled from: ListingLifeTimeItemViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ListingLifeTimeItemViewModel(NewListingDetailsViewModel sharedViewModel, ListingItemDetails listingDetails, ApplicationResourcesRepository appRepo, CategoriesRepositories categoriesRepositories, DistrictsRepository districtsRepository) {
        o.i(sharedViewModel, "sharedViewModel");
        o.i(listingDetails, "listingDetails");
        o.i(appRepo, "appRepo");
        o.i(categoriesRepositories, "categoriesRepositories");
        o.i(districtsRepository, "districtsRepository");
        this.f27803a = sharedViewModel;
        this.f27804b = listingDetails;
        this.f27805c = appRepo;
        this.f27806d = categoriesRepositories;
        this.f27807e = districtsRepository;
        MutableSharedFlow<AggregatedAllAnalyticsLogger.AnalyticsPosition> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f27808f = MutableSharedFlow$default;
        this.f27809g = FlowKt.asSharedFlow(MutableSharedFlow$default);
        MutableSharedFlow<ListingDetailsEntity> MutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f27810h = MutableSharedFlow$default2;
        this.f27811i = FlowKt.asSharedFlow(MutableSharedFlow$default2);
        Boolean bool = Boolean.FALSE;
        b0<Boolean> b0Var = new b0<>(bool);
        this.f27812j = b0Var;
        this.f27813k = b0Var;
        b0<String> b0Var2 = new b0<>();
        this.f27814l = b0Var2;
        this.f27815m = b0Var2;
        b0<List<Object>> b0Var3 = new b0<>();
        this.f27816n = b0Var3;
        this.f27817o = b0Var3;
        this.f27818p = new ArrayList<>();
        b0<Boolean> b0Var4 = new b0<>(bool);
        this.f27819q = b0Var4;
        this.f27820r = b0Var4;
        b0<Boolean> b0Var5 = new b0<>(Boolean.TRUE);
        this.f27821s = b0Var5;
        this.f27822t = b0Var5;
        this.f27823u = new ObservableBoolean(true);
        this.f27824v = "yyyy-MM-dd HH:mm:ss";
        MutableStateFlow<String> MutableStateFlow = StateFlowKt.MutableStateFlow("");
        this.f27825w = MutableStateFlow;
        this.f27826x = FlowKt.asStateFlow(MutableStateFlow);
        b0<Boolean> b0Var6 = new b0<>(Boolean.valueOf(listingDetails.getBundle() != null));
        this.f27827y = b0Var6;
        this.f27828z = LiveDataExtensions.a(b0Var3, b0Var6, new p<List<? extends Object>, Boolean, Boolean>() { // from class: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.listinglifetime.ListingLifeTimeItemViewModel$isVisible$1
            @Override // g00.p
            /* renamed from: b */
            public final Boolean invoke(List<? extends Object> list, Boolean bool2) {
                boolean z11;
                boolean z12 = false;
                if (list != null && (!list.isEmpty())) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11 || o.d(bool2, Boolean.TRUE)) {
                    z12 = true;
                }
                return Boolean.valueOf(z12);
            }
        });
        s();
        v();
        w();
        t();
        u();
        A();
        r();
    }

    private final void A() {
        if (this.f27818p.size() > 2) {
            this.f27819q.postValue(Boolean.TRUE);
            this.f27821s.postValue(Boolean.FALSE);
        }
        this.f27816n.postValue(this.f27818p);
    }

    private final void r() {
        BuildersKt__Builders_commonKt.launch$default(this.f27803a, null, null, new ListingLifeTimeItemViewModel$loadCurrency$1(this, null), 3, null);
    }

    private final void s() {
        String dateExpired;
        boolean z11;
        if (!TypeExtensionsKt.h0(this.f27804b.isAutoRepost()) && (dateExpired = this.f27804b.getDateExpired()) != null) {
            com.forsale.app.features.categories.listingdetails.a t11 = TypeExtensionsKt.t(dateExpired, this.f27824v);
            if (!TypeExtensionsKt.O(dateExpired, this.f27824v)) {
                b0<Boolean> b0Var = this.f27812j;
                if (t11.a() < 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                b0Var.postValue(Boolean.valueOf(z11));
                if (t11.a() < 2) {
                    this.f27814l.postValue(this.f27805c.getString(y0.f70637q6, Integer.valueOf(t11.a()), Integer.valueOf(t11.b())));
                }
            }
        }
    }

    private final void t() {
        if (this.f27804b.getExtendStatus() != null) {
            this.f27818p.add(this.f27804b.getExtendStatus());
        }
    }

    private final void u() {
        if (this.f27804b.getOtherStatus() != null) {
            this.f27818p.addAll(this.f27804b.getOtherStatus());
        }
    }

    private final void v() {
        List<ListingPinOption> pinStatus;
        boolean z11 = false;
        if (this.f27804b.getPinStatus() != null && (!pinStatus.isEmpty())) {
            z11 = true;
        }
        if (z11) {
            this.f27818p.addAll(this.f27804b.getPinStatus());
        }
    }

    private final void w() {
        List<ListingPinOption> promoteStatus;
        boolean z11 = false;
        if (this.f27804b.getPromoteStatus() != null && (!promoteStatus.isEmpty())) {
            z11 = true;
        }
        if (z11) {
            this.f27818p.addAll(this.f27804b.getPromoteStatus());
        }
    }

    public final LiveData<List<Object>> d() {
        return this.f27817o;
    }

    public final LiveData<String> e() {
        return this.f27815m;
    }

    public final SharedFlow<AggregatedAllAnalyticsLogger.AnalyticsPosition> f() {
        return this.f27809g;
    }

    public final SharedFlow<ListingDetailsEntity> g() {
        return this.f27811i;
    }

    public final CategoriesRepositories h() {
        return this.f27806d;
    }

    public final StateFlow<String> i() {
        return this.f27826x;
    }

    public final DistrictsRepository j() {
        return this.f27807e;
    }

    public final LiveData<Boolean> k() {
        return this.f27820r;
    }

    public final ListingItemDetails l() {
        return this.f27804b;
    }

    public final NewListingDetailsViewModel m() {
        return this.f27803a;
    }

    public final LiveData<Boolean> n() {
        return this.f27813k;
    }

    public final ObservableBoolean o() {
        return this.f27823u;
    }

    public final LiveData<Boolean> p() {
        return this.f27822t;
    }

    public final LiveData<Boolean> q() {
        return this.f27828z;
    }

    public final void x() {
        BuildersKt__Builders_commonKt.launch$default(this.f27803a, null, null, new ListingLifeTimeItemViewModel$onAutoRepostClicked$1(this, null), 3, null);
    }

    public final void y() {
        this.f27803a.R1().B0(AggregatedAllAnalyticsLogger.AnalyticsPosition.LISTING_LIFE_TIME, new l<ListingDetailsEntity, wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.listinglifetime.ListingLifeTimeItemViewModel$onBoostClicked$1

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: ListingLifeTimeItemViewModel.kt */
            @d(c = "com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.listinglifetime.ListingLifeTimeItemViewModel$onBoostClicked$1$1", f = "ListingLifeTimeItemViewModel.kt", l = {77}, m = "invokeSuspend")
            /* renamed from: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.listinglifetime.ListingLifeTimeItemViewModel$onBoostClicked$1$1  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

                /* renamed from: a  reason: collision with root package name */
                int f27835a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ ListingLifeTimeItemViewModel f27836b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ ListingDetailsEntity f27837c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(ListingLifeTimeItemViewModel listingLifeTimeItemViewModel, ListingDetailsEntity listingDetailsEntity, a<? super AnonymousClass1> aVar) {
                    super(2, aVar);
                    this.f27836b = listingLifeTimeItemViewModel;
                    this.f27837c = listingDetailsEntity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final a<wz.p> create(Object obj, a<?> aVar) {
                    return new AnonymousClass1(this.f27836b, this.f27837c, aVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object f11;
                    MutableSharedFlow mutableSharedFlow;
                    f11 = b.f();
                    int i11 = this.f27835a;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            f.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        f.b(obj);
                        mutableSharedFlow = this.f27836b.f27810h;
                        ListingDetailsEntity listingDetailsEntity = this.f27837c;
                        this.f27835a = 1;
                        if (mutableSharedFlow.emit(listingDetailsEntity, this) == f11) {
                            return f11;
                        }
                    }
                    return wz.p.f75480a;
                }

                @Override // g00.p
                public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
                    return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(ListingDetailsEntity it2) {
                o.i(it2, "it");
                BuildersKt__Builders_commonKt.launch$default(ListingLifeTimeItemViewModel.this.m(), null, null, new AnonymousClass1(ListingLifeTimeItemViewModel.this, it2, null), 3, null);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(ListingDetailsEntity listingDetailsEntity) {
                b(listingDetailsEntity);
                return wz.p.f75480a;
            }
        });
    }

    public final void z() {
        Boolean bool;
        b0<Boolean> b0Var = this.f27821s;
        Boolean value = b0Var.getValue();
        if (value != null) {
            bool = Boolean.valueOf(!value.booleanValue());
        } else {
            bool = null;
        }
        b0Var.postValue(bool);
        this.f27816n.postValue(this.f27818p);
    }
}
