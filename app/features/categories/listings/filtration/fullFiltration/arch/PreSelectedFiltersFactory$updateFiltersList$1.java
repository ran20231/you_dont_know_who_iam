package com.forsale.app.features.categories.listings.filtration.fullFiltration.arch;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PreSelectedFiltersFactory.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.PreSelectedFiltersFactory", f = "PreSelectedFiltersFactory.kt", l = {38}, m = "updateFiltersList")
/* loaded from: classes2.dex */
public final class PreSelectedFiltersFactory$updateFiltersList$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f29168a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f29169b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PreSelectedFiltersFactory f29170c;

    /* renamed from: d  reason: collision with root package name */
    int f29171d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreSelectedFiltersFactory$updateFiltersList$1(PreSelectedFiltersFactory preSelectedFiltersFactory, a<? super PreSelectedFiltersFactory$updateFiltersList$1> aVar) {
        super(aVar);
        this.f29170c = preSelectedFiltersFactory;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object p11;
        this.f29169b = obj;
        this.f29171d |= Integer.MIN_VALUE;
        p11 = this.f29170c.p(null, null, this);
        return p11;
    }
}
