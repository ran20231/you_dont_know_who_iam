package com.forsale.app.datalayer.repositories;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.room.h;
import androidx.room.i;
import androidx.room.v;
import com.forsale.app.datalayer.database.CategoryDistrict;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import l4.m;
/* loaded from: classes2.dex */
public final class CategoryDistrictDao_Impl implements CategoryDistrictDao {
    private final RoomDatabase __db;
    private final h<CategoryDistrict> __deletionAdapterOfCategoryDistrict;
    private final i<CategoryDistrict> __insertionAdapterOfCategoryDistrict;
    private final SharedSQLiteStatement __preparedStmtOfDeleteAllCategoryDistricts;
    private final h<CategoryDistrict> __updateAdapterOfCategoryDistrict;

    public CategoryDistrictDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfCategoryDistrict = new i<CategoryDistrict>(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.CategoryDistrictDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `categories_districts` (`id`,`cat_id`,`district_id`,`price`,`pinning_shuffle_factor`,`user_type_pinning_shuffle_factor`,`max_price`,`commercial_pinning_shuffle_factor`,`allow_upload_on_free`,`listings_count`,`is_active`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.i
            public void bind(m mVar, CategoryDistrict categoryDistrict) {
                mVar.d1(1, categoryDistrict.getId());
                mVar.d1(2, categoryDistrict.getCatId());
                mVar.d1(3, categoryDistrict.getDistrictId());
                mVar.S(4, categoryDistrict.getPrice());
                mVar.d1(5, categoryDistrict.getPinningShuffleFactor());
                mVar.d1(6, categoryDistrict.getUserTypePinningShuffleFactor());
                mVar.d1(7, categoryDistrict.getMaxPrice());
                mVar.d1(8, categoryDistrict.getCommercialPinningShuffleFactor());
                mVar.d1(9, categoryDistrict.getAllowUploadOnFree());
                mVar.d1(10, categoryDistrict.getListingCount());
                if (categoryDistrict.isActive() == null) {
                    mVar.u1(11);
                } else {
                    mVar.d1(11, categoryDistrict.isActive().intValue());
                }
            }
        };
        this.__deletionAdapterOfCategoryDistrict = new h<CategoryDistrict>(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.CategoryDistrictDao_Impl.2
            @Override // androidx.room.h, androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "DELETE FROM `categories_districts` WHERE `id` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.h
            public void bind(m mVar, CategoryDistrict categoryDistrict) {
                mVar.d1(1, categoryDistrict.getId());
            }
        };
        this.__updateAdapterOfCategoryDistrict = new h<CategoryDistrict>(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.CategoryDistrictDao_Impl.3
            @Override // androidx.room.h, androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "UPDATE OR REPLACE `categories_districts` SET `id` = ?,`cat_id` = ?,`district_id` = ?,`price` = ?,`pinning_shuffle_factor` = ?,`user_type_pinning_shuffle_factor` = ?,`max_price` = ?,`commercial_pinning_shuffle_factor` = ?,`allow_upload_on_free` = ?,`listings_count` = ?,`is_active` = ? WHERE `id` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.h
            public void bind(m mVar, CategoryDistrict categoryDistrict) {
                mVar.d1(1, categoryDistrict.getId());
                mVar.d1(2, categoryDistrict.getCatId());
                mVar.d1(3, categoryDistrict.getDistrictId());
                mVar.S(4, categoryDistrict.getPrice());
                mVar.d1(5, categoryDistrict.getPinningShuffleFactor());
                mVar.d1(6, categoryDistrict.getUserTypePinningShuffleFactor());
                mVar.d1(7, categoryDistrict.getMaxPrice());
                mVar.d1(8, categoryDistrict.getCommercialPinningShuffleFactor());
                mVar.d1(9, categoryDistrict.getAllowUploadOnFree());
                mVar.d1(10, categoryDistrict.getListingCount());
                if (categoryDistrict.isActive() == null) {
                    mVar.u1(11);
                } else {
                    mVar.d1(11, categoryDistrict.isActive().intValue());
                }
                mVar.d1(12, categoryDistrict.getId());
            }
        };
        this.__preparedStmtOfDeleteAllCategoryDistricts = new SharedSQLiteStatement(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.CategoryDistrictDao_Impl.4
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM categories_districts";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.forsale.app.datalayer.repositories.CategoryDistrictDao
    public Object deleteAllCategoryDistricts(final List<CategoryDistrict> list, zz.a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.repositories.CategoryDistrictDao_Impl.8
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                CategoryDistrictDao_Impl.this.__db.beginTransaction();
                try {
                    CategoryDistrictDao_Impl.this.__db.setTransactionSuccessful();
                    return Integer.valueOf(CategoryDistrictDao_Impl.this.__deletionAdapterOfCategoryDistrict.handleMultiple(list) + 0);
                } finally {
                    CategoryDistrictDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.CategoryDistrictDao
    public Object deleteCategoryDistrict(final CategoryDistrict categoryDistrict, zz.a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.repositories.CategoryDistrictDao_Impl.7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                CategoryDistrictDao_Impl.this.__db.beginTransaction();
                try {
                    CategoryDistrictDao_Impl.this.__db.setTransactionSuccessful();
                    return Integer.valueOf(CategoryDistrictDao_Impl.this.__deletionAdapterOfCategoryDistrict.handle(categoryDistrict) + 0);
                } finally {
                    CategoryDistrictDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.CategoryDistrictDao
    public Object getAllCategoryDistrictsSuspend(zz.a<? super List<CategoryDistrict>> aVar) {
        final v i11 = v.i("SELECT * FROM  categories_districts", 0);
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<List<CategoryDistrict>>() { // from class: com.forsale.app.datalayer.repositories.CategoryDistrictDao_Impl.11
            @Override // java.util.concurrent.Callable
            public List<CategoryDistrict> call() throws Exception {
                Cursor c11 = j4.b.c(CategoryDistrictDao_Impl.this.__db, i11, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "cat_id");
                    int e13 = j4.a.e(c11, CategoryDistrict.DISTRICT_ID);
                    int e14 = j4.a.e(c11, "price");
                    int e15 = j4.a.e(c11, CategoryDistrict.PINNING_SHUFFLE_FACTOR);
                    int e16 = j4.a.e(c11, CategoryDistrict.USER_TYPE_PINNING_SHUFFLE_FACTOR);
                    int e17 = j4.a.e(c11, CategoryDistrict.MAX_PRICE);
                    int e18 = j4.a.e(c11, CategoryDistrict.COMMERCIAL_PINNING_SHUFFLE_FACTOR);
                    int e19 = j4.a.e(c11, CategoryDistrict.ALLOW_UPLOAD_ON_FREE);
                    int e21 = j4.a.e(c11, CategoryDistrict.LISTINGS_COUNT);
                    int e22 = j4.a.e(c11, "is_active");
                    ArrayList arrayList = new ArrayList(c11.getCount());
                    while (c11.moveToNext()) {
                        arrayList.add(new CategoryDistrict(c11.getInt(e11), c11.getInt(e12), c11.getInt(e13), c11.getFloat(e14), c11.getInt(e15), c11.getInt(e16), c11.getInt(e17), c11.getInt(e18), c11.getInt(e19), c11.getLong(e21), c11.isNull(e22) ? null : Integer.valueOf(c11.getInt(e22))));
                    }
                    return arrayList;
                } finally {
                    c11.close();
                    i11.release();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.CategoryDistrictDao
    public Object getCategoryDistrictByCategoryId(int i11, int i12, zz.a<? super CategoryDistrict> aVar) {
        final v i13 = v.i("SELECT categories_districts.* FROM  categories_districts INNER JOIN districts on district_id = districts.id WHERE cat_id ==?  AND (district_id ==? or district_id in (districts.parents)) order by level desc limit 1", 2);
        i13.d1(1, i11);
        i13.d1(2, i12);
        return CoroutinesRoom.b(this.__db, true, j4.b.a(), new Callable<CategoryDistrict>() { // from class: com.forsale.app.datalayer.repositories.CategoryDistrictDao_Impl.12
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public CategoryDistrict call() throws Exception {
                CategoryDistrictDao_Impl.this.__db.beginTransaction();
                try {
                    CategoryDistrict categoryDistrict = null;
                    Cursor c11 = j4.b.c(CategoryDistrictDao_Impl.this.__db, i13, false, null);
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "cat_id");
                    int e13 = j4.a.e(c11, CategoryDistrict.DISTRICT_ID);
                    int e14 = j4.a.e(c11, "price");
                    int e15 = j4.a.e(c11, CategoryDistrict.PINNING_SHUFFLE_FACTOR);
                    int e16 = j4.a.e(c11, CategoryDistrict.USER_TYPE_PINNING_SHUFFLE_FACTOR);
                    int e17 = j4.a.e(c11, CategoryDistrict.MAX_PRICE);
                    int e18 = j4.a.e(c11, CategoryDistrict.COMMERCIAL_PINNING_SHUFFLE_FACTOR);
                    int e19 = j4.a.e(c11, CategoryDistrict.ALLOW_UPLOAD_ON_FREE);
                    int e21 = j4.a.e(c11, CategoryDistrict.LISTINGS_COUNT);
                    int e22 = j4.a.e(c11, "is_active");
                    if (c11.moveToFirst()) {
                        categoryDistrict = new CategoryDistrict(c11.getInt(e11), c11.getInt(e12), c11.getInt(e13), c11.getFloat(e14), c11.getInt(e15), c11.getInt(e16), c11.getInt(e17), c11.getInt(e18), c11.getInt(e19), c11.getLong(e21), c11.isNull(e22) ? null : Integer.valueOf(c11.getInt(e22)));
                    }
                    CategoryDistrictDao_Impl.this.__db.setTransactionSuccessful();
                    c11.close();
                    i13.release();
                    return categoryDistrict;
                } finally {
                    CategoryDistrictDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.CategoryDistrictDao
    public Object insertAllCategoryDistrict(final List<CategoryDistrict> list, zz.a<? super List<Long>> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<List<Long>>() { // from class: com.forsale.app.datalayer.repositories.CategoryDistrictDao_Impl.6
            @Override // java.util.concurrent.Callable
            public List<Long> call() throws Exception {
                CategoryDistrictDao_Impl.this.__db.beginTransaction();
                try {
                    List<Long> insertAndReturnIdsList = CategoryDistrictDao_Impl.this.__insertionAdapterOfCategoryDistrict.insertAndReturnIdsList(list);
                    CategoryDistrictDao_Impl.this.__db.setTransactionSuccessful();
                    return insertAndReturnIdsList;
                } finally {
                    CategoryDistrictDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.CategoryDistrictDao
    public Object insertCategoryDistrict(final CategoryDistrict categoryDistrict, zz.a<? super Long> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Long>() { // from class: com.forsale.app.datalayer.repositories.CategoryDistrictDao_Impl.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() throws Exception {
                CategoryDistrictDao_Impl.this.__db.beginTransaction();
                try {
                    Long valueOf = Long.valueOf(CategoryDistrictDao_Impl.this.__insertionAdapterOfCategoryDistrict.insertAndReturnId(categoryDistrict));
                    CategoryDistrictDao_Impl.this.__db.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    CategoryDistrictDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.CategoryDistrictDao
    public Object updateCategoryDistrict(final CategoryDistrict categoryDistrict, zz.a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.repositories.CategoryDistrictDao_Impl.9
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                CategoryDistrictDao_Impl.this.__db.beginTransaction();
                try {
                    CategoryDistrictDao_Impl.this.__db.setTransactionSuccessful();
                    return Integer.valueOf(CategoryDistrictDao_Impl.this.__updateAdapterOfCategoryDistrict.handle(categoryDistrict) + 0);
                } finally {
                    CategoryDistrictDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.CategoryDistrictDao
    public Object deleteAllCategoryDistricts(zz.a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.repositories.CategoryDistrictDao_Impl.10
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                m acquire = CategoryDistrictDao_Impl.this.__preparedStmtOfDeleteAllCategoryDistricts.acquire();
                try {
                    CategoryDistrictDao_Impl.this.__db.beginTransaction();
                    Integer valueOf = Integer.valueOf(acquire.O());
                    CategoryDistrictDao_Impl.this.__db.setTransactionSuccessful();
                    CategoryDistrictDao_Impl.this.__db.endTransaction();
                    return valueOf;
                } finally {
                    CategoryDistrictDao_Impl.this.__preparedStmtOfDeleteAllCategoryDistricts.release(acquire);
                }
            }
        }, aVar);
    }
}
