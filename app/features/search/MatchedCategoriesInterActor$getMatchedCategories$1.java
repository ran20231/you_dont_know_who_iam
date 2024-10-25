package com.forsale.app.features.search;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MatchedCategoriesInterActor.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.search.MatchedCategoriesInterActor", f = "MatchedCategoriesInterActor.kt", l = {19}, m = "getMatchedCategories")
/* loaded from: classes2.dex */
public final class MatchedCategoriesInterActor$getMatchedCategories$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f36553a;

    /* renamed from: b  reason: collision with root package name */
    Object f36554b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f36555c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ MatchedCategoriesInterActor f36556d;

    /* renamed from: e  reason: collision with root package name */
    int f36557e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MatchedCategoriesInterActor$getMatchedCategories$1(MatchedCategoriesInterActor matchedCategoriesInterActor, zz.a<? super MatchedCategoriesInterActor$getMatchedCategories$1> aVar) {
        super(aVar);
        this.f36556d = matchedCategoriesInterActor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f36555c = obj;
        this.f36557e |= Integer.MIN_VALUE;
        return this.f36556d.a(null, this);
    }
}
