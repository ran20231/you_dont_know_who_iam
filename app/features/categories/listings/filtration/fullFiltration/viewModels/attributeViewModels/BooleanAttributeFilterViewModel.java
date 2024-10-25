package com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels;

import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.database.ExtraAttributeEntity;
import com.forsale.app.datalayer.network.requestsbodies.GetListingsBody;
import com.forsale.app.datalayer.network.responses.ListingsResponse;
import com.forsale.app.datalayer.repositories.ExtraAttributeRawRepository;
import com.forsale.app.datalayer.repositories.FiltersRepository;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel;
import com.forsale.app.features.postad.extraattributes.enums.AttributeType;
import dc.c;
import g00.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Triple;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
/* compiled from: BooleanAttributeFilterViewModel.kt */
/* loaded from: classes2.dex */
public final class BooleanAttributeFilterViewModel extends FilterViewModel {
    public static final a B = new a(null);
    public static final int C = 8;
    private final MutableStateFlow<List<c>> A;

    /* renamed from: x */
    private final ExtraAttributeRawRepository f29251x;

    /* renamed from: y */
    private final CategoryEntity f29252y;

    /* renamed from: z */
    private final MutableSharedFlow<Triple<FilterViewModel<?, ?, ?>, com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.a, Integer>> f29253z;

    /* compiled from: BooleanAttributeFilterViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: BooleanAttributeFilterViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class b implements hi.b {

        /* renamed from: a */
        private int f29258a;

        /* renamed from: b */
        private String f29259b;

        /* renamed from: c */
        private String f29260c;

        /* renamed from: d */
        private String f29261d;

        /* renamed from: e */
        private int f29262e;

        /* renamed from: f */
        private List<Integer> f29263f;

        /* renamed from: g */
        private Integer f29264g;

        /* renamed from: h */
        private Integer f29265h;

        b(ExtraAttributeEntity extraAttributeEntity) {
            int i11;
            List<Integer> n11;
            this.f29258a = extraAttributeEntity.getId();
            this.f29259b = extraAttributeEntity.getNameAr();
            this.f29260c = extraAttributeEntity.getNameEn();
            this.f29261d = extraAttributeEntity.getName();
            Integer displayOrder = extraAttributeEntity.getDisplayOrder();
            if (displayOrder != null) {
                i11 = displayOrder.intValue();
            } else {
                i11 = 0;
            }
            this.f29262e = i11;
            n11 = r.n();
            this.f29263f = n11;
        }

        @Override // hi.b
        public List<Integer> getCousinIdsList() {
            return this.f29263f;
        }

        @Override // hi.b
        public int getDisplayOrderSort() {
            return this.f29262e;
        }

        @Override // hi.b
        public String getLabel() {
            return this.f29261d;
        }

        @Override // hi.b
        public String getLabelAr() {
            return this.f29259b;
        }

        @Override // hi.b
        public String getLabelEn() {
            return this.f29260c;
        }

        @Override // hi.b
        public Integer getParentID() {
            return this.f29265h;
        }

        @Override // hi.b
        public Integer getSelectableResId() {
            return this.f29264g;
        }

        @Override // hi.b
        public int getSelectedId() {
            return this.f29258a;
        }

