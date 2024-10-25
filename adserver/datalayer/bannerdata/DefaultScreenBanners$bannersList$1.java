package com.forsale.adserver.datalayer.bannerdata;

import com.google.android.gms.common.api.CommonStatusCodes;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DefaultScreenBanners.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.adserver.datalayer.bannerdata.DefaultScreenBanners", f = "DefaultScreenBanners.kt", l = {CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE}, m = "bannersList")
/* loaded from: classes2.dex */
public final class DefaultScreenBanners$bannersList$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f20648a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f20649b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ DefaultScreenBanners f20650c;

    /* renamed from: d  reason: collision with root package name */
    int f20651d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultScreenBanners$bannersList$1(DefaultScreenBanners defaultScreenBanners, zz.a<? super DefaultScreenBanners$bannersList$1> aVar) {
        super(aVar);
        this.f20650c = defaultScreenBanners;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f20649b = obj;
        this.f20651d |= Integer.MIN_VALUE;
        return this.f20650c.a(0, this);
    }
}
