package com.forsale.app.features.more.wanteditems;

import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import t9.y0;
/* compiled from: WantedItemsDataSource.kt */
@d(c = "com.forsale.app.features.more.wanteditems.WantedItemsDataSource$loadData$1$1", f = "WantedItemsDataSource.kt", l = {67}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class WantedItemsDataSource$loadData$1$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f33758a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ WantedItemsDataSource f33759b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WantedItemsDataSource$loadData$1$1(WantedItemsDataSource wantedItemsDataSource, zz.a<? super WantedItemsDataSource$loadData$1$1> aVar) {
        super(2, aVar);
        this.f33759b = wantedItemsDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new WantedItemsDataSource$loadData$1$1(this.f33759b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        f11 = b.f();
        int i11 = this.f33758a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            mutableSharedFlow = this.f33759b.f33740c;
            Integer d11 = kotlin.coroutines.jvm.internal.a.d(y0.P4);
            this.f33758a = 1;
            if (mutableSharedFlow.emit(d11, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((WantedItemsDataSource$loadData$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
