package com.forsale.app.features.search;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MatchingCategoriesRepository.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.search.MatchingCategoriesRepository", f = "MatchingCategoriesRepository.kt", l = {34, 45}, m = "handleMatchingCategoriesClicked")
/* loaded from: classes2.dex */
public final class MatchingCategoriesRepository$handleMatchingCategoriesClicked$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f36603a;

    /* renamed from: b  reason: collision with root package name */
    Object f36604b;

    /* renamed from: c  reason: collision with root package name */
    Object f36605c;

    /* renamed from: d  reason: collision with root package name */
    Object f36606d;

    /* renamed from: e  reason: collision with root package name */
    Object f36607e;

    /* renamed from: f  reason: collision with root package name */
    /* synthetic */ Object f36608f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ MatchingCategoriesRepository f36609g;

    /* renamed from: h  reason: collision with root package name */
    int f36610h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MatchingCategoriesRepository$handleMatchingCategoriesClicked$1(MatchingCategoriesRepository matchingCategoriesRepository, zz.a<? super MatchingCategoriesRepository$handleMatchingCategoriesClicked$1> aVar) {
        super(aVar);
        this.f36609g = matchingCategoriesRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f36608f = obj;
        this.f36610h |= Integer.MIN_VALUE;
        return this.f36609g.e(null, null, null, this);
    }
}
