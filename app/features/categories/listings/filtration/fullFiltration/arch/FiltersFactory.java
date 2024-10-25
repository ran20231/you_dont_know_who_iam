package com.forsale.app.features.categories.listings.filtration.fullFiltration.arch;

import cc.a;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.network.requestsbodies.GetListingsBody;
import com.forsale.app.datalayer.network.responses.ListingsResponse;
import com.forsale.app.datalayer.repositories.CategoriesRepositories;
import com.forsale.app.datalayer.repositories.DistrictsRepository;
import com.forsale.app.datalayer.repositories.ExtraAttributeRawRepository;
import com.forsale.app.datalayer.repositories.FiltersRepository;
import com.forsale.app.datalayer.repositories.RegionsRepository;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.DropDownAttributeFilterViewModel;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.NumberAttributeFilterViewModel;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.RangeAttributeFilterViewModel;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.LocationFilterViewModel;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.PriceFilterViewModel;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.ResetAllViewModel;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.SubCategoriesViewModel;
import com.forsale.app.features.postad.extraattributes.enums.AttributeType;
import java.util.Arrays;
import java.util.List;
import kotlin.Triple;
import kotlin.collections.r;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* compiled from: FiltersFactory.kt */
/* loaded from: classes2.dex */
public final class FiltersFactory {

    /* renamed from: a  reason: collision with root package name */
    private final CoroutineScope f29066a;

    /* renamed from: b  reason: collision with root package name */
    private final CategoryEntity f29067b;

    /* renamed from: c  reason: collision with root package name */
    private final CategoriesRepositories f29068c;

    /* renamed from: d  reason: collision with root package name */
    private final DistrictsRepository f29069d;

    /* renamed from: e  reason: collision with root package name */
    private final ExtraAttributeRawRepository f29070e;

    /* renamed from: f  reason: collision with root package name */
    private final RegionsRepository f29071f;

    /* renamed from: g  reason: collision with root package name */
    private final FiltersRepository f29072g;

    /* renamed from: h  reason: collision with root package name */
    private final PreSelectedFiltersFactory f29073h;

    /* renamed from: i  reason: collision with root package name */
    private final MutableSharedFlow<Triple<FilterViewModel<?, ?, ?>, com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.a, Integer>> f29074i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f29075j;

