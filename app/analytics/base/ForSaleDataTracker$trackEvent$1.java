package com.forsale.app.analytics.base;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ForSaleDataTracker.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.analytics.base.ForSaleDataTracker", f = "ForSaleDataTracker.kt", l = {25, 30, 33, 36}, m = "trackEvent")
/* loaded from: classes2.dex */
public final class ForSaleDataTracker$trackEvent$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f21973a;

    /* renamed from: b  reason: collision with root package name */
    Object f21974b;

    /* renamed from: c  reason: collision with root package name */
    Object f21975c;

    /* renamed from: d  reason: collision with root package name */
    Object f21976d;

    /* renamed from: e  reason: collision with root package name */
    Object f21977e;

    /* renamed from: f  reason: collision with root package name */
    /* synthetic */ Object f21978f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ ForSaleDataTracker f21979g;

    /* renamed from: h  reason: collision with root package name */
    int f21980h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForSaleDataTracker$trackEvent$1(ForSaleDataTracker forSaleDataTracker, zz.a<? super ForSaleDataTracker$trackEvent$1> aVar) {
        super(aVar);
        this.f21979g = forSaleDataTracker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f21978f = obj;
        this.f21980h |= Integer.MIN_VALUE;
        return this.f21979g.a(null, this);
    }
}
