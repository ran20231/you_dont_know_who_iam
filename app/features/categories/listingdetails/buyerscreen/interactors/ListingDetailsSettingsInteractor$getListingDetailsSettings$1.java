package com.forsale.app.features.categories.listingdetails.buyerscreen.interactors;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingDetailsSettingsInteractor.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.ListingDetailsSettingsInteractor", f = "ListingDetailsSettingsInteractor.kt", l = {15}, m = "getListingDetailsSettings")
/* loaded from: classes2.dex */
public final class ListingDetailsSettingsInteractor$getListingDetailsSettings$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f25972a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ListingDetailsSettingsInteractor f25973b;

    /* renamed from: c  reason: collision with root package name */
    int f25974c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingDetailsSettingsInteractor$getListingDetailsSettings$1(ListingDetailsSettingsInteractor listingDetailsSettingsInteractor, zz.a<? super ListingDetailsSettingsInteractor$getListingDetailsSettings$1> aVar) {
        super(aVar);
        this.f25973b = listingDetailsSettingsInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25972a = obj;
        this.f25974c |= Integer.MIN_VALUE;
        return this.f25973b.a(this);
    }
}
