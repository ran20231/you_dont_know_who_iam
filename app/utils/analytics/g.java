package com.forsale.app.utils.analytics;

import kotlin.jvm.internal.o;
/* compiled from: AggregatedPurchaseAnalyticsLogger.kt */
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final FacebookEventsLogger f40016a;

    /* renamed from: b  reason: collision with root package name */
    private final FirebaseEventsLogger f40017b;

    public g(FacebookEventsLogger facebookLogger, FirebaseEventsLogger firebaseLogger) {
        o.i(facebookLogger, "facebookLogger");
        o.i(firebaseLogger, "firebaseLogger");
        this.f40016a = facebookLogger;
        this.f40017b = firebaseLogger;
    }

    public final void a(KnetPaymentType paymentType, double d11, boolean z11) {
        o.i(paymentType, "paymentType");
        this.f40016a.k(paymentType, d11, z11);
        this.f40017b.m(paymentType, d11, z11);
    }

    public final void b(String categoryName) {
        o.i(categoryName, "categoryName");
        this.f40016a.l(categoryName);
        this.f40017b.o(categoryName);
    }

    public final void c(boolean z11, KnetPaymentType paymentType) {
        o.i(paymentType, "paymentType");
        this.f40016a.m(z11, paymentType);
        this.f40017b.p(z11, paymentType);
    }

    public final void d(double d11, KnetPaymentType paymentType) {
        o.i(paymentType, "paymentType");
        this.f40016a.o(d11, paymentType);
        this.f40017b.q(d11, paymentType);
    }

    public final void e(KnetPaymentType paymentType) {
        o.i(paymentType, "paymentType");
        this.f40016a.p(paymentType);
        this.f40017b.r(paymentType);
    }

    public final void f(KnetPaymentType paymentType) {
        o.i(paymentType, "paymentType");
        this.f40016a.q(paymentType);
        this.f40017b.s(paymentType);
    }

    public final void g(double d11, KnetPaymentType paymentType) {
        o.i(paymentType, "paymentType");
        this.f40016a.r(d11, paymentType);
        this.f40017b.t(d11, paymentType);
    }
}
