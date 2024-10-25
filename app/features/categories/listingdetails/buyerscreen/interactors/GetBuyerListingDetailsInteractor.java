package com.forsale.app.features.categories.listingdetails.buyerscreen.interactors;

import com.forsale.app.datalayer.database.MasterDataMiscModel;
import com.forsale.app.datalayer.database.RegionEntity;
import com.forsale.app.datalayer.network.services.ListingService;
import com.forsale.app.datalayer.repositories.MasterDataRepository;
import com.forsale.app.datalayer.repositories.RegionsRepository;
import com.forsale.app.features.categories.listingdetails.buyerscreen.q;
import com.forsale.app.features.categories.listingdetails.buyerscreen.t;
import com.forsale.app.features.categories.listingdetails.models.DetailsModel;
import java.util.List;
import jj.b;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.r;
import kotlin.jvm.internal.o;
import kotlin.text.StringsKt__StringsKt;
/* compiled from: GetBuyerListingDetailsInteractor.kt */
/* loaded from: classes2.dex */
public final class GetBuyerListingDetailsInteractor {

    /* renamed from: a  reason: collision with root package name */
    private final ListingService f25943a;

    /* renamed from: b  reason: collision with root package name */
    private final RegionsRepository f25944b;

    /* renamed from: c  reason: collision with root package name */
    private final b f25945c;

    /* renamed from: d  reason: collision with root package name */
    private final MainAttributesInteractor f25946d;

    /* renamed from: e  reason: collision with root package name */
    private final ContactUserInteractor f25947e;

    /* renamed from: f  reason: collision with root package name */
    private final MasterDataRepository f25948f;

    public GetBuyerListingDetailsInteractor(ListingService listingsService, RegionsRepository regionsRepository, b prefs, MainAttributesInteractor mainAttributesInteractor, ContactUserInteractor contactUserInteractor, MasterDataRepository masterDataRepository) {
        o.i(listingsService, "listingsService");
        o.i(regionsRepository, "regionsRepository");
        o.i(prefs, "prefs");
        o.i(mainAttributesInteractor, "mainAttributesInteractor");
        o.i(contactUserInteractor, "contactUserInteractor");
        o.i(masterDataRepository, "masterDataRepository");
        this.f25943a = listingsService;
        this.f25944b = regionsRepository;
        this.f25945c = prefs;
        this.f25946d = mainAttributesInteractor;
        this.f25947e = contactUserInteractor;
        this.f25948f = masterDataRepository;
    }

    private final String e(String str) {
        List F0;
        int U;
        int p11;
        F0 = StringsKt__StringsKt.F0(str, new String[]{"--_--"}, false, 0, 6, null);
        if (F0.size() > 1) {
            p11 = r.p(F0);
            return (String) F0.get(p11 - 1);
        }
        U = StringsKt__StringsKt.U(str);
        return (String) F0.get(U);
    }

