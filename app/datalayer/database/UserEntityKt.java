package com.forsale.app.datalayer.database;

import com.forsale.app.features.auth.UserStatus;
import kotlin.jvm.internal.o;
/* compiled from: UserEntity.kt */
/* loaded from: classes2.dex */
public final class UserEntityKt {
    public static final UserStatus getUserBlockedStatus(UserEntity userEntity) {
        o.i(userEntity, "<this>");
        Integer isBlock = userEntity.isBlock();
        if (isBlock != null && isBlock.intValue() == 1) {
            return UserStatus.BlockedUser;
        }
        if (isBlock != null && isBlock.intValue() == 2) {
            return UserStatus.CompletelyBlocked;
        }
        if (isBlock != null && isBlock.intValue() == 3) {
            return UserStatus.DeletedAccount;
        }
        return null;
    }

    public static final UserStatus getUserStatus(UserEntity userEntity, boolean z11) {
        o.i(userEntity, "<this>");
        Integer isBlock = userEntity.isBlock();
        if (isBlock != null && isBlock.intValue() == 1) {
            return UserStatus.BlockedUser;
        }
        if (isBlock != null && isBlock.intValue() == 2) {
            return UserStatus.CompletelyBlocked;
        }
        if (isBlock != null && isBlock.intValue() == 3) {
            return UserStatus.DeletedAccount;
        }
        if (z11) {
            return UserStatus.LoggedIn;
        }
        return UserStatus.NotLoggedIn;
    }
}
