package com.forsale.app.datalayer.network.services;

import com.forsale.app.datalayer.network.responses.BillingPackagesResponse;
import i10.f;
import i10.s;
import zz.a;
/* compiled from: PaymentService.kt */
/* loaded from: classes2.dex */
public interface PaymentService {
    @f("core/payment-options/{optionId}/packages")
    Object getPackages(@s("optionId") int i11, a<? super BillingPackagesResponse> aVar);
}
