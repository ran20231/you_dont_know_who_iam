package com.forsale.app.routing.deeplinks.processors;

import android.content.Context;
import com.forsale.app.datalayer.repositories.AnalyticsServerRepository;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.text.Regex;
import t9.y0;
/* compiled from: BannersLinksProcessor.kt */
/* loaded from: classes2.dex */
public final class BannerLinkProcessor {

    /* renamed from: c  reason: collision with root package name */
    public static final a f37665c = new a(null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f37666d = 8;

    /* renamed from: a  reason: collision with root package name */
    private final Context f37667a;

    /* renamed from: b  reason: collision with root package name */
    private final AnalyticsServerRepository f37668b;

    /* compiled from: BannersLinksProcessor.kt */
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
            String string = context.getString(y0.f70430e2);
            o.h(string, "getString(...)");
            return wf.a.b(deeplink, new Regex(string));
        }
    }

    public BannerLinkProcessor(Context context, AnalyticsServerRepository analyticsServerRepository) {
        o.i(context, "context");
        o.i(analyticsServerRepository, "analyticsServerRepository");
        this.f37667a = context;
        this.f37668b = analyticsServerRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(android.content.Intent r4, java.lang.String r5, uf.c r6, uf.b r7, zz.a<? super wz.p> r8) {
        /*
            r3 = this;
            boolean r4 = r8 instanceof com.forsale.app.routing.deeplinks.processors.BannerLinkProcessor$execute$1
            if (r4 == 0) goto L13
            r4 = r8
            com.forsale.app.routing.deeplinks.processors.BannerLinkProcessor$execute$1 r4 = (com.forsale.app.routing.deeplinks.processors.BannerLinkProcessor$execute$1) r4
            int r0 = r4.f37674f
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.f37674f = r0
            goto L18
        L13:
            com.forsale.app.routing.deeplinks.processors.BannerLinkProcessor$execute$1 r4 = new com.forsale.app.routing.deeplinks.processors.BannerLinkProcessor$execute$1
            r4.<init>(r3, r8)
        L18:
            java.lang.Object r8 = r4.f37672d
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r4.f37674f
            r2 = 1
            if (r1 == 0) goto L3d
            if (r1 != r2) goto L35
            int r5 = r4.f37671c
            java.lang.Object r6 = r4.f37670b
            uf.b r6 = (uf.b) r6
            java.lang.Object r4 = r4.f37669a
            uf.c r4 = (uf.c) r4
            kotlin.f.b(r8)
            r7 = r6
            r6 = r4
            goto L8b
        L35:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3d:
            kotlin.f.b(r8)
            android.content.Context r8 = r3.f37667a
            int r1 = t9.y0.f70413d2
            java.lang.String r8 = r8.getString(r1)
            java.lang.String r1 = "getString(...)"
            kotlin.jvm.internal.o.h(r8, r1)
            android.os.Bundle r5 = wf.a.a(r8, r5)
            if (r5 == 0) goto L9d
            java.lang.String r8 = "bannerId"
            java.lang.String r5 = r5.getString(r8)
            if (r5 == 0) goto L63
            kotlin.jvm.internal.o.f(r5)
            java.lang.Integer r5 = kotlin.text.k.k(r5)
            goto L64
        L63:
            r5 = 0
        L64:
            if (r5 == 0) goto L9d
            int r5 = r5.intValue()
            boolean r8 = r6.b()
            if (r8 == 0) goto L8b
            java.lang.String r8 = r6.a()
            if (r8 == 0) goto L8b
            com.forsale.app.datalayer.repositories.AnalyticsServerRepository r8 = r3.f37668b
            java.lang.String r1 = r6.a()
            r4.f37669a = r6
            r4.f37670b = r7
            r4.f37671c = r5
            r4.f37674f = r2
            java.lang.Object r4 = r8.incrementPushMessageClicks(r1, r4)
            if (r4 != r0) goto L8b
            return r0
        L8b:
            java.lang.String r4 = java.lang.String.valueOf(r5)
            boolean r5 = r6.b()
            if (r5 == 0) goto L98
            com.forsale.analytics.commercial.CommercialItemDetailsSource r5 = com.forsale.analytics.commercial.CommercialItemDetailsSource.PUSH_NOTIFICATION
            goto L9a
        L98:
            com.forsale.analytics.commercial.CommercialItemDetailsSource r5 = com.forsale.analytics.commercial.CommercialItemDetailsSource.COMMERCIAL_SCREEN
        L9a:
            r7.Q(r4, r5)
        L9d:
            wz.p r4 = wz.p.f75480a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.routing.deeplinks.processors.BannerLinkProcessor.a(android.content.Intent, java.lang.String, uf.c, uf.b, zz.a):java.lang.Object");
    }
}
