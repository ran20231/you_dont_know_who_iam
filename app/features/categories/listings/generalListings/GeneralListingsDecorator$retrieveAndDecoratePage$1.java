package com.forsale.app.features.categories.listings.generalListings;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GeneralListingsDecorator.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.generalListings.GeneralListingsDecorator", f = "GeneralListingsDecorator.kt", l = {119, 120, 124}, m = "retrieveAndDecoratePage")
/* loaded from: classes2.dex */
public final class GeneralListingsDecorator$retrieveAndDecoratePage$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f30442a;

    /* renamed from: b  reason: collision with root package name */
    Object f30443b;

    /* renamed from: c  reason: collision with root package name */
    int f30444c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f30445d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ GeneralListingsDecorator f30446e;

    /* renamed from: f  reason: collision with root package name */
    int f30447f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeneralListingsDecorator$retrieveAndDecoratePage$1(GeneralListingsDecorator generalListingsDecorator, zz.a<? super GeneralListingsDecorator$retrieveAndDecoratePage$1> aVar) {
        super(aVar);
        this.f30446e = generalListingsDecorator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f30445d = obj;
        this.f30447f |= Integer.MIN_VALUE;
        return this.f30446e.t(0, this);
    }
}
