package com.forsale.app.features.auth.verification;

import a00.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VerificationScreenIntention.kt */
/* loaded from: classes2.dex */
public final class VerificationScreenIntention {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ VerificationScreenIntention[] $VALUES;
    private final String value;
    public static final VerificationScreenIntention SIGNUP = new VerificationScreenIntention("SIGNUP", 0, "sign_up");
    public static final VerificationScreenIntention FORGET_PASSWORD = new VerificationScreenIntention("FORGET_PASSWORD", 1, "forget_password");

    private static final /* synthetic */ VerificationScreenIntention[] $values() {
        return new VerificationScreenIntention[]{SIGNUP, FORGET_PASSWORD};
    }

    static {
        VerificationScreenIntention[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private VerificationScreenIntention(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a<VerificationScreenIntention> getEntries() {
        return $ENTRIES;
    }

    public static VerificationScreenIntention valueOf(String str) {
        return (VerificationScreenIntention) Enum.valueOf(VerificationScreenIntention.class, str);
    }

    public static VerificationScreenIntention[] values() {
        return (VerificationScreenIntention[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
