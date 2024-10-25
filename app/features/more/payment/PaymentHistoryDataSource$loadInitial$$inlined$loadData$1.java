package com.forsale.app.features.more.payment;

import androidx.paging.i;
import com.forsale.app.base.ViewStates;
import com.forsale.app.datalayer.network.entities.PaymentHistoryEntity;
import com.forsale.app.datalayer.network.requestsbodies.PaymentHistoryBody;
import com.forsale.app.datalayer.network.services.BillingService;
import g00.p;
import java.util.List;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* compiled from: PaymentHistoryDataSource.kt */
@d(c = "com.forsale.app.features.more.payment.PaymentHistoryDataSource$loadInitial$$inlined$loadData$1", f = "PaymentHistoryDataSource.kt", l = {62}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PaymentHistoryDataSource$loadInitial$$inlined$loadData$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f32720a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PaymentHistoryDataSource f32721b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f32722c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ i.b f32723d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ PaymentHistoryDataSource f32724e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentHistoryDataSource$loadInitial$$inlined$loadData$1(PaymentHistoryDataSource paymentHistoryDataSource, int i11, a aVar, i.b bVar, PaymentHistoryDataSource paymentHistoryDataSource2) {
        super(2, aVar);
        this.f32721b = paymentHistoryDataSource;
        this.f32722c = i11;
        this.f32723d = bVar;
        this.f32724e = paymentHistoryDataSource2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new PaymentHistoryDataSource$loadInitial$$inlined$loadData$1(this.f32721b, this.f32722c, aVar, this.f32723d, this.f32724e);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        BillingService billingService;
        String str;
        int i11;
        f11 = b.f();
        int i12 = this.f32720a;
        if (i12 != 0) {
            if (i12 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            billingService = this.f32721b.f32710d;
            str = this.f32721b.f32711e;
            PaymentHistoryBody paymentHistoryBody = new PaymentHistoryBody(str, this.f32722c, 30, null, 8, null);
            this.f32720a = 1;
            obj = billingService.getPaymentHistory(paymentHistoryBody, this);
            if (obj == f11) {
                return f11;
            }
        }
        PaymentHistoryDataSource paymentHistoryDataSource = this.f32721b;
        PaymentHistoryEntity paymentHistoryEntity = (PaymentHistoryEntity) obj;
        Integer totalRecords = paymentHistoryEntity.getTotalRecords();
        if (totalRecords != null) {
            if (totalRecords.intValue() == 0) {
                paymentHistoryDataSource.B().postValue(ViewStates.Empty);
            } else {
                List<PaymentHistoryEntity.PaymentRecord> records = paymentHistoryEntity.getRecords();
                paymentHistoryDataSource.B().postValue(ViewStates.CONTENT);
                if (records != null) {
                    i.b bVar = this.f32723d;
                    i11 = this.f32724e.f32712f;
                    bVar.b(records, null, kotlin.coroutines.jvm.internal.a.d(i11 + 1));
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((PaymentHistoryDataSource$loadInitial$$inlined$loadData$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
