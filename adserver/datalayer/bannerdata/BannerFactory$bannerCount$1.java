package com.forsale.adserver.datalayer.bannerdata;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: createBanner.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.adserver.datalayer.bannerdata.BannerFactory", f = "createBanner.kt", l = {166}, m = "bannerCount")
/* loaded from: classes2.dex */
public final class BannerFactory$bannerCount$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f20630a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BannerFactory f20631b;

    /* renamed from: c  reason: collision with root package name */
    int f20632c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerFactory$bannerCount$1(BannerFactory bannerFactory, zz.a<? super BannerFactory$bannerCount$1> aVar) {
        super(aVar);
        this.f20631b = bannerFactory;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f20630a = obj;
        this.f20632c |= Integer.MIN_VALUE;
        return this.f20631b.a(0, null, this);
    }
}
