package com.forsale.app.datalayer.repositories;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.room.h;
import androidx.room.i;
import androidx.room.v;
import com.forsale.app.datalayer.database.AttrUnitConverter;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.database.ExtraAttributeEntity;
import com.forsale.app.datalayer.network.responses.ListingsResponse;
import j4.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import l4.m;
/* loaded from: classes2.dex */
public final class ExtraAttributeDao_Impl implements ExtraAttributeDao {
    private final RoomDatabase __db;
    private final h<ExtraAttributeEntity> __deletionAdapterOfExtraAttributeEntity;
    private final i<ExtraAttributeEntity> __insertionAdapterOfExtraAttributeEntity;
    private final SharedSQLiteStatement __preparedStmtOfDeleteAllExtraAttributes;
    private final h<ExtraAttributeEntity> __updateAdapterOfExtraAttributeEntity;
    private final AttrUnitConverter __attrUnitConverter = new AttrUnitConverter();
    private final ListingsResponse.UISettings.FiltrationSetting.SelectionTypeConverter __selectionTypeConverter = new ListingsResponse.UISettings.FiltrationSetting.SelectionTypeConverter();
    private final ListingsResponse.UISettings.FiltrationSetting.ExposeTypeConverter __exposeTypeConverter = new ListingsResponse.UISettings.FiltrationSetting.ExposeTypeConverter();
    private final ListingsResponse.UISettings.FiltrationSetting.ViewTypeConverter __viewTypeConverter = new ListingsResponse.UISettings.FiltrationSetting.ViewTypeConverter();

