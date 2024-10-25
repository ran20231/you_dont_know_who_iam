package com.forsale.app.datalayer.repositories;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.room.h;
import androidx.room.i;
import androidx.room.v;
import com.forsale.app.datalayer.database.ExtraAttributeOptionEntity;
import j4.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import l4.m;
/* loaded from: classes2.dex */
public final class ExtraAttributeOptionDao_Impl implements ExtraAttributeOptionDao {
    private final RoomDatabase __db;
    private final h<ExtraAttributeOptionEntity> __deletionAdapterOfExtraAttributeOptionEntity;
    private final i<ExtraAttributeOptionEntity> __insertionAdapterOfExtraAttributeOptionEntity;
    private final SharedSQLiteStatement __preparedStmtOfDeleteAllExtraAttributeOptions;
    private final h<ExtraAttributeOptionEntity> __updateAdapterOfExtraAttributeOptionEntity;

    public ExtraAttributeOptionDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfExtraAttributeOptionEntity = new i<ExtraAttributeOptionEntity>(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.ExtraAttributeOptionDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `extra_attribute_options` (`id`,`attribute_id`,`display_order`,`name_en`,`name_ar`) VALUES (?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.i
            public void bind(m mVar, ExtraAttributeOptionEntity extraAttributeOptionEntity) {
                mVar.d1(1, extraAttributeOptionEntity.getId());
                mVar.d1(2, extraAttributeOptionEntity.getAttributeId());
                mVar.d1(3, extraAttributeOptionEntity.getDisplayOrder());
                if (extraAttributeOptionEntity.getNameEn() == null) {
                    mVar.u1(4);
                } else {
                    mVar.Q0(4, extraAttributeOptionEntity.getNameEn());
                }
                if (extraAttributeOptionEntity.getNameAr() == null) {
                    mVar.u1(5);
                } else {
                    mVar.Q0(5, extraAttributeOptionEntity.getNameAr());
                }
            }
        };
        this.__deletionAdapterOfExtraAttributeOptionEntity = new h<ExtraAttributeOptionEntity>(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.ExtraAttributeOptionDao_Impl.2
            @Override // androidx.room.h, androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "DELETE FROM `extra_attribute_options` WHERE `id` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.h
            public void bind(m mVar, ExtraAttributeOptionEntity extraAttributeOptionEntity) {
                mVar.d1(1, extraAttributeOptionEntity.getId());
            }
        };
        this.__updateAdapterOfExtraAttributeOptionEntity = new h<ExtraAttributeOptionEntity>(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.ExtraAttributeOptionDao_Impl.3
            @Override // androidx.room.h, androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "UPDATE OR REPLACE `extra_attribute_options` SET `id` = ?,`attribute_id` = ?,`display_order` = ?,`name_en` = ?,`name_ar` = ? WHERE `id` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.h
            public void bind(m mVar, ExtraAttributeOptionEntity extraAttributeOptionEntity) {
                mVar.d1(1, extraAttributeOptionEntity.getId());
                mVar.d1(2, extraAttributeOptionEntity.getAttributeId());
                mVar.d1(3, extraAttributeOptionEntity.getDisplayOrder());
                if (extraAttributeOptionEntity.getNameEn() == null) {
                    mVar.u1(4);
                } else {
                    mVar.Q0(4, extraAttributeOptionEntity.getNameEn());
                }
                if (extraAttributeOptionEntity.getNameAr() == null) {
                    mVar.u1(5);
                } else {
                    mVar.Q0(5, extraAttributeOptionEntity.getNameAr());
                }
                mVar.d1(6, extraAttributeOptionEntity.getId());
            }
        };
        this.__preparedStmtOfDeleteAllExtraAttributeOptions = new SharedSQLiteStatement(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.ExtraAttributeOptionDao_Impl.4
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM extra_attribute_options";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.forsale.app.datalayer.repositories.ExtraAttributeOptionDao
    public Object deleteAllExtraAttributeOptions(final List<ExtraAttributeOptionEntity> list, zz.a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.repositories.ExtraAttributeOptionDao_Impl.8
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                ExtraAttributeOptionDao_Impl.this.__db.beginTransaction();
                try {
                    ExtraAttributeOptionDao_Impl.this.__db.setTransactionSuccessful();
                    return Integer.valueOf(ExtraAttributeOptionDao_Impl.this.__deletionAdapterOfExtraAttributeOptionEntity.handleMultiple(list) + 0);
                } finally {
                    ExtraAttributeOptionDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.ExtraAttributeOptionDao
    public Object deleteExtraAttributeOption(final ExtraAttributeOptionEntity extraAttributeOptionEntity, zz.a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.repositories.ExtraAttributeOptionDao_Impl.7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                ExtraAttributeOptionDao_Impl.this.__db.beginTransaction();
                try {
                    ExtraAttributeOptionDao_Impl.this.__db.setTransactionSuccessful();
                    return Integer.valueOf(ExtraAttributeOptionDao_Impl.this.__deletionAdapterOfExtraAttributeOptionEntity.handle(extraAttributeOptionEntity) + 0);
                } finally {
                    ExtraAttributeOptionDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.ExtraAttributeOptionDao
    public LiveData<List<ExtraAttributeOptionEntity>> getAllExtraAttributeOptions() {
        final v i11 = v.i("SELECT * FROM  extra_attribute_options", 0);
        return this.__db.getInvalidationTracker().e(new String[]{ExtraAttributeOptionEntity.EXTRA_ATTRIBUTE_OPTIONS_TABLE}, false, new Callable<List<ExtraAttributeOptionEntity>>() { // from class: com.forsale.app.datalayer.repositories.ExtraAttributeOptionDao_Impl.15
            protected void finalize() {
                i11.release();
            }

            @Override // java.util.concurrent.Callable
            public List<ExtraAttributeOptionEntity> call() throws Exception {
                Cursor c11 = j4.b.c(ExtraAttributeOptionDao_Impl.this.__db, i11, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "attribute_id");
                    int e13 = j4.a.e(c11, "display_order");
                    int e14 = j4.a.e(c11, "name_en");
                    int e15 = j4.a.e(c11, "name_ar");
                    ArrayList arrayList = new ArrayList(c11.getCount());
                    while (c11.moveToNext()) {
                        arrayList.add(new ExtraAttributeOptionEntity(c11.getInt(e11), c11.getInt(e12), c11.getInt(e13), c11.isNull(e14) ? null : c11.getString(e14), c11.isNull(e15) ? null : c11.getString(e15)));
                    }
                    return arrayList;
                } finally {
                    c11.close();
                }
            }
        });
    }

    @Override // com.forsale.app.datalayer.repositories.ExtraAttributeOptionDao
    public Object getAllExtraAttributeOptionsSuspend(zz.a<? super List<ExtraAttributeOptionEntity>> aVar) {
        final v i11 = v.i("SELECT * FROM  extra_attribute_options", 0);
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<List<ExtraAttributeOptionEntity>>() { // from class: com.forsale.app.datalayer.repositories.ExtraAttributeOptionDao_Impl.16
            @Override // java.util.concurrent.Callable
            public List<ExtraAttributeOptionEntity> call() throws Exception {
                Cursor c11 = j4.b.c(ExtraAttributeOptionDao_Impl.this.__db, i11, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "attribute_id");
                    int e13 = j4.a.e(c11, "display_order");
                    int e14 = j4.a.e(c11, "name_en");
                    int e15 = j4.a.e(c11, "name_ar");
                    ArrayList arrayList = new ArrayList(c11.getCount());
                    while (c11.moveToNext()) {
                        arrayList.add(new ExtraAttributeOptionEntity(c11.getInt(e11), c11.getInt(e12), c11.getInt(e13), c11.isNull(e14) ? null : c11.getString(e14), c11.isNull(e15) ? null : c11.getString(e15)));
                    }
                    return arrayList;
                } finally {
                    c11.close();
                    i11.release();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.ExtraAttributeOptionDao
    public Object getExtraAttributeOptionById(int i11, zz.a<? super ExtraAttributeOptionEntity> aVar) {
        final v i12 = v.i("SELECT * FROM  extra_attribute_options WHERE id == ?", 1);
        i12.d1(1, i11);
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<ExtraAttributeOptionEntity>() { // from class: com.forsale.app.datalayer.repositories.ExtraAttributeOptionDao_Impl.11
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public ExtraAttributeOptionEntity call() throws Exception {
                ExtraAttributeOptionEntity extraAttributeOptionEntity = null;
                Cursor c11 = j4.b.c(ExtraAttributeOptionDao_Impl.this.__db, i12, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "attribute_id");
                    int e13 = j4.a.e(c11, "display_order");
                    int e14 = j4.a.e(c11, "name_en");
                    int e15 = j4.a.e(c11, "name_ar");
                    if (c11.moveToFirst()) {
                        extraAttributeOptionEntity = new ExtraAttributeOptionEntity(c11.getInt(e11), c11.getInt(e12), c11.getInt(e13), c11.isNull(e14) ? null : c11.getString(e14), c11.isNull(e15) ? null : c11.getString(e15));
                    }
                    return extraAttributeOptionEntity;
                } finally {
                    c11.close();
                    i12.release();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.ExtraAttributeOptionDao
    public Object getExtraAttributeOptionsBuAttributeId(int i11, zz.a<? super List<ExtraAttributeOptionEntity>> aVar) {
        final v i12 = v.i("SELECT * FROM  extra_attribute_options WHERE attribute_id == ? ORDER BY display_order", 1);
        i12.d1(1, i11);
        return CoroutinesRoom.b(this.__db, true, j4.b.a(), new Callable<List<ExtraAttributeOptionEntity>>() { // from class: com.forsale.app.datalayer.repositories.ExtraAttributeOptionDao_Impl.17
            @Override // java.util.concurrent.Callable
            public List<ExtraAttributeOptionEntity> call() throws Exception {
                ExtraAttributeOptionDao_Impl.this.__db.beginTransaction();
                try {
                    Cursor c11 = j4.b.c(ExtraAttributeOptionDao_Impl.this.__db, i12, false, null);
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "attribute_id");
                    int e13 = j4.a.e(c11, "display_order");
                    int e14 = j4.a.e(c11, "name_en");
                    int e15 = j4.a.e(c11, "name_ar");
                    ArrayList arrayList = new ArrayList(c11.getCount());
                    while (c11.moveToNext()) {
                        arrayList.add(new ExtraAttributeOptionEntity(c11.getInt(e11), c11.getInt(e12), c11.getInt(e13), c11.isNull(e14) ? null : c11.getString(e14), c11.isNull(e15) ? null : c11.getString(e15)));
                    }
                    ExtraAttributeOptionDao_Impl.this.__db.setTransactionSuccessful();
                    c11.close();
                    i12.release();
                    return arrayList;
                } finally {
                    ExtraAttributeOptionDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.ExtraAttributeOptionDao
    public Object getExtraAttributeOptionsByIds(List<Integer> list, zz.a<? super List<String>> aVar) {
        StringBuilder b11 = e.b();
        b11.append("SELECT extra_attribute_options.name_en FROM extra_attribute_options where id in (");
        int size = list.size();
        e.a(b11, size);
        b11.append(")");
        final v i11 = v.i(b11.toString(), size + 0);
        int i12 = 1;
        for (Integer num : list) {
            if (num == null) {
                i11.u1(i12);
            } else {
                i11.d1(i12, num.intValue());
            }
            i12++;
        }
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<List<String>>() { // from class: com.forsale.app.datalayer.repositories.ExtraAttributeOptionDao_Impl.12
            @Override // java.util.concurrent.Callable
            public List<String> call() throws Exception {
                Cursor c11 = j4.b.c(ExtraAttributeOptionDao_Impl.this.__db, i11, false, null);
                try {
                    ArrayList arrayList = new ArrayList(c11.getCount());
                    while (c11.moveToNext()) {
                        arrayList.add(c11.isNull(0) ? null : c11.getString(0));
                    }
                    return arrayList;
                } finally {
                    c11.close();
                    i11.release();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.ExtraAttributeOptionDao
    public Object getExtraAttributeOptionsByOptionIds(List<Integer> list, zz.a<? super List<ExtraAttributeOptionEntity>> aVar) {
        StringBuilder b11 = e.b();
        b11.append("SELECT * FROM extra_attribute_options where id in (");
        int size = list.size();
        e.a(b11, size);
        b11.append(")");
        final v i11 = v.i(b11.toString(), size + 0);
        int i12 = 1;
        for (Integer num : list) {
            if (num == null) {
                i11.u1(i12);
            } else {
                i11.d1(i12, num.intValue());
            }
            i12++;
        }
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<List<ExtraAttributeOptionEntity>>() { // from class: com.forsale.app.datalayer.repositories.ExtraAttributeOptionDao_Impl.13
            @Override // java.util.concurrent.Callable
            public List<ExtraAttributeOptionEntity> call() throws Exception {
                Cursor c11 = j4.b.c(ExtraAttributeOptionDao_Impl.this.__db, i11, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "attribute_id");
                    int e13 = j4.a.e(c11, "display_order");
                    int e14 = j4.a.e(c11, "name_en");
                    int e15 = j4.a.e(c11, "name_ar");
                    ArrayList arrayList = new ArrayList(c11.getCount());
                    while (c11.moveToNext()) {
                        arrayList.add(new ExtraAttributeOptionEntity(c11.getInt(e11), c11.getInt(e12), c11.getInt(e13), c11.isNull(e14) ? null : c11.getString(e14), c11.isNull(e15) ? null : c11.getString(e15)));
                    }
                    return arrayList;
                } finally {
                    c11.close();
                    i11.release();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.ExtraAttributeOptionDao
    public Object getExtraAttributeOptionsListByAttributeIds(List<Integer> list, zz.a<? super List<ExtraAttributeOptionEntity>> aVar) {
        StringBuilder b11 = e.b();
        b11.append("SELECT * FROM extra_attribute_options where attribute_id in (");
        int size = list.size();
        e.a(b11, size);
        b11.append(")");
        final v i11 = v.i(b11.toString(), size + 0);
        int i12 = 1;
        for (Integer num : list) {
            if (num == null) {
                i11.u1(i12);
            } else {
                i11.d1(i12, num.intValue());
            }
            i12++;
        }
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<List<ExtraAttributeOptionEntity>>() { // from class: com.forsale.app.datalayer.repositories.ExtraAttributeOptionDao_Impl.14
            @Override // java.util.concurrent.Callable
            public List<ExtraAttributeOptionEntity> call() throws Exception {
                Cursor c11 = j4.b.c(ExtraAttributeOptionDao_Impl.this.__db, i11, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "attribute_id");
                    int e13 = j4.a.e(c11, "display_order");
                    int e14 = j4.a.e(c11, "name_en");
                    int e15 = j4.a.e(c11, "name_ar");
                    ArrayList arrayList = new ArrayList(c11.getCount());
                    while (c11.moveToNext()) {
                        arrayList.add(new ExtraAttributeOptionEntity(c11.getInt(e11), c11.getInt(e12), c11.getInt(e13), c11.isNull(e14) ? null : c11.getString(e14), c11.isNull(e15) ? null : c11.getString(e15)));
                    }
                    return arrayList;
                } finally {
                    c11.close();
                    i11.release();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.ExtraAttributeOptionDao
    public Object insertAllExtraAttributeOptions(final List<ExtraAttributeOptionEntity> list, zz.a<? super List<Long>> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<List<Long>>() { // from class: com.forsale.app.datalayer.repositories.ExtraAttributeOptionDao_Impl.6
            @Override // java.util.concurrent.Callable
            public List<Long> call() throws Exception {
                ExtraAttributeOptionDao_Impl.this.__db.beginTransaction();
                try {
                    List<Long> insertAndReturnIdsList = ExtraAttributeOptionDao_Impl.this.__insertionAdapterOfExtraAttributeOptionEntity.insertAndReturnIdsList(list);
                    ExtraAttributeOptionDao_Impl.this.__db.setTransactionSuccessful();
                    return insertAndReturnIdsList;
                } finally {
                    ExtraAttributeOptionDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.ExtraAttributeOptionDao
    public Object insertExtraAttributeOption(final ExtraAttributeOptionEntity extraAttributeOptionEntity, zz.a<? super Long> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Long>() { // from class: com.forsale.app.datalayer.repositories.ExtraAttributeOptionDao_Impl.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() throws Exception {
                ExtraAttributeOptionDao_Impl.this.__db.beginTransaction();
                try {
                    Long valueOf = Long.valueOf(ExtraAttributeOptionDao_Impl.this.__insertionAdapterOfExtraAttributeOptionEntity.insertAndReturnId(extraAttributeOptionEntity));
                    ExtraAttributeOptionDao_Impl.this.__db.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    ExtraAttributeOptionDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.ExtraAttributeOptionDao
    public Object updateExtraAttributeOption(final ExtraAttributeOptionEntity extraAttributeOptionEntity, zz.a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.repositories.ExtraAttributeOptionDao_Impl.9
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                ExtraAttributeOptionDao_Impl.this.__db.beginTransaction();
                try {
                    ExtraAttributeOptionDao_Impl.this.__db.setTransactionSuccessful();
                    return Integer.valueOf(ExtraAttributeOptionDao_Impl.this.__updateAdapterOfExtraAttributeOptionEntity.handle(extraAttributeOptionEntity) + 0);
                } finally {
                    ExtraAttributeOptionDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.ExtraAttributeOptionDao
    public Object deleteAllExtraAttributeOptions(zz.a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.repositories.ExtraAttributeOptionDao_Impl.10
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                m acquire = ExtraAttributeOptionDao_Impl.this.__preparedStmtOfDeleteAllExtraAttributeOptions.acquire();
                try {
                    ExtraAttributeOptionDao_Impl.this.__db.beginTransaction();
                    Integer valueOf = Integer.valueOf(acquire.O());
                    ExtraAttributeOptionDao_Impl.this.__db.setTransactionSuccessful();
                    ExtraAttributeOptionDao_Impl.this.__db.endTransaction();
                    return valueOf;
                } finally {
                    ExtraAttributeOptionDao_Impl.this.__preparedStmtOfDeleteAllExtraAttributeOptions.release(acquire);
                }
            }
        }, aVar);
    }
}
