package com.forsale.app.features.categories.listingdetails.buyerscreen.interactors;

import com.forsale.app.datalayer.network.services.AbuseReportsService;
import jj.b;
import kotlin.jvm.internal.o;
import kotlin.text.StringsKt__StringsKt;
/* compiled from: ReportAbuseInteractor.kt */
/* loaded from: classes2.dex */
public final class ReportAbuseInteractor {

    /* renamed from: a  reason: collision with root package name */
    private final AbuseReportsService f26013a;

    /* renamed from: b  reason: collision with root package name */
    private final b f26014b;

    public ReportAbuseInteractor(AbuseReportsService abuseReportsService, b prefs) {
        o.i(abuseReportsService, "abuseReportsService");
        o.i(prefs, "prefs");
        this.f26013a = abuseReportsService;
        this.f26014b = prefs;
    }

    private final String a(String str, String str2) {
        boolean z11;
        CharSequence Z0;
        boolean z12 = false;
        if (str != null && str.length() != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            return str2;
        }
        if (str2 == null || str2.length() == 0) {
            z12 = true;
        }
        if (!z12) {
            Z0 = StringsKt__StringsKt.Z0(str2);
            return str + "-" + Z0.toString();
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r7, java.lang.String r8, java.lang.String r9, zz.a<? super java.lang.Boolean> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.ReportAbuseInteractor$reportListing$1
            if (r0 == 0) goto L13
            r0 = r10
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.ReportAbuseInteractor$reportListing$1 r0 = (com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.ReportAbuseInteractor$reportListing$1) r0
            int r1 = r0.f26020f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26020f = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.ReportAbuseInteractor$reportListing$1 r0 = new com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.ReportAbuseInteractor$reportListing$1
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.f26018d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f26020f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L43
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.f.b(r10)
            goto L78
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            int r7 = r0.f26017c
            java.lang.Object r8 = r0.f26016b
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r0.f26015a
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.ReportAbuseInteractor r9 = (com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.ReportAbuseInteractor) r9
            kotlin.f.b(r10)
            goto L62
        L43:
            kotlin.f.b(r10)
            java.lang.String r8 = r6.a(r8, r9)
            if (r8 == 0) goto L86
            jj.b r9 = r6.f26014b
            kj.b r9 = r9.c()
            r0.f26015a = r6
            r0.f26016b = r8
            r0.f26017c = r7
            r0.f26020f = r4
            java.lang.Object r10 = r9.a(r0)
            if (r10 != r1) goto L61
            return r1
        L61:
            r9 = r6
        L62:
            java.lang.String r10 = (java.lang.String) r10
            com.forsale.app.datalayer.network.requestsbodies.ReportAbuseBody r2 = new com.forsale.app.datalayer.network.requestsbodies.ReportAbuseBody
            r2.<init>(r10, r7, r8)
            com.forsale.app.datalayer.network.services.AbuseReportsService r7 = r9.f26013a
            r0.f26015a = r5
            r0.f26016b = r5
            r0.f26020f = r3
            java.lang.Object r10 = r7.reportAbuse(r2, r0)
            if (r10 != r1) goto L78
            return r1
        L78:
            com.forsale.app.datalayer.network.entities.ReportAbuseEntity r10 = (com.forsale.app.datalayer.network.entities.ReportAbuseEntity) r10
            int r7 = r10.getReported()
            boolean r7 = com.forsale.app.utils.TypeExtensionsKt.h0(r7)
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.a.a(r7)
        L86:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.ReportAbuseInteractor.b(int, java.lang.String, java.lang.String, zz.a):java.lang.Object");
    }
}
