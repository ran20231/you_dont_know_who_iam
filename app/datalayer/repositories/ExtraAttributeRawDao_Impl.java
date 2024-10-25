package com.forsale.app.datalayer.repositories;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.v;
import com.forsale.app.datalayer.database.AttrUnitConverter;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.database.ExtraAttributeEntity;
import com.forsale.app.datalayer.database.ExtraAttributeFlatGroupEntity;
import com.forsale.app.datalayer.network.responses.ListingsResponse;
import j4.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import l4.l;
/* loaded from: classes2.dex */
public final class ExtraAttributeRawDao_Impl implements ExtraAttributeRawDao {
    private final RoomDatabase __db;
    private final AttrUnitConverter __attrUnitConverter = new AttrUnitConverter();
    private final ListingsResponse.UISettings.FiltrationSetting.SelectionTypeConverter __selectionTypeConverter = new ListingsResponse.UISettings.FiltrationSetting.SelectionTypeConverter();
    private final ListingsResponse.UISettings.FiltrationSetting.ExposeTypeConverter __exposeTypeConverter = new ListingsResponse.UISettings.FiltrationSetting.ExposeTypeConverter();
    private final ListingsResponse.UISettings.FiltrationSetting.ViewTypeConverter __viewTypeConverter = new ListingsResponse.UISettings.FiltrationSetting.ViewTypeConverter();

