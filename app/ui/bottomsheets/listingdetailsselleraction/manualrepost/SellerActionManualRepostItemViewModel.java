package com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost;

import androidx.lifecycle.b0;
import com.forsale.app.datalayer.database.CategoryDistrict;
import com.forsale.app.datalayer.database.UserEntity;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.network.responses.PlansResponse;
import com.forsale.app.datalayer.network.services.MyListingsService;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.CategoriesRepositories;
import com.forsale.app.datalayer.repositories.RegionsRepository;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import com.forsale.app.utils.analytics.KnetPaymentType;
import com.forsale.app.utils.analytics.g;
import com.forsale.app.utils.facades.user.UserProfileInteractor;
import com.github.mikephil.charting.utils.Utils;
import dj.i;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.CoroutineContext;
import kotlin.d;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import t9.y0;
import wz.h;
import wz.p;
/* compiled from: SellerActionManualRepostItemViewModel.kt */
/* loaded from: classes3.dex */
public final class SellerActionManualRepostItemViewModel {

    /* renamed from: a  reason: collision with root package name */
    private final CoroutineScope f38718a;

    /* renamed from: b  reason: collision with root package name */
    private final ListingItemDetails f38719b;

    /* renamed from: c  reason: collision with root package name */
    private final MyListingsService f38720c;

    /* renamed from: d  reason: collision with root package name */
    private final ApplicationResourcesRepository f38721d;

    /* renamed from: e  reason: collision with root package name */
    private final AggregatedAllAnalyticsLogger f38722e;

    /* renamed from: f  reason: collision with root package name */
    private final g f38723f;

    /* renamed from: g  reason: collision with root package name */
    private final CategoriesRepositories f38724g;

    /* renamed from: h  reason: collision with root package name */
    private final RegionsRepository f38725h;

    /* renamed from: i  reason: collision with root package name */
    private final UserProfileInteractor f38726i;

    /* renamed from: j  reason: collision with root package name */
    private final String f38727j;

    /* renamed from: k  reason: collision with root package name */
    private final b0<Boolean> f38728k;

    /* renamed from: l  reason: collision with root package name */
    private final b0<String> f38729l;

    /* renamed from: m  reason: collision with root package name */
    private final b0<String> f38730m;

    /* renamed from: n  reason: collision with root package name */
    private final OneShotEventHandler<p> f38731n;

    /* renamed from: o  reason: collision with root package name */
    private final OneShotEventHandler<Boolean> f38732o;

    /* renamed from: p  reason: collision with root package name */
    private final OneShotEventHandler<Boolean> f38733p;

    /* renamed from: q  reason: collision with root package name */
    private final b0<Boolean> f38734q;

    /* renamed from: r  reason: collision with root package name */
    private final OneShotEventHandler<p> f38735r;

    /* renamed from: s  reason: collision with root package name */
    private final MutableStateFlow<UserEntity> f38736s;

    /* renamed from: t  reason: collision with root package name */
    private final StateFlow<UserEntity> f38737t;

    /* renamed from: u  reason: collision with root package name */
    private final b0<CategoryDistrict> f38738u;

    /* renamed from: v  reason: collision with root package name */
    private final b0<String> f38739v;

    /* renamed from: w  reason: collision with root package name */
    private final h f38740w;

