package com.forsale.app.features.postad.bundles;

import com.forsale.app.datalayer.network.services.BundlesAddonsService;
import kotlin.jvm.internal.o;
/* compiled from: BundlesInteractor.kt */
/* loaded from: classes2.dex */
public final class BundlesInteractor {

    /* renamed from: a  reason: collision with root package name */
    private final BundlesAddonsService f34810a;

    public BundlesInteractor(BundlesAddonsService bundlesAddonsService) {
        o.i(bundlesAddonsService, "bundlesAddonsService");
        this.f34810a = bundlesAddonsService;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r5, java.lang.Integer r6, zz.a<? super java.util.List<com.forsale.app.datalayer.network.responses.Bundle>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.forsale.app.features.postad.bundles.BundlesInteractor$invoke$1
            if (r0 == 0) goto L13
            r0 = r7
            com.forsale.app.features.postad.bundles.BundlesInteractor$invoke$1 r0 = (com.forsale.app.features.postad.bundles.BundlesInteractor$invoke$1) r0
            int r1 = r0.f34813c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34813c = r1
            goto L18
        L13:
            com.forsale.app.features.postad.bundles.BundlesInteractor$invoke$1 r0 = new com.forsale.app.features.postad.bundles.BundlesInteractor$invoke$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f34811a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f34813c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r7)
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.f.b(r7)
            com.forsale.app.datalayer.network.services.BundlesAddonsService r7 = r4.f34810a
            com.forsale.app.utils.LocaleManager r2 = com.forsale.app.utils.LocaleManager.f39597a
            java.lang.String r2 = r2.k()
            r0.f34813c = r3
            java.lang.Object r7 = r7.getBundles(r5, r2, r6, r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            com.forsale.app.datalayer.network.responses.BundlesResponse r7 = (com.forsale.app.datalayer.network.responses.BundlesResponse) r7
            java.util.List r5 = r7.getBundles()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.bundles.BundlesInteractor.a(int, java.lang.Integer, zz.a):java.lang.Object");
    }
}
