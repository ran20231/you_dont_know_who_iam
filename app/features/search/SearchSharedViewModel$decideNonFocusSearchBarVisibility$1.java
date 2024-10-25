package com.forsale.app.features.search;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SearchSharedViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.search.SearchSharedViewModel$decideNonFocusSearchBarVisibility$1", f = "SearchSharedViewModel.kt", l = {43}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SearchSharedViewModel$decideNonFocusSearchBarVisibility$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f36827a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SearchSharedViewModel f36828b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f36829c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchSharedViewModel$decideNonFocusSearchBarVisibility$1(SearchSharedViewModel searchSharedViewModel, int i11, zz.a<? super SearchSharedViewModel$decideNonFocusSearchBarVisibility$1> aVar) {
        super(2, aVar);
        this.f36828b = searchSharedViewModel;
        this.f36829c = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new SearchSharedViewModel$decideNonFocusSearchBarVisibility$1(this.f36828b, this.f36829c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        boolean B0;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f36827a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            mutableSharedFlow = this.f36828b.f36825n0;
            B0 = this.f36828b.B0(this.f36829c);
            Boolean a11 = kotlin.coroutines.jvm.internal.a.a(B0);
            this.f36827a = 1;
            if (mutableSharedFlow.emit(a11, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((SearchSharedViewModel$decideNonFocusSearchBarVisibility$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
