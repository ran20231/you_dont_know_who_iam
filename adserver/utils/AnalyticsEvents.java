package com.forsale.adserver.utils;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AnalyticsEvents.kt */
/* loaded from: classes2.dex */
public final class AnalyticsEvents {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ AnalyticsEvents[] $VALUES;
    private final String value;
    public static final AnalyticsEvents NON = new AnalyticsEvents("NON", 0, "non");
    public static final AnalyticsEvents SPLASH_ACTION_LIKED = new AnalyticsEvents("SPLASH_ACTION_LIKED", 1, "SplashAction-Liked");
    public static final AnalyticsEvents SPLASH_ACTION_URL_CLICKED = new AnalyticsEvents("SPLASH_ACTION_URL_CLICKED", 2, "SplashAction-UrlClicked");
    public static final AnalyticsEvents OFFER_ACTION_LIKED = new AnalyticsEvents("OFFER_ACTION_LIKED", 3, "OfferAction-Liked");
    public static final AnalyticsEvents OFFER_ACTION_URL_CLICKED = new AnalyticsEvents("OFFER_ACTION_URL_CLICKED", 4, "OfferAction-UrlClicked");
    public static final AnalyticsEvents BANNER_ACTION_LIKED = new AnalyticsEvents("BANNER_ACTION_LIKED", 5, "BannerAction-Liked");
    public static final AnalyticsEvents BANNER_ACTION_URL_CLICKED = new AnalyticsEvents("BANNER_ACTION_URL_CLICKED", 6, "BannerAction-UrlClicked");
    public static final AnalyticsEvents BANNER_ACTION_VIDEO_UNMUTED = new AnalyticsEvents("BANNER_ACTION_VIDEO_UNMUTED", 7, "BannerAction-VideoUnmuted");

    private static final /* synthetic */ AnalyticsEvents[] $values() {
        return new AnalyticsEvents[]{NON, SPLASH_ACTION_LIKED, SPLASH_ACTION_URL_CLICKED, OFFER_ACTION_LIKED, OFFER_ACTION_URL_CLICKED, BANNER_ACTION_LIKED, BANNER_ACTION_URL_CLICKED, BANNER_ACTION_VIDEO_UNMUTED};
    }

    static {
        AnalyticsEvents[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private AnalyticsEvents(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<AnalyticsEvents> getEntries() {
        return $ENTRIES;
    }

    public static AnalyticsEvents valueOf(String str) {
        return (AnalyticsEvents) Enum.valueOf(AnalyticsEvents.class, str);
    }

    public static AnalyticsEvents[] values() {
        return (AnalyticsEvents[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
