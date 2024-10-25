package com.forsale.app.features.categories.user.profile;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.b0;
import androidx.lifecycle.r0;
import androidx.lifecycle.z;
import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.database.MasterDataMiscModel;
import com.forsale.app.datalayer.database.RegionEntity;
import com.forsale.app.datalayer.database.UserProfileBriefData;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.network.services.ListingsService;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.datalayer.repositories.FollowRepository;
import com.forsale.app.datalayer.repositories.ListingsRepository;
import com.forsale.app.datalayer.repositories.MasterDataRepository;
import com.forsale.app.datalayer.repositories.RegionsRepository;
import com.forsale.app.datalayer.repositories.SessionRepository;
import com.forsale.app.datalayer.repositories.TranslationRepository;
import com.forsale.app.utils.OneShotEventHandler;
import g00.p;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import t9.y0;
/* compiled from: UserProfileViewModel.kt */
/* loaded from: classes2.dex */
public final class UserProfileViewModel extends BaseViewModel {
    private final LiveData<ListingItemDetails> A0;
    private final b0<List<zc.b>> B0;
    private final LiveData<List<zc.b>> C0;
    private final OneShotEventHandler<UserProfileData> D0;
    private final z<FollowingStates> E0;
    private final OneShotEventHandler<Integer> F0;

    /* renamed from: k0  reason: collision with root package name */
    private final SharedUserProfileViewModel f31174k0;

    /* renamed from: l0  reason: collision with root package name */
    private final ApplicationResourcesRepository f31175l0;

    /* renamed from: m0  reason: collision with root package name */
    private final SessionRepository f31176m0;

    /* renamed from: n0  reason: collision with root package name */
    private final FollowRepository f31177n0;

    /* renamed from: o0  reason: collision with root package name */
    private final ListingsService f31178o0;

    /* renamed from: p0  reason: collision with root package name */
    private final TranslationRepository f31179p0;

    /* renamed from: q0  reason: collision with root package name */
    private final ListingsRepository f31180q0;

    /* renamed from: r0  reason: collision with root package name */
    private final RegionsRepository f31181r0;

    /* renamed from: s0  reason: collision with root package name */
    private final MasterDataRepository f31182s0;

    /* renamed from: t0  reason: collision with root package name */
    private final jj.b f31183t0;

    /* renamed from: u0  reason: collision with root package name */
    private final nc.a f31184u0;

    /* renamed from: v0  reason: collision with root package name */
    private final b0<RegionEntity> f31185v0;

    /* renamed from: w0  reason: collision with root package name */
    private final b0<MasterDataMiscModel> f31186w0;

    /* renamed from: x0  reason: collision with root package name */
    private final b0<UserProfileBriefData> f31187x0;

    /* renamed from: y0  reason: collision with root package name */
    private final LiveData<UserProfileBriefData> f31188y0;

    /* renamed from: z0  reason: collision with root package name */
    private final b0<ListingItemDetails> f31189z0;

    /* compiled from: UserProfileViewModel.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.user.profile.UserProfileViewModel$2", f = "UserProfileViewModel.kt", l = {l8.a.f62268e, 95}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.user.profile.UserProfileViewModel$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    static final class AnonymousClass2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f31190a;

        AnonymousClass2(zz.a<? super AnonymousClass2> aVar) {
            super(2, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass2(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            f11 = kotlin.coroutines.intrinsics.b.f();
            int i11 = this.f31190a;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        kotlin.f.b(obj);
                        UserProfileViewModel.this.f31186w0.postValue((MasterDataMiscModel) obj);
                        return wz.p.f75480a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.f.b(obj);
            } else {
                kotlin.f.b(obj);
                RegionsRepository regionsRepository = UserProfileViewModel.this.f31181r0;
                this.f31190a = 1;
                obj = regionsRepository.getCurrentRegion(this);
                if (obj == f11) {
                    return f11;
                }
            }
            UserProfileViewModel.this.f31185v0.postValue((RegionEntity) obj);
            MasterDataRepository masterDataRepository = UserProfileViewModel.this.f31182s0;
            this.f31190a = 2;
            obj = masterDataRepository.getMasterDataMiscModel(this);
            if (obj == f11) {
                return f11;
            }
            UserProfileViewModel.this.f31186w0.postValue((MasterDataMiscModel) obj);
            return wz.p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UserProfileViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class FollowingStates {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ FollowingStates[] $VALUES;
        public static final FollowingStates FOLLOWING = new FollowingStates("FOLLOWING", 0);
        public static final FollowingStates NOT_FOLLOWING = new FollowingStates("NOT_FOLLOWING", 1);
        public static final FollowingStates PENDING = new FollowingStates("PENDING", 2);
        public static final FollowingStates NONE = new FollowingStates("NONE", 3);

        private static final /* synthetic */ FollowingStates[] $values() {
            return new FollowingStates[]{FOLLOWING, NOT_FOLLOWING, PENDING, NONE};
        }

