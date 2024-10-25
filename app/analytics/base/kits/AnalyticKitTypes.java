package com.forsale.app.analytics.base.kits;

import a00.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AnalyticsKit.kt */
/* loaded from: classes2.dex */
public final class AnalyticKitTypes {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AnalyticKitTypes[] $VALUES;
    public static final AnalyticKitTypes FIREBASE = new AnalyticKitTypes("FIREBASE", 0);
    public static final AnalyticKitTypes AMPLITUDE = new AnalyticKitTypes("AMPLITUDE", 1);
    public static final AnalyticKitTypes LEANPLUM = new AnalyticKitTypes("LEANPLUM", 2);
    public static final AnalyticKitTypes MoEngage = new AnalyticKitTypes("MoEngage", 3);
    public static final AnalyticKitTypes ALL = new AnalyticKitTypes("ALL", 4);

    private static final /* synthetic */ AnalyticKitTypes[] $values() {
        return new AnalyticKitTypes[]{FIREBASE, AMPLITUDE, LEANPLUM, MoEngage, ALL};
    }

    static {
        AnalyticKitTypes[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private AnalyticKitTypes(String str, int i11) {
    }

    public static a<AnalyticKitTypes> getEntries() {
        return $ENTRIES;
    }

    public static AnalyticKitTypes valueOf(String str) {
        return (AnalyticKitTypes) Enum.valueOf(AnalyticKitTypes.class, str);
    }

    public static AnalyticKitTypes[] values() {
        return (AnalyticKitTypes[]) $VALUES.clone();
    }
}
