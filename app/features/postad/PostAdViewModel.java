package com.forsale.app.features.postad;

import android.webkit.URLUtil;
import androidx.databinding.ObservableBoolean;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.lifecycle.z;
import androidx.work.BackoffPolicy;
import androidx.work.WorkInfo;
import androidx.work.k;
import androidx.work.q;
import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.database.CategoryRuleSet;
import com.forsale.app.datalayer.database.DistrictEntity;
import com.forsale.app.datalayer.database.RegionEntity;
import com.forsale.app.datalayer.database.UserEntity;
import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.datalayer.network.entities.PostListingIntention;
import com.forsale.app.datalayer.network.responses.Addon;
import com.forsale.app.datalayer.network.responses.Bundle;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.datalayer.repositories.CategoriesRepositories;
import com.forsale.app.datalayer.repositories.DistrictsRepository;
import com.forsale.app.datalayer.repositories.ExtraAttributeRawRepository;
import com.forsale.app.datalayer.repositories.ListingDetailsEntityRepository;
import com.forsale.app.datalayer.repositories.MyListingsRepository;
import com.forsale.app.datalayer.repositories.PostAdAnonymousRepository;
import com.forsale.app.datalayer.repositories.ProhibitedKeywordsRepository;
import com.forsale.app.features.postad.PostAdViewModel;
import com.forsale.app.features.postad.addons.calculatorNew.CalculatorViewModel;
import com.forsale.app.features.postad.addons.calculatorNew.PublishAdvViewModel;
import com.forsale.app.features.postad.extraattributes.PostAdAttributesViewModel;
import com.forsale.app.features.postad.location.LocationLevels;
import com.forsale.app.features.postad.media.MediaStates;
import com.forsale.app.features.postad.media.MediaTypes;
import com.forsale.app.models.CalculatorEntity;
import com.forsale.app.ui.bottomsheets.alertbottomsheet.items.models.AlertModel;
import com.forsale.app.utils.TypeExtensionsKt;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import com.forsale.app.utils.analytics.AnalyticsListingsSource;
import com.forsale.app.utils.analytics.CreateEditAdvActionType;
import com.forsale.app.utils.analytics.ErrorReason;
import com.forsale.app.utils.analytics.PLFCloseTarget;
import com.forsale.app.utils.analytics.PLFMediaTypes;
import com.forsale.app.utils.analytics.PLFScreenTypes;
import com.forsale.app.utils.analytics.PLFSource;
import com.forsale.app.utils.analytics.l;
import com.forsale.app.utils.analytics.logger.AnalyticsParamBuilder;
import com.forsale.app.utils.analytics.logger.YesNo;
import com.forsale.app.utils.analytics.logger.events.CustomParameterValue;
import com.forsale.app.utils.analytics.logger.events.PLFParameterName;
import com.forsale.app.utils.facades.user.UserProfileInteractor;
import com.forsale.app.utils.v;
import com.forsale.app.utils.validation.PhoneDetectorKt;
import com.forsale.app.workmangers.ClearListingCachedWorkManger;
import com.github.mikephil.charting.utils.Utils;
import g00.l;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.r;
import kotlin.collections.s;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.k;
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
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import t9.r0;
import t9.y0;
import wz.p;
/* compiled from: PostAdViewModel.kt */
/* loaded from: classes2.dex */
public final class PostAdViewModel extends BaseViewModel {
    private final PostListingIntention A0;
    private final z<Boolean> A1;
    private final PLFSource B0;
    private final z<Boolean> B1;
    private final LiveData<List<String>> C0;
    private final List<PostAdAttributesViewModel.a> C1;
    private final MutableSharedFlow<p> D0;
    private final MutableSharedFlow<p> D1;
    private final SharedFlow<p> E0;
    private final SharedFlow<p> E1;
    private final MutableSharedFlow<p> F0;
    private final wz.h F1;
    private final SharedFlow<p> G0;
    private final b0<PostListingIntention> G1;
    private final MutableSharedFlow<p> H0;
    private final MutableSharedFlow<p> H1;
    private final SharedFlow<p> I0;
    private final SharedFlow<p> I1;
    private final MutableSharedFlow<p> J0;
    private final b0<String> J1;
    private final SharedFlow<p> K0;
    private final LiveData<String> K1;
    private final MutableSharedFlow<p> L0;
    private final b0<Integer> L1;
    private final SharedFlow<p> M0;
    private final LiveData<Boolean> M1;
    private final MutableSharedFlow<p> N0;
    private final MutableSharedFlow<Integer> N1;
    private final SharedFlow<p> O0;
    private final SharedFlow<Integer> O1;
    private final MutableSharedFlow<p> P0;
    private final MutableSharedFlow<p> P1;
    private final SharedFlow<p> Q0;
    private final SharedFlow<p> Q1;
    private final MutableSharedFlow<p> R0;
    private final z<Boolean> R1;
    private final SharedFlow<p> S0;
    private final LiveData<Boolean> S1;
    private final MutableSharedFlow<p> T0;
    private final b0<Boolean> T1;
    private final SharedFlow<p> U0;
    private final b0<Boolean> U1;
    private final MutableSharedFlow<p> V0;
    private final b0<Boolean> V1;
    private final SharedFlow<p> W0;
    private final b0<Boolean> W1;
    private final b0<RegionEntity> X0;
    private final MutableSharedFlow<p> X1;
    private final MutableSharedFlow<Boolean> Y0;
    private final SharedFlow<p> Y1;
    private final SharedFlow<Boolean> Z0;
    private final MutableStateFlow<com.forsale.app.utils.b0> Z1;

    /* renamed from: a1  reason: collision with root package name */
    private final b0<Boolean> f33920a1;

    /* renamed from: a2  reason: collision with root package name */
    private final StateFlow<com.forsale.app.utils.b0> f33921a2;

    /* renamed from: b1  reason: collision with root package name */
    private final LiveData<Boolean> f33922b1;

    /* renamed from: b2  reason: collision with root package name */
    private final MutableSharedFlow<Boolean> f33923b2;

    /* renamed from: c1  reason: collision with root package name */
    private final b0<CategoryRuleSet.RuleSet> f33924c1;

    /* renamed from: c2  reason: collision with root package name */
    private final SharedFlow<Boolean> f33925c2;

    /* renamed from: d1  reason: collision with root package name */
    private final LiveData<CategoryRuleSet.RuleSet> f33926d1;

    /* renamed from: d2  reason: collision with root package name */
    private final MutableSharedFlow<Boolean> f33927d2;

    /* renamed from: e1  reason: collision with root package name */
    private final b0<MediaStates> f33928e1;

    /* renamed from: e2  reason: collision with root package name */
    private final SharedFlow<Boolean> f33929e2;

    /* renamed from: f1  reason: collision with root package name */
    private final b0<MediaStates> f33930f1;

    /* renamed from: f2  reason: collision with root package name */
    private final MutableStateFlow<CalculatorEntity> f33931f2;

    /* renamed from: g1  reason: collision with root package name */
    private final b0<Boolean> f33932g1;

    /* renamed from: g2  reason: collision with root package name */
    private final StateFlow<CalculatorEntity> f33933g2;

    /* renamed from: h1  reason: collision with root package name */
    private final MutableSharedFlow<Boolean> f33934h1;

    /* renamed from: h2  reason: collision with root package name */
    private final MutableStateFlow<qf.c> f33935h2;

    /* renamed from: i1  reason: collision with root package name */
    private final SharedFlow<Boolean> f33936i1;

    /* renamed from: i2  reason: collision with root package name */
    private final StateFlow<qf.c> f33937i2;

    /* renamed from: j1  reason: collision with root package name */
    private final b0<DistrictEntity> f33938j1;

    /* renamed from: j2  reason: collision with root package name */
    private final CalculatorViewModel f33939j2;

    /* renamed from: k0  reason: collision with root package name */
    private final CategoriesRepositories f33940k0;

    /* renamed from: k1  reason: collision with root package name */
    private final b0<DistrictEntity> f33941k1;

    /* renamed from: k2  reason: collision with root package name */
    private final PublishAdvViewModel f33942k2;

    /* renamed from: l0  reason: collision with root package name */
    private final ExtraAttributeRawRepository f33943l0;

    /* renamed from: l1  reason: collision with root package name */
    private final b0<b> f33944l1;

    /* renamed from: l2  reason: collision with root package name */
    private final Flow<UserEntity> f33945l2;

    /* renamed from: m0  reason: collision with root package name */
    private final PostAdRepository f33946m0;

    /* renamed from: m1  reason: collision with root package name */
    private final LiveData<RepostNavigation> f33947m1;

    /* renamed from: m2  reason: collision with root package name */
    private final StateFlow<String> f33948m2;

    /* renamed from: n0  reason: collision with root package name */
    private final PostAdAnonymousRepository f33949n0;

    /* renamed from: n1  reason: collision with root package name */
    public v.a f33950n1;

    /* renamed from: n2  reason: collision with root package name */
    private final MutableStateFlow<UserEntity> f33951n2;

    /* renamed from: o0  reason: collision with root package name */
    private final q f33952o0;

    /* renamed from: o1  reason: collision with root package name */
    private v f33953o1;

    /* renamed from: o2  reason: collision with root package name */
    private final StateFlow<UserEntity> f33954o2;

    /* renamed from: p0  reason: collision with root package name */
    private final ProhibitedKeywordsRepository f33955p0;

    /* renamed from: p1  reason: collision with root package name */
    private final b0<Integer> f33956p1;

    /* renamed from: p2  reason: collision with root package name */
    private c0<WorkInfo> f33957p2;

    /* renamed from: q0  reason: collision with root package name */
    private final DistrictsRepository f33958q0;

    /* renamed from: q1  reason: collision with root package name */
    private final LiveData<Integer> f33959q1;

    /* renamed from: q2  reason: collision with root package name */
    private LiveData<WorkInfo> f33960q2;

    /* renamed from: r0  reason: collision with root package name */
    private final ListingDetailsEntityRepository f33961r0;

    /* renamed from: r1  reason: collision with root package name */
    private final b0<ListingDetailsEntity> f33962r1;

    /* renamed from: r2  reason: collision with root package name */
    private final wz.h f33963r2;

    /* renamed from: s0  reason: collision with root package name */
    private final MyListingsRepository f33964s0;

    /* renamed from: s1  reason: collision with root package name */
    private final boolean f33965s1;

    /* renamed from: t0  reason: collision with root package name */
    private final com.forsale.app.utils.analytics.g f33966t0;

    /* renamed from: t1  reason: collision with root package name */
    private final b0<Boolean> f33967t1;

    /* renamed from: u0  reason: collision with root package name */
    private final jj.b f33968u0;

    /* renamed from: u1  reason: collision with root package name */
    private final Flow<ListingDetailsEntity> f33969u1;

    /* renamed from: v0  reason: collision with root package name */
    private final UserProfileInteractor f33970v0;

    /* renamed from: v1  reason: collision with root package name */
    private final MutableSharedFlow<p> f33971v1;

    /* renamed from: w0  reason: collision with root package name */
    private final we.a f33972w0;

    /* renamed from: w1  reason: collision with root package name */
    private final SharedFlow<p> f33973w1;

    /* renamed from: x0  reason: collision with root package name */
    private final pe.a f33974x0;

    /* renamed from: x1  reason: collision with root package name */
    private final ObservableBoolean f33975x1;

    /* renamed from: y0  reason: collision with root package name */
    private final pe.b f33976y0;

    /* renamed from: y1  reason: collision with root package name */
    private final z<Boolean> f33977y1;

    /* renamed from: z0  reason: collision with root package name */
    private final ListingDetailsEntity f33978z0;

    /* renamed from: z1  reason: collision with root package name */
    private final LiveData<Boolean> f33979z1;

    /* compiled from: PostAdViewModel.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.PostAdViewModel$1", f = "PostAdViewModel.kt", l = {345}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.PostAdViewModel$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static final class AnonymousClass1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f33985a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PostAdViewModel.kt */
        /* renamed from: com.forsale.app.features.postad.PostAdViewModel$1$a */
        /* loaded from: classes2.dex */
        public static final class a implements FlowCollector<ListingDetailsEntity> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ PostAdViewModel f33987a;

            a(PostAdViewModel postAdViewModel) {
                this.f33987a = postAdViewModel;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object emit(ListingDetailsEntity listingDetailsEntity, zz.a<? super p> aVar) {
                this.f33987a.l3().setValue(kotlin.coroutines.jvm.internal.a.a(true));
                this.f33987a.p2().setValue(listingDetailsEntity);
                this.f33987a.y4(true);
                return p.f75480a;
            }
        }

