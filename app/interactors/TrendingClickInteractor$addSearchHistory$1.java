package com.forsale.app.interactors;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TrendingClickInteractor.kt */
@d(c = "com.forsale.app.interactors.TrendingClickInteractor", f = "TrendingClickInteractor.kt", l = {33}, m = "addSearchHistory")
/* loaded from: classes2.dex */
public final class TrendingClickInteractor$addSearchHistory$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f37484a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ TrendingClickInteractor f37485b;

    /* renamed from: c  reason: collision with root package name */
    int f37486c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrendingClickInteractor$addSearchHistory$1(TrendingClickInteractor trendingClickInteractor, a<? super TrendingClickInteractor$addSearchHistory$1> aVar) {
        super(aVar);
        this.f37485b = trendingClickInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b11;
        this.f37484a = obj;
        this.f37486c |= Integer.MIN_VALUE;
        b11 = this.f37485b.b(null, null, this);
        return b11;
    }
}