        static {
            FollowingStates[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private FollowingStates(String str, int i11) {
        }

        public static a00.a<FollowingStates> getEntries() {
            return $ENTRIES;
        }

        public static FollowingStates valueOf(String str) {
            return (FollowingStates) Enum.valueOf(FollowingStates.class, str);
        }

        public static FollowingStates[] values() {
            return (FollowingStates[]) $VALUES.clone();
        }
    }

    /* compiled from: UserProfileViewModel.kt */
    /* loaded from: classes2.dex */
    public interface a {
        UserProfileViewModel a(SharedUserProfileViewModel sharedUserProfileViewModel);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileViewModel(SharedUserProfileViewModel sharedViewModel, ApplicationResourcesRepository resourcesRepository, SessionRepository session, FollowRepository followRepository, ListingsService listingsService, TranslationRepository translationRepository, ListingsRepository listingsRepository, RegionsRepository regionRepository, MasterDataRepository masterDataRepository, jj.b prefs, nc.a getSwipeableListInteractor, BaseRepository baseRepository) {
        super(baseRepository);
        Integer v02;
        o.i(sharedViewModel, "sharedViewModel");
        o.i(resourcesRepository, "resourcesRepository");
        o.i(session, "session");
        o.i(followRepository, "followRepository");
        o.i(listingsService, "listingsService");
        o.i(translationRepository, "translationRepository");
        o.i(listingsRepository, "listingsRepository");
        o.i(regionRepository, "regionRepository");
        o.i(masterDataRepository, "masterDataRepository");
        o.i(prefs, "prefs");
        o.i(getSwipeableListInteractor, "getSwipeableListInteractor");
        o.i(baseRepository, "baseRepository");
        this.f31174k0 = sharedViewModel;
        this.f31175l0 = resourcesRepository;
        this.f31176m0 = session;
        this.f31177n0 = followRepository;
        this.f31178o0 = listingsService;
        this.f31179p0 = translationRepository;
        this.f31180q0 = listingsRepository;
        this.f31181r0 = regionRepository;
        this.f31182s0 = masterDataRepository;
        this.f31183t0 = prefs;
        this.f31184u0 = getSwipeableListInteractor;
        this.f31185v0 = new b0<>();
        this.f31186w0 = new b0<>();
        b0<UserProfileBriefData> b0Var = new b0<>();
        this.f31187x0 = b0Var;
        this.f31188y0 = b0Var;
        b0<ListingItemDetails> b0Var2 = new b0<>();
        this.f31189z0 = b0Var2;
        this.A0 = b0Var2;
        b0<List<zc.b>> b0Var3 = new b0<>();
        this.B0 = b0Var3;
        this.C0 = b0Var3;
        this.D0 = new OneShotEventHandler<>(null, 0, 3, null);
        z<FollowingStates> zVar = new z<>();
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new UserProfileViewModel$followingState$1$1(this, zVar, null), 3, null);
        this.E0 = zVar;
        this.F0 = new OneShotEventHandler<>(null, 0, 3, null);
        String e11 = sharedViewModel.y0().e();
        e11 = e11 == null ? sharedViewModel.y0().h() : e11;
        Integer a11 = sharedViewModel.y0().a();
        String g11 = sharedViewModel.y0().g();
        b0Var.setValue(new UserProfileBriefData(e11, a11, g11 == null ? resourcesRepository.getString(y0.f70716v4, new Object[0]) : g11, sharedViewModel.y0().d()));
        if (b0Var.getValue() != null) {
            O0(sharedViewModel.y0().h(), sharedViewModel.y0().a());
        }
        if (sharedViewModel.v0() != null && ((v02 = sharedViewModel.v0()) == null || v02.intValue() != -1)) {
            J0(sharedViewModel.v0().intValue());
        }
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new AnonymousClass2(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I0(boolean z11, boolean z12) {
        if (z11 && z12) {
            this.E0.postValue(FollowingStates.NOT_FOLLOWING);
        } else if (z11) {
            this.E0.postValue(FollowingStates.NONE);
        } else if (z12) {
            this.E0.postValue(FollowingStates.FOLLOWING);
        } else if (!z12) {
            this.E0.postValue(FollowingStates.NOT_FOLLOWING);
        }
    }

    private final void J0(int i11) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new UserProfileViewModel$getListingDetails$1(this, i11, null), 3, null);
    }

    private final void O0(String str, Integer num) {
        BuildersKt__Builders_commonKt.launch$default(this, new b(CoroutineExceptionHandler.Key), null, new UserProfileViewModel$getUserListings$2(this, str, num, null), 2, null);
    }

    public final OneShotEventHandler<Integer> K0() {
        return this.F0;
    }

    public final OneShotEventHandler<UserProfileData> L0() {
        return this.D0;
    }

    public final LiveData<UserProfileBriefData> M0() {
        return this.f31188y0;
    }

    public final LiveData<List<zc.b>> N0() {
        return this.C0;
    }

    public final void P0() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new UserProfileViewModel$onReportAbuseClicked$1(this, null), 3, null);
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.coroutines.a implements CoroutineExceptionHandler {
        public b(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
        }
    }
}
