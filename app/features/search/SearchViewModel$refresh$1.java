package com.forsale.app.features.search;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SearchViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.search.SearchViewModel$refresh$1", f = "SearchViewModel.kt", l = {339}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SearchViewModel$refresh$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f36900a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SearchViewModel f36901b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel$refresh$1(SearchViewModel searchViewModel, zz.a<? super SearchViewModel$refresh$1> aVar) {
        super(2, aVar);
        this.f36901b = searchViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new SearchViewModel$refresh$1(this.f36901b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        Object x12;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f36900a;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    kotlin.f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.f.b(obj);
                SearchViewModel searchViewModel = this.f36901b;
                this.f36900a = 1;
                x12 = searchViewModel.x1(true, this);
                if (x12 == f11) {
                    return f11;
                }
            }
        } catch (Throwable th2) {
            this.f36901b.r1(th2);
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((SearchViewModel$refresh$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
