package com.forsale.app.utils.analytics;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FillerType.kt */
/* loaded from: classes3.dex */
public final class FillerType {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ FillerType[] $VALUES;
    private final String value;
    public static final FillerType NORMAL = new FillerType("NORMAL", 0, "Normal");
    public static final FillerType COMMERCIAL = new FillerType("COMMERCIAL", 1, "Commercial");

    private static final /* synthetic */ FillerType[] $values() {
        return new FillerType[]{NORMAL, COMMERCIAL};
    }

    static {
        FillerType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private FillerType(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<FillerType> getEntries() {
        return $ENTRIES;
    }

    public static FillerType valueOf(String str) {
        return (FillerType) Enum.valueOf(FillerType.class, str);
    }

    public static FillerType[] values() {
        return (FillerType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
