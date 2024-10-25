package com.forsale.app.routing.deeplinks.mappers;

import android.net.Uri;
import android.net.UrlQuerySanitizer;
import com.forsale.app.datalayer.repositories.AnalyticsRepository;
import com.forsale.app.utils.TypeExtensionsKt;
import java.util.List;
import kotlin.jvm.internal.o;
/* compiled from: DeepLinksCampainParamsMapper.kt */
/* loaded from: classes2.dex */
public final class DeepLinksCampaignParamsMapper {

    /* renamed from: a  reason: collision with root package name */
    private final AnalyticsRepository f37659a;

    public DeepLinksCampaignParamsMapper(AnalyticsRepository analyticsRepository) {
        o.i(analyticsRepository, "analyticsRepository");
        this.f37659a = analyticsRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0014 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<android.net.UrlQuerySanitizer.ParameterValuePair> a(android.net.UrlQuerySanitizer r9) {
        /*
            r8 = this;
            java.util.List r9 = r9.getParameterList()
            java.lang.String r0 = "getParameterList(...)"
            kotlin.jvm.internal.o.h(r9, r0)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r9 = r9.iterator()
        L14:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L61
            java.lang.Object r1 = r9.next()
            r2 = r1
            android.net.UrlQuerySanitizer$ParameterValuePair r2 = (android.net.UrlQuerySanitizer.ParameterValuePair) r2
            java.lang.String r3 = r2.mParameter
            java.lang.String r4 = "mParameter"
            kotlin.jvm.internal.o.h(r3, r4)
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r5)
            java.lang.String r6 = "toLowerCase(...)"
            kotlin.jvm.internal.o.h(r3, r6)
            com.forsale.app.utils.analytics.AnalyticsCampaignParams r7 = com.forsale.app.utils.analytics.AnalyticsCampaignParams.CAMPAIGN_SOURCE
            java.lang.String r7 = r7.getValue()
            boolean r3 = kotlin.jvm.internal.o.d(r3, r7)
            if (r3 != 0) goto L5a
            java.lang.String r2 = r2.mParameter
            kotlin.jvm.internal.o.h(r2, r4)
            java.lang.String r2 = r2.toLowerCase(r5)
            kotlin.jvm.internal.o.h(r2, r6)
            com.forsale.app.utils.analytics.AnalyticsCampaignParams r3 = com.forsale.app.utils.analytics.AnalyticsCampaignParams.GCLID
            java.lang.String r3 = r3.getValue()
            boolean r2 = kotlin.jvm.internal.o.d(r2, r3)
            if (r2 == 0) goto L58
            goto L5a
        L58:
            r2 = 0
            goto L5b
        L5a:
            r2 = 1
        L5b:
            if (r2 == 0) goto L14
            r0.add(r1)
            goto L14
        L61:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.routing.deeplinks.mappers.DeepLinksCampaignParamsMapper.a(android.net.UrlQuerySanitizer):java.util.List");
    }

    private final UrlQuerySanitizer c(Uri uri) {
        UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer(uri.toString());
        urlQuerySanitizer.getParameterList().removeAll(a(urlQuerySanitizer));
        return urlQuerySanitizer;
    }

    private final Uri d(Uri uri) {
        try {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.clearQuery();
            List<UrlQuerySanitizer.ParameterValuePair> parameterList = c(uri).getParameterList();
            o.h(parameterList, "getParameterList(...)");
            for (UrlQuerySanitizer.ParameterValuePair parameterValuePair : parameterList) {
                buildUpon.appendQueryParameter(parameterValuePair.mParameter, parameterValuePair.mValue);
            }
            Uri build = buildUpon.build();
            o.h(build, "build(...)");
            return TypeExtensionsKt.O0(build, '/');
        } catch (Exception e11) {
            e11.printStackTrace();
            String message = e11.getMessage();
            x10.a.b("DeepLink:: clear Query params error :: " + message + " ", new Object[0]);
            return uri;
        }
    }

    private final Uri e(Uri uri) {
        x10.a.b("DeepLink:: " + uri, new Object[0]);
        Uri d11 = d(uri);
        x10.a.b("DeepLink::After Removing " + d11, new Object[0]);
        return d11;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(android.net.Uri r5, java.lang.String r6, java.lang.String r7, zz.a<? super android.net.Uri> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.forsale.app.routing.deeplinks.mappers.DeepLinksCampaignParamsMapper$invoke$1
            if (r0 == 0) goto L13
            r0 = r8
            com.forsale.app.routing.deeplinks.mappers.DeepLinksCampaignParamsMapper$invoke$1 r0 = (com.forsale.app.routing.deeplinks.mappers.DeepLinksCampaignParamsMapper$invoke$1) r0
            int r1 = r0.f37664e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37664e = r1
            goto L18
        L13:
            com.forsale.app.routing.deeplinks.mappers.DeepLinksCampaignParamsMapper$invoke$1 r0 = new com.forsale.app.routing.deeplinks.mappers.DeepLinksCampaignParamsMapper$invoke$1
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f37662c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f37664e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.f37661b
            android.net.Uri r5 = (android.net.Uri) r5
            java.lang.Object r6 = r0.f37660a
            com.forsale.app.routing.deeplinks.mappers.DeepLinksCampaignParamsMapper r6 = (com.forsale.app.routing.deeplinks.mappers.DeepLinksCampaignParamsMapper) r6
            kotlin.f.b(r8)
            goto L51
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            kotlin.f.b(r8)
            com.forsale.app.datalayer.repositories.AnalyticsRepository r8 = r4.f37659a
            com.forsale.app.utils.analytics.h r2 = new com.forsale.app.utils.analytics.h
            r2.<init>(r6, r7)
            r0.f37660a = r4
            r0.f37661b = r5
            r0.f37664e = r3
            java.lang.Object r6 = r8.updateAnalyticsCampaign(r2, r0)
            if (r6 != r1) goto L50
            return r1
        L50:
            r6 = r4
        L51:
            if (r5 == 0) goto L58
            android.net.Uri r5 = r6.e(r5)
            goto L59
        L58:
            r5 = 0
        L59:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.routing.deeplinks.mappers.DeepLinksCampaignParamsMapper.b(android.net.Uri, java.lang.String, java.lang.String, zz.a):java.lang.Object");
    }
}
