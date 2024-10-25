package com.forsale.app.features.categories.listingdetails.buyerscreen.interactors;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DetailsAnalyticsInteractor.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.DetailsAnalyticsInteractor", f = "DetailsAnalyticsInteractor.kt", l = {125, 134, 142, 151, 159, 160, 169, 170}, m = "logContactUserAnalytics")
/* loaded from: classes2.dex */
public final class DetailsAnalyticsInteractor$logContactUserAnalytics$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f25916a;

    /* renamed from: b  reason: collision with root package name */
    Object f25917b;

    /* renamed from: c  reason: collision with root package name */
    Object f25918c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f25919d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ DetailsAnalyticsInteractor f25920e;

    /* renamed from: f  reason: collision with root package name */
    int f25921f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsAnalyticsInteractor$logContactUserAnalytics$1(DetailsAnalyticsInteractor detailsAnalyticsInteractor, zz.a<? super DetailsAnalyticsInteractor$logContactUserAnalytics$1> aVar) {
        super(aVar);
        this.f25920e = detailsAnalyticsInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25919d = obj;
        this.f25921f |= Integer.MIN_VALUE;
        return this.f25920e.a(null, null, this);
    }
}
