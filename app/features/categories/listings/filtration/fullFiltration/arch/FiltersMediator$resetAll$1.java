package com.forsale.app.features.categories.listings.filtration.fullFiltration.arch;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FiltersMediator.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator", f = "FiltersMediator.kt", l = {137, 144}, m = "resetAll")
/* loaded from: classes2.dex */
public final class FiltersMediator$resetAll$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f29129a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f29130b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ FiltersMediator f29131c;

    /* renamed from: d  reason: collision with root package name */
    int f29132d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FiltersMediator$resetAll$1(FiltersMediator filtersMediator, a<? super FiltersMediator$resetAll$1> aVar) {
        super(aVar);
        this.f29131c = filtersMediator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29130b = obj;
        this.f29132d |= Integer.MIN_VALUE;
        return this.f29131c.t(this);
    }
}
