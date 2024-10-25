package com.forsale.app.datalayer.repositories;

import android.database.Cursor;
import androidx.collection.o;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.room.h;
import androidx.room.i;
import androidx.room.v;
import com.forsale.app.datalayer.database.AreaWithBlocks;
import com.forsale.app.datalayer.database.DistrictEntity;
import com.forsale.app.datalayer.network.requestsbodies.AdvancedSearchBody;
import g00.l;
import j4.d;
import j4.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import l4.m;
import wz.p;
/* loaded from: classes2.dex */
public final class DistrictDao_Impl implements DistrictDao {
    private final RoomDatabase __db;
    private final h<DistrictEntity> __deletionAdapterOfDistrictEntity;
    private final i<DistrictEntity> __insertionAdapterOfDistrictEntity;
    private final SharedSQLiteStatement __preparedStmtOfDeleteAllDistricts;
    private final h<DistrictEntity> __updateAdapterOfDistrictEntity;

    public DistrictDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfDistrictEntity = new i<DistrictEntity>(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.DistrictDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `districts` (`id`,`region_id`,`display_order`,`name_en`,`name_ar`,`image`,`image_en`,`image_ar`,`parent_id`,`level`,`children`,`parents`,`geo_lat`,`geo_lon`,`full_path_ar`,`full_path_en`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.i
            public void bind(m mVar, DistrictEntity districtEntity) {
                mVar.d1(1, districtEntity.getId());
                mVar.d1(2, districtEntity.getRegionId());
                mVar.d1(3, districtEntity.getDisplayOrder());
                if (districtEntity.getNameEn() == null) {
                    mVar.u1(4);
                } else {
                    mVar.Q0(4, districtEntity.getNameEn());
                }
                if (districtEntity.getNameAr() == null) {
                    mVar.u1(5);
                } else {
                    mVar.Q0(5, districtEntity.getNameAr());
                }
                if (districtEntity.getImage() == null) {
                    mVar.u1(6);
                } else {
                    mVar.Q0(6, districtEntity.getImage());
                }
                if (districtEntity.getImageEn() == null) {
                    mVar.u1(7);
                } else {
                    mVar.Q0(7, districtEntity.getImageEn());
                }
                if (districtEntity.getImageAr() == null) {
                    mVar.u1(8);
                } else {
                    mVar.Q0(8, districtEntity.getImageAr());
                }
                mVar.d1(9, districtEntity.getParentId());
                mVar.d1(10, districtEntity.getLevel());
                if (districtEntity.getChildren() == null) {
                    mVar.u1(11);
                } else {
                    mVar.Q0(11, districtEntity.getChildren());
                }
                if (districtEntity.getParents() == null) {
                    mVar.u1(12);
                } else {
                    mVar.Q0(12, districtEntity.getParents());
                }
                if (districtEntity.getGeoLat() == null) {
                    mVar.u1(13);
                } else {
                    mVar.S(13, districtEntity.getGeoLat().doubleValue());
                }
                if (districtEntity.getGeoLon() == null) {
                    mVar.u1(14);
                } else {
                    mVar.S(14, districtEntity.getGeoLon().doubleValue());
                }
                if (districtEntity.getFullPathAr() == null) {
                    mVar.u1(15);
                } else {
                    mVar.Q0(15, districtEntity.getFullPathAr());
                }
                if (districtEntity.getFullPathEn() == null) {
                    mVar.u1(16);
                } else {
                    mVar.Q0(16, districtEntity.getFullPathEn());
                }
            }
        };
        this.__deletionAdapterOfDistrictEntity = new h<DistrictEntity>(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.DistrictDao_Impl.2
            @Override // androidx.room.h, androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "DELETE FROM `districts` WHERE `id` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.h
            public void bind(m mVar, DistrictEntity districtEntity) {
                mVar.d1(1, districtEntity.getId());
            }
        };
        this.__updateAdapterOfDistrictEntity = new h<DistrictEntity>(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.DistrictDao_Impl.3
            @Override // androidx.room.h, androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "UPDATE OR REPLACE `districts` SET `id` = ?,`region_id` = ?,`display_order` = ?,`name_en` = ?,`name_ar` = ?,`image` = ?,`image_en` = ?,`image_ar` = ?,`parent_id` = ?,`level` = ?,`children` = ?,`parents` = ?,`geo_lat` = ?,`geo_lon` = ?,`full_path_ar` = ?,`full_path_en` = ? WHERE `id` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.h
            public void bind(m mVar, DistrictEntity districtEntity) {
                mVar.d1(1, districtEntity.getId());
                mVar.d1(2, districtEntity.getRegionId());
                mVar.d1(3, districtEntity.getDisplayOrder());
                if (districtEntity.getNameEn() == null) {
                    mVar.u1(4);
                } else {
                    mVar.Q0(4, districtEntity.getNameEn());
                }
                if (districtEntity.getNameAr() == null) {
                    mVar.u1(5);
                } else {
                    mVar.Q0(5, districtEntity.getNameAr());
                }
                if (districtEntity.getImage() == null) {
                    mVar.u1(6);
                } else {
                    mVar.Q0(6, districtEntity.getImage());
                }
                if (districtEntity.getImageEn() == null) {
                    mVar.u1(7);
                } else {
                    mVar.Q0(7, districtEntity.getImageEn());
                }
                if (districtEntity.getImageAr() == null) {
                    mVar.u1(8);
                } else {
                    mVar.Q0(8, districtEntity.getImageAr());
                }
                mVar.d1(9, districtEntity.getParentId());
                mVar.d1(10, districtEntity.getLevel());
                if (districtEntity.getChildren() == null) {
                    mVar.u1(11);
                } else {
                    mVar.Q0(11, districtEntity.getChildren());
                }
                if (districtEntity.getParents() == null) {
                    mVar.u1(12);
                } else {
                    mVar.Q0(12, districtEntity.getParents());
                }
                if (districtEntity.getGeoLat() == null) {
                    mVar.u1(13);
                } else {
                    mVar.S(13, districtEntity.getGeoLat().doubleValue());
                }
                if (districtEntity.getGeoLon() == null) {
                    mVar.u1(14);
                } else {
                    mVar.S(14, districtEntity.getGeoLon().doubleValue());
                }
                if (districtEntity.getFullPathAr() == null) {
                    mVar.u1(15);
                } else {
                    mVar.Q0(15, districtEntity.getFullPathAr());
                }
                if (districtEntity.getFullPathEn() == null) {
                    mVar.u1(16);
                } else {
                    mVar.Q0(16, districtEntity.getFullPathEn());
                }
                mVar.d1(17, districtEntity.getId());
            }
        };
        this.__preparedStmtOfDeleteAllDistricts = new SharedSQLiteStatement(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.DistrictDao_Impl.4
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM districts";
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void __fetchRelationshipdistrictsAscomForsaleAppDatalayerDatabaseDistrictEntity(o<ArrayList<DistrictEntity>> oVar) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        Double valueOf;
        Double valueOf2;
        String string8;
        String string9;
        if (oVar.g()) {
            return;
        }
        if (oVar.m() > 999) {
            d.b(oVar, true, new l() { // from class: com.forsale.app.datalayer.repositories.b
                @Override // g00.l
                public final Object invoke(Object obj) {
                    p lambda$__fetchRelationshipdistrictsAscomForsaleAppDatalayerDatabaseDistrictEntity$0;
                    lambda$__fetchRelationshipdistrictsAscomForsaleAppDatalayerDatabaseDistrictEntity$0 = DistrictDao_Impl.this.lambda$__fetchRelationshipdistrictsAscomForsaleAppDatalayerDatabaseDistrictEntity$0((o) obj);
                    return lambda$__fetchRelationshipdistrictsAscomForsaleAppDatalayerDatabaseDistrictEntity$0;
                }
            });
            return;
        }
        StringBuilder b11 = e.b();
        b11.append("SELECT `id`,`region_id`,`display_order`,`name_en`,`name_ar`,`image`,`image_en`,`image_ar`,`parent_id`,`level`,`children`,`parents`,`geo_lat`,`geo_lon`,`full_path_ar`,`full_path_en` FROM `districts` WHERE `parent_id` IN (");
        int m11 = oVar.m();
        e.a(b11, m11);
        b11.append(")");
        v i11 = v.i(b11.toString(), m11 + 0);
        int i12 = 1;
        for (int i13 = 0; i13 < oVar.m(); i13++) {
            i11.d1(i12, oVar.h(i13));
            i12++;
        }
        Cursor c11 = j4.b.c(this.__db, i11, false, null);
        try {
            int d11 = j4.a.d(c11, "parent_id");
            if (d11 == -1) {
                return;
            }
            while (c11.moveToNext()) {
                ArrayList<DistrictEntity> e11 = oVar.e(c11.getLong(d11));
                if (e11 != null) {
                    int i14 = c11.getInt(0);
                    int i15 = c11.getInt(1);
                    int i16 = c11.getInt(2);
                    if (c11.isNull(3)) {
                        string = null;
                    } else {
                        string = c11.getString(3);
                    }
                    if (c11.isNull(4)) {
                        string2 = null;
                    } else {
                        string2 = c11.getString(4);
                    }
                    if (c11.isNull(5)) {
                        string3 = null;
                    } else {
                        string3 = c11.getString(5);
                    }
                    if (c11.isNull(6)) {
                        string4 = null;
                    } else {
                        string4 = c11.getString(6);
                    }
                    if (c11.isNull(7)) {
                        string5 = null;
                    } else {
                        string5 = c11.getString(7);
                    }
                    int i17 = c11.getInt(8);
                    int i18 = c11.getInt(9);
                    if (c11.isNull(10)) {
                        string6 = null;
                    } else {
                        string6 = c11.getString(10);
                    }
                    if (c11.isNull(11)) {
                        string7 = null;
                    } else {
                        string7 = c11.getString(11);
                    }
                    if (c11.isNull(12)) {
                        valueOf = null;
                    } else {
                        valueOf = Double.valueOf(c11.getDouble(12));
                    }
                    if (c11.isNull(13)) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Double.valueOf(c11.getDouble(13));
                    }
                    if (c11.isNull(14)) {
                        string8 = null;
                    } else {
                        string8 = c11.getString(14);
                    }
                    if (c11.isNull(15)) {
                        string9 = null;
                    } else {
                        string9 = c11.getString(15);
                    }
                    e11.add(new DistrictEntity(i14, i15, i16, string, string2, string3, string4, string5, i17, i18, string6, string7, valueOf, valueOf2, string8, string9));
                }
            }
        } finally {
            c11.close();
        }
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ p lambda$__fetchRelationshipdistrictsAscomForsaleAppDatalayerDatabaseDistrictEntity$0(o oVar) {
        __fetchRelationshipdistrictsAscomForsaleAppDatalayerDatabaseDistrictEntity(oVar);
        return p.f75480a;
    }

    @Override // com.forsale.app.datalayer.repositories.DistrictDao
    public Object deleteAllDistricts(final List<DistrictEntity> list, zz.a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.repositories.DistrictDao_Impl.8
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                DistrictDao_Impl.this.__db.beginTransaction();
                try {
                    DistrictDao_Impl.this.__db.setTransactionSuccessful();
                    return Integer.valueOf(DistrictDao_Impl.this.__deletionAdapterOfDistrictEntity.handleMultiple(list) + 0);
                } finally {
                    DistrictDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.DistrictDao
    public Object deleteDistrict(final DistrictEntity districtEntity, zz.a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.repositories.DistrictDao_Impl.7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                DistrictDao_Impl.this.__db.beginTransaction();
                try {
                    DistrictDao_Impl.this.__db.setTransactionSuccessful();
                    return Integer.valueOf(DistrictDao_Impl.this.__deletionAdapterOfDistrictEntity.handle(districtEntity) + 0);
                } finally {
                    DistrictDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.DistrictDao
    public Object getAllDistricts(int i11, zz.a<? super List<DistrictEntity>> aVar) {
        final v i12 = v.i("SELECT * FROM  districts WHERE region_id == ?", 1);
        i12.d1(1, i11);
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<List<DistrictEntity>>() { // from class: com.forsale.app.datalayer.repositories.DistrictDao_Impl.12
            @Override // java.util.concurrent.Callable
            public List<DistrictEntity> call() throws Exception {
                AnonymousClass12 anonymousClass12;
                Double valueOf;
                int i13;
                String string;
                int i14;
                Cursor c11 = j4.b.c(DistrictDao_Impl.this.__db, i12, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "region_id");
                    int e13 = j4.a.e(c11, "display_order");
                    int e14 = j4.a.e(c11, "name_en");
                    int e15 = j4.a.e(c11, "name_ar");
                    int e16 = j4.a.e(c11, "image");
                    int e17 = j4.a.e(c11, "image_en");
                    int e18 = j4.a.e(c11, "image_ar");
                    int e19 = j4.a.e(c11, "parent_id");
                    int e21 = j4.a.e(c11, DistrictEntity.LEVEL);
                    int e22 = j4.a.e(c11, DistrictEntity.CHILDREN);
                    int e23 = j4.a.e(c11, DistrictEntity.PARENTS);
                    int e24 = j4.a.e(c11, AdvancedSearchBody.GEO_LAT);
                    int e25 = j4.a.e(c11, AdvancedSearchBody.GEO_LON);
                    try {
                        int e26 = j4.a.e(c11, "full_path_ar");
                        int e27 = j4.a.e(c11, "full_path_en");
                        int i15 = e25;
                        ArrayList arrayList = new ArrayList(c11.getCount());
                        while (c11.moveToNext()) {
                            int i16 = c11.getInt(e11);
                            int i17 = c11.getInt(e12);
                            int i18 = c11.getInt(e13);
                            String string2 = c11.isNull(e14) ? null : c11.getString(e14);
                            String string3 = c11.isNull(e15) ? null : c11.getString(e15);
                            String string4 = c11.isNull(e16) ? null : c11.getString(e16);
                            String string5 = c11.isNull(e17) ? null : c11.getString(e17);
                            String string6 = c11.isNull(e18) ? null : c11.getString(e18);
                            int i19 = c11.getInt(e19);
                            int i21 = c11.getInt(e21);
                            String string7 = c11.isNull(e22) ? null : c11.getString(e22);
                            String string8 = c11.isNull(e23) ? null : c11.getString(e23);
                            if (c11.isNull(e24)) {
                                i13 = i15;
                                valueOf = null;
                            } else {
                                valueOf = Double.valueOf(c11.getDouble(e24));
                                i13 = i15;
                            }
                            Double valueOf2 = c11.isNull(i13) ? null : Double.valueOf(c11.getDouble(i13));
                            int i22 = e26;
                            int i23 = e11;
                            String string9 = c11.isNull(i22) ? null : c11.getString(i22);
                            int i24 = e27;
                            if (c11.isNull(i24)) {
                                i14 = i24;
                                string = null;
                            } else {
                                string = c11.getString(i24);
                                i14 = i24;
                            }
                            arrayList.add(new DistrictEntity(i16, i17, i18, string2, string3, string4, string5, string6, i19, i21, string7, string8, valueOf, valueOf2, string9, string));
                            e11 = i23;
                            e26 = i22;
                            e27 = i14;
                            i15 = i13;
                        }
                        c11.close();
                        i12.release();
                        return arrayList;
                    } catch (Throwable th2) {
                        th = th2;
                        anonymousClass12 = this;
                        c11.close();
                        i12.release();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    anonymousClass12 = this;
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.DistrictDao
    public Object getAllDistrictsByLevel(int i11, int i12, zz.a<? super List<DistrictEntity>> aVar) {
        final v i13 = v.i("SELECT * FROM  districts WHERE region_id == ? AND level == ?", 2);
        i13.d1(1, i11);
        i13.d1(2, i12);
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<List<DistrictEntity>>() { // from class: com.forsale.app.datalayer.repositories.DistrictDao_Impl.17
            @Override // java.util.concurrent.Callable
            public List<DistrictEntity> call() throws Exception {
                AnonymousClass17 anonymousClass17;
                Double valueOf;
                int i14;
                String string;
                int i15;
                Cursor c11 = j4.b.c(DistrictDao_Impl.this.__db, i13, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "region_id");
                    int e13 = j4.a.e(c11, "display_order");
                    int e14 = j4.a.e(c11, "name_en");
                    int e15 = j4.a.e(c11, "name_ar");
                    int e16 = j4.a.e(c11, "image");
                    int e17 = j4.a.e(c11, "image_en");
                    int e18 = j4.a.e(c11, "image_ar");
                    int e19 = j4.a.e(c11, "parent_id");
                    int e21 = j4.a.e(c11, DistrictEntity.LEVEL);
                    int e22 = j4.a.e(c11, DistrictEntity.CHILDREN);
                    int e23 = j4.a.e(c11, DistrictEntity.PARENTS);
                    int e24 = j4.a.e(c11, AdvancedSearchBody.GEO_LAT);
                    int e25 = j4.a.e(c11, AdvancedSearchBody.GEO_LON);
                    try {
                        int e26 = j4.a.e(c11, "full_path_ar");
                        int e27 = j4.a.e(c11, "full_path_en");
                        int i16 = e25;
                        ArrayList arrayList = new ArrayList(c11.getCount());
                        while (c11.moveToNext()) {
                            int i17 = c11.getInt(e11);
                            int i18 = c11.getInt(e12);
                            int i19 = c11.getInt(e13);
                            String string2 = c11.isNull(e14) ? null : c11.getString(e14);
                            String string3 = c11.isNull(e15) ? null : c11.getString(e15);
                            String string4 = c11.isNull(e16) ? null : c11.getString(e16);
                            String string5 = c11.isNull(e17) ? null : c11.getString(e17);
                            String string6 = c11.isNull(e18) ? null : c11.getString(e18);
                            int i21 = c11.getInt(e19);
                            int i22 = c11.getInt(e21);
                            String string7 = c11.isNull(e22) ? null : c11.getString(e22);
                            String string8 = c11.isNull(e23) ? null : c11.getString(e23);
                            if (c11.isNull(e24)) {
                                i14 = i16;
                                valueOf = null;
                            } else {
                                valueOf = Double.valueOf(c11.getDouble(e24));
                                i14 = i16;
                            }
                            Double valueOf2 = c11.isNull(i14) ? null : Double.valueOf(c11.getDouble(i14));
                            int i23 = e26;
                            int i24 = e11;
                            String string9 = c11.isNull(i23) ? null : c11.getString(i23);
                            int i25 = e27;
                            if (c11.isNull(i25)) {
                                i15 = i25;
                                string = null;
                            } else {
                                string = c11.getString(i25);
                                i15 = i25;
                            }
                            arrayList.add(new DistrictEntity(i17, i18, i19, string2, string3, string4, string5, string6, i21, i22, string7, string8, valueOf, valueOf2, string9, string));
                            e11 = i24;
                            e26 = i23;
                            e27 = i15;
                            i16 = i14;
                        }
                        c11.close();
                        i13.release();
                        return arrayList;
                    } catch (Throwable th2) {
                        th = th2;
                        anonymousClass17 = this;
                        c11.close();
                        i13.release();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    anonymousClass17 = this;
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.DistrictDao
    public Object getAllDistrictsByLevelAndParentId(int i11, int i12, int i13, zz.a<? super List<DistrictEntity>> aVar) {
        final v i14 = v.i("SELECT * FROM  districts WHERE region_id == ? AND level == ? AND parent_id == ?", 3);
        i14.d1(1, i11);
        i14.d1(2, i12);
        i14.d1(3, i13);
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<List<DistrictEntity>>() { // from class: com.forsale.app.datalayer.repositories.DistrictDao_Impl.18
            @Override // java.util.concurrent.Callable
            public List<DistrictEntity> call() throws Exception {
                AnonymousClass18 anonymousClass18;
                Double valueOf;
                int i15;
                String string;
                int i16;
                Cursor c11 = j4.b.c(DistrictDao_Impl.this.__db, i14, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "region_id");
                    int e13 = j4.a.e(c11, "display_order");
                    int e14 = j4.a.e(c11, "name_en");
                    int e15 = j4.a.e(c11, "name_ar");
                    int e16 = j4.a.e(c11, "image");
                    int e17 = j4.a.e(c11, "image_en");
                    int e18 = j4.a.e(c11, "image_ar");
                    int e19 = j4.a.e(c11, "parent_id");
                    int e21 = j4.a.e(c11, DistrictEntity.LEVEL);
                    int e22 = j4.a.e(c11, DistrictEntity.CHILDREN);
                    int e23 = j4.a.e(c11, DistrictEntity.PARENTS);
                    int e24 = j4.a.e(c11, AdvancedSearchBody.GEO_LAT);
                    int e25 = j4.a.e(c11, AdvancedSearchBody.GEO_LON);
                    try {
                        int e26 = j4.a.e(c11, "full_path_ar");
                        int e27 = j4.a.e(c11, "full_path_en");
                        int i17 = e25;
                        ArrayList arrayList = new ArrayList(c11.getCount());
                        while (c11.moveToNext()) {
                            int i18 = c11.getInt(e11);
                            int i19 = c11.getInt(e12);
                            int i21 = c11.getInt(e13);
                            String string2 = c11.isNull(e14) ? null : c11.getString(e14);
                            String string3 = c11.isNull(e15) ? null : c11.getString(e15);
                            String string4 = c11.isNull(e16) ? null : c11.getString(e16);
                            String string5 = c11.isNull(e17) ? null : c11.getString(e17);
                            String string6 = c11.isNull(e18) ? null : c11.getString(e18);
                            int i22 = c11.getInt(e19);
                            int i23 = c11.getInt(e21);
                            String string7 = c11.isNull(e22) ? null : c11.getString(e22);
                            String string8 = c11.isNull(e23) ? null : c11.getString(e23);
                            if (c11.isNull(e24)) {
                                i15 = i17;
                                valueOf = null;
                            } else {
                                valueOf = Double.valueOf(c11.getDouble(e24));
                                i15 = i17;
                            }
                            Double valueOf2 = c11.isNull(i15) ? null : Double.valueOf(c11.getDouble(i15));
                            int i24 = e26;
                            int i25 = e11;
                            String string9 = c11.isNull(i24) ? null : c11.getString(i24);
                            int i26 = e27;
                            if (c11.isNull(i26)) {
                                i16 = i26;
                                string = null;
                            } else {
                                string = c11.getString(i26);
                                i16 = i26;
                            }
                            arrayList.add(new DistrictEntity(i18, i19, i21, string2, string3, string4, string5, string6, i22, i23, string7, string8, valueOf, valueOf2, string9, string));
                            e11 = i25;
                            e26 = i24;
                            e27 = i16;
                            i17 = i15;
                        }
                        c11.close();
                        i14.release();
                        return arrayList;
                    } catch (Throwable th2) {
                        th = th2;
                        anonymousClass18 = this;
                        c11.close();
                        i14.release();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    anonymousClass18 = this;
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.DistrictDao
    public Object getAllDistrictsByLevelAndParentIds(int i11, int i12, List<Integer> list, zz.a<? super List<DistrictEntity>> aVar) {
        StringBuilder b11 = e.b();
        b11.append("SELECT * FROM  districts WHERE region_id == ");
        b11.append("?");
        b11.append(" AND level == ");
        b11.append("?");
        b11.append(" AND parent_id in (");
        int size = list.size();
        e.a(b11, size);
        b11.append(")");
        final v i13 = v.i(b11.toString(), size + 2);
        i13.d1(1, i11);
        i13.d1(2, i12);
        int i14 = 3;
        for (Integer num : list) {
            if (num == null) {
                i13.u1(i14);
            } else {
                i13.d1(i14, num.intValue());
            }
            i14++;
        }
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<List<DistrictEntity>>() { // from class: com.forsale.app.datalayer.repositories.DistrictDao_Impl.22
            @Override // java.util.concurrent.Callable
            public List<DistrictEntity> call() throws Exception {
                AnonymousClass22 anonymousClass22;
                Double valueOf;
                int i15;
                String string;
                int i16;
                Cursor c11 = j4.b.c(DistrictDao_Impl.this.__db, i13, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "region_id");
                    int e13 = j4.a.e(c11, "display_order");
                    int e14 = j4.a.e(c11, "name_en");
                    int e15 = j4.a.e(c11, "name_ar");
                    int e16 = j4.a.e(c11, "image");
                    int e17 = j4.a.e(c11, "image_en");
                    int e18 = j4.a.e(c11, "image_ar");
                    int e19 = j4.a.e(c11, "parent_id");
                    int e21 = j4.a.e(c11, DistrictEntity.LEVEL);
                    int e22 = j4.a.e(c11, DistrictEntity.CHILDREN);
                    int e23 = j4.a.e(c11, DistrictEntity.PARENTS);
                    int e24 = j4.a.e(c11, AdvancedSearchBody.GEO_LAT);
                    int e25 = j4.a.e(c11, AdvancedSearchBody.GEO_LON);
                    try {
                        int e26 = j4.a.e(c11, "full_path_ar");
                        int e27 = j4.a.e(c11, "full_path_en");
                        int i17 = e25;
                        ArrayList arrayList = new ArrayList(c11.getCount());
                        while (c11.moveToNext()) {
                            int i18 = c11.getInt(e11);
                            int i19 = c11.getInt(e12);
                            int i21 = c11.getInt(e13);
                            String string2 = c11.isNull(e14) ? null : c11.getString(e14);
                            String string3 = c11.isNull(e15) ? null : c11.getString(e15);
                            String string4 = c11.isNull(e16) ? null : c11.getString(e16);
                            String string5 = c11.isNull(e17) ? null : c11.getString(e17);
                            String string6 = c11.isNull(e18) ? null : c11.getString(e18);
                            int i22 = c11.getInt(e19);
                            int i23 = c11.getInt(e21);
                            String string7 = c11.isNull(e22) ? null : c11.getString(e22);
                            String string8 = c11.isNull(e23) ? null : c11.getString(e23);
                            if (c11.isNull(e24)) {
                                i15 = i17;
                                valueOf = null;
                            } else {
                                valueOf = Double.valueOf(c11.getDouble(e24));
                                i15 = i17;
                            }
                            Double valueOf2 = c11.isNull(i15) ? null : Double.valueOf(c11.getDouble(i15));
                            int i24 = e26;
                            int i25 = e11;
                            String string9 = c11.isNull(i24) ? null : c11.getString(i24);
                            int i26 = e27;
                            if (c11.isNull(i26)) {
                                i16 = i26;
                                string = null;
                            } else {
                                string = c11.getString(i26);
                                i16 = i26;
                            }
                            arrayList.add(new DistrictEntity(i18, i19, i21, string2, string3, string4, string5, string6, i22, i23, string7, string8, valueOf, valueOf2, string9, string));
                            e11 = i25;
                            e26 = i24;
                            e27 = i16;
                            i17 = i15;
                        }
                        c11.close();
                        i13.release();
                        return arrayList;
                    } catch (Throwable th2) {
                        th = th2;
                        anonymousClass22 = this;
                        c11.close();
                        i13.release();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    anonymousClass22 = this;
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.DistrictDao
    public Object getAllDistrictsSuspend(zz.a<? super List<DistrictEntity>> aVar) {
        final v i11 = v.i("SELECT * FROM  districts", 0);
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<List<DistrictEntity>>() { // from class: com.forsale.app.datalayer.repositories.DistrictDao_Impl.14
            @Override // java.util.concurrent.Callable
            public List<DistrictEntity> call() throws Exception {
                AnonymousClass14 anonymousClass14;
                Double valueOf;
                int i12;
                String string;
                int i13;
                Cursor c11 = j4.b.c(DistrictDao_Impl.this.__db, i11, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "region_id");
                    int e13 = j4.a.e(c11, "display_order");
                    int e14 = j4.a.e(c11, "name_en");
                    int e15 = j4.a.e(c11, "name_ar");
                    int e16 = j4.a.e(c11, "image");
                    int e17 = j4.a.e(c11, "image_en");
                    int e18 = j4.a.e(c11, "image_ar");
                    int e19 = j4.a.e(c11, "parent_id");
                    int e21 = j4.a.e(c11, DistrictEntity.LEVEL);
                    int e22 = j4.a.e(c11, DistrictEntity.CHILDREN);
                    int e23 = j4.a.e(c11, DistrictEntity.PARENTS);
                    int e24 = j4.a.e(c11, AdvancedSearchBody.GEO_LAT);
                    int e25 = j4.a.e(c11, AdvancedSearchBody.GEO_LON);
                    try {
                        int e26 = j4.a.e(c11, "full_path_ar");
                        int e27 = j4.a.e(c11, "full_path_en");
                        int i14 = e25;
                        ArrayList arrayList = new ArrayList(c11.getCount());
                        while (c11.moveToNext()) {
                            int i15 = c11.getInt(e11);
                            int i16 = c11.getInt(e12);
                            int i17 = c11.getInt(e13);
                            String string2 = c11.isNull(e14) ? null : c11.getString(e14);
                            String string3 = c11.isNull(e15) ? null : c11.getString(e15);
                            String string4 = c11.isNull(e16) ? null : c11.getString(e16);
                            String string5 = c11.isNull(e17) ? null : c11.getString(e17);
                            String string6 = c11.isNull(e18) ? null : c11.getString(e18);
                            int i18 = c11.getInt(e19);
                            int i19 = c11.getInt(e21);
                            String string7 = c11.isNull(e22) ? null : c11.getString(e22);
                            String string8 = c11.isNull(e23) ? null : c11.getString(e23);
                            if (c11.isNull(e24)) {
                                i12 = i14;
                                valueOf = null;
                            } else {
                                valueOf = Double.valueOf(c11.getDouble(e24));
                                i12 = i14;
                            }
                            Double valueOf2 = c11.isNull(i12) ? null : Double.valueOf(c11.getDouble(i12));
                            int i21 = e26;
                            int i22 = e11;
                            String string9 = c11.isNull(i21) ? null : c11.getString(i21);
                            int i23 = e27;
                            if (c11.isNull(i23)) {
                                i13 = i23;
                                string = null;
                            } else {
                                string = c11.getString(i23);
                                i13 = i23;
                            }
                            arrayList.add(new DistrictEntity(i15, i16, i17, string2, string3, string4, string5, string6, i18, i19, string7, string8, valueOf, valueOf2, string9, string));
                            e11 = i22;
                            e26 = i21;
                            e27 = i13;
                            i14 = i12;
                        }
                        c11.close();
                        i11.release();
                        return arrayList;
                    } catch (Throwable th2) {
                        th = th2;
                        anonymousClass14 = this;
                        c11.close();
                        i11.release();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    anonymousClass14 = this;
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.DistrictDao
    public Object getAreasWithBlocks(List<Integer> list, int i11, zz.a<? super List<AreaWithBlocks>> aVar) {
        StringBuilder b11 = e.b();
        b11.append("SELECT * from districts WHERE parent_id in (");
        int size = list.size();
        e.a(b11, size);
        b11.append(") AND level == ");
        b11.append("?");
        int i12 = 1;
        int i13 = size + 1;
        final v i14 = v.i(b11.toString(), i13);
        for (Integer num : list) {
            if (num == null) {
                i14.u1(i12);
            } else {
                i14.d1(i12, num.intValue());
            }
            i12++;
        }
        i14.d1(i13, i11);
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<List<AreaWithBlocks>>() { // from class: com.forsale.app.datalayer.repositories.DistrictDao_Impl.23
            /* JADX WARN: Removed duplicated region for block: B:101:0x0228  */
            /* JADX WARN: Removed duplicated region for block: B:102:0x022b A[Catch: all -> 0x02a4, TryCatch #0 {all -> 0x02a4, blocks: (B:20:0x00df, B:22:0x00e5, B:24:0x00eb, B:26:0x00f1, B:28:0x00f7, B:30:0x00fd, B:32:0x0103, B:34:0x0109, B:36:0x010f, B:38:0x0115, B:40:0x011b, B:42:0x0123, B:44:0x012b, B:46:0x0133, B:48:0x013d, B:50:0x0147, B:62:0x0178, B:66:0x0193, B:70:0x01a2, B:74:0x01b1, B:78:0x01c0, B:82:0x01cf, B:86:0x01e6, B:90:0x01f5, B:94:0x0208, B:99:0x0222, B:103:0x0231, B:107:0x0240, B:108:0x024b, B:113:0x025e, B:115:0x027e, B:114:0x0271, B:111:0x0254, B:106:0x023a, B:102:0x022b, B:98:0x0217, B:93:0x01fe, B:89:0x01ef, B:85:0x01e0, B:81:0x01c9, B:77:0x01ba, B:73:0x01ab, B:69:0x019c, B:65:0x018d), top: B:125:0x00df }] */
            /* JADX WARN: Removed duplicated region for block: B:105:0x0237  */
            /* JADX WARN: Removed duplicated region for block: B:106:0x023a A[Catch: all -> 0x02a4, TryCatch #0 {all -> 0x02a4, blocks: (B:20:0x00df, B:22:0x00e5, B:24:0x00eb, B:26:0x00f1, B:28:0x00f7, B:30:0x00fd, B:32:0x0103, B:34:0x0109, B:36:0x010f, B:38:0x0115, B:40:0x011b, B:42:0x0123, B:44:0x012b, B:46:0x0133, B:48:0x013d, B:50:0x0147, B:62:0x0178, B:66:0x0193, B:70:0x01a2, B:74:0x01b1, B:78:0x01c0, B:82:0x01cf, B:86:0x01e6, B:90:0x01f5, B:94:0x0208, B:99:0x0222, B:103:0x0231, B:107:0x0240, B:108:0x024b, B:113:0x025e, B:115:0x027e, B:114:0x0271, B:111:0x0254, B:106:0x023a, B:102:0x022b, B:98:0x0217, B:93:0x01fe, B:89:0x01ef, B:85:0x01e0, B:81:0x01c9, B:77:0x01ba, B:73:0x01ab, B:69:0x019c, B:65:0x018d), top: B:125:0x00df }] */
            /* JADX WARN: Removed duplicated region for block: B:110:0x0251  */
            /* JADX WARN: Removed duplicated region for block: B:111:0x0254 A[Catch: all -> 0x02a4, TryCatch #0 {all -> 0x02a4, blocks: (B:20:0x00df, B:22:0x00e5, B:24:0x00eb, B:26:0x00f1, B:28:0x00f7, B:30:0x00fd, B:32:0x0103, B:34:0x0109, B:36:0x010f, B:38:0x0115, B:40:0x011b, B:42:0x0123, B:44:0x012b, B:46:0x0133, B:48:0x013d, B:50:0x0147, B:62:0x0178, B:66:0x0193, B:70:0x01a2, B:74:0x01b1, B:78:0x01c0, B:82:0x01cf, B:86:0x01e6, B:90:0x01f5, B:94:0x0208, B:99:0x0222, B:103:0x0231, B:107:0x0240, B:108:0x024b, B:113:0x025e, B:115:0x027e, B:114:0x0271, B:111:0x0254, B:106:0x023a, B:102:0x022b, B:98:0x0217, B:93:0x01fe, B:89:0x01ef, B:85:0x01e0, B:81:0x01c9, B:77:0x01ba, B:73:0x01ab, B:69:0x019c, B:65:0x018d), top: B:125:0x00df }] */
            /* JADX WARN: Removed duplicated region for block: B:113:0x025e A[Catch: all -> 0x02a4, TryCatch #0 {all -> 0x02a4, blocks: (B:20:0x00df, B:22:0x00e5, B:24:0x00eb, B:26:0x00f1, B:28:0x00f7, B:30:0x00fd, B:32:0x0103, B:34:0x0109, B:36:0x010f, B:38:0x0115, B:40:0x011b, B:42:0x0123, B:44:0x012b, B:46:0x0133, B:48:0x013d, B:50:0x0147, B:62:0x0178, B:66:0x0193, B:70:0x01a2, B:74:0x01b1, B:78:0x01c0, B:82:0x01cf, B:86:0x01e6, B:90:0x01f5, B:94:0x0208, B:99:0x0222, B:103:0x0231, B:107:0x0240, B:108:0x024b, B:113:0x025e, B:115:0x027e, B:114:0x0271, B:111:0x0254, B:106:0x023a, B:102:0x022b, B:98:0x0217, B:93:0x01fe, B:89:0x01ef, B:85:0x01e0, B:81:0x01c9, B:77:0x01ba, B:73:0x01ab, B:69:0x019c, B:65:0x018d), top: B:125:0x00df }] */
            /* JADX WARN: Removed duplicated region for block: B:114:0x0271 A[Catch: all -> 0x02a4, TryCatch #0 {all -> 0x02a4, blocks: (B:20:0x00df, B:22:0x00e5, B:24:0x00eb, B:26:0x00f1, B:28:0x00f7, B:30:0x00fd, B:32:0x0103, B:34:0x0109, B:36:0x010f, B:38:0x0115, B:40:0x011b, B:42:0x0123, B:44:0x012b, B:46:0x0133, B:48:0x013d, B:50:0x0147, B:62:0x0178, B:66:0x0193, B:70:0x01a2, B:74:0x01b1, B:78:0x01c0, B:82:0x01cf, B:86:0x01e6, B:90:0x01f5, B:94:0x0208, B:99:0x0222, B:103:0x0231, B:107:0x0240, B:108:0x024b, B:113:0x025e, B:115:0x027e, B:114:0x0271, B:111:0x0254, B:106:0x023a, B:102:0x022b, B:98:0x0217, B:93:0x01fe, B:89:0x01ef, B:85:0x01e0, B:81:0x01c9, B:77:0x01ba, B:73:0x01ab, B:69:0x019c, B:65:0x018d), top: B:125:0x00df }] */
            /* JADX WARN: Removed duplicated region for block: B:64:0x018a  */
            /* JADX WARN: Removed duplicated region for block: B:65:0x018d A[Catch: all -> 0x02a4, TryCatch #0 {all -> 0x02a4, blocks: (B:20:0x00df, B:22:0x00e5, B:24:0x00eb, B:26:0x00f1, B:28:0x00f7, B:30:0x00fd, B:32:0x0103, B:34:0x0109, B:36:0x010f, B:38:0x0115, B:40:0x011b, B:42:0x0123, B:44:0x012b, B:46:0x0133, B:48:0x013d, B:50:0x0147, B:62:0x0178, B:66:0x0193, B:70:0x01a2, B:74:0x01b1, B:78:0x01c0, B:82:0x01cf, B:86:0x01e6, B:90:0x01f5, B:94:0x0208, B:99:0x0222, B:103:0x0231, B:107:0x0240, B:108:0x024b, B:113:0x025e, B:115:0x027e, B:114:0x0271, B:111:0x0254, B:106:0x023a, B:102:0x022b, B:98:0x0217, B:93:0x01fe, B:89:0x01ef, B:85:0x01e0, B:81:0x01c9, B:77:0x01ba, B:73:0x01ab, B:69:0x019c, B:65:0x018d), top: B:125:0x00df }] */
            /* JADX WARN: Removed duplicated region for block: B:68:0x0199  */
            /* JADX WARN: Removed duplicated region for block: B:69:0x019c A[Catch: all -> 0x02a4, TryCatch #0 {all -> 0x02a4, blocks: (B:20:0x00df, B:22:0x00e5, B:24:0x00eb, B:26:0x00f1, B:28:0x00f7, B:30:0x00fd, B:32:0x0103, B:34:0x0109, B:36:0x010f, B:38:0x0115, B:40:0x011b, B:42:0x0123, B:44:0x012b, B:46:0x0133, B:48:0x013d, B:50:0x0147, B:62:0x0178, B:66:0x0193, B:70:0x01a2, B:74:0x01b1, B:78:0x01c0, B:82:0x01cf, B:86:0x01e6, B:90:0x01f5, B:94:0x0208, B:99:0x0222, B:103:0x0231, B:107:0x0240, B:108:0x024b, B:113:0x025e, B:115:0x027e, B:114:0x0271, B:111:0x0254, B:106:0x023a, B:102:0x022b, B:98:0x0217, B:93:0x01fe, B:89:0x01ef, B:85:0x01e0, B:81:0x01c9, B:77:0x01ba, B:73:0x01ab, B:69:0x019c, B:65:0x018d), top: B:125:0x00df }] */
            /* JADX WARN: Removed duplicated region for block: B:72:0x01a8  */
            /* JADX WARN: Removed duplicated region for block: B:73:0x01ab A[Catch: all -> 0x02a4, TryCatch #0 {all -> 0x02a4, blocks: (B:20:0x00df, B:22:0x00e5, B:24:0x00eb, B:26:0x00f1, B:28:0x00f7, B:30:0x00fd, B:32:0x0103, B:34:0x0109, B:36:0x010f, B:38:0x0115, B:40:0x011b, B:42:0x0123, B:44:0x012b, B:46:0x0133, B:48:0x013d, B:50:0x0147, B:62:0x0178, B:66:0x0193, B:70:0x01a2, B:74:0x01b1, B:78:0x01c0, B:82:0x01cf, B:86:0x01e6, B:90:0x01f5, B:94:0x0208, B:99:0x0222, B:103:0x0231, B:107:0x0240, B:108:0x024b, B:113:0x025e, B:115:0x027e, B:114:0x0271, B:111:0x0254, B:106:0x023a, B:102:0x022b, B:98:0x0217, B:93:0x01fe, B:89:0x01ef, B:85:0x01e0, B:81:0x01c9, B:77:0x01ba, B:73:0x01ab, B:69:0x019c, B:65:0x018d), top: B:125:0x00df }] */
            /* JADX WARN: Removed duplicated region for block: B:76:0x01b7  */
            /* JADX WARN: Removed duplicated region for block: B:77:0x01ba A[Catch: all -> 0x02a4, TryCatch #0 {all -> 0x02a4, blocks: (B:20:0x00df, B:22:0x00e5, B:24:0x00eb, B:26:0x00f1, B:28:0x00f7, B:30:0x00fd, B:32:0x0103, B:34:0x0109, B:36:0x010f, B:38:0x0115, B:40:0x011b, B:42:0x0123, B:44:0x012b, B:46:0x0133, B:48:0x013d, B:50:0x0147, B:62:0x0178, B:66:0x0193, B:70:0x01a2, B:74:0x01b1, B:78:0x01c0, B:82:0x01cf, B:86:0x01e6, B:90:0x01f5, B:94:0x0208, B:99:0x0222, B:103:0x0231, B:107:0x0240, B:108:0x024b, B:113:0x025e, B:115:0x027e, B:114:0x0271, B:111:0x0254, B:106:0x023a, B:102:0x022b, B:98:0x0217, B:93:0x01fe, B:89:0x01ef, B:85:0x01e0, B:81:0x01c9, B:77:0x01ba, B:73:0x01ab, B:69:0x019c, B:65:0x018d), top: B:125:0x00df }] */
            /* JADX WARN: Removed duplicated region for block: B:80:0x01c6  */
            /* JADX WARN: Removed duplicated region for block: B:81:0x01c9 A[Catch: all -> 0x02a4, TryCatch #0 {all -> 0x02a4, blocks: (B:20:0x00df, B:22:0x00e5, B:24:0x00eb, B:26:0x00f1, B:28:0x00f7, B:30:0x00fd, B:32:0x0103, B:34:0x0109, B:36:0x010f, B:38:0x0115, B:40:0x011b, B:42:0x0123, B:44:0x012b, B:46:0x0133, B:48:0x013d, B:50:0x0147, B:62:0x0178, B:66:0x0193, B:70:0x01a2, B:74:0x01b1, B:78:0x01c0, B:82:0x01cf, B:86:0x01e6, B:90:0x01f5, B:94:0x0208, B:99:0x0222, B:103:0x0231, B:107:0x0240, B:108:0x024b, B:113:0x025e, B:115:0x027e, B:114:0x0271, B:111:0x0254, B:106:0x023a, B:102:0x022b, B:98:0x0217, B:93:0x01fe, B:89:0x01ef, B:85:0x01e0, B:81:0x01c9, B:77:0x01ba, B:73:0x01ab, B:69:0x019c, B:65:0x018d), top: B:125:0x00df }] */
            /* JADX WARN: Removed duplicated region for block: B:84:0x01dd  */
            /* JADX WARN: Removed duplicated region for block: B:85:0x01e0 A[Catch: all -> 0x02a4, TryCatch #0 {all -> 0x02a4, blocks: (B:20:0x00df, B:22:0x00e5, B:24:0x00eb, B:26:0x00f1, B:28:0x00f7, B:30:0x00fd, B:32:0x0103, B:34:0x0109, B:36:0x010f, B:38:0x0115, B:40:0x011b, B:42:0x0123, B:44:0x012b, B:46:0x0133, B:48:0x013d, B:50:0x0147, B:62:0x0178, B:66:0x0193, B:70:0x01a2, B:74:0x01b1, B:78:0x01c0, B:82:0x01cf, B:86:0x01e6, B:90:0x01f5, B:94:0x0208, B:99:0x0222, B:103:0x0231, B:107:0x0240, B:108:0x024b, B:113:0x025e, B:115:0x027e, B:114:0x0271, B:111:0x0254, B:106:0x023a, B:102:0x022b, B:98:0x0217, B:93:0x01fe, B:89:0x01ef, B:85:0x01e0, B:81:0x01c9, B:77:0x01ba, B:73:0x01ab, B:69:0x019c, B:65:0x018d), top: B:125:0x00df }] */
            /* JADX WARN: Removed duplicated region for block: B:88:0x01ec  */
            /* JADX WARN: Removed duplicated region for block: B:89:0x01ef A[Catch: all -> 0x02a4, TryCatch #0 {all -> 0x02a4, blocks: (B:20:0x00df, B:22:0x00e5, B:24:0x00eb, B:26:0x00f1, B:28:0x00f7, B:30:0x00fd, B:32:0x0103, B:34:0x0109, B:36:0x010f, B:38:0x0115, B:40:0x011b, B:42:0x0123, B:44:0x012b, B:46:0x0133, B:48:0x013d, B:50:0x0147, B:62:0x0178, B:66:0x0193, B:70:0x01a2, B:74:0x01b1, B:78:0x01c0, B:82:0x01cf, B:86:0x01e6, B:90:0x01f5, B:94:0x0208, B:99:0x0222, B:103:0x0231, B:107:0x0240, B:108:0x024b, B:113:0x025e, B:115:0x027e, B:114:0x0271, B:111:0x0254, B:106:0x023a, B:102:0x022b, B:98:0x0217, B:93:0x01fe, B:89:0x01ef, B:85:0x01e0, B:81:0x01c9, B:77:0x01ba, B:73:0x01ab, B:69:0x019c, B:65:0x018d), top: B:125:0x00df }] */
            /* JADX WARN: Removed duplicated region for block: B:92:0x01fb  */
            /* JADX WARN: Removed duplicated region for block: B:93:0x01fe A[Catch: all -> 0x02a4, TryCatch #0 {all -> 0x02a4, blocks: (B:20:0x00df, B:22:0x00e5, B:24:0x00eb, B:26:0x00f1, B:28:0x00f7, B:30:0x00fd, B:32:0x0103, B:34:0x0109, B:36:0x010f, B:38:0x0115, B:40:0x011b, B:42:0x0123, B:44:0x012b, B:46:0x0133, B:48:0x013d, B:50:0x0147, B:62:0x0178, B:66:0x0193, B:70:0x01a2, B:74:0x01b1, B:78:0x01c0, B:82:0x01cf, B:86:0x01e6, B:90:0x01f5, B:94:0x0208, B:99:0x0222, B:103:0x0231, B:107:0x0240, B:108:0x024b, B:113:0x025e, B:115:0x027e, B:114:0x0271, B:111:0x0254, B:106:0x023a, B:102:0x022b, B:98:0x0217, B:93:0x01fe, B:89:0x01ef, B:85:0x01e0, B:81:0x01c9, B:77:0x01ba, B:73:0x01ab, B:69:0x019c, B:65:0x018d), top: B:125:0x00df }] */
            /* JADX WARN: Removed duplicated region for block: B:96:0x020e  */
            /* JADX WARN: Removed duplicated region for block: B:98:0x0217 A[Catch: all -> 0x02a4, TryCatch #0 {all -> 0x02a4, blocks: (B:20:0x00df, B:22:0x00e5, B:24:0x00eb, B:26:0x00f1, B:28:0x00f7, B:30:0x00fd, B:32:0x0103, B:34:0x0109, B:36:0x010f, B:38:0x0115, B:40:0x011b, B:42:0x0123, B:44:0x012b, B:46:0x0133, B:48:0x013d, B:50:0x0147, B:62:0x0178, B:66:0x0193, B:70:0x01a2, B:74:0x01b1, B:78:0x01c0, B:82:0x01cf, B:86:0x01e6, B:90:0x01f5, B:94:0x0208, B:99:0x0222, B:103:0x0231, B:107:0x0240, B:108:0x024b, B:113:0x025e, B:115:0x027e, B:114:0x0271, B:111:0x0254, B:106:0x023a, B:102:0x022b, B:98:0x0217, B:93:0x01fe, B:89:0x01ef, B:85:0x01e0, B:81:0x01c9, B:77:0x01ba, B:73:0x01ab, B:69:0x019c, B:65:0x018d), top: B:125:0x00df }] */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.util.List<com.forsale.app.datalayer.database.AreaWithBlocks> call() throws java.lang.Exception {
                /*
                    Method dump skipped, instructions count: 703
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.DistrictDao_Impl.AnonymousClass23.call():java.util.List");
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.DistrictDao
    public Object getDistrictById(int i11, zz.a<? super DistrictEntity> aVar) {
        final v i12 = v.i("SELECT * FROM  districts WHERE id == ?", 1);
        i12.d1(1, i11);
        return CoroutinesRoom.b(this.__db, true, j4.b.a(), new Callable<DistrictEntity>() { // from class: com.forsale.app.datalayer.repositories.DistrictDao_Impl.11
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public DistrictEntity call() throws Exception {
                int e11;
                int e12;
                int e13;
                int e14;
                int e15;
                int e16;
                int e17;
                int e18;
                int e19;
                int e21;
                int e22;
                int e23;
                int e24;
                int e25;
                DistrictEntity districtEntity;
                Double valueOf;
                int i13;
                AnonymousClass11 anonymousClass11 = this;
                DistrictDao_Impl.this.__db.beginTransaction();
                try {
                    Cursor c11 = j4.b.c(DistrictDao_Impl.this.__db, i12, false, null);
                    try {
                        e11 = j4.a.e(c11, "id");
                        e12 = j4.a.e(c11, "region_id");
                        e13 = j4.a.e(c11, "display_order");
                        e14 = j4.a.e(c11, "name_en");
                        e15 = j4.a.e(c11, "name_ar");
                        e16 = j4.a.e(c11, "image");
                        e17 = j4.a.e(c11, "image_en");
                        e18 = j4.a.e(c11, "image_ar");
                        e19 = j4.a.e(c11, "parent_id");
                        e21 = j4.a.e(c11, DistrictEntity.LEVEL);
                        e22 = j4.a.e(c11, DistrictEntity.CHILDREN);
                        e23 = j4.a.e(c11, DistrictEntity.PARENTS);
                        e24 = j4.a.e(c11, AdvancedSearchBody.GEO_LAT);
                        e25 = j4.a.e(c11, AdvancedSearchBody.GEO_LON);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        int e26 = j4.a.e(c11, "full_path_ar");
                        int e27 = j4.a.e(c11, "full_path_en");
                        if (c11.moveToFirst()) {
                            int i14 = c11.getInt(e11);
                            int i15 = c11.getInt(e12);
                            int i16 = c11.getInt(e13);
                            String string = c11.isNull(e14) ? null : c11.getString(e14);
                            String string2 = c11.isNull(e15) ? null : c11.getString(e15);
                            String string3 = c11.isNull(e16) ? null : c11.getString(e16);
                            String string4 = c11.isNull(e17) ? null : c11.getString(e17);
                            String string5 = c11.isNull(e18) ? null : c11.getString(e18);
                            int i17 = c11.getInt(e19);
                            int i18 = c11.getInt(e21);
                            String string6 = c11.isNull(e22) ? null : c11.getString(e22);
                            String string7 = c11.isNull(e23) ? null : c11.getString(e23);
                            Double valueOf2 = c11.isNull(e24) ? null : Double.valueOf(c11.getDouble(e24));
                            if (c11.isNull(e25)) {
                                i13 = e26;
                                valueOf = null;
                            } else {
                                valueOf = Double.valueOf(c11.getDouble(e25));
                                i13 = e26;
                            }
                            districtEntity = new DistrictEntity(i14, i15, i16, string, string2, string3, string4, string5, i17, i18, string6, string7, valueOf2, valueOf, c11.isNull(i13) ? null : c11.getString(i13), c11.isNull(e27) ? null : c11.getString(e27));
                        } else {
                            districtEntity = null;
                        }
                        anonymousClass11 = this;
                        DistrictDao_Impl.this.__db.setTransactionSuccessful();
                        c11.close();
                        i12.release();
                        return districtEntity;
                    } catch (Throwable th3) {
                        th = th3;
                        anonymousClass11 = this;
                        c11.close();
                        i12.release();
                        throw th;
                    }
                } finally {
                    DistrictDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.DistrictDao
    public Object getDistrictsByIdORParentId(List<Integer> list, zz.a<? super List<AreaWithBlocks>> aVar) {
        StringBuilder b11 = e.b();
        b11.append("SELECT * from districts WHERE id in (");
        int size = list.size();
        e.a(b11, size);
        b11.append(") OR parent_id in (");
        int size2 = list.size();
        e.a(b11, size2);
        b11.append(")");
        final v i11 = v.i(b11.toString(), size + 0 + size2);
        int i12 = 1;
        for (Integer num : list) {
            if (num == null) {
                i11.u1(i12);
            } else {
                i11.d1(i12, num.intValue());
            }
            i12++;
        }
        int i13 = size + 1;
        for (Integer num2 : list) {
            if (num2 == null) {
                i11.u1(i13);
            } else {
                i11.d1(i13, num2.intValue());
            }
            i13++;
        }
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<List<AreaWithBlocks>>() { // from class: com.forsale.app.datalayer.repositories.DistrictDao_Impl.25
            /* JADX WARN: Removed duplicated region for block: B:101:0x0228  */
            /* JADX WARN: Removed duplicated region for block: B:102:0x022b A[Catch: all -> 0x02a4, TryCatch #0 {all -> 0x02a4, blocks: (B:20:0x00df, B:22:0x00e5, B:24:0x00eb, B:26:0x00f1, B:28:0x00f7, B:30:0x00fd, B:32:0x0103, B:34:0x0109, B:36:0x010f, B:38:0x0115, B:40:0x011b, B:42:0x0123, B:44:0x012b, B:46:0x0133, B:48:0x013d, B:50:0x0147, B:62:0x0178, B:66:0x0193, B:70:0x01a2, B:74:0x01b1, B:78:0x01c0, B:82:0x01cf, B:86:0x01e6, B:90:0x01f5, B:94:0x0208, B:99:0x0222, B:103:0x0231, B:107:0x0240, B:108:0x024b, B:113:0x025e, B:115:0x027e, B:114:0x0271, B:111:0x0254, B:106:0x023a, B:102:0x022b, B:98:0x0217, B:93:0x01fe, B:89:0x01ef, B:85:0x01e0, B:81:0x01c9, B:77:0x01ba, B:73:0x01ab, B:69:0x019c, B:65:0x018d), top: B:125:0x00df }] */
            /* JADX WARN: Removed duplicated region for block: B:105:0x0237  */
            /* JADX WARN: Removed duplicated region for block: B:106:0x023a A[Catch: all -> 0x02a4, TryCatch #0 {all -> 0x02a4, blocks: (B:20:0x00df, B:22:0x00e5, B:24:0x00eb, B:26:0x00f1, B:28:0x00f7, B:30:0x00fd, B:32:0x0103, B:34:0x0109, B:36:0x010f, B:38:0x0115, B:40:0x011b, B:42:0x0123, B:44:0x012b, B:46:0x0133, B:48:0x013d, B:50:0x0147, B:62:0x0178, B:66:0x0193, B:70:0x01a2, B:74:0x01b1, B:78:0x01c0, B:82:0x01cf, B:86:0x01e6, B:90:0x01f5, B:94:0x0208, B:99:0x0222, B:103:0x0231, B:107:0x0240, B:108:0x024b, B:113:0x025e, B:115:0x027e, B:114:0x0271, B:111:0x0254, B:106:0x023a, B:102:0x022b, B:98:0x0217, B:93:0x01fe, B:89:0x01ef, B:85:0x01e0, B:81:0x01c9, B:77:0x01ba, B:73:0x01ab, B:69:0x019c, B:65:0x018d), top: B:125:0x00df }] */
            /* JADX WARN: Removed duplicated region for block: B:110:0x0251  */
            /* JADX WARN: Removed duplicated region for block: B:111:0x0254 A[Catch: all -> 0x02a4, TryCatch #0 {all -> 0x02a4, blocks: (B:20:0x00df, B:22:0x00e5, B:24:0x00eb, B:26:0x00f1, B:28:0x00f7, B:30:0x00fd, B:32:0x0103, B:34:0x0109, B:36:0x010f, B:38:0x0115, B:40:0x011b, B:42:0x0123, B:44:0x012b, B:46:0x0133, B:48:0x013d, B:50:0x0147, B:62:0x0178, B:66:0x0193, B:70:0x01a2, B:74:0x01b1, B:78:0x01c0, B:82:0x01cf, B:86:0x01e6, B:90:0x01f5, B:94:0x0208, B:99:0x0222, B:103:0x0231, B:107:0x0240, B:108:0x024b, B:113:0x025e, B:115:0x027e, B:114:0x0271, B:111:0x0254, B:106:0x023a, B:102:0x022b, B:98:0x0217, B:93:0x01fe, B:89:0x01ef, B:85:0x01e0, B:81:0x01c9, B:77:0x01ba, B:73:0x01ab, B:69:0x019c, B:65:0x018d), top: B:125:0x00df }] */
            /* JADX WARN: Removed duplicated region for block: B:113:0x025e A[Catch: all -> 0x02a4, TryCatch #0 {all -> 0x02a4, blocks: (B:20:0x00df, B:22:0x00e5, B:24:0x00eb, B:26:0x00f1, B:28:0x00f7, B:30:0x00fd, B:32:0x0103, B:34:0x0109, B:36:0x010f, B:38:0x0115, B:40:0x011b, B:42:0x0123, B:44:0x012b, B:46:0x0133, B:48:0x013d, B:50:0x0147, B:62:0x0178, B:66:0x0193, B:70:0x01a2, B:74:0x01b1, B:78:0x01c0, B:82:0x01cf, B:86:0x01e6, B:90:0x01f5, B:94:0x0208, B:99:0x0222, B:103:0x0231, B:107:0x0240, B:108:0x024b, B:113:0x025e, B:115:0x027e, B:114:0x0271, B:111:0x0254, B:106:0x023a, B:102:0x022b, B:98:0x0217, B:93:0x01fe, B:89:0x01ef, B:85:0x01e0, B:81:0x01c9, B:77:0x01ba, B:73:0x01ab, B:69:0x019c, B:65:0x018d), top: B:125:0x00df }] */
            /* JADX WARN: Removed duplicated region for block: B:114:0x0271 A[Catch: all -> 0x02a4, TryCatch #0 {all -> 0x02a4, blocks: (B:20:0x00df, B:22:0x00e5, B:24:0x00eb, B:26:0x00f1, B:28:0x00f7, B:30:0x00fd, B:32:0x0103, B:34:0x0109, B:36:0x010f, B:38:0x0115, B:40:0x011b, B:42:0x0123, B:44:0x012b, B:46:0x0133, B:48:0x013d, B:50:0x0147, B:62:0x0178, B:66:0x0193, B:70:0x01a2, B:74:0x01b1, B:78:0x01c0, B:82:0x01cf, B:86:0x01e6, B:90:0x01f5, B:94:0x0208, B:99:0x0222, B:103:0x0231, B:107:0x0240, B:108:0x024b, B:113:0x025e, B:115:0x027e, B:114:0x0271, B:111:0x0254, B:106:0x023a, B:102:0x022b, B:98:0x0217, B:93:0x01fe, B:89:0x01ef, B:85:0x01e0, B:81:0x01c9, B:77:0x01ba, B:73:0x01ab, B:69:0x019c, B:65:0x018d), top: B:125:0x00df }] */
            /* JADX WARN: Removed duplicated region for block: B:64:0x018a  */
            /* JADX WARN: Removed duplicated region for block: B:65:0x018d A[Catch: all -> 0x02a4, TryCatch #0 {all -> 0x02a4, blocks: (B:20:0x00df, B:22:0x00e5, B:24:0x00eb, B:26:0x00f1, B:28:0x00f7, B:30:0x00fd, B:32:0x0103, B:34:0x0109, B:36:0x010f, B:38:0x0115, B:40:0x011b, B:42:0x0123, B:44:0x012b, B:46:0x0133, B:48:0x013d, B:50:0x0147, B:62:0x0178, B:66:0x0193, B:70:0x01a2, B:74:0x01b1, B:78:0x01c0, B:82:0x01cf, B:86:0x01e6, B:90:0x01f5, B:94:0x0208, B:99:0x0222, B:103:0x0231, B:107:0x0240, B:108:0x024b, B:113:0x025e, B:115:0x027e, B:114:0x0271, B:111:0x0254, B:106:0x023a, B:102:0x022b, B:98:0x0217, B:93:0x01fe, B:89:0x01ef, B:85:0x01e0, B:81:0x01c9, B:77:0x01ba, B:73:0x01ab, B:69:0x019c, B:65:0x018d), top: B:125:0x00df }] */
            /* JADX WARN: Removed duplicated region for block: B:68:0x0199  */
            /* JADX WARN: Removed duplicated region for block: B:69:0x019c A[Catch: all -> 0x02a4, TryCatch #0 {all -> 0x02a4, blocks: (B:20:0x00df, B:22:0x00e5, B:24:0x00eb, B:26:0x00f1, B:28:0x00f7, B:30:0x00fd, B:32:0x0103, B:34:0x0109, B:36:0x010f, B:38:0x0115, B:40:0x011b, B:42:0x0123, B:44:0x012b, B:46:0x0133, B:48:0x013d, B:50:0x0147, B:62:0x0178, B:66:0x0193, B:70:0x01a2, B:74:0x01b1, B:78:0x01c0, B:82:0x01cf, B:86:0x01e6, B:90:0x01f5, B:94:0x0208, B:99:0x0222, B:103:0x0231, B:107:0x0240, B:108:0x024b, B:113:0x025e, B:115:0x027e, B:114:0x0271, B:111:0x0254, B:106:0x023a, B:102:0x022b, B:98:0x0217, B:93:0x01fe, B:89:0x01ef, B:85:0x01e0, B:81:0x01c9, B:77:0x01ba, B:73:0x01ab, B:69:0x019c, B:65:0x018d), top: B:125:0x00df }] */
            /* JADX WARN: Removed duplicated region for block: B:72:0x01a8  */
            /* JADX WARN: Removed duplicated region for block: B:73:0x01ab A[Catch: all -> 0x02a4, TryCatch #0 {all -> 0x02a4, blocks: (B:20:0x00df, B:22:0x00e5, B:24:0x00eb, B:26:0x00f1, B:28:0x00f7, B:30:0x00fd, B:32:0x0103, B:34:0x0109, B:36:0x010f, B:38:0x0115, B:40:0x011b, B:42:0x0123, B:44:0x012b, B:46:0x0133, B:48:0x013d, B:50:0x0147, B:62:0x0178, B:66:0x0193, B:70:0x01a2, B:74:0x01b1, B:78:0x01c0, B:82:0x01cf, B:86:0x01e6, B:90:0x01f5, B:94:0x0208, B:99:0x0222, B:103:0x0231, B:107:0x0240, B:108:0x024b, B:113:0x025e, B:115:0x027e, B:114:0x0271, B:111:0x0254, B:106:0x023a, B:102:0x022b, B:98:0x0217, B:93:0x01fe, B:89:0x01ef, B:85:0x01e0, B:81:0x01c9, B:77:0x01ba, B:73:0x01ab, B:69:0x019c, B:65:0x018d), top: B:125:0x00df }] */
            /* JADX WARN: Removed duplicated region for block: B:76:0x01b7  */
            /* JADX WARN: Removed duplicated region for block: B:77:0x01ba A[Catch: all -> 0x02a4, TryCatch #0 {all -> 0x02a4, blocks: (B:20:0x00df, B:22:0x00e5, B:24:0x00eb, B:26:0x00f1, B:28:0x00f7, B:30:0x00fd, B:32:0x0103, B:34:0x0109, B:36:0x010f, B:38:0x0115, B:40:0x011b, B:42:0x0123, B:44:0x012b, B:46:0x0133, B:48:0x013d, B:50:0x0147, B:62:0x0178, B:66:0x0193, B:70:0x01a2, B:74:0x01b1, B:78:0x01c0, B:82:0x01cf, B:86:0x01e6, B:90:0x01f5, B:94:0x0208, B:99:0x0222, B:103:0x0231, B:107:0x0240, B:108:0x024b, B:113:0x025e, B:115:0x027e, B:114:0x0271, B:111:0x0254, B:106:0x023a, B:102:0x022b, B:98:0x0217, B:93:0x01fe, B:89:0x01ef, B:85:0x01e0, B:81:0x01c9, B:77:0x01ba, B:73:0x01ab, B:69:0x019c, B:65:0x018d), top: B:125:0x00df }] */
            /* JADX WARN: Removed duplicated region for block: B:80:0x01c6  */
            /* JADX WARN: Removed duplicated region for block: B:81:0x01c9 A[Catch: all -> 0x02a4, TryCatch #0 {all -> 0x02a4, blocks: (B:20:0x00df, B:22:0x00e5, B:24:0x00eb, B:26:0x00f1, B:28:0x00f7, B:30:0x00fd, B:32:0x0103, B:34:0x0109, B:36:0x010f, B:38:0x0115, B:40:0x011b, B:42:0x0123, B:44:0x012b, B:46:0x0133, B:48:0x013d, B:50:0x0147, B:62:0x0178, B:66:0x0193, B:70:0x01a2, B:74:0x01b1, B:78:0x01c0, B:82:0x01cf, B:86:0x01e6, B:90:0x01f5, B:94:0x0208, B:99:0x0222, B:103:0x0231, B:107:0x0240, B:108:0x024b, B:113:0x025e, B:115:0x027e, B:114:0x0271, B:111:0x0254, B:106:0x023a, B:102:0x022b, B:98:0x0217, B:93:0x01fe, B:89:0x01ef, B:85:0x01e0, B:81:0x01c9, B:77:0x01ba, B:73:0x01ab, B:69:0x019c, B:65:0x018d), top: B:125:0x00df }] */
            /* JADX WARN: Removed duplicated region for block: B:84:0x01dd  */
            /* JADX WARN: Removed duplicated region for block: B:85:0x01e0 A[Catch: all -> 0x02a4, TryCatch #0 {all -> 0x02a4, blocks: (B:20:0x00df, B:22:0x00e5, B:24:0x00eb, B:26:0x00f1, B:28:0x00f7, B:30:0x00fd, B:32:0x0103, B:34:0x0109, B:36:0x010f, B:38:0x0115, B:40:0x011b, B:42:0x0123, B:44:0x012b, B:46:0x0133, B:48:0x013d, B:50:0x0147, B:62:0x0178, B:66:0x0193, B:70:0x01a2, B:74:0x01b1, B:78:0x01c0, B:82:0x01cf, B:86:0x01e6, B:90:0x01f5, B:94:0x0208, B:99:0x0222, B:103:0x0231, B:107:0x0240, B:108:0x024b, B:113:0x025e, B:115:0x027e, B:114:0x0271, B:111:0x0254, B:106:0x023a, B:102:0x022b, B:98:0x0217, B:93:0x01fe, B:89:0x01ef, B:85:0x01e0, B:81:0x01c9, B:77:0x01ba, B:73:0x01ab, B:69:0x019c, B:65:0x018d), top: B:125:0x00df }] */
            /* JADX WARN: Removed duplicated region for block: B:88:0x01ec  */
            /* JADX WARN: Removed duplicated region for block: B:89:0x01ef A[Catch: all -> 0x02a4, TryCatch #0 {all -> 0x02a4, blocks: (B:20:0x00df, B:22:0x00e5, B:24:0x00eb, B:26:0x00f1, B:28:0x00f7, B:30:0x00fd, B:32:0x0103, B:34:0x0109, B:36:0x010f, B:38:0x0115, B:40:0x011b, B:42:0x0123, B:44:0x012b, B:46:0x0133, B:48:0x013d, B:50:0x0147, B:62:0x0178, B:66:0x0193, B:70:0x01a2, B:74:0x01b1, B:78:0x01c0, B:82:0x01cf, B:86:0x01e6, B:90:0x01f5, B:94:0x0208, B:99:0x0222, B:103:0x0231, B:107:0x0240, B:108:0x024b, B:113:0x025e, B:115:0x027e, B:114:0x0271, B:111:0x0254, B:106:0x023a, B:102:0x022b, B:98:0x0217, B:93:0x01fe, B:89:0x01ef, B:85:0x01e0, B:81:0x01c9, B:77:0x01ba, B:73:0x01ab, B:69:0x019c, B:65:0x018d), top: B:125:0x00df }] */
            /* JADX WARN: Removed duplicated region for block: B:92:0x01fb  */
            /* JADX WARN: Removed duplicated region for block: B:93:0x01fe A[Catch: all -> 0x02a4, TryCatch #0 {all -> 0x02a4, blocks: (B:20:0x00df, B:22:0x00e5, B:24:0x00eb, B:26:0x00f1, B:28:0x00f7, B:30:0x00fd, B:32:0x0103, B:34:0x0109, B:36:0x010f, B:38:0x0115, B:40:0x011b, B:42:0x0123, B:44:0x012b, B:46:0x0133, B:48:0x013d, B:50:0x0147, B:62:0x0178, B:66:0x0193, B:70:0x01a2, B:74:0x01b1, B:78:0x01c0, B:82:0x01cf, B:86:0x01e6, B:90:0x01f5, B:94:0x0208, B:99:0x0222, B:103:0x0231, B:107:0x0240, B:108:0x024b, B:113:0x025e, B:115:0x027e, B:114:0x0271, B:111:0x0254, B:106:0x023a, B:102:0x022b, B:98:0x0217, B:93:0x01fe, B:89:0x01ef, B:85:0x01e0, B:81:0x01c9, B:77:0x01ba, B:73:0x01ab, B:69:0x019c, B:65:0x018d), top: B:125:0x00df }] */
            /* JADX WARN: Removed duplicated region for block: B:96:0x020e  */
            /* JADX WARN: Removed duplicated region for block: B:98:0x0217 A[Catch: all -> 0x02a4, TryCatch #0 {all -> 0x02a4, blocks: (B:20:0x00df, B:22:0x00e5, B:24:0x00eb, B:26:0x00f1, B:28:0x00f7, B:30:0x00fd, B:32:0x0103, B:34:0x0109, B:36:0x010f, B:38:0x0115, B:40:0x011b, B:42:0x0123, B:44:0x012b, B:46:0x0133, B:48:0x013d, B:50:0x0147, B:62:0x0178, B:66:0x0193, B:70:0x01a2, B:74:0x01b1, B:78:0x01c0, B:82:0x01cf, B:86:0x01e6, B:90:0x01f5, B:94:0x0208, B:99:0x0222, B:103:0x0231, B:107:0x0240, B:108:0x024b, B:113:0x025e, B:115:0x027e, B:114:0x0271, B:111:0x0254, B:106:0x023a, B:102:0x022b, B:98:0x0217, B:93:0x01fe, B:89:0x01ef, B:85:0x01e0, B:81:0x01c9, B:77:0x01ba, B:73:0x01ab, B:69:0x019c, B:65:0x018d), top: B:125:0x00df }] */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.util.List<com.forsale.app.datalayer.database.AreaWithBlocks> call() throws java.lang.Exception {
                /*
                    Method dump skipped, instructions count: 703
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.DistrictDao_Impl.AnonymousClass25.call():java.util.List");
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.DistrictDao
    public Object getDistrictsByIds(List<Integer> list, zz.a<? super List<DistrictEntity>> aVar) {
        StringBuilder b11 = e.b();
        b11.append("SELECT * FROM districts where id in (");
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
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<List<DistrictEntity>>() { // from class: com.forsale.app.datalayer.repositories.DistrictDao_Impl.15
            @Override // java.util.concurrent.Callable
            public List<DistrictEntity> call() throws Exception {
                AnonymousClass15 anonymousClass15;
                Double valueOf;
                int i13;
                String string;
                int i14;
                Cursor c11 = j4.b.c(DistrictDao_Impl.this.__db, i11, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "region_id");
                    int e13 = j4.a.e(c11, "display_order");
                    int e14 = j4.a.e(c11, "name_en");
                    int e15 = j4.a.e(c11, "name_ar");
                    int e16 = j4.a.e(c11, "image");
                    int e17 = j4.a.e(c11, "image_en");
                    int e18 = j4.a.e(c11, "image_ar");
                    int e19 = j4.a.e(c11, "parent_id");
                    int e21 = j4.a.e(c11, DistrictEntity.LEVEL);
                    int e22 = j4.a.e(c11, DistrictEntity.CHILDREN);
                    int e23 = j4.a.e(c11, DistrictEntity.PARENTS);
                    int e24 = j4.a.e(c11, AdvancedSearchBody.GEO_LAT);
                    int e25 = j4.a.e(c11, AdvancedSearchBody.GEO_LON);
                    try {
                        int e26 = j4.a.e(c11, "full_path_ar");
                        int e27 = j4.a.e(c11, "full_path_en");
                        int i15 = e25;
                        ArrayList arrayList = new ArrayList(c11.getCount());
                        while (c11.moveToNext()) {
                            int i16 = c11.getInt(e11);
                            int i17 = c11.getInt(e12);
                            int i18 = c11.getInt(e13);
                            String string2 = c11.isNull(e14) ? null : c11.getString(e14);
                            String string3 = c11.isNull(e15) ? null : c11.getString(e15);
                            String string4 = c11.isNull(e16) ? null : c11.getString(e16);
                            String string5 = c11.isNull(e17) ? null : c11.getString(e17);
                            String string6 = c11.isNull(e18) ? null : c11.getString(e18);
                            int i19 = c11.getInt(e19);
                            int i21 = c11.getInt(e21);
                            String string7 = c11.isNull(e22) ? null : c11.getString(e22);
                            String string8 = c11.isNull(e23) ? null : c11.getString(e23);
                            if (c11.isNull(e24)) {
                                i13 = i15;
                                valueOf = null;
                            } else {
                                valueOf = Double.valueOf(c11.getDouble(e24));
                                i13 = i15;
                            }
                            Double valueOf2 = c11.isNull(i13) ? null : Double.valueOf(c11.getDouble(i13));
                            int i22 = e26;
                            int i23 = e11;
                            String string9 = c11.isNull(i22) ? null : c11.getString(i22);
                            int i24 = e27;
                            if (c11.isNull(i24)) {
                                i14 = i24;
                                string = null;
                            } else {
                                string = c11.getString(i24);
                                i14 = i24;
                            }
                            arrayList.add(new DistrictEntity(i16, i17, i18, string2, string3, string4, string5, string6, i19, i21, string7, string8, valueOf, valueOf2, string9, string));
                            e11 = i23;
                            e26 = i22;
                            e27 = i14;
                            i15 = i13;
                        }
                        c11.close();
                        i11.release();
                        return arrayList;
                    } catch (Throwable th2) {
                        th = th2;
                        anonymousClass15 = this;
                        c11.close();
                        i11.release();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    anonymousClass15 = this;
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.DistrictDao
    public Object getDistrictsByMainDistrictId(int i11, zz.a<? super List<DistrictEntity>> aVar) {
        final v i12 = v.i("SELECT * FROM  DISTRICTS WHERE PARENT_ID == ?", 1);
        i12.d1(1, i11);
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<List<DistrictEntity>>() { // from class: com.forsale.app.datalayer.repositories.DistrictDao_Impl.13
            @Override // java.util.concurrent.Callable
            public List<DistrictEntity> call() throws Exception {
                AnonymousClass13 anonymousClass13;
                Double valueOf;
                int i13;
                String string;
                int i14;
                Cursor c11 = j4.b.c(DistrictDao_Impl.this.__db, i12, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "region_id");
                    int e13 = j4.a.e(c11, "display_order");
                    int e14 = j4.a.e(c11, "name_en");
                    int e15 = j4.a.e(c11, "name_ar");
                    int e16 = j4.a.e(c11, "image");
                    int e17 = j4.a.e(c11, "image_en");
                    int e18 = j4.a.e(c11, "image_ar");
                    int e19 = j4.a.e(c11, "parent_id");
                    int e21 = j4.a.e(c11, DistrictEntity.LEVEL);
                    int e22 = j4.a.e(c11, DistrictEntity.CHILDREN);
                    int e23 = j4.a.e(c11, DistrictEntity.PARENTS);
                    int e24 = j4.a.e(c11, AdvancedSearchBody.GEO_LAT);
                    int e25 = j4.a.e(c11, AdvancedSearchBody.GEO_LON);
                    try {
                        int e26 = j4.a.e(c11, "full_path_ar");
                        int e27 = j4.a.e(c11, "full_path_en");
                        int i15 = e25;
                        ArrayList arrayList = new ArrayList(c11.getCount());
                        while (c11.moveToNext()) {
                            int i16 = c11.getInt(e11);
                            int i17 = c11.getInt(e12);
                            int i18 = c11.getInt(e13);
                            String string2 = c11.isNull(e14) ? null : c11.getString(e14);
                            String string3 = c11.isNull(e15) ? null : c11.getString(e15);
                            String string4 = c11.isNull(e16) ? null : c11.getString(e16);
                            String string5 = c11.isNull(e17) ? null : c11.getString(e17);
                            String string6 = c11.isNull(e18) ? null : c11.getString(e18);
                            int i19 = c11.getInt(e19);
                            int i21 = c11.getInt(e21);
                            String string7 = c11.isNull(e22) ? null : c11.getString(e22);
                            String string8 = c11.isNull(e23) ? null : c11.getString(e23);
                            if (c11.isNull(e24)) {
                                i13 = i15;
                                valueOf = null;
                            } else {
                                valueOf = Double.valueOf(c11.getDouble(e24));
                                i13 = i15;
                            }
                            Double valueOf2 = c11.isNull(i13) ? null : Double.valueOf(c11.getDouble(i13));
                            int i22 = e26;
                            int i23 = e11;
                            String string9 = c11.isNull(i22) ? null : c11.getString(i22);
                            int i24 = e27;
                            if (c11.isNull(i24)) {
                                i14 = i24;
                                string = null;
                            } else {
                                string = c11.getString(i24);
                                i14 = i24;
                            }
                            arrayList.add(new DistrictEntity(i16, i17, i18, string2, string3, string4, string5, string6, i19, i21, string7, string8, valueOf, valueOf2, string9, string));
                            e11 = i23;
                            e26 = i22;
                            e27 = i14;
                            i15 = i13;
                        }
                        c11.close();
                        i12.release();
                        return arrayList;
                    } catch (Throwable th2) {
                        th = th2;
                        anonymousClass13 = this;
                        c11.close();
                        i12.release();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    anonymousClass13 = this;
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.DistrictDao
    public Object getDistrictsNameEnByIds(List<Integer> list, zz.a<? super List<String>> aVar) {
        StringBuilder b11 = e.b();
        b11.append("SELECT districts.name_en FROM districts where id in (");
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
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<List<String>>() { // from class: com.forsale.app.datalayer.repositories.DistrictDao_Impl.16
            @Override // java.util.concurrent.Callable
            public List<String> call() throws Exception {
                Cursor c11 = j4.b.c(DistrictDao_Impl.this.__db, i11, false, null);
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

    @Override // com.forsale.app.datalayer.repositories.DistrictDao
    public Object getDistrictsNestedByDistrictId(final l4.l lVar, zz.a<? super String> aVar) {
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<String>() { // from class: com.forsale.app.datalayer.repositories.DistrictDao_Impl.27
            @Override // java.util.concurrent.Callable
            public String call() throws Exception {
                String str = null;
                Cursor c11 = j4.b.c(DistrictDao_Impl.this.__db, lVar, false, null);
                try {
                    if (c11.moveToFirst() && !c11.isNull(0)) {
                        str = c11.getString(0);
                    }
                    return str;
                } finally {
                    c11.close();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.DistrictDao
    public Object getDistrictsParentIdsNotInChildrenParents(final l4.l lVar, zz.a<? super List<Integer>> aVar) {
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<List<Integer>>() { // from class: com.forsale.app.datalayer.repositories.DistrictDao_Impl.28
            @Override // java.util.concurrent.Callable
            public List<Integer> call() throws Exception {
                Cursor c11 = j4.b.c(DistrictDao_Impl.this.__db, lVar, false, null);
                try {
                    ArrayList arrayList = new ArrayList(c11.getCount());
                    while (c11.moveToNext()) {
                        arrayList.add(c11.isNull(0) ? null : Integer.valueOf(c11.getInt(0)));
                    }
                    return arrayList;
                } finally {
                    c11.close();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.DistrictDao
    public Object getParentByLeafParents(int i11, int i12, List<String> list, zz.a<? super List<DistrictEntity>> aVar) {
        StringBuilder b11 = e.b();
        b11.append("SELECT * FROM  districts WHERE region_id == ");
        b11.append("?");
        b11.append(" AND level == ");
        b11.append("?");
        b11.append(" AND id in (");
        int size = list.size();
        e.a(b11, size);
        b11.append(") LIMIT 1");
        final v i13 = v.i(b11.toString(), size + 2);
        i13.d1(1, i11);
        i13.d1(2, i12);
        int i14 = 3;
        for (String str : list) {
            if (str == null) {
                i13.u1(i14);
            } else {
                i13.Q0(i14, str);
            }
            i14++;
        }
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<List<DistrictEntity>>() { // from class: com.forsale.app.datalayer.repositories.DistrictDao_Impl.19
            @Override // java.util.concurrent.Callable
            public List<DistrictEntity> call() throws Exception {
                AnonymousClass19 anonymousClass19;
                Double valueOf;
                int i15;
                String string;
                int i16;
                Cursor c11 = j4.b.c(DistrictDao_Impl.this.__db, i13, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "region_id");
                    int e13 = j4.a.e(c11, "display_order");
                    int e14 = j4.a.e(c11, "name_en");
                    int e15 = j4.a.e(c11, "name_ar");
                    int e16 = j4.a.e(c11, "image");
                    int e17 = j4.a.e(c11, "image_en");
                    int e18 = j4.a.e(c11, "image_ar");
                    int e19 = j4.a.e(c11, "parent_id");
                    int e21 = j4.a.e(c11, DistrictEntity.LEVEL);
                    int e22 = j4.a.e(c11, DistrictEntity.CHILDREN);
                    int e23 = j4.a.e(c11, DistrictEntity.PARENTS);
                    int e24 = j4.a.e(c11, AdvancedSearchBody.GEO_LAT);
                    int e25 = j4.a.e(c11, AdvancedSearchBody.GEO_LON);
                    try {
                        int e26 = j4.a.e(c11, "full_path_ar");
                        int e27 = j4.a.e(c11, "full_path_en");
                        int i17 = e25;
                        ArrayList arrayList = new ArrayList(c11.getCount());
                        while (c11.moveToNext()) {
                            int i18 = c11.getInt(e11);
                            int i19 = c11.getInt(e12);
                            int i21 = c11.getInt(e13);
                            String string2 = c11.isNull(e14) ? null : c11.getString(e14);
                            String string3 = c11.isNull(e15) ? null : c11.getString(e15);
                            String string4 = c11.isNull(e16) ? null : c11.getString(e16);
                            String string5 = c11.isNull(e17) ? null : c11.getString(e17);
                            String string6 = c11.isNull(e18) ? null : c11.getString(e18);
                            int i22 = c11.getInt(e19);
                            int i23 = c11.getInt(e21);
                            String string7 = c11.isNull(e22) ? null : c11.getString(e22);
                            String string8 = c11.isNull(e23) ? null : c11.getString(e23);
                            if (c11.isNull(e24)) {
                                i15 = i17;
                                valueOf = null;
                            } else {
                                valueOf = Double.valueOf(c11.getDouble(e24));
                                i15 = i17;
                            }
                            Double valueOf2 = c11.isNull(i15) ? null : Double.valueOf(c11.getDouble(i15));
                            int i24 = e26;
                            int i25 = e11;
                            String string9 = c11.isNull(i24) ? null : c11.getString(i24);
                            int i26 = e27;
                            if (c11.isNull(i26)) {
                                i16 = i26;
                                string = null;
                            } else {
                                string = c11.getString(i26);
                                i16 = i26;
                            }
                            arrayList.add(new DistrictEntity(i18, i19, i21, string2, string3, string4, string5, string6, i22, i23, string7, string8, valueOf, valueOf2, string9, string));
                            e11 = i25;
                            e26 = i24;
                            e27 = i16;
                            i17 = i15;
                        }
                        c11.close();
                        i13.release();
                        return arrayList;
                    } catch (Throwable th2) {
                        th = th2;
                        anonymousClass19 = this;
                        c11.close();
                        i13.release();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    anonymousClass19 = this;
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.DistrictDao
    public Object getParentLevel(List<String> list, int i11, zz.a<? super DistrictEntity> aVar) {
        StringBuilder b11 = e.b();
        b11.append("select * from districts where level = ");
        b11.append("?");
        b11.append(" and districts.id in (");
        int size = list.size();
        e.a(b11, size);
        b11.append(") Limit 1");
        final v i12 = v.i(b11.toString(), size + 1);
        i12.d1(1, i11);
        int i13 = 2;
        for (String str : list) {
            if (str == null) {
                i12.u1(i13);
            } else {
                i12.Q0(i13, str);
            }
            i13++;
        }
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<DistrictEntity>() { // from class: com.forsale.app.datalayer.repositories.DistrictDao_Impl.20
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public DistrictEntity call() throws Exception {
                DistrictEntity districtEntity;
                Double valueOf;
                int i14;
                AnonymousClass20 anonymousClass20 = this;
                Cursor c11 = j4.b.c(DistrictDao_Impl.this.__db, i12, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "region_id");
                    int e13 = j4.a.e(c11, "display_order");
                    int e14 = j4.a.e(c11, "name_en");
                    int e15 = j4.a.e(c11, "name_ar");
                    int e16 = j4.a.e(c11, "image");
                    int e17 = j4.a.e(c11, "image_en");
                    int e18 = j4.a.e(c11, "image_ar");
                    int e19 = j4.a.e(c11, "parent_id");
                    int e21 = j4.a.e(c11, DistrictEntity.LEVEL);
                    int e22 = j4.a.e(c11, DistrictEntity.CHILDREN);
                    int e23 = j4.a.e(c11, DistrictEntity.PARENTS);
                    int e24 = j4.a.e(c11, AdvancedSearchBody.GEO_LAT);
                    int e25 = j4.a.e(c11, AdvancedSearchBody.GEO_LON);
                    try {
                        int e26 = j4.a.e(c11, "full_path_ar");
                        int e27 = j4.a.e(c11, "full_path_en");
                        if (c11.moveToFirst()) {
                            int i15 = c11.getInt(e11);
                            int i16 = c11.getInt(e12);
                            int i17 = c11.getInt(e13);
                            String string = c11.isNull(e14) ? null : c11.getString(e14);
                            String string2 = c11.isNull(e15) ? null : c11.getString(e15);
                            String string3 = c11.isNull(e16) ? null : c11.getString(e16);
                            String string4 = c11.isNull(e17) ? null : c11.getString(e17);
                            String string5 = c11.isNull(e18) ? null : c11.getString(e18);
                            int i18 = c11.getInt(e19);
                            int i19 = c11.getInt(e21);
                            String string6 = c11.isNull(e22) ? null : c11.getString(e22);
                            String string7 = c11.isNull(e23) ? null : c11.getString(e23);
                            Double valueOf2 = c11.isNull(e24) ? null : Double.valueOf(c11.getDouble(e24));
                            if (c11.isNull(e25)) {
                                i14 = e26;
                                valueOf = null;
                            } else {
                                valueOf = Double.valueOf(c11.getDouble(e25));
                                i14 = e26;
                            }
                            districtEntity = new DistrictEntity(i15, i16, i17, string, string2, string3, string4, string5, i18, i19, string6, string7, valueOf2, valueOf, c11.isNull(i14) ? null : c11.getString(i14), c11.isNull(e27) ? null : c11.getString(e27));
                        } else {
                            districtEntity = null;
                        }
                        c11.close();
                        i12.release();
                        return districtEntity;
                    } catch (Throwable th2) {
                        th = th2;
                        anonymousClass20 = this;
                        c11.close();
                        i12.release();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.DistrictDao
    public Object getParents(List<Integer> list, zz.a<? super List<String>> aVar) {
        StringBuilder b11 = e.b();
        b11.append("select districts.parents from districts where districts.id in (");
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
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<List<String>>() { // from class: com.forsale.app.datalayer.repositories.DistrictDao_Impl.26
            @Override // java.util.concurrent.Callable
            public List<String> call() throws Exception {
                Cursor c11 = j4.b.c(DistrictDao_Impl.this.__db, i11, false, null);
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

    @Override // com.forsale.app.datalayer.repositories.DistrictDao
    public Object insertAllDistricts(final List<DistrictEntity> list, zz.a<? super List<Long>> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<List<Long>>() { // from class: com.forsale.app.datalayer.repositories.DistrictDao_Impl.6
            @Override // java.util.concurrent.Callable
            public List<Long> call() throws Exception {
                DistrictDao_Impl.this.__db.beginTransaction();
                try {
                    List<Long> insertAndReturnIdsList = DistrictDao_Impl.this.__insertionAdapterOfDistrictEntity.insertAndReturnIdsList(list);
                    DistrictDao_Impl.this.__db.setTransactionSuccessful();
                    return insertAndReturnIdsList;
                } finally {
                    DistrictDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.DistrictDao
    public Object insertDistrict(final DistrictEntity districtEntity, zz.a<? super Long> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Long>() { // from class: com.forsale.app.datalayer.repositories.DistrictDao_Impl.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() throws Exception {
                DistrictDao_Impl.this.__db.beginTransaction();
                try {
                    Long valueOf = Long.valueOf(DistrictDao_Impl.this.__insertionAdapterOfDistrictEntity.insertAndReturnId(districtEntity));
                    DistrictDao_Impl.this.__db.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    DistrictDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.DistrictDao
    public Object intersectDistricts(List<String> list, List<Integer> list2, zz.a<? super List<Integer>> aVar) {
        StringBuilder b11 = e.b();
        b11.append("Select id from districts where id in (");
        int size = list2.size();
        e.a(b11, size);
        b11.append(") and substr(parents, Length(parents)-2, 1) in (");
        int size2 = list.size();
        e.a(b11, size2);
        b11.append(")");
        final v i11 = v.i(b11.toString(), size + 0 + size2);
        int i12 = 1;
        for (Integer num : list2) {
            if (num == null) {
                i11.u1(i12);
            } else {
                i11.d1(i12, num.intValue());
            }
            i12++;
        }
        int i13 = size + 1;
        for (String str : list) {
            if (str == null) {
                i11.u1(i13);
            } else {
                i11.Q0(i13, str);
            }
            i13++;
        }
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<List<Integer>>() { // from class: com.forsale.app.datalayer.repositories.DistrictDao_Impl.21
            @Override // java.util.concurrent.Callable
            public List<Integer> call() throws Exception {
                Cursor c11 = j4.b.c(DistrictDao_Impl.this.__db, i11, false, null);
                try {
                    ArrayList arrayList = new ArrayList(c11.getCount());
                    while (c11.moveToNext()) {
                        arrayList.add(c11.isNull(0) ? null : Integer.valueOf(c11.getInt(0)));
                    }
                    return arrayList;
                } finally {
                    c11.close();
                    i11.release();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.DistrictDao
    public Object searchAreasWithBlocks(List<Integer> list, String str, zz.a<? super List<AreaWithBlocks>> aVar) {
        StringBuilder b11 = e.b();
        b11.append("SELECT * from districts WHERE parent_id in (");
        int size = list.size();
        e.a(b11, size);
        b11.append(") and (name_ar like ");
        b11.append("?");
        b11.append(" or name_en like ");
        b11.append("?");
        b11.append(")");
        int i11 = size + 2;
        final v i12 = v.i(b11.toString(), i11);
        int i13 = 1;
        for (Integer num : list) {
            if (num == null) {
                i12.u1(i13);
            } else {
                i12.d1(i13, num.intValue());
            }
            i13++;
        }
        int i14 = size + 1;
        if (str == null) {
            i12.u1(i14);
        } else {
            i12.Q0(i14, str);
        }
        if (str == null) {
            i12.u1(i11);
        } else {
            i12.Q0(i11, str);
        }
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<List<AreaWithBlocks>>() { // from class: com.forsale.app.datalayer.repositories.DistrictDao_Impl.24
            /* JADX WARN: Removed duplicated region for block: B:101:0x0228  */
            /* JADX WARN: Removed duplicated region for block: B:102:0x022b A[Catch: all -> 0x02a4, TryCatch #0 {all -> 0x02a4, blocks: (B:20:0x00df, B:22:0x00e5, B:24:0x00eb, B:26:0x00f1, B:28:0x00f7, B:30:0x00fd, B:32:0x0103, B:34:0x0109, B:36:0x010f, B:38:0x0115, B:40:0x011b, B:42:0x0123, B:44:0x012b, B:46:0x0133, B:48:0x013d, B:50:0x0147, B:62:0x0178, B:66:0x0193, B:70:0x01a2, B:74:0x01b1, B:78:0x01c0, B:82:0x01cf, B:86:0x01e6, B:90:0x01f5, B:94:0x0208, B:99:0x0222, B:103:0x0231, B:107:0x0240, B:108:0x024b, B:113:0x025e, B:115:0x027e, B:114:0x0271, B:111:0x0254, B:106:0x023a, B:102:0x022b, B:98:0x0217, B:93:0x01fe, B:89:0x01ef, B:85:0x01e0, B:81:0x01c9, B:77:0x01ba, B:73:0x01ab, B:69:0x019c, B:65:0x018d), top: B:125:0x00df }] */
            /* JADX WARN: Removed duplicated region for block: B:105:0x0237  */
            /* JADX WARN: Removed duplicated region for block: B:106:0x023a A[Catch: all -> 0x02a4, TryCatch #0 {all -> 0x02a4, blocks: (B:20:0x00df, B:22:0x00e5, B:24:0x00eb, B:26:0x00f1, B:28:0x00f7, B:30:0x00fd, B:32:0x0103, B:34:0x0109, B:36:0x010f, B:38:0x0115, B:40:0x011b, B:42:0x0123, B:44:0x012b, B:46:0x0133, B:48:0x013d, B:50:0x0147, B:62:0x0178, B:66:0x0193, B:70:0x01a2, B:74:0x01b1, B:78:0x01c0, B:82:0x01cf, B:86:0x01e6, B:90:0x01f5, B:94:0x0208, B:99:0x0222, B:103:0x0231, B:107:0x0240, B:108:0x024b, B:113:0x025e, B:115:0x027e, B:114:0x0271, B:111:0x0254, B:106:0x023a, B:102:0x022b, B:98:0x0217, B:93:0x01fe, B:89:0x01ef, B:85:0x01e0, B:81:0x01c9, B:77:0x01ba, B:73:0x01ab, B:69:0x019c, B:65:0x018d), top: B:125:0x00df }] */
            /* JADX WARN: Removed duplicated region for block: B:110:0x0251  */
            /* JADX WARN: Removed duplicated region for block: B:111:0x0254 A[Catch: all -> 0x02a4, TryCatch #0 {all -> 0x02a4, blocks: (B:20:0x00df, B:22:0x00e5, B:24:0x00eb, B:26:0x00f1, B:28:0x00f7, B:30:0x00fd, B:32:0x0103, B:34:0x0109, B:36:0x010f, B:38:0x0115, B:40:0x011b, B:42:0x0123, B:44:0x012b, B:46:0x0133, B:48:0x013d, B:50:0x0147, B:62:0x0178, B:66:0x0193, B:70:0x01a2, B:74:0x01b1, B:78:0x01c0, B:82:0x01cf, B:86:0x01e6, B:90:0x01f5, B:94:0x0208, B:99:0x0222, B:103:0x0231, B:107:0x0240, B:108:0x024b, B:113:0x025e, B:115:0x027e, B:114:0x0271, B:111:0x0254, B:106:0x023a, B:102:0x022b, B:98:0x0217, B:93:0x01fe, B:89:0x01ef, B:85:0x01e0, B:81:0x01c9, B:77:0x01ba, B:73:0x01ab, B:69:0x019c, B:65:0x018d), top: B:125:0x00df }] */
            /* JADX WARN: Removed duplicated region for block: B:113:0x025e A[Catch: all -> 0x02a4, TryCatch #0 {all -> 0x02a4, blocks: (B:20:0x00df, B:22:0x00e5, B:24:0x00eb, B:26:0x00f1, B:28:0x00f7, B:30:0x00fd, B:32:0x0103, B:34:0x0109, B:36:0x010f, B:38:0x0115, B:40:0x011b, B:42:0x0123, B:44:0x012b, B:46:0x0133, B:48:0x013d, B:50:0x0147, B:62:0x0178, B:66:0x0193, B:70:0x01a2, B:74:0x01b1, B:78:0x01c0, B:82:0x01cf, B:86:0x01e6, B:90:0x01f5, B:94:0x0208, B:99:0x0222, B:103:0x0231, B:107:0x0240, B:108:0x024b, B:113:0x025e, B:115:0x027e, B:114:0x0271, B:111:0x0254, B:106:0x023a, B:102:0x022b, B:98:0x0217, B:93:0x01fe, B:89:0x01ef, B:85:0x01e0, B:81:0x01c9, B:77:0x01ba, B:73:0x01ab, B:69:0x019c, B:65:0x018d), top: B:125:0x00df }] */
            /* JADX WARN: Removed duplicated region for block: B:114:0x0271 A[Catch: all -> 0x02a4, TryCatch #0 {all -> 0x02a4, blocks: (B:20:0x00df, B:22:0x00e5, B:24:0x00eb, B:26:0x00f1, B:28:0x00f7, B:30:0x00fd, B:32:0x0103, B:34:0x0109, B:36:0x010f, B:38:0x0115, B:40:0x011b, B:42:0x0123, B:44:0x012b, B:46:0x0133, B:48:0x013d, B:50:0x0147, B:62:0x0178, B:66:0x0193, B:70:0x01a2, B:74:0x01b1, B:78:0x01c0, B:82:0x01cf, B:86:0x01e6, B:90:0x01f5, B:94:0x0208, B:99:0x0222, B:103:0x0231, B:107:0x0240, B:108:0x024b, B:113:0x025e, B:115:0x027e, B:114:0x0271, B:111:0x0254, B:106:0x023a, B:102:0x022b, B:98:0x0217, B:93:0x01fe, B:89:0x01ef, B:85:0x01e0, B:81:0x01c9, B:77:0x01ba, B:73:0x01ab, B:69:0x019c, B:65:0x018d), top: B:125:0x00df }] */
            /* JADX WARN: Removed duplicated region for block: B:64:0x018a  */
            /* JADX WARN: Removed duplicated region for block: B:65:0x018d A[Catch: all -> 0x02a4, TryCatch #0 {all -> 0x02a4, blocks: (B:20:0x00df, B:22:0x00e5, B:24:0x00eb, B:26:0x00f1, B:28:0x00f7, B:30:0x00fd, B:32:0x0103, B:34:0x0109, B:36:0x010f, B:38:0x0115, B:40:0x011b, B:42:0x0123, B:44:0x012b, B:46:0x0133, B:48:0x013d, B:50:0x0147, B:62:0x0178, B:66:0x0193, B:70:0x01a2, B:74:0x01b1, B:78:0x01c0, B:82:0x01cf, B:86:0x01e6, B:90:0x01f5, B:94:0x0208, B:99:0x0222, B:103:0x0231, B:107:0x0240, B:108:0x024b, B:113:0x025e, B:115:0x027e, B:114:0x0271, B:111:0x0254, B:106:0x023a, B:102:0x022b, B:98:0x0217, B:93:0x01fe, B:89:0x01ef, B:85:0x01e0, B:81:0x01c9, B:77:0x01ba, B:73:0x01ab, B:69:0x019c, B:65:0x018d), top: B:125:0x00df }] */
            /* JADX WARN: Removed duplicated region for block: B:68:0x0199  */
            /* JADX WARN: Removed duplicated region for block: B:69:0x019c A[Catch: all -> 0x02a4, TryCatch #0 {all -> 0x02a4, blocks: (B:20:0x00df, B:22:0x00e5, B:24:0x00eb, B:26:0x00f1, B:28:0x00f7, B:30:0x00fd, B:32:0x0103, B:34:0x0109, B:36:0x010f, B:38:0x0115, B:40:0x011b, B:42:0x0123, B:44:0x012b, B:46:0x0133, B:48:0x013d, B:50:0x0147, B:62:0x0178, B:66:0x0193, B:70:0x01a2, B:74:0x01b1, B:78:0x01c0, B:82:0x01cf, B:86:0x01e6, B:90:0x01f5, B:94:0x0208, B:99:0x0222, B:103:0x0231, B:107:0x0240, B:108:0x024b, B:113:0x025e, B:115:0x027e, B:114:0x0271, B:111:0x0254, B:106:0x023a, B:102:0x022b, B:98:0x0217, B:93:0x01fe, B:89:0x01ef, B:85:0x01e0, B:81:0x01c9, B:77:0x01ba, B:73:0x01ab, B:69:0x019c, B:65:0x018d), top: B:125:0x00df }] */
            /* JADX WARN: Removed duplicated region for block: B:72:0x01a8  */
            /* JADX WARN: Removed duplicated region for block: B:73:0x01ab A[Catch: all -> 0x02a4, TryCatch #0 {all -> 0x02a4, blocks: (B:20:0x00df, B:22:0x00e5, B:24:0x00eb, B:26:0x00f1, B:28:0x00f7, B:30:0x00fd, B:32:0x0103, B:34:0x0109, B:36:0x010f, B:38:0x0115, B:40:0x011b, B:42:0x0123, B:44:0x012b, B:46:0x0133, B:48:0x013d, B:50:0x0147, B:62:0x0178, B:66:0x0193, B:70:0x01a2, B:74:0x01b1, B:78:0x01c0, B:82:0x01cf, B:86:0x01e6, B:90:0x01f5, B:94:0x0208, B:99:0x0222, B:103:0x0231, B:107:0x0240, B:108:0x024b, B:113:0x025e, B:115:0x027e, B:114:0x0271, B:111:0x0254, B:106:0x023a, B:102:0x022b, B:98:0x0217, B:93:0x01fe, B:89:0x01ef, B:85:0x01e0, B:81:0x01c9, B:77:0x01ba, B:73:0x01ab, B:69:0x019c, B:65:0x018d), top: B:125:0x00df }] */
            /* JADX WARN: Removed duplicated region for block: B:76:0x01b7  */
            /* JADX WARN: Removed duplicated region for block: B:77:0x01ba A[Catch: all -> 0x02a4, TryCatch #0 {all -> 0x02a4, blocks: (B:20:0x00df, B:22:0x00e5, B:24:0x00eb, B:26:0x00f1, B:28:0x00f7, B:30:0x00fd, B:32:0x0103, B:34:0x0109, B:36:0x010f, B:38:0x0115, B:40:0x011b, B:42:0x0123, B:44:0x012b, B:46:0x0133, B:48:0x013d, B:50:0x0147, B:62:0x0178, B:66:0x0193, B:70:0x01a2, B:74:0x01b1, B:78:0x01c0, B:82:0x01cf, B:86:0x01e6, B:90:0x01f5, B:94:0x0208, B:99:0x0222, B:103:0x0231, B:107:0x0240, B:108:0x024b, B:113:0x025e, B:115:0x027e, B:114:0x0271, B:111:0x0254, B:106:0x023a, B:102:0x022b, B:98:0x0217, B:93:0x01fe, B:89:0x01ef, B:85:0x01e0, B:81:0x01c9, B:77:0x01ba, B:73:0x01ab, B:69:0x019c, B:65:0x018d), top: B:125:0x00df }] */
            /* JADX WARN: Removed duplicated region for block: B:80:0x01c6  */
            /* JADX WARN: Removed duplicated region for block: B:81:0x01c9 A[Catch: all -> 0x02a4, TryCatch #0 {all -> 0x02a4, blocks: (B:20:0x00df, B:22:0x00e5, B:24:0x00eb, B:26:0x00f1, B:28:0x00f7, B:30:0x00fd, B:32:0x0103, B:34:0x0109, B:36:0x010f, B:38:0x0115, B:40:0x011b, B:42:0x0123, B:44:0x012b, B:46:0x0133, B:48:0x013d, B:50:0x0147, B:62:0x0178, B:66:0x0193, B:70:0x01a2, B:74:0x01b1, B:78:0x01c0, B:82:0x01cf, B:86:0x01e6, B:90:0x01f5, B:94:0x0208, B:99:0x0222, B:103:0x0231, B:107:0x0240, B:108:0x024b, B:113:0x025e, B:115:0x027e, B:114:0x0271, B:111:0x0254, B:106:0x023a, B:102:0x022b, B:98:0x0217, B:93:0x01fe, B:89:0x01ef, B:85:0x01e0, B:81:0x01c9, B:77:0x01ba, B:73:0x01ab, B:69:0x019c, B:65:0x018d), top: B:125:0x00df }] */
            /* JADX WARN: Removed duplicated region for block: B:84:0x01dd  */
            /* JADX WARN: Removed duplicated region for block: B:85:0x01e0 A[Catch: all -> 0x02a4, TryCatch #0 {all -> 0x02a4, blocks: (B:20:0x00df, B:22:0x00e5, B:24:0x00eb, B:26:0x00f1, B:28:0x00f7, B:30:0x00fd, B:32:0x0103, B:34:0x0109, B:36:0x010f, B:38:0x0115, B:40:0x011b, B:42:0x0123, B:44:0x012b, B:46:0x0133, B:48:0x013d, B:50:0x0147, B:62:0x0178, B:66:0x0193, B:70:0x01a2, B:74:0x01b1, B:78:0x01c0, B:82:0x01cf, B:86:0x01e6, B:90:0x01f5, B:94:0x0208, B:99:0x0222, B:103:0x0231, B:107:0x0240, B:108:0x024b, B:113:0x025e, B:115:0x027e, B:114:0x0271, B:111:0x0254, B:106:0x023a, B:102:0x022b, B:98:0x0217, B:93:0x01fe, B:89:0x01ef, B:85:0x01e0, B:81:0x01c9, B:77:0x01ba, B:73:0x01ab, B:69:0x019c, B:65:0x018d), top: B:125:0x00df }] */
            /* JADX WARN: Removed duplicated region for block: B:88:0x01ec  */
            /* JADX WARN: Removed duplicated region for block: B:89:0x01ef A[Catch: all -> 0x02a4, TryCatch #0 {all -> 0x02a4, blocks: (B:20:0x00df, B:22:0x00e5, B:24:0x00eb, B:26:0x00f1, B:28:0x00f7, B:30:0x00fd, B:32:0x0103, B:34:0x0109, B:36:0x010f, B:38:0x0115, B:40:0x011b, B:42:0x0123, B:44:0x012b, B:46:0x0133, B:48:0x013d, B:50:0x0147, B:62:0x0178, B:66:0x0193, B:70:0x01a2, B:74:0x01b1, B:78:0x01c0, B:82:0x01cf, B:86:0x01e6, B:90:0x01f5, B:94:0x0208, B:99:0x0222, B:103:0x0231, B:107:0x0240, B:108:0x024b, B:113:0x025e, B:115:0x027e, B:114:0x0271, B:111:0x0254, B:106:0x023a, B:102:0x022b, B:98:0x0217, B:93:0x01fe, B:89:0x01ef, B:85:0x01e0, B:81:0x01c9, B:77:0x01ba, B:73:0x01ab, B:69:0x019c, B:65:0x018d), top: B:125:0x00df }] */
            /* JADX WARN: Removed duplicated region for block: B:92:0x01fb  */
            /* JADX WARN: Removed duplicated region for block: B:93:0x01fe A[Catch: all -> 0x02a4, TryCatch #0 {all -> 0x02a4, blocks: (B:20:0x00df, B:22:0x00e5, B:24:0x00eb, B:26:0x00f1, B:28:0x00f7, B:30:0x00fd, B:32:0x0103, B:34:0x0109, B:36:0x010f, B:38:0x0115, B:40:0x011b, B:42:0x0123, B:44:0x012b, B:46:0x0133, B:48:0x013d, B:50:0x0147, B:62:0x0178, B:66:0x0193, B:70:0x01a2, B:74:0x01b1, B:78:0x01c0, B:82:0x01cf, B:86:0x01e6, B:90:0x01f5, B:94:0x0208, B:99:0x0222, B:103:0x0231, B:107:0x0240, B:108:0x024b, B:113:0x025e, B:115:0x027e, B:114:0x0271, B:111:0x0254, B:106:0x023a, B:102:0x022b, B:98:0x0217, B:93:0x01fe, B:89:0x01ef, B:85:0x01e0, B:81:0x01c9, B:77:0x01ba, B:73:0x01ab, B:69:0x019c, B:65:0x018d), top: B:125:0x00df }] */
            /* JADX WARN: Removed duplicated region for block: B:96:0x020e  */
            /* JADX WARN: Removed duplicated region for block: B:98:0x0217 A[Catch: all -> 0x02a4, TryCatch #0 {all -> 0x02a4, blocks: (B:20:0x00df, B:22:0x00e5, B:24:0x00eb, B:26:0x00f1, B:28:0x00f7, B:30:0x00fd, B:32:0x0103, B:34:0x0109, B:36:0x010f, B:38:0x0115, B:40:0x011b, B:42:0x0123, B:44:0x012b, B:46:0x0133, B:48:0x013d, B:50:0x0147, B:62:0x0178, B:66:0x0193, B:70:0x01a2, B:74:0x01b1, B:78:0x01c0, B:82:0x01cf, B:86:0x01e6, B:90:0x01f5, B:94:0x0208, B:99:0x0222, B:103:0x0231, B:107:0x0240, B:108:0x024b, B:113:0x025e, B:115:0x027e, B:114:0x0271, B:111:0x0254, B:106:0x023a, B:102:0x022b, B:98:0x0217, B:93:0x01fe, B:89:0x01ef, B:85:0x01e0, B:81:0x01c9, B:77:0x01ba, B:73:0x01ab, B:69:0x019c, B:65:0x018d), top: B:125:0x00df }] */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.util.List<com.forsale.app.datalayer.database.AreaWithBlocks> call() throws java.lang.Exception {
                /*
                    Method dump skipped, instructions count: 703
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.DistrictDao_Impl.AnonymousClass24.call():java.util.List");
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.DistrictDao
    public Object updateDistrict(final DistrictEntity districtEntity, zz.a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.repositories.DistrictDao_Impl.9
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                DistrictDao_Impl.this.__db.beginTransaction();
                try {
                    DistrictDao_Impl.this.__db.setTransactionSuccessful();
                    return Integer.valueOf(DistrictDao_Impl.this.__updateAdapterOfDistrictEntity.handle(districtEntity) + 0);
                } finally {
                    DistrictDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.DistrictDao
    public Object deleteAllDistricts(zz.a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.repositories.DistrictDao_Impl.10
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                m acquire = DistrictDao_Impl.this.__preparedStmtOfDeleteAllDistricts.acquire();
                try {
                    DistrictDao_Impl.this.__db.beginTransaction();
                    Integer valueOf = Integer.valueOf(acquire.O());
                    DistrictDao_Impl.this.__db.setTransactionSuccessful();
                    DistrictDao_Impl.this.__db.endTransaction();
                    return valueOf;
                } finally {
                    DistrictDao_Impl.this.__preparedStmtOfDeleteAllDistricts.release(acquire);
                }
            }
        }, aVar);
    }
}
