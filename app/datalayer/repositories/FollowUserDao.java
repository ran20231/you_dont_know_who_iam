package com.forsale.app.datalayer.repositories;

import androidx.paging.DataSource;
import com.forsale.app.datalayer.network.responses.FollowResponse;
import java.util.List;
import wz.p;
/* compiled from: FollowUserDao.kt */
/* loaded from: classes2.dex */
public interface FollowUserDao {
    DataSource.Factory<Integer, FollowResponse.User> allUsers();

    Object clearAllUsers(zz.a<? super p> aVar);

    Object deleteUser(FollowResponse.User user, zz.a<? super p> aVar);

    Object insertUsers(FollowResponse.User[] userArr, zz.a<? super List<Long>> aVar);

    Object updateFollow(String str, int i11, zz.a<? super p> aVar);
}
