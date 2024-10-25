package com.forsale.app.domainlayer.interactors.listingdetailsInteractors;

import com.forsale.app.datalayer.network.services.ListingsService;
import kotlin.jvm.internal.o;
/* compiled from: GetListingDetailsInteractor.kt */
/* loaded from: classes2.dex */
public final class GetListingDetailsInteractor {

    /* renamed from: a  reason: collision with root package name */
    private final ListingsService f22455a;

    public GetListingDetailsInteractor(ListingsService listingsService) {
        o.i(listingsService, "listingsService");
        this.f22455a = listingsService;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r11, zz.a<? super com.forsale.app.datalayer.network.responses.ListingItemDetails> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.forsale.app.domainlayer.interactors.listingdetailsInteractors.GetListingDetailsInteractor$invoke$1
            if (r0 == 0) goto L13
            r0 = r12
            com.forsale.app.domainlayer.interactors.listingdetailsInteractors.GetListingDetailsInteractor$invoke$1 r0 = (com.forsale.app.domainlayer.interactors.listingdetailsInteractors.GetListingDetailsInteractor$invoke$1) r0
            int r1 = r0.f22458c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22458c = r1
            goto L18
        L13:
            com.forsale.app.domainlayer.interactors.listingdetailsInteractors.GetListingDetailsInteractor$invoke$1 r0 = new com.forsale.app.domainlayer.interactors.listingdetailsInteractors.GetListingDetailsInteractor$invoke$1
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.f22456a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f22458c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r12)     // Catch: java.lang.Exception -> L56
            goto L53
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            kotlin.f.b(r12)
            com.forsale.app.datalayer.network.services.ListingsService r12 = r10.f22455a     // Catch: java.lang.Exception -> L56
            com.forsale.app.datalayer.network.requestsbodies.GetListingDetailsBody$Companion r4 = com.forsale.app.datalayer.network.requestsbodies.GetListingDetailsBody.Companion     // Catch: java.lang.Exception -> L56
            com.forsale.app.datalayer.network.requestsbodies.ListingDetailsType$AdvId r5 = new com.forsale.app.datalayer.network.requestsbodies.ListingDetailsType$AdvId     // Catch: java.lang.Exception -> L56
            r5.<init>(r11)     // Catch: java.lang.Exception -> L56
            com.forsale.app.utils.LocaleManager r11 = com.forsale.app.utils.LocaleManager.f39597a     // Catch: java.lang.Exception -> L56
            com.forsale.app.utils.Languages r6 = r11.g()     // Catch: java.lang.Exception -> L56
            r7 = 0
            r8 = 4
            r9 = 0
            com.forsale.app.datalayer.network.requestsbodies.GetListingDetailsBody r11 = com.forsale.app.datalayer.network.requestsbodies.GetListingDetailsBody.Companion.createListingDetails$default(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L56
            r0.f22458c = r3     // Catch: java.lang.Exception -> L56
            java.lang.Object r12 = r12.getListingDetails(r11, r0)     // Catch: java.lang.Exception -> L56
            if (r12 != r1) goto L53
            return r1
        L53:
            com.forsale.app.datalayer.network.responses.ListingItemDetails r12 = (com.forsale.app.datalayer.network.responses.ListingItemDetails) r12     // Catch: java.lang.Exception -> L56
            goto L57
        L56:
            r12 = 0
        L57:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.domainlayer.interactors.listingdetailsInteractors.GetListingDetailsInteractor.a(int, zz.a):java.lang.Object");
    }
}
