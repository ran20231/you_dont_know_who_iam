package com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import l8.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SubCategoriesViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.SubCategoriesViewModel", f = "SubCategoriesViewModel.kt", l = {53, a.f62266c}, m = "pullFiltrationRange")
/* loaded from: classes2.dex */
public final class SubCategoriesViewModel$pullFiltrationRange$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f29624a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f29625b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SubCategoriesViewModel f29626c;

    /* renamed from: d  reason: collision with root package name */
    int f29627d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubCategoriesViewModel$pullFiltrationRange$1(SubCategoriesViewModel subCategoriesViewModel, zz.a<? super SubCategoriesViewModel$pullFiltrationRange$1> aVar) {
        super(aVar);
        this.f29626c = subCategoriesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29625b = obj;
        this.f29627d |= Integer.MIN_VALUE;
        return this.f29626c.S(this);
    }
}
