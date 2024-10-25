package com.forsale.app.features.categories.listings.filtration.allFilters;

import androidx.lifecycle.k0;
import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.network.requestsbodies.GetListingsBody;
import com.forsale.app.datalayer.network.responses.ListingsResponse;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.datalayer.repositories.DistrictsRepository;
import com.forsale.app.datalayer.repositories.ExtraAttributeRawRepository;
import com.forsale.app.datalayer.repositories.FiltersRepository;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersFactory;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.PreSelectedFiltersFactory;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.filterModels.AllFiltersPayload;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.listingfiltration.FilterPlaces;
import com.forsale.app.utils.analytics.listingfiltration.ListingsFiltrationAnalytics;
import g00.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.Triple;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.q;
import kotlin.collections.r;
import kotlin.collections.s;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import wz.h;
/* compiled from: AllFiltersViewModel.kt */
/* loaded from: classes2.dex */
public final class AllFiltersViewModel extends BaseViewModel {

    /* renamed from: k0  reason: collision with root package name */
    private final ListingsFiltrationAnalytics f28996k0;

    /* renamed from: l0  reason: collision with root package name */
    private final h f28997l0;

    /* renamed from: m0  reason: collision with root package name */
    private final MutableSharedFlow<a> f28998m0;

    /* renamed from: n0  reason: collision with root package name */
    private final MutableSharedFlow<Triple<FilterViewModel<?, ?, ?>, com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.a, Integer>> f28999n0;

    /* renamed from: o0  reason: collision with root package name */
    private final MutableStateFlow<List<FilterViewModel<?, ?, ?>>> f29000o0;

    /* renamed from: p0  reason: collision with root package name */
    private final OneShotEventHandler<GetListingsBody.FiltrationData> f29001p0;

    /* renamed from: q0  reason: collision with root package name */
    private final h f29002q0;

    /* renamed from: r0  reason: collision with root package name */
    private FiltersMediator f29003r0;

    /* renamed from: s0  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f29004s0;

    /* renamed from: t0  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f29005t0;

    /* compiled from: AllFiltersViewModel.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersViewModel$1", f = "AllFiltersViewModel.kt", l = {74, 90}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersViewModel$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f29006a;

        /* renamed from: b  reason: collision with root package name */
        Object f29007b;

        /* renamed from: c  reason: collision with root package name */
        Object f29008c;

        /* renamed from: d  reason: collision with root package name */
        Object f29009d;

        /* renamed from: e  reason: collision with root package name */
        Object f29010e;

        /* renamed from: f  reason: collision with root package name */
        int f29011f;

