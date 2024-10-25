package com.forsale.adserver.utils;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AnalyticsEvents.kt */
/* loaded from: classes2.dex */
public final class AnalyticsEventsTypes {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ AnalyticsEventsTypes[] $VALUES;
    public static final AnalyticsEventsTypes OFFER = new AnalyticsEventsTypes("OFFER", 0);
    public static final AnalyticsEventsTypes SPLASH = new AnalyticsEventsTypes("SPLASH", 1);
    public static final AnalyticsEventsTypes BANNER = new AnalyticsEventsTypes("BANNER", 2);

    private static final /* synthetic */ AnalyticsEventsTypes[] $values() {
        return new AnalyticsEventsTypes[]{OFFER, SPLASH, BANNER};
    }

    static {
        AnalyticsEventsTypes[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private AnalyticsEventsTypes(String str, int i11) {
    }

    public static a00.a<AnalyticsEventsTypes> getEntries() {
        return $ENTRIES;
    }

    public static AnalyticsEventsTypes valueOf(String str) {
        return (AnalyticsEventsTypes) Enum.valueOf(AnalyticsEventsTypes.class, str);
    }

    public static AnalyticsEventsTypes[] values() {
        return (AnalyticsEventsTypes[]) $VALUES.clone();
    }
}
