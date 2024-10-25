package com.forsale.app.features.search;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SearchFocusViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.search.SearchFocusViewModel", f = "SearchFocusViewModel.kt", l = {392}, m = "navigateToCategory")
/* loaded from: classes2.dex */
public final class SearchFocusViewModel$navigateToCategory$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f36767a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f36768b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SearchFocusViewModel f36769c;

    /* renamed from: d  reason: collision with root package name */
    int f36770d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchFocusViewModel$navigateToCategory$1(SearchFocusViewModel searchFocusViewModel, zz.a<? super SearchFocusViewModel$navigateToCategory$1> aVar) {
        super(aVar);
        this.f36769c = searchFocusViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object i12;
        this.f36768b = obj;
        this.f36770d |= Integer.MIN_VALUE;
        i12 = this.f36769c.i1(null, null, null, null, null, null, this);
        return i12;
    }
}
