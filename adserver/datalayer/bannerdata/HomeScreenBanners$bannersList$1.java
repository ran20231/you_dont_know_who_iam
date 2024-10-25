package com.forsale.adserver.datalayer.bannerdata;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HomeScreenBanners.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.adserver.datalayer.bannerdata.HomeScreenBanners", f = "HomeScreenBanners.kt", l = {18}, m = "bannersList$suspendImpl")
/* loaded from: classes2.dex */
public final class HomeScreenBanners$bannersList$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f20653a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f20654b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ HomeScreenBanners f20655c;

    /* renamed from: d  reason: collision with root package name */
    int f20656d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeScreenBanners$bannersList$1(HomeScreenBanners homeScreenBanners, zz.a<? super HomeScreenBanners$bannersList$1> aVar) {
        super(aVar);
        this.f20655c = homeScreenBanners;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f20654b = obj;
        this.f20656d |= Integer.MIN_VALUE;
        return HomeScreenBanners.e(this.f20655c, 0, this);
    }
}
