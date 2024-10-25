package com.forsale.app.features.categories.listings.generalListings;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GeneralListingsDecorator.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.generalListings.GeneralListingsDecorator", f = "GeneralListingsDecorator.kt", l = {102, FacebookMediationAdapter.ERROR_WRONG_NATIVE_TYPE, FacebookMediationAdapter.ERROR_MAPPING_NATIVE_ASSETS}, m = "retrieveAndDecorateInitPage")
/* loaded from: classes2.dex */
public final class GeneralListingsDecorator$retrieveAndDecorateInitPage$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f30435a;

    /* renamed from: b  reason: collision with root package name */
    Object f30436b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f30437c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ GeneralListingsDecorator f30438d;

    /* renamed from: e  reason: collision with root package name */
    int f30439e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeneralListingsDecorator$retrieveAndDecorateInitPage$1(GeneralListingsDecorator generalListingsDecorator, zz.a<? super GeneralListingsDecorator$retrieveAndDecorateInitPage$1> aVar) {
        super(aVar);
        this.f30438d = generalListingsDecorator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f30437c = obj;
        this.f30439e |= Integer.MIN_VALUE;
        return this.f30438d.s(this);
    }
}
