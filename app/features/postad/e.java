package com.forsale.app.features.postad;

import com.forsale.app.models.CalculatorEntity;
import com.forsale.app.utils.analytics.PaymentMethod;
/* compiled from: PaymentMethodInteractors.kt */
/* loaded from: classes2.dex */
public final class e {
    public final PaymentMethod a(qf.c cVar) {
        PaymentMethod paymentMethod;
        if (cVar == null || !(!cVar.a().isEmpty())) {
            return null;
        }
        if (cVar.h() > 0.0f) {
            if (cVar.t()) {
                paymentMethod = PaymentMethod.CREDIT;
            } else if (cVar.i() <= 0.0f) {
                paymentMethod = PaymentMethod.KNET;
            } else {
                paymentMethod = PaymentMethod.CREDIT_KNET;
            }
        } else {
            paymentMethod = PaymentMethod.KNET;
        }
        return paymentMethod;
    }

    public final PaymentMethod b(CalculatorEntity calculatorEntity) {
        if (calculatorEntity != null) {
            if (calculatorEntity.j()) {
                return PaymentMethod.FREE;
            }
            if (calculatorEntity.s()) {
                return PaymentMethod.CREDIT;
            }
            if (calculatorEntity.t()) {
                return PaymentMethod.KNET;
            }
            return PaymentMethod.CREDIT_KNET;
        }
        return null;
    }
}