    private final String f(String str) {
        List F0;
        Object k02;
        CharSequence c12;
        CharSequence a12;
        F0 = StringsKt__StringsKt.F0(str, new String[]{"--_--"}, false, 0, 6, null);
        k02 = CollectionsKt___CollectionsKt.k0(F0);
        String lowerCase = ((String) k02).toLowerCase();
        o.h(lowerCase, "toLowerCase(...)");
        c12 = StringsKt__StringsKt.c1(lowerCase);
        a12 = StringsKt__StringsKt.a1(c12.toString());
        return a12.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0068 A[PHI: r7 
      PHI: (r7v8 java.lang.Object) = (r7v5 java.lang.Object), (r7v1 java.lang.Object) binds: [B:28:0x0065, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.Integer r6, zz.a<? super com.forsale.app.datalayer.database.RegionEntity> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.GetBuyerListingDetailsInteractor$getRegionById$1
            if (r0 == 0) goto L13
            r0 = r7
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.GetBuyerListingDetailsInteractor$getRegionById$1 r0 = (com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.GetBuyerListingDetailsInteractor$getRegionById$1) r0
            int r1 = r0.f25957d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25957d = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.GetBuyerListingDetailsInteractor$getRegionById$1 r0 = new com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.GetBuyerListingDetailsInteractor$getRegionById$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f25955b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f25957d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r7)
            goto L68
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.f25954a
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.GetBuyerListingDetailsInteractor r6 = (com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.GetBuyerListingDetailsInteractor) r6
            kotlin.f.b(r7)
            goto L53
        L3c:
            kotlin.f.b(r7)
            if (r6 == 0) goto L59
            int r6 = r6.intValue()
            com.forsale.app.datalayer.repositories.RegionsRepository r7 = r5.f25944b
            r0.f25954a = r5
            r0.f25957d = r4
            java.lang.Object r7 = r7.getRegionById(r6, r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            r6 = r5
        L53:
            com.forsale.app.datalayer.database.RegionEntity r7 = (com.forsale.app.datalayer.database.RegionEntity) r7
            if (r7 != 0) goto L58
            goto L5a
        L58:
            return r7
        L59:
            r6 = r5
        L5a:
            com.forsale.app.datalayer.repositories.RegionsRepository r6 = r6.f25944b
            r7 = 0
            r0.f25954a = r7
            r0.f25957d = r3
            java.lang.Object r7 = r6.getCurrentRegion(r0)
            if (r7 != r1) goto L68
            return r1
        L68:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.GetBuyerListingDetailsInteractor.k(java.lang.Integer, zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x023e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0501  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(com.forsale.app.datalayer.network.responses.listingdetails.BuyerListingDetailsResponseModel.Data.Listing r84, com.forsale.app.datalayer.database.RegionEntity r85, zz.a<? super com.forsale.app.features.categories.listingdetails.models.DetailsModel> r86) {
        /*
            Method dump skipped, instructions count: 1325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.GetBuyerListingDetailsInteractor.l(com.forsale.app.datalayer.network.responses.listingdetails.BuyerListingDetailsResponseModel$Data$Listing, com.forsale.app.datalayer.database.RegionEntity, zz.a):java.lang.Object");
    }

    public final DetailsModel c(t buyerUIState) {
        o.i(buyerUIState, "buyerUIState");
        if (buyerUIState instanceof t.a) {
            return ((t.a) buyerUIState).a().c();
        }
        return null;
    }

    public final q d(t buyerUIState) {
        o.i(buyerUIState, "buyerUIState");
        if (buyerUIState instanceof t.a) {
            return ((t.a) buyerUIState).a();
        }
        return null;
    }

    public final Object g(zz.a<? super RegionEntity> aVar) {
        return this.f25944b.getCurrentRegion(aVar);
    }

    public final Object h(zz.a<? super String> aVar) {
        return this.f25945c.c().a(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r8, zz.a<? super com.forsale.app.features.categories.listingdetails.buyerscreen.t> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.GetBuyerListingDetailsInteractor$getListingDetailsState$1
            if (r0 == 0) goto L13
            r0 = r9
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.GetBuyerListingDetailsInteractor$getListingDetailsState$1 r0 = (com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.GetBuyerListingDetailsInteractor$getListingDetailsState$1) r0
            int r1 = r0.f25953e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25953e = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.GetBuyerListingDetailsInteractor$getListingDetailsState$1 r0 = new com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.GetBuyerListingDetailsInteractor$getListingDetailsState$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f25951c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f25953e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4b
            if (r2 == r5) goto L43
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            kotlin.f.b(r9)
            goto L9d
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            java.lang.Object r8 = r0.f25950b
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.GetBuyerListingDetailsInteractor r8 = (com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.GetBuyerListingDetailsInteractor) r8
            java.lang.Object r2 = r0.f25949a
            com.forsale.app.datalayer.network.responses.listingdetails.BuyerListingDetailsResponseModel$Data$Listing r2 = (com.forsale.app.datalayer.network.responses.listingdetails.BuyerListingDetailsResponseModel.Data.Listing) r2
            kotlin.f.b(r9)
            goto L8d
        L43:
            java.lang.Object r8 = r0.f25949a
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.GetBuyerListingDetailsInteractor r8 = (com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.GetBuyerListingDetailsInteractor) r8
            kotlin.f.b(r9)
            goto L5c
        L4b:
            kotlin.f.b(r9)
            com.forsale.app.datalayer.network.services.ListingService r9 = r7.f25943a
            r0.f25949a = r7
            r0.f25953e = r5
            java.lang.Object r9 = r9.getBuyerListingDetails(r8, r0)
            if (r9 != r1) goto L5b
            return r1
        L5b:
            r8 = r7
        L5c:
            com.forsale.app.datalayer.network.responses.listingdetails.BuyerListingDetailsResponseModel r9 = (com.forsale.app.datalayer.network.responses.listingdetails.BuyerListingDetailsResponseModel) r9
            com.forsale.app.datalayer.network.responses.listingdetails.BuyerListingDetailsResponseModel$Data r2 = r9.getData()
            com.forsale.app.datalayer.network.responses.listingdetails.BuyerListingDetailsResponseModel$Data$Listing r2 = r2.getListing()
            boolean r2 = r2.isValidResponse()
            if (r2 == 0) goto Lb2
            com.forsale.app.datalayer.network.responses.listingdetails.BuyerListingDetailsResponseModel$Data r2 = r9.getData()
            com.forsale.app.datalayer.network.responses.listingdetails.BuyerListingDetailsResponseModel$Data$Listing r2 = r2.getListing()
            com.forsale.app.datalayer.network.responses.listingdetails.BuyerListingDetailsResponseModel$Data r9 = r9.getData()
            com.forsale.app.datalayer.network.responses.listingdetails.BuyerListingDetailsResponseModel$Data$Listing r9 = r9.getListing()
            java.lang.Integer r9 = r9.getRegionsId()
            r0.f25949a = r2
            r0.f25950b = r8
            r0.f25953e = r4
            java.lang.Object r9 = r8.k(r9, r0)
            if (r9 != r1) goto L8d
            return r1
        L8d:
            com.forsale.app.datalayer.database.RegionEntity r9 = (com.forsale.app.datalayer.database.RegionEntity) r9
            r4 = 0
            r0.f25949a = r4
            r0.f25950b = r4
            r0.f25953e = r3
            java.lang.Object r9 = r8.l(r2, r9, r0)
            if (r9 != r1) goto L9d
            return r1
        L9d:
            r1 = r9
            com.forsale.app.features.categories.listingdetails.models.DetailsModel r1 = (com.forsale.app.features.categories.listingdetails.models.DetailsModel) r1
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 14
            r6 = 0
            com.forsale.app.features.categories.listingdetails.buyerscreen.q r8 = new com.forsale.app.features.categories.listingdetails.buyerscreen.q
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            com.forsale.app.features.categories.listingdetails.buyerscreen.t$a r9 = new com.forsale.app.features.categories.listingdetails.buyerscreen.t$a
            r9.<init>(r8)
            goto Lbc
        Lb2:
            com.forsale.app.features.categories.listingdetails.buyerscreen.t$b r9 = new com.forsale.app.features.categories.listingdetails.buyerscreen.t$b
            cj.a r8 = new cj.a
            r8.<init>()
            r9.<init>(r8)
        Lbc:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.GetBuyerListingDetailsInteractor.i(java.lang.String, zz.a):java.lang.Object");
    }

    public final Object j(zz.a<? super MasterDataMiscModel> aVar) {
        return this.f25948f.getMasterDataMiscModel(aVar);
    }
}