        /* renamed from: g  reason: collision with root package name */
        private /* synthetic */ Object f29012g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ExtraAttributeRawRepository f29013h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ AllFiltersViewModel f29014i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ AggregatedAllAnalyticsLogger f29015j;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ DistrictsRepository f29016x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ExtraAttributeRawRepository extraAttributeRawRepository, AllFiltersViewModel allFiltersViewModel, AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, DistrictsRepository districtsRepository, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f29013h = extraAttributeRawRepository;
            this.f29014i = allFiltersViewModel;
            this.f29015j = aggregatedAllAnalyticsLogger;
            this.f29016x = districtsRepository;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f29013h, this.f29014i, this.f29015j, this.f29016x, aVar);
            anonymousClass1.f29012g = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            CoroutineScope coroutineScope;
            int y11;
            List A;
            List<ListingsResponse.UISettings.FiltrationSetting> E0;
            CategoryEntity b11;
            OneShotEventHandler<GetListingsBody.FiltrationData> J0;
            AllFiltersViewModel allFiltersViewModel;
            CoroutineScope coroutineScope2;
            FiltersFactory filtersFactory;
            boolean z11;
            List e11;
            List E02;
            f11 = kotlin.coroutines.intrinsics.b.f();
            int i11 = this.f29011f;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        allFiltersViewModel = (AllFiltersViewModel) this.f29010e;
                        b11 = (CategoryEntity) this.f29007b;
                        E0 = (List) this.f29006a;
                        CoroutineScope coroutineScope3 = (CoroutineScope) this.f29012g;
                        f.b(obj);
                        J0 = (OneShotEventHandler) this.f29009d;
                        filtersFactory = (FiltersFactory) this.f29008c;
                        coroutineScope2 = coroutineScope3;
                        FiltersMediator filtersMediator = new FiltersMediator(coroutineScope2, b11, E0, filtersFactory, J0, (List) obj, this.f29014i.K0(), this.f29015j, this.f29016x);
                        AllFiltersViewModel allFiltersViewModel2 = this.f29014i;
                        List<FilterViewModel<?, ?, ?>> i12 = filtersMediator.i();
                        allFiltersViewModel2.H0().setValue(i12);
                        filtersMediator.p(i12);
                        allFiltersViewModel.f29003r0 = filtersMediator;
                        return wz.p.f75480a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
                coroutineScope = (CoroutineScope) this.f29012g;
            } else {
                f.b(obj);
                CoroutineScope coroutineScope4 = (CoroutineScope) this.f29012g;
                ExtraAttributeRawRepository extraAttributeRawRepository = this.f29013h;
                int id2 = this.f29014i.E0().b().getId();
                this.f29012g = coroutineScope4;
                this.f29011f = 1;
                Object filterableAttributesWithCategoryIdAsFilterSettings = extraAttributeRawRepository.getFilterableAttributesWithCategoryIdAsFilterSettings(id2, this);
                if (filterableAttributesWithCategoryIdAsFilterSettings == f11) {
                    return f11;
                }
                coroutineScope = coroutineScope4;
                obj = filterableAttributesWithCategoryIdAsFilterSettings;
            }
            List list = (List) obj;
            List<ListingsResponse.UISettings.FiltrationSetting> a11 = this.f29014i.E0().a();
            y11 = s.y(a11, 10);
            ArrayList arrayList = new ArrayList(y11);
            for (ListingsResponse.UISettings.FiltrationSetting filtrationSetting : a11) {
                e11 = q.e(filtrationSetting);
                E02 = CollectionsKt___CollectionsKt.E0(e11, filtrationSetting.getSubFilters());
                arrayList.add(E02);
            }
            A = s.A(arrayList);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : A) {
                if (((ListingsResponse.UISettings.FiltrationSetting) obj2).getFilterType() != ListingsResponse.UISettings.FiltrationSetting.FilterType.ATTRIBUTE) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    arrayList2.add(obj2);
                }
            }
            E0 = CollectionsKt___CollectionsKt.E0(arrayList2, list);
            AllFiltersViewModel allFiltersViewModel3 = this.f29014i;
            b11 = allFiltersViewModel3.E0().b();
            FiltersFactory G0 = this.f29014i.G0();
            J0 = this.f29014i.J0();
            FiltersFactory G02 = this.f29014i.G0();
            GetListingsBody.FiltrationData c11 = this.f29014i.E0().c();
            this.f29012g = coroutineScope;
            this.f29006a = E0;
            this.f29007b = b11;
            this.f29008c = G0;
            this.f29009d = J0;
            this.f29010e = allFiltersViewModel3;
            this.f29011f = 2;
            Object d11 = G02.d(c11, E0, this);
            if (d11 == f11) {
                return f11;
            }
            allFiltersViewModel = allFiltersViewModel3;
            obj = d11;
            coroutineScope2 = coroutineScope;
            filtersFactory = G0;
            FiltersMediator filtersMediator2 = new FiltersMediator(coroutineScope2, b11, E0, filtersFactory, J0, (List) obj, this.f29014i.K0(), this.f29015j, this.f29016x);
            AllFiltersViewModel allFiltersViewModel22 = this.f29014i;
            List<FilterViewModel<?, ?, ?>> i122 = filtersMediator2.i();
            allFiltersViewModel22.H0().setValue(i122);
            filtersMediator2.p(i122);
            allFiltersViewModel.f29003r0 = filtersMediator2;
            return wz.p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* compiled from: AllFiltersViewModel.kt */
    /* loaded from: classes2.dex */
    public interface a {

        /* compiled from: AllFiltersViewModel.kt */
        /* renamed from: com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersViewModel$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0316a implements a {

            /* renamed from: a  reason: collision with root package name */
            private final GetListingsBody.FiltrationData f29017a;

            /* renamed from: b  reason: collision with root package name */
            private final boolean f29018b;

            public C0316a(GetListingsBody.FiltrationData filtrationData, boolean z11) {
                this.f29017a = filtrationData;
                this.f29018b = z11;
            }

            public final GetListingsBody.FiltrationData a() {
                return this.f29017a;
            }

            public final boolean b() {
                return this.f29018b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0316a)) {
                    return false;
                }
                C0316a c0316a = (C0316a) obj;
                if (o.d(this.f29017a, c0316a.f29017a) && this.f29018b == c0316a.f29018b) {
                    return true;
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public int hashCode() {
                int hashCode;
                GetListingsBody.FiltrationData filtrationData = this.f29017a;
                if (filtrationData == null) {
                    hashCode = 0;
                } else {
                    hashCode = filtrationData.hashCode();
                }
                int i11 = hashCode * 31;
                boolean z11 = this.f29018b;
                int i12 = z11;
                if (z11 != 0) {
                    i12 = 1;
                }
                return i11 + i12;
            }

            public String toString() {
                GetListingsBody.FiltrationData filtrationData = this.f29017a;
                boolean z11 = this.f29018b;
                return "ApplyEvent(filtersSelected=" + filtrationData + ", isUpdated=" + z11 + ")";
            }
        }

        /* compiled from: AllFiltersViewModel.kt */
        /* loaded from: classes2.dex */
        public static final class b implements a {

            /* renamed from: a  reason: collision with root package name */
            private final boolean f29019a;

            public b(boolean z11) {
                this.f29019a = z11;
            }

            public final boolean a() {
                return this.f29019a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof b) && this.f29019a == ((b) obj).f29019a) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                boolean z11 = this.f29019a;
                if (z11) {
                    return 1;
                }
                return z11 ? 1 : 0;
            }

            public String toString() {
                boolean z11 = this.f29019a;
                return "CloseEvent(isReset=" + z11 + ")";
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AllFiltersViewModel(final k0 stateHandle, final DistrictsRepository districtsRepository, final ExtraAttributeRawRepository extraAttributeRawRepository, final FiltersRepository filtersRepository, AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, final PreSelectedFiltersFactory preSelectedFiltersFactory, ListingsFiltrationAnalytics filtrationAnalytics, BaseRepository baseRepository) {
        super(baseRepository);
        h a11;
        List n11;
        h a12;
        o.i(stateHandle, "stateHandle");
        o.i(districtsRepository, "districtsRepository");
        o.i(extraAttributeRawRepository, "extraAttributeRawRepository");
        o.i(filtersRepository, "filtersRepository");
        o.i(aggregatedAllAnalyticsLogger, "aggregatedAllAnalyticsLogger");
        o.i(preSelectedFiltersFactory, "preSelectedFiltersFactory");
        o.i(filtrationAnalytics, "filtrationAnalytics");
        o.i(baseRepository, "baseRepository");
        this.f28996k0 = filtrationAnalytics;
        a11 = kotlin.d.a(new g00.a<AllFiltersPayload>() { // from class: com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersViewModel$allFiltersPayload$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final AllFiltersPayload invoke() {
                return a.f29047b.b(k0.this).a();
            }
        });
        this.f28997l0 = a11;
        this.f28998m0 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f28999n0 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        n11 = r.n();
        this.f29000o0 = StateFlowKt.MutableStateFlow(n11);
        this.f29001p0 = new OneShotEventHandler<>(null, 0, 3, null);
        a12 = kotlin.d.a(new g00.a<FiltersFactory>() { // from class: com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersViewModel$filtersFactory$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final FiltersFactory invoke() {
                AllFiltersViewModel allFiltersViewModel = AllFiltersViewModel.this;
                return new FiltersFactory(allFiltersViewModel, allFiltersViewModel.E0().b(), AllFiltersViewModel.this.s(), districtsRepository, extraAttributeRawRepository, AllFiltersViewModel.this.I(), filtersRepository, preSelectedFiltersFactory, AllFiltersViewModel.this.I0(), true);
            }
        });
        this.f29002q0 = a12;
        Boolean bool = Boolean.FALSE;
        this.f29004s0 = StateFlowKt.MutableStateFlow(bool);
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new AnonymousClass1(extraAttributeRawRepository, this, aggregatedAllAnalyticsLogger, districtsRepository, null), 3, null);
        this.f29005t0 = StateFlowKt.MutableStateFlow(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FiltersFactory G0() {
        return (FiltersFactory) this.f29002q0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N0(zz.a<? super wz.p> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersViewModel$recordAllFiltersApply$1
            if (r0 == 0) goto L13
            r0 = r8
            com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersViewModel$recordAllFiltersApply$1 r0 = (com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersViewModel$recordAllFiltersApply$1) r0
            int r1 = r0.f29034e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29034e = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersViewModel$recordAllFiltersApply$1 r0 = new com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersViewModel$recordAllFiltersApply$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f29032c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f29034e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r8)
            goto L6d
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            int r2 = r0.f29031b
            java.lang.Object r4 = r0.f29030a
            com.forsale.app.utils.analytics.listingfiltration.ListingsFiltrationAnalytics r4 = (com.forsale.app.utils.analytics.listingfiltration.ListingsFiltrationAnalytics) r4
            kotlin.f.b(r8)
            goto L5f
        L3e:
            kotlin.f.b(r8)
            com.forsale.app.utils.analytics.listingfiltration.ListingsFiltrationAnalytics r8 = r7.f28996k0
            com.forsale.app.features.categories.listings.filtration.fullFiltration.filterModels.AllFiltersPayload r2 = r7.E0()
            com.forsale.app.datalayer.database.CategoryEntity r2 = r2.b()
            int r2 = r2.getId()
            r0.f29030a = r8
            r0.f29031b = r2
            r0.f29034e = r4
            java.lang.Object r4 = r7.R0(r0)
            if (r4 != r1) goto L5c
            return r1
        L5c:
            r6 = r4
            r4 = r8
            r8 = r6
        L5f:
            java.util.List r8 = (java.util.List) r8
            r5 = 0
            r0.f29030a = r5
            r0.f29034e = r3
            java.lang.Object r8 = r4.k(r2, r8, r0)
            if (r8 != r1) goto L6d
            return r1
        L6d:
            wz.p r8 = wz.p.f75480a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersViewModel.N0(zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P0(zz.a<? super wz.p> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersViewModel$recordResetAllFiltersClicked$1
            if (r0 == 0) goto L13
            r0 = r9
            com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersViewModel$recordResetAllFiltersClicked$1 r0 = (com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersViewModel$recordResetAllFiltersClicked$1) r0
            int r1 = r0.f29039e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29039e = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersViewModel$recordResetAllFiltersClicked$1 r0 = new com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersViewModel$recordResetAllFiltersClicked$1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f29037c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f29039e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r9)
            goto L6f
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L34:
            int r2 = r0.f29036b
            java.lang.Object r4 = r0.f29035a
            com.forsale.app.utils.analytics.listingfiltration.ListingsFiltrationAnalytics r4 = (com.forsale.app.utils.analytics.listingfiltration.ListingsFiltrationAnalytics) r4
            kotlin.f.b(r9)
            goto L5f
        L3e:
            kotlin.f.b(r9)
            com.forsale.app.utils.analytics.listingfiltration.ListingsFiltrationAnalytics r9 = r8.f28996k0
            com.forsale.app.features.categories.listings.filtration.fullFiltration.filterModels.AllFiltersPayload r2 = r8.E0()
            com.forsale.app.datalayer.database.CategoryEntity r2 = r2.b()
            int r2 = r2.getId()
            r0.f29035a = r9
            r0.f29036b = r2
            r0.f29039e = r4
            java.lang.Object r4 = r8.R0(r0)
            if (r4 != r1) goto L5c
            return r1
        L5c:
            r7 = r4
            r4 = r9
            r9 = r7
        L5f:
            java.util.List r9 = (java.util.List) r9
            com.forsale.app.utils.analytics.listingfiltration.ListingsAnalytics$FiltersPlace r5 = com.forsale.app.utils.analytics.listingfiltration.ListingsAnalytics$FiltersPlace.ALL_FILTERS
            r6 = 0
            r0.f29035a = r6
            r0.f29039e = r3
            java.lang.Object r9 = r4.p(r2, r9, r5, r0)
            if (r9 != r1) goto L6f
            return r1
        L6f:
            wz.p r9 = wz.p.f75480a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersViewModel.P0(zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0069 -> B:24:0x006c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R0(zz.a<? super java.util.List<? extends com.forsale.app.utils.analytics.listingfiltration.a>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersViewModel$selectedFiltersKeyValue$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersViewModel$selectedFiltersKeyValue$1 r0 = (com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersViewModel$selectedFiltersKeyValue$1) r0
            int r1 = r0.f29046e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29046e = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersViewModel$selectedFiltersKeyValue$1 r0 = new com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersViewModel$selectedFiltersKeyValue$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f29044c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f29046e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r2 = r0.f29043b
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r4 = r0.f29042a
            java.util.Collection r4 = (java.util.Collection) r4
            kotlin.f.b(r6)
            goto L6c
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L39:
            kotlin.f.b(r6)
            com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator r6 = r5.f29003r0
            if (r6 == 0) goto L78
            java.util.List r6 = r6.i()
            if (r6 == 0) goto L78
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r6 = r6.iterator()
            r4 = r2
            r2 = r6
        L53:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L74
            java.lang.Object r6 = r2.next()
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel r6 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel) r6
            r0.f29042a = r4
            r0.f29043b = r2
            r0.f29046e = r3
            java.lang.Object r6 = r6.N(r0)
            if (r6 != r1) goto L6c
            return r1
        L6c:
            com.forsale.app.utils.analytics.listingfiltration.a r6 = (com.forsale.app.utils.analytics.listingfiltration.a) r6
            if (r6 == 0) goto L53
            r4.add(r6)
            goto L53
        L74:
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L7c
        L78:
            java.util.List r4 = kotlin.collections.p.n()
        L7c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersViewModel.R0(zz.a):java.lang.Object");
    }

    public final void C0() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new AllFiltersViewModel$closeAllFilters$1(this, null), 3, null);
    }

    public final MutableSharedFlow<a> D0() {
        return this.f28998m0;
    }

    public final AllFiltersPayload E0() {
        return (AllFiltersPayload) this.f28997l0.getValue();
    }

    public final MutableStateFlow<List<FilterViewModel<?, ?, ?>>> H0() {
        return this.f29000o0;
    }

    public final MutableSharedFlow<Triple<FilterViewModel<?, ?, ?>, com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.a, Integer>> I0() {
        return this.f28999n0;
    }

    public final OneShotEventHandler<GetListingsBody.FiltrationData> J0() {
        return this.f29001p0;
    }

    public final MutableStateFlow<Boolean> K0() {
        return this.f29004s0;
    }

    public final void L0() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new AllFiltersViewModel$onApplyClick$1(this, null), 3, null);
    }

    public final void M0(FilterViewModel<?, ?, ?> filterViewModel) {
        o.i(filterViewModel, "filterViewModel");
        FilterViewModel.K(filterViewModel, 0, 1, null);
    }

    public final void O0(String str, String optionValue) {
        o.i(optionValue, "optionValue");
        this.f28996k0.n(new vi.b(str, optionValue, FilterPlaces.ALL_FILTERS, E0().b()));
    }

    public final void Q0() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new AllFiltersViewModel$reset$1(this, null), 3, null);
    }
}
