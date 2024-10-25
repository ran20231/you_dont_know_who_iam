package com.forsale.app.features.search;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SearchViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.search.SearchViewModel$loadAndHandleRecommendedAsync$1", f = "SearchViewModel.kt", l = {280}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SearchViewModel$loadAndHandleRecommendedAsync$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f36864a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SearchViewModel f36865b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f36866c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel$loadAndHandleRecommendedAsync$1(SearchViewModel searchViewModel, boolean z11, zz.a<? super SearchViewModel$loadAndHandleRecommendedAsync$1> aVar) {
        super(2, aVar);
        this.f36865b = searchViewModel;
        this.f36866c = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new SearchViewModel$loadAndHandleRecommendedAsync$1(this.f36865b, this.f36866c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        androidx.lifecycle.b0 b0Var;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f36864a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            SearchViewModel searchViewModel = this.f36865b;
            SearchViewModel$loadAndHandleRecommendedAsync$1$neglectedError$1 searchViewModel$loadAndHandleRecommendedAsync$1$neglectedError$1 = new SearchViewModel$loadAndHandleRecommendedAsync$1$neglectedError$1(searchViewModel, null);
            this.f36864a = 1;
            obj = searchViewModel.E1(true, searchViewModel$loadAndHandleRecommendedAsync$1$neglectedError$1, this);
            if (obj == f11) {
                return f11;
            }
        }
        if (((Throwable) obj) != null && !this.f36866c) {
            b0Var = this.f36865b.J0;
            b0Var.postValue(kotlin.coroutines.jvm.internal.a.a(false));
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((SearchViewModel$loadAndHandleRecommendedAsync$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
