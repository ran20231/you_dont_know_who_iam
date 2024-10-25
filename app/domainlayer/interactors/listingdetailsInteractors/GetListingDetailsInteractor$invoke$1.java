package com.forsale.app.domainlayer.interactors.listingdetailsInteractors;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GetListingDetailsInteractor.kt */
@d(c = "com.forsale.app.domainlayer.interactors.listingdetailsInteractors.GetListingDetailsInteractor", f = "GetListingDetailsInteractor.kt", l = {17}, m = "invoke")
/* loaded from: classes2.dex */
public final class GetListingDetailsInteractor$invoke$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f22456a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ GetListingDetailsInteractor f22457b;

    /* renamed from: c  reason: collision with root package name */
    int f22458c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetListingDetailsInteractor$invoke$1(GetListingDetailsInteractor getListingDetailsInteractor, a<? super GetListingDetailsInteractor$invoke$1> aVar) {
        super(aVar);
        this.f22457b = getListingDetailsInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22456a = obj;
        this.f22458c |= Integer.MIN_VALUE;
        return this.f22457b.a(0, this);
    }
}