        AnonymousClass1(zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            f11 = kotlin.coroutines.intrinsics.b.f();
            int i11 = this.f33985a;
            if (i11 != 0) {
                if (i11 == 1) {
                    kotlin.f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.f.b(obj);
                Flow flow = PostAdViewModel.this.f33969u1;
                if (flow != null) {
                    a aVar = new a(PostAdViewModel.this);
                    this.f33985a = 1;
                    if (flow.collect(aVar, this) == f11) {
                        return f11;
                    }
                }
            }
            return p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(p.f75480a);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PostAdViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class RepostNavigation {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ RepostNavigation[] $VALUES;
        public static final RepostNavigation NONE = new RepostNavigation("NONE", 0);
        public static final RepostNavigation BUNDLES = new RepostNavigation("BUNDLES", 1);
        public static final RepostNavigation PLANS = new RepostNavigation("PLANS", 2);

        private static final /* synthetic */ RepostNavigation[] $values() {
            return new RepostNavigation[]{NONE, BUNDLES, PLANS};
        }

        static {
            RepostNavigation[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private RepostNavigation(String str, int i11) {
        }

        public static a00.a<RepostNavigation> getEntries() {
            return $ENTRIES;
        }

        public static RepostNavigation valueOf(String str) {
            return (RepostNavigation) Enum.valueOf(RepostNavigation.class, str);
        }

        public static RepostNavigation[] values() {
            return (RepostNavigation[]) $VALUES.clone();
        }
    }

    /* compiled from: PostAdViewModel.kt */
    /* loaded from: classes2.dex */
    public interface a {
        PostAdViewModel a(ListingDetailsEntity listingDetailsEntity, PostListingIntention postListingIntention, PLFSource pLFSource);
    }

    /* compiled from: PostAdViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f34000a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f34001b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f34002c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f34003d;

        public b(boolean z11, boolean z12, boolean z13, boolean z14) {
            this.f34000a = z11;
            this.f34001b = z12;
            this.f34002c = z13;
            this.f34003d = z14;
        }

        public final boolean a() {
            return this.f34001b;
        }

        public final boolean b() {
            return this.f34003d;
        }

        public final boolean c() {
            return this.f34000a;
        }

        public final boolean d() {
            return this.f34002c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f34000a == bVar.f34000a && this.f34001b == bVar.f34001b && this.f34002c == bVar.f34002c && this.f34003d == bVar.f34003d) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v8 */
        /* JADX WARN: Type inference failed for: r0v9 */
        /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
        /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
        public int hashCode() {
            boolean z11 = this.f34000a;
            int i11 = 1;
            ?? r02 = z11;
            if (z11) {
                r02 = 1;
            }
            int i12 = r02 * 31;
            ?? r22 = this.f34001b;
            int i13 = r22;
            if (r22 != 0) {
                i13 = 1;
            }
            int i14 = (i12 + i13) * 31;
            ?? r23 = this.f34002c;
            int i15 = r23;
            if (r23 != 0) {
                i15 = 1;
            }
            int i16 = (i14 + i15) * 31;
            boolean z12 = this.f34003d;
            if (!z12) {
                i11 = z12 ? 1 : 0;
            }
            return i16 + i11;
        }

        public String toString() {
            boolean z11 = this.f34000a;
            boolean z12 = this.f34001b;
            boolean z13 = this.f34002c;
            boolean z14 = this.f34003d;
            return "PostAdNavigationRules(hasMediaScreen=" + z11 + ", hasAttributesScreen=" + z12 + ", hasPlansScreen=" + z13 + ", hasBundlesScreen=" + z14 + ")";
        }
    }

    /* compiled from: PostAdViewModel.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f34004a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f34005b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f34006c;

        /* renamed from: d  reason: collision with root package name */
        public static final /* synthetic */ int[] f34007d;

        static {
            int[] iArr = new int[PostListingIntention.values().length];
            try {
                iArr[PostListingIntention.NON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PostListingIntention.NEW_LISTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PostListingIntention.FULL_EDIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PostListingIntention.RE_POST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PostListingIntention.BOOST.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PostListingIntention.BOOST_LISTING_ABOUT_TO_EXPIRE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f34004a = iArr;
            int[] iArr2 = new int[PostAdScreens.values().length];
            try {
                iArr2[PostAdScreens.MAIN_INFO_SCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[PostAdScreens.MEDIA_SCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[PostAdScreens.ATTRIBUTES_SCREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[PostAdScreens.PLANS_SCREEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[PostAdScreens.EXTRA_INFO_SCREEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[PostAdScreens.LOCATION_SCREEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[PostAdScreens.ADDONS_SCREEN.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[PostAdScreens.CALCULATOR_SCREEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[PostAdScreens.BUNDLES_SCREEN.ordinal()] = 9;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[PostAdScreens.CHOOSE_CATEGORY_SCREEN.ordinal()] = 10;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[PostAdScreens.BILLING_PACKAGES_SCREEN.ordinal()] = 11;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[PostAdScreens.PAYMENT_HISTORY_SCREEN.ordinal()] = 12;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[PostAdScreens.PAYMENT_HISTORY_DETAILS_SCREEN.ordinal()] = 13;
            } catch (NoSuchFieldError unused19) {
            }
            f34005b = iArr2;
            int[] iArr3 = new int[MediaTypes.values().length];
            try {
                iArr3[MediaTypes.IMAGES.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[MediaTypes.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            f34006c = iArr3;
            int[] iArr4 = new int[WorkInfo.State.values().length];
            try {
                iArr4[WorkInfo.State.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr4[WorkInfo.State.SUCCEEDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr4[WorkInfo.State.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr4[WorkInfo.State.ENQUEUED.ordinal()] = 4;
            } catch (NoSuchFieldError unused25) {
            }
            f34007d = iArr4;
        }
    }

    /* compiled from: PostAdViewModel.kt */
    /* loaded from: classes2.dex */
    static final class d implements c0, k {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f34020a;

        d(l function) {
            o.i(function, "function");
            this.f34020a = function;
        }

        @Override // kotlin.jvm.internal.k
        public final wz.e<?> c() {
            return this.f34020a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof c0) || !(obj instanceof k)) {
                return false;
            }
            return o.d(c(), ((k) obj).c());
        }

        public final int hashCode() {
            return c().hashCode();
        }

        @Override // androidx.lifecycle.c0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f34020a.invoke(obj);
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.coroutines.a implements CoroutineExceptionHandler {
        public e(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            dj.i.f54287a.invoke().f(th2);
        }
    }

    /* compiled from: PostAdViewModel.kt */
    /* loaded from: classes2.dex */
    static final class f implements c0<WorkInfo> {
        f() {
        }

        @Override // androidx.lifecycle.c0
        /* renamed from: a */
        public final void onChanged(WorkInfo workInfo) {
            if (workInfo != null) {
                PostAdViewModel postAdViewModel = PostAdViewModel.this;
                postAdViewModel.g3(workInfo, postAdViewModel.U3(workInfo));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdViewModel(CategoriesRepositories categoryRepo, ExtraAttributeRawRepository extraAttributeRawRepository, PostAdRepository postAdRepository, PostAdAnonymousRepository postAdAnonymousRepository, q workManger, ProhibitedKeywordsRepository prohibitedWordsRepo, DistrictsRepository districtsRepository, ListingDetailsEntityRepository listingDetailsEntityRepository, MyListingsRepository myListingsRepository, com.forsale.app.utils.analytics.g aggregatedAnalyticsLogger, com.forsale.app.features.postad.a calculatorInteractors, i publishAdvInteractors, com.forsale.app.features.postad.e paymentMethodInteractors, jj.b prefs, UserProfileInteractor userProfileInteractor, we.a businessTypeInteractor, BaseRepository baseRepository, pe.a mediaAddonsInteractor, pe.b waitingApprovalInteractor, ListingDetailsEntity listingDetailsEntity, PostListingIntention intention, PLFSource pLFSource) {
        super(baseRepository);
        wz.h a11;
        wz.h a12;
        o.i(categoryRepo, "categoryRepo");
        o.i(extraAttributeRawRepository, "extraAttributeRawRepository");
        o.i(postAdRepository, "postAdRepository");
        o.i(postAdAnonymousRepository, "postAdAnonymousRepository");
        o.i(workManger, "workManger");
        o.i(prohibitedWordsRepo, "prohibitedWordsRepo");
        o.i(districtsRepository, "districtsRepository");
        o.i(listingDetailsEntityRepository, "listingDetailsEntityRepository");
        o.i(myListingsRepository, "myListingsRepository");
        o.i(aggregatedAnalyticsLogger, "aggregatedAnalyticsLogger");
        o.i(calculatorInteractors, "calculatorInteractors");
        o.i(publishAdvInteractors, "publishAdvInteractors");
        o.i(paymentMethodInteractors, "paymentMethodInteractors");
        o.i(prefs, "prefs");
        o.i(userProfileInteractor, "userProfileInteractor");
        o.i(businessTypeInteractor, "businessTypeInteractor");
        o.i(baseRepository, "baseRepository");
        o.i(mediaAddonsInteractor, "mediaAddonsInteractor");
        o.i(waitingApprovalInteractor, "waitingApprovalInteractor");
        o.i(intention, "intention");
        this.f33940k0 = categoryRepo;
        this.f33943l0 = extraAttributeRawRepository;
        this.f33946m0 = postAdRepository;
        this.f33949n0 = postAdAnonymousRepository;
        this.f33952o0 = workManger;
        this.f33955p0 = prohibitedWordsRepo;
        this.f33958q0 = districtsRepository;
        this.f33961r0 = listingDetailsEntityRepository;
        this.f33964s0 = myListingsRepository;
        this.f33966t0 = aggregatedAnalyticsLogger;
        this.f33968u0 = prefs;
        this.f33970v0 = userProfileInteractor;
        this.f33972w0 = businessTypeInteractor;
        this.f33974x0 = mediaAddonsInteractor;
        this.f33976y0 = waitingApprovalInteractor;
        ListingDetailsEntity listingDetailsEntity2 = listingDetailsEntity;
        this.f33978z0 = listingDetailsEntity2;
        this.A0 = intention;
        this.B0 = pLFSource;
        this.C0 = new b0(prohibitedWordsRepo.getProhibtedKeyWordsLiveData());
        MutableSharedFlow<p> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.D0 = MutableSharedFlow$default;
        this.E0 = FlowKt.asSharedFlow(MutableSharedFlow$default);
        MutableSharedFlow<p> MutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.F0 = MutableSharedFlow$default2;
        this.G0 = FlowKt.asSharedFlow(MutableSharedFlow$default2);
        MutableSharedFlow<p> MutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.H0 = MutableSharedFlow$default3;
        this.I0 = FlowKt.asSharedFlow(MutableSharedFlow$default3);
        MutableSharedFlow<p> MutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.J0 = MutableSharedFlow$default4;
        this.K0 = FlowKt.asSharedFlow(MutableSharedFlow$default4);
        MutableSharedFlow<p> MutableSharedFlow$default5 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.L0 = MutableSharedFlow$default5;
        this.M0 = FlowKt.asSharedFlow(MutableSharedFlow$default5);
        MutableSharedFlow<p> MutableSharedFlow$default6 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.N0 = MutableSharedFlow$default6;
        this.O0 = FlowKt.asSharedFlow(MutableSharedFlow$default6);
        MutableSharedFlow<p> MutableSharedFlow$default7 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.P0 = MutableSharedFlow$default7;
        this.Q0 = FlowKt.asSharedFlow(MutableSharedFlow$default7);
        MutableSharedFlow<p> MutableSharedFlow$default8 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.R0 = MutableSharedFlow$default8;
        this.S0 = FlowKt.asSharedFlow(MutableSharedFlow$default8);
        MutableSharedFlow<p> MutableSharedFlow$default9 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.T0 = MutableSharedFlow$default9;
        this.U0 = FlowKt.asSharedFlow(MutableSharedFlow$default9);
        MutableSharedFlow<p> MutableSharedFlow$default10 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.V0 = MutableSharedFlow$default10;
        this.W0 = FlowKt.asSharedFlow(MutableSharedFlow$default10);
        this.X0 = new b0<>();
        MutableSharedFlow<Boolean> MutableSharedFlow$default11 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.Y0 = MutableSharedFlow$default11;
        this.Z0 = FlowKt.asSharedFlow(MutableSharedFlow$default11);
        b0<Boolean> b0Var = new b0<>();
        this.f33920a1 = b0Var;
        this.f33922b1 = b0Var;
        b0<CategoryRuleSet.RuleSet> b0Var2 = new b0<>();
        this.f33924c1 = b0Var2;
        this.f33926d1 = b0Var2;
        b0<MediaStates> b0Var3 = new b0<>();
        MediaStates mediaStates = MediaStates.INITIAL;
        b0Var3.postValue(mediaStates);
        this.f33928e1 = b0Var3;
        b0<MediaStates> b0Var4 = new b0<>();
        b0Var4.postValue(mediaStates);
        this.f33930f1 = b0Var4;
        Boolean bool = Boolean.TRUE;
        this.f33932g1 = new b0<>(bool);
        MutableSharedFlow<Boolean> MutableSharedFlow$default12 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f33934h1 = MutableSharedFlow$default12;
        this.f33936i1 = FlowKt.asSharedFlow(MutableSharedFlow$default12);
        this.f33938j1 = new b0<>();
        this.f33941k1 = new b0<>();
        b0<b> b0Var5 = new b0<>();
        this.f33944l1 = b0Var5;
        this.f33947m1 = Transformations.b(b0Var5, new l<b, RepostNavigation>() { // from class: com.forsale.app.features.postad.PostAdViewModel$navigateRepost$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // g00.l
            /* renamed from: b */
            public final PostAdViewModel.RepostNavigation invoke(PostAdViewModel.b bVar) {
                if (PostAdViewModel.this.k2() == PostListingIntention.RE_POST) {
                    boolean z11 = false;
                    if (bVar != null && bVar.b()) {
                        z11 = true;
                    }
                    if (z11) {
                        return PostAdViewModel.RepostNavigation.BUNDLES;
                    }
                    return PostAdViewModel.RepostNavigation.PLANS;
                }
                return PostAdViewModel.RepostNavigation.NONE;
            }
        });
        b0<Integer> b0Var6 = new b0<>(100);
        this.f33956p1 = b0Var6;
        this.f33959q1 = b0Var6;
        b0<ListingDetailsEntity> b0Var7 = new b0<>();
        b0Var7.setValue(Boolean.valueOf(listingDetailsEntity2 != null).booleanValue() ? listingDetailsEntity2 : null);
        this.f33962r1 = b0Var7;
        boolean isEditMode = myListingsRepository.isEditMode(intention == null ? PostListingIntention.NON : intention);
        this.f33965s1 = isEditMode;
        this.f33967t1 = new b0<>(bool);
        this.f33969u1 = !isEditMode ? listingDetailsEntityRepository.getUserListingFlow() : null;
        MutableSharedFlow<p> MutableSharedFlow$default13 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f33971v1 = MutableSharedFlow$default13;
        this.f33973w1 = FlowKt.asSharedFlow(MutableSharedFlow$default13);
        this.f33975x1 = new ObservableBoolean(true);
        final z<Boolean> zVar = new z<>();
        zVar.b(b0Var2, new d(new l<CategoryRuleSet.RuleSet, p>() { // from class: com.forsale.app.features.postad.PostAdViewModel$_isDistrictEnabled$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Code restructure failed: missing block: B:51:0x008d, code lost:
                if (r8 != false) goto L54;
             */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x0096 A[ADDED_TO_REGION] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void b(com.forsale.app.datalayer.database.CategoryRuleSet.RuleSet r8) {
                /*
                    r7 = this;
                    if (r8 == 0) goto La9
                    com.forsale.app.datalayer.database.CategoryRuleSet$LocationSettings r0 = r8.getLocationSettings()
                    r1 = 1
                    r2 = 0
                    if (r0 == 0) goto L50
                    java.util.List r0 = r0.getLevels()
                    if (r0 == 0) goto L50
                    java.lang.Iterable r0 = (java.lang.Iterable) r0
                    boolean r3 = r0 instanceof java.util.Collection
                    if (r3 == 0) goto L20
                    r3 = r0
                    java.util.Collection r3 = (java.util.Collection) r3
                    boolean r3 = r3.isEmpty()
                    if (r3 == 0) goto L20
                    goto L50
                L20:
                    java.util.Iterator r0 = r0.iterator()
                    r3 = r2
                L25:
                    boolean r4 = r0.hasNext()
                    if (r4 == 0) goto L51
                    java.lang.Object r4 = r0.next()
                    com.forsale.app.datalayer.database.CategoryRuleSet$Level r4 = (com.forsale.app.datalayer.database.CategoryRuleSet.Level) r4
                    int r5 = r4.getLevel()
                    com.forsale.app.features.postad.location.LocationLevels r6 = com.forsale.app.features.postad.location.LocationLevels.DISTRICT
                    int r6 = r6.getLevel()
                    if (r5 == r6) goto L45
                    boolean r4 = r4.getEnabled()
                    if (r4 == 0) goto L45
                    r4 = r1
                    goto L46
                L45:
                    r4 = r2
                L46:
                    if (r4 == 0) goto L25
                    int r3 = r3 + 1
                    if (r3 >= 0) goto L25
                    kotlin.collections.p.w()
                    goto L25
                L50:
                    r3 = r2
                L51:
                    if (r3 <= 0) goto L55
                    r0 = r1
                    goto L56
                L55:
                    r0 = r2
                L56:
                    com.forsale.app.datalayer.database.CategoryRuleSet$LocationSettings r8 = r8.getLocationSettings()
                    if (r8 == 0) goto L91
                    com.forsale.app.datalayer.database.CategoryRuleSet$LocationExtraInfo r3 = r8.getLandmarks()
                    if (r3 == 0) goto L6a
                    boolean r3 = r3.getEnabled()
                    if (r3 != r1) goto L6a
                    r3 = r1
                    goto L6b
                L6a:
                    r3 = r2
                L6b:
                    if (r3 != 0) goto L8f
                    com.forsale.app.datalayer.database.CategoryRuleSet$LocationExtraInfo r3 = r8.getStreet()
                    if (r3 == 0) goto L7b
                    boolean r3 = r3.getEnabled()
                    if (r3 != r1) goto L7b
                    r3 = r1
                    goto L7c
                L7b:
                    r3 = r2
                L7c:
                    if (r3 != 0) goto L8f
                    com.forsale.app.datalayer.database.CategoryRuleSet$LocationExtraInfo r8 = r8.getMap()
                    if (r8 == 0) goto L8c
                    boolean r8 = r8.getEnabled()
                    if (r8 != r1) goto L8c
                    r8 = r1
                    goto L8d
                L8c:
                    r8 = r2
                L8d:
                    if (r8 == 0) goto L91
                L8f:
                    r8 = r1
                    goto L92
                L91:
                    r8 = r2
                L92:
                    androidx.lifecycle.z<java.lang.Boolean> r3 = r1
                    if (r8 != 0) goto La2
                    if (r0 != 0) goto La2
                    com.forsale.app.features.postad.PostAdViewModel r8 = r2
                    boolean r8 = r8.q3()
                    if (r8 != 0) goto La1
                    goto La2
                La1:
                    r1 = r2
                La2:
                    java.lang.Boolean r8 = java.lang.Boolean.valueOf(r1)
                    r3.setValue(r8)
                La9:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.PostAdViewModel$_isDistrictEnabled$1$1.b(com.forsale.app.datalayer.database.CategoryRuleSet$RuleSet):void");
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(CategoryRuleSet.RuleSet ruleSet) {
                b(ruleSet);
                return p.f75480a;
            }
        }));
        this.f33977y1 = zVar;
        this.f33979z1 = zVar;
        final z<Boolean> zVar2 = new z<>();
        zVar2.b(b0Var2, new d(new l<CategoryRuleSet.RuleSet, p>() { // from class: com.forsale.app.features.postad.PostAdViewModel$isDistrictVisible$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:
                if (r2 != false) goto L25;
             */
            /* JADX WARN: Removed duplicated region for block: B:37:0x005a  */
            /* JADX WARN: Removed duplicated region for block: B:52:0x0089  */
            /* JADX WARN: Removed duplicated region for block: B:64:0x00a6 A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:71:0x0073 A[SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void b(com.forsale.app.datalayer.database.CategoryRuleSet.RuleSet r7) {
                /*
                    r6 = this;
                    r0 = 1
                    r1 = 0
                    if (r7 == 0) goto L3f
                    com.forsale.app.datalayer.database.CategoryRuleSet$LocationSettings r2 = r7.getLocationSettings()
                    if (r2 == 0) goto L3f
                    com.forsale.app.datalayer.database.CategoryRuleSet$LocationExtraInfo r3 = r2.getLandmarks()
                    if (r3 == 0) goto L18
                    boolean r3 = r3.getEnabled()
                    if (r3 != r0) goto L18
                    r3 = r0
                    goto L19
                L18:
                    r3 = r1
                L19:
                    if (r3 != 0) goto L3d
                    com.forsale.app.datalayer.database.CategoryRuleSet$LocationExtraInfo r3 = r2.getStreet()
                    if (r3 == 0) goto L29
                    boolean r3 = r3.getEnabled()
                    if (r3 != r0) goto L29
                    r3 = r0
                    goto L2a
                L29:
                    r3 = r1
                L2a:
                    if (r3 != 0) goto L3d
                    com.forsale.app.datalayer.database.CategoryRuleSet$LocationExtraInfo r2 = r2.getMap()
                    if (r2 == 0) goto L3a
                    boolean r2 = r2.getEnabled()
                    if (r2 != r0) goto L3a
                    r2 = r0
                    goto L3b
                L3a:
                    r2 = r1
                L3b:
                    if (r2 == 0) goto L3f
                L3d:
                    r2 = r0
                    goto L40
                L3f:
                    r2 = r1
                L40:
                    if (r7 == 0) goto L80
                    com.forsale.app.datalayer.database.CategoryRuleSet$LocationSettings r7 = r7.getLocationSettings()
                    if (r7 == 0) goto L80
                    java.util.List r7 = r7.getLevels()
                    if (r7 == 0) goto L80
                    java.lang.Iterable r7 = (java.lang.Iterable) r7
                    java.util.Iterator r7 = r7.iterator()
                L54:
                    boolean r3 = r7.hasNext()
                    if (r3 == 0) goto L73
                    java.lang.Object r3 = r7.next()
                    r4 = r3
                    com.forsale.app.datalayer.database.CategoryRuleSet$Level r4 = (com.forsale.app.datalayer.database.CategoryRuleSet.Level) r4
                    int r4 = r4.getLevel()
                    com.forsale.app.features.postad.location.LocationLevels r5 = com.forsale.app.features.postad.location.LocationLevels.DISTRICT
                    int r5 = r5.getLevel()
                    if (r4 != r5) goto L6f
                    r4 = r0
                    goto L70
                L6f:
                    r4 = r1
                L70:
                    if (r4 == 0) goto L54
                    goto L74
                L73:
                    r3 = 0
                L74:
                    com.forsale.app.datalayer.database.CategoryRuleSet$Level r3 = (com.forsale.app.datalayer.database.CategoryRuleSet.Level) r3
                    if (r3 == 0) goto L80
                    boolean r7 = r3.getEnabled()
                    if (r7 != r0) goto L80
                    r7 = r0
                    goto L81
                L80:
                    r7 = r1
                L81:
                    com.forsale.app.features.postad.PostAdViewModel r3 = com.forsale.app.features.postad.PostAdViewModel.this
                    boolean r3 = r3.q3()
                    if (r3 == 0) goto La1
                    com.forsale.app.features.postad.PostAdViewModel r3 = com.forsale.app.features.postad.PostAdViewModel.this
                    com.forsale.app.datalayer.network.entities.ListingDetailsEntity r3 = r3.n2()
                    if (r3 == 0) goto L9f
                    java.lang.Integer r3 = r3.getAllowEditOnDistrict()
                    if (r3 != 0) goto L98
                    goto L9f
                L98:
                    int r3 = r3.intValue()
                    if (r3 != r0) goto L9f
                    goto La1
                L9f:
                    r3 = r1
                    goto La2
                La1:
                    r3 = r0
                La2:
                    androidx.lifecycle.z<java.lang.Boolean> r4 = r2
                    if (r2 != 0) goto La8
                    if (r7 == 0) goto Lab
                La8:
                    if (r3 == 0) goto Lab
                    goto Lac
                Lab:
                    r0 = r1
                Lac:
                    java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
                    r4.setValue(r7)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.PostAdViewModel$isDistrictVisible$1$1.b(com.forsale.app.datalayer.database.CategoryRuleSet$RuleSet):void");
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(CategoryRuleSet.RuleSet ruleSet) {
                b(ruleSet);
                return p.f75480a;
            }
        }));
        this.A1 = zVar2;
        final z<Boolean> zVar3 = new z<>();
        zVar3.b(b0Var2, new d(new l<CategoryRuleSet.RuleSet, p>() { // from class: com.forsale.app.features.postad.PostAdViewModel$isDistrictRequired$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(CategoryRuleSet.RuleSet ruleSet) {
                CategoryRuleSet.LocationSettings locationSettings;
                List<CategoryRuleSet.Level> levels;
                Object obj;
                boolean z11;
                z<Boolean> zVar4 = zVar3;
                boolean z12 = false;
                if (ruleSet != null && (locationSettings = ruleSet.getLocationSettings()) != null && (levels = locationSettings.getLevels()) != null) {
                    Iterator<T> it2 = levels.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj = it2.next();
                            if (((CategoryRuleSet.Level) obj).getLevel() == LocationLevels.DISTRICT.getLevel()) {
                                z11 = true;
                                continue;
                            } else {
                                z11 = false;
                                continue;
                            }
                            if (z11) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    CategoryRuleSet.Level level = (CategoryRuleSet.Level) obj;
                    if (level != null && level.getRequired()) {
                        z12 = true;
                    }
                }
                zVar4.setValue(Boolean.valueOf(z12));
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(CategoryRuleSet.RuleSet ruleSet) {
                b(ruleSet);
                return p.f75480a;
            }
        }));
        this.B1 = zVar3;
        this.C1 = new ArrayList();
        MutableSharedFlow<p> MutableSharedFlow$default14 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.D1 = MutableSharedFlow$default14;
        this.E1 = FlowKt.asSharedFlow(MutableSharedFlow$default14);
        a11 = kotlin.d.a(new g00.a<AnalyticsListingsSource>() { // from class: com.forsale.app.features.postad.PostAdViewModel$listingSource$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final AnalyticsListingsSource invoke() {
                if (PostAdViewModel.this.q3()) {
                    return AnalyticsListingsSource.EDIT_LISTING;
                }
                return AnalyticsListingsSource.POST_LISTING;
            }
        });
        this.F1 = a11;
        this.G1 = new b0<>(intention);
        MutableSharedFlow<p> MutableSharedFlow$default15 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.H1 = MutableSharedFlow$default15;
        this.I1 = FlowKt.asSharedFlow(MutableSharedFlow$default15);
        b0<String> b0Var8 = new b0<>();
        this.J1 = b0Var8;
        this.K1 = b0Var8;
        b0<Integer> b0Var9 = new b0<>();
        this.L1 = b0Var9;
        this.M1 = Transformations.a(Transformations.b(b0Var9, new l<Integer, Boolean>() { // from class: com.forsale.app.features.postad.PostAdViewModel$menuItemsVisibility$1
            @Override // g00.l
            /* renamed from: b */
            public final Boolean invoke(Integer num) {
                boolean z11;
                int i11 = r0.f69832a2;
                if (num != null && num.intValue() == i11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            }
        }));
        MutableSharedFlow<Integer> MutableSharedFlow$default16 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.N1 = MutableSharedFlow$default16;
        this.O1 = MutableSharedFlow$default16;
        MutableSharedFlow<p> MutableSharedFlow$default17 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.P1 = MutableSharedFlow$default17;
        this.Q1 = FlowKt.asSharedFlow(MutableSharedFlow$default17);
        final z<Boolean> zVar4 = new z<>();
        zVar4.b(b0Var9, new d(new l<Integer, p>() { // from class: com.forsale.app.features.postad.PostAdViewModel$_isBackVisible$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(Integer num) {
                boolean z11;
                boolean k32;
                if (num != null) {
                    z<Boolean> zVar5 = zVar4;
                    if (num.intValue() != r0.F6) {
                        k32 = this.k3();
                        if (k32) {
                            z11 = true;
                            zVar5.postValue(Boolean.valueOf(z11));
                        }
                    }
                    z11 = false;
                    zVar5.postValue(Boolean.valueOf(z11));
                }
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(Integer num) {
                b(num);
                return p.f75480a;
            }
        }));
        this.R1 = zVar4;
        this.S1 = zVar4;
        b0<Boolean> b0Var10 = new b0<>(bool);
        this.T1 = b0Var10;
        this.U1 = b0Var10;
        b0<Boolean> b0Var11 = new b0<>(bool);
        this.V1 = b0Var11;
        this.W1 = b0Var11;
        MutableSharedFlow<p> MutableSharedFlow$default18 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.X1 = MutableSharedFlow$default18;
        this.Y1 = FlowKt.asSharedFlow(MutableSharedFlow$default18);
        MutableStateFlow<com.forsale.app.utils.b0> MutableStateFlow = StateFlowKt.MutableStateFlow(new com.forsale.app.utils.b0(y0.V4, new Object[0]));
        this.Z1 = MutableStateFlow;
        this.f33921a2 = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<Boolean> MutableSharedFlow$default19 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f33923b2 = MutableSharedFlow$default19;
        this.f33925c2 = FlowKt.asSharedFlow(MutableSharedFlow$default19);
        MutableSharedFlow<Boolean> MutableSharedFlow$default20 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f33927d2 = MutableSharedFlow$default20;
        this.f33929e2 = FlowKt.asSharedFlow(MutableSharedFlow$default20);
        MutableStateFlow<CalculatorEntity> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.f33931f2 = MutableStateFlow2;
        this.f33933g2 = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<qf.c> MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this.f33935h2 = MutableStateFlow3;
        this.f33937i2 = FlowKt.asStateFlow(MutableStateFlow3);
        this.f33939j2 = new CalculatorViewModel(calculatorInteractors, this, this);
        this.f33942k2 = new PublishAdvViewModel(this, aggregatedAnalyticsLogger, A(), postAdAnonymousRepository, r(), publishAdvInteractors, paymentMethodInteractors, q(), this);
        final Flow<UserEntity> j11 = userProfileInteractor.j();
        this.f33945l2 = j11;
        this.f33948m2 = FlowKt.stateIn(new Flow<String>() { // from class: com.forsale.app.features.postad.PostAdViewModel$special$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.forsale.app.features.postad.PostAdViewModel$special$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ FlowCollector f33981a;

                /* compiled from: Emitters.kt */
                @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.PostAdViewModel$special$$inlined$map$1$2", f = "PostAdViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.forsale.app.features.postad.PostAdViewModel$special$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f33982a;

                    /* renamed from: b  reason: collision with root package name */
                    int f33983b;

                    public AnonymousClass1(zz.a aVar) {
                        super(aVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f33982a = obj;
                        this.f33983b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f33981a = flowCollector;
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
                        boolean r0 = r6 instanceof com.forsale.app.features.postad.PostAdViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.forsale.app.features.postad.PostAdViewModel$special$$inlined$map$1$2$1 r0 = (com.forsale.app.features.postad.PostAdViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f33983b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f33983b = r1
                        goto L18
                    L13:
                        com.forsale.app.features.postad.PostAdViewModel$special$$inlined$map$1$2$1 r0 = new com.forsale.app.features.postad.PostAdViewModel$special$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f33982a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.f33983b
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
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.f33981a
                        com.forsale.app.datalayer.database.UserEntity r5 = (com.forsale.app.datalayer.database.UserEntity) r5
                        if (r5 == 0) goto L3f
                        java.lang.String r5 = r5.getPhone()
                        goto L40
                    L3f:
                        r5 = 0
                    L40:
                        r0.f33983b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L49
                        return r1
                    L49:
                        wz.p r5 = wz.p.f75480a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.PostAdViewModel$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zz.a):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super String> flowCollector, zz.a aVar) {
                Object f11;
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), aVar);
                f11 = kotlin.coroutines.intrinsics.b.f();
                if (collect == f11) {
                    return collect;
                }
                return p.f75480a;
            }
        }, androidx.lifecycle.r0.a(this), SharingStarted.Companion.getEagerly(), null);
        MutableStateFlow<UserEntity> MutableStateFlow4 = StateFlowKt.MutableStateFlow(null);
        this.f33951n2 = MutableStateFlow4;
        this.f33954o2 = FlowKt.asStateFlow(MutableStateFlow4);
        P4();
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.r0.a(this), null, null, new AnonymousClass1(null), 3, null);
        O2();
        if (isEditMode) {
            z4(this, false, 1, null);
        }
        this.f33957p2 = new f();
        a12 = kotlin.d.a(new g00.a<ArrayList<String>>() { // from class: com.forsale.app.features.postad.PostAdViewModel$failedImagesNames$2
            @Override // g00.a
            /* renamed from: b */
            public final ArrayList<String> invoke() {
                return new ArrayList<>();
            }
        });
        this.f33963r2 = a12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A3(wi.c cVar, final String str, final UserEntity userEntity) {
        Integer userId;
        q().a(new wi.c[]{cVar}, new l<AnalyticsParamBuilder, p>() { // from class: com.forsale.app.features.postad.PostAdViewModel$logAddListingVisited$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(AnalyticsParamBuilder log) {
                String phone;
                o.i(log, "$this$log");
                log.e(PLFParameterName.PLATFORM, CustomParameterValue.ANDROID.getValue());
                UserEntity userEntity2 = UserEntity.this;
                if (userEntity2 != null && (phone = userEntity2.getPhone()) != null) {
                    log.e(PLFParameterName.PHONE_NUMBER, phone);
                }
                log.e(PLFParameterName.DEVICE_ID, str);
                String l11 = this.r().o().l();
                if (l11 != null) {
                    log.e(PLFParameterName.AMPLITUDE_USER_ID, l11);
                }
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(AnalyticsParamBuilder analyticsParamBuilder) {
                b(analyticsParamBuilder);
                return p.f75480a;
            }
        });
        if (userEntity != null && (userId = userEntity.getUserId()) != null) {
            q().b(String.valueOf(userId.intValue()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B3(wi.c cVar, final String str, final UserEntity userEntity, final ListingDetailsEntity listingDetailsEntity) {
        Integer userId;
        q().a(new wi.c[]{cVar}, new l<AnalyticsParamBuilder, p>() { // from class: com.forsale.app.features.postad.PostAdViewModel$logAddonConfirmPayment$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(AnalyticsParamBuilder log) {
                String phone;
                Integer userId2;
                double d11;
                String fullPathReversed;
                List<Addon> c11;
                int y11;
                o.i(log, "$this$log");
                CalculatorEntity value = PostAdViewModel.this.a2().getValue();
                if (value != null && (c11 = value.c()) != null) {
                    List<Addon> list = c11;
                    y11 = s.y(list, 10);
                    ArrayList arrayList = new ArrayList(y11);
                    for (Addon addon : list) {
                        arrayList.add(addon.getId());
                    }
                    log.f(PLFParameterName.ADD_ONS_IDS, arrayList);
                }
                ListingDetailsEntity listingDetailsEntity2 = listingDetailsEntity;
                if (listingDetailsEntity2 != null) {
                    PostAdViewModel postAdViewModel = PostAdViewModel.this;
                    CategoryEntity category = listingDetailsEntity2.getCategory();
                    if (category != null) {
                        log.e(PLFParameterName.CATEGORY_NAME, category.getSystemName());
                        log.d(PLFParameterName.CATEGORY_ID, category.getId());
                    }
                    DistrictEntity value2 = postAdViewModel.m2().getValue();
                    if (value2 != null && (fullPathReversed = value2.getFullPathReversed()) != null) {
                        log.e(PLFParameterName.LOCATION_NAME, fullPathReversed);
                    }
                    log.e(PLFParameterName.HIDE_MY_NUMBER, AggregatedAllAnalyticsLogger.YesNo.Companion.b(listingDetailsEntity2.getHideMyNumber()));
                    PLFParameterName pLFParameterName = PLFParameterName.LISTING_PRICE;
                    Double price = listingDetailsEntity2.getPrice();
                    if (price != null) {
                        d11 = price.doubleValue();
                    } else {
                        d11 = Utils.DOUBLE_EPSILON;
                    }
                    log.c(pLFParameterName, d11);
                }
                log.e(PLFParameterName.PLATFORM, CustomParameterValue.ANDROID.getValue());
                String l11 = PostAdViewModel.this.r().o().l();
                if (l11 != null) {
                    log.e(PLFParameterName.AMPLITUDE_USER_ID, l11);
                }
                UserEntity userEntity2 = userEntity;
                if (userEntity2 != null && (userId2 = userEntity2.getUserId()) != null) {
                    PostAdViewModel.this.q().b(String.valueOf(userId2.intValue()));
                }
                UserEntity userEntity3 = userEntity;
                if (userEntity3 != null && (phone = userEntity3.getPhone()) != null) {
                    log.e(PLFParameterName.PHONE_NUMBER, phone);
                }
                log.e(PLFParameterName.DEVICE_ID, str);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(AnalyticsParamBuilder analyticsParamBuilder) {
                b(analyticsParamBuilder);
                return p.f75480a;
            }
        });
        if (userEntity != null && (userId = userEntity.getUserId()) != null) {
            q().b(String.valueOf(userId.intValue()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object D1(PostAdViewModel postAdViewModel, g00.a aVar, l lVar, zz.a aVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = new g00.a<p>() { // from class: com.forsale.app.features.postad.PostAdViewModel$checkUserState$2
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // g00.a
                public /* bridge */ /* synthetic */ p invoke() {
                    invoke2();
                    return p.f75480a;
                }
            };
        }
        if ((i11 & 2) != 0) {
            lVar = new PostAdViewModel$checkUserState$3(null);
        }
        return postAdViewModel.C1(aVar, lVar, aVar2);
    }

    public static /* synthetic */ void D3(PostAdViewModel postAdViewModel, AggregatedAllAnalyticsLogger.AdvActionEvents advActionEvents, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        if ((i11 & 8) != 0) {
            str3 = null;
        }
        postAdViewModel.C3(advActionEvents, str, str2, str3);
    }

    private final String E2() {
        String videoUrl;
        ListingDetailsEntity n22 = n2();
        if (n22 == null || (videoUrl = n22.getVideoUrl()) == null || !(!URLUtil.isNetworkUrl(videoUrl))) {
            return null;
        }
        return videoUrl;
    }

    private final void E3(String str, String str2) {
        D3(this, AggregatedAllAnalyticsLogger.AdvActionEvents.ALERT_TRY_AGAIN_CLICKED, str, null, str2, 4, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
        r0 = kotlin.collections.CollectionsKt___CollectionsKt.a1(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void F1() {
        /*
            r3 = this;
            java.util.List r0 = r3.D2()
            if (r0 == 0) goto L5e
            com.forsale.app.datalayer.network.entities.ListingDetailsEntity r1 = r3.n2()
            if (r1 == 0) goto L18
            java.util.ArrayList r1 = r1.getImageUrls()
            if (r1 == 0) goto L18
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            r1.removeAll(r2)
        L18:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.p.y(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L29:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = com.forsale.app.utils.TypeExtensionsKt.V0(r2)
            r1.add(r2)
            goto L29
        L3d:
            com.forsale.app.datalayer.network.entities.ListingDetailsEntity r0 = r3.n2()
            if (r0 == 0) goto L5e
            java.util.List r0 = r0.getImages()
            if (r0 == 0) goto L5e
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.List r0 = kotlin.collections.p.a1(r0)
            if (r0 == 0) goto L5e
            r0.removeAll(r1)
            com.forsale.app.datalayer.network.entities.ListingDetailsEntity r1 = r3.n2()
            if (r1 != 0) goto L5b
            goto L5e
        L5b:
            r1.setImages(r0)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.PostAdViewModel.F1():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.forsale.app.utils.b0 F2(PostAdScreens postAdScreens, com.forsale.app.utils.b0 b0Var) {
        switch (c.f34005b[postAdScreens.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return new com.forsale.app.utils.b0(y0.V4, new Object[0]);
            case 6:
                return new com.forsale.app.utils.b0(y0.f70363a3, new Object[0]);
            case 7:
            case 8:
            case 9:
                return b0Var;
            case 10:
            case 11:
            case 12:
            case 13:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    static /* synthetic */ void F3(PostAdViewModel postAdViewModel, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        postAdViewModel.E3(str, str2);
    }

    public static /* synthetic */ void G4(PostAdViewModel postAdViewModel, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        postAdViewModel.F4(z11);
    }

    public static /* synthetic */ void H3(PostAdViewModel postAdViewModel, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        postAdViewModel.G3(str, str2);
    }

    private final boolean J1(PostAdScreens postAdScreens) {
        int i11 = c.f34005b[postAdScreens.ordinal()];
        if (i11 != 7 && i11 != 8) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ void J3(PostAdViewModel postAdViewModel, CreateEditAdvActionType createEditAdvActionType, PLFSource pLFSource, PLFScreenTypes pLFScreenTypes, PLFCloseTarget pLFCloseTarget, Bundle bundle, int i11, Object obj) {
        PLFSource pLFSource2;
        PLFScreenTypes pLFScreenTypes2;
        PLFCloseTarget pLFCloseTarget2;
        Bundle bundle2;
        if ((i11 & 2) != 0) {
            pLFSource2 = null;
        } else {
            pLFSource2 = pLFSource;
        }
        if ((i11 & 4) != 0) {
            pLFScreenTypes2 = null;
        } else {
            pLFScreenTypes2 = pLFScreenTypes;
        }
        if ((i11 & 8) != 0) {
            pLFCloseTarget2 = null;
        } else {
            pLFCloseTarget2 = pLFCloseTarget;
        }
        if ((i11 & 16) != 0) {
            bundle2 = null;
        } else {
            bundle2 = bundle;
        }
        postAdViewModel.I3(createEditAdvActionType, pLFSource2, pLFScreenTypes2, pLFCloseTarget2, bundle2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K3(wi.c cVar, final String str, final UserEntity userEntity, final ListingDetailsEntity listingDetailsEntity, final Bundle bundle) {
        Integer userId;
        q().a(new wi.c[]{cVar}, new l<AnalyticsParamBuilder, p>() { // from class: com.forsale.app.features.postad.PostAdViewModel$logBundleAddonClickedEvent$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(AnalyticsParamBuilder log) {
                String phone;
                Integer userId2;
                double d11;
                String fullPathReversed;
                List<Addon> addons;
                int y11;
                List<Addon> addons2;
                int y12;
                o.i(log, "$this$log");
                Bundle bundle2 = Bundle.this;
                if (bundle2 != null && (addons2 = bundle2.getAddons()) != null) {
                    List<Addon> list = addons2;
                    y12 = s.y(list, 10);
                    ArrayList arrayList = new ArrayList(y12);
                    for (Addon addon : list) {
                        arrayList.add(addon.getId());
                    }
                    log.f(PLFParameterName.ADD_ONS_IDS, arrayList);
                }
                Bundle bundle3 = Bundle.this;
                if (bundle3 != null && (addons = bundle3.getAddons()) != null) {
                    List<Addon> list2 = addons;
                    y11 = s.y(list2, 10);
                    ArrayList arrayList2 = new ArrayList(y11);
                    for (Addon addon2 : list2) {
                        arrayList2.add(addon2.getName());
                    }
                    log.f(PLFParameterName.ADD_ONS_NAMES, arrayList2);
                }
                ListingDetailsEntity listingDetailsEntity2 = listingDetailsEntity;
                if (listingDetailsEntity2 != null) {
                    PostAdViewModel postAdViewModel = this;
                    CategoryEntity category = listingDetailsEntity2.getCategory();
                    if (category != null) {
                        log.e(PLFParameterName.CATEGORY_NAME, category.getSystemName());
                        log.d(PLFParameterName.CATEGORY_ID, category.getId());
                    }
                    DistrictEntity value = postAdViewModel.m2().getValue();
                    if (value != null && (fullPathReversed = value.getFullPathReversed()) != null) {
                        log.e(PLFParameterName.LOCATION_NAME, fullPathReversed);
                    }
                    log.e(PLFParameterName.HIDE_MY_NUMBER, AggregatedAllAnalyticsLogger.YesNo.Companion.b(listingDetailsEntity2.getHideMyNumber()));
                    PLFParameterName pLFParameterName = PLFParameterName.LISTING_PRICE;
                    Double price = listingDetailsEntity2.getPrice();
                    if (price != null) {
                        d11 = price.doubleValue();
                    } else {
                        d11 = Utils.DOUBLE_EPSILON;
                    }
                    log.c(pLFParameterName, d11);
                }
                Bundle bundle4 = Bundle.this;
                if (bundle4 != null) {
                    log.c(PLFParameterName.BUNDLE_PRICE, bundle4.getPrice());
                }
                log.e(PLFParameterName.PLATFORM, CustomParameterValue.ANDROID.getValue());
                String l11 = this.r().o().l();
                if (l11 != null) {
                    log.e(PLFParameterName.AMPLITUDE_USER_ID, l11);
                }
                UserEntity userEntity2 = userEntity;
                if (userEntity2 != null && (userId2 = userEntity2.getUserId()) != null) {
                    this.q().b(String.valueOf(userId2.intValue()));
                }
                UserEntity userEntity3 = userEntity;
                if (userEntity3 != null && (phone = userEntity3.getPhone()) != null) {
                    log.e(PLFParameterName.PHONE_NUMBER, phone);
                }
                log.e(PLFParameterName.DEVICE_ID, str);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(AnalyticsParamBuilder analyticsParamBuilder) {
                b(analyticsParamBuilder);
                return p.f75480a;
            }
        });
        if (userEntity != null && (userId = userEntity.getUserId()) != null) {
            q().b(String.valueOf(userId.intValue()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K4(java.lang.String r8, zz.a<? super java.lang.String> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.forsale.app.features.postad.PostAdViewModel$updateContactNumbers$1
            if (r0 == 0) goto L13
            r0 = r9
            com.forsale.app.features.postad.PostAdViewModel$updateContactNumbers$1 r0 = (com.forsale.app.features.postad.PostAdViewModel$updateContactNumbers$1) r0
            int r1 = r0.f34181e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34181e = r1
            goto L18
        L13:
            com.forsale.app.features.postad.PostAdViewModel$updateContactNumbers$1 r0 = new com.forsale.app.features.postad.PostAdViewModel$updateContactNumbers$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f34179c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f34181e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r9)
            goto L7f
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            java.lang.Object r8 = r0.f34178b
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r2 = r0.f34177a
            com.forsale.app.features.postad.PostAdViewModel r2 = (com.forsale.app.features.postad.PostAdViewModel) r2
            kotlin.f.b(r9)
            goto L55
        L40:
            kotlin.f.b(r9)
            java.lang.String r8 = r7.i3(r8)
            r0.f34177a = r7
            r0.f34178b = r8
            r0.f34181e = r4
            java.lang.Object r9 = r7.V1(r0)
            if (r9 != r1) goto L54
            return r1
        L54:
            r2 = r7
        L55:
            java.lang.String r9 = (java.lang.String) r9
            r5 = 0
            if (r9 == 0) goto L62
            int r6 = r9.length()
            if (r6 != 0) goto L61
            goto L62
        L61:
            r4 = r5
        L62:
            if (r4 != 0) goto L82
            java.lang.String r4 = ","
            r6 = 0
            boolean r4 = kotlin.text.k.N(r9, r4, r5, r3, r6)
            if (r4 == 0) goto L72
            java.lang.String r8 = r2.o4(r9, r8)
            goto L82
        L72:
            r0.f34177a = r6
            r0.f34178b = r6
            r0.f34181e = r3
            java.lang.Object r9 = r2.x1(r9, r8, r0)
            if (r9 != r1) goto L7f
            return r1
        L7f:
            r8 = r9
            java.lang.String r8 = (java.lang.String) r8
        L82:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.PostAdViewModel.K4(java.lang.String, zz.a):java.lang.Object");
    }

    private final String L2(int i11, String str, boolean z11, Integer num) {
        if (z11 && i11 == r0.F6) {
            return J().getString(y0.f70448f3, new Object[0]);
        }
        if (i11 == r0.I1) {
            int i12 = r0.H6;
            if (num != null && num.intValue() == i12) {
                return J().getString(y0.Ab, new Object[0]);
            }
        }
        if (i11 == r0.I1) {
            int i13 = r0.C6;
            if (num != null && num.intValue() == i13) {
                return J().getString(y0.Dc, new Object[0]);
            }
            return str;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L3(wi.c cVar, final String str, final UserEntity userEntity, final ListingDetailsEntity listingDetailsEntity, final Bundle bundle) {
        Integer userId;
        q().a(new wi.c[]{cVar}, new l<AnalyticsParamBuilder, p>() { // from class: com.forsale.app.features.postad.PostAdViewModel$logBundleCheckoutClickedEvent$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(AnalyticsParamBuilder log) {
                String phone;
                Integer userId2;
                double d11;
                String fullPathReversed;
                List<Addon> addons;
                int y11;
                List<Addon> addons2;
                int y12;
                o.i(log, "$this$log");
                Bundle bundle2 = Bundle.this;
                if (bundle2 != null && (addons2 = bundle2.getAddons()) != null) {
                    List<Addon> list = addons2;
                    y12 = s.y(list, 10);
                    ArrayList arrayList = new ArrayList(y12);
                    for (Addon addon : list) {
                        arrayList.add(addon.getId());
                    }
                    log.f(PLFParameterName.ADD_ONS_IDS, arrayList);
                }
                Bundle bundle3 = Bundle.this;
                if (bundle3 != null && (addons = bundle3.getAddons()) != null) {
                    List<Addon> list2 = addons;
                    y11 = s.y(list2, 10);
                    ArrayList arrayList2 = new ArrayList(y11);
                    for (Addon addon2 : list2) {
                        arrayList2.add(addon2.getName());
                    }
                    log.f(PLFParameterName.ADD_ONS_NAMES, arrayList2);
                }
                ListingDetailsEntity listingDetailsEntity2 = listingDetailsEntity;
                double d12 = Utils.DOUBLE_EPSILON;
                if (listingDetailsEntity2 != null) {
                    PostAdViewModel postAdViewModel = this;
                    CategoryEntity category = listingDetailsEntity2.getCategory();
                    if (category != null) {
                        log.e(PLFParameterName.CATEGORY_NAME, category.getSystemName());
                        log.d(PLFParameterName.CATEGORY_ID, category.getId());
                    }
                    DistrictEntity value = postAdViewModel.m2().getValue();
                    if (value != null && (fullPathReversed = value.getFullPathReversed()) != null) {
                        log.e(PLFParameterName.LOCATION_NAME, fullPathReversed);
                    }
                    log.e(PLFParameterName.HIDE_MY_NUMBER, AggregatedAllAnalyticsLogger.YesNo.Companion.b(listingDetailsEntity2.getHideMyNumber()));
                    PLFParameterName pLFParameterName = PLFParameterName.LISTING_PRICE;
                    Double price = listingDetailsEntity2.getPrice();
                    if (price != null) {
                        d11 = price.doubleValue();
                    } else {
                        d11 = 0.0d;
                    }
                    log.c(pLFParameterName, d11);
                }
                PLFParameterName pLFParameterName2 = PLFParameterName.BUNDLE_PRICE;
                Bundle bundle4 = Bundle.this;
                if (bundle4 != null) {
                    d12 = bundle4.getPrice();
                }
                log.c(pLFParameterName2, d12);
                log.e(PLFParameterName.PLATFORM, CustomParameterValue.ANDROID.getValue());
                String l11 = this.r().o().l();
                if (l11 != null) {
                    log.e(PLFParameterName.AMPLITUDE_USER_ID, l11);
                }
                UserEntity userEntity2 = userEntity;
                if (userEntity2 != null && (userId2 = userEntity2.getUserId()) != null) {
                    this.q().b(String.valueOf(userId2.intValue()));
                }
                UserEntity userEntity3 = userEntity;
                if (userEntity3 != null && (phone = userEntity3.getPhone()) != null) {
                    log.e(PLFParameterName.PHONE_NUMBER, phone);
                }
                log.e(PLFParameterName.DEVICE_ID, str);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(AnalyticsParamBuilder analyticsParamBuilder) {
                b(analyticsParamBuilder);
                return p.f75480a;
            }
        });
        if (userEntity != null && (userId = userEntity.getUserId()) != null) {
            q().b(String.valueOf(userId.intValue()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N3() {
        F3(this, ErrorReason.MEDIA_ERROR.getValue(), null, 2, null);
    }

    private final void O2() {
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.r0.a(this), null, null, new PostAdViewModel$getRegion$1(this, null), 3, null);
    }

    private final void O4(WorkInfo workInfo) {
        int j11 = workInfo.b().j("IN_PROGRESS_PERCENTAGE", 0);
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.r0.a(this), null, null, new PostAdViewModel$updateProgress$1(workInfo.b().m("MEDIA_TYPE"), this, j11, null), 3, null);
    }

    public static /* synthetic */ void P3(PostAdViewModel postAdViewModel, CreateEditAdvActionType createEditAdvActionType, PLFMediaTypes pLFMediaTypes, l.a aVar, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            pLFMediaTypes = null;
        }
        if ((i11 & 4) != 0) {
            aVar = null;
        }
        if ((i11 & 8) != 0) {
            z11 = true;
        }
        postAdViewModel.O3(createEditAdvActionType, pLFMediaTypes, aVar, z11);
    }

    private final void P4() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new PostAdViewModel$updateUser$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S3(wi.c cVar, final String str, final UserEntity userEntity) {
        Integer userId;
        q().a(new wi.c[]{cVar}, new g00.l<AnalyticsParamBuilder, p>() { // from class: com.forsale.app.features.postad.PostAdViewModel$logSettingsNextClicked$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(AnalyticsParamBuilder log) {
                double d11;
                Integer hideMyNumber;
                Double price;
                String fullPathReversed;
                CategoryEntity category;
                CategoryEntity category2;
                String systemName;
                String phone;
                o.i(log, "$this$log");
                log.e(PLFParameterName.PLATFORM, CustomParameterValue.ANDROID.getValue());
                UserEntity userEntity2 = UserEntity.this;
                if (userEntity2 != null && (phone = userEntity2.getPhone()) != null) {
                    log.e(PLFParameterName.PHONE_NUMBER, phone);
                }
                PLFParameterName pLFParameterName = PLFParameterName.DEVICE_ID;
                log.e(pLFParameterName, str);
                String l11 = this.r().o().l();
                if (l11 != null) {
                    log.e(PLFParameterName.AMPLITUDE_USER_ID, l11);
                }
                log.e(pLFParameterName, str);
                ListingDetailsEntity n22 = this.n2();
                if (n22 != null && (category2 = n22.getCategory()) != null && (systemName = category2.getSystemName()) != null) {
                    log.e(PLFParameterName.CATEGORY_NAME, systemName);
                }
                ListingDetailsEntity n23 = this.n2();
                if (n23 != null && (category = n23.getCategory()) != null) {
                    log.d(PLFParameterName.CATEGORY_ID, category.getId());
                }
                DistrictEntity value = this.m2().getValue();
                if (value != null && (fullPathReversed = value.getFullPathReversed()) != null) {
                    log.e(PLFParameterName.LOCATION_NAME, fullPathReversed);
                }
                PLFParameterName pLFParameterName2 = PLFParameterName.LISTING_PRICE;
                ListingDetailsEntity n24 = this.n2();
                if (n24 != null && (price = n24.getPrice()) != null) {
                    d11 = price.doubleValue();
                } else {
                    d11 = Utils.DOUBLE_EPSILON;
                }
                log.c(pLFParameterName2, d11);
                ListingDetailsEntity n25 = this.n2();
                if (n25 != null && (hideMyNumber = n25.getHideMyNumber()) != null) {
                    log.e(PLFParameterName.HIDE_MY_NUMBER, YesNo.Companion.a(Integer.valueOf(hideMyNumber.intValue())));
                }
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(AnalyticsParamBuilder analyticsParamBuilder) {
                b(analyticsParamBuilder);
                return p.f75480a;
            }
        });
        if (userEntity != null && (userId = userEntity.getUserId()) != null) {
            q().b(String.valueOf(userId.intValue()));
        }
    }

    private final boolean S4(PostAdScreens postAdScreens) {
        switch (c.f34005b[postAdScreens.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final PostAdScreens T3(Integer num) {
        int i11 = r0.F6;
        if (num != null && num.intValue() == i11) {
            return PostAdScreens.MAIN_INFO_SCREEN;
        }
        int i12 = r0.G6;
        if (num != null && num.intValue() == i12) {
            return PostAdScreens.MEDIA_SCREEN;
        }
        int i13 = r0.B6;
        if (num != null && num.intValue() == i13) {
            return PostAdScreens.ATTRIBUTES_SCREEN;
        }
        int i14 = r0.H6;
        if (num != null && num.intValue() == i14) {
            return PostAdScreens.PLANS_SCREEN;
        }
        int i15 = r0.D6;
        if (num != null && num.intValue() == i15) {
            return PostAdScreens.EXTRA_INFO_SCREEN;
        }
        int i16 = r0.A6;
        if (num != null && num.intValue() == i16) {
            return PostAdScreens.ADDONS_SCREEN;
        }
        int i17 = r0.E6;
        if (num != null && num.intValue() == i17) {
            return PostAdScreens.LOCATION_SCREEN;
        }
        int i18 = r0.f69832a2;
        if (num != null && num.intValue() == i18) {
            return PostAdScreens.CHOOSE_CATEGORY_SCREEN;
        }
        int i19 = r0.I1;
        if (num != null && num.intValue() == i19) {
            return PostAdScreens.CALCULATOR_SCREEN;
        }
        int i21 = r0.f69948j1;
        if (num != null && num.intValue() == i21) {
            return PostAdScreens.BILLING_PACKAGES_SCREEN;
        }
        int i22 = r0.f70109v6;
        if (num != null && num.intValue() == i22) {
            return PostAdScreens.PAYMENT_HISTORY_SCREEN;
        }
        int i23 = r0.f70122w6;
        if (num != null && num.intValue() == i23) {
            return PostAdScreens.PAYMENT_HISTORY_DETAILS_SCREEN;
        }
        int i24 = r0.C6;
        if (num != null && num.intValue() == i24) {
            return PostAdScreens.BUNDLES_SCREEN;
        }
        return PostAdScreens.MAIN_INFO_SCREEN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MediaTypes U3(WorkInfo workInfo) {
        MediaTypes.a aVar = MediaTypes.Companion;
        String m11 = workInfo.a().m("MEDIA_TYPE");
        if (m11 == null && (m11 = workInfo.b().m("MEDIA_TYPE")) == null) {
            m11 = "NON";
        }
        return aVar.a(m11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object V1(zz.a<? super java.lang.String> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.forsale.app.features.postad.PostAdViewModel$getAlternativeNumbersAsString$1
            if (r0 == 0) goto L13
            r0 = r8
            com.forsale.app.features.postad.PostAdViewModel$getAlternativeNumbersAsString$1 r0 = (com.forsale.app.features.postad.PostAdViewModel$getAlternativeNumbersAsString$1) r0
            int r1 = r0.f34038c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34038c = r1
            goto L18
        L13:
            com.forsale.app.features.postad.PostAdViewModel$getAlternativeNumbersAsString$1 r0 = new com.forsale.app.features.postad.PostAdViewModel$getAlternativeNumbersAsString$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f34036a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f34038c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r8)
            goto L3f
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L31:
            kotlin.f.b(r8)
            com.forsale.app.features.postad.PostAdRepository r8 = r7.f33946m0
            r0.f34038c = r3
            java.lang.Object r8 = r8.c(r0)
            if (r8 != r1) goto L3f
            return r1
        L3f:
            java.util.Set r8 = (java.util.Set) r8
            if (r8 == 0) goto L56
            r0 = r8
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.String r1 = ","
            java.lang.String r2 = ""
            java.lang.String r3 = ""
            r4 = 3
            java.lang.String r5 = "..."
            com.forsale.app.features.postad.PostAdViewModel$getAlternativeNumbersAsString$2 r6 = new g00.l<java.lang.String, java.lang.CharSequence>() { // from class: com.forsale.app.features.postad.PostAdViewModel$getAlternativeNumbersAsString$2
                static {
                    /*
                        com.forsale.app.features.postad.PostAdViewModel$getAlternativeNumbersAsString$2 r0 = new com.forsale.app.features.postad.PostAdViewModel$getAlternativeNumbersAsString$2
                        r0.<init>()
                        
                        // error: 0x0005: SPUT  (r0 I:com.forsale.app.features.postad.PostAdViewModel$getAlternativeNumbersAsString$2) com.forsale.app.features.postad.PostAdViewModel$getAlternativeNumbersAsString$2.a com.forsale.app.features.postad.PostAdViewModel$getAlternativeNumbersAsString$2
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.PostAdViewModel$getAlternativeNumbersAsString$2.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 1
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.PostAdViewModel$getAlternativeNumbersAsString$2.<init>():void");
                }

                @Override // g00.l
                /* renamed from: b */
                public final java.lang.CharSequence invoke(java.lang.String r2) {
                    /*
                        r1 = this;
                        java.lang.String r0 = "it"
                        kotlin.jvm.internal.o.i(r2, r0)
                        java.util.Locale r0 = java.util.Locale.ROOT
                        java.lang.String r2 = r2.toUpperCase(r0)
                        java.lang.String r0 = "toUpperCase(...)"
                        kotlin.jvm.internal.o.h(r2, r0)
                        return r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.PostAdViewModel$getAlternativeNumbersAsString$2.invoke(java.lang.String):java.lang.CharSequence");
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ java.lang.CharSequence invoke(java.lang.String r1) {
                    /*
                        r0 = this;
                        java.lang.String r1 = (java.lang.String) r1
                        java.lang.CharSequence r1 = r0.invoke(r1)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.PostAdViewModel$getAlternativeNumbersAsString$2.invoke(java.lang.Object):java.lang.Object");
                }
            }
            java.lang.String r8 = kotlin.collections.p.s0(r0, r1, r2, r3, r4, r5, r6)
            goto L57
        L56:
            r8 = 0
        L57:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.PostAdViewModel.V1(zz.a):java.lang.Object");
    }

    private final void X3(androidx.work.d dVar) {
        String[] n11 = dVar.n("IMAGES");
        String m11 = dVar.m("VIDEO");
        dVar.m("VIDEO_THUMB");
        dVar.j("IMAGE_SUCCESS_COUNT", 0);
        dVar.j("IMAGE_FAILURE_COUNT", 0);
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.r0.a(this), null, null, new PostAdViewModel$postMediaUpload$1(this, n11, m11, null), 3, null);
    }

    private final String Y1(int i11, String str) {
        if (i11 == r0.A6 || i11 == r0.I1) {
            return J().getString(y0.f70465g3, new Object[0]);
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ArrayList<String> Y3(ArrayList<String> arrayList) {
        ArrayList<String> arrayList2;
        boolean z11;
        ArrayList<String> imageUrls;
        ListingDetailsEntity n22 = n2();
        if (n22 != null && (imageUrls = n22.getImageUrls()) != null) {
            arrayList2 = new ArrayList<>(imageUrls);
        } else {
            arrayList2 = new ArrayList<>();
        }
        int i11 = 0;
        for (Object obj : arrayList2) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                r.x();
            }
            String str = (String) obj;
            if (arrayList2.size() > 0) {
                String str2 = arrayList2.get(0);
                o.h(str2, "get(...)");
                if (str2.length() == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    arrayList2.remove(i11);
                    arrayList.remove(0);
                    i11 = i12;
                }
            }
            if (!URLUtil.isNetworkUrl(str)) {
                arrayList2.set(i11, arrayList.remove(0));
            }
            i11 = i12;
        }
        return arrayList2;
    }

    private final PLFScreenTypes c3() {
        Integer value = this.L1.getValue();
        int i11 = r0.F6;
        if (value != null && value.intValue() == i11) {
            return PLFScreenTypes.MAIN_INFORMATION;
        }
        int i12 = r0.G6;
        if (value != null && value.intValue() == i12) {
            return PLFScreenTypes.MEDIA;
        }
        int i13 = r0.B6;
        if (value != null && value.intValue() == i13) {
            return PLFScreenTypes.EXTRA_ATTRIBUTES;
        }
        int i14 = r0.D6;
        if (value != null && value.intValue() == i14) {
            return PLFScreenTypes.SETTINGS;
        }
        int i15 = r0.H6;
        if (value != null && value.intValue() == i15) {
            return PLFScreenTypes.PLANS;
        }
        int i16 = r0.A6;
        if (value != null && value.intValue() == i16) {
            return PLFScreenTypes.ADDONS;
        }
        int i17 = r0.C6;
        if (value != null && value.intValue() == i17) {
            return PLFScreenTypes.BUNDLES;
        }
        return null;
    }

    private final void d4() {
        CreateEditAdvActionType createEditAdvActionType;
        if (this.f33965s1) {
            createEditAdvActionType = CreateEditAdvActionType.EDIT_LISTING_LEAVE_CLICKED;
        } else {
            createEditAdvActionType = CreateEditAdvActionType.ADD_LISTING_LEAVE_CLICKED;
        }
        J3(this, createEditAdvActionType, null, c3(), null, null, 26, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g3(WorkInfo workInfo, MediaTypes mediaTypes) {
        O4(workInfo);
        int i11 = c.f34007d[workInfo.d().ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.r0.a(this), null, null, new PostAdViewModel$handleUploadResponse$1(this, null), 3, null);
                androidx.work.d a11 = workInfo.a();
                o.h(a11, "getOutputData(...)");
                X3(a11);
                i4();
                A4(mediaTypes, MediaStates.SUCCESS);
                return;
            } else if (i11 != 3) {
                if (i11 != 4) {
                    A4(mediaTypes, MediaStates.INITIAL);
                    return;
                } else if (workInfo.c() > 1) {
                    A4(mediaTypes, MediaStates.RETRY);
                    return;
                } else {
                    return;
                }
            } else {
                h4();
                this.f33932g1.postValue(Boolean.TRUE);
                A4(mediaTypes, MediaStates.FAILED);
                return;
            }
        }
        A4(mediaTypes, MediaStates.LOADING);
    }

    private final void h4() {
        if (this.f33965s1) {
            J3(this, CreateEditAdvActionType.EDIT_LISTING_IMAGES_FAILED, null, null, null, null, 30, null);
        } else {
            J3(this, CreateEditAdvActionType.UPLOAD_NEW_LISTING_IMAGES_FAILED, null, null, null, null, 30, null);
        }
    }

    private final String i3(String str) {
        String c11;
        String c12;
        String i11 = PhoneDetectorKt.i(PhoneDetectorKt.h(str));
        String z12 = z1(i11);
        if (z12 != null && (c12 = TypeExtensionsKt.c(z12)) != null) {
            i11 = c12;
        }
        v vVar = this.f33953o1;
        if (vVar != null && (c11 = vVar.c(i11)) != null) {
            return c11;
        }
        return i11;
    }

    private final void i4() {
        if (this.f33965s1) {
            J3(this, CreateEditAdvActionType.EDIT_LISTING_IMAGES_SUCCEEDED, null, null, null, null, 30, null);
        } else {
            J3(this, CreateEditAdvActionType.UPLOAD_NEW_LISTING_IMAGES_SUCCEEDED, null, null, null, null, 30, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j4(com.forsale.app.features.postad.media.MediaTypes r7, zz.a<? super androidx.work.d.a> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.forsale.app.features.postad.PostAdViewModel$registerInputParameters$1
            if (r0 == 0) goto L13
            r0 = r8
            com.forsale.app.features.postad.PostAdViewModel$registerInputParameters$1 r0 = (com.forsale.app.features.postad.PostAdViewModel$registerInputParameters$1) r0
            int r1 = r0.f34118i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34118i = r1
            goto L18
        L13:
            com.forsale.app.features.postad.PostAdViewModel$registerInputParameters$1 r0 = new com.forsale.app.features.postad.PostAdViewModel$registerInputParameters$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f34116g
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f34118i
            r3 = 1
            if (r2 == 0) goto L49
            if (r2 != r3) goto L41
            java.lang.Object r7 = r0.f34115f
            androidx.work.d$a r7 = (androidx.work.d.a) r7
            java.lang.Object r1 = r0.f34114e
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r0.f34113d
            androidx.work.d$a r2 = (androidx.work.d.a) r2
            java.lang.Object r4 = r0.f34112c
            androidx.work.d$a r4 = (androidx.work.d.a) r4
            java.lang.Object r5 = r0.f34111b
            com.forsale.app.features.postad.media.MediaTypes r5 = (com.forsale.app.features.postad.media.MediaTypes) r5
            java.lang.Object r0 = r0.f34110a
            com.forsale.app.features.postad.PostAdViewModel r0 = (com.forsale.app.features.postad.PostAdViewModel) r0
            kotlin.f.b(r8)
            goto L6f
        L41:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L49:
            kotlin.f.b(r8)
            androidx.work.d$a r8 = new androidx.work.d$a
            r8.<init>()
            r0.f34110a = r6
            r0.f34111b = r7
            r0.f34112c = r8
            r0.f34113d = r8
            java.lang.String r2 = "DEVICE_ID"
            r0.f34114e = r2
            r0.f34115f = r8
            r0.f34118i = r3
            java.lang.Object r0 = r6.H1(r0)
            if (r0 != r1) goto L68
            return r1
        L68:
            r5 = r7
            r7 = r8
            r4 = r7
            r1 = r2
            r2 = r4
            r8 = r0
            r0 = r6
        L6f:
            java.lang.String r8 = (java.lang.String) r8
            r7.h(r1, r8)
            java.lang.String r7 = r5.name()
            java.lang.String r8 = "MEDIA_TYPE"
            r2.h(r8, r7)
            int[] r7 = com.forsale.app.features.postad.PostAdViewModel.c.f34006c
            int r8 = r5.ordinal()
            r7 = r7[r8]
            if (r7 == r3) goto L97
            r8 = 2
            if (r7 == r8) goto L8b
            goto Lad
        L8b:
            java.lang.String r7 = r0.E2()
            if (r7 == 0) goto Lad
            java.lang.String r8 = "VIDEO"
            r2.h(r8, r7)
            goto Lad
        L97:
            java.util.List r7 = r0.D2()
            if (r7 == 0) goto Lad
            java.util.Collection r7 = (java.util.Collection) r7
            r8 = 0
            java.lang.String[] r8 = new java.lang.String[r8]
            java.lang.Object[] r7 = r7.toArray(r8)
            java.lang.String[] r7 = (java.lang.String[]) r7
            java.lang.String r8 = "IMAGES"
            r2.i(r8, r7)
        Lad:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.PostAdViewModel.j4(com.forsale.app.features.postad.media.MediaTypes, zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean k3() {
        switch (c.f34004a[this.A0.ordinal()]) {
            case 1:
                throw new IllegalArgumentException("You must pass ¬an intention rather than EditListingIntention.NON");
            case 2:
            case 3:
                return true;
            case 4:
            case 5:
            case 6:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static /* synthetic */ Object l4(PostAdViewModel postAdViewModel, MediaTypes mediaTypes, boolean z11, boolean z12, zz.a aVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        return postAdViewModel.k4(mediaTypes, z11, z12, aVar);
    }

    private final List<String> n4(List<String> list, String str) {
        Object v02;
        v02 = CollectionsKt___CollectionsKt.v0(list);
        list.remove(v02);
        list.add(str);
        return list;
    }

    private final String o4(String str, String str2) {
        List F0;
        List<String> a12;
        String t02;
        F0 = StringsKt__StringsKt.F0(str, new String[]{","}, false, 0, 6, null);
        a12 = CollectionsKt___CollectionsKt.a1(F0);
        if (str2 != null) {
            n4(a12, str2);
        }
        t02 = CollectionsKt___CollectionsKt.t0(a12, ",", null, null, 0, null, null, 62, null);
        return t02;
    }

    public static /* synthetic */ void q4(PostAdViewModel postAdViewModel, boolean z11, MediaTypes mediaTypes, boolean z12, boolean z13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        if ((i11 & 8) != 0) {
            z13 = false;
        }
        postAdViewModel.p4(z11, mediaTypes, z12, z13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r2(zz.a<? super java.lang.Integer> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.forsale.app.features.postad.PostAdViewModel$getMaxNumberAllowed$1
            if (r0 == 0) goto L13
            r0 = r5
            com.forsale.app.features.postad.PostAdViewModel$getMaxNumberAllowed$1 r0 = (com.forsale.app.features.postad.PostAdViewModel$getMaxNumberAllowed$1) r0
            int r1 = r0.f34042c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34042c = r1
            goto L18
        L13:
            com.forsale.app.features.postad.PostAdViewModel$getMaxNumberAllowed$1 r0 = new com.forsale.app.features.postad.PostAdViewModel$getMaxNumberAllowed$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f34040a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f34042c
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
            we.a r5 = r4.f33972w0
            r0.f34042c = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            com.forsale.app.datalayer.network.entities.BusinessType r5 = com.forsale.app.datalayer.network.entities.BusinessType.PERSONAL
            r5 = 2
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.a.d(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.PostAdViewModel.r2(zz.a):java.lang.Object");
    }

    private final boolean r3() {
        if (this.f33928e1.getValue() != MediaStates.FAILED && this.f33928e1.getValue() != MediaStates.LOADING && this.f33928e1.getValue() != MediaStates.RETRY) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ void s4(PostAdViewModel postAdViewModel, CategoryEntity categoryEntity, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        postAdViewModel.r4(categoryEntity, z11);
    }

    public static /* synthetic */ void u4(PostAdViewModel postAdViewModel, DistrictEntity districtEntity, DistrictEntity districtEntity2, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        postAdViewModel.t4(districtEntity, districtEntity2, z11);
    }

    private final void v1(int i11) {
        PostAdScreens T3 = T3(Integer.valueOf(i11));
        boolean S4 = S4(T3);
        boolean J1 = J1(T3);
        E4(S4);
        if (S4 && J1) {
            w4(this, T3, null, 2, null);
        }
    }

    public static /* synthetic */ void w4(PostAdViewModel postAdViewModel, PostAdScreens postAdScreens, com.forsale.app.utils.b0 b0Var, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            b0Var = null;
        }
        postAdViewModel.v4(postAdScreens, b0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x1(java.lang.String r10, java.lang.String r11, zz.a<? super java.lang.String> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.forsale.app.features.postad.PostAdViewModel$addPhone$1
            if (r0 == 0) goto L13
            r0 = r12
            com.forsale.app.features.postad.PostAdViewModel$addPhone$1 r0 = (com.forsale.app.features.postad.PostAdViewModel$addPhone$1) r0
            int r1 = r0.f33999e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33999e = r1
            goto L18
        L13:
            com.forsale.app.features.postad.PostAdViewModel$addPhone$1 r0 = new com.forsale.app.features.postad.PostAdViewModel$addPhone$1
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.f33997c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f33999e
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r10 = r0.f33996b
            r11 = r10
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r10 = r0.f33995a
            java.lang.String r10 = (java.lang.String) r10
            kotlin.f.b(r12)
            goto L4a
        L32:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3a:
            kotlin.f.b(r12)
            r0.f33995a = r10
            r0.f33996b = r11
            r0.f33999e = r3
            java.lang.Object r12 = r9.r2(r0)
            if (r12 != r1) goto L4a
            return r1
        L4a:
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            if (r12 <= r3) goto L6f
            r12 = 2
            java.lang.String[] r12 = new java.lang.String[r12]
            r0 = 0
            r12[r0] = r10
            r12[r3] = r11
            java.util.List r10 = kotlin.collections.p.q(r12)
            r0 = r10
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.String r1 = ","
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 62
            r8 = 0
            java.lang.String r11 = kotlin.collections.p.t0(r0, r1, r2, r3, r4, r5, r6, r7, r8)
        L6f:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.PostAdViewModel.x1(java.lang.String, java.lang.String, zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y4(boolean z11) {
        Integer categoryId;
        this.f33975x1.k(z11);
        ListingDetailsEntity n22 = n2();
        if (n22 != null && (categoryId = n22.getCategoryId()) != null) {
            BuildersKt__Builders_commonKt.launch$default(this, null, null, new PostAdViewModel$setListingEditDetails$1$1(this, categoryId.intValue(), null), 3, null);
        }
    }

    private final String z1(String str) {
        boolean I;
        RegionEntity value = this.X0.getValue();
        if (value != null) {
            I = kotlin.text.s.I(str, value.getPhonePrefix(), false, 2, null);
            if (!I) {
                str = value.getPhonePrefix() + str;
            }
            return str;
        }
        return null;
    }

    static /* synthetic */ void z4(PostAdViewModel postAdViewModel, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        postAdViewModel.y4(z11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003f, code lost:
        if (r0 != false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A1() {
        /*
            r4 = this;
            com.forsale.app.datalayer.network.entities.ListingDetailsEntity r0 = r4.n2()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L44
            boolean r3 = r4.f33965s1
            if (r3 == 0) goto L42
            java.lang.Integer r3 = r0.getAllowEditOnDistrict()
            if (r3 != 0) goto L13
            goto L42
        L13:
            int r3 = r3.intValue()
            if (r3 != r2) goto L42
            java.util.List r3 = r0.getDistrictsIds()
            if (r3 == 0) goto L27
            int r3 = r3.size()
            if (r3 != r2) goto L27
            r3 = r2
            goto L28
        L27:
            r3 = r1
        L28:
            if (r3 == 0) goto L42
            java.util.List r0 = r0.getDistrictsIds()
            if (r0 == 0) goto L3e
            java.lang.Object r0 = r0.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != r2) goto L3e
            r0 = r2
            goto L3f
        L3e:
            r0 = r1
        L3f:
            if (r0 == 0) goto L42
            goto L44
        L42:
            r0 = r1
            goto L45
        L44:
            r0 = r2
        L45:
            boolean r3 = r4.f33965s1
            if (r3 == 0) goto L4b
            if (r0 == 0) goto L4c
        L4b:
            r1 = r2
        L4c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.PostAdViewModel.A1():boolean");
    }

    public final SharedFlow<p> A2() {
        return this.S0;
    }

    public final void A4(MediaTypes mediaTypes, MediaStates mediaStates) {
        o.i(mediaTypes, "mediaTypes");
        o.i(mediaStates, "mediaStates");
        int i11 = c.f34006c[mediaTypes.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                this.f33930f1.postValue(mediaStates);
                return;
            }
            return;
        }
        this.f33928e1.postValue(mediaStates);
    }

    public final void B1() {
        boolean z11;
        MediaStates value = this.f33930f1.getValue();
        if (value != null) {
            if (value != MediaStates.FAILED && value != MediaStates.LOADING && value != MediaStates.RETRY) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!z11) {
                value = null;
            }
            if (value != null) {
                x10.a.b("UPLOAD_MEDIA:: checkMedia " + value, new Object[0]);
                if (V3()) {
                    BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.r0.a(this), null, null, new PostAdViewModel$checkMedia$2$1(this, null), 3, null);
                }
            }
        }
    }

    public final SharedFlow<p> B2() {
        return this.Q0;
    }

    public final void B4(boolean z11) {
        this.f33920a1.postValue(Boolean.valueOf(z11));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C1(g00.a<wz.p> r17, g00.l<? super zz.a<? super wz.p>, ? extends java.lang.Object> r18, zz.a<? super wz.p> r19) {
        /*
            Method dump skipped, instructions count: 197
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.PostAdViewModel.C1(g00.a, g00.l, zz.a):java.lang.Object");
    }

    public final LiveData<RepostNavigation> C2() {
        return this.f33947m1;
    }

    public final void C3(AggregatedAllAnalyticsLogger.AdvActionEvents event, String reason, String str, String str2) {
        o.i(event, "event");
        o.i(reason, "reason");
        AggregatedAllAnalyticsLoggerKt.w(r(), event, true, true, reason, str, str2);
    }

    public final void C4(v vVar) {
        this.f33953o1 = vVar;
    }

    public final List<String> D2() {
        ArrayList<String> imageUrls;
        ListingDetailsEntity n22 = n2();
        if (n22 != null && (imageUrls = n22.getImageUrls()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : imageUrls) {
                if (!URLUtil.isNetworkUrl((String) obj)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        return null;
    }

    public final void D4(ListingDetailsEntity listing, List<Addon> addons) {
        o.i(listing, "listing");
        o.i(addons, "addons");
        this.f33939j2.i(listing, this.A0, addons);
    }

    public final void E1() {
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.r0.a(this), null, null, new PostAdViewModel$clearCache$1(this, null), 3, null);
    }

    public final void E4(boolean z11) {
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.r0.a(this), null, null, new PostAdViewModel$showUploadButton$1(this, z11, null), 3, null);
    }

    public final void F4(boolean z11) {
        this.f33942k2.o0(z11);
    }

    public final androidx.work.k G1(long j11, TimeUnit timeUnit) {
        o.i(timeUnit, "timeUnit");
        androidx.work.k b11 = new k.a(ClearListingCachedWorkManger.class).a("CLEAR_CACHE_WORK_MANAGER").g(j11, timeUnit).e(BackoffPolicy.EXPONENTIAL, 10000L, TimeUnit.MILLISECONDS).b();
        o.h(b11, "build(...)");
        return b11;
    }

    public final SharedFlow<p> G2() {
        return this.Y1;
    }

    public final void G3(String reason, String str) {
        o.i(reason, "reason");
        D3(this, AggregatedAllAnalyticsLogger.AdvActionEvents.ALERT_VIEWED, reason, null, str, 4, null);
    }

    public final Object H1(zz.a<? super String> aVar) {
        return this.f33968u0.c().a(aVar);
    }

    public final MutableSharedFlow<p> H2() {
        return this.X1;
    }

    public final boolean H4() {
        List<String> list;
        boolean z11;
        ListingDetailsEntity n22 = n2();
        List<String> list2 = null;
        if (n22 != null) {
            list = n22.getProhibtedKeyWords();
        } else {
            list = null;
        }
        List<String> list3 = list;
        if (list3 != null && !list3.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11) {
            list2 = list;
        }
        if (list2 == null) {
            return false;
        }
        return true;
    }

    public final void I1(boolean z11) {
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.r0.a(this), null, null, new PostAdViewModel$enableBackAndCloseButton$1(this, z11, null), 3, null);
    }

    public final SharedFlow<p> I2() {
        return this.I1;
    }

    public final void I3(CreateEditAdvActionType action, PLFSource pLFSource, PLFScreenTypes pLFScreenTypes, PLFCloseTarget pLFCloseTarget, Bundle bundle) {
        o.i(action, "action");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new PostAdViewModel$logAnalytics$1(this, action, pLFSource, pLFScreenTypes, pLFCloseTarget, bundle, null), 3, null);
    }

    public final void I4() {
        ListingDetailsEntity n22;
        if (!this.f33965s1 && o.d(this.f33967t1.getValue(), Boolean.TRUE) && (n22 = n2()) != null) {
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.r0.a(this), null, null, new PostAdViewModel$updateCache$1$1(n22, this, null), 3, null);
        }
    }

    public final StateFlow<qf.c> J2() {
        return this.f33937i2;
    }

    public final void J4(CalculatorEntity calculatorEntity) {
        o.i(calculatorEntity, "calculatorEntity");
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.r0.a(this), null, null, new PostAdViewModel$updateCalculator$1(this, calculatorEntity, null), 3, null);
    }

    public final void K1(boolean z11) {
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.r0.a(this), null, null, new PostAdViewModel$enableUploadButton$1(this, z11, null), 3, null);
    }

    public final v.a K2() {
        v.a aVar = this.f33950n1;
        if (aVar != null) {
            return aVar;
        }
        o.w("phoneParsingFactory");
        return null;
    }

    public final p L4(ListingDetailsEntity listingDetailsEntity) {
        if (listingDetailsEntity != null) {
            this.f33962r1.postValue(listingDetailsEntity);
            return p.f75480a;
        }
        return null;
    }

    public final LiveData<List<String>> M2() {
        return this.C0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a2 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M3(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomEvents r10, java.lang.String r11, zz.a<? super wz.p> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.forsale.app.features.postad.PostAdViewModel$logChooseCategoryVisitedEvent$1
            if (r0 == 0) goto L13
            r0 = r12
            com.forsale.app.features.postad.PostAdViewModel$logChooseCategoryVisitedEvent$1 r0 = (com.forsale.app.features.postad.PostAdViewModel$logChooseCategoryVisitedEvent$1) r0
            int r1 = r0.f34090h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34090h = r1
            goto L18
        L13:
            com.forsale.app.features.postad.PostAdViewModel$logChooseCategoryVisitedEvent$1 r0 = new com.forsale.app.features.postad.PostAdViewModel$logChooseCategoryVisitedEvent$1
            r0.<init>(r9, r12)
        L18:
            r7 = r0
            java.lang.Object r12 = r7.f34088f
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r7.f34090h
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L54
            if (r1 == r3) goto L37
            if (r1 != r2) goto L2f
            kotlin.f.b(r12)
            goto La3
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            java.lang.Object r10 = r7.f34087e
            com.forsale.app.datalayer.database.UserEntity r10 = (com.forsale.app.datalayer.database.UserEntity) r10
            java.lang.Object r11 = r7.f34086d
            com.forsale.app.datalayer.network.entities.ListingDetailsEntity r11 = (com.forsale.app.datalayer.network.entities.ListingDetailsEntity) r11
            java.lang.Object r1 = r7.f34085c
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomEvents r1 = (com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomEvents) r1
            java.lang.Object r3 = r7.f34084b
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r3 = (com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger) r3
            java.lang.Object r5 = r7.f34083a
            java.lang.String r5 = (java.lang.String) r5
            kotlin.f.b(r12)
            r6 = r5
            r5 = r10
            r10 = r1
            r1 = r3
            r3 = r11
            goto L87
        L54:
            kotlin.f.b(r12)
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r12 = r9.r()
            androidx.lifecycle.b0<com.forsale.app.datalayer.network.entities.ListingDetailsEntity> r1 = r9.f33962r1
            if (r1 == 0) goto L66
            java.lang.Object r1 = r1.getValue()
            com.forsale.app.datalayer.network.entities.ListingDetailsEntity r1 = (com.forsale.app.datalayer.network.entities.ListingDetailsEntity) r1
            goto L67
        L66:
            r1 = r4
        L67:
            kotlinx.coroutines.flow.StateFlow<com.forsale.app.datalayer.database.UserEntity> r5 = r9.f33954o2
            java.lang.Object r5 = r5.getValue()
            com.forsale.app.datalayer.database.UserEntity r5 = (com.forsale.app.datalayer.database.UserEntity) r5
            r7.f34083a = r11
            r7.f34084b = r12
            r7.f34085c = r10
            r7.f34086d = r1
            r7.f34087e = r5
            r7.f34090h = r3
            java.lang.Object r3 = r9.x3(r7)
            if (r3 != r0) goto L82
            return r0
        L82:
            r6 = r11
            r8 = r1
            r1 = r12
            r12 = r3
            r3 = r8
        L87:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r11 = r12.booleanValue()
            r7.f34083a = r4
            r7.f34084b = r4
            r7.f34085c = r4
            r7.f34086d = r4
            r7.f34087e = r4
            r7.f34090h = r2
            r2 = r10
            r4 = r5
            r5 = r11
            java.lang.Object r10 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt.K(r1, r2, r3, r4, r5, r6, r7)
            if (r10 != r0) goto La3
            return r0
        La3:
            wz.p r10 = wz.p.f75480a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.PostAdViewModel.M3(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomEvents, java.lang.String, zz.a):java.lang.Object");
    }

    public final void M4(g00.p<? super ListingDetailsEntity, ? super zz.a<? super p>, ? extends Object> updateAction) {
        o.i(updateAction, "updateAction");
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.r0.a(this), null, null, new PostAdViewModel$updateListing$2(this, updateAction, null), 3, null);
    }

    public final void N1(PostAdScreens currentScreen) {
        o.i(currentScreen, "currentScreen");
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.r0.a(this), null, null, new PostAdViewModel$findNavigationTarget$1(this, currentScreen, null), 3, null);
    }

    public final PublishAdvViewModel N2() {
        return this.f33942k2;
    }

    public final void N4(qf.c paymentSummaryEntity) {
        o.i(paymentSummaryEntity, "paymentSummaryEntity");
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.r0.a(this), null, null, new PostAdViewModel$updatePaymentSummary$1(this, paymentSummaryEntity, null), 3, null);
    }

    public final void O1(boolean z11) {
        this.f33942k2.N(z11);
    }

    public final void O3(CreateEditAdvActionType action, PLFMediaTypes pLFMediaTypes, l.a aVar, boolean z11) {
        o.i(action, "action");
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.r0.a(this), null, null, new PostAdViewModel$logMediaAnalytics$1(this, action, pLFMediaTypes, aVar, z11, null), 3, null);
    }

    public final SharedFlow<Boolean> P1() {
        return this.f33925c2;
    }

    public final b0<RegionEntity> P2() {
        return this.X0;
    }

    public final SharedFlow<Boolean> Q1() {
        return this.f33929e2;
    }

    public final SharedFlow<Boolean> Q2() {
        return this.Z0;
    }

    public final void Q3() {
        E3(ErrorReason.NO_ENOUGH_CREDIT.getValue(), W1().getValue());
    }

    public final void Q4(List<Addon> addons) {
        o.i(addons, "addons");
        this.f33939j2.j(addons, this.A0);
    }

    public final StateFlow<com.forsale.app.utils.b0> R1() {
        return this.f33921a2;
    }

    public final SharedFlow<p> R2() {
        return this.f33973w1;
    }

    public final void R3(CreateEditAdvActionType action, l.b bVar) {
        o.i(action, "action");
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.r0.a(this), null, null, new PostAdViewModel$logOnNextClicked$1(this, action, bVar, null), 3, null);
    }

    public final void R4() {
        F1();
        this.f33920a1.postValue(Boolean.TRUE);
        N1(PostAdScreens.MEDIA_SCREEN);
    }

    public final String S1() {
        PLFSource pLFSource;
        if (this.A0 == PostListingIntention.NEW_LISTING) {
            pLFSource = PLFSource.ADD_LISTING;
        } else {
            pLFSource = PLFSource.EDIT_LISTING;
        }
        return pLFSource.getValue();
    }

    public final SharedFlow<p> S2() {
        return this.E1;
    }

    public final AlertModel T1(boolean z11, boolean z12) {
        return this.f33976y0.b(z12, z11);
    }

    public final SharedFlow<Boolean> T2() {
        return this.f33936i1;
    }

    public final Object U1(zz.a<? super Set<String>> aVar) {
        return this.f33946m0.c(aVar);
    }

    public final SharedFlow<p> U2() {
        return this.Q1;
    }

    public final SharedFlow<p> V2() {
        return this.E0;
    }

    public final boolean V3() {
        boolean z11;
        boolean z12;
        CategoryRuleSet.MediaConfiguration media;
        CategoryRuleSet.ImageConfiguration images;
        if (!r3()) {
            return false;
        }
        CategoryRuleSet.RuleSet value = this.f33926d1.getValue();
        if (value != null && (media = value.getMedia()) != null && (images = media.getImages()) != null && images.getPrimaryRequired()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            return false;
        }
        ListingDetailsEntity n22 = n2();
        if (n22 != null && !n22.getHasMediaUploaded()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z12) {
            return false;
        }
        return true;
    }

    public final AggregatedAllAnalyticsLogger.AnalyticsPosition W1() {
        if (c.f34004a[this.A0.ordinal()] == 2) {
            return AggregatedAllAnalyticsLogger.AnalyticsPosition.ADD_LISTING_PAYMENT_BOTTOM_SHEET;
        }
        return AggregatedAllAnalyticsLogger.AnalyticsPosition.EDIT_LISTING_PAYMENT_BOTTOM_SHEET;
    }

    public final PLFSource W2() {
        return this.B0;
    }

    public final void W3(int i11, String label, Integer num) {
        int i12;
        boolean z11;
        String L2;
        o.i(label, "label");
        this.L1.postValue(Integer.valueOf(i11));
        v1(i11);
        b0<String> b0Var = this.J1;
        PostListingIntention value = this.G1.getValue();
        if (value == null) {
            i12 = -1;
        } else {
            i12 = c.f34004a[value.ordinal()];
        }
        if (i12 == 4) {
            L2 = Y1(i11, label);
        } else {
            if (this.G1.getValue() == PostListingIntention.FULL_EDIT) {
                z11 = true;
            } else {
                z11 = false;
            }
            L2 = L2(i11, label, z11, num);
        }
        b0Var.postValue(L2);
    }

    public final List<PostAdAttributesViewModel.a> X1() {
        return this.C1;
    }

    public final LiveData<Integer> X2() {
        return this.f33959q1;
    }

    public final LiveData<String> Y2() {
        return this.K1;
    }

    public final Object Z1(zz.a<? super ListingDetailsEntity> aVar) {
        Object f11;
        if (!this.f33965s1) {
            Object single = this.f33961r0.getSingle(aVar);
            f11 = kotlin.coroutines.intrinsics.b.f();
            if (single == f11) {
                return single;
            }
            return (ListingDetailsEntity) single;
        }
        return null;
    }

    public final SharedFlow<Integer> Z2() {
        return this.O1;
    }

    public final List<String> Z3(String text) {
        List<String> X0;
        o.i(text, "text");
        X0 = CollectionsKt___CollectionsKt.X0(this.f33955p0.prohibitedKeywordsIn(text));
        return X0;
    }

    public final StateFlow<CalculatorEntity> a2() {
        return this.f33933g2;
    }

    public final StateFlow<UserEntity> a3() {
        return this.f33954o2;
    }

    public final void a4(AggregatedAllAnalyticsLogger.CustomEvents event, String source) {
        o.i(event, "event");
        o.i(source, "source");
        AggregatedAllAnalyticsLoggerKt.D(r(), event, true, true, false, null, source, 24, null);
    }

    public final CalculatorViewModel b2() {
        return this.f33939j2;
    }

    public final StateFlow<String> b3() {
        return this.f33948m2;
    }

    public final void b4() {
        a4(AggregatedAllAnalyticsLogger.CustomEvents.BUY_MORE_TOKENS_CLICKED, S1());
    }

    public final b0<Boolean> c2() {
        return this.f33932g1;
    }

    public final void c4(PLFCloseTarget closeTarget) {
        CreateEditAdvActionType createEditAdvActionType;
        o.i(closeTarget, "closeTarget");
        if (this.f33965s1) {
            createEditAdvActionType = CreateEditAdvActionType.EDIT_LISTING_CLOSE_CONFIRMATION_VIEWED;
        } else {
            createEditAdvActionType = CreateEditAdvActionType.ADD_LISTING_CLOSE_CONFIRMATION_VIEWED;
        }
        J3(this, createEditAdvActionType, null, c3(), closeTarget, null, 18, null);
    }

    public final LiveData<CategoryRuleSet.RuleSet> d2() {
        return this.f33926d1;
    }

    public final MutableSharedFlow<Boolean> d3() {
        return this.Y0;
    }

    public final b0<DistrictEntity> e2() {
        return this.f33941k1;
    }

    public final MutableSharedFlow<Boolean> e3() {
        return this.f33934h1;
    }

    public final void e4(PLFSource pLFSource) {
        if (this.f33965s1) {
            J3(this, CreateEditAdvActionType.EDIT_LISTING_VISITED, null, null, null, null, 30, null);
        } else {
            J3(this, CreateEditAdvActionType.ADD_LISTING_VISITED, pLFSource, null, null, null, 28, null);
        }
    }

    public final b0<Boolean> f2() {
        return this.U1;
    }

    public final b0<Integer> f3() {
        return this.f33956p1;
    }

    public final void f4() {
        CreateEditAdvActionType createEditAdvActionType;
        if (this.f33965s1) {
            createEditAdvActionType = CreateEditAdvActionType.EDIT_LISTING_STAY_CLICKED;
        } else {
            createEditAdvActionType = CreateEditAdvActionType.ADD_LISTING_STAY_CLICKED;
        }
        J3(this, createEditAdvActionType, null, c3(), null, null, 26, null);
    }

    public final b0<Boolean> g2() {
        return this.W1;
    }

    public final void g4() {
        a4(AggregatedAllAnalyticsLogger.CustomEvents.SUPPORT_VISITED, PLFSource.PLF.getValue());
    }

    public final String h2(boolean z11, boolean z12, List<Addon> list) {
        return this.f33974x0.a(z11, z12, list);
    }

    public final void h3(ListingDetailsEntity listingDetails) {
        List<Addon> n11;
        o.i(listingDetails, "listingDetails");
        Bundle bundle = listingDetails.getBundle();
        if (bundle == null || (n11 = bundle.getAddons()) == null) {
            n11 = r.n();
        }
        this.f33939j2.i(listingDetails, this.A0, n11);
    }

    public final Object i2(zz.a<? super Boolean> aVar) {
        return this.f33946m0.d(aVar);
    }

    public final b0<MediaStates> j2() {
        return this.f33928e1;
    }

    public final LiveData<Boolean> j3() {
        return this.S1;
    }

    public final PostListingIntention k2() {
        return this.A0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k4(com.forsale.app.features.postad.media.MediaTypes r9, boolean r10, boolean r11, zz.a<? super androidx.work.k> r12) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.PostAdViewModel.k4(com.forsale.app.features.postad.media.MediaTypes, boolean, boolean, zz.a):java.lang.Object");
    }

    public final void l2() {
        this.f33942k2.R();
    }

    public final b0<Boolean> l3() {
        return this.f33967t1;
    }

    public final b0<DistrictEntity> m2() {
        return this.f33938j1;
    }

    public final ObservableBoolean m3() {
        return this.f33975x1;
    }

    public final void m4(int i11, String phoneNumber) {
        String title;
        ListingDetailsEntity n22;
        String description;
        o.i(phoneNumber, "phoneNumber");
        String str = null;
        if (i11 != 13) {
            if (i11 == 15 && (n22 = n2()) != null) {
                ListingDetailsEntity n23 = n2();
                if (n23 != null && (description = n23.getDescription()) != null) {
                    str = kotlin.text.s.C(description, phoneNumber, "", false, 4, null);
                }
                n22.setDescription(str);
                L4(n22);
                return;
            }
            return;
        }
        ListingDetailsEntity n24 = n2();
        if (n24 != null) {
            ListingDetailsEntity n25 = n2();
            if (n25 != null && (title = n25.getTitle()) != null) {
                str = kotlin.text.s.C(title, phoneNumber, "", false, 4, null);
            }
            n24.setTitle(str);
            L4(n24);
        }
    }

    public final ListingDetailsEntity n2() {
        return this.f33962r1.getValue();
    }

    public final LiveData<Boolean> n3() {
        return this.f33979z1;
    }

    public final ListingDetailsEntity o2() {
        return this.f33978z0;
    }

    public final z<Boolean> o3() {
        return this.B1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.viewmodels.BaseViewModel, androidx.lifecycle.q0
    public void onCleared() {
        LiveData<WorkInfo> liveData;
        super.onCleared();
        c0<WorkInfo> c0Var = this.f33957p2;
        if (c0Var != null && (liveData = this.f33960q2) != null) {
            liveData.removeObserver(c0Var);
        }
        this.f33957p2 = null;
    }

    public final b0<ListingDetailsEntity> p2() {
        return this.f33962r1;
    }

    public final z<Boolean> p3() {
        return this.A1;
    }

    public final void p4(boolean z11, MediaTypes mediaTypes, boolean z12, boolean z13) {
        o.i(mediaTypes, "mediaTypes");
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.r0.a(this), null, null, new PostAdViewModel$retryUploadingMedia$1(this, z11, mediaTypes, z12, z13, null), 3, null);
    }

    public final double q2() {
        CalculatorEntity value = this.f33933g2.getValue();
        if (value != null) {
            return value.o();
        }
        return Utils.DOUBLE_EPSILON;
    }

    public final boolean q3() {
        return this.f33965s1;
    }

    public final void r4(CategoryEntity cat, boolean z11) {
        o.i(cat, "cat");
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.r0.a(this), new e(CoroutineExceptionHandler.Key), null, new PostAdViewModel$selectCategory$2(this, cat, z11, null), 2, null);
    }

    public final LiveData<Boolean> s2() {
        return this.f33922b1;
    }

    public final boolean s3() {
        boolean z11;
        if (!r3()) {
            return false;
        }
        ListingDetailsEntity n22 = n2();
        if (n22 != null && !n22.isImagesUploaded()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            return false;
        }
        return true;
    }

    public final LiveData<Boolean> t2() {
        return this.M1;
    }

    public final boolean t3() {
        boolean z11;
        if (!r3()) {
            return false;
        }
        ListingDetailsEntity n22 = n2();
        if (n22 != null && n22.isImagesUploaded()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            return false;
        }
        return true;
    }

    public final void t4(DistrictEntity districtEntity, DistrictEntity districtEntity2, boolean z11) {
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.r0.a(this), null, null, new PostAdViewModel$selectLocations$1(this, districtEntity, districtEntity2, z11, null), 3, null);
    }

    public final SharedFlow<p> u2() {
        return this.O0;
    }

    public final boolean u3() {
        boolean z11;
        CategoryRuleSet.MediaConfiguration media;
        CategoryRuleSet.ImageConfiguration images;
        if (!s3()) {
            return false;
        }
        CategoryRuleSet.RuleSet value = this.f33926d1.getValue();
        if (value != null && (media = value.getMedia()) != null && (images = media.getImages()) != null && images.getPrimaryRequired()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            return false;
        }
        return true;
    }

    public final SharedFlow<p> v2() {
        return this.K0;
    }

    public final boolean v3() {
        if (u3()) {
            this.f33932g1.setValue(Boolean.TRUE);
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.r0.a(this), null, null, new PostAdViewModel$isMediaFailedBeforeUpload$1(this, null), 3, null);
            return true;
        }
        return false;
    }

    public final void v4(PostAdScreens postAdScreens, com.forsale.app.utils.b0 b0Var) {
        o.i(postAdScreens, "postAdScreens");
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.r0.a(this), null, null, new PostAdViewModel$setActionButtonText$1(this, postAdScreens, b0Var, null), 3, null);
    }

    public final void w1(String detectedPhone) {
        o.i(detectedPhone, "detectedPhone");
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.r0.a(this), null, null, new PostAdViewModel$addNumberToAlternate$1(this, detectedPhone, null), 3, null);
    }

    public final SharedFlow<p> w2() {
        return this.U0;
    }

    public final boolean w3() {
        CategoryRuleSet.MediaConfiguration media;
        CategoryRuleSet.ImageConfiguration images;
        CategoryRuleSet.RuleSet value = this.f33926d1.getValue();
        if (value != null && (media = value.getMedia()) != null && (images = media.getImages()) != null) {
            return images.getPrimaryRequired();
        }
        return false;
    }

    public final SharedFlow<p> x2() {
        return this.W0;
    }

    public final Object x3(zz.a<? super Boolean> aVar) {
        return this.f33970v0.r(aVar);
    }

    public final Object x4(boolean z11, zz.a<? super p> aVar) {
        Object f11;
        Object h11 = this.f33946m0.h(z11, aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (h11 == f11) {
            return h11;
        }
        return p.f75480a;
    }

    public final void y1(String prohibtedKeyword) {
        HashSet hashSet;
        List<String> prohibtedKeyWords;
        o.i(prohibtedKeyword, "prohibtedKeyword");
        ListingDetailsEntity n22 = n2();
        List<String> list = null;
        if (n22 != null && (prohibtedKeyWords = n22.getProhibtedKeyWords()) != null) {
            hashSet = CollectionsKt___CollectionsKt.V0(prohibtedKeyWords);
        } else {
            hashSet = null;
        }
        if (hashSet != null) {
            hashSet.add(prohibtedKeyword);
        }
        ListingDetailsEntity n23 = n2();
        if (n23 != null) {
            if (hashSet != null) {
                list = CollectionsKt___CollectionsKt.X0(hashSet);
            }
            n23.setProhibtedKeyWords(list);
            n23.setAttemptAbuse(1);
        }
    }

    public final SharedFlow<p> y2() {
        return this.M0;
    }

    public final boolean y3() {
        if (this.f33930f1.getValue() != MediaStates.FAILED && this.f33930f1.getValue() != MediaStates.LOADING && this.f33930f1.getValue() != MediaStates.RETRY) {
            return false;
        }
        return true;
    }

    public final SharedFlow<p> z2() {
        return this.I0;
    }

    public final void z3() {
        d4();
        I4();
    }
}
