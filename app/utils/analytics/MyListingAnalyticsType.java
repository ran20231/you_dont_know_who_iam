package com.forsale.app.utils.analytics;

import falcon.chat.entities.AnalyticEntity;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Models.kt */
/* loaded from: classes3.dex */
public final class MyListingAnalyticsType {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ MyListingAnalyticsType[] $VALUES;
    private final String value;
    public static final MyListingAnalyticsType MAIN_SCREEN = new MyListingAnalyticsType("MAIN_SCREEN", 0, "MainScreen");
    public static final MyListingAnalyticsType ADV_VIEWS = new MyListingAnalyticsType("ADV_VIEWS", 1, "AdvViews");
    public static final MyListingAnalyticsType CALL_ATTEMPTS = new MyListingAnalyticsType("CALL_ATTEMPTS", 2, "CallAttempts");
    public static final MyListingAnalyticsType PHONE_CALLS = new MyListingAnalyticsType("PHONE_CALLS", 3, "PhoneCalls");
    public static final MyListingAnalyticsType VOIP_CALLS = new MyListingAnalyticsType("VOIP_CALLS", 4, "VoipCalls");
    public static final MyListingAnalyticsType VIDEO_CALLS = new MyListingAnalyticsType("VIDEO_CALLS", 5, "VideoCalls");
    public static final MyListingAnalyticsType PROMOTION_VIEWS = new MyListingAnalyticsType("PROMOTION_VIEWS", 6, "PromotionViews");
    public static final MyListingAnalyticsType PROMOTION_CLICKS = new MyListingAnalyticsType("PROMOTION_CLICKS", 7, "PromotionClicks");
    public static final MyListingAnalyticsType WHATS_APP_ICON = new MyListingAnalyticsType("WHATS_APP_ICON", 8, "WhatsAppIcon");
    public static final MyListingAnalyticsType CHAT = new MyListingAnalyticsType("CHAT", 9, AnalyticEntity.CHAT);

    private static final /* synthetic */ MyListingAnalyticsType[] $values() {
        return new MyListingAnalyticsType[]{MAIN_SCREEN, ADV_VIEWS, CALL_ATTEMPTS, PHONE_CALLS, VOIP_CALLS, VIDEO_CALLS, PROMOTION_VIEWS, PROMOTION_CLICKS, WHATS_APP_ICON, CHAT};
    }

    static {
        MyListingAnalyticsType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private MyListingAnalyticsType(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<MyListingAnalyticsType> getEntries() {
        return $ENTRIES;
    }

    public static MyListingAnalyticsType valueOf(String str) {
        return (MyListingAnalyticsType) Enum.valueOf(MyListingAnalyticsType.class, str);
    }

    public static MyListingAnalyticsType[] values() {
        return (MyListingAnalyticsType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
