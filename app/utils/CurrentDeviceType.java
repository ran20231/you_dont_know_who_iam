package com.forsale.app.utils;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CurrentDeviceType.kt */
/* loaded from: classes3.dex */
public final class CurrentDeviceType {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ CurrentDeviceType[] $VALUES;
    public static final CurrentDeviceType PHONE = new CurrentDeviceType("PHONE", 0, "phone");
    public static final CurrentDeviceType TABLET = new CurrentDeviceType("TABLET", 1, "tablet");
    private final String value;

    private static final /* synthetic */ CurrentDeviceType[] $values() {
        return new CurrentDeviceType[]{PHONE, TABLET};
    }

    static {
        CurrentDeviceType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private CurrentDeviceType(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<CurrentDeviceType> getEntries() {
        return $ENTRIES;
    }

    public static CurrentDeviceType valueOf(String str) {
        return (CurrentDeviceType) Enum.valueOf(CurrentDeviceType.class, str);
    }

    public static CurrentDeviceType[] values() {
        return (CurrentDeviceType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
