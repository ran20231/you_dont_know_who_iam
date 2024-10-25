package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.network.services.BillingService;
/* loaded from: classes2.dex */
public final class PaymentOptionRepository_Factory implements dagger.internal.b<PaymentOptionRepository> {
    private final vz.a<BillingService> billingServiceProvider;
    private final vz.a<RegionsRepository> regionsRepositoryProvider;

    public PaymentOptionRepository_Factory(vz.a<RegionsRepository> aVar, vz.a<BillingService> aVar2) {
        this.regionsRepositoryProvider = aVar;
        this.billingServiceProvider = aVar2;
    }

    public static PaymentOptionRepository_Factory create(vz.a<RegionsRepository> aVar, vz.a<BillingService> aVar2) {
        return new PaymentOptionRepository_Factory(aVar, aVar2);
    }

    public static PaymentOptionRepository newInstance(RegionsRepository regionsRepository, BillingService billingService) {
        return new PaymentOptionRepository(regionsRepository, billingService);
    }

    @Override // vz.a
    public PaymentOptionRepository get() {
        return newInstance(this.regionsRepositoryProvider.get(), this.billingServiceProvider.get());
    }
}
