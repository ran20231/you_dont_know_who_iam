package com.forsale.app.features.categories.listings.items.promotedPost;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.b0;
import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.database.InAppMessageEntity;
import com.forsale.app.datalayer.database.RegionEntity;
import com.forsale.app.datalayer.network.services.ListingsService;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.PromotedPostSource;
import java.util.List;
import kotlin.collections.q;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import t9.r0;
import wz.h;
import wz.p;
/* compiled from: PromotedPostItemViewModel.kt */
/* loaded from: classes2.dex */
public final class PromotedPostItemViewModel extends qc.b<p> {
    public static final a O = new a(null);
    public static final int P = 8;
    private final b0<List<Integer>> A;
    private final b0<List<Integer>> B;
    private final b0<Boolean> C;
    private final MutableStateFlow<InAppMessageEntity> D;
    private final StateFlow<InAppMessageEntity> E;
    private final b0<Integer> F;
    private final OneShotEventHandler<Integer> G;
    private final OneShotEventHandler<p> H;
    private final b0<Boolean> I;
    private final LiveData<Boolean> J;
    private boolean K;
    private boolean L;
    private final StateFlow<Long> M;
    private final b0<Integer> N;

    /* renamed from: c  reason: collision with root package name */
    private final CoroutineScope f30867c;

    /* renamed from: d  reason: collision with root package name */
    private final BaseViewModel f30868d;

    /* renamed from: e  reason: collision with root package name */
    private final AggregatedAllAnalyticsLogger f30869e;

    /* renamed from: f  reason: collision with root package name */
    private final ListingsService f30870f;

    /* renamed from: g  reason: collision with root package name */
    private final PromotedPostSource f30871g;

    /* renamed from: h  reason: collision with root package name */
    private final CategoryEntity f30872h;

    /* renamed from: i  reason: collision with root package name */
    private final OneShotEventHandler<p> f30873i;

    /* renamed from: j  reason: collision with root package name */
    private final g00.a<p> f30874j;

    /* renamed from: x  reason: collision with root package name */
    private final g00.a<p> f30875x;

    /* renamed from: y  reason: collision with root package name */
    private final MutableStateFlow<PromotedPostState> f30876y;

