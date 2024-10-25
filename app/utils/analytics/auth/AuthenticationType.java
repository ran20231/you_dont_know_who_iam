package com.forsale.app.utils.analytics.auth;

import a00.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AuthenticationType.kt */
/* loaded from: classes3.dex */
public final class AuthenticationType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AuthenticationType[] $VALUES;
    private final String type;
    public static final AuthenticationType SIGNUP = new AuthenticationType("SIGNUP", 0, "Signup");
    public static final AuthenticationType LOGIN = new AuthenticationType("LOGIN", 1, "Login");
    public static final AuthenticationType FORGET_PASSWORD = new AuthenticationType("FORGET_PASSWORD", 2, "Forget Password");

    private static final /* synthetic */ AuthenticationType[] $values() {
        return new AuthenticationType[]{SIGNUP, LOGIN, FORGET_PASSWORD};
    }

    static {
        AuthenticationType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private AuthenticationType(String str, int i11, String str2) {
        this.type = str2;
    }

    public static a<AuthenticationType> getEntries() {
        return $ENTRIES;
    }

    public static AuthenticationType valueOf(String str) {
        return (AuthenticationType) Enum.valueOf(AuthenticationType.class, str);
    }

    public static AuthenticationType[] values() {
        return (AuthenticationType[]) $VALUES.clone();
    }

    public final String getType() {
        return this.type;
    }
}
