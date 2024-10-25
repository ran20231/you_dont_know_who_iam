package com.forsale.app.features.categories.listingdetails.newui;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.b0;
import androidx.lifecycle.r0;
import androidx.lifecycle.z;
import com.forsale.analytics.AnalyticsType;
import com.forsale.app.base.ViewStates;
import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.database.RegionEntity;
import com.forsale.app.datalayer.network.ResponseWrapper;
import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.datalayer.network.interceptors.ConnectivityInterceptor;
import com.forsale.app.datalayer.network.requestsbodies.IncrementCallClicksBody;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.network.responses.listingdetails.ItemStatus;
import com.forsale.app.datalayer.network.responses.listingdetails.ListingArchivedBy;
import com.forsale.app.datalayer.network.responses.listingdetails.ListingType;
import com.forsale.app.datalayer.network.services.AnalyticsService;
import com.forsale.app.datalayer.network.services.FavoritesService;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel;
import com.forsale.app.features.categories.listingdetails.buyerctas.CTAsVisibility;
import com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerItemStatus;
import com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.UserContactMode;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.TypeExtensionsKt;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.gam.ContentUrlType;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import g00.l;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.r;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import t9.o0;
import t9.q0;
import t9.y0;
import wz.p;
/* compiled from: NewListingDetailsViewModel.kt */
/* loaded from: classes2.dex */
public final class NewListingDetailsViewModel extends BaseViewModel {
    private final OneShotEventHandler<tg.c> A0;
    private final OneShotEventHandler<Boolean> A1;
    private final MutableSharedFlow<tg.c> B0;
    private final MutableSharedFlow<p> B1;
    private final SharedFlow<tg.c> C0;
    private final SharedFlow<p> C1;
    private final OneShotEventHandler<tg.c> D0;
    private final OneShotEventHandler<String> D1;
    private final OneShotEventHandler<String> E0;
    private final MutableSharedFlow<String> F0;
    private final SharedFlow<String> G0;
    private final MutableSharedFlow<com.forsale.app.ui.bottomsheets.listingdetailschat.b> H0;
    private final SharedFlow<com.forsale.app.ui.bottomsheets.listingdetailschat.b> I0;
    private final MutableSharedFlow<ListingItemDetails> J0;
    private final SharedFlow<ListingItemDetails> K0;
    private final MutableSharedFlow<p> L0;
    private final SharedFlow<p> M0;
    private final MutableStateFlow<Boolean> N0;
    private final StateFlow<Boolean> O0;
    private final MutableStateFlow<CTAsVisibility> P0;
    private final StateFlow<CTAsVisibility> Q0;
    private final MutableStateFlow<Boolean> R0;
    private final StateFlow<Boolean> S0;
    private final b0<Boolean> T0;
    private final OneShotEventHandler<ListingItemDetails> U0;
    private final z<FavouriteState> V0;
    private final b0<Boolean> W0;
    private UserContactMode X0;
    private final b0<UserType> Y0;
    private final LiveData<UserType> Z0;

    /* renamed from: a1  reason: collision with root package name */
    private final b0<rb.a> f27161a1;

    /* renamed from: b1  reason: collision with root package name */
    private final LiveData<rb.a> f27162b1;

    /* renamed from: c1  reason: collision with root package name */
    private final b0<CategoryEntity> f27163c1;

    /* renamed from: d1  reason: collision with root package name */
    private final LiveData<CategoryEntity> f27164d1;

    /* renamed from: e1  reason: collision with root package name */
    private final OneShotEventHandler<ActionType> f27165e1;

    /* renamed from: f1  reason: collision with root package name */
    private final b0<Boolean> f27166f1;

    /* renamed from: g1  reason: collision with root package name */
    private final LiveData<Boolean> f27167g1;

    /* renamed from: h1  reason: collision with root package name */
    private final MutableSharedFlow<ListingDetailsEntity> f27168h1;

    /* renamed from: i1  reason: collision with root package name */
    private final SharedFlow<ListingDetailsEntity> f27169i1;

    /* renamed from: j1  reason: collision with root package name */
    private final b0<Boolean> f27170j1;

    /* renamed from: k0  reason: collision with root package name */
    private final ListingDetailsViewModel f27171k0;

    /* renamed from: k1  reason: collision with root package name */
    private final LiveData<Boolean> f27172k1;

    /* renamed from: l0  reason: collision with root package name */
    private final FavoritesService f27173l0;

    /* renamed from: l1  reason: collision with root package name */
    private final z<Boolean> f27174l1;

    /* renamed from: m0  reason: collision with root package name */
    private final AnalyticsService f27175m0;

    /* renamed from: m1  reason: collision with root package name */
    private final MutableSharedFlow<Integer> f27176m1;

    /* renamed from: n0  reason: collision with root package name */
    private final jj.b f27177n0;

    /* renamed from: n1  reason: collision with root package name */
    private final SharedFlow<Integer> f27178n1;

    /* renamed from: o0  reason: collision with root package name */
    private final ApplicationResourcesRepository f27179o0;

    /* renamed from: o1  reason: collision with root package name */
    private final b0<Boolean> f27180o1;

    /* renamed from: p0  reason: collision with root package name */
    private final fj.b f27181p0;

    /* renamed from: p1  reason: collision with root package name */
    private final LiveData<Boolean> f27182p1;

    /* renamed from: q0  reason: collision with root package name */
    private final MutableSharedFlow<p> f27183q0;

    /* renamed from: q1  reason: collision with root package name */
    private final b0<Boolean> f27184q1;

    /* renamed from: r0  reason: collision with root package name */
    private final SharedFlow<p> f27185r0;

    /* renamed from: r1  reason: collision with root package name */
    private final LiveData<Boolean> f27186r1;

    /* renamed from: s0  reason: collision with root package name */
    private final OneShotEventHandler<p> f27187s0;

    /* renamed from: s1  reason: collision with root package name */
    private final b0<Boolean> f27188s1;

    /* renamed from: t0  reason: collision with root package name */
    private final MutableSharedFlow<ListingDetailsEntity> f27189t0;

    /* renamed from: t1  reason: collision with root package name */
    private final LiveData<Boolean> f27190t1;

    /* renamed from: u0  reason: collision with root package name */
    private final SharedFlow<ListingDetailsEntity> f27191u0;

    /* renamed from: u1  reason: collision with root package name */
    private final LiveData<ListingItemDetails> f27192u1;

    /* renamed from: v0  reason: collision with root package name */
    private final OneShotEventHandler<ListingItemDetails> f27193v0;

    /* renamed from: v1  reason: collision with root package name */
    private final Flow<ListingItemDetails> f27194v1;

    /* renamed from: w0  reason: collision with root package name */
    private final MutableSharedFlow<ListingItemDetails> f27195w0;

    /* renamed from: w1  reason: collision with root package name */
    private final Flow<SellerListingStatus> f27196w1;

    /* renamed from: x0  reason: collision with root package name */
    private final SharedFlow<ListingItemDetails> f27197x0;

