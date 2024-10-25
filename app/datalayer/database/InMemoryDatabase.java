package com.forsale.app.datalayer.database;

import androidx.room.RoomDatabase;
import com.forsale.app.datalayer.repositories.FollowUserDao;
import com.forsale.app.datalayer.repositories.SessionDao;
/* compiled from: InMemoryDatabase.kt */
/* loaded from: classes2.dex */
public abstract class InMemoryDatabase extends RoomDatabase {
    public static final int $stable = 0;

    public abstract FollowUserDao followUserDao();

    public abstract SessionDao sessionDao();
}