    /* compiled from: FiltersFactory.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f29076a;

        static {
            int[] iArr = new int[ListingsResponse.UISettings.FiltrationSetting.FilterType.values().length];
            try {
                iArr[ListingsResponse.UISettings.FiltrationSetting.FilterType.CATEGORY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ListingsResponse.UISettings.FiltrationSetting.FilterType.SUB_CATEGORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ListingsResponse.UISettings.FiltrationSetting.FilterType.LOCATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ListingsResponse.UISettings.FiltrationSetting.FilterType.ATTRIBUTE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ListingsResponse.UISettings.FiltrationSetting.FilterType.PRICE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f29076a = iArr;
        }
    }

    public FiltersFactory(CoroutineScope cs2, CategoryEntity rootCategory, CategoriesRepositories categoriesRepositories, DistrictsRepository districtsRepository, ExtraAttributeRawRepository extraAttributeRawRepository, RegionsRepository regionsRepository, FiltersRepository filtersRepository, PreSelectedFiltersFactory preSelectedFiltersFactory, MutableSharedFlow<Triple<FilterViewModel<?, ?, ?>, com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.a, Integer>> openFilterInNewScreen, boolean z11) {
        o.i(cs2, "cs");
        o.i(rootCategory, "rootCategory");
        o.i(categoriesRepositories, "categoriesRepositories");
        o.i(districtsRepository, "districtsRepository");
        o.i(extraAttributeRawRepository, "extraAttributeRawRepository");
        o.i(regionsRepository, "regionsRepository");
        o.i(filtersRepository, "filtersRepository");
        o.i(preSelectedFiltersFactory, "preSelectedFiltersFactory");
        o.i(openFilterInNewScreen, "openFilterInNewScreen");
        this.f29066a = cs2;
        this.f29067b = rootCategory;
        this.f29068c = categoriesRepositories;
        this.f29069d = districtsRepository;
        this.f29070e = extraAttributeRawRepository;
        this.f29071f = regionsRepository;
        this.f29072g = filtersRepository;
        this.f29073h = preSelectedFiltersFactory;
        this.f29074i = openFilterInNewScreen;
        this.f29075j = z11;
    }

    private final FilterViewModel<?, ?, ?> a(ListingsResponse.UISettings.FiltrationSetting filtrationSetting, FiltersMediator filtersMediator, cc.a aVar) {
        int i11;
        FilterViewModel<?, ?, ?> categoriesFilterViewModel;
        a.b bVar;
        a.e eVar;
        a.c cVar;
        GetListingsBody.FiltrationData.Attribute<?> attribute;
        GetListingsBody.FiltrationData.Attribute<?> attribute2;
        GetListingsBody.FiltrationData.Attribute<?> attribute3;
        GetListingsBody.FiltrationData.Attribute<?> attribute4;
        GetListingsBody.FiltrationData.Attribute<?> attribute5;
        GetListingsBody.FiltrationData.Attribute<?> attribute6;
        a.d dVar;
        cc.a aVar2 = aVar;
        ListingsResponse.UISettings.FiltrationSetting.FilterType filterType = filtrationSetting.getFilterType();
        if (filterType == null) {
            i11 = -1;
        } else {
            i11 = a.f29076a[filterType.ordinal()];
        }
        List<Integer> list = null;
        GetListingsBody.FiltrationData.Range range = null;
        List<Integer> list2 = null;
        List<Integer> list3 = null;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        CoroutineScope coroutineScope = this.f29066a;
                        RegionsRepository regionsRepository = this.f29071f;
                        CategoriesRepositories categoriesRepositories = this.f29068c;
                        FiltersRepository filtersRepository = this.f29072g;
                        if (aVar2 instanceof a.d) {
                            dVar = (a.d) aVar2;
                        } else {
                            dVar = null;
                        }
                        if (dVar != null) {
                            range = dVar.c();
                        }
                        categoriesFilterViewModel = new PriceFilterViewModel(coroutineScope, filtrationSetting, filtersMediator, regionsRepository, categoriesRepositories, filtersRepository, range, this.f29075j, this.f29074i, this.f29067b);
                    } else if (filtrationSetting.getViewType() == ListingsResponse.UISettings.FiltrationSetting.ViewType.RANGE) {
                        CoroutineScope coroutineScope2 = this.f29066a;
                        ExtraAttributeRawRepository extraAttributeRawRepository = this.f29070e;
                        FiltersRepository filtersRepository2 = this.f29072g;
                        CategoryEntity categoryEntity = this.f29067b;
                        if (!(aVar2 instanceof a.AbstractC0196a.c)) {
                            aVar2 = null;
                        }
                        a.AbstractC0196a.c cVar2 = (a.AbstractC0196a.c) aVar2;
                        if (cVar2 != null) {
                            attribute5 = cVar2.c();
                        } else {
                            attribute5 = null;
                        }
                        if (attribute5 instanceof GetListingsBody.FiltrationData.Attribute) {
                            attribute6 = attribute5;
                        } else {
                            attribute6 = null;
                        }
                        categoriesFilterViewModel = new RangeAttributeFilterViewModel(coroutineScope2, filtrationSetting, filtersMediator, extraAttributeRawRepository, filtersRepository2, categoryEntity, attribute6, this.f29075j, this.f29074i);
                    } else {
                        String attributeType = filtrationSetting.getAttributeType();
                        if (o.d(attributeType, AttributeType.DROP_DOWN.getValue())) {
                            CoroutineScope coroutineScope3 = this.f29066a;
                            ExtraAttributeRawRepository extraAttributeRawRepository2 = this.f29070e;
                            FiltersRepository filtersRepository3 = this.f29072g;
                            CategoryEntity categoryEntity2 = this.f29067b;
                            if (!(aVar2 instanceof a.AbstractC0196a.b)) {
                                aVar2 = null;
                            }
                            a.AbstractC0196a.b bVar2 = (a.AbstractC0196a.b) aVar2;
                            if (bVar2 != null) {
                                attribute3 = bVar2.b();
                            } else {
                                attribute3 = null;
                            }
                            if (attribute3 instanceof GetListingsBody.FiltrationData.Attribute) {
                                attribute4 = attribute3;
                            } else {
                                attribute4 = null;
                            }
                            categoriesFilterViewModel = new DropDownAttributeFilterViewModel(coroutineScope3, filtrationSetting, filtersMediator, extraAttributeRawRepository2, filtersRepository3, categoryEntity2, attribute4, this.f29075j, this.f29074i);
                        } else if (!o.d(attributeType, AttributeType.NUMBER.getValue())) {
                            return null;
                        } else {
                            CoroutineScope coroutineScope4 = this.f29066a;
                            ExtraAttributeRawRepository extraAttributeRawRepository3 = this.f29070e;
                            FiltersRepository filtersRepository4 = this.f29072g;
                            CategoryEntity categoryEntity3 = this.f29067b;
                            if (!(aVar2 instanceof a.AbstractC0196a.c)) {
                                aVar2 = null;
                            }
                            a.AbstractC0196a.c cVar3 = (a.AbstractC0196a.c) aVar2;
                            if (cVar3 != null) {
                                attribute = cVar3.c();
                            } else {
                                attribute = null;
                            }
                            if (attribute instanceof GetListingsBody.FiltrationData.Attribute) {
                                attribute2 = attribute;
                            } else {
                                attribute2 = null;
                            }
                            categoriesFilterViewModel = new NumberAttributeFilterViewModel(coroutineScope4, filtrationSetting, filtersMediator, extraAttributeRawRepository3, filtersRepository4, categoryEntity3, attribute2, this.f29075j, this.f29074i);
                        }
                    }
                } else {
                    CoroutineScope coroutineScope5 = this.f29066a;
                    DistrictsRepository districtsRepository = this.f29069d;
                    CategoriesRepositories categoriesRepositories2 = this.f29068c;
                    FiltersRepository filtersRepository5 = this.f29072g;
                    if (aVar2 instanceof a.c) {
                        cVar = (a.c) aVar2;
                    } else {
                        cVar = null;
                    }
                    if (cVar != null) {
                        list2 = cVar.c();
                    }
                    categoriesFilterViewModel = new LocationFilterViewModel(coroutineScope5, filtrationSetting, filtersMediator, districtsRepository, categoriesRepositories2, filtersRepository5, list2, this.f29067b, this.f29075j, this.f29074i);
                }
            } else {
                CoroutineScope coroutineScope6 = this.f29066a;
                CategoriesRepositories categoriesRepositories3 = this.f29068c;
                FiltersRepository filtersRepository6 = this.f29072g;
                CategoryEntity categoryEntity4 = this.f29067b;
                if (aVar2 instanceof a.e) {
                    eVar = (a.e) aVar2;
                } else {
                    eVar = null;
                }
                if (eVar != null) {
                    list3 = eVar.c();
                }
                categoriesFilterViewModel = new SubCategoriesViewModel(coroutineScope6, filtrationSetting, filtersMediator, categoriesRepositories3, filtersRepository6, categoryEntity4, list3, this.f29075j, this.f29074i);
            }
        } else {
            CoroutineScope coroutineScope7 = this.f29066a;
            CategoriesRepositories categoriesRepositories4 = this.f29068c;
            FiltersRepository filtersRepository7 = this.f29072g;
            CategoryEntity categoryEntity5 = this.f29067b;
            if (aVar2 instanceof a.b) {
                bVar = (a.b) aVar2;
            } else {
                bVar = null;
            }
            if (bVar != null) {
                list = bVar.c();
            }
            categoriesFilterViewModel = new CategoriesFilterViewModel(coroutineScope7, filtrationSetting, filtersMediator, categoriesRepositories4, filtersRepository7, categoryEntity5, list, this.f29075j, this.f29074i);
        }
        return categoriesFilterViewModel;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x008f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel<?, ?, ?>> b(java.util.List<com.forsale.app.datalayer.network.responses.ListingsResponse.UISettings.FiltrationSetting> r13, com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator r14, java.util.List<? extends cc.a> r15) {
        /*
            r12 = this;
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r13 = r13.iterator()
        Lb:
            boolean r1 = r13.hasNext()
            r2 = 0
            if (r1 == 0) goto L9d
            java.lang.Object r1 = r13.next()
            com.forsale.app.datalayer.network.responses.ListingsResponse$UISettings$FiltrationSetting r1 = (com.forsale.app.datalayer.network.responses.ListingsResponse.UISettings.FiltrationSetting) r1
            if (r15 == 0) goto L92
            r3 = r15
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L21:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L90
            java.lang.Object r4 = r3.next()
            r5 = r4
            cc.a r5 = (cc.a) r5
            boolean r6 = r5 instanceof cc.a.AbstractC0196a.c
            r7 = 1
            r8 = 0
            if (r6 == 0) goto L58
            com.forsale.app.datalayer.network.responses.ListingsResponse$UISettings$FiltrationSetting$FilterType r6 = r5.a()
            com.forsale.app.datalayer.network.responses.ListingsResponse$UISettings$FiltrationSetting$FilterType r9 = r1.getFilterType()
            if (r6 != r9) goto L56
            java.lang.Integer r6 = r1.getAttributeId()
            cc.a$a$c r5 = (cc.a.AbstractC0196a.c) r5
            com.forsale.app.datalayer.network.requestsbodies.GetListingsBody$FiltrationData$Attribute r5 = r5.c()
            int r5 = r5.getId()
            if (r6 != 0) goto L4f
            goto L56
        L4f:
            int r6 = r6.intValue()
            if (r6 != r5) goto L56
            goto L8d
        L56:
            r7 = r8
            goto L8d
        L58:
            boolean r6 = r5 instanceof cc.a.AbstractC0196a.b
            if (r6 == 0) goto L7e
            com.forsale.app.datalayer.network.responses.ListingsResponse$UISettings$FiltrationSetting$FilterType r6 = r5.a()
            com.forsale.app.datalayer.network.responses.ListingsResponse$UISettings$FiltrationSetting$FilterType r9 = r1.getFilterType()
            if (r6 != r9) goto L56
            java.lang.Integer r6 = r1.getAttributeId()
            cc.a$a$b r5 = (cc.a.AbstractC0196a.b) r5
            com.forsale.app.datalayer.network.requestsbodies.GetListingsBody$FiltrationData$Attribute r5 = r5.b()
            int r5 = r5.getId()
            if (r6 != 0) goto L77
            goto L56
        L77:
            int r6 = r6.intValue()
            if (r6 != r5) goto L56
            goto L8d
        L7e:
            boolean r6 = r5 instanceof cc.a.AbstractC0196a.C0197a
            if (r6 == 0) goto L83
            goto L56
        L83:
            com.forsale.app.datalayer.network.responses.ListingsResponse$UISettings$FiltrationSetting$FilterType r5 = r5.a()
            com.forsale.app.datalayer.network.responses.ListingsResponse$UISettings$FiltrationSetting$FilterType r6 = r1.getFilterType()
            if (r5 != r6) goto L56
        L8d:
            if (r7 == 0) goto L21
            r2 = r4
        L90:
            cc.a r2 = (cc.a) r2
        L92:
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel r1 = r12.a(r1, r14, r2)
            if (r1 == 0) goto Lb
            r0.add(r1)
            goto Lb
        L9d:
            java.util.List r13 = kotlin.collections.p.a1(r0)
            kotlinx.coroutines.CoroutineScope r4 = r12.f29066a
            com.forsale.app.datalayer.repositories.ExtraAttributeRawRepository r6 = r12.f29070e
            com.forsale.app.datalayer.repositories.FiltersRepository r7 = r12.f29072g
            com.forsale.app.datalayer.database.CategoryEntity r8 = r12.f29067b
            if (r15 == 0) goto Lc7
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.Iterator r15 = r15.iterator()
        Lb1:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto Lc3
            java.lang.Object r0 = r15.next()
            r1 = r0
            cc.a r1 = (cc.a) r1
            boolean r1 = r1 instanceof cc.a.AbstractC0196a.C0197a
            if (r1 == 0) goto Lb1
            goto Lc4
        Lc3:
            r0 = r2
        Lc4:
            cc.a r0 = (cc.a) r0
            goto Lc8
        Lc7:
            r0 = r2
        Lc8:
            boolean r15 = r0 instanceof cc.a.AbstractC0196a.C0197a
            if (r15 == 0) goto Lcd
            goto Lce
        Lcd:
            r0 = r2
        Lce:
            cc.a$a$a r0 = (cc.a.AbstractC0196a.C0197a) r0
            if (r0 == 0) goto Ld6
            java.util.List r2 = r0.c()
        Ld6:
            r9 = r2
            boolean r10 = r12.f29075j
            kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Triple<com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel<?, ?, ?>, com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.a, java.lang.Integer>> r11 = r12.f29074i
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.BooleanAttributeFilterViewModel r15 = new com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.BooleanAttributeFilterViewModel
            r3 = r15
            r5 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r13.add(r15)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersFactory.b(java.util.List, com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator, java.util.List):java.util.List");
    }

    public final List<FilterViewModel<?, ?, ?>> c(List<ListingsResponse.UISettings.FiltrationSetting> settings, FiltersMediator mediator, List<? extends cc.a> list) {
        List<FilterViewModel<?, ?, ?>> t11;
        o.i(settings, "settings");
        o.i(mediator, "mediator");
        FilterViewModel[] filterViewModelArr = (FilterViewModel[]) b(settings, mediator, list).toArray(new FilterViewModel[0]);
        t11 = r.t(Arrays.copyOf(filterViewModelArr, filterViewModelArr.length));
        if (!this.f29075j) {
            t11.add(new ResetAllViewModel(this.f29066a, mediator, this.f29072g, this.f29074i));
        }
        return t11;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.forsale.app.datalayer.network.requestsbodies.GetListingsBody.FiltrationData r5, java.util.List<com.forsale.app.datalayer.network.responses.ListingsResponse.UISettings.FiltrationSetting> r6, zz.a<? super java.util.List<? extends cc.a>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersFactory$getPreSelectedFilters$1
            if (r0 == 0) goto L13
            r0 = r7
            com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersFactory$getPreSelectedFilters$1 r0 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersFactory$getPreSelectedFilters$1) r0
            int r1 = r0.f29079c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29079c = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersFactory$getPreSelectedFilters$1 r0 = new com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersFactory$getPreSelectedFilters$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f29077a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f29079c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r7)
            goto L4a
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.f.b(r7)
            r7 = 0
            if (r5 == 0) goto L4c
            java.util.List r5 = ec.b.a(r5)
            if (r5 == 0) goto L4c
            com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.PreSelectedFiltersFactory r7 = r4.f29073h
            com.forsale.app.datalayer.database.CategoryEntity r2 = r4.f29067b
            r0.f29079c = r3
            java.lang.Object r7 = r7.l(r6, r5, r2, r0)
            if (r7 != r1) goto L4a
            return r1
        L4a:
            java.util.List r7 = (java.util.List) r7
        L4c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersFactory.d(com.forsale.app.datalayer.network.requestsbodies.GetListingsBody$FiltrationData, java.util.List, zz.a):java.lang.Object");
    }
}
