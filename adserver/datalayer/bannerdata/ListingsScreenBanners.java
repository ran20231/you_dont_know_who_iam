package com.forsale.adserver.datalayer.bannerdata;

import java.util.List;
import kotlin.jvm.internal.o;
/* compiled from: ListingsScreenBanners.kt */
/* loaded from: classes2.dex */
public class ListingsScreenBanners extends k {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingsScreenBanners(y8.a bannerRepo) {
        super(bannerRepo);
        o.i(bannerRepo, "bannerRepo");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object e(com.forsale.adserver.datalayer.bannerdata.ListingsScreenBanners r5, int r6, zz.a<? super java.util.List<g9.b>> r7) {
        /*
            boolean r0 = r7 instanceof com.forsale.adserver.datalayer.bannerdata.ListingsScreenBanners$bannersList$1
            if (r0 == 0) goto L13
            r0 = r7
            com.forsale.adserver.datalayer.bannerdata.ListingsScreenBanners$bannersList$1 r0 = (com.forsale.adserver.datalayer.bannerdata.ListingsScreenBanners$bannersList$1) r0
            int r1 = r0.f20664d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20664d = r1
            goto L18
        L13:
            com.forsale.adserver.datalayer.bannerdata.ListingsScreenBanners$bannersList$1 r0 = new com.forsale.adserver.datalayer.bannerdata.ListingsScreenBanners$bannersList$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f20662b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f20664d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f20661a
            com.forsale.adserver.datalayer.bannerdata.ListingsScreenBanners r5 = (com.forsale.adserver.datalayer.bannerdata.ListingsScreenBanners) r5
            kotlin.f.b(r7)
            goto L58
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.f.b(r7)
            com.forsale.adserver.datalayer.bannerdata.ScreenBannerTypes r7 = r5.f()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "type: "
            r2.append(r4)
            r2.append(r7)
            y8.a r7 = r5.d()
            r0.f20661a = r5
            r0.f20664d = r3
            java.lang.Object r7 = r7.d(r6, r0)
            if (r7 != r1) goto L58
            return r1
        L58:
            java.util.List r7 = (java.util.List) r7
            int r6 = r7.size()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "size: "
            r0.append(r1)
            r0.append(r6)
            r6 = r7
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r6.iterator()
        L77:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L98
            java.lang.Object r2 = r1.next()
            r3 = r2
            g9.b r3 = (g9.b) r3
            java.lang.String r3 = r3.a()
            com.forsale.adserver.datalayer.bannerdata.ScreenBannerTypes r4 = com.forsale.adserver.datalayer.bannerdata.ScreenBannerTypes.FIXED_FOOTER
            java.lang.String r4 = r4.getType()
            boolean r3 = kotlin.jvm.internal.o.d(r3, r4)
            if (r3 == 0) goto L77
            r0.add(r2)
            goto L77
        L98:
            int r0 = r0.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "filter: "
            r1.append(r2)
            r1.append(r0)
            com.forsale.adserver.datalayer.bannerdata.ScreenBannerTypes r5 = r5.f()
            if (r5 == 0) goto Ld9
            java.lang.String r5 = r5.getType()
            if (r5 == 0) goto Ld9
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        Lbe:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto Ld9
            java.lang.Object r0 = r6.next()
            r1 = r0
            g9.b r1 = (g9.b) r1
            java.lang.String r1 = r1.a()
            boolean r1 = kotlin.jvm.internal.o.d(r1, r5)
            if (r1 == 0) goto Lbe
            r7.add(r0)
            goto Lbe
        Ld9:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.adserver.datalayer.bannerdata.ListingsScreenBanners.e(com.forsale.adserver.datalayer.bannerdata.ListingsScreenBanners, int, zz.a):java.lang.Object");
    }

    @Override // v8.b
    public Object a(int i11, zz.a<? super List<g9.b>> aVar) {
        return e(this, i11, aVar);
    }

    public ScreenBannerTypes f() {
        return null;
    }
}
