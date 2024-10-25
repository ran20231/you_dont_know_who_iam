package com.forsale.app.interactors;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TrendingClickInteractor.kt */
@d(c = "com.forsale.app.interactors.TrendingClickInteractor", f = "TrendingClickInteractor.kt", l = {19}, m = "onTrendsItemClicked")
/* loaded from: classes2.dex */
public final class TrendingClickInteractor$onTrendsItemClicked$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f37487a;

    /* renamed from: b  reason: collision with root package name */
    Object f37488b;

    /* renamed from: c  reason: collision with root package name */
    Object f37489c;

    /* renamed from: d  reason: collision with root package name */
    Object f37490d;

    /* renamed from: e  reason: collision with root package name */
    Object f37491e;

    /* renamed from: f  reason: collision with root package name */
    /* synthetic */ Object f37492f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ TrendingClickInteractor f37493g;

    /* renamed from: h  reason: collision with root package name */
    int f37494h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrendingClickInteractor$onTrendsItemClicked$1(TrendingClickInteractor trendingClickInteractor, a<? super TrendingClickInteractor$onTrendsItemClicked$1> aVar) {
        super(aVar);
        this.f37493g = trendingClickInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f37492f = obj;
        this.f37494h |= Integer.MIN_VALUE;
        return this.f37493g.d(null, null, null, null, null, this);
    }
}
