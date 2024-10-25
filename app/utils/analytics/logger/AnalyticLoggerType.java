package com.forsale.app.utils.analytics.logger;

import a00.a;
import com.adjust.sdk.Constants;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AnalyticsEventItem.kt */
/* loaded from: classes3.dex */
public final class AnalyticLoggerType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AnalyticLoggerType[] $VALUES;
    public static final AnalyticLoggerType Firebase = new AnalyticLoggerType("Firebase", 0);
    public static final AnalyticLoggerType Adjust = new AnalyticLoggerType(Constants.LOGTAG, 1);
    public static final AnalyticLoggerType Amplitude = new AnalyticLoggerType("Amplitude", 2);
    public static final AnalyticLoggerType Leanplum = new AnalyticLoggerType("Leanplum", 3);

    private static final /* synthetic */ AnalyticLoggerType[] $values() {
        return new AnalyticLoggerType[]{Firebase, Adjust, Amplitude, Leanplum};
    }

    static {
        AnalyticLoggerType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private AnalyticLoggerType(String str, int i11) {
    }

    public static a<AnalyticLoggerType> getEntries() {
        return $ENTRIES;
    }

    public static AnalyticLoggerType valueOf(String str) {
        return (AnalyticLoggerType) Enum.valueOf(AnalyticLoggerType.class, str);
    }

    public static AnalyticLoggerType[] values() {
        return (AnalyticLoggerType[]) $VALUES.clone();
    }
}
