package com.forsale.designSystem.notificationsystem;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Snackbar.kt */
/* loaded from: classes3.dex */
public final class SnackbarResult {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ SnackbarResult[] $VALUES;
    public static final SnackbarResult Dismissed = new SnackbarResult("Dismissed", 0);
    public static final SnackbarResult ActionPerformed = new SnackbarResult("ActionPerformed", 1);

    private static final /* synthetic */ SnackbarResult[] $values() {
        return new SnackbarResult[]{Dismissed, ActionPerformed};
    }

    static {
        SnackbarResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private SnackbarResult(String str, int i11) {
    }

    public static a00.a<SnackbarResult> getEntries() {
        return $ENTRIES;
    }

    public static SnackbarResult valueOf(String str) {
        return (SnackbarResult) Enum.valueOf(SnackbarResult.class, str);
    }

    public static SnackbarResult[] values() {
        return (SnackbarResult[]) $VALUES.clone();
    }
}
