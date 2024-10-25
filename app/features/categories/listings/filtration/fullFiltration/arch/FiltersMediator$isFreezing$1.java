package com.forsale.app.features.categories.listings.filtration.fullFiltration.arch;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FiltersMediator.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator", f = "FiltersMediator.kt", l = {149, 151}, m = "isFreezing")
/* loaded from: classes2.dex */
public final class FiltersMediator$isFreezing$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f29107a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f29108b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ FiltersMediator f29109c;

    /* renamed from: d  reason: collision with root package name */
    int f29110d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FiltersMediator$isFreezing$1(FiltersMediator filtersMediator, a<? super FiltersMediator$isFreezing$1> aVar) {
        super(aVar);
        this.f29109c = filtersMediator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29108b = obj;
        this.f29110d |= Integer.MIN_VALUE;
        return this.f29109c.n(false, this);
    }
}
