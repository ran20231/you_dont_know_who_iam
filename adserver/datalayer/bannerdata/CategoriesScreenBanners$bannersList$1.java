package com.forsale.adserver.datalayer.bannerdata;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoriesScreenBanners.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.adserver.datalayer.bannerdata.CategoriesScreenBanners", f = "CategoriesScreenBanners.kt", l = {20}, m = "bannersList$suspendImpl")
/* loaded from: classes2.dex */
public final class CategoriesScreenBanners$bannersList$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f20644a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f20645b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ CategoriesScreenBanners f20646c;

    /* renamed from: d  reason: collision with root package name */
    int f20647d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoriesScreenBanners$bannersList$1(CategoriesScreenBanners categoriesScreenBanners, zz.a<? super CategoriesScreenBanners$bannersList$1> aVar) {
        super(aVar);
        this.f20646c = categoriesScreenBanners;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f20645b = obj;
        this.f20647d |= Integer.MIN_VALUE;
        return CategoriesScreenBanners.e(this.f20646c, 0, this);
    }
}
