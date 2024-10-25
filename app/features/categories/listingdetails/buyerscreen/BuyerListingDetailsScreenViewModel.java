package com.forsale.app.features.categories.listingdetails.buyerscreen;

import androidx.lifecycle.b0;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.r0;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.datalayer.database.MasterDataMiscModel;
import com.forsale.app.datalayer.database.RegionEntity;
import com.forsale.app.datalayer.network.interceptors.ConnectivityInterceptor;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.domainlayer.interactors.gamInteractors.GamForListingDetailsInteractor;
import com.forsale.app.features.auth.UserLoginAuthoritiesInteractor;
import com.forsale.app.features.categories.home.propertyhome.models.SectionState;
import com.forsale.app.features.categories.listingdetails.ListingDetailsAnalyticSource;
import com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData;
import com.forsale.app.features.categories.listingdetails.ShareText;
import com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.CategoryTreeInteractor;
import com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.ContactUserInteractor;
import com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.DetailsAnalyticsInteractor;
import com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.FavoriteInteractor;
import com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.FollowInteractor;
import com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.GetBuyerListingDetailsInteractor;
import com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.ListingDetailsSettingsInteractor;
import com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.OtherAdsInteractor;
import com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.RecentlyViewedInteractor;
import com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.ReportAbuseInteractor;
import com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.ShareAdInteractor;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.MediaTypes;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.ItemArgs;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.events.ListingDetailsFavoritedEvent;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.events.ListingDetailsShareClickedEvent;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.events.ListingDetailsUnFavoritedEvent;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.events.SellerProfileVisitedEvent;
import com.forsale.app.features.categories.listingdetails.buyerscreen.otherads.RecommendedListingsViewModel;
import com.forsale.app.features.categories.listingdetails.buyerscreen.t;
import com.forsale.app.features.categories.listingdetails.models.CommonData;
import com.forsale.app.features.categories.listingdetails.models.DetailsModel;
import com.forsale.app.features.categories.user.profile.UserProfileData;
import com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.UserContactMode;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
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
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
/* compiled from: BuyerListingDetailsScreenViewModel.kt */
/* loaded from: classes2.dex */
public final class BuyerListingDetailsScreenViewModel extends q0 {
    private final ListingDetailsSettingsInteractor A;
    private final nc.a B;
    private final bb.a C;
    private final CoroutineDispatcher D;
    private final k E;
    private final int[] F;
    private final String G;
    private final int H;
    private final String I;
    private final String J;
    private final ListingDetailsAnalyticSource K;
    private final String L;
    private final String M;
    private final ListingDetailsSearchAnalyticsData N;
    private final boolean O;
    private a P;
    private final MutableStateFlow<t> Q;
    private final StateFlow<t> R;
    private final MutableSharedFlow<j> S;
    private final SharedFlow<j> T;
    private final MutableStateFlow<FavouriteState> U;
    private final StateFlow<FavouriteState> V;
    private final MutableStateFlow<AdManagerAdRequest> W;
    private final StateFlow<AdManagerAdRequest> X;
    private final MutableStateFlow<SectionState> Y;
    private final StateFlow<SectionState> Z;

    /* renamed from: a  reason: collision with root package name */
    private final GetBuyerListingDetailsInteractor f25632a;

    /* renamed from: a0  reason: collision with root package name */
    private final MutableStateFlow<SectionState> f25633a0;

    /* renamed from: b  reason: collision with root package name */
    private final ShareAdInteractor f25634b;

    /* renamed from: b0  reason: collision with root package name */
    private final StateFlow<SectionState> f25635b0;

    /* renamed from: c  reason: collision with root package name */
    private final FavoriteInteractor f25636c;

    /* renamed from: c0  reason: collision with root package name */
    private final MutableStateFlow<SectionState> f25637c0;

    /* renamed from: d  reason: collision with root package name */
    private final UserLoginAuthoritiesInteractor f25638d;

    /* renamed from: d0  reason: collision with root package name */
    private final StateFlow<SectionState> f25639d0;

    /* renamed from: e  reason: collision with root package name */
    private final GamForListingDetailsInteractor f25640e;

    /* renamed from: e0  reason: collision with root package name */
    private final b0<RegionEntity> f25641e0;

    /* renamed from: f  reason: collision with root package name */
    private final ContactUserInteractor f25642f;

    /* renamed from: f0  reason: collision with root package name */
    private final b0<MasterDataMiscModel> f25643f0;

    /* renamed from: g  reason: collision with root package name */
    private final OtherAdsInteractor f25644g;

    /* renamed from: g0  reason: collision with root package name */
    private final MutableStateFlow<ab.a> f25645g0;

    /* renamed from: h  reason: collision with root package name */
    private final RecentlyViewedInteractor f25646h;

    /* renamed from: h0  reason: collision with root package name */
    private final StateFlow<ab.a> f25647h0;

    /* renamed from: i  reason: collision with root package name */
    private final ApplicationResourcesRepository f25648i;

    /* renamed from: i0  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f25649i0;

    /* renamed from: j  reason: collision with root package name */
    private final DetailsAnalyticsInteractor f25650j;

    /* renamed from: j0  reason: collision with root package name */
    private final StateFlow<Boolean> f25651j0;

    /* renamed from: k0  reason: collision with root package name */
    private final MutableSharedFlow<lf.a> f25652k0;

    /* renamed from: l0  reason: collision with root package name */
    private final SharedFlow<lf.a> f25653l0;

    /* renamed from: m0  reason: collision with root package name */
    private final List<eb.s> f25654m0;

    /* renamed from: n0  reason: collision with root package name */
    private final MutableSharedFlow<cb.b> f25655n0;

    /* renamed from: o0  reason: collision with root package name */
    private final SharedFlow<cb.b> f25656o0;

    /* renamed from: p0  reason: collision with root package name */
    private final MutableStateFlow<ab.a> f25657p0;

    /* renamed from: q0  reason: collision with root package name */
    private final StateFlow<ab.a> f25658q0;

    /* renamed from: r0  reason: collision with root package name */
    private final CoroutineExceptionHandler f25659r0;

