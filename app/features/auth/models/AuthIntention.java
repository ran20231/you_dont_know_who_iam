package com.forsale.app.features.auth.models;

import a00.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AuthIntention.kt */
/* loaded from: classes2.dex */
public final class AuthIntention {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AuthIntention[] $VALUES;
    private final String value;
    public static final AuthIntention SignUp = new AuthIntention("SignUp", 0, "SignUp");
    public static final AuthIntention SignIn = new AuthIntention("SignIn", 1, "SignIn");

    private static final /* synthetic */ AuthIntention[] $values() {
        return new AuthIntention[]{SignUp, SignIn};
    }

    static {
        AuthIntention[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private AuthIntention(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a<AuthIntention> getEntries() {
        return $ENTRIES;
    }

    public static AuthIntention valueOf(String str) {
        return (AuthIntention) Enum.valueOf(AuthIntention.class, str);
    }

    public static AuthIntention[] values() {
        return (AuthIntention[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
