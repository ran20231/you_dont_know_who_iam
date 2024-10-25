package com.forsale.app.datalayer.network.services;

import com.forsale.app.datalayer.network.entities.MyTransactionEntity;
import com.forsale.app.datalayer.network.entities.PaymentHistoryEntity;
import com.forsale.app.datalayer.network.entities.PaymentOptionEntity;
import com.forsale.app.datalayer.network.requestsbodies.LastKnetStatusBody;
import com.forsale.app.datalayer.network.requestsbodies.MyTransactionBody;
import com.forsale.app.datalayer.network.requestsbodies.PaymentHistoryBody;
import com.forsale.app.datalayer.network.requestsbodies.PaymentOptionBody;
import com.forsale.app.datalayer.network.responses.LastKnetStatusResponse;
import i10.a;
import i10.o;
import java.util.List;
/* compiled from: BillingService.kt */
/* loaded from: classes2.dex */
public interface BillingService {
    @o("Billing/getLastKnetStatus")
    Object getLastKNetStatusAsync(@a LastKnetStatusBody lastKnetStatusBody, zz.a<? super LastKnetStatusResponse> aVar);

    @o("Billing/getPaymentHistory")
    Object getPaymentHistory(@a PaymentHistoryBody paymentHistoryBody, zz.a<? super PaymentHistoryEntity> aVar);

    @o("Billing/getPaymentOptions")
    Object getPaymentOptionsAsync(@a PaymentOptionBody paymentOptionBody, zz.a<? super List<PaymentOptionEntity>> aVar);

    @o("Billing/getTransactions")
    Object getTransactions(@a MyTransactionBody myTransactionBody, zz.a<? super MyTransactionEntity> aVar);
}