    public ExtraAttributeDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfExtraAttributeEntity = new i<ExtraAttributeEntity>(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.ExtraAttributeDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `extra_attributes` (`id`,`type`,`name_ar`,`name_en`,`system_name`,`is_required`,`display_order`,`min`,`max`,`validate_min`,`validate_max`,`slider_steps`,`is_int`,`image`,`extra_attribute_group_id`,`sub_type`,`scope`,`unit`,`selection_type`,`exposed_type`,`view_type`,`is_filterable`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.i
            public void bind(m mVar, ExtraAttributeEntity extraAttributeEntity) {
                mVar.d1(1, extraAttributeEntity.getId());
                if (extraAttributeEntity.getType() == null) {
                    mVar.u1(2);
                } else {
                    mVar.Q0(2, extraAttributeEntity.getType());
                }
                if (extraAttributeEntity.getNameAr() == null) {
                    mVar.u1(3);
                } else {
                    mVar.Q0(3, extraAttributeEntity.getNameAr());
                }
                if (extraAttributeEntity.getNameEn() == null) {
                    mVar.u1(4);
                } else {
                    mVar.Q0(4, extraAttributeEntity.getNameEn());
                }
                if (extraAttributeEntity.getSystemName() == null) {
                    mVar.u1(5);
                } else {
                    mVar.Q0(5, extraAttributeEntity.getSystemName());
                }
                if (extraAttributeEntity.isRequired() == null) {
                    mVar.u1(6);
                } else {
                    mVar.d1(6, extraAttributeEntity.isRequired().intValue());
                }
                if (extraAttributeEntity.getDisplayOrder() == null) {
                    mVar.u1(7);
                } else {
                    mVar.d1(7, extraAttributeEntity.getDisplayOrder().intValue());
                }
                mVar.d1(8, extraAttributeEntity.getMin());
                mVar.d1(9, extraAttributeEntity.getMax());
                mVar.d1(10, extraAttributeEntity.getValidateMin());
                mVar.d1(11, extraAttributeEntity.getValidateMax());
                if (extraAttributeEntity.getSliderSteps() == null) {
                    mVar.u1(12);
                } else {
                    mVar.d1(12, extraAttributeEntity.getSliderSteps().intValue());
                }
                mVar.d1(13, extraAttributeEntity.isInt());
                if (extraAttributeEntity.getImage() == null) {
                    mVar.u1(14);
                } else {
                    mVar.Q0(14, extraAttributeEntity.getImage());
                }
                if (extraAttributeEntity.getExtraAttributeGroupId() == null) {
                    mVar.u1(15);
                } else {
                    mVar.d1(15, extraAttributeEntity.getExtraAttributeGroupId().intValue());
                }
                if (extraAttributeEntity.getSubType() == null) {
                    mVar.u1(16);
                } else {
                    mVar.Q0(16, extraAttributeEntity.getSubType());
                }
                if (extraAttributeEntity.getScope() == null) {
                    mVar.u1(17);
                } else {
                    mVar.Q0(17, extraAttributeEntity.getScope());
                }
                String attrUnitConverter = ExtraAttributeDao_Impl.this.__attrUnitConverter.toString(extraAttributeEntity.getUnit());
                if (attrUnitConverter == null) {
                    mVar.u1(18);
                } else {
                    mVar.Q0(18, attrUnitConverter);
                }
                String selectionTypeConverter = ExtraAttributeDao_Impl.this.__selectionTypeConverter.toString(extraAttributeEntity.getSelectionType());
                if (selectionTypeConverter == null) {
                    mVar.u1(19);
                } else {
                    mVar.Q0(19, selectionTypeConverter);
                }
                String exposeTypeConverter = ExtraAttributeDao_Impl.this.__exposeTypeConverter.toString(extraAttributeEntity.getExposedType());
                if (exposeTypeConverter == null) {
                    mVar.u1(20);
                } else {
                    mVar.Q0(20, exposeTypeConverter);
                }
                String viewTypeConverter = ExtraAttributeDao_Impl.this.__viewTypeConverter.toString(extraAttributeEntity.getViewType());
                if (viewTypeConverter == null) {
                    mVar.u1(21);
                } else {
                    mVar.Q0(21, viewTypeConverter);
                }
                mVar.d1(22, extraAttributeEntity.get_isFilterable());
            }
        };
        this.__deletionAdapterOfExtraAttributeEntity = new h<ExtraAttributeEntity>(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.ExtraAttributeDao_Impl.2
            @Override // androidx.room.h, androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "DELETE FROM `extra_attributes` WHERE `id` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.h
            public void bind(m mVar, ExtraAttributeEntity extraAttributeEntity) {
                mVar.d1(1, extraAttributeEntity.getId());
            }
        };
        this.__updateAdapterOfExtraAttributeEntity = new h<ExtraAttributeEntity>(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.ExtraAttributeDao_Impl.3
            @Override // androidx.room.h, androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "UPDATE OR REPLACE `extra_attributes` SET `id` = ?,`type` = ?,`name_ar` = ?,`name_en` = ?,`system_name` = ?,`is_required` = ?,`display_order` = ?,`min` = ?,`max` = ?,`validate_min` = ?,`validate_max` = ?,`slider_steps` = ?,`is_int` = ?,`image` = ?,`extra_attribute_group_id` = ?,`sub_type` = ?,`scope` = ?,`unit` = ?,`selection_type` = ?,`exposed_type` = ?,`view_type` = ?,`is_filterable` = ? WHERE `id` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.h
            public void bind(m mVar, ExtraAttributeEntity extraAttributeEntity) {
                mVar.d1(1, extraAttributeEntity.getId());
                if (extraAttributeEntity.getType() == null) {
                    mVar.u1(2);
                } else {
                    mVar.Q0(2, extraAttributeEntity.getType());
                }
                if (extraAttributeEntity.getNameAr() == null) {
                    mVar.u1(3);
                } else {
                    mVar.Q0(3, extraAttributeEntity.getNameAr());
                }
                if (extraAttributeEntity.getNameEn() == null) {
                    mVar.u1(4);
                } else {
                    mVar.Q0(4, extraAttributeEntity.getNameEn());
                }
                if (extraAttributeEntity.getSystemName() == null) {
                    mVar.u1(5);
                } else {
                    mVar.Q0(5, extraAttributeEntity.getSystemName());
                }
                if (extraAttributeEntity.isRequired() == null) {
                    mVar.u1(6);
                } else {
                    mVar.d1(6, extraAttributeEntity.isRequired().intValue());
                }
                if (extraAttributeEntity.getDisplayOrder() == null) {
                    mVar.u1(7);
                } else {
                    mVar.d1(7, extraAttributeEntity.getDisplayOrder().intValue());
                }
                mVar.d1(8, extraAttributeEntity.getMin());
                mVar.d1(9, extraAttributeEntity.getMax());
                mVar.d1(10, extraAttributeEntity.getValidateMin());
                mVar.d1(11, extraAttributeEntity.getValidateMax());
                if (extraAttributeEntity.getSliderSteps() == null) {
                    mVar.u1(12);
                } else {
                    mVar.d1(12, extraAttributeEntity.getSliderSteps().intValue());
                }
                mVar.d1(13, extraAttributeEntity.isInt());
                if (extraAttributeEntity.getImage() == null) {
                    mVar.u1(14);
                } else {
                    mVar.Q0(14, extraAttributeEntity.getImage());
                }
                if (extraAttributeEntity.getExtraAttributeGroupId() == null) {
                    mVar.u1(15);
                } else {
                    mVar.d1(15, extraAttributeEntity.getExtraAttributeGroupId().intValue());
                }
                if (extraAttributeEntity.getSubType() == null) {
                    mVar.u1(16);
                } else {
                    mVar.Q0(16, extraAttributeEntity.getSubType());
                }
                if (extraAttributeEntity.getScope() == null) {
                    mVar.u1(17);
                } else {
                    mVar.Q0(17, extraAttributeEntity.getScope());
                }
                String attrUnitConverter = ExtraAttributeDao_Impl.this.__attrUnitConverter.toString(extraAttributeEntity.getUnit());
                if (attrUnitConverter == null) {
                    mVar.u1(18);
                } else {
                    mVar.Q0(18, attrUnitConverter);
                }
                String selectionTypeConverter = ExtraAttributeDao_Impl.this.__selectionTypeConverter.toString(extraAttributeEntity.getSelectionType());
                if (selectionTypeConverter == null) {
                    mVar.u1(19);
                } else {
                    mVar.Q0(19, selectionTypeConverter);
                }
                String exposeTypeConverter = ExtraAttributeDao_Impl.this.__exposeTypeConverter.toString(extraAttributeEntity.getExposedType());
                if (exposeTypeConverter == null) {
                    mVar.u1(20);
                } else {
                    mVar.Q0(20, exposeTypeConverter);
                }
                String viewTypeConverter = ExtraAttributeDao_Impl.this.__viewTypeConverter.toString(extraAttributeEntity.getViewType());
                if (viewTypeConverter == null) {
                    mVar.u1(21);
                } else {
                    mVar.Q0(21, viewTypeConverter);
                }
                mVar.d1(22, extraAttributeEntity.get_isFilterable());
                mVar.d1(23, extraAttributeEntity.getId());
            }
        };
        this.__preparedStmtOfDeleteAllExtraAttributes = new SharedSQLiteStatement(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.ExtraAttributeDao_Impl.4
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM extra_attributes";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.forsale.app.datalayer.repositories.ExtraAttributeDao
    public Object deleteAllExtraAttributes(final List<ExtraAttributeEntity> list, zz.a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.repositories.ExtraAttributeDao_Impl.8
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                ExtraAttributeDao_Impl.this.__db.beginTransaction();
                try {
                    ExtraAttributeDao_Impl.this.__db.setTransactionSuccessful();
                    return Integer.valueOf(ExtraAttributeDao_Impl.this.__deletionAdapterOfExtraAttributeEntity.handleMultiple(list) + 0);
                } finally {
                    ExtraAttributeDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.ExtraAttributeDao
    public Object deleteExtraAttribute(final ExtraAttributeEntity extraAttributeEntity, zz.a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.repositories.ExtraAttributeDao_Impl.7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                ExtraAttributeDao_Impl.this.__db.beginTransaction();
                try {
                    ExtraAttributeDao_Impl.this.__db.setTransactionSuccessful();
                    return Integer.valueOf(ExtraAttributeDao_Impl.this.__deletionAdapterOfExtraAttributeEntity.handle(extraAttributeEntity) + 0);
                } finally {
                    ExtraAttributeDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.ExtraAttributeDao
    public LiveData<List<ExtraAttributeEntity>> getAllExtraAttributes() {
        final v i11 = v.i("SELECT * FROM  extra_attributes", 0);
        return this.__db.getInvalidationTracker().e(new String[]{ExtraAttributeEntity.EXTRA_ATTRIBUTES_TABLE}, false, new Callable<List<ExtraAttributeEntity>>() { // from class: com.forsale.app.datalayer.repositories.ExtraAttributeDao_Impl.12
            protected void finalize() {
                i11.release();
            }

            @Override // java.util.concurrent.Callable
            public List<ExtraAttributeEntity> call() throws Exception {
                int i12;
                int i13;
                String string;
                int i14;
                String string2;
                String string3;
                String string4;
                Cursor c11 = j4.b.c(ExtraAttributeDao_Impl.this.__db, i11, false, null);
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
                        int i15 = e25;
                        ArrayList arrayList = new ArrayList(c11.getCount());
                        while (c11.moveToNext()) {
                            int i16 = c11.getInt(e11);
                            String string5 = c11.isNull(e12) ? null : c11.getString(e12);
                            String string6 = c11.isNull(e13) ? null : c11.getString(e13);
                            String string7 = c11.isNull(e14) ? null : c11.getString(e14);
                            String string8 = c11.isNull(e15) ? null : c11.getString(e15);
                            Integer valueOf = c11.isNull(e16) ? null : Integer.valueOf(c11.getInt(e16));
                            Integer valueOf2 = c11.isNull(e17) ? null : Integer.valueOf(c11.getInt(e17));
                            int i17 = c11.getInt(e18);
                            int i18 = c11.getInt(e19);
                            int i19 = c11.getInt(e21);
                            int i21 = c11.getInt(e22);
                            Integer valueOf3 = c11.isNull(e23) ? null : Integer.valueOf(c11.getInt(e23));
                            int i22 = c11.getInt(e24);
                            int i23 = i15;
                            String string9 = c11.isNull(i23) ? null : c11.getString(i23);
                            int i24 = e26;
                            int i25 = e11;
                            Integer valueOf4 = c11.isNull(i24) ? null : Integer.valueOf(c11.getInt(i24));
                            int i26 = e27;
                            String string10 = c11.isNull(i26) ? null : c11.getString(i26);
                            int i27 = e28;
                            String string11 = c11.isNull(i27) ? null : c11.getString(i27);
                            int i28 = e29;
                            if (c11.isNull(i28)) {
                                i12 = i28;
                                i14 = e12;
                                i13 = i23;
                                string = null;
                            } else {
                                i12 = i28;
                                i13 = i23;
                                string = c11.getString(i28);
                                i14 = e12;
                            }
                            try {
                                ExtraAttributeEntity.AttrUnit attrUnit = ExtraAttributeDao_Impl.this.__attrUnitConverter.toAttrUnit(string);
                                int i29 = e31;
                                if (c11.isNull(i29)) {
                                    e31 = i29;
                                    string2 = null;
                                } else {
                                    string2 = c11.getString(i29);
                                    e31 = i29;
                                }
                                ListingsResponse.UISettings.FiltrationSetting.SelectionType selectionType = ExtraAttributeDao_Impl.this.__selectionTypeConverter.toSelectionType(string2);
                                int i31 = e32;
                                if (c11.isNull(i31)) {
                                    e32 = i31;
                                    string3 = null;
                                } else {
                                    string3 = c11.getString(i31);
                                    e32 = i31;
                                }
                                ListingsResponse.UISettings.FiltrationSetting.ExposeType exposeType = ExtraAttributeDao_Impl.this.__exposeTypeConverter.toExposeType(string3);
                                int i32 = e33;
                                if (c11.isNull(i32)) {
                                    e33 = i32;
                                    string4 = null;
                                } else {
                                    string4 = c11.getString(i32);
                                    e33 = i32;
                                }
                                int i33 = e34;
                                arrayList.add(new ExtraAttributeEntity(i16, string5, string6, string7, string8, valueOf, valueOf2, i17, i18, i19, i21, valueOf3, i22, string9, valueOf4, string10, string11, attrUnit, selectionType, exposeType, ExtraAttributeDao_Impl.this.__viewTypeConverter.toViewType(string4), c11.getInt(i33)));
                                e34 = i33;
                                e11 = i25;
                                e26 = i24;
                                e27 = i26;
                                e28 = i27;
                                e12 = i14;
                                e29 = i12;
                                i15 = i13;
                            } catch (Throwable th2) {
                                th = th2;
                                c11.close();
                                throw th;
                            }
                        }
                        c11.close();
                        return arrayList;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        });
    }

    @Override // com.forsale.app.datalayer.repositories.ExtraAttributeDao
    public Object getAllExtraAttributesSuspend(zz.a<? super List<ExtraAttributeEntity>> aVar) {
        final v i11 = v.i("SELECT * FROM  extra_attributes", 0);
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<List<ExtraAttributeEntity>>() { // from class: com.forsale.app.datalayer.repositories.ExtraAttributeDao_Impl.13
            @Override // java.util.concurrent.Callable
            public List<ExtraAttributeEntity> call() throws Exception {
                AnonymousClass13 anonymousClass13;
                int i12;
                int i13;
                String string;
                int i14;
                String string2;
                String string3;
                String string4;
                Cursor c11 = j4.b.c(ExtraAttributeDao_Impl.this.__db, i11, false, null);
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
                        int i15 = e25;
                        ArrayList arrayList = new ArrayList(c11.getCount());
                        while (c11.moveToNext()) {
                            int i16 = c11.getInt(e11);
                            String string5 = c11.isNull(e12) ? null : c11.getString(e12);
                            String string6 = c11.isNull(e13) ? null : c11.getString(e13);
                            String string7 = c11.isNull(e14) ? null : c11.getString(e14);
                            String string8 = c11.isNull(e15) ? null : c11.getString(e15);
                            Integer valueOf = c11.isNull(e16) ? null : Integer.valueOf(c11.getInt(e16));
                            Integer valueOf2 = c11.isNull(e17) ? null : Integer.valueOf(c11.getInt(e17));
                            int i17 = c11.getInt(e18);
                            int i18 = c11.getInt(e19);
                            int i19 = c11.getInt(e21);
                            int i21 = c11.getInt(e22);
                            Integer valueOf3 = c11.isNull(e23) ? null : Integer.valueOf(c11.getInt(e23));
                            int i22 = c11.getInt(e24);
                            int i23 = i15;
                            String string9 = c11.isNull(i23) ? null : c11.getString(i23);
                            int i24 = e26;
                            int i25 = e11;
                            Integer valueOf4 = c11.isNull(i24) ? null : Integer.valueOf(c11.getInt(i24));
                            int i26 = e27;
                            String string10 = c11.isNull(i26) ? null : c11.getString(i26);
                            int i27 = e28;
                            String string11 = c11.isNull(i27) ? null : c11.getString(i27);
                            int i28 = e29;
                            if (c11.isNull(i28)) {
                                i12 = i28;
                                i14 = e12;
                                i13 = i23;
                                string = null;
                            } else {
                                i12 = i28;
                                i13 = i23;
                                string = c11.getString(i28);
                                i14 = e12;
                            }
                            anonymousClass13 = this;
                            try {
                                ExtraAttributeEntity.AttrUnit attrUnit = ExtraAttributeDao_Impl.this.__attrUnitConverter.toAttrUnit(string);
                                int i29 = e31;
                                if (c11.isNull(i29)) {
                                    e31 = i29;
                                    string2 = null;
                                } else {
                                    string2 = c11.getString(i29);
                                    e31 = i29;
                                }
                                ListingsResponse.UISettings.FiltrationSetting.SelectionType selectionType = ExtraAttributeDao_Impl.this.__selectionTypeConverter.toSelectionType(string2);
                                int i31 = e32;
                                if (c11.isNull(i31)) {
                                    e32 = i31;
                                    string3 = null;
                                } else {
                                    string3 = c11.getString(i31);
                                    e32 = i31;
                                }
                                ListingsResponse.UISettings.FiltrationSetting.ExposeType exposeType = ExtraAttributeDao_Impl.this.__exposeTypeConverter.toExposeType(string3);
                                int i32 = e33;
                                if (c11.isNull(i32)) {
                                    e33 = i32;
                                    string4 = null;
                                } else {
                                    string4 = c11.getString(i32);
                                    e33 = i32;
                                }
                                int i33 = e34;
                                arrayList.add(new ExtraAttributeEntity(i16, string5, string6, string7, string8, valueOf, valueOf2, i17, i18, i19, i21, valueOf3, i22, string9, valueOf4, string10, string11, attrUnit, selectionType, exposeType, ExtraAttributeDao_Impl.this.__viewTypeConverter.toViewType(string4), c11.getInt(i33)));
                                e34 = i33;
                                e11 = i25;
                                e26 = i24;
                                e27 = i26;
                                e28 = i27;
                                e12 = i14;
                                e29 = i12;
                                i15 = i13;
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
                        anonymousClass13 = this;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    anonymousClass13 = this;
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.ExtraAttributeDao
    public LiveData<ExtraAttributeEntity> getExtraAttributeById(int i11) {
        final v i12 = v.i("SELECT * FROM  extra_attributes WHERE id == ?", 1);
        i12.d1(1, i11);
        return this.__db.getInvalidationTracker().e(new String[]{ExtraAttributeEntity.EXTRA_ATTRIBUTES_TABLE}, false, new Callable<ExtraAttributeEntity>() { // from class: com.forsale.app.datalayer.repositories.ExtraAttributeDao_Impl.11
            protected void finalize() {
                i12.release();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public ExtraAttributeEntity call() throws Exception {
                ExtraAttributeEntity extraAttributeEntity;
                String string;
                int i13;
                Integer valueOf;
                int i14;
                String string2;
                int i15;
                String string3;
                int i16;
                Cursor c11 = j4.b.c(ExtraAttributeDao_Impl.this.__db, i12, false, null);
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
                            try {
                                extraAttributeEntity = new ExtraAttributeEntity(i17, string4, string5, string6, string7, valueOf2, valueOf3, i18, i19, i21, i22, valueOf4, i23, string, valueOf, string2, string3, ExtraAttributeDao_Impl.this.__attrUnitConverter.toAttrUnit(c11.isNull(i16) ? null : c11.getString(i16)), ExtraAttributeDao_Impl.this.__selectionTypeConverter.toSelectionType(c11.isNull(e31) ? null : c11.getString(e31)), ExtraAttributeDao_Impl.this.__exposeTypeConverter.toExposeType(c11.isNull(e32) ? null : c11.getString(e32)), ExtraAttributeDao_Impl.this.__viewTypeConverter.toViewType(c11.isNull(e33) ? null : c11.getString(e33)), c11.getInt(e34));
                            } catch (Throwable th2) {
                                th = th2;
                                c11.close();
                                throw th;
                            }
                        } else {
                            extraAttributeEntity = null;
                        }
                        c11.close();
                        return extraAttributeEntity;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        });
    }

    @Override // com.forsale.app.datalayer.repositories.ExtraAttributeDao
    public Object getExtraAttributeByIds(List<Integer> list, zz.a<? super List<ExtraAttributeEntity>> aVar) {
        StringBuilder b11 = e.b();
        b11.append("SELECT * FROM  extra_attributes WHERE id in (");
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
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<List<ExtraAttributeEntity>>() { // from class: com.forsale.app.datalayer.repositories.ExtraAttributeDao_Impl.14
            @Override // java.util.concurrent.Callable
            public List<ExtraAttributeEntity> call() throws Exception {
                AnonymousClass14 anonymousClass14;
                int i13;
                int i14;
                String string;
                int i15;
                String string2;
                String string3;
                String string4;
                Cursor c11 = j4.b.c(ExtraAttributeDao_Impl.this.__db, i11, false, null);
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
                            anonymousClass14 = this;
                            try {
                                ExtraAttributeEntity.AttrUnit attrUnit = ExtraAttributeDao_Impl.this.__attrUnitConverter.toAttrUnit(string);
                                int i31 = e31;
                                if (c11.isNull(i31)) {
                                    e31 = i31;
                                    string2 = null;
                                } else {
                                    string2 = c11.getString(i31);
                                    e31 = i31;
                                }
                                ListingsResponse.UISettings.FiltrationSetting.SelectionType selectionType = ExtraAttributeDao_Impl.this.__selectionTypeConverter.toSelectionType(string2);
                                int i32 = e32;
                                if (c11.isNull(i32)) {
                                    e32 = i32;
                                    string3 = null;
                                } else {
                                    string3 = c11.getString(i32);
                                    e32 = i32;
                                }
                                ListingsResponse.UISettings.FiltrationSetting.ExposeType exposeType = ExtraAttributeDao_Impl.this.__exposeTypeConverter.toExposeType(string3);
                                int i33 = e33;
                                if (c11.isNull(i33)) {
                                    e33 = i33;
                                    string4 = null;
                                } else {
                                    string4 = c11.getString(i33);
                                    e33 = i33;
                                }
                                int i34 = e34;
                                arrayList.add(new ExtraAttributeEntity(i17, string5, string6, string7, string8, valueOf, valueOf2, i18, i19, i21, i22, valueOf3, i23, string9, valueOf4, string10, string11, attrUnit, selectionType, exposeType, ExtraAttributeDao_Impl.this.__viewTypeConverter.toViewType(string4), c11.getInt(i34)));
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
                        anonymousClass14 = this;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    anonymousClass14 = this;
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.ExtraAttributeDao
    public Object insertAllExtraAttributes(final List<ExtraAttributeEntity> list, zz.a<? super List<Long>> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<List<Long>>() { // from class: com.forsale.app.datalayer.repositories.ExtraAttributeDao_Impl.6
            @Override // java.util.concurrent.Callable
            public List<Long> call() throws Exception {
                ExtraAttributeDao_Impl.this.__db.beginTransaction();
                try {
                    List<Long> insertAndReturnIdsList = ExtraAttributeDao_Impl.this.__insertionAdapterOfExtraAttributeEntity.insertAndReturnIdsList(list);
                    ExtraAttributeDao_Impl.this.__db.setTransactionSuccessful();
                    return insertAndReturnIdsList;
                } finally {
                    ExtraAttributeDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.ExtraAttributeDao
    public Object insertExtraAttribute(final ExtraAttributeEntity extraAttributeEntity, zz.a<? super Long> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Long>() { // from class: com.forsale.app.datalayer.repositories.ExtraAttributeDao_Impl.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() throws Exception {
                ExtraAttributeDao_Impl.this.__db.beginTransaction();
                try {
                    Long valueOf = Long.valueOf(ExtraAttributeDao_Impl.this.__insertionAdapterOfExtraAttributeEntity.insertAndReturnId(extraAttributeEntity));
                    ExtraAttributeDao_Impl.this.__db.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    ExtraAttributeDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.ExtraAttributeDao
    public Object updateExtraAttribute(final ExtraAttributeEntity extraAttributeEntity, zz.a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.repositories.ExtraAttributeDao_Impl.9
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                ExtraAttributeDao_Impl.this.__db.beginTransaction();
                try {
                    ExtraAttributeDao_Impl.this.__db.setTransactionSuccessful();
                    return Integer.valueOf(ExtraAttributeDao_Impl.this.__updateAdapterOfExtraAttributeEntity.handle(extraAttributeEntity) + 0);
                } finally {
                    ExtraAttributeDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.ExtraAttributeDao
    public Object deleteAllExtraAttributes(zz.a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.repositories.ExtraAttributeDao_Impl.10
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                m acquire = ExtraAttributeDao_Impl.this.__preparedStmtOfDeleteAllExtraAttributes.acquire();
                try {
                    ExtraAttributeDao_Impl.this.__db.beginTransaction();
                    Integer valueOf = Integer.valueOf(acquire.O());
                    ExtraAttributeDao_Impl.this.__db.setTransactionSuccessful();
                    ExtraAttributeDao_Impl.this.__db.endTransaction();
                    return valueOf;
                } finally {
                    ExtraAttributeDao_Impl.this.__preparedStmtOfDeleteAllExtraAttributes.release(acquire);
                }
            }
        }, aVar);
    }
}
