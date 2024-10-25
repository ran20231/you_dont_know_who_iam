package com.forsale.app.features.categories.listingdetails.buyerscreen.interactors;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ContactUserInteractor.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.ContactUserInteractor", f = "ContactUserInteractor.kt", l = {45, 49, 51, 55, 57}, m = "onChatClicked")
/* loaded from: classes2.dex */
public final class ContactUserInteractor$onChatClicked$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f25900a;

    /* renamed from: b  reason: collision with root package name */
    Object f25901b;

    /* renamed from: c  reason: collision with root package name */
    Object f25902c;

    /* renamed from: d  reason: collision with root package name */
    boolean f25903d;

    /* renamed from: e  reason: collision with root package name */
    /* synthetic */ Object f25904e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ ContactUserInteractor f25905f;

    /* renamed from: g  reason: collision with root package name */
    int f25906g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactUserInteractor$onChatClicked$1(ContactUserInteractor contactUserInteractor, zz.a<? super ContactUserInteractor$onChatClicked$1> aVar) {
        super(aVar);
        this.f25905f = contactUserInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25904e = obj;
        this.f25906g |= Integer.MIN_VALUE;
        return this.f25905f.t(null, null, this);
    }
}
