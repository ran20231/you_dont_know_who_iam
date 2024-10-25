package com.forsale.app.features.auth.interactors.validationinteractors;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FieldSourceType.kt */
/* loaded from: classes2.dex */
public final class ChangePasswordFieldType {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ ChangePasswordFieldType[] $VALUES;
    public static final ChangePasswordFieldType OLD_PASSWORD = new ChangePasswordFieldType("OLD_PASSWORD", 0);
    public static final ChangePasswordFieldType NEW_PASSWORD = new ChangePasswordFieldType("NEW_PASSWORD", 1);
    public static final ChangePasswordFieldType CONFIRM_PASSWORD = new ChangePasswordFieldType("CONFIRM_PASSWORD", 2);

    private static final /* synthetic */ ChangePasswordFieldType[] $values() {
        return new ChangePasswordFieldType[]{OLD_PASSWORD, NEW_PASSWORD, CONFIRM_PASSWORD};
    }

    static {
        ChangePasswordFieldType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ChangePasswordFieldType(String str, int i11) {
    }

    public static a00.a<ChangePasswordFieldType> getEntries() {
        return $ENTRIES;
    }

    public static ChangePasswordFieldType valueOf(String str) {
        return (ChangePasswordFieldType) Enum.valueOf(ChangePasswordFieldType.class, str);
    }

    public static ChangePasswordFieldType[] values() {
        return (ChangePasswordFieldType[]) $VALUES.clone();
    }
}
