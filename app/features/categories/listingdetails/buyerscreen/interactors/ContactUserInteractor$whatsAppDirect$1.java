package com.forsale.app.features.categories.listingdetails.buyerscreen.interactors;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ContactUserInteractor.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.ContactUserInteractor", f = "ContactUserInteractor.kt", l = {149}, m = "whatsAppDirect")
/* loaded from: classes2.dex */
public final class ContactUserInteractor$whatsAppDirect$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f25907a;

    /* renamed from: b  reason: collision with root package name */
    Object f25908b;

    /* renamed from: c  reason: collision with root package name */
    Object f25909c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f25910d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ContactUserInteractor f25911e;

    /* renamed from: f  reason: collision with root package name */
    int f25912f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactUserInteractor$whatsAppDirect$1(ContactUserInteractor contactUserInteractor, zz.a<? super ContactUserInteractor$whatsAppDirect$1> aVar) {
        super(aVar);
        this.f25911e = contactUserInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object v11;
        this.f25910d = obj;
        this.f25912f |= Integer.MIN_VALUE;
        v11 = this.f25911e.v(null, null, null, this);
        return v11;
    }
}
