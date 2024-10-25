package com.forsale.app.datalayer.repositories;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.room.i;
import androidx.room.v;
import com.forsale.app.datalayer.database.SearchPlaceholderKeywordEntity;
import com.forsale.app.datalayer.database.TrendEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;
import l4.m;
/* loaded from: classes2.dex */
public final class TrendDao_Impl implements TrendDao {
    private final RoomDatabase __db;
    private final i<TrendEntity> __insertionAdapterOfTrendEntity;
    private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

    public TrendDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfTrendEntity = new i<TrendEntity>(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.TrendDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `trends` (`id`,`ar`,`en`,`is_title`) VALUES (nullif(?, 0),?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.i
            public void bind(m mVar, TrendEntity trendEntity) {
                mVar.d1(1, trendEntity.getId());
                if (trendEntity.getAr() == null) {
                    mVar.u1(2);
                } else {
                    mVar.Q0(2, trendEntity.getAr());
                }
                if (trendEntity.getEn() == null) {
                    mVar.u1(3);
                } else {
                    mVar.Q0(3, trendEntity.getEn());
                }
                mVar.d1(4, trendEntity.isTitle() ? 1L : 0L);
            }
        };
        this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.TrendDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM trends";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.forsale.app.datalayer.repositories.TrendDao
    public Object deleteAll(zz.a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.repositories.TrendDao_Impl.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                m acquire = TrendDao_Impl.this.__preparedStmtOfDeleteAll.acquire();
                try {
                    TrendDao_Impl.this.__db.beginTransaction();
                    Integer valueOf = Integer.valueOf(acquire.O());
                    TrendDao_Impl.this.__db.setTransactionSuccessful();
                    TrendDao_Impl.this.__db.endTransaction();
                    return valueOf;
                } finally {
                    TrendDao_Impl.this.__preparedStmtOfDeleteAll.release(acquire);
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.TrendDao
    public Object getAllTrends(zz.a<? super List<TrendEntity>> aVar) {
        final v i11 = v.i("SELECT * FROM trends where is_title == 0", 0);
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<List<TrendEntity>>() { // from class: com.forsale.app.datalayer.repositories.TrendDao_Impl.7
            @Override // java.util.concurrent.Callable
            public List<TrendEntity> call() throws Exception {
                Cursor c11 = j4.b.c(TrendDao_Impl.this.__db, i11, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, SearchPlaceholderKeywordEntity.AR);
                    int e13 = j4.a.e(c11, SearchPlaceholderKeywordEntity.EN);
                    int e14 = j4.a.e(c11, "is_title");
                    ArrayList arrayList = new ArrayList(c11.getCount());
                    while (c11.moveToNext()) {
                        arrayList.add(new TrendEntity(c11.getInt(e11), c11.isNull(e12) ? null : c11.getString(e12), c11.isNull(e13) ? null : c11.getString(e13), c11.getInt(e14) != 0));
                    }
                    return arrayList;
                } finally {
                    c11.close();
                    i11.release();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.TrendDao
    public Flow<List<TrendEntity>> getAllTrendsLive() {
        final v i11 = v.i("SELECT * FROM trends where is_title == 0", 0);
        return CoroutinesRoom.a(this.__db, false, new String[]{"trends"}, new Callable<List<TrendEntity>>() { // from class: com.forsale.app.datalayer.repositories.TrendDao_Impl.5
            protected void finalize() {
                i11.release();
            }

            @Override // java.util.concurrent.Callable
            public List<TrendEntity> call() throws Exception {
                Cursor c11 = j4.b.c(TrendDao_Impl.this.__db, i11, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, SearchPlaceholderKeywordEntity.AR);
                    int e13 = j4.a.e(c11, SearchPlaceholderKeywordEntity.EN);
                    int e14 = j4.a.e(c11, "is_title");
                    ArrayList arrayList = new ArrayList(c11.getCount());
                    while (c11.moveToNext()) {
                        arrayList.add(new TrendEntity(c11.getInt(e11), c11.isNull(e12) ? null : c11.getString(e12), c11.isNull(e13) ? null : c11.getString(e13), c11.getInt(e14) != 0));
                    }
                    return arrayList;
                } finally {
                    c11.close();
                }
            }
        });
    }

    @Override // com.forsale.app.datalayer.repositories.TrendDao
    public Flow<List<TrendEntity>> getAllTrendsWithTitleFlow() {
        final v i11 = v.i("SELECT * FROM trends", 0);
        return CoroutinesRoom.a(this.__db, false, new String[]{"trends"}, new Callable<List<TrendEntity>>() { // from class: com.forsale.app.datalayer.repositories.TrendDao_Impl.6
            protected void finalize() {
                i11.release();
            }

            @Override // java.util.concurrent.Callable
            public List<TrendEntity> call() throws Exception {
                Cursor c11 = j4.b.c(TrendDao_Impl.this.__db, i11, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, SearchPlaceholderKeywordEntity.AR);
                    int e13 = j4.a.e(c11, SearchPlaceholderKeywordEntity.EN);
                    int e14 = j4.a.e(c11, "is_title");
                    ArrayList arrayList = new ArrayList(c11.getCount());
                    while (c11.moveToNext()) {
                        arrayList.add(new TrendEntity(c11.getInt(e11), c11.isNull(e12) ? null : c11.getString(e12), c11.isNull(e13) ? null : c11.getString(e13), c11.getInt(e14) != 0));
                    }
                    return arrayList;
                } finally {
                    c11.close();
                }
            }
        });
    }

    @Override // com.forsale.app.datalayer.repositories.TrendDao
    public Flow<TrendEntity> getTitleAsFlow() {
        final v i11 = v.i("SELECT * FROM trends where is_title == 1 LIMIT 1", 0);
        return CoroutinesRoom.a(this.__db, false, new String[]{"trends"}, new Callable<TrendEntity>() { // from class: com.forsale.app.datalayer.repositories.TrendDao_Impl.8
            protected void finalize() {
                i11.release();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public TrendEntity call() throws Exception {
                TrendEntity trendEntity = null;
                String string = null;
                Cursor c11 = j4.b.c(TrendDao_Impl.this.__db, i11, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, SearchPlaceholderKeywordEntity.AR);
                    int e13 = j4.a.e(c11, SearchPlaceholderKeywordEntity.EN);
                    int e14 = j4.a.e(c11, "is_title");
                    if (c11.moveToFirst()) {
                        int i12 = c11.getInt(e11);
                        String string2 = c11.isNull(e12) ? null : c11.getString(e12);
                        if (!c11.isNull(e13)) {
                            string = c11.getString(e13);
                        }
                        trendEntity = new TrendEntity(i12, string2, string, c11.getInt(e14) != 0);
                    }
                    return trendEntity;
                } finally {
                    c11.close();
                }
            }
        });
    }

    @Override // com.forsale.app.datalayer.repositories.TrendDao
    public Object insertAll(final List<TrendEntity> list, zz.a<? super List<Long>> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<List<Long>>() { // from class: com.forsale.app.datalayer.repositories.TrendDao_Impl.3
            @Override // java.util.concurrent.Callable
            public List<Long> call() throws Exception {
                TrendDao_Impl.this.__db.beginTransaction();
                try {
                    List<Long> insertAndReturnIdsList = TrendDao_Impl.this.__insertionAdapterOfTrendEntity.insertAndReturnIdsList(list);
                    TrendDao_Impl.this.__db.setTransactionSuccessful();
                    return insertAndReturnIdsList;
                } finally {
                    TrendDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }
}
