package com.forsale.app.analytics.base;

import com.forsale.app.analytics.base.g;
import com.forsale.app.datalayer.database.UserEntity;
import com.forsale.app.features.auth.UserStatus;
import com.forsale.app.utils.TypeExtensionsKt;
/* compiled from: AnalyticsConfiguration.kt */
/* loaded from: classes2.dex */
public final class a {
    public static final g a(UserEntity userEntity) {
        UserStatus userStatus;
        int i11;
        if (userEntity != null) {
            Integer userId = userEntity.getUserId();
            String phone = userEntity.getPhone();
            String firstName = userEntity.getFirstName();
            if (firstName == null) {
                firstName = "";
            }
            g.b bVar = new g.b(userId, phone, firstName, userEntity.getEmail(), userEntity.isEmailVerified(), TypeExtensionsKt.i0(userEntity.isBlock()), userEntity.getLanguage());
            g.a aVar = new g.a(userEntity.getFreeAds(), userEntity.getPremiumAds());
            if (TypeExtensionsKt.i0(userEntity.isBlock())) {
                UserStatus.a aVar2 = UserStatus.Companion;
                Integer isBlock = userEntity.isBlock();
                if (isBlock != null) {
                    i11 = isBlock.intValue();
                } else {
                    i11 = 0;
                }
                userStatus = aVar2.a(i11);
            } else {
                userStatus = UserStatus.LoggedIn;
            }
            return new g(bVar, aVar, userStatus);
        }
        return new g(null, null, UserStatus.NotLoggedIn);
    }
}