    /* renamed from: x  reason: collision with root package name */
    private final CategoryTreeInteractor f25660x;

    /* renamed from: y  reason: collision with root package name */
    private final FollowInteractor f25661y;

    /* renamed from: z  reason: collision with root package name */
    private final ReportAbuseInteractor f25662z;

    /* compiled from: BuyerListingDetailsScreenViewModel.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$1", f = "BuyerListingDetailsScreenViewModel.kt", l = {176, 177}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static final class AnonymousClass1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f25663a;

        /* renamed from: b  reason: collision with root package name */
        int f25664b;

        AnonymousClass1(zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            b0 b0Var;
            b0 b0Var2;
            f11 = kotlin.coroutines.intrinsics.b.f();
            int i11 = this.f25664b;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        b0Var2 = (b0) this.f25663a;
                        kotlin.f.b(obj);
                        b0Var2.postValue(obj);
                        return wz.p.f75480a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b0Var = (b0) this.f25663a;
                kotlin.f.b(obj);
            } else {
                kotlin.f.b(obj);
                b0Var = BuyerListingDetailsScreenViewModel.this.f25641e0;
                GetBuyerListingDetailsInteractor getBuyerListingDetailsInteractor = BuyerListingDetailsScreenViewModel.this.f25632a;
                this.f25663a = b0Var;
                this.f25664b = 1;
                obj = getBuyerListingDetailsInteractor.g(this);
                if (obj == f11) {
                    return f11;
                }
            }
            b0Var.postValue(obj);
            b0 b0Var3 = BuyerListingDetailsScreenViewModel.this.f25643f0;
            GetBuyerListingDetailsInteractor getBuyerListingDetailsInteractor2 = BuyerListingDetailsScreenViewModel.this.f25632a;
            this.f25663a = b0Var3;
            this.f25664b = 2;
            Object j11 = getBuyerListingDetailsInteractor2.j(this);
            if (j11 == f11) {
                return f11;
            }
            b0Var2 = b0Var3;
            obj = j11;
            b0Var2.postValue(obj);
            return wz.p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* compiled from: BuyerListingDetailsScreenViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f25666a;

        /* renamed from: b  reason: collision with root package name */
        private final int f25667b;

        /* renamed from: c  reason: collision with root package name */
        private final DetailsModel f25668c;

        public a() {
            this(0, 0, null, 7, null);
        }

        public final DetailsModel a() {
            return this.f25668c;
        }

        public final int b() {
            return this.f25666a;
        }

        public final int c() {
            return this.f25667b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f25666a == aVar.f25666a && this.f25667b == aVar.f25667b && kotlin.jvm.internal.o.d(this.f25668c, aVar.f25668c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = ((Integer.hashCode(this.f25666a) * 31) + Integer.hashCode(this.f25667b)) * 31;
            DetailsModel detailsModel = this.f25668c;
            if (detailsModel == null) {
                hashCode = 0;
            } else {
                hashCode = detailsModel.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            int i11 = this.f25666a;
            int i12 = this.f25667b;
            DetailsModel detailsModel = this.f25668c;
            return "SelectedItem(id=" + i11 + ", index=" + i12 + ", details=" + detailsModel + ")";
        }

        public a(int i11, int i12, DetailsModel detailsModel) {
            this.f25666a = i11;
            this.f25667b = i12;
            this.f25668c = detailsModel;
        }

        public /* synthetic */ a(int i11, int i12, DetailsModel detailsModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? -1 : i11, (i13 & 2) != 0 ? -1 : i12, (i13 & 4) != 0 ? null : detailsModel);
        }
    }

