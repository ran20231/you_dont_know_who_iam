package com.forsale.app.datalayer.database;

import androidx.room.RoomDatabase;
import com.forsale.app.datalayer.repositories.InAppMessageDao;
/* compiled from: InAppDatabase.kt */
/* loaded from: classes2.dex */
public abstract class InAppDatabase extends RoomDatabase {
    public static final int $stable = 0;

    public abstract InAppMessageDao inAppMessageDao();
}
