package com.forsale.app.features.categories.listingdetails.buyerscreen.interactors;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import okhttp3.internal.ws.WebSocketProtocol;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ContactUserInteractor.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.ContactUserInteractor", f = "ContactUserInteractor.kt", l = {FacebookMediationAdapter.ERROR_WRONG_NATIVE_TYPE, FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD, FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION, 119, 123, WebSocketProtocol.PAYLOAD_SHORT}, m = "contactUserNow")
/* loaded from: classes2.dex */
public final class ContactUserInteractor$contactUserNow$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f25892a;

    /* renamed from: b  reason: collision with root package name */
    Object f25893b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f25894c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ContactUserInteractor f25895d;

    /* renamed from: e  reason: collision with root package name */
    int f25896e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactUserInteractor$contactUserNow$1(ContactUserInteractor contactUserInteractor, zz.a<? super ContactUserInteractor$contactUserNow$1> aVar) {
        super(aVar);
        this.f25895d = contactUserInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11;
        this.f25894c = obj;
        this.f25896e |= Integer.MIN_VALUE;
        l11 = this.f25895d.l(null, null, null, null, this);
        return l11;
    }
}
