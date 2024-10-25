package com.forsale.app.features.categories.listingdetails.buyerscreen.interactors;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DetailsAnalyticsInteractor.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.DetailsAnalyticsInteractor", f = "DetailsAnalyticsInteractor.kt", l = {89, FacebookMediationAdapter.ERROR_INVALID_SERVER_PARAMETERS}, m = "recordUserFollowClickedEvent")
/* loaded from: classes2.dex */
public final class DetailsAnalyticsInteractor$recordUserFollowClickedEvent$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f25922a;

    /* renamed from: b  reason: collision with root package name */
    Object f25923b;

    /* renamed from: c  reason: collision with root package name */
    Object f25924c;

    /* renamed from: d  reason: collision with root package name */
    boolean f25925d;

    /* renamed from: e  reason: collision with root package name */
    /* synthetic */ Object f25926e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ DetailsAnalyticsInteractor f25927f;

    /* renamed from: g  reason: collision with root package name */
    int f25928g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsAnalyticsInteractor$recordUserFollowClickedEvent$1(DetailsAnalyticsInteractor detailsAnalyticsInteractor, zz.a<? super DetailsAnalyticsInteractor$recordUserFollowClickedEvent$1> aVar) {
        super(aVar);
        this.f25927f = detailsAnalyticsInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25926e = obj;
        this.f25928g |= Integer.MIN_VALUE;
        return this.f25927f.p(null, null, false, this);
    }
}
