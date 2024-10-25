package com.forsale.app.utils.analytics;

import androidx.recyclerview.widget.RecyclerView;
import com.forsale.adserver.utils.AnalyticsEvents;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.database.UserEntity;
import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.features.categories.listingdetails.ListingDetailsAnalyticSource;
import com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData;
import com.forsale.app.features.categories.listings.ListingsIntention;
import com.forsale.app.features.categories.listings.ListingsTypes;
import com.forsale.app.features.search.SearchItemModel;
import com.forsale.app.utils.Languages;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.LanguageAWS;
import com.forsale.app.utils.analytics.propertyhome.PropertySectionName;
import com.google.android.gms.ads.AdRequest;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.i0;
import kotlin.collections.j0;
import kotlin.collections.s;
import kotlin.jvm.internal.o;
import kotlin.text.r;
import wz.p;
/* compiled from: AggregatedAllAnalyticsLogger.kt */
/* loaded from: classes3.dex */
public final class AggregatedAllAnalyticsLoggerKt {
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0025, code lost:
        r3 = kotlin.collections.i0.f(wz.i.a(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.TAB_NAME.getValue(), r3));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r13, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomEvents r14, java.lang.String r15, boolean r16, boolean r17) {
        /*
            java.lang.String r0 = "<this>"
            r1 = r13
            kotlin.jvm.internal.o.i(r13, r0)
            java.lang.String r0 = "event"
            r2 = r14
            kotlin.jvm.internal.o.i(r14, r0)
            java.lang.String r0 = "tabName"
            r3 = r15
            kotlin.jvm.internal.o.i(r15, r0)
            java.util.Map r0 = kotlin.collections.g0.h()
            int r4 = r15.length()
            if (r4 != 0) goto L1e
            r4 = 1
            goto L1f
        L1e:
            r4 = 0
        L1f:
            if (r4 != 0) goto L22
            goto L23
        L22:
            r3 = 0
        L23:
            if (r3 == 0) goto L36
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomParameterName r4 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.TAB_NAME
            java.lang.String r4 = r4.getValue()
            kotlin.Pair r3 = wz.i.a(r4, r3)
            java.util.Map r3 = kotlin.collections.g0.f(r3)
            if (r3 == 0) goto L36
            goto L3a
        L36:
            java.util.Map r3 = kotlin.collections.g0.h()
        L3a:
            java.util.Map r3 = kotlin.collections.g0.o(r0, r3)
            java.lang.String r2 = r14.getValue()
            r4 = 0
            r5 = 0
            r6 = 0
            r9 = 0
            r10 = 0
            r11 = 412(0x19c, float:5.77E-43)
            r12 = 0
            r1 = r13
            r7 = r16
            r8 = r17
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.h(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt.A(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomEvents, java.lang.String, boolean, boolean):void");
    }

    public static final void A0(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, String keyword, List<SearchItemModel> historyList) {
        Map f11;
        Map o11;
        o.i(aggregatedAllAnalyticsLogger, "<this>");
        o.i(keyword, "keyword");
        o.i(historyList, "historyList");
        f11 = i0.f(wz.i.a(AggregatedAllAnalyticsLogger.CustomParameterName.SEARCH_HISTORY_KEYWORD.getValue(), keyword));
        o11 = j0.o(f11, c(historyList));
        AggregatedAllAnalyticsLogger.h(aggregatedAllAnalyticsLogger, AggregatedAllAnalyticsLogger.CustomEvents.SEARCH_HISTORY_ITEM_CLEAR_CLICKED.getValue(), o11, null, null, null, true, true, false, false, 412, null);
    }

    public static /* synthetic */ void B(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, AggregatedAllAnalyticsLogger.CustomEvents customEvents, String str, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        if ((i11 & 8) != 0) {
            z12 = true;
        }
        A(aggregatedAllAnalyticsLogger, customEvents, str, z11, z12);
    }

    public static final void B0(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, String keyword) {
        Map f11;
        o.i(aggregatedAllAnalyticsLogger, "<this>");
        o.i(keyword, "keyword");
        String value = AggregatedAllAnalyticsLogger.CustomEvents.SEARCH_HISTORY_ITEM_CLICKED.getValue();
        f11 = i0.f(wz.i.a(AggregatedAllAnalyticsLogger.CustomParameterName.SEARCH_HISTORY_KEYWORD.getValue(), keyword));
        AggregatedAllAnalyticsLogger.h(aggregatedAllAnalyticsLogger, value, f11, null, null, null, true, true, false, false, 412, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0014, code lost:
        r4 = kotlin.collections.i0.f(wz.i.a(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.POSITION.getValue(), r19.toString()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0032, code lost:
        r0 = kotlin.collections.i0.f(wz.i.a(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.SOURCE.getValue(), r20));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void C(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r14, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomEvents r15, boolean r16, boolean r17, boolean r18, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.AnalyticsPosition r19, java.lang.String r20) {
        /*
            r0 = r20
            java.lang.String r1 = "<this>"
            r2 = r14
            kotlin.jvm.internal.o.i(r14, r1)
            java.lang.String r1 = "event"
            r3 = r15
            kotlin.jvm.internal.o.i(r15, r1)
            java.util.Map r1 = kotlin.collections.g0.h()
            if (r19 == 0) goto L28
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomParameterName r4 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.POSITION
            java.lang.String r4 = r4.getValue()
            java.lang.String r5 = r19.toString()
            kotlin.Pair r4 = wz.i.a(r4, r5)
            java.util.Map r4 = kotlin.collections.g0.f(r4)
            if (r4 != 0) goto L2c
        L28:
            java.util.Map r4 = kotlin.collections.g0.h()
        L2c:
            java.util.Map r1 = kotlin.collections.g0.o(r1, r4)
            if (r0 == 0) goto L42
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomParameterName r4 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.SOURCE
            java.lang.String r4 = r4.getValue()
            kotlin.Pair r0 = wz.i.a(r4, r0)
            java.util.Map r0 = kotlin.collections.g0.f(r0)
            if (r0 != 0) goto L46
        L42:
            java.util.Map r0 = kotlin.collections.g0.h()
        L46:
            java.util.Map r4 = kotlin.collections.g0.o(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "logButtonClickedEvent:Properties: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            x10.a.b(r0, r1)
            java.lang.String r3 = r15.getValue()
            r5 = 0
            r6 = 0
            r7 = 0
            r11 = 0
            r12 = 284(0x11c, float:3.98E-43)
            r13 = 0
            r2 = r14
            r8 = r16
            r9 = r17
            r10 = r18
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.h(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt.C(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomEvents, boolean, boolean, boolean, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$AnalyticsPosition, java.lang.String):void");
    }

    public static final void C0(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, List<SearchItemModel> historyList) {
        o.i(aggregatedAllAnalyticsLogger, "<this>");
        o.i(historyList, "historyList");
        AggregatedAllAnalyticsLogger.h(aggregatedAllAnalyticsLogger, AggregatedAllAnalyticsLogger.CustomEvents.SEARCH_CANCEL_CLICKED.getValue(), c(historyList), null, null, null, true, true, false, false, 412, null);
    }

    public static /* synthetic */ void D(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, AggregatedAllAnalyticsLogger.CustomEvents customEvents, boolean z11, boolean z12, boolean z13, AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition, String str, int i11, Object obj) {
        boolean z14;
        boolean z15;
        AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition2;
        boolean z16 = false;
        if ((i11 & 2) != 0) {
            z14 = false;
        } else {
            z14 = z11;
        }
        if ((i11 & 4) != 0) {
            z15 = false;
        } else {
            z15 = z12;
        }
        if ((i11 & 8) == 0) {
            z16 = z13;
        }
        String str2 = null;
        if ((i11 & 16) != 0) {
            analyticsPosition2 = null;
        } else {
            analyticsPosition2 = analyticsPosition;
        }
        if ((i11 & 32) == 0) {
            str2 = str;
        }
        C(aggregatedAllAnalyticsLogger, customEvents, z14, z15, z16, analyticsPosition2, str2);
    }

    public static final void D0(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, List<SearchItemModel> historyList) {
        o.i(aggregatedAllAnalyticsLogger, "<this>");
        o.i(historyList, "historyList");
        AggregatedAllAnalyticsLogger.h(aggregatedAllAnalyticsLogger, AggregatedAllAnalyticsLogger.CustomEvents.SEARCH_CLEAR_CLICKED.getValue(), c(historyList), null, null, null, true, true, false, false, 412, null);
    }

    public static final void E(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, int i11, String paymentOptionName, double d11) {
        Map h11;
        Map f11;
        Map o11;
        Map f12;
        Map o12;
        Map f13;
        Map o13;
        o.i(aggregatedAllAnalyticsLogger, "<this>");
        o.i(paymentOptionName, "paymentOptionName");
        h11 = j0.h();
        f11 = i0.f(wz.i.a(AggregatedAllAnalyticsLogger.CustomParameterName.PACKAGE_ID.getValue(), String.valueOf(i11)));
        o11 = j0.o(h11, f11);
        f12 = i0.f(wz.i.a(AggregatedAllAnalyticsLogger.CustomParameterName.PAYMENT_OPTION.getValue(), paymentOptionName));
        o12 = j0.o(o11, f12);
        f13 = i0.f(wz.i.a(AggregatedAllAnalyticsLogger.CustomParameterName.PACKAGE_PRICE.getValue(), Double.valueOf(d11)));
        o13 = j0.o(o12, f13);
        AggregatedAllAnalyticsLogger.h(aggregatedAllAnalyticsLogger, AggregatedAllAnalyticsLogger.CustomEvents.BUY_PACKAGE_SELECTED.getValue(), o13, null, null, null, true, true, true, false, 284, null);
    }

    public static final void E0(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger) {
        Map h11;
        o.i(aggregatedAllAnalyticsLogger, "<this>");
        String value = AggregatedAllAnalyticsLogger.CustomEvents.SEARCH_PAGE_VISITED.getValue();
        h11 = j0.h();
        AggregatedAllAnalyticsLogger.h(aggregatedAllAnalyticsLogger, value, h11, null, null, null, true, true, false, false, 412, null);
    }

    public static final void F(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger) {
        Map h11;
        o.i(aggregatedAllAnalyticsLogger, "<this>");
        String value = AggregatedAllAnalyticsLogger.CustomEvents.CALL_LOG_SCREEN_VISITED.getValue();
        h11 = j0.h();
        AggregatedAllAnalyticsLogger.h(aggregatedAllAnalyticsLogger, value, h11, null, null, null, false, false, false, false, 508, null);
    }

    public static final Object F0(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, int i11, int i12, int i13, zz.a<? super p> aVar) {
        Map h11;
        Map f11;
        Map o11;
        Map f12;
        Map o12;
        Map f13;
        Map o13;
        h11 = j0.h();
        f11 = i0.f(wz.i.a(AggregatedAllAnalyticsLogger.CustomParameterName.TOTAL_LISTINGS_COUNT.getValue(), String.valueOf(i11)));
        o11 = j0.o(h11, f11);
        f12 = i0.f(wz.i.a(AggregatedAllAnalyticsLogger.CustomParameterName.MAX_ITEM_SCROLLED.getValue(), String.valueOf(i12)));
        o12 = j0.o(o11, f12);
        f13 = i0.f(wz.i.a(AggregatedAllAnalyticsLogger.CustomParameterName.MAX_VISITED_PAGE.getValue(), String.valueOf(i13)));
        o13 = j0.o(o12, f13);
        AggregatedAllAnalyticsLogger.h(aggregatedAllAnalyticsLogger, AggregatedAllAnalyticsLogger.ListingsVisitedEvents.SEARCH_RESULTS_SCROLLED.getValue(), o13, null, null, null, true, true, false, false, 412, null);
        return p.f75480a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f7, code lost:
        if (r0 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0119, code lost:
        if (r1 == null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object G(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r20, int r21, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CarouselName r22, int r23, int r24, java.lang.Integer r25, java.lang.Integer r26, boolean r27, boolean r28, zz.a<? super wz.p> r29) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt.G(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger, int, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CarouselName, int, int, java.lang.Integer, java.lang.Integer, boolean, boolean, zz.a):java.lang.Object");
    }

    public static final void G0(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger) {
        Map h11;
        o.i(aggregatedAllAnalyticsLogger, "<this>");
        String value = AggregatedAllAnalyticsLogger.CustomEvents.SPOTLIGHT_SEE_ALL_VISITED.getValue();
        h11 = j0.h();
        AggregatedAllAnalyticsLogger.h(aggregatedAllAnalyticsLogger, value, h11, null, null, null, true, true, false, false, 412, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0107, code lost:
        if (r1 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0129, code lost:
        if (r1 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x013b, code lost:
        r1 = kotlin.collections.i0.f(wz.i.a(r2.getValue(), r1));
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object H(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r18, int r19, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CarouselName r20, int r21, java.lang.Integer r22, java.lang.Integer r23, boolean r24, boolean r25, java.lang.String r26, com.forsale.app.utils.analytics.AnalyticListingsPayload r27, zz.a<? super wz.p> r28) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt.H(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger, int, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CarouselName, int, java.lang.Integer, java.lang.Integer, boolean, boolean, java.lang.String, com.forsale.app.utils.analytics.AnalyticListingsPayload, zz.a):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0013, code lost:
        r0 = kotlin.collections.i0.f(wz.i.a(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.SOURCE.getValue(), r15));
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002d, code lost:
        r1 = kotlin.collections.i0.f(wz.i.a(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.STATUS.getValue(), r16));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object H0(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r14, java.lang.String r15, java.lang.String r16, boolean r17, boolean r18, zz.a<? super wz.p> r19) {
        /*
            r0 = r15
            r1 = r16
            java.util.Map r2 = kotlin.collections.g0.h()
            java.util.List r3 = r14.Z()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Map r2 = kotlin.collections.g0.n(r2, r3)
            if (r0 == 0) goto L23
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomParameterName r3 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.SOURCE
            java.lang.String r3 = r3.getValue()
            kotlin.Pair r0 = wz.i.a(r3, r15)
            java.util.Map r0 = kotlin.collections.g0.f(r0)
            if (r0 != 0) goto L27
        L23:
            java.util.Map r0 = kotlin.collections.g0.h()
        L27:
            java.util.Map r0 = kotlin.collections.g0.o(r2, r0)
            if (r1 == 0) goto L3d
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomParameterName r2 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.STATUS
            java.lang.String r2 = r2.getValue()
            kotlin.Pair r1 = wz.i.a(r2, r1)
            java.util.Map r1 = kotlin.collections.g0.f(r1)
            if (r1 != 0) goto L41
        L3d:
            java.util.Map r1 = kotlin.collections.g0.h()
        L41:
            java.util.Map r4 = kotlin.collections.g0.o(r0, r1)
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$ListingsVisitedEvents r0 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.ListingsVisitedEvents.STATUS_TAB_CLICKED
            java.lang.String r3 = r0.getValue()
            r5 = 0
            r6 = 0
            r7 = 0
            r10 = 0
            r11 = 0
            r12 = 412(0x19c, float:5.77E-43)
            r13 = 0
            r2 = r14
            r8 = r17
            r9 = r18
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.h(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            wz.p r0 = wz.p.f75480a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt.H0(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger, java.lang.String, java.lang.String, boolean, boolean, zz.a):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x003c, code lost:
        if (r0 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r14, com.forsale.app.datalayer.database.CategoryEntity r15, com.forsale.app.utils.analytics.SubCategoriesPosition r16, com.forsale.app.features.categories.normal.SubCategoryAnalyticsSource r17, zz.a<? super wz.p> r18) {
        /*
            r0 = r16
            java.util.Map r1 = kotlin.collections.g0.h()
            java.util.List r2 = r14.v(r15)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Map r1 = kotlin.collections.g0.n(r1, r2)
            java.util.List r2 = r14.Z()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Map r1 = kotlin.collections.g0.n(r1, r2)
            if (r0 == 0) goto L3f
            com.forsale.app.utils.analytics.SubCategoriesPosition r2 = com.forsale.app.utils.analytics.SubCategoriesPosition.DEFAULT
            if (r0 != r2) goto L22
            r2 = 1
            goto L23
        L22:
            r2 = 0
        L23:
            if (r2 != 0) goto L27
            r2 = r0
            goto L28
        L27:
            r2 = 0
        L28:
            if (r2 == 0) goto L3f
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomParameterName r2 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.POSITION
            java.lang.String r2 = r2.getValue()
            java.lang.String r0 = r16.getValue()
            kotlin.Pair r0 = wz.i.a(r2, r0)
            java.util.Map r0 = kotlin.collections.g0.f(r0)
            if (r0 == 0) goto L3f
            goto L43
        L3f:
            java.util.Map r0 = kotlin.collections.g0.h()
        L43:
            java.util.Map r0 = kotlin.collections.g0.o(r1, r0)
            java.util.Map r1 = n(r17)
            java.util.Map r4 = kotlin.collections.g0.o(r0, r1)
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomEvents r0 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomEvents.CATEGORY_VISITED
            java.lang.String r3 = r0.getValue()
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 1
            r9 = 1
            r10 = 1
            r11 = 0
            r12 = 284(0x11c, float:3.98E-43)
            r13 = 0
            r2 = r14
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.h(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            wz.p r0 = wz.p.f75480a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt.I(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger, com.forsale.app.datalayer.database.CategoryEntity, com.forsale.app.utils.analytics.SubCategoriesPosition, com.forsale.app.features.categories.normal.SubCategoryAnalyticsSource, zz.a):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0030, code lost:
        if (r3 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void I0(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r13, com.forsale.app.utils.analytics.SupportActionType r14, java.lang.String r15, boolean r16, boolean r17) {
        /*
            java.lang.String r0 = "<this>"
            r1 = r13
            kotlin.jvm.internal.o.i(r13, r0)
            java.lang.String r0 = "eventActionType"
            r2 = r14
            kotlin.jvm.internal.o.i(r14, r0)
            java.util.Map r0 = kotlin.collections.g0.h()
            if (r15 == 0) goto L33
            int r3 = r15.length()
            if (r3 <= 0) goto L1a
            r3 = 1
            goto L1b
        L1a:
            r3 = 0
        L1b:
            if (r3 == 0) goto L1f
            r3 = r15
            goto L20
        L1f:
            r3 = 0
        L20:
            if (r3 == 0) goto L33
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomParameterName r4 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.PHONE_NUMBER
            java.lang.String r4 = r4.getValue()
            kotlin.Pair r3 = wz.i.a(r4, r3)
            java.util.Map r3 = kotlin.collections.g0.f(r3)
            if (r3 == 0) goto L33
            goto L37
        L33:
            java.util.Map r3 = kotlin.collections.g0.h()
        L37:
            java.util.Map r3 = kotlin.collections.g0.o(r0, r3)
            java.lang.String r2 = r14.getValue()
            r4 = 0
            r5 = 0
            r6 = 0
            r9 = 0
            r10 = 0
            r11 = 412(0x19c, float:5.77E-43)
            r12 = 0
            r1 = r13
            r7 = r16
            r8 = r17
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.h(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt.I0(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger, com.forsale.app.utils.analytics.SupportActionType, java.lang.String, boolean, boolean):void");
    }

    public static final void J(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, AggregatedAllAnalyticsLogger.ChatActionEvents event, String advId, String recipientPhone, String chatSource) {
        Map k11;
        Integer k12;
        Map<String, String> h11;
        Map o11;
        o.i(aggregatedAllAnalyticsLogger, "<this>");
        o.i(event, "event");
        o.i(advId, "advId");
        o.i(recipientPhone, "recipientPhone");
        o.i(chatSource, "chatSource");
        k11 = j0.k(wz.i.a(AggregatedAllAnalyticsLogger.CustomParameterName.RECIPIENT_PHONE.getValue(), recipientPhone), wz.i.a(AggregatedAllAnalyticsLogger.CustomParameterName.CHAT_SOURCE.getValue(), chatSource));
        k12 = r.k(advId);
        if (k12 == null || (h11 = aggregatedAllAnalyticsLogger.l(k12.intValue())) == null) {
            h11 = j0.h();
        }
        o11 = j0.o(k11, h11);
        AggregatedAllAnalyticsLogger.h(aggregatedAllAnalyticsLogger, event.getValue(), o11, null, null, null, false, false, false, false, 508, null);
    }

    public static /* synthetic */ void J0(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, SupportActionType supportActionType, String str, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = "";
        }
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        if ((i11 & 8) != 0) {
            z12 = false;
        }
        I0(aggregatedAllAnalyticsLogger, supportActionType, str, z11, z12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x00f8, code lost:
        if (r6 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x015b, code lost:
        if (r6 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0184, code lost:
        if (r2 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0073, code lost:
        r2 = kotlin.collections.i0.f(wz.i.a(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.SOURCE.getValue(), r26));
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r21, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomEvents r22, com.forsale.app.datalayer.network.entities.ListingDetailsEntity r23, com.forsale.app.datalayer.database.UserEntity r24, boolean r25, java.lang.String r26, zz.a<? super wz.p> r27) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt.K(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomEvents, com.forsale.app.datalayer.network.entities.ListingDetailsEntity, com.forsale.app.datalayer.database.UserEntity, boolean, java.lang.String, zz.a):java.lang.Object");
    }

    public static final Object K0(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, String str, String str2, boolean z11, boolean z12, zz.a<? super p> aVar) {
        Map k11;
        Map n11;
        k11 = j0.k(wz.i.a(AggregatedAllAnalyticsLogger.CustomParameterName.OLD_LANGUAGE.getValue(), str), wz.i.a(AggregatedAllAnalyticsLogger.CustomParameterName.NEW_LANGUAGE.getValue(), str2));
        n11 = j0.n(k11, aggregatedAllAnalyticsLogger.Z());
        AggregatedAllAnalyticsLogger.h(aggregatedAllAnalyticsLogger, AggregatedAllAnalyticsLogger.CustomEvents.TRANSLATE_SETTING_CHANGED.getValue(), n11, null, null, null, z11, z12, false, false, 412, null);
        return p.f75480a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0070, code lost:
        r5 = kotlin.collections.i0.f(wz.i.a(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.SOURCE.getValue(), r24.getValue()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x008e, code lost:
        r5 = kotlin.collections.i0.f(wz.i.a(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.CURRENT_SCREEN.getValue(), r25.getValue()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x00ac, code lost:
        r5 = kotlin.collections.i0.f(wz.i.a(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.CLICKED_BUTTON_LOCATION.getValue(), r26.getValue()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x015d, code lost:
        if (r5 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01c0, code lost:
        if (r5 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x01e9, code lost:
        if (r5 != null) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object L(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r18, com.forsale.app.utils.analytics.CreateEditAdvActionType r19, com.forsale.app.datalayer.network.entities.ListingDetailsEntity r20, com.forsale.app.datalayer.database.UserEntity r21, boolean r22, java.lang.String r23, com.forsale.app.utils.analytics.PLFSource r24, com.forsale.app.utils.analytics.PLFScreenTypes r25, com.forsale.app.utils.analytics.PLFCloseTarget r26, boolean r27, zz.a<? super wz.p> r28) {
        /*
            Method dump skipped, instructions count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt.L(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger, com.forsale.app.utils.analytics.CreateEditAdvActionType, com.forsale.app.datalayer.network.entities.ListingDetailsEntity, com.forsale.app.datalayer.database.UserEntity, boolean, java.lang.String, com.forsale.app.utils.analytics.PLFSource, com.forsale.app.utils.analytics.PLFScreenTypes, com.forsale.app.utils.analytics.PLFCloseTarget, boolean, zz.a):java.lang.Object");
    }

    public static final void L0(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, String keyword, String pageSource) {
        Map h11;
        Map p11;
        Map p12;
        o.i(aggregatedAllAnalyticsLogger, "<this>");
        o.i(keyword, "keyword");
        o.i(pageSource, "pageSource");
        h11 = j0.h();
        p11 = j0.p(h11, wz.i.a(AggregatedAllAnalyticsLogger.CustomParameterName.SEARCH_HISTORY_KEYWORD.getValue(), keyword));
        p12 = j0.p(p11, wz.i.a(AggregatedAllAnalyticsLogger.CustomParameterName.PAGE_SOURCE.getValue(), pageSource));
        AggregatedAllAnalyticsLogger.h(aggregatedAllAnalyticsLogger, AggregatedAllAnalyticsLogger.CustomEvents.TREND_ITEM_CLICKED.getValue(), p12, null, null, null, true, true, false, false, 412, null);
    }

    public static /* synthetic */ Object M(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, CreateEditAdvActionType createEditAdvActionType, ListingDetailsEntity listingDetailsEntity, UserEntity userEntity, boolean z11, String str, PLFSource pLFSource, PLFScreenTypes pLFScreenTypes, PLFCloseTarget pLFCloseTarget, boolean z12, zz.a aVar, int i11, Object obj) {
        String str2;
        PLFSource pLFSource2;
        PLFScreenTypes pLFScreenTypes2;
        PLFCloseTarget pLFCloseTarget2;
        boolean z13;
        if ((i11 & 16) != 0) {
            str2 = null;
        } else {
            str2 = str;
        }
        if ((i11 & 32) != 0) {
            pLFSource2 = null;
        } else {
            pLFSource2 = pLFSource;
        }
        if ((i11 & 64) != 0) {
            pLFScreenTypes2 = null;
        } else {
            pLFScreenTypes2 = pLFScreenTypes;
        }
        if ((i11 & 128) != 0) {
            pLFCloseTarget2 = null;
        } else {
            pLFCloseTarget2 = pLFCloseTarget;
        }
        if ((i11 & 256) != 0) {
            z13 = false;
        } else {
            z13 = z12;
        }
        return L(aggregatedAllAnalyticsLogger, createEditAdvActionType, listingDetailsEntity, userEntity, z11, str2, pLFSource2, pLFScreenTypes2, pLFCloseTarget2, z13, aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0007, code lost:
        r0 = kotlin.collections.i0.f(wz.i.a(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.DEVICE_ID.getValue(), r15));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object M0(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r14, java.lang.String r15, int r16, int r17, zz.a<? super wz.p> r18) {
        /*
            r0 = r15
            java.util.Map r1 = kotlin.collections.g0.h()
            if (r0 == 0) goto L17
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomParameterName r2 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.DEVICE_ID
            java.lang.String r2 = r2.getValue()
            kotlin.Pair r0 = wz.i.a(r2, r15)
            java.util.Map r0 = kotlin.collections.g0.f(r0)
            if (r0 != 0) goto L1b
        L17:
            java.util.Map r0 = kotlin.collections.g0.h()
        L1b:
            java.util.Map r0 = kotlin.collections.g0.o(r1, r0)
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomParameterName r1 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.REPORTER_USER_ID
            java.lang.String r1 = r1.getValue()
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.a.d(r16)
            kotlin.Pair r1 = wz.i.a(r1, r2)
            java.util.Map r1 = kotlin.collections.g0.f(r1)
            if (r1 != 0) goto L37
            java.util.Map r1 = kotlin.collections.g0.h()
        L37:
            java.util.Map r0 = kotlin.collections.g0.o(r0, r1)
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomParameterName r1 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.REPORTED_USER_ID
            java.lang.String r1 = r1.getValue()
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.a.d(r17)
            kotlin.Pair r1 = wz.i.a(r1, r2)
            java.util.Map r1 = kotlin.collections.g0.f(r1)
            if (r1 != 0) goto L53
            java.util.Map r1 = kotlin.collections.g0.h()
        L53:
            java.util.Map r0 = kotlin.collections.g0.o(r0, r1)
            java.util.List r1 = r14.Z()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Map r4 = kotlin.collections.g0.n(r0, r1)
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomEvents r0 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomEvents.USER_REPORT_ABUSE_CLICKED
            java.lang.String r3 = r0.getValue()
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 1
            r9 = 1
            r10 = 0
            r11 = 0
            r12 = 412(0x19c, float:5.77E-43)
            r13 = 0
            r2 = r14
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.h(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            wz.p r0 = wz.p.f75480a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt.M0(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger, java.lang.String, int, int, zz.a):java.lang.Object");
    }

    public static final Object N(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, String str, String str2, Integer num, zz.a<? super p> aVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(AggregatedAllAnalyticsLogger.CustomParameterName.PAGE_SOURCE.getValue(), str);
        if (str2 != null) {
            linkedHashMap.put(AggregatedAllAnalyticsLogger.CustomParameterName.ERROR_MESSAGE.getValue(), str2);
        }
        if (num != null) {
            linkedHashMap.put(AggregatedAllAnalyticsLogger.CustomParameterName.ERROR_CODE.getValue(), kotlin.coroutines.jvm.internal.a.d(num.intValue()));
        }
        j0.r(linkedHashMap, aggregatedAllAnalyticsLogger.Z());
        AggregatedAllAnalyticsLogger.h(aggregatedAllAnalyticsLogger, AggregatedAllAnalyticsLogger.CustomEvents.ERROR_SCREEN_SHOWN.getValue(), linkedHashMap, null, null, null, true, true, false, false, 412, null);
        return p.f75480a;
    }

    public static final void N0(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, AggregatedAllAnalyticsLogger.WalkThroughActionEvents event) {
        Map h11;
        o.i(aggregatedAllAnalyticsLogger, "<this>");
        o.i(event, "event");
        String value = event.getValue();
        h11 = j0.h();
        AggregatedAllAnalyticsLogger.h(aggregatedAllAnalyticsLogger, value, h11, null, null, null, false, false, false, false, 508, null);
    }

    public static /* synthetic */ Object O(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, String str, String str2, Integer num, zz.a aVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            num = null;
        }
        return N(aggregatedAllAnalyticsLogger, str, str2, num, aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0135, code lost:
        if (r1 == null) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O0(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r17, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.WantedItemActionEvents r18, com.forsale.app.datalayer.network.responses.ItemSubscriptionResponse r19, zz.a<? super wz.p> r20) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt.O0(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$WantedItemActionEvents, com.forsale.app.datalayer.network.responses.ItemSubscriptionResponse, zz.a):java.lang.Object");
    }

    public static final void P(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, FollowActionType actionType) {
        Map h11;
        Map p11;
        o.i(aggregatedAllAnalyticsLogger, "<this>");
        o.i(actionType, "actionType");
        h11 = j0.h();
        p11 = j0.p(h11, wz.i.a(AggregatedAllAnalyticsLogger.CustomParameterName.ACTION_TYPE.getValue(), actionType.getValue()));
        AggregatedAllAnalyticsLogger.h(aggregatedAllAnalyticsLogger, AggregatedAllAnalyticsLogger.CustomEvents.FOLLOW_ACTION_TAKEN.getValue(), p11, null, null, null, false, false, false, false, 508, null);
    }

    public static final void P0(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, WebLoginActionType actionType) {
        Map f11;
        o.i(aggregatedAllAnalyticsLogger, "<this>");
        o.i(actionType, "actionType");
        f11 = i0.f(wz.i.a(AggregatedAllAnalyticsLogger.CustomParameterName.ACTION_TYPE.getValue(), actionType.getValue()));
        AggregatedAllAnalyticsLogger.h(aggregatedAllAnalyticsLogger, AggregatedAllAnalyticsLogger.CustomEvents.WEB_LOGIN_ACTION_TAKEN.getValue(), f11, null, null, null, false, false, false, false, 508, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0010, code lost:
        r1 = kotlin.collections.i0.f(wz.i.a(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.VERTICAL.getValue(), r16.getSystemName()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
        r1 = kotlin.collections.i0.f(wz.i.a(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.SOURCE.getValue(), r17.getValue()));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Q(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r14, com.forsale.app.utils.analytics.HomeVisitedReleaseName r15, com.forsale.app.datalayer.database.CategoryEntity r16, com.forsale.app.utils.analytics.HomeVisitedSources r17, zz.a<? super wz.p> r18) {
        /*
            java.util.Map r0 = kotlin.collections.g0.h()
            java.util.List r1 = r14.Z()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Map r0 = kotlin.collections.g0.n(r0, r1)
            if (r16 == 0) goto L24
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomParameterName r1 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.VERTICAL
            java.lang.String r1 = r1.getValue()
            java.lang.String r2 = r16.getSystemName()
            kotlin.Pair r1 = wz.i.a(r1, r2)
            java.util.Map r1 = kotlin.collections.g0.f(r1)
            if (r1 != 0) goto L28
        L24:
            java.util.Map r1 = kotlin.collections.g0.h()
        L28:
            java.util.Map r0 = kotlin.collections.g0.o(r0, r1)
            java.lang.String r1 = "ReleaseName"
            java.lang.String r2 = r15.getValue()
            kotlin.Pair r1 = wz.i.a(r1, r2)
            java.util.Map r1 = kotlin.collections.g0.f(r1)
            java.util.Map r0 = kotlin.collections.g0.o(r0, r1)
            if (r17 == 0) goto L54
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomParameterName r1 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.SOURCE
            java.lang.String r1 = r1.getValue()
            java.lang.String r2 = r17.getValue()
            kotlin.Pair r1 = wz.i.a(r1, r2)
            java.util.Map r1 = kotlin.collections.g0.f(r1)
            if (r1 != 0) goto L58
        L54:
            java.util.Map r1 = kotlin.collections.g0.h()
        L58:
            java.util.Map r4 = kotlin.collections.g0.o(r0, r1)
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomEvents r0 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomEvents.HOME_SCREEN_VISITED
            java.lang.String r3 = r0.getValue()
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 1
            r9 = 1
            r10 = 1
            r11 = 0
            r12 = 284(0x11c, float:3.98E-43)
            r13 = 0
            r2 = r14
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.h(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            wz.p r0 = wz.p.f75480a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt.Q(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger, com.forsale.app.utils.analytics.HomeVisitedReleaseName, com.forsale.app.datalayer.database.CategoryEntity, com.forsale.app.utils.analytics.HomeVisitedSources, zz.a):java.lang.Object");
    }

    public static final <T> Map<String, Object> Q0(Map<String, ? extends Object> map, String key, T t11) {
        Map map2;
        Map<String, Object> o11;
        o.i(map, "<this>");
        o.i(key, "key");
        if (t11 != null) {
            map2 = i0.f(wz.i.a(key, t11));
        } else {
            map2 = null;
        }
        if (map2 == null) {
            map2 = j0.h();
        }
        o11 = j0.o(map, map2);
        return o11;
    }

    public static /* synthetic */ Object R(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, HomeVisitedReleaseName homeVisitedReleaseName, CategoryEntity categoryEntity, HomeVisitedSources homeVisitedSources, zz.a aVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            categoryEntity = null;
        }
        if ((i11 & 4) != 0) {
            homeVisitedSources = null;
        }
        return Q(aggregatedAllAnalyticsLogger, homeVisitedReleaseName, categoryEntity, homeVisitedSources, aVar);
    }

    public static final void S(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, AggregatedAllAnalyticsLogger.CustomEvents event, int i11, int i12, boolean z11, boolean z12) {
        Map h11;
        Map f11;
        Map o11;
        Map f12;
        Map o12;
        o.i(aggregatedAllAnalyticsLogger, "<this>");
        o.i(event, "event");
        h11 = j0.h();
        f11 = i0.f(wz.i.a(AggregatedAllAnalyticsLogger.CustomParameterName.TOTAL_LISTINGS_COUNT.getValue(), String.valueOf(i12)));
        o11 = j0.o(h11, f11);
        f12 = i0.f(wz.i.a(AggregatedAllAnalyticsLogger.CustomParameterName.MAX_ITEM_SCROLLED.getValue(), String.valueOf(i11)));
        o12 = j0.o(o11, f12);
        AggregatedAllAnalyticsLogger.h(aggregatedAllAnalyticsLogger, event.getValue(), o12, null, null, null, z11, z12, false, false, 412, null);
    }

    public static /* synthetic */ void T(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, AggregatedAllAnalyticsLogger.CustomEvents customEvents, int i11, int i12, boolean z11, boolean z12, int i13, Object obj) {
        boolean z13;
        boolean z14;
        if ((i13 & 8) != 0) {
            z13 = true;
        } else {
            z13 = z11;
        }
        if ((i13 & 16) != 0) {
            z14 = true;
        } else {
            z14 = z12;
        }
        S(aggregatedAllAnalyticsLogger, customEvents, i11, i12, z13, z14);
    }

    public static final void U(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, boolean z11, boolean z12) {
        Map h11;
        o.i(aggregatedAllAnalyticsLogger, "<this>");
        String value = AggregatedAllAnalyticsLogger.CustomEvents.HOT_ZONE_SEE_ALL_CLICKED.getValue();
        h11 = j0.h();
        AggregatedAllAnalyticsLogger.h(aggregatedAllAnalyticsLogger, value, h11, null, null, null, z11, z12, false, false, 412, null);
    }

    public static /* synthetic */ void V(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            z12 = true;
        }
        U(aggregatedAllAnalyticsLogger, z11, z12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x00cc, code lost:
        if (r1 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00ed, code lost:
        if (r1 == null) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object W(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r15, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.InAppActionEvents r16, java.lang.Integer r17, java.lang.Integer r18, java.lang.Integer r19, java.util.List<java.lang.Integer> r20, zz.a<? super wz.p> r21) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt.W(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$InAppActionEvents, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.util.List, zz.a):java.lang.Object");
    }

    public static /* synthetic */ Object X(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, AggregatedAllAnalyticsLogger.InAppActionEvents inAppActionEvents, Integer num, Integer num2, Integer num3, List list, zz.a aVar, int i11, Object obj) {
        Integer num4;
        Integer num5;
        List list2;
        if ((i11 & 4) != 0) {
            num4 = null;
        } else {
            num4 = num2;
        }
        if ((i11 & 8) != 0) {
            num5 = null;
        } else {
            num5 = num3;
        }
        if ((i11 & 16) != 0) {
            list2 = null;
        } else {
            list2 = list;
        }
        return W(aggregatedAllAnalyticsLogger, inAppActionEvents, num, num4, num5, list2, aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0020, code lost:
        if (r3 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x002c, code lost:
        r0 = kotlin.collections.i0.f(wz.i.a(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.KEYWORD.getValue(), r17));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0046, code lost:
        r1 = kotlin.collections.i0.f(wz.i.a(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.SEARCH_SOURCE.getValue(), r18));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Y(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r14, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.ListingsVisitedEvents r15, java.lang.Integer r16, java.lang.String r17, java.lang.String r18, boolean r19, boolean r20, boolean r21, zz.a<? super wz.p> r22) {
        /*
            r0 = r17
            r1 = r18
            java.util.Map r2 = kotlin.collections.g0.h()
            if (r16 == 0) goto L22
            int r3 = r16.intValue()
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomParameterName r4 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.TOTAL_LISTINGS_COUNT
            java.lang.String r4 = r4.getValue()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            kotlin.Pair r3 = wz.i.a(r4, r3)
            java.util.Map r3 = kotlin.collections.g0.f(r3)
            if (r3 != 0) goto L26
        L22:
            java.util.Map r3 = kotlin.collections.g0.h()
        L26:
            java.util.Map r2 = kotlin.collections.g0.o(r2, r3)
            if (r0 == 0) goto L3c
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomParameterName r3 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.KEYWORD
            java.lang.String r3 = r3.getValue()
            kotlin.Pair r0 = wz.i.a(r3, r0)
            java.util.Map r0 = kotlin.collections.g0.f(r0)
            if (r0 != 0) goto L40
        L3c:
            java.util.Map r0 = kotlin.collections.g0.h()
        L40:
            java.util.Map r0 = kotlin.collections.g0.o(r2, r0)
            if (r1 == 0) goto L56
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomParameterName r2 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.SEARCH_SOURCE
            java.lang.String r2 = r2.getValue()
            kotlin.Pair r1 = wz.i.a(r2, r1)
            java.util.Map r1 = kotlin.collections.g0.f(r1)
            if (r1 != 0) goto L5a
        L56:
            java.util.Map r1 = kotlin.collections.g0.h()
        L5a:
            java.util.Map r4 = kotlin.collections.g0.o(r0, r1)
            java.lang.String r3 = r15.getValue()
            r5 = 0
            r6 = 0
            r7 = 0
            r11 = 0
            r12 = 284(0x11c, float:3.98E-43)
            r13 = 0
            r2 = r14
            r8 = r19
            r9 = r20
            r10 = r21
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.h(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            wz.p r0 = wz.p.f75480a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt.Y(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$ListingsVisitedEvents, java.lang.Integer, java.lang.String, java.lang.String, boolean, boolean, boolean, zz.a):java.lang.Object");
    }

    public static final Object Z(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, Languages languages, Languages languages2, boolean z11, boolean z12, zz.a<? super p> aVar) {
        Map k11;
        Map n11;
        String value = AggregatedAllAnalyticsLogger.CustomParameterName.OLD_LANGUAGE.getValue();
        LanguageAWS.a aVar2 = LanguageAWS.Companion;
        k11 = j0.k(wz.i.a(value, aVar2.a(languages).getValue()), wz.i.a(AggregatedAllAnalyticsLogger.CustomParameterName.NEW_LANGUAGE.getValue(), aVar2.a(languages2).getValue()));
        n11 = j0.n(k11, aggregatedAllAnalyticsLogger.Z());
        AggregatedAllAnalyticsLogger.h(aggregatedAllAnalyticsLogger, AggregatedAllAnalyticsLogger.CustomEvents.LANGUAGE_CHANGED.getValue(), n11, null, null, null, z11, z12, false, false, 412, null);
        return p.f75480a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x01b7, code lost:
        if (r10 != null) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x002a  */
    /* JADX WARN: Type inference failed for: r0v12, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v18, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v4, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v20, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v8, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v11, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v7, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v9, types: [T, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a0(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r17, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.AdvActionEvents r18, com.forsale.app.datalayer.network.responses.ListingItemDetails r19, java.lang.String r20, com.forsale.app.datalayer.repositories.TranslationRepository.Translation r21, boolean r22, boolean r23, boolean r24, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.AnalyticsPosition r25, java.lang.String r26, java.lang.String r27, java.lang.Boolean r28, com.forsale.app.datalayer.network.requestsbodies.UserType r29, int r30, java.util.List<java.lang.String> r31, com.forsale.app.utils.analytics.listingfiltration.ListingsAnalytics$FiltersPlace r32, com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData r33, com.forsale.app.features.categories.listingdetails.ListingDetailsAnalyticSource r34, kotlin.Pair<java.lang.String, java.lang.String>[] r35, zz.a<? super wz.p> r36) {
        /*
            Method dump skipped, instructions count: 627
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt.a0(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$AdvActionEvents, com.forsale.app.datalayer.network.responses.ListingItemDetails, java.lang.String, com.forsale.app.datalayer.repositories.TranslationRepository$Translation, boolean, boolean, boolean, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$AnalyticsPosition, java.lang.String, java.lang.String, java.lang.Boolean, com.forsale.app.datalayer.network.requestsbodies.UserType, int, java.util.List, com.forsale.app.utils.analytics.listingfiltration.ListingsAnalytics$FiltersPlace, com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData, com.forsale.app.features.categories.listingdetails.ListingDetailsAnalyticSource, kotlin.Pair[], zz.a):java.lang.Object");
    }

    private static final Map<String, Object> c(List<SearchItemModel> list) {
        int y11;
        List c02;
        Map<String, Object> k11;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = list.iterator();
        while (true) {
            boolean z11 = true;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((SearchItemModel) next).c() == null) {
                z11 = false;
            }
            if (z11) {
                arrayList.add(next);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList<SearchItemModel> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(((SearchItemModel) obj).d())) {
                arrayList2.add(obj);
            }
        }
        y11 = s.y(arrayList2, 10);
        ArrayList arrayList3 = new ArrayList(y11);
        for (SearchItemModel searchItemModel : arrayList2) {
            String d11 = searchItemModel.d();
            if (d11 == null) {
                d11 = "";
            }
            arrayList3.add(d11);
        }
        c02 = CollectionsKt___CollectionsKt.c0(arrayList3);
        k11 = j0.k(wz.i.a(AggregatedAllAnalyticsLogger.CustomParameterName.SEARCH_HISTORY_COUNT.getValue(), Integer.valueOf(list.size())), wz.i.a(AggregatedAllAnalyticsLogger.CustomParameterName.RECENT_SEARCH_CATEGORIES_COUNT.getValue(), Integer.valueOf(arrayList2.size())), wz.i.a(AggregatedAllAnalyticsLogger.CustomParameterName.RECENT_SEARCH_CATEGORIES_NAMES.getValue(), c02));
        return k11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x01c8, code lost:
        if (r7 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x02c9, code lost:
        if (r2 != null) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x026b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0375  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c0(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r21, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.AdvActionEvents r22, com.forsale.app.datalayer.network.responses.ListingItemDetails r23, java.lang.String r24, int r25, com.forsale.app.datalayer.repositories.TranslationRepository.Translation r26, boolean r27, boolean r28, boolean r29, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.AnalyticsPosition r30, java.lang.String r31, java.lang.String r32, com.forsale.app.features.categories.listingdetails.ListingDetailsAnalyticSource r33, java.lang.Boolean r34, com.forsale.app.datalayer.network.requestsbodies.UserType r35, java.util.List<java.lang.String> r36, com.forsale.app.utils.analytics.listingfiltration.ListingsAnalytics$FiltersPlace r37, com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData r38, zz.a<? super wz.p> r39) {
        /*
            Method dump skipped, instructions count: 952
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt.c0(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$AdvActionEvents, com.forsale.app.datalayer.network.responses.ListingItemDetails, java.lang.String, int, com.forsale.app.datalayer.repositories.TranslationRepository$Translation, boolean, boolean, boolean, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$AnalyticsPosition, java.lang.String, java.lang.String, com.forsale.app.features.categories.listingdetails.ListingDetailsAnalyticSource, java.lang.Boolean, com.forsale.app.datalayer.network.requestsbodies.UserType, java.util.List, com.forsale.app.utils.analytics.listingfiltration.ListingsAnalytics$FiltersPlace, com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData, zz.a):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x000e, code lost:
        r1 = kotlin.collections.i0.f(wz.i.a(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.Campaign_ID.getValue(), r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x002c, code lost:
        r3 = kotlin.collections.i0.f(wz.i.a(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.SOURCE_AD_PLATFORM.getValue(), r3));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Map<java.lang.String, java.lang.String> d(com.forsale.app.utils.analytics.h r3) {
        /*
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            java.util.Map r0 = kotlin.collections.g0.h()
            java.lang.String r1 = r3.a()
            if (r1 == 0) goto L1e
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomParameterName r2 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.Campaign_ID
            java.lang.String r2 = r2.getValue()
            kotlin.Pair r1 = wz.i.a(r2, r1)
            java.util.Map r1 = kotlin.collections.g0.f(r1)
            if (r1 != 0) goto L22
        L1e:
            java.util.Map r1 = kotlin.collections.g0.h()
        L22:
            java.util.Map r0 = kotlin.collections.g0.o(r0, r1)
            java.lang.String r3 = r3.b()
            if (r3 == 0) goto L3c
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomParameterName r1 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.SOURCE_AD_PLATFORM
            java.lang.String r1 = r1.getValue()
            kotlin.Pair r3 = wz.i.a(r1, r3)
            java.util.Map r3 = kotlin.collections.g0.f(r3)
            if (r3 != 0) goto L40
        L3c:
            java.util.Map r3 = kotlin.collections.g0.h()
        L40:
            java.util.Map r3 = kotlin.collections.g0.o(r0, r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt.d(com.forsale.app.utils.analytics.h):java.util.Map");
    }

    public static final Object d0(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, ListingsTypes listingsTypes, String str, Integer num, zz.a<? super p> aVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AggregatedAllAnalyticsLogger.ListingsPageSource a11 = AggregatedAllAnalyticsLogger.ListingsPageSource.Companion.a(listingsTypes);
        if (a11 != null) {
            linkedHashMap.put(AggregatedAllAnalyticsLogger.CustomParameterName.PAGE_SOURCE.getValue(), a11.getValue());
        }
        if (str != null) {
            linkedHashMap.put(AggregatedAllAnalyticsLogger.CustomParameterName.ERROR_MESSAGE.getValue(), str);
        }
        if (num != null) {
            linkedHashMap.put(AggregatedAllAnalyticsLogger.CustomParameterName.ERROR_CODE.getValue(), kotlin.coroutines.jvm.internal.a.d(num.intValue()));
        }
        j0.r(linkedHashMap, aggregatedAllAnalyticsLogger.Z());
        AggregatedAllAnalyticsLogger.h(aggregatedAllAnalyticsLogger, AggregatedAllAnalyticsLogger.CustomEvents.ERROR_SCREEN_SHOWN.getValue(), linkedHashMap, null, null, null, true, true, false, false, 412, null);
        return p.f75480a;
    }

    public static final Map<String, String> e(boolean z11) {
        Map<String, String> f11;
        f11 = i0.f(wz.i.a(AggregatedAllAnalyticsLogger.CustomParameterName.IS_LOGGED_IN.getValue(), AggregatedAllAnalyticsLogger.YesNo.Companion.a(Boolean.valueOf(z11))));
        return f11;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e0(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r16, com.forsale.app.datalayer.database.CategoryEntity r17, com.forsale.app.datalayer.database.DistrictEntity r18, com.forsale.app.utils.analytics.FillerType r19, java.util.Map<java.lang.String, ? extends java.lang.Object> r20, zz.a<? super wz.p> r21) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt.e0(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger, com.forsale.app.datalayer.database.CategoryEntity, com.forsale.app.datalayer.database.DistrictEntity, com.forsale.app.utils.analytics.FillerType, java.util.Map, zz.a):java.lang.Object");
    }

    public static final Map<String, Object> f(ListingDetailsAnalyticSource listingDetailsAnalyticSource) {
        String a11;
        Map h11;
        Map p11;
        Map<String, Object> h12;
        if (listingDetailsAnalyticSource == null) {
            h12 = j0.h();
            return h12;
        }
        boolean z11 = listingDetailsAnalyticSource instanceof ListingDetailsAnalyticSource.VerticalCarouselAnalytics;
        if (z11) {
            a11 = ((ListingDetailsAnalyticSource.VerticalCarouselAnalytics) listingDetailsAnalyticSource).d();
        } else {
            a11 = listingDetailsAnalyticSource.a();
        }
        h11 = j0.h();
        p11 = j0.p(h11, wz.i.a(AggregatedAllAnalyticsLogger.CustomParameterName.SOURCE.getValue(), a11));
        String str = null;
        if (listingDetailsAnalyticSource instanceof ListingDetailsAnalyticSource.HomePageRecommendedVertical) {
            ListingDetailsAnalyticSource.HomePageRecommendedVertical homePageRecommendedVertical = (ListingDetailsAnalyticSource.HomePageRecommendedVertical) listingDetailsAnalyticSource;
            Map<String, Object> Q0 = Q0(Q0(Q0(Q0(p11, ListingDetailsAnalyticSource.HomePageRecommendedVertical.PARAMS.SOURCE_SECTION_ORDER.getValue(), homePageRecommendedVertical.f()), ListingDetailsAnalyticSource.HomePageRecommendedVertical.PARAMS.SOURCE_ITEM_ORDER.getValue(), homePageRecommendedVertical.d()), ListingDetailsAnalyticSource.HomePageRecommendedVertical.PARAMS.SOURCE_CAROUSEL_TOTAL_ITEMS.getValue(), homePageRecommendedVertical.c()), ListingDetailsAnalyticSource.HomePageRecommendedVertical.PARAMS.RECOMMENDATION_CRITERIA.getValue(), homePageRecommendedVertical.b());
            String value = ListingDetailsAnalyticSource.HomePageRecommendedVertical.PARAMS.SOURCE_SECTION_NAME.getValue();
            SourceSectionName e11 = homePageRecommendedVertical.e();
            if (e11 != null) {
                str = e11.getValue();
            }
            return Q0(Q0, value, str);
        } else if (listingDetailsAnalyticSource instanceof ListingDetailsAnalyticSource.PropertyHomeAnalytics) {
            ListingDetailsAnalyticSource.PropertyHomeAnalytics propertyHomeAnalytics = (ListingDetailsAnalyticSource.PropertyHomeAnalytics) listingDetailsAnalyticSource;
            Map<String, Object> Q02 = Q0(Q0(Q0(Q0(p11, ListingDetailsAnalyticSource.PropertyHomeAnalytics.PARAMS.SOURCE_SECTION_ORDER.getValue(), propertyHomeAnalytics.h()), ListingDetailsAnalyticSource.PropertyHomeAnalytics.PARAMS.SOURCE_ITEM_ORDER.getValue(), propertyHomeAnalytics.f()), ListingDetailsAnalyticSource.PropertyHomeAnalytics.PARAMS.SOURCE_CAROUSEL_TOTAL_ITEMS.getValue(), propertyHomeAnalytics.c()), ListingDetailsAnalyticSource.PropertyHomeAnalytics.PARAMS.RECOMMENDATION_CRITERIA.getValue(), propertyHomeAnalytics.b());
            String value2 = ListingDetailsAnalyticSource.PropertyHomeAnalytics.PARAMS.SOURCE_SECTION_NAME.getValue();
            PropertySectionName g11 = propertyHomeAnalytics.g();
            if (g11 != null) {
                str = g11.getValue();
            }
            return Q0(Q0(Q0(Q02, value2, str), ListingDetailsAnalyticSource.PropertyHomeAnalytics.PARAMS.SOURCE_FILTER_NAME.getValue(), propertyHomeAnalytics.d()), ListingDetailsAnalyticSource.PropertyHomeAnalytics.PARAMS.SOURCE_FILTER_VALUE.getValue(), propertyHomeAnalytics.e());
        } else if (z11) {
            ListingDetailsAnalyticSource.VerticalCarouselAnalytics verticalCarouselAnalytics = (ListingDetailsAnalyticSource.VerticalCarouselAnalytics) listingDetailsAnalyticSource;
            return Q0(Q0(Q0(p11, ListingDetailsAnalyticSource.PropertyHomeAnalytics.PARAMS.SOURCE_SECTION_ORDER.getValue(), Integer.valueOf(verticalCarouselAnalytics.e())), ListingDetailsAnalyticSource.PropertyHomeAnalytics.PARAMS.SOURCE_ITEM_ORDER.getValue(), Integer.valueOf(verticalCarouselAnalytics.c())), ListingDetailsAnalyticSource.PropertyHomeAnalytics.PARAMS.SOURCE_CAROUSEL_TOTAL_ITEMS.getValue(), Integer.valueOf(verticalCarouselAnalytics.b()));
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public static final Object f0(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, ListingsTypes listingsTypes, Map<String, ? extends Object> map, CategoryEntity categoryEntity, zz.a<? super p> aVar) {
        Map<String, ? extends Object> map2;
        List<Pair<String, String>> v11;
        Map t11;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AggregatedAllAnalyticsLogger.ListingsPageSource a11 = AggregatedAllAnalyticsLogger.ListingsPageSource.Companion.a(listingsTypes);
        if (a11 != null) {
            linkedHashMap.put(AggregatedAllAnalyticsLogger.CustomParameterName.PAGE_NAME.getValue(), a11.getValue());
        }
        if (categoryEntity != null && (v11 = aggregatedAllAnalyticsLogger.v(categoryEntity)) != null) {
            t11 = j0.t(v11);
            linkedHashMap.putAll(t11);
        }
        j0.r(linkedHashMap, aggregatedAllAnalyticsLogger.Z());
        if (map != null) {
            if (!map.isEmpty()) {
                map2 = map;
            } else {
                map2 = null;
            }
            if (map2 != null) {
                linkedHashMap.putAll(map2);
            }
        }
        AggregatedAllAnalyticsLogger.h(aggregatedAllAnalyticsLogger, AggregatedAllAnalyticsLogger.CustomEvents.PULL_TO_REFRESH.getValue(), linkedHashMap, null, null, null, true, true, false, false, 412, null);
        return p.f75480a;
    }

    private static final ListingsPageMode g(ListingsIntention listingsIntention, boolean z11) {
        boolean p11 = p(listingsIntention, z11);
        if (p11) {
            return ListingsPageMode.SEARCH;
        }
        if (!p11) {
            return ListingsPageMode.LISTINGS;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ Object g0(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, ListingsTypes listingsTypes, Map map, CategoryEntity categoryEntity, zz.a aVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            map = null;
        }
        if ((i11 & 4) != 0) {
            categoryEntity = null;
        }
        return f0(aggregatedAllAnalyticsLogger, listingsTypes, map, categoryEntity, aVar);
    }

    public static final Map<String, String> h(ListingsIntention listingsIntention, Boolean bool, boolean z11) {
        String value;
        boolean z12;
        Map<String, String> f11;
        if (z11) {
            value = AggregatedAllAnalyticsLogger.CustomParameterName.SOURCE_PAGE_MODE.getValue();
        } else {
            value = AggregatedAllAnalyticsLogger.CustomParameterName.PAGE_MODE.getValue();
        }
        if (bool != null) {
            z12 = bool.booleanValue();
        } else {
            z12 = false;
        }
        f11 = i0.f(wz.i.a(value, g(listingsIntention, z12).getValue()));
        return f11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x01ab, code lost:
        r1 = kotlin.collections.i0.f(wz.i.a(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.SOURCE_SECTION_NAME.getValue(), r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x021a, code lost:
        if (r1 == null) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0175 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h0(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r19, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomEvents r20, com.forsale.app.datalayer.database.CategoryEntity r21, com.forsale.app.datalayer.database.DistrictEntity r22, int r23, int r24, java.util.Map<java.lang.String, ? extends java.lang.Object> r25, com.forsale.app.features.categories.listings.category.CategoryListingsAnalyticSource r26, int r27, int r28, com.forsale.app.features.search.SearchAnalyticsData r29, com.forsale.app.features.categories.listings.SortingStates r30, com.forsale.app.features.categories.listings.ListingsIntention r31, zz.a<? super wz.p> r32) {
        /*
            Method dump skipped, instructions count: 656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt.h0(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomEvents, com.forsale.app.datalayer.database.CategoryEntity, com.forsale.app.datalayer.database.DistrictEntity, int, int, java.util.Map, com.forsale.app.features.categories.listings.category.CategoryListingsAnalyticSource, int, int, com.forsale.app.features.search.SearchAnalyticsData, com.forsale.app.features.categories.listings.SortingStates, com.forsale.app.features.categories.listings.ListingsIntention, zz.a):java.lang.Object");
    }

    static /* synthetic */ Map i(ListingsIntention listingsIntention, Boolean bool, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            bool = Boolean.FALSE;
        }
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return h(listingsIntention, bool, z11);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0126 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i0(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r15, com.forsale.app.datalayer.database.CategoryEntity r16, com.forsale.app.datalayer.database.DistrictEntity r17, int r18, int r19, int r20, int r21, java.util.Map<java.lang.String, ? extends java.lang.Object> r22, int r23, zz.a<? super wz.p> r24) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt.i0(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger, com.forsale.app.datalayer.database.CategoryEntity, com.forsale.app.datalayer.database.DistrictEntity, int, int, int, int, java.util.Map, int, zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r6, com.forsale.app.datalayer.database.CategoryEntity r7, java.lang.Integer r8, java.util.List<java.lang.Integer> r9, java.util.Map<java.lang.String, ? extends java.lang.Object> r10, zz.a<? super java.util.Map<java.lang.String, ? extends java.lang.Object>> r11) {
        /*
            boolean r0 = r11 instanceof com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt$getListingsCommonParameters$1
            if (r0 == 0) goto L13
            r0 = r11
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt$getListingsCommonParameters$1 r0 = (com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt$getListingsCommonParameters$1) r0
            int r1 = r0.f39815f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39815f = r1
            goto L18
        L13:
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt$getListingsCommonParameters$1 r0 = new com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt$getListingsCommonParameters$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f39814e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f39815f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L54
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r6 = r0.f39811b
            java.util.Map r6 = (java.util.Map) r6
            java.lang.Object r7 = r0.f39810a
            java.util.Map r7 = (java.util.Map) r7
            kotlin.f.b(r11)
            goto L9d
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            java.lang.Object r6 = r0.f39813d
            java.util.Map r6 = (java.util.Map) r6
            java.lang.Object r7 = r0.f39812c
            r10 = r7
            java.util.Map r10 = (java.util.Map) r10
            java.lang.Object r7 = r0.f39811b
            r9 = r7
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r7 = r0.f39810a
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r7 = (com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger) r7
            kotlin.f.b(r11)
            r2 = r10
            goto L71
        L54:
            kotlin.f.b(r11)
            java.util.Map r11 = kotlin.collections.g0.h()
            r0.f39810a = r6
            r0.f39811b = r9
            r0.f39812c = r10
            r0.f39813d = r11
            r0.f39815f = r4
            java.lang.Object r7 = r6.t(r7, r8, r0)
            if (r7 != r1) goto L6c
            return r1
        L6c:
            r2 = r10
            r5 = r7
            r7 = r6
            r6 = r11
            r11 = r5
        L71:
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Map r6 = kotlin.collections.g0.n(r6, r11)
            java.util.List r8 = r7.Z()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Map r4 = kotlin.collections.g0.n(r6, r8)
            if (r9 == 0) goto La3
            r8 = 0
            r10 = 2
            r11 = 0
            r0.f39810a = r2
            r0.f39811b = r4
            r6 = 0
            r0.f39812c = r6
            r0.f39813d = r6
            r0.f39815f = r3
            r6 = r7
            r7 = r9
            r9 = r0
            java.lang.Object r11 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.B(r6, r7, r8, r9, r10, r11)
            if (r11 != r1) goto L9b
            return r1
        L9b:
            r7 = r2
            r6 = r4
        L9d:
            java.util.Map r11 = (java.util.Map) r11
            if (r11 != 0) goto La9
            r4 = r6
            r2 = r7
        La3:
            java.util.Map r11 = kotlin.collections.g0.h()
            r7 = r2
            r6 = r4
        La9:
            java.util.Map r6 = kotlin.collections.g0.o(r6, r11)
            java.util.Map r6 = kotlin.collections.g0.o(r6, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt.j(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger, com.forsale.app.datalayer.database.CategoryEntity, java.lang.Integer, java.util.List, java.util.Map, zz.a):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
        if (r1 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j0(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r14, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomEvents r15, java.lang.Integer r16, boolean r17, boolean r18, zz.a<? super wz.p> r19) {
        /*
            java.util.Map r0 = kotlin.collections.g0.h()
            java.util.List r1 = r14.Z()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Map r0 = kotlin.collections.g0.n(r0, r1)
            if (r16 == 0) goto L28
            int r1 = r16.intValue()
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomParameterName r2 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.LISTINGS_COUNT
            java.lang.String r2 = r2.getValue()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            kotlin.Pair r1 = wz.i.a(r2, r1)
            java.util.Map r1 = kotlin.collections.g0.f(r1)
            if (r1 != 0) goto L2c
        L28:
            java.util.Map r1 = kotlin.collections.g0.h()
        L2c:
            java.util.Map r4 = kotlin.collections.g0.o(r0, r1)
            java.lang.String r3 = r15.getValue()
            r5 = 0
            r6 = 0
            r7 = 0
            r10 = 0
            r11 = 0
            r12 = 412(0x19c, float:5.77E-43)
            r13 = 0
            r2 = r14
            r8 = r17
            r9 = r18
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.h(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            wz.p r0 = wz.p.f75480a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt.j0(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomEvents, java.lang.Integer, boolean, boolean, zz.a):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x000a, code lost:
        r2 = kotlin.collections.i0.f(wz.i.a(com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData.PARAMS.SOURCE_SEARCH_KEYWORD.getValue(), r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x003e, code lost:
        if (r2 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
        if (r2 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0074, code lost:
        r1 = kotlin.collections.i0.f(wz.i.a(com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData.PARAMS.SEARCH_SOURCE.getValue(), r1.getValue()));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r0, com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData r1, com.forsale.app.utils.analytics.ListingsPageMode r2, zz.a<? super java.util.Map<java.lang.String, ? extends java.lang.Object>> r3) {
        /*
            java.util.Map r0 = kotlin.collections.g0.h()
            java.lang.String r2 = r1.c()
            if (r2 == 0) goto L1a
            com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData$PARAMS r3 = com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData.PARAMS.SOURCE_SEARCH_KEYWORD
            java.lang.String r3 = r3.getValue()
            kotlin.Pair r2 = wz.i.a(r3, r2)
            java.util.Map r2 = kotlin.collections.g0.f(r2)
            if (r2 != 0) goto L1e
        L1a:
            java.util.Map r2 = kotlin.collections.g0.h()
        L1e:
            java.util.Map r0 = kotlin.collections.g0.o(r0, r2)
            java.lang.Integer r2 = r1.d()
            if (r2 == 0) goto L40
            int r2 = r2.intValue()
            com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData$PARAMS r3 = com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData.PARAMS.SOURCE_SEARCH_KEYWORD_CHAR_COUNT
            java.lang.String r3 = r3.getValue()
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.a.d(r2)
            kotlin.Pair r2 = wz.i.a(r3, r2)
            java.util.Map r2 = kotlin.collections.g0.f(r2)
            if (r2 != 0) goto L44
        L40:
            java.util.Map r2 = kotlin.collections.g0.h()
        L44:
            java.util.Map r0 = kotlin.collections.g0.o(r0, r2)
            java.lang.Integer r2 = r1.e()
            if (r2 == 0) goto L66
            int r2 = r2.intValue()
            com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData$PARAMS r3 = com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData.PARAMS.SOURCE_SEARCH_KEYWORD_ORDER
            java.lang.String r3 = r3.getValue()
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.a.d(r2)
            kotlin.Pair r2 = wz.i.a(r3, r2)
            java.util.Map r2 = kotlin.collections.g0.f(r2)
            if (r2 != 0) goto L6a
        L66:
            java.util.Map r2 = kotlin.collections.g0.h()
        L6a:
            java.util.Map r0 = kotlin.collections.g0.o(r0, r2)
            com.forsale.app.features.search.SearchAnalyticsData$SearchSource r1 = r1.b()
            if (r1 == 0) goto L88
            com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData$PARAMS r2 = com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData.PARAMS.SEARCH_SOURCE
            java.lang.String r2 = r2.getValue()
            java.lang.String r1 = r1.getValue()
            kotlin.Pair r1 = wz.i.a(r2, r1)
            java.util.Map r1 = kotlin.collections.g0.f(r1)
            if (r1 != 0) goto L8c
        L88:
            java.util.Map r1 = kotlin.collections.g0.h()
        L8c:
            java.util.Map r0 = kotlin.collections.g0.o(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt.k(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger, com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData, com.forsale.app.utils.analytics.ListingsPageMode, zz.a):java.lang.Object");
    }

    public static final Object k0(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, ListingsTypes listingsTypes, Map<String, ? extends Object> map, CategoryEntity categoryEntity, zz.a<? super p> aVar) {
        Map<String, ? extends Object> map2;
        List<Pair<String, String>> v11;
        Map t11;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AggregatedAllAnalyticsLogger.ListingsPageSource a11 = AggregatedAllAnalyticsLogger.ListingsPageSource.Companion.a(listingsTypes);
        if (a11 != null) {
            linkedHashMap.put(AggregatedAllAnalyticsLogger.CustomParameterName.PAGE_NAME.getValue(), a11.getValue());
        }
        if (categoryEntity != null && (v11 = aggregatedAllAnalyticsLogger.v(categoryEntity)) != null) {
            t11 = j0.t(v11);
            linkedHashMap.putAll(t11);
        }
        j0.r(linkedHashMap, aggregatedAllAnalyticsLogger.Z());
        if (map != null) {
            if (!map.isEmpty()) {
                map2 = map;
            } else {
                map2 = null;
            }
            if (map2 != null) {
                linkedHashMap.putAll(map2);
            }
        }
        AggregatedAllAnalyticsLogger.h(aggregatedAllAnalyticsLogger, AggregatedAllAnalyticsLogger.CustomEvents.UP_BUTTON_CLICKED.getValue(), linkedHashMap, null, null, null, true, true, false, false, 412, null);
        return p.f75480a;
    }

    public static /* synthetic */ Object l(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, ListingDetailsSearchAnalyticsData listingDetailsSearchAnalyticsData, ListingsPageMode listingsPageMode, zz.a aVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            listingsPageMode = ListingsPageMode.LISTINGS;
        }
        return k(aggregatedAllAnalyticsLogger, listingDetailsSearchAnalyticsData, listingsPageMode, aVar);
    }

    public static /* synthetic */ Object l0(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, ListingsTypes listingsTypes, Map map, CategoryEntity categoryEntity, zz.a aVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            map = null;
        }
        if ((i11 & 4) != 0) {
            categoryEntity = null;
        }
        return k0(aggregatedAllAnalyticsLogger, listingsTypes, map, categoryEntity, aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x000a, code lost:
        r2 = kotlin.collections.i0.f(wz.i.a(com.forsale.app.features.search.SearchAnalyticsData.PARAMS.KEYWORD.getValue(), r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x003e, code lost:
        if (r2 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x004e, code lost:
        r2 = kotlin.collections.i0.f(wz.i.a(com.forsale.app.features.search.SearchAnalyticsData.PARAMS.TYPED_KEYWORD.getValue(), r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0082, code lost:
        if (r2 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00a8, code lost:
        if (r2 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00b8, code lost:
        r2 = kotlin.collections.i0.f(wz.i.a(com.forsale.app.features.search.SearchAnalyticsData.PARAMS.KEYWORD_CATEGORY_NAME.getValue(), r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00ec, code lost:
        if (r2 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0112, code lost:
        if (r2 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0122, code lost:
        r1 = kotlin.collections.i0.f(wz.i.a(com.forsale.app.features.search.SearchAnalyticsData.PARAMS.SEARCH_SOURCE.getValue(), r1.getValue()));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r0, com.forsale.app.features.search.SearchAnalyticsData r1, com.forsale.app.features.categories.listings.ListingsIntention r2, zz.a<? super java.util.Map<java.lang.String, ? extends java.lang.Object>> r3) {
        /*
            java.util.Map r0 = kotlin.collections.g0.h()
            java.lang.String r2 = r1.a()
            if (r2 == 0) goto L1a
            com.forsale.app.features.search.SearchAnalyticsData$PARAMS r3 = com.forsale.app.features.search.SearchAnalyticsData.PARAMS.KEYWORD
            java.lang.String r3 = r3.getValue()
            kotlin.Pair r2 = wz.i.a(r3, r2)
            java.util.Map r2 = kotlin.collections.g0.f(r2)
            if (r2 != 0) goto L1e
        L1a:
            java.util.Map r2 = kotlin.collections.g0.h()
        L1e:
            java.util.Map r0 = kotlin.collections.g0.o(r0, r2)
            java.lang.Integer r2 = r1.d()
            if (r2 == 0) goto L40
            int r2 = r2.intValue()
            com.forsale.app.features.search.SearchAnalyticsData$PARAMS r3 = com.forsale.app.features.search.SearchAnalyticsData.PARAMS.KEYWORD_CHAR_COUNT
            java.lang.String r3 = r3.getValue()
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.a.d(r2)
            kotlin.Pair r2 = wz.i.a(r3, r2)
            java.util.Map r2 = kotlin.collections.g0.f(r2)
            if (r2 != 0) goto L44
        L40:
            java.util.Map r2 = kotlin.collections.g0.h()
        L44:
            java.util.Map r0 = kotlin.collections.g0.o(r0, r2)
            java.lang.String r2 = r1.h()
            if (r2 == 0) goto L5e
            com.forsale.app.features.search.SearchAnalyticsData$PARAMS r3 = com.forsale.app.features.search.SearchAnalyticsData.PARAMS.TYPED_KEYWORD
            java.lang.String r3 = r3.getValue()
            kotlin.Pair r2 = wz.i.a(r3, r2)
            java.util.Map r2 = kotlin.collections.g0.f(r2)
            if (r2 != 0) goto L62
        L5e:
            java.util.Map r2 = kotlin.collections.g0.h()
        L62:
            java.util.Map r0 = kotlin.collections.g0.o(r0, r2)
            java.lang.Integer r2 = r1.i()
            if (r2 == 0) goto L84
            int r2 = r2.intValue()
            com.forsale.app.features.search.SearchAnalyticsData$PARAMS r3 = com.forsale.app.features.search.SearchAnalyticsData.PARAMS.TYPED_KEYWORD_CHAR_COUNT
            java.lang.String r3 = r3.getValue()
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.a.d(r2)
            kotlin.Pair r2 = wz.i.a(r3, r2)
            java.util.Map r2 = kotlin.collections.g0.f(r2)
            if (r2 != 0) goto L88
        L84:
            java.util.Map r2 = kotlin.collections.g0.h()
        L88:
            java.util.Map r0 = kotlin.collections.g0.o(r0, r2)
            java.lang.Integer r2 = r1.b()
            if (r2 == 0) goto Laa
            int r2 = r2.intValue()
            com.forsale.app.features.search.SearchAnalyticsData$PARAMS r3 = com.forsale.app.features.search.SearchAnalyticsData.PARAMS.KEYWORD_CATEGORY_ID
            java.lang.String r3 = r3.getValue()
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.a.d(r2)
            kotlin.Pair r2 = wz.i.a(r3, r2)
            java.util.Map r2 = kotlin.collections.g0.f(r2)
            if (r2 != 0) goto Lae
        Laa:
            java.util.Map r2 = kotlin.collections.g0.h()
        Lae:
            java.util.Map r0 = kotlin.collections.g0.o(r0, r2)
            java.lang.String r2 = r1.c()
            if (r2 == 0) goto Lc8
            com.forsale.app.features.search.SearchAnalyticsData$PARAMS r3 = com.forsale.app.features.search.SearchAnalyticsData.PARAMS.KEYWORD_CATEGORY_NAME
            java.lang.String r3 = r3.getValue()
            kotlin.Pair r2 = wz.i.a(r3, r2)
            java.util.Map r2 = kotlin.collections.g0.f(r2)
            if (r2 != 0) goto Lcc
        Lc8:
            java.util.Map r2 = kotlin.collections.g0.h()
        Lcc:
            java.util.Map r0 = kotlin.collections.g0.o(r0, r2)
            java.lang.Integer r2 = r1.f()
            if (r2 == 0) goto Lee
            int r2 = r2.intValue()
            com.forsale.app.features.search.SearchAnalyticsData$PARAMS r3 = com.forsale.app.features.search.SearchAnalyticsData.PARAMS.SELECTED_KEYWORD_ORDER
            java.lang.String r3 = r3.getValue()
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.a.d(r2)
            kotlin.Pair r2 = wz.i.a(r3, r2)
            java.util.Map r2 = kotlin.collections.g0.f(r2)
            if (r2 != 0) goto Lf2
        Lee:
            java.util.Map r2 = kotlin.collections.g0.h()
        Lf2:
            java.util.Map r0 = kotlin.collections.g0.o(r0, r2)
            java.lang.Integer r2 = r1.g()
            if (r2 == 0) goto L114
            int r2 = r2.intValue()
            com.forsale.app.features.search.SearchAnalyticsData$PARAMS r3 = com.forsale.app.features.search.SearchAnalyticsData.PARAMS.SUGGESTED_KEYWORDS_COUNT
            java.lang.String r3 = r3.getValue()
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.a.d(r2)
            kotlin.Pair r2 = wz.i.a(r3, r2)
            java.util.Map r2 = kotlin.collections.g0.f(r2)
            if (r2 != 0) goto L118
        L114:
            java.util.Map r2 = kotlin.collections.g0.h()
        L118:
            java.util.Map r0 = kotlin.collections.g0.o(r0, r2)
            com.forsale.app.features.search.SearchAnalyticsData$SearchSource r1 = r1.e()
            if (r1 == 0) goto L136
            com.forsale.app.features.search.SearchAnalyticsData$PARAMS r2 = com.forsale.app.features.search.SearchAnalyticsData.PARAMS.SEARCH_SOURCE
            java.lang.String r2 = r2.getValue()
            java.lang.String r1 = r1.getValue()
            kotlin.Pair r1 = wz.i.a(r2, r1)
            java.util.Map r1 = kotlin.collections.g0.f(r1)
            if (r1 != 0) goto L13a
        L136:
            java.util.Map r1 = kotlin.collections.g0.h()
        L13a:
            java.util.Map r0 = kotlin.collections.g0.o(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt.m(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger, com.forsale.app.features.search.SearchAnalyticsData, com.forsale.app.features.categories.listings.ListingsIntention, zz.a):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0014, code lost:
        r0 = kotlin.collections.i0.f(wz.i.a(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.SOURCE.getValue(), r16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0044, code lost:
        if (r2 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
        r1 = kotlin.collections.i0.f(wz.i.a(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.STATUS.getValue(), r18));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m0(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r14, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.ListingsVisitedEvents r15, java.lang.String r16, java.lang.Integer r17, java.lang.String r18, boolean r19, boolean r20, zz.a<? super wz.p> r21) {
        /*
            r0 = r16
            r1 = r18
            java.util.Map r2 = kotlin.collections.g0.h()
            java.util.List r3 = r14.Z()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Map r2 = kotlin.collections.g0.n(r2, r3)
            if (r0 == 0) goto L24
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomParameterName r3 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.SOURCE
            java.lang.String r3 = r3.getValue()
            kotlin.Pair r0 = wz.i.a(r3, r0)
            java.util.Map r0 = kotlin.collections.g0.f(r0)
            if (r0 != 0) goto L28
        L24:
            java.util.Map r0 = kotlin.collections.g0.h()
        L28:
            java.util.Map r0 = kotlin.collections.g0.o(r2, r0)
            if (r17 == 0) goto L46
            int r2 = r17.intValue()
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomParameterName r3 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.LISTINGS_COUNT
            java.lang.String r3 = r3.getValue()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            kotlin.Pair r2 = wz.i.a(r3, r2)
            java.util.Map r2 = kotlin.collections.g0.f(r2)
            if (r2 != 0) goto L4a
        L46:
            java.util.Map r2 = kotlin.collections.g0.h()
        L4a:
            java.util.Map r0 = kotlin.collections.g0.o(r0, r2)
            if (r1 == 0) goto L60
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomParameterName r2 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.STATUS
            java.lang.String r2 = r2.getValue()
            kotlin.Pair r1 = wz.i.a(r2, r1)
            java.util.Map r1 = kotlin.collections.g0.f(r1)
            if (r1 != 0) goto L64
        L60:
            java.util.Map r1 = kotlin.collections.g0.h()
        L64:
            java.util.Map r4 = kotlin.collections.g0.o(r0, r1)
            java.lang.String r3 = r15.getValue()
            r5 = 0
            r6 = 0
            r7 = 0
            r10 = 0
            r11 = 0
            r12 = 412(0x19c, float:5.77E-43)
            r13 = 0
            r2 = r14
            r8 = r19
            r9 = r20
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.h(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            wz.p r0 = wz.p.f75480a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt.m0(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$ListingsVisitedEvents, java.lang.String, java.lang.Integer, java.lang.String, boolean, boolean, zz.a):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0023, code lost:
        r3 = kotlin.collections.i0.f(wz.i.a(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.SOURCE_SECTION_NAME.getValue(), r3));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Map<java.lang.String, java.lang.Object> n(com.forsale.app.features.categories.normal.SubCategoryAnalyticsSource r3) {
        /*
            if (r3 != 0) goto L7
            java.util.Map r3 = kotlin.collections.g0.h()
            return r3
        L7:
            java.util.Map r0 = kotlin.collections.g0.h()
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomParameterName r1 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.SOURCE
            java.lang.String r1 = r1.getValue()
            java.lang.String r2 = r3.a()
            kotlin.Pair r1 = wz.i.a(r1, r2)
            java.util.Map r0 = kotlin.collections.g0.p(r0, r1)
            java.lang.String r3 = r3.b()
            if (r3 == 0) goto L33
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomParameterName r1 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.SOURCE_SECTION_NAME
            java.lang.String r1 = r1.getValue()
            kotlin.Pair r3 = wz.i.a(r1, r3)
            java.util.Map r3 = kotlin.collections.g0.f(r3)
            if (r3 != 0) goto L37
        L33:
            java.util.Map r3 = kotlin.collections.g0.h()
        L37:
            java.util.Map r3 = kotlin.collections.g0.o(r0, r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt.n(com.forsale.app.features.categories.normal.SubCategoryAnalyticsSource):java.util.Map");
    }

    public static final void n0(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, MyListingAnalyticsType analyticsType, int i11) {
        Map h11;
        Map o11;
        Map p11;
        o.i(aggregatedAllAnalyticsLogger, "<this>");
        o.i(analyticsType, "analyticsType");
        h11 = j0.h();
        o11 = j0.o(h11, aggregatedAllAnalyticsLogger.l(i11));
        p11 = j0.p(o11, wz.i.a(AggregatedAllAnalyticsLogger.CustomParameterName.ANALYTICS_TYPE.getValue(), analyticsType.getValue()));
        AggregatedAllAnalyticsLogger.h(aggregatedAllAnalyticsLogger, AggregatedAllAnalyticsLogger.CustomEvents.MY_LISTING_ANALYTICS_VISITED.getValue(), p11, null, null, null, false, false, false, false, 508, null);
    }

    public static final Object o(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, String str, Integer num, String str2, String str3, Integer num2, zz.a<? super p> aVar) {
        Object f11;
        Object f12;
        Object f13;
        if (num != null && str2 != null && str3 != null && num2 != null) {
            if (o.d(str, AnalyticsEvents.BANNER_ACTION_VIDEO_UNMUTED.getValue())) {
                Object q11 = q(aggregatedAllAnalyticsLogger, AggregatedAllAnalyticsLogger.AdServerEvents.BANNER_ACTION_VIDEO_UNMUTED, num.intValue(), str2, str3, num2.intValue(), aVar);
                f13 = kotlin.coroutines.intrinsics.b.f();
                if (q11 == f13) {
                    return q11;
                }
                return p.f75480a;
            } else if (o.d(str, AnalyticsEvents.BANNER_ACTION_URL_CLICKED.getValue())) {
                Object q12 = q(aggregatedAllAnalyticsLogger, AggregatedAllAnalyticsLogger.AdServerEvents.BANNER_ACTION_URL_CLICKED, num.intValue(), str2, str3, num2.intValue(), aVar);
                f12 = kotlin.coroutines.intrinsics.b.f();
                if (q12 == f12) {
                    return q12;
                }
                return p.f75480a;
            } else if (o.d(str, AnalyticsEvents.BANNER_ACTION_LIKED.getValue())) {
                Object q13 = q(aggregatedAllAnalyticsLogger, AggregatedAllAnalyticsLogger.AdServerEvents.BANNER_ACTION_LIKED, num.intValue(), str2, str3, num2.intValue(), aVar);
                f11 = kotlin.coroutines.intrinsics.b.f();
                if (q13 == f11) {
                    return q13;
                }
                return p.f75480a;
            }
        }
        return p.f75480a;
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0083  */
    /* JADX WARN: Type inference failed for: r1v11, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v13, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v15, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v17, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v20, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v9, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v30, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v7, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v9, types: [T, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o0(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r18, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.MyListingActionEvents r19, com.forsale.app.datalayer.network.responses.ListingItemDetails r20, java.lang.String r21, boolean r22, boolean r23, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.AnalyticsPosition r24, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.AnalyticsOnOffStatus r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.util.List<java.lang.String> r29, java.util.List<java.lang.String> r30, kotlin.Pair<java.lang.String, java.lang.String>[] r31, zz.a<? super wz.p> r32) {
        /*
            Method dump skipped, instructions count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt.o0(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$MyListingActionEvents, com.forsale.app.datalayer.network.responses.ListingItemDetails, java.lang.String, boolean, boolean, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$AnalyticsPosition, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$AnalyticsOnOffStatus, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, kotlin.Pair[], zz.a):java.lang.Object");
    }

    private static final boolean p(ListingsIntention listingsIntention, boolean z11) {
        if (listingsIntention != ListingsIntention.SEARCH && !z11) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ Object p0(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, AggregatedAllAnalyticsLogger.MyListingActionEvents myListingActionEvents, ListingItemDetails listingItemDetails, String str, boolean z11, boolean z12, AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition, AggregatedAllAnalyticsLogger.AnalyticsOnOffStatus analyticsOnOffStatus, String str2, String str3, String str4, List list, List list2, Pair[] pairArr, zz.a aVar, int i11, Object obj) {
        boolean z13;
        boolean z14;
        AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition2;
        AggregatedAllAnalyticsLogger.AnalyticsOnOffStatus analyticsOnOffStatus2;
        String str5;
        String str6;
        String str7;
        List list3;
        List list4;
        Pair[] pairArr2;
        if ((i11 & 8) != 0) {
            z13 = false;
        } else {
            z13 = z11;
        }
        if ((i11 & 16) != 0) {
            z14 = false;
        } else {
            z14 = z12;
        }
        if ((i11 & 32) != 0) {
            analyticsPosition2 = null;
        } else {
            analyticsPosition2 = analyticsPosition;
        }
        if ((i11 & 64) != 0) {
            analyticsOnOffStatus2 = null;
        } else {
            analyticsOnOffStatus2 = analyticsOnOffStatus;
        }
        if ((i11 & 128) != 0) {
            str5 = null;
        } else {
            str5 = str2;
        }
        if ((i11 & 256) != 0) {
            str6 = null;
        } else {
            str6 = str3;
        }
        if ((i11 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
            str7 = null;
        } else {
            str7 = str4;
        }
        if ((i11 & 1024) != 0) {
            list3 = null;
        } else {
            list3 = list;
        }
        if ((i11 & RecyclerView.l.FLAG_MOVED) != 0) {
            list4 = null;
        } else {
            list4 = list2;
        }
        if ((i11 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            pairArr2 = new Pair[0];
        } else {
            pairArr2 = pairArr;
        }
        return o0(aggregatedAllAnalyticsLogger, myListingActionEvents, listingItemDetails, str, z13, z14, analyticsPosition2, analyticsOnOffStatus2, str5, str6, str7, list3, list4, pairArr2, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object q(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r16, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.AdServerEvents r17, int r18, java.lang.String r19, java.lang.String r20, int r21, zz.a<? super wz.p> r22) {
        /*
            r0 = r16
            r1 = r22
            boolean r2 = r1 instanceof com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt$logAdServerBannerEvent$1
            if (r2 == 0) goto L17
            r2 = r1
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt$logAdServerBannerEvent$1 r2 = (com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt$logAdServerBannerEvent$1) r2
            int r3 = r2.f39820e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f39820e = r3
            goto L1c
        L17:
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt$logAdServerBannerEvent$1 r2 = new com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt$logAdServerBannerEvent$1
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.f39819d
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.f()
            int r4 = r2.f39820e
            r5 = 1
            if (r4 == 0) goto L42
            if (r4 != r5) goto L3a
            java.lang.Object r0 = r2.f39818c
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r3 = r2.f39817b
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$AdServerEvents r3 = (com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.AdServerEvents) r3
            java.lang.Object r2 = r2.f39816a
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r2 = (com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger) r2
            kotlin.f.b(r1)
            r4 = r2
            goto L95
        L3a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L42:
            kotlin.f.b(r1)
            r1 = 3
            kotlin.Pair[] r1 = new kotlin.Pair[r1]
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomParameterName r4 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.BANNER_ID
            java.lang.String r4 = r4.getValue()
            java.lang.String r6 = java.lang.String.valueOf(r18)
            kotlin.Pair r4 = wz.i.a(r4, r6)
            r6 = 0
            r1[r6] = r4
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomParameterName r4 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.BANNER_TYPE
            java.lang.String r4 = r4.getValue()
            java.lang.String r6 = r19.toString()
            kotlin.Pair r4 = wz.i.a(r4, r6)
            r1[r5] = r4
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomParameterName r4 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.BANNER_SCREEN
            java.lang.String r4 = r4.getValue()
            java.lang.String r6 = r20.toString()
            kotlin.Pair r4 = wz.i.a(r4, r6)
            r6 = 2
            r1[r6] = r4
            java.util.Map r1 = kotlin.collections.g0.k(r1)
            r2.f39816a = r0
            r4 = r17
            r2.f39817b = r4
            r2.f39818c = r1
            r2.f39820e = r5
            r5 = r21
            java.lang.Object r2 = r0.s(r5, r2)
            if (r2 != r3) goto L91
            return r3
        L91:
            r3 = r4
            r4 = r0
            r0 = r1
            r1 = r2
        L95:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Map r6 = kotlin.collections.g0.n(r0, r1)
            java.lang.String r5 = r3.getValue()
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 508(0x1fc, float:7.12E-43)
            r15 = 0
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.h(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            wz.p r0 = wz.p.f75480a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt.q(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$AdServerEvents, int, java.lang.String, java.lang.String, int, zz.a):java.lang.Object");
    }

    public static final void q0(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, boolean z11, boolean z12) {
        Map h11;
        o.i(aggregatedAllAnalyticsLogger, "<this>");
        String value = AggregatedAllAnalyticsLogger.CustomEvents.MY_PROFILE_CHAT_VISITED.getValue();
        h11 = j0.h();
        AggregatedAllAnalyticsLogger.h(aggregatedAllAnalyticsLogger, value, h11, null, null, null, z11, z12, false, false, 412, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x007b, code lost:
        r5 = kotlin.collections.i0.f(wz.i.a(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.PLF_SOURCE.getValue(), r27.getValue()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0121, code lost:
        if (r8 == null) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0147 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object r(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r25, com.forsale.app.datalayer.network.entities.ListingDetailsEntity r26, com.forsale.app.utils.analytics.PLFSource r27, com.forsale.app.utils.analytics.PaymentMethod r28, com.forsale.app.utils.analytics.PaymentMethod r29, boolean r30, qf.c r31, zz.a<? super wz.p> r32) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt.r(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger, com.forsale.app.datalayer.network.entities.ListingDetailsEntity, com.forsale.app.utils.analytics.PLFSource, com.forsale.app.utils.analytics.PaymentMethod, com.forsale.app.utils.analytics.PaymentMethod, boolean, qf.c, zz.a):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0009, code lost:
        r0 = kotlin.collections.j0.t(r14.v(r16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0047, code lost:
        if (r1 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0053, code lost:
        r1 = kotlin.collections.i0.f(wz.i.a(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.SCREEN_NAME.getValue(), r18.a()));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object r0(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r14, com.forsale.app.utils.analytics.CreateEditAdvActionType r15, com.forsale.app.datalayer.database.CategoryEntity r16, int r17, com.forsale.app.utils.analytics.l r18, zz.a<? super wz.p> r19) {
        /*
            r0 = r16
            java.util.Map r1 = kotlin.collections.g0.h()
            r2 = r14
            if (r0 == 0) goto L15
            java.util.List r0 = r14.v(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Map r0 = kotlin.collections.g0.t(r0)
            if (r0 != 0) goto L19
        L15:
            java.util.Map r0 = kotlin.collections.g0.h()
        L19:
            java.util.Map r0 = kotlin.collections.g0.o(r1, r0)
            java.lang.Integer r1 = kotlin.coroutines.jvm.internal.a.d(r17)
            int r3 = r1.intValue()
            r4 = -1
            if (r3 != r4) goto L2a
            r3 = 1
            goto L2b
        L2a:
            r3 = 0
        L2b:
            if (r3 != 0) goto L2e
            goto L2f
        L2e:
            r1 = 0
        L2f:
            if (r1 == 0) goto L49
            int r1 = r1.intValue()
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomParameterName r3 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.LISTING_ID
            java.lang.String r3 = r3.getValue()
            java.lang.Integer r1 = kotlin.coroutines.jvm.internal.a.d(r1)
            kotlin.Pair r1 = wz.i.a(r3, r1)
            java.util.Map r1 = kotlin.collections.g0.f(r1)
            if (r1 != 0) goto L4d
        L49:
            java.util.Map r1 = kotlin.collections.g0.h()
        L4d:
            java.util.Map r0 = kotlin.collections.g0.o(r0, r1)
            if (r18 == 0) goto L67
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomParameterName r1 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.SCREEN_NAME
            java.lang.String r1 = r1.getValue()
            java.lang.String r3 = r18.a()
            kotlin.Pair r1 = wz.i.a(r1, r3)
            java.util.Map r1 = kotlin.collections.g0.f(r1)
            if (r1 != 0) goto L6b
        L67:
            java.util.Map r1 = kotlin.collections.g0.h()
        L6b:
            java.util.Map r4 = kotlin.collections.g0.o(r0, r1)
            java.lang.String r3 = r15.getValue()
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 1
            r9 = 1
            r10 = 0
            r11 = 0
            r12 = 412(0x19c, float:5.77E-43)
            r13 = 0
            r2 = r14
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.h(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            wz.p r0 = wz.p.f75480a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt.r0(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger, com.forsale.app.utils.analytics.CreateEditAdvActionType, com.forsale.app.datalayer.database.CategoryEntity, int, com.forsale.app.utils.analytics.l, zz.a):java.lang.Object");
    }

    public static final void s(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, String addonName) {
        Map h11;
        Map f11;
        Map o11;
        o.i(aggregatedAllAnalyticsLogger, "<this>");
        o.i(addonName, "addonName");
        h11 = j0.h();
        f11 = i0.f(wz.i.a(AggregatedAllAnalyticsLogger.CustomParameterName.ADD_ON_NAME.getValue(), addonName));
        o11 = j0.o(h11, f11);
        AggregatedAllAnalyticsLogger.h(aggregatedAllAnalyticsLogger, AggregatedAllAnalyticsLogger.CustomEvents.ADDONS_HELP_VISITED.getValue(), o11, null, null, null, false, false, false, false, 508, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0029, code lost:
        if (r2 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0035, code lost:
        r2 = kotlin.collections.i0.f(wz.i.a(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.MEDIA_TYPE.getValue(), r16.getValue()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0087, code lost:
        if (r2 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0093, code lost:
        r2 = kotlin.collections.i0.f(wz.i.a(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.SCREEN_NAME.getValue(), r17.a()));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s0(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r13, com.forsale.app.utils.analytics.CreateEditAdvActionType r14, com.forsale.app.datalayer.network.entities.ListingDetailsEntity r15, com.forsale.app.utils.analytics.PLFMediaTypes r16, com.forsale.app.utils.analytics.l.a r17, java.lang.Boolean r18, zz.a<? super wz.p> r19) {
        /*
            com.forsale.app.datalayer.database.CategoryEntity r0 = r15.getCategory()
            if (r0 == 0) goto Lc1
            r1 = r13
            java.util.List r0 = r13.v(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Map r0 = kotlin.collections.g0.t(r0)
            if (r18 == 0) goto L2b
            boolean r2 = r18.booleanValue()
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomParameterName r3 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.IS_NEW_LISTING
            java.lang.String r3 = r3.getValue()
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.a.a(r2)
            kotlin.Pair r2 = wz.i.a(r3, r2)
            java.util.Map r2 = kotlin.collections.g0.f(r2)
            if (r2 != 0) goto L2f
        L2b:
            java.util.Map r2 = kotlin.collections.g0.h()
        L2f:
            java.util.Map r0 = kotlin.collections.g0.o(r0, r2)
            if (r16 == 0) goto L49
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomParameterName r2 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.MEDIA_TYPE
            java.lang.String r2 = r2.getValue()
            java.lang.String r3 = r16.getValue()
            kotlin.Pair r2 = wz.i.a(r2, r3)
            java.util.Map r2 = kotlin.collections.g0.f(r2)
            if (r2 != 0) goto L4d
        L49:
            java.util.Map r2 = kotlin.collections.g0.h()
        L4d:
            java.util.Map r0 = kotlin.collections.g0.o(r0, r2)
            int r2 = r15.getId()
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.a.d(r2)
            int r3 = r2.intValue()
            r4 = -1
            if (r3 != r4) goto L62
            r3 = 1
            goto L63
        L62:
            r3 = 0
        L63:
            java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.a.a(r3)
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L6e
            goto L6f
        L6e:
            r2 = 0
        L6f:
            if (r2 == 0) goto L89
            int r2 = r2.intValue()
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomParameterName r3 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.LISTING_ID
            java.lang.String r3 = r3.getValue()
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.a.d(r2)
            kotlin.Pair r2 = wz.i.a(r3, r2)
            java.util.Map r2 = kotlin.collections.g0.f(r2)
            if (r2 != 0) goto L8d
        L89:
            java.util.Map r2 = kotlin.collections.g0.h()
        L8d:
            java.util.Map r0 = kotlin.collections.g0.o(r0, r2)
            if (r17 == 0) goto La7
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomParameterName r2 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.SCREEN_NAME
            java.lang.String r2 = r2.getValue()
            java.lang.String r3 = r17.a()
            kotlin.Pair r2 = wz.i.a(r2, r3)
            java.util.Map r2 = kotlin.collections.g0.f(r2)
            if (r2 != 0) goto Lab
        La7:
            java.util.Map r2 = kotlin.collections.g0.h()
        Lab:
            java.util.Map r3 = kotlin.collections.g0.o(r0, r2)
            java.lang.String r2 = r14.getValue()
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 1
            r8 = 1
            r9 = 0
            r10 = 0
            r11 = 412(0x19c, float:5.77E-43)
            r12 = 0
            r1 = r13
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.h(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
        Lc1:
            wz.p r0 = wz.p.f75480a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt.s0(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger, com.forsale.app.utils.analytics.CreateEditAdvActionType, com.forsale.app.datalayer.network.entities.ListingDetailsEntity, com.forsale.app.utils.analytics.PLFMediaTypes, com.forsale.app.utils.analytics.l$a, java.lang.Boolean, zz.a):java.lang.Object");
    }

    public static final void t(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, int i11, String agentName, AgentActionType actionType) {
        Map h11;
        Map p11;
        Map n11;
        o.i(aggregatedAllAnalyticsLogger, "<this>");
        o.i(agentName, "agentName");
        o.i(actionType, "actionType");
        h11 = j0.h();
        p11 = j0.p(h11, wz.i.a(AggregatedAllAnalyticsLogger.CustomParameterName.ACTION_TYPE.getValue(), actionType.getValue()));
        n11 = j0.n(p11, aggregatedAllAnalyticsLogger.m(i11, agentName));
        AggregatedAllAnalyticsLogger.h(aggregatedAllAnalyticsLogger, AggregatedAllAnalyticsLogger.CustomEvents.AGENT_ACTION_TAKEN.getValue(), n11, null, null, null, false, false, false, false, 508, null);
    }

    public static final void t0(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, ProfileActionType actionType) {
        Map h11;
        Map p11;
        o.i(aggregatedAllAnalyticsLogger, "<this>");
        o.i(actionType, "actionType");
        h11 = j0.h();
        p11 = j0.p(h11, wz.i.a(AggregatedAllAnalyticsLogger.CustomParameterName.ACTION_TYPE.getValue(), actionType.getValue()));
        AggregatedAllAnalyticsLogger.h(aggregatedAllAnalyticsLogger, AggregatedAllAnalyticsLogger.CustomEvents.PROFILE_ACTION_TAKEN.getValue(), p11, null, null, null, false, false, false, false, 508, null);
    }

    public static final void u(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, int i11, String agentName) {
        Map h11;
        Map n11;
        o.i(aggregatedAllAnalyticsLogger, "<this>");
        o.i(agentName, "agentName");
        h11 = j0.h();
        n11 = j0.n(h11, aggregatedAllAnalyticsLogger.m(i11, agentName));
        AggregatedAllAnalyticsLogger.h(aggregatedAllAnalyticsLogger, AggregatedAllAnalyticsLogger.CustomEvents.AGENT_DETAILS_SCREEN_VISITED.getValue(), n11, null, null, null, false, false, false, false, 508, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x003b, code lost:
        if (r1 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x005e, code lost:
        if (r1 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object u0(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r14, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomEvents r15, int r16, java.lang.String r17, java.lang.Integer r18, boolean r19, boolean r20, zz.a<? super wz.p> r21) {
        /*
            java.util.Map r0 = kotlin.collections.g0.h()
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomParameterName r1 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.LISTINGS_COUNT
            java.lang.String r1 = r1.getValue()
            java.lang.String r2 = java.lang.String.valueOf(r16)
            kotlin.Pair r1 = wz.i.a(r1, r2)
            java.util.Map r1 = kotlin.collections.g0.f(r1)
            java.util.Map r0 = kotlin.collections.g0.o(r0, r1)
            if (r17 == 0) goto L3e
            int r1 = r17.length()
            if (r1 != 0) goto L24
            r1 = 1
            goto L25
        L24:
            r1 = 0
        L25:
            if (r1 != 0) goto L2a
            r1 = r17
            goto L2b
        L2a:
            r1 = 0
        L2b:
            if (r1 == 0) goto L3e
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomParameterName r2 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.SOURCE
            java.lang.String r2 = r2.getValue()
            kotlin.Pair r1 = wz.i.a(r2, r1)
            java.util.Map r1 = kotlin.collections.g0.f(r1)
            if (r1 == 0) goto L3e
            goto L42
        L3e:
            java.util.Map r1 = kotlin.collections.g0.h()
        L42:
            java.util.Map r0 = kotlin.collections.g0.o(r0, r1)
            if (r18 == 0) goto L60
            int r1 = r18.intValue()
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomParameterName r2 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.MAX_ITEM_SCROLLED
            java.lang.String r2 = r2.getValue()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            kotlin.Pair r1 = wz.i.a(r2, r1)
            java.util.Map r1 = kotlin.collections.g0.f(r1)
            if (r1 != 0) goto L64
        L60:
            java.util.Map r1 = kotlin.collections.g0.h()
        L64:
            java.util.Map r0 = kotlin.collections.g0.o(r0, r1)
            java.util.List r1 = r14.Z()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Map r4 = kotlin.collections.g0.n(r0, r1)
            java.lang.String r3 = r15.getValue()
            r5 = 0
            r6 = 0
            r7 = 0
            r10 = 0
            r11 = 0
            r12 = 412(0x19c, float:5.77E-43)
            r13 = 0
            r2 = r14
            r8 = r19
            r9 = r20
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.h(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            wz.p r0 = wz.p.f75480a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt.u0(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomEvents, int, java.lang.String, java.lang.Integer, boolean, boolean, zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object v(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r13, java.lang.Integer r14, zz.a<? super wz.p> r15) {
        /*
            boolean r0 = r15 instanceof com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt$logAgentVisitedEvent$1
            if (r0 == 0) goto L13
            r0 = r15
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt$logAgentVisitedEvent$1 r0 = (com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt$logAgentVisitedEvent$1) r0
            int r1 = r0.f39833d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39833d = r1
            goto L18
        L13:
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt$logAgentVisitedEvent$1 r0 = new com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt$logAgentVisitedEvent$1
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f39832c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f39833d
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r13 = r0.f39831b
            java.util.Map r13 = (java.util.Map) r13
            java.lang.Object r14 = r0.f39830a
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r14 = (com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger) r14
            kotlin.f.b(r15)
            goto L5a
        L31:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L39:
            kotlin.f.b(r15)
            java.util.Map r15 = kotlin.collections.g0.h()
            if (r14 == 0) goto L64
            r14.intValue()
            int r14 = r14.intValue()
            r0.f39830a = r13
            r0.f39831b = r15
            r0.f39833d = r3
            java.lang.Object r14 = r13.S(r14, r0)
            if (r14 != r1) goto L56
            return r1
        L56:
            r12 = r14
            r14 = r13
            r13 = r15
            r15 = r12
        L5a:
            java.util.List r15 = (java.util.List) r15
            if (r15 == 0) goto L62
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            r0 = r14
            goto L6d
        L62:
            r15 = r13
            r13 = r14
        L64:
            java.util.List r14 = kotlin.collections.p.n()
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            r0 = r13
            r13 = r15
            r15 = r14
        L6d:
            java.util.Map r2 = kotlin.collections.g0.n(r13, r15)
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomEvents r13 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomEvents.AGENTS_SCREEN_VISITED
            java.lang.String r1 = r13.getValue()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 508(0x1fc, float:7.12E-43)
            r11 = 0
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.h(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            wz.p r13 = wz.p.f75480a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt.v(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger, java.lang.Integer, zz.a):java.lang.Object");
    }

    public static /* synthetic */ Object v0(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, AggregatedAllAnalyticsLogger.CustomEvents customEvents, int i11, String str, Integer num, boolean z11, boolean z12, zz.a aVar, int i12, Object obj) {
        boolean z13;
        boolean z14;
        if ((i12 & 16) != 0) {
            z13 = true;
        } else {
            z13 = z11;
        }
        if ((i12 & 32) != 0) {
            z14 = true;
        } else {
            z14 = z12;
        }
        return u0(aggregatedAllAnalyticsLogger, customEvents, i11, str, num, z13, z14, aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x001a, code lost:
        r0 = kotlin.collections.i0.f(wz.i.a(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.REASON.getValue(), r20));
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0034, code lost:
        r1 = kotlin.collections.i0.f(wz.i.a(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.SOURCE.getValue(), r21));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004e, code lost:
        r1 = kotlin.collections.i0.f(wz.i.a(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.POSITION.getValue(), r22));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void w(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r16, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.AdvActionEvents r17, boolean r18, boolean r19, java.lang.String r20, java.lang.String r21, java.lang.String r22) {
        /*
            r0 = r20
            r1 = r21
            r2 = r22
            java.lang.String r3 = "<this>"
            r4 = r16
            kotlin.jvm.internal.o.i(r4, r3)
            java.lang.String r3 = "event"
            r5 = r17
            kotlin.jvm.internal.o.i(r5, r3)
            java.util.Map r3 = kotlin.collections.g0.h()
            if (r0 == 0) goto L2a
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomParameterName r6 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.REASON
            java.lang.String r6 = r6.getValue()
            kotlin.Pair r0 = wz.i.a(r6, r0)
            java.util.Map r0 = kotlin.collections.g0.f(r0)
            if (r0 != 0) goto L2e
        L2a:
            java.util.Map r0 = kotlin.collections.g0.h()
        L2e:
            java.util.Map r0 = kotlin.collections.g0.o(r3, r0)
            if (r1 == 0) goto L44
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomParameterName r3 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.SOURCE
            java.lang.String r3 = r3.getValue()
            kotlin.Pair r1 = wz.i.a(r3, r1)
            java.util.Map r1 = kotlin.collections.g0.f(r1)
            if (r1 != 0) goto L48
        L44:
            java.util.Map r1 = kotlin.collections.g0.h()
        L48:
            java.util.Map r0 = kotlin.collections.g0.o(r0, r1)
            if (r2 == 0) goto L5e
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomParameterName r1 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.POSITION
            java.lang.String r1 = r1.getValue()
            kotlin.Pair r1 = wz.i.a(r1, r2)
            java.util.Map r1 = kotlin.collections.g0.f(r1)
            if (r1 != 0) goto L62
        L5e:
            java.util.Map r1 = kotlin.collections.g0.h()
        L62:
            java.util.Map r6 = kotlin.collections.g0.o(r0, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "logAlertEvents:Properties: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            x10.a.b(r0, r1)
            java.lang.String r5 = r17.getValue()
            r7 = 0
            r8 = 0
            r9 = 0
            r12 = 0
            r13 = 0
            r14 = 412(0x19c, float:5.77E-43)
            r15 = 0
            r4 = r16
            r10 = r18
            r11 = r19
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.h(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt.w(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$AdvActionEvents, boolean, boolean, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static final void w0(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, AggregatedAllAnalyticsLogger.CustomEvents event, boolean z11, boolean z12) {
        Map h11;
        Map n11;
        o.i(aggregatedAllAnalyticsLogger, "<this>");
        o.i(event, "event");
        String value = event.getValue();
        h11 = j0.h();
        n11 = j0.n(h11, aggregatedAllAnalyticsLogger.Z());
        AggregatedAllAnalyticsLogger.h(aggregatedAllAnalyticsLogger, value, n11, null, null, null, z11, z12, false, false, 412, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0110, code lost:
        if (r1 == null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object x(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r16, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.InAppActionEvents r17, java.lang.Integer r18, java.lang.Integer r19, java.util.List<java.lang.Integer> r20, java.lang.Integer r21, java.lang.String r22, java.lang.Boolean r23, zz.a<? super wz.p> r24) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt.x(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$InAppActionEvents, java.lang.Integer, java.lang.Integer, java.util.List, java.lang.Integer, java.lang.String, java.lang.Boolean, zz.a):java.lang.Object");
    }

    public static /* synthetic */ void x0(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, AggregatedAllAnalyticsLogger.CustomEvents customEvents, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        w0(aggregatedAllAnalyticsLogger, customEvents, z11, z12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x002f, code lost:
        r4 = kotlin.collections.i0.f(wz.i.a(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.TAB_NAME.getValue(), r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0060, code lost:
        r0 = kotlin.collections.i0.f(wz.i.a(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.CLICKED_TAB.getValue(), r18));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void y(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r14, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomEvents r15, java.lang.String r16, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.BottomToolTipAction r17, java.lang.String r18, boolean r19, boolean r20) {
        /*
            r0 = r18
            java.lang.String r1 = "<this>"
            r2 = r14
            kotlin.jvm.internal.o.i(r14, r1)
            java.lang.String r1 = "event"
            r3 = r15
            kotlin.jvm.internal.o.i(r15, r1)
            java.lang.String r1 = "tabName"
            r4 = r16
            kotlin.jvm.internal.o.i(r4, r1)
            java.lang.String r1 = "actionName"
            r5 = r17
            kotlin.jvm.internal.o.i(r5, r1)
            java.util.Map r1 = kotlin.collections.g0.h()
            int r6 = r16.length()
            if (r6 != 0) goto L28
            r6 = 1
            goto L29
        L28:
            r6 = 0
        L29:
            if (r6 != 0) goto L2c
            goto L2d
        L2c:
            r4 = 0
        L2d:
            if (r4 == 0) goto L40
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomParameterName r6 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.TAB_NAME
            java.lang.String r6 = r6.getValue()
            kotlin.Pair r4 = wz.i.a(r6, r4)
            java.util.Map r4 = kotlin.collections.g0.f(r4)
            if (r4 == 0) goto L40
            goto L44
        L40:
            java.util.Map r4 = kotlin.collections.g0.h()
        L44:
            java.util.Map r1 = kotlin.collections.g0.o(r1, r4)
            java.lang.String r4 = r17.getValue()
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomParameterName r5 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.ACTION_NAME
            java.lang.String r5 = r5.getValue()
            kotlin.Pair r4 = wz.i.a(r5, r4)
            java.util.Map r4 = kotlin.collections.g0.f(r4)
            java.util.Map r1 = kotlin.collections.g0.o(r1, r4)
            if (r0 == 0) goto L70
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomParameterName r4 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.CLICKED_TAB
            java.lang.String r4 = r4.getValue()
            kotlin.Pair r0 = wz.i.a(r4, r0)
            java.util.Map r0 = kotlin.collections.g0.f(r0)
            if (r0 != 0) goto L74
        L70:
            java.util.Map r0 = kotlin.collections.g0.h()
        L74:
            java.util.Map r4 = kotlin.collections.g0.o(r1, r0)
            java.lang.String r3 = r15.getValue()
            r5 = 0
            r6 = 0
            r7 = 0
            r10 = 0
            r11 = 0
            r12 = 412(0x19c, float:5.77E-43)
            r13 = 0
            r2 = r14
            r8 = r19
            r9 = r20
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.h(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt.y(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomEvents, java.lang.String, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$BottomToolTipAction, java.lang.String, boolean, boolean):void");
    }

    public static final void y0(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, SearchLocation screenName) {
        Map f11;
        o.i(aggregatedAllAnalyticsLogger, "<this>");
        o.i(screenName, "screenName");
        f11 = i0.f(wz.i.a(AggregatedAllAnalyticsLogger.CustomParameterName.SCREEN_NAME.getValue(), screenName.getValue()));
        AggregatedAllAnalyticsLogger.h(aggregatedAllAnalyticsLogger, AggregatedAllAnalyticsLogger.CustomEvents.SEARCH_BAR_CLICKED.getValue(), f11, null, null, null, true, true, false, false, 412, null);
    }

    public static /* synthetic */ void z(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, AggregatedAllAnalyticsLogger.CustomEvents customEvents, String str, AggregatedAllAnalyticsLogger.BottomToolTipAction bottomToolTipAction, String str2, boolean z11, boolean z12, int i11, Object obj) {
        boolean z13;
        boolean z14;
        if ((i11 & 8) != 0) {
            str2 = null;
        }
        String str3 = str2;
        if ((i11 & 16) != 0) {
            z13 = true;
        } else {
            z13 = z11;
        }
        if ((i11 & 32) != 0) {
            z14 = true;
        } else {
            z14 = z12;
        }
        y(aggregatedAllAnalyticsLogger, customEvents, str, bottomToolTipAction, str3, z13, z14);
    }

    public static final void z0(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, List<SearchItemModel> historyList) {
        o.i(aggregatedAllAnalyticsLogger, "<this>");
        o.i(historyList, "historyList");
        AggregatedAllAnalyticsLogger.h(aggregatedAllAnalyticsLogger, AggregatedAllAnalyticsLogger.CustomEvents.SEARCH_HISTORY_CLEAR_ALL_CLICKED.getValue(), c(historyList), null, null, null, true, true, false, false, 412, null);
    }
}
