package com.forsale.app.features.more.mytransactions;

import androidx.paging.i;
import com.forsale.app.base.ViewStates;
import com.forsale.app.datalayer.network.entities.MyTransactionEntity;
import com.forsale.app.datalayer.network.requestsbodies.MyTransactionBody;
import com.forsale.app.datalayer.network.services.BillingService;
import g00.p;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: MyTransactionDataSource.kt */
@d(c = "com.forsale.app.features.more.mytransactions.MyTransactionDataSource$loadInitial$$inlined$loadData$1", f = "MyTransactionDataSource.kt", l = {67}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MyTransactionDataSource$loadInitial$$inlined$loadData$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f31976a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MyTransactionDataSource f31977b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f31978c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ i.b f31979d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ MyTransactionDataSource f31980e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyTransactionDataSource$loadInitial$$inlined$loadData$1(MyTransactionDataSource myTransactionDataSource, int i11, zz.a aVar, i.b bVar, MyTransactionDataSource myTransactionDataSource2) {
        super(2, aVar);
        this.f31977b = myTransactionDataSource;
        this.f31978c = i11;
        this.f31979d = bVar;
        this.f31980e = myTransactionDataSource2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new MyTransactionDataSource$loadInitial$$inlined$loadData$1(this.f31977b, this.f31978c, aVar, this.f31979d, this.f31980e);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        BillingService billingService;
        int i11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i12 = this.f31976a;
        if (i12 != 0) {
            if (i12 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            billingService = this.f31977b.f31967e;
            MyTransactionBody myTransactionBody = new MyTransactionBody(this.f31977b.A(), this.f31978c, 30);
            this.f31976a = 1;
            obj = billingService.getTransactions(myTransactionBody, this);
            if (obj == f11) {
                return f11;
            }
        }
        MyTransactionDataSource myTransactionDataSource = this.f31977b;
        MyTransactionEntity myTransactionEntity = (MyTransactionEntity) obj;
        if (myTransactionEntity.getTotalRecords() == 0) {
            myTransactionDataSource.B().postValue(ViewStates.Empty);
        } else {
            List<MyTransactionEntity.Record> records = myTransactionEntity.getRecords();
            myTransactionDataSource.B().postValue(ViewStates.CONTENT);
            if (records != null) {
                i.b bVar = this.f31979d;
                i11 = this.f31980e.f31968f;
                bVar.b(records, null, kotlin.coroutines.jvm.internal.a.d(i11 + 1));
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((MyTransactionDataSource$loadInitial$$inlined$loadData$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
