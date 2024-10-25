package com.forsale.app.features.search;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SearchSharedViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.search.SearchSharedViewModel$setSearchKeyword$1", f = "SearchSharedViewModel.kt", l = {36}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SearchSharedViewModel$setSearchKeyword$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f36830a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SearchSharedViewModel f36831b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f36832c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchSharedViewModel$setSearchKeyword$1(SearchSharedViewModel searchSharedViewModel, String str, zz.a<? super SearchSharedViewModel$setSearchKeyword$1> aVar) {
        super(2, aVar);
        this.f36831b = searchSharedViewModel;
        this.f36832c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new SearchSharedViewModel$setSearchKeyword$1(this.f36831b, this.f36832c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f36830a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            mutableSharedFlow = this.f36831b.f36823l0;
            String str = this.f36832c;
            this.f36830a = 1;
            if (mutableSharedFlow.emit(str, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((SearchSharedViewModel$setSearchKeyword$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
