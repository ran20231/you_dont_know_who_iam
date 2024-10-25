package com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoriesFilterViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel", f = "CategoriesFilterViewModel.kt", l = {117, 118}, m = "createSelectableDataOptions")
/* loaded from: classes2.dex */
public final class CategoriesFilterViewModel$createSelectableDataOptions$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f29471a;

    /* renamed from: b  reason: collision with root package name */
    Object f29472b;

    /* renamed from: c  reason: collision with root package name */
    boolean f29473c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f29474d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ CategoriesFilterViewModel f29475e;

    /* renamed from: f  reason: collision with root package name */
    int f29476f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoriesFilterViewModel$createSelectableDataOptions$1(CategoriesFilterViewModel categoriesFilterViewModel, a<? super CategoriesFilterViewModel$createSelectableDataOptions$1> aVar) {
        super(aVar);
        this.f29475e = categoriesFilterViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c02;
        this.f29474d = obj;
        this.f29476f |= Integer.MIN_VALUE;
        c02 = this.f29475e.c0(null, false, this);
        return c02;
    }
}
