package com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SubCategoriesViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.SubCategoriesViewModel", f = "SubCategoriesViewModel.kt", l = {60}, m = "mapFromDataToSelectedView")
/* loaded from: classes2.dex */
public final class SubCategoriesViewModel$mapFromDataToSelectedView$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f29600a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f29601b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SubCategoriesViewModel f29602c;

    /* renamed from: d  reason: collision with root package name */
    int f29603d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubCategoriesViewModel$mapFromDataToSelectedView$1(SubCategoriesViewModel subCategoriesViewModel, a<? super SubCategoriesViewModel$mapFromDataToSelectedView$1> aVar) {
        super(aVar);
        this.f29602c = subCategoriesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29601b = obj;
        this.f29603d |= Integer.MIN_VALUE;
        return this.f29602c.H(null, this);
    }
}
