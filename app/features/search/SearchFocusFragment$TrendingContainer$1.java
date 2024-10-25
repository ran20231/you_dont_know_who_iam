package com.forsale.app.features.search;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: SearchFocusFragment.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.search.SearchFocusFragment$TrendingContainer$1", f = "SearchFocusFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SearchFocusFragment$TrendingContainer$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f36685a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SearchFocusViewModel f36686b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchFocusFragment$TrendingContainer$1(SearchFocusViewModel searchFocusViewModel, zz.a<? super SearchFocusFragment$TrendingContainer$1> aVar) {
        super(2, aVar);
        this.f36686b = searchFocusViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new SearchFocusFragment$TrendingContainer$1(this.f36686b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.b.f();
        if (this.f36685a == 0) {
            kotlin.f.b(obj);
            this.f36686b.n1(w.f37024a);
            return wz.p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((SearchFocusFragment$TrendingContainer$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