    /* compiled from: SellerActionManualRepostItemViewModel.kt */
    /* loaded from: classes3.dex */
    public interface a {
        SellerActionManualRepostItemViewModel a(CoroutineScope coroutineScope, ListingItemDetails listingItemDetails, String str);
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SellerActionManualRepostItemViewModel f38741a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CoroutineExceptionHandler.Key key, SellerActionManualRepostItemViewModel sellerActionManualRepostItemViewModel) {
            super(key);
            this.f38741a = sellerActionManualRepostItemViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            this.f38741a.v().f(th2);
            this.f38741a.U(false);
        }
    }

    public SellerActionManualRepostItemViewModel(CoroutineScope coroutineScope, ListingItemDetails listingItemDetails, MyListingsService myListingsService, ApplicationResourcesRepository appRepo, AggregatedAllAnalyticsLogger analyticsLogger, g aggregatedAnalyticsLogger, CategoriesRepositories categoriesRepositories, RegionsRepository regionsRepository, UserProfileInteractor userProfileInteractor, String deviceId) {
        h a11;
        o.i(coroutineScope, "coroutineScope");
        o.i(listingItemDetails, "listingItemDetails");
        o.i(myListingsService, "myListingsService");
        o.i(appRepo, "appRepo");
        o.i(analyticsLogger, "analyticsLogger");
        o.i(aggregatedAnalyticsLogger, "aggregatedAnalyticsLogger");
        o.i(categoriesRepositories, "categoriesRepositories");
        o.i(regionsRepository, "regionsRepository");
        o.i(userProfileInteractor, "userProfileInteractor");
        o.i(deviceId, "deviceId");
        this.f38718a = coroutineScope;
        this.f38719b = listingItemDetails;
        this.f38720c = myListingsService;
        this.f38721d = appRepo;
        this.f38722e = analyticsLogger;
        this.f38723f = aggregatedAnalyticsLogger;
        this.f38724g = categoriesRepositories;
        this.f38725h = regionsRepository;
        this.f38726i = userProfileInteractor;
        this.f38727j = deviceId;
        Boolean bool = Boolean.TRUE;
        this.f38728k = new b0<>(bool);
        this.f38729l = new b0<>();
        this.f38730m = new b0<>();
        this.f38731n = new OneShotEventHandler<>(null, 0, 3, null);
        this.f38732o = new OneShotEventHandler<>(null, 0, 3, null);
        this.f38733p = new OneShotEventHandler<>(null, 0, 3, null);
        this.f38734q = new b0<>(bool);
        this.f38735r = new OneShotEventHandler<>(null, 0, 3, null);
        MutableStateFlow<UserEntity> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.f38736s = MutableStateFlow;
        this.f38737t = FlowKt.asStateFlow(MutableStateFlow);
        this.f38738u = new b0<>();
        this.f38739v = new b0<>();
        a11 = d.a(new g00.a<i>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItemViewModel$reporter$2
            @Override // g00.a
            /* renamed from: b */
            public final i invoke() {
                return i.f54287a.invoke();
            }
        });
        this.f38740w = a11;
        G();
    }

    private final boolean A(UserEntity userEntity, double d11, boolean z11) {
        float f11;
        Float freeAds = userEntity.getFreeAds();
        if (freeAds != null) {
            f11 = freeAds.floatValue();
        } else {
            f11 = 0.0f;
        }
        double d12 = Utils.DOUBLE_EPSILON;
        if (z11) {
            d12 = Utils.DOUBLE_EPSILON + f11;
        }
        if (d12 < d11) {
            return false;
        }
        return true;
    }

    private final boolean B(UserEntity userEntity, double d11) {
        float f11;
        Float premiumAds = userEntity.getPremiumAds();
        if (premiumAds != null) {
            f11 = premiumAds.floatValue();
        } else {
            f11 = 0.0f;
        }
        if (f11 + Utils.DOUBLE_EPSILON < d11) {
            return false;
        }
        return true;
    }

    private final boolean C(boolean z11) {
        return z(false, z11);
    }

    private final boolean D(boolean z11) {
        return z(true, z11);
    }

    private final void G() {
        BuildersKt__Builders_commonKt.launch$default(this.f38718a, null, null, new SellerActionManualRepostItemViewModel$loadRepost$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H() {
        K(true);
        J(this, AggregatedAllAnalyticsLogger.MyListingActionEvents.MY_LISTING_DETAILS_REPOSTED, true, true, AggregatedAllAnalyticsLogger.AnalyticsPosition.SETTINGS, null, 16, null);
    }

    private final void I(AggregatedAllAnalyticsLogger.MyListingActionEvents myListingActionEvents, boolean z11, boolean z12, AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition, AggregatedAllAnalyticsLogger.AnalyticsOnOffStatus analyticsOnOffStatus) {
        ListingItemDetails listingItemDetails = this.f38719b;
        if (listingItemDetails != null) {
            BuildersKt__Builders_commonKt.launch$default(this.f38718a, null, null, new SellerActionManualRepostItemViewModel$logMyListingAnalytics$1$1(this, myListingActionEvents, listingItemDetails, z11, z12, analyticsPosition, analyticsOnOffStatus, null), 3, null);
        }
    }

    static /* synthetic */ void J(SellerActionManualRepostItemViewModel sellerActionManualRepostItemViewModel, AggregatedAllAnalyticsLogger.MyListingActionEvents myListingActionEvents, boolean z11, boolean z12, AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition, AggregatedAllAnalyticsLogger.AnalyticsOnOffStatus analyticsOnOffStatus, int i11, Object obj) {
        boolean z13;
        boolean z14;
        AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition2;
        AggregatedAllAnalyticsLogger.AnalyticsOnOffStatus analyticsOnOffStatus2;
        if ((i11 & 2) != 0) {
            z13 = false;
        } else {
            z13 = z11;
        }
        if ((i11 & 4) != 0) {
            z14 = false;
        } else {
            z14 = z12;
        }
        if ((i11 & 8) != 0) {
            analyticsPosition2 = null;
        } else {
            analyticsPosition2 = analyticsPosition;
        }
        if ((i11 & 16) != 0) {
            analyticsOnOffStatus2 = null;
        } else {
            analyticsOnOffStatus2 = analyticsOnOffStatus;
        }
        sellerActionManualRepostItemViewModel.I(myListingActionEvents, z13, z14, analyticsPosition2, analyticsOnOffStatus2);
    }

    private final void K(boolean z11) {
        CategoryDistrict value = this.f38738u.getValue();
        if (value != null) {
            if (z11) {
                this.f38723f.g(r(value), KnetPaymentType.LISTING);
            }
            this.f38723f.a(KnetPaymentType.LISTING, r(value), false);
        }
    }

    private final void L() {
        this.f38733p.i(Boolean.TRUE);
        BuildersKt__Builders_commonKt.launch$default(this.f38718a, new b(CoroutineExceptionHandler.Key, this), null, new SellerActionManualRepostItemViewModel$manualRePost$2(this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P(zz.a<? super wz.p> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItemViewModel$refreshUser$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItemViewModel$refreshUser$1 r0 = (com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItemViewModel$refreshUser$1) r0
            int r1 = r0.f38767d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38767d = r1
            goto L18
        L13:
            com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItemViewModel$refreshUser$1 r0 = new com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItemViewModel$refreshUser$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f38765b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f38767d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r6)
            goto L5f
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.f38764a
            com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItemViewModel r2 = (com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItemViewModel) r2
            kotlin.f.b(r6)
            goto L4d
        L3c:
            kotlin.f.b(r6)
            com.forsale.app.utils.facades.user.UserProfileInteractor r6 = r5.f38726i
            r0.f38764a = r5
            r0.f38767d = r4
            java.lang.Object r6 = r6.i(r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            r2 = r5
        L4d:
            r4 = r6
            com.forsale.app.datalayer.database.UserEntity r4 = (com.forsale.app.datalayer.database.UserEntity) r4
            if (r4 == 0) goto L5f
            kotlinx.coroutines.flow.MutableStateFlow<com.forsale.app.datalayer.database.UserEntity> r2 = r2.f38736s
            r0.f38764a = r6
            r0.f38767d = r3
            java.lang.Object r6 = r2.emit(r4, r0)
            if (r6 != r1) goto L5f
            return r1
        L5f:
            wz.p r6 = wz.p.f75480a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItemViewModel.P(zz.a):java.lang.Object");
    }

    private final String Q(boolean z11, CategoryDistrict categoryDistrict) {
        String t11 = t(categoryDistrict);
        String y11 = y(z11);
        String p11 = p(z11);
        w wVar = w.f61809a;
        String format = String.format("%s %s %s", Arrays.copyOf(new Object[]{y11, t11, p11}, 3));
        o.h(format, "format(...)");
        return format;
    }

    private final String R(Boolean bool) {
        int i11;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (booleanValue) {
                i11 = y0.f70570m7;
            } else if (!booleanValue) {
                i11 = y0.f70621p7;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            i11 = y0.f70519j7;
        }
        return this.f38721d.getString(i11, new Object[0]);
    }

    private final void S(Boolean bool) {
        CategoryDistrict value;
        this.f38729l.postValue(R(bool));
        b0<CategoryDistrict> b0Var = this.f38738u;
        if (b0Var != null && (value = b0Var.getValue()) != null && bool != null) {
            bool.booleanValue();
            this.f38730m.postValue(Q(bool.booleanValue(), value));
        }
    }

    static /* synthetic */ void T(SellerActionManualRepostItemViewModel sellerActionManualRepostItemViewModel, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = null;
        }
        sellerActionManualRepostItemViewModel.S(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U(boolean z11) {
        this.f38732o.i(Boolean.valueOf(z11));
    }

    private final void j(boolean z11) {
        boolean C = C(z11);
        if (C) {
            S(Boolean.TRUE);
        } else if (!C) {
            l();
        }
    }

    private final void k(boolean z11) {
        this.f38728k.postValue(Boolean.FALSE);
        if (z11) {
            j(z11);
        } else if (!z11) {
            l();
        }
    }

    private final void l() {
        boolean D = D(false);
        if (D) {
            S(Boolean.FALSE);
        } else if (!D) {
            T(this, null, 1, null);
            this.f38734q.postValue(Boolean.FALSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(int r5, zz.a<? super wz.p> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItemViewModel$getCategory$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItemViewModel$getCategory$1 r0 = (com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItemViewModel$getCategory$1) r0
            int r1 = r0.f38745d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38745d = r1
            goto L18
        L13:
            com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItemViewModel$getCategory$1 r0 = new com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItemViewModel$getCategory$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f38743b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f38745d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f38742a
            com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItemViewModel r5 = (com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItemViewModel) r5
            kotlin.f.b(r6)
            goto L46
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.f.b(r6)
            com.forsale.app.datalayer.repositories.CategoriesRepositories r6 = r4.f38724g
            r0.f38742a = r4
            r0.f38745d = r3
            java.lang.Object r6 = r6.getCategoryDistrictByCategoryId(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            r5 = r4
        L46:
            com.forsale.app.datalayer.database.CategoryDistrict r6 = (com.forsale.app.datalayer.database.CategoryDistrict) r6
            if (r6 == 0) goto L68
            androidx.lifecycle.b0<com.forsale.app.datalayer.database.CategoryDistrict> r0 = r5.f38738u
            r0.postValue(r6)
            com.forsale.app.datalayer.network.responses.ListingItemDetails r6 = r5.f38719b
            com.forsale.app.datalayer.network.responses.PlansResponse$Plan r6 = r6.getPlan()
            if (r6 == 0) goto L68
            java.lang.Integer r6 = r6.isFree()
            if (r6 == 0) goto L68
            int r6 = r6.intValue()
            boolean r6 = com.forsale.app.utils.TypeExtensionsKt.h0(r6)
            r5.k(r6)
        L68:
            wz.p r5 = wz.p.f75480a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItemViewModel.o(int, zz.a):java.lang.Object");
    }

    private final String p(boolean z11) {
        if (z11) {
            return this.f38721d.getString(y0.f70553l7, new Object[0]);
        }
        return this.f38721d.getString(y0.f70604o7, new Object[0]);
    }

    private final double r(CategoryDistrict categoryDistrict) {
        float price;
        Float price2;
        PlansResponse.Plan plan = this.f38719b.getPlan();
        if (plan != null && (price2 = plan.getPrice()) != null) {
            price = price2.floatValue();
        } else {
            price = categoryDistrict.getPrice();
        }
        return price;
    }

    private final String t(CategoryDistrict categoryDistrict) {
        w wVar = w.f61809a;
        String format = String.format("%.2f %s", Arrays.copyOf(new Object[]{Double.valueOf(r(categoryDistrict)), this.f38739v.getValue()}, 2));
        o.h(format, "format(...)");
        return format;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(int r5, zz.a<? super wz.p> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItemViewModel$getRegion$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItemViewModel$getRegion$1 r0 = (com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItemViewModel$getRegion$1) r0
            int r1 = r0.f38749d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38749d = r1
            goto L18
        L13:
            com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItemViewModel$getRegion$1 r0 = new com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItemViewModel$getRegion$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f38747b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f38749d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f38746a
            com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItemViewModel r5 = (com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItemViewModel) r5
            kotlin.f.b(r6)
            goto L4a
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.f.b(r6)
            com.forsale.app.datalayer.repositories.RegionsRepository r6 = r4.f38725h
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.a.d(r5)
            r0.f38746a = r4
            r0.f38749d = r3
            java.lang.Object r6 = r6.getRegion(r5, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            r5 = r4
        L4a:
            com.forsale.app.datalayer.database.RegionEntity r6 = (com.forsale.app.datalayer.database.RegionEntity) r6
            if (r6 == 0) goto L57
            androidx.lifecycle.b0<java.lang.String> r5 = r5.f38739v
            java.lang.String r6 = r6.getCurrency()
            r5.postValue(r6)
        L57:
            wz.p r5 = wz.p.f75480a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItemViewModel.u(int, zz.a):java.lang.Object");
    }

    private final String y(boolean z11) {
        if (z11) {
            return this.f38721d.getString(y0.f70536k7, new Object[0]);
        }
        return this.f38721d.getString(y0.f70587n7, new Object[0]);
    }

    private final boolean z(boolean z11, boolean z12) {
        Boolean bool;
        CategoryDistrict value;
        boolean A;
        UserEntity value2 = this.f38737t.getValue();
        if (value2 != null) {
            b0<CategoryDistrict> b0Var = this.f38738u;
            if (b0Var != null && (value = b0Var.getValue()) != null) {
                if (z11) {
                    o.f(value);
                    A = B(value2, r(value));
                } else {
                    o.f(value);
                    A = A(value2, r(value), z12);
                }
                bool = Boolean.valueOf(A);
            } else {
                bool = null;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return false;
    }

    public final OneShotEventHandler<Boolean> E() {
        return this.f38733p;
    }

    public final b0<Boolean> F() {
        return this.f38728k;
    }

    public final void M() {
        OneShotEventHandler.d(this.f38731n, null, 1, null);
    }

    public final void N() {
        AggregatedAllAnalyticsLoggerKt.D(this.f38722e, AggregatedAllAnalyticsLogger.CustomEvents.BUY_MORE_TOKENS_CLICKED, true, true, true, AggregatedAllAnalyticsLogger.AnalyticsPosition.MY_LISTING_DETAILS, null, 32, null);
        K(false);
        OneShotEventHandler.d(this.f38735r, null, 1, null);
    }

    public final void O() {
        L();
    }

    public final OneShotEventHandler<p> m() {
        return this.f38731n;
    }

    public final b0<Boolean> n() {
        return this.f38734q;
    }

    public final b0<String> q() {
        return this.f38730m;
    }

    public final OneShotEventHandler<p> s() {
        return this.f38735r;
    }

    public final i v() {
        return (i) this.f38740w.getValue();
    }

    public final OneShotEventHandler<Boolean> w() {
        return this.f38732o;
    }

    public final b0<String> x() {
        return this.f38729l;
    }
}
