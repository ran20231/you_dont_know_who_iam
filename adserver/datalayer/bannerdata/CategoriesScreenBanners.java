package com.forsale.adserver.datalayer.bannerdata;

import java.util.List;
import kotlin.jvm.internal.o;
/* compiled from: CategoriesScreenBanners.kt */
/* loaded from: classes2.dex */
public class CategoriesScreenBanners extends k {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoriesScreenBanners(y8.a bannerRepo) {
        super(bannerRepo);
        o.i(bannerRepo, "bannerRepo");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object e(com.forsale.adserver.datalayer.bannerdata.CategoriesScreenBanners r4, int r5, zz.a<? super java.util.List<g9.b>> r6) {
        /*
            boolean r0 = r6 instanceof com.forsale.adserver.datalayer.bannerdata.CategoriesScreenBanners$bannersList$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.adserver.datalayer.bannerdata.CategoriesScreenBanners$bannersList$1 r0 = (com.forsale.adserver.datalayer.bannerdata.CategoriesScreenBanners$bannersList$1) r0
            int r1 = r0.f20647d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20647d = r1
            goto L18
        L13:
            com.forsale.adserver.datalayer.bannerdata.CategoriesScreenBanners$bannersList$1 r0 = new com.forsale.adserver.datalayer.bannerdata.CategoriesScreenBanners$bannersList$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f20645b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f20647d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f20644a
            com.forsale.adserver.datalayer.bannerdata.CategoriesScreenBanners r4 = (com.forsale.adserver.datalayer.bannerdata.CategoriesScreenBanners) r4
            kotlin.f.b(r6)
            goto L47
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.f.b(r6)
            y8.a r6 = r4.d()
            r0.f20644a = r4
            r0.f20647d = r3
            java.lang.Object r6 = r6.c(r5, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            java.util.List r6 = (java.util.List) r6
            com.forsale.adserver.datalayer.bannerdata.ScreenBannerTypes r4 = r4.f()
            if (r4 == 0) goto L7c
            java.lang.String r4 = r4.getType()
            if (r4 == 0) goto L7c
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r6 = r6.iterator()
        L60:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L7b
            java.lang.Object r0 = r6.next()
            r1 = r0
            g9.b r1 = (g9.b) r1
            java.lang.String r1 = r1.a()
            boolean r1 = kotlin.jvm.internal.o.d(r1, r4)
            if (r1 == 0) goto L60
            r5.add(r0)
            goto L60
        L7b:
            r6 = r5
        L7c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.adserver.datalayer.bannerdata.CategoriesScreenBanners.e(com.forsale.adserver.datalayer.bannerdata.CategoriesScreenBanners, int, zz.a):java.lang.Object");
    }

    @Override // v8.b
    public Object a(int i11, zz.a<? super List<g9.b>> aVar) {
        return e(this, i11, aVar);
    }

    public ScreenBannerTypes f() {
        return null;
    }
}
