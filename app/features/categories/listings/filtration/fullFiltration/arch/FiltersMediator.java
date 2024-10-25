package com.forsale.app.features.categories.listings.filtration.fullFiltration.arch;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.b0;
import cc.a;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.network.requestsbodies.GetListingsBody;
import com.forsale.app.datalayer.network.responses.ListingsResponse;
import com.forsale.app.datalayer.repositories.DistrictsRepository;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.BooleanAttributeFilterViewModel;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.NumberAttributeFilterViewModel;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.RangeAttributeFilterViewModel;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.LocationFilterViewModel;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.PriceFilterViewModel;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.ResetAllViewModel;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.SubCategoriesViewModel;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import dj.i;
import g00.p;
import g00.q;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.r;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import wz.h;
/* compiled from: FiltersMediator.kt */
/* loaded from: classes2.dex */
public final class FiltersMediator {

    /* renamed from: a  reason: collision with root package name */
    private final CoroutineScope f29080a;

    /* renamed from: b  reason: collision with root package name */
    private final CategoryEntity f29081b;

    /* renamed from: c  reason: collision with root package name */
    private final List<ListingsResponse.UISettings.FiltrationSetting> f29082c;

    /* renamed from: d  reason: collision with root package name */
    private final FiltersFactory f29083d;

    /* renamed from: e  reason: collision with root package name */
    private final OneShotEventHandler<GetListingsBody.FiltrationData> f29084e;

    /* renamed from: f  reason: collision with root package name */
    private final List<a> f29085f;

    /* renamed from: g  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f29086g;

    /* renamed from: h  reason: collision with root package name */
    private final AggregatedAllAnalyticsLogger f29087h;

    /* renamed from: i  reason: collision with root package name */
    private final DistrictsRepository f29088i;

    /* renamed from: j  reason: collision with root package name */
    private final MutableStateFlow<Integer> f29089j;

    /* renamed from: k  reason: collision with root package name */
    private final StateFlow<Integer> f29090k;

    /* renamed from: l  reason: collision with root package name */
    private List<? extends FilterViewModel<?, ?, ?>> f29091l;

    /* renamed from: m  reason: collision with root package name */
    private final h f29092m;

    /* renamed from: n  reason: collision with root package name */
    private final b0<Boolean> f29093n;

    /* renamed from: o  reason: collision with root package name */
    private final LiveData<Boolean> f29094o;

