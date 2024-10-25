package com.forsale.app.features.categories.listings.filtration.fullFiltration.arch;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FiltersFactory.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersFactory", f = "FiltersFactory.kt", l = {198}, m = "getPreSelectedFilters")
/* loaded from: classes2.dex */
public final class FiltersFactory$getPreSelectedFilters$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f29077a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ FiltersFactory f29078b;

    /* renamed from: c  reason: collision with root package name */
    int f29079c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FiltersFactory$getPreSelectedFilters$1(FiltersFactory filtersFactory, a<? super FiltersFactory$getPreSelectedFilters$1> aVar) {
        super(aVar);
        this.f29078b = filtersFactory;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29077a = obj;
        this.f29079c |= Integer.MIN_VALUE;
        return this.f29078b.d(null, null, this);
    }
}
