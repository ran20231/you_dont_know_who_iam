package com.forsale.app.features.categories.listings.filtration.fullFiltration.arch;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PreSelectedFiltersFactory.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.PreSelectedFiltersFactory", f = "PreSelectedFiltersFactory.kt", l = {172}, m = "findParentCategoriesForSubCategoriesFilters")
/* loaded from: classes2.dex */
public final class PreSelectedFiltersFactory$findParentCategoriesForSubCategoriesFilters$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f29137a;

    /* renamed from: b  reason: collision with root package name */
    Object f29138b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f29139c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ PreSelectedFiltersFactory f29140d;

    /* renamed from: e  reason: collision with root package name */
    int f29141e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreSelectedFiltersFactory$findParentCategoriesForSubCategoriesFilters$1(PreSelectedFiltersFactory preSelectedFiltersFactory, a<? super PreSelectedFiltersFactory$findParentCategoriesForSubCategoriesFilters$1> aVar) {
        super(aVar);
        this.f29140d = preSelectedFiltersFactory;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object i11;
        this.f29139c = obj;
        this.f29141e |= Integer.MIN_VALUE;
        i11 = this.f29140d.i(null, this);
        return i11;
    }
}
