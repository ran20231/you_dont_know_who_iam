package com.forsale.app.utils.errorhandling;

import a00.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ErrorCodes.kt */
/* loaded from: classes3.dex */
public final class ErrorCodes {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ErrorCodes[] $VALUES;
    public static final ErrorCodes LISTING_DETAILS_DECODING = new ErrorCodes("LISTING_DETAILS_DECODING", 0, 1001);
    public static final ErrorCodes TOO_MANY_REQUESTS = new ErrorCodes("TOO_MANY_REQUESTS", 1, 429);
    private final int value;

    private static final /* synthetic */ ErrorCodes[] $values() {
        return new ErrorCodes[]{LISTING_DETAILS_DECODING, TOO_MANY_REQUESTS};
    }

    static {
        ErrorCodes[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ErrorCodes(String str, int i11, int i12) {
        this.value = i12;
    }

    public static a<ErrorCodes> getEntries() {
        return $ENTRIES;
    }

    public static ErrorCodes valueOf(String str) {
        return (ErrorCodes) Enum.valueOf(ErrorCodes.class, str);
    }

    public static ErrorCodes[] values() {
        return (ErrorCodes[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
