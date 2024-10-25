package com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels;

import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.database.CategoryView;
import com.forsale.app.datalayer.network.responses.ListingsResponse;
import com.forsale.app.datalayer.repositories.CategoriesRepositories;
import com.forsale.app.datalayer.repositories.FiltersRepository;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.commonViewModelsHandlers.SelectableHandler;
import fc.c;
import g00.l;
import g00.p;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Triple;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: CategoriesFilterViewModel.kt */
/* loaded from: classes2.dex */
public final class CategoriesFilterViewModel extends FilterViewModel {
    private final SelectableHandler A;

    /* renamed from: x  reason: collision with root package name */
    private final CategoriesRepositories f29465x;

    /* renamed from: y  reason: collision with root package name */
    private final CategoryEntity f29466y;

    /* renamed from: z  reason: collision with root package name */
    private final MutableSharedFlow<Triple<FilterViewModel<?, ?, ?>, com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.a, Integer>> f29467z;

    /* compiled from: CategoriesFilterViewModel.kt */
    @d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel$1", f = "CategoriesFilterViewModel.kt", l = {47}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f29468a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CategoriesFilterViewModel.kt */
        @d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel$1$1", f = "CategoriesFilterViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C03261 extends SuspendLambda implements p<Boolean, zz.a<? super wz.p>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f29470a;

            C03261(zz.a<? super C03261> aVar) {
                super(2, aVar);
            }

