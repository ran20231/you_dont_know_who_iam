package com.forsale.app.features.search;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SearchViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.search.SearchViewModel", f = "SearchViewModel.kt", l = {325}, m = "neglectErrorOnCondition")
/* loaded from: classes2.dex */
public final class SearchViewModel$neglectErrorOnCondition$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    boolean f36884a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f36885b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SearchViewModel f36886c;

    /* renamed from: d  reason: collision with root package name */
    int f36887d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel$neglectErrorOnCondition$1(SearchViewModel searchViewModel, zz.a<? super SearchViewModel$neglectErrorOnCondition$1> aVar) {
        super(aVar);
        this.f36886c = searchViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object E1;
        this.f36885b = obj;
        this.f36887d |= Integer.MIN_VALUE;
        E1 = this.f36886c.E1(false, null, this);
        return E1;
    }
}
