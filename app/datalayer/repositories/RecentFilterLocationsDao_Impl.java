package com.forsale.app.datalayer.repositories;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.room.i;
import androidx.room.v;
import com.forsale.app.datalayer.database.DistrictEntity;
import com.forsale.app.datalayer.database.RecentLocationsEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;
import l4.m;
/* loaded from: classes2.dex */
public final class RecentFilterLocationsDao_Impl implements RecentFilterLocationsDao {
    private final RoomDatabase __db;
    private final i<RecentLocationsEntity> __insertionAdapterOfRecentLocationsEntity;
    private final SharedSQLiteStatement __preparedStmtOfDeleteRecentLocations;

    public RecentFilterLocationsDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfRecentLocationsEntity = new i<RecentLocationsEntity>(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.RecentFilterLocationsDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `recent_locations` (`id`,`level`,`parentId`,`title`,`arTitle`,`enTitle`,`path`,`enPath`,`arPath`,`insertDate`,`verticalId`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.i
            public void bind(m mVar, RecentLocationsEntity recentLocationsEntity) {
                mVar.d1(1, recentLocationsEntity.getId());
                mVar.d1(2, recentLocationsEntity.getLevel());
                mVar.d1(3, recentLocationsEntity.getParentId());
                if (recentLocationsEntity.getTitle() == null) {
                    mVar.u1(4);
                } else {
                    mVar.Q0(4, recentLocationsEntity.getTitle());
                }
                if (recentLocationsEntity.getArTitle() == null) {
                    mVar.u1(5);
                } else {
                    mVar.Q0(5, recentLocationsEntity.getArTitle());
                }
                if (recentLocationsEntity.getEnTitle() == null) {
                    mVar.u1(6);
                } else {
                    mVar.Q0(6, recentLocationsEntity.getEnTitle());
                }
                if (recentLocationsEntity.getPath() == null) {
                    mVar.u1(7);
                } else {
                    mVar.Q0(7, recentLocationsEntity.getPath());
                }
                if (recentLocationsEntity.getEnPath() == null) {
                    mVar.u1(8);
                } else {
                    mVar.Q0(8, recentLocationsEntity.getEnPath());
                }
                if (recentLocationsEntity.getArPath() == null) {
                    mVar.u1(9);
                } else {
                    mVar.Q0(9, recentLocationsEntity.getArPath());
                }
                mVar.d1(10, recentLocationsEntity.getInsertDate());
                mVar.d1(11, recentLocationsEntity.getVerticalId());
            }
        };
        this.__preparedStmtOfDeleteRecentLocations = new SharedSQLiteStatement(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.RecentFilterLocationsDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM recent_locations WHERE id = ?";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.forsale.app.datalayer.repositories.RecentFilterLocationsDao
    public void deleteRecentLocations(int i11) {
        this.__db.assertNotSuspendingTransaction();
        m acquire = this.__preparedStmtOfDeleteRecentLocations.acquire();
        acquire.d1(1, i11);
        try {
            this.__db.beginTransaction();
            acquire.O();
            this.__db.setTransactionSuccessful();
            this.__db.endTransaction();
        } finally {
            this.__preparedStmtOfDeleteRecentLocations.release(acquire);
        }
    }

    @Override // com.forsale.app.datalayer.repositories.RecentFilterLocationsDao
    public Flow<List<RecentLocationsEntity>> getRecentLocations(int i11) {
        final v i12 = v.i("SELECT * FROM recent_locations WHERE verticalId = ? ORDER BY insertDate DESC LIMIT 6", 1);
        i12.d1(1, i11);
        return CoroutinesRoom.a(this.__db, false, new String[]{"recent_locations"}, new Callable<List<RecentLocationsEntity>>() { // from class: com.forsale.app.datalayer.repositories.RecentFilterLocationsDao_Impl.3
            protected void finalize() {
                i12.release();
            }

            @Override // java.util.concurrent.Callable
            public List<RecentLocationsEntity> call() throws Exception {
                Cursor c11 = j4.b.c(RecentFilterLocationsDao_Impl.this.__db, i12, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, DistrictEntity.LEVEL);
                    int e13 = j4.a.e(c11, "parentId");
                    int e14 = j4.a.e(c11, "title");
                    int e15 = j4.a.e(c11, "arTitle");
                    int e16 = j4.a.e(c11, "enTitle");
                    int e17 = j4.a.e(c11, "path");
                    int e18 = j4.a.e(c11, "enPath");
                    int e19 = j4.a.e(c11, "arPath");
                    int e21 = j4.a.e(c11, "insertDate");
                    int e22 = j4.a.e(c11, "verticalId");
                    ArrayList arrayList = new ArrayList(c11.getCount());
                    while (c11.moveToNext()) {
                        arrayList.add(new RecentLocationsEntity(c11.getInt(e11), c11.getInt(e12), c11.getInt(e13), c11.isNull(e14) ? null : c11.getString(e14), c11.isNull(e15) ? null : c11.getString(e15), c11.isNull(e16) ? null : c11.getString(e16), c11.isNull(e17) ? null : c11.getString(e17), c11.isNull(e18) ? null : c11.getString(e18), c11.isNull(e19) ? null : c11.getString(e19), c11.getLong(e21), c11.getInt(e22)));
                    }
                    return arrayList;
                } finally {
                    c11.close();
                }
            }
        });
    }

    @Override // com.forsale.app.datalayer.repositories.RecentFilterLocationsDao
    public void insert(List<RecentLocationsEntity> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfRecentLocationsEntity.insert(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
