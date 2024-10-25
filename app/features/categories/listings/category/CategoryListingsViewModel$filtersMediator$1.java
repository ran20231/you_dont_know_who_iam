package com.forsale.app.features.categories.listings.category;

import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.network.requestsbodies.GetListingsBody;
import com.forsale.app.datalayer.network.responses.ListingsResponse;
import com.forsale.app.datalayer.repositories.DistrictsRepository;
import com.forsale.app.datalayer.repositories.ExtraAttributeRawRepository;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersFactory;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import g00.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.q;
import kotlin.collections.s;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$filtersMediator$1", f = "CategoryListingsViewModel.kt", l = {455, 467}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CategoryListingsViewModel$filtersMediator$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super FiltersMediator>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f28488a;

    /* renamed from: b  reason: collision with root package name */
    int f28489b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ CategoryListingsViewModel f28490c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsViewModel$filtersMediator$1(CategoryListingsViewModel categoryListingsViewModel, zz.a<? super CategoryListingsViewModel$filtersMediator$1> aVar) {
        super(2, aVar);
        this.f28490c = categoryListingsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CategoryListingsViewModel$filtersMediator$1(this.f28490c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        FiltersFactory f22;
        ExtraAttributeRawRepository extraAttributeRawRepository;
        List g22;
        int y11;
        List A;
        List<ListingsResponse.UISettings.FiltrationSetting> E0;
        FiltersFactory f23;
        GetListingsBody.FiltrationData A2;
        List<ListingsResponse.UISettings.FiltrationSetting> list;
        boolean z11;
        List e11;
        List E02;
        FiltersFactory f24;
        OneShotEventHandler w22;
        AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger;
        DistrictsRepository districtsRepository;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f28489b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    kotlin.f.b(obj);
                    list = (List) this.f28488a;
                    CategoryEntity z22 = this.f28490c.z2();
                    f24 = this.f28490c.f2();
                    o.f(f24);
                    w22 = this.f28490c.w2();
                    aggregatedAllAnalyticsLogger = this.f28490c.f28381s0;
                    MutableStateFlow<Boolean> Y1 = this.f28490c.Y1();
                    districtsRepository = this.f28490c.f28377q0;
                    return new FiltersMediator(this.f28490c, z22, list, f24, w22, (List) obj, Y1, aggregatedAllAnalyticsLogger, districtsRepository);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        } else {
            kotlin.f.b(obj);
            if (this.f28490c.z2() != null) {
                f22 = this.f28490c.f2();
                if (f22 != null) {
                    extraAttributeRawRepository = this.f28490c.f28379r0;
                    int id2 = this.f28490c.z2().getId();
                    this.f28489b = 1;
                    obj = extraAttributeRawRepository.getFilterableAttributesWithCategoryIdAsFilterSettings(id2, this);
                    if (obj == f11) {
                        return f11;
                    }
                }
            }
            return null;
        }
        List list2 = (List) obj;
        g22 = this.f28490c.g2();
        List<ListingsResponse.UISettings.FiltrationSetting> list3 = g22;
        y11 = s.y(list3, 10);
        ArrayList arrayList = new ArrayList(y11);
        for (ListingsResponse.UISettings.FiltrationSetting filtrationSetting : list3) {
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
        E0 = CollectionsKt___CollectionsKt.E0(arrayList2, list2);
        f23 = this.f28490c.f2();
        o.f(f23);
        A2 = this.f28490c.A2();
        this.f28488a = E0;
        this.f28489b = 2;
        Object d11 = f23.d(A2, E0, this);
        if (d11 == f11) {
            return f11;
        }
        list = E0;
        obj = d11;
        CategoryEntity z222 = this.f28490c.z2();
        f24 = this.f28490c.f2();
        o.f(f24);
        w22 = this.f28490c.w2();
        aggregatedAllAnalyticsLogger = this.f28490c.f28381s0;
        MutableStateFlow<Boolean> Y12 = this.f28490c.Y1();
        districtsRepository = this.f28490c.f28377q0;
        return new FiltersMediator(this.f28490c, z222, list, f24, w22, (List) obj, Y12, aggregatedAllAnalyticsLogger, districtsRepository);
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super FiltersMediator> aVar) {
        return ((CategoryListingsViewModel$filtersMediator$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
