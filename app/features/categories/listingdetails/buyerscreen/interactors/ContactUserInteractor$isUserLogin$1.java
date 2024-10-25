package com.forsale.app.features.categories.listingdetails.buyerscreen.interactors;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ContactUserInteractor.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.ContactUserInteractor", f = "ContactUserInteractor.kt", l = {62}, m = "isUserLogin")
/* loaded from: classes2.dex */
public final class ContactUserInteractor$isUserLogin$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f25897a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ContactUserInteractor f25898b;

    /* renamed from: c  reason: collision with root package name */
    int f25899c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactUserInteractor$isUserLogin$1(ContactUserInteractor contactUserInteractor, zz.a<? super ContactUserInteractor$isUserLogin$1> aVar) {
        super(aVar);
        this.f25898b = contactUserInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25897a = obj;
        this.f25899c |= Integer.MIN_VALUE;
        return this.f25898b.r(this);
    }
}
