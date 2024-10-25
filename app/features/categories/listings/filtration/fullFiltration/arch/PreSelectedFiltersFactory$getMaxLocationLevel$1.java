package com.forsale.app.features.categories.listings.filtration.fullFiltration.arch;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PreSelectedFiltersFactory.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.PreSelectedFiltersFactory", f = "PreSelectedFiltersFactory.kt", l = {157}, m = "getMaxLocationLevel")
/* loaded from: classes2.dex */
public final class PreSelectedFiltersFactory$getMaxLocationLevel$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f29142a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PreSelectedFiltersFactory f29143b;

    /* renamed from: c  reason: collision with root package name */
    int f29144c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreSelectedFiltersFactory$getMaxLocationLevel$1(PreSelectedFiltersFactory preSelectedFiltersFactory, a<? super PreSelectedFiltersFactory$getMaxLocationLevel$1> aVar) {
        super(aVar);
        this.f29143b = preSelectedFiltersFactory;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object j11;
        this.f29142a = obj;
        this.f29144c |= Integer.MIN_VALUE;
        j11 = this.f29143b.j(null, this);
        return j11;
    }
}
