package com.forsale.app.features.categories.home.propertyhome;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.b0;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.r0;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.database.MasterDataMiscModel;
import com.forsale.app.datalayer.database.RegionEntity;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.datalayer.network.responses.ListingsResponse;
import com.forsale.app.datalayer.network.responses.RecommendedSectionsResponse;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.features.categories.home.CardDisplayTypes;
import com.forsale.app.features.categories.home.propertyhome.b;
import com.forsale.app.features.categories.home.propertyhome.interactors.HotZoneInterActor;
import com.forsale.app.features.categories.home.propertyhome.interactors.MiscInterActor;
import com.forsale.app.features.categories.home.propertyhome.interactors.PropertyServicesInterActor;
import com.forsale.app.features.categories.home.propertyhome.interactors.RecommendedSectionsInterActor;
import com.forsale.app.features.categories.home.propertyhome.interactors.SubCategoriesInterActor;
import com.forsale.app.features.categories.home.propertyhome.models.SectionState;
import com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData;
import com.forsale.app.features.categories.listings.items.forProperty.ForPropertyListingItemViewModel;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.AnalyticsDetailsSource;
import com.forsale.app.utils.analytics.HomeVisitedSources;
import com.forsale.app.utils.analytics.propertyhome.PropertySectionName;
import com.forsale.app.utils.analytics.propertyhome.VerticalPageSwiped;
import g00.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.i0;
import kotlin.collections.j0;
import kotlin.collections.r;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import wz.h;
import wz.i;
/* compiled from: PropertyHomeViewModel.kt */
/* loaded from: classes2.dex */
public final class PropertyHomeViewModel extends q0 {
    private final MutableSharedFlow<CategoryEntity> A;
    private final MutableSharedFlow<CategoryEntity> B;
    private final MutableStateFlow<SectionState> C;
    private final MutableSharedFlow<xa.a> D;
    private final MutableStateFlow<ListingsResponse> E;
    private final MutableStateFlow<Integer> F;
    private final MutableStateFlow<xa.b> G;
    private final MutableStateFlow<SectionState> H;
    private final MutableStateFlow<Boolean> I;
    private final MutableStateFlow<SectionState> J;
    private final MutableStateFlow<SectionState> K;
    private final p<ListingItemBrief, List<? extends Object>, wz.p> L;
    private final MutableStateFlow<SectionState> M;
    private final HashMap<String, s9.a> N;

    /* renamed from: a  reason: collision with root package name */
    private final wa.a f24790a;

    /* renamed from: b  reason: collision with root package name */
    private final SubCategoriesInterActor f24791b;

    /* renamed from: c  reason: collision with root package name */
    private final ApplicationResourcesRepository f24792c;

    /* renamed from: d  reason: collision with root package name */
    private final PropertyServicesInterActor f24793d;

    /* renamed from: e  reason: collision with root package name */
    private final RecommendedSectionsInterActor f24794e;

    /* renamed from: f  reason: collision with root package name */
    private final MiscInterActor f24795f;

    /* renamed from: g  reason: collision with root package name */
    private final HotZoneInterActor f24796g;

    /* renamed from: h  reason: collision with root package name */
    private final AggregatedAllAnalyticsLogger f24797h;

    /* renamed from: i  reason: collision with root package name */
    private final CategoryEntity f24798i;

    /* renamed from: j  reason: collision with root package name */
    private final Integer f24799j;

    /* renamed from: x  reason: collision with root package name */
    private final h f24800x;

    /* renamed from: y  reason: collision with root package name */
    private final MutableSharedFlow<String> f24801y;

