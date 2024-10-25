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
@d(c = "com.forsale.app.features.more.mytransactions.MyTransactionDataSource$loadAfter$lambda$4$$inlined$loadData$1", f = "MyTransactionDataSource.kt", l = {67}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MyTransactionDataSource$loadAfter$lambda$4$$inlined$loadData$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f31971a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MyTransactionDataSource f31972b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f31973c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ i.a f31974d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f31975e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyTransactionDataSource$loadAfter$lambda$4$$inlined$loadData$1(MyTransactionDataSource myTransactionDataSource, int i11, zz.a aVar, i.a aVar2, int i12) {
        super(2, aVar);
        this.f31972b = myTransactionDataSource;
        this.f31973c = i11;
        this.f31974d = aVar2;
        this.f31975e = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new MyTransactionDataSource$loadAfter$lambda$4$$inlined$loadData$1(this.f31972b, this.f31973c, aVar, this.f31974d, this.f31975e);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        BillingService billingService;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f31971a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            billingService = this.f31972b.f31967e;
            MyTransactionBody myTransactionBody = new MyTransactionBody(this.f31972b.A(), this.f31973c, 30);
            this.f31971a = 1;
            obj = billingService.getTransactions(myTransactionBody, this);
            if (obj == f11) {
                return f11;
            }
        }
        MyTransactionDataSource myTransactionDataSource = this.f31972b;
        MyTransactionEntity myTransactionEntity = (MyTransactionEntity) obj;
        if (myTransactionEntity.getTotalRecords() == 0) {
            myTransactionDataSource.B().postValue(ViewStates.Empty);
        } else {
            List<MyTransactionEntity.Record> records = myTransactionEntity.getRecords();
            myTransactionDataSource.B().postValue(ViewStates.CONTENT);
            if (records != null) {
                this.f31974d.a(records, kotlin.coroutines.jvm.internal.a.d(this.f31975e + 1));
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((MyTransactionDataSource$loadAfter$lambda$4$$inlined$loadData$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
