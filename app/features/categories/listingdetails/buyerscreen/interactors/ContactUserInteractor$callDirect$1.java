package com.forsale.app.features.categories.listingdetails.buyerscreen.interactors;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ContactUserInteractor.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.ContactUserInteractor", f = "ContactUserInteractor.kt", l = {140}, m = "callDirect")
/* loaded from: classes2.dex */
public final class ContactUserInteractor$callDirect$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f25887a;

    /* renamed from: b  reason: collision with root package name */
    Object f25888b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f25889c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ContactUserInteractor f25890d;

    /* renamed from: e  reason: collision with root package name */
    int f25891e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactUserInteractor$callDirect$1(ContactUserInteractor contactUserInteractor, zz.a<? super ContactUserInteractor$callDirect$1> aVar) {
        super(aVar);
        this.f25890d = contactUserInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e11;
        this.f25889c = obj;
        this.f25891e |= Integer.MIN_VALUE;
        e11 = this.f25890d.e(null, null, this);
        return e11;
    }
}
