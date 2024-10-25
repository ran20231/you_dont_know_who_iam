package com.forsale.app.datalayer.repositories;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.room.h;
import androidx.room.i;
import androidx.room.v;
import com.forsale.app.datalayer.database.DirectoryCategoryEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import l4.m;
/* loaded from: classes2.dex */
public final class DirectoryCategoryDao_Impl implements DirectoryCategoryDao {
    private final RoomDatabase __db;
    private final h<DirectoryCategoryEntity> __deletionAdapterOfDirectoryCategoryEntity;
    private final i<DirectoryCategoryEntity> __insertionAdapterOfDirectoryCategoryEntity;
    private final SharedSQLiteStatement __preparedStmtOfDeleteAllDirectoryCategories;
    private final h<DirectoryCategoryEntity> __updateAdapterOfDirectoryCategoryEntity;

    public DirectoryCategoryDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfDirectoryCategoryEntity = new i<DirectoryCategoryEntity>(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.DirectoryCategoryDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `directory_categories` (`id`,`name_ar`,`name_en`,`parent_id`,`image`) VALUES (?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.i
            public void bind(m mVar, DirectoryCategoryEntity directoryCategoryEntity) {
                mVar.d1(1, directoryCategoryEntity.getId());
                if (directoryCategoryEntity.getNameAr() == null) {
                    mVar.u1(2);
                } else {
                    mVar.Q0(2, directoryCategoryEntity.getNameAr());
                }
                if (directoryCategoryEntity.getNameEn() == null) {
                    mVar.u1(3);
                } else {
                    mVar.Q0(3, directoryCategoryEntity.getNameEn());
                }
                mVar.d1(4, directoryCategoryEntity.getParentId());
                if (directoryCategoryEntity.getImage() == null) {
                    mVar.u1(5);
                } else {
                    mVar.Q0(5, directoryCategoryEntity.getImage());
                }
            }
        };
        this.__deletionAdapterOfDirectoryCategoryEntity = new h<DirectoryCategoryEntity>(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.DirectoryCategoryDao_Impl.2
            @Override // androidx.room.h, androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "DELETE FROM `directory_categories` WHERE `id` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.h
            public void bind(m mVar, DirectoryCategoryEntity directoryCategoryEntity) {
                mVar.d1(1, directoryCategoryEntity.getId());
            }
        };
        this.__updateAdapterOfDirectoryCategoryEntity = new h<DirectoryCategoryEntity>(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.DirectoryCategoryDao_Impl.3
            @Override // androidx.room.h, androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "UPDATE OR REPLACE `directory_categories` SET `id` = ?,`name_ar` = ?,`name_en` = ?,`parent_id` = ?,`image` = ? WHERE `id` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.h
            public void bind(m mVar, DirectoryCategoryEntity directoryCategoryEntity) {
                mVar.d1(1, directoryCategoryEntity.getId());
                if (directoryCategoryEntity.getNameAr() == null) {
                    mVar.u1(2);
                } else {
                    mVar.Q0(2, directoryCategoryEntity.getNameAr());
                }
                if (directoryCategoryEntity.getNameEn() == null) {
                    mVar.u1(3);
                } else {
                    mVar.Q0(3, directoryCategoryEntity.getNameEn());
                }
                mVar.d1(4, directoryCategoryEntity.getParentId());
                if (directoryCategoryEntity.getImage() == null) {
                    mVar.u1(5);
                } else {
                    mVar.Q0(5, directoryCategoryEntity.getImage());
                }
                mVar.d1(6, directoryCategoryEntity.getId());
            }
        };
        this.__preparedStmtOfDeleteAllDirectoryCategories = new SharedSQLiteStatement(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.DirectoryCategoryDao_Impl.4
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM directory_categories";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.forsale.app.datalayer.repositories.DirectoryCategoryDao
    public Object deleteAllDirectoryCategories(final List<DirectoryCategoryEntity> list, zz.a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.repositories.DirectoryCategoryDao_Impl.8
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                DirectoryCategoryDao_Impl.this.__db.beginTransaction();
                try {
                    DirectoryCategoryDao_Impl.this.__db.setTransactionSuccessful();
                    return Integer.valueOf(DirectoryCategoryDao_Impl.this.__deletionAdapterOfDirectoryCategoryEntity.handleMultiple(list) + 0);
                } finally {
                    DirectoryCategoryDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.DirectoryCategoryDao
    public Object deleteDirectoryCategory(final DirectoryCategoryEntity directoryCategoryEntity, zz.a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.repositories.DirectoryCategoryDao_Impl.7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                DirectoryCategoryDao_Impl.this.__db.beginTransaction();
                try {
                    DirectoryCategoryDao_Impl.this.__db.setTransactionSuccessful();
                    return Integer.valueOf(DirectoryCategoryDao_Impl.this.__deletionAdapterOfDirectoryCategoryEntity.handle(directoryCategoryEntity) + 0);
                } finally {
                    DirectoryCategoryDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.DirectoryCategoryDao
    public LiveData<List<DirectoryCategoryEntity>> getAllDirectoryCategories() {
        final v i11 = v.i("SELECT * FROM  directory_categories", 0);
        return this.__db.getInvalidationTracker().e(new String[]{DirectoryCategoryEntity.DIRECTORY_CATEGORIES_TABLE}, false, new Callable<List<DirectoryCategoryEntity>>() { // from class: com.forsale.app.datalayer.repositories.DirectoryCategoryDao_Impl.12
            protected void finalize() {
                i11.release();
            }

            @Override // java.util.concurrent.Callable
            public List<DirectoryCategoryEntity> call() throws Exception {
                Cursor c11 = j4.b.c(DirectoryCategoryDao_Impl.this.__db, i11, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "name_ar");
                    int e13 = j4.a.e(c11, "name_en");
                    int e14 = j4.a.e(c11, "parent_id");
                    int e15 = j4.a.e(c11, "image");
                    ArrayList arrayList = new ArrayList(c11.getCount());
                    while (c11.moveToNext()) {
                        arrayList.add(new DirectoryCategoryEntity(c11.getInt(e11), c11.isNull(e12) ? null : c11.getString(e12), c11.isNull(e13) ? null : c11.getString(e13), c11.getInt(e14), c11.isNull(e15) ? null : c11.getString(e15)));
                    }
                    return arrayList;
                } finally {
                    c11.close();
                }
            }
        });
    }

    @Override // com.forsale.app.datalayer.repositories.DirectoryCategoryDao
    public Object getAllDirectoryCategoriesSuspend(zz.a<? super List<DirectoryCategoryEntity>> aVar) {
        final v i11 = v.i("SELECT * FROM  directory_categories", 0);
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<List<DirectoryCategoryEntity>>() { // from class: com.forsale.app.datalayer.repositories.DirectoryCategoryDao_Impl.13
            @Override // java.util.concurrent.Callable
            public List<DirectoryCategoryEntity> call() throws Exception {
                Cursor c11 = j4.b.c(DirectoryCategoryDao_Impl.this.__db, i11, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "name_ar");
                    int e13 = j4.a.e(c11, "name_en");
                    int e14 = j4.a.e(c11, "parent_id");
                    int e15 = j4.a.e(c11, "image");
                    ArrayList arrayList = new ArrayList(c11.getCount());
                    while (c11.moveToNext()) {
                        arrayList.add(new DirectoryCategoryEntity(c11.getInt(e11), c11.isNull(e12) ? null : c11.getString(e12), c11.isNull(e13) ? null : c11.getString(e13), c11.getInt(e14), c11.isNull(e15) ? null : c11.getString(e15)));
                    }
                    return arrayList;
                } finally {
                    c11.close();
                    i11.release();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.DirectoryCategoryDao
    public LiveData<List<DirectoryCategoryEntity>> getDirectoryCategoriesByParentId(int i11) {
        final v i12 = v.i("SELECT * FROM  directory_categories WHERE parent_id == ?", 1);
        i12.d1(1, i11);
        return this.__db.getInvalidationTracker().e(new String[]{DirectoryCategoryEntity.DIRECTORY_CATEGORIES_TABLE}, false, new Callable<List<DirectoryCategoryEntity>>() { // from class: com.forsale.app.datalayer.repositories.DirectoryCategoryDao_Impl.14
            protected void finalize() {
                i12.release();
            }

            @Override // java.util.concurrent.Callable
            public List<DirectoryCategoryEntity> call() throws Exception {
                Cursor c11 = j4.b.c(DirectoryCategoryDao_Impl.this.__db, i12, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "name_ar");
                    int e13 = j4.a.e(c11, "name_en");
                    int e14 = j4.a.e(c11, "parent_id");
                    int e15 = j4.a.e(c11, "image");
                    ArrayList arrayList = new ArrayList(c11.getCount());
                    while (c11.moveToNext()) {
                        arrayList.add(new DirectoryCategoryEntity(c11.getInt(e11), c11.isNull(e12) ? null : c11.getString(e12), c11.isNull(e13) ? null : c11.getString(e13), c11.getInt(e14), c11.isNull(e15) ? null : c11.getString(e15)));
                    }
                    return arrayList;
                } finally {
                    c11.close();
                }
            }
        });
    }

    @Override // com.forsale.app.datalayer.repositories.DirectoryCategoryDao
    public Object getDirectoryCategoryById(int i11, zz.a<? super DirectoryCategoryEntity> aVar) {
        final v i12 = v.i("SELECT * FROM  directory_categories WHERE id == ?", 1);
        i12.d1(1, i11);
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<DirectoryCategoryEntity>() { // from class: com.forsale.app.datalayer.repositories.DirectoryCategoryDao_Impl.11
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public DirectoryCategoryEntity call() throws Exception {
                DirectoryCategoryEntity directoryCategoryEntity = null;
                Cursor c11 = j4.b.c(DirectoryCategoryDao_Impl.this.__db, i12, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "name_ar");
                    int e13 = j4.a.e(c11, "name_en");
                    int e14 = j4.a.e(c11, "parent_id");
                    int e15 = j4.a.e(c11, "image");
                    if (c11.moveToFirst()) {
                        directoryCategoryEntity = new DirectoryCategoryEntity(c11.getInt(e11), c11.isNull(e12) ? null : c11.getString(e12), c11.isNull(e13) ? null : c11.getString(e13), c11.getInt(e14), c11.isNull(e15) ? null : c11.getString(e15));
                    }
                    return directoryCategoryEntity;
                } finally {
                    c11.close();
                    i12.release();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.DirectoryCategoryDao
    public Object insertAllDirectoryCategories(final List<DirectoryCategoryEntity> list, zz.a<? super List<Long>> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<List<Long>>() { // from class: com.forsale.app.datalayer.repositories.DirectoryCategoryDao_Impl.6
            @Override // java.util.concurrent.Callable
            public List<Long> call() throws Exception {
                DirectoryCategoryDao_Impl.this.__db.beginTransaction();
                try {
                    List<Long> insertAndReturnIdsList = DirectoryCategoryDao_Impl.this.__insertionAdapterOfDirectoryCategoryEntity.insertAndReturnIdsList(list);
                    DirectoryCategoryDao_Impl.this.__db.setTransactionSuccessful();
                    return insertAndReturnIdsList;
                } finally {
                    DirectoryCategoryDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.DirectoryCategoryDao
    public Object insertDirectoryCategory(final DirectoryCategoryEntity directoryCategoryEntity, zz.a<? super Long> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Long>() { // from class: com.forsale.app.datalayer.repositories.DirectoryCategoryDao_Impl.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() throws Exception {
                DirectoryCategoryDao_Impl.this.__db.beginTransaction();
                try {
                    Long valueOf = Long.valueOf(DirectoryCategoryDao_Impl.this.__insertionAdapterOfDirectoryCategoryEntity.insertAndReturnId(directoryCategoryEntity));
                    DirectoryCategoryDao_Impl.this.__db.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    DirectoryCategoryDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.DirectoryCategoryDao
    public Object updateDirectoryCategory(final DirectoryCategoryEntity directoryCategoryEntity, zz.a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.repositories.DirectoryCategoryDao_Impl.9
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                DirectoryCategoryDao_Impl.this.__db.beginTransaction();
                try {
                    DirectoryCategoryDao_Impl.this.__db.setTransactionSuccessful();
                    return Integer.valueOf(DirectoryCategoryDao_Impl.this.__updateAdapterOfDirectoryCategoryEntity.handle(directoryCategoryEntity) + 0);
                } finally {
                    DirectoryCategoryDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.DirectoryCategoryDao
    public Object deleteAllDirectoryCategories(zz.a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.repositories.DirectoryCategoryDao_Impl.10
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                m acquire = DirectoryCategoryDao_Impl.this.__preparedStmtOfDeleteAllDirectoryCategories.acquire();
                try {
                    DirectoryCategoryDao_Impl.this.__db.beginTransaction();
                    Integer valueOf = Integer.valueOf(acquire.O());
                    DirectoryCategoryDao_Impl.this.__db.setTransactionSuccessful();
                    DirectoryCategoryDao_Impl.this.__db.endTransaction();
                    return valueOf;
                } finally {
                    DirectoryCategoryDao_Impl.this.__preparedStmtOfDeleteAllDirectoryCategories.release(acquire);
                }
            }
        }, aVar);
    }
}
