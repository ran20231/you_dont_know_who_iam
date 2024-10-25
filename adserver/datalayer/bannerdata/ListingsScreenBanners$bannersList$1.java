package com.forsale.adserver.datalayer.bannerdata;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingsScreenBanners.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.adserver.datalayer.bannerdata.ListingsScreenBanners", f = "ListingsScreenBanners.kt", l = {24}, m = "bannersList$suspendImpl")
/* loaded from: classes2.dex */
public final class ListingsScreenBanners$bannersList$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f20661a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f20662b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ListingsScreenBanners f20663c;

    /* renamed from: d  reason: collision with root package name */
    int f20664d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingsScreenBanners$bannersList$1(ListingsScreenBanners listingsScreenBanners, zz.a<? super ListingsScreenBanners$bannersList$1> aVar) {
        super(aVar);
        this.f20663c = listingsScreenBanners;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f20662b = obj;
        this.f20664d |= Integer.MIN_VALUE;
        return ListingsScreenBanners.e(this.f20663c, 0, this);
    }
}
