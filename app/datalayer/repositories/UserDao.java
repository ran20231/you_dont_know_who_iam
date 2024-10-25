package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.database.UserEntity;
import kotlinx.coroutines.flow.Flow;
import wz.p;
/* compiled from: UserDao.kt */
/* loaded from: classes2.dex */
public interface UserDao {
    Object getUser(zz.a<? super UserEntity> aVar);

    Flow<UserEntity> getUserAsFlow();

    Object insertUser(UserEntity userEntity, zz.a<? super p> aVar);
}
