package com.forsale.app.features.categories.listings.filtration.fullFiltration.arch;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PreSelectedFiltersFactory.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.PreSelectedFiltersFactory", f = "PreSelectedFiltersFactory.kt", l = {46, 53, 74}, m = "updateCategories")
/* loaded from: classes2.dex */
public final class PreSelectedFiltersFactory$updateCategories$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f29161a;

    /* renamed from: b  reason: collision with root package name */
    Object f29162b;

    /* renamed from: c  reason: collision with root package name */
    Object f29163c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f29164d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ PreSelectedFiltersFactory f29165e;

    /* renamed from: f  reason: collision with root package name */
    int f29166f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreSelectedFiltersFactory$updateCategories$1(PreSelectedFiltersFactory preSelectedFiltersFactory, a<? super PreSelectedFiltersFactory$updateCategories$1> aVar) {
        super(aVar);
        this.f29165e = preSelectedFiltersFactory;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object n11;
        this.f29164d = obj;
        this.f29166f |= Integer.MIN_VALUE;
        n11 = this.f29165e.n(null, null, this);
        return n11;
    }
}
