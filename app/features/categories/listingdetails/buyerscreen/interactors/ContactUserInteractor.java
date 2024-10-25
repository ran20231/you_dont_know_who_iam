package com.forsale.app.features.categories.listingdetails.buyerscreen.interactors;

import com.forsale.analytics.AnalyticsType;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.network.requestsbodies.IncrementCallClicksBody;
import com.forsale.app.datalayer.network.requestsbodies.UserType;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.network.responses.listingdetails.BuyerListingDetailsResponseModel;
import com.forsale.app.datalayer.network.services.AnalyticsService;
import com.forsale.app.features.auth.UserLoginAuthoritiesInteractor;
import com.forsale.app.features.categories.listingdetails.ListingDetailsAnalyticSource;
import com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData;
import com.forsale.app.features.categories.listingdetails.buyerctas.CTAsVisibility;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.ItemArgs;
import com.forsale.app.features.categories.listingdetails.models.DetailsModel;
import com.forsale.app.ui.bottomsheets.listingdetailschat.b;
import com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.UserContactMode;
import com.forsale.app.utils.analytics.listingfiltration.ListingsAnalytics$FiltersPlace;
import falcon.chat.Chat;
import falcon.chat.entities.ChannelEntity;
import java.util.List;
import jj.b;
import kotlin.jvm.internal.o;
import kotlin.text.StringsKt__StringsKt;
import wz.p;
/* compiled from: ContactUserInteractor.kt */
/* loaded from: classes2.dex */
public final class ContactUserInteractor {

    /* renamed from: a  reason: collision with root package name */
    private final AnalyticsService f25882a;

    /* renamed from: b  reason: collision with root package name */
    private final UserLoginAuthoritiesInteractor f25883b;

    /* renamed from: c  reason: collision with root package name */
    private final b f25884c;

    /* compiled from: ContactUserInteractor.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f25885a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f25886b;

        static {
            int[] iArr = new int[UserContactMode.values().length];
            try {
                iArr[UserContactMode.CALL_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserContactMode.WHATSAPP_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f25885a = iArr;
            int[] iArr2 = new int[BuyerListingDetailsResponseModel.UserType.values().length];
            try {
                iArr2[BuyerListingDetailsResponseModel.UserType.FOR_SALE_REALTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            f25886b = iArr2;
        }
    }

    public ContactUserInteractor(AnalyticsService analysisService, UserLoginAuthoritiesInteractor userLoginAuthoritiesInteractor, b prefs) {
        o.i(analysisService, "analysisService");
        o.i(userLoginAuthoritiesInteractor, "userLoginAuthoritiesInteractor");
        o.i(prefs, "prefs");
        this.f25882a = analysisService;
        this.f25883b = userLoginAuthoritiesInteractor;
        this.f25884c = prefs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.forsale.app.features.categories.listingdetails.models.DetailsModel r5, java.lang.String r6, zz.a<? super cb.b.a> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.ContactUserInteractor$callDirect$1
            if (r0 == 0) goto L13
            r0 = r7
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.ContactUserInteractor$callDirect$1 r0 = (com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.ContactUserInteractor$callDirect$1) r0
            int r1 = r0.f25891e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25891e = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.ContactUserInteractor$callDirect$1 r0 = new com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.ContactUserInteractor$callDirect$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f25889c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f25891e
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r5 = r0.f25888b
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r0.f25887a
            com.forsale.app.features.categories.listingdetails.models.DetailsModel r5 = (com.forsale.app.features.categories.listingdetails.models.DetailsModel) r5
            kotlin.f.b(r7)
            goto L4a
        L32:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3a:
            kotlin.f.b(r7)
            r0.f25887a = r5
            r0.f25888b = r6
            r0.f25891e = r3
            java.lang.Object r7 = r4.f(r5, r6, r0)
            if (r7 != r1) goto L4a
            return r1
        L4a:
            cb.b$a r7 = new cb.b$a
            r7.<init>(r5, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.ContactUserInteractor.e(com.forsale.app.features.categories.listingdetails.models.DetailsModel, java.lang.String, zz.a):java.lang.Object");
    }

    private final Object f(DetailsModel detailsModel, String str, zz.a<? super p> aVar) {
        Object f11;
        Object p11 = p(new IncrementCallClicksBody(detailsModel.d().c(), AnalyticsType.PHONE_CALLS), aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (p11 == f11) {
            return p11;
        }
        return p.f75480a;
    }

    private final Object g(DetailsModel detailsModel, zz.a<? super p> aVar) {
        Object f11;
        Object p11 = p(new IncrementCallClicksBody(detailsModel.d().c(), AnalyticsType.CALL_ATTEMPTS), aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (p11 == f11) {
            return p11;
        }
        return p.f75480a;
    }

    private final Object k(DetailsModel detailsModel, zz.a<? super ChannelEntity> aVar) {
        return Chat.f55705a.r(detailsModel.d().w(), detailsModel.d().c(), aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(com.forsale.app.features.categories.listingdetails.models.DetailsModel r6, com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.UserContactMode r7, java.lang.String r8, java.lang.String r9, zz.a<? super cb.b> r10) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.ContactUserInteractor.l(com.forsale.app.features.categories.listingdetails.models.DetailsModel, com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.UserContactMode, java.lang.String, java.lang.String, zz.a):java.lang.Object");
    }

    static /* synthetic */ Object m(ContactUserInteractor contactUserInteractor, DetailsModel detailsModel, UserContactMode userContactMode, String str, String str2, zz.a aVar, int i11, Object obj) {
        String str3;
        String str4;
        if ((i11 & 4) != 0) {
            str3 = null;
        } else {
            str3 = str;
        }
        if ((i11 & 8) != 0) {
            str4 = null;
        } else {
            str4 = str2;
        }
        return contactUserInteractor.l(detailsModel, userContactMode, str3, str4, aVar);
    }

