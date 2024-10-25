package com.forsale.app.features.categories.listings.filtration.fullFiltration.arch;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PreSelectedFiltersFactory.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.PreSelectedFiltersFactory", f = "PreSelectedFiltersFactory.kt", l = {132}, m = "updateBooleanAttributes")
/* loaded from: classes2.dex */
public final class PreSelectedFiltersFactory$updateBooleanAttributes$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f29157a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f29158b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PreSelectedFiltersFactory f29159c;

    /* renamed from: d  reason: collision with root package name */
    int f29160d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreSelectedFiltersFactory$updateBooleanAttributes$1(PreSelectedFiltersFactory preSelectedFiltersFactory, a<? super PreSelectedFiltersFactory$updateBooleanAttributes$1> aVar) {
        super(aVar);
        this.f29159c = preSelectedFiltersFactory;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m11;
        this.f29158b = obj;
        this.f29160d |= Integer.MIN_VALUE;
        m11 = this.f29159c.m(null, null, this);
        return m11;
    }
}
