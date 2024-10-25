package com.forsale.app.features.categories.listingdetails;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.b0;
import androidx.lifecycle.r0;
import com.forsale.app.base.ViewStates;
import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.database.RegionEntity;
import com.forsale.app.datalayer.network.ResponseWrapper;
import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.datalayer.network.interceptors.ConnectivityInterceptor;
import com.forsale.app.datalayer.network.requestsbodies.UserType;
import com.forsale.app.datalayer.network.responses.Addon;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.network.responses.listingdetails.ListingSourceApp;
import com.forsale.app.datalayer.network.responses.listingdetails.ListingType;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.datalayer.repositories.TranslationRepository;
import com.forsale.app.features.auth.UserLoginAuthoritiesInteractor;
import com.forsale.app.features.auth.login.SignInIntention;
import com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesMapper;
import com.forsale.app.ui.bottomsheets.alertbottomsheet.items.models.AlertModel;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.VirtualTourPosition;
import com.forsale.app.utils.analytics.listingfiltration.ListingsAnalytics$FiltersPlace;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import falcon.chat.Chat;
import falcon.chat.entities.ChannelEntity;
import g00.l;
import java.util.List;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import t9.y0;
import wz.i;
import wz.p;
import xb.b;
/* compiled from: ListingDetailsViewModel.kt */
/* loaded from: classes2.dex */
public final class ListingDetailsViewModel extends BaseViewModel {

    /* renamed from: c1  reason: collision with root package name */
    public static final a f25333c1 = new a(null);

    /* renamed from: d1  reason: collision with root package name */
    public static final int f25334d1 = 8;
    private final b0<ViewStates> A0;
    private final LiveData<ViewStates> B0;
    private final OneShotEventHandler<p> C0;
    private final b0<p> D0;
    private final OneShotEventHandler<p> E0;
    private final OneShotEventHandler<p> F0;
    private final LiveData<String> G0;
    private final LiveData<String> H0;
    private final LiveData<List<ListingItemBrief>> I0;
    private final MutableSharedFlow<List<b.a>> J0;
    private final SharedFlow<List<b.a>> K0;
    private final MutableSharedFlow<List<b.AbstractC0929b>> L0;
    private final SharedFlow<List<b.AbstractC0929b>> M0;
    private final MutableSharedFlow<ListingDetailsEntity> N0;
    private final SharedFlow<ListingDetailsEntity> O0;
    private final OneShotEventHandler<Triple<String, String, String>> P0;
    private final OneShotEventHandler<ShareText> Q0;
    private final LiveData<List<AttributesMapper.AttributesDataModel>> R0;
    private final wz.h S0;
    private final LiveData<xb.a> T0;
    private final StateFlow<Boolean> U0;
    private final LiveData<TranslationRepository.Translation> V0;
    private final MutableSharedFlow<SignInIntention> W0;
    private final SharedFlow<SignInIntention> X0;
    private final MutableStateFlow<Boolean> Y0;
    private final StateFlow<Boolean> Z0;

    /* renamed from: a1  reason: collision with root package name */
    private final MutableSharedFlow<p> f25335a1;

    /* renamed from: b1  reason: collision with root package name */
    private final SharedFlow<p> f25336b1;

    /* renamed from: k0  reason: collision with root package name */
    private final jj.b f25337k0;

    /* renamed from: l0  reason: collision with root package name */
    private final pe.b f25338l0;

    /* renamed from: m0  reason: collision with root package name */
    private final pe.a f25339m0;

    /* renamed from: n0  reason: collision with root package name */
    private final ListingDetailsRepository f25340n0;

    /* renamed from: o0  reason: collision with root package name */
    private final int f25341o0;

    /* renamed from: p0  reason: collision with root package name */
    private final String f25342p0;

    /* renamed from: q0  reason: collision with root package name */
    private final String f25343q0;

    /* renamed from: r0  reason: collision with root package name */
    private final ListingDetailsOwnerActions f25344r0;

    /* renamed from: s0  reason: collision with root package name */
    private final ListingDetailsAnalyticSource f25345s0;

