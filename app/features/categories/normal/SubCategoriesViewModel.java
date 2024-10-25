package com.forsale.app.features.categories.normal;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.b0;
import com.forsale.adserver.datalayer.bannerdata.Screens;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.database.MasterDataMiscModel;
import com.forsale.app.datalayer.database.RegionEntity;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.datalayer.network.responses.ListingsResponse;
import com.forsale.app.datalayer.network.services.ListingsService;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.BannersRepository;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.datalayer.repositories.GAMRepository;
import com.forsale.app.datalayer.repositories.ListingsRepository;
import com.forsale.app.datalayer.repositories.MasterDataRepository;
import com.forsale.app.features.categories.home.BaseCategoryViewModel;
import com.forsale.app.features.categories.listings.items.horizontalListing.HorizontalListingsItemViewModel;
import com.forsale.app.features.categories.listings.items.promotedPost.PromotedPostItemViewModel;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.analytics.AnalyticsDetailsSource;
import com.forsale.app.utils.gam.ContentUrlType;
import com.forsale.app.utils.itemutils.ViewMargins;
import com.forsale.app.utils.itemutils.ViewSpacing;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.q;
import kotlin.collections.r;
import kotlin.collections.s;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.MutableSharedFlow;
import t9.p0;
import wz.h;
import wz.p;
/* compiled from: SubCategoriesViewModel.kt */
/* loaded from: classes2.dex */
public final class SubCategoriesViewModel extends BaseCategoryViewModel {
    public static final a O0 = new a(null);
    public static final int P0 = 8;
    private final LiveData<Boolean> A0;
    private final b0<List<qc.b<?>>> B0;
    private final b0<RegionEntity> C0;
    private final b0<MasterDataMiscModel> D0;
    private final b0<Boolean> E0;
    private final Screens F0;
    private final Deferred<Boolean> G0;
    private final OneShotEventHandler<Pair<Integer, AdManagerAdRequest>> H0;
    private final OneShotEventHandler<p> I0;
    private final OneShotEventHandler<p> J0;
    private final ed.b K0;
    private final h L0;
    private final MutableSharedFlow<Pair<Integer, String>> M0;
    private final h N0;

    /* renamed from: q0  reason: collision with root package name */
    private final BannersRepository f31037q0;

    /* renamed from: r0  reason: collision with root package name */
    private final ListingsRepository f31038r0;

    /* renamed from: s0  reason: collision with root package name */
    private final GAMRepository f31039s0;

    /* renamed from: t0  reason: collision with root package name */
    private final ApplicationResourcesRepository f31040t0;

    /* renamed from: u0  reason: collision with root package name */
    private final MasterDataRepository f31041u0;

    /* renamed from: v0  reason: collision with root package name */
    private final BaseRepository f31042v0;

    /* renamed from: w0  reason: collision with root package name */
    private final ListingsService f31043w0;

    /* renamed from: x0  reason: collision with root package name */
    private final CategoryEntity f31044x0;

    /* renamed from: y0  reason: collision with root package name */
    private final CoroutineExceptionHandler f31045y0;

    /* renamed from: z0  reason: collision with root package name */
    private final b0<Boolean> f31046z0;

