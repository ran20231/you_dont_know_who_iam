package com.forsale.app.utils.analytics;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ErrorReason.kt */
/* loaded from: classes3.dex */
public final class ErrorReason {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ ErrorReason[] $VALUES;
    private final String value;
    public static final ErrorReason NO_ENOUGH_CREDIT = new ErrorReason("NO_ENOUGH_CREDIT", 0, "No Enough Credit");
    public static final ErrorReason CHANGE_CATEGORY = new ErrorReason("CHANGE_CATEGORY", 1, "Change Category");
    public static final ErrorReason MEDIA_ERROR = new ErrorReason("MEDIA_ERROR", 2, "Media Error");
    public static final ErrorReason PAYMENT_CONFIRMATION = new ErrorReason("PAYMENT_CONFIRMATION", 3, "Payment Confirmation");
    public static final ErrorReason SUCCESS = new ErrorReason("SUCCESS", 4, "Success");
    public static final ErrorReason SUCCESS_WITH_CONDITIONS = new ErrorReason("SUCCESS_WITH_CONDITIONS", 5, "Success With Conditions");
    public static final ErrorReason TRY_AGAIN = new ErrorReason("TRY_AGAIN", 6, "Try Again");
    public static final ErrorReason AWAITING_APPROVE = new ErrorReason("AWAITING_APPROVE", 7, "Awaiting Approve");
    public static final ErrorReason ERROR = new ErrorReason("ERROR", 8, "Error");

    private static final /* synthetic */ ErrorReason[] $values() {
        return new ErrorReason[]{NO_ENOUGH_CREDIT, CHANGE_CATEGORY, MEDIA_ERROR, PAYMENT_CONFIRMATION, SUCCESS, SUCCESS_WITH_CONDITIONS, TRY_AGAIN, AWAITING_APPROVE, ERROR};
    }

    static {
        ErrorReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ErrorReason(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<ErrorReason> getEntries() {
        return $ENTRIES;
    }

    public static ErrorReason valueOf(String str) {
        return (ErrorReason) Enum.valueOf(ErrorReason.class, str);
    }

    public static ErrorReason[] values() {
        return (ErrorReason[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