    /* renamed from: z  reason: collision with root package name */
    private final MutableStateFlow<SectionState> f24802z;

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PropertyHomeViewModel f24803a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CoroutineExceptionHandler.Key key, PropertyHomeViewModel propertyHomeViewModel) {
            super(key);
            this.f24803a = propertyHomeViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            this.f24803a.C().setValue(new SectionState.b(th2));
        }
    }

    public PropertyHomeViewModel(wa.a forSaleRealityInterActor, SubCategoriesInterActor subCategoriesInterActor, ApplicationResourcesRepository resourcesRepository, PropertyServicesInterActor propertyServicesInterActor, RecommendedSectionsInterActor recommendedSectionsInterActor, MiscInterActor miscInterActor, HotZoneInterActor htoZoneInterActor, AggregatedAllAnalyticsLogger analyticsLogger, final k0 savedStateHandle) {
        h a11;
        o.i(forSaleRealityInterActor, "forSaleRealityInterActor");
        o.i(subCategoriesInterActor, "subCategoriesInterActor");
        o.i(resourcesRepository, "resourcesRepository");
        o.i(propertyServicesInterActor, "propertyServicesInterActor");
        o.i(recommendedSectionsInterActor, "recommendedSectionsInterActor");
        o.i(miscInterActor, "miscInterActor");
        o.i(htoZoneInterActor, "htoZoneInterActor");
        o.i(analyticsLogger, "analyticsLogger");
        o.i(savedStateHandle, "savedStateHandle");
        this.f24790a = forSaleRealityInterActor;
        this.f24791b = subCategoriesInterActor;
        this.f24792c = resourcesRepository;
        this.f24793d = propertyServicesInterActor;
        this.f24794e = recommendedSectionsInterActor;
        this.f24795f = miscInterActor;
        this.f24796g = htoZoneInterActor;
        this.f24797h = analyticsLogger;
        b.a aVar = b.f24978d;
        this.f24798i = aVar.b(savedStateHandle).a();
        this.f24799j = Integer.valueOf(aVar.b(savedStateHandle).b());
        a11 = kotlin.d.a(new g00.a<HomeVisitedSources>() { // from class: com.forsale.app.features.categories.home.propertyhome.PropertyHomeViewModel$source$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final HomeVisitedSources invoke() {
                return b.f24978d.b(k0.this).c();
            }
        });
        this.f24800x = a11;
        this.f24801y = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        SectionState.c cVar = SectionState.c.f25085a;
        this.f24802z = StateFlowKt.MutableStateFlow(cVar);
        this.A = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.B = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.C = StateFlowKt.MutableStateFlow(cVar);
        this.D = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.E = StateFlowKt.MutableStateFlow(new ListingsResponse(0, 0, 0, null, 0, null, null, null, 255, null));
        this.F = StateFlowKt.MutableStateFlow(1);
        this.G = StateFlowKt.MutableStateFlow(new xa.b());
        this.H = StateFlowKt.MutableStateFlow(cVar);
        this.I = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.J = StateFlowKt.MutableStateFlow(cVar);
        this.K = StateFlowKt.MutableStateFlow(cVar);
        this.L = new p<ListingItemBrief, List<? extends Object>, wz.p>() { // from class: com.forsale.app.features.categories.home.propertyhome.PropertyHomeViewModel$analyticLambda$1
            public final void b(ListingItemBrief brief, List<? extends Object> list) {
                o.i(brief, "brief");
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ wz.p invoke(ListingItemBrief listingItemBrief, List<? extends Object> list) {
                b(listingItemBrief, list);
                return wz.p.f75480a;
            }
        };
        this.M = StateFlowKt.MutableStateFlow(cVar);
        this.N = new HashMap<>();
        Y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HomeVisitedSources F() {
        return (HomeVisitedSources) this.f24800x.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(10:5|6|7|(1:(1:(4:(1:(1:(3:14|15|16)(2:18|19))(1:20))(1:22)|21|15|16)(6:23|24|25|(2:27|(1:29))(2:30|(1:32))|15|16))(1:33))(2:37|(1:39)(1:40))|34|(1:36)|25|(0)(0)|15|16))|45|6|7|(0)(0)|34|(0)|25|(0)(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e4, code lost:
        r4 = r4.J;
        r6 = new com.forsale.app.features.categories.home.propertyhome.models.SectionState.b(r0);
        r2.f24809a = null;
        r2.f24812d = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f4, code lost:
        if (r4.emit(r6, r2) == r3) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f6, code lost:
        return r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0094 A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:19:0x0046, B:23:0x0054, B:35:0x0083, B:37:0x0094, B:40:0x00d5, B:32:0x0076), top: B:48:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d5 A[Catch: all -> 0x0058, TRY_LEAVE, TryCatch #0 {all -> 0x0058, blocks: (B:19:0x0046, B:23:0x0054, B:35:0x0083, B:37:0x0094, B:40:0x00d5, B:32:0x0076), top: B:48:0x0029 }] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.forsale.app.features.categories.home.propertyhome.PropertyHomeViewModel, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H(zz.a<? super wz.p> r18) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.propertyhome.PropertyHomeViewModel.H(zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I(zz.a<? super wz.p> r13) {
        /*
            Method dump skipped, instructions count: 197
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.propertyhome.PropertyHomeViewModel.I(zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J(zz.a<? super wz.p> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.forsale.app.features.categories.home.propertyhome.PropertyHomeViewModel$loadMiscData$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.features.categories.home.propertyhome.PropertyHomeViewModel$loadMiscData$1 r0 = (com.forsale.app.features.categories.home.propertyhome.PropertyHomeViewModel$loadMiscData$1) r0
            int r1 = r0.f24821d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24821d = r1
            goto L18
        L13:
            com.forsale.app.features.categories.home.propertyhome.PropertyHomeViewModel$loadMiscData$1 r0 = new com.forsale.app.features.categories.home.propertyhome.PropertyHomeViewModel$loadMiscData$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f24819b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f24821d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r6)
            goto L5a
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.f24818a
            kotlinx.coroutines.flow.MutableStateFlow r2 = (kotlinx.coroutines.flow.MutableStateFlow) r2
            kotlin.f.b(r6)
            goto L4e
        L3c:
            kotlin.f.b(r6)
            kotlinx.coroutines.flow.MutableStateFlow<xa.b> r2 = r5.G
            com.forsale.app.features.categories.home.propertyhome.interactors.MiscInterActor r6 = r5.f24795f
            r0.f24818a = r2
            r0.f24821d = r4
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r4 = 0
            r0.f24818a = r4
            r0.f24821d = r3
            java.lang.Object r6 = r2.emit(r6, r0)
            if (r6 != r1) goto L5a
            return r1
        L5a:
            wz.p r6 = wz.p.f75480a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.propertyhome.PropertyHomeViewModel.J(zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:3|(4:5|6|7|8))|53|6|7|8) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c1, code lost:
        r4 = r2.C;
        r5 = new com.forsale.app.features.categories.home.propertyhome.models.SectionState.b(r14);
        r0.f24822a = r2;
        r0.f24825d = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d1, code lost:
        if (r4.emit(r5, r0) == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d3, code lost:
        return r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2 A[Catch: all -> 0x003b, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x003b, blocks: (B:14:0x0036, B:40:0x00a2), top: B:55:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00da  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K(zz.a<? super wz.p> r14) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.propertyhome.PropertyHomeViewModel.K(zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(2:3|(4:5|6|7|8))|76|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00da A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003d, B:61:0x013b, B:52:0x0109, B:54:0x010f, B:56:0x0117, B:57:0x011a, B:62:0x0173, B:44:0x00ce, B:46:0x00da, B:65:0x0199, B:40:0x00b3), top: B:73:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010f A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003d, B:61:0x013b, B:52:0x0109, B:54:0x010f, B:56:0x0117, B:57:0x011a, B:62:0x0173, B:44:0x00ce, B:46:0x00da, B:65:0x0199, B:40:0x00b3), top: B:73:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0173 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003d, B:61:0x013b, B:52:0x0109, B:54:0x010f, B:56:0x0117, B:57:0x011a, B:62:0x0173, B:44:0x00ce, B:46:0x00da, B:65:0x0199, B:40:0x00b3), top: B:73:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0199 A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003d, B:61:0x013b, B:52:0x0109, B:54:0x010f, B:56:0x0117, B:57:0x011a, B:62:0x0173, B:44:0x00ce, B:46:0x00da, B:65:0x0199, B:40:0x00b3), top: B:73:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c5 A[RETURN] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.forsale.app.features.categories.home.propertyhome.PropertyHomeViewModel] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0134 -> B:61:0x013b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L(zz.a<? super wz.p> r20) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.propertyhome.PropertyHomeViewModel.L(zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(14:1|(2:3|(12:5|6|7|(1:(1:(4:(1:(1:(3:14|15|16)(2:18|19))(1:20))(1:22)|21|15|16)(8:23|24|25|(1:30)|35|(1:37)|15|16))(1:38))(2:42|(1:44)(1:45))|39|(1:41)|25|(2:27|30)|35|(0)|15|16))|50|6|7|(0)(0)|39|(0)|25|(0)|35|(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009b, code lost:
        r0 = r4.f24802z;
        r6 = com.forsale.app.features.categories.home.propertyhome.models.SectionState.a.f25083a;
        r2.f24835a = r4;
        r2.f24838d = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a7, code lost:
        if (r0.emit(r6, r2) != r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a9, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c9, code lost:
        r4 = r4.f24802z;
        r6 = new com.forsale.app.features.categories.home.propertyhome.models.SectionState.b(r0);
        r2.f24835a = null;
        r2.f24838d = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d9, code lost:
        if (r4.emit(r6, r2) == r3) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00db, code lost:
        return r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091 A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:19:0x0046, B:23:0x0054, B:35:0x0089, B:37:0x0091, B:42:0x009b, B:45:0x00aa, B:32:0x0076), top: B:53:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c8 A[RETURN] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.forsale.app.features.categories.home.propertyhome.PropertyHomeViewModel, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M(zz.a<? super wz.p> r18) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.propertyhome.PropertyHomeViewModel.M(zz.a):java.lang.Object");
    }

    private final List<ForPropertyListingItemViewModel> Q(List<ListingItemBrief> list, int i11, xa.b bVar, Pair<? extends List<String>, ? extends List<String>> pair) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (ListingItemBrief listingItemBrief : list) {
                b0 b0Var = new b0(bVar.b());
                b0 b0Var2 = new b0(bVar.a());
                ListingsResponse.UISettings.ListingsSettings listingsSettings = new ListingsResponse.UISettings.ListingsSettings(null, null, null, null, null, 0, 0, 127, null);
                PropertySectionName propertySectionName = PropertySectionName.RECOMMENDED_FILTERS;
                arrayList.add(S(listingItemBrief, b0Var, b0Var2, listingsSettings, propertySectionName.getSectionOrder() + i11, propertySectionName, AnalyticsDetailsSource.RECOMMENDED_FILTER.getValue(), pair.c(), pair.d()));
            }
        }
        return arrayList;
    }

    private final ForPropertyListingItemViewModel S(ListingItemBrief listingItemBrief, LiveData<RegionEntity> liveData, LiveData<MasterDataMiscModel> liveData2, ListingsResponse.UISettings.ListingsSettings listingsSettings, final int i11, final PropertySectionName propertySectionName, String str, final List<String> list, final List<String> list2) {
        ListingsResponse.UISettings.ListingsSettings listingsSettings2;
        List n11;
        if (listingsSettings == null) {
            listingsSettings2 = new ListingsResponse.UISettings.ListingsSettings(null, null, null, null, null, 0, 0, 127, null);
        } else {
            listingsSettings2 = listingsSettings;
        }
        ApplicationResourcesRepository applicationResourcesRepository = this.f24792c;
        p<ListingItemBrief, List<? extends Object>, wz.p> pVar = this.L;
        CardDisplayTypes cardDisplayTypes = CardDisplayTypes.STACKED;
        n11 = r.n();
        return new ForPropertyListingItemViewModel(listingItemBrief, listingsSettings2, liveData, liveData2, applicationResourcesRepository, pVar, -1, str, new g00.r<ListingItemBrief, Integer, Integer, ListingDetailsSearchAnalyticsData, wz.p>() { // from class: com.forsale.app.features.categories.home.propertyhome.PropertyHomeViewModel$mapToForPropertyListingItemViewModel$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            public final void b(ListingItemBrief listingItem, int i12, int i13, ListingDetailsSearchAnalyticsData listingDetailsSearchAnalyticsData) {
                o.i(listingItem, "listingItem");
                PropertyHomeViewModel.this.X(new xa.a(listingItem, i11, propertySectionName, i12, i13, list, list2));
            }

            @Override // g00.r
            public /* bridge */ /* synthetic */ wz.p d(ListingItemBrief listingItemBrief2, Integer num, Integer num2, ListingDetailsSearchAnalyticsData listingDetailsSearchAnalyticsData) {
                b(listingItemBrief2, num.intValue(), num2.intValue(), listingDetailsSearchAnalyticsData);
                return wz.p.f75480a;
            }
        }, false, true, cardDisplayTypes, null, null, null, n11, 29184, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ ForPropertyListingItemViewModel T(PropertyHomeViewModel propertyHomeViewModel, ListingItemBrief listingItemBrief, LiveData liveData, LiveData liveData2, ListingsResponse.UISettings.ListingsSettings listingsSettings, int i11, PropertySectionName propertySectionName, String str, List list, List list2, int i12, Object obj) {
        List list3;
        List list4;
        List n11;
        List n12;
        if ((i12 & 128) != 0) {
            n12 = r.n();
            list3 = n12;
        } else {
            list3 = list;
        }
        if ((i12 & 256) != 0) {
            n11 = r.n();
            list4 = n11;
        } else {
            list4 = list2;
        }
        return propertyHomeViewModel.S(listingItemBrief, liveData, liveData2, listingsSettings, i11, propertySectionName, str, list3, list4);
    }

    private final List<ForPropertyListingItemViewModel> V(ListingsResponse listingsResponse, xa.b bVar, int i11, PropertySectionName propertySectionName, String str) {
        boolean z11;
        ArrayList arrayList = new ArrayList();
        List<ListingItemBrief> normalItems = listingsResponse.getListings().getNormalItems();
        if (normalItems != null && !normalItems.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11) {
            for (ListingItemBrief listingItemBrief : listingsResponse.getListings().getNormalItems()) {
                arrayList.add(T(this, listingItemBrief, new b0(bVar.b()), new b0(bVar.a()), listingsResponse.getUiSettings().getListingsSettings(), i11, propertySectionName, str, null, null, 384, null));
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X(xa.a aVar) {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), Dispatchers.getIO(), null, new PropertyHomeViewModel$onItemClicked$1(this, aVar, null), 2, null);
    }

    public static /* synthetic */ void c0(PropertyHomeViewModel propertyHomeViewModel, String str, int i11, int i12, int i13, Pair pair, int i14, Object obj) {
        List n11;
        List n12;
        if ((i14 & 8) != 0) {
            i13 = -1;
        }
        int i15 = i13;
        Pair pair2 = pair;
        if ((i14 & 16) != 0) {
            n11 = r.n();
            n12 = r.n();
            pair2 = new Pair(n11, n12);
        }
        propertyHomeViewModel.b0(str, i11, i12, i15, pair2);
    }

    private final xa.c t(RecommendedSectionsResponse.Section section, List<ForPropertyListingItemViewModel> list, Pair<? extends List<String>, ? extends List<String>> pair) {
        return new xa.c(section, list, pair);
    }

    public final MutableSharedFlow<CategoryEntity> A() {
        return this.B;
    }

    public final MutableSharedFlow<CategoryEntity> B() {
        return this.A;
    }

    public final MutableStateFlow<SectionState> C() {
        return this.M;
    }

    public final MutableStateFlow<SectionState> D() {
        return this.C;
    }

    public final MutableStateFlow<SectionState> E() {
        return this.K;
    }

    public final MutableStateFlow<Boolean> G() {
        return this.I;
    }

    public final void N() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new PropertyHomeViewModel$logHomeScreenVisited$1(this, null), 3, null);
    }

    public final void O() {
        List<? extends s9.a> X0;
        AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger = this.f24797h;
        Collection<s9.a> values = this.N.values();
        o.h(values, "<get-values>(...)");
        X0 = CollectionsKt___CollectionsKt.X0(values);
        aggregatedAllAnalyticsLogger.d0(X0);
        this.N.clear();
    }

    public final void Y() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), Dispatchers.getIO().plus(new a(CoroutineExceptionHandler.Key, this)), null, new PropertyHomeViewModel$setUp$2(this, null), 2, null);
    }

    public final void Z() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), Dispatchers.getIO(), null, new PropertyHomeViewModel$shuffleAndEmitHotZoneList$1(this, null), 2, null);
    }

    public final void a0() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new PropertyHomeViewModel$shuffleForSaleReality$1(this, null), 3, null);
    }

    public final void b0(String sectionName, int i11, int i12, int i13, Pair<? extends List<String>, ? extends List<String>> filtersNameValuePaired) {
        String str;
        Map f11;
        Map f12;
        Map o11;
        Map f13;
        Map o12;
        Map f14;
        Map o13;
        Map o14;
        Object obj;
        int i14;
        int i15;
        Map<String, Object> a11;
        o.i(sectionName, "sectionName");
        o.i(filtersNameValuePaired, "filtersNameValuePaired");
        List<String> c11 = filtersNameValuePaired.c();
        List<String> d11 = filtersNameValuePaired.d();
        if (i13 == -1) {
            str = "Section" + sectionName;
        } else {
            str = "Section" + sectionName + "-" + i13;
        }
        boolean z11 = false;
        if (this.N.get(str) != null) {
            s9.a aVar = this.N.get(str);
            Integer num = null;
            if (aVar != null && (a11 = aVar.a()) != null) {
                obj = a11.get(VerticalPageSwiped.MAX_ITEM_SCROLLED.getValue());
            } else {
                obj = null;
            }
            if (obj instanceof Integer) {
                num = (Integer) obj;
            }
            if (num != null) {
                i15 = num.intValue();
                i14 = i11;
            } else {
                i14 = i11;
                i15 = 0;
            }
            if (i15 >= i14) {
                return;
            }
        }
        HashMap<String, s9.a> hashMap = this.N;
        String value = VerticalPageSwiped.VERTICAL_PAGE_SWIPED.getValue();
        f11 = i0.f(i.a(VerticalPageSwiped.MAX_ITEM_SCROLLED.getValue(), Integer.valueOf(i11)));
        f12 = i0.f(i.a(VerticalPageSwiped.SECTION_NAME.getValue(), sectionName));
        o11 = j0.o(f11, f12);
        f13 = i0.f(i.a(VerticalPageSwiped.TOTAL_ITEM_COUNT.getValue(), Integer.valueOf(i12)));
        o12 = j0.o(o11, f13);
        f14 = i0.f(i.a(VerticalPageSwiped.VERTICAL.getValue(), this.f24798i.getSystemName()));
        o13 = j0.o(o12, f14);
        List<String> list = c11;
        o14 = j0.o(o13, !((list == null || list.isEmpty()) ? true : true) ? i0.f(i.a(c11.toString(), d11)) : j0.h());
        hashMap.put(str, new s9.a(value, o14, true, false, false, 24, null));
    }

    public final void s(CategoryEntity category) {
        o.i(category, "category");
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new PropertyHomeViewModel$decideNextDestination$1(category, this, null), 3, null);
    }

    public final MutableStateFlow<SectionState> v() {
        return this.f24802z;
    }

    public final CategoryEntity w() {
        return this.f24798i;
    }

    public final MutableStateFlow<SectionState> x() {
        return this.J;
    }

    public final MutableStateFlow<SectionState> y() {
        return this.H;
    }

    public final MutableSharedFlow<xa.a> z() {
        return this.D;
    }
}
