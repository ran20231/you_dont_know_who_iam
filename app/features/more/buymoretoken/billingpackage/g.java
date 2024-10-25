package com.forsale.app.features.more.buymoretoken.billingpackage;

import com.forsale.app.datalayer.network.entities.PaymentOptionEntity;
import com.forsale.app.datalayer.network.responses.BillingPackagesResponse;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import com.forsale.app.utils.analytics.KnetPaymentType;
import kotlin.jvm.internal.o;
/* compiled from: BillingPackageViewModel.kt */
/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final BillingPackagesResponse.Package f31783a;

    /* renamed from: b  reason: collision with root package name */
    private final PaymentOptionEntity f31784b;

    /* renamed from: c  reason: collision with root package name */
    private final com.forsale.app.utils.analytics.g f31785c;

    /* renamed from: d  reason: collision with root package name */
    private final AggregatedAllAnalyticsLogger f31786d;

    /* renamed from: e  reason: collision with root package name */
    private final String f31787e;

    /* renamed from: f  reason: collision with root package name */
    private final String f31788f;

    /* renamed from: g  reason: collision with root package name */
    private final String f31789g;

    /* renamed from: h  reason: collision with root package name */
    private final String f31790h;

    /* renamed from: i  reason: collision with root package name */
    private final String f31791i;

    /* renamed from: j  reason: collision with root package name */
    private final int f31792j;

    /* compiled from: BillingPackageViewModel.kt */
    /* loaded from: classes2.dex */
    public interface a {
        g a(BillingPackagesResponse.Package r12, PaymentOptionEntity paymentOptionEntity);
    }

    public g(BillingPackagesResponse.Package entity, PaymentOptionEntity paymentOptionEntity, com.forsale.app.utils.analytics.g aggregatedAnalyticsLogger, AggregatedAllAnalyticsLogger analyticsLogger) {
        o.i(entity, "entity");
        o.i(paymentOptionEntity, "paymentOptionEntity");
        o.i(aggregatedAnalyticsLogger, "aggregatedAnalyticsLogger");
        o.i(analyticsLogger, "analyticsLogger");
        this.f31783a = entity;
        this.f31784b = paymentOptionEntity;
        this.f31785c = aggregatedAnalyticsLogger;
        this.f31786d = analyticsLogger;
        this.f31787e = String.valueOf(entity.getNumberOfAds());
        float price = entity.getPrice();
        String currency = entity.getCurrency();
        this.f31788f = price + " " + currency;
        this.f31789g = entity.getDescription();
        this.f31790h = entity.getName();
        this.f31791i = entity.getPaymentUrl();
        this.f31792j = entity.isInApp();
    }

    public final String a() {
        return this.f31787e;
    }

    public final String b() {
        return this.f31789g;
    }

    public final String c() {
        return this.f31788f;
    }

    public final String d() {
        return this.f31790h;
    }

    public final String e() {
        return this.f31791i;
    }

    public final int f() {
        return this.f31792j;
    }

    public final void g() {
        KnetPaymentType knetPaymentType = KnetPaymentType.PACKAGE;
        this.f31785c.d(this.f31783a.getPrice(), knetPaymentType);
        this.f31785c.a(knetPaymentType, this.f31783a.getPrice(), false);
    }

    public final void h() {
        AggregatedAllAnalyticsLoggerKt.E(this.f31786d, this.f31783a.getId(), this.f31784b.getNameEn(), this.f31783a.getPrice());
    }
}