    private final com.forsale.app.ui.bottomsheets.listingdetailschat.b n(DetailsModel detailsModel, ItemArgs itemArgs) {
        b.a aVar;
        BuyerListingDetailsResponseModel.UserType userType;
        int i11;
        UserType userType2;
        ListingDetailsAnalyticSource listingDetailsAnalyticSource;
        String str;
        List list;
        String str2;
        ListingsAnalytics$FiltersPlace listingsAnalytics$FiltersPlace;
        ListingDetailsSearchAnalyticsData listingDetailsSearchAnalyticsData;
        int i12;
        String h11;
        List E0;
        boolean z11;
        String str3;
        List<String> t11;
        ListingItemDetails e11 = detailsModel.e();
        if (detailsModel.d().G() != null) {
            String E = detailsModel.d().E();
            List<String> t12 = detailsModel.d().t();
            if (t12 != null && !t12.isEmpty()) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!z11 && (t11 = detailsModel.d().t()) != null) {
                str3 = t11.get(0);
            } else {
                str3 = null;
            }
            aVar = new b.a(E, str3, detailsModel.d().G(), Integer.valueOf(Integer.parseInt(detailsModel.d().j())), null, null, null, 112, null);
        } else {
            aVar = null;
        }
        boolean d11 = o.d(detailsModel.d().h(), CategoryEntity.Classification.PROPERTY.getValue());
        BuyerListingDetailsResponseModel.Data.Listing.User F = detailsModel.d().F();
        if (F != null) {
            userType = F.getUserType();
        } else {
            userType = null;
        }
        if (userType == null) {
            i11 = -1;
        } else {
            i11 = a.f25886b[userType.ordinal()];
        }
        if (i11 == 1) {
            userType2 = UserType.FOR_SALE_REALTY;
        } else {
            userType2 = UserType.NORMAL;
        }
        UserType userType3 = userType2;
        if (itemArgs != null) {
            listingDetailsAnalyticSource = itemArgs.a();
        } else {
            listingDetailsAnalyticSource = null;
        }
        if (itemArgs != null) {
            str = itemArgs.g();
        } else {
            str = null;
        }
        if (itemArgs != null && (h11 = itemArgs.h()) != null) {
            E0 = StringsKt__StringsKt.E0(h11, new char[]{','}, false, 0, 6, null);
            list = E0;
        } else {
            list = null;
        }
        if (itemArgs != null) {
            str2 = itemArgs.b();
        } else {
            str2 = null;
        }
        if (str2 != null) {
            listingsAnalytics$FiltersPlace = ListingsAnalytics$FiltersPlace.Companion.a(itemArgs.b());
        } else {
            listingsAnalytics$FiltersPlace = null;
        }
        if (itemArgs != null) {
            listingDetailsSearchAnalyticsData = itemArgs.f();
        } else {
            listingDetailsSearchAnalyticsData = null;
        }
        if (itemArgs != null) {
            i12 = itemArgs.d();
        } else {
            i12 = -1;
        }
        return new com.forsale.app.ui.bottomsheets.listingdetailschat.b(i12, e11, null, aVar, false, null, Boolean.valueOf(d11), userType3, listingDetailsAnalyticSource, str, list, listingsAnalytics$FiltersPlace, listingDetailsSearchAnalyticsData);
    }

    private final boolean o(List<String> list, String str) {
        boolean z11;
        List<String> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11 && (list.size() != 1 || !o.d(list.get(0), str))) {
            return false;
        }
        return true;
    }

    private final Object p(IncrementCallClicksBody incrementCallClicksBody, zz.a<? super p> aVar) {
        Object f11;
        Object incrementCallClicks = this.f25882a.incrementCallClicks(new IncrementCallClicksBody(incrementCallClicksBody.getUser_adv_id(), incrementCallClicksBody.getTarget()), aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (incrementCallClicks == f11) {
            return incrementCallClicks;
        }
        return p.f75480a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(com.forsale.app.features.categories.listingdetails.models.DetailsModel r5, java.lang.String r6, java.lang.String r7, zz.a<? super cb.b.f> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.ContactUserInteractor$whatsAppDirect$1
            if (r0 == 0) goto L13
            r0 = r8
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.ContactUserInteractor$whatsAppDirect$1 r0 = (com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.ContactUserInteractor$whatsAppDirect$1) r0
            int r1 = r0.f25912f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25912f = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.ContactUserInteractor$whatsAppDirect$1 r0 = new com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.ContactUserInteractor$whatsAppDirect$1
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f25910d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f25912f
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r5 = r0.f25909c
            r7 = r5
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r5 = r0.f25908b
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r0.f25907a
            com.forsale.app.features.categories.listingdetails.models.DetailsModel r5 = (com.forsale.app.features.categories.listingdetails.models.DetailsModel) r5
            kotlin.f.b(r8)
            goto L51
        L37:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3f:
            kotlin.f.b(r8)
            r0.f25907a = r5
            r0.f25908b = r6
            r0.f25909c = r7
            r0.f25912f = r3
            java.lang.Object r8 = r4.w(r5, r6, r0)
            if (r8 != r1) goto L51
            return r1
        L51:
            cb.b$f r8 = new cb.b$f
            if (r7 != 0) goto L57
            java.lang.String r7 = ""
        L57:
            r8.<init>(r5, r6, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.ContactUserInteractor.v(com.forsale.app.features.categories.listingdetails.models.DetailsModel, java.lang.String, java.lang.String, zz.a):java.lang.Object");
    }

    private final Object w(DetailsModel detailsModel, String str, zz.a<? super p> aVar) {
        Object f11;
        Object p11 = p(new IncrementCallClicksBody(detailsModel.d().c(), AnalyticsType.WHATSAPP), aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (p11 == f11) {
            return p11;
        }
        return p.f75480a;
    }

    private final Object x(DetailsModel detailsModel, zz.a<? super p> aVar) {
        Object f11;
        Object p11 = p(new IncrementCallClicksBody(detailsModel.d().c(), AnalyticsType.WHATSAPP_APP_ICON), aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (p11 == f11) {
            return p11;
        }
        return p.f75480a;
    }

    public final CTAsVisibility d(Boolean bool, List<String> list, String phone) {
        o.i(phone, "phone");
        if (q(bool, list, phone)) {
            Boolean bool2 = Boolean.FALSE;
            return new CTAsVisibility(bool2, bool2, null, 4, null);
        }
        return new CTAsVisibility(null, null, null, 7, null);
    }

    public final boolean h(DetailsModel listingDetails) {
        o.i(listingDetails, "listingDetails");
        Boolean N = listingDetails.d().N();
        if (N != null) {
            return N.booleanValue();
        }
        return false;
    }

    public final boolean i(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final Object j(DetailsModel detailsModel, zz.a<? super p> aVar) {
        Object f11;
        Object p11 = p(new IncrementCallClicksBody(detailsModel.d().c(), AnalyticsType.CHAT), aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (p11 == f11) {
            return p11;
        }
        return p.f75480a;
    }

    public final boolean q(Boolean bool, List<String> list, String phone) {
        o.i(phone, "phone");
        if (o.d(bool, Boolean.TRUE) && o(list, phone)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(zz.a<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.ContactUserInteractor$isUserLogin$1
            if (r0 == 0) goto L13
            r0 = r5
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.ContactUserInteractor$isUserLogin$1 r0 = (com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.ContactUserInteractor$isUserLogin$1) r0
            int r1 = r0.f25899c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25899c = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.ContactUserInteractor$isUserLogin$1 r0 = new com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.ContactUserInteractor$isUserLogin$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f25897a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f25899c
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
            com.forsale.app.features.auth.UserLoginAuthoritiesInteractor r5 = r4.f25883b
            r0.f25899c = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            com.forsale.app.features.auth.UserStatus r0 = com.forsale.app.features.auth.UserStatus.LoggedIn
            if (r5 != r0) goto L44
            goto L45
        L44:
            r3 = 0
        L45:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.a.a(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.ContactUserInteractor.r(zz.a):java.lang.Object");
    }

    public final Object s(DetailsModel detailsModel, String str, zz.a<? super cb.b> aVar) {
        return m(this, detailsModel, UserContactMode.CALL_ONLY, str, null, aVar, 8, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0114 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(com.forsale.app.features.categories.listingdetails.models.DetailsModel r11, com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.ItemArgs r12, zz.a<? super cb.b> r13) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.ContactUserInteractor.t(com.forsale.app.features.categories.listingdetails.models.DetailsModel, com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.ItemArgs, zz.a):java.lang.Object");
    }

    public final Object u(DetailsModel detailsModel, String str, String str2, zz.a<? super cb.b> aVar) {
        return l(detailsModel, UserContactMode.WHATSAPP_ONLY, str, str2, aVar);
    }
}
