package com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels;

import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.database.ExtraAttributeOptionEntity;
import com.forsale.app.datalayer.network.requestsbodies.GetListingsBody;
import com.forsale.app.datalayer.network.responses.ListingsResponse;
import com.forsale.app.datalayer.repositories.ExtraAttributeRawRepository;
import com.forsale.app.datalayer.repositories.FiltersRepository;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.commonViewModelsHandlers.SelectableHandler;
import com.forsale.app.features.postad.extraattributes.enums.AttributeType;
import fc.c;
import g00.l;
import g00.p;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Triple;
import kotlin.collections.r;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: DropDownAttributeFilterViewModel.kt */
/* loaded from: classes2.dex */
public final class DropDownAttributeFilterViewModel extends FilterViewModel {
    public static final a B = new a(null);
    public static final int C = 8;
    private final SelectableHandler A;

    /* renamed from: x  reason: collision with root package name */
    private final ExtraAttributeRawRepository f29275x;

    /* renamed from: y  reason: collision with root package name */
    private final CategoryEntity f29276y;

    /* renamed from: z  reason: collision with root package name */
    private final MutableSharedFlow<Triple<FilterViewModel<?, ?, ?>, com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.a, Integer>> f29277z;

    /* compiled from: DropDownAttributeFilterViewModel.kt */
    @d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel$1", f = "DropDownAttributeFilterViewModel.kt", l = {49}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f29278a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DropDownAttributeFilterViewModel.kt */
        @d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel$1$1", f = "DropDownAttributeFilterViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C03241 extends SuspendLambda implements p<Boolean, zz.a<? super wz.p>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f29280a;

            C03241(zz.a<? super C03241> aVar) {
                super(2, aVar);
            }

