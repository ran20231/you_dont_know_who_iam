package com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels;

import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.network.responses.ListingsResponse;
import com.forsale.app.datalayer.repositories.CategoriesRepositories;
import com.forsale.app.datalayer.repositories.DistrictsRepository;
import com.forsale.app.datalayer.repositories.FiltersRepository;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.a;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel;
import fc.c;
import g00.l;
import java.util.List;
import kotlin.Triple;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.r;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import wz.p;
/* compiled from: LocationFilterViewModel.kt */
/* loaded from: classes2.dex */
public final class LocationFilterViewModel extends FilterViewModel {
    private final MutableSharedFlow<Triple<FilterViewModel<?, ?, ?>, a, Integer>> A;

    /* renamed from: x */
    private final DistrictsRepository f29504x;

    /* renamed from: y */
    private final CategoriesRepositories f29505y;

    /* renamed from: z */
    private final CategoryEntity f29506z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationFilterViewModel(CoroutineScope cs2, ListingsResponse.UISettings.FiltrationSetting setting, FiltersMediator mediator, DistrictsRepository districtsRepository, CategoriesRepositories categoriesRepositories, FiltersRepository filtersRepository, List<Integer> list, CategoryEntity rootCategory, boolean z11, MutableSharedFlow<Triple<FilterViewModel<?, ?, ?>, a, Integer>> onFilterClicked) {
        super(cs2, setting, mediator, filtersRepository, list, z11, onFilterClicked);
        o.i(cs2, "cs");
        o.i(setting, "setting");
        o.i(mediator, "mediator");
        o.i(districtsRepository, "districtsRepository");
        o.i(categoriesRepositories, "categoriesRepositories");
        o.i(filtersRepository, "filtersRepository");
        o.i(rootCategory, "rootCategory");
        o.i(onFilterClicked, "onFilterClicked");
        this.f29504x = districtsRepository;
        this.f29505y = categoriesRepositories;
        this.f29506z = rootCategory;
        this.A = onFilterClicked;
    }

    private final void d0(List<Integer> list) {
        g00.a<p> u11;
        if (s().m(this) && (u11 = u()) != null) {
            u11.invoke();
        }
        Object value = n().getValue();
        List<Integer> list2 = list;
        if (list2.isEmpty()) {
            list2 = null;
        }
        if (!(!o.d(value, list2))) {
            return;
        }
        e0(list);
        s().o(this);
    }

    private final void e0(List<Integer> list) {
        MutableStateFlow n11 = n();
        List<Integer> list2 = list;
        if (list2.isEmpty()) {
            list2 = null;
        }
        n11.setValue(list2);
    }

