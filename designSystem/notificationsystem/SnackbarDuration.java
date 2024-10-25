package com.forsale.designSystem.notificationsystem;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Snackbar.kt */
/* loaded from: classes3.dex */
public final class SnackbarDuration {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ SnackbarDuration[] $VALUES;
    public static final SnackbarDuration Four = new SnackbarDuration("Four", 0);
    public static final SnackbarDuration Five = new SnackbarDuration("Five", 1);
    public static final SnackbarDuration Six = new SnackbarDuration("Six", 2);
    public static final SnackbarDuration Seven = new SnackbarDuration("Seven", 3);
    public static final SnackbarDuration Eight = new SnackbarDuration("Eight", 4);
    public static final SnackbarDuration Nine = new SnackbarDuration("Nine", 5);
    public static final SnackbarDuration Ten = new SnackbarDuration("Ten", 6);

    private static final /* synthetic */ SnackbarDuration[] $values() {
        return new SnackbarDuration[]{Four, Five, Six, Seven, Eight, Nine, Ten};
    }

    static {
        SnackbarDuration[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private SnackbarDuration(String str, int i11) {
    }

    public static a00.a<SnackbarDuration> getEntries() {
        return $ENTRIES;
    }

    public static SnackbarDuration valueOf(String str) {
        return (SnackbarDuration) Enum.valueOf(SnackbarDuration.class, str);
    }

    public static SnackbarDuration[] values() {
        return (SnackbarDuration[]) $VALUES.clone();
    }
}
