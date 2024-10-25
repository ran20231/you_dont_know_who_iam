package com.forsale.app.routing.deeplinks.processors;

import android.content.Context;
import com.forsale.app.datalayer.network.services.ListingsService;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.text.Regex;
import t9.y0;
/* compiled from: ListingsDetailsProcessors.kt */
/* loaded from: classes2.dex */
public final class ListingsDetailsProcessors {

    /* renamed from: c  reason: collision with root package name */
    public static final a f37705c = new a(null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f37706d = 8;

    /* renamed from: a  reason: collision with root package name */
    private final Context f37707a;

    /* renamed from: b  reason: collision with root package name */
    private final ListingsService f37708b;

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
            String string = context.getString(y0.f70599o2);
            o.h(string, "getString(...)");
            return wf.a.b(deeplink, new Regex(string));
        }
    }

    public ListingsDetailsProcessors(Context context, ListingsService listingsService) {
        o.i(context, "context");
        o.i(listingsService, "listingsService");
        this.f37707a = context;
        this.f37708b = listingsService;
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
            boolean r0 = r14 instanceof com.forsale.app.routing.deeplinks.processors.ListingsDetailsProcessors$loadAdv$1
            if (r0 == 0) goto L13
            r0 = r14
            com.forsale.app.routing.deeplinks.processors.ListingsDetailsProcessors$loadAdv$1 r0 = (com.forsale.app.routing.deeplinks.processors.ListingsDetailsProcessors$loadAdv$1) r0
            int r1 = r0.f37716c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37716c = r1
            goto L18
        L13:
            com.forsale.app.routing.deeplinks.processors.ListingsDetailsProcessors$loadAdv$1 r0 = new com.forsale.app.routing.deeplinks.processors.ListingsDetailsProcessors$loadAdv$1
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.f37714a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f37716c
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
            com.forsale.app.datalayer.network.services.ListingsService r14 = r12.f37708b     // Catch: java.lang.Exception -> L7b
            com.forsale.app.datalayer.network.requestsbodies.GetListingDetailsBody$Companion r6 = com.forsale.app.datalayer.network.requestsbodies.GetListingDetailsBody.Companion     // Catch: java.lang.Exception -> L7b
            com.forsale.app.datalayer.network.requestsbodies.ListingDetailsType$Slug r7 = new com.forsale.app.datalayer.network.requestsbodies.ListingDetailsType$Slug     // Catch: java.lang.Exception -> L7b
            r7.<init>(r13)     // Catch: java.lang.Exception -> L7b
            com.forsale.app.utils.LocaleManager r13 = com.forsale.app.utils.LocaleManager.f39597a     // Catch: java.lang.Exception -> L7b
            com.forsale.app.utils.Languages r8 = r13.g()     // Catch: java.lang.Exception -> L7b
            r9 = 0
            r10 = 4
            r11 = 0
            com.forsale.app.datalayer.network.requestsbodies.GetListingDetailsBody r13 = com.forsale.app.datalayer.network.requestsbodies.GetListingDetailsBody.Companion.createListingDetails$default(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L7b
            r0.f37716c = r5     // Catch: java.lang.Exception -> L7b
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
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.routing.deeplinks.processors.ListingsDetailsProcessors.c(java.lang.String, zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(android.content.Intent r4, java.lang.String r5, uf.c r6, uf.b r7, zz.a<? super wz.p> r8) {
        /*
            r3 = this;
            boolean r4 = r8 instanceof com.forsale.app.routing.deeplinks.processors.ListingsDetailsProcessors$execute$1
            if (r4 == 0) goto L13
            r4 = r8
            com.forsale.app.routing.deeplinks.processors.ListingsDetailsProcessors$execute$1 r4 = (com.forsale.app.routing.deeplinks.processors.ListingsDetailsProcessors$execute$1) r4
            int r6 = r4.f37713e
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r6 & r0
            if (r1 == 0) goto L13
            int r6 = r6 - r0
            r4.f37713e = r6
            goto L18
        L13:
            com.forsale.app.routing.deeplinks.processors.ListingsDetailsProcessors$execute$1 r4 = new com.forsale.app.routing.deeplinks.processors.ListingsDetailsProcessors$execute$1
            r4.<init>(r3, r8)
        L18:
            java.lang.Object r6 = r4.f37711c
            java.lang.Object r8 = kotlin.coroutines.intrinsics.a.f()
            int r0 = r4.f37713e
            r1 = 1
            if (r0 == 0) goto L3a
            if (r0 != r1) goto L32
            java.lang.Object r5 = r4.f37710b
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r4.f37709a
            r7 = r4
            uf.b r7 = (uf.b) r7
            kotlin.f.b(r6)
            goto L8d
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3a:
            kotlin.f.b(r6)
            android.content.Context r6 = r3.f37707a
            int r0 = t9.y0.f70730w2
            java.lang.String r6 = r6.getString(r0)
            java.lang.String r0 = "getString(...)"
            kotlin.jvm.internal.o.h(r6, r0)
            android.os.Bundle r6 = wf.a.a(r6, r5)
            if (r6 != 0) goto L5f
            android.content.Context r6 = r3.f37707a
            int r2 = t9.y0.f70362a2
            java.lang.String r6 = r6.getString(r2)
            kotlin.jvm.internal.o.h(r6, r0)
            android.os.Bundle r6 = wf.a.a(r6, r5)
        L5f:
            r5 = 0
            if (r6 == 0) goto L69
            java.lang.String r0 = "detailsSlug"
            java.lang.String r0 = r6.getString(r0)
            goto L6a
        L69:
            r0 = r5
        L6a:
            if (r6 == 0) goto L72
            java.lang.String r5 = "advType"
            java.lang.String r5 = r6.getString(r5)
        L72:
            if (r0 == 0) goto L99
            com.forsale.app.datalayer.network.responses.listingdetails.ItemStatus r6 = com.forsale.app.datalayer.network.responses.listingdetails.ItemStatus.COMMERCIAL
            java.lang.String r6 = r6.getValue()
            boolean r5 = kotlin.jvm.internal.o.d(r5, r6)
            if (r5 == 0) goto L96
            r4.f37709a = r7
            r4.f37710b = r0
            r4.f37713e = r1
            java.lang.Object r6 = r3.c(r0, r4)
            if (r6 != r8) goto L8d
            return r8
        L8d:
            com.forsale.adserver.view.models.AdsModel r6 = (com.forsale.adserver.view.models.AdsModel) r6
            if (r6 == 0) goto L99
            r4 = 0
            r7.f(r6, r4)
            goto L99
        L96:
            r7.J(r0)
        L99:
            wz.p r4 = wz.p.f75480a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.routing.deeplinks.processors.ListingsDetailsProcessors.b(android.content.Intent, java.lang.String, uf.c, uf.b, zz.a):java.lang.Object");
    }
}
