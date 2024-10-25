package com.forsale.app.features.categories.listings.filtration.fullFiltration.arch;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FiltersMediator.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator", f = "FiltersMediator.kt", l = {483}, m = "pullAllDistrictIds")
/* loaded from: classes2.dex */
public final class FiltersMediator$pullAllDistrictIds$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f29126a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ FiltersMediator f29127b;

    /* renamed from: c  reason: collision with root package name */
    int f29128c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FiltersMediator$pullAllDistrictIds$1(FiltersMediator filtersMediator, a<? super FiltersMediator$pullAllDistrictIds$1> aVar) {
        super(aVar);
        this.f29127b = filtersMediator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29126a = obj;
        this.f29128c |= Integer.MIN_VALUE;
        return this.f29127b.r(this);
    }
}
