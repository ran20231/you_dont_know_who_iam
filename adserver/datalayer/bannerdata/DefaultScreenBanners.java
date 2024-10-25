package com.forsale.adserver.datalayer.bannerdata;

import kotlin.jvm.internal.o;
/* compiled from: DefaultScreenBanners.kt */
/* loaded from: classes2.dex */
public final class DefaultScreenBanners extends k {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultScreenBanners(y8.a bannerRepo) {
        super(bannerRepo);
        o.i(bannerRepo, "bannerRepo");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Override // v8.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(int r5, zz.a<? super java.util.List<g9.b>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.forsale.adserver.datalayer.bannerdata.DefaultScreenBanners$bannersList$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.adserver.datalayer.bannerdata.DefaultScreenBanners$bannersList$1 r0 = (com.forsale.adserver.datalayer.bannerdata.DefaultScreenBanners$bannersList$1) r0
            int r1 = r0.f20651d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20651d = r1
            goto L18
        L13:
            com.forsale.adserver.datalayer.bannerdata.DefaultScreenBanners$bannersList$1 r0 = new com.forsale.adserver.datalayer.bannerdata.DefaultScreenBanners$bannersList$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f20649b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f20651d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f20648a
            com.forsale.adserver.datalayer.bannerdata.DefaultScreenBanners r5 = (com.forsale.adserver.datalayer.bannerdata.DefaultScreenBanners) r5
            kotlin.f.b(r6)
            goto L48
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.f.b(r6)
            y8.a r6 = r4.d()
            r0.f20648a = r4
            r0.f20651d = r3
            java.lang.Object r6 = r6.b(r5, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            r5 = r4
        L48:
            java.util.List r6 = (java.util.List) r6
            com.forsale.adserver.datalayer.bannerdata.ScreenBannerTypes r5 = r5.e()
            if (r5 == 0) goto L7d
            java.lang.String r5 = r5.getType()
            if (r5 == 0) goto L7d
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L61:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L7c
            java.lang.Object r1 = r6.next()
            r2 = r1
            g9.b r2 = (g9.b) r2
            java.lang.String r2 = r2.a()
            boolean r2 = kotlin.jvm.internal.o.d(r2, r5)
            if (r2 == 0) goto L61
            r0.add(r1)
            goto L61
        L7c:
            r6 = r0
        L7d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.adserver.datalayer.bannerdata.DefaultScreenBanners.a(int, zz.a):java.lang.Object");
    }

    public ScreenBannerTypes e() {
        return ScreenBannerTypes.LANDING_PAGE;
    }
}
