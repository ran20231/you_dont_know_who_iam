package com.forsale.app.utils.analytics.logger.events;

import a00.a;
import wi.e;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CustomParameterValue.kt */
/* loaded from: classes3.dex */
public final class CustomParameterValue implements e {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CustomParameterValue[] $VALUES;
    public static final CustomParameterValue ANDROID = new CustomParameterValue("ANDROID", 0, "Android");
    private final String value;

    private static final /* synthetic */ CustomParameterValue[] $values() {
        return new CustomParameterValue[]{ANDROID};
    }

    static {
        CustomParameterValue[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private CustomParameterValue(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a<CustomParameterValue> getEntries() {
        return $ENTRIES;
    }

    public static CustomParameterValue valueOf(String str) {
        return (CustomParameterValue) Enum.valueOf(CustomParameterValue.class, str);
    }

    public static CustomParameterValue[] values() {
        return (CustomParameterValue[]) $VALUES.clone();
    }

    @Override // wi.e
    public String getValue() {
        return this.value;
    }
}
