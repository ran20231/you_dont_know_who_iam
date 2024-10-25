package com.forsale.app.features.categories.listings.filtration.fullFiltration.arch;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PreSelectedFiltersFactory.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.PreSelectedFiltersFactory", f = "PreSelectedFiltersFactory.kt", l = {28, 30, 31, 32}, m = "unifyPreSelectedFilters")
/* loaded from: classes2.dex */
public final class PreSelectedFiltersFactory$unifyPreSelectedFilters$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f29146a;

    /* renamed from: b  reason: collision with root package name */
    Object f29147b;

    /* renamed from: c  reason: collision with root package name */
    Object f29148c;

    /* renamed from: d  reason: collision with root package name */
    Object f29149d;

    /* renamed from: e  reason: collision with root package name */
    /* synthetic */ Object f29150e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ PreSelectedFiltersFactory f29151f;

    /* renamed from: g  reason: collision with root package name */
    int f29152g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreSelectedFiltersFactory$unifyPreSelectedFilters$1(PreSelectedFiltersFactory preSelectedFiltersFactory, a<? super PreSelectedFiltersFactory$unifyPreSelectedFilters$1> aVar) {
        super(aVar);
        this.f29151f = preSelectedFiltersFactory;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29150e = obj;
        this.f29152g |= Integer.MIN_VALUE;
        return this.f29151f.l(null, null, null, this);
    }
}
