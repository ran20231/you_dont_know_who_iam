package com.forsale.app.utils;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UiMode.kt */
/* loaded from: classes3.dex */
public final class UiMode {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ UiMode[] $VALUES;
    public static final UiMode Night = new UiMode("Night", 0);
    public static final UiMode Light = new UiMode("Light", 1);

    private static final /* synthetic */ UiMode[] $values() {
        return new UiMode[]{Night, Light};
    }

    static {
        UiMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private UiMode(String str, int i11) {
    }

    public static a00.a<UiMode> getEntries() {
        return $ENTRIES;
    }

    public static UiMode valueOf(String str) {
        return (UiMode) Enum.valueOf(UiMode.class, str);
    }

    public static UiMode[] values() {
        return (UiMode[]) $VALUES.clone();
    }
}
