package com.forsale.adserver.datalayer.bannerdata;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
/* compiled from: createBanner.kt */
/* loaded from: classes2.dex */
public final class BannerFactory {

    /* renamed from: a  reason: collision with root package name */
    private final v8.c f20628a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<g9.b> f20629b;

    public BannerFactory(v8.c screenToBannerMapper) {
        o.i(screenToBannerMapper, "screenToBannerMapper");
        this.f20628a = screenToBannerMapper;
        this.f20629b = new ArrayList<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r8, i9.a r9, zz.a<? super java.lang.Integer> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.forsale.adserver.datalayer.bannerdata.BannerFactory$bannerCount$1
            if (r0 == 0) goto L13
            r0 = r10
            com.forsale.adserver.datalayer.bannerdata.BannerFactory$bannerCount$1 r0 = (com.forsale.adserver.datalayer.bannerdata.BannerFactory$bannerCount$1) r0
            int r1 = r0.f20632c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20632c = r1
            goto L18
        L13:
            com.forsale.adserver.datalayer.bannerdata.BannerFactory$bannerCount$1 r0 = new com.forsale.adserver.datalayer.bannerdata.BannerFactory$bannerCount$1
            r0.<init>(r7, r10)
        L18:
            r6 = r0
            java.lang.Object r10 = r6.f20630a
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r6.f20632c
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            kotlin.f.b(r10)
            goto L4c
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            kotlin.f.b(r10)
            com.forsale.adserver.datalayer.bannerdata.Screens r3 = r9.c()
            com.forsale.adserver.datalayer.bannerdata.ScreenBannerTypes r4 = r9.a()
            java.lang.Integer r5 = r9.b()
            r6.f20632c = r2
            r1 = r7
            r2 = r8
            java.lang.Object r10 = r1.e(r2, r3, r4, r5, r6)
            if (r10 != r0) goto L4c
            return r0
        L4c:
            java.util.List r10 = (java.util.List) r10
            int r8 = r10.size()
            java.lang.Integer r8 = kotlin.coroutines.jvm.internal.a.d(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.adserver.datalayer.bannerdata.BannerFactory.a(int, i9.a, zz.a):java.lang.Object");
    }

    public final void b() {
        this.f20629b.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(int r6, i9.a r7, zz.a<? super java.lang.Integer> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.forsale.adserver.datalayer.bannerdata.BannerFactory$landingNotViewedCount$1
            if (r0 == 0) goto L13
            r0 = r8
            com.forsale.adserver.datalayer.bannerdata.BannerFactory$landingNotViewedCount$1 r0 = (com.forsale.adserver.datalayer.bannerdata.BannerFactory$landingNotViewedCount$1) r0
            int r1 = r0.f20637e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20637e = r1
            goto L18
        L13:
            com.forsale.adserver.datalayer.bannerdata.BannerFactory$landingNotViewedCount$1 r0 = new com.forsale.adserver.datalayer.bannerdata.BannerFactory$landingNotViewedCount$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f20635c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f20637e
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r6 = r0.f20634b
            r7 = r6
            i9.a r7 = (i9.a) r7
            java.lang.Object r6 = r0.f20633a
            com.forsale.adserver.datalayer.bannerdata.BannerFactory r6 = (com.forsale.adserver.datalayer.bannerdata.BannerFactory) r6
            kotlin.f.b(r8)
            goto L59
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            kotlin.f.b(r8)
            v8.c r8 = r5.f20628a
            com.forsale.adserver.datalayer.bannerdata.Screens r2 = r7.c()
            com.forsale.adserver.datalayer.bannerdata.ScreenBannerTypes r4 = r7.a()
            com.forsale.adserver.datalayer.bannerdata.k r8 = r8.c(r2, r4)
            r0.f20633a = r5
            r0.f20634b = r7
            r0.f20637e = r3
            java.lang.Object r8 = r8.a(r6, r0)
            if (r8 != r1) goto L58
            return r1
        L58:
            r6 = r5
        L59:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
        L64:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L83
            java.lang.Object r1 = r8.next()
            r2 = r1
            g9.b r2 = (g9.b) r2
            java.lang.Integer r2 = r2.f()
            java.lang.Integer r3 = r7.b()
            boolean r2 = kotlin.jvm.internal.o.d(r2, r3)
            if (r2 == 0) goto L64
            r0.add(r1)
            goto L64
        L83:
            java.util.ArrayList<g9.b> r6 = r6.f20629b
            java.util.Set r6 = kotlin.collections.p.N0(r0, r6)
            int r6 = r6.size()
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.a.d(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.adserver.datalayer.bannerdata.BannerFactory.c(int, i9.a, zz.a):java.lang.Object");
    }

    public final Object d(int i11, int i12, Screens screens, zz.a<? super g9.b> aVar) {
        return this.f20628a.a(screens).b(i11, i12, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(int r7, com.forsale.adserver.datalayer.bannerdata.Screens r8, com.forsale.adserver.datalayer.bannerdata.ScreenBannerTypes r9, java.lang.Integer r10, zz.a<? super java.util.List<g9.b>> r11) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.adserver.datalayer.bannerdata.BannerFactory.e(int, com.forsale.adserver.datalayer.bannerdata.Screens, com.forsale.adserver.datalayer.bannerdata.ScreenBannerTypes, java.lang.Integer, zz.a):java.lang.Object");
    }

    public final List<g9.b> f() {
        return this.f20629b;
    }
}
