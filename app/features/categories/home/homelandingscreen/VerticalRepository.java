package com.forsale.app.features.categories.home.homelandingscreen;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.b0;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.network.responses.ListingsResponse;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.CategoriesRepositories;
import com.forsale.app.datalayer.repositories.GAMRepository;
import com.forsale.app.datalayer.repositories.ListingsRepository;
import com.forsale.app.features.powerpins.ListingsScreenType;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import com.forsale.app.utils.analytics.HomeVisitedReleaseName;
import com.forsale.app.utils.analytics.HomeVisitedSources;
import com.forsale.app.utils.gam.ContentUrlType;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: VerticalRepository.kt */
/* loaded from: classes2.dex */
public final class VerticalRepository {

    /* renamed from: h  reason: collision with root package name */
    public static final a f23924h = new a(null);

    /* renamed from: i  reason: collision with root package name */
    public static final int f23925i = 8;

    /* renamed from: a  reason: collision with root package name */
    private final CategoriesRepositories f23926a;

    /* renamed from: b  reason: collision with root package name */
    private final ApplicationResourcesRepository f23927b;

    /* renamed from: c  reason: collision with root package name */
    private final ListingsRepository f23928c;

    /* renamed from: d  reason: collision with root package name */
    private final AggregatedAllAnalyticsLogger f23929d;

    /* renamed from: e  reason: collision with root package name */
    private final GAMRepository f23930e;

    /* renamed from: f  reason: collision with root package name */
    private final b0<Boolean> f23931f;

    /* renamed from: g  reason: collision with root package name */
    private final LiveData<Boolean> f23932g;

    /* compiled from: VerticalRepository.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: VerticalRepository.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f23933a;

        static {
            int[] iArr = new int[ListingsScreenType.values().length];
            try {
                iArr[ListingsScreenType.HOT_ZONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ListingsScreenType.NEW_ARRIVALS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f23933a = iArr;
        }
    }

    public VerticalRepository(CategoriesRepositories categoriesRepositories, ApplicationResourcesRepository appRepo, ListingsRepository listingsRepository, AggregatedAllAnalyticsLogger analyticsLogger, GAMRepository gamRepository) {
        o.i(categoriesRepositories, "categoriesRepositories");
        o.i(appRepo, "appRepo");
        o.i(listingsRepository, "listingsRepository");
        o.i(analyticsLogger, "analyticsLogger");
        o.i(gamRepository, "gamRepository");
        this.f23926a = categoriesRepositories;
        this.f23927b = appRepo;
        this.f23928c = listingsRepository;
        this.f23929d = analyticsLogger;
        this.f23930e = gamRepository;
        b0<Boolean> b0Var = new b0<>(Boolean.TRUE);
        this.f23931f = b0Var;
        this.f23932g = b0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r5, zz.a<? super java.lang.Integer> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.forsale.app.features.categories.home.homelandingscreen.VerticalRepository$getCategoryShufflingFactor$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.features.categories.home.homelandingscreen.VerticalRepository$getCategoryShufflingFactor$1 r0 = (com.forsale.app.features.categories.home.homelandingscreen.VerticalRepository$getCategoryShufflingFactor$1) r0
            int r1 = r0.f23936c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23936c = r1
            goto L18
        L13:
            com.forsale.app.features.categories.home.homelandingscreen.VerticalRepository$getCategoryShufflingFactor$1 r0 = new com.forsale.app.features.categories.home.homelandingscreen.VerticalRepository$getCategoryShufflingFactor$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f23934a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f23936c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.f.b(r6)
            com.forsale.app.datalayer.repositories.CategoriesRepositories r6 = r4.f23926a
            r0.f23936c = r3
            java.lang.Object r6 = r6.getCategoryDistrictByCategoryId(r5, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            com.forsale.app.datalayer.database.CategoryDistrict r6 = (com.forsale.app.datalayer.database.CategoryDistrict) r6
            if (r6 == 0) goto L4c
            int r5 = r6.getPinningShuffleFactor()
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.a.d(r5)
            goto L4d
        L4c:
            r5 = 0
        L4d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.homelandingscreen.VerticalRepository.a(int, zz.a):java.lang.Object");
    }

    public final Object b(int i11, ListingsScreenType listingsScreenType, zz.a<? super ListingsResponse> aVar) {
        return ListingsRepository.getNormalListings$default(this.f23928c, 1, listingsScreenType, kotlin.coroutines.jvm.internal.a.d(i11), null, null, null, null, null, null, null, null, aVar, 2040, null);
    }

    public final Object c(int i11, zz.a<? super ListingsResponse> aVar) {
        return ListingsRepository.getLatestListings$default(this.f23928c, 1, ListingsScreenType.NEW_ARRIVALS, kotlin.coroutines.jvm.internal.a.d(i11), null, null, null, aVar, 56, null);
    }

    public final Object d(int i11, zz.a<? super List<CategoryEntity>> aVar) {
        return this.f23926a.getCategoriesWithParentId(i11, aVar);
    }

    public final Object e(CategoryEntity categoryEntity, zz.a<? super AdManagerAdRequest> aVar) {
        Object f11;
        if (categoryEntity != null) {
            Object buildForInterstitialForCategory = this.f23930e.buildForInterstitialForCategory(categoryEntity.getId(), new fj.a(ContentUrlType.HOME, kotlin.coroutines.jvm.internal.a.d(categoryEntity.getId()), categoryEntity.getCategoryTreeNames(), categoryEntity.getName()), aVar);
            f11 = kotlin.coroutines.intrinsics.b.f();
            if (buildForInterstitialForCategory == f11) {
                return buildForInterstitialForCategory;
            }
            return (AdManagerAdRequest) buildForInterstitialForCategory;
        }
        return null;
    }

    public final void f(ListingsScreenType screenType, int i11, Integer num, Integer num2) {
        int i12;
        Integer num3;
        o.i(screenType, "screenType");
        int i13 = i11 + 1;
        if (num2 != null) {
            i12 = num2.intValue();
        } else {
            i12 = 0;
        }
        if (num != null && i13 == num.intValue()) {
            i13 -= i12;
        }
        int i14 = i13;
        if (num != null) {
            num3 = Integer.valueOf(num.intValue() - i12);
        } else {
            num3 = null;
        }
        if (num3 != null) {
            num3.intValue();
            int i15 = b.f23933a[screenType.ordinal()];
            if (i15 != 1) {
                if (i15 == 2) {
                    AggregatedAllAnalyticsLoggerKt.T(this.f23929d, AggregatedAllAnalyticsLogger.CustomEvents.NEW_ARRIVALS_SCROLLED, i14, num3.intValue(), false, false, 24, null);
                    return;
                }
                return;
            }
            AggregatedAllAnalyticsLoggerKt.T(this.f23929d, AggregatedAllAnalyticsLogger.CustomEvents.HOT_ZONE_SCROLLED, i14, num3.intValue(), false, false, 24, null);
        }
    }

    public final void g() {
        AggregatedAllAnalyticsLoggerKt.V(this.f23929d, false, false, 3, null);
    }

    public final Object h(CategoryEntity categoryEntity, HomeVisitedSources homeVisitedSources, zz.a<? super p> aVar) {
        Object f11;
        Object Q = AggregatedAllAnalyticsLoggerKt.Q(this.f23929d, HomeVisitedReleaseName.VERTICAL_PAGE, categoryEntity, homeVisitedSources, aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (Q == f11) {
            return Q;
        }
        return p.f75480a;
    }
}