    /* compiled from: SubCategoriesViewModel.kt */
    @d(c = "com.forsale.app.features.categories.normal.SubCategoriesViewModel$1", f = "SubCategoriesViewModel.kt", l = {98, 100, 104, FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.normal.SubCategoriesViewModel$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static final class AnonymousClass1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f31047a;

        /* renamed from: b  reason: collision with root package name */
        int f31048b;

        AnonymousClass1(zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(aVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x009c A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
                int r1 = r7.f31048b
                r2 = 0
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L32
                if (r1 == r6) goto L2e
                if (r1 == r5) goto L2a
                if (r1 == r4) goto L22
                if (r1 != r3) goto L1a
                kotlin.f.b(r8)
                goto L9d
            L1a:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L22:
                java.lang.Object r1 = r7.f31047a
                kotlinx.coroutines.flow.MutableSharedFlow r1 = (kotlinx.coroutines.flow.MutableSharedFlow) r1
                kotlin.f.b(r8)
                goto L8e
            L2a:
                kotlin.f.b(r8)
                goto L5e
            L2e:
                kotlin.f.b(r8)
                goto L44
            L32:
                kotlin.f.b(r8)
                com.forsale.app.features.categories.normal.SubCategoriesViewModel r8 = com.forsale.app.features.categories.normal.SubCategoriesViewModel.this
                com.forsale.app.datalayer.repositories.RegionsRepository r8 = r8.I()
                r7.f31048b = r6
                java.lang.Object r8 = r8.getCurrentRegion(r7)
                if (r8 != r0) goto L44
                return r0
            L44:
                com.forsale.app.features.categories.normal.SubCategoriesViewModel r1 = com.forsale.app.features.categories.normal.SubCategoriesViewModel.this
                androidx.lifecycle.b0 r1 = com.forsale.app.features.categories.normal.SubCategoriesViewModel.L0(r1)
                com.forsale.app.datalayer.database.RegionEntity r8 = (com.forsale.app.datalayer.database.RegionEntity) r8
                r1.postValue(r8)
                com.forsale.app.features.categories.normal.SubCategoriesViewModel r8 = com.forsale.app.features.categories.normal.SubCategoriesViewModel.this
                com.forsale.app.datalayer.repositories.MasterDataRepository r8 = com.forsale.app.features.categories.normal.SubCategoriesViewModel.J0(r8)
                r7.f31048b = r5
                java.lang.Object r8 = r8.getMasterDataMiscModel(r7)
                if (r8 != r0) goto L5e
                return r0
            L5e:
                com.forsale.app.features.categories.normal.SubCategoriesViewModel r1 = com.forsale.app.features.categories.normal.SubCategoriesViewModel.this
                androidx.lifecycle.b0 r1 = com.forsale.app.features.categories.normal.SubCategoriesViewModel.K0(r1)
                com.forsale.app.datalayer.database.MasterDataMiscModel r8 = (com.forsale.app.datalayer.database.MasterDataMiscModel) r8
                r1.postValue(r8)
                com.forsale.app.features.categories.normal.SubCategoriesViewModel r8 = com.forsale.app.features.categories.normal.SubCategoriesViewModel.this
                kotlinx.coroutines.flow.MutableSharedFlow r1 = r8.d1()
                com.forsale.app.features.categories.normal.SubCategoriesViewModel r8 = com.forsale.app.features.categories.normal.SubCategoriesViewModel.this
                com.forsale.app.datalayer.database.CategoryEntity r8 = com.forsale.app.features.categories.normal.SubCategoriesViewModel.G0(r8)
                if (r8 == 0) goto L91
                com.forsale.app.features.categories.normal.SubCategoriesViewModel r8 = com.forsale.app.features.categories.normal.SubCategoriesViewModel.this
                com.forsale.app.datalayer.repositories.CategoriesRepositories r8 = r8.s()
                com.forsale.app.features.categories.normal.SubCategoriesViewModel r5 = com.forsale.app.features.categories.normal.SubCategoriesViewModel.this
                com.forsale.app.datalayer.database.CategoryEntity r5 = com.forsale.app.features.categories.normal.SubCategoriesViewModel.G0(r5)
                r7.f31047a = r1
                r7.f31048b = r4
                java.lang.Object r8 = r8.getVerticalIdNameOfCategory(r5, r7)
                if (r8 != r0) goto L8e
                return r0
            L8e:
                kotlin.Pair r8 = (kotlin.Pair) r8
                goto L92
            L91:
                r8 = r2
            L92:
                r7.f31047a = r2
                r7.f31048b = r3
                java.lang.Object r8 = r1.emit(r8, r7)
                if (r8 != r0) goto L9d
                return r0
            L9d:
                wz.p r8 = wz.p.f75480a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.normal.SubCategoriesViewModel.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(p.f75480a);
        }
    }

    /* compiled from: SubCategoriesViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SubCategoriesViewModel f31050a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CoroutineExceptionHandler.Key key, SubCategoriesViewModel subCategoriesViewModel) {
            super(key);
            this.f31050a = subCategoriesViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            this.f31050a.f31046z0.postValue(Boolean.TRUE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0086, code lost:
        if (r8 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SubCategoriesViewModel(com.forsale.app.datalayer.repositories.BannersRepository r8, com.forsale.app.datalayer.repositories.ListingsRepository r9, com.forsale.app.datalayer.repositories.GAMRepository r10, com.forsale.app.datalayer.repositories.ApplicationResourcesRepository r11, com.forsale.app.datalayer.repositories.MasterDataRepository r12, com.forsale.app.datalayer.repositories.BaseRepository r13, com.forsale.app.datalayer.network.services.ListingsService r14, androidx.lifecycle.k0 r15) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.normal.SubCategoriesViewModel.<init>(com.forsale.app.datalayer.repositories.BannersRepository, com.forsale.app.datalayer.repositories.ListingsRepository, com.forsale.app.datalayer.repositories.GAMRepository, com.forsale.app.datalayer.repositories.ApplicationResourcesRepository, com.forsale.app.datalayer.repositories.MasterDataRepository, com.forsale.app.datalayer.repositories.BaseRepository, com.forsale.app.datalayer.network.services.ListingsService, androidx.lifecycle.k0):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e1() {
        x10.a.b("PROMOTED: hidePromotedPost", new Object[0]);
        this.J0.i(p.f75480a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f1(g00.l<? super com.forsale.app.datalayer.network.responses.ListingsResponse, wz.p> r19, zz.a<? super wz.p> r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            boolean r2 = r1 instanceof com.forsale.app.features.categories.normal.SubCategoriesViewModel$loadListings$1
            if (r2 == 0) goto L17
            r2 = r1
            com.forsale.app.features.categories.normal.SubCategoriesViewModel$loadListings$1 r2 = (com.forsale.app.features.categories.normal.SubCategoriesViewModel$loadListings$1) r2
            int r3 = r2.f31063d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f31063d = r3
            goto L1c
        L17:
            com.forsale.app.features.categories.normal.SubCategoriesViewModel$loadListings$1 r2 = new com.forsale.app.features.categories.normal.SubCategoriesViewModel$loadListings$1
            r2.<init>(r0, r1)
        L1c:
            r15 = r2
            java.lang.Object r1 = r15.f31061b
            java.lang.Object r2 = kotlin.coroutines.intrinsics.a.f()
            int r3 = r15.f31063d
            r4 = 1
            if (r3 == 0) goto L3a
            if (r3 != r4) goto L32
            java.lang.Object r2 = r15.f31060a
            g00.l r2 = (g00.l) r2
            kotlin.f.b(r1)
            goto L6c
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3a:
            kotlin.f.b(r1)
            com.forsale.app.datalayer.database.CategoryEntity r1 = r0.f31044x0
            if (r1 == 0) goto L73
            com.forsale.app.datalayer.repositories.ListingsRepository r3 = r0.f31038r0
            r5 = 1
            r6 = 0
            int r1 = r1.getId()
            java.lang.Integer r1 = kotlin.coroutines.jvm.internal.a.d(r1)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r16 = 2042(0x7fa, float:2.861E-42)
            r17 = 0
            r14 = r19
            r15.f31060a = r14
            r15.f31063d = r4
            r4 = r5
            r5 = r6
            r6 = r1
            r1 = 0
            r14 = r1
            java.lang.Object r1 = com.forsale.app.datalayer.repositories.ListingsRepository.getNormalListings$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            if (r1 != r2) goto L6a
            return r2
        L6a:
            r2 = r19
        L6c:
            com.forsale.app.datalayer.network.responses.ListingsResponse r1 = (com.forsale.app.datalayer.network.responses.ListingsResponse) r1
            if (r1 == 0) goto L73
            r2.invoke(r1)
        L73:
            wz.p r1 = wz.p.f75480a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.normal.SubCategoriesViewModel.f1(g00.l, zz.a):java.lang.Object");
    }

    private final qc.b<?> g1(ListingItemBrief listingItemBrief, ListingsResponse.UISettings.ListingsSettings listingsSettings) {
        List n11;
        b0<RegionEntity> b0Var = this.C0;
        b0<MasterDataMiscModel> b0Var2 = this.D0;
        ApplicationResourcesRepository applicationResourcesRepository = this.f31040t0;
        SubCategoriesViewModel$mapToHalfScreenListingItemViewModel$1 subCategoriesViewModel$mapToHalfScreenListingItemViewModel$1 = new g00.p<ListingItemBrief, List<? extends Object>, p>() { // from class: com.forsale.app.features.categories.normal.SubCategoriesViewModel$mapToHalfScreenListingItemViewModel$1
            public final void b(ListingItemBrief listingItemBrief2, List<? extends Object> list) {
                o.i(listingItemBrief2, "<anonymous parameter 0>");
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ p invoke(ListingItemBrief listingItemBrief2, List<? extends Object> list) {
                b(listingItemBrief2, list);
                return p.f75480a;
            }
        };
        Integer valueOf = Integer.valueOf(p0.f69711k);
        String value = AnalyticsDetailsSource.GRAND_PINNING_LISTINGS.getValue();
        n11 = r.n();
        return new zc.b(listingItemBrief, listingsSettings, b0Var, b0Var2, applicationResourcesRepository, subCategoriesViewModel$mapToHalfScreenListingItemViewModel$1, valueOf, null, value, false, false, null, 0, this, n11, 7808, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<HorizontalListingsItemViewModel> h1(List<ListingItemBrief> list, ListingsResponse.UISettings.ListingsSettings listingsSettings) {
        int y11;
        List<HorizontalListingsItemViewModel> e11;
        HorizontalListingsItemViewModel.Companion companion = HorizontalListingsItemViewModel.f30736y;
        List<ListingItemBrief> list2 = list;
        y11 = s.y(list2, 10);
        ArrayList arrayList = new ArrayList(y11);
        for (ListingItemBrief listingItemBrief : list2) {
            arrayList.add(g1(listingItemBrief, listingsSettings));
        }
        e11 = q.e(HorizontalListingsItemViewModel.Companion.b(companion, new b0(arrayList), null, 1, new ViewSpacing(new ViewMargins(null, null, Integer.valueOf(p0.f69713m), null, 11, null), null, 2, null), null, null, 48, null));
        return e11;
    }

    public final AdManagerAdRequest R0(int i11) {
        List<String> list;
        GAMRepository gAMRepository = this.f31039s0;
        Integer valueOf = Integer.valueOf(i11);
        ContentUrlType contentUrlType = ContentUrlType.CATEGORY;
        Integer valueOf2 = Integer.valueOf(i11);
        CategoryEntity categoryEntity = this.f31044x0;
        String str = null;
        if (categoryEntity != null) {
            list = categoryEntity.getCategoryTreeNames();
        } else {
            list = null;
        }
        CategoryEntity categoryEntity2 = this.f31044x0;
        if (categoryEntity2 != null) {
            str = categoryEntity2.getName();
        }
        return gAMRepository.buildForCategory(valueOf, new fj.a(contentUrlType, valueOf2, list, str));
    }

    public final void S0() {
        Z0().r();
    }

    public final void T0() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new SubCategoriesViewModel$checkPromotedLandingAvailability$1(this, null), 3, null);
    }

    public final ed.b U0() {
        return this.K0;
    }

    public final LiveData<List<qc.b<?>>> V0() {
        return (LiveData) this.N0.getValue();
    }

    public final LiveData<Boolean> W0() {
        return this.A0;
    }

    public final OneShotEventHandler<p> X0() {
        return this.J0;
    }

    public final void Y0() {
        BuildersKt__Builders_commonKt.launch$default(this, this.f31045y0, null, new SubCategoriesViewModel$getListings$1(this, null), 2, null);
    }

    public final PromotedPostItemViewModel Z0() {
        return (PromotedPostItemViewModel) this.L0.getValue();
    }

    public final OneShotEventHandler<Pair<Integer, AdManagerAdRequest>> b1() {
        return this.H0;
    }

    public final OneShotEventHandler<p> c1() {
        return this.I0;
    }

    public final MutableSharedFlow<Pair<Integer, String>> d1() {
        return this.M0;
    }

    @Override // com.forsale.app.base.viewmodels.BaseViewModel, kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return super.getCoroutineContext().plus(new c(CoroutineExceptionHandler.Key));
    }

    public final void i1() {
        Z0().T();
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.coroutines.a implements CoroutineExceptionHandler {
        public c(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
        }
    }
}
