package com.forsale.adserver.datalayer.bannerdata;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: createBanner.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.adserver.datalayer.bannerdata.BannerFactory", f = "createBanner.kt", l = {187}, m = "loadBannersWithScreen")
/* loaded from: classes2.dex */
public final class BannerFactory$loadBannersWithScreen$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f20638a;

    /* renamed from: b  reason: collision with root package name */
    Object f20639b;

    /* renamed from: c  reason: collision with root package name */
    Object f20640c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f20641d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ BannerFactory f20642e;

    /* renamed from: f  reason: collision with root package name */
    int f20643f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerFactory$loadBannersWithScreen$1(BannerFactory bannerFactory, zz.a<? super BannerFactory$loadBannersWithScreen$1> aVar) {
        super(aVar);
        this.f20642e = bannerFactory;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f20641d = obj;
        this.f20643f |= Integer.MIN_VALUE;
        return this.f20642e.e(0, null, null, null, this);
    }
}
