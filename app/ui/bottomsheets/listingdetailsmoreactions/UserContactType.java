package com.forsale.app.ui.bottomsheets.listingdetailsmoreactions;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UserContactType.kt */
/* loaded from: classes3.dex */
public final class UserContactType {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ UserContactType[] $VALUES;
    public static final UserContactType CALL = new UserContactType("CALL", 0);
    public static final UserContactType CHAT = new UserContactType("CHAT", 1);
    public static final UserContactType WHATS_APP = new UserContactType("WHATS_APP", 2);
    public static final UserContactType WHATS_APP_MULTIPLE = new UserContactType("WHATS_APP_MULTIPLE", 3);

    private static final /* synthetic */ UserContactType[] $values() {
        return new UserContactType[]{CALL, CHAT, WHATS_APP, WHATS_APP_MULTIPLE};
    }

    static {
        UserContactType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private UserContactType(String str, int i11) {
    }

    public static a00.a<UserContactType> getEntries() {
        return $ENTRIES;
    }

    public static UserContactType valueOf(String str) {
        return (UserContactType) Enum.valueOf(UserContactType.class, str);
    }

    public static UserContactType[] values() {
        return (UserContactType[]) $VALUES.clone();
    }
}
