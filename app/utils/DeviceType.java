package com.forsale.app.utils;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DeviceType.kt */
/* loaded from: classes3.dex */
public final class DeviceType {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ DeviceType[] $VALUES;
    public static final DeviceType MOBILE = new DeviceType("MOBILE", 0, "Mobile");
    public static final DeviceType TABLET = new DeviceType("TABLET", 1, "Tablet");
    private final String value;

    private static final /* synthetic */ DeviceType[] $values() {
        return new DeviceType[]{MOBILE, TABLET};
    }

    static {
        DeviceType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private DeviceType(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<DeviceType> getEntries() {
        return $ENTRIES;
    }

    public static DeviceType valueOf(String str) {
        return (DeviceType) Enum.valueOf(DeviceType.class, str);
    }

    public static DeviceType[] values() {
        return (DeviceType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
