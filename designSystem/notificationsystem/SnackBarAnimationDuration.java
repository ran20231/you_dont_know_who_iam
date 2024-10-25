package com.forsale.designSystem.notificationsystem;

import com.google.logging.type.LogSeverity;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Snackbar.kt */
/* loaded from: classes3.dex */
public final class SnackBarAnimationDuration {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ SnackBarAnimationDuration[] $VALUES;
    private final int value;
    public static final SnackBarAnimationDuration ThreeHundredMillis = new SnackBarAnimationDuration("ThreeHundredMillis", 0, 400);
    public static final SnackBarAnimationDuration FourHundredMillis = new SnackBarAnimationDuration("FourHundredMillis", 1, LogSeverity.ERROR_VALUE);
    public static final SnackBarAnimationDuration FiveHundredMillis = new SnackBarAnimationDuration("FiveHundredMillis", 2, LogSeverity.CRITICAL_VALUE);

    private static final /* synthetic */ SnackBarAnimationDuration[] $values() {
        return new SnackBarAnimationDuration[]{ThreeHundredMillis, FourHundredMillis, FiveHundredMillis};
    }

    static {
        SnackBarAnimationDuration[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private SnackBarAnimationDuration(String str, int i11, int i12) {
        this.value = i12;
    }

    public static a00.a<SnackBarAnimationDuration> getEntries() {
        return $ENTRIES;
    }

    public static SnackBarAnimationDuration valueOf(String str) {
        return (SnackBarAnimationDuration) Enum.valueOf(SnackBarAnimationDuration.class, str);
    }

    public static SnackBarAnimationDuration[] values() {
        return (SnackBarAnimationDuration[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
