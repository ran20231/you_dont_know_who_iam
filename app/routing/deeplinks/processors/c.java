package com.forsale.app.routing.deeplinks.processors;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: DeepLinksProcessorsExecutor.kt */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final Context f37778a;

    /* renamed from: b  reason: collision with root package name */
    private final cx.a<d> f37779b;

    /* renamed from: c  reason: collision with root package name */
    private final cx.a<OfferDetailsLinkProcessor> f37780c;

    /* renamed from: d  reason: collision with root package name */
    private final cx.a<f> f37781d;

    /* renamed from: e  reason: collision with root package name */
    private final cx.a<BannerLinkProcessor> f37782e;

    /* renamed from: f  reason: collision with root package name */
    private final cx.a<FollowersLinkProcessor> f37783f;

    /* renamed from: g  reason: collision with root package name */
    private final cx.a<g> f37784g;

    /* renamed from: h  reason: collision with root package name */
    private final cx.a<MyFavouritesLinkProcessor> f37785h;

    /* renamed from: i  reason: collision with root package name */
    private final cx.a<WantedItemsLinkProcessor> f37786i;

    /* renamed from: j  reason: collision with root package name */
    private final cx.a<MyListingsLinkProcessor> f37787j;

    /* renamed from: k  reason: collision with root package name */
    private final cx.a<e> f37788k;

    /* renamed from: l  reason: collision with root package name */
    private final cx.a<j> f37789l;

    /* renamed from: m  reason: collision with root package name */
    private final cx.a<RegistrationLinkProcessor> f37790m;

    /* renamed from: n  reason: collision with root package name */
    private final cx.a<LoginLinkLinkProcessor> f37791n;

    /* renamed from: o  reason: collision with root package name */
    private final cx.a<a> f37792o;

    /* renamed from: p  reason: collision with root package name */
    private final cx.a<h> f37793p;

    /* renamed from: q  reason: collision with root package name */
    private final cx.a<i> f37794q;

    /* renamed from: r  reason: collision with root package name */
    private final cx.a<PaymentLinkProcessor> f37795r;

    /* renamed from: s  reason: collision with root package name */
    private final cx.a<ListingsDetailsProcessors> f37796s;

    /* renamed from: t  reason: collision with root package name */
    private final cx.a<CommercialListingDetailsProcessor> f37797t;

    /* renamed from: u  reason: collision with root package name */
    private final cx.a<CategoriesLinkProcessor> f37798u;

    public c(Context context, cx.a<d> generalLinksProcessor, cx.a<OfferDetailsLinkProcessor> offerDetailsLinkProcessor, cx.a<f> offersWithArgsLinkProcessor, cx.a<BannerLinkProcessor> bannerLinkProcessor, cx.a<FollowersLinkProcessor> followersLinkProcessor, cx.a<g> postListingLinkProcessor, cx.a<MyFavouritesLinkProcessor> myFavouritesLinkProcessor, cx.a<WantedItemsLinkProcessor> wantedItemsLinkProcessor, cx.a<MyListingsLinkProcessor> myListingsLinkProcessor, cx.a<e> inAppBrowserLinkProcessor, cx.a<j> virtualTourLinkProcessor, cx.a<RegistrationLinkProcessor> authLinkProcessor, cx.a<LoginLinkLinkProcessor> loginLinkProcessor, cx.a<a> adUnitLinkProcessor, cx.a<h> realtyLinkProcessor, cx.a<i> searchFocusLinkProcessor, cx.a<PaymentLinkProcessor> paymentLinkProcessor, cx.a<ListingsDetailsProcessors> listingsDetailsProcessors, cx.a<CommercialListingDetailsProcessor> commercialListingDetailsProcessor, cx.a<CategoriesLinkProcessor> categoriesProcessor) {
        o.i(context, "context");
        o.i(generalLinksProcessor, "generalLinksProcessor");
        o.i(offerDetailsLinkProcessor, "offerDetailsLinkProcessor");
        o.i(offersWithArgsLinkProcessor, "offersWithArgsLinkProcessor");
        o.i(bannerLinkProcessor, "bannerLinkProcessor");
        o.i(followersLinkProcessor, "followersLinkProcessor");
        o.i(postListingLinkProcessor, "postListingLinkProcessor");
        o.i(myFavouritesLinkProcessor, "myFavouritesLinkProcessor");
        o.i(wantedItemsLinkProcessor, "wantedItemsLinkProcessor");
        o.i(myListingsLinkProcessor, "myListingsLinkProcessor");
        o.i(inAppBrowserLinkProcessor, "inAppBrowserLinkProcessor");
        o.i(virtualTourLinkProcessor, "virtualTourLinkProcessor");
        o.i(authLinkProcessor, "authLinkProcessor");
        o.i(loginLinkProcessor, "loginLinkProcessor");
        o.i(adUnitLinkProcessor, "adUnitLinkProcessor");
        o.i(realtyLinkProcessor, "realtyLinkProcessor");
        o.i(searchFocusLinkProcessor, "searchFocusLinkProcessor");
        o.i(paymentLinkProcessor, "paymentLinkProcessor");
        o.i(listingsDetailsProcessors, "listingsDetailsProcessors");
        o.i(commercialListingDetailsProcessor, "commercialListingDetailsProcessor");
        o.i(categoriesProcessor, "categoriesProcessor");
        this.f37778a = context;
        this.f37779b = generalLinksProcessor;
        this.f37780c = offerDetailsLinkProcessor;
        this.f37781d = offersWithArgsLinkProcessor;
        this.f37782e = bannerLinkProcessor;
        this.f37783f = followersLinkProcessor;
        this.f37784g = postListingLinkProcessor;
        this.f37785h = myFavouritesLinkProcessor;
        this.f37786i = wantedItemsLinkProcessor;
        this.f37787j = myListingsLinkProcessor;
        this.f37788k = inAppBrowserLinkProcessor;
        this.f37789l = virtualTourLinkProcessor;
        this.f37790m = authLinkProcessor;
        this.f37791n = loginLinkProcessor;
        this.f37792o = adUnitLinkProcessor;
        this.f37793p = realtyLinkProcessor;
        this.f37794q = searchFocusLinkProcessor;
        this.f37795r = paymentLinkProcessor;
        this.f37796s = listingsDetailsProcessors;
        this.f37797t = commercialListingDetailsProcessor;
        this.f37798u = categoriesProcessor;
    }

    public final Object a(String str, uf.c cVar, uf.b bVar, Intent intent, zz.a<? super p> aVar) {
        Object f11;
        Object f12;
        Object f13;
        Object f14;
        Object f15;
        Object f16;
        Object f17;
        Object f18;
        Object f19;
        Object f21;
        Object f22;
        Object f23;
        Object f24;
        Object f25;
        Object f26;
        Object f27;
        Object f28;
        Object f29;
        Object f31;
        Object f32;
        if (d.f37799a.a(str, this.f37778a)) {
            Object a11 = this.f37779b.get().a(intent, str, cVar, bVar, aVar);
            f32 = kotlin.coroutines.intrinsics.b.f();
            if (a11 == f32) {
                return a11;
            }
            return p.f75480a;
        } else if (MyFavouritesLinkProcessor.f37724b.a(str, this.f37778a)) {
            Object a12 = this.f37785h.get().a(intent, str, cVar, bVar, aVar);
            f31 = kotlin.coroutines.intrinsics.b.f();
            if (a12 == f31) {
                return a12;
            }
            return p.f75480a;
        } else if (WantedItemsLinkProcessor.f37766b.a(str, this.f37778a)) {
            x10.a.b("navigateToWantedItems:: checkUserLoggedInThen:: viewModel.isUserLogin:: ", new Object[0]);
            Object a13 = this.f37786i.get().a(intent, str, cVar, bVar, aVar);
            f29 = kotlin.coroutines.intrinsics.b.f();
            if (a13 == f29) {
                return a13;
            }
            return p.f75480a;
        } else if (OfferDetailsLinkProcessor.f37740c.a(str, this.f37778a)) {
            Object a14 = this.f37780c.get().a(intent, str, cVar, bVar, aVar);
            f28 = kotlin.coroutines.intrinsics.b.f();
            if (a14 == f28) {
                return a14;
            }
            return p.f75480a;
        } else if (f.f37803b.a(str, this.f37778a)) {
            Object a15 = this.f37781d.get().a(intent, str, cVar, bVar, aVar);
            f27 = kotlin.coroutines.intrinsics.b.f();
            if (a15 == f27) {
                return a15;
            }
            return p.f75480a;
        } else if (BannerLinkProcessor.f37665c.a(str, this.f37778a)) {
            Object a16 = this.f37782e.get().a(intent, str, cVar, bVar, aVar);
            f26 = kotlin.coroutines.intrinsics.b.f();
            if (a16 == f26) {
                return a16;
            }
            return p.f75480a;
        } else if (FollowersLinkProcessor.f37694c.a(str, this.f37778a)) {
            Object a17 = this.f37783f.get().a(intent, str, cVar, bVar, aVar);
            f25 = kotlin.coroutines.intrinsics.b.f();
            if (a17 == f25) {
                return a17;
            }
            return p.f75480a;
        } else if (g.f37806a.a(str, this.f37778a)) {
            Object a18 = this.f37784g.get().a(intent, str, cVar, bVar, aVar);
            f24 = kotlin.coroutines.intrinsics.b.f();
            if (a18 == f24) {
                return a18;
            }
            return p.f75480a;
        } else if (ListingsDetailsProcessors.f37705c.a(str, this.f37778a)) {
            Object b11 = this.f37796s.get().b(intent, str, cVar, bVar, aVar);
            f23 = kotlin.coroutines.intrinsics.b.f();
            if (b11 == f23) {
                return b11;
            }
            return p.f75480a;
        } else if (CommercialListingDetailsProcessor.f37683c.a(str, this.f37778a)) {
            Object b12 = this.f37797t.get().b(intent, str, cVar, bVar, aVar);
            f22 = kotlin.coroutines.intrinsics.b.f();
            if (b12 == f22) {
                return b12;
            }
            return p.f75480a;
        } else if (e.f37800b.a(str, this.f37778a)) {
            Object a19 = this.f37788k.get().a(intent, str, cVar, bVar, aVar);
            f21 = kotlin.coroutines.intrinsics.b.f();
            if (a19 == f21) {
                return a19;
            }
            return p.f75480a;
        } else if (j.f37809b.a(str, this.f37778a)) {
            Object a21 = this.f37789l.get().a(intent, str, cVar, bVar, aVar);
            f19 = kotlin.coroutines.intrinsics.b.f();
            if (a21 == f19) {
                return a21;
            }
            return p.f75480a;
        } else if (RegistrationLinkProcessor.f37759b.a(str, this.f37778a)) {
            Object a22 = this.f37790m.get().a(intent, str, cVar, bVar, aVar);
            f18 = kotlin.coroutines.intrinsics.b.f();
            if (a22 == f18) {
                return a22;
            }
            return p.f75480a;
        } else if (LoginLinkLinkProcessor.f37717b.a(str, this.f37778a)) {
            Object a23 = this.f37791n.get().a(intent, str, cVar, bVar, aVar);
            f17 = kotlin.coroutines.intrinsics.b.f();
            if (a23 == f17) {
                return a23;
            }
            return p.f75480a;
        } else if (a.f37774a.a(str, this.f37778a)) {
            Object a24 = this.f37792o.get().a(intent, str, cVar, bVar, aVar);
            f16 = kotlin.coroutines.intrinsics.b.f();
            if (a24 == f16) {
                return a24;
            }
            return p.f75480a;
        } else if (h.f37807a.a(str, this.f37778a)) {
            Object a25 = this.f37793p.get().a(intent, str, cVar, bVar, aVar);
            f15 = kotlin.coroutines.intrinsics.b.f();
            if (a25 == f15) {
                return a25;
            }
            return p.f75480a;
        } else if (i.f37808a.a(str, this.f37778a)) {
            Object a26 = this.f37794q.get().a(intent, str, cVar, bVar, aVar);
            f14 = kotlin.coroutines.intrinsics.b.f();
            if (a26 == f14) {
                return a26;
            }
            return p.f75480a;
        } else if (PaymentLinkProcessor.f37750c.a(str, this.f37778a)) {
            Object a27 = this.f37795r.get().a(intent, str, cVar, bVar, aVar);
            f13 = kotlin.coroutines.intrinsics.b.f();
            if (a27 == f13) {
                return a27;
            }
            return p.f75480a;
        } else if (MyListingsLinkProcessor.f37732b.a(str, this.f37778a)) {
            Object a28 = this.f37787j.get().a(intent, str, cVar, bVar, aVar);
            f12 = kotlin.coroutines.intrinsics.b.f();
            if (a28 == f12) {
                return a28;
            }
            return p.f75480a;
        } else if (CategoriesLinkProcessor.f37675b.a(str, this.f37778a)) {
            Object a29 = this.f37798u.get().a(intent, str, cVar, bVar, aVar);
            f11 = kotlin.coroutines.intrinsics.b.f();
            if (a29 == f11) {
                return a29;
            }
            return p.f75480a;
        } else {
            bVar.a0();
            return p.f75480a;
        }
    }
}
