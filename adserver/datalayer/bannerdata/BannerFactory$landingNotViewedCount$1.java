package com.forsale.adserver.datalayer.bannerdata;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: createBanner.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.adserver.datalayer.bannerdata.BannerFactory", f = "createBanner.kt", l = {146}, m = "landingNotViewedCount")
/* loaded from: classes2.dex */
public final class BannerFactory$landingNotViewedCount$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f20633a;

    /* renamed from: b  reason: collision with root package name */
    Object f20634b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f20635c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ BannerFactory f20636d;

    /* renamed from: e  reason: collision with root package name */
    int f20637e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerFactory$landingNotViewedCount$1(BannerFactory bannerFactory, zz.a<? super BannerFactory$landingNotViewedCount$1> aVar) {
        super(aVar);
        this.f20636d = bannerFactory;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f20635c = obj;
        this.f20637e |= Integer.MIN_VALUE;
        return this.f20636d.c(0, null, this);
    }
}
