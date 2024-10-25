package com.forsale.app.utils.analytics.auth.verification;

import a00.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ResendOTPChannel.kt */
/* loaded from: classes3.dex */
public final class ResendOTPChannel {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ResendOTPChannel[] $VALUES;
    private final String method;
    public static final ResendOTPChannel SMS = new ResendOTPChannel("SMS", 0, "SMS");
    public static final ResendOTPChannel AutomatedCall = new ResendOTPChannel("AutomatedCall", 1, "Call");
    public static final ResendOTPChannel WhatsApp = new ResendOTPChannel("WhatsApp", 2, "WhatsApp");

    private static final /* synthetic */ ResendOTPChannel[] $values() {
        return new ResendOTPChannel[]{SMS, AutomatedCall, WhatsApp};
    }

    static {
        ResendOTPChannel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ResendOTPChannel(String str, int i11, String str2) {
        this.method = str2;
    }

    public static a<ResendOTPChannel> getEntries() {
        return $ENTRIES;
    }

    public static ResendOTPChannel valueOf(String str) {
        return (ResendOTPChannel) Enum.valueOf(ResendOTPChannel.class, str);
    }

    public static ResendOTPChannel[] values() {
        return (ResendOTPChannel[]) $VALUES.clone();
    }

    public final String getMethod() {
        return this.method;
    }
}
