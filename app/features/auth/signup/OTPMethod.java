package com.forsale.app.features.auth.signup;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OTPMethod.kt */
/* loaded from: classes2.dex */
public final class OTPMethod {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ OTPMethod[] $VALUES;
    private final String value;
    public static final OTPMethod SMS = new OTPMethod("SMS", 0, "sms");
    public static final OTPMethod WHATSAPP = new OTPMethod("WHATSAPP", 1, "whatsapp");
    public static final OTPMethod CALL = new OTPMethod("CALL", 2, "call");

    private static final /* synthetic */ OTPMethod[] $values() {
        return new OTPMethod[]{SMS, WHATSAPP, CALL};
    }

    static {
        OTPMethod[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private OTPMethod(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<OTPMethod> getEntries() {
        return $ENTRIES;
    }

    public static OTPMethod valueOf(String str) {
        return (OTPMethod) Enum.valueOf(OTPMethod.class, str);
    }

    public static OTPMethod[] values() {
        return (OTPMethod[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
