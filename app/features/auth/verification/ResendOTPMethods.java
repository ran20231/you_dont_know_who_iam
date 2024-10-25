package com.forsale.app.features.auth.verification;

import a00.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ResendOTPMethods.kt */
/* loaded from: classes2.dex */
public final class ResendOTPMethods {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ResendOTPMethods[] $VALUES;
    private final String method;
    public static final ResendOTPMethods SMS = new ResendOTPMethods("SMS", 0, "SMS");
    public static final ResendOTPMethods AutomatedCall = new ResendOTPMethods("AutomatedCall", 1, "Call");
    public static final ResendOTPMethods Whatsapp = new ResendOTPMethods("Whatsapp", 2, "WhatsApp");

    private static final /* synthetic */ ResendOTPMethods[] $values() {
        return new ResendOTPMethods[]{SMS, AutomatedCall, Whatsapp};
    }

    static {
        ResendOTPMethods[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ResendOTPMethods(String str, int i11, String str2) {
        this.method = str2;
    }

    public static a<ResendOTPMethods> getEntries() {
        return $ENTRIES;
    }

    public static ResendOTPMethods valueOf(String str) {
        return (ResendOTPMethods) Enum.valueOf(ResendOTPMethods.class, str);
    }

    public static ResendOTPMethods[] values() {
        return (ResendOTPMethods[]) $VALUES.clone();
    }

    public final String getMethod() {
        return this.method;
    }
}
