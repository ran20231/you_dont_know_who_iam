package com.forsale.app.datalayer.database.repositories;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.room.h;
import androidx.room.i;
import androidx.room.v;
import com.forsale.app.datalayer.database.CategoryExtraAttributeEntity;
import j4.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import l4.m;
import zz.a;
/* loaded from: classes2.dex */
public final class CategoryExtraAttributeDao_Impl implements CategoryExtraAttributeDao {
    private final RoomDatabase __db;
    private final h<CategoryExtraAttributeEntity> __deletionAdapterOfCategoryExtraAttributeEntity;
    private final i<CategoryExtraAttributeEntity> __insertionAdapterOfCategoryExtraAttributeEntity;
    private final SharedSQLiteStatement __preparedStmtOfDeleteAllCategoryExtraAttributes;
    private final h<CategoryExtraAttributeEntity> __updateAdapterOfCategoryExtraAttributeEntity;

    public CategoryExtraAttributeDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfCategoryExtraAttributeEntity = new i<CategoryExtraAttributeEntity>(roomDatabase) { // from class: com.forsale.app.datalayer.database.repositories.CategoryExtraAttributeDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `categories_extra_attributes` (`id`,`cat_id`,`attribute_id`) VALUES (?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.i
            public void bind(m mVar, CategoryExtraAttributeEntity categoryExtraAttributeEntity) {
                mVar.d1(1, categoryExtraAttributeEntity.getId());
                mVar.d1(2, categoryExtraAttributeEntity.getCatId());
                mVar.d1(3, categoryExtraAttributeEntity.getAttributeId());
            }
        };
        this.__deletionAdapterOfCategoryExtraAttributeEntity = new h<CategoryExtraAttributeEntity>(roomDatabase) { // from class: com.forsale.app.datalayer.database.repositories.CategoryExtraAttributeDao_Impl.2
            @Override // androidx.room.h, androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "DELETE FROM `categories_extra_attributes` WHERE `id` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.h
            public void bind(m mVar, CategoryExtraAttributeEntity categoryExtraAttributeEntity) {
                mVar.d1(1, categoryExtraAttributeEntity.getId());
            }
        };
        this.__updateAdapterOfCategoryExtraAttributeEntity = new h<CategoryExtraAttributeEntity>(roomDatabase) { // from class: com.forsale.app.datalayer.database.repositories.CategoryExtraAttributeDao_Impl.3
            @Override // androidx.room.h, androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "UPDATE OR REPLACE `categories_extra_attributes` SET `id` = ?,`cat_id` = ?,`attribute_id` = ? WHERE `id` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.h
            public void bind(m mVar, CategoryExtraAttributeEntity categoryExtraAttributeEntity) {
                mVar.d1(1, categoryExtraAttributeEntity.getId());
                mVar.d1(2, categoryExtraAttributeEntity.getCatId());
                mVar.d1(3, categoryExtraAttributeEntity.getAttributeId());
                mVar.d1(4, categoryExtraAttributeEntity.getId());
            }
        };
        this.__preparedStmtOfDeleteAllCategoryExtraAttributes = new SharedSQLiteStatement(roomDatabase) { // from class: com.forsale.app.datalayer.database.repositories.CategoryExtraAttributeDao_Impl.4
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM categories_extra_attributes";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.forsale.app.datalayer.database.repositories.CategoryExtraAttributeDao
    public Object deleteAllCategoryExtraAttributes(final List<CategoryExtraAttributeEntity> list, a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.database.repositories.CategoryExtraAttributeDao_Impl.8
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                CategoryExtraAttributeDao_Impl.this.__db.beginTransaction();
                try {
                    CategoryExtraAttributeDao_Impl.this.__db.setTransactionSuccessful();
                    return Integer.valueOf(CategoryExtraAttributeDao_Impl.this.__deletionAdapterOfCategoryExtraAttributeEntity.handleMultiple(list) + 0);
                } finally {
                    CategoryExtraAttributeDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.database.repositories.CategoryExtraAttributeDao
    public Object deleteCategoryExtraAttribute(final CategoryExtraAttributeEntity categoryExtraAttributeEntity, a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.database.repositories.CategoryExtraAttributeDao_Impl.7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                CategoryExtraAttributeDao_Impl.this.__db.beginTransaction();
                try {
                    CategoryExtraAttributeDao_Impl.this.__db.setTransactionSuccessful();
                    return Integer.valueOf(CategoryExtraAttributeDao_Impl.this.__deletionAdapterOfCategoryExtraAttributeEntity.handle(categoryExtraAttributeEntity) + 0);
                } finally {
                    CategoryExtraAttributeDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.database.repositories.CategoryExtraAttributeDao
    public LiveData<List<CategoryExtraAttributeEntity>> getAllCategoryExtraAttributes() {
        final v i11 = v.i("SELECT * FROM  categories_extra_attributes", 0);
        return this.__db.getInvalidationTracker().e(new String[]{CategoryExtraAttributeEntity.CATEGORIES_EXTRA_ATTRIBUTES}, false, new Callable<List<CategoryExtraAttributeEntity>>() { // from class: com.forsale.app.datalayer.database.repositories.CategoryExtraAttributeDao_Impl.12
            protected void finalize() {
                i11.release();
            }

            @Override // java.util.concurrent.Callable
            public List<CategoryExtraAttributeEntity> call() throws Exception {
                Cursor c11 = b.c(CategoryExtraAttributeDao_Impl.this.__db, i11, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "cat_id");
                    int e13 = j4.a.e(c11, "attribute_id");
                    ArrayList arrayList = new ArrayList(c11.getCount());
                    while (c11.moveToNext()) {
                        arrayList.add(new CategoryExtraAttributeEntity(c11.getInt(e11), c11.getInt(e12), c11.getInt(e13)));
                    }
                    return arrayList;
                } finally {
                    c11.close();
                }
            }
        });
    }

    @Override // com.forsale.app.datalayer.database.repositories.CategoryExtraAttributeDao
    public Object getAllCategoryExtraAttributesSuspend(a<? super List<CategoryExtraAttributeEntity>> aVar) {
        final v i11 = v.i("SELECT * FROM  categories_extra_attributes", 0);
        return CoroutinesRoom.b(this.__db, false, b.a(), new Callable<List<CategoryExtraAttributeEntity>>() { // from class: com.forsale.app.datalayer.database.repositories.CategoryExtraAttributeDao_Impl.13
            @Override // java.util.concurrent.Callable
            public List<CategoryExtraAttributeEntity> call() throws Exception {
                Cursor c11 = b.c(CategoryExtraAttributeDao_Impl.this.__db, i11, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "cat_id");
                    int e13 = j4.a.e(c11, "attribute_id");
                    ArrayList arrayList = new ArrayList(c11.getCount());
                    while (c11.moveToNext()) {
                        arrayList.add(new CategoryExtraAttributeEntity(c11.getInt(e11), c11.getInt(e12), c11.getInt(e13)));
                    }
                    return arrayList;
                } finally {
                    c11.close();
                    i11.release();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.database.repositories.CategoryExtraAttributeDao
    public LiveData<CategoryExtraAttributeEntity> getCategoryExtraAttributeById(int i11) {
        final v i12 = v.i("SELECT * FROM  categories_extra_attributes WHERE id == ?", 1);
        i12.d1(1, i11);
        return this.__db.getInvalidationTracker().e(new String[]{CategoryExtraAttributeEntity.CATEGORIES_EXTRA_ATTRIBUTES}, false, new Callable<CategoryExtraAttributeEntity>() { // from class: com.forsale.app.datalayer.database.repositories.CategoryExtraAttributeDao_Impl.11
            protected void finalize() {
                i12.release();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public CategoryExtraAttributeEntity call() throws Exception {
                Cursor c11 = b.c(CategoryExtraAttributeDao_Impl.this.__db, i12, false, null);
                try {
                    return c11.moveToFirst() ? new CategoryExtraAttributeEntity(c11.getInt(j4.a.e(c11, "id")), c11.getInt(j4.a.e(c11, "cat_id")), c11.getInt(j4.a.e(c11, "attribute_id"))) : null;
                } finally {
                    c11.close();
                }
            }
        });
    }

    @Override // com.forsale.app.datalayer.database.repositories.CategoryExtraAttributeDao
    public Object insertAllCategoryExtraAttributes(final List<CategoryExtraAttributeEntity> list, a<? super List<Long>> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<List<Long>>() { // from class: com.forsale.app.datalayer.database.repositories.CategoryExtraAttributeDao_Impl.6
            @Override // java.util.concurrent.Callable
            public List<Long> call() throws Exception {
                CategoryExtraAttributeDao_Impl.this.__db.beginTransaction();
                try {
                    List<Long> insertAndReturnIdsList = CategoryExtraAttributeDao_Impl.this.__insertionAdapterOfCategoryExtraAttributeEntity.insertAndReturnIdsList(list);
                    CategoryExtraAttributeDao_Impl.this.__db.setTransactionSuccessful();
                    return insertAndReturnIdsList;
                } finally {
                    CategoryExtraAttributeDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.database.repositories.CategoryExtraAttributeDao
    public Object insertCategoryExtraAttribute(final CategoryExtraAttributeEntity categoryExtraAttributeEntity, a<? super Long> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Long>() { // from class: com.forsale.app.datalayer.database.repositories.CategoryExtraAttributeDao_Impl.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() throws Exception {
                CategoryExtraAttributeDao_Impl.this.__db.beginTransaction();
                try {
                    Long valueOf = Long.valueOf(CategoryExtraAttributeDao_Impl.this.__insertionAdapterOfCategoryExtraAttributeEntity.insertAndReturnId(categoryExtraAttributeEntity));
                    CategoryExtraAttributeDao_Impl.this.__db.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    CategoryExtraAttributeDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.database.repositories.CategoryExtraAttributeDao
    public Object updateCategoryExtraAttribute(final CategoryExtraAttributeEntity categoryExtraAttributeEntity, a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.database.repositories.CategoryExtraAttributeDao_Impl.9
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                CategoryExtraAttributeDao_Impl.this.__db.beginTransaction();
                try {
                    CategoryExtraAttributeDao_Impl.this.__db.setTransactionSuccessful();
                    return Integer.valueOf(CategoryExtraAttributeDao_Impl.this.__updateAdapterOfCategoryExtraAttributeEntity.handle(categoryExtraAttributeEntity) + 0);
                } finally {
                    CategoryExtraAttributeDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.database.repositories.CategoryExtraAttributeDao
    public Object deleteAllCategoryExtraAttributes(a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.database.repositories.CategoryExtraAttributeDao_Impl.10
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                m acquire = CategoryExtraAttributeDao_Impl.this.__preparedStmtOfDeleteAllCategoryExtraAttributes.acquire();
                try {
                    CategoryExtraAttributeDao_Impl.this.__db.beginTransaction();
                    Integer valueOf = Integer.valueOf(acquire.O());
                    CategoryExtraAttributeDao_Impl.this.__db.setTransactionSuccessful();
                    CategoryExtraAttributeDao_Impl.this.__db.endTransaction();
                    return valueOf;
                } finally {
                    CategoryExtraAttributeDao_Impl.this.__preparedStmtOfDeleteAllCategoryExtraAttributes.release(acquire);
                }
            }
        }, aVar);
    }
}
