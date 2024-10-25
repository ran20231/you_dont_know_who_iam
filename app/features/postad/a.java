package com.forsale.app.features.postad;

import com.forsale.app.interactors.SetupCalculator;
import kotlin.jvm.internal.o;
/* compiled from: CalculatorInteractors.kt */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final SetupCalculator f34199a;

    /* renamed from: b  reason: collision with root package name */
    private final of.a f34200b;

    public a(SetupCalculator setupCalculator, of.a checkPremiumAndOnlineCreditConsumption) {
        o.i(setupCalculator, "setupCalculator");
        o.i(checkPremiumAndOnlineCreditConsumption, "checkPremiumAndOnlineCreditConsumption");
        this.f34199a = setupCalculator;
        this.f34200b = checkPremiumAndOnlineCreditConsumption;
    }

    public final of.a a() {
        return this.f34200b;
    }

    public final SetupCalculator b() {
        return this.f34199a;
    }
}
