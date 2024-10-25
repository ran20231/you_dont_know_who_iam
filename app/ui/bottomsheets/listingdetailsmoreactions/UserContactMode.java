package com.forsale.app.ui.bottomsheets.listingdetailsmoreactions;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UserContactMode.kt */
/* loaded from: classes3.dex */
public final class UserContactMode {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ UserContactMode[] $VALUES;
    public static final UserContactMode CALL_ONLY = new UserContactMode("CALL_ONLY", 0);
    public static final UserContactMode WHATSAPP_ONLY = new UserContactMode("WHATSAPP_ONLY", 1);
    public static final UserContactMode CHAT_ONLY = new UserContactMode("CHAT_ONLY", 2);
    public static final UserContactMode MORE_ACTIONS = new UserContactMode("MORE_ACTIONS", 3);

    private static final /* synthetic */ UserContactMode[] $values() {
        return new UserContactMode[]{CALL_ONLY, WHATSAPP_ONLY, CHAT_ONLY, MORE_ACTIONS};
    }

    static {
        UserContactMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private UserContactMode(String str, int i11) {
    }

    public static a00.a<UserContactMode> getEntries() {
        return $ENTRIES;
    }

    public static UserContactMode valueOf(String str) {
        return (UserContactMode) Enum.valueOf(UserContactMode.class, str);
    }

    public static UserContactMode[] values() {
        return (UserContactMode[]) $VALUES.clone();
    }
}
