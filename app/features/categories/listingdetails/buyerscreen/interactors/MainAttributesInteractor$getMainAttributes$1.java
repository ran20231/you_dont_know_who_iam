package com.forsale.app.features.categories.listingdetails.buyerscreen.interactors;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainAttributesInteractor.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.MainAttributesInteractor", f = "MainAttributesInteractor.kt", l = {24, 25}, m = "getMainAttributes")
/* loaded from: classes2.dex */
public final class MainAttributesInteractor$getMainAttributes$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f25976a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MainAttributesInteractor f25977b;

    /* renamed from: c  reason: collision with root package name */
    int f25978c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainAttributesInteractor$getMainAttributes$1(MainAttributesInteractor mainAttributesInteractor, zz.a<? super MainAttributesInteractor$getMainAttributes$1> aVar) {
        super(aVar);
        this.f25977b = mainAttributesInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25976a = obj;
        this.f25978c |= Integer.MIN_VALUE;
        return this.f25977b.a(null, this);
    }
}
