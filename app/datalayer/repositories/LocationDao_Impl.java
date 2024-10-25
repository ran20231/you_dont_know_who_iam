package com.forsale.app.datalayer.repositories;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.room.h;
import androidx.room.i;
import androidx.room.v;
import com.forsale.app.datalayer.database.LocationEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;
import l4.m;
/* loaded from: classes2.dex */
public final class LocationDao_Impl implements LocationDao {
    private final RoomDatabase __db;
    private final h<LocationEntity> __deletionAdapterOfLocationEntity;
    private final i<LocationEntity> __insertionAdapterOfLocationEntity;
    private final SharedSQLiteStatement __preparedStmtOfDeleteAllLocations;
    private final h<LocationEntity> __updateAdapterOfLocationEntity;

    public LocationDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfLocationEntity = new i<LocationEntity>(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.LocationDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `locations` (`id`,`name_ar`,`name_en`,`region_id`) VALUES (?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.i
            public void bind(m mVar, LocationEntity locationEntity) {
                mVar.d1(1, locationEntity.getId());
                if (locationEntity.getNameAr() == null) {
                    mVar.u1(2);
                } else {
                    mVar.Q0(2, locationEntity.getNameAr());
                }
                if (locationEntity.getNameEn() == null) {
                    mVar.u1(3);
                } else {
                    mVar.Q0(3, locationEntity.getNameEn());
                }
                mVar.d1(4, locationEntity.getRegionId());
            }
        };
        this.__deletionAdapterOfLocationEntity = new h<LocationEntity>(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.LocationDao_Impl.2
            @Override // androidx.room.h, androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "DELETE FROM `locations` WHERE `id` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.h
            public void bind(m mVar, LocationEntity locationEntity) {
                mVar.d1(1, locationEntity.getId());
            }
        };
        this.__updateAdapterOfLocationEntity = new h<LocationEntity>(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.LocationDao_Impl.3
            @Override // androidx.room.h, androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "UPDATE OR REPLACE `locations` SET `id` = ?,`name_ar` = ?,`name_en` = ?,`region_id` = ? WHERE `id` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.h
            public void bind(m mVar, LocationEntity locationEntity) {
                mVar.d1(1, locationEntity.getId());
                if (locationEntity.getNameAr() == null) {
                    mVar.u1(2);
                } else {
                    mVar.Q0(2, locationEntity.getNameAr());
                }
                if (locationEntity.getNameEn() == null) {
                    mVar.u1(3);
                } else {
                    mVar.Q0(3, locationEntity.getNameEn());
                }
                mVar.d1(4, locationEntity.getRegionId());
                mVar.d1(5, locationEntity.getId());
            }
        };
        this.__preparedStmtOfDeleteAllLocations = new SharedSQLiteStatement(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.LocationDao_Impl.4
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM locations";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.forsale.app.datalayer.repositories.LocationDao
    public Object deleteAllLocations(final List<LocationEntity> list, zz.a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.repositories.LocationDao_Impl.8
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                LocationDao_Impl.this.__db.beginTransaction();
                try {
                    LocationDao_Impl.this.__db.setTransactionSuccessful();
                    return Integer.valueOf(LocationDao_Impl.this.__deletionAdapterOfLocationEntity.handleMultiple(list) + 0);
                } finally {
                    LocationDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.LocationDao
    public Object deleteLocation(final LocationEntity locationEntity, zz.a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.repositories.LocationDao_Impl.7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                LocationDao_Impl.this.__db.beginTransaction();
                try {
                    LocationDao_Impl.this.__db.setTransactionSuccessful();
                    return Integer.valueOf(LocationDao_Impl.this.__deletionAdapterOfLocationEntity.handle(locationEntity) + 0);
                } finally {
                    LocationDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.LocationDao
    public Flow<List<LocationEntity>> getAllLocations(int i11) {
        final v i12 = v.i("SELECT * FROM  locations WHERE region_id == ?", 1);
        i12.d1(1, i11);
        return CoroutinesRoom.a(this.__db, false, new String[]{LocationEntity.LOCATIONS_TABLE}, new Callable<List<LocationEntity>>() { // from class: com.forsale.app.datalayer.repositories.LocationDao_Impl.13
            protected void finalize() {
                i12.release();
            }

            @Override // java.util.concurrent.Callable
            public List<LocationEntity> call() throws Exception {
                Cursor c11 = j4.b.c(LocationDao_Impl.this.__db, i12, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "name_ar");
                    int e13 = j4.a.e(c11, "name_en");
                    int e14 = j4.a.e(c11, "region_id");
                    ArrayList arrayList = new ArrayList(c11.getCount());
                    while (c11.moveToNext()) {
                        arrayList.add(new LocationEntity(c11.getInt(e11), c11.isNull(e12) ? null : c11.getString(e12), c11.isNull(e13) ? null : c11.getString(e13), c11.getInt(e14)));
                    }
                    return arrayList;
                } finally {
                    c11.close();
                }
            }
        });
    }

    @Override // com.forsale.app.datalayer.repositories.LocationDao
    public Object getAllLocationsSuspend(zz.a<? super List<LocationEntity>> aVar) {
        final v i11 = v.i("SELECT * FROM  locations", 0);
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<List<LocationEntity>>() { // from class: com.forsale.app.datalayer.repositories.LocationDao_Impl.14
            @Override // java.util.concurrent.Callable
            public List<LocationEntity> call() throws Exception {
                Cursor c11 = j4.b.c(LocationDao_Impl.this.__db, i11, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "name_ar");
                    int e13 = j4.a.e(c11, "name_en");
                    int e14 = j4.a.e(c11, "region_id");
                    ArrayList arrayList = new ArrayList(c11.getCount());
                    while (c11.moveToNext()) {
                        arrayList.add(new LocationEntity(c11.getInt(e11), c11.isNull(e12) ? null : c11.getString(e12), c11.isNull(e13) ? null : c11.getString(e13), c11.getInt(e14)));
                    }
                    return arrayList;
                } finally {
                    c11.close();
                    i11.release();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.LocationDao
    public LiveData<LocationEntity> getLocationById(int i11) {
        final v i12 = v.i("SELECT * FROM  locations WHERE id == ?", 1);
        i12.d1(1, i11);
        return this.__db.getInvalidationTracker().e(new String[]{LocationEntity.LOCATIONS_TABLE}, false, new Callable<LocationEntity>() { // from class: com.forsale.app.datalayer.repositories.LocationDao_Impl.11
            protected void finalize() {
                i12.release();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public LocationEntity call() throws Exception {
                LocationEntity locationEntity = null;
                String string = null;
                Cursor c11 = j4.b.c(LocationDao_Impl.this.__db, i12, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "name_ar");
                    int e13 = j4.a.e(c11, "name_en");
                    int e14 = j4.a.e(c11, "region_id");
                    if (c11.moveToFirst()) {
                        int i13 = c11.getInt(e11);
                        String string2 = c11.isNull(e12) ? null : c11.getString(e12);
                        if (!c11.isNull(e13)) {
                            string = c11.getString(e13);
                        }
                        locationEntity = new LocationEntity(i13, string2, string, c11.getInt(e14));
                    }
                    return locationEntity;
                } finally {
                    c11.close();
                }
            }
        });
    }

    @Override // com.forsale.app.datalayer.repositories.LocationDao
    public Object getLocationSuspendById(int i11, zz.a<? super LocationEntity> aVar) {
        final v i12 = v.i("SELECT * FROM  locations WHERE id == ?", 1);
        i12.d1(1, i11);
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<LocationEntity>() { // from class: com.forsale.app.datalayer.repositories.LocationDao_Impl.12
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public LocationEntity call() throws Exception {
                LocationEntity locationEntity = null;
                String string = null;
                Cursor c11 = j4.b.c(LocationDao_Impl.this.__db, i12, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "name_ar");
                    int e13 = j4.a.e(c11, "name_en");
                    int e14 = j4.a.e(c11, "region_id");
                    if (c11.moveToFirst()) {
                        int i13 = c11.getInt(e11);
                        String string2 = c11.isNull(e12) ? null : c11.getString(e12);
                        if (!c11.isNull(e13)) {
                            string = c11.getString(e13);
                        }
                        locationEntity = new LocationEntity(i13, string2, string, c11.getInt(e14));
                    }
                    return locationEntity;
                } finally {
                    c11.close();
                    i12.release();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.LocationDao
    public Object insertAllLocations(final List<LocationEntity> list, zz.a<? super List<Long>> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<List<Long>>() { // from class: com.forsale.app.datalayer.repositories.LocationDao_Impl.6
            @Override // java.util.concurrent.Callable
            public List<Long> call() throws Exception {
                LocationDao_Impl.this.__db.beginTransaction();
                try {
                    List<Long> insertAndReturnIdsList = LocationDao_Impl.this.__insertionAdapterOfLocationEntity.insertAndReturnIdsList(list);
                    LocationDao_Impl.this.__db.setTransactionSuccessful();
                    return insertAndReturnIdsList;
                } finally {
                    LocationDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.LocationDao
    public Object insertLocation(final LocationEntity locationEntity, zz.a<? super Long> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Long>() { // from class: com.forsale.app.datalayer.repositories.LocationDao_Impl.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() throws Exception {
                LocationDao_Impl.this.__db.beginTransaction();
                try {
                    Long valueOf = Long.valueOf(LocationDao_Impl.this.__insertionAdapterOfLocationEntity.insertAndReturnId(locationEntity));
                    LocationDao_Impl.this.__db.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    LocationDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.LocationDao
    public Object updateLocation(final LocationEntity locationEntity, zz.a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.repositories.LocationDao_Impl.9
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                LocationDao_Impl.this.__db.beginTransaction();
                try {
                    LocationDao_Impl.this.__db.setTransactionSuccessful();
                    return Integer.valueOf(LocationDao_Impl.this.__updateAdapterOfLocationEntity.handle(locationEntity) + 0);
                } finally {
                    LocationDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.LocationDao
    public Object deleteAllLocations(zz.a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.repositories.LocationDao_Impl.10
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                m acquire = LocationDao_Impl.this.__preparedStmtOfDeleteAllLocations.acquire();
                try {
                    LocationDao_Impl.this.__db.beginTransaction();
                    Integer valueOf = Integer.valueOf(acquire.O());
                    LocationDao_Impl.this.__db.setTransactionSuccessful();
                    LocationDao_Impl.this.__db.endTransaction();
                    return valueOf;
                } finally {
                    LocationDao_Impl.this.__preparedStmtOfDeleteAllLocations.release(acquire);
                }
            }
        }, aVar);
    }
}