    public static final boolean f0(l tmp0, Object obj) {
        o.i(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    @Override // com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object N(zz.a<? super com.forsale.app.utils.analytics.listingfiltration.a> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.LocationFilterViewModel$pullAnalyticsData$1
            if (r0 == 0) goto L13
            r0 = r9
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.LocationFilterViewModel$pullAnalyticsData$1 r0 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.LocationFilterViewModel$pullAnalyticsData$1) r0
            int r1 = r0.f29520e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29520e = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.LocationFilterViewModel$pullAnalyticsData$1 r0 = new com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.LocationFilterViewModel$pullAnalyticsData$1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f29518c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f29520e
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 != r5) goto L33
            java.lang.Object r1 = r0.f29517b
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r0.f29516a
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.LocationFilterViewModel r0 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.LocationFilterViewModel) r0
            kotlin.f.b(r9)
            goto L54
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3b:
            kotlin.f.b(r9)
            java.lang.Object r9 = com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel.R(r8, r4, r5, r3)
            java.util.List r9 = (java.util.List) r9
            r0.f29516a = r8
            r0.f29517b = r9
            r0.f29520e = r5
            java.lang.Object r0 = r8.S(r0)
            if (r0 != r1) goto L51
            return r1
        L51:
            r1 = r9
            r9 = r0
            r0 = r8
        L54:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r9 = r9.iterator()
        L5f:
            boolean r6 = r9.hasNext()
            if (r6 == 0) goto L85
            java.lang.Object r6 = r9.next()
            r7 = r6
            dc.a r7 = (dc.a) r7
            if (r1 == 0) goto L7e
            int r7 = r7.e()
            java.lang.Integer r7 = kotlin.coroutines.jvm.internal.a.d(r7)
            boolean r7 = r1.contains(r7)
            if (r7 != r5) goto L7e
            r7 = r5
            goto L7f
        L7e:
            r7 = r4
        L7f:
            if (r7 == 0) goto L5f
            r2.add(r6)
            goto L5f
        L85:
            boolean r9 = r2.isEmpty()
            if (r9 != 0) goto L8c
            goto L8d
        L8c:
            r2 = r3
        L8d:
            if (r2 == 0) goto L98
            com.forsale.app.utils.analytics.listingfiltration.a$b r3 = new com.forsale.app.utils.analytics.listingfiltration.a$b
            java.lang.String r9 = r0.x()
            r3.<init>(r9, r2)
        L98:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.LocationFilterViewModel.N(zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0056  */
    @Override // com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object S(zz.a<? super java.util.List<dc.a>> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.LocationFilterViewModel$pullFiltrationRange$1
            if (r0 == 0) goto L13
            r0 = r14
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.LocationFilterViewModel$pullFiltrationRange$1 r0 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.LocationFilterViewModel$pullFiltrationRange$1) r0
            int r1 = r0.f29523c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29523c = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.LocationFilterViewModel$pullFiltrationRange$1 r0 = new com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.LocationFilterViewModel$pullFiltrationRange$1
            r0.<init>(r13, r14)
        L18:
            java.lang.Object r14 = r0.f29521a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f29523c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r14)
            goto L3f
        L29:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L31:
            kotlin.f.b(r14)
            com.forsale.app.datalayer.repositories.DistrictsRepository r14 = r13.f29504x
            r0.f29523c = r3
            java.lang.Object r14 = r14.getAllLocations(r0)
            if (r14 != r1) goto L3f
            return r1
        L3f:
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.p.y(r14, r1)
            r0.<init>(r1)
            java.util.Iterator r14 = r14.iterator()
        L50:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto Lc1
            java.lang.Object r1 = r14.next()
            com.forsale.app.datalayer.database.DistrictEntity r1 = (com.forsale.app.datalayer.database.DistrictEntity) r1
            int r3 = r1.getId()
            int r5 = r1.getParentId()
            java.lang.String r2 = r1.getFullPathAr()
            r4 = 2
            java.lang.String r6 = ""
            if (r2 == 0) goto L7a
            java.lang.Integer r7 = kotlin.coroutines.jvm.internal.a.d(r4)
            java.lang.String r2 = com.forsale.app.utils.TypeExtensionsKt.R0(r2, r7)
            if (r2 != 0) goto L78
            goto L7a
        L78:
            r11 = r2
            goto L7b
        L7a:
            r11 = r6
        L7b:
            java.lang.String r2 = r1.getFullPathEn()
            if (r2 == 0) goto L8e
            java.lang.Integer r7 = kotlin.coroutines.jvm.internal.a.d(r4)
            java.lang.String r2 = com.forsale.app.utils.TypeExtensionsKt.R0(r2, r7)
            if (r2 != 0) goto L8c
            goto L8e
        L8c:
            r10 = r2
            goto L8f
        L8e:
            r10 = r6
        L8f:
            java.lang.String r2 = r1.getFullPath()
            if (r2 == 0) goto La2
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.a.d(r4)
            java.lang.String r2 = com.forsale.app.utils.TypeExtensionsKt.R0(r2, r4)
            if (r2 != 0) goto La0
            goto La2
        La0:
            r9 = r2
            goto La3
        La2:
            r9 = r6
        La3:
            java.lang.String r7 = r1.getNameAr()
            java.lang.String r8 = r1.getNameEn()
            java.lang.String r6 = r1.getName()
            int r4 = r1.getLevel()
            int r12 = r1.getDisplayOrderSort()
            dc.a r1 = new dc.a
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0.add(r1)
            goto L50
        Lc1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.LocationFilterViewModel.S(zz.a):java.lang.Object");
    }

    @Override // com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel
    public void W(final int i11) {
        List<Integer> list;
        List list2 = (List) n().getValue();
        if (list2 != null) {
            list = CollectionsKt___CollectionsKt.a1(list2);
        } else {
            list = null;
        }
        if (list != null) {
            list.removeIf(new ic.a(new l<Integer, Boolean>() { // from class: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.LocationFilterViewModel$unSelectOption$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // g00.l
                /* renamed from: b */
                public final Boolean invoke(Integer it2) {
                    boolean z11;
                    o.i(it2, "it");
                    if (it2.intValue() == i11) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    return Boolean.valueOf(z11);
                }
            }));
        }
        if (list == null) {
            list = r.n();
        }
        d0(list);
    }

    @Override // com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel
    public void a0(c filterResult) {
        o.i(filterResult, "filterResult");
        if (filterResult instanceof c.a) {
            d0(((c.a) filterResult).b());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0084 A[LOOP:1: B:64:0x007e->B:66:0x0084, LOOP_END] */
    @Override // com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel
    /* renamed from: c0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object H(java.util.List<java.lang.Integer> r10, zz.a<? super java.util.List<dc.e>> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.LocationFilterViewModel$mapFromDataToSelectedView$1
            if (r0 == 0) goto L13
            r0 = r11
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.LocationFilterViewModel$mapFromDataToSelectedView$1 r0 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.LocationFilterViewModel$mapFromDataToSelectedView$1) r0
            int r1 = r0.f29515d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29515d = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.LocationFilterViewModel$mapFromDataToSelectedView$1 r0 = new com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.LocationFilterViewModel$mapFromDataToSelectedView$1
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f29513b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f29515d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r10 = r0.f29512a
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
            r0.f29512a = r10
            r0.f29515d = r3
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
            dc.a r2 = (dc.a) r2
            int r2 = r2.e()
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
            dc.a r0 = (dc.a) r0
            dc.e r8 = new dc.e
            int r2 = r0.e()
            java.lang.String r3 = r0.i()
            java.lang.String r4 = r0.c()
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
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.LocationFilterViewModel.H(java.util.List, zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b0  */
    @Override // com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(zz.a<? super com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.a> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.LocationFilterViewModel$generateFilterCapsule$1
            if (r0 == 0) goto L13
            r0 = r11
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.LocationFilterViewModel$generateFilterCapsule$1 r0 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.LocationFilterViewModel$generateFilterCapsule$1) r0
            int r1 = r0.f29511e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29511e = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.LocationFilterViewModel$generateFilterCapsule$1 r0 = new com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.LocationFilterViewModel$generateFilterCapsule$1
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f29509c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f29511e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L49
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r1 = r0.f29508b
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r0.f29507a
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.LocationFilterViewModel r0 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.LocationFilterViewModel) r0
            kotlin.f.b(r11)
            goto Lb2
        L35:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L3d:
            java.lang.Object r2 = r0.f29508b
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r5 = r0.f29507a
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.LocationFilterViewModel r5 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.LocationFilterViewModel) r5
            kotlin.f.b(r11)
            goto L63
        L49:
            kotlin.f.b(r11)
            r11 = 0
            r2 = 0
            java.lang.Object r11 = com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel.R(r10, r11, r4, r2)
            r2 = r11
            java.util.List r2 = (java.util.List) r2
            r0.f29507a = r10
            r0.f29508b = r2
            r0.f29511e = r4
            java.lang.Object r11 = r10.S(r0)
            if (r11 != r1) goto L62
            return r1
        L62:
            r5 = r10
        L63:
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r7 = kotlin.collections.p.y(r11, r7)
            r6.<init>(r7)
            java.util.Iterator r11 = r11.iterator()
        L74:
            boolean r7 = r11.hasNext()
            if (r7 == 0) goto L9f
            java.lang.Object r7 = r11.next()
            dc.a r7 = (dc.a) r7
            if (r2 == 0) goto L9b
            int r8 = r7.e()
            java.lang.Integer r8 = kotlin.coroutines.jvm.internal.a.d(r8)
            boolean r8 = r2.contains(r8)
            if (r8 == 0) goto L9b
            j0.k0 r8 = r7.m()
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.a.a(r4)
            r8.setValue(r9)
        L9b:
            r6.add(r7)
            goto L74
        L9f:
            com.forsale.app.datalayer.repositories.CategoriesRepositories r11 = r5.f29505y
            com.forsale.app.datalayer.database.CategoryEntity r2 = r5.f29506z
            r0.f29507a = r5
            r0.f29508b = r6
            r0.f29511e = r3
            java.lang.Object r11 = r11.getVerticalIdNameOfCategory(r2, r0)
            if (r11 != r1) goto Lb0
            return r1
        Lb0:
            r0 = r5
            r1 = r6
        Lb2:
            kotlin.Pair r11 = (kotlin.Pair) r11
            java.lang.Object r11 = r11.c()
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.a$b r2 = new com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.a$b
            com.forsale.app.features.categories.listings.filtration.fullFiltration.filterModels.FilterScreenTypes r3 = r0.y()
            java.lang.String r4 = "null cannot be cast to non-null type com.forsale.app.features.categories.listings.filtration.fullFiltration.filterModels.FilterScreenTypes.NewScreen"
            kotlin.jvm.internal.o.g(r3, r4)
            com.forsale.app.features.categories.listings.filtration.fullFiltration.filterModels.FilterScreenTypes$NewScreen r3 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.filterModels.FilterScreenTypes.NewScreen) r3
            java.lang.String r4 = r0.r()
            java.lang.String r5 = r0.x()
            com.forsale.app.datalayer.database.CategoryEntity r0 = r0.f29506z
            fc.a r6 = new fc.a
            r6.<init>(r4, r5, r3, r0)
            r2.<init>(r1, r11, r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.LocationFilterViewModel.j(zz.a):java.lang.Object");
    }
}
