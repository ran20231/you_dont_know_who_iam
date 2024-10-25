package com.forsale.app.features.postad.addons.calculatorNew;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CalculatorViewModel.kt */
@d(c = "com.forsale.app.features.postad.addons.calculatorNew.CalculatorViewModel", f = "CalculatorViewModel.kt", l = {44}, m = "checkPremiumAndOnlineCreditConsumption")
/* loaded from: classes2.dex */
public final class CalculatorViewModel$checkPremiumAndOnlineCreditConsumption$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f34580a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f34581b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ CalculatorViewModel f34582c;

    /* renamed from: d  reason: collision with root package name */
    int f34583d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalculatorViewModel$checkPremiumAndOnlineCreditConsumption$1(CalculatorViewModel calculatorViewModel, zz.a<? super CalculatorViewModel$checkPremiumAndOnlineCreditConsumption$1> aVar) {
        super(aVar);
        this.f34582c = calculatorViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e11;
        this.f34581b = obj;
        this.f34583d |= Integer.MIN_VALUE;
        e11 = this.f34582c.e(null, null, this);
        return e11;
    }
}