    /* renamed from: x1  reason: collision with root package name */
    private final Flow<Boolean> f27198x1;

    /* renamed from: y0  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f27199y0;

    /* renamed from: y1  reason: collision with root package name */
    private final LiveData<ViewStates> f27200y1;

    /* renamed from: z0  reason: collision with root package name */
    private final StateFlow<Boolean> f27201z0;

    /* renamed from: z1  reason: collision with root package name */
    private final LiveData<List<String>> f27202z1;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NewListingDetailsViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class ActionType {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ ActionType[] $VALUES;
        public static final ActionType CALL = new ActionType("CALL", 0);
        public static final ActionType CALL_STICKY = new ActionType("CALL_STICKY", 1);
        public static final ActionType CHAT = new ActionType("CHAT", 2);
        public static final ActionType CHAT_STICKY = new ActionType("CHAT_STICKY", 3);
        public static final ActionType WHATS_APP_STICKY = new ActionType("WHATS_APP_STICKY", 4);

        private static final /* synthetic */ ActionType[] $values() {
            return new ActionType[]{CALL, CALL_STICKY, CHAT, CHAT_STICKY, WHATS_APP_STICKY};
        }

        static {
            ActionType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private ActionType(String str, int i11) {
        }

        public static a00.a<ActionType> getEntries() {
            return $ENTRIES;
        }

        public static ActionType valueOf(String str) {
            return (ActionType) Enum.valueOf(ActionType.class, str);
        }

        public static ActionType[] values() {
            return (ActionType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NewListingDetailsViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class FavouriteState {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ FavouriteState[] $VALUES;
        public static final FavouriteState IS_FAVOURITE = new FavouriteState("IS_FAVOURITE", 0);
        public static final FavouriteState IS_NOT_FAVOURITE = new FavouriteState("IS_NOT_FAVOURITE", 1);
        public static final FavouriteState PENDING = new FavouriteState("PENDING", 2);

        private static final /* synthetic */ FavouriteState[] $values() {
            return new FavouriteState[]{IS_FAVOURITE, IS_NOT_FAVOURITE, PENDING};
        }

        static {
            FavouriteState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private FavouriteState(String str, int i11) {
        }

        public static a00.a<FavouriteState> getEntries() {
            return $ENTRIES;
        }

        public static FavouriteState valueOf(String str) {
            return (FavouriteState) Enum.valueOf(FavouriteState.class, str);
        }

        public static FavouriteState[] values() {
            return (FavouriteState[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NewListingDetailsViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class UserType {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ UserType[] $VALUES;
        public static final UserType UNDEFINED = new UserType("UNDEFINED", 0);
        public static final UserType BUYER = new UserType("BUYER", 1);
        public static final UserType SELLER = new UserType("SELLER", 2);
        public static final UserType GUEST = new UserType("GUEST", 3);

        private static final /* synthetic */ UserType[] $values() {
            return new UserType[]{UNDEFINED, BUYER, SELLER, GUEST};
        }

        static {
            UserType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private UserType(String str, int i11) {
        }

        public static a00.a<UserType> getEntries() {
            return $ENTRIES;
        }

        public static UserType valueOf(String str) {
            return (UserType) Enum.valueOf(UserType.class, str);
        }

        public static UserType[] values() {
            return (UserType[]) $VALUES.clone();
        }
    }

    /* compiled from: NewListingDetailsViewModel.kt */
    /* loaded from: classes2.dex */
    public interface a {
        NewListingDetailsViewModel a(ListingDetailsViewModel listingDetailsViewModel);
    }

    /* compiled from: NewListingDetailsViewModel.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f27220a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f27221b;

        static {
            int[] iArr = new int[ActionType.values().length];
            try {
                iArr[ActionType.CALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ActionType.CALL_STICKY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ActionType.CHAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ActionType.CHAT_STICKY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ActionType.WHATS_APP_STICKY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f27220a = iArr;
            int[] iArr2 = new int[ItemStatus.values().length];
            try {
                iArr2[ItemStatus.QUARANTINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ItemStatus.DRAFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            f27221b = iArr2;
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ NewListingDetailsViewModel f27222a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(CoroutineExceptionHandler.Key key, NewListingDetailsViewModel newListingDetailsViewModel) {
            super(key);
            this.f27222a = newListingDetailsViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            this.f27222a.j1(th2);
            this.f27222a.K1().postValue(FavouriteState.IS_NOT_FAVOURITE);
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ NewListingDetailsViewModel f27248a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(CoroutineExceptionHandler.Key key, NewListingDetailsViewModel newListingDetailsViewModel) {
            super(key);
            this.f27248a = newListingDetailsViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            this.f27248a.j1(th2);
            this.f27248a.K1().postValue(FavouriteState.IS_FAVOURITE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewListingDetailsViewModel(ListingDetailsViewModel listingDetailsViewModel, FavoritesService favoritesService, AnalyticsService analysisService, jj.b prefs, ApplicationResourcesRepository appResRepo, fj.b gamUtils, BaseRepository baseRepository) {
        super(baseRepository);
        o.i(listingDetailsViewModel, "listingDetailsViewModel");
        o.i(favoritesService, "favoritesService");
        o.i(analysisService, "analysisService");
        o.i(prefs, "prefs");
        o.i(appResRepo, "appResRepo");
        o.i(gamUtils, "gamUtils");
        o.i(baseRepository, "baseRepository");
        this.f27171k0 = listingDetailsViewModel;
        this.f27173l0 = favoritesService;
        this.f27175m0 = analysisService;
        this.f27177n0 = prefs;
        this.f27179o0 = appResRepo;
        this.f27181p0 = gamUtils;
        MutableSharedFlow<p> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f27183q0 = MutableSharedFlow$default;
        this.f27185r0 = FlowKt.asSharedFlow(MutableSharedFlow$default);
        this.f27187s0 = new OneShotEventHandler<>(null, 0, 3, null);
        MutableSharedFlow<ListingDetailsEntity> MutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f27189t0 = MutableSharedFlow$default2;
        this.f27191u0 = FlowKt.asSharedFlow(MutableSharedFlow$default2);
        this.f27193v0 = new OneShotEventHandler<>(null, 0, 3, null);
        MutableSharedFlow<ListingItemDetails> MutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f27195w0 = MutableSharedFlow$default3;
        this.f27197x0 = FlowKt.asSharedFlow(MutableSharedFlow$default3);
        Boolean bool = Boolean.FALSE;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(bool);
        this.f27199y0 = MutableStateFlow;
        this.f27201z0 = FlowKt.asStateFlow(MutableStateFlow);
        this.A0 = new OneShotEventHandler<>(null, 0, 3, null);
        MutableSharedFlow<tg.c> MutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.B0 = MutableSharedFlow$default4;
        this.C0 = FlowKt.asSharedFlow(MutableSharedFlow$default4);
        this.D0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.E0 = new OneShotEventHandler<>(null, 0, 3, null);
        MutableSharedFlow<String> MutableSharedFlow$default5 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.F0 = MutableSharedFlow$default5;
        this.G0 = FlowKt.asSharedFlow(MutableSharedFlow$default5);
        MutableSharedFlow<com.forsale.app.ui.bottomsheets.listingdetailschat.b> MutableSharedFlow$default6 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.H0 = MutableSharedFlow$default6;
        this.I0 = FlowKt.asSharedFlow(MutableSharedFlow$default6);
        MutableSharedFlow<ListingItemDetails> MutableSharedFlow$default7 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.J0 = MutableSharedFlow$default7;
        this.K0 = FlowKt.asSharedFlow(MutableSharedFlow$default7);
        MutableSharedFlow<p> MutableSharedFlow$default8 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.L0 = MutableSharedFlow$default8;
        this.M0 = FlowKt.asSharedFlow(MutableSharedFlow$default8);
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(bool);
        this.N0 = MutableStateFlow2;
        this.O0 = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<CTAsVisibility> MutableStateFlow3 = StateFlowKt.MutableStateFlow(new CTAsVisibility(null, null, null, 7, null));
        this.P0 = MutableStateFlow3;
        this.Q0 = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<Boolean> MutableStateFlow4 = StateFlowKt.MutableStateFlow(bool);
        this.R0 = MutableStateFlow4;
        this.S0 = FlowKt.asStateFlow(MutableStateFlow4);
        this.T0 = new b0<>(bool);
        this.U0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.V0 = new z<>();
        this.W0 = new b0<>(bool);
        this.X0 = UserContactMode.CALL_ONLY;
        b0<UserType> b0Var = new b0<>();
        b0Var.setValue(UserType.UNDEFINED);
        this.Y0 = b0Var;
        this.Z0 = b0Var;
        b0<rb.a> b0Var2 = new b0<>();
        this.f27161a1 = b0Var2;
        this.f27162b1 = b0Var2;
        b0<CategoryEntity> b0Var3 = new b0<>();
        this.f27163c1 = b0Var3;
        this.f27164d1 = b0Var3;
        this.f27165e1 = new OneShotEventHandler<>(null, 0, 3, null);
        b0<Boolean> b0Var4 = new b0<>(bool);
        this.f27166f1 = b0Var4;
        this.f27167g1 = b0Var4;
        MutableSharedFlow<ListingDetailsEntity> MutableSharedFlow$default9 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f27168h1 = MutableSharedFlow$default9;
        this.f27169i1 = FlowKt.asSharedFlow(MutableSharedFlow$default9);
        b0<Boolean> b0Var5 = new b0<>(bool);
        this.f27170j1 = b0Var5;
        this.f27172k1 = b0Var5;
        z<Boolean> zVar = new z<>();
        zVar.setValue(bool);
        this.f27174l1 = zVar;
        MutableSharedFlow<Integer> MutableSharedFlow$default10 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f27176m1 = MutableSharedFlow$default10;
        this.f27178n1 = FlowKt.asSharedFlow(MutableSharedFlow$default10);
        b0<Boolean> b0Var6 = new b0<>(bool);
        this.f27180o1 = b0Var6;
        this.f27182p1 = b0Var6;
        b0<Boolean> b0Var7 = new b0<>(bool);
        this.f27184q1 = b0Var7;
        this.f27186r1 = b0Var7;
        b0<Boolean> b0Var8 = new b0<>(bool);
        this.f27188s1 = b0Var8;
        this.f27190t1 = b0Var8;
        LiveData<ListingItemDetails> Y0 = listingDetailsViewModel.Y0();
        this.f27192u1 = Y0;
        final Flow<ListingItemDetails> a11 = FlowLiveDataConversions.a(Y0);
        this.f27194v1 = a11;
        this.f27196w1 = new Flow<SellerListingStatus>() { // from class: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$special$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$special$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ FlowCollector f27205a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ NewListingDetailsViewModel f27206b;

                /* compiled from: Emitters.kt */
                @d(c = "com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$special$$inlined$map$1$2", f = "NewListingDetailsViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$special$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f27207a;

                    /* renamed from: b  reason: collision with root package name */
                    int f27208b;

                    public AnonymousClass1(zz.a aVar) {
                        super(aVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f27207a = obj;
                        this.f27208b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, NewListingDetailsViewModel newListingDetailsViewModel) {
                    this.f27205a = flowCollector;
                    this.f27206b = newListingDetailsViewModel;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r8, zz.a r9) {
                    /*
                        r7 = this;
                        boolean r0 = r9 instanceof com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r9
                        com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$special$$inlined$map$1$2$1 r0 = (com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f27208b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f27208b = r1
                        goto L18
                    L13:
                        com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$special$$inlined$map$1$2$1 r0 = new com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$special$$inlined$map$1$2$1
                        r0.<init>(r9)
                    L18:
                        java.lang.Object r9 = r0.f27207a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.f27208b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r9)
                        goto L61
                    L29:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                        r8.<init>(r9)
                        throw r8
                    L31:
                        kotlin.f.b(r9)
                        kotlinx.coroutines.flow.FlowCollector r9 = r7.f27205a
                        com.forsale.app.datalayer.network.responses.ListingItemDetails r8 = (com.forsale.app.datalayer.network.responses.ListingItemDetails) r8
                        com.forsale.app.features.categories.listingdetails.newui.SellerListingStatus$a r2 = com.forsale.app.features.categories.listingdetails.newui.SellerListingStatus.Companion
                        com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel r4 = r7.f27206b
                        com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel r4 = r4.R1()
                        boolean r4 = r4.B1()
                        com.forsale.app.datalayer.network.responses.listingdetails.ItemStatus r5 = r8.getStatus()
                        if (r5 != 0) goto L4c
                        com.forsale.app.datalayer.network.responses.listingdetails.ItemStatus r5 = com.forsale.app.datalayer.network.responses.listingdetails.ItemStatus.NORMAL
                    L4c:
                        com.forsale.app.datalayer.network.responses.listingdetails.ListingType r6 = r8.getType()
                        com.forsale.app.datalayer.network.responses.listingdetails.ListingArchivedBy r8 = r8.getArchivedBy()
                        com.forsale.app.features.categories.listingdetails.newui.SellerListingStatus r8 = r2.a(r4, r5, r6, r8)
                        r0.f27208b = r3
                        java.lang.Object r8 = r9.emit(r8, r0)
                        if (r8 != r1) goto L61
                        return r1
                    L61:
                        wz.p r8 = wz.p.f75480a
                        return r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zz.a):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super SellerListingStatus> flowCollector, zz.a aVar) {
                Object f11;
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this), aVar);
                f11 = kotlin.coroutines.intrinsics.b.f();
                if (collect == f11) {
                    return collect;
                }
                return p.f75480a;
            }
        };
        this.f27198x1 = new Flow<Boolean>() { // from class: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$special$$inlined$map$2

            /* compiled from: Emitters.kt */
            /* renamed from: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$special$$inlined$map$2$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ FlowCollector f27211a;

                /* compiled from: Emitters.kt */
                @d(c = "com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$special$$inlined$map$2$2", f = "NewListingDetailsViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$special$$inlined$map$2$2$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f27212a;

                    /* renamed from: b  reason: collision with root package name */
                    int f27213b;

                    public AnonymousClass1(zz.a aVar) {
                        super(aVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f27212a = obj;
                        this.f27213b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f27211a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, zz.a r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$special$$inlined$map$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$special$$inlined$map$2$2$1 r0 = (com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$special$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f27213b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f27213b = r1
                        goto L18
                    L13:
                        com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$special$$inlined$map$2$2$1 r0 = new com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$special$$inlined$map$2$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f27212a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.f27213b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L49
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.f27211a
                        com.forsale.app.datalayer.network.responses.ListingItemDetails r5 = (com.forsale.app.datalayer.network.responses.ListingItemDetails) r5
                        boolean r5 = r5.isAboutToExpire()
                        java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.a.a(r5)
                        r0.f27213b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L49
                        return r1
                    L49:
                        wz.p r5 = wz.p.f75480a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$special$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, zz.a):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, zz.a aVar) {
                Object f11;
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), aVar);
                f11 = kotlin.coroutines.intrinsics.b.f();
                if (collect == f11) {
                    return collect;
                }
                return p.f75480a;
            }
        };
        this.f27200y1 = listingDetailsViewModel.r1();
        this.f27202z1 = Transformations.b(b0Var3, new l<CategoryEntity, List<String>>() { // from class: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$categoryTreeNames$1
            @Override // g00.l
            /* renamed from: b */
            public final List<String> invoke(CategoryEntity it2) {
                o.i(it2, "it");
                return it2.getCategoryTreeNames();
            }
        });
        this.A1 = new OneShotEventHandler<>(null, 0, 3, null);
        MutableSharedFlow<p> MutableSharedFlow$default11 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.B1 = MutableSharedFlow$default11;
        this.C1 = FlowKt.asSharedFlow(MutableSharedFlow$default11);
        if (listingDetailsViewModel.T0().getValue().booleanValue()) {
            k2();
        }
        this.D1 = new OneShotEventHandler<>(null, 0, 3, null);
    }

    private final boolean A2() {
        if (this.Z0.getValue() == UserType.SELLER && !this.f27171k0.T0().getValue().booleanValue()) {
            return true;
        }
        return false;
    }

    private final void D2() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new NewListingDetailsViewModel$loadItemCategory$1(this, null), 3, null);
    }

    private final rb.a F2(ListingItemDetails listingItemDetails) {
        int i11;
        if (this.f27171k0.y1()) {
            return new rb.a(SellerItemStatus.ARCHIVED, this.f27179o0.getDrawable(q0.Q0), this.f27179o0.getString(y0.E8, new Object[0]), this.f27179o0.getColor(o0.f69336m));
        }
        ItemStatus status = listingItemDetails.getStatus();
        if (status == null) {
            i11 = -1;
        } else {
            i11 = b.f27221b[status.ordinal()];
        }
        if (i11 != 1) {
            if (i11 != 2) {
                return new rb.a(SellerItemStatus.LIVE, this.f27179o0.getDrawable(q0.S0), this.f27179o0.getString(y0.G8, new Object[0]), this.f27179o0.getColor(o0.f69338o));
            }
            return new rb.a(SellerItemStatus.DRAFT, this.f27179o0.getDrawable(q0.R0), this.f27179o0.getString(y0.F8, new Object[0]), this.f27179o0.getColor(o0.f69337n));
        }
        return new rb.a(SellerItemStatus.QUARANTINE, this.f27179o0.getDrawable(q0.T0), this.f27179o0.getString(y0.H8, new Object[0]), this.f27179o0.getColor(o0.f69339p));
    }

    private final fj.a G1() {
        Integer num;
        ContentUrlType contentUrlType = ContentUrlType.LISTING_DETAILS;
        ListingItemDetails value = this.f27192u1.getValue();
        String str = null;
        if (value != null) {
            num = Integer.valueOf(value.getId());
        } else {
            num = null;
        }
        List<String> value2 = this.f27202z1.getValue();
        ListingItemDetails value3 = this.f27192u1.getValue();
        if (value3 != null) {
            str = value3.getTitle();
        }
        return new fj.a(contentUrlType, num, value2, str);
    }

    private final void G2() {
        ListingItemDetails value;
        LiveData<ListingItemDetails> liveData = this.f27192u1;
        if (liveData != null && (value = liveData.getValue()) != null) {
            this.f27161a1.setValue(F2(value));
        }
    }

    public static /* synthetic */ void J2(NewListingDetailsViewModel newListingDetailsViewModel, AggregatedAllAnalyticsLogger.AdvActionEvents advActionEvents, String str, boolean z11, boolean z12, boolean z13, AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition, String str2, int i11, Object obj) {
        String str3;
        boolean z14;
        boolean z15;
        AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition2;
        String str4 = null;
        if ((i11 & 2) != 0) {
            str3 = null;
        } else {
            str3 = str;
        }
        boolean z16 = true;
        if ((i11 & 4) != 0) {
            z14 = true;
        } else {
            z14 = z11;
        }
        if ((i11 & 8) == 0) {
            z16 = z12;
        }
        if ((i11 & 16) != 0) {
            z15 = false;
        } else {
            z15 = z13;
        }
        if ((i11 & 32) != 0) {
            analyticsPosition2 = null;
        } else {
            analyticsPosition2 = analyticsPosition;
        }
        if ((i11 & 64) == 0) {
            str4 = str2;
        }
        newListingDetailsViewModel.I2(advActionEvents, str3, z14, z16, z15, analyticsPosition2, str4);
    }

    private final void K2() {
        AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition;
        AggregatedAllAnalyticsLogger.AdvActionEvents advActionEvents = AggregatedAllAnalyticsLogger.AdvActionEvents.LISTING_DETAILS_CALL_CLICKED;
        String Z0 = this.f27171k0.Z0();
        ActionType g11 = this.f27165e1.g();
        if (g11 != null) {
            analyticsPosition = x1(g11);
        } else {
            analyticsPosition = null;
        }
        J2(this, advActionEvents, Z0, false, false, true, analyticsPosition, null, 76, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L2() {
        this.f27171k0.I0(new g00.a<p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$logListingDetailsChatClicked$1
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
                NewListingDetailsViewModel newListingDetailsViewModel = NewListingDetailsViewModel.this;
                NewListingDetailsViewModel.J2(newListingDetailsViewModel, AggregatedAllAnalyticsLogger.AdvActionEvents.LISTING_DETAILS_CHAT_CLICKED, newListingDetailsViewModel.R1().Z0(), false, false, true, null, null, FacebookMediationAdapter.ERROR_MAPPING_NATIVE_ASSETS, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M2() {
        J2(this, AggregatedAllAnalyticsLogger.AdvActionEvents.LISTING_DETAILS_WHATS_APP_CLICKED, this.f27171k0.Z0(), false, false, true, null, null, FacebookMediationAdapter.ERROR_MAPPING_NATIVE_ASSETS, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean N1() {
        ListingItemDetails value = this.f27192u1.getValue();
        if (value == null || !TypeExtensionsKt.h0(value.isHideMyNumber()) || !m2(value.getContacts(), value.getPhone())) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<String> Z1() {
        List<String> n11;
        boolean z11;
        List<String> E0;
        n11 = r.n();
        ListingItemDetails value = this.f27192u1.getValue();
        if (value != null) {
            String contacts = value.getContacts();
            if (contacts != null && contacts.length() != 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!z11) {
                String contacts2 = value.getContacts();
                if (contacts2 != null) {
                    E0 = StringsKt__StringsKt.E0(contacts2, new char[]{','}, false, 0, 6, null);
                    return E0;
                }
                return null;
            }
            return n11;
        }
        return n11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z2() {
        BuildersKt__Builders_commonKt.launch$default(this.f27171k0, getCoroutineContext().plus(new d(CoroutineExceptionHandler.Key, this)), null, new NewListingDetailsViewModel$removeFromFavourite$2(this, null), 2, null);
    }

    private final void b3() {
        UserType userType;
        Boolean value = this.f27171k0.A1().getValue();
        if (value != null) {
            boolean booleanValue = value.booleanValue();
            b0<UserType> b0Var = this.Y0;
            if (booleanValue && !this.f27171k0.T0().getValue().booleanValue()) {
                userType = UserType.SELLER;
            } else if (booleanValue && this.f27171k0.T0().getValue().booleanValue()) {
                userType = UserType.GUEST;
            } else {
                userType = UserType.BUYER;
            }
            b0Var.setValue(userType);
        }
    }

    private final void c3(boolean z11) {
        FavouriteState favouriteState;
        z<FavouriteState> zVar = this.V0;
        if (z11) {
            favouriteState = FavouriteState.IS_FAVOURITE;
        } else {
            favouriteState = FavouriteState.IS_NOT_FAVOURITE;
        }
        zVar.setValue(favouriteState);
    }

    private final void d3(ListingItemDetails listingItemDetails) {
        boolean z11;
        z<Boolean> zVar = this.f27174l1;
        if (listingItemDetails.getStatus() == ItemStatus.QUARANTINE && listingItemDetails.getType() != ListingType.ARCHIVED && A2()) {
            z11 = true;
        } else {
            z11 = false;
        }
        zVar.setValue(Boolean.valueOf(z11));
        m1(this.f27171k0.x1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e3(final String str) {
        this.f27171k0.I0(new g00.a<p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$whatsAppDirect$1

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: NewListingDetailsViewModel.kt */
            @d(c = "com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$whatsAppDirect$1$1", f = "NewListingDetailsViewModel.kt", l = {682}, m = "invokeSuspend")
            /* renamed from: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$whatsAppDirect$1$1  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super p>, Object> {

                /* renamed from: a  reason: collision with root package name */
                int f27323a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ NewListingDetailsViewModel f27324b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ String f27325c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(NewListingDetailsViewModel newListingDetailsViewModel, String str, zz.a<? super AnonymousClass1> aVar) {
                    super(2, aVar);
                    this.f27324b = newListingDetailsViewModel;
                    this.f27325c = str;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final zz.a<p> create(Object obj, zz.a<?> aVar) {
                    return new AnonymousClass1(this.f27324b, this.f27325c, aVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object f11;
                    f11 = kotlin.coroutines.intrinsics.b.f();
                    int i11 = this.f27323a;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            f.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        f.b(obj);
                        OneShotEventHandler<String> Y1 = this.f27324b.Y1();
                        String str = this.f27325c;
                        this.f27323a = 1;
                        if (Y1.f(str, this) == f11) {
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
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                NewListingDetailsViewModel newListingDetailsViewModel = NewListingDetailsViewModel.this;
                NewListingDetailsViewModel.J2(newListingDetailsViewModel, AggregatedAllAnalyticsLogger.AdvActionEvents.LISTING_DETAILS_WHATSAPP_DIRECTED, newListingDetailsViewModel.R1().Z0(), false, false, true, null, str, 44, null);
                NewListingDetailsViewModel newListingDetailsViewModel2 = NewListingDetailsViewModel.this;
                BuildersKt__Builders_commonKt.launch$default(newListingDetailsViewModel2, null, null, new AnonymousClass1(newListingDetailsViewModel2, str, null), 3, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f3(ListingItemDetails listingItemDetails) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new NewListingDetailsViewModel$whatsAppMultipleNumbers$1(this, listingItemDetails, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g1() {
        BuildersKt__Builders_commonKt.launch$default(this, getCoroutineContext().plus(new c(CoroutineExceptionHandler.Key, this)), null, new NewListingDetailsViewModel$addToFavourite$2(this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h1(String str) {
        Integer num;
        J2(this, AggregatedAllAnalyticsLogger.AdvActionEvents.LISTING_DETAILS_PHONE_CLICKED, this.f27171k0.Z0(), false, false, true, null, str, 44, null);
        ListingItemDetails value = this.f27192u1.getValue();
        if (value != null) {
            num = Integer.valueOf(value.getId());
        } else {
            num = null;
        }
        o2(new IncrementCallClicksBody(String.valueOf(num), AnalyticsType.PHONE_CALLS));
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new NewListingDetailsViewModel$callDirect$1(this, str, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i1(com.forsale.app.datalayer.network.responses.ListingItemDetails r6, zz.a<? super wz.p> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$callMultipleNumbers$1
            if (r0 == 0) goto L13
            r0 = r7
            com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$callMultipleNumbers$1 r0 = (com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$callMultipleNumbers$1) r0
            int r1 = r0.f27229d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27229d = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$callMultipleNumbers$1 r0 = new com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$callMultipleNumbers$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f27227b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f27229d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r7)
            goto L60
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.f27226a
            com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel r6 = (com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel) r6
            kotlin.f.b(r7)
            goto L50
        L3c:
            kotlin.f.b(r7)
            r5.K2()
            com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.UserContactMode r7 = com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.UserContactMode.CALL_ONLY
            r0.f27226a = r5
            r0.f27229d = r4
            java.lang.Object r7 = r5.u1(r7, r6, r0)
            if (r7 != r1) goto L4f
            return r1
        L4f:
            r6 = r5
        L50:
            tg.c r7 = (tg.c) r7
            kotlinx.coroutines.flow.MutableSharedFlow<tg.c> r6 = r6.B0
            r2 = 0
            r0.f27226a = r2
            r0.f27229d = r3
            java.lang.Object r6 = r6.emit(r7, r0)
            if (r6 != r1) goto L60
            return r1
        L60:
            wz.p r6 = wz.p.f75480a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel.i1(com.forsale.app.datalayer.network.responses.ListingItemDetails, zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j1(Throwable th2) {
        if (th2 instanceof ConnectivityInterceptor.ConnectivityException) {
            T().tryEmit(Integer.valueOf(y0.X4));
        } else if (th2 instanceof ResponseWrapper.ResponseErrorException) {
            h0().tryEmit(((ResponseWrapper.ResponseErrorException) th2).getLocalizedMessage());
        } else {
            T().tryEmit(Integer.valueOf(y0.O4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k1(final g00.a<p> aVar) {
        this.f27171k0.I0(new g00.a<p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$checkCanStartChatAndTakeAction$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                ListingDetailsViewModel R1 = NewListingDetailsViewModel.this.R1();
                final g00.a<p> aVar2 = aVar;
                R1.G0(new g00.a<p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$checkCanStartChatAndTakeAction$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                        aVar2.invoke();
                    }
                });
            }
        });
    }

    private final void l1() {
        ListingItemDetails value;
        boolean z11;
        LiveData<ListingItemDetails> Y0 = this.f27171k0.Y0();
        if (Y0 != null && (value = Y0.getValue()) != null) {
            b0<Boolean> b0Var = this.f27180o1;
            if (w2() && value.getStatus() != ItemStatus.QUARANTINE) {
                z11 = true;
            } else {
                z11 = false;
            }
            b0Var.postValue(Boolean.valueOf(z11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l2() {
        BuildersKt__Builders_commonKt.launch$default(this.f27171k0, null, null, new NewListingDetailsViewModel$handleChat$1(this, null), 3, null);
    }

    private final void m1(boolean z11) {
        ListingItemDetails value;
        boolean z12;
        LiveData<ListingItemDetails> Y0 = this.f27171k0.Y0();
        if (Y0 != null && (value = Y0.getValue()) != null) {
            b0<Boolean> b0Var = this.f27170j1;
            if (!this.f27171k0.y1() && value.getStatus() != ItemStatus.QUARANTINE && value.getStatus() != ItemStatus.DRAFT && this.Z0.getValue() == UserType.SELLER && !z11) {
                z12 = true;
            } else {
                z12 = false;
            }
            b0Var.postValue(Boolean.valueOf(z12));
        }
    }

    private final boolean m2(String str, String str2) {
        boolean z11;
        List E0;
        List a12;
        if (str != null && str.length() != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11) {
            E0 = StringsKt__StringsKt.E0(str, new char[]{','}, false, 0, 6, null);
            a12 = CollectionsKt___CollectionsKt.a1(E0);
            if (a12.size() != 1 || !o.d(a12.get(0), str2)) {
                return false;
            }
        }
        return true;
    }

    static /* synthetic */ void n1(NewListingDetailsViewModel newListingDetailsViewModel, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        newListingDetailsViewModel.m1(z11);
    }

    private final void o1() {
        LiveData<ListingItemDetails> Y0 = this.f27171k0.Y0();
        if (Y0 != null && Y0.getValue() != null) {
            this.f27184q1.postValue(Boolean.valueOf(v2()));
        }
    }

    private final void o2(IncrementCallClicksBody incrementCallClicksBody) {
        if (!this.f27171k0.T0().getValue().booleanValue()) {
            BuildersKt__Builders_commonKt.launch$default(this, null, null, new NewListingDetailsViewModel$incrementCallClicks$1(this, incrementCallClicksBody, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p1() {
        ListingItemDetails value;
        boolean z11;
        LiveData<ListingItemDetails> Y0 = this.f27171k0.Y0();
        if (Y0 != null && (value = Y0.getValue()) != null) {
            b0<Boolean> b0Var = this.f27188s1;
            if (value.getStatus() == ItemStatus.DRAFT && !this.f27171k0.x1()) {
                z11 = true;
            } else {
                z11 = false;
            }
            b0Var.postValue(Boolean.valueOf(z11));
        }
    }

    private final void q1() {
        boolean z11;
        ListingItemDetails value = this.f27192u1.getValue();
        if (value != null) {
            b0<Boolean> b0Var = this.f27166f1;
            if (value.getStatus() != ItemStatus.DRAFT && value.getStatus() != ItemStatus.QUARANTINE && value.getType() != ListingType.ARCHIVED) {
                z11 = true;
            } else {
                z11 = false;
            }
            b0Var.postValue(Boolean.valueOf(z11));
        }
    }

    private final void s1() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new NewListingDetailsViewModel$contactUserAction$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t1() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new NewListingDetailsViewModel$contactUserNow$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u1(com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.UserContactMode r32, com.forsale.app.datalayer.network.responses.ListingItemDetails r33, zz.a<? super tg.c> r34) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel.u1(com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.UserContactMode, com.forsale.app.datalayer.network.responses.ListingItemDetails, zz.a):java.lang.Object");
    }

    private final boolean u2() {
        ListingType listingType;
        ListingItemDetails value = this.f27192u1.getValue();
        if (value != null) {
            listingType = value.getType();
        } else {
            listingType = null;
        }
        if (listingType == ListingType.ARCHIVED) {
            return true;
        }
        return false;
    }

    private final boolean v2() {
        ListingArchivedBy listingArchivedBy;
        if (u2()) {
            ListingItemDetails value = this.f27192u1.getValue();
            if (value != null) {
                listingArchivedBy = value.getArchivedBy();
            } else {
                listingArchivedBy = null;
            }
            if (listingArchivedBy == ListingArchivedBy.ADMIN) {
                return true;
            }
        }
        return false;
    }

    private final boolean w2() {
        ListingArchivedBy listingArchivedBy;
        if (u2()) {
            ListingItemDetails value = this.f27192u1.getValue();
            if (value != null) {
                listingArchivedBy = value.getArchivedBy();
            } else {
                listingArchivedBy = null;
            }
            if (listingArchivedBy != ListingArchivedBy.ADMIN) {
                return true;
            }
        }
        return false;
    }

    private final AggregatedAllAnalyticsLogger.AnalyticsPosition x1(ActionType actionType) {
        int i11 = b.f27220a[actionType.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 == 5) {
                            return AggregatedAllAnalyticsLogger.AnalyticsPosition.ACTION_SHEET;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    return AggregatedAllAnalyticsLogger.AnalyticsPosition.ACTION_SHEET;
                }
                return AggregatedAllAnalyticsLogger.AnalyticsPosition.SELLER_ITEM;
            }
            return AggregatedAllAnalyticsLogger.AnalyticsPosition.ACTION_SHEET;
        }
        return AggregatedAllAnalyticsLogger.AnalyticsPosition.SELLER_ITEM;
    }

    public final SharedFlow<p> A1() {
        return this.f27185r0;
    }

    public final SharedFlow<ListingDetailsEntity> B1() {
        return this.f27191u0;
    }

    public final void B2(ListingItemDetails listingDetails) {
        o.i(listingDetails, "listingDetails");
        b3();
        d3(listingDetails);
        c3(TypeExtensionsKt.h0(listingDetails.isFavorite()));
    }

    public final SharedFlow<tg.c> C1() {
        return this.C0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C2(java.lang.String r7, zz.a<? super java.lang.String> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$loadCategoryNameAppendedWithParentName$1
            if (r0 == 0) goto L13
            r0 = r8
            com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$loadCategoryNameAppendedWithParentName$1 r0 = (com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$loadCategoryNameAppendedWithParentName$1) r0
            int r1 = r0.f27277f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27277f = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$loadCategoryNameAppendedWithParentName$1 r0 = new com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$loadCategoryNameAppendedWithParentName$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f27275d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f27277f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r7 = r0.f27274c
            com.forsale.app.datalayer.database.CategoryEntity r7 = (com.forsale.app.datalayer.database.CategoryEntity) r7
            java.lang.Object r1 = r0.f27273b
            com.forsale.app.datalayer.database.CategoryEntity r1 = (com.forsale.app.datalayer.database.CategoryEntity) r1
            java.lang.Object r0 = r0.f27272a
            java.lang.String r0 = (java.lang.String) r0
            kotlin.f.b(r8)
            goto L7c
        L38:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L40:
            java.lang.Object r7 = r0.f27273b
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r2 = r0.f27272a
            com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel r2 = (com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel) r2
            kotlin.f.b(r8)
            goto L5f
        L4c:
            kotlin.f.b(r8)
            com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel r8 = r6.f27171k0
            r0.f27272a = r6
            r0.f27273b = r7
            r0.f27277f = r4
            java.lang.Object r8 = r8.F1(r0)
            if (r8 != r1) goto L5e
            return r1
        L5e:
            r2 = r6
        L5f:
            com.forsale.app.datalayer.database.CategoryEntity r8 = (com.forsale.app.datalayer.database.CategoryEntity) r8
            if (r8 == 0) goto L9b
            com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel r2 = r2.f27171k0
            int r4 = r8.getParentId()
            r0.f27272a = r7
            r0.f27273b = r8
            r0.f27274c = r8
            r0.f27277f = r3
            java.lang.Object r0 = r2.G1(r4, r0)
            if (r0 != r1) goto L78
            return r1
        L78:
            r5 = r0
            r0 = r7
            r7 = r8
            r8 = r5
        L7c:
            com.forsale.app.datalayer.database.CategoryEntity r8 = (com.forsale.app.datalayer.database.CategoryEntity) r8
            if (r8 == 0) goto L9b
            java.lang.String r8 = r8.getName()
            java.lang.String r7 = r7.getName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            r1.append(r0)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            return r7
        L9b:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel.C2(java.lang.String, zz.a):java.lang.Object");
    }

    public final StateFlow<Boolean> D1() {
        return this.S0;
    }

    public final LiveData<CategoryEntity> E1() {
        return this.f27164d1;
    }

    public final void E2() {
        G2();
        n1(this, false, 1, null);
        l1();
        o1();
        q1();
        p1();
        if (this.Z0.getValue() == UserType.SELLER || this.Z0.getValue() == UserType.GUEST) {
            D2();
        }
    }

    public final SharedFlow<p> F1() {
        return this.C1;
    }

    public final String H1() {
        return this.f27181p0.b(G1());
    }

    public final Object H2(zz.a<? super RegionEntity> aVar) {
        return this.f27171k0.J1(aVar);
    }

    public final Object I1(zz.a<? super String> aVar) {
        return this.f27177n0.c().a(aVar);
    }

    public final void I2(AggregatedAllAnalyticsLogger.AdvActionEvents action, String str, boolean z11, boolean z12, boolean z13, AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition, String str2) {
        o.i(action, "action");
        if (this.f27171k0.T0().getValue().booleanValue()) {
            return;
        }
        ListingDetailsViewModel.N1(this.f27171k0, action, z11, z12, z13, analyticsPosition, str2, str, null, null, 384, null);
    }

    public final SharedFlow<ListingDetailsEntity> J1() {
        return this.f27169i1;
    }

    public final z<FavouriteState> K1() {
        return this.V0;
    }

    public final void N2() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new NewListingDetailsViewModel$onBackPressed$1(this, null), 3, null);
    }

    public final ListingItemBrief O1() {
        return this.f27171k0.V0();
    }

    public final void O2() {
        this.f27171k0.B0(AggregatedAllAnalyticsLogger.AnalyticsPosition.ACTION_SHEET, new l<ListingDetailsEntity, p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$onBoostClicked$1

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: NewListingDetailsViewModel.kt */
            @d(c = "com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$onBoostClicked$1$1", f = "NewListingDetailsViewModel.kt", l = {428}, m = "invokeSuspend")
            /* renamed from: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$onBoostClicked$1$1  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super p>, Object> {

                /* renamed from: a  reason: collision with root package name */
                int f27284a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ NewListingDetailsViewModel f27285b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ ListingDetailsEntity f27286c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(NewListingDetailsViewModel newListingDetailsViewModel, ListingDetailsEntity listingDetailsEntity, zz.a<? super AnonymousClass1> aVar) {
                    super(2, aVar);
                    this.f27285b = newListingDetailsViewModel;
                    this.f27286c = listingDetailsEntity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final zz.a<p> create(Object obj, zz.a<?> aVar) {
                    return new AnonymousClass1(this.f27285b, this.f27286c, aVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object f11;
                    MutableSharedFlow mutableSharedFlow;
                    f11 = kotlin.coroutines.intrinsics.b.f();
                    int i11 = this.f27284a;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            f.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        f.b(obj);
                        mutableSharedFlow = this.f27285b.f27189t0;
                        ListingDetailsEntity listingDetailsEntity = this.f27286c;
                        this.f27284a = 1;
                        if (mutableSharedFlow.emit(listingDetailsEntity, this) == f11) {
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

            public final void b(ListingDetailsEntity it2) {
                o.i(it2, "it");
                BuildersKt__Builders_commonKt.launch$default(r0.a(NewListingDetailsViewModel.this), null, null, new AnonymousClass1(NewListingDetailsViewModel.this, it2, null), 3, null);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(ListingDetailsEntity listingDetailsEntity) {
                b(listingDetailsEntity);
                return p.f75480a;
            }
        });
    }

    public final LiveData<rb.a> P1() {
        return this.f27162b1;
    }

    public final void P2(ActionType actionType) {
        o.i(actionType, "actionType");
        Integer num = null;
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new NewListingDetailsViewModel$onCallClicked$1(this, actionType, null), 3, null);
        ListingDetailsViewModel listingDetailsViewModel = this.f27171k0;
        boolean z11 = true;
        if (listingDetailsViewModel.T0().getValue().booleanValue()) {
            z11 = false;
        }
        if (!z11) {
            listingDetailsViewModel = null;
        }
        if (listingDetailsViewModel != null) {
            ListingItemDetails value = this.f27192u1.getValue();
            if (value != null) {
                num = Integer.valueOf(value.getId());
            }
            o2(new IncrementCallClicksBody(String.valueOf(num), AnalyticsType.CALL_ATTEMPTS));
        }
        this.X0 = UserContactMode.CALL_ONLY;
        s1();
    }

    public final LiveData<ListingItemDetails> Q1() {
        return this.f27192u1;
    }

    public final void Q2(ActionType actionType) {
        o.i(actionType, "actionType");
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new NewListingDetailsViewModel$onChatClicked$1(this, actionType, null), 3, null);
    }

    public final ListingDetailsViewModel R1() {
        return this.f27171k0;
    }

    public final void R2() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new NewListingDetailsViewModel$onDeleteClicked$1(this, null), 3, null);
    }

    public final OneShotEventHandler<tg.c> S1() {
        return this.A0;
    }

    public final void S2() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new NewListingDetailsViewModel$onEditClicked$1(this, null), 3, null);
    }

    public final SharedFlow<Integer> T1() {
        return this.f27178n1;
    }

    public final void T2() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new NewListingDetailsViewModel$onFavouriteClicked$1(this, null), 3, null);
    }

    public final OneShotEventHandler<Boolean> U1() {
        return this.A1;
    }

    public final void U2() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new NewListingDetailsViewModel$onReportAbuseClicked$1(this, null), 3, null);
    }

    public final SharedFlow<String> V1() {
        return this.G0;
    }

    public final void V2() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new NewListingDetailsViewModel$onRepostClicked$1(this, null), 3, null);
    }

    public final SharedFlow<com.forsale.app.ui.bottomsheets.listingdetailschat.b> W1() {
        return this.I0;
    }

    public final Object W2() {
        if (o.d(this.f27167g1.getValue(), Boolean.TRUE)) {
            this.f27171k0.R1();
            return p.f75480a;
        }
        return this.f27171k0.I0(new g00.a<p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$onShareClicked$1
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
                NewListingDetailsViewModel.this.R1().R1();
            }
        });
    }

    public final SharedFlow<p> X1() {
        return this.M0;
    }

    public final void X2() {
        this.f27171k0.S1();
    }

    public final OneShotEventHandler<String> Y1() {
        return this.E0;
    }

    public final void Y2(ActionType actionType) {
        o.i(actionType, "actionType");
        Integer num = null;
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new NewListingDetailsViewModel$onWhatsAppClicked$1(this, actionType, null), 3, null);
        ListingDetailsViewModel listingDetailsViewModel = this.f27171k0;
        boolean z11 = true;
        if (listingDetailsViewModel.T0().getValue().booleanValue()) {
            z11 = false;
        }
        if (!z11) {
            listingDetailsViewModel = null;
        }
        if (listingDetailsViewModel != null) {
            ListingItemDetails value = this.f27192u1.getValue();
            if (value != null) {
                num = Integer.valueOf(value.getId());
            }
            o2(new IncrementCallClicksBody(String.valueOf(num), AnalyticsType.WHATSAPP));
        }
        this.X0 = UserContactMode.WHATSAPP_ONLY;
        s1();
    }

    public final OneShotEventHandler<ActionType> a2() {
        return this.f27165e1;
    }

    public final void a3(boolean z11) {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new NewListingDetailsViewModel$setNotificationEnabled$1(this, z11, null), 3, null);
    }

    public final OneShotEventHandler<ListingItemDetails> b2() {
        return this.U0;
    }

    public final SharedFlow<ListingItemDetails> c2() {
        return this.f27197x0;
    }

    public final Flow<SellerListingStatus> d2() {
        return this.f27196w1;
    }

    public final OneShotEventHandler<ListingItemDetails> e2() {
        return this.f27193v0;
    }

    public final SharedFlow<ListingItemDetails> f2() {
        return this.K0;
    }

    public final LiveData<ViewStates> g2() {
        return this.f27200y1;
    }

    public final UserContactMode h2() {
        return this.X0;
    }

    public final LiveData<UserType> i2() {
        return this.Z0;
    }

    public final OneShotEventHandler<tg.c> j2() {
        return this.D0;
    }

    public final void k2() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new NewListingDetailsViewModel$goToPreviewMode$1(this, null), 3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
        if (r5 != true) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n2(boolean r5) {
        /*
            r4 = this;
            androidx.lifecycle.z<java.lang.Boolean> r0 = r4.f27174l1
            androidx.lifecycle.LiveData<com.forsale.app.datalayer.network.responses.ListingItemDetails> r1 = r4.f27192u1
            java.lang.Object r1 = r1.getValue()
            com.forsale.app.datalayer.network.responses.ListingItemDetails r1 = (com.forsale.app.datalayer.network.responses.ListingItemDetails) r1
            r2 = 0
            if (r1 == 0) goto L12
            com.forsale.app.datalayer.network.responses.listingdetails.ItemStatus r1 = r1.getStatus()
            goto L13
        L12:
            r1 = r2
        L13:
            com.forsale.app.datalayer.network.responses.listingdetails.ItemStatus r3 = com.forsale.app.datalayer.network.responses.listingdetails.ItemStatus.QUARANTINE
            if (r1 != r3) goto L37
            androidx.lifecycle.LiveData<com.forsale.app.datalayer.network.responses.ListingItemDetails> r1 = r4.f27192u1
            java.lang.Object r1 = r1.getValue()
            com.forsale.app.datalayer.network.responses.ListingItemDetails r1 = (com.forsale.app.datalayer.network.responses.ListingItemDetails) r1
            if (r1 == 0) goto L25
            com.forsale.app.datalayer.network.responses.listingdetails.ListingType r2 = r1.getType()
        L25:
            com.forsale.app.datalayer.network.responses.listingdetails.ListingType r1 = com.forsale.app.datalayer.network.responses.listingdetails.ListingType.ARCHIVED
            if (r2 == r1) goto L37
            androidx.lifecycle.LiveData<com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$UserType> r1 = r4.Z0
            java.lang.Object r1 = r1.getValue()
            com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$UserType r2 = com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel.UserType.SELLER
            if (r1 != r2) goto L37
            r1 = 1
            if (r5 == r1) goto L37
            goto L38
        L37:
            r1 = 0
        L38:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.setValue(r1)
            r4.m1(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel.n2(boolean):void");
    }

    public final Flow<Boolean> p2() {
        return this.f27198x1;
    }

    public final StateFlow<Boolean> q2() {
        return this.O0;
    }

    public final void r1() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new NewListingDetailsViewModel$checkUserAction$1(this, null), 3, null);
    }

    public final OneShotEventHandler<String> r2() {
        return this.D1;
    }

    public final LiveData<Boolean> s2() {
        return this.f27190t1;
    }

    public final LiveData<Boolean> t2() {
        return this.f27172k1;
    }

    public final void v1() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new NewListingDetailsViewModel$exitPreviewMode$1(this, null), 3, null);
    }

    public final OneShotEventHandler<p> w1() {
        return this.f27187s0;
    }

    public final LiveData<Boolean> x2() {
        return this.f27167g1;
    }

    public final ApplicationResourcesRepository y1() {
        return this.f27179o0;
    }

    public final z<Boolean> y2() {
        return this.f27174l1;
    }

    public final StateFlow<CTAsVisibility> z1() {
        return this.Q0;
    }

    public final StateFlow<Boolean> z2() {
        return this.f27201z0;
    }
}
