package com.forsale.app.features.search;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MatchingCategoriesRepository.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.search.MatchingCategoriesRepository", f = "MatchingCategoriesRepository.kt", l = {l8.a.f62267d}, m = "addSearchHistory")
/* loaded from: classes2.dex */
public final class MatchingCategoriesRepository$addSearchHistory$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f36600a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MatchingCategoriesRepository f36601b;

    /* renamed from: c  reason: collision with root package name */
    int f36602c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MatchingCategoriesRepository$addSearchHistory$1(MatchingCategoriesRepository matchingCategoriesRepository, zz.a<? super MatchingCategoriesRepository$addSearchHistory$1> aVar) {
        super(aVar);
        this.f36601b = matchingCategoriesRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c11;
        this.f36600a = obj;
        this.f36602c |= Integer.MIN_VALUE;
        c11 = this.f36601b.c(null, null, this);
        return c11;
    }
}
