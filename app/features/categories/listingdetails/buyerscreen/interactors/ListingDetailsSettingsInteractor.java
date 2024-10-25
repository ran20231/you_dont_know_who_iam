package com.forsale.app.features.categories.listingdetails.buyerscreen.interactors;

import com.forsale.app.datalayer.network.services.ListingService;
import kotlin.jvm.internal.o;
/* compiled from: ListingDetailsSettingsInteractor.kt */
/* loaded from: classes2.dex */
public final class ListingDetailsSettingsInteractor {

    /* renamed from: a  reason: collision with root package name */
    private final ListingService f25971a;

    public ListingDetailsSettingsInteractor(ListingService listingsService) {
        o.i(listingsService, "listingsService");
        this.f25971a = listingsService;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(zz.a<? super java.util.List<java.lang.String>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.ListingDetailsSettingsInteractor$getListingDetailsSettings$1
            if (r0 == 0) goto L13
            r0 = r5
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.ListingDetailsSettingsInteractor$getListingDetailsSettings$1 r0 = (com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.ListingDetailsSettingsInteractor$getListingDetailsSettings$1) r0
            int r1 = r0.f25974c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25974c = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.ListingDetailsSettingsInteractor$getListingDetailsSettings$1 r0 = new com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.ListingDetailsSettingsInteractor$getListingDetailsSettings$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f25972a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f25974c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.f.b(r5)
            com.forsale.app.datalayer.network.services.ListingService r5 = r4.f25971a
            r0.f25974c = r3
            java.lang.Object r5 = r5.getBuyerListingDetailsSettings(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            com.forsale.app.datalayer.network.responses.listingdetails.BuyerListingDetailsSettingsResponseModel r5 = (com.forsale.app.datalayer.network.responses.listingdetails.BuyerListingDetailsSettingsResponseModel) r5
            com.forsale.app.datalayer.network.responses.listingdetails.BuyerListingDetailsSettingsResponseModel$Data r5 = r5.getData()
            if (r5 == 0) goto L58
            com.forsale.app.datalayer.network.responses.listingdetails.BuyerListingDetailsSettingsResponseModel$Data$Settings r5 = r5.getSettings()
            if (r5 == 0) goto L58
            com.forsale.app.datalayer.network.responses.listingdetails.BuyerListingDetailsSettingsResponseModel$Data$Settings$Realty r5 = r5.getRealty()
            if (r5 == 0) goto L58
            java.util.List r5 = r5.getContacts()
            goto L59
        L58:
            r5 = 0
        L59:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.ListingDetailsSettingsInteractor.a(zz.a):java.lang.Object");
    }
}