    public ExtraAttributeRawDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ExtraAttributeEntity __entityCursorConverter_comForsaleAppDatalayerDatabaseExtraAttributeEntity(Cursor cursor) {
        int i11;
        String string;
        String string2;
        String string3;
        String string4;
        Integer valueOf;
        Integer valueOf2;
        int i12;
        int i13;
        int i14;
        int i15;
        Integer valueOf3;
        int i16;
        String string5;
        Integer valueOf4;
        String string6;
        String string7;
        String string8;
        ExtraAttributeRawDao_Impl extraAttributeRawDao_Impl;
        ExtraAttributeEntity.AttrUnit attrUnit;
        String string9;
        ListingsResponse.UISettings.FiltrationSetting.SelectionType selectionType;
        String string10;
        ListingsResponse.UISettings.FiltrationSetting.ExposeType exposeType;
        int d11 = j4.a.d(cursor, "id");
        int d12 = j4.a.d(cursor, "type");
        int d13 = j4.a.d(cursor, "name_ar");
        int d14 = j4.a.d(cursor, "name_en");
        int d15 = j4.a.d(cursor, "system_name");
        int d16 = j4.a.d(cursor, "is_required");
        int d17 = j4.a.d(cursor, "display_order");
        int d18 = j4.a.d(cursor, "min");
        int d19 = j4.a.d(cursor, "max");
        int d21 = j4.a.d(cursor, "validate_min");
        int d22 = j4.a.d(cursor, "validate_max");
        int d23 = j4.a.d(cursor, "slider_steps");
        int d24 = j4.a.d(cursor, "is_int");
        int d25 = j4.a.d(cursor, "image");
        int d26 = j4.a.d(cursor, "extra_attribute_group_id");
        int d27 = j4.a.d(cursor, "sub_type");
        int d28 = j4.a.d(cursor, "scope");
        int d29 = j4.a.d(cursor, "unit");
        int d31 = j4.a.d(cursor, "selection_type");
        int d32 = j4.a.d(cursor, "exposed_type");
        int d33 = j4.a.d(cursor, "view_type");
        int d34 = j4.a.d(cursor, CategoryEntity.IS_FILTERABLE);
        int i17 = 0;
        if (d11 == -1) {
            i11 = 0;
        } else {
            i11 = cursor.getInt(d11);
        }
        ListingsResponse.UISettings.FiltrationSetting.ViewType viewType = null;
        String str = null;
        if (d12 == -1 || cursor.isNull(d12)) {
            string = null;
        } else {
            string = cursor.getString(d12);
        }
        if (d13 == -1 || cursor.isNull(d13)) {
            string2 = null;
        } else {
            string2 = cursor.getString(d13);
        }
        if (d14 == -1 || cursor.isNull(d14)) {
            string3 = null;
        } else {
            string3 = cursor.getString(d14);
        }
        if (d15 == -1 || cursor.isNull(d15)) {
            string4 = null;
        } else {
            string4 = cursor.getString(d15);
        }
        if (d16 == -1 || cursor.isNull(d16)) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(cursor.getInt(d16));
        }
        if (d17 == -1 || cursor.isNull(d17)) {
            valueOf2 = null;
        } else {
            valueOf2 = Integer.valueOf(cursor.getInt(d17));
        }
        if (d18 == -1) {
            i12 = 0;
        } else {
            i12 = cursor.getInt(d18);
        }
        if (d19 == -1) {
            i13 = 0;
        } else {
            i13 = cursor.getInt(d19);
        }
        if (d21 == -1) {
            i14 = 0;
        } else {
            i14 = cursor.getInt(d21);
        }
        if (d22 == -1) {
            i15 = 0;
        } else {
            i15 = cursor.getInt(d22);
        }
        if (d23 == -1 || cursor.isNull(d23)) {
            valueOf3 = null;
        } else {
            valueOf3 = Integer.valueOf(cursor.getInt(d23));
        }
        if (d24 == -1) {
            i16 = 0;
        } else {
            i16 = cursor.getInt(d24);
        }
        if (d25 == -1 || cursor.isNull(d25)) {
            string5 = null;
        } else {
            string5 = cursor.getString(d25);
        }
        if (d26 == -1 || cursor.isNull(d26)) {
            valueOf4 = null;
        } else {
            valueOf4 = Integer.valueOf(cursor.getInt(d26));
        }
        if (d27 == -1 || cursor.isNull(d27)) {
            string6 = null;
        } else {
            string6 = cursor.getString(d27);
        }
        if (d28 == -1 || cursor.isNull(d28)) {
            string7 = null;
        } else {
            string7 = cursor.getString(d28);
        }
        if (d29 == -1) {
            extraAttributeRawDao_Impl = this;
            attrUnit = null;
        } else {
            if (cursor.isNull(d29)) {
                extraAttributeRawDao_Impl = this;
                string8 = null;
            } else {
                string8 = cursor.getString(d29);
                extraAttributeRawDao_Impl = this;
            }
            attrUnit = extraAttributeRawDao_Impl.__attrUnitConverter.toAttrUnit(string8);
        }
        if (d31 == -1) {
            selectionType = null;
        } else {
            if (cursor.isNull(d31)) {
                string9 = null;
            } else {
                string9 = cursor.getString(d31);
            }
            selectionType = extraAttributeRawDao_Impl.__selectionTypeConverter.toSelectionType(string9);
        }
        if (d32 == -1) {
            exposeType = null;
        } else {
            if (cursor.isNull(d32)) {
                string10 = null;
            } else {
                string10 = cursor.getString(d32);
            }
            exposeType = extraAttributeRawDao_Impl.__exposeTypeConverter.toExposeType(string10);
        }
        if (d33 != -1) {
            if (!cursor.isNull(d33)) {
                str = cursor.getString(d33);
            }
            viewType = extraAttributeRawDao_Impl.__viewTypeConverter.toViewType(str);
        }
        ListingsResponse.UISettings.FiltrationSetting.ViewType viewType2 = viewType;
        if (d34 != -1) {
            i17 = cursor.getInt(d34);
        }
        return new ExtraAttributeEntity(i11, string, string2, string3, string4, valueOf, valueOf2, i12, i13, i14, i15, valueOf3, i16, string5, valueOf4, string6, string7, attrUnit, selectionType, exposeType, viewType2, i17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ExtraAttributeFlatGroupEntity __entityCursorConverter_comForsaleAppDatalayerDatabaseExtraAttributeFlatGroupEntity(Cursor cursor) {
        int i11;
        String string;
        String string2;
        String string3;
        String string4;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Integer valueOf;
        int i18;
        String string5;
        Integer valueOf2;
        String string6;
        String string7;
        Integer valueOf3;
        String string8;
        String string9;
        int i19;
        boolean z11;
        boolean z12;
        int i21;
        String string10;
        int i22;
        int i23;
        String string11;
        String string12;
        int d11 = j4.a.d(cursor, "id");
        int d12 = j4.a.d(cursor, "type");
        int d13 = j4.a.d(cursor, "name_ar");
        int d14 = j4.a.d(cursor, "name_en");
        int d15 = j4.a.d(cursor, "system_name");
        int d16 = j4.a.d(cursor, "is_required");
        int d17 = j4.a.d(cursor, "display_order");
        int d18 = j4.a.d(cursor, "min");
        int d19 = j4.a.d(cursor, "max");
        int d21 = j4.a.d(cursor, "validate_min");
        int d22 = j4.a.d(cursor, "validate_max");
        int d23 = j4.a.d(cursor, "slider_steps");
        int d24 = j4.a.d(cursor, "is_int");
        int d25 = j4.a.d(cursor, "image");
        int d26 = j4.a.d(cursor, "extra_attribute_group_id");
        int d27 = j4.a.d(cursor, "sub_type");
        int d28 = j4.a.d(cursor, "scope");
        int d29 = j4.a.d(cursor, ExtraAttributeFlatGroupEntity.GROUP_ID);
        int d31 = j4.a.d(cursor, ExtraAttributeFlatGroupEntity.GROUP_NAME_AR);
        int d32 = j4.a.d(cursor, ExtraAttributeFlatGroupEntity.GROUP_NAME_EN);
        int d33 = j4.a.d(cursor, ExtraAttributeFlatGroupEntity.GROUP_DISPLAY_ORDER);
        int d34 = j4.a.d(cursor, "isChecked");
        int d35 = j4.a.d(cursor, "textNumValue");
        int d36 = j4.a.d(cursor, "optionId");
        int d37 = j4.a.d(cursor, "minValue");
        int d38 = j4.a.d(cursor, "maxValue");
        int d39 = j4.a.d(cursor, "fileName");
        int d41 = j4.a.d(cursor, "isValid");
        if (d11 == -1) {
            i11 = 0;
        } else {
            i11 = cursor.getInt(d11);
        }
        String str = null;
        if (d12 == -1 || cursor.isNull(d12)) {
            string = null;
        } else {
            string = cursor.getString(d12);
        }
        if (d13 == -1 || cursor.isNull(d13)) {
            string2 = null;
        } else {
            string2 = cursor.getString(d13);
        }
        if (d14 == -1 || cursor.isNull(d14)) {
            string3 = null;
        } else {
            string3 = cursor.getString(d14);
        }
        if (d15 == -1 || cursor.isNull(d15)) {
            string4 = null;
        } else {
            string4 = cursor.getString(d15);
        }
        if (d16 == -1) {
            i12 = 0;
        } else {
            i12 = cursor.getInt(d16);
        }
        if (d17 == -1) {
            i13 = 0;
        } else {
            i13 = cursor.getInt(d17);
        }
        if (d18 == -1) {
            i14 = 0;
        } else {
            i14 = cursor.getInt(d18);
        }
        if (d19 == -1) {
            i15 = 0;
        } else {
            i15 = cursor.getInt(d19);
        }
        if (d21 == -1) {
            i16 = 0;
        } else {
            i16 = cursor.getInt(d21);
        }
        if (d22 == -1) {
            i17 = 0;
        } else {
            i17 = cursor.getInt(d22);
        }
        if (d23 == -1 || cursor.isNull(d23)) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(cursor.getInt(d23));
        }
        if (d24 == -1) {
            i18 = 0;
        } else {
            i18 = cursor.getInt(d24);
        }
        if (d25 == -1 || cursor.isNull(d25)) {
            string5 = null;
        } else {
            string5 = cursor.getString(d25);
        }
        if (d26 == -1 || cursor.isNull(d26)) {
            valueOf2 = null;
        } else {
            valueOf2 = Integer.valueOf(cursor.getInt(d26));
        }
        if (d27 == -1 || cursor.isNull(d27)) {
            string6 = null;
        } else {
            string6 = cursor.getString(d27);
        }
        if (d28 == -1 || cursor.isNull(d28)) {
            string7 = null;
        } else {
            string7 = cursor.getString(d28);
        }
        if (d29 == -1 || cursor.isNull(d29)) {
            valueOf3 = null;
        } else {
            valueOf3 = Integer.valueOf(cursor.getInt(d29));
        }
        if (d31 == -1 || cursor.isNull(d31)) {
            string8 = null;
        } else {
            string8 = cursor.getString(d31);
        }
        if (d32 == -1 || cursor.isNull(d32)) {
            string9 = null;
        } else {
            string9 = cursor.getString(d32);
        }
        if (d33 == -1) {
            i19 = 0;
        } else {
            i19 = cursor.getInt(d33);
        }
        boolean z13 = true;
        if (d34 == -1) {
            i21 = d35;
            z12 = false;
        } else {
            if (cursor.getInt(d34) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = z11;
            i21 = d35;
        }
        if (i21 == -1 || cursor.isNull(i21)) {
            string10 = null;
        } else {
            string10 = cursor.getString(i21);
        }
        if (d36 == -1) {
            i23 = d37;
            i22 = 0;
        } else {
            i22 = cursor.getInt(d36);
            i23 = d37;
        }
        if (i23 == -1 || cursor.isNull(i23)) {
            string11 = null;
        } else {
            string11 = cursor.getString(i23);
        }
        if (d38 == -1 || cursor.isNull(d38)) {
            string12 = null;
        } else {
            string12 = cursor.getString(d38);
        }
        if (d39 != -1 && !cursor.isNull(d39)) {
            str = cursor.getString(d39);
        }
        ExtraAttributeFlatGroupEntity extraAttributeFlatGroupEntity = new ExtraAttributeFlatGroupEntity(i11, string, string2, string3, string4, i12, i13, i14, i15, i16, i17, valueOf, i18, string5, valueOf2, string6, string7, valueOf3, string8, string9, i19, z12, string10, i22, string11, string12, str);
        if (d41 != -1) {
            if (cursor.getInt(d41) == 0) {
                z13 = false;
            }
            extraAttributeFlatGroupEntity.setValid(z13);
        }
        return extraAttributeFlatGroupEntity;
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.forsale.app.datalayer.repositories.ExtraAttributeRawDao
    public Object getAttributesGroupedByCategoryIds(final l lVar, zz.a<? super List<ExtraAttributeFlatGroupEntity>> aVar) {
        return CoroutinesRoom.b(this.__db, true, j4.b.a(), new Callable<List<ExtraAttributeFlatGroupEntity>>() { // from class: com.forsale.app.datalayer.repositories.ExtraAttributeRawDao_Impl.4
            @Override // java.util.concurrent.Callable
            public List<ExtraAttributeFlatGroupEntity> call() throws Exception {
                ExtraAttributeRawDao_Impl.this.__db.beginTransaction();
                try {
                    Cursor c11 = j4.b.c(ExtraAttributeRawDao_Impl.this.__db, lVar, false, null);
                    ArrayList arrayList = new ArrayList(c11.getCount());
                    while (c11.moveToNext()) {
                        arrayList.add(ExtraAttributeRawDao_Impl.this.__entityCursorConverter_comForsaleAppDatalayerDatabaseExtraAttributeFlatGroupEntity(c11));
                    }
                    ExtraAttributeRawDao_Impl.this.__db.setTransactionSuccessful();
                    c11.close();
                    return arrayList;
                } finally {
                    ExtraAttributeRawDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.ExtraAttributeRawDao
    public Object getAttributesInCategoriesWithType(final l lVar, zz.a<? super List<ExtraAttributeEntity>> aVar) {
        return CoroutinesRoom.b(this.__db, true, j4.b.a(), new Callable<List<ExtraAttributeEntity>>() { // from class: com.forsale.app.datalayer.repositories.ExtraAttributeRawDao_Impl.5
            @Override // java.util.concurrent.Callable
            public List<ExtraAttributeEntity> call() throws Exception {
                ExtraAttributeRawDao_Impl.this.__db.beginTransaction();
                try {
                    Cursor c11 = j4.b.c(ExtraAttributeRawDao_Impl.this.__db, lVar, false, null);
                    ArrayList arrayList = new ArrayList(c11.getCount());
                    while (c11.moveToNext()) {
                        arrayList.add(ExtraAttributeRawDao_Impl.this.__entityCursorConverter_comForsaleAppDatalayerDatabaseExtraAttributeEntity(c11));
                    }
                    ExtraAttributeRawDao_Impl.this.__db.setTransactionSuccessful();
                    c11.close();
                    return arrayList;
                } finally {
                    ExtraAttributeRawDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.ExtraAttributeRawDao
    public Object getCategoriesNestedByCategoryId(final l lVar, zz.a<? super String> aVar) {
        return CoroutinesRoom.b(this.__db, true, j4.b.a(), new Callable<String>() { // from class: com.forsale.app.datalayer.repositories.ExtraAttributeRawDao_Impl.3
            @Override // java.util.concurrent.Callable
            public String call() throws Exception {
                ExtraAttributeRawDao_Impl.this.__db.beginTransaction();
                try {
                    String str = null;
                    Cursor c11 = j4.b.c(ExtraAttributeRawDao_Impl.this.__db, lVar, false, null);
                    if (c11.moveToFirst() && !c11.isNull(0)) {
                        str = c11.getString(0);
                    }
                    ExtraAttributeRawDao_Impl.this.__db.setTransactionSuccessful();
                    c11.close();
                    return str;
                } finally {
                    ExtraAttributeRawDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.ExtraAttributeRawDao
    public Object getExtraAttributeWithId(int i11, zz.a<? super ExtraAttributeEntity> aVar) {
        final v i12 = v.i("SELECT * FROM extra_attributes WHERE id == ? LIMIT 1", 1);
        i12.d1(1, i11);
        return CoroutinesRoom.b(this.__db, true, j4.b.a(), new Callable<ExtraAttributeEntity>() { // from class: com.forsale.app.datalayer.repositories.ExtraAttributeRawDao_Impl.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public ExtraAttributeEntity call() throws Exception {
                AnonymousClass2 anonymousClass2;
                ExtraAttributeEntity extraAttributeEntity;
                String string;
                int i13;
                Integer valueOf;
                int i14;
                String string2;
                int i15;
                String string3;
                int i16;
                ExtraAttributeRawDao_Impl.this.__db.beginTransaction();
                try {
                    try {
                        Cursor c11 = j4.b.c(ExtraAttributeRawDao_Impl.this.__db, i12, false, null);
                        try {
                            int e11 = j4.a.e(c11, "id");
                            int e12 = j4.a.e(c11, "type");
                            int e13 = j4.a.e(c11, "name_ar");
                            int e14 = j4.a.e(c11, "name_en");
                            int e15 = j4.a.e(c11, "system_name");
                            int e16 = j4.a.e(c11, "is_required");
                            int e17 = j4.a.e(c11, "display_order");
                            int e18 = j4.a.e(c11, "min");
                            int e19 = j4.a.e(c11, "max");
                            int e21 = j4.a.e(c11, "validate_min");
                            int e22 = j4.a.e(c11, "validate_max");
                            int e23 = j4.a.e(c11, "slider_steps");
                            int e24 = j4.a.e(c11, "is_int");
                            int e25 = j4.a.e(c11, "image");
                            try {
                                int e26 = j4.a.e(c11, "extra_attribute_group_id");
                                int e27 = j4.a.e(c11, "sub_type");
                                int e28 = j4.a.e(c11, "scope");
                                int e29 = j4.a.e(c11, "unit");
                                int e31 = j4.a.e(c11, "selection_type");
                                int e32 = j4.a.e(c11, "exposed_type");
                                int e33 = j4.a.e(c11, "view_type");
                                int e34 = j4.a.e(c11, CategoryEntity.IS_FILTERABLE);
                                if (c11.moveToFirst()) {
                                    int i17 = c11.getInt(e11);
                                    String string4 = c11.isNull(e12) ? null : c11.getString(e12);
                                    String string5 = c11.isNull(e13) ? null : c11.getString(e13);
                                    String string6 = c11.isNull(e14) ? null : c11.getString(e14);
                                    String string7 = c11.isNull(e15) ? null : c11.getString(e15);
                                    Integer valueOf2 = c11.isNull(e16) ? null : Integer.valueOf(c11.getInt(e16));
                                    Integer valueOf3 = c11.isNull(e17) ? null : Integer.valueOf(c11.getInt(e17));
                                    int i18 = c11.getInt(e18);
                                    int i19 = c11.getInt(e19);
                                    int i21 = c11.getInt(e21);
                                    int i22 = c11.getInt(e22);
                                    Integer valueOf4 = c11.isNull(e23) ? null : Integer.valueOf(c11.getInt(e23));
                                    int i23 = c11.getInt(e24);
                                    if (c11.isNull(e25)) {
                                        i13 = e26;
                                        string = null;
                                    } else {
                                        string = c11.getString(e25);
                                        i13 = e26;
                                    }
                                    if (c11.isNull(i13)) {
                                        i14 = e27;
                                        valueOf = null;
                                    } else {
                                        valueOf = Integer.valueOf(c11.getInt(i13));
                                        i14 = e27;
                                    }
                                    if (c11.isNull(i14)) {
                                        i15 = e28;
                                        string2 = null;
                                    } else {
                                        string2 = c11.getString(i14);
                                        i15 = e28;
                                    }
                                    if (c11.isNull(i15)) {
                                        i16 = e29;
                                        string3 = null;
                                    } else {
                                        string3 = c11.getString(i15);
                                        i16 = e29;
                                    }
                                    anonymousClass2 = this;
                                    try {
                                        extraAttributeEntity = new ExtraAttributeEntity(i17, string4, string5, string6, string7, valueOf2, valueOf3, i18, i19, i21, i22, valueOf4, i23, string, valueOf, string2, string3, ExtraAttributeRawDao_Impl.this.__attrUnitConverter.toAttrUnit(c11.isNull(i16) ? null : c11.getString(i16)), ExtraAttributeRawDao_Impl.this.__selectionTypeConverter.toSelectionType(c11.isNull(e31) ? null : c11.getString(e31)), ExtraAttributeRawDao_Impl.this.__exposeTypeConverter.toExposeType(c11.isNull(e32) ? null : c11.getString(e32)), ExtraAttributeRawDao_Impl.this.__viewTypeConverter.toViewType(c11.isNull(e33) ? null : c11.getString(e33)), c11.getInt(e34));
                                    } catch (Throwable th2) {
                                        th = th2;
                                        c11.close();
                                        i12.release();
                                        throw th;
                                    }
                                } else {
                                    anonymousClass2 = this;
                                    extraAttributeEntity = null;
                                }
                                ExtraAttributeRawDao_Impl.this.__db.setTransactionSuccessful();
                                c11.close();
                                i12.release();
                                ExtraAttributeRawDao_Impl.this.__db.endTransaction();
                                return extraAttributeEntity;
                            } catch (Throwable th3) {
                                th = th3;
                                anonymousClass2 = this;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            anonymousClass2 = this;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        ExtraAttributeRawDao_Impl.this.__db.endTransaction();
                        throw th;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    ExtraAttributeRawDao_Impl.this.__db.endTransaction();
                    throw th;
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.ExtraAttributeRawDao
    public Object getExtraAttributesByIds(List<Integer> list, zz.a<? super List<ExtraAttributeEntity>> aVar) {
        StringBuilder b11 = e.b();
        b11.append("SELECT * FROM extra_attributes where ID IN (");
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
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<List<ExtraAttributeEntity>>() { // from class: com.forsale.app.datalayer.repositories.ExtraAttributeRawDao_Impl.1
            @Override // java.util.concurrent.Callable
            public List<ExtraAttributeEntity> call() throws Exception {
                AnonymousClass1 anonymousClass1;
                int i13;
                int i14;
                String string;
                int i15;
                String string2;
                String string3;
                String string4;
                Cursor c11 = j4.b.c(ExtraAttributeRawDao_Impl.this.__db, i11, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "type");
                    int e13 = j4.a.e(c11, "name_ar");
                    int e14 = j4.a.e(c11, "name_en");
                    int e15 = j4.a.e(c11, "system_name");
                    int e16 = j4.a.e(c11, "is_required");
                    int e17 = j4.a.e(c11, "display_order");
                    int e18 = j4.a.e(c11, "min");
                    int e19 = j4.a.e(c11, "max");
                    int e21 = j4.a.e(c11, "validate_min");
                    int e22 = j4.a.e(c11, "validate_max");
                    int e23 = j4.a.e(c11, "slider_steps");
                    int e24 = j4.a.e(c11, "is_int");
                    int e25 = j4.a.e(c11, "image");
                    try {
                        int e26 = j4.a.e(c11, "extra_attribute_group_id");
                        int e27 = j4.a.e(c11, "sub_type");
                        int e28 = j4.a.e(c11, "scope");
                        int e29 = j4.a.e(c11, "unit");
                        int e31 = j4.a.e(c11, "selection_type");
                        int e32 = j4.a.e(c11, "exposed_type");
                        int e33 = j4.a.e(c11, "view_type");
                        int e34 = j4.a.e(c11, CategoryEntity.IS_FILTERABLE);
                        int i16 = e25;
                        ArrayList arrayList = new ArrayList(c11.getCount());
                        while (c11.moveToNext()) {
                            int i17 = c11.getInt(e11);
                            String string5 = c11.isNull(e12) ? null : c11.getString(e12);
                            String string6 = c11.isNull(e13) ? null : c11.getString(e13);
                            String string7 = c11.isNull(e14) ? null : c11.getString(e14);
                            String string8 = c11.isNull(e15) ? null : c11.getString(e15);
                            Integer valueOf = c11.isNull(e16) ? null : Integer.valueOf(c11.getInt(e16));
                            Integer valueOf2 = c11.isNull(e17) ? null : Integer.valueOf(c11.getInt(e17));
                            int i18 = c11.getInt(e18);
                            int i19 = c11.getInt(e19);
                            int i21 = c11.getInt(e21);
                            int i22 = c11.getInt(e22);
                            Integer valueOf3 = c11.isNull(e23) ? null : Integer.valueOf(c11.getInt(e23));
                            int i23 = c11.getInt(e24);
                            int i24 = i16;
                            String string9 = c11.isNull(i24) ? null : c11.getString(i24);
                            int i25 = e26;
                            int i26 = e11;
                            Integer valueOf4 = c11.isNull(i25) ? null : Integer.valueOf(c11.getInt(i25));
                            int i27 = e27;
                            String string10 = c11.isNull(i27) ? null : c11.getString(i27);
                            int i28 = e28;
                            String string11 = c11.isNull(i28) ? null : c11.getString(i28);
                            int i29 = e29;
                            if (c11.isNull(i29)) {
                                i13 = i29;
                                i15 = e12;
                                i14 = i24;
                                string = null;
                            } else {
                                i13 = i29;
                                i14 = i24;
                                string = c11.getString(i29);
                                i15 = e12;
                            }
                            anonymousClass1 = this;
                            try {
                                ExtraAttributeEntity.AttrUnit attrUnit = ExtraAttributeRawDao_Impl.this.__attrUnitConverter.toAttrUnit(string);
                                int i31 = e31;
                                if (c11.isNull(i31)) {
                                    e31 = i31;
                                    string2 = null;
                                } else {
                                    string2 = c11.getString(i31);
                                    e31 = i31;
                                }
                                ListingsResponse.UISettings.FiltrationSetting.SelectionType selectionType = ExtraAttributeRawDao_Impl.this.__selectionTypeConverter.toSelectionType(string2);
                                int i32 = e32;
                                if (c11.isNull(i32)) {
                                    e32 = i32;
                                    string3 = null;
                                } else {
                                    string3 = c11.getString(i32);
                                    e32 = i32;
                                }
                                ListingsResponse.UISettings.FiltrationSetting.ExposeType exposeType = ExtraAttributeRawDao_Impl.this.__exposeTypeConverter.toExposeType(string3);
                                int i33 = e33;
                                if (c11.isNull(i33)) {
                                    e33 = i33;
                                    string4 = null;
                                } else {
                                    string4 = c11.getString(i33);
                                    e33 = i33;
                                }
                                int i34 = e34;
                                arrayList.add(new ExtraAttributeEntity(i17, string5, string6, string7, string8, valueOf, valueOf2, i18, i19, i21, i22, valueOf3, i23, string9, valueOf4, string10, string11, attrUnit, selectionType, exposeType, ExtraAttributeRawDao_Impl.this.__viewTypeConverter.toViewType(string4), c11.getInt(i34)));
                                e34 = i34;
                                e11 = i26;
                                e26 = i25;
                                e27 = i27;
                                e28 = i28;
                                e12 = i15;
                                e29 = i13;
                                i16 = i14;
                            } catch (Throwable th2) {
                                th = th2;
                                c11.close();
                                i11.release();
                                throw th;
                            }
                        }
                        c11.close();
                        i11.release();
                        return arrayList;
                    } catch (Throwable th3) {
                        th = th3;
                        anonymousClass1 = this;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    anonymousClass1 = this;
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.ExtraAttributeRawDao
    public Object getExtraAttributesByIds(final l lVar, zz.a<? super List<ExtraAttributeEntity>> aVar) {
        return CoroutinesRoom.b(this.__db, true, j4.b.a(), new Callable<List<ExtraAttributeEntity>>() { // from class: com.forsale.app.datalayer.repositories.ExtraAttributeRawDao_Impl.6
            @Override // java.util.concurrent.Callable
            public List<ExtraAttributeEntity> call() throws Exception {
                ExtraAttributeRawDao_Impl.this.__db.beginTransaction();
                try {
                    Cursor c11 = j4.b.c(ExtraAttributeRawDao_Impl.this.__db, lVar, false, null);
                    ArrayList arrayList = new ArrayList(c11.getCount());
                    while (c11.moveToNext()) {
                        arrayList.add(ExtraAttributeRawDao_Impl.this.__entityCursorConverter_comForsaleAppDatalayerDatabaseExtraAttributeEntity(c11));
                    }
                    ExtraAttributeRawDao_Impl.this.__db.setTransactionSuccessful();
                    c11.close();
                    return arrayList;
                } finally {
                    ExtraAttributeRawDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }
}
