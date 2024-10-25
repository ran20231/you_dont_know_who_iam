package com.forsale.adserver.view.viewmodel;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DetailsAnalyticsLogger.kt */
@d(c = "com.forsale.adserver.view.viewmodel.DetailsAnalyticsLogger", f = "DetailsAnalyticsLogger.kt", l = {383, 385}, m = "toCommercialDetails")
/* loaded from: classes2.dex */
public final class DetailsAnalyticsLogger$toCommercialDetails$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f21693a;

    /* renamed from: b  reason: collision with root package name */
    Object f21694b;

    /* renamed from: c  reason: collision with root package name */
    Object f21695c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f21696d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ DetailsAnalyticsLogger f21697e;

    /* renamed from: f  reason: collision with root package name */
    int f21698f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsAnalyticsLogger$toCommercialDetails$1(DetailsAnalyticsLogger detailsAnalyticsLogger, a<? super DetailsAnalyticsLogger$toCommercialDetails$1> aVar) {
        super(aVar);
        this.f21697e = detailsAnalyticsLogger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object q11;
        this.f21696d = obj;
        this.f21698f |= Integer.MIN_VALUE;
        q11 = this.f21697e.q(null, this);
        return q11;
    }
}
