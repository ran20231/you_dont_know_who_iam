package com.forsale.app.ui.bottomsheets.listingdetailsmoreactions;

import com.forsale.app.datalayer.network.services.AnalyticsService;
import com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.b;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
/* compiled from: MoreActionsBottomSheet_MembersInjector.java */
/* loaded from: classes3.dex */
public final class a implements cx.b<MoreActionsBottomSheet> {
    public static void a(MoreActionsBottomSheet moreActionsBottomSheet, AnalyticsService analyticsService) {
        moreActionsBottomSheet.H = analyticsService;
    }

    public static void b(MoreActionsBottomSheet moreActionsBottomSheet, AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger) {
        moreActionsBottomSheet.I = aggregatedAllAnalyticsLogger;
    }

    public static void c(MoreActionsBottomSheet moreActionsBottomSheet, b.a aVar) {
        moreActionsBottomSheet.D = aVar;
    }
}
