package com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SubCategoriesViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.SubCategoriesViewModel", f = "SubCategoriesViewModel.kt", l = {165}, m = "isAllSelected")
/* loaded from: classes2.dex */
public final class SubCategoriesViewModel$isAllSelected$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f29596a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f29597b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SubCategoriesViewModel f29598c;

    /* renamed from: d  reason: collision with root package name */
    int f29599d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubCategoriesViewModel$isAllSelected$1(SubCategoriesViewModel subCategoriesViewModel, a<? super SubCategoriesViewModel$isAllSelected$1> aVar) {
        super(aVar);
        this.f29598c = subCategoriesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29597b = obj;
        this.f29599d |= Integer.MIN_VALUE;
        return this.f29598c.A(null, this);
    }
}
