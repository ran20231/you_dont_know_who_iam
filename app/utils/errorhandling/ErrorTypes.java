package com.forsale.app.utils.errorhandling;

import a00.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ErrorTypes.kt */
/* loaded from: classes3.dex */
public final class ErrorTypes {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ErrorTypes[] $VALUES;
    public static final ErrorTypes FATAL_ERROR = new ErrorTypes("FATAL_ERROR", 0, "fetalError");
    public static final ErrorTypes NON_FATAL_ERROR = new ErrorTypes("NON_FATAL_ERROR", 1, "non-fetalError");
    private final String value;

    private static final /* synthetic */ ErrorTypes[] $values() {
        return new ErrorTypes[]{FATAL_ERROR, NON_FATAL_ERROR};
    }

    static {
        ErrorTypes[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ErrorTypes(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a<ErrorTypes> getEntries() {
        return $ENTRIES;
    }

    public static ErrorTypes valueOf(String str) {
        return (ErrorTypes) Enum.valueOf(ErrorTypes.class, str);
    }

    public static ErrorTypes[] values() {
        return (ErrorTypes[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
