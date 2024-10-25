package com.forsale.app.routing.deeplinks.processors;

import android.content.Context;
import com.forsale.app.datalayer.network.services.ListingsService;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.text.Regex;
import t9.y0;
/* compiled from: ListingsDetailsProcessors.kt */
/* loaded from: classes2.dex */
public final class CommercialListingDetailsProcessor {

    /* renamed from: c  reason: collision with root package name */
    public static final a f37683c = new a(null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f37684d = 8;

    /* renamed from: a  reason: collision with root package name */
    private final Context f37685a;

    /* renamed from: b  reason: collision with root package name */
    private final ListingsService f37686b;

    /* compiled from: ListingsDetailsProcessors.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(String deeplink, Context context) {
            o.i(deeplink, "deeplink");
            o.i(context, "context");
            String string = context.getString(y0.f70481h2);
            o.h(string, "getString(...)");
            return wf.a.b(deeplink, new Regex(string));
        }
    }

    public CommercialListingDetailsProcessor(Context context, ListingsService listingsService) {
        o.i(context, "context");
        o.i(listingsService, "listingsService");
        this.f37685a = context;
        this.f37686b = listingsService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068 A[Catch: Exception -> 0x007b, TryCatch #0 {Exception -> 0x007b, blocks: (B:11:0x0027, B:19:0x0055, B:26:0x0064, B:28:0x0068, B:30:0x0070, B:32:0x0075, B:31:0x0073, B:16:0x0036), top: B:36:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r13, zz.a<? super com.forsale.adserver.view.models.AdsModel> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.forsale.app.routing.deeplinks.processors.CommercialListingDetailsProcessor$loadAdv$1
            if (r0 == 0) goto L13
            r0 = r14
            com.forsale.app.routing.deeplinks.processors.CommercialListingDetailsProcessor$loadAdv$1 r0 = (com.forsale.app.routing.deeplinks.processors.CommercialListingDetailsProcessor$loadAdv$1) r0
            int r1 = r0.f37693c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37693c = r1
            goto L18
        L13:
            com.forsale.app.routing.deeplinks.processors.CommercialListingDetailsProcessor$loadAdv$1 r0 = new com.forsale.app.routing.deeplinks.processors.CommercialListingDetailsProcessor$loadAdv$1
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.f37691a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f37693c
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L33
            if (r2 != r5) goto L2b
            kotlin.f.b(r14)     // Catch: java.lang.Exception -> L7b
            goto L55
        L2b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L33:
            kotlin.f.b(r14)
            com.forsale.app.datalayer.network.services.ListingsService r14 = r12.f37686b     // Catch: java.lang.Exception -> L7b
            com.forsale.app.datalayer.network.requestsbodies.GetListingDetailsBody$Companion r6 = com.forsale.app.datalayer.network.requestsbodies.GetListingDetailsBody.Companion     // Catch: java.lang.Exception -> L7b
            com.forsale.app.datalayer.network.requestsbodies.ListingDetailsType$Slug r7 = new com.forsale.app.datalayer.network.requestsbodies.ListingDetailsType$Slug     // Catch: java.lang.Exception -> L7b
            r7.<init>(r13)     // Catch: java.lang.Exception -> L7b
            com.forsale.app.utils.LocaleManager r13 = com.forsale.app.utils.LocaleManager.f39597a     // Catch: java.lang.Exception -> L7b
            com.forsale.app.utils.Languages r8 = r13.g()     // Catch: java.lang.Exception -> L7b
            r9 = 0
            r10 = 4
            r11 = 0
            com.forsale.app.datalayer.network.requestsbodies.GetListingDetailsBody r13 = com.forsale.app.datalayer.network.requestsbodies.GetListingDetailsBody.Companion.createListingDetails$default(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L7b
            r0.f37693c = r5     // Catch: java.lang.Exception -> L7b
            java.lang.Object r14 = r14.getListingDetails(r13, r0)     // Catch: java.lang.Exception -> L7b
            if (r14 != r1) goto L55
            return r1
        L55:
            r13 = r14
            com.forsale.app.datalayer.network.responses.ListingItemDetails r13 = (com.forsale.app.datalayer.network.responses.ListingItemDetails) r13     // Catch: java.lang.Exception -> L7b
            int r13 = r13.getId()     // Catch: java.lang.Exception -> L7b
            if (r13 != 0) goto L5f
            goto L60
        L5f:
            r5 = r3
        L60:
            if (r5 != 0) goto L63
            goto L64
        L63:
            r14 = r4
        L64:
            com.forsale.app.datalayer.network.responses.ListingItemDetails r14 = (com.forsale.app.datalayer.network.responses.ListingItemDetails) r14     // Catch: java.lang.Exception -> L7b
            if (r14 == 0) goto L82
            com.forsale.app.datalayer.network.responses.listingdetails.UploadedListingType r13 = r14.getListingType()     // Catch: java.lang.Exception -> L7b
            com.forsale.app.datalayer.network.responses.listingdetails.UploadedListingType r0 = com.forsale.app.datalayer.network.responses.listingdetails.UploadedListingType.BUSINESS_COMMERCIAL     // Catch: java.lang.Exception -> L7b
            if (r13 != r0) goto L73
            com.forsale.adserver.view.models.AdType r13 = com.forsale.adserver.view.models.AdType.BUSINESS_COMMERCIAL     // Catch: java.lang.Exception -> L7b
            goto L75
        L73:
            com.forsale.adserver.view.models.AdType r13 = com.forsale.adserver.view.models.AdType.PIN     // Catch: java.lang.Exception -> L7b
        L75:
            com.forsale.adserver.view.models.AdsModel r13 = r14.toAdsModel(r13)     // Catch: java.lang.Exception -> L7b
            r4 = r13
            goto L82
        L7b:
            java.lang.String r13 = "Adv Not Found"
            java.lang.Object[] r14 = new java.lang.Object[r3]
            x10.a.b(r13, r14)
        L82:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.routing.deeplinks.processors.CommercialListingDetailsProcessor.c(java.lang.String, zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(android.content.Intent r3, java.lang.String r4, uf.c r5, uf.b r6, zz.a<? super wz.p> r7) {
        /*
            r2 = this;
            boolean r3 = r7 instanceof com.forsale.app.routing.deeplinks.processors.CommercialListingDetailsProcessor$execute$1
            if (r3 == 0) goto L13
            r3 = r7
            com.forsale.app.routing.deeplinks.processors.CommercialListingDetailsProcessor$execute$1 r3 = (com.forsale.app.routing.deeplinks.processors.CommercialListingDetailsProcessor$execute$1) r3
            int r5 = r3.f37690d
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r5 & r0
            if (r1 == 0) goto L13
            int r5 = r5 - r0
            r3.f37690d = r5
            goto L18
        L13:
            com.forsale.app.routing.deeplinks.processors.CommercialListingDetailsProcessor$execute$1 r3 = new com.forsale.app.routing.deeplinks.processors.CommercialListingDetailsProcessor$execute$1
            r3.<init>(r2, r7)
        L18:
            java.lang.Object r5 = r3.f37688b
            java.lang.Object r7 = kotlin.coroutines.intrinsics.a.f()
            int r0 = r3.f37690d
            r1 = 1
            if (r0 == 0) goto L36
            if (r0 != r1) goto L2e
            java.lang.Object r3 = r3.f37687a
            r6 = r3
            uf.b r6 = (uf.b) r6
            kotlin.f.b(r5)
            goto L5f
        L2e:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L36:
            kotlin.f.b(r5)
            android.content.Context r5 = r2.f37685a
            int r0 = t9.y0.f70464g2
            java.lang.String r5 = r5.getString(r0)
            java.lang.String r0 = "getString(...)"
            kotlin.jvm.internal.o.h(r5, r0)
            android.os.Bundle r4 = wf.a.a(r5, r4)
            if (r4 == 0) goto L66
            java.lang.String r5 = "listing_slug"
            java.lang.String r4 = r4.getString(r5)
            if (r4 == 0) goto L66
            r3.f37687a = r6
            r3.f37690d = r1
            java.lang.Object r5 = r2.c(r4, r3)
            if (r5 != r7) goto L5f
            return r7
        L5f:
            com.forsale.adserver.view.models.AdsModel r5 = (com.forsale.adserver.view.models.AdsModel) r5
            if (r5 == 0) goto L66
            r6.f(r5, r1)
        L66:
            wz.p r3 = wz.p.f75480a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.routing.deeplinks.processors.CommercialListingDetailsProcessor.b(android.content.Intent, java.lang.String, uf.c, uf.b, zz.a):java.lang.Object");
    }
}