            public final Object b(boolean z11, zz.a<? super wz.p> aVar) {
                return ((C03241) create(Boolean.valueOf(z11), aVar)).invokeSuspend(wz.p.f75480a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
                return new C03241(aVar);
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, zz.a<? super wz.p> aVar) {
                return b(bool.booleanValue(), aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.f();
                if (this.f29280a == 0) {
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
            f11 = kotlin.coroutines.intrinsics.b.f();
            int i11 = this.f29278a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                StateFlow<Boolean> B = DropDownAttributeFilterViewModel.this.B();
                C03241 c03241 = new C03241(null);
                this.f29278a = 1;
                if (FlowKt.collectLatest(B, c03241, this) == f11) {
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

    /* compiled from: DropDownAttributeFilterViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes2.dex */
    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            int a11;
            a11 = yz.b.a(Integer.valueOf(((ExtraAttributeOptionEntity) t11).getDisplayOrderSort()), Integer.valueOf(((ExtraAttributeOptionEntity) t12).getDisplayOrderSort()));
            return a11;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DropDownAttributeFilterViewModel(CoroutineScope cs2, ListingsResponse.UISettings.FiltrationSetting setting, FiltersMediator mediator, ExtraAttributeRawRepository attRepo, FiltersRepository filtersRepository, CategoryEntity rootCategory, GetListingsBody.FiltrationData.Attribute<List<Integer>> attribute, boolean z11, MutableSharedFlow<Triple<FilterViewModel<?, ?, ?>, com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.a, Integer>> onFilterClicked) {
        super(cs2, setting, mediator, filtersRepository, attribute, z11, onFilterClicked);
        o.i(cs2, "cs");
        o.i(setting, "setting");
        o.i(mediator, "mediator");
        o.i(attRepo, "attRepo");
        o.i(filtersRepository, "filtersRepository");
        o.i(rootCategory, "rootCategory");
        o.i(onFilterClicked, "onFilterClicked");
        this.f29275x = attRepo;
        this.f29276y = rootCategory;
        this.f29277z = onFilterClicked;
        this.A = new SelectableHandler(y().a());
        BuildersKt__Builders_commonKt.launch$default(cs2, null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084 A[PHI: r9 
      PHI: (r9v6 java.lang.Object) = (r9v5 java.lang.Object), (r9v1 java.lang.Object) binds: [B:29:0x0081, B:12:0x0029] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c0(com.forsale.app.datalayer.network.requestsbodies.GetListingsBody.FiltrationData.Attribute<java.util.List<java.lang.Integer>> r7, boolean r8, zz.a<? super java.util.List<dc.c>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel$createSelectableDataOptions$1
            if (r0 == 0) goto L13
            r0 = r9
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel$createSelectableDataOptions$1 r0 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel$createSelectableDataOptions$1) r0
            int r1 = r0.f29286f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29286f = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel$createSelectableDataOptions$1 r0 = new com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel$createSelectableDataOptions$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f29284d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f29286f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L43
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.f.b(r9)
            goto L84
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            boolean r8 = r0.f29283c
            java.lang.Object r7 = r0.f29282b
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r2 = r0.f29281a
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel r2 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel) r2
            kotlin.f.b(r9)
            goto L71
        L43:
            kotlin.f.b(r9)
            if (r7 == 0) goto L50
            java.lang.Object r7 = r7.getValue()
            java.util.List r7 = (java.util.List) r7
            if (r7 != 0) goto L61
        L50:
            r7 = 0
            java.lang.Object r7 = com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel.R(r6, r7, r4, r5)
            com.forsale.app.datalayer.network.requestsbodies.GetListingsBody$FiltrationData$Attribute r7 = (com.forsale.app.datalayer.network.requestsbodies.GetListingsBody.FiltrationData.Attribute) r7
            if (r7 == 0) goto L60
            java.lang.Object r7 = r7.getValue()
            java.util.List r7 = (java.util.List) r7
            goto L61
        L60:
            r7 = r5
        L61:
            r0.f29281a = r6
            r0.f29282b = r7
            r0.f29283c = r8
            r0.f29286f = r4
            java.lang.Object r9 = r6.S(r0)
            if (r9 != r1) goto L70
            return r1
        L70:
            r2 = r6
        L71:
            java.util.List r9 = (java.util.List) r9
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.commonViewModelsHandlers.SelectableHandler r2 = r2.q()
            r0.f29281a = r5
            r0.f29282b = r5
            r0.f29286f = r3
            java.lang.Object r9 = r2.b(r9, r7, r8, r0)
            if (r9 != r1) goto L84
            return r1
        L84:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel.c0(com.forsale.app.datalayer.network.requestsbodies.GetListingsBody$FiltrationData$Attribute, boolean, zz.a):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object d0(DropDownAttributeFilterViewModel dropDownAttributeFilterViewModel, GetListingsBody.FiltrationData.Attribute attribute, boolean z11, zz.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            attribute = null;
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return dropDownAttributeFilterViewModel.c0(attribute, z11, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b1 A[LOOP:1: B:40:0x00ab->B:42:0x00b1, LOOP_END] */
    @Override // com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object N(zz.a<? super com.forsale.app.utils.analytics.listingfiltration.a> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel$pullAnalyticsData$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel$pullAnalyticsData$1 r0 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel$pullAnalyticsData$1) r0
            int r1 = r0.f29303e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29303e = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel$pullAnalyticsData$1 r0 = new com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel$pullAnalyticsData$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f29301c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f29303e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r1 = r0.f29300b
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r0.f29299a
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel r0 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel) r0
            kotlin.f.b(r6)
            goto L72
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L39:
            kotlin.f.b(r6)
            java.lang.Object r6 = r5.Q(r3)
            com.forsale.app.datalayer.network.requestsbodies.GetListingsBody$FiltrationData$Attribute r6 = (com.forsale.app.datalayer.network.requestsbodies.GetListingsBody.FiltrationData.Attribute) r6
            r2 = 0
            if (r6 == 0) goto L4c
            java.lang.Object r6 = r6.getValue()
            java.util.List r6 = (java.util.List) r6
            goto L4d
        L4c:
            r6 = r2
        L4d:
            r4 = r6
            java.util.Collection r4 = (java.util.Collection) r4
            if (r4 == 0) goto L5b
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L59
            goto L5b
        L59:
            r4 = 0
            goto L5c
        L5b:
            r4 = r3
        L5c:
            if (r4 != 0) goto L5f
            goto L60
        L5f:
            r6 = r2
        L60:
            if (r6 == 0) goto Lc8
            r0.f29299a = r5
            r0.f29300b = r6
            r0.f29303e = r3
            java.lang.Object r0 = r5.S(r0)
            if (r0 != r1) goto L6f
            return r1
        L6f:
            r1 = r6
            r6 = r0
            r0 = r5
        L72:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r6 = r6.iterator()
        L7d:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L9c
            java.lang.Object r3 = r6.next()
            r4 = r3
            hi.b r4 = (hi.b) r4
            int r4 = r4.getSelectedId()
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.a.d(r4)
            boolean r4 = r1.contains(r4)
            if (r4 == 0) goto L7d
            r2.add(r3)
            goto L7d
        L9c:
            java.util.ArrayList r6 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.p.y(r2, r1)
            r6.<init>(r1)
            java.util.Iterator r1 = r2.iterator()
        Lab:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lbf
            java.lang.Object r2 = r1.next()
            hi.b r2 = (hi.b) r2
            java.lang.String r2 = r2.getLabelEn()
            r6.add(r2)
            goto Lab
        Lbf:
            com.forsale.app.utils.analytics.listingfiltration.a$d r2 = new com.forsale.app.utils.analytics.listingfiltration.a$d
            java.lang.String r0 = r0.x()
            r2.<init>(r0, r6)
        Lc8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel.N(zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object S(zz.a<? super java.util.List<? extends hi.b>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel$pullFiltrationRange$1
            if (r0 == 0) goto L13
            r0 = r7
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel$pullFiltrationRange$1 r0 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel$pullFiltrationRange$1) r0
            int r1 = r0.f29307d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29307d = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel$pullFiltrationRange$1 r0 = new com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel$pullFiltrationRange$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f29305b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f29307d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            kotlin.f.b(r7)
            goto L77
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            java.lang.Object r2 = r0.f29304a
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel r2 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel) r2
            kotlin.f.b(r7)
            goto L5c
        L3d:
            kotlin.f.b(r7)
            com.forsale.app.datalayer.network.responses.ListingsResponse$UISettings$FiltrationSetting r7 = r6.w()
            java.lang.Integer r7 = r7.getAttributeId()
            if (r7 == 0) goto L5f
            int r7 = r7.intValue()
            com.forsale.app.datalayer.repositories.ExtraAttributeRawRepository r2 = r6.f29275x
            r0.f29304a = r6
            r0.f29307d = r5
            java.lang.Object r7 = r2.getExtraAttributesById(r7, r0)
            if (r7 != r1) goto L5b
            return r1
        L5b:
            r2 = r6
        L5c:
            com.forsale.app.datalayer.database.ExtraAttributeEntity r7 = (com.forsale.app.datalayer.database.ExtraAttributeEntity) r7
            goto L61
        L5f:
            r2 = r6
            r7 = r3
        L61:
            if (r7 == 0) goto L84
            r7.getId()
            com.forsale.app.datalayer.repositories.ExtraAttributeRawRepository r2 = r2.f29275x
            int r7 = r7.getId()
            r0.f29304a = r3
            r0.f29307d = r4
            java.lang.Object r7 = r2.getExtraAttributeOptionsBuAttributeId(r7, r0)
            if (r7 != r1) goto L77
            return r1
        L77:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel$b r0 = new com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel$b
            r0.<init>()
            java.util.List r7 = kotlin.collections.p.M0(r7, r0)
            if (r7 != 0) goto L88
        L84:
            java.util.List r7 = kotlin.collections.p.n()
        L88:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel.S(zz.a):java.lang.Object");
    }

    @Override // com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel
    public void U(int i11) {
        SelectableHandler q11 = q();
        List<Integer> list = null;
        GetListingsBody.FiltrationData.Attribute attribute = (GetListingsBody.FiltrationData.Attribute) FilterViewModel.R(this, false, 1, null);
        if (attribute != null) {
            list = (List) attribute.getValue();
        }
        q11.d(list, i11, new l<List<? extends Integer>, wz.p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel$selectOption$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(List<Integer> it2) {
                o.i(it2, "it");
                DropDownAttributeFilterViewModel.this.i0(it2);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(List<? extends Integer> list2) {
                b(list2);
                return wz.p.f75480a;
            }
        });
    }

    @Override // com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel
    public void V(int i11) {
        SelectableHandler q11 = q();
        List<Integer> list = null;
        GetListingsBody.FiltrationData.Attribute attribute = (GetListingsBody.FiltrationData.Attribute) FilterViewModel.R(this, false, 1, null);
        if (attribute != null) {
            list = (List) attribute.getValue();
        }
        q11.e(list, i11, new l<List<? extends Integer>, wz.p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel$singleSelectOption$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(List<Integer> it2) {
                boolean z11;
                o.i(it2, "it");
                DropDownAttributeFilterViewModel dropDownAttributeFilterViewModel = DropDownAttributeFilterViewModel.this;
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
                dropDownAttributeFilterViewModel.i0(arrayList);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(List<? extends Integer> list2) {
                b(list2);
                return wz.p.f75480a;
            }
        });
    }

    @Override // com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel
    public void W(int i11) {
        SelectableHandler q11 = q();
        List<Integer> list = null;
        GetListingsBody.FiltrationData.Attribute attribute = (GetListingsBody.FiltrationData.Attribute) FilterViewModel.R(this, false, 1, null);
        if (attribute != null) {
            list = (List) attribute.getValue();
        }
        q11.f(list, i11, new l<List<? extends Integer>, wz.p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel$unSelectOption$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(List<Integer> it2) {
                o.i(it2, "it");
                DropDownAttributeFilterViewModel.this.i0(it2);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(List<? extends Integer> list2) {
                b(list2);
                return wz.p.f75480a;
            }
        });
    }

    @Override // com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel
    public void a0(c filterResult) {
        o.i(filterResult, "filterResult");
        q().i(filterResult, new l<List<? extends Integer>, wz.p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel$updateFiltrationData$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(List<Integer> listIds) {
                o.i(listIds, "listIds");
                DropDownAttributeFilterViewModel.this.i0(listIds);
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
    /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
    @Override // com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel
    /* renamed from: f0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object A(com.forsale.app.datalayer.network.requestsbodies.GetListingsBody.FiltrationData.Attribute<java.util.List<java.lang.Integer>> r6, zz.a<? super java.lang.Boolean> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel$isAllSelected$1
            if (r0 == 0) goto L13
            r0 = r7
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel$isAllSelected$1 r0 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel$isAllSelected$1) r0
            int r1 = r0.f29294d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29294d = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel$isAllSelected$1 r0 = new com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel$isAllSelected$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f29292b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f29294d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            java.lang.Object r6 = r0.f29291a
            com.forsale.app.datalayer.network.requestsbodies.GetListingsBody$FiltrationData$Attribute r6 = (com.forsale.app.datalayer.network.requestsbodies.GetListingsBody.FiltrationData.Attribute) r6
            kotlin.f.b(r7)
            goto L5f
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            kotlin.f.b(r7)
            if (r6 == 0) goto L42
            java.lang.Object r7 = r6.getValue()
            java.util.List r7 = (java.util.List) r7
            goto L43
        L42:
            r7 = 0
        L43:
            java.util.Collection r7 = (java.util.Collection) r7
            if (r7 == 0) goto L50
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L4e
            goto L50
        L4e:
            r7 = r3
            goto L51
        L50:
            r7 = r4
        L51:
            if (r7 == 0) goto L54
            goto L9d
        L54:
            r0.f29291a = r6
            r0.f29294d = r4
            java.lang.Object r7 = r5.S(r0)
            if (r7 != r1) goto L5f
            return r1
        L5f:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            boolean r0 = r7 instanceof java.util.Collection
            if (r0 == 0) goto L70
            r0 = r7
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L70
        L6e:
            r3 = r4
            goto L9d
        L70:
            java.util.Iterator r7 = r7.iterator()
        L74:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L6e
            java.lang.Object r0 = r7.next()
            hi.b r0 = (hi.b) r0
            if (r6 == 0) goto L9a
            java.lang.Object r1 = r6.getValue()
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L9a
            int r0 = r0.getSelectedId()
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.a.d(r0)
            boolean r0 = r1.contains(r0)
            if (r0 != r4) goto L9a
            r0 = r4
            goto L9b
        L9a:
            r0 = r3
        L9b:
            if (r0 != 0) goto L74
        L9d:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.a.a(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel.A(com.forsale.app.datalayer.network.requestsbodies.GetListingsBody$FiltrationData$Attribute, zz.a):java.lang.Object");
    }

    @Override // com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel
    /* renamed from: g0 */
    public int G(GetListingsBody.FiltrationData.Attribute<List<Integer>> attribute) {
        List<Integer> list;
        if (attribute != null) {
            list = attribute.getValue();
        } else {
            list = null;
        }
        if (list != null) {
            return attribute.getValue().size();
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e A[LOOP:1: B:29:0x0088->B:31:0x008e, LOOP_END] */
    @Override // com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel
    /* renamed from: h0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object H(com.forsale.app.datalayer.network.requestsbodies.GetListingsBody.FiltrationData.Attribute<java.util.List<java.lang.Integer>> r10, zz.a<? super java.util.List<dc.e>> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel$mapFromDataToSelectedView$1
            if (r0 == 0) goto L13
            r0 = r11
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel$mapFromDataToSelectedView$1 r0 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel$mapFromDataToSelectedView$1) r0
            int r1 = r0.f29298d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29298d = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel$mapFromDataToSelectedView$1 r0 = new com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel$mapFromDataToSelectedView$1
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f29296b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f29298d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r10 = r0.f29295a
            com.forsale.app.datalayer.network.requestsbodies.GetListingsBody$FiltrationData$Attribute r10 = (com.forsale.app.datalayer.network.requestsbodies.GetListingsBody.FiltrationData.Attribute) r10
            kotlin.f.b(r11)
            goto L43
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            kotlin.f.b(r11)
            r0.f29295a = r10
            r0.f29298d = r3
            java.lang.Object r11 = r9.S(r0)
            if (r11 != r1) goto L43
            return r1
        L43:
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r11 = r11.iterator()
        L4e:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L79
            java.lang.Object r1 = r11.next()
            r2 = r1
            hi.b r2 = (hi.b) r2
            if (r10 == 0) goto L72
            java.lang.Object r3 = r10.getValue()
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L72
            int r2 = r2.getSelectedId()
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.a.d(r2)
            boolean r2 = r3.contains(r2)
            goto L73
        L72:
            r2 = 0
        L73:
            if (r2 == 0) goto L4e
            r0.add(r1)
            goto L4e
        L79:
            java.util.ArrayList r10 = new java.util.ArrayList
            r11 = 10
            int r11 = kotlin.collections.p.y(r0, r11)
            r10.<init>(r11)
            java.util.Iterator r11 = r0.iterator()
        L88:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto Lae
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
            goto L88
        Lae:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel.H(com.forsale.app.datalayer.network.requestsbodies.GetListingsBody$FiltrationData$Attribute, zz.a):java.lang.Object");
    }

    public final void i0(List<Integer> ids) {
        List n11;
        GetListingsBody.FiltrationData.Attribute attribute;
        g00.a<wz.p> u11;
        o.i(ids, "ids");
        if (s().m(this) && (u11 = u()) != null) {
            u11.invoke();
        }
        GetListingsBody.FiltrationData.Attribute attribute2 = (GetListingsBody.FiltrationData.Attribute) n().getValue();
        if (attribute2 == null || (n11 = (List) attribute2.getValue()) == null) {
            n11 = r.n();
        }
        if (!(!o.d(n11, ids))) {
            return;
        }
        Integer attributeId = w().getAttributeId();
        if (attributeId != null) {
            int intValue = attributeId.intValue();
            MutableStateFlow n12 = n();
            if (ids.isEmpty()) {
                attribute = null;
            } else {
                attribute = new GetListingsBody.FiltrationData.Attribute(intValue, AttributeType.DROP_DOWN.getValue(), ids, null, null, 24, null);
            }
            n12.setValue(attribute);
        }
        s().o(this);
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
            boolean r0 = r8 instanceof com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel$generateFilterCapsule$1
            if (r0 == 0) goto L13
            r0 = r8
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel$generateFilterCapsule$1 r0 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel$generateFilterCapsule$1) r0
            int r1 = r0.f29290d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29290d = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel$generateFilterCapsule$1 r0 = new com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel$generateFilterCapsule$1
            r0.<init>(r7, r8)
        L18:
            r4 = r0
            java.lang.Object r8 = r4.f29288b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r4.f29290d
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            java.lang.Object r0 = r4.f29287a
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel r0 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel) r0
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
            r4.f29287a = r7
            r4.f29290d = r2
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
            com.forsale.app.datalayer.database.CategoryEntity r3 = r0.f29276y
            r4 = 0
            r5 = 4
            r6 = 0
            com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.a$a r8 = com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel.m(r0, r1, r2, r3, r4, r5, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel.j(zz.a):java.lang.Object");
    }

    @Override // com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel
    /* renamed from: j0 */
    public Object Y(GetListingsBody.FiltrationData.Attribute<List<Integer>> attribute, zz.a<? super fc.b> aVar) {
        List<Integer> list;
        SelectableHandler q11 = q();
        fc.b value = p().getValue();
        if (attribute != null) {
            list = attribute.getValue();
        } else {
            list = null;
        }
        return q11.h(value, list, new DropDownAttributeFilterViewModel$updateFilterRange$2(this, attribute, null), aVar);
    }
}
