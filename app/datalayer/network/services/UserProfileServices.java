package com.forsale.app.datalayer.network.services;

import com.forsale.app.datalayer.database.UserEntity;
import com.forsale.app.datalayer.network.entities.SessionEntity;
import com.forsale.app.datalayer.network.requestsbodies.DeleteAccountBody;
import com.forsale.app.datalayer.network.requestsbodies.EditProfileBody;
import com.forsale.app.datalayer.network.requestsbodies.SetLanguageBody;
import i10.a;
import i10.o;
import wz.p;
/* compiled from: UserProfileServices.kt */
/* loaded from: classes2.dex */
public interface UserProfileServices {
    @o("UsersProfile/deleteAccount")
    Object deleteAccount(@a DeleteAccountBody deleteAccountBody, zz.a<? super p> aVar);

    @o("UsersProfile/editProfile")
    Object editProfile(@a EditProfileBody editProfileBody, zz.a<? super SessionEntity> aVar);

    @o("UsersProfile/setLanguage")
    Object setLanguage(@a SetLanguageBody setLanguageBody, zz.a<? super UserEntity> aVar);
}
