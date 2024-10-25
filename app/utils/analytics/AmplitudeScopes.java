package com.forsale.app.utils.analytics;

import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import java.util.List;
import kotlin.collections.r;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AmplitudeScopes.kt */
/* loaded from: classes3.dex */
public final class AmplitudeScopes {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ AmplitudeScopes[] $VALUES;
    public static final AmplitudeScopes CATEGORY_LISTINGS;
    private final List<String> events;

    private static final /* synthetic */ AmplitudeScopes[] $values() {
        return new AmplitudeScopes[]{CATEGORY_LISTINGS};
    }

    static {
        List q11;
        q11 = r.q(AggregatedAllAnalyticsLogger.CustomEvents.PULL_TO_REFRESH.getValue(), AggregatedAllAnalyticsLogger.CustomEvents.LISTINGS_FILLER_CLICKED.getValue(), AggregatedAllAnalyticsLogger.CustomEvents.LISTINGS_SCROLLED.getValue(), AggregatedAllAnalyticsLogger.CustomEvents.RESET_ALL_CLICKED.getValue(), AggregatedAllAnalyticsLogger.CustomEvents.UP_BUTTON_CLICKED.getValue(), AggregatedAllAnalyticsLogger.InAppActionEvents.ANIMATED_LISTING_STARTED.getValue(), AggregatedAllAnalyticsLogger.InAppActionEvents.ANIMATED_LISTING_VIEWED.getValue(), AggregatedAllAnalyticsLogger.InAppActionEvents.ANIMATED_LISTING_OPENED.getValue(), "Listings All Filters Clicked", "Reset All Filters Clicked");
        CATEGORY_LISTINGS = new AmplitudeScopes("CATEGORY_LISTINGS", 0, q11);
        AmplitudeScopes[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private AmplitudeScopes(String str, int i11, List list) {
        this.events = list;
    }

    public static a00.a<AmplitudeScopes> getEntries() {
        return $ENTRIES;
    }

    public static AmplitudeScopes valueOf(String str) {
        return (AmplitudeScopes) Enum.valueOf(AmplitudeScopes.class, str);
    }

    public static AmplitudeScopes[] values() {
        return (AmplitudeScopes[]) $VALUES.clone();
    }

    public final List<String> getEvents() {
        return this.events;
    }
}
