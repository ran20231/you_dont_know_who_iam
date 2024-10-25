package com.forsale.app.utils.analytics;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Models.kt */
/* loaded from: classes3.dex */
public final class UserRegistrationActionType {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ UserRegistrationActionType[] $VALUES;
    private final String value;
    public static final UserRegistrationActionType REGISTER_STARTED = new UserRegistrationActionType("REGISTER_STARTED", 0, "RegisterStarted");
    public static final UserRegistrationActionType REGISTER_SEND_VERIFY_SMS = new UserRegistrationActionType("REGISTER_SEND_VERIFY_SMS", 1, "RegisterSendVerifySms");
    public static final UserRegistrationActionType REGISTER_VERIFIED = new UserRegistrationActionType("REGISTER_VERIFIED", 2, "RegisterVerified");
    public static final UserRegistrationActionType UN_REGISTERED = new UserRegistrationActionType("UN_REGISTERED", 3, "Unregistered");

    private static final /* synthetic */ UserRegistrationActionType[] $values() {
        return new UserRegistrationActionType[]{REGISTER_STARTED, REGISTER_SEND_VERIFY_SMS, REGISTER_VERIFIED, UN_REGISTERED};
    }

    static {
        UserRegistrationActionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private UserRegistrationActionType(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<UserRegistrationActionType> getEntries() {
        return $ENTRIES;
    }

    public static UserRegistrationActionType valueOf(String str) {
        return (UserRegistrationActionType) Enum.valueOf(UserRegistrationActionType.class, str);
    }

    public static UserRegistrationActionType[] values() {
        return (UserRegistrationActionType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
