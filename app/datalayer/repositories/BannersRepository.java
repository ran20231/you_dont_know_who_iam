package com.forsale.app.datalayer.repositories;

import com.forsale.adserver.datalayer.bannerdata.BannerFactory;
import kotlin.jvm.internal.o;
/* compiled from: BannersRepository.kt */
/* loaded from: classes2.dex */
public final class BannersRepository {
    public static final int $stable = 8;
    private final BannerFactory bannerFactory;
    private final RegionsRepository regionsRepository;

    public BannersRepository(RegionsRepository regionsRepository, BannerFactory bannerFactory) {
        o.i(regionsRepository, "regionsRepository");
        o.i(bannerFactory, "bannerFactory");
        this.regionsRepository = regionsRepository;
        this.bannerFactory = bannerFactory;
    }

    public final void clearViewedLandingBanners() {
        this.bannerFactory.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090 A[PHI: r12 
      PHI: (r12v8 java.lang.Object) = (r12v7 java.lang.Object), (r12v1 java.lang.Object) binds: [B:25:0x008d, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getCategoryBannersCount(com.forsale.app.datalayer.database.CategoryEntity r9, com.forsale.adserver.datalayer.bannerdata.Screens r10, com.forsale.adserver.datalayer.bannerdata.ScreenBannerTypes r11, zz.a<? super java.lang.Integer> r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof com.forsale.app.datalayer.repositories.BannersRepository$getCategoryBannersCount$1
            if (r0 == 0) goto L13
            r0 = r12
            com.forsale.app.datalayer.repositories.BannersRepository$getCategoryBannersCount$1 r0 = (com.forsale.app.datalayer.repositories.BannersRepository$getCategoryBannersCount$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.BannersRepository$getCategoryBannersCount$1 r0 = new com.forsale.app.datalayer.repositories.BannersRepository$getCategoryBannersCount$1
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L49
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r12)
            goto L90
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            java.lang.Object r9 = r0.L$3
            com.forsale.adserver.datalayer.bannerdata.BannerFactory r9 = (com.forsale.adserver.datalayer.bannerdata.BannerFactory) r9
            java.lang.Object r10 = r0.L$2
            r11 = r10
            com.forsale.adserver.datalayer.bannerdata.ScreenBannerTypes r11 = (com.forsale.adserver.datalayer.bannerdata.ScreenBannerTypes) r11
            java.lang.Object r10 = r0.L$1
            com.forsale.adserver.datalayer.bannerdata.Screens r10 = (com.forsale.adserver.datalayer.bannerdata.Screens) r10
            java.lang.Object r2 = r0.L$0
            com.forsale.app.datalayer.database.CategoryEntity r2 = (com.forsale.app.datalayer.database.CategoryEntity) r2
            kotlin.f.b(r12)
            goto L65
        L49:
            kotlin.f.b(r12)
            com.forsale.adserver.datalayer.bannerdata.BannerFactory r12 = r8.bannerFactory
            com.forsale.app.datalayer.repositories.RegionsRepository r2 = r8.regionsRepository
            r0.L$0 = r9
            r0.L$1 = r10
            r0.L$2 = r11
            r0.L$3 = r12
            r0.label = r4
            java.lang.Object r2 = r2.getCurrentRegionId(r0)
            if (r2 != r1) goto L61
            return r1
        L61:
            r7 = r2
            r2 = r9
            r9 = r12
            r12 = r7
        L65:
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            i9.a r4 = new i9.a
            r5 = 0
            if (r2 == 0) goto L79
            int r2 = r2.getId()
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.a.d(r2)
            goto L7a
        L79:
            r2 = r5
        L7a:
            com.forsale.adserver.datalayer.bannerdata.DisplayOrder r6 = com.forsale.adserver.datalayer.bannerdata.DisplayOrder.ASC
            r4.<init>(r10, r2, r11, r6)
            r0.L$0 = r5
            r0.L$1 = r5
            r0.L$2 = r5
            r0.L$3 = r5
            r0.label = r3
            java.lang.Object r12 = r9.a(r12, r4, r0)
            if (r12 != r1) goto L90
            return r1
        L90:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.BannersRepository.getCategoryBannersCount(com.forsale.app.datalayer.database.CategoryEntity, com.forsale.adserver.datalayer.bannerdata.Screens, com.forsale.adserver.datalayer.bannerdata.ScreenBannerTypes, zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object isCategoryScreenHasLandingBanners(com.forsale.app.datalayer.database.CategoryEntity r11, com.forsale.adserver.datalayer.bannerdata.Screens r12, zz.a<? super java.lang.Boolean> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.forsale.app.datalayer.repositories.BannersRepository$isCategoryScreenHasLandingBanners$1
            if (r0 == 0) goto L13
            r0 = r13
            com.forsale.app.datalayer.repositories.BannersRepository$isCategoryScreenHasLandingBanners$1 r0 = (com.forsale.app.datalayer.repositories.BannersRepository$isCategoryScreenHasLandingBanners$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.BannersRepository$isCategoryScreenHasLandingBanners$1 r0 = new com.forsale.app.datalayer.repositories.BannersRepository$isCategoryScreenHasLandingBanners$1
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r13)
            goto L89
        L2c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L34:
            java.lang.Object r11 = r0.L$2
            com.forsale.adserver.datalayer.bannerdata.BannerFactory r11 = (com.forsale.adserver.datalayer.bannerdata.BannerFactory) r11
            java.lang.Object r12 = r0.L$1
            com.forsale.adserver.datalayer.bannerdata.Screens r12 = (com.forsale.adserver.datalayer.bannerdata.Screens) r12
            java.lang.Object r2 = r0.L$0
            com.forsale.app.datalayer.database.CategoryEntity r2 = (com.forsale.app.datalayer.database.CategoryEntity) r2
            kotlin.f.b(r13)
            goto L5e
        L44:
            kotlin.f.b(r13)
            com.forsale.adserver.datalayer.bannerdata.BannerFactory r13 = r10.bannerFactory
            com.forsale.app.datalayer.repositories.RegionsRepository r2 = r10.regionsRepository
            r0.L$0 = r11
            r0.L$1 = r12
            r0.L$2 = r13
            r0.label = r4
            java.lang.Object r2 = r2.getCurrentRegionId(r0)
            if (r2 != r1) goto L5a
            return r1
        L5a:
            r9 = r2
            r2 = r11
            r11 = r13
            r13 = r9
        L5e:
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            i9.a r5 = new i9.a
            r6 = 0
            if (r2 == 0) goto L72
            int r2 = r2.getId()
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.a.d(r2)
            goto L73
        L72:
            r2 = r6
        L73:
            com.forsale.adserver.datalayer.bannerdata.ScreenBannerTypes r7 = com.forsale.adserver.datalayer.bannerdata.ScreenBannerTypes.LANDING_PAGE
            com.forsale.adserver.datalayer.bannerdata.DisplayOrder r8 = com.forsale.adserver.datalayer.bannerdata.DisplayOrder.ASC
            r5.<init>(r12, r2, r7, r8)
            r0.L$0 = r6
            r0.L$1 = r6
            r0.L$2 = r6
            r0.label = r3
            java.lang.Object r13 = r11.c(r13, r5, r0)
            if (r13 != r1) goto L89
            return r1
        L89:
            java.lang.Number r13 = (java.lang.Number) r13
            int r11 = r13.intValue()
            if (r11 <= 0) goto L92
            goto L93
        L92:
            r4 = 0
        L93:
            java.lang.Boolean r11 = kotlin.coroutines.jvm.internal.a.a(r4)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.BannersRepository.isCategoryScreenHasLandingBanners(com.forsale.app.datalayer.database.CategoryEntity, com.forsale.adserver.datalayer.bannerdata.Screens, zz.a):java.lang.Object");
    }

    public final int loadedLandingBanner() {
        return this.bannerFactory.f().size();
    }
}
