package com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoriesFilterViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel", f = "CategoriesFilterViewModel.kt", l = {75}, m = "generateFilterCapsule")
/* loaded from: classes2.dex */
public final class CategoriesFilterViewModel$generateFilterCapsule$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f29477a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f29478b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ CategoriesFilterViewModel f29479c;

    /* renamed from: d  reason: collision with root package name */
    int f29480d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoriesFilterViewModel$generateFilterCapsule$1(CategoriesFilterViewModel categoriesFilterViewModel, a<? super CategoriesFilterViewModel$generateFilterCapsule$1> aVar) {
        super(aVar);
        this.f29479c = categoriesFilterViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29478b = obj;
        this.f29480d |= Integer.MIN_VALUE;
        return this.f29479c.j(this);
    }
}
