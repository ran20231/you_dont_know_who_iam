package com.forsale.app.datalayer.repositories;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.room.h;
import androidx.room.i;
import androidx.room.v;
import com.forsale.app.datalayer.database.ExtraAttributeGroupEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import l4.m;
/* loaded from: classes2.dex */
public final class ExtraAttributeGroupDao_Impl implements ExtraAttributeGroupDao {
    private final RoomDatabase __db;
    private final h<ExtraAttributeGroupEntity> __deletionAdapterOfExtraAttributeGroupEntity;
    private final i<ExtraAttributeGroupEntity> __insertionAdapterOfExtraAttributeGroupEntity;
    private final SharedSQLiteStatement __preparedStmtOfDeleteAllExtraAttributeGroups;
    private final h<ExtraAttributeGroupEntity> __updateAdapterOfExtraAttributeGroupEntity;

    public ExtraAttributeGroupDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfExtraAttributeGroupEntity = new i<ExtraAttributeGroupEntity>(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.ExtraAttributeGroupDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `extra_attribute_groups` (`id`,`name_en`,`name_ar`,`display_order`) VALUES (?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.i
            public void bind(m mVar, ExtraAttributeGroupEntity extraAttributeGroupEntity) {
                mVar.d1(1, extraAttributeGroupEntity.getId());
                if (extraAttributeGroupEntity.getNameEn() == null) {
                    mVar.u1(2);
                } else {
                    mVar.Q0(2, extraAttributeGroupEntity.getNameEn());
                }
                if (extraAttributeGroupEntity.getNameAr() == null) {
                    mVar.u1(3);
                } else {
                    mVar.Q0(3, extraAttributeGroupEntity.getNameAr());
                }
                mVar.d1(4, extraAttributeGroupEntity.getDisplayOrder());
            }
        };
        this.__deletionAdapterOfExtraAttributeGroupEntity = new h<ExtraAttributeGroupEntity>(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.ExtraAttributeGroupDao_Impl.2
            @Override // androidx.room.h, androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "DELETE FROM `extra_attribute_groups` WHERE `id` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.h
            public void bind(m mVar, ExtraAttributeGroupEntity extraAttributeGroupEntity) {
                mVar.d1(1, extraAttributeGroupEntity.getId());
            }
        };
        this.__updateAdapterOfExtraAttributeGroupEntity = new h<ExtraAttributeGroupEntity>(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.ExtraAttributeGroupDao_Impl.3
            @Override // androidx.room.h, androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "UPDATE OR REPLACE `extra_attribute_groups` SET `id` = ?,`name_en` = ?,`name_ar` = ?,`display_order` = ? WHERE `id` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.h
            public void bind(m mVar, ExtraAttributeGroupEntity extraAttributeGroupEntity) {
                mVar.d1(1, extraAttributeGroupEntity.getId());
                if (extraAttributeGroupEntity.getNameEn() == null) {
                    mVar.u1(2);
                } else {
                    mVar.Q0(2, extraAttributeGroupEntity.getNameEn());
                }
                if (extraAttributeGroupEntity.getNameAr() == null) {
                    mVar.u1(3);
                } else {
                    mVar.Q0(3, extraAttributeGroupEntity.getNameAr());
                }
                mVar.d1(4, extraAttributeGroupEntity.getDisplayOrder());
                mVar.d1(5, extraAttributeGroupEntity.getId());
            }
        };
        this.__preparedStmtOfDeleteAllExtraAttributeGroups = new SharedSQLiteStatement(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.ExtraAttributeGroupDao_Impl.4
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM extra_attribute_groups";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.forsale.app.datalayer.repositories.ExtraAttributeGroupDao
    public Object deleteAllExtraAttributeGroups(final List<ExtraAttributeGroupEntity> list, zz.a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.repositories.ExtraAttributeGroupDao_Impl.8
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                ExtraAttributeGroupDao_Impl.this.__db.beginTransaction();
                try {
                    ExtraAttributeGroupDao_Impl.this.__db.setTransactionSuccessful();
                    return Integer.valueOf(ExtraAttributeGroupDao_Impl.this.__deletionAdapterOfExtraAttributeGroupEntity.handleMultiple(list) + 0);
                } finally {
                    ExtraAttributeGroupDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.ExtraAttributeGroupDao
    public Object deleteExtraAttributeGroup(final ExtraAttributeGroupEntity extraAttributeGroupEntity, zz.a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.repositories.ExtraAttributeGroupDao_Impl.7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                ExtraAttributeGroupDao_Impl.this.__db.beginTransaction();
                try {
                    ExtraAttributeGroupDao_Impl.this.__db.setTransactionSuccessful();
                    return Integer.valueOf(ExtraAttributeGroupDao_Impl.this.__deletionAdapterOfExtraAttributeGroupEntity.handle(extraAttributeGroupEntity) + 0);
                } finally {
                    ExtraAttributeGroupDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.ExtraAttributeGroupDao
    public LiveData<List<ExtraAttributeGroupEntity>> getAllExtraAttributeGroups() {
        final v i11 = v.i("SELECT * FROM  extra_attribute_groups", 0);
        return this.__db.getInvalidationTracker().e(new String[]{ExtraAttributeGroupEntity.EXTRA_ATTRIBUTE_GROUPS_TABLE}, false, new Callable<List<ExtraAttributeGroupEntity>>() { // from class: com.forsale.app.datalayer.repositories.ExtraAttributeGroupDao_Impl.12
            protected void finalize() {
                i11.release();
            }

            @Override // java.util.concurrent.Callable
            public List<ExtraAttributeGroupEntity> call() throws Exception {
                Cursor c11 = j4.b.c(ExtraAttributeGroupDao_Impl.this.__db, i11, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "name_en");
                    int e13 = j4.a.e(c11, "name_ar");
                    int e14 = j4.a.e(c11, "display_order");
                    ArrayList arrayList = new ArrayList(c11.getCount());
                    while (c11.moveToNext()) {
                        arrayList.add(new ExtraAttributeGroupEntity(c11.getInt(e11), c11.isNull(e12) ? null : c11.getString(e12), c11.isNull(e13) ? null : c11.getString(e13), c11.getInt(e14)));
                    }
                    return arrayList;
                } finally {
                    c11.close();
                }
            }
        });
    }

    @Override // com.forsale.app.datalayer.repositories.ExtraAttributeGroupDao
    public Object getAllExtraAttributeGroupsSuspend(zz.a<? super List<ExtraAttributeGroupEntity>> aVar) {
        final v i11 = v.i("SELECT * FROM  extra_attribute_groups", 0);
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<List<ExtraAttributeGroupEntity>>() { // from class: com.forsale.app.datalayer.repositories.ExtraAttributeGroupDao_Impl.13
            @Override // java.util.concurrent.Callable
            public List<ExtraAttributeGroupEntity> call() throws Exception {
                Cursor c11 = j4.b.c(ExtraAttributeGroupDao_Impl.this.__db, i11, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "name_en");
                    int e13 = j4.a.e(c11, "name_ar");
                    int e14 = j4.a.e(c11, "display_order");
                    ArrayList arrayList = new ArrayList(c11.getCount());
                    while (c11.moveToNext()) {
                        arrayList.add(new ExtraAttributeGroupEntity(c11.getInt(e11), c11.isNull(e12) ? null : c11.getString(e12), c11.isNull(e13) ? null : c11.getString(e13), c11.getInt(e14)));
                    }
                    return arrayList;
                } finally {
                    c11.close();
                    i11.release();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.ExtraAttributeGroupDao
    public LiveData<ExtraAttributeGroupEntity> getExtraAttributeGroupById(int i11) {
        final v i12 = v.i("SELECT * FROM  extra_attribute_groups WHERE id == ?", 1);
        i12.d1(1, i11);
        return this.__db.getInvalidationTracker().e(new String[]{ExtraAttributeGroupEntity.EXTRA_ATTRIBUTE_GROUPS_TABLE}, false, new Callable<ExtraAttributeGroupEntity>() { // from class: com.forsale.app.datalayer.repositories.ExtraAttributeGroupDao_Impl.11
            protected void finalize() {
                i12.release();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public ExtraAttributeGroupEntity call() throws Exception {
                ExtraAttributeGroupEntity extraAttributeGroupEntity = null;
                String string = null;
                Cursor c11 = j4.b.c(ExtraAttributeGroupDao_Impl.this.__db, i12, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "name_en");
                    int e13 = j4.a.e(c11, "name_ar");
                    int e14 = j4.a.e(c11, "display_order");
                    if (c11.moveToFirst()) {
                        int i13 = c11.getInt(e11);
                        String string2 = c11.isNull(e12) ? null : c11.getString(e12);
                        if (!c11.isNull(e13)) {
                            string = c11.getString(e13);
                        }
                        extraAttributeGroupEntity = new ExtraAttributeGroupEntity(i13, string2, string, c11.getInt(e14));
                    }
                    return extraAttributeGroupEntity;
                } finally {
                    c11.close();
                }
            }
        });
    }

    @Override // com.forsale.app.datalayer.repositories.ExtraAttributeGroupDao
    public Object insertAllExtraAttributeGroups(final List<ExtraAttributeGroupEntity> list, zz.a<? super List<Long>> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<List<Long>>() { // from class: com.forsale.app.datalayer.repositories.ExtraAttributeGroupDao_Impl.6
            @Override // java.util.concurrent.Callable
            public List<Long> call() throws Exception {
                ExtraAttributeGroupDao_Impl.this.__db.beginTransaction();
                try {
                    List<Long> insertAndReturnIdsList = ExtraAttributeGroupDao_Impl.this.__insertionAdapterOfExtraAttributeGroupEntity.insertAndReturnIdsList(list);
                    ExtraAttributeGroupDao_Impl.this.__db.setTransactionSuccessful();
                    return insertAndReturnIdsList;
                } finally {
                    ExtraAttributeGroupDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.ExtraAttributeGroupDao
    public Object insertExtraAttributeGroup(final ExtraAttributeGroupEntity extraAttributeGroupEntity, zz.a<? super Long> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Long>() { // from class: com.forsale.app.datalayer.repositories.ExtraAttributeGroupDao_Impl.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() throws Exception {
                ExtraAttributeGroupDao_Impl.this.__db.beginTransaction();
                try {
                    Long valueOf = Long.valueOf(ExtraAttributeGroupDao_Impl.this.__insertionAdapterOfExtraAttributeGroupEntity.insertAndReturnId(extraAttributeGroupEntity));
                    ExtraAttributeGroupDao_Impl.this.__db.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    ExtraAttributeGroupDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.ExtraAttributeGroupDao
    public Object updateExtraAttributeGroup(final ExtraAttributeGroupEntity extraAttributeGroupEntity, zz.a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.repositories.ExtraAttributeGroupDao_Impl.9
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                ExtraAttributeGroupDao_Impl.this.__db.beginTransaction();
                try {
                    ExtraAttributeGroupDao_Impl.this.__db.setTransactionSuccessful();
                    return Integer.valueOf(ExtraAttributeGroupDao_Impl.this.__updateAdapterOfExtraAttributeGroupEntity.handle(extraAttributeGroupEntity) + 0);
                } finally {
                    ExtraAttributeGroupDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.ExtraAttributeGroupDao
    public Object deleteAllExtraAttributeGroups(zz.a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.repositories.ExtraAttributeGroupDao_Impl.10
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                m acquire = ExtraAttributeGroupDao_Impl.this.__preparedStmtOfDeleteAllExtraAttributeGroups.acquire();
                try {
                    ExtraAttributeGroupDao_Impl.this.__db.beginTransaction();
                    Integer valueOf = Integer.valueOf(acquire.O());
                    ExtraAttributeGroupDao_Impl.this.__db.setTransactionSuccessful();
                    ExtraAttributeGroupDao_Impl.this.__db.endTransaction();
                    return valueOf;
                } finally {
                    ExtraAttributeGroupDao_Impl.this.__preparedStmtOfDeleteAllExtraAttributeGroups.release(acquire);
                }
            }
        }, aVar);
    }
}