        @Override // hi.b
        public void setSelectedId(int i11) {
            this.f29258a = i11;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BooleanAttributeFilterViewModel(CoroutineScope cs2, FiltersMediator mediator, ExtraAttributeRawRepository attRepo, FiltersRepository filtersRepository, CategoryEntity rootCategory, List<? extends GetListingsBody.FiltrationData.Attribute<?>> list, boolean z11, MutableSharedFlow<Triple<FilterViewModel<?, ?, ?>, com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.a, Integer>> onFilterClicked) {
        super(cs2, new ListingsResponse.UISettings.FiltrationSetting(null, null, null, null, null, new ListingsResponse.UISettings.Label("مواصفات", "Specifications"), null, null, null, null, null, 2015, null), mediator, filtersRepository, list, z11, onFilterClicked);
        List n11;
        o.i(cs2, "cs");
        o.i(mediator, "mediator");
        o.i(attRepo, "attRepo");
        o.i(filtersRepository, "filtersRepository");
        o.i(rootCategory, "rootCategory");
        o.i(onFilterClicked, "onFilterClicked");
        this.f29251x = attRepo;
        this.f29252y = rootCategory;
        this.f29253z = onFilterClicked;
        n11 = r.n();
        MutableStateFlow<List<c>> MutableStateFlow = StateFlowKt.MutableStateFlow(n11);
        BuildersKt__Builders_commonKt.launch$default(cs2, null, null, new BooleanAttributeFilterViewModel$attributes$1$1(MutableStateFlow, this, null), 3, null);
        this.A = MutableStateFlow;
    }

    private final void e0(final int i11, boolean z11) {
        List a12;
        MutableStateFlow n11 = n();
        Collection collection = (List) n().getValue();
        if (collection == null) {
            collection = new ArrayList();
        }
        a12 = CollectionsKt___CollectionsKt.a1(collection);
        if (z11) {
            a12.add(new GetListingsBody.FiltrationData.Attribute(i11, AttributeType.BOOL.getValue(), null, null, null, 28, null));
        } else {
            a12.removeIf(new gc.a(new l<GetListingsBody.FiltrationData.Attribute<?>, Boolean>() { // from class: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.BooleanAttributeFilterViewModel$setAttributeRangeAndNotify$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // g00.l
                /* renamed from: b */
                public final Boolean invoke(GetListingsBody.FiltrationData.Attribute<?> it2) {
                    boolean z12;
                    o.i(it2, "it");
                    if (it2.getId() == i11) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    return Boolean.valueOf(z12);
                }
            }));
        }
        n11.setValue(a12);
        s().o(this);
    }

    public static final boolean f0(l tmp0, Object obj) {
        o.i(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    @Override // com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object N(zz.a<? super com.forsale.app.utils.analytics.listingfiltration.a> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.BooleanAttributeFilterViewModel$pullAnalyticsData$1
            if (r0 == 0) goto L13
            r0 = r9
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.BooleanAttributeFilterViewModel$pullAnalyticsData$1 r0 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.BooleanAttributeFilterViewModel$pullAnalyticsData$1) r0
            int r1 = r0.f29269d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29269d = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.BooleanAttributeFilterViewModel$pullAnalyticsData$1 r0 = new com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.BooleanAttributeFilterViewModel$pullAnalyticsData$1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f29267b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f29269d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f29266a
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.BooleanAttributeFilterViewModel r0 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.BooleanAttributeFilterViewModel) r0
            kotlin.f.b(r9)
            goto L44
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L35:
            kotlin.f.b(r9)
            r0.f29266a = r8
            r0.f29269d = r3
            java.lang.Object r9 = r8.S(r0)
            if (r9 != r1) goto L43
            return r1
        L43:
            r0 = r8
        L44:
            java.util.List r9 = (java.util.List) r9
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r9 = r9.iterator()
        L51:
            boolean r2 = r9.hasNext()
            r4 = 10
            if (r2 == 0) goto La5
            java.lang.Object r2 = r9.next()
            r5 = r2
            dc.c r5 = (dc.c) r5
            java.lang.Object r6 = r0.Q(r3)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L8f
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            int r4 = kotlin.collections.p.y(r6, r4)
            r7.<init>(r4)
            java.util.Iterator r4 = r6.iterator()
        L77:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L93
            java.lang.Object r6 = r4.next()
            com.forsale.app.datalayer.network.requestsbodies.GetListingsBody$FiltrationData$Attribute r6 = (com.forsale.app.datalayer.network.requestsbodies.GetListingsBody.FiltrationData.Attribute) r6
            int r6 = r6.getId()
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.a.d(r6)
            r7.add(r6)
            goto L77
        L8f:
            java.util.List r7 = kotlin.collections.p.n()
        L93:
            int r4 = r5.e()
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.a.d(r4)
            boolean r4 = r7.contains(r4)
            if (r4 == 0) goto L51
            r1.add(r2)
            goto L51
        La5:
            boolean r9 = r1.isEmpty()
            r9 = r9 ^ r3
            r2 = 0
            if (r9 == 0) goto Lae
            goto Laf
        Lae:
            r1 = r2
        Laf:
            if (r1 == 0) goto Ldb
            java.lang.String r9 = r0.x()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r2 = kotlin.collections.p.y(r1, r4)
            r0.<init>(r2)
            java.util.Iterator r1 = r1.iterator()
        Lc2:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Ld6
            java.lang.Object r2 = r1.next()
            dc.c r2 = (dc.c) r2
            java.lang.String r2 = r2.h()
            r0.add(r2)
            goto Lc2
        Ld6:
            com.forsale.app.utils.analytics.listingfiltration.a$a r2 = new com.forsale.app.utils.analytics.listingfiltration.a$a
            r2.<init>(r9, r0)
        Ldb:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.BooleanAttributeFilterViewModel.N(zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a0 A[LOOP:0: B:60:0x009a->B:62:0x00a0, LOOP_END] */
    @Override // com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object S(zz.a<? super java.util.List<dc.c>> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.BooleanAttributeFilterViewModel$pullFiltrationRange$1
            if (r0 == 0) goto L13
            r0 = r9
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.BooleanAttributeFilterViewModel$pullFiltrationRange$1 r0 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.BooleanAttributeFilterViewModel$pullFiltrationRange$1) r0
            int r1 = r0.f29273d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29273d = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.BooleanAttributeFilterViewModel$pullFiltrationRange$1 r0 = new com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.BooleanAttributeFilterViewModel$pullFiltrationRange$1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f29271b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f29273d
            r3 = 10
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r0 = r0.f29270a
            java.util.List r0 = (java.util.List) r0
            kotlin.f.b(r9)
            goto L8b
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L37:
            kotlin.f.b(r9)
            kotlinx.coroutines.flow.MutableStateFlow r9 = r8.n()
            java.lang.Object r9 = r9.getValue()
            java.util.List r9 = (java.util.List) r9
            if (r9 == 0) goto L6f
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r2 = new java.util.ArrayList
            int r5 = kotlin.collections.p.y(r9, r3)
            r2.<init>(r5)
            java.util.Iterator r9 = r9.iterator()
        L55:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L6d
            java.lang.Object r5 = r9.next()
            com.forsale.app.datalayer.network.requestsbodies.GetListingsBody$FiltrationData$Attribute r5 = (com.forsale.app.datalayer.network.requestsbodies.GetListingsBody.FiltrationData.Attribute) r5
            int r5 = r5.getId()
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.a.d(r5)
            r2.add(r5)
            goto L55
        L6d:
            r9 = r2
            goto L73
        L6f:
            java.util.List r9 = kotlin.collections.p.n()
        L73:
            com.forsale.app.datalayer.repositories.ExtraAttributeRawRepository r2 = r8.f29251x
            com.forsale.app.features.postad.extraattributes.enums.AttributeType r5 = com.forsale.app.features.postad.extraattributes.enums.AttributeType.BOOL
            com.forsale.app.datalayer.database.CategoryEntity r6 = r8.f29252y
            int r6 = r6.getId()
            r0.f29270a = r9
            r0.f29273d = r4
            java.lang.Object r0 = r2.getAttributesWithCategoryIdOfType(r5, r6, r0)
            if (r0 != r1) goto L88
            return r1
        L88:
            r7 = r0
            r0 = r9
            r9 = r7
        L8b:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = kotlin.collections.p.y(r9, r3)
            r1.<init>(r2)
            java.util.Iterator r9 = r9.iterator()
        L9a:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto Lbf
            java.lang.Object r2 = r9.next()
            com.forsale.app.datalayer.database.ExtraAttributeEntity r2 = (com.forsale.app.datalayer.database.ExtraAttributeEntity) r2
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.BooleanAttributeFilterViewModel$b r3 = new com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.BooleanAttributeFilterViewModel$b
            r3.<init>(r2)
            int r2 = r2.getId()
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.a.d(r2)
            boolean r2 = r0.contains(r2)
            dc.c r2 = dc.d.b(r3, r2)
            r1.add(r2)
            goto L9a
        Lbf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.BooleanAttributeFilterViewModel.S(zz.a):java.lang.Object");
    }

    @Override // com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel
    public void T() {
        super.T();
        for (c cVar : this.A.getValue()) {
            if (cVar.l().getValue().booleanValue()) {
                cVar.l().setValue(Boolean.FALSE);
            }
        }
    }

    public final MutableStateFlow<List<c>> c0() {
        return this.A;
    }

    @Override // com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel
    /* renamed from: d0 */
    public int G(List<? extends GetListingsBody.FiltrationData.Attribute<?>> list) {
        return super.G(list);
    }

    @Override // com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel
    public void f(int i11, boolean z11) {
        e0(i11, z11);
    }

    @Override // com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel
    /* renamed from: g0 */
    public Object Y(List<? extends GetListingsBody.FiltrationData.Attribute<?>> list, zz.a<? super fc.b> aVar) {
        return super.Y(list, aVar);
    }
}
