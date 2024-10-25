package com.forsale.app.features.categories.listingdetails.buyerscreen.interactors;

import com.google.android.gms.maps.model.PinConfig;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RecentlyViewedInteractor.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.RecentlyViewedInteractor", f = "RecentlyViewedInteractor.kt", l = {PinConfig.BITMAP_WIDTH_DP, 29, 31, 32, 24, 35, 36}, m = "loadRecentlyViewed")
/* loaded from: classes2.dex */
public final class RecentlyViewedInteractor$loadRecentlyViewed$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f26002a;

    /* renamed from: b  reason: collision with root package name */
    Object f26003b;

    /* renamed from: c  reason: collision with root package name */
    Object f26004c;

    /* renamed from: d  reason: collision with root package name */
    Object f26005d;

    /* renamed from: e  reason: collision with root package name */
    Object f26006e;

    /* renamed from: f  reason: collision with root package name */
    int f26007f;

    /* renamed from: g  reason: collision with root package name */
    int f26008g;

    /* renamed from: h  reason: collision with root package name */
    int f26009h;

    /* renamed from: i  reason: collision with root package name */
    /* synthetic */ Object f26010i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ RecentlyViewedInteractor f26011j;

    /* renamed from: x  reason: collision with root package name */
    int f26012x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentlyViewedInteractor$loadRecentlyViewed$1(RecentlyViewedInteractor recentlyViewedInteractor, zz.a<? super RecentlyViewedInteractor$loadRecentlyViewed$1> aVar) {
        super(aVar);
        this.f26011j = recentlyViewedInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26010i = obj;
        this.f26012x |= Integer.MIN_VALUE;
        return this.f26011j.a(this);
    }
}