    /* renamed from: t0  reason: collision with root package name */
    private final Boolean f25346t0;

    /* renamed from: u0  reason: collision with root package name */
    private final UserType f25347u0;

    /* renamed from: v0  reason: collision with root package name */
    private final List<String> f25348v0;

    /* renamed from: w0  reason: collision with root package name */
    private final ListingsAnalytics$FiltersPlace f25349w0;

    /* renamed from: x0  reason: collision with root package name */
    private final ListingDetailsSearchAnalyticsData f25350x0;

    /* renamed from: y0  reason: collision with root package name */
    private final UserLoginAuthoritiesInteractor f25351y0;

    /* renamed from: z0  reason: collision with root package name */
    private final LiveData<ListingItemDetails> f25352z0;

    /* compiled from: ListingDetailsViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: ListingDetailsViewModel.kt */
    /* loaded from: classes2.dex */
    public interface b {
        ListingDetailsViewModel a(ListingDetailsRepository listingDetailsRepository, int i11, String str, String str2, ListingDetailsOwnerActions listingDetailsOwnerActions, ListingDetailsAnalyticSource listingDetailsAnalyticSource, Boolean bool, UserType userType, List<String> list, ListingsAnalytics$FiltersPlace listingsAnalytics$FiltersPlace, ListingDetailsSearchAnalyticsData listingDetailsSearchAnalyticsData);
    }

