package com.forsale.adserver.datalayer.bannerdata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: createBanner.kt */
/* loaded from: classes2.dex */
public final class ANALYTICS {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ ANALYTICS[] $VALUES;
    public static final ANALYTICS IMPRESSIONS_COUNT = new ANALYTICS("IMPRESSIONS_COUNT", 0);
    public static final ANALYTICS VIEWS_COUNT = new ANALYTICS("VIEWS_COUNT", 1);
    public static final ANALYTICS LIKES_COUNT = new ANALYTICS("LIKES_COUNT", 2);
    public static final ANALYTICS PHONE_CLICKS = new ANALYTICS("PHONE_CLICKS", 3);
    public static final ANALYTICS URL_CLICKS = new ANALYTICS("URL_CLICKS", 4);

    private static final /* synthetic */ ANALYTICS[] $values() {
        return new ANALYTICS[]{IMPRESSIONS_COUNT, VIEWS_COUNT, LIKES_COUNT, PHONE_CLICKS, URL_CLICKS};
    }

    static {
        ANALYTICS[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ANALYTICS(String str, int i11) {
    }

    public static a00.a<ANALYTICS> getEntries() {
        return $ENTRIES;
    }

    public static ANALYTICS valueOf(String str) {
        return (ANALYTICS) Enum.valueOf(ANALYTICS.class, str);
    }

    public static ANALYTICS[] values() {
        return (ANALYTICS[]) $VALUES.clone();
    }
}
