package com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SubCategoriesViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.SubCategoriesViewModel", f = "SubCategoriesViewModel.kt", l = {67, 72, 80, 83}, m = "onParentChange")
/* loaded from: classes2.dex */
public final class SubCategoriesViewModel$onParentChange$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f29604a;

    /* renamed from: b  reason: collision with root package name */
    Object f29605b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f29606c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ SubCategoriesViewModel f29607d;

    /* renamed from: e  reason: collision with root package name */
    int f29608e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubCategoriesViewModel$onParentChange$1(SubCategoriesViewModel subCategoriesViewModel, a<? super SubCategoriesViewModel$onParentChange$1> aVar) {
        super(aVar);
        this.f29607d = subCategoriesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29606c = obj;
        this.f29608e |= Integer.MIN_VALUE;
        return this.f29607d.L(null, this);
    }
}