    /* compiled from: ListingDetailsViewModel.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f25370a;

        static {
            int[] iArr = new int[DetailsAlertTypes.values().length];
            try {
                iArr[DetailsAlertTypes.NON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DetailsAlertTypes.MEDIA_FAILED_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DetailsAlertTypes.ATTEMPT_ABUSE_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f25370a = iArr;
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ListingDetailsViewModel f25378a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(CoroutineExceptionHandler.Key key, ListingDetailsViewModel listingDetailsViewModel) {
            super(key);
            this.f25378a = listingDetailsViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            if (th2 instanceof ConnectivityInterceptor.ConnectivityException) {
                this.f25378a.w1().postValue(ViewStates.CONNECTION_ERROR);
            } else if (th2 instanceof ResponseWrapper.ResponseErrorException) {
                final ListingDetailsViewModel listingDetailsViewModel = this.f25378a;
                g00.a<p> aVar = new g00.a<p>() { // from class: com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel$coroutineContext$1$okCancelLambdas$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(0);
                    }

                    @Override // g00.a
                    public /* bridge */ /* synthetic */ p invoke() {
                        invoke2();
                        return p.f75480a;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        ListingDetailsViewModel.this.O0().postValue(p.f75480a);
                    }
                };
                final ListingDetailsViewModel listingDetailsViewModel2 = this.f25378a;
                this.f25378a.C().postValue(i.a(Integer.valueOf(y0.I5), i.a(aVar, new g00.a<p>() { // from class: com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel$coroutineContext$1$okCancelLambdas$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(0);
                    }

                    @Override // g00.a
                    public /* bridge */ /* synthetic */ p invoke() {
                        invoke2();
                        return p.f75480a;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        ListingDetailsViewModel.this.O0().postValue(p.f75480a);
                    }
                })));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingDetailsViewModel(jj.b prefs, pe.b waitingApprovalInteractor, pe.a mediaAddonsInteractor, ListingDetailsRepository repo, int i11, String str, String str2, ListingDetailsOwnerActions listingDetailsOwnerActions, ListingDetailsAnalyticSource listingDetailsAnalyticSource, Boolean bool, UserType userType, List<String> list, ListingsAnalytics$FiltersPlace listingsAnalytics$FiltersPlace, ListingDetailsSearchAnalyticsData listingDetailsSearchAnalyticsData, BaseRepository baseRepository, UserLoginAuthoritiesInteractor userLoginAuthoritiesInteractor) {
        super(baseRepository);
        wz.h a11;
        o.i(prefs, "prefs");
        o.i(waitingApprovalInteractor, "waitingApprovalInteractor");
        o.i(mediaAddonsInteractor, "mediaAddonsInteractor");
        o.i(repo, "repo");
        o.i(baseRepository, "baseRepository");
        o.i(userLoginAuthoritiesInteractor, "userLoginAuthoritiesInteractor");
        this.f25337k0 = prefs;
        this.f25338l0 = waitingApprovalInteractor;
        this.f25339m0 = mediaAddonsInteractor;
        this.f25340n0 = repo;
        this.f25341o0 = i11;
        this.f25342p0 = str;
        this.f25343q0 = str2;
        this.f25344r0 = listingDetailsOwnerActions;
        this.f25345s0 = listingDetailsAnalyticSource;
        this.f25346t0 = bool;
        this.f25347u0 = userType;
        this.f25348v0 = list;
        this.f25349w0 = listingsAnalytics$FiltersPlace;
        this.f25350x0 = listingDetailsSearchAnalyticsData;
        this.f25351y0 = userLoginAuthoritiesInteractor;
        this.f25352z0 = repo.A();
        b0<ViewStates> b0Var = new b0<>();
        this.A0 = b0Var;
        this.B0 = b0Var;
        this.C0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.D0 = new b0<>();
        this.E0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.F0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.G0 = repo.H();
        this.H0 = repo.y();
        this.I0 = repo.E();
        MutableSharedFlow<List<b.a>> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.J0 = MutableSharedFlow$default;
        this.K0 = FlowKt.asSharedFlow(MutableSharedFlow$default);
        MutableSharedFlow<List<b.AbstractC0929b>> MutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.L0 = MutableSharedFlow$default2;
        this.M0 = FlowKt.asSharedFlow(MutableSharedFlow$default2);
        MutableSharedFlow<ListingDetailsEntity> MutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.N0 = MutableSharedFlow$default3;
        this.O0 = FlowKt.asSharedFlow(MutableSharedFlow$default3);
        this.P0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.Q0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.R0 = repo.u();
        a11 = kotlin.d.a(new g00.a<xb.b>() { // from class: com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel$newListingDetailsComponentMapper$2
            @Override // g00.a
            /* renamed from: b */
            public final xb.b invoke() {
                return new xb.b();
            }
        });
        this.S0 = a11;
        this.T0 = repo.B();
        this.U0 = repo.Q();
        this.V0 = repo.I();
        MutableSharedFlow<SignInIntention> MutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.W0 = MutableSharedFlow$default4;
        this.X0 = FlowKt.asSharedFlow(MutableSharedFlow$default4);
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.Y0 = MutableStateFlow;
        this.Z0 = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<p> MutableSharedFlow$default5 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f25335a1 = MutableSharedFlow$default5;
        this.f25336b1 = FlowKt.asSharedFlow(MutableSharedFlow$default5);
    }

    private final void C0(boolean z11) {
        ListingItemDetails value = this.f25352z0.getValue();
        if (value != null && this.f25344r0 != null) {
            if (z11) {
                BuildersKt__BuildersKt.runBlocking$default(null, new ListingDetailsViewModel$boostYourAdFromDeepLinking$1$1(this, value, null), 1, null);
            } else {
                BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new ListingDetailsViewModel$boostYourAdFromDeepLinking$1$2(this, null), 3, null);
            }
        }
    }

    private final DetailsAlertTypes K0(boolean z11, boolean z12) {
        if (z11) {
            return DetailsAlertTypes.MEDIA_FAILED_ERROR;
        }
        if (z12) {
            return DetailsAlertTypes.ATTEMPT_ABUSE_ERROR;
        }
        return DetailsAlertTypes.NON;
    }

    public static /* synthetic */ void N1(ListingDetailsViewModel listingDetailsViewModel, AggregatedAllAnalyticsLogger.AdvActionEvents advActionEvents, boolean z11, boolean z12, boolean z13, AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition, String str, String str2, String str3, ListingDetailsAnalyticSource listingDetailsAnalyticSource, int i11, Object obj) {
        boolean z14;
        boolean z15;
        AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition2;
        String str4;
        String str5;
        ListingDetailsAnalyticSource listingDetailsAnalyticSource2;
        boolean z16 = true;
        if ((i11 & 2) != 0) {
            z14 = true;
        } else {
            z14 = z11;
        }
        if ((i11 & 4) == 0) {
            z16 = z12;
        }
        if ((i11 & 8) != 0) {
            z15 = false;
        } else {
            z15 = z13;
        }
        String str6 = null;
        if ((i11 & 16) != 0) {
            analyticsPosition2 = null;
        } else {
            analyticsPosition2 = analyticsPosition;
        }
        if ((i11 & 32) != 0) {
            str4 = null;
        } else {
            str4 = str;
        }
        if ((i11 & 64) != 0) {
            str5 = null;
        } else {
            str5 = str2;
        }
        if ((i11 & 128) == 0) {
            str6 = str3;
        }
        if ((i11 & 256) != 0) {
            listingDetailsAnalyticSource2 = listingDetailsViewModel.f25345s0;
        } else {
            listingDetailsAnalyticSource2 = listingDetailsAnalyticSource;
        }
        listingDetailsViewModel.K1(advActionEvents, z14, z16, z15, analyticsPosition2, str4, str5, str6, listingDetailsAnalyticSource2);
    }

    public static /* synthetic */ void P1(ListingDetailsViewModel listingDetailsViewModel, AggregatedAllAnalyticsLogger.MyListingActionEvents myListingActionEvents, boolean z11, boolean z12, AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition, Pair[] pairArr, int i11, Object obj) {
        boolean z13;
        boolean z14;
        if ((i11 & 2) != 0) {
            z13 = true;
        } else {
            z13 = z11;
        }
        if ((i11 & 4) != 0) {
            z14 = true;
        } else {
            z14 = z12;
        }
        if ((i11 & 8) != 0) {
            analyticsPosition = null;
        }
        AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition2 = analyticsPosition;
        Pair[] pairArr2 = pairArr;
        if ((i11 & 16) != 0) {
            pairArr2 = new Pair[0];
        }
        listingDetailsViewModel.O1(myListingActionEvents, z13, z14, analyticsPosition2, pairArr2);
    }

    private final Object U0(zz.a<? super Boolean> aVar) {
        return this.f25337k0.e().c(aVar);
    }

    public static /* synthetic */ void V1(ListingDetailsViewModel listingDetailsViewModel, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        listingDetailsViewModel.U1(z11, z12);
    }

    private final void W1(boolean z11) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new ListingDetailsViewModel$setIsListingModified$1(this, z11, null), 3, null);
    }

    private final void Y1(DetailsAlertTypes detailsAlertTypes) {
        int i11 = c.f25370a[detailsAlertTypes.ordinal()];
        if (i11 != 2) {
            if (i11 == 3) {
                this.F0.c(p.f75480a);
                return;
            }
            return;
        }
        this.E0.c(p.f75480a);
    }

    private final xb.b d1() {
        return (xb.b) this.S0.getValue();
    }

    public final StateFlow<Boolean> A1() {
        return this.U0;
    }

    public final void B0(AggregatedAllAnalyticsLogger.AnalyticsPosition eventPositiong, l<? super ListingDetailsEntity, p> block) {
        o.i(eventPositiong, "eventPositiong");
        o.i(block, "block");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new ListingDetailsViewModel$boostYourAd$1(this, eventPositiong, block, null), 3, null);
    }

    public final boolean B1() {
        Boolean value = this.f25340n0.Q().getValue();
        if (value != null) {
            return value.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C1(zz.a<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel$isUserLogin$1
            if (r0 == 0) goto L13
            r0 = r5
            com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel$isUserLogin$1 r0 = (com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel$isUserLogin$1) r0
            int r1 = r0.f25384c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25384c = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel$isUserLogin$1 r0 = new com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel$isUserLogin$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f25382a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f25384c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.f.b(r5)
            com.forsale.app.features.auth.UserLoginAuthoritiesInteractor r5 = r4.f25351y0
            r0.f25384c = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            com.forsale.app.features.auth.UserStatus r0 = com.forsale.app.features.auth.UserStatus.LoggedIn
            if (r5 != r0) goto L44
            goto L45
        L44:
            r3 = 0
        L45:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.a.a(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel.C1(zz.a):java.lang.Object");
    }

    public final Object D0(zz.a<? super AdManagerAdRequest> aVar) {
        return this.f25340n0.D(aVar);
    }

    public final boolean D1() {
        if (this.f25340n0.R().getValue().booleanValue()) {
            return true;
        }
        return false;
    }

    public final boolean E0() {
        ListingSourceApp listingSourceApp;
        ListingItemDetails value = this.f25352z0.getValue();
        if (value != null) {
            listingSourceApp = value.getSourceApp();
        } else {
            listingSourceApp = null;
        }
        if (listingSourceApp == ListingSourceApp.FORSALE) {
            return true;
        }
        return false;
    }

    public final Object E1(zz.a<? super p> aVar) {
        Object f11;
        Object T = this.f25340n0.T(aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (T == f11) {
            return T;
        }
        return p.f75480a;
    }

    public final Object F1(zz.a<? super CategoryEntity> aVar) {
        return this.f25340n0.V(aVar);
    }

    public final void G0(g00.a<p> block) {
        o.i(block, "block");
        if (E0()) {
            block.invoke();
            return;
        }
        ListingItemDetails value = this.f25352z0.getValue();
        if (value != null) {
            BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new ListingDetailsViewModel$checkChatInTheSameApp$1$1(this, value, null), 3, null);
        }
    }

    public final Object G1(int i11, zz.a<? super CategoryEntity> aVar) {
        return this.f25340n0.S(i11, aVar);
    }

    public final Object H0(zz.a<? super ChannelEntity> aVar) {
        ListingItemDetails value;
        Object f11;
        LiveData<ListingItemDetails> liveData = this.f25352z0;
        if (liveData != null && (value = liveData.getValue()) != null) {
            Object r11 = Chat.f55705a.r(value.getPhone(), String.valueOf(value.getId()), aVar);
            f11 = kotlin.coroutines.intrinsics.b.f();
            if (r11 == f11) {
                return r11;
            }
            return (ChannelEntity) r11;
        }
        return null;
    }

    public final void H1() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new ListingDetailsViewModel$loadListingDetails$1(this, null), 3, null);
    }

    public final Object I0(g00.a<p> block) {
        Job launch$default;
        o.i(block, "block");
        if (this.Z0.getValue().booleanValue()) {
            launch$default = BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new ListingDetailsViewModel$checkPreviewThenTakeAction$1(this, null), 3, null);
            return launch$default;
        }
        block.invoke();
        return p.f75480a;
    }

    public final Object I1(zz.a<? super p> aVar) {
        Object f11;
        Object W = this.f25340n0.W(aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (W == f11) {
            return W;
        }
        return p.f75480a;
    }

    public final AlertModel J0(boolean z11, boolean z12) {
        return this.f25338l0.b(z12, z11);
    }

    public final Object J1(zz.a<? super RegionEntity> aVar) {
        return this.f25340n0.X(aVar);
    }

    public final void K1(AggregatedAllAnalyticsLogger.AdvActionEvents action, boolean z11, boolean z12, boolean z13, AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition, String str, String str2, String str3, ListingDetailsAnalyticSource listingDetailsAnalyticSource) {
        o.i(action, "action");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new ListingDetailsViewModel$logAnalytics$1(this, action, str2, str3, z11, z12, z13, str, listingDetailsAnalyticSource, null), 3, null);
    }

    public final LiveData<List<AttributesMapper.AttributesDataModel>> L0() {
        return this.R0;
    }

    public final SharedFlow<List<b.a>> M0() {
        return this.K0;
    }

    public final OneShotEventHandler<p> N0() {
        return this.C0;
    }

    public final b0<p> O0() {
        return this.D0;
    }

    public final void O1(AggregatedAllAnalyticsLogger.MyListingActionEvents action, boolean z11, boolean z12, AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition, Pair<String, String>... extraOption) {
        o.i(action, "action");
        o.i(extraOption, "extraOption");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new ListingDetailsViewModel$logMyListingAnalytics$1(this, action, z11, z12, analyticsPosition, extraOption, null), 3, null);
    }

    public final LiveData<String> P0() {
        return this.H0;
    }

    public final String Q0(boolean z11, boolean z12, List<Addon> list) {
        return this.f25339m0.a(z11, z12, list);
    }

    public final void Q1(VirtualTourPosition virtualTourPosition, Long l11) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new ListingDetailsViewModel$logVirtualTourAnalytics$1(virtualTourPosition, this, l11, null), 3, null);
    }

    public final ListingsAnalytics$FiltersPlace R0() {
        return this.f25349w0;
    }

    public final void R1() {
        N1(this, AggregatedAllAnalyticsLogger.AdvActionEvents.LISTING_DETAILS_SHARE_CLICKED, false, false, false, null, null, null, null, null, 510, null);
        this.f25340n0.G(new l<ShareText, p>() { // from class: com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel$onShareClick$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(ShareText it2) {
                o.i(it2, "it");
                ListingDetailsViewModel.this.m1().k(it2);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(ShareText shareText) {
                b(shareText);
                return p.f75480a;
            }
        });
    }

    public final SharedFlow<ListingDetailsEntity> S0() {
        return this.O0;
    }

    public final void S1() {
        this.f25340n0.e0();
        N1(this, AggregatedAllAnalyticsLogger.AdvActionEvents.ADV_ACTION_TRANSLATE, false, false, false, null, null, null, null, null, 510, null);
    }

    public final StateFlow<Boolean> T0() {
        return this.Z0;
    }

    public final void T1() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new ListingDetailsViewModel$recordScreenVisited$1(this, null), 3, null);
    }

    public final void U1(boolean z11, boolean z12) {
        W1(true);
        DetailsAlertTypes K0 = K0(z11, z12);
        if (c.f25370a[K0.ordinal()] == 1) {
            this.C0.c(p.f75480a);
        } else {
            Y1(K0);
        }
    }

    public final ListingItemBrief V0() {
        return this.f25340n0.z();
    }

    public final int W0() {
        return this.f25341o0;
    }

    public final ListingDetailsAnalyticSource X0() {
        return this.f25345s0;
    }

    public final void X1(boolean z11) {
        if (z11 && !this.Z0.getValue().booleanValue()) {
            d1().h(this, new l<List<? extends b.AbstractC0929b>, p>() { // from class: com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel$setNewListingDetailsComponents$1

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: ListingDetailsViewModel.kt */
                @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel$setNewListingDetailsComponents$1$1", f = "ListingDetailsViewModel.kt", l = {137}, m = "invokeSuspend")
                /* renamed from: com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel$setNewListingDetailsComponents$1$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super p>, Object> {

                    /* renamed from: a  reason: collision with root package name */
                    int f25424a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ ListingDetailsViewModel f25425b;

                    /* renamed from: c  reason: collision with root package name */
                    final /* synthetic */ List<b.AbstractC0929b> f25426c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(ListingDetailsViewModel listingDetailsViewModel, List<? extends b.AbstractC0929b> list, zz.a<? super AnonymousClass1> aVar) {
                        super(2, aVar);
                        this.f25425b = listingDetailsViewModel;
                        this.f25426c = list;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final zz.a<p> create(Object obj, zz.a<?> aVar) {
                        return new AnonymousClass1(this.f25425b, this.f25426c, aVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object f11;
                        MutableSharedFlow mutableSharedFlow;
                        f11 = kotlin.coroutines.intrinsics.b.f();
                        int i11 = this.f25424a;
                        if (i11 != 0) {
                            if (i11 == 1) {
                                kotlin.f.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            kotlin.f.b(obj);
                            mutableSharedFlow = this.f25425b.L0;
                            List<b.AbstractC0929b> list = this.f25426c;
                            this.f25424a = 1;
                            if (mutableSharedFlow.emit(list, this) == f11) {
                                return f11;
                            }
                        }
                        return p.f75480a;
                    }

                    @Override // g00.p
                    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super p> aVar) {
                        return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(p.f75480a);
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                public final void b(List<? extends b.AbstractC0929b> it2) {
                    o.i(it2, "it");
                    BuildersKt__Builders_commonKt.launch$default(r0.a(ListingDetailsViewModel.this), null, null, new AnonymousClass1(ListingDetailsViewModel.this, it2, null), 3, null);
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(List<? extends b.AbstractC0929b> list) {
                    b(list);
                    return p.f75480a;
                }
            });
        } else {
            d1().g(this, new l<List<? extends b.a>, p>() { // from class: com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel$setNewListingDetailsComponents$2

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: ListingDetailsViewModel.kt */
                @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel$setNewListingDetailsComponents$2$1", f = "ListingDetailsViewModel.kt", l = {143}, m = "invokeSuspend")
                /* renamed from: com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel$setNewListingDetailsComponents$2$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super p>, Object> {

                    /* renamed from: a  reason: collision with root package name */
                    int f25428a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ ListingDetailsViewModel f25429b;

                    /* renamed from: c  reason: collision with root package name */
                    final /* synthetic */ List<b.a> f25430c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(ListingDetailsViewModel listingDetailsViewModel, List<? extends b.a> list, zz.a<? super AnonymousClass1> aVar) {
                        super(2, aVar);
                        this.f25429b = listingDetailsViewModel;
                        this.f25430c = list;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final zz.a<p> create(Object obj, zz.a<?> aVar) {
                        return new AnonymousClass1(this.f25429b, this.f25430c, aVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object f11;
                        MutableSharedFlow mutableSharedFlow;
                        f11 = kotlin.coroutines.intrinsics.b.f();
                        int i11 = this.f25428a;
                        if (i11 != 0) {
                            if (i11 == 1) {
                                kotlin.f.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            kotlin.f.b(obj);
                            mutableSharedFlow = this.f25429b.J0;
                            List<b.a> list = this.f25430c;
                            this.f25428a = 1;
                            if (mutableSharedFlow.emit(list, this) == f11) {
                                return f11;
                            }
                        }
                        return p.f75480a;
                    }

                    @Override // g00.p
                    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super p> aVar) {
                        return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(p.f75480a);
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                public final void b(List<? extends b.a> it2) {
                    o.i(it2, "it");
                    BuildersKt__Builders_commonKt.launch$default(r0.a(ListingDetailsViewModel.this), null, null, new AnonymousClass1(ListingDetailsViewModel.this, it2, null), 3, null);
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(List<? extends b.a> list) {
                    b(list);
                    return p.f75480a;
                }
            });
        }
        C0(z11);
    }

    public final LiveData<ListingItemDetails> Y0() {
        return this.f25352z0;
    }

    public final String Z0() {
        return this.f25342p0;
    }

    public final void Z1() {
        d1().g(this, new l<List<? extends b.a>, p>() { // from class: com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel$showBuyerComponentsForPreview$1

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: ListingDetailsViewModel.kt */
            @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel$showBuyerComponentsForPreview$1$1", f = "ListingDetailsViewModel.kt", l = {181}, m = "invokeSuspend")
            /* renamed from: com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel$showBuyerComponentsForPreview$1$1  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super p>, Object> {

                /* renamed from: a  reason: collision with root package name */
                int f25432a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ ListingDetailsViewModel f25433b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ List<b.a> f25434c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(ListingDetailsViewModel listingDetailsViewModel, List<? extends b.a> list, zz.a<? super AnonymousClass1> aVar) {
                    super(2, aVar);
                    this.f25433b = listingDetailsViewModel;
                    this.f25434c = list;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final zz.a<p> create(Object obj, zz.a<?> aVar) {
                    return new AnonymousClass1(this.f25433b, this.f25434c, aVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object f11;
                    MutableSharedFlow mutableSharedFlow;
                    f11 = kotlin.coroutines.intrinsics.b.f();
                    int i11 = this.f25432a;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            kotlin.f.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        kotlin.f.b(obj);
                        mutableSharedFlow = this.f25433b.J0;
                        List<b.a> list = this.f25434c;
                        this.f25432a = 1;
                        if (mutableSharedFlow.emit(list, this) == f11) {
                            return f11;
                        }
                    }
                    return p.f75480a;
                }

                @Override // g00.p
                public final Object invoke(CoroutineScope coroutineScope, zz.a<? super p> aVar) {
                    return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(p.f75480a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(List<? extends b.a> it2) {
                o.i(it2, "it");
                BuildersKt__Builders_commonKt.launch$default(r0.a(ListingDetailsViewModel.this), null, null, new AnonymousClass1(ListingDetailsViewModel.this, it2, null), 3, null);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(List<? extends b.a> list) {
                b(list);
                return p.f75480a;
            }
        });
    }

    public final LiveData<xb.a> b1() {
        return this.T0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c1(zz.a<? super com.forsale.app.utils.analytics.AnalyticsListingsSource> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel$getListingsSourceIfModified$1
            if (r0 == 0) goto L13
            r0 = r5
            com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel$getListingsSourceIfModified$1 r0 = (com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel$getListingsSourceIfModified$1) r0
            int r1 = r0.f25381c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25381c = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel$getListingsSourceIfModified$1 r0 = new com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel$getListingsSourceIfModified$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f25379a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f25381c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.f.b(r5)
            r0.f25381c = r3
            java.lang.Object r5 = r4.U0(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L48
            com.forsale.app.utils.analytics.AnalyticsListingsSource r5 = com.forsale.app.utils.analytics.AnalyticsListingsSource.EDIT_LISTING
            goto L49
        L48:
            r5 = 0
        L49:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel.c1(zz.a):java.lang.Object");
    }

    public final OneShotEventHandler<Triple<String, String, String>> e1() {
        return this.P0;
    }

    public final SharedFlow<SignInIntention> f1() {
        return this.X0;
    }

    public final MutableSharedFlow<SignInIntention> g1() {
        return this.W0;
    }

    @Override // com.forsale.app.base.viewmodels.BaseViewModel, kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return super.getCoroutineContext().plus(new d(CoroutineExceptionHandler.Key, this));
    }

    public final jj.b h1() {
        return this.f25337k0;
    }

    public final LiveData<List<ListingItemBrief>> i1() {
        return this.I0;
    }

    public final ListingDetailsRepository j1() {
        return this.f25340n0;
    }

    public final ListingDetailsSearchAnalyticsData k1() {
        return this.f25350x0;
    }

    public final SharedFlow<List<b.AbstractC0929b>> l1() {
        return this.M0;
    }

    public final OneShotEventHandler<ShareText> m1() {
        return this.Q0;
    }

    public final OneShotEventHandler<p> n1() {
        return this.E0;
    }

    public final SharedFlow<p> o1() {
        return this.f25336b1;
    }

    public final OneShotEventHandler<p> p1() {
        return this.F0;
    }

    public final List<String> q1() {
        return this.f25348v0;
    }

    public final LiveData<ViewStates> r1() {
        return this.B0;
    }

    public final LiveData<String> s1() {
        return this.G0;
    }

    public final LiveData<TranslationRepository.Translation> t1() {
        return this.V0;
    }

    public final UserType u1() {
        return this.f25347u0;
    }

    public final MutableStateFlow<Boolean> v1() {
        return this.Y0;
    }

    public final b0<ViewStates> w1() {
        return this.A0;
    }

    public final boolean x1() {
        return this.Z0.getValue().booleanValue();
    }

    public final boolean y1() {
        ListingType listingType;
        if (B1()) {
            ListingItemDetails value = this.f25352z0.getValue();
            if (value != null) {
                listingType = value.getType();
            } else {
                listingType = null;
            }
            if (listingType == ListingType.ARCHIVED) {
                return true;
            }
        }
        return false;
    }

    public final Boolean z1() {
        return this.f25346t0;
    }
}
