package com.forsale.app.utils.errorhandling;

import a00.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ErrorNames.kt */
/* loaded from: classes3.dex */
public final class ErrorNames {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ErrorNames[] $VALUES;
    public static final ErrorNames LISTING_DETAILS_DECODING = new ErrorNames("LISTING_DETAILS_DECODING", 0, "ListingDetails-Decoding");
    public static final ErrorNames TOO_MANY_REQUESTS = new ErrorNames("TOO_MANY_REQUESTS", 1, "TOO_MANY_REQUESTS");
    private final String value;

    private static final /* synthetic */ ErrorNames[] $values() {
        return new ErrorNames[]{LISTING_DETAILS_DECODING, TOO_MANY_REQUESTS};
    }

    static {
        ErrorNames[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ErrorNames(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a<ErrorNames> getEntries() {
        return $ENTRIES;
    }

    public static ErrorNames valueOf(String str) {
        return (ErrorNames) Enum.valueOf(ErrorNames.class, str);
    }

    public static ErrorNames[] values() {
        return (ErrorNames[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
