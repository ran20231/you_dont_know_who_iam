package com.forsale.app.features.more.mytransactions;

import com.forsale.app.datalayer.database.RegionEntity;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
/* compiled from: MyTransactionsViewModel.kt */
@d(c = "com.forsale.app.features.more.mytransactions.MyTransactionsViewModel$getRegion$1$1$1", f = "MyTransactionsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class MyTransactionsViewModel$getRegion$1$1$1 extends SuspendLambda implements p<RegionEntity, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f32048a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f32049b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ MyTransactionsViewModel f32050c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyTransactionsViewModel$getRegion$1$1$1(MyTransactionsViewModel myTransactionsViewModel, zz.a<? super MyTransactionsViewModel$getRegion$1$1$1> aVar) {
        super(2, aVar);
        this.f32050c = myTransactionsViewModel;
    }

    @Override // g00.p
    /* renamed from: b */
    public final Object invoke(RegionEntity regionEntity, zz.a<? super wz.p> aVar) {
        return ((MyTransactionsViewModel$getRegion$1$1$1) create(regionEntity, aVar)).invokeSuspend(wz.p.f75480a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        MyTransactionsViewModel$getRegion$1$1$1 myTransactionsViewModel$getRegion$1$1$1 = new MyTransactionsViewModel$getRegion$1$1$1(this.f32050c, aVar);
        myTransactionsViewModel$getRegion$1$1$1.f32049b = obj;
        return myTransactionsViewModel$getRegion$1$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.b.f();
        if (this.f32048a == 0) {
            f.b(obj);
            this.f32050c.D0().postValue(((RegionEntity) this.f32049b).getCurrency());
            return wz.p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
