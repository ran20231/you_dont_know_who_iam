package com.forsale.app.features.more.mytransactions;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import t9.y0;
/* compiled from: MyTransactionDataSource.kt */
@d(c = "com.forsale.app.features.more.mytransactions.MyTransactionDataSource$loadData$1$1", f = "MyTransactionDataSource.kt", l = {61}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MyTransactionDataSource$loadData$1$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f31982a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MyTransactionDataSource f31983b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyTransactionDataSource$loadData$1$1(MyTransactionDataSource myTransactionDataSource, zz.a<? super MyTransactionDataSource$loadData$1$1> aVar) {
        super(2, aVar);
        this.f31983b = myTransactionDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new MyTransactionDataSource$loadData$1$1(this.f31983b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f31982a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            mutableSharedFlow = this.f31983b.f31966d;
            Integer d11 = kotlin.coroutines.jvm.internal.a.d(y0.P4);
            this.f31982a = 1;
            if (mutableSharedFlow.emit(d11, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((MyTransactionDataSource$loadData$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
