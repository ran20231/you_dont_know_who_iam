package com.forsale.adserver.datalayer.local.repos;

import a9.a;
import com.forsale.adserver.datalayer.network.WebClient;
import kotlin.jvm.internal.o;
/* compiled from: ApiOffersRepo.kt */
/* loaded from: classes2.dex */
public final class ApiOffersRepo {

    /* renamed from: a  reason: collision with root package name */
    private final WebClient f20673a;

    /* renamed from: b  reason: collision with root package name */
    private final a f20674b;

    public ApiOffersRepo(WebClient webClient, a apiOfferMapper) {
        o.i(webClient, "webClient");
        o.i(apiOfferMapper, "apiOfferMapper");
        this.f20673a = webClient;
        this.f20674b = apiOfferMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(int r4, int r5, zz.a<? super g9.d> r6) {
        /*
            r3 = this;
            boolean r4 = r6 instanceof com.forsale.adserver.datalayer.local.repos.ApiOffersRepo$queryOfferWith$1
            if (r4 == 0) goto L13
            r4 = r6
            com.forsale.adserver.datalayer.local.repos.ApiOffersRepo$queryOfferWith$1 r4 = (com.forsale.adserver.datalayer.local.repos.ApiOffersRepo$queryOfferWith$1) r4
            int r0 = r4.f20678d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.f20678d = r0
            goto L18
        L13:
            com.forsale.adserver.datalayer.local.repos.ApiOffersRepo$queryOfferWith$1 r4 = new com.forsale.adserver.datalayer.local.repos.ApiOffersRepo$queryOfferWith$1
            r4.<init>(r3, r6)
        L18:
            java.lang.Object r6 = r4.f20676b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r4.f20678d
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            java.lang.Object r4 = r4.f20675a
            com.forsale.adserver.datalayer.local.repos.ApiOffersRepo r4 = (com.forsale.adserver.datalayer.local.repos.ApiOffersRepo) r4
            kotlin.f.b(r6)
            goto L4a
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.f.b(r6)
            com.forsale.adserver.datalayer.network.WebClient r6 = r3.f20673a
            kotlinx.coroutines.Deferred r5 = r6.s(r5)
            r4.f20675a = r3
            r4.f20678d = r2
            java.lang.Object r6 = r5.await(r4)
            if (r6 != r0) goto L49
            return r0
        L49:
            r4 = r3
        L4a:
            f9.a r6 = (f9.a) r6
            a9.a r4 = r4.f20674b
            g9.d r4 = r4.a(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.adserver.datalayer.local.repos.ApiOffersRepo.a(int, int, zz.a):java.lang.Object");
    }
}
