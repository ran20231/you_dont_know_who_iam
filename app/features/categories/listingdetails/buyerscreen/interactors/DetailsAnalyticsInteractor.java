package com.forsale.app.features.categories.listingdetails.buyerscreen.interactors;

import com.forsale.app.analytics.base.ForSaleDataTracker;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.events.ListingDetailsDescriptionSeeLessClickedEvent;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.events.ListingDetailsDescriptionSeeMoreClickedEvent;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.events.ListingDetailsFavoritedEvent;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.events.ListingDetailsForSaleRealtyEvent;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.events.ListingDetailsMapClickedEvent;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.events.ListingDetailsMediaOpenedEvent;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.events.ListingDetailsReportAbuseEvent;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.events.ListingDetailsScrollingEvent;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.events.ListingDetailsShareClickedEvent;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.events.ListingDetailsSwipedEvent;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.events.ListingDetailsUnFavoritedEvent;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.events.ListingDetailsVisitedEvent;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.events.SellerProfileVisitedEvent;
import jj.b;
import kotlin.jvm.internal.o;
import u9.c;
import wz.p;
/* compiled from: DetailsAnalyticsInteractor.kt */
/* loaded from: classes2.dex */
public final class DetailsAnalyticsInteractor {

    /* renamed from: a  reason: collision with root package name */
    private final ForSaleDataTracker f25913a;

    /* renamed from: b  reason: collision with root package name */
    private final b f25914b;

    /* renamed from: c  reason: collision with root package name */
    private final ContactUserInteractor f25915c;

    public DetailsAnalyticsInteractor(ForSaleDataTracker tracker, b prefs, ContactUserInteractor contactUserInteractor) {
        o.i(tracker, "tracker");
        o.i(prefs, "prefs");
        o.i(contactUserInteractor, "contactUserInteractor");
        this.f25913a = tracker;
        this.f25914b = prefs;
        this.f25915c = contactUserInteractor;
    }

