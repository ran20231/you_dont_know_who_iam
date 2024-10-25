package com.forsale.app.datalayer.network.entities;

import a00.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UserStatus.kt */
/* loaded from: classes2.dex */
public final class UserStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ UserStatus[] $VALUES;
    public static final UserStatus Authorized = new UserStatus("Authorized", 0);
    public static final UserStatus Blocked = new UserStatus("Blocked", 1);

    private static final /* synthetic */ UserStatus[] $values() {
        return new UserStatus[]{Authorized, Blocked};
    }

    static {
        UserStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private UserStatus(String str, int i11) {
    }

    public static a<UserStatus> getEntries() {
        return $ENTRIES;
    }

    public static UserStatus valueOf(String str) {
        return (UserStatus) Enum.valueOf(UserStatus.class, str);
    }

    public static UserStatus[] values() {
        return (UserStatus[]) $VALUES.clone();
    }
}
