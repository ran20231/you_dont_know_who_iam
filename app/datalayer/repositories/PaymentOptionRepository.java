package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.network.entities.PaymentOptionEntity;
import com.forsale.app.datalayer.network.requestsbodies.PaymentOptionBody;
import com.forsale.app.datalayer.network.services.BillingService;
import java.util.List;
import kotlin.jvm.internal.o;
/* compiled from: PaymentOptionRepository.kt */
/* loaded from: classes2.dex */
public final class PaymentOptionRepository {
    public static final int $stable = 8;
    private final BillingService billingService;
    private final RegionsRepository regionsRepository;

    public PaymentOptionRepository(RegionsRepository regionsRepository, BillingService billingService) {
        o.i(regionsRepository, "regionsRepository");
        o.i(billingService, "billingService");
        this.regionsRepository = regionsRepository;
        this.billingService = billingService;
    }

    public final Object getData(int i11, zz.a<? super List<PaymentOptionEntity>> aVar) {
        return this.billingService.getPaymentOptionsAsync(new PaymentOptionBody(i11), aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getRegion(zz.a<? super java.lang.Integer> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.forsale.app.datalayer.repositories.PaymentOptionRepository$getRegion$1
            if (r0 == 0) goto L13
            r0 = r5
            com.forsale.app.datalayer.repositories.PaymentOptionRepository$getRegion$1 r0 = (com.forsale.app.datalayer.repositories.PaymentOptionRepository$getRegion$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.PaymentOptionRepository$getRegion$1 r0 = new com.forsale.app.datalayer.repositories.PaymentOptionRepository$getRegion$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.f.b(r5)
            com.forsale.app.datalayer.repositories.RegionsRepository r5 = r4.regionsRepository
            r0.label = r3
            java.lang.Object r5 = r5.getUserRegion(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            com.forsale.app.datalayer.database.RegionEntity r5 = (com.forsale.app.datalayer.database.RegionEntity) r5
            if (r5 == 0) goto L4c
            int r5 = r5.getId()
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.a.d(r5)
            goto L4d
        L4c:
            r5 = 0
        L4d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.PaymentOptionRepository.getRegion(zz.a):java.lang.Object");
    }
}