    /* renamed from: z  reason: collision with root package name */
    private final h f30877z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PromotedPostItemViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class PromotedPostState {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ PromotedPostState[] $VALUES;
        public static final PromotedPostState PAUSED = new PromotedPostState("PAUSED", 0);
        public static final PromotedPostState SHOWN = new PromotedPostState("SHOWN", 1);
        public static final PromotedPostState NOT_SHOWN = new PromotedPostState("NOT_SHOWN", 2);

        private static final /* synthetic */ PromotedPostState[] $values() {
            return new PromotedPostState[]{PAUSED, SHOWN, NOT_SHOWN};
        }

        static {
            PromotedPostState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private PromotedPostState(String str, int i11) {
        }

        public static a00.a<PromotedPostState> getEntries() {
            return $ENTRIES;
        }

        public static PromotedPostState valueOf(String str) {
            return (PromotedPostState) Enum.valueOf(PromotedPostState.class, str);
        }

        public static PromotedPostState[] values() {
            return (PromotedPostState[]) $VALUES.clone();
        }
    }

    /* compiled from: PromotedPostItemViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PromotedPostItemViewModel(CoroutineScope coroutineScope, BaseViewModel baseViewModel, AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, ListingsService listingsService, PromotedPostSource promotedPostSource, CategoryEntity categoryEntity, LiveData liveData, OneShotEventHandler oneShotEventHandler, g00.a aVar, g00.a aVar2, MutableStateFlow mutableStateFlow, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineScope, baseViewModel, aggregatedAllAnalyticsLogger, listingsService, promotedPostSource, categoryEntity, liveData, (i11 & 128) != 0 ? null : oneShotEventHandler, (i11 & 256) != 0 ? new g00.a<p>() { // from class: com.forsale.app.features.categories.listings.items.promotedPost.PromotedPostItemViewModel.1
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // g00.a
            public /* bridge */ /* synthetic */ p invoke() {
                invoke2();
                return p.f75480a;
            }
        } : aVar, aVar2, (i11 & 1024) != 0 ? null : mutableStateFlow);
    }

    public static /* synthetic */ void B(PromotedPostItemViewModel promotedPostItemViewModel, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = null;
        }
        promotedPostItemViewModel.A(bool);
    }

    private final void E(int i11) {
        BuildersKt__Builders_commonKt.launch$default(this.f30867c, Dispatchers.getIO().plus(new b(CoroutineExceptionHandler.Key)), null, new PromotedPostItemViewModel$getListingDetails$2(this, i11, null), 2, null);
    }

    private final List<Integer> F() {
        return (List) this.f30877z.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InAppMessageEntity G() {
        return this.D.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p L() {
        InAppMessageEntity G = G();
        if (G != null) {
            this.f30868d.l0(G);
            return p.f75480a;
        }
        return null;
    }

    private final p M() {
        InAppMessageEntity G = G();
        if (G != null) {
            this.f30868d.m0(G);
            return p.f75480a;
        }
        return null;
    }

    private final void O(AggregatedAllAnalyticsLogger.InAppActionEvents inAppActionEvents, Boolean bool) {
        BuildersKt__Builders_commonKt.launch$default(this.f30867c, null, null, new PromotedPostItemViewModel$logAnalytics$1(this, inAppActionEvents, bool, null), 3, null);
    }

    static /* synthetic */ void P(PromotedPostItemViewModel promotedPostItemViewModel, AggregatedAllAnalyticsLogger.InAppActionEvents inAppActionEvents, Boolean bool, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            bool = null;
        }
        promotedPostItemViewModel.O(inAppActionEvents, bool);
    }

    private final void R() {
        P(this, AggregatedAllAnalyticsLogger.InAppActionEvents.ANIMATED_LISTING_OPENED, null, 2, null);
    }

    private final void S(Boolean bool) {
        O(AggregatedAllAnalyticsLogger.InAppActionEvents.ANIMATED_LISTING_VIEWED, bool);
    }

    private final void U() {
        x10.a.b("PROMOTED: resetPromotedPost", new Object[0]);
        this.D.tryEmit(null);
        u();
    }

    private final void V(InAppMessageEntity inAppMessageEntity) {
        this.D.tryEmit(inAppMessageEntity);
    }

    private final void X() {
        this.C.postValue(Boolean.TRUE);
    }

    private final void q() {
        x10.a.b("PROMOTED: cancel cancelAnimationEvent", new Object[0]);
        this.K = true;
        this.H.i(p.f75480a);
        this.C.postValue(Boolean.FALSE);
    }

    private final void s(InAppMessageEntity inAppMessageEntity) {
        x10.a.b("PROMOTED: checkPromotedExpireSoon", new Object[0]);
        BuildersKt__Builders_commonKt.launch$default(this.f30867c, null, null, new PromotedPostItemViewModel$checkPromotedExpireSoon$1(this, inAppMessageEntity, null), 3, null);
    }

    static /* synthetic */ void t(PromotedPostItemViewModel promotedPostItemViewModel, InAppMessageEntity inAppMessageEntity, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            inAppMessageEntity = null;
        }
        promotedPostItemViewModel.s(inAppMessageEntity);
    }

    private final void v(List<Integer> list, List<Integer> list2) {
        x10.a.b("PROMOTED: consumePromotedPost " + list + " " + list2, new Object[0]);
        BuildersKt__Builders_commonKt.launch$default(this.f30867c, null, null, new PromotedPostItemViewModel$consumePromotedPost$1(list2, this, list, null), 3, null);
    }

    private final void w() {
        x10.a.b("PROMOTED: deletePromotedPost", new Object[0]);
        x();
        K();
    }

    private final p x() {
        InAppMessageEntity G = G();
        if (G != null) {
            this.f30868d.p(G);
            return p.f75480a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void z(PromotedPostItemViewModel promotedPostItemViewModel, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = null;
        }
        if ((i11 & 2) != 0) {
            list2 = null;
        }
        promotedPostItemViewModel.y(list, list2);
    }

    public final void A(Boolean bool) {
        w();
        this.L = true;
        S(bool);
    }

    public final OneShotEventHandler<p> C() {
        return this.H;
    }

    public final OneShotEventHandler<Integer> D() {
        return this.G;
    }

    public final StateFlow<Long> H() {
        return this.M;
    }

    public final StateFlow<InAppMessageEntity> I() {
        return this.E;
    }

    public final LiveData<Boolean> J() {
        return this.J;
    }

    public final void K() {
        x10.a.b("PROMOTED: hidePromotedPost", new Object[0]);
        BuildersKt__Builders_commonKt.launch$default(this.f30867c, null, null, new PromotedPostItemViewModel$hidePromotedPost$1(this, null), 3, null);
    }

    public final boolean N() {
        return this.K;
    }

    public final void Q() {
        M();
        U();
        r();
        w();
        Y();
        this.G.i(this.N.getValue());
        R();
    }

    public final void T() {
        if (!this.L) {
            P(this, AggregatedAllAnalyticsLogger.InAppActionEvents.ANIMATED_LISTING_STARTED, null, 2, null);
        }
    }

    public final void W(InAppMessageEntity inAppMessageEntity) {
        o.i(inAppMessageEntity, "inAppMessageEntity");
        boolean z11 = false;
        x10.a.b("PROMOTED: setPromotedPostAndCheck", new Object[0]);
        V(inAppMessageEntity);
        b0<Boolean> b0Var = this.I;
        String image = inAppMessageEntity.getImage();
        if (image == null || image.length() == 0) {
            z11 = true;
        }
        b0Var.postValue(Boolean.valueOf(!z11));
        Integer itemId = inAppMessageEntity.getItemId();
        if (itemId != null) {
            int intValue = itemId.intValue();
            this.N.postValue(Integer.valueOf(intValue));
            E(intValue);
        }
        s(inAppMessageEntity);
    }

    public final void Y() {
        x10.a.b("PROMOTED: setPromotedPostShownAndCheckForExpireSoonItems", new Object[0]);
        X();
        t(this, null, 1, null);
    }

    public final void r() {
        x10.a.b("PROMOTED: cancelAndHide", new Object[0]);
        q();
        K();
    }

    public final void u() {
        this.K = false;
        this.L = false;
    }

    public final void y(List<Integer> list, List<Integer> list2) {
        x10.a.b("PROMOTED: fetchPromotePost " + list + " " + list2, new Object[0]);
        if (list == null) {
            CategoryEntity categoryEntity = this.f30872h;
            if (categoryEntity != null) {
                list = q.e(Integer.valueOf(categoryEntity.getId()));
            } else {
                list = null;
            }
        }
        if (list2 == null) {
            list2 = F();
        }
        this.A.postValue(list);
        this.B.postValue(list2);
        v(list, list2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromotedPostItemViewModel(CoroutineScope coroutineScope, BaseViewModel baseViewModel, AggregatedAllAnalyticsLogger analyticsLogger, ListingsService listingsService, PromotedPostSource source, CategoryEntity categoryEntity, final LiveData<RegionEntity> region, OneShotEventHandler<p> oneShotEventHandler, g00.a<p> hide, g00.a<p> nextAction, MutableStateFlow<PromotedPostState> mutableStateFlow) {
        super(r0.J6, null);
        h a11;
        o.i(coroutineScope, "coroutineScope");
        o.i(baseViewModel, "baseViewModel");
        o.i(analyticsLogger, "analyticsLogger");
        o.i(listingsService, "listingsService");
        o.i(source, "source");
        o.i(region, "region");
        o.i(hide, "hide");
        o.i(nextAction, "nextAction");
        this.f30867c = coroutineScope;
        this.f30868d = baseViewModel;
        this.f30869e = analyticsLogger;
        this.f30870f = listingsService;
        this.f30871g = source;
        this.f30872h = categoryEntity;
        this.f30873i = oneShotEventHandler;
        this.f30874j = hide;
        this.f30875x = nextAction;
        this.f30876y = mutableStateFlow;
        a11 = d.a(new g00.a<List<? extends Integer>>() { // from class: com.forsale.app.features.categories.listings.items.promotedPost.PromotedPostItemViewModel$mainDistrict$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            public final List<? extends Integer> invoke() {
                Integer mainDistrictId;
                List<? extends Integer> e11;
                RegionEntity value = region.getValue();
                if (value == null || (mainDistrictId = value.getMainDistrictId()) == null) {
                    return null;
                }
                e11 = q.e(Integer.valueOf(mainDistrictId.intValue()));
                return e11;
            }
        });
        this.f30877z = a11;
        this.A = new b0<>(categoryEntity != null ? q.e(Integer.valueOf(categoryEntity.getId())) : null);
        this.B = new b0<>();
        Boolean bool = Boolean.FALSE;
        this.C = new b0<>(bool);
        final MutableStateFlow<InAppMessageEntity> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.D = MutableStateFlow;
        this.E = FlowKt.asStateFlow(MutableStateFlow);
        this.F = new b0<>();
        this.G = new OneShotEventHandler<>(null, 0, 3, null);
        this.H = new OneShotEventHandler<>(null, 0, 3, null);
        b0<Boolean> b0Var = new b0<>(bool);
        this.I = b0Var;
        this.J = b0Var;
        this.M = FlowKt.stateIn(new Flow<Long>() { // from class: com.forsale.app.features.categories.listings.items.promotedPost.PromotedPostItemViewModel$special$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.forsale.app.features.categories.listings.items.promotedPost.PromotedPostItemViewModel$special$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ FlowCollector f30879a;

                /* compiled from: Emitters.kt */
                @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.items.promotedPost.PromotedPostItemViewModel$special$$inlined$map$1$2", f = "PromotedPostItemViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.forsale.app.features.categories.listings.items.promotedPost.PromotedPostItemViewModel$special$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f30880a;

                    /* renamed from: b  reason: collision with root package name */
                    int f30881b;

                    public AnonymousClass1(zz.a aVar) {
                        super(aVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f30880a = obj;
                        this.f30881b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f30879a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r9, zz.a r10) {
                    /*
                        r8 = this;
                        boolean r0 = r10 instanceof com.forsale.app.features.categories.listings.items.promotedPost.PromotedPostItemViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r10
                        com.forsale.app.features.categories.listings.items.promotedPost.PromotedPostItemViewModel$special$$inlined$map$1$2$1 r0 = (com.forsale.app.features.categories.listings.items.promotedPost.PromotedPostItemViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f30881b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f30881b = r1
                        goto L18
                    L13:
                        com.forsale.app.features.categories.listings.items.promotedPost.PromotedPostItemViewModel$special$$inlined$map$1$2$1 r0 = new com.forsale.app.features.categories.listings.items.promotedPost.PromotedPostItemViewModel$special$$inlined$map$1$2$1
                        r0.<init>(r10)
                    L18:
                        java.lang.Object r10 = r0.f30880a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.f30881b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r10)
                        goto L73
                    L29:
                        java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                        java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                        r9.<init>(r10)
                        throw r9
                    L31:
                        kotlin.f.b(r10)
                        kotlinx.coroutines.flow.FlowCollector r10 = r8.f30879a
                        com.forsale.app.datalayer.database.InAppMessageEntity r9 = (com.forsale.app.datalayer.database.InAppMessageEntity) r9
                        r4 = 5000(0x1388, double:2.4703E-320)
                        if (r9 == 0) goto L66
                        int r2 = r9.getDuration()
                        java.lang.StringBuilder r6 = new java.lang.StringBuilder
                        r6.<init>()
                        java.lang.String r7 = "PROMOTED: inAppMessagesEntity:: Duration:: "
                        r6.append(r7)
                        r6.append(r2)
                        java.lang.String r2 = r6.toString()
                        r6 = 0
                        java.lang.Object[] r6 = new java.lang.Object[r6]
                        x10.a.b(r2, r6)
                        int r2 = r9.getDuration()
                        if (r2 != 0) goto L5e
                        goto L66
                    L5e:
                        int r9 = r9.getDuration()
                        long r4 = (long) r9
                        r6 = 1000(0x3e8, double:4.94E-321)
                        long r4 = r4 * r6
                    L66:
                        java.lang.Long r9 = kotlin.coroutines.jvm.internal.a.e(r4)
                        r0.f30881b = r3
                        java.lang.Object r9 = r10.emit(r9, r0)
                        if (r9 != r1) goto L73
                        return r1
                    L73:
                        wz.p r9 = wz.p.f75480a
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.items.promotedPost.PromotedPostItemViewModel$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zz.a):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Long> flowCollector, zz.a aVar) {
                Object f11;
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), aVar);
                f11 = b.f();
                if (collect == f11) {
                    return collect;
                }
                return p.f75480a;
            }
        }, coroutineScope, SharingStarted.Companion.getEagerly(), 5000L);
        this.N = new b0<>();
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
