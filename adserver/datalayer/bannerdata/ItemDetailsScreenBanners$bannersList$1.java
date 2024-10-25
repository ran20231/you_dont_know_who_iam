package com.forsale.adserver.datalayer.bannerdata;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ItemDetailsScreenBanners.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.adserver.datalayer.bannerdata.ItemDetailsScreenBanners", f = "ItemDetailsScreenBanners.kt", l = {22}, m = "bannersList$suspendImpl")
/* loaded from: classes2.dex */
public final class ItemDetailsScreenBanners$bannersList$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f20657a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f20658b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ItemDetailsScreenBanners f20659c;

    /* renamed from: d  reason: collision with root package name */
    int f20660d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemDetailsScreenBanners$bannersList$1(ItemDetailsScreenBanners itemDetailsScreenBanners, zz.a<? super ItemDetailsScreenBanners$bannersList$1> aVar) {
        super(aVar);
        this.f20659c = itemDetailsScreenBanners;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f20658b = obj;
        this.f20660d |= Integer.MIN_VALUE;
        return ItemDetailsScreenBanners.e(this.f20659c, 0, this);
    }
}