    /* compiled from: BuyerListingDetailsScreenViewModel.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f25677a;

        static {
            int[] iArr = new int[FavouriteState.values().length];
            try {
                iArr[FavouriteState.IS_FAVOURITE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FavouriteState.IS_NOT_FAVOURITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FavouriteState.PENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f25677a = iArr;
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BuyerListingDetailsScreenViewModel f25678a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(CoroutineExceptionHandler.Key key, BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel) {
            super(key);
            this.f25678a = buyerListingDetailsScreenViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            if (this.f25678a.A0(th2)) {
                BuildersKt__Builders_commonKt.launch$default(r0.a(this.f25678a), null, null, new BuyerListingDetailsScreenViewModel$addToFavourite$1$1(this.f25678a, null), 3, null);
            }
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BuyerListingDetailsScreenViewModel f25686a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(CoroutineExceptionHandler.Key key, BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel) {
            super(key);
            this.f25686a = buyerListingDetailsScreenViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            if (this.f25686a.A0(th2)) {
                BuildersKt__Builders_commonKt.launch$default(r0.a(this.f25686a), null, null, new BuyerListingDetailsScreenViewModel$removeFromFavourite$1$1(this.f25686a, null), 3, null);
            }
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BuyerListingDetailsScreenViewModel f25687a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(CoroutineExceptionHandler.Key key, BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel) {
            super(key);
            this.f25687a = buyerListingDetailsScreenViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            if (this.f25687a.A0(th2)) {
                BuildersKt__Builders_commonKt.launch$default(r0.a(this.f25687a), null, null, new BuyerListingDetailsScreenViewModel$connectivityExceptionsHandler$1$1(this.f25687a, null), 3, null);
            }
        }
    }

    public BuyerListingDetailsScreenViewModel(GetBuyerListingDetailsInteractor buyerDetailsInteractor, ShareAdInteractor shareAdInteractor, FavoriteInteractor favoriteInteractor, UserLoginAuthoritiesInteractor userLoginAuthoritiesInteractor, GamForListingDetailsInteractor gamForCategoryInteractor, ContactUserInteractor contactUserInteractor, OtherAdsInteractor otherAdsInteractor, RecentlyViewedInteractor recentlyViewedInteractor, ApplicationResourcesRepository resourcesRepository, DetailsAnalyticsInteractor detailsAnalyticsInteractor, CategoryTreeInteractor categoryTreeInteractor, FollowInteractor followInteractor, ReportAbuseInteractor reportAbuseInteractor, ListingDetailsSettingsInteractor settingsInteractor, nc.a getSwipeableListInteractor, bb.a getLastIListingScrolledInteractor, CoroutineDispatcher ioDispatcher, k0 savedStateHandle) {
        kotlin.jvm.internal.o.i(buyerDetailsInteractor, "buyerDetailsInteractor");
        kotlin.jvm.internal.o.i(shareAdInteractor, "shareAdInteractor");
        kotlin.jvm.internal.o.i(favoriteInteractor, "favoriteInteractor");
        kotlin.jvm.internal.o.i(userLoginAuthoritiesInteractor, "userLoginAuthoritiesInteractor");
        kotlin.jvm.internal.o.i(gamForCategoryInteractor, "gamForCategoryInteractor");
        kotlin.jvm.internal.o.i(contactUserInteractor, "contactUserInteractor");
        kotlin.jvm.internal.o.i(otherAdsInteractor, "otherAdsInteractor");
        kotlin.jvm.internal.o.i(recentlyViewedInteractor, "recentlyViewedInteractor");
        kotlin.jvm.internal.o.i(resourcesRepository, "resourcesRepository");
        kotlin.jvm.internal.o.i(detailsAnalyticsInteractor, "detailsAnalyticsInteractor");
        kotlin.jvm.internal.o.i(categoryTreeInteractor, "categoryTreeInteractor");
        kotlin.jvm.internal.o.i(followInteractor, "followInteractor");
        kotlin.jvm.internal.o.i(reportAbuseInteractor, "reportAbuseInteractor");
        kotlin.jvm.internal.o.i(settingsInteractor, "settingsInteractor");
        kotlin.jvm.internal.o.i(getSwipeableListInteractor, "getSwipeableListInteractor");
        kotlin.jvm.internal.o.i(getLastIListingScrolledInteractor, "getLastIListingScrolledInteractor");
        kotlin.jvm.internal.o.i(ioDispatcher, "ioDispatcher");
        kotlin.jvm.internal.o.i(savedStateHandle, "savedStateHandle");
        this.f25632a = buyerDetailsInteractor;
        this.f25634b = shareAdInteractor;
        this.f25636c = favoriteInteractor;
        this.f25638d = userLoginAuthoritiesInteractor;
        this.f25640e = gamForCategoryInteractor;
        this.f25642f = contactUserInteractor;
        this.f25644g = otherAdsInteractor;
        this.f25646h = recentlyViewedInteractor;
        this.f25648i = resourcesRepository;
        this.f25650j = detailsAnalyticsInteractor;
        this.f25660x = categoryTreeInteractor;
        this.f25661y = followInteractor;
        this.f25662z = reportAbuseInteractor;
        this.A = settingsInteractor;
        this.B = getSwipeableListInteractor;
        this.C = getLastIListingScrolledInteractor;
        this.D = ioDispatcher;
        k b11 = k.f26043l.b(savedStateHandle);
        this.E = b11;
        int[] a11 = b11.a();
        this.F = a11;
        String j11 = b11.j();
        this.G = j11;
        this.H = b11.f();
        this.I = b11.g();
        this.J = b11.h();
        this.K = b11.b();
        this.L = b11.k();
        this.M = b11.d();
        this.N = b11.i();
        this.O = b11.e();
        this.P = new a(0, 0, null, 7, null);
        MutableStateFlow<t> MutableStateFlow = StateFlowKt.MutableStateFlow(t.d.f26515a);
        this.Q = MutableStateFlow;
        this.R = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<j> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.S = MutableSharedFlow$default;
        this.T = FlowKt.asSharedFlow(MutableSharedFlow$default);
        MutableStateFlow<FavouriteState> MutableStateFlow2 = StateFlowKt.MutableStateFlow(FavouriteState.IS_NOT_FAVOURITE);
        this.U = MutableStateFlow2;
        this.V = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<AdManagerAdRequest> MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this.W = MutableStateFlow3;
        this.X = FlowKt.asStateFlow(MutableStateFlow3);
        SectionState.d dVar = SectionState.d.f25086a;
        MutableStateFlow<SectionState> MutableStateFlow4 = StateFlowKt.MutableStateFlow(dVar);
        this.Y = MutableStateFlow4;
        this.Z = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<SectionState> MutableStateFlow5 = StateFlowKt.MutableStateFlow(dVar);
        this.f25633a0 = MutableStateFlow5;
        this.f25635b0 = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow<SectionState> MutableStateFlow6 = StateFlowKt.MutableStateFlow(dVar);
        this.f25637c0 = MutableStateFlow6;
        this.f25639d0 = FlowKt.asStateFlow(MutableStateFlow6);
        this.f25641e0 = new b0<>();
        this.f25643f0 = new b0<>();
        MutableStateFlow<ab.a> MutableStateFlow7 = StateFlowKt.MutableStateFlow(new ab.a(null, false, null, 7, null));
        this.f25645g0 = MutableStateFlow7;
        this.f25647h0 = FlowKt.asStateFlow(MutableStateFlow7);
        MutableStateFlow<Boolean> MutableStateFlow8 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f25649i0 = MutableStateFlow8;
        this.f25651j0 = FlowKt.asStateFlow(MutableStateFlow8);
        MutableSharedFlow<lf.a> MutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f25652k0 = MutableSharedFlow$default2;
        this.f25653l0 = FlowKt.asSharedFlow(MutableSharedFlow$default2);
        this.f25654m0 = new ArrayList();
        MutableSharedFlow<cb.b> MutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f25655n0 = MutableSharedFlow$default3;
        this.f25656o0 = FlowKt.asSharedFlow(MutableSharedFlow$default3);
        MutableStateFlow<ab.a> MutableStateFlow9 = StateFlowKt.MutableStateFlow(new ab.a(null, false, null, 7, null));
        this.f25657p0 = MutableStateFlow9;
        this.f25658q0 = FlowKt.asStateFlow(MutableStateFlow9);
        this.f25659r0 = new e(CoroutineExceptionHandler.Key, this);
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), ioDispatcher, null, new AnonymousClass1(null), 2, null);
        if ((!(a11.length == 0)) && j11 == null) {
            this.P = new a(b11.a()[b11.c()], b11.c(), null, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean A0(Throwable th2) {
        if (!(th2 instanceof ConnectivityInterceptor.ConnectivityException) && !(th2 instanceof SocketTimeoutException)) {
            return false;
        }
        return true;
    }

    private final void A1(DetailsModel detailsModel) {
        this.f25634b.a(detailsModel, new g00.l<ShareText, wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$updateSharedText$1

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: BuyerListingDetailsScreenViewModel.kt */
            @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$updateSharedText$1$1", f = "BuyerListingDetailsScreenViewModel.kt", l = {405}, m = "invokeSuspend")
            /* renamed from: com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$updateSharedText$1$1  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

                /* renamed from: a  reason: collision with root package name */
                int f25835a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ BuyerListingDetailsScreenViewModel f25836b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ t f25837c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ ShareText f25838d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel, t tVar, ShareText shareText, zz.a<? super AnonymousClass1> aVar) {
                    super(2, aVar);
                    this.f25836b = buyerListingDetailsScreenViewModel;
                    this.f25837c = tVar;
                    this.f25838d = shareText;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
                    return new AnonymousClass1(this.f25836b, this.f25837c, this.f25838d, aVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object f11;
                    MutableStateFlow mutableStateFlow;
                    f11 = kotlin.coroutines.intrinsics.b.f();
                    int i11 = this.f25835a;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            kotlin.f.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        kotlin.f.b(obj);
                        mutableStateFlow = this.f25836b.Q;
                        t.a aVar = new t.a(q.b(((t.a) this.f25837c).a(), null, null, null, this.f25838d, 7, null));
                        this.f25835a = 1;
                        if (mutableStateFlow.emit(aVar, this) == f11) {
                            return f11;
                        }
                    }
                    return wz.p.f75480a;
                }

                @Override // g00.p
                public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
                    return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(ShareText shareText) {
                MutableStateFlow mutableStateFlow;
                kotlin.jvm.internal.o.i(shareText, "shareText");
                mutableStateFlow = BuyerListingDetailsScreenViewModel.this.Q;
                t tVar = (t) mutableStateFlow.getValue();
                if (tVar instanceof t.a) {
                    BuildersKt__Builders_commonKt.launch$default(r0.a(BuyerListingDetailsScreenViewModel.this), null, null, new AnonymousClass1(BuyerListingDetailsScreenViewModel.this, tVar, shareText, null), 3, null);
                }
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(ShareText shareText) {
                b(shareText);
                return wz.p.f75480a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B0(zz.a<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$isUserLogin$1
            if (r0 == 0) goto L13
            r0 = r5
            com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$isUserLogin$1 r0 = (com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$isUserLogin$1) r0
            int r1 = r0.f25701c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25701c = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$isUserLogin$1 r0 = new com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$isUserLogin$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f25699a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f25701c
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
            com.forsale.app.features.auth.UserLoginAuthoritiesInteractor r5 = r4.f25638d
            r0.f25701c = r3
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
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel.B0(zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C0(zz.a<? super wz.p> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$loadForSaleRealty$1
            if (r0 == 0) goto L13
            r0 = r9
            com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$loadForSaleRealty$1 r0 = (com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$loadForSaleRealty$1) r0
            int r1 = r0.f25705d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25705d = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$loadForSaleRealty$1 r0 = new com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$loadForSaleRealty$1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f25703b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f25705d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r9)
            goto L64
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L34:
            java.lang.Object r2 = r0.f25702a
            com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel r2 = (com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel) r2
            kotlin.f.b(r9)
            goto L4d
        L3c:
            kotlin.f.b(r9)
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.ListingDetailsSettingsInteractor r9 = r8.A
            r0.f25702a = r8
            r0.f25705d = r4
            java.lang.Object r9 = r9.a(r0)
            if (r9 != r1) goto L4c
            return r1
        L4c:
            r2 = r8
        L4d:
            r5 = r9
            java.util.List r5 = (java.util.List) r5
            kotlinx.coroutines.flow.MutableStateFlow<ab.a> r2 = r2.f25645g0
            ab.a r6 = new ab.a
            com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.UserContactMode r7 = com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.UserContactMode.CALL_ONLY
            r6.<init>(r7, r4, r5)
            r0.f25702a = r9
            r0.f25705d = r3
            java.lang.Object r9 = r2.emit(r6, r0)
            if (r9 != r1) goto L64
            return r1
        L64:
            wz.p r9 = wz.p.f75480a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel.C0(zz.a):java.lang.Object");
    }

    private final void D0(int i11, boolean z11) {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), this.D, null, new BuyerListingDetailsScreenViewModel$loadListingDetails$1(this, z11, i11, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void E0(BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        buyerListingDetailsScreenViewModel.D0(i11, z11);
    }

    private final void G0() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), this.D, null, new BuyerListingDetailsScreenViewModel$loadRecentlyViewed$1(this, null), 2, null);
    }

    private final void H0() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), this.D, null, new BuyerListingDetailsScreenViewModel$loadRecommendedList$1(this, null), 2, null);
    }

    private final void I0(int i11) {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), this.D, null, new BuyerListingDetailsScreenViewModel$loadSimilarAds$1(this, i11, null), 2, null);
    }

    private final Object J0(DetailsModel detailsModel, boolean z11, zz.a<? super wz.p> aVar) {
        Object f11;
        Object p11 = this.f25650j.p(detailsModel, g0(), z11, aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (p11 == f11) {
            return p11;
        }
        return wz.p.f75480a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object K0(zz.a<? super wz.p> aVar) {
        Object f11;
        DetailsModel c11 = this.f25632a.c(this.R.getValue());
        if (c11 != null) {
            Object m11 = this.f25650j.m(new SellerProfileVisitedEvent(c11, g0()), aVar);
            f11 = kotlin.coroutines.intrinsics.b.f();
            if (m11 == f11) {
                return m11;
            }
        }
        return wz.p.f75480a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecommendedListingsViewModel L0(final ListingItemBrief listingItemBrief, final List<Integer> list) {
        return new RecommendedListingsViewModel(listingItemBrief, this.f25641e0, this.f25643f0, this.f25648i, list, new g00.r<ListingItemBrief, Integer, Integer, ListingDetailsSearchAnalyticsData, wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$mapToRecommendedListingViewModel$1

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: BuyerListingDetailsScreenViewModel.kt */
            @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$mapToRecommendedListingViewModel$1$1", f = "BuyerListingDetailsScreenViewModel.kt", l = {358}, m = "invokeSuspend")
            /* renamed from: com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$mapToRecommendedListingViewModel$1$1  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

                /* renamed from: a  reason: collision with root package name */
                int f25723a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ BuyerListingDetailsScreenViewModel f25724b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ ListingItemBrief f25725c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ ListingItemBrief f25726d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ List<Integer> f25727e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel, ListingItemBrief listingItemBrief, ListingItemBrief listingItemBrief2, List<Integer> list, zz.a<? super AnonymousClass1> aVar) {
                    super(2, aVar);
                    this.f25724b = buyerListingDetailsScreenViewModel;
                    this.f25725c = listingItemBrief;
                    this.f25726d = listingItemBrief2;
                    this.f25727e = list;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
                    return new AnonymousClass1(this.f25724b, this.f25725c, this.f25726d, this.f25727e, aVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object f11;
                    MutableSharedFlow mutableSharedFlow;
                    f11 = kotlin.coroutines.intrinsics.b.f();
                    int i11 = this.f25723a;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            kotlin.f.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        kotlin.f.b(obj);
                        mutableSharedFlow = this.f25724b.S;
                        c cVar = new c(this.f25725c.getId(), this.f25726d, this.f25727e);
                        this.f25723a = 1;
                        if (mutableSharedFlow.emit(cVar, this) == f11) {
                            return f11;
                        }
                    }
                    return wz.p.f75480a;
                }

                @Override // g00.p
                public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
                    return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            public final void b(ListingItemBrief listingItemBrief2, int i11, int i12, ListingDetailsSearchAnalyticsData listingDetailsSearchAnalyticsData) {
                kotlin.jvm.internal.o.i(listingItemBrief2, "listingItemBrief");
                BuildersKt__Builders_commonKt.launch$default(r0.a(BuyerListingDetailsScreenViewModel.this), null, null, new AnonymousClass1(BuyerListingDetailsScreenViewModel.this, listingItemBrief, listingItemBrief2, list, null), 3, null);
            }

            @Override // g00.r
            public /* bridge */ /* synthetic */ wz.p d(ListingItemBrief listingItemBrief2, Integer num, Integer num2, ListingDetailsSearchAnalyticsData listingDetailsSearchAnalyticsData) {
                b(listingItemBrief2, num.intValue(), num2.intValue(), listingDetailsSearchAnalyticsData);
                return wz.p.f75480a;
            }
        });
    }

    public static /* synthetic */ void N0(BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        buyerListingDetailsScreenViewModel.M0(str);
    }

    public static /* synthetic */ void W0(BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        buyerListingDetailsScreenViewModel.V0(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d2 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z0(boolean r10, zz.a<? super wz.p> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$postFollow$1
            if (r0 == 0) goto L13
            r0 = r11
            com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$postFollow$1 r0 = (com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$postFollow$1) r0
            int r1 = r0.f25778f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25778f = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$postFollow$1 r0 = new com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$postFollow$1
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f25776d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f25778f
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L54
            if (r2 == r5) goto L46
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            kotlin.f.b(r11)
            goto Ld3
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            boolean r10 = r0.f25775c
            java.lang.Object r2 = r0.f25774b
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r0.f25773a
            com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel r4 = (com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel) r4
            kotlin.f.b(r11)
            goto Lad
        L46:
            boolean r10 = r0.f25775c
            java.lang.Object r2 = r0.f25774b
            com.forsale.app.features.categories.listingdetails.buyerscreen.q r2 = (com.forsale.app.features.categories.listingdetails.buyerscreen.q) r2
            java.lang.Object r6 = r0.f25773a
            com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel r6 = (com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel) r6
            kotlin.f.b(r11)
            goto L7b
        L54:
            kotlin.f.b(r11)
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.GetBuyerListingDetailsInteractor r11 = r9.f25632a
            kotlinx.coroutines.flow.StateFlow<com.forsale.app.features.categories.listingdetails.buyerscreen.t> r2 = r9.R
            java.lang.Object r2 = r2.getValue()
            com.forsale.app.features.categories.listingdetails.buyerscreen.t r2 = (com.forsale.app.features.categories.listingdetails.buyerscreen.t) r2
            com.forsale.app.features.categories.listingdetails.buyerscreen.q r2 = r11.d(r2)
            if (r2 == 0) goto Ld3
            com.forsale.app.features.categories.listingdetails.models.DetailsModel r11 = r2.c()
            r0.f25773a = r9
            r0.f25774b = r2
            r0.f25775c = r10
            r0.f25778f = r5
            java.lang.Object r11 = r9.J0(r11, r10, r0)
            if (r11 != r1) goto L7a
            return r1
        L7a:
            r6 = r9
        L7b:
            com.forsale.app.features.categories.listingdetails.models.DetailsModel r11 = r2.c()
            com.forsale.app.features.categories.listingdetails.models.CommonData r11 = r11.d()
            com.forsale.app.datalayer.network.responses.listingdetails.BuyerListingDetailsResponseModel$Data$Listing$User r11 = r11.F()
            if (r11 == 0) goto L8f
            java.lang.String r11 = r11.getFirstName()
            if (r11 != 0) goto L91
        L8f:
            java.lang.String r11 = ""
        L91:
            kotlinx.coroutines.flow.MutableStateFlow<com.forsale.app.features.categories.listingdetails.buyerscreen.t> r7 = r6.Q
            com.forsale.app.features.categories.listingdetails.buyerscreen.t$a r8 = new com.forsale.app.features.categories.listingdetails.buyerscreen.t$a
            com.forsale.app.features.categories.listingdetails.buyerscreen.q r2 = r6.y1(r2, r10)
            r8.<init>(r2)
            r0.f25773a = r6
            r0.f25774b = r11
            r0.f25775c = r10
            r0.f25778f = r4
            java.lang.Object r2 = r7.emit(r8, r0)
            if (r2 != r1) goto Lab
            return r1
        Lab:
            r2 = r11
            r4 = r6
        Lad:
            kotlinx.coroutines.flow.MutableSharedFlow<lf.a> r11 = r4.f25652k0
            lf.a r4 = new lf.a
            rj.a$b r6 = new rj.a$b
            if (r10 == 0) goto Lb8
            int r10 = t9.y0.Y0
            goto Lba
        Lb8:
            int r10 = t9.y0.A1
        Lba:
            java.lang.Object[] r7 = new java.lang.Object[r5]
            r8 = 0
            r7[r8] = r2
            r6.<init>(r10, r7)
            r10 = 0
            r4.<init>(r10, r6, r5, r10)
            r0.f25773a = r10
            r0.f25774b = r10
            r0.f25778f = r3
            java.lang.Object r10 = r11.emit(r4, r0)
            if (r10 != r1) goto Ld3
            return r1
        Ld3:
            wz.p r10 = wz.p.f75480a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel.Z0(boolean, zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b1(com.forsale.app.features.categories.listingdetails.models.DetailsModel r6, zz.a<? super wz.p> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$postLoadListingDetails$1
            if (r0 == 0) goto L13
            r0 = r7
            com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$postLoadListingDetails$1 r0 = (com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$postLoadListingDetails$1) r0
            int r1 = r0.f25783e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25783e = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$postLoadListingDetails$1 r0 = new com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$postLoadListingDetails$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f25781c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f25783e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.f.b(r7)
            goto Lbc
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            java.lang.Object r6 = r0.f25780b
            com.forsale.app.features.categories.listingdetails.models.DetailsModel r6 = (com.forsale.app.features.categories.listingdetails.models.DetailsModel) r6
            java.lang.Object r2 = r0.f25779a
            com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel r2 = (com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel) r2
            kotlin.f.b(r7)
            goto L7e
        L41:
            kotlin.f.b(r7)
            com.forsale.app.features.categories.listingdetails.models.CommonData r7 = r6.d()
            java.lang.String r7 = r7.j()
            int r7 = java.lang.Integer.parseInt(r7)
            r5.l0(r7)
            com.forsale.app.features.categories.listingdetails.models.CommonData r7 = r6.d()
            java.lang.String r7 = r7.j()
            int r7 = java.lang.Integer.parseInt(r7)
            r5.h0(r7)
            com.forsale.app.features.categories.listingdetails.models.BuyerData r7 = r6.c()
            r2 = 0
            if (r7 == 0) goto L70
            boolean r7 = r7.a()
            if (r7 == 0) goto L70
            r2 = r4
        L70:
            r0.f25779a = r5
            r0.f25780b = r6
            r0.f25783e = r4
            java.lang.Object r7 = r5.w1(r2, r0)
            if (r7 != r1) goto L7d
            return r1
        L7d:
            r2 = r5
        L7e:
            com.forsale.app.features.categories.listingdetails.models.CommonData r7 = r6.d()
            boolean r7 = r7.L()
            r2.x1(r7)
            r2.h1(r6)
            r2.H0()
            com.forsale.app.features.categories.listingdetails.models.CommonData r7 = r6.d()
            java.lang.String r7 = r7.j()
            int r7 = java.lang.Integer.parseInt(r7)
            r2.I0(r7)
            r2.G0()
            r2.A1(r6)
            com.forsale.app.features.categories.listingdetails.models.CommonData r6 = r6.d()
            boolean r6 = r6.O()
            if (r6 == 0) goto Lbf
            r6 = 0
            r0.f25779a = r6
            r0.f25780b = r6
            r0.f25783e = r3
            java.lang.Object r6 = r2.C0(r0)
            if (r6 != r1) goto Lbc
            return r1
        Lbc:
            wz.p r6 = wz.p.f75480a
            return r6
        Lbf:
            wz.p r6 = wz.p.f75480a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel.b1(com.forsale.app.features.categories.listingdetails.models.DetailsModel, zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object e1(DetailsModel detailsModel, zz.a<? super wz.p> aVar) {
        Object f11;
        Object e11 = this.f25650j.e(new ListingDetailsFavoritedEvent(detailsModel, g0()), aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (e11 == f11) {
            return e11;
        }
        return wz.p.f75480a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f1() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new BuyerListingDetailsScreenViewModel$recordForSaleRealtyContactsClickedEvent$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ItemArgs g0() {
        return new ItemArgs(this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O);
    }

    private final void g1() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new BuyerListingDetailsScreenViewModel$recordListingDetailsSwiped$1(this, null), 3, null);
    }

    private final Job h0(int i11) {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new BuyerListingDetailsScreenViewModel$fetchGAM$1(this, i11, null), 3, null);
        return launch$default;
    }

    private final void h1(DetailsModel detailsModel) {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), this.D, null, new BuyerListingDetailsScreenViewModel$recordListingDetailsVisited$1(detailsModel, this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i0(String str, boolean z11) {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), this.D, null, new BuyerListingDetailsScreenViewModel$followUser$1(this, z11, str, null), 2, null);
    }

    private final void l0(int i11) {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), this.D, null, new BuyerListingDetailsScreenViewModel$getCategoryTree$1(this, i11, null), 2, null);
    }

    public static /* synthetic */ void l1(BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        buyerListingDetailsScreenViewModel.k1(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object m1(DetailsModel detailsModel, zz.a<? super wz.p> aVar) {
        Object f11;
        Object n11 = this.f25650j.n(new ListingDetailsShareClickedEvent(detailsModel, g0()), aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (n11 == f11) {
            return n11;
        }
        return wz.p.f75480a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object n1(DetailsModel detailsModel, zz.a<? super wz.p> aVar) {
        Object f11;
        Object o11 = this.f25650j.o(new ListingDetailsUnFavoritedEvent(detailsModel, g0()), aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (o11 == f11) {
            return o11;
        }
        return wz.p.f75480a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object v1(zz.a<? super wz.p> aVar) {
        Object f11;
        Object f12;
        int i11 = b.f25677a[this.V.getValue().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                return wz.p.f75480a;
            }
            Object emit = this.S.emit(new com.forsale.app.features.categories.listingdetails.buyerscreen.a(false, FavouriteState.PENDING), aVar);
            f12 = kotlin.coroutines.intrinsics.b.f();
            if (emit == f12) {
                return emit;
            }
            return wz.p.f75480a;
        }
        Object emit2 = this.S.emit(new com.forsale.app.features.categories.listingdetails.buyerscreen.a(true, FavouriteState.PENDING), aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (emit2 == f11) {
            return emit2;
        }
        return wz.p.f75480a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int w0(int i11) {
        return this.F[i11];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w1(boolean r7, zz.a<? super wz.p> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$updateFavourite$1
            if (r0 == 0) goto L13
            r0 = r8
            com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$updateFavourite$1 r0 = (com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$updateFavourite$1) r0
            int r1 = r0.f25830e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25830e = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$updateFavourite$1 r0 = new com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$updateFavourite$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f25828c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f25830e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r8)
            goto L72
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            boolean r7 = r0.f25827b
            java.lang.Object r2 = r0.f25826a
            com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel r2 = (com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel) r2
            kotlin.f.b(r8)
            goto L5d
        L3e:
            kotlin.f.b(r8)
            kotlinx.coroutines.flow.MutableSharedFlow<com.forsale.app.features.categories.listingdetails.buyerscreen.j> r8 = r6.S
            com.forsale.app.features.categories.listingdetails.buyerscreen.a r2 = new com.forsale.app.features.categories.listingdetails.buyerscreen.a
            if (r7 == 0) goto L4a
            com.forsale.app.features.categories.listingdetails.buyerscreen.FavouriteState r5 = com.forsale.app.features.categories.listingdetails.buyerscreen.FavouriteState.IS_FAVOURITE
            goto L4c
        L4a:
            com.forsale.app.features.categories.listingdetails.buyerscreen.FavouriteState r5 = com.forsale.app.features.categories.listingdetails.buyerscreen.FavouriteState.IS_NOT_FAVOURITE
        L4c:
            r2.<init>(r7, r5)
            r0.f25826a = r6
            r0.f25827b = r7
            r0.f25830e = r4
            java.lang.Object r8 = r8.emit(r2, r0)
            if (r8 != r1) goto L5c
            return r1
        L5c:
            r2 = r6
        L5d:
            kotlinx.coroutines.flow.MutableStateFlow<com.forsale.app.features.categories.listingdetails.buyerscreen.FavouriteState> r8 = r2.U
            if (r7 == 0) goto L64
            com.forsale.app.features.categories.listingdetails.buyerscreen.FavouriteState r7 = com.forsale.app.features.categories.listingdetails.buyerscreen.FavouriteState.IS_FAVOURITE
            goto L66
        L64:
            com.forsale.app.features.categories.listingdetails.buyerscreen.FavouriteState r7 = com.forsale.app.features.categories.listingdetails.buyerscreen.FavouriteState.IS_NOT_FAVOURITE
        L66:
            r2 = 0
            r0.f25826a = r2
            r0.f25830e = r3
            java.lang.Object r7 = r8.emit(r7, r0)
            if (r7 != r1) goto L72
            return r1
        L72:
            wz.p r7 = wz.p.f75480a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel.w1(boolean, zz.a):java.lang.Object");
    }

    private final void x1(boolean z11) {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new BuyerListingDetailsScreenViewModel$updateFollow$1(this, z11, null), 3, null);
    }

    private final q y1(q qVar, boolean z11) {
        CommonData a11;
        DetailsModel c11 = qVar.c();
        a11 = r0.a((r57 & 1) != 0 ? r0.f26985a : null, (r57 & 2) != 0 ? r0.f26986b : null, (r57 & 4) != 0 ? r0.f26987c : null, (r57 & 8) != 0 ? r0.f26988d : null, (r57 & 16) != 0 ? r0.f26989e : null, (r57 & 32) != 0 ? r0.f26990f : null, (r57 & 64) != 0 ? r0.f26991g : 0, (r57 & 128) != 0 ? r0.f26992h : null, (r57 & 256) != 0 ? r0.f26993i : null, (r57 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? r0.f26994j : null, (r57 & 1024) != 0 ? r0.f26995x : null, (r57 & RecyclerView.l.FLAG_MOVED) != 0 ? r0.f26996y : null, (r57 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? r0.f26997z : 0, (r57 & 8192) != 0 ? r0.A : null, (r57 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? r0.B : null, (r57 & 32768) != 0 ? r0.C : null, (r57 & 65536) != 0 ? r0.D : null, (r57 & 131072) != 0 ? r0.E : null, (r57 & 262144) != 0 ? r0.F : null, (r57 & 524288) != 0 ? r0.G : null, (r57 & 1048576) != 0 ? r0.H : null, (r57 & 2097152) != 0 ? r0.I : false, (r57 & 4194304) != 0 ? r0.J : null, (r57 & 8388608) != 0 ? r0.K : null, (r57 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? r0.L : null, (r57 & 33554432) != 0 ? r0.M : null, (r57 & 67108864) != 0 ? r0.N : null, (r57 & 134217728) != 0 ? r0.O : false, (r57 & 268435456) != 0 ? r0.P : false, (r57 & 536870912) != 0 ? r0.Q : null, (r57 & 1073741824) != 0 ? r0.R : 0, (r57 & Integer.MIN_VALUE) != 0 ? r0.S : null, (r58 & 1) != 0 ? r0.T : null, (r58 & 2) != 0 ? r0.U : null, (r58 & 4) != 0 ? r0.V : null, (r58 & 8) != 0 ? r0.W : null, (r58 & 16) != 0 ? r0.X : false, (r58 & 32) != 0 ? r0.Y : z11, (r58 & 64) != 0 ? qVar.c().d().Z : false);
        return q.b(qVar, DetailsModel.b(c11, a11, null, null, 6, null), null, FollowState.Companion.a(z11), null, 10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z1(int i11, DetailsModel detailsModel) {
        this.P = new a(this.F[i11], i11, detailsModel);
    }

    public final void M0(String str) {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), this.f25659r0, null, new BuyerListingDetailsScreenViewModel$onCallClicked$1(this, str, null), 2, null);
    }

    public final void O0() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), this.D.plus(this.f25659r0), null, new BuyerListingDetailsScreenViewModel$onChatClicked$1(this, null), 2, null);
    }

    public final void P0() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new BuyerListingDetailsScreenViewModel$onFavoriteClicked$1(this, null), 3, null);
    }

    public final void Q0() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new BuyerListingDetailsScreenViewModel$onForSaleRealtyContactsClicked$1(this, null), 3, null);
    }

    public final void R0(int i11, boolean z11) {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new BuyerListingDetailsScreenViewModel$onReportAbuseClicked$1(this, i11, z11, null), 3, null);
    }

    public final void S0(UserProfileData userProfileData) {
        kotlin.jvm.internal.o.i(userProfileData, "userProfileData");
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new BuyerListingDetailsScreenViewModel$onSellerProfileClicked$1(this, userProfileData, null), 3, null);
    }

    public final void T0() {
        ShareText y02;
        DetailsModel c11 = this.f25632a.c(this.R.getValue());
        if (c11 != null && (y02 = y0()) != null) {
            BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new BuyerListingDetailsScreenViewModel$onShareClicked$1$1$1(this, c11, y02, null), 3, null);
        }
    }

    public final void U0(int i11) {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new BuyerListingDetailsScreenViewModel$onSwipe$1(this, i11, null), 3, null);
        g1();
    }

    public final void V0(String str) {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), this.f25659r0, null, new BuyerListingDetailsScreenViewModel$onWhatsAppClicked$1(this, str, null), 2, null);
    }

    public final void X0(UserContactMode contactMode, DetailsModel detailsModel) {
        kotlin.jvm.internal.o.i(contactMode, "contactMode");
        kotlin.jvm.internal.o.i(detailsModel, "detailsModel");
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new BuyerListingDetailsScreenViewModel$openCTAsBottomSheet$1(this, detailsModel, contactMode, null), 3, null);
    }

    public final void Y0(ab.a bottomSheetDataModel) {
        kotlin.jvm.internal.o.i(bottomSheetDataModel, "bottomSheetDataModel");
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new BuyerListingDetailsScreenViewModel$openForSaleRealtyBottomSheet$1(this, bottomSheetDataModel, null), 3, null);
    }

    public final void c1() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new BuyerListingDetailsScreenViewModel$recordDescriptionShowLessClicked$1(this, null), 3, null);
    }

    public final void d0() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), new c(CoroutineExceptionHandler.Key, this), null, new BuyerListingDetailsScreenViewModel$addToFavourite$2(this, null), 2, null);
    }

    public final void d1() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new BuyerListingDetailsScreenViewModel$recordDescriptionShowMoreClicked$1(this, null), 3, null);
    }

    public final void e0() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new BuyerListingDetailsScreenViewModel$changeFollowState$1(this, null), 3, null);
    }

    public final void f0() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new BuyerListingDetailsScreenViewModel$closeCTAsBottomSheet$1(this, null), 3, null);
    }

    public final void i1() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new BuyerListingDetailsScreenViewModel$recordMapClickedEvent$1(this, null), 3, null);
    }

    public final SharedFlow<j> j0() {
        return this.T;
    }

    public final void j1() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new BuyerListingDetailsScreenViewModel$recordReportAbuseClickEvent$1(this, null), 3, null);
    }

    public final StateFlow<t> k0() {
        return this.R;
    }

    public final void k1(boolean z11) {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new BuyerListingDetailsScreenViewModel$recordScrollingEvent$1(this, z11, null), 3, null);
    }

    public final SharedFlow<cb.b> m0() {
        return this.f25656o0;
    }

    public final StateFlow<ab.a> o0() {
        return this.f25658q0;
    }

    public final void o1() {
        D0(this.P.c(), true);
    }

    public final StateFlow<FavouriteState> p0() {
        return this.V;
    }

    public final void p1() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), new d(CoroutineExceptionHandler.Key, this), null, new BuyerListingDetailsScreenViewModel$removeFromFavourite$2(this, null), 2, null);
    }

    public final SharedFlow<lf.a> q0() {
        return this.f25653l0;
    }

    public final void q1(MediaTypes mediaType) {
        kotlin.jvm.internal.o.i(mediaType, "mediaType");
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new BuyerListingDetailsScreenViewModel$setMediaOpened$1(this, mediaType, null), 3, null);
    }

    public final StateFlow<ab.a> r0() {
        return this.f25647h0;
    }

    public final void r1(boolean z11) {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new BuyerListingDetailsScreenViewModel$setReportAbuseBottomSheet$1(this, z11, null), 3, null);
    }

    public final StateFlow<AdManagerAdRequest> s0() {
        return this.X;
    }

    public final void s1(eb.s scrollingAnalyticsDataModel) {
        kotlin.jvm.internal.o.i(scrollingAnalyticsDataModel, "scrollingAnalyticsDataModel");
        this.f25654m0.add(scrollingAnalyticsDataModel);
    }

    public final StateFlow<SectionState> t0() {
        return this.f25639d0;
    }

    public final void t1(lf.a feedbackModel) {
        kotlin.jvm.internal.o.i(feedbackModel, "feedbackModel");
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new BuyerListingDetailsScreenViewModel$showFeedback$1(this, feedbackModel, null), 3, null);
    }

    public final StateFlow<SectionState> u0() {
        return this.Z;
    }

    public final void u1(String str, String str2) {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new BuyerListingDetailsScreenViewModel$submitReportAbuse$1(this, str, str2, null), 3, null);
    }

    public final StateFlow<Boolean> v0() {
        return this.f25651j0;
    }

    public final a x0() {
        return this.P;
    }

    public final ShareText y0() {
        if (this.R.getValue() instanceof t.a) {
            t value = this.R.getValue();
            kotlin.jvm.internal.o.g(value, "null cannot be cast to non-null type com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerUiState.Content");
            return ((t.a) value).a().f();
        }
        return null;
    }

    public final StateFlow<SectionState> z0() {
        return this.f25635b0;
    }
}
