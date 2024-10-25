package com.forsale.app.datalayer.repositories;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.room.h;
import androidx.room.i;
import androidx.room.v;
import com.forsale.app.datalayer.database.ProhibitedKeywordEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import l4.m;
/* loaded from: classes2.dex */
public final class ProhibitedKeywordDao_Impl implements ProhibitedKeywordDao {
    private final RoomDatabase __db;
    private final h<ProhibitedKeywordEntity> __deletionAdapterOfProhibitedKeywordEntity;
    private final i<ProhibitedKeywordEntity> __insertionAdapterOfProhibitedKeywordEntity;
    private final SharedSQLiteStatement __preparedStmtOfDeleteAllProhibitedKeywords;
    private final h<ProhibitedKeywordEntity> __updateAdapterOfProhibitedKeywordEntity;

    public ProhibitedKeywordDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfProhibitedKeywordEntity = new i<ProhibitedKeywordEntity>(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.ProhibitedKeywordDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `prohibited_keywords` (`id`,`keyword`,`is_active`) VALUES (?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.i
            public void bind(m mVar, ProhibitedKeywordEntity prohibitedKeywordEntity) {
                mVar.d1(1, prohibitedKeywordEntity.getId());
                if (prohibitedKeywordEntity.getKeyword() == null) {
                    mVar.u1(2);
                } else {
                    mVar.Q0(2, prohibitedKeywordEntity.getKeyword());
                }
                mVar.d1(3, prohibitedKeywordEntity.isActive());
            }
        };
        this.__deletionAdapterOfProhibitedKeywordEntity = new h<ProhibitedKeywordEntity>(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.ProhibitedKeywordDao_Impl.2
            @Override // androidx.room.h, androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "DELETE FROM `prohibited_keywords` WHERE `id` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.h
            public void bind(m mVar, ProhibitedKeywordEntity prohibitedKeywordEntity) {
                mVar.d1(1, prohibitedKeywordEntity.getId());
            }
        };
        this.__updateAdapterOfProhibitedKeywordEntity = new h<ProhibitedKeywordEntity>(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.ProhibitedKeywordDao_Impl.3
            @Override // androidx.room.h, androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "UPDATE OR REPLACE `prohibited_keywords` SET `id` = ?,`keyword` = ?,`is_active` = ? WHERE `id` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.h
            public void bind(m mVar, ProhibitedKeywordEntity prohibitedKeywordEntity) {
                mVar.d1(1, prohibitedKeywordEntity.getId());
                if (prohibitedKeywordEntity.getKeyword() == null) {
                    mVar.u1(2);
                } else {
                    mVar.Q0(2, prohibitedKeywordEntity.getKeyword());
                }
                mVar.d1(3, prohibitedKeywordEntity.isActive());
                mVar.d1(4, prohibitedKeywordEntity.getId());
            }
        };
        this.__preparedStmtOfDeleteAllProhibitedKeywords = new SharedSQLiteStatement(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.ProhibitedKeywordDao_Impl.4
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM prohibited_keywords";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.forsale.app.datalayer.repositories.ProhibitedKeywordDao
    public Object deleteAllProhibitedKeywords(final List<ProhibitedKeywordEntity> list, zz.a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.repositories.ProhibitedKeywordDao_Impl.8
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                ProhibitedKeywordDao_Impl.this.__db.beginTransaction();
                try {
                    ProhibitedKeywordDao_Impl.this.__db.setTransactionSuccessful();
                    return Integer.valueOf(ProhibitedKeywordDao_Impl.this.__deletionAdapterOfProhibitedKeywordEntity.handleMultiple(list) + 0);
                } finally {
                    ProhibitedKeywordDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.ProhibitedKeywordDao
    public Object deleteProhibitedKeyword(final ProhibitedKeywordEntity prohibitedKeywordEntity, zz.a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.repositories.ProhibitedKeywordDao_Impl.7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                ProhibitedKeywordDao_Impl.this.__db.beginTransaction();
                try {
                    ProhibitedKeywordDao_Impl.this.__db.setTransactionSuccessful();
                    return Integer.valueOf(ProhibitedKeywordDao_Impl.this.__deletionAdapterOfProhibitedKeywordEntity.handle(prohibitedKeywordEntity) + 0);
                } finally {
                    ProhibitedKeywordDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.ProhibitedKeywordDao
    public Object getAllProhibitedKeywords(zz.a<? super List<ProhibitedKeywordEntity>> aVar) {
        final v i11 = v.i("SELECT * FROM  prohibited_keywords", 0);
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<List<ProhibitedKeywordEntity>>() { // from class: com.forsale.app.datalayer.repositories.ProhibitedKeywordDao_Impl.12
            @Override // java.util.concurrent.Callable
            public List<ProhibitedKeywordEntity> call() throws Exception {
                Cursor c11 = j4.b.c(ProhibitedKeywordDao_Impl.this.__db, i11, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, ProhibitedKeywordEntity.KEYWORD);
                    int e13 = j4.a.e(c11, "is_active");
                    ArrayList arrayList = new ArrayList(c11.getCount());
                    while (c11.moveToNext()) {
                        arrayList.add(new ProhibitedKeywordEntity(c11.getInt(e11), c11.isNull(e12) ? null : c11.getString(e12), c11.getInt(e13)));
                    }
                    return arrayList;
                } finally {
                    c11.close();
                    i11.release();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.ProhibitedKeywordDao
    public LiveData<List<ProhibitedKeywordEntity>> getAllProhibitedKeywordsAsLiveData() {
        final v i11 = v.i("SELECT * FROM  prohibited_keywords", 0);
        return this.__db.getInvalidationTracker().e(new String[]{ProhibitedKeywordEntity.PROHIBITED_KEYWORDS}, true, new Callable<List<ProhibitedKeywordEntity>>() { // from class: com.forsale.app.datalayer.repositories.ProhibitedKeywordDao_Impl.13
            protected void finalize() {
                i11.release();
            }

            @Override // java.util.concurrent.Callable
            public List<ProhibitedKeywordEntity> call() throws Exception {
                ProhibitedKeywordDao_Impl.this.__db.beginTransaction();
                try {
                    Cursor c11 = j4.b.c(ProhibitedKeywordDao_Impl.this.__db, i11, false, null);
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, ProhibitedKeywordEntity.KEYWORD);
                    int e13 = j4.a.e(c11, "is_active");
                    ArrayList arrayList = new ArrayList(c11.getCount());
                    while (c11.moveToNext()) {
                        arrayList.add(new ProhibitedKeywordEntity(c11.getInt(e11), c11.isNull(e12) ? null : c11.getString(e12), c11.getInt(e13)));
                    }
                    ProhibitedKeywordDao_Impl.this.__db.setTransactionSuccessful();
                    c11.close();
                    return arrayList;
                } finally {
                    ProhibitedKeywordDao_Impl.this.__db.endTransaction();
                }
            }
        });
    }

    @Override // com.forsale.app.datalayer.repositories.ProhibitedKeywordDao
    public Object getProhibitedKeywordById(int i11, zz.a<? super ProhibitedKeywordEntity> aVar) {
        final v i12 = v.i("SELECT * FROM  prohibited_keywords WHERE id == ?", 1);
        i12.d1(1, i11);
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<ProhibitedKeywordEntity>() { // from class: com.forsale.app.datalayer.repositories.ProhibitedKeywordDao_Impl.11
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public ProhibitedKeywordEntity call() throws Exception {
                ProhibitedKeywordEntity prohibitedKeywordEntity = null;
                String string = null;
                Cursor c11 = j4.b.c(ProhibitedKeywordDao_Impl.this.__db, i12, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, ProhibitedKeywordEntity.KEYWORD);
                    int e13 = j4.a.e(c11, "is_active");
                    if (c11.moveToFirst()) {
                        int i13 = c11.getInt(e11);
                        if (!c11.isNull(e12)) {
                            string = c11.getString(e12);
                        }
                        prohibitedKeywordEntity = new ProhibitedKeywordEntity(i13, string, c11.getInt(e13));
                    }
                    return prohibitedKeywordEntity;
                } finally {
                    c11.close();
                    i12.release();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.ProhibitedKeywordDao
    public Object insertAllProhibitedKeyword(final List<ProhibitedKeywordEntity> list, zz.a<? super List<Long>> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<List<Long>>() { // from class: com.forsale.app.datalayer.repositories.ProhibitedKeywordDao_Impl.6
            @Override // java.util.concurrent.Callable
            public List<Long> call() throws Exception {
                ProhibitedKeywordDao_Impl.this.__db.beginTransaction();
                try {
                    List<Long> insertAndReturnIdsList = ProhibitedKeywordDao_Impl.this.__insertionAdapterOfProhibitedKeywordEntity.insertAndReturnIdsList(list);
                    ProhibitedKeywordDao_Impl.this.__db.setTransactionSuccessful();
                    return insertAndReturnIdsList;
                } finally {
                    ProhibitedKeywordDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.ProhibitedKeywordDao
    public Object insertProhibitedKeyword(final ProhibitedKeywordEntity prohibitedKeywordEntity, zz.a<? super Long> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Long>() { // from class: com.forsale.app.datalayer.repositories.ProhibitedKeywordDao_Impl.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() throws Exception {
                ProhibitedKeywordDao_Impl.this.__db.beginTransaction();
                try {
                    Long valueOf = Long.valueOf(ProhibitedKeywordDao_Impl.this.__insertionAdapterOfProhibitedKeywordEntity.insertAndReturnId(prohibitedKeywordEntity));
                    ProhibitedKeywordDao_Impl.this.__db.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    ProhibitedKeywordDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.ProhibitedKeywordDao
    public Object updateProhibitedKeyword(final ProhibitedKeywordEntity prohibitedKeywordEntity, zz.a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.repositories.ProhibitedKeywordDao_Impl.9
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                ProhibitedKeywordDao_Impl.this.__db.beginTransaction();
                try {
                    ProhibitedKeywordDao_Impl.this.__db.setTransactionSuccessful();
                    return Integer.valueOf(ProhibitedKeywordDao_Impl.this.__updateAdapterOfProhibitedKeywordEntity.handle(prohibitedKeywordEntity) + 0);
                } finally {
                    ProhibitedKeywordDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.ProhibitedKeywordDao
    public Object deleteAllProhibitedKeywords(zz.a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.repositories.ProhibitedKeywordDao_Impl.10
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                m acquire = ProhibitedKeywordDao_Impl.this.__preparedStmtOfDeleteAllProhibitedKeywords.acquire();
                try {
                    ProhibitedKeywordDao_Impl.this.__db.beginTransaction();
                    Integer valueOf = Integer.valueOf(acquire.O());
                    ProhibitedKeywordDao_Impl.this.__db.setTransactionSuccessful();
                    ProhibitedKeywordDao_Impl.this.__db.endTransaction();
                    return valueOf;
                } finally {
                    ProhibitedKeywordDao_Impl.this.__preparedStmtOfDeleteAllProhibitedKeywords.release(acquire);
                }
            }
        }, aVar);
    }
}
