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
@d(c = "com.forsale.app.features.more.payment.PaymentHistoryDataSource$loadAfter$lambda$4$$inlined$loadData$1", f = "PaymentHistoryDataSource.kt", l = {62}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PaymentHistoryDataSource$loadAfter$lambda$4$$inlined$loadData$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f32715a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PaymentHistoryDataSource f32716b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f32717c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ i.a f32718d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f32719e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentHistoryDataSource$loadAfter$lambda$4$$inlined$loadData$1(PaymentHistoryDataSource paymentHistoryDataSource, int i11, a aVar, i.a aVar2, int i12) {
        super(2, aVar);
        this.f32716b = paymentHistoryDataSource;
        this.f32717c = i11;
        this.f32718d = aVar2;
        this.f32719e = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new PaymentHistoryDataSource$loadAfter$lambda$4$$inlined$loadData$1(this.f32716b, this.f32717c, aVar, this.f32718d, this.f32719e);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        BillingService billingService;
        String str;
        f11 = b.f();
        int i11 = this.f32715a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            billingService = this.f32716b.f32710d;
            str = this.f32716b.f32711e;
            PaymentHistoryBody paymentHistoryBody = new PaymentHistoryBody(str, this.f32717c, 30, null, 8, null);
            this.f32715a = 1;
            obj = billingService.getPaymentHistory(paymentHistoryBody, this);
            if (obj == f11) {
                return f11;
            }
        }
        PaymentHistoryDataSource paymentHistoryDataSource = this.f32716b;
        PaymentHistoryEntity paymentHistoryEntity = (PaymentHistoryEntity) obj;
        Integer totalRecords = paymentHistoryEntity.getTotalRecords();
        if (totalRecords != null) {
            if (totalRecords.intValue() == 0) {
                paymentHistoryDataSource.B().postValue(ViewStates.Empty);
            } else {
                List<PaymentHistoryEntity.PaymentRecord> records = paymentHistoryEntity.getRecords();
                paymentHistoryDataSource.B().postValue(ViewStates.CONTENT);
                if (records != null) {
                    this.f32718d.a(records, kotlin.coroutines.jvm.internal.a.d(this.f32719e + 1));
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((PaymentHistoryDataSource$loadAfter$lambda$4$$inlined$loadData$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
