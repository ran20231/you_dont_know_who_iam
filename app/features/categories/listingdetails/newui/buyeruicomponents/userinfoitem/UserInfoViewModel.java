package com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.userinfoitem;

import androidx.lifecycle.z;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.RegionsRepository;
import com.forsale.app.datalayer.repositories.TranslationRepository;
import com.forsale.app.features.categories.user.profile.UserProfileData;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.TypeExtensionsKt;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import t9.y0;
import zz.a;
/* compiled from: UserInfoViewModel.kt */
/* loaded from: classes2.dex */
public final class UserInfoViewModel {

    /* renamed from: a  reason: collision with root package name */
    private final CoroutineScope f27580a;

    /* renamed from: b  reason: collision with root package name */
    private final UserProfileData f27581b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f27582c;

    /* renamed from: d  reason: collision with root package name */
    private final int f27583d;

    /* renamed from: e  reason: collision with root package name */
    private final ListingItemDetails f27584e;

    /* renamed from: f  reason: collision with root package name */
    private final TranslationRepository.Translation f27585f;

    /* renamed from: g  reason: collision with root package name */
    private final AggregatedAllAnalyticsLogger f27586g;

    /* renamed from: h  reason: collision with root package name */
    private final ApplicationResourcesRepository f27587h;

    /* renamed from: i  reason: collision with root package name */
    private final RegionsRepository f27588i;

    /* renamed from: j  reason: collision with root package name */
    private final String f27589j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f27590k;

    /* renamed from: l  reason: collision with root package name */
    private final OneShotEventHandler<String> f27591l;

    /* renamed from: m  reason: collision with root package name */
    private final OneShotEventHandler<String> f27592m;

    /* renamed from: n  reason: collision with root package name */
    private final OneShotEventHandler<String> f27593n;

    /* renamed from: o  reason: collision with root package name */
    private final OneShotEventHandler<UserProfileData> f27594o;

    /* renamed from: p  reason: collision with root package name */
    private final z<Boolean> f27595p;

    /* compiled from: UserInfoViewModel.kt */
    @d(c = "com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.userinfoitem.UserInfoViewModel$2", f = "UserInfoViewModel.kt", l = {44}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.userinfoitem.UserInfoViewModel$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    static final class AnonymousClass2 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f27596a;

        /* renamed from: b  reason: collision with root package name */
        int f27597b;

        AnonymousClass2(a<? super AnonymousClass2> aVar) {
            super(2, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final a<wz.p> create(Object obj, a<?> aVar) {
            return new AnonymousClass2(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            String str;
            String str2;
            f11 = b.f();
            int i11 = this.f27597b;
            if (i11 != 0) {
                if (i11 == 1) {
                    str2 = (String) this.f27596a;
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                String f12 = UserInfoViewModel.this.f27581b.f();
                if (f12 != null) {
                    RegionsRepository regionsRepository = UserInfoViewModel.this.f27588i;
                    this.f27596a = f12;
                    this.f27597b = 1;
                    Object regionUtcDiff = regionsRepository.getRegionUtcDiff(this);
                    if (regionUtcDiff == f11) {
                        return f11;
                    }
                    str2 = f12;
                    obj = regionUtcDiff;
                } else {
                    str = null;
                    UserInfoViewModel.this.g().i(str);
                    UserInfoViewModel.this.k().postValue(kotlin.coroutines.jvm.internal.a.a(!TypeExtensionsKt.h0(UserInfoViewModel.this.f27583d)));
                    return wz.p.f75480a;
                }
            }
            str = TypeExtensionsKt.L0(str2, (String) obj);
            UserInfoViewModel.this.g().i(str);
            UserInfoViewModel.this.k().postValue(kotlin.coroutines.jvm.internal.a.a(!TypeExtensionsKt.h0(UserInfoViewModel.this.f27583d)));
            return wz.p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
            return ((AnonymousClass2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    public UserInfoViewModel(CoroutineScope coroutineScope, UserProfileData userProfileData, boolean z11, int i11, ListingItemDetails listingItemDetails, TranslationRepository.Translation translation, AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, ApplicationResourcesRepository resourcesRepository, RegionsRepository regionsRepository, String deviceId, boolean z12) {
        o.i(coroutineScope, "coroutineScope");
        o.i(userProfileData, "userProfileData");
        o.i(resourcesRepository, "resourcesRepository");
        o.i(regionsRepository, "regionsRepository");
        o.i(deviceId, "deviceId");
        this.f27580a = coroutineScope;
        this.f27581b = userProfileData;
        this.f27582c = z11;
        this.f27583d = i11;
        this.f27584e = listingItemDetails;
        this.f27585f = translation;
        this.f27586g = aggregatedAllAnalyticsLogger;
        this.f27587h = resourcesRepository;
        this.f27588i = regionsRepository;
        this.f27589j = deviceId;
        this.f27590k = z12;
        OneShotEventHandler<String> oneShotEventHandler = new OneShotEventHandler<>(null, 0, 3, null);
        this.f27591l = oneShotEventHandler;
        OneShotEventHandler<String> oneShotEventHandler2 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f27592m = oneShotEventHandler2;
        this.f27593n = new OneShotEventHandler<>(null, 0, 3, null);
        this.f27594o = new OneShotEventHandler<>(null, 0, 3, null);
        this.f27595p = new z<>();
        oneShotEventHandler.i(userProfileData.d());
        oneShotEventHandler2.i(TypeExtensionsKt.U0(userProfileData.g(), resourcesRepository.getString(y0.f70716v4, new Object[0])));
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(null), 3, null);
    }

    public static /* synthetic */ void m(UserInfoViewModel userInfoViewModel, AggregatedAllAnalyticsLogger.AdvActionEvents advActionEvents, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        userInfoViewModel.l(advActionEvents, z11, z12);
    }

    public final OneShotEventHandler<String> g() {
        return this.f27593n;
    }

    public final OneShotEventHandler<UserProfileData> h() {
        return this.f27594o;
    }

    public final OneShotEventHandler<String> i() {
        return this.f27591l;
    }

    public final OneShotEventHandler<String> j() {
        return this.f27592m;
    }

    public final z<Boolean> k() {
        return this.f27595p;
    }

    public final void l(AggregatedAllAnalyticsLogger.AdvActionEvents action, boolean z11, boolean z12) {
        o.i(action, "action");
        ListingItemDetails listingItemDetails = this.f27584e;
        if (listingItemDetails != null) {
            BuildersKt__Builders_commonKt.launch$default(this.f27580a, null, null, new UserInfoViewModel$logAnalytics$1$1(this, action, listingItemDetails, z11, z12, null), 3, null);
        }
    }

    public final void n() {
        if (!this.f27582c && o.d(this.f27595p.getValue(), Boolean.TRUE) && this.f27590k) {
            m(this, AggregatedAllAnalyticsLogger.AdvActionEvents.ADV_ACTION_USER_PROFILE_CLICKED, false, false, 6, null);
            wz.p pVar = wz.p.f75480a;
            this.f27594o.i(this.f27581b);
        }
    }

    public /* synthetic */ UserInfoViewModel(CoroutineScope coroutineScope, UserProfileData userProfileData, boolean z11, int i11, ListingItemDetails listingItemDetails, TranslationRepository.Translation translation, AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, ApplicationResourcesRepository applicationResourcesRepository, RegionsRepository regionsRepository, String str, boolean z12, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineScope, userProfileData, z11, i11, listingItemDetails, translation, aggregatedAllAnalyticsLogger, applicationResourcesRepository, regionsRepository, str, (i12 & 1024) != 0 ? true : z12);
    }
}