    /* compiled from: FiltersMediator.kt */
    @d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator$2", f = "FiltersMediator.kt", l = {81}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    static final class AnonymousClass2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f29095a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: FiltersMediator.kt */
        @d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator$2$1", f = "FiltersMediator.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator$2$1  reason: invalid class name */
        /* loaded from: classes2.dex */
        public static final class AnonymousClass1 extends SuspendLambda implements p<Integer, zz.a<? super wz.p>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f29097a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ int f29098b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ FiltersMediator f29099c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(FiltersMediator filtersMediator, zz.a<? super AnonymousClass1> aVar) {
                super(2, aVar);
                this.f29099c = filtersMediator;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f29099c, aVar);
                anonymousClass1.f29098b = ((Number) obj).intValue();
                return anonymousClass1;
            }

            public final Object invoke(int i11, zz.a<? super wz.p> aVar) {
                return ((AnonymousClass1) create(Integer.valueOf(i11), aVar)).invokeSuspend(wz.p.f75480a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                boolean z11;
                b.f();
                if (this.f29097a == 0) {
                    f.b(obj);
                    int i11 = this.f29098b;
                    MutableStateFlow mutableStateFlow = this.f29099c.f29086g;
                    if (mutableStateFlow != null) {
                        if (i11 > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        mutableStateFlow.setValue(kotlin.coroutines.jvm.internal.a.a(z11));
                    }
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ Object invoke(Integer num, zz.a<? super wz.p> aVar) {
                return invoke(num.intValue(), aVar);
            }
        }

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
            f11 = b.f();
            int i11 = this.f29095a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                StateFlow<Integer> l11 = FiltersMediator.this.l();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(FiltersMediator.this, null);
                this.f29095a = 1;
                if (FlowKt.collectLatest(l11, anonymousClass1, this) == f11) {
                    return f11;
                }
            }
            return wz.p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FiltersMediator(CoroutineScope scope, CategoryEntity rootCategory, List<ListingsResponse.UISettings.FiltrationSetting> filtrationSettings, FiltersFactory filtersFactory, OneShotEventHandler<GetListingsBody.FiltrationData> onFiltrationDataChangeEvent, List<? extends a> list, MutableStateFlow<Boolean> mutableStateFlow, AggregatedAllAnalyticsLogger analyticsLogger, DistrictsRepository districtsRepository) {
        h a11;
        String t02;
        o.i(scope, "scope");
        o.i(rootCategory, "rootCategory");
        o.i(filtrationSettings, "filtrationSettings");
        o.i(filtersFactory, "filtersFactory");
        o.i(onFiltrationDataChangeEvent, "onFiltrationDataChangeEvent");
        o.i(analyticsLogger, "analyticsLogger");
        o.i(districtsRepository, "districtsRepository");
        this.f29080a = scope;
        this.f29081b = rootCategory;
        this.f29082c = filtrationSettings;
        this.f29083d = filtersFactory;
        this.f29084e = onFiltrationDataChangeEvent;
        this.f29085f = list;
        this.f29086g = mutableStateFlow;
        this.f29087h = analyticsLogger;
        this.f29088i = districtsRepository;
        MutableStateFlow<Integer> MutableStateFlow = StateFlowKt.MutableStateFlow(0);
        this.f29089j = MutableStateFlow;
        this.f29090k = FlowKt.asStateFlow(MutableStateFlow);
        this.f29091l = filtersFactory.c(filtrationSettings, this, list);
        a11 = kotlin.d.a(new g00.a<StateFlow<? extends List<? extends Integer>>>() { // from class: com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator$onCategoryChanged$2

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: FiltersMediator.kt */
            @d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator$onCategoryChanged$2$5", f = "FiltersMediator.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator$onCategoryChanged$2$5  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass5 extends SuspendLambda implements q<List<? extends Integer>, List<? extends Integer>, zz.a<? super List<? extends Integer>>, Object> {

                /* renamed from: a  reason: collision with root package name */
                int f29122a;

                /* renamed from: b  reason: collision with root package name */
                /* synthetic */ Object f29123b;

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f29124c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ FiltersMediator f29125d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass5(FiltersMediator filtersMediator, zz.a<? super AnonymousClass5> aVar) {
                    super(3, aVar);
                    this.f29125d = filtersMediator;
                }

                @Override // g00.q
                /* renamed from: b */
                public final Object invoke(List<Integer> list, List<Integer> list2, zz.a<? super List<Integer>> aVar) {
                    AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.f29125d, aVar);
                    anonymousClass5.f29123b = list;
                    anonymousClass5.f29124c = list2;
                    return anonymousClass5.invokeSuspend(wz.p.f75480a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    List n11;
                    List list;
                    List E0;
                    CategoryEntity categoryEntity;
                    List e11;
                    b.f();
                    if (this.f29122a == 0) {
                        f.b(obj);
                        List list2 = (List) this.f29123b;
                        List list3 = (List) this.f29124c;
                        if (list2 == null) {
                            list2 = r.n();
                        }
                        List list4 = list2;
                        if (list3 == null) {
                            n11 = r.n();
                            list = n11;
                        } else {
                            list = list3;
                        }
                        E0 = CollectionsKt___CollectionsKt.E0(list4, list);
                        if (E0.isEmpty()) {
                            E0 = null;
                        }
                        if (E0 == null) {
                            categoryEntity = this.f29125d.f29081b;
                            e11 = kotlin.collections.q.e(kotlin.coroutines.jvm.internal.a.d(categoryEntity.getId()));
                            return e11;
                        }
                        return E0;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final StateFlow<List<Integer>> invoke() {
                Object obj;
                MutableStateFlow MutableStateFlow2;
                Object obj2;
                MutableStateFlow<List<? extends Integer>> MutableStateFlow3;
                CoroutineScope coroutineScope;
                CategoryEntity categoryEntity;
                List e11;
                Iterator<T> it2 = FiltersMediator.this.i().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj = it2.next();
                        if (((FilterViewModel) obj) instanceof CategoriesFilterViewModel) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                FilterViewModel filterViewModel = (FilterViewModel) obj;
                if (filterViewModel == null || (MutableStateFlow2 = ((CategoriesFilterViewModel) filterViewModel).n()) == null) {
                    MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
                }
                Iterator<T> it3 = FiltersMediator.this.i().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj2 = it3.next();
                        if (((FilterViewModel) obj2) instanceof SubCategoriesViewModel) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                FilterViewModel filterViewModel2 = (FilterViewModel) obj2;
                if (filterViewModel2 == null || (MutableStateFlow3 = ((SubCategoriesViewModel) filterViewModel2).n()) == null) {
                    MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
                }
                Flow flowCombine = FlowKt.flowCombine(MutableStateFlow2, MutableStateFlow3, new AnonymousClass5(FiltersMediator.this, null));
                coroutineScope = FiltersMediator.this.f29080a;
                SharingStarted lazily = SharingStarted.Companion.getLazily();
                categoryEntity = FiltersMediator.this.f29081b;
                e11 = kotlin.collections.q.e(Integer.valueOf(categoryEntity.getId()));
                return FlowKt.stateIn(flowCombine, coroutineScope, lazily, e11);
            }
        });
        this.f29092m = a11;
        b0<Boolean> b0Var = new b0<>(Boolean.TRUE);
        this.f29093n = b0Var;
        this.f29094o = b0Var;
        i invoke = i.f54287a.invoke();
        invoke.d("DropdownAttributeFilterViewModel", "CATEGORY: " + rootCategory);
        t02 = CollectionsKt___CollectionsKt.t0(filtrationSettings, "\n###\n", null, null, 0, null, null, 62, null);
        invoke.d("DropdownAttributeFilterViewModel", "FILTRATION_SETTINGS: " + t02);
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new AnonymousClass2(null), 3, null);
    }

    private final GetListingsBody.FiltrationData e(List<? extends FilterViewModel<?, ?, ?>> list) {
        GetListingsBody.FiltrationData filtrationData = new GetListingsBody.FiltrationData(null, null, null, null, null, 31, null);
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            FilterViewModel filterViewModel = (FilterViewModel) it2.next();
            if (filterViewModel instanceof DropDownAttributeFilterViewModel) {
                filtrationData = filtrationData.addAttribute((GetListingsBody.FiltrationData.Attribute) ((DropDownAttributeFilterViewModel) filterViewModel).Q(true));
            } else if (filterViewModel instanceof NumberAttributeFilterViewModel) {
                filtrationData = filtrationData.addAttribute((GetListingsBody.FiltrationData.Attribute) ((NumberAttributeFilterViewModel) filterViewModel).Q(true));
            } else if (filterViewModel instanceof RangeAttributeFilterViewModel) {
                filtrationData = filtrationData.addAttribute((GetListingsBody.FiltrationData.Attribute) ((RangeAttributeFilterViewModel) filterViewModel).Q(true));
            } else if (filterViewModel instanceof BooleanAttributeFilterViewModel) {
                filtrationData = filtrationData.addSelectedBooleanAttributes((List) ((BooleanAttributeFilterViewModel) filterViewModel).Q(true));
            } else if (filterViewModel instanceof CategoriesFilterViewModel) {
                filtrationData = GetListingsBody.FiltrationData.copy$default(filtrationData, (List) ((CategoriesFilterViewModel) filterViewModel).Q(true), null, null, null, null, 30, null);
            } else if (filterViewModel instanceof LocationFilterViewModel) {
                filtrationData = GetListingsBody.FiltrationData.copy$default(filtrationData, null, null, (List) ((LocationFilterViewModel) filterViewModel).Q(true), null, null, 27, null);
            } else if (filterViewModel instanceof PriceFilterViewModel) {
                filtrationData = GetListingsBody.FiltrationData.copy$default(filtrationData, null, null, null, ((PriceFilterViewModel) filterViewModel).Q(true), null, 23, null);
            } else if (filterViewModel instanceof SubCategoriesViewModel) {
                filtrationData = GetListingsBody.FiltrationData.copy$default(filtrationData, null, ((SubCategoriesViewModel) filterViewModel).Q(true), null, null, null, 29, null);
            } else if (!(filterViewModel instanceof ResetAllViewModel)) {
                throw new IllegalArgumentException();
            }
        }
        return filtrationData;
    }

    private final void f(List<? extends FilterViewModel<?, ?, ?>> list, boolean z11) {
        GetListingsBody.FiltrationData e11 = e(list);
        e11.setResetAll(z11);
        this.f29089j.setValue(Integer.valueOf(e11.getCount()));
        GetListingsBody.FiltrationData g11 = this.f29084e.g();
        if (g11 == null) {
            g11 = new GetListingsBody.FiltrationData(null, null, null, null, null, 31, null);
        }
        if (!o.d(e11, g11)) {
            this.f29084e.i(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void g(FiltersMediator filtersMediator, List list, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        filtersMediator.f(list, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object h(FilterViewModel<?, ?, ?> filterViewModel, List<? extends FilterViewModel<?, ?, ?>> list, zz.a<? super wz.p> aVar) {
        Object f11;
        Object coroutineScope = CoroutineScopeKt.coroutineScope(new FiltersMediator$findAndNotifyChildrenThatParentChanged$2(list, filterViewModel, null), aVar);
        f11 = b.f();
        if (coroutineScope == f11) {
            return coroutineScope;
        }
        return wz.p.f75480a;
    }

    private final GetListingsBody.FiltrationData s() {
        return e(this.f29091l);
    }

    public final List<FilterViewModel<?, ?, ?>> i() {
        return this.f29091l;
    }

    public final GetListingsBody.FiltrationData j() {
        return e(this.f29091l);
    }

    public final StateFlow<List<Integer>> k() {
        return (StateFlow) this.f29092m.getValue();
    }

    public final StateFlow<Integer> l() {
        return this.f29090k;
    }

    public final boolean m(FilterViewModel<?, ?, ?> filterViewModel) {
        boolean z11;
        o.i(filterViewModel, "filterViewModel");
        List<ListingsResponse.UISettings.FiltrationSetting> subFilters = filterViewModel.w().getSubFilters();
        if (subFilters != null && !subFilters.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        boolean z12 = !z11;
        this.f29093n.postValue(Boolean.valueOf(!z12));
        return z12;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(boolean r6, zz.a<? super wz.p> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator$isFreezing$1
            if (r0 == 0) goto L13
            r0 = r7
            com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator$isFreezing$1 r0 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator$isFreezing$1) r0
            int r1 = r0.f29110d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29110d = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator$isFreezing$1 r0 = new com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator$isFreezing$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f29108b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f29110d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.f29107a
            java.util.Iterator r6 = (java.util.Iterator) r6
            kotlin.f.b(r7)
            goto L6c
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            java.lang.Object r6 = r0.f29107a
            java.util.Iterator r6 = (java.util.Iterator) r6
            kotlin.f.b(r7)
            goto L4d
        L40:
            kotlin.f.b(r7)
            if (r6 == 0) goto L64
            java.util.List<? extends com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel<?, ?, ?>> r6 = r5.f29091l
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L4d:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L83
            java.lang.Object r7 = r6.next()
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel r7 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel) r7
            r0.f29107a = r6
            r0.f29110d = r4
            java.lang.Object r7 = r7.i(r0)
            if (r7 != r1) goto L4d
            return r1
        L64:
            java.util.List<? extends com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel<?, ?, ?>> r6 = r5.f29091l
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L6c:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L83
            java.lang.Object r7 = r6.next()
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel r7 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel) r7
            r0.f29107a = r6
            r0.f29110d = r3
            java.lang.Object r7 = r7.X(r0)
            if (r7 != r1) goto L6c
            return r1
        L83:
            wz.p r6 = wz.p.f75480a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator.n(boolean, zz.a):java.lang.Object");
    }

    public final void o(FilterViewModel<?, ?, ?> filterViewModel) {
        o.i(filterViewModel, "filterViewModel");
        BuildersKt__Builders_commonKt.launch$default(this.f29080a, null, null, new FiltersMediator$notifyChange$1(filterViewModel, this, null), 3, null);
    }

    public final void p(List<? extends FilterViewModel<?, ?, ?>> filtersViewModel) {
        o.i(filtersViewModel, "filtersViewModel");
        BuildersKt__Builders_commonKt.launch$default(this.f29080a, null, null, new FiltersMediator$notifyChanges$1(filtersViewModel, this, null), 3, null);
    }

    public final List<Integer> q() {
        GetListingsBody.FiltrationData s11 = s();
        List<Integer> subCategory = s11.getSubCategory();
        if (subCategory == null) {
            return s11.getCategory();
        }
        return subCategory;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a0 A[LOOP:1: B:39:0x009a->B:41:0x00a0, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(zz.a<? super java.util.List<java.lang.Integer>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator$pullAllDistrictIds$1
            if (r0 == 0) goto L13
            r0 = r7
            com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator$pullAllDistrictIds$1 r0 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator$pullAllDistrictIds$1) r0
            int r1 = r0.f29128c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29128c = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator$pullAllDistrictIds$1 r0 = new com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator$pullAllDistrictIds$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f29126a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f29128c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            kotlin.f.b(r7)
            goto L5e
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            kotlin.f.b(r7)
            com.forsale.app.datalayer.network.requestsbodies.GetListingsBody$FiltrationData r7 = r6.s()
            java.util.List r7 = r7.getLocation()
            r2 = r7
            java.util.Collection r2 = (java.util.Collection) r2
            if (r2 == 0) goto L4b
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L49
            goto L4b
        L49:
            r2 = r3
            goto L4c
        L4b:
            r2 = r4
        L4c:
            r5 = 0
            if (r2 != 0) goto L50
            goto L51
        L50:
            r7 = r5
        L51:
            if (r7 == 0) goto Lb2
            com.forsale.app.datalayer.repositories.DistrictsRepository r2 = r6.f29088i
            r0.f29128c = r4
            java.lang.Object r7 = r2.getDistrictsByIds(r7, r0)
            if (r7 != r1) goto L5e
            return r1
        L5e:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L69:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L8b
            java.lang.Object r1 = r7.next()
            r2 = r1
            com.forsale.app.datalayer.database.DistrictEntity r2 = (com.forsale.app.datalayer.database.DistrictEntity) r2
            int r2 = r2.getLevel()
            com.forsale.app.features.postad.location.LocationLevels r5 = com.forsale.app.features.postad.location.LocationLevels.DISTRICT
            int r5 = r5.getLevel()
            if (r2 != r5) goto L84
            r2 = r4
            goto L85
        L84:
            r2 = r3
        L85:
            if (r2 == 0) goto L69
            r0.add(r1)
            goto L69
        L8b:
            java.util.ArrayList r5 = new java.util.ArrayList
            r7 = 10
            int r7 = kotlin.collections.p.y(r0, r7)
            r5.<init>(r7)
            java.util.Iterator r7 = r0.iterator()
        L9a:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Lb2
            java.lang.Object r0 = r7.next()
            com.forsale.app.datalayer.database.DistrictEntity r0 = (com.forsale.app.datalayer.database.DistrictEntity) r0
            int r0 = r0.getId()
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.a.d(r0)
            r5.add(r0)
            goto L9a
        Lb2:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator.r(zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059 A[LOOP:0: B:21:0x0053->B:23:0x0059, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(zz.a<? super wz.p> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator$resetAll$1
            if (r0 == 0) goto L13
            r0 = r7
            com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator$resetAll$1 r0 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator$resetAll$1) r0
            int r1 = r0.f29132d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29132d = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator$resetAll$1 r0 = new com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator$resetAll$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f29130b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f29132d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r7)
            goto L75
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            java.lang.Object r2 = r0.f29129a
            com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator r2 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator) r2
            kotlin.f.b(r7)
            goto L4b
        L3c:
            kotlin.f.b(r7)
            r0.f29129a = r6
            r0.f29132d = r4
            java.lang.Object r7 = r6.n(r4, r0)
            if (r7 != r1) goto L4a
            return r1
        L4a:
            r2 = r6
        L4b:
            java.util.List<? extends com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel<?, ?, ?>> r7 = r2.f29091l
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L53:
            boolean r5 = r7.hasNext()
            if (r5 == 0) goto L63
            java.lang.Object r5 = r7.next()
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel r5 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel) r5
            r5.T()
            goto L53
        L63:
            java.util.List<? extends com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel<?, ?, ?>> r7 = r2.f29091l
            r2.f(r7, r4)
            r7 = 0
            r0.f29129a = r7
            r0.f29132d = r3
            r7 = 0
            java.lang.Object r7 = r2.n(r7, r0)
            if (r7 != r1) goto L75
            return r1
        L75:
            wz.p r7 = wz.p.f75480a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator.t(zz.a):java.lang.Object");
    }

    public final List<FilterViewModel<?, ?, ?>> u(List<? extends a> list) {
        List<FilterViewModel<?, ?, ?>> c11 = this.f29083d.c(this.f29082c, this, list);
        this.f29091l = c11;
        p(c11);
        return c11;
    }
}
