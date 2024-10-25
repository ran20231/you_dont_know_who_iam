package com.forsale.app.features.auth;

import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UserStatus.kt */
/* loaded from: classes2.dex */
public final class UserStatus {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ UserStatus[] $VALUES;
    public static final a Companion;
    public static final UserStatus LoggedIn = new UserStatus("LoggedIn", 0);
    public static final UserStatus NotLoggedIn = new UserStatus("NotLoggedIn", 1);
    public static final UserStatus BlockedUser = new UserStatus("BlockedUser", 2);
    public static final UserStatus CompletelyBlocked = new UserStatus("CompletelyBlocked", 3);
    public static final UserStatus DeletedAccount = new UserStatus("DeletedAccount", 4);

    /* compiled from: UserStatus.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final UserStatus a(int i11) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        return UserStatus.BlockedUser;
                    }
                    return UserStatus.DeletedAccount;
                }
                return UserStatus.CompletelyBlocked;
            }
            return UserStatus.BlockedUser;
        }
    }

    private static final /* synthetic */ UserStatus[] $values() {
        return new UserStatus[]{LoggedIn, NotLoggedIn, BlockedUser, CompletelyBlocked, DeletedAccount};
    }

    static {
        UserStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
    }

    private UserStatus(String str, int i11) {
    }

    public static a00.a<UserStatus> getEntries() {
        return $ENTRIES;
    }

    public static UserStatus valueOf(String str) {
        return (UserStatus) Enum.valueOf(UserStatus.class, str);
    }

    public static UserStatus[] values() {
        return (UserStatus[]) $VALUES.clone();
    }
}