    private final Object b(c cVar, zz.a<? super p> aVar) {
        Object f11;
        Object a11 = this.f25913a.a(cVar, aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (a11 == f11) {
            return a11;
        }
        return p.f75480a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(cb.b r6, com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.ItemArgs r7, zz.a<? super wz.p> r8) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.DetailsAnalyticsInteractor.a(cb.b, com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.ItemArgs, zz.a):java.lang.Object");
    }

    public final Object c(ListingDetailsDescriptionSeeLessClickedEvent listingDetailsDescriptionSeeLessClickedEvent, zz.a<? super p> aVar) {
        Object f11;
        Object a11 = this.f25913a.a(listingDetailsDescriptionSeeLessClickedEvent, aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (a11 == f11) {
            return a11;
        }
        return p.f75480a;
    }

    public final Object d(ListingDetailsDescriptionSeeMoreClickedEvent listingDetailsDescriptionSeeMoreClickedEvent, zz.a<? super p> aVar) {
        Object f11;
        Object a11 = this.f25913a.a(listingDetailsDescriptionSeeMoreClickedEvent, aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (a11 == f11) {
            return a11;
        }
        return p.f75480a;
    }

    public final Object e(ListingDetailsFavoritedEvent listingDetailsFavoritedEvent, zz.a<? super p> aVar) {
        Object f11;
        Object a11 = this.f25913a.a(listingDetailsFavoritedEvent, aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (a11 == f11) {
            return a11;
        }
        return p.f75480a;
    }

    public final Object f(ListingDetailsForSaleRealtyEvent listingDetailsForSaleRealtyEvent, zz.a<? super p> aVar) {
        Object f11;
        Object a11 = this.f25913a.a(listingDetailsForSaleRealtyEvent, aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (a11 == f11) {
            return a11;
        }
        return p.f75480a;
    }

    public final Object g(ListingDetailsSwipedEvent listingDetailsSwipedEvent, zz.a<? super p> aVar) {
        Object f11;
        Object a11 = this.f25913a.a(listingDetailsSwipedEvent, aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (a11 == f11) {
            return a11;
        }
        return p.f75480a;
    }

    public final Object h(ListingDetailsVisitedEvent listingDetailsVisitedEvent, zz.a<? super p> aVar) {
        Object f11;
        Object a11 = this.f25913a.a(listingDetailsVisitedEvent, aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (a11 == f11) {
            return a11;
        }
        return p.f75480a;
    }

    public final Object i(ListingDetailsMapClickedEvent listingDetailsMapClickedEvent, zz.a<? super p> aVar) {
        Object f11;
        Object a11 = this.f25913a.a(listingDetailsMapClickedEvent, aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (a11 == f11) {
            return a11;
        }
        return p.f75480a;
    }

    public final Object j(ListingDetailsMediaOpenedEvent listingDetailsMediaOpenedEvent, zz.a<? super p> aVar) {
        Object f11;
        Object a11 = this.f25913a.a(listingDetailsMediaOpenedEvent, aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (a11 == f11) {
            return a11;
        }
        return p.f75480a;
    }

    public final Object k(ListingDetailsReportAbuseEvent listingDetailsReportAbuseEvent, zz.a<? super p> aVar) {
        Object f11;
        Object a11 = this.f25913a.a(listingDetailsReportAbuseEvent, aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (a11 == f11) {
            return a11;
        }
        return p.f75480a;
    }

    public final Object l(ListingDetailsScrollingEvent listingDetailsScrollingEvent, zz.a<? super p> aVar) {
        Object f11;
        Object a11 = this.f25913a.a(listingDetailsScrollingEvent, aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (a11 == f11) {
            return a11;
        }
        return p.f75480a;
    }

    public final Object m(SellerProfileVisitedEvent sellerProfileVisitedEvent, zz.a<? super p> aVar) {
        Object f11;
        Object a11 = this.f25913a.a(sellerProfileVisitedEvent, aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (a11 == f11) {
            return a11;
        }
        return p.f75480a;
    }

    public final Object n(ListingDetailsShareClickedEvent listingDetailsShareClickedEvent, zz.a<? super p> aVar) {
        Object f11;
        Object a11 = this.f25913a.a(listingDetailsShareClickedEvent, aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (a11 == f11) {
            return a11;
        }
        return p.f75480a;
    }

    public final Object o(ListingDetailsUnFavoritedEvent listingDetailsUnFavoritedEvent, zz.a<? super p> aVar) {
        Object f11;
        Object a11 = this.f25913a.a(listingDetailsUnFavoritedEvent, aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (a11 == f11) {
            return a11;
        }
        return p.f75480a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(com.forsale.app.features.categories.listingdetails.models.DetailsModel r6, com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.ItemArgs r7, boolean r8, zz.a<? super wz.p> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.DetailsAnalyticsInteractor$recordUserFollowClickedEvent$1
            if (r0 == 0) goto L13
            r0 = r9
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.DetailsAnalyticsInteractor$recordUserFollowClickedEvent$1 r0 = (com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.DetailsAnalyticsInteractor$recordUserFollowClickedEvent$1) r0
            int r1 = r0.f25928g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25928g = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.DetailsAnalyticsInteractor$recordUserFollowClickedEvent$1 r0 = new com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.DetailsAnalyticsInteractor$recordUserFollowClickedEvent$1
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f25926e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f25928g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r9)
            goto L83
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            boolean r8 = r0.f25925d
            java.lang.Object r6 = r0.f25924c
            r7 = r6
            com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.ItemArgs r7 = (com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.ItemArgs) r7
            java.lang.Object r6 = r0.f25923b
            com.forsale.app.features.categories.listingdetails.models.DetailsModel r6 = (com.forsale.app.features.categories.listingdetails.models.DetailsModel) r6
            java.lang.Object r2 = r0.f25922a
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.DetailsAnalyticsInteractor r2 = (com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.DetailsAnalyticsInteractor) r2
            kotlin.f.b(r9)
            goto L62
        L47:
            kotlin.f.b(r9)
            jj.b r9 = r5.f25914b
            com.forsale.app.utils.prefUtils.preferences.UserSharedPref r9 = r9.l()
            r0.f25922a = r5
            r0.f25923b = r6
            r0.f25924c = r7
            r0.f25925d = r8
            r0.f25928g = r4
            java.lang.Object r9 = r9.d(r0)
            if (r9 != r1) goto L61
            return r1
        L61:
            r2 = r5
        L62:
            java.lang.String r9 = (java.lang.String) r9
            if (r8 == 0) goto L6c
            com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.events.UserFollowClickedEvent r8 = new com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.events.UserFollowClickedEvent
            r8.<init>(r9, r6, r7)
            goto L71
        L6c:
            com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.events.UserUnFollowClickedEvent r8 = new com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.events.UserUnFollowClickedEvent
            r8.<init>(r9, r6, r7)
        L71:
            com.forsale.app.analytics.base.ForSaleDataTracker r6 = r2.f25913a
            r7 = 0
            r0.f25922a = r7
            r0.f25923b = r7
            r0.f25924c = r7
            r0.f25928g = r3
            java.lang.Object r6 = r6.a(r8, r0)
            if (r6 != r1) goto L83
            return r1
        L83:
            wz.p r6 = wz.p.f75480a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.DetailsAnalyticsInteractor.p(com.forsale.app.features.categories.listingdetails.models.DetailsModel, com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.ItemArgs, boolean, zz.a):java.lang.Object");
    }
}
