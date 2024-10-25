package com.forsale.app.utils.analytics;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Models.kt */
/* loaded from: classes3.dex */
public final class PLFCloseTarget {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ PLFCloseTarget[] $VALUES;
    public static final PLFCloseTarget NAVIGATION_CLOSE = new PLFCloseTarget("NAVIGATION_CLOSE", 0, "Navigation Close");
    public static final PLFCloseTarget PHYSICAL_BACK = new PLFCloseTarget("PHYSICAL_BACK", 1, "Physical Back");
    private final String value;

    private static final /* synthetic */ PLFCloseTarget[] $values() {
        return new PLFCloseTarget[]{NAVIGATION_CLOSE, PHYSICAL_BACK};
    }

    static {
        PLFCloseTarget[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private PLFCloseTarget(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<PLFCloseTarget> getEntries() {
        return $ENTRIES;
    }

    public static PLFCloseTarget valueOf(String str) {
        return (PLFCloseTarget) Enum.valueOf(PLFCloseTarget.class, str);
    }

    public static PLFCloseTarget[] values() {
        return (PLFCloseTarget[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
