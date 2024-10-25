package com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import l8.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SubCategoriesViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.SubCategoriesViewModel", f = "SubCategoriesViewModel.kt", l = {90, a.f62268e}, m = "pullExtraData")
/* loaded from: classes2.dex */
public final class SubCategoriesViewModel$pullExtraData$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f29620a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f29621b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SubCategoriesViewModel f29622c;

    /* renamed from: d  reason: collision with root package name */
    int f29623d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubCategoriesViewModel$pullExtraData$1(SubCategoriesViewModel subCategoriesViewModel, zz.a<? super SubCategoriesViewModel$pullExtraData$1> aVar) {
        super(aVar);
        this.f29622c = subCategoriesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29621b = obj;
        this.f29623d |= Integer.MIN_VALUE;
        return this.f29622c.i0(this);
    }
}