            public final Object b(boolean z11, zz.a<? super wz.p> aVar) {
                return ((C03261) create(Boolean.valueOf(z11), aVar)).invokeSuspend(wz.p.f75480a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
                return new C03261(aVar);
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, zz.a<? super wz.p> aVar) {
                return b(bool.booleanValue(), aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                b.f();
                if (this.f29470a == 0) {
                    f.b(obj);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

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
            f11 = b.f();
            int i11 = this.f29468a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                StateFlow<Boolean> B = CategoriesFilterViewModel.this.B();
                C03261 c03261 = new C03261(null);
                this.f29468a = 1;
                if (FlowKt.collectLatest(B, c03261, this) == f11) {
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

    /* compiled from: Comparisons.kt */
    /* loaded from: classes2.dex */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            int a11;
            a11 = yz.b.a(Integer.valueOf(((CategoryView) t11).getDisplayOrderSort()), Integer.valueOf(((CategoryView) t12).getDisplayOrderSort()));
            return a11;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoriesFilterViewModel(CoroutineScope cs2, ListingsResponse.UISettings.FiltrationSetting setting, FiltersMediator mediator, CategoriesRepositories categoriesRepositories, FiltersRepository filtersRepository, CategoryEntity rootCategory, List<Integer> list, boolean z11, MutableSharedFlow<Triple<FilterViewModel<?, ?, ?>, com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.a, Integer>> onFilterClicked) {
        super(cs2, setting, mediator, filtersRepository, list, z11, onFilterClicked);
        o.i(cs2, "cs");
        o.i(setting, "setting");
        o.i(mediator, "mediator");
        o.i(categoriesRepositories, "categoriesRepositories");
        o.i(filtersRepository, "filtersRepository");
        o.i(rootCategory, "rootCategory");
        o.i(onFilterClicked, "onFilterClicked");
        this.f29465x = categoriesRepositories;
        this.f29466y = rootCategory;
        this.f29467z = onFilterClicked;
        this.A = new SelectableHandler(y().a());
        BuildersKt__Builders_commonKt.launch$default(cs2, null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072 A[PHI: r9 
      PHI: (r9v6 java.lang.Object) = (r9v5 java.lang.Object), (r9v1 java.lang.Object) binds: [B:24:0x006f, B:12:0x0029] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c0(java.util.List<java.lang.Integer> r7, boolean r8, zz.a<? super java.util.List<dc.c>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel$createSelectableDataOptions$1
            if (r0 == 0) goto L13
            r0 = r9
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel$createSelectableDataOptions$1 r0 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel$createSelectableDataOptions$1) r0
            int r1 = r0.f29476f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29476f = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel$createSelectableDataOptions$1 r0 = new com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel$createSelectableDataOptions$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f29474d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f29476f
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L43
            if (r2 == r5) goto L35
            if (r2 != r3) goto L2d
            kotlin.f.b(r9)
            goto L72
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            boolean r8 = r0.f29473c
            java.lang.Object r7 = r0.f29472b
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r2 = r0.f29471a
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel r2 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel) r2
            kotlin.f.b(r9)
            goto L5f
        L43:
            kotlin.f.b(r9)
            if (r7 != 0) goto L4f
            r7 = 0
            java.lang.Object r7 = com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel.R(r6, r7, r5, r4)
            java.util.List r7 = (java.util.List) r7
        L4f:
            r0.f29471a = r6
            r0.f29472b = r7
            r0.f29473c = r8
            r0.f29476f = r5
            java.lang.Object r9 = r6.S(r0)
            if (r9 != r1) goto L5e
            return r1
        L5e:
            r2 = r6
        L5f:
            java.util.List r9 = (java.util.List) r9
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.commonViewModelsHandlers.SelectableHandler r2 = r2.q()
            r0.f29471a = r4
            r0.f29472b = r4
            r0.f29476f = r3
            java.lang.Object r9 = r2.b(r9, r7, r8, r0)
            if (r9 != r1) goto L72
            return r1
        L72:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel.c0(java.util.List, boolean, zz.a):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object d0(CategoriesFilterViewModel categoriesFilterViewModel, List list, boolean z11, zz.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = null;
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return categoriesFilterViewModel.c0(list, z11, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a9 A[LOOP:1: B:38:0x00a3->B:40:0x00a9, LOOP_END] */
    @Override // com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object N(zz.a<? super com.forsale.app.utils.analytics.listingfiltration.a> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel$pullAnalyticsData$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel$pullAnalyticsData$1 r0 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel$pullAnalyticsData$1) r0
            int r1 = r0.f29493e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29493e = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel$pullAnalyticsData$1 r0 = new com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel$pullAnalyticsData$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f29491c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f29493e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r1 = r0.f29490b
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r0.f29489a
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel r0 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel) r0
            kotlin.f.b(r6)
            goto L6a
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L39:
            kotlin.f.b(r6)
            java.lang.Object r6 = r5.Q(r3)
            r2 = r6
            java.util.List r2 = (java.util.List) r2
            java.util.Collection r2 = (java.util.Collection) r2
            if (r2 == 0) goto L50
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L4e
            goto L50
        L4e:
            r2 = 0
            goto L51
        L50:
            r2 = r3
        L51:
            r4 = 0
            if (r2 != 0) goto L55
            goto L56
        L55:
            r6 = r4
        L56:
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto Lc0
            r0.f29489a = r5
            r0.f29490b = r6
            r0.f29493e = r3
            java.lang.Object r0 = r5.S(r0)
            if (r0 != r1) goto L67
            return r1
        L67:
            r1 = r6
            r6 = r0
            r0 = r5
        L6a:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r6 = r6.iterator()
        L75:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L94
            java.lang.Object r3 = r6.next()
            r4 = r3
            hi.b r4 = (hi.b) r4
            int r4 = r4.getSelectedId()
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.a.d(r4)
            boolean r4 = r1.contains(r4)
            if (r4 == 0) goto L75
            r2.add(r3)
            goto L75
        L94:
            java.util.ArrayList r6 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.p.y(r2, r1)
            r6.<init>(r1)
            java.util.Iterator r1 = r2.iterator()
        La3:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lb7
            java.lang.Object r2 = r1.next()
            hi.b r2 = (hi.b) r2
            java.lang.String r2 = r2.getLabelEn()
            r6.add(r2)
            goto La3
        Lb7:
            com.forsale.app.utils.analytics.listingfiltration.a$d r4 = new com.forsale.app.utils.analytics.listingfiltration.a$d
            java.lang.String r0 = r0.x()
            r4.<init>(r0, r6)
        Lc0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel.N(zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object S(zz.a<? super java.util.List<? extends hi.b>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel$pullFiltrationRange$1
            if (r0 == 0) goto L13
            r0 = r5
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel$pullFiltrationRange$1 r0 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel$pullFiltrationRange$1) r0
            int r1 = r0.f29496c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29496c = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel$pullFiltrationRange$1 r0 = new com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel$pullFiltrationRange$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f29494a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f29496c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r5)
            goto L4d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.f.b(r5)
            com.forsale.app.datalayer.database.CategoryEntity r5 = r4.f29466y
            int r5 = r5.getId()
            com.forsale.app.datalayer.repositories.CategoriesRepositories r2 = r4.f29465x
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.a.d(r5)
            java.util.List r5 = kotlin.collections.p.e(r5)
            r0.f29496c = r3
            java.lang.Object r5 = r2.getCategoriesInParentIds(r5, r0)
            if (r5 != r1) goto L4d
            return r1
        L4d:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel$a r0 = new com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel$a
            r0.<init>()
            java.util.List r5 = kotlin.collections.p.M0(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel.S(zz.a):java.lang.Object");
    }

    @Override // com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel
    public void U(int i11) {
        q().d((List) n().getValue(), i11, new l<List<? extends Integer>, wz.p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel$selectOption$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(List<Integer> it2) {
                o.i(it2, "it");
                CategoriesFilterViewModel.this.h0(it2);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(List<? extends Integer> list) {
                b(list);
                return wz.p.f75480a;
            }
        });
    }

    @Override // com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel
    public void V(int i11) {
        q().e((List) n().getValue(), i11, new l<List<? extends Integer>, wz.p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel$singleSelectOption$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(List<Integer> it2) {
                boolean z11;
                o.i(it2, "it");
                CategoriesFilterViewModel categoriesFilterViewModel = CategoriesFilterViewModel.this;
                ArrayList arrayList = new ArrayList();
                for (Object obj : it2) {
                    if (((Number) obj).intValue() == -1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        arrayList.add(obj);
                    }
                }
                categoriesFilterViewModel.h0(arrayList);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(List<? extends Integer> list) {
                b(list);
                return wz.p.f75480a;
            }
        });
    }

    @Override // com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel
    public void W(int i11) {
        q().f((List) n().getValue(), i11, new l<List<? extends Integer>, wz.p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel$unSelectOption$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(List<Integer> it2) {
                o.i(it2, "it");
                CategoriesFilterViewModel.this.h0(it2);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(List<? extends Integer> list) {
                b(list);
                return wz.p.f75480a;
            }
        });
    }

    @Override // com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel
    public void a0(c filterResult) {
        o.i(filterResult, "filterResult");
        q().i(filterResult, new l<List<? extends Integer>, wz.p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel$updateFiltrationData$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(List<Integer> listIds) {
                o.i(listIds, "listIds");
                CategoriesFilterViewModel.this.h0(listIds);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(List<? extends Integer> list) {
                b(list);
                return wz.p.f75480a;
            }
        });
    }

    @Override // com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel
    /* renamed from: e0 */
    public SelectableHandler q() {
        return this.A;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0071  */
    @Override // com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel
    /* renamed from: f0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object A(java.util.List<java.lang.Integer> r6, zz.a<? super java.lang.Boolean> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel$isAllSelected$1
            if (r0 == 0) goto L13
            r0 = r7
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel$isAllSelected$1 r0 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel$isAllSelected$1) r0
            int r1 = r0.f29484d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29484d = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel$isAllSelected$1 r0 = new com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel$isAllSelected$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f29482b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f29484d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            java.lang.Object r6 = r0.f29481a
            java.util.List r6 = (java.util.List) r6
            kotlin.f.b(r7)
            goto L56
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            kotlin.f.b(r7)
            r7 = r6
            java.util.Collection r7 = (java.util.Collection) r7
            if (r7 == 0) goto L47
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L45
            goto L47
        L45:
            r7 = r3
            goto L48
        L47:
            r7 = r4
        L48:
            if (r7 == 0) goto L4b
            goto L85
        L4b:
            r0.f29481a = r6
            r0.f29484d = r4
            java.lang.Object r7 = r5.S(r0)
            if (r7 != r1) goto L56
            return r1
        L56:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            boolean r0 = r7 instanceof java.util.Collection
            if (r0 == 0) goto L67
            r0 = r7
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L67
        L65:
            r3 = r4
            goto L85
        L67:
            java.util.Iterator r7 = r7.iterator()
        L6b:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L65
            java.lang.Object r0 = r7.next()
            hi.b r0 = (hi.b) r0
            int r0 = r0.getSelectedId()
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.a.d(r0)
            boolean r0 = r6.contains(r0)
            if (r0 != 0) goto L6b
        L85:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.a.a(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel.A(java.util.List, zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0084 A[LOOP:1: B:26:0x007e->B:28:0x0084, LOOP_END] */
    @Override // com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel
    /* renamed from: g0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object H(java.util.List<java.lang.Integer> r10, zz.a<? super java.util.List<dc.e>> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel$mapFromDataToSelectedView$1
            if (r0 == 0) goto L13
            r0 = r11
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel$mapFromDataToSelectedView$1 r0 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel$mapFromDataToSelectedView$1) r0
            int r1 = r0.f29488d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29488d = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel$mapFromDataToSelectedView$1 r0 = new com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel$mapFromDataToSelectedView$1
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f29486b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f29488d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r10 = r0.f29485a
            java.util.List r10 = (java.util.List) r10
            kotlin.f.b(r11)
            goto L45
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            kotlin.f.b(r11)
            if (r10 == 0) goto La4
            r0.f29485a = r10
            r0.f29488d = r3
            java.lang.Object r11 = r9.S(r0)
            if (r11 != r1) goto L45
            return r1
        L45:
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r11 = r11.iterator()
        L50:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L6f
            java.lang.Object r1 = r11.next()
            r2 = r1
            hi.b r2 = (hi.b) r2
            int r2 = r2.getSelectedId()
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.a.d(r2)
            boolean r2 = r10.contains(r2)
            if (r2 == 0) goto L50
            r0.add(r1)
            goto L50
        L6f:
            java.util.ArrayList r10 = new java.util.ArrayList
            r11 = 10
            int r11 = kotlin.collections.p.y(r0, r11)
            r10.<init>(r11)
            java.util.Iterator r11 = r0.iterator()
        L7e:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto La8
            java.lang.Object r0 = r11.next()
            hi.b r0 = (hi.b) r0
            dc.e r8 = new dc.e
            int r2 = r0.getSelectedId()
            java.lang.String r3 = r0.getLabel()
            java.lang.String r4 = r0.getLabelEn()
            r5 = 0
            r6 = 8
            r7 = 0
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r10.add(r8)
            goto L7e
        La4:
            java.util.List r10 = kotlin.collections.p.n()
        La8:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel.H(java.util.List, zz.a):java.lang.Object");
    }

    public final void h0(List<Integer> ids) {
        List<Integer> list;
        g00.a<wz.p> u11;
        o.i(ids, "ids");
        if (s().m(this) && (u11 = u()) != null) {
            u11.invoke();
        }
        Object value = n().getValue();
        List<Integer> list2 = ids;
        if (list2.isEmpty()) {
            list = null;
        } else {
            list = list2;
        }
        if (!(!o.d(value, list))) {
            return;
        }
        MutableStateFlow n11 = n();
        if (list2.isEmpty()) {
            list2 = null;
        }
        n11.setValue(list2);
        s().o(this);
    }

    @Override // com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel
    /* renamed from: i0 */
    public Object Y(List<Integer> list, zz.a<? super fc.b> aVar) {
        return q().h(p().getValue(), list, new CategoriesFilterViewModel$updateFilterRange$2(this, list, null), aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    @Override // com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(zz.a<? super com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.a> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel$generateFilterCapsule$1
            if (r0 == 0) goto L13
            r0 = r8
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel$generateFilterCapsule$1 r0 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel$generateFilterCapsule$1) r0
            int r1 = r0.f29480d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29480d = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel$generateFilterCapsule$1 r0 = new com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel$generateFilterCapsule$1
            r0.<init>(r7, r8)
        L18:
            r4 = r0
            java.lang.Object r8 = r4.f29478b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r4.f29480d
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            java.lang.Object r0 = r4.f29477a
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel r0 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel) r0
            kotlin.f.b(r8)
            goto L4b
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L36:
            kotlin.f.b(r8)
            r8 = 0
            r3 = 0
            r5 = 3
            r6 = 0
            r4.f29477a = r7
            r4.f29480d = r2
            r1 = r7
            r2 = r8
            java.lang.Object r8 = d0(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L4a
            return r0
        L4a:
            r0 = r7
        L4b:
            r2 = r8
            java.util.List r2 = (java.util.List) r2
            com.forsale.app.features.categories.listings.filtration.fullFiltration.filterModels.FilterScreenTypes r8 = r0.y()
            com.forsale.app.features.categories.listings.filtration.fullFiltration.filterModels.FilterViewType r8 = r8.a()
            java.lang.String r1 = "null cannot be cast to non-null type com.forsale.app.features.categories.listings.filtration.fullFiltration.filterModels.FilterViewType.FilterSelectionViewType"
            kotlin.jvm.internal.o.g(r8, r1)
            r1 = r8
            com.forsale.app.features.categories.listings.filtration.fullFiltration.filterModels.FilterViewType$FilterSelectionViewType r1 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.filterModels.FilterViewType.FilterSelectionViewType) r1
            com.forsale.app.datalayer.database.CategoryEntity r3 = r0.f29466y
            r4 = 0
            r5 = 4
            r6 = 0
            com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.a$a r8 = com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel.m(r0, r1, r2, r3, r4, r5, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel.j(zz.a):java.lang.Object");
    }
}
