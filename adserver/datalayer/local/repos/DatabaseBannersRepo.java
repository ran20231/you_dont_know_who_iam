package com.forsale.adserver.datalayer.local.repos;

import com.forsale.adserver.datalayer.bannerdata.Screens;
import g9.b;
import java.util.List;
import kotlin.jvm.internal.o;
import y8.a;
/* compiled from: DatabaseBannersRepo.kt */
/* loaded from: classes2.dex */
public final class DatabaseBannersRepo implements a {

    /* renamed from: a  reason: collision with root package name */
    private final x8.a f20679a;

    public DatabaseBannersRepo(x8.a bannersTable) {
        o.i(bannersTable, "bannersTable");
        this.f20679a = bannersTable;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // y8.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(int r5, int r6, zz.a<? super g9.b> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.forsale.adserver.datalayer.local.repos.DatabaseBannersRepo$queryBannerById$1
            if (r0 == 0) goto L13
            r0 = r7
            com.forsale.adserver.datalayer.local.repos.DatabaseBannersRepo$queryBannerById$1 r0 = (com.forsale.adserver.datalayer.local.repos.DatabaseBannersRepo$queryBannerById$1) r0
            int r1 = r0.f20682c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20682c = r1
            goto L18
        L13:
            com.forsale.adserver.datalayer.local.repos.DatabaseBannersRepo$queryBannerById$1 r0 = new com.forsale.adserver.datalayer.local.repos.DatabaseBannersRepo$queryBannerById$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f20680a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f20682c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r7)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.f.b(r7)
            x8.a r7 = r4.f20679a
            r0.f20682c = r3
            java.lang.Object r7 = r7.a(r5, r6, r0)
            if (r7 != r1) goto L3f
            return r1
        L3f:
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r5 = kotlin.collections.p.m0(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.adserver.datalayer.local.repos.DatabaseBannersRepo.a(int, int, zz.a):java.lang.Object");
    }

    @Override // y8.a
    public Object b(int i11, zz.a<? super List<b>> aVar) {
        return this.f20679a.b(i11, aVar);
    }

    @Override // y8.a
    public Object c(int i11, zz.a<? super List<b>> aVar) {
        return this.f20679a.c(i11, Screens.CATEGORIES.getScreenName(), aVar);
    }

    @Override // y8.a
    public Object d(int i11, zz.a<? super List<b>> aVar) {
        return this.f20679a.c(i11, Screens.LISTINGS.getScreenName(), aVar);
    }

    @Override // y8.a
    public Object e(int i11, zz.a<? super List<b>> aVar) {
        return this.f20679a.c(i11, Screens.ITEM_DETAILS.getScreenName(), aVar);
    }

    @Override // y8.a
    public Object f(int i11, zz.a<? super List<b>> aVar) {
        return this.f20679a.c(i11, Screens.HOME_SCREEN.getScreenName(), aVar);
    }
}
