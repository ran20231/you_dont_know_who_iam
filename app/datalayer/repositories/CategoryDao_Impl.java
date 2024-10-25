package com.forsale.app.datalayer.repositories;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.room.h;
import androidx.room.i;
import androidx.room.v;
import com.forsale.app.datalayer.database.CategoryAndParentCategoryNamesView;
import com.forsale.app.datalayer.database.CategoryBrief;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.database.CategoryTreeBrief;
import com.forsale.app.datalayer.database.CategoryView;
import com.forsale.app.datalayer.database.CousinCategory;
import j4.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;
import l4.l;
import l4.m;
/* loaded from: classes2.dex */
public final class CategoryDao_Impl implements CategoryDao {
    private final CategoryEntity.CategoryType.CategoryTypeConverter __categoryTypeConverter = new CategoryEntity.CategoryType.CategoryTypeConverter();
    private final CategoryEntity.Classification.ClassificationTypeConverter __classificationTypeConverter = new CategoryEntity.Classification.ClassificationTypeConverter();
    private final RoomDatabase __db;
    private final h<CategoryEntity> __deletionAdapterOfCategoryEntity;
    private final i<CategoryEntity> __insertionAdapterOfCategoryEntity;
    private final SharedSQLiteStatement __preparedStmtOfDeleteAllCategories;
    private final h<CategoryEntity> __updateAdapterOfCategoryEntity;

    public CategoryDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfCategoryEntity = new i<CategoryEntity>(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.CategoryDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `categories` (`id`,`region_id`,`system_name`,`name_en`,`name_ar`,`image`,`parent_id`,`display_order`,`allow_uploading`,`is_filterable`,`steps`,`promote_animation`,`is_alternate_view`,`allow_search`,`attribute_values`,`is_expendable`,`allow_district_filtering`,`has_plans`,`filterable_label_en`,`filterable_label_ar`,`ruleset`,`classification`,`allow_power_pin_view`,`allow_power_pin_add`,`full_path`,`category_type`,`filtering_classification_ar`,`filtering_classification_en`,`is_indexed`,`vertical_image`,`max_home_top_banners`,`relatives`,`featured_image`,`is_alt_cat`,`filtration_settings`,`sections`,`slug`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.i
            public void bind(m mVar, CategoryEntity categoryEntity) {
                mVar.d1(1, categoryEntity.getId());
                mVar.d1(2, categoryEntity.getRegionId());
                if (categoryEntity.getSystemName() == null) {
                    mVar.u1(3);
                } else {
                    mVar.Q0(3, categoryEntity.getSystemName());
                }
                if (categoryEntity.getNameEn() == null) {
                    mVar.u1(4);
                } else {
                    mVar.Q0(4, categoryEntity.getNameEn());
                }
                if (categoryEntity.getNameAr() == null) {
                    mVar.u1(5);
                } else {
                    mVar.Q0(5, categoryEntity.getNameAr());
                }
                if (categoryEntity.getImage() == null) {
                    mVar.u1(6);
                } else {
                    mVar.Q0(6, categoryEntity.getImage());
                }
                mVar.d1(7, categoryEntity.getParentId());
                mVar.d1(8, categoryEntity.getDisplayOrder());
                mVar.d1(9, categoryEntity.getAllowUploading());
                mVar.d1(10, categoryEntity.isFilterable());
                mVar.d1(11, categoryEntity.getSteps());
                if (categoryEntity.getPromoteAnimation() == null) {
                    mVar.u1(12);
                } else {
                    mVar.Q0(12, categoryEntity.getPromoteAnimation());
                }
                if (categoryEntity.isAlternateView() == null) {
                    mVar.u1(13);
                } else {
                    mVar.d1(13, categoryEntity.isAlternateView().intValue());
                }
                if (categoryEntity.getAllowSearch() == null) {
                    mVar.u1(14);
                } else {
                    mVar.d1(14, categoryEntity.getAllowSearch().intValue());
                }
                if (categoryEntity.getAttributeValuesString() == null) {
                    mVar.u1(15);
                } else {
                    mVar.Q0(15, categoryEntity.getAttributeValuesString());
                }
                if (categoryEntity.isExpendable() == null) {
                    mVar.u1(16);
                } else {
                    mVar.d1(16, categoryEntity.isExpendable().intValue());
                }
                mVar.d1(17, categoryEntity.getAllowDistrictFiltering());
                mVar.d1(18, categoryEntity.getHas_plans());
                if (categoryEntity.getFilterableLabelEn() == null) {
                    mVar.u1(19);
                } else {
                    mVar.Q0(19, categoryEntity.getFilterableLabelEn());
                }
                if (categoryEntity.getFilterableLabelAr() == null) {
                    mVar.u1(20);
                } else {
                    mVar.Q0(20, categoryEntity.getFilterableLabelAr());
                }
                if (categoryEntity.getRuleSetString() == null) {
                    mVar.u1(21);
                } else {
                    mVar.Q0(21, categoryEntity.getRuleSetString());
                }
                if (categoryEntity.getClassificationString() == null) {
                    mVar.u1(22);
                } else {
                    mVar.Q0(22, categoryEntity.getClassificationString());
                }
                mVar.d1(23, categoryEntity.getAllowPowerPinView());
                mVar.d1(24, categoryEntity.getAllowPowerPinAdd());
                if (categoryEntity.getFullPath() == null) {
                    mVar.u1(25);
                } else {
                    mVar.Q0(25, categoryEntity.getFullPath());
                }
                String categoryTypeConverter = CategoryDao_Impl.this.__categoryTypeConverter.toString(categoryEntity.getCategoryType());
                if (categoryTypeConverter == null) {
                    mVar.u1(26);
                } else {
                    mVar.Q0(26, categoryTypeConverter);
                }
                if (categoryEntity.getFilteringClassificationAr() == null) {
                    mVar.u1(27);
                } else {
                    mVar.Q0(27, categoryEntity.getFilteringClassificationAr());
                }
                if (categoryEntity.getFilteringClassificationEn() == null) {
                    mVar.u1(28);
                } else {
                    mVar.Q0(28, categoryEntity.getFilteringClassificationEn());
                }
                if (categoryEntity.isIndexed() == null) {
                    mVar.u1(29);
                } else {
                    mVar.d1(29, categoryEntity.isIndexed().intValue());
                }
                if (categoryEntity.getVerticalImage() == null) {
                    mVar.u1(30);
                } else {
                    mVar.Q0(30, categoryEntity.getVerticalImage());
                }
                mVar.d1(31, categoryEntity.getMaxHomeTopBannersCount());
                if (categoryEntity.getRelatives() == null) {
                    mVar.u1(32);
                } else {
                    mVar.Q0(32, categoryEntity.getRelatives());
                }
                if (categoryEntity.getFeaturedImage() == null) {
                    mVar.u1(33);
                } else {
                    mVar.Q0(33, categoryEntity.getFeaturedImage());
                }
                mVar.d1(34, categoryEntity.isAltCat());
                if (categoryEntity.getFiltrationSettingsString() == null) {
                    mVar.u1(35);
                } else {
                    mVar.Q0(35, categoryEntity.getFiltrationSettingsString());
                }
                if (categoryEntity.get_sections() == null) {
                    mVar.u1(36);
                } else {
                    mVar.Q0(36, categoryEntity.get_sections());
                }
                if (categoryEntity.getSlug() == null) {
                    mVar.u1(37);
                } else {
                    mVar.Q0(37, categoryEntity.getSlug());
                }
            }
        };
        this.__deletionAdapterOfCategoryEntity = new h<CategoryEntity>(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.CategoryDao_Impl.2
            @Override // androidx.room.h, androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "DELETE FROM `categories` WHERE `id` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.h
            public void bind(m mVar, CategoryEntity categoryEntity) {
                mVar.d1(1, categoryEntity.getId());
            }
        };
        this.__updateAdapterOfCategoryEntity = new h<CategoryEntity>(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.CategoryDao_Impl.3
            @Override // androidx.room.h, androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "UPDATE OR REPLACE `categories` SET `id` = ?,`region_id` = ?,`system_name` = ?,`name_en` = ?,`name_ar` = ?,`image` = ?,`parent_id` = ?,`display_order` = ?,`allow_uploading` = ?,`is_filterable` = ?,`steps` = ?,`promote_animation` = ?,`is_alternate_view` = ?,`allow_search` = ?,`attribute_values` = ?,`is_expendable` = ?,`allow_district_filtering` = ?,`has_plans` = ?,`filterable_label_en` = ?,`filterable_label_ar` = ?,`ruleset` = ?,`classification` = ?,`allow_power_pin_view` = ?,`allow_power_pin_add` = ?,`full_path` = ?,`category_type` = ?,`filtering_classification_ar` = ?,`filtering_classification_en` = ?,`is_indexed` = ?,`vertical_image` = ?,`max_home_top_banners` = ?,`relatives` = ?,`featured_image` = ?,`is_alt_cat` = ?,`filtration_settings` = ?,`sections` = ?,`slug` = ? WHERE `id` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.h
            public void bind(m mVar, CategoryEntity categoryEntity) {
                mVar.d1(1, categoryEntity.getId());
                mVar.d1(2, categoryEntity.getRegionId());
                if (categoryEntity.getSystemName() == null) {
                    mVar.u1(3);
                } else {
                    mVar.Q0(3, categoryEntity.getSystemName());
                }
                if (categoryEntity.getNameEn() == null) {
                    mVar.u1(4);
                } else {
                    mVar.Q0(4, categoryEntity.getNameEn());
                }
                if (categoryEntity.getNameAr() == null) {
                    mVar.u1(5);
                } else {
                    mVar.Q0(5, categoryEntity.getNameAr());
                }
                if (categoryEntity.getImage() == null) {
                    mVar.u1(6);
                } else {
                    mVar.Q0(6, categoryEntity.getImage());
                }
                mVar.d1(7, categoryEntity.getParentId());
                mVar.d1(8, categoryEntity.getDisplayOrder());
                mVar.d1(9, categoryEntity.getAllowUploading());
                mVar.d1(10, categoryEntity.isFilterable());
                mVar.d1(11, categoryEntity.getSteps());
                if (categoryEntity.getPromoteAnimation() == null) {
                    mVar.u1(12);
                } else {
                    mVar.Q0(12, categoryEntity.getPromoteAnimation());
                }
                if (categoryEntity.isAlternateView() == null) {
                    mVar.u1(13);
                } else {
                    mVar.d1(13, categoryEntity.isAlternateView().intValue());
                }
                if (categoryEntity.getAllowSearch() == null) {
                    mVar.u1(14);
                } else {
                    mVar.d1(14, categoryEntity.getAllowSearch().intValue());
                }
                if (categoryEntity.getAttributeValuesString() == null) {
                    mVar.u1(15);
                } else {
                    mVar.Q0(15, categoryEntity.getAttributeValuesString());
                }
                if (categoryEntity.isExpendable() == null) {
                    mVar.u1(16);
                } else {
                    mVar.d1(16, categoryEntity.isExpendable().intValue());
                }
                mVar.d1(17, categoryEntity.getAllowDistrictFiltering());
                mVar.d1(18, categoryEntity.getHas_plans());
                if (categoryEntity.getFilterableLabelEn() == null) {
                    mVar.u1(19);
                } else {
                    mVar.Q0(19, categoryEntity.getFilterableLabelEn());
                }
                if (categoryEntity.getFilterableLabelAr() == null) {
                    mVar.u1(20);
                } else {
                    mVar.Q0(20, categoryEntity.getFilterableLabelAr());
                }
                if (categoryEntity.getRuleSetString() == null) {
                    mVar.u1(21);
                } else {
                    mVar.Q0(21, categoryEntity.getRuleSetString());
                }
                if (categoryEntity.getClassificationString() == null) {
                    mVar.u1(22);
                } else {
                    mVar.Q0(22, categoryEntity.getClassificationString());
                }
                mVar.d1(23, categoryEntity.getAllowPowerPinView());
                mVar.d1(24, categoryEntity.getAllowPowerPinAdd());
                if (categoryEntity.getFullPath() == null) {
                    mVar.u1(25);
                } else {
                    mVar.Q0(25, categoryEntity.getFullPath());
                }
                String categoryTypeConverter = CategoryDao_Impl.this.__categoryTypeConverter.toString(categoryEntity.getCategoryType());
                if (categoryTypeConverter == null) {
                    mVar.u1(26);
                } else {
                    mVar.Q0(26, categoryTypeConverter);
                }
                if (categoryEntity.getFilteringClassificationAr() == null) {
                    mVar.u1(27);
                } else {
                    mVar.Q0(27, categoryEntity.getFilteringClassificationAr());
                }
                if (categoryEntity.getFilteringClassificationEn() == null) {
                    mVar.u1(28);
                } else {
                    mVar.Q0(28, categoryEntity.getFilteringClassificationEn());
                }
                if (categoryEntity.isIndexed() == null) {
                    mVar.u1(29);
                } else {
                    mVar.d1(29, categoryEntity.isIndexed().intValue());
                }
                if (categoryEntity.getVerticalImage() == null) {
                    mVar.u1(30);
                } else {
                    mVar.Q0(30, categoryEntity.getVerticalImage());
                }
                mVar.d1(31, categoryEntity.getMaxHomeTopBannersCount());
                if (categoryEntity.getRelatives() == null) {
                    mVar.u1(32);
                } else {
                    mVar.Q0(32, categoryEntity.getRelatives());
                }
                if (categoryEntity.getFeaturedImage() == null) {
                    mVar.u1(33);
                } else {
                    mVar.Q0(33, categoryEntity.getFeaturedImage());
                }
                mVar.d1(34, categoryEntity.isAltCat());
                if (categoryEntity.getFiltrationSettingsString() == null) {
                    mVar.u1(35);
                } else {
                    mVar.Q0(35, categoryEntity.getFiltrationSettingsString());
                }
                if (categoryEntity.get_sections() == null) {
                    mVar.u1(36);
                } else {
                    mVar.Q0(36, categoryEntity.get_sections());
                }
                if (categoryEntity.getSlug() == null) {
                    mVar.u1(37);
                } else {
                    mVar.Q0(37, categoryEntity.getSlug());
                }
                mVar.d1(38, categoryEntity.getId());
            }
        };
        this.__preparedStmtOfDeleteAllCategories = new SharedSQLiteStatement(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.CategoryDao_Impl.4
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM categories";
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CategoryBrief __entityCursorConverter_comForsaleAppDatalayerDatabaseCategoryBrief(Cursor cursor) {
        int i11;
        int d11 = j4.a.d(cursor, "id");
        int d12 = j4.a.d(cursor, "name_en");
        if (d11 == -1) {
            i11 = 0;
        } else {
            i11 = cursor.getInt(d11);
        }
        String str = null;
        if (d12 != -1 && !cursor.isNull(d12)) {
            str = cursor.getString(d12);
        }
        return new CategoryBrief(i11, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CategoryEntity __entityCursorConverter_comForsaleAppDatalayerDatabaseCategoryEntity(Cursor cursor) {
        int i11;
        int i12;
        String string;
        String string2;
        String string3;
        String string4;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        String string5;
        Integer valueOf;
        Integer valueOf2;
        String string6;
        Integer valueOf3;
        int i18;
        int i19;
        int i21;
        int i22;
        String string7;
        String string8;
        String string9;
        String string10;
        int i23;
        int i24;
        int i25;
        int i26;
        String string11;
        String string12;
        CategoryDao_Impl categoryDao_Impl;
        CategoryEntity.CategoryType categoryType;
        String string13;
        String string14;
        Integer valueOf4;
        String string15;
        int i27;
        int i28;
        String string16;
        String string17;
        String string18;
        String string19;
        String string20;
        int d11 = j4.a.d(cursor, "id");
        int d12 = j4.a.d(cursor, "region_id");
        int d13 = j4.a.d(cursor, "system_name");
        int d14 = j4.a.d(cursor, "name_en");
        int d15 = j4.a.d(cursor, "name_ar");
        int d16 = j4.a.d(cursor, "image");
        int d17 = j4.a.d(cursor, "parent_id");
        int d18 = j4.a.d(cursor, "display_order");
        int d19 = j4.a.d(cursor, CategoryEntity.ALLOW_UPLOADING);
        int d21 = j4.a.d(cursor, CategoryEntity.IS_FILTERABLE);
        int d22 = j4.a.d(cursor, CategoryEntity.STEPS);
        int d23 = j4.a.d(cursor, "promote_animation");
        int d24 = j4.a.d(cursor, CategoryEntity.IS_ALTERNATE_VIEW);
        int d25 = j4.a.d(cursor, CategoryEntity.ALLOW_SEARCH);
        int d26 = j4.a.d(cursor, CategoryEntity.ATTRIBUTE_VALUES);
        int d27 = j4.a.d(cursor, CategoryEntity.IS_EXPENDABLE);
        int d28 = j4.a.d(cursor, CategoryEntity.ALLOW_DISTRICT_FILTERING);
        int d29 = j4.a.d(cursor, CategoryEntity.HAS_PLANS);
        int d31 = j4.a.d(cursor, CategoryEntity.FILTERABLE_LABEL_EN);
        int d32 = j4.a.d(cursor, CategoryEntity.FILTERABLE_LABEL_AR);
        int d33 = j4.a.d(cursor, CategoryEntity.RULE_SET);
        int d34 = j4.a.d(cursor, CategoryEntity.CLASSIFICATION);
        int d35 = j4.a.d(cursor, CategoryEntity.ALLOW_POWER_PIN_VIEW);
        int d36 = j4.a.d(cursor, CategoryEntity.ALLOW_POWER_PIN_ADD);
        int d37 = j4.a.d(cursor, CategoryEntity.FULL_PATH);
        int d38 = j4.a.d(cursor, "category_type");
        int d39 = j4.a.d(cursor, "filtering_classification_ar");
        int d41 = j4.a.d(cursor, "filtering_classification_en");
        int d42 = j4.a.d(cursor, "is_indexed");
        int d43 = j4.a.d(cursor, CategoryEntity.VERTICAL_IMAGE);
        int d44 = j4.a.d(cursor, "max_home_top_banners");
        int d45 = j4.a.d(cursor, "relatives");
        int d46 = j4.a.d(cursor, CategoryEntity.FEATURED_IMAGE);
        int d47 = j4.a.d(cursor, "is_alt_cat");
        int d48 = j4.a.d(cursor, CategoryEntity.FILTRATION_SETTINGS);
        int d49 = j4.a.d(cursor, CategoryEntity.SECTIONS);
        int d50 = j4.a.d(cursor, CategoryEntity.SLUG);
        int i29 = 0;
        if (d11 == -1) {
            i11 = 0;
        } else {
            i11 = cursor.getInt(d11);
        }
        if (d12 == -1) {
            i12 = 0;
        } else {
            i12 = cursor.getInt(d12);
        }
        if (d13 == -1 || cursor.isNull(d13)) {
            string = null;
        } else {
            string = cursor.getString(d13);
        }
        if (d14 == -1 || cursor.isNull(d14)) {
            string2 = null;
        } else {
            string2 = cursor.getString(d14);
        }
        if (d15 == -1 || cursor.isNull(d15)) {
            string3 = null;
        } else {
            string3 = cursor.getString(d15);
        }
        if (d16 == -1 || cursor.isNull(d16)) {
            string4 = null;
        } else {
            string4 = cursor.getString(d16);
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
            string5 = null;
        } else {
            string5 = cursor.getString(d23);
        }
        if (d24 == -1 || cursor.isNull(d24)) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(cursor.getInt(d24));
        }
        if (d25 == -1 || cursor.isNull(d25)) {
            valueOf2 = null;
        } else {
            valueOf2 = Integer.valueOf(cursor.getInt(d25));
        }
        if (d26 == -1 || cursor.isNull(d26)) {
            string6 = null;
        } else {
            string6 = cursor.getString(d26);
        }
        if (d27 == -1 || cursor.isNull(d27)) {
            valueOf3 = null;
        } else {
            valueOf3 = Integer.valueOf(cursor.getInt(d27));
        }
        if (d28 == -1) {
            i19 = d29;
            i18 = 0;
        } else {
            i18 = cursor.getInt(d28);
            i19 = d29;
        }
        if (i19 == -1) {
            i22 = d31;
            i21 = 0;
        } else {
            i21 = cursor.getInt(i19);
            i22 = d31;
        }
        if (i22 == -1 || cursor.isNull(i22)) {
            string7 = null;
        } else {
            string7 = cursor.getString(i22);
        }
        if (d32 == -1 || cursor.isNull(d32)) {
            string8 = null;
        } else {
            string8 = cursor.getString(d32);
        }
        if (d33 == -1 || cursor.isNull(d33)) {
            string9 = null;
        } else {
            string9 = cursor.getString(d33);
        }
        if (d34 == -1 || cursor.isNull(d34)) {
            string10 = null;
        } else {
            string10 = cursor.getString(d34);
        }
        if (d35 == -1) {
            i24 = d36;
            i23 = 0;
        } else {
            i23 = cursor.getInt(d35);
            i24 = d36;
        }
        if (i24 == -1) {
            i26 = d37;
            i25 = 0;
        } else {
            i25 = cursor.getInt(i24);
            i26 = d37;
        }
        if (i26 == -1 || cursor.isNull(i26)) {
            string11 = null;
        } else {
            string11 = cursor.getString(i26);
        }
        if (d38 == -1) {
            categoryType = null;
        } else {
            if (cursor.isNull(d38)) {
                categoryDao_Impl = this;
                string12 = null;
            } else {
                string12 = cursor.getString(d38);
                categoryDao_Impl = this;
            }
            categoryType = categoryDao_Impl.__categoryTypeConverter.toCategoryType(string12);
        }
        if (d39 == -1 || cursor.isNull(d39)) {
            string13 = null;
        } else {
            string13 = cursor.getString(d39);
        }
        if (d41 == -1 || cursor.isNull(d41)) {
            string14 = null;
        } else {
            string14 = cursor.getString(d41);
        }
        if (d42 == -1 || cursor.isNull(d42)) {
            valueOf4 = null;
        } else {
            valueOf4 = Integer.valueOf(cursor.getInt(d42));
        }
        if (d43 == -1 || cursor.isNull(d43)) {
            string15 = null;
        } else {
            string15 = cursor.getString(d43);
        }
        if (d44 == -1) {
            i28 = d45;
            i27 = 0;
        } else {
            i27 = cursor.getInt(d44);
            i28 = d45;
        }
        if (i28 == -1 || cursor.isNull(i28)) {
            string16 = null;
        } else {
            string16 = cursor.getString(i28);
        }
        if (d46 == -1 || cursor.isNull(d46)) {
            string17 = null;
        } else {
            string17 = cursor.getString(d46);
        }
        if (d47 != -1) {
            i29 = cursor.getInt(d47);
        }
        int i31 = i29;
        if (d48 == -1 || cursor.isNull(d48)) {
            string18 = null;
        } else {
            string18 = cursor.getString(d48);
        }
        if (d49 == -1 || cursor.isNull(d49)) {
            string19 = null;
        } else {
            string19 = cursor.getString(d49);
        }
        if (d50 == -1 || cursor.isNull(d50)) {
            string20 = null;
        } else {
            string20 = cursor.getString(d50);
        }
        return new CategoryEntity(i11, i12, string, string2, string3, string4, i13, i14, i15, i16, i17, string5, valueOf, valueOf2, string6, valueOf3, i18, i21, string7, string8, string9, string10, i23, i25, string11, categoryType, string13, string14, valueOf4, string15, i27, string16, string17, i31, string18, string19, string20);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CategoryTreeBrief __entityCursorConverter_comForsaleAppDatalayerDatabaseCategoryTreeBrief(Cursor cursor) {
        String string;
        String string2;
        String string3;
        int d11 = j4.a.d(cursor, "category_ids");
        int d12 = j4.a.d(cursor, "category_names_en");
        int d13 = j4.a.d(cursor, "category_names_ar");
        int d14 = j4.a.d(cursor, "category_types");
        String str = null;
        if (d11 == -1 || cursor.isNull(d11)) {
            string = null;
        } else {
            string = cursor.getString(d11);
        }
        if (d12 == -1 || cursor.isNull(d12)) {
            string2 = null;
        } else {
            string2 = cursor.getString(d12);
        }
        if (d13 == -1 || cursor.isNull(d13)) {
            string3 = null;
        } else {
            string3 = cursor.getString(d13);
        }
        if (d14 != -1 && !cursor.isNull(d14)) {
            str = cursor.getString(d14);
        }
        return new CategoryTreeBrief(string, string2, string3, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CousinCategory __entityCursorConverter_comForsaleAppDatalayerDatabaseCousinCategory(Cursor cursor) {
        int i11;
        String string;
        String string2;
        int i12;
        int d11 = j4.a.d(cursor, "id");
        int d12 = j4.a.d(cursor, "name_ar");
        int d13 = j4.a.d(cursor, "name_en");
        int d14 = j4.a.d(cursor, "cousins_ids");
        int d15 = j4.a.d(cursor, "display_order");
        int d16 = j4.a.d(cursor, "parent_id");
        int i13 = 0;
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
        if (d14 != -1 && !cursor.isNull(d14)) {
            str = cursor.getString(d14);
        }
        String str2 = str;
        if (d15 == -1) {
            i12 = 0;
        } else {
            i12 = cursor.getInt(d15);
        }
        if (d16 != -1) {
            i13 = cursor.getInt(d16);
        }
        return new CousinCategory(i11, string, string2, str2, i12, i13);
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.forsale.app.datalayer.repositories.CategoryDao
    public Object deleteAllCategories(final List<CategoryEntity> list, zz.a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.repositories.CategoryDao_Impl.8
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                CategoryDao_Impl.this.__db.beginTransaction();
                try {
                    CategoryDao_Impl.this.__db.setTransactionSuccessful();
                    return Integer.valueOf(CategoryDao_Impl.this.__deletionAdapterOfCategoryEntity.handleMultiple(list) + 0);
                } finally {
                    CategoryDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.CategoryDao
    public Object deleteCategory(final CategoryEntity categoryEntity, zz.a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.repositories.CategoryDao_Impl.7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                CategoryDao_Impl.this.__db.beginTransaction();
                try {
                    CategoryDao_Impl.this.__db.setTransactionSuccessful();
                    return Integer.valueOf(CategoryDao_Impl.this.__deletionAdapterOfCategoryEntity.handle(categoryEntity) + 0);
                } finally {
                    CategoryDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.CategoryDao
    public LiveData<List<CategoryEntity>> getAllCategories(int i11) {
        final v i12 = v.i("SELECT * FROM  categories WHERE region_id == ?", 1);
        i12.d1(1, i11);
        return this.__db.getInvalidationTracker().e(new String[]{CategoryEntity.CATEGORIES_TABLE}, false, new Callable<List<CategoryEntity>>() { // from class: com.forsale.app.datalayer.repositories.CategoryDao_Impl.14
            protected void finalize() {
                i12.release();
            }

            @Override // java.util.concurrent.Callable
            public List<CategoryEntity> call() throws Exception {
                Integer valueOf;
                int i13;
                String string;
                int i14;
                String string2;
                int i15;
                String string3;
                int i16;
                String string4;
                int i17;
                String string5;
                int i18;
                int i19;
                int i21;
                String string6;
                int i22;
                String string7;
                int i23;
                String string8;
                int i24;
                Integer valueOf2;
                int i25;
                String string9;
                int i26;
                String string10;
                int i27;
                String string11;
                int i28;
                String string12;
                int i29;
                String string13;
                int i31;
                String string14;
                Cursor c11 = j4.b.c(CategoryDao_Impl.this.__db, i12, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "region_id");
                    int e13 = j4.a.e(c11, "system_name");
                    int e14 = j4.a.e(c11, "name_en");
                    int e15 = j4.a.e(c11, "name_ar");
                    int e16 = j4.a.e(c11, "image");
                    int e17 = j4.a.e(c11, "parent_id");
                    int e18 = j4.a.e(c11, "display_order");
                    int e19 = j4.a.e(c11, CategoryEntity.ALLOW_UPLOADING);
                    int e21 = j4.a.e(c11, CategoryEntity.IS_FILTERABLE);
                    int e22 = j4.a.e(c11, CategoryEntity.STEPS);
                    int e23 = j4.a.e(c11, "promote_animation");
                    int e24 = j4.a.e(c11, CategoryEntity.IS_ALTERNATE_VIEW);
                    int e25 = j4.a.e(c11, CategoryEntity.ALLOW_SEARCH);
                    try {
                        int e26 = j4.a.e(c11, CategoryEntity.ATTRIBUTE_VALUES);
                        int e27 = j4.a.e(c11, CategoryEntity.IS_EXPENDABLE);
                        int e28 = j4.a.e(c11, CategoryEntity.ALLOW_DISTRICT_FILTERING);
                        int e29 = j4.a.e(c11, CategoryEntity.HAS_PLANS);
                        int e31 = j4.a.e(c11, CategoryEntity.FILTERABLE_LABEL_EN);
                        int e32 = j4.a.e(c11, CategoryEntity.FILTERABLE_LABEL_AR);
                        int e33 = j4.a.e(c11, CategoryEntity.RULE_SET);
                        int e34 = j4.a.e(c11, CategoryEntity.CLASSIFICATION);
                        int e35 = j4.a.e(c11, CategoryEntity.ALLOW_POWER_PIN_VIEW);
                        int e36 = j4.a.e(c11, CategoryEntity.ALLOW_POWER_PIN_ADD);
                        int e37 = j4.a.e(c11, CategoryEntity.FULL_PATH);
                        int e38 = j4.a.e(c11, "category_type");
                        int e39 = j4.a.e(c11, "filtering_classification_ar");
                        int e41 = j4.a.e(c11, "filtering_classification_en");
                        int e42 = j4.a.e(c11, "is_indexed");
                        int e43 = j4.a.e(c11, CategoryEntity.VERTICAL_IMAGE);
                        int e44 = j4.a.e(c11, "max_home_top_banners");
                        int e45 = j4.a.e(c11, "relatives");
                        int e46 = j4.a.e(c11, CategoryEntity.FEATURED_IMAGE);
                        int e47 = j4.a.e(c11, "is_alt_cat");
                        int e48 = j4.a.e(c11, CategoryEntity.FILTRATION_SETTINGS);
                        int e49 = j4.a.e(c11, CategoryEntity.SECTIONS);
                        int e50 = j4.a.e(c11, CategoryEntity.SLUG);
                        int i32 = e25;
                        ArrayList arrayList = new ArrayList(c11.getCount());
                        while (c11.moveToNext()) {
                            int i33 = c11.getInt(e11);
                            int i34 = c11.getInt(e12);
                            String string15 = c11.isNull(e13) ? null : c11.getString(e13);
                            String string16 = c11.isNull(e14) ? null : c11.getString(e14);
                            String string17 = c11.isNull(e15) ? null : c11.getString(e15);
                            String string18 = c11.isNull(e16) ? null : c11.getString(e16);
                            int i35 = c11.getInt(e17);
                            int i36 = c11.getInt(e18);
                            int i37 = c11.getInt(e19);
                            int i38 = c11.getInt(e21);
                            int i39 = c11.getInt(e22);
                            String string19 = c11.isNull(e23) ? null : c11.getString(e23);
                            if (c11.isNull(e24)) {
                                i13 = i32;
                                valueOf = null;
                            } else {
                                valueOf = Integer.valueOf(c11.getInt(e24));
                                i13 = i32;
                            }
                            Integer valueOf3 = c11.isNull(i13) ? null : Integer.valueOf(c11.getInt(i13));
                            int i41 = e26;
                            int i42 = e11;
                            String string20 = c11.isNull(i41) ? null : c11.getString(i41);
                            int i43 = e27;
                            Integer valueOf4 = c11.isNull(i43) ? null : Integer.valueOf(c11.getInt(i43));
                            int i44 = e28;
                            int i45 = c11.getInt(i44);
                            int i46 = e29;
                            int i47 = c11.getInt(i46);
                            e29 = i46;
                            int i48 = e31;
                            if (c11.isNull(i48)) {
                                e31 = i48;
                                i14 = e32;
                                string = null;
                            } else {
                                string = c11.getString(i48);
                                e31 = i48;
                                i14 = e32;
                            }
                            if (c11.isNull(i14)) {
                                e32 = i14;
                                i15 = e33;
                                string2 = null;
                            } else {
                                string2 = c11.getString(i14);
                                e32 = i14;
                                i15 = e33;
                            }
                            if (c11.isNull(i15)) {
                                e33 = i15;
                                i16 = e34;
                                string3 = null;
                            } else {
                                string3 = c11.getString(i15);
                                e33 = i15;
                                i16 = e34;
                            }
                            if (c11.isNull(i16)) {
                                e34 = i16;
                                i17 = e35;
                                string4 = null;
                            } else {
                                string4 = c11.getString(i16);
                                e34 = i16;
                                i17 = e35;
                            }
                            int i49 = c11.getInt(i17);
                            e35 = i17;
                            int i50 = e36;
                            int i51 = c11.getInt(i50);
                            e36 = i50;
                            int i52 = e37;
                            if (c11.isNull(i52)) {
                                e37 = i52;
                                i18 = e38;
                                string5 = null;
                            } else {
                                string5 = c11.getString(i52);
                                e37 = i52;
                                i18 = e38;
                            }
                            if (c11.isNull(i18)) {
                                i19 = i18;
                                i22 = e12;
                                i21 = i13;
                                string6 = null;
                            } else {
                                i19 = i18;
                                i21 = i13;
                                string6 = c11.getString(i18);
                                i22 = e12;
                            }
                            try {
                                CategoryEntity.CategoryType categoryType = CategoryDao_Impl.this.__categoryTypeConverter.toCategoryType(string6);
                                int i53 = e39;
                                if (c11.isNull(i53)) {
                                    i23 = e41;
                                    string7 = null;
                                } else {
                                    string7 = c11.getString(i53);
                                    i23 = e41;
                                }
                                if (c11.isNull(i23)) {
                                    e39 = i53;
                                    i24 = e42;
                                    string8 = null;
                                } else {
                                    string8 = c11.getString(i23);
                                    e39 = i53;
                                    i24 = e42;
                                }
                                if (c11.isNull(i24)) {
                                    e42 = i24;
                                    i25 = e43;
                                    valueOf2 = null;
                                } else {
                                    e42 = i24;
                                    valueOf2 = Integer.valueOf(c11.getInt(i24));
                                    i25 = e43;
                                }
                                if (c11.isNull(i25)) {
                                    e43 = i25;
                                    i26 = e44;
                                    string9 = null;
                                } else {
                                    e43 = i25;
                                    string9 = c11.getString(i25);
                                    i26 = e44;
                                }
                                int i54 = c11.getInt(i26);
                                e44 = i26;
                                int i55 = e45;
                                if (c11.isNull(i55)) {
                                    e45 = i55;
                                    i27 = e46;
                                    string10 = null;
                                } else {
                                    e45 = i55;
                                    string10 = c11.getString(i55);
                                    i27 = e46;
                                }
                                if (c11.isNull(i27)) {
                                    e46 = i27;
                                    i28 = e47;
                                    string11 = null;
                                } else {
                                    e46 = i27;
                                    string11 = c11.getString(i27);
                                    i28 = e47;
                                }
                                int i56 = c11.getInt(i28);
                                e47 = i28;
                                int i57 = e48;
                                if (c11.isNull(i57)) {
                                    e48 = i57;
                                    i29 = e49;
                                    string12 = null;
                                } else {
                                    e48 = i57;
                                    string12 = c11.getString(i57);
                                    i29 = e49;
                                }
                                if (c11.isNull(i29)) {
                                    e49 = i29;
                                    i31 = e50;
                                    string13 = null;
                                } else {
                                    e49 = i29;
                                    string13 = c11.getString(i29);
                                    i31 = e50;
                                }
                                if (c11.isNull(i31)) {
                                    e50 = i31;
                                    string14 = null;
                                } else {
                                    e50 = i31;
                                    string14 = c11.getString(i31);
                                }
                                arrayList.add(new CategoryEntity(i33, i34, string15, string16, string17, string18, i35, i36, i37, i38, i39, string19, valueOf, valueOf3, string20, valueOf4, i45, i47, string, string2, string3, string4, i49, i51, string5, categoryType, string7, string8, valueOf2, string9, i54, string10, string11, i56, string12, string13, string14));
                                e41 = i23;
                                e11 = i42;
                                e26 = i41;
                                e27 = i43;
                                e12 = i22;
                                e28 = i44;
                                e38 = i19;
                                i32 = i21;
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

    @Override // com.forsale.app.datalayer.repositories.CategoryDao
    public Object getAllCategoriesAsList(int i11, zz.a<? super List<CategoryEntity>> aVar) {
        final v i12 = v.i("SELECT * FROM  categories WHERE region_id == ?", 1);
        i12.d1(1, i11);
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<List<CategoryEntity>>() { // from class: com.forsale.app.datalayer.repositories.CategoryDao_Impl.15
            @Override // java.util.concurrent.Callable
            public List<CategoryEntity> call() throws Exception {
                AnonymousClass15 anonymousClass15;
                Integer valueOf;
                int i13;
                String string;
                int i14;
                String string2;
                int i15;
                String string3;
                int i16;
                String string4;
                int i17;
                String string5;
                int i18;
                int i19;
                int i21;
                String string6;
                int i22;
                String string7;
                int i23;
                String string8;
                int i24;
                Integer valueOf2;
                int i25;
                String string9;
                int i26;
                String string10;
                int i27;
                String string11;
                int i28;
                String string12;
                int i29;
                String string13;
                int i31;
                String string14;
                Cursor c11 = j4.b.c(CategoryDao_Impl.this.__db, i12, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "region_id");
                    int e13 = j4.a.e(c11, "system_name");
                    int e14 = j4.a.e(c11, "name_en");
                    int e15 = j4.a.e(c11, "name_ar");
                    int e16 = j4.a.e(c11, "image");
                    int e17 = j4.a.e(c11, "parent_id");
                    int e18 = j4.a.e(c11, "display_order");
                    int e19 = j4.a.e(c11, CategoryEntity.ALLOW_UPLOADING);
                    int e21 = j4.a.e(c11, CategoryEntity.IS_FILTERABLE);
                    int e22 = j4.a.e(c11, CategoryEntity.STEPS);
                    int e23 = j4.a.e(c11, "promote_animation");
                    int e24 = j4.a.e(c11, CategoryEntity.IS_ALTERNATE_VIEW);
                    int e25 = j4.a.e(c11, CategoryEntity.ALLOW_SEARCH);
                    try {
                        int e26 = j4.a.e(c11, CategoryEntity.ATTRIBUTE_VALUES);
                        int e27 = j4.a.e(c11, CategoryEntity.IS_EXPENDABLE);
                        int e28 = j4.a.e(c11, CategoryEntity.ALLOW_DISTRICT_FILTERING);
                        int e29 = j4.a.e(c11, CategoryEntity.HAS_PLANS);
                        int e31 = j4.a.e(c11, CategoryEntity.FILTERABLE_LABEL_EN);
                        int e32 = j4.a.e(c11, CategoryEntity.FILTERABLE_LABEL_AR);
                        int e33 = j4.a.e(c11, CategoryEntity.RULE_SET);
                        int e34 = j4.a.e(c11, CategoryEntity.CLASSIFICATION);
                        int e35 = j4.a.e(c11, CategoryEntity.ALLOW_POWER_PIN_VIEW);
                        int e36 = j4.a.e(c11, CategoryEntity.ALLOW_POWER_PIN_ADD);
                        int e37 = j4.a.e(c11, CategoryEntity.FULL_PATH);
                        int e38 = j4.a.e(c11, "category_type");
                        int e39 = j4.a.e(c11, "filtering_classification_ar");
                        int e41 = j4.a.e(c11, "filtering_classification_en");
                        int e42 = j4.a.e(c11, "is_indexed");
                        int e43 = j4.a.e(c11, CategoryEntity.VERTICAL_IMAGE);
                        int e44 = j4.a.e(c11, "max_home_top_banners");
                        int e45 = j4.a.e(c11, "relatives");
                        int e46 = j4.a.e(c11, CategoryEntity.FEATURED_IMAGE);
                        int e47 = j4.a.e(c11, "is_alt_cat");
                        int e48 = j4.a.e(c11, CategoryEntity.FILTRATION_SETTINGS);
                        int e49 = j4.a.e(c11, CategoryEntity.SECTIONS);
                        int e50 = j4.a.e(c11, CategoryEntity.SLUG);
                        int i32 = e25;
                        ArrayList arrayList = new ArrayList(c11.getCount());
                        while (c11.moveToNext()) {
                            int i33 = c11.getInt(e11);
                            int i34 = c11.getInt(e12);
                            String string15 = c11.isNull(e13) ? null : c11.getString(e13);
                            String string16 = c11.isNull(e14) ? null : c11.getString(e14);
                            String string17 = c11.isNull(e15) ? null : c11.getString(e15);
                            String string18 = c11.isNull(e16) ? null : c11.getString(e16);
                            int i35 = c11.getInt(e17);
                            int i36 = c11.getInt(e18);
                            int i37 = c11.getInt(e19);
                            int i38 = c11.getInt(e21);
                            int i39 = c11.getInt(e22);
                            String string19 = c11.isNull(e23) ? null : c11.getString(e23);
                            if (c11.isNull(e24)) {
                                i13 = i32;
                                valueOf = null;
                            } else {
                                valueOf = Integer.valueOf(c11.getInt(e24));
                                i13 = i32;
                            }
                            Integer valueOf3 = c11.isNull(i13) ? null : Integer.valueOf(c11.getInt(i13));
                            int i41 = e26;
                            int i42 = e11;
                            String string20 = c11.isNull(i41) ? null : c11.getString(i41);
                            int i43 = e27;
                            Integer valueOf4 = c11.isNull(i43) ? null : Integer.valueOf(c11.getInt(i43));
                            int i44 = e28;
                            int i45 = c11.getInt(i44);
                            int i46 = e29;
                            int i47 = c11.getInt(i46);
                            e29 = i46;
                            int i48 = e31;
                            if (c11.isNull(i48)) {
                                e31 = i48;
                                i14 = e32;
                                string = null;
                            } else {
                                string = c11.getString(i48);
                                e31 = i48;
                                i14 = e32;
                            }
                            if (c11.isNull(i14)) {
                                e32 = i14;
                                i15 = e33;
                                string2 = null;
                            } else {
                                string2 = c11.getString(i14);
                                e32 = i14;
                                i15 = e33;
                            }
                            if (c11.isNull(i15)) {
                                e33 = i15;
                                i16 = e34;
                                string3 = null;
                            } else {
                                string3 = c11.getString(i15);
                                e33 = i15;
                                i16 = e34;
                            }
                            if (c11.isNull(i16)) {
                                e34 = i16;
                                i17 = e35;
                                string4 = null;
                            } else {
                                string4 = c11.getString(i16);
                                e34 = i16;
                                i17 = e35;
                            }
                            int i49 = c11.getInt(i17);
                            e35 = i17;
                            int i50 = e36;
                            int i51 = c11.getInt(i50);
                            e36 = i50;
                            int i52 = e37;
                            if (c11.isNull(i52)) {
                                e37 = i52;
                                i18 = e38;
                                string5 = null;
                            } else {
                                string5 = c11.getString(i52);
                                e37 = i52;
                                i18 = e38;
                            }
                            if (c11.isNull(i18)) {
                                i19 = i18;
                                i22 = e12;
                                i21 = i13;
                                string6 = null;
                            } else {
                                i19 = i18;
                                i21 = i13;
                                string6 = c11.getString(i18);
                                i22 = e12;
                            }
                            anonymousClass15 = this;
                            try {
                                CategoryEntity.CategoryType categoryType = CategoryDao_Impl.this.__categoryTypeConverter.toCategoryType(string6);
                                int i53 = e39;
                                if (c11.isNull(i53)) {
                                    i23 = e41;
                                    string7 = null;
                                } else {
                                    string7 = c11.getString(i53);
                                    i23 = e41;
                                }
                                if (c11.isNull(i23)) {
                                    e39 = i53;
                                    i24 = e42;
                                    string8 = null;
                                } else {
                                    string8 = c11.getString(i23);
                                    e39 = i53;
                                    i24 = e42;
                                }
                                if (c11.isNull(i24)) {
                                    e42 = i24;
                                    i25 = e43;
                                    valueOf2 = null;
                                } else {
                                    e42 = i24;
                                    valueOf2 = Integer.valueOf(c11.getInt(i24));
                                    i25 = e43;
                                }
                                if (c11.isNull(i25)) {
                                    e43 = i25;
                                    i26 = e44;
                                    string9 = null;
                                } else {
                                    e43 = i25;
                                    string9 = c11.getString(i25);
                                    i26 = e44;
                                }
                                int i54 = c11.getInt(i26);
                                e44 = i26;
                                int i55 = e45;
                                if (c11.isNull(i55)) {
                                    e45 = i55;
                                    i27 = e46;
                                    string10 = null;
                                } else {
                                    e45 = i55;
                                    string10 = c11.getString(i55);
                                    i27 = e46;
                                }
                                if (c11.isNull(i27)) {
                                    e46 = i27;
                                    i28 = e47;
                                    string11 = null;
                                } else {
                                    e46 = i27;
                                    string11 = c11.getString(i27);
                                    i28 = e47;
                                }
                                int i56 = c11.getInt(i28);
                                e47 = i28;
                                int i57 = e48;
                                if (c11.isNull(i57)) {
                                    e48 = i57;
                                    i29 = e49;
                                    string12 = null;
                                } else {
                                    e48 = i57;
                                    string12 = c11.getString(i57);
                                    i29 = e49;
                                }
                                if (c11.isNull(i29)) {
                                    e49 = i29;
                                    i31 = e50;
                                    string13 = null;
                                } else {
                                    e49 = i29;
                                    string13 = c11.getString(i29);
                                    i31 = e50;
                                }
                                if (c11.isNull(i31)) {
                                    e50 = i31;
                                    string14 = null;
                                } else {
                                    e50 = i31;
                                    string14 = c11.getString(i31);
                                }
                                arrayList.add(new CategoryEntity(i33, i34, string15, string16, string17, string18, i35, i36, i37, i38, i39, string19, valueOf, valueOf3, string20, valueOf4, i45, i47, string, string2, string3, string4, i49, i51, string5, categoryType, string7, string8, valueOf2, string9, i54, string10, string11, i56, string12, string13, string14));
                                e41 = i23;
                                e11 = i42;
                                e26 = i41;
                                e27 = i43;
                                e12 = i22;
                                e28 = i44;
                                e38 = i19;
                                i32 = i21;
                            } catch (Throwable th2) {
                                th = th2;
                                c11.close();
                                i12.release();
                                throw th;
                            }
                        }
                        c11.close();
                        i12.release();
                        return arrayList;
                    } catch (Throwable th3) {
                        th = th3;
                        anonymousClass15 = this;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    anonymousClass15 = this;
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.CategoryDao
    public Object getAllCategoriesSuspend(zz.a<? super List<CategoryEntity>> aVar) {
        final v i11 = v.i("SELECT * FROM  categories", 0);
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<List<CategoryEntity>>() { // from class: com.forsale.app.datalayer.repositories.CategoryDao_Impl.16
            @Override // java.util.concurrent.Callable
            public List<CategoryEntity> call() throws Exception {
                AnonymousClass16 anonymousClass16;
                Integer valueOf;
                int i12;
                String string;
                int i13;
                String string2;
                int i14;
                String string3;
                int i15;
                String string4;
                int i16;
                String string5;
                int i17;
                int i18;
                int i19;
                String string6;
                int i21;
                String string7;
                int i22;
                String string8;
                int i23;
                Integer valueOf2;
                int i24;
                String string9;
                int i25;
                String string10;
                int i26;
                String string11;
                int i27;
                String string12;
                int i28;
                String string13;
                int i29;
                String string14;
                Cursor c11 = j4.b.c(CategoryDao_Impl.this.__db, i11, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "region_id");
                    int e13 = j4.a.e(c11, "system_name");
                    int e14 = j4.a.e(c11, "name_en");
                    int e15 = j4.a.e(c11, "name_ar");
                    int e16 = j4.a.e(c11, "image");
                    int e17 = j4.a.e(c11, "parent_id");
                    int e18 = j4.a.e(c11, "display_order");
                    int e19 = j4.a.e(c11, CategoryEntity.ALLOW_UPLOADING);
                    int e21 = j4.a.e(c11, CategoryEntity.IS_FILTERABLE);
                    int e22 = j4.a.e(c11, CategoryEntity.STEPS);
                    int e23 = j4.a.e(c11, "promote_animation");
                    int e24 = j4.a.e(c11, CategoryEntity.IS_ALTERNATE_VIEW);
                    int e25 = j4.a.e(c11, CategoryEntity.ALLOW_SEARCH);
                    try {
                        int e26 = j4.a.e(c11, CategoryEntity.ATTRIBUTE_VALUES);
                        int e27 = j4.a.e(c11, CategoryEntity.IS_EXPENDABLE);
                        int e28 = j4.a.e(c11, CategoryEntity.ALLOW_DISTRICT_FILTERING);
                        int e29 = j4.a.e(c11, CategoryEntity.HAS_PLANS);
                        int e31 = j4.a.e(c11, CategoryEntity.FILTERABLE_LABEL_EN);
                        int e32 = j4.a.e(c11, CategoryEntity.FILTERABLE_LABEL_AR);
                        int e33 = j4.a.e(c11, CategoryEntity.RULE_SET);
                        int e34 = j4.a.e(c11, CategoryEntity.CLASSIFICATION);
                        int e35 = j4.a.e(c11, CategoryEntity.ALLOW_POWER_PIN_VIEW);
                        int e36 = j4.a.e(c11, CategoryEntity.ALLOW_POWER_PIN_ADD);
                        int e37 = j4.a.e(c11, CategoryEntity.FULL_PATH);
                        int e38 = j4.a.e(c11, "category_type");
                        int e39 = j4.a.e(c11, "filtering_classification_ar");
                        int e41 = j4.a.e(c11, "filtering_classification_en");
                        int e42 = j4.a.e(c11, "is_indexed");
                        int e43 = j4.a.e(c11, CategoryEntity.VERTICAL_IMAGE);
                        int e44 = j4.a.e(c11, "max_home_top_banners");
                        int e45 = j4.a.e(c11, "relatives");
                        int e46 = j4.a.e(c11, CategoryEntity.FEATURED_IMAGE);
                        int e47 = j4.a.e(c11, "is_alt_cat");
                        int e48 = j4.a.e(c11, CategoryEntity.FILTRATION_SETTINGS);
                        int e49 = j4.a.e(c11, CategoryEntity.SECTIONS);
                        int e50 = j4.a.e(c11, CategoryEntity.SLUG);
                        int i31 = e25;
                        ArrayList arrayList = new ArrayList(c11.getCount());
                        while (c11.moveToNext()) {
                            int i32 = c11.getInt(e11);
                            int i33 = c11.getInt(e12);
                            String string15 = c11.isNull(e13) ? null : c11.getString(e13);
                            String string16 = c11.isNull(e14) ? null : c11.getString(e14);
                            String string17 = c11.isNull(e15) ? null : c11.getString(e15);
                            String string18 = c11.isNull(e16) ? null : c11.getString(e16);
                            int i34 = c11.getInt(e17);
                            int i35 = c11.getInt(e18);
                            int i36 = c11.getInt(e19);
                            int i37 = c11.getInt(e21);
                            int i38 = c11.getInt(e22);
                            String string19 = c11.isNull(e23) ? null : c11.getString(e23);
                            if (c11.isNull(e24)) {
                                i12 = i31;
                                valueOf = null;
                            } else {
                                valueOf = Integer.valueOf(c11.getInt(e24));
                                i12 = i31;
                            }
                            Integer valueOf3 = c11.isNull(i12) ? null : Integer.valueOf(c11.getInt(i12));
                            int i39 = e26;
                            int i41 = e11;
                            String string20 = c11.isNull(i39) ? null : c11.getString(i39);
                            int i42 = e27;
                            Integer valueOf4 = c11.isNull(i42) ? null : Integer.valueOf(c11.getInt(i42));
                            int i43 = e28;
                            int i44 = c11.getInt(i43);
                            int i45 = e29;
                            int i46 = c11.getInt(i45);
                            e29 = i45;
                            int i47 = e31;
                            if (c11.isNull(i47)) {
                                e31 = i47;
                                i13 = e32;
                                string = null;
                            } else {
                                string = c11.getString(i47);
                                e31 = i47;
                                i13 = e32;
                            }
                            if (c11.isNull(i13)) {
                                e32 = i13;
                                i14 = e33;
                                string2 = null;
                            } else {
                                string2 = c11.getString(i13);
                                e32 = i13;
                                i14 = e33;
                            }
                            if (c11.isNull(i14)) {
                                e33 = i14;
                                i15 = e34;
                                string3 = null;
                            } else {
                                string3 = c11.getString(i14);
                                e33 = i14;
                                i15 = e34;
                            }
                            if (c11.isNull(i15)) {
                                e34 = i15;
                                i16 = e35;
                                string4 = null;
                            } else {
                                string4 = c11.getString(i15);
                                e34 = i15;
                                i16 = e35;
                            }
                            int i48 = c11.getInt(i16);
                            e35 = i16;
                            int i49 = e36;
                            int i50 = c11.getInt(i49);
                            e36 = i49;
                            int i51 = e37;
                            if (c11.isNull(i51)) {
                                e37 = i51;
                                i17 = e38;
                                string5 = null;
                            } else {
                                string5 = c11.getString(i51);
                                e37 = i51;
                                i17 = e38;
                            }
                            if (c11.isNull(i17)) {
                                i18 = i17;
                                i21 = e12;
                                i19 = i12;
                                string6 = null;
                            } else {
                                i18 = i17;
                                i19 = i12;
                                string6 = c11.getString(i17);
                                i21 = e12;
                            }
                            anonymousClass16 = this;
                            try {
                                CategoryEntity.CategoryType categoryType = CategoryDao_Impl.this.__categoryTypeConverter.toCategoryType(string6);
                                int i52 = e39;
                                if (c11.isNull(i52)) {
                                    i22 = e41;
                                    string7 = null;
                                } else {
                                    string7 = c11.getString(i52);
                                    i22 = e41;
                                }
                                if (c11.isNull(i22)) {
                                    e39 = i52;
                                    i23 = e42;
                                    string8 = null;
                                } else {
                                    string8 = c11.getString(i22);
                                    e39 = i52;
                                    i23 = e42;
                                }
                                if (c11.isNull(i23)) {
                                    e42 = i23;
                                    i24 = e43;
                                    valueOf2 = null;
                                } else {
                                    e42 = i23;
                                    valueOf2 = Integer.valueOf(c11.getInt(i23));
                                    i24 = e43;
                                }
                                if (c11.isNull(i24)) {
                                    e43 = i24;
                                    i25 = e44;
                                    string9 = null;
                                } else {
                                    e43 = i24;
                                    string9 = c11.getString(i24);
                                    i25 = e44;
                                }
                                int i53 = c11.getInt(i25);
                                e44 = i25;
                                int i54 = e45;
                                if (c11.isNull(i54)) {
                                    e45 = i54;
                                    i26 = e46;
                                    string10 = null;
                                } else {
                                    e45 = i54;
                                    string10 = c11.getString(i54);
                                    i26 = e46;
                                }
                                if (c11.isNull(i26)) {
                                    e46 = i26;
                                    i27 = e47;
                                    string11 = null;
                                } else {
                                    e46 = i26;
                                    string11 = c11.getString(i26);
                                    i27 = e47;
                                }
                                int i55 = c11.getInt(i27);
                                e47 = i27;
                                int i56 = e48;
                                if (c11.isNull(i56)) {
                                    e48 = i56;
                                    i28 = e49;
                                    string12 = null;
                                } else {
                                    e48 = i56;
                                    string12 = c11.getString(i56);
                                    i28 = e49;
                                }
                                if (c11.isNull(i28)) {
                                    e49 = i28;
                                    i29 = e50;
                                    string13 = null;
                                } else {
                                    e49 = i28;
                                    string13 = c11.getString(i28);
                                    i29 = e50;
                                }
                                if (c11.isNull(i29)) {
                                    e50 = i29;
                                    string14 = null;
                                } else {
                                    e50 = i29;
                                    string14 = c11.getString(i29);
                                }
                                arrayList.add(new CategoryEntity(i32, i33, string15, string16, string17, string18, i34, i35, i36, i37, i38, string19, valueOf, valueOf3, string20, valueOf4, i44, i46, string, string2, string3, string4, i48, i50, string5, categoryType, string7, string8, valueOf2, string9, i53, string10, string11, i55, string12, string13, string14));
                                e41 = i22;
                                e11 = i41;
                                e26 = i39;
                                e27 = i42;
                                e12 = i21;
                                e28 = i43;
                                e38 = i18;
                                i31 = i19;
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
                        anonymousClass16 = this;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    anonymousClass16 = this;
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.CategoryDao
    public Object getCategoriesByClassification(int i11, CategoryEntity.Classification classification, zz.a<? super List<CategoryEntity>> aVar) {
        final v i12 = v.i("SELECT * FROM  categories WHERE region_id == ? AND classification == ? ORDER BY display_order", 2);
        i12.d1(1, i11);
        String classificationTypeConverter = this.__classificationTypeConverter.toString(classification);
        if (classificationTypeConverter == null) {
            i12.u1(2);
        } else {
            i12.Q0(2, classificationTypeConverter);
        }
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<List<CategoryEntity>>() { // from class: com.forsale.app.datalayer.repositories.CategoryDao_Impl.32
            @Override // java.util.concurrent.Callable
            public List<CategoryEntity> call() throws Exception {
                AnonymousClass32 anonymousClass32;
                Integer valueOf;
                int i13;
                String string;
                int i14;
                String string2;
                int i15;
                String string3;
                int i16;
                String string4;
                int i17;
                String string5;
                int i18;
                int i19;
                int i21;
                String string6;
                int i22;
                String string7;
                int i23;
                String string8;
                int i24;
                Integer valueOf2;
                int i25;
                String string9;
                int i26;
                String string10;
                int i27;
                String string11;
                int i28;
                String string12;
                int i29;
                String string13;
                int i31;
                String string14;
                Cursor c11 = j4.b.c(CategoryDao_Impl.this.__db, i12, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "region_id");
                    int e13 = j4.a.e(c11, "system_name");
                    int e14 = j4.a.e(c11, "name_en");
                    int e15 = j4.a.e(c11, "name_ar");
                    int e16 = j4.a.e(c11, "image");
                    int e17 = j4.a.e(c11, "parent_id");
                    int e18 = j4.a.e(c11, "display_order");
                    int e19 = j4.a.e(c11, CategoryEntity.ALLOW_UPLOADING);
                    int e21 = j4.a.e(c11, CategoryEntity.IS_FILTERABLE);
                    int e22 = j4.a.e(c11, CategoryEntity.STEPS);
                    int e23 = j4.a.e(c11, "promote_animation");
                    int e24 = j4.a.e(c11, CategoryEntity.IS_ALTERNATE_VIEW);
                    int e25 = j4.a.e(c11, CategoryEntity.ALLOW_SEARCH);
                    try {
                        int e26 = j4.a.e(c11, CategoryEntity.ATTRIBUTE_VALUES);
                        int e27 = j4.a.e(c11, CategoryEntity.IS_EXPENDABLE);
                        int e28 = j4.a.e(c11, CategoryEntity.ALLOW_DISTRICT_FILTERING);
                        int e29 = j4.a.e(c11, CategoryEntity.HAS_PLANS);
                        int e31 = j4.a.e(c11, CategoryEntity.FILTERABLE_LABEL_EN);
                        int e32 = j4.a.e(c11, CategoryEntity.FILTERABLE_LABEL_AR);
                        int e33 = j4.a.e(c11, CategoryEntity.RULE_SET);
                        int e34 = j4.a.e(c11, CategoryEntity.CLASSIFICATION);
                        int e35 = j4.a.e(c11, CategoryEntity.ALLOW_POWER_PIN_VIEW);
                        int e36 = j4.a.e(c11, CategoryEntity.ALLOW_POWER_PIN_ADD);
                        int e37 = j4.a.e(c11, CategoryEntity.FULL_PATH);
                        int e38 = j4.a.e(c11, "category_type");
                        int e39 = j4.a.e(c11, "filtering_classification_ar");
                        int e41 = j4.a.e(c11, "filtering_classification_en");
                        int e42 = j4.a.e(c11, "is_indexed");
                        int e43 = j4.a.e(c11, CategoryEntity.VERTICAL_IMAGE);
                        int e44 = j4.a.e(c11, "max_home_top_banners");
                        int e45 = j4.a.e(c11, "relatives");
                        int e46 = j4.a.e(c11, CategoryEntity.FEATURED_IMAGE);
                        int e47 = j4.a.e(c11, "is_alt_cat");
                        int e48 = j4.a.e(c11, CategoryEntity.FILTRATION_SETTINGS);
                        int e49 = j4.a.e(c11, CategoryEntity.SECTIONS);
                        int e50 = j4.a.e(c11, CategoryEntity.SLUG);
                        int i32 = e25;
                        ArrayList arrayList = new ArrayList(c11.getCount());
                        while (c11.moveToNext()) {
                            int i33 = c11.getInt(e11);
                            int i34 = c11.getInt(e12);
                            String string15 = c11.isNull(e13) ? null : c11.getString(e13);
                            String string16 = c11.isNull(e14) ? null : c11.getString(e14);
                            String string17 = c11.isNull(e15) ? null : c11.getString(e15);
                            String string18 = c11.isNull(e16) ? null : c11.getString(e16);
                            int i35 = c11.getInt(e17);
                            int i36 = c11.getInt(e18);
                            int i37 = c11.getInt(e19);
                            int i38 = c11.getInt(e21);
                            int i39 = c11.getInt(e22);
                            String string19 = c11.isNull(e23) ? null : c11.getString(e23);
                            if (c11.isNull(e24)) {
                                i13 = i32;
                                valueOf = null;
                            } else {
                                valueOf = Integer.valueOf(c11.getInt(e24));
                                i13 = i32;
                            }
                            Integer valueOf3 = c11.isNull(i13) ? null : Integer.valueOf(c11.getInt(i13));
                            int i41 = e26;
                            int i42 = e11;
                            String string20 = c11.isNull(i41) ? null : c11.getString(i41);
                            int i43 = e27;
                            Integer valueOf4 = c11.isNull(i43) ? null : Integer.valueOf(c11.getInt(i43));
                            int i44 = e28;
                            int i45 = c11.getInt(i44);
                            int i46 = e29;
                            int i47 = c11.getInt(i46);
                            e29 = i46;
                            int i48 = e31;
                            if (c11.isNull(i48)) {
                                e31 = i48;
                                i14 = e32;
                                string = null;
                            } else {
                                string = c11.getString(i48);
                                e31 = i48;
                                i14 = e32;
                            }
                            if (c11.isNull(i14)) {
                                e32 = i14;
                                i15 = e33;
                                string2 = null;
                            } else {
                                string2 = c11.getString(i14);
                                e32 = i14;
                                i15 = e33;
                            }
                            if (c11.isNull(i15)) {
                                e33 = i15;
                                i16 = e34;
                                string3 = null;
                            } else {
                                string3 = c11.getString(i15);
                                e33 = i15;
                                i16 = e34;
                            }
                            if (c11.isNull(i16)) {
                                e34 = i16;
                                i17 = e35;
                                string4 = null;
                            } else {
                                string4 = c11.getString(i16);
                                e34 = i16;
                                i17 = e35;
                            }
                            int i49 = c11.getInt(i17);
                            e35 = i17;
                            int i50 = e36;
                            int i51 = c11.getInt(i50);
                            e36 = i50;
                            int i52 = e37;
                            if (c11.isNull(i52)) {
                                e37 = i52;
                                i18 = e38;
                                string5 = null;
                            } else {
                                string5 = c11.getString(i52);
                                e37 = i52;
                                i18 = e38;
                            }
                            if (c11.isNull(i18)) {
                                i19 = i18;
                                i22 = e12;
                                i21 = i13;
                                string6 = null;
                            } else {
                                i19 = i18;
                                i21 = i13;
                                string6 = c11.getString(i18);
                                i22 = e12;
                            }
                            anonymousClass32 = this;
                            try {
                                CategoryEntity.CategoryType categoryType = CategoryDao_Impl.this.__categoryTypeConverter.toCategoryType(string6);
                                int i53 = e39;
                                if (c11.isNull(i53)) {
                                    i23 = e41;
                                    string7 = null;
                                } else {
                                    string7 = c11.getString(i53);
                                    i23 = e41;
                                }
                                if (c11.isNull(i23)) {
                                    e39 = i53;
                                    i24 = e42;
                                    string8 = null;
                                } else {
                                    string8 = c11.getString(i23);
                                    e39 = i53;
                                    i24 = e42;
                                }
                                if (c11.isNull(i24)) {
                                    e42 = i24;
                                    i25 = e43;
                                    valueOf2 = null;
                                } else {
                                    e42 = i24;
                                    valueOf2 = Integer.valueOf(c11.getInt(i24));
                                    i25 = e43;
                                }
                                if (c11.isNull(i25)) {
                                    e43 = i25;
                                    i26 = e44;
                                    string9 = null;
                                } else {
                                    e43 = i25;
                                    string9 = c11.getString(i25);
                                    i26 = e44;
                                }
                                int i54 = c11.getInt(i26);
                                e44 = i26;
                                int i55 = e45;
                                if (c11.isNull(i55)) {
                                    e45 = i55;
                                    i27 = e46;
                                    string10 = null;
                                } else {
                                    e45 = i55;
                                    string10 = c11.getString(i55);
                                    i27 = e46;
                                }
                                if (c11.isNull(i27)) {
                                    e46 = i27;
                                    i28 = e47;
                                    string11 = null;
                                } else {
                                    e46 = i27;
                                    string11 = c11.getString(i27);
                                    i28 = e47;
                                }
                                int i56 = c11.getInt(i28);
                                e47 = i28;
                                int i57 = e48;
                                if (c11.isNull(i57)) {
                                    e48 = i57;
                                    i29 = e49;
                                    string12 = null;
                                } else {
                                    e48 = i57;
                                    string12 = c11.getString(i57);
                                    i29 = e49;
                                }
                                if (c11.isNull(i29)) {
                                    e49 = i29;
                                    i31 = e50;
                                    string13 = null;
                                } else {
                                    e49 = i29;
                                    string13 = c11.getString(i29);
                                    i31 = e50;
                                }
                                if (c11.isNull(i31)) {
                                    e50 = i31;
                                    string14 = null;
                                } else {
                                    e50 = i31;
                                    string14 = c11.getString(i31);
                                }
                                arrayList.add(new CategoryEntity(i33, i34, string15, string16, string17, string18, i35, i36, i37, i38, i39, string19, valueOf, valueOf3, string20, valueOf4, i45, i47, string, string2, string3, string4, i49, i51, string5, categoryType, string7, string8, valueOf2, string9, i54, string10, string11, i56, string12, string13, string14));
                                e41 = i23;
                                e11 = i42;
                                e26 = i41;
                                e27 = i43;
                                e12 = i22;
                                e28 = i44;
                                e38 = i19;
                                i32 = i21;
                            } catch (Throwable th2) {
                                th = th2;
                                c11.close();
                                i12.release();
                                throw th;
                            }
                        }
                        c11.close();
                        i12.release();
                        return arrayList;
                    } catch (Throwable th3) {
                        th = th3;
                        anonymousClass32 = this;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    anonymousClass32 = this;
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.CategoryDao
    public Object getCategoriesByIds(List<Integer> list, zz.a<? super List<CategoryEntity>> aVar) {
        StringBuilder b11 = e.b();
        b11.append("SELECT * FROM categories where id in (");
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
        return CoroutinesRoom.b(this.__db, true, j4.b.a(), new Callable<List<CategoryEntity>>() { // from class: com.forsale.app.datalayer.repositories.CategoryDao_Impl.27
            @Override // java.util.concurrent.Callable
            public List<CategoryEntity> call() throws Exception {
                AnonymousClass27 anonymousClass27;
                Integer valueOf;
                int i13;
                String string;
                int i14;
                String string2;
                int i15;
                String string3;
                int i16;
                String string4;
                int i17;
                String string5;
                int i18;
                int i19;
                int i21;
                String string6;
                int i22;
                String string7;
                int i23;
                String string8;
                int i24;
                Integer valueOf2;
                int i25;
                String string9;
                int i26;
                String string10;
                int i27;
                String string11;
                int i28;
                String string12;
                int i29;
                String string13;
                int i31;
                String string14;
                CategoryDao_Impl.this.__db.beginTransaction();
                try {
                    try {
                        Cursor c11 = j4.b.c(CategoryDao_Impl.this.__db, i11, false, null);
                        try {
                            int e11 = j4.a.e(c11, "id");
                            int e12 = j4.a.e(c11, "region_id");
                            int e13 = j4.a.e(c11, "system_name");
                            int e14 = j4.a.e(c11, "name_en");
                            int e15 = j4.a.e(c11, "name_ar");
                            int e16 = j4.a.e(c11, "image");
                            int e17 = j4.a.e(c11, "parent_id");
                            int e18 = j4.a.e(c11, "display_order");
                            int e19 = j4.a.e(c11, CategoryEntity.ALLOW_UPLOADING);
                            int e21 = j4.a.e(c11, CategoryEntity.IS_FILTERABLE);
                            int e22 = j4.a.e(c11, CategoryEntity.STEPS);
                            int e23 = j4.a.e(c11, "promote_animation");
                            int e24 = j4.a.e(c11, CategoryEntity.IS_ALTERNATE_VIEW);
                            int e25 = j4.a.e(c11, CategoryEntity.ALLOW_SEARCH);
                            try {
                                int e26 = j4.a.e(c11, CategoryEntity.ATTRIBUTE_VALUES);
                                int e27 = j4.a.e(c11, CategoryEntity.IS_EXPENDABLE);
                                int e28 = j4.a.e(c11, CategoryEntity.ALLOW_DISTRICT_FILTERING);
                                int e29 = j4.a.e(c11, CategoryEntity.HAS_PLANS);
                                int e31 = j4.a.e(c11, CategoryEntity.FILTERABLE_LABEL_EN);
                                int e32 = j4.a.e(c11, CategoryEntity.FILTERABLE_LABEL_AR);
                                int e33 = j4.a.e(c11, CategoryEntity.RULE_SET);
                                int e34 = j4.a.e(c11, CategoryEntity.CLASSIFICATION);
                                int e35 = j4.a.e(c11, CategoryEntity.ALLOW_POWER_PIN_VIEW);
                                int e36 = j4.a.e(c11, CategoryEntity.ALLOW_POWER_PIN_ADD);
                                int e37 = j4.a.e(c11, CategoryEntity.FULL_PATH);
                                int e38 = j4.a.e(c11, "category_type");
                                int e39 = j4.a.e(c11, "filtering_classification_ar");
                                int e41 = j4.a.e(c11, "filtering_classification_en");
                                int e42 = j4.a.e(c11, "is_indexed");
                                int e43 = j4.a.e(c11, CategoryEntity.VERTICAL_IMAGE);
                                int e44 = j4.a.e(c11, "max_home_top_banners");
                                int e45 = j4.a.e(c11, "relatives");
                                int e46 = j4.a.e(c11, CategoryEntity.FEATURED_IMAGE);
                                int e47 = j4.a.e(c11, "is_alt_cat");
                                int e48 = j4.a.e(c11, CategoryEntity.FILTRATION_SETTINGS);
                                int e49 = j4.a.e(c11, CategoryEntity.SECTIONS);
                                int e50 = j4.a.e(c11, CategoryEntity.SLUG);
                                int i32 = e25;
                                ArrayList arrayList = new ArrayList(c11.getCount());
                                while (c11.moveToNext()) {
                                    int i33 = c11.getInt(e11);
                                    int i34 = c11.getInt(e12);
                                    String string15 = c11.isNull(e13) ? null : c11.getString(e13);
                                    String string16 = c11.isNull(e14) ? null : c11.getString(e14);
                                    String string17 = c11.isNull(e15) ? null : c11.getString(e15);
                                    String string18 = c11.isNull(e16) ? null : c11.getString(e16);
                                    int i35 = c11.getInt(e17);
                                    int i36 = c11.getInt(e18);
                                    int i37 = c11.getInt(e19);
                                    int i38 = c11.getInt(e21);
                                    int i39 = c11.getInt(e22);
                                    String string19 = c11.isNull(e23) ? null : c11.getString(e23);
                                    if (c11.isNull(e24)) {
                                        i13 = i32;
                                        valueOf = null;
                                    } else {
                                        valueOf = Integer.valueOf(c11.getInt(e24));
                                        i13 = i32;
                                    }
                                    Integer valueOf3 = c11.isNull(i13) ? null : Integer.valueOf(c11.getInt(i13));
                                    int i41 = e26;
                                    int i42 = e11;
                                    String string20 = c11.isNull(i41) ? null : c11.getString(i41);
                                    int i43 = e27;
                                    Integer valueOf4 = c11.isNull(i43) ? null : Integer.valueOf(c11.getInt(i43));
                                    int i44 = e28;
                                    int i45 = c11.getInt(i44);
                                    int i46 = e29;
                                    int i47 = c11.getInt(i46);
                                    e29 = i46;
                                    int i48 = e31;
                                    if (c11.isNull(i48)) {
                                        e31 = i48;
                                        i14 = e32;
                                        string = null;
                                    } else {
                                        string = c11.getString(i48);
                                        e31 = i48;
                                        i14 = e32;
                                    }
                                    if (c11.isNull(i14)) {
                                        e32 = i14;
                                        i15 = e33;
                                        string2 = null;
                                    } else {
                                        string2 = c11.getString(i14);
                                        e32 = i14;
                                        i15 = e33;
                                    }
                                    if (c11.isNull(i15)) {
                                        e33 = i15;
                                        i16 = e34;
                                        string3 = null;
                                    } else {
                                        string3 = c11.getString(i15);
                                        e33 = i15;
                                        i16 = e34;
                                    }
                                    if (c11.isNull(i16)) {
                                        e34 = i16;
                                        i17 = e35;
                                        string4 = null;
                                    } else {
                                        string4 = c11.getString(i16);
                                        e34 = i16;
                                        i17 = e35;
                                    }
                                    int i49 = c11.getInt(i17);
                                    e35 = i17;
                                    int i50 = e36;
                                    int i51 = c11.getInt(i50);
                                    e36 = i50;
                                    int i52 = e37;
                                    if (c11.isNull(i52)) {
                                        e37 = i52;
                                        i18 = e38;
                                        string5 = null;
                                    } else {
                                        string5 = c11.getString(i52);
                                        e37 = i52;
                                        i18 = e38;
                                    }
                                    if (c11.isNull(i18)) {
                                        i19 = i18;
                                        i22 = e12;
                                        i21 = i13;
                                        string6 = null;
                                    } else {
                                        i19 = i18;
                                        i21 = i13;
                                        string6 = c11.getString(i18);
                                        i22 = e12;
                                    }
                                    anonymousClass27 = this;
                                    try {
                                        CategoryEntity.CategoryType categoryType = CategoryDao_Impl.this.__categoryTypeConverter.toCategoryType(string6);
                                        int i53 = e39;
                                        if (c11.isNull(i53)) {
                                            i23 = e41;
                                            string7 = null;
                                        } else {
                                            string7 = c11.getString(i53);
                                            i23 = e41;
                                        }
                                        if (c11.isNull(i23)) {
                                            e39 = i53;
                                            i24 = e42;
                                            string8 = null;
                                        } else {
                                            string8 = c11.getString(i23);
                                            e39 = i53;
                                            i24 = e42;
                                        }
                                        if (c11.isNull(i24)) {
                                            e42 = i24;
                                            i25 = e43;
                                            valueOf2 = null;
                                        } else {
                                            e42 = i24;
                                            valueOf2 = Integer.valueOf(c11.getInt(i24));
                                            i25 = e43;
                                        }
                                        if (c11.isNull(i25)) {
                                            e43 = i25;
                                            i26 = e44;
                                            string9 = null;
                                        } else {
                                            e43 = i25;
                                            string9 = c11.getString(i25);
                                            i26 = e44;
                                        }
                                        int i54 = c11.getInt(i26);
                                        e44 = i26;
                                        int i55 = e45;
                                        if (c11.isNull(i55)) {
                                            e45 = i55;
                                            i27 = e46;
                                            string10 = null;
                                        } else {
                                            e45 = i55;
                                            string10 = c11.getString(i55);
                                            i27 = e46;
                                        }
                                        if (c11.isNull(i27)) {
                                            e46 = i27;
                                            i28 = e47;
                                            string11 = null;
                                        } else {
                                            e46 = i27;
                                            string11 = c11.getString(i27);
                                            i28 = e47;
                                        }
                                        int i56 = c11.getInt(i28);
                                        e47 = i28;
                                        int i57 = e48;
                                        if (c11.isNull(i57)) {
                                            e48 = i57;
                                            i29 = e49;
                                            string12 = null;
                                        } else {
                                            e48 = i57;
                                            string12 = c11.getString(i57);
                                            i29 = e49;
                                        }
                                        if (c11.isNull(i29)) {
                                            e49 = i29;
                                            i31 = e50;
                                            string13 = null;
                                        } else {
                                            e49 = i29;
                                            string13 = c11.getString(i29);
                                            i31 = e50;
                                        }
                                        if (c11.isNull(i31)) {
                                            e50 = i31;
                                            string14 = null;
                                        } else {
                                            e50 = i31;
                                            string14 = c11.getString(i31);
                                        }
                                        arrayList.add(new CategoryEntity(i33, i34, string15, string16, string17, string18, i35, i36, i37, i38, i39, string19, valueOf, valueOf3, string20, valueOf4, i45, i47, string, string2, string3, string4, i49, i51, string5, categoryType, string7, string8, valueOf2, string9, i54, string10, string11, i56, string12, string13, string14));
                                        e41 = i23;
                                        e11 = i42;
                                        e26 = i41;
                                        e27 = i43;
                                        e12 = i22;
                                        e28 = i44;
                                        e38 = i19;
                                        i32 = i21;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        c11.close();
                                        i11.release();
                                        throw th;
                                    }
                                }
                                anonymousClass27 = this;
                                CategoryDao_Impl.this.__db.setTransactionSuccessful();
                                c11.close();
                                i11.release();
                                CategoryDao_Impl.this.__db.endTransaction();
                                return arrayList;
                            } catch (Throwable th3) {
                                th = th3;
                                anonymousClass27 = this;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            anonymousClass27 = this;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        CategoryDao_Impl.this.__db.endTransaction();
                        throw th;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    CategoryDao_Impl.this.__db.endTransaction();
                    throw th;
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.CategoryDao
    public Object getCategoriesByParentId(int i11, int i12, zz.a<? super List<CategoryEntity>> aVar) {
        final v i13 = v.i("SELECT * FROM  categories WHERE region_id == ? AND parent_id == ? ORDER BY display_order", 2);
        i13.d1(1, i11);
        i13.d1(2, i12);
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<List<CategoryEntity>>() { // from class: com.forsale.app.datalayer.repositories.CategoryDao_Impl.20
            @Override // java.util.concurrent.Callable
            public List<CategoryEntity> call() throws Exception {
                AnonymousClass20 anonymousClass20;
                Integer valueOf;
                int i14;
                String string;
                int i15;
                String string2;
                int i16;
                String string3;
                int i17;
                String string4;
                int i18;
                String string5;
                int i19;
                int i21;
                int i22;
                String string6;
                int i23;
                String string7;
                int i24;
                String string8;
                int i25;
                Integer valueOf2;
                int i26;
                String string9;
                int i27;
                String string10;
                int i28;
                String string11;
                int i29;
                String string12;
                int i31;
                String string13;
                int i32;
                String string14;
                Cursor c11 = j4.b.c(CategoryDao_Impl.this.__db, i13, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "region_id");
                    int e13 = j4.a.e(c11, "system_name");
                    int e14 = j4.a.e(c11, "name_en");
                    int e15 = j4.a.e(c11, "name_ar");
                    int e16 = j4.a.e(c11, "image");
                    int e17 = j4.a.e(c11, "parent_id");
                    int e18 = j4.a.e(c11, "display_order");
                    int e19 = j4.a.e(c11, CategoryEntity.ALLOW_UPLOADING);
                    int e21 = j4.a.e(c11, CategoryEntity.IS_FILTERABLE);
                    int e22 = j4.a.e(c11, CategoryEntity.STEPS);
                    int e23 = j4.a.e(c11, "promote_animation");
                    int e24 = j4.a.e(c11, CategoryEntity.IS_ALTERNATE_VIEW);
                    int e25 = j4.a.e(c11, CategoryEntity.ALLOW_SEARCH);
                    try {
                        int e26 = j4.a.e(c11, CategoryEntity.ATTRIBUTE_VALUES);
                        int e27 = j4.a.e(c11, CategoryEntity.IS_EXPENDABLE);
                        int e28 = j4.a.e(c11, CategoryEntity.ALLOW_DISTRICT_FILTERING);
                        int e29 = j4.a.e(c11, CategoryEntity.HAS_PLANS);
                        int e31 = j4.a.e(c11, CategoryEntity.FILTERABLE_LABEL_EN);
                        int e32 = j4.a.e(c11, CategoryEntity.FILTERABLE_LABEL_AR);
                        int e33 = j4.a.e(c11, CategoryEntity.RULE_SET);
                        int e34 = j4.a.e(c11, CategoryEntity.CLASSIFICATION);
                        int e35 = j4.a.e(c11, CategoryEntity.ALLOW_POWER_PIN_VIEW);
                        int e36 = j4.a.e(c11, CategoryEntity.ALLOW_POWER_PIN_ADD);
                        int e37 = j4.a.e(c11, CategoryEntity.FULL_PATH);
                        int e38 = j4.a.e(c11, "category_type");
                        int e39 = j4.a.e(c11, "filtering_classification_ar");
                        int e41 = j4.a.e(c11, "filtering_classification_en");
                        int e42 = j4.a.e(c11, "is_indexed");
                        int e43 = j4.a.e(c11, CategoryEntity.VERTICAL_IMAGE);
                        int e44 = j4.a.e(c11, "max_home_top_banners");
                        int e45 = j4.a.e(c11, "relatives");
                        int e46 = j4.a.e(c11, CategoryEntity.FEATURED_IMAGE);
                        int e47 = j4.a.e(c11, "is_alt_cat");
                        int e48 = j4.a.e(c11, CategoryEntity.FILTRATION_SETTINGS);
                        int e49 = j4.a.e(c11, CategoryEntity.SECTIONS);
                        int e50 = j4.a.e(c11, CategoryEntity.SLUG);
                        int i33 = e25;
                        ArrayList arrayList = new ArrayList(c11.getCount());
                        while (c11.moveToNext()) {
                            int i34 = c11.getInt(e11);
                            int i35 = c11.getInt(e12);
                            String string15 = c11.isNull(e13) ? null : c11.getString(e13);
                            String string16 = c11.isNull(e14) ? null : c11.getString(e14);
                            String string17 = c11.isNull(e15) ? null : c11.getString(e15);
                            String string18 = c11.isNull(e16) ? null : c11.getString(e16);
                            int i36 = c11.getInt(e17);
                            int i37 = c11.getInt(e18);
                            int i38 = c11.getInt(e19);
                            int i39 = c11.getInt(e21);
                            int i41 = c11.getInt(e22);
                            String string19 = c11.isNull(e23) ? null : c11.getString(e23);
                            if (c11.isNull(e24)) {
                                i14 = i33;
                                valueOf = null;
                            } else {
                                valueOf = Integer.valueOf(c11.getInt(e24));
                                i14 = i33;
                            }
                            Integer valueOf3 = c11.isNull(i14) ? null : Integer.valueOf(c11.getInt(i14));
                            int i42 = e26;
                            int i43 = e11;
                            String string20 = c11.isNull(i42) ? null : c11.getString(i42);
                            int i44 = e27;
                            Integer valueOf4 = c11.isNull(i44) ? null : Integer.valueOf(c11.getInt(i44));
                            int i45 = e28;
                            int i46 = c11.getInt(i45);
                            int i47 = e29;
                            int i48 = c11.getInt(i47);
                            e29 = i47;
                            int i49 = e31;
                            if (c11.isNull(i49)) {
                                e31 = i49;
                                i15 = e32;
                                string = null;
                            } else {
                                string = c11.getString(i49);
                                e31 = i49;
                                i15 = e32;
                            }
                            if (c11.isNull(i15)) {
                                e32 = i15;
                                i16 = e33;
                                string2 = null;
                            } else {
                                string2 = c11.getString(i15);
                                e32 = i15;
                                i16 = e33;
                            }
                            if (c11.isNull(i16)) {
                                e33 = i16;
                                i17 = e34;
                                string3 = null;
                            } else {
                                string3 = c11.getString(i16);
                                e33 = i16;
                                i17 = e34;
                            }
                            if (c11.isNull(i17)) {
                                e34 = i17;
                                i18 = e35;
                                string4 = null;
                            } else {
                                string4 = c11.getString(i17);
                                e34 = i17;
                                i18 = e35;
                            }
                            int i50 = c11.getInt(i18);
                            e35 = i18;
                            int i51 = e36;
                            int i52 = c11.getInt(i51);
                            e36 = i51;
                            int i53 = e37;
                            if (c11.isNull(i53)) {
                                e37 = i53;
                                i19 = e38;
                                string5 = null;
                            } else {
                                string5 = c11.getString(i53);
                                e37 = i53;
                                i19 = e38;
                            }
                            if (c11.isNull(i19)) {
                                i21 = i19;
                                i23 = e12;
                                i22 = i14;
                                string6 = null;
                            } else {
                                i21 = i19;
                                i22 = i14;
                                string6 = c11.getString(i19);
                                i23 = e12;
                            }
                            anonymousClass20 = this;
                            try {
                                CategoryEntity.CategoryType categoryType = CategoryDao_Impl.this.__categoryTypeConverter.toCategoryType(string6);
                                int i54 = e39;
                                if (c11.isNull(i54)) {
                                    i24 = e41;
                                    string7 = null;
                                } else {
                                    string7 = c11.getString(i54);
                                    i24 = e41;
                                }
                                if (c11.isNull(i24)) {
                                    e39 = i54;
                                    i25 = e42;
                                    string8 = null;
                                } else {
                                    string8 = c11.getString(i24);
                                    e39 = i54;
                                    i25 = e42;
                                }
                                if (c11.isNull(i25)) {
                                    e42 = i25;
                                    i26 = e43;
                                    valueOf2 = null;
                                } else {
                                    e42 = i25;
                                    valueOf2 = Integer.valueOf(c11.getInt(i25));
                                    i26 = e43;
                                }
                                if (c11.isNull(i26)) {
                                    e43 = i26;
                                    i27 = e44;
                                    string9 = null;
                                } else {
                                    e43 = i26;
                                    string9 = c11.getString(i26);
                                    i27 = e44;
                                }
                                int i55 = c11.getInt(i27);
                                e44 = i27;
                                int i56 = e45;
                                if (c11.isNull(i56)) {
                                    e45 = i56;
                                    i28 = e46;
                                    string10 = null;
                                } else {
                                    e45 = i56;
                                    string10 = c11.getString(i56);
                                    i28 = e46;
                                }
                                if (c11.isNull(i28)) {
                                    e46 = i28;
                                    i29 = e47;
                                    string11 = null;
                                } else {
                                    e46 = i28;
                                    string11 = c11.getString(i28);
                                    i29 = e47;
                                }
                                int i57 = c11.getInt(i29);
                                e47 = i29;
                                int i58 = e48;
                                if (c11.isNull(i58)) {
                                    e48 = i58;
                                    i31 = e49;
                                    string12 = null;
                                } else {
                                    e48 = i58;
                                    string12 = c11.getString(i58);
                                    i31 = e49;
                                }
                                if (c11.isNull(i31)) {
                                    e49 = i31;
                                    i32 = e50;
                                    string13 = null;
                                } else {
                                    e49 = i31;
                                    string13 = c11.getString(i31);
                                    i32 = e50;
                                }
                                if (c11.isNull(i32)) {
                                    e50 = i32;
                                    string14 = null;
                                } else {
                                    e50 = i32;
                                    string14 = c11.getString(i32);
                                }
                                arrayList.add(new CategoryEntity(i34, i35, string15, string16, string17, string18, i36, i37, i38, i39, i41, string19, valueOf, valueOf3, string20, valueOf4, i46, i48, string, string2, string3, string4, i50, i52, string5, categoryType, string7, string8, valueOf2, string9, i55, string10, string11, i57, string12, string13, string14));
                                e41 = i24;
                                e11 = i43;
                                e26 = i42;
                                e27 = i44;
                                e12 = i23;
                                e28 = i45;
                                e38 = i21;
                                i33 = i22;
                            } catch (Throwable th2) {
                                th = th2;
                                c11.close();
                                i13.release();
                                throw th;
                            }
                        }
                        c11.close();
                        i13.release();
                        return arrayList;
                    } catch (Throwable th3) {
                        th = th3;
                        anonymousClass20 = this;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    anonymousClass20 = this;
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.CategoryDao
    public Object getCategoriesByParentIdAndClassifications(int i11, int i12, List<? extends CategoryEntity.Classification> list, zz.a<? super List<CategoryEntity>> aVar) {
        StringBuilder b11 = e.b();
        b11.append("SELECT * FROM categories WHERE region_id == ");
        b11.append("?");
        b11.append(" AND parent_id == ");
        b11.append("?");
        b11.append(" AND classification IN (");
        int size = list.size();
        e.a(b11, size);
        b11.append(") ORDER BY display_order");
        final v i13 = v.i(b11.toString(), size + 2);
        i13.d1(1, i11);
        i13.d1(2, i12);
        int i14 = 3;
        for (CategoryEntity.Classification classification : list) {
            String classificationTypeConverter = this.__classificationTypeConverter.toString(classification);
            if (classificationTypeConverter == null) {
                i13.u1(i14);
            } else {
                i13.Q0(i14, classificationTypeConverter);
            }
            i14++;
        }
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<List<CategoryEntity>>() { // from class: com.forsale.app.datalayer.repositories.CategoryDao_Impl.33
            @Override // java.util.concurrent.Callable
            public List<CategoryEntity> call() throws Exception {
                AnonymousClass33 anonymousClass33;
                Integer valueOf;
                int i15;
                String string;
                int i16;
                String string2;
                int i17;
                String string3;
                int i18;
                String string4;
                int i19;
                String string5;
                int i21;
                int i22;
                int i23;
                String string6;
                int i24;
                String string7;
                int i25;
                String string8;
                int i26;
                Integer valueOf2;
                int i27;
                String string9;
                int i28;
                String string10;
                int i29;
                String string11;
                int i31;
                String string12;
                int i32;
                String string13;
                int i33;
                String string14;
                Cursor c11 = j4.b.c(CategoryDao_Impl.this.__db, i13, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "region_id");
                    int e13 = j4.a.e(c11, "system_name");
                    int e14 = j4.a.e(c11, "name_en");
                    int e15 = j4.a.e(c11, "name_ar");
                    int e16 = j4.a.e(c11, "image");
                    int e17 = j4.a.e(c11, "parent_id");
                    int e18 = j4.a.e(c11, "display_order");
                    int e19 = j4.a.e(c11, CategoryEntity.ALLOW_UPLOADING);
                    int e21 = j4.a.e(c11, CategoryEntity.IS_FILTERABLE);
                    int e22 = j4.a.e(c11, CategoryEntity.STEPS);
                    int e23 = j4.a.e(c11, "promote_animation");
                    int e24 = j4.a.e(c11, CategoryEntity.IS_ALTERNATE_VIEW);
                    int e25 = j4.a.e(c11, CategoryEntity.ALLOW_SEARCH);
                    try {
                        int e26 = j4.a.e(c11, CategoryEntity.ATTRIBUTE_VALUES);
                        int e27 = j4.a.e(c11, CategoryEntity.IS_EXPENDABLE);
                        int e28 = j4.a.e(c11, CategoryEntity.ALLOW_DISTRICT_FILTERING);
                        int e29 = j4.a.e(c11, CategoryEntity.HAS_PLANS);
                        int e31 = j4.a.e(c11, CategoryEntity.FILTERABLE_LABEL_EN);
                        int e32 = j4.a.e(c11, CategoryEntity.FILTERABLE_LABEL_AR);
                        int e33 = j4.a.e(c11, CategoryEntity.RULE_SET);
                        int e34 = j4.a.e(c11, CategoryEntity.CLASSIFICATION);
                        int e35 = j4.a.e(c11, CategoryEntity.ALLOW_POWER_PIN_VIEW);
                        int e36 = j4.a.e(c11, CategoryEntity.ALLOW_POWER_PIN_ADD);
                        int e37 = j4.a.e(c11, CategoryEntity.FULL_PATH);
                        int e38 = j4.a.e(c11, "category_type");
                        int e39 = j4.a.e(c11, "filtering_classification_ar");
                        int e41 = j4.a.e(c11, "filtering_classification_en");
                        int e42 = j4.a.e(c11, "is_indexed");
                        int e43 = j4.a.e(c11, CategoryEntity.VERTICAL_IMAGE);
                        int e44 = j4.a.e(c11, "max_home_top_banners");
                        int e45 = j4.a.e(c11, "relatives");
                        int e46 = j4.a.e(c11, CategoryEntity.FEATURED_IMAGE);
                        int e47 = j4.a.e(c11, "is_alt_cat");
                        int e48 = j4.a.e(c11, CategoryEntity.FILTRATION_SETTINGS);
                        int e49 = j4.a.e(c11, CategoryEntity.SECTIONS);
                        int e50 = j4.a.e(c11, CategoryEntity.SLUG);
                        int i34 = e25;
                        ArrayList arrayList = new ArrayList(c11.getCount());
                        while (c11.moveToNext()) {
                            int i35 = c11.getInt(e11);
                            int i36 = c11.getInt(e12);
                            String string15 = c11.isNull(e13) ? null : c11.getString(e13);
                            String string16 = c11.isNull(e14) ? null : c11.getString(e14);
                            String string17 = c11.isNull(e15) ? null : c11.getString(e15);
                            String string18 = c11.isNull(e16) ? null : c11.getString(e16);
                            int i37 = c11.getInt(e17);
                            int i38 = c11.getInt(e18);
                            int i39 = c11.getInt(e19);
                            int i41 = c11.getInt(e21);
                            int i42 = c11.getInt(e22);
                            String string19 = c11.isNull(e23) ? null : c11.getString(e23);
                            if (c11.isNull(e24)) {
                                i15 = i34;
                                valueOf = null;
                            } else {
                                valueOf = Integer.valueOf(c11.getInt(e24));
                                i15 = i34;
                            }
                            Integer valueOf3 = c11.isNull(i15) ? null : Integer.valueOf(c11.getInt(i15));
                            int i43 = e26;
                            int i44 = e11;
                            String string20 = c11.isNull(i43) ? null : c11.getString(i43);
                            int i45 = e27;
                            Integer valueOf4 = c11.isNull(i45) ? null : Integer.valueOf(c11.getInt(i45));
                            int i46 = e28;
                            int i47 = c11.getInt(i46);
                            int i48 = e29;
                            int i49 = c11.getInt(i48);
                            e29 = i48;
                            int i50 = e31;
                            if (c11.isNull(i50)) {
                                e31 = i50;
                                i16 = e32;
                                string = null;
                            } else {
                                string = c11.getString(i50);
                                e31 = i50;
                                i16 = e32;
                            }
                            if (c11.isNull(i16)) {
                                e32 = i16;
                                i17 = e33;
                                string2 = null;
                            } else {
                                string2 = c11.getString(i16);
                                e32 = i16;
                                i17 = e33;
                            }
                            if (c11.isNull(i17)) {
                                e33 = i17;
                                i18 = e34;
                                string3 = null;
                            } else {
                                string3 = c11.getString(i17);
                                e33 = i17;
                                i18 = e34;
                            }
                            if (c11.isNull(i18)) {
                                e34 = i18;
                                i19 = e35;
                                string4 = null;
                            } else {
                                string4 = c11.getString(i18);
                                e34 = i18;
                                i19 = e35;
                            }
                            int i51 = c11.getInt(i19);
                            e35 = i19;
                            int i52 = e36;
                            int i53 = c11.getInt(i52);
                            e36 = i52;
                            int i54 = e37;
                            if (c11.isNull(i54)) {
                                e37 = i54;
                                i21 = e38;
                                string5 = null;
                            } else {
                                string5 = c11.getString(i54);
                                e37 = i54;
                                i21 = e38;
                            }
                            if (c11.isNull(i21)) {
                                i22 = i21;
                                i24 = e12;
                                i23 = i15;
                                string6 = null;
                            } else {
                                i22 = i21;
                                i23 = i15;
                                string6 = c11.getString(i21);
                                i24 = e12;
                            }
                            anonymousClass33 = this;
                            try {
                                CategoryEntity.CategoryType categoryType = CategoryDao_Impl.this.__categoryTypeConverter.toCategoryType(string6);
                                int i55 = e39;
                                if (c11.isNull(i55)) {
                                    i25 = e41;
                                    string7 = null;
                                } else {
                                    string7 = c11.getString(i55);
                                    i25 = e41;
                                }
                                if (c11.isNull(i25)) {
                                    e39 = i55;
                                    i26 = e42;
                                    string8 = null;
                                } else {
                                    string8 = c11.getString(i25);
                                    e39 = i55;
                                    i26 = e42;
                                }
                                if (c11.isNull(i26)) {
                                    e42 = i26;
                                    i27 = e43;
                                    valueOf2 = null;
                                } else {
                                    e42 = i26;
                                    valueOf2 = Integer.valueOf(c11.getInt(i26));
                                    i27 = e43;
                                }
                                if (c11.isNull(i27)) {
                                    e43 = i27;
                                    i28 = e44;
                                    string9 = null;
                                } else {
                                    e43 = i27;
                                    string9 = c11.getString(i27);
                                    i28 = e44;
                                }
                                int i56 = c11.getInt(i28);
                                e44 = i28;
                                int i57 = e45;
                                if (c11.isNull(i57)) {
                                    e45 = i57;
                                    i29 = e46;
                                    string10 = null;
                                } else {
                                    e45 = i57;
                                    string10 = c11.getString(i57);
                                    i29 = e46;
                                }
                                if (c11.isNull(i29)) {
                                    e46 = i29;
                                    i31 = e47;
                                    string11 = null;
                                } else {
                                    e46 = i29;
                                    string11 = c11.getString(i29);
                                    i31 = e47;
                                }
                                int i58 = c11.getInt(i31);
                                e47 = i31;
                                int i59 = e48;
                                if (c11.isNull(i59)) {
                                    e48 = i59;
                                    i32 = e49;
                                    string12 = null;
                                } else {
                                    e48 = i59;
                                    string12 = c11.getString(i59);
                                    i32 = e49;
                                }
                                if (c11.isNull(i32)) {
                                    e49 = i32;
                                    i33 = e50;
                                    string13 = null;
                                } else {
                                    e49 = i32;
                                    string13 = c11.getString(i32);
                                    i33 = e50;
                                }
                                if (c11.isNull(i33)) {
                                    e50 = i33;
                                    string14 = null;
                                } else {
                                    e50 = i33;
                                    string14 = c11.getString(i33);
                                }
                                arrayList.add(new CategoryEntity(i35, i36, string15, string16, string17, string18, i37, i38, i39, i41, i42, string19, valueOf, valueOf3, string20, valueOf4, i47, i49, string, string2, string3, string4, i51, i53, string5, categoryType, string7, string8, valueOf2, string9, i56, string10, string11, i58, string12, string13, string14));
                                e41 = i25;
                                e11 = i44;
                                e26 = i43;
                                e27 = i45;
                                e12 = i24;
                                e28 = i46;
                                e38 = i22;
                                i34 = i23;
                            } catch (Throwable th2) {
                                th = th2;
                                c11.close();
                                i13.release();
                                throw th;
                            }
                        }
                        c11.close();
                        i13.release();
                        return arrayList;
                    } catch (Throwable th3) {
                        th = th3;
                        anonymousClass33 = this;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    anonymousClass33 = this;
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.CategoryDao
    public LiveData<List<CategoryEntity>> getCategoriesByParentIdLiveData(int i11, int i12) {
        final v i13 = v.i("SELECT * FROM  categories WHERE region_id == ? AND parent_id == ? ORDER BY display_order", 2);
        i13.d1(1, i11);
        i13.d1(2, i12);
        return this.__db.getInvalidationTracker().e(new String[]{CategoryEntity.CATEGORIES_TABLE}, false, new Callable<List<CategoryEntity>>() { // from class: com.forsale.app.datalayer.repositories.CategoryDao_Impl.21
            protected void finalize() {
                i13.release();
            }

            @Override // java.util.concurrent.Callable
            public List<CategoryEntity> call() throws Exception {
                Integer valueOf;
                int i14;
                String string;
                int i15;
                String string2;
                int i16;
                String string3;
                int i17;
                String string4;
                int i18;
                String string5;
                int i19;
                int i21;
                int i22;
                String string6;
                int i23;
                String string7;
                int i24;
                String string8;
                int i25;
                Integer valueOf2;
                int i26;
                String string9;
                int i27;
                String string10;
                int i28;
                String string11;
                int i29;
                String string12;
                int i31;
                String string13;
                int i32;
                String string14;
                Cursor c11 = j4.b.c(CategoryDao_Impl.this.__db, i13, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "region_id");
                    int e13 = j4.a.e(c11, "system_name");
                    int e14 = j4.a.e(c11, "name_en");
                    int e15 = j4.a.e(c11, "name_ar");
                    int e16 = j4.a.e(c11, "image");
                    int e17 = j4.a.e(c11, "parent_id");
                    int e18 = j4.a.e(c11, "display_order");
                    int e19 = j4.a.e(c11, CategoryEntity.ALLOW_UPLOADING);
                    int e21 = j4.a.e(c11, CategoryEntity.IS_FILTERABLE);
                    int e22 = j4.a.e(c11, CategoryEntity.STEPS);
                    int e23 = j4.a.e(c11, "promote_animation");
                    int e24 = j4.a.e(c11, CategoryEntity.IS_ALTERNATE_VIEW);
                    int e25 = j4.a.e(c11, CategoryEntity.ALLOW_SEARCH);
                    try {
                        int e26 = j4.a.e(c11, CategoryEntity.ATTRIBUTE_VALUES);
                        int e27 = j4.a.e(c11, CategoryEntity.IS_EXPENDABLE);
                        int e28 = j4.a.e(c11, CategoryEntity.ALLOW_DISTRICT_FILTERING);
                        int e29 = j4.a.e(c11, CategoryEntity.HAS_PLANS);
                        int e31 = j4.a.e(c11, CategoryEntity.FILTERABLE_LABEL_EN);
                        int e32 = j4.a.e(c11, CategoryEntity.FILTERABLE_LABEL_AR);
                        int e33 = j4.a.e(c11, CategoryEntity.RULE_SET);
                        int e34 = j4.a.e(c11, CategoryEntity.CLASSIFICATION);
                        int e35 = j4.a.e(c11, CategoryEntity.ALLOW_POWER_PIN_VIEW);
                        int e36 = j4.a.e(c11, CategoryEntity.ALLOW_POWER_PIN_ADD);
                        int e37 = j4.a.e(c11, CategoryEntity.FULL_PATH);
                        int e38 = j4.a.e(c11, "category_type");
                        int e39 = j4.a.e(c11, "filtering_classification_ar");
                        int e41 = j4.a.e(c11, "filtering_classification_en");
                        int e42 = j4.a.e(c11, "is_indexed");
                        int e43 = j4.a.e(c11, CategoryEntity.VERTICAL_IMAGE);
                        int e44 = j4.a.e(c11, "max_home_top_banners");
                        int e45 = j4.a.e(c11, "relatives");
                        int e46 = j4.a.e(c11, CategoryEntity.FEATURED_IMAGE);
                        int e47 = j4.a.e(c11, "is_alt_cat");
                        int e48 = j4.a.e(c11, CategoryEntity.FILTRATION_SETTINGS);
                        int e49 = j4.a.e(c11, CategoryEntity.SECTIONS);
                        int e50 = j4.a.e(c11, CategoryEntity.SLUG);
                        int i33 = e25;
                        ArrayList arrayList = new ArrayList(c11.getCount());
                        while (c11.moveToNext()) {
                            int i34 = c11.getInt(e11);
                            int i35 = c11.getInt(e12);
                            String string15 = c11.isNull(e13) ? null : c11.getString(e13);
                            String string16 = c11.isNull(e14) ? null : c11.getString(e14);
                            String string17 = c11.isNull(e15) ? null : c11.getString(e15);
                            String string18 = c11.isNull(e16) ? null : c11.getString(e16);
                            int i36 = c11.getInt(e17);
                            int i37 = c11.getInt(e18);
                            int i38 = c11.getInt(e19);
                            int i39 = c11.getInt(e21);
                            int i41 = c11.getInt(e22);
                            String string19 = c11.isNull(e23) ? null : c11.getString(e23);
                            if (c11.isNull(e24)) {
                                i14 = i33;
                                valueOf = null;
                            } else {
                                valueOf = Integer.valueOf(c11.getInt(e24));
                                i14 = i33;
                            }
                            Integer valueOf3 = c11.isNull(i14) ? null : Integer.valueOf(c11.getInt(i14));
                            int i42 = e26;
                            int i43 = e11;
                            String string20 = c11.isNull(i42) ? null : c11.getString(i42);
                            int i44 = e27;
                            Integer valueOf4 = c11.isNull(i44) ? null : Integer.valueOf(c11.getInt(i44));
                            int i45 = e28;
                            int i46 = c11.getInt(i45);
                            int i47 = e29;
                            int i48 = c11.getInt(i47);
                            e29 = i47;
                            int i49 = e31;
                            if (c11.isNull(i49)) {
                                e31 = i49;
                                i15 = e32;
                                string = null;
                            } else {
                                string = c11.getString(i49);
                                e31 = i49;
                                i15 = e32;
                            }
                            if (c11.isNull(i15)) {
                                e32 = i15;
                                i16 = e33;
                                string2 = null;
                            } else {
                                string2 = c11.getString(i15);
                                e32 = i15;
                                i16 = e33;
                            }
                            if (c11.isNull(i16)) {
                                e33 = i16;
                                i17 = e34;
                                string3 = null;
                            } else {
                                string3 = c11.getString(i16);
                                e33 = i16;
                                i17 = e34;
                            }
                            if (c11.isNull(i17)) {
                                e34 = i17;
                                i18 = e35;
                                string4 = null;
                            } else {
                                string4 = c11.getString(i17);
                                e34 = i17;
                                i18 = e35;
                            }
                            int i50 = c11.getInt(i18);
                            e35 = i18;
                            int i51 = e36;
                            int i52 = c11.getInt(i51);
                            e36 = i51;
                            int i53 = e37;
                            if (c11.isNull(i53)) {
                                e37 = i53;
                                i19 = e38;
                                string5 = null;
                            } else {
                                string5 = c11.getString(i53);
                                e37 = i53;
                                i19 = e38;
                            }
                            if (c11.isNull(i19)) {
                                i21 = i19;
                                i23 = e12;
                                i22 = i14;
                                string6 = null;
                            } else {
                                i21 = i19;
                                i22 = i14;
                                string6 = c11.getString(i19);
                                i23 = e12;
                            }
                            try {
                                CategoryEntity.CategoryType categoryType = CategoryDao_Impl.this.__categoryTypeConverter.toCategoryType(string6);
                                int i54 = e39;
                                if (c11.isNull(i54)) {
                                    i24 = e41;
                                    string7 = null;
                                } else {
                                    string7 = c11.getString(i54);
                                    i24 = e41;
                                }
                                if (c11.isNull(i24)) {
                                    e39 = i54;
                                    i25 = e42;
                                    string8 = null;
                                } else {
                                    string8 = c11.getString(i24);
                                    e39 = i54;
                                    i25 = e42;
                                }
                                if (c11.isNull(i25)) {
                                    e42 = i25;
                                    i26 = e43;
                                    valueOf2 = null;
                                } else {
                                    e42 = i25;
                                    valueOf2 = Integer.valueOf(c11.getInt(i25));
                                    i26 = e43;
                                }
                                if (c11.isNull(i26)) {
                                    e43 = i26;
                                    i27 = e44;
                                    string9 = null;
                                } else {
                                    e43 = i26;
                                    string9 = c11.getString(i26);
                                    i27 = e44;
                                }
                                int i55 = c11.getInt(i27);
                                e44 = i27;
                                int i56 = e45;
                                if (c11.isNull(i56)) {
                                    e45 = i56;
                                    i28 = e46;
                                    string10 = null;
                                } else {
                                    e45 = i56;
                                    string10 = c11.getString(i56);
                                    i28 = e46;
                                }
                                if (c11.isNull(i28)) {
                                    e46 = i28;
                                    i29 = e47;
                                    string11 = null;
                                } else {
                                    e46 = i28;
                                    string11 = c11.getString(i28);
                                    i29 = e47;
                                }
                                int i57 = c11.getInt(i29);
                                e47 = i29;
                                int i58 = e48;
                                if (c11.isNull(i58)) {
                                    e48 = i58;
                                    i31 = e49;
                                    string12 = null;
                                } else {
                                    e48 = i58;
                                    string12 = c11.getString(i58);
                                    i31 = e49;
                                }
                                if (c11.isNull(i31)) {
                                    e49 = i31;
                                    i32 = e50;
                                    string13 = null;
                                } else {
                                    e49 = i31;
                                    string13 = c11.getString(i31);
                                    i32 = e50;
                                }
                                if (c11.isNull(i32)) {
                                    e50 = i32;
                                    string14 = null;
                                } else {
                                    e50 = i32;
                                    string14 = c11.getString(i32);
                                }
                                arrayList.add(new CategoryEntity(i34, i35, string15, string16, string17, string18, i36, i37, i38, i39, i41, string19, valueOf, valueOf3, string20, valueOf4, i46, i48, string, string2, string3, string4, i50, i52, string5, categoryType, string7, string8, valueOf2, string9, i55, string10, string11, i57, string12, string13, string14));
                                e41 = i24;
                                e11 = i43;
                                e26 = i42;
                                e27 = i44;
                                e12 = i23;
                                e28 = i45;
                                e38 = i21;
                                i33 = i22;
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

    @Override // com.forsale.app.datalayer.repositories.CategoryDao
    public Object getCategoriesCousins(final l lVar, zz.a<? super List<CousinCategory>> aVar) {
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<List<CousinCategory>>() { // from class: com.forsale.app.datalayer.repositories.CategoryDao_Impl.35
            @Override // java.util.concurrent.Callable
            public List<CousinCategory> call() throws Exception {
                Cursor c11 = j4.b.c(CategoryDao_Impl.this.__db, lVar, false, null);
                try {
                    ArrayList arrayList = new ArrayList(c11.getCount());
                    while (c11.moveToNext()) {
                        arrayList.add(CategoryDao_Impl.this.__entityCursorConverter_comForsaleAppDatalayerDatabaseCousinCategory(c11));
                    }
                    return arrayList;
                } finally {
                    c11.close();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.CategoryDao
    public Object getCategoriesIdsInParentIds(int i11, List<Integer> list, zz.a<? super List<Integer>> aVar) {
        StringBuilder b11 = e.b();
        b11.append("SELECT categories.id from categories WHERE region_id == ");
        b11.append("?");
        b11.append(" AND parent_id in (");
        int size = list.size();
        e.a(b11, size);
        b11.append(") ORDER BY display_order");
        final v i12 = v.i(b11.toString(), size + 1);
        i12.d1(1, i11);
        int i13 = 2;
        for (Integer num : list) {
            if (num == null) {
                i12.u1(i13);
            } else {
                i12.d1(i13, num.intValue());
            }
            i13++;
        }
        return CoroutinesRoom.b(this.__db, true, j4.b.a(), new Callable<List<Integer>>() { // from class: com.forsale.app.datalayer.repositories.CategoryDao_Impl.26
            @Override // java.util.concurrent.Callable
            public List<Integer> call() throws Exception {
                CategoryDao_Impl.this.__db.beginTransaction();
                try {
                    Cursor c11 = j4.b.c(CategoryDao_Impl.this.__db, i12, false, null);
                    ArrayList arrayList = new ArrayList(c11.getCount());
                    while (c11.moveToNext()) {
                        arrayList.add(c11.isNull(0) ? null : Integer.valueOf(c11.getInt(0)));
                    }
                    CategoryDao_Impl.this.__db.setTransactionSuccessful();
                    c11.close();
                    i12.release();
                    return arrayList;
                } finally {
                    CategoryDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.CategoryDao
    public Object getCategoriesInParentIds(int i11, List<Integer> list, zz.a<? super List<CategoryView>> aVar) {
        StringBuilder b11 = e.b();
        b11.append("SELECT id, region_id, parent_id, name_en, name_ar, display_order from categories WHERE region_id == ");
        b11.append("?");
        b11.append(" AND parent_id in (");
        int size = list.size();
        e.a(b11, size);
        b11.append(") ORDER BY display_order");
        final v i12 = v.i(b11.toString(), size + 1);
        i12.d1(1, i11);
        int i13 = 2;
        for (Integer num : list) {
            if (num == null) {
                i12.u1(i13);
            } else {
                i12.d1(i13, num.intValue());
            }
            i13++;
        }
        return CoroutinesRoom.b(this.__db, true, j4.b.a(), new Callable<List<CategoryView>>() { // from class: com.forsale.app.datalayer.repositories.CategoryDao_Impl.25
            @Override // java.util.concurrent.Callable
            public List<CategoryView> call() throws Exception {
                CategoryDao_Impl.this.__db.beginTransaction();
                try {
                    Cursor c11 = j4.b.c(CategoryDao_Impl.this.__db, i12, false, null);
                    ArrayList arrayList = new ArrayList(c11.getCount());
                    while (c11.moveToNext()) {
                        arrayList.add(new CategoryView(c11.getInt(0), c11.getInt(1), c11.getInt(2), c11.isNull(3) ? null : c11.getString(3), c11.isNull(4) ? null : c11.getString(4), c11.getInt(5)));
                    }
                    CategoryDao_Impl.this.__db.setTransactionSuccessful();
                    c11.close();
                    i12.release();
                    return arrayList;
                } finally {
                    CategoryDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.CategoryDao
    public Object getCategoriesNameEnByIds(List<Integer> list, zz.a<? super List<String>> aVar) {
        StringBuilder b11 = e.b();
        b11.append("SELECT categories.name_en FROM categories where id in (");
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
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<List<String>>() { // from class: com.forsale.app.datalayer.repositories.CategoryDao_Impl.22
            @Override // java.util.concurrent.Callable
            public List<String> call() throws Exception {
                Cursor c11 = j4.b.c(CategoryDao_Impl.this.__db, i11, false, null);
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

    @Override // com.forsale.app.datalayer.repositories.CategoryDao
    public Object getCategoriesNestedByCategoryId(final l lVar, zz.a<? super List<String>> aVar) {
        return CoroutinesRoom.b(this.__db, true, j4.b.a(), new Callable<List<String>>() { // from class: com.forsale.app.datalayer.repositories.CategoryDao_Impl.34
            @Override // java.util.concurrent.Callable
            public List<String> call() throws Exception {
                CategoryDao_Impl.this.__db.beginTransaction();
                try {
                    Cursor c11 = j4.b.c(CategoryDao_Impl.this.__db, lVar, false, null);
                    ArrayList arrayList = new ArrayList(c11.getCount());
                    while (c11.moveToNext()) {
                        arrayList.add(c11.isNull(0) ? null : c11.getString(0));
                    }
                    CategoryDao_Impl.this.__db.setTransactionSuccessful();
                    c11.close();
                    return arrayList;
                } finally {
                    CategoryDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.CategoryDao
    public Object getCategoriesParentIdsNotInChildrenParentsQuery(final l lVar, zz.a<? super List<Integer>> aVar) {
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<List<Integer>>() { // from class: com.forsale.app.datalayer.repositories.CategoryDao_Impl.36
            @Override // java.util.concurrent.Callable
            public List<Integer> call() throws Exception {
                Cursor c11 = j4.b.c(CategoryDao_Impl.this.__db, lVar, false, null);
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

    @Override // com.forsale.app.datalayer.repositories.CategoryDao
    public Object getCategoryAndParentCategoryName(int i11, zz.a<? super CategoryAndParentCategoryNamesView> aVar) {
        final v i12 = v.i("SELECT c.name_en, c.name_ar, p.name_en AS parent_name_en, p.name_ar AS parent_name_ar FROM categories c LEFT JOIN categories p ON c.parent_id = p.id WHERE c.id = ?", 1);
        i12.d1(1, i11);
        return CoroutinesRoom.b(this.__db, true, j4.b.a(), new Callable<CategoryAndParentCategoryNamesView>() { // from class: com.forsale.app.datalayer.repositories.CategoryDao_Impl.30
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public CategoryAndParentCategoryNamesView call() throws Exception {
                CategoryDao_Impl.this.__db.beginTransaction();
                try {
                    CategoryAndParentCategoryNamesView categoryAndParentCategoryNamesView = null;
                    String string = null;
                    Cursor c11 = j4.b.c(CategoryDao_Impl.this.__db, i12, false, null);
                    if (c11.moveToFirst()) {
                        String string2 = c11.isNull(0) ? null : c11.getString(0);
                        String string3 = c11.isNull(1) ? null : c11.getString(1);
                        String string4 = c11.isNull(2) ? null : c11.getString(2);
                        if (!c11.isNull(3)) {
                            string = c11.getString(3);
                        }
                        categoryAndParentCategoryNamesView = new CategoryAndParentCategoryNamesView(string2, string3, string4, string);
                    }
                    CategoryDao_Impl.this.__db.setTransactionSuccessful();
                    c11.close();
                    i12.release();
                    return categoryAndParentCategoryNamesView;
                } finally {
                    CategoryDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.CategoryDao
    public Object getCategoryById(int i11, zz.a<? super CategoryEntity> aVar) {
        final v i12 = v.i("SELECT * FROM  categories WHERE id == ?", 1);
        i12.d1(1, i11);
        return CoroutinesRoom.b(this.__db, true, j4.b.a(), new Callable<CategoryEntity>() { // from class: com.forsale.app.datalayer.repositories.CategoryDao_Impl.12
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public CategoryEntity call() throws Exception {
                AnonymousClass12 anonymousClass12;
                CategoryEntity categoryEntity;
                Integer valueOf;
                int i13;
                String string;
                int i14;
                Integer valueOf2;
                int i15;
                String string2;
                int i16;
                String string3;
                int i17;
                String string4;
                int i18;
                String string5;
                int i19;
                String string6;
                int i21;
                String string7;
                int i22;
                String string8;
                int i23;
                Integer valueOf3;
                int i24;
                String string9;
                int i25;
                String string10;
                int i26;
                String string11;
                int i27;
                String string12;
                int i28;
                CategoryDao_Impl.this.__db.beginTransaction();
                try {
                    try {
                        Cursor c11 = j4.b.c(CategoryDao_Impl.this.__db, i12, false, null);
                        try {
                            int e11 = j4.a.e(c11, "id");
                            int e12 = j4.a.e(c11, "region_id");
                            int e13 = j4.a.e(c11, "system_name");
                            int e14 = j4.a.e(c11, "name_en");
                            int e15 = j4.a.e(c11, "name_ar");
                            int e16 = j4.a.e(c11, "image");
                            int e17 = j4.a.e(c11, "parent_id");
                            int e18 = j4.a.e(c11, "display_order");
                            int e19 = j4.a.e(c11, CategoryEntity.ALLOW_UPLOADING);
                            int e21 = j4.a.e(c11, CategoryEntity.IS_FILTERABLE);
                            int e22 = j4.a.e(c11, CategoryEntity.STEPS);
                            int e23 = j4.a.e(c11, "promote_animation");
                            int e24 = j4.a.e(c11, CategoryEntity.IS_ALTERNATE_VIEW);
                            int e25 = j4.a.e(c11, CategoryEntity.ALLOW_SEARCH);
                            try {
                                int e26 = j4.a.e(c11, CategoryEntity.ATTRIBUTE_VALUES);
                                int e27 = j4.a.e(c11, CategoryEntity.IS_EXPENDABLE);
                                int e28 = j4.a.e(c11, CategoryEntity.ALLOW_DISTRICT_FILTERING);
                                int e29 = j4.a.e(c11, CategoryEntity.HAS_PLANS);
                                int e31 = j4.a.e(c11, CategoryEntity.FILTERABLE_LABEL_EN);
                                int e32 = j4.a.e(c11, CategoryEntity.FILTERABLE_LABEL_AR);
                                int e33 = j4.a.e(c11, CategoryEntity.RULE_SET);
                                int e34 = j4.a.e(c11, CategoryEntity.CLASSIFICATION);
                                int e35 = j4.a.e(c11, CategoryEntity.ALLOW_POWER_PIN_VIEW);
                                int e36 = j4.a.e(c11, CategoryEntity.ALLOW_POWER_PIN_ADD);
                                int e37 = j4.a.e(c11, CategoryEntity.FULL_PATH);
                                int e38 = j4.a.e(c11, "category_type");
                                int e39 = j4.a.e(c11, "filtering_classification_ar");
                                int e41 = j4.a.e(c11, "filtering_classification_en");
                                int e42 = j4.a.e(c11, "is_indexed");
                                int e43 = j4.a.e(c11, CategoryEntity.VERTICAL_IMAGE);
                                int e44 = j4.a.e(c11, "max_home_top_banners");
                                int e45 = j4.a.e(c11, "relatives");
                                int e46 = j4.a.e(c11, CategoryEntity.FEATURED_IMAGE);
                                int e47 = j4.a.e(c11, "is_alt_cat");
                                int e48 = j4.a.e(c11, CategoryEntity.FILTRATION_SETTINGS);
                                int e49 = j4.a.e(c11, CategoryEntity.SECTIONS);
                                int e50 = j4.a.e(c11, CategoryEntity.SLUG);
                                if (c11.moveToFirst()) {
                                    int i29 = c11.getInt(e11);
                                    int i31 = c11.getInt(e12);
                                    String string13 = c11.isNull(e13) ? null : c11.getString(e13);
                                    String string14 = c11.isNull(e14) ? null : c11.getString(e14);
                                    String string15 = c11.isNull(e15) ? null : c11.getString(e15);
                                    String string16 = c11.isNull(e16) ? null : c11.getString(e16);
                                    int i32 = c11.getInt(e17);
                                    int i33 = c11.getInt(e18);
                                    int i34 = c11.getInt(e19);
                                    int i35 = c11.getInt(e21);
                                    int i36 = c11.getInt(e22);
                                    String string17 = c11.isNull(e23) ? null : c11.getString(e23);
                                    Integer valueOf4 = c11.isNull(e24) ? null : Integer.valueOf(c11.getInt(e24));
                                    if (c11.isNull(e25)) {
                                        i13 = e26;
                                        valueOf = null;
                                    } else {
                                        valueOf = Integer.valueOf(c11.getInt(e25));
                                        i13 = e26;
                                    }
                                    if (c11.isNull(i13)) {
                                        i14 = e27;
                                        string = null;
                                    } else {
                                        string = c11.getString(i13);
                                        i14 = e27;
                                    }
                                    if (c11.isNull(i14)) {
                                        i15 = e28;
                                        valueOf2 = null;
                                    } else {
                                        valueOf2 = Integer.valueOf(c11.getInt(i14));
                                        i15 = e28;
                                    }
                                    int i37 = c11.getInt(i15);
                                    int i38 = c11.getInt(e29);
                                    if (c11.isNull(e31)) {
                                        i16 = e32;
                                        string2 = null;
                                    } else {
                                        string2 = c11.getString(e31);
                                        i16 = e32;
                                    }
                                    if (c11.isNull(i16)) {
                                        i17 = e33;
                                        string3 = null;
                                    } else {
                                        string3 = c11.getString(i16);
                                        i17 = e33;
                                    }
                                    if (c11.isNull(i17)) {
                                        i18 = e34;
                                        string4 = null;
                                    } else {
                                        string4 = c11.getString(i17);
                                        i18 = e34;
                                    }
                                    if (c11.isNull(i18)) {
                                        i19 = e35;
                                        string5 = null;
                                    } else {
                                        string5 = c11.getString(i18);
                                        i19 = e35;
                                    }
                                    int i39 = c11.getInt(i19);
                                    int i41 = c11.getInt(e36);
                                    if (c11.isNull(e37)) {
                                        i21 = e38;
                                        string6 = null;
                                    } else {
                                        string6 = c11.getString(e37);
                                        i21 = e38;
                                    }
                                    anonymousClass12 = this;
                                    try {
                                        CategoryEntity.CategoryType categoryType = CategoryDao_Impl.this.__categoryTypeConverter.toCategoryType(c11.isNull(i21) ? null : c11.getString(i21));
                                        if (c11.isNull(e39)) {
                                            i22 = e41;
                                            string7 = null;
                                        } else {
                                            string7 = c11.getString(e39);
                                            i22 = e41;
                                        }
                                        if (c11.isNull(i22)) {
                                            i23 = e42;
                                            string8 = null;
                                        } else {
                                            string8 = c11.getString(i22);
                                            i23 = e42;
                                        }
                                        if (c11.isNull(i23)) {
                                            i24 = e43;
                                            valueOf3 = null;
                                        } else {
                                            valueOf3 = Integer.valueOf(c11.getInt(i23));
                                            i24 = e43;
                                        }
                                        if (c11.isNull(i24)) {
                                            i25 = e44;
                                            string9 = null;
                                        } else {
                                            string9 = c11.getString(i24);
                                            i25 = e44;
                                        }
                                        int i42 = c11.getInt(i25);
                                        if (c11.isNull(e45)) {
                                            i26 = e46;
                                            string10 = null;
                                        } else {
                                            string10 = c11.getString(e45);
                                            i26 = e46;
                                        }
                                        if (c11.isNull(i26)) {
                                            i27 = e47;
                                            string11 = null;
                                        } else {
                                            string11 = c11.getString(i26);
                                            i27 = e47;
                                        }
                                        int i43 = c11.getInt(i27);
                                        if (c11.isNull(e48)) {
                                            i28 = e49;
                                            string12 = null;
                                        } else {
                                            string12 = c11.getString(e48);
                                            i28 = e49;
                                        }
                                        categoryEntity = new CategoryEntity(i29, i31, string13, string14, string15, string16, i32, i33, i34, i35, i36, string17, valueOf4, valueOf, string, valueOf2, i37, i38, string2, string3, string4, string5, i39, i41, string6, categoryType, string7, string8, valueOf3, string9, i42, string10, string11, i43, string12, c11.isNull(i28) ? null : c11.getString(i28), c11.isNull(e50) ? null : c11.getString(e50));
                                    } catch (Throwable th2) {
                                        th = th2;
                                        c11.close();
                                        i12.release();
                                        throw th;
                                    }
                                } else {
                                    anonymousClass12 = this;
                                    categoryEntity = null;
                                }
                                CategoryDao_Impl.this.__db.setTransactionSuccessful();
                                c11.close();
                                i12.release();
                                CategoryDao_Impl.this.__db.endTransaction();
                                return categoryEntity;
                            } catch (Throwable th3) {
                                th = th3;
                                anonymousClass12 = this;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            anonymousClass12 = this;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        CategoryDao_Impl.this.__db.endTransaction();
                        throw th;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    CategoryDao_Impl.this.__db.endTransaction();
                    throw th;
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.CategoryDao
    public LiveData<CategoryEntity> getCategoryByIdLiveData(int i11) {
        final v i12 = v.i("SELECT * FROM  categories WHERE id == ?", 1);
        i12.d1(1, i11);
        return this.__db.getInvalidationTracker().e(new String[]{CategoryEntity.CATEGORIES_TABLE}, false, new Callable<CategoryEntity>() { // from class: com.forsale.app.datalayer.repositories.CategoryDao_Impl.11
            protected void finalize() {
                i12.release();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public CategoryEntity call() throws Exception {
                CategoryEntity categoryEntity;
                Integer valueOf;
                int i13;
                String string;
                int i14;
                Integer valueOf2;
                int i15;
                String string2;
                int i16;
                String string3;
                int i17;
                String string4;
                int i18;
                String string5;
                int i19;
                String string6;
                int i21;
                String string7;
                int i22;
                String string8;
                int i23;
                Integer valueOf3;
                int i24;
                String string9;
                int i25;
                String string10;
                int i26;
                String string11;
                int i27;
                String string12;
                int i28;
                Cursor c11 = j4.b.c(CategoryDao_Impl.this.__db, i12, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "region_id");
                    int e13 = j4.a.e(c11, "system_name");
                    int e14 = j4.a.e(c11, "name_en");
                    int e15 = j4.a.e(c11, "name_ar");
                    int e16 = j4.a.e(c11, "image");
                    int e17 = j4.a.e(c11, "parent_id");
                    int e18 = j4.a.e(c11, "display_order");
                    int e19 = j4.a.e(c11, CategoryEntity.ALLOW_UPLOADING);
                    int e21 = j4.a.e(c11, CategoryEntity.IS_FILTERABLE);
                    int e22 = j4.a.e(c11, CategoryEntity.STEPS);
                    int e23 = j4.a.e(c11, "promote_animation");
                    int e24 = j4.a.e(c11, CategoryEntity.IS_ALTERNATE_VIEW);
                    int e25 = j4.a.e(c11, CategoryEntity.ALLOW_SEARCH);
                    try {
                        int e26 = j4.a.e(c11, CategoryEntity.ATTRIBUTE_VALUES);
                        int e27 = j4.a.e(c11, CategoryEntity.IS_EXPENDABLE);
                        int e28 = j4.a.e(c11, CategoryEntity.ALLOW_DISTRICT_FILTERING);
                        int e29 = j4.a.e(c11, CategoryEntity.HAS_PLANS);
                        int e31 = j4.a.e(c11, CategoryEntity.FILTERABLE_LABEL_EN);
                        int e32 = j4.a.e(c11, CategoryEntity.FILTERABLE_LABEL_AR);
                        int e33 = j4.a.e(c11, CategoryEntity.RULE_SET);
                        int e34 = j4.a.e(c11, CategoryEntity.CLASSIFICATION);
                        int e35 = j4.a.e(c11, CategoryEntity.ALLOW_POWER_PIN_VIEW);
                        int e36 = j4.a.e(c11, CategoryEntity.ALLOW_POWER_PIN_ADD);
                        int e37 = j4.a.e(c11, CategoryEntity.FULL_PATH);
                        int e38 = j4.a.e(c11, "category_type");
                        int e39 = j4.a.e(c11, "filtering_classification_ar");
                        int e41 = j4.a.e(c11, "filtering_classification_en");
                        int e42 = j4.a.e(c11, "is_indexed");
                        int e43 = j4.a.e(c11, CategoryEntity.VERTICAL_IMAGE);
                        int e44 = j4.a.e(c11, "max_home_top_banners");
                        int e45 = j4.a.e(c11, "relatives");
                        int e46 = j4.a.e(c11, CategoryEntity.FEATURED_IMAGE);
                        int e47 = j4.a.e(c11, "is_alt_cat");
                        int e48 = j4.a.e(c11, CategoryEntity.FILTRATION_SETTINGS);
                        int e49 = j4.a.e(c11, CategoryEntity.SECTIONS);
                        int e50 = j4.a.e(c11, CategoryEntity.SLUG);
                        if (c11.moveToFirst()) {
                            int i29 = c11.getInt(e11);
                            int i31 = c11.getInt(e12);
                            String string13 = c11.isNull(e13) ? null : c11.getString(e13);
                            String string14 = c11.isNull(e14) ? null : c11.getString(e14);
                            String string15 = c11.isNull(e15) ? null : c11.getString(e15);
                            String string16 = c11.isNull(e16) ? null : c11.getString(e16);
                            int i32 = c11.getInt(e17);
                            int i33 = c11.getInt(e18);
                            int i34 = c11.getInt(e19);
                            int i35 = c11.getInt(e21);
                            int i36 = c11.getInt(e22);
                            String string17 = c11.isNull(e23) ? null : c11.getString(e23);
                            Integer valueOf4 = c11.isNull(e24) ? null : Integer.valueOf(c11.getInt(e24));
                            if (c11.isNull(e25)) {
                                i13 = e26;
                                valueOf = null;
                            } else {
                                valueOf = Integer.valueOf(c11.getInt(e25));
                                i13 = e26;
                            }
                            if (c11.isNull(i13)) {
                                i14 = e27;
                                string = null;
                            } else {
                                string = c11.getString(i13);
                                i14 = e27;
                            }
                            if (c11.isNull(i14)) {
                                i15 = e28;
                                valueOf2 = null;
                            } else {
                                valueOf2 = Integer.valueOf(c11.getInt(i14));
                                i15 = e28;
                            }
                            int i37 = c11.getInt(i15);
                            int i38 = c11.getInt(e29);
                            if (c11.isNull(e31)) {
                                i16 = e32;
                                string2 = null;
                            } else {
                                string2 = c11.getString(e31);
                                i16 = e32;
                            }
                            if (c11.isNull(i16)) {
                                i17 = e33;
                                string3 = null;
                            } else {
                                string3 = c11.getString(i16);
                                i17 = e33;
                            }
                            if (c11.isNull(i17)) {
                                i18 = e34;
                                string4 = null;
                            } else {
                                string4 = c11.getString(i17);
                                i18 = e34;
                            }
                            if (c11.isNull(i18)) {
                                i19 = e35;
                                string5 = null;
                            } else {
                                string5 = c11.getString(i18);
                                i19 = e35;
                            }
                            int i39 = c11.getInt(i19);
                            int i41 = c11.getInt(e36);
                            if (c11.isNull(e37)) {
                                i21 = e38;
                                string6 = null;
                            } else {
                                string6 = c11.getString(e37);
                                i21 = e38;
                            }
                            try {
                                CategoryEntity.CategoryType categoryType = CategoryDao_Impl.this.__categoryTypeConverter.toCategoryType(c11.isNull(i21) ? null : c11.getString(i21));
                                if (c11.isNull(e39)) {
                                    i22 = e41;
                                    string7 = null;
                                } else {
                                    string7 = c11.getString(e39);
                                    i22 = e41;
                                }
                                if (c11.isNull(i22)) {
                                    i23 = e42;
                                    string8 = null;
                                } else {
                                    string8 = c11.getString(i22);
                                    i23 = e42;
                                }
                                if (c11.isNull(i23)) {
                                    i24 = e43;
                                    valueOf3 = null;
                                } else {
                                    valueOf3 = Integer.valueOf(c11.getInt(i23));
                                    i24 = e43;
                                }
                                if (c11.isNull(i24)) {
                                    i25 = e44;
                                    string9 = null;
                                } else {
                                    string9 = c11.getString(i24);
                                    i25 = e44;
                                }
                                int i42 = c11.getInt(i25);
                                if (c11.isNull(e45)) {
                                    i26 = e46;
                                    string10 = null;
                                } else {
                                    string10 = c11.getString(e45);
                                    i26 = e46;
                                }
                                if (c11.isNull(i26)) {
                                    i27 = e47;
                                    string11 = null;
                                } else {
                                    string11 = c11.getString(i26);
                                    i27 = e47;
                                }
                                int i43 = c11.getInt(i27);
                                if (c11.isNull(e48)) {
                                    i28 = e49;
                                    string12 = null;
                                } else {
                                    string12 = c11.getString(e48);
                                    i28 = e49;
                                }
                                categoryEntity = new CategoryEntity(i29, i31, string13, string14, string15, string16, i32, i33, i34, i35, i36, string17, valueOf4, valueOf, string, valueOf2, i37, i38, string2, string3, string4, string5, i39, i41, string6, categoryType, string7, string8, valueOf3, string9, i42, string10, string11, i43, string12, c11.isNull(i28) ? null : c11.getString(i28), c11.isNull(e50) ? null : c11.getString(e50));
                            } catch (Throwable th2) {
                                th = th2;
                                c11.close();
                                throw th;
                            }
                        } else {
                            categoryEntity = null;
                        }
                        c11.close();
                        return categoryEntity;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        });
    }

    @Override // com.forsale.app.datalayer.repositories.CategoryDao
    public Object getCategoryBySlug(String str, zz.a<? super CategoryEntity> aVar) {
        final v i11 = v.i("SELECT * FROM  categories WHERE slug == ?", 1);
        if (str == null) {
            i11.u1(1);
        } else {
            i11.Q0(1, str);
        }
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<CategoryEntity>() { // from class: com.forsale.app.datalayer.repositories.CategoryDao_Impl.31
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public CategoryEntity call() throws Exception {
                AnonymousClass31 anonymousClass31;
                CategoryEntity categoryEntity;
                Integer valueOf;
                int i12;
                String string;
                int i13;
                Integer valueOf2;
                int i14;
                String string2;
                int i15;
                String string3;
                int i16;
                String string4;
                int i17;
                String string5;
                int i18;
                String string6;
                int i19;
                String string7;
                int i21;
                String string8;
                int i22;
                Integer valueOf3;
                int i23;
                String string9;
                int i24;
                String string10;
                int i25;
                String string11;
                int i26;
                String string12;
                int i27;
                Cursor c11 = j4.b.c(CategoryDao_Impl.this.__db, i11, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "region_id");
                    int e13 = j4.a.e(c11, "system_name");
                    int e14 = j4.a.e(c11, "name_en");
                    int e15 = j4.a.e(c11, "name_ar");
                    int e16 = j4.a.e(c11, "image");
                    int e17 = j4.a.e(c11, "parent_id");
                    int e18 = j4.a.e(c11, "display_order");
                    int e19 = j4.a.e(c11, CategoryEntity.ALLOW_UPLOADING);
                    int e21 = j4.a.e(c11, CategoryEntity.IS_FILTERABLE);
                    int e22 = j4.a.e(c11, CategoryEntity.STEPS);
                    int e23 = j4.a.e(c11, "promote_animation");
                    int e24 = j4.a.e(c11, CategoryEntity.IS_ALTERNATE_VIEW);
                    int e25 = j4.a.e(c11, CategoryEntity.ALLOW_SEARCH);
                    try {
                        int e26 = j4.a.e(c11, CategoryEntity.ATTRIBUTE_VALUES);
                        int e27 = j4.a.e(c11, CategoryEntity.IS_EXPENDABLE);
                        int e28 = j4.a.e(c11, CategoryEntity.ALLOW_DISTRICT_FILTERING);
                        int e29 = j4.a.e(c11, CategoryEntity.HAS_PLANS);
                        int e31 = j4.a.e(c11, CategoryEntity.FILTERABLE_LABEL_EN);
                        int e32 = j4.a.e(c11, CategoryEntity.FILTERABLE_LABEL_AR);
                        int e33 = j4.a.e(c11, CategoryEntity.RULE_SET);
                        int e34 = j4.a.e(c11, CategoryEntity.CLASSIFICATION);
                        int e35 = j4.a.e(c11, CategoryEntity.ALLOW_POWER_PIN_VIEW);
                        int e36 = j4.a.e(c11, CategoryEntity.ALLOW_POWER_PIN_ADD);
                        int e37 = j4.a.e(c11, CategoryEntity.FULL_PATH);
                        int e38 = j4.a.e(c11, "category_type");
                        int e39 = j4.a.e(c11, "filtering_classification_ar");
                        int e41 = j4.a.e(c11, "filtering_classification_en");
                        int e42 = j4.a.e(c11, "is_indexed");
                        int e43 = j4.a.e(c11, CategoryEntity.VERTICAL_IMAGE);
                        int e44 = j4.a.e(c11, "max_home_top_banners");
                        int e45 = j4.a.e(c11, "relatives");
                        int e46 = j4.a.e(c11, CategoryEntity.FEATURED_IMAGE);
                        int e47 = j4.a.e(c11, "is_alt_cat");
                        int e48 = j4.a.e(c11, CategoryEntity.FILTRATION_SETTINGS);
                        int e49 = j4.a.e(c11, CategoryEntity.SECTIONS);
                        int e50 = j4.a.e(c11, CategoryEntity.SLUG);
                        if (c11.moveToFirst()) {
                            int i28 = c11.getInt(e11);
                            int i29 = c11.getInt(e12);
                            String string13 = c11.isNull(e13) ? null : c11.getString(e13);
                            String string14 = c11.isNull(e14) ? null : c11.getString(e14);
                            String string15 = c11.isNull(e15) ? null : c11.getString(e15);
                            String string16 = c11.isNull(e16) ? null : c11.getString(e16);
                            int i31 = c11.getInt(e17);
                            int i32 = c11.getInt(e18);
                            int i33 = c11.getInt(e19);
                            int i34 = c11.getInt(e21);
                            int i35 = c11.getInt(e22);
                            String string17 = c11.isNull(e23) ? null : c11.getString(e23);
                            Integer valueOf4 = c11.isNull(e24) ? null : Integer.valueOf(c11.getInt(e24));
                            if (c11.isNull(e25)) {
                                i12 = e26;
                                valueOf = null;
                            } else {
                                valueOf = Integer.valueOf(c11.getInt(e25));
                                i12 = e26;
                            }
                            if (c11.isNull(i12)) {
                                i13 = e27;
                                string = null;
                            } else {
                                string = c11.getString(i12);
                                i13 = e27;
                            }
                            if (c11.isNull(i13)) {
                                i14 = e28;
                                valueOf2 = null;
                            } else {
                                valueOf2 = Integer.valueOf(c11.getInt(i13));
                                i14 = e28;
                            }
                            int i36 = c11.getInt(i14);
                            int i37 = c11.getInt(e29);
                            if (c11.isNull(e31)) {
                                i15 = e32;
                                string2 = null;
                            } else {
                                string2 = c11.getString(e31);
                                i15 = e32;
                            }
                            if (c11.isNull(i15)) {
                                i16 = e33;
                                string3 = null;
                            } else {
                                string3 = c11.getString(i15);
                                i16 = e33;
                            }
                            if (c11.isNull(i16)) {
                                i17 = e34;
                                string4 = null;
                            } else {
                                string4 = c11.getString(i16);
                                i17 = e34;
                            }
                            if (c11.isNull(i17)) {
                                i18 = e35;
                                string5 = null;
                            } else {
                                string5 = c11.getString(i17);
                                i18 = e35;
                            }
                            int i38 = c11.getInt(i18);
                            int i39 = c11.getInt(e36);
                            if (c11.isNull(e37)) {
                                i19 = e38;
                                string6 = null;
                            } else {
                                string6 = c11.getString(e37);
                                i19 = e38;
                            }
                            anonymousClass31 = this;
                            try {
                                CategoryEntity.CategoryType categoryType = CategoryDao_Impl.this.__categoryTypeConverter.toCategoryType(c11.isNull(i19) ? null : c11.getString(i19));
                                if (c11.isNull(e39)) {
                                    i21 = e41;
                                    string7 = null;
                                } else {
                                    string7 = c11.getString(e39);
                                    i21 = e41;
                                }
                                if (c11.isNull(i21)) {
                                    i22 = e42;
                                    string8 = null;
                                } else {
                                    string8 = c11.getString(i21);
                                    i22 = e42;
                                }
                                if (c11.isNull(i22)) {
                                    i23 = e43;
                                    valueOf3 = null;
                                } else {
                                    valueOf3 = Integer.valueOf(c11.getInt(i22));
                                    i23 = e43;
                                }
                                if (c11.isNull(i23)) {
                                    i24 = e44;
                                    string9 = null;
                                } else {
                                    string9 = c11.getString(i23);
                                    i24 = e44;
                                }
                                int i41 = c11.getInt(i24);
                                if (c11.isNull(e45)) {
                                    i25 = e46;
                                    string10 = null;
                                } else {
                                    string10 = c11.getString(e45);
                                    i25 = e46;
                                }
                                if (c11.isNull(i25)) {
                                    i26 = e47;
                                    string11 = null;
                                } else {
                                    string11 = c11.getString(i25);
                                    i26 = e47;
                                }
                                int i42 = c11.getInt(i26);
                                if (c11.isNull(e48)) {
                                    i27 = e49;
                                    string12 = null;
                                } else {
                                    string12 = c11.getString(e48);
                                    i27 = e49;
                                }
                                categoryEntity = new CategoryEntity(i28, i29, string13, string14, string15, string16, i31, i32, i33, i34, i35, string17, valueOf4, valueOf, string, valueOf2, i36, i37, string2, string3, string4, string5, i38, i39, string6, categoryType, string7, string8, valueOf3, string9, i41, string10, string11, i42, string12, c11.isNull(i27) ? null : c11.getString(i27), c11.isNull(e50) ? null : c11.getString(e50));
                            } catch (Throwable th2) {
                                th = th2;
                                c11.close();
                                i11.release();
                                throw th;
                            }
                        } else {
                            anonymousClass31 = this;
                            categoryEntity = null;
                        }
                        c11.close();
                        i11.release();
                        return categoryEntity;
                    } catch (Throwable th3) {
                        th = th3;
                        anonymousClass31 = this;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    anonymousClass31 = this;
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.CategoryDao
    public Object getCategorySuspendById(int i11, zz.a<? super CategoryEntity> aVar) {
        final v i12 = v.i("SELECT * FROM  categories WHERE id == ?", 1);
        i12.d1(1, i11);
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<CategoryEntity>() { // from class: com.forsale.app.datalayer.repositories.CategoryDao_Impl.13
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public CategoryEntity call() throws Exception {
                AnonymousClass13 anonymousClass13;
                CategoryEntity categoryEntity;
                Integer valueOf;
                int i13;
                String string;
                int i14;
                Integer valueOf2;
                int i15;
                String string2;
                int i16;
                String string3;
                int i17;
                String string4;
                int i18;
                String string5;
                int i19;
                String string6;
                int i21;
                String string7;
                int i22;
                String string8;
                int i23;
                Integer valueOf3;
                int i24;
                String string9;
                int i25;
                String string10;
                int i26;
                String string11;
                int i27;
                String string12;
                int i28;
                Cursor c11 = j4.b.c(CategoryDao_Impl.this.__db, i12, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "region_id");
                    int e13 = j4.a.e(c11, "system_name");
                    int e14 = j4.a.e(c11, "name_en");
                    int e15 = j4.a.e(c11, "name_ar");
                    int e16 = j4.a.e(c11, "image");
                    int e17 = j4.a.e(c11, "parent_id");
                    int e18 = j4.a.e(c11, "display_order");
                    int e19 = j4.a.e(c11, CategoryEntity.ALLOW_UPLOADING);
                    int e21 = j4.a.e(c11, CategoryEntity.IS_FILTERABLE);
                    int e22 = j4.a.e(c11, CategoryEntity.STEPS);
                    int e23 = j4.a.e(c11, "promote_animation");
                    int e24 = j4.a.e(c11, CategoryEntity.IS_ALTERNATE_VIEW);
                    int e25 = j4.a.e(c11, CategoryEntity.ALLOW_SEARCH);
                    try {
                        int e26 = j4.a.e(c11, CategoryEntity.ATTRIBUTE_VALUES);
                        int e27 = j4.a.e(c11, CategoryEntity.IS_EXPENDABLE);
                        int e28 = j4.a.e(c11, CategoryEntity.ALLOW_DISTRICT_FILTERING);
                        int e29 = j4.a.e(c11, CategoryEntity.HAS_PLANS);
                        int e31 = j4.a.e(c11, CategoryEntity.FILTERABLE_LABEL_EN);
                        int e32 = j4.a.e(c11, CategoryEntity.FILTERABLE_LABEL_AR);
                        int e33 = j4.a.e(c11, CategoryEntity.RULE_SET);
                        int e34 = j4.a.e(c11, CategoryEntity.CLASSIFICATION);
                        int e35 = j4.a.e(c11, CategoryEntity.ALLOW_POWER_PIN_VIEW);
                        int e36 = j4.a.e(c11, CategoryEntity.ALLOW_POWER_PIN_ADD);
                        int e37 = j4.a.e(c11, CategoryEntity.FULL_PATH);
                        int e38 = j4.a.e(c11, "category_type");
                        int e39 = j4.a.e(c11, "filtering_classification_ar");
                        int e41 = j4.a.e(c11, "filtering_classification_en");
                        int e42 = j4.a.e(c11, "is_indexed");
                        int e43 = j4.a.e(c11, CategoryEntity.VERTICAL_IMAGE);
                        int e44 = j4.a.e(c11, "max_home_top_banners");
                        int e45 = j4.a.e(c11, "relatives");
                        int e46 = j4.a.e(c11, CategoryEntity.FEATURED_IMAGE);
                        int e47 = j4.a.e(c11, "is_alt_cat");
                        int e48 = j4.a.e(c11, CategoryEntity.FILTRATION_SETTINGS);
                        int e49 = j4.a.e(c11, CategoryEntity.SECTIONS);
                        int e50 = j4.a.e(c11, CategoryEntity.SLUG);
                        if (c11.moveToFirst()) {
                            int i29 = c11.getInt(e11);
                            int i31 = c11.getInt(e12);
                            String string13 = c11.isNull(e13) ? null : c11.getString(e13);
                            String string14 = c11.isNull(e14) ? null : c11.getString(e14);
                            String string15 = c11.isNull(e15) ? null : c11.getString(e15);
                            String string16 = c11.isNull(e16) ? null : c11.getString(e16);
                            int i32 = c11.getInt(e17);
                            int i33 = c11.getInt(e18);
                            int i34 = c11.getInt(e19);
                            int i35 = c11.getInt(e21);
                            int i36 = c11.getInt(e22);
                            String string17 = c11.isNull(e23) ? null : c11.getString(e23);
                            Integer valueOf4 = c11.isNull(e24) ? null : Integer.valueOf(c11.getInt(e24));
                            if (c11.isNull(e25)) {
                                i13 = e26;
                                valueOf = null;
                            } else {
                                valueOf = Integer.valueOf(c11.getInt(e25));
                                i13 = e26;
                            }
                            if (c11.isNull(i13)) {
                                i14 = e27;
                                string = null;
                            } else {
                                string = c11.getString(i13);
                                i14 = e27;
                            }
                            if (c11.isNull(i14)) {
                                i15 = e28;
                                valueOf2 = null;
                            } else {
                                valueOf2 = Integer.valueOf(c11.getInt(i14));
                                i15 = e28;
                            }
                            int i37 = c11.getInt(i15);
                            int i38 = c11.getInt(e29);
                            if (c11.isNull(e31)) {
                                i16 = e32;
                                string2 = null;
                            } else {
                                string2 = c11.getString(e31);
                                i16 = e32;
                            }
                            if (c11.isNull(i16)) {
                                i17 = e33;
                                string3 = null;
                            } else {
                                string3 = c11.getString(i16);
                                i17 = e33;
                            }
                            if (c11.isNull(i17)) {
                                i18 = e34;
                                string4 = null;
                            } else {
                                string4 = c11.getString(i17);
                                i18 = e34;
                            }
                            if (c11.isNull(i18)) {
                                i19 = e35;
                                string5 = null;
                            } else {
                                string5 = c11.getString(i18);
                                i19 = e35;
                            }
                            int i39 = c11.getInt(i19);
                            int i41 = c11.getInt(e36);
                            if (c11.isNull(e37)) {
                                i21 = e38;
                                string6 = null;
                            } else {
                                string6 = c11.getString(e37);
                                i21 = e38;
                            }
                            anonymousClass13 = this;
                            try {
                                CategoryEntity.CategoryType categoryType = CategoryDao_Impl.this.__categoryTypeConverter.toCategoryType(c11.isNull(i21) ? null : c11.getString(i21));
                                if (c11.isNull(e39)) {
                                    i22 = e41;
                                    string7 = null;
                                } else {
                                    string7 = c11.getString(e39);
                                    i22 = e41;
                                }
                                if (c11.isNull(i22)) {
                                    i23 = e42;
                                    string8 = null;
                                } else {
                                    string8 = c11.getString(i22);
                                    i23 = e42;
                                }
                                if (c11.isNull(i23)) {
                                    i24 = e43;
                                    valueOf3 = null;
                                } else {
                                    valueOf3 = Integer.valueOf(c11.getInt(i23));
                                    i24 = e43;
                                }
                                if (c11.isNull(i24)) {
                                    i25 = e44;
                                    string9 = null;
                                } else {
                                    string9 = c11.getString(i24);
                                    i25 = e44;
                                }
                                int i42 = c11.getInt(i25);
                                if (c11.isNull(e45)) {
                                    i26 = e46;
                                    string10 = null;
                                } else {
                                    string10 = c11.getString(e45);
                                    i26 = e46;
                                }
                                if (c11.isNull(i26)) {
                                    i27 = e47;
                                    string11 = null;
                                } else {
                                    string11 = c11.getString(i26);
                                    i27 = e47;
                                }
                                int i43 = c11.getInt(i27);
                                if (c11.isNull(e48)) {
                                    i28 = e49;
                                    string12 = null;
                                } else {
                                    string12 = c11.getString(e48);
                                    i28 = e49;
                                }
                                categoryEntity = new CategoryEntity(i29, i31, string13, string14, string15, string16, i32, i33, i34, i35, i36, string17, valueOf4, valueOf, string, valueOf2, i37, i38, string2, string3, string4, string5, i39, i41, string6, categoryType, string7, string8, valueOf3, string9, i42, string10, string11, i43, string12, c11.isNull(i28) ? null : c11.getString(i28), c11.isNull(e50) ? null : c11.getString(e50));
                            } catch (Throwable th2) {
                                th = th2;
                                c11.close();
                                i12.release();
                                throw th;
                            }
                        } else {
                            anonymousClass13 = this;
                            categoryEntity = null;
                        }
                        c11.close();
                        i12.release();
                        return categoryEntity;
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

    @Override // com.forsale.app.datalayer.repositories.CategoryDao
    public Object getCategoryTreeQuery(final l lVar, zz.a<? super CategoryTreeBrief> aVar) {
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<CategoryTreeBrief>() { // from class: com.forsale.app.datalayer.repositories.CategoryDao_Impl.39
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public CategoryTreeBrief call() throws Exception {
                Cursor c11 = j4.b.c(CategoryDao_Impl.this.__db, lVar, false, null);
                try {
                    return c11.moveToFirst() ? CategoryDao_Impl.this.__entityCursorConverter_comForsaleAppDatalayerDatabaseCategoryTreeBrief(c11) : null;
                } finally {
                    c11.close();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.CategoryDao
    public LiveData<List<CategoryEntity>> getHomeCategories(int i11) {
        final v i12 = v.i("SELECT * FROM  categories WHERE region_id == ? AND parent_id == 0", 1);
        i12.d1(1, i11);
        return this.__db.getInvalidationTracker().e(new String[]{CategoryEntity.CATEGORIES_TABLE}, false, new Callable<List<CategoryEntity>>() { // from class: com.forsale.app.datalayer.repositories.CategoryDao_Impl.17
            protected void finalize() {
                i12.release();
            }

            @Override // java.util.concurrent.Callable
            public List<CategoryEntity> call() throws Exception {
                Integer valueOf;
                int i13;
                String string;
                int i14;
                String string2;
                int i15;
                String string3;
                int i16;
                String string4;
                int i17;
                String string5;
                int i18;
                int i19;
                int i21;
                String string6;
                int i22;
                String string7;
                int i23;
                String string8;
                int i24;
                Integer valueOf2;
                int i25;
                String string9;
                int i26;
                String string10;
                int i27;
                String string11;
                int i28;
                String string12;
                int i29;
                String string13;
                int i31;
                String string14;
                Cursor c11 = j4.b.c(CategoryDao_Impl.this.__db, i12, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "region_id");
                    int e13 = j4.a.e(c11, "system_name");
                    int e14 = j4.a.e(c11, "name_en");
                    int e15 = j4.a.e(c11, "name_ar");
                    int e16 = j4.a.e(c11, "image");
                    int e17 = j4.a.e(c11, "parent_id");
                    int e18 = j4.a.e(c11, "display_order");
                    int e19 = j4.a.e(c11, CategoryEntity.ALLOW_UPLOADING);
                    int e21 = j4.a.e(c11, CategoryEntity.IS_FILTERABLE);
                    int e22 = j4.a.e(c11, CategoryEntity.STEPS);
                    int e23 = j4.a.e(c11, "promote_animation");
                    int e24 = j4.a.e(c11, CategoryEntity.IS_ALTERNATE_VIEW);
                    int e25 = j4.a.e(c11, CategoryEntity.ALLOW_SEARCH);
                    try {
                        int e26 = j4.a.e(c11, CategoryEntity.ATTRIBUTE_VALUES);
                        int e27 = j4.a.e(c11, CategoryEntity.IS_EXPENDABLE);
                        int e28 = j4.a.e(c11, CategoryEntity.ALLOW_DISTRICT_FILTERING);
                        int e29 = j4.a.e(c11, CategoryEntity.HAS_PLANS);
                        int e31 = j4.a.e(c11, CategoryEntity.FILTERABLE_LABEL_EN);
                        int e32 = j4.a.e(c11, CategoryEntity.FILTERABLE_LABEL_AR);
                        int e33 = j4.a.e(c11, CategoryEntity.RULE_SET);
                        int e34 = j4.a.e(c11, CategoryEntity.CLASSIFICATION);
                        int e35 = j4.a.e(c11, CategoryEntity.ALLOW_POWER_PIN_VIEW);
                        int e36 = j4.a.e(c11, CategoryEntity.ALLOW_POWER_PIN_ADD);
                        int e37 = j4.a.e(c11, CategoryEntity.FULL_PATH);
                        int e38 = j4.a.e(c11, "category_type");
                        int e39 = j4.a.e(c11, "filtering_classification_ar");
                        int e41 = j4.a.e(c11, "filtering_classification_en");
                        int e42 = j4.a.e(c11, "is_indexed");
                        int e43 = j4.a.e(c11, CategoryEntity.VERTICAL_IMAGE);
                        int e44 = j4.a.e(c11, "max_home_top_banners");
                        int e45 = j4.a.e(c11, "relatives");
                        int e46 = j4.a.e(c11, CategoryEntity.FEATURED_IMAGE);
                        int e47 = j4.a.e(c11, "is_alt_cat");
                        int e48 = j4.a.e(c11, CategoryEntity.FILTRATION_SETTINGS);
                        int e49 = j4.a.e(c11, CategoryEntity.SECTIONS);
                        int e50 = j4.a.e(c11, CategoryEntity.SLUG);
                        int i32 = e25;
                        ArrayList arrayList = new ArrayList(c11.getCount());
                        while (c11.moveToNext()) {
                            int i33 = c11.getInt(e11);
                            int i34 = c11.getInt(e12);
                            String string15 = c11.isNull(e13) ? null : c11.getString(e13);
                            String string16 = c11.isNull(e14) ? null : c11.getString(e14);
                            String string17 = c11.isNull(e15) ? null : c11.getString(e15);
                            String string18 = c11.isNull(e16) ? null : c11.getString(e16);
                            int i35 = c11.getInt(e17);
                            int i36 = c11.getInt(e18);
                            int i37 = c11.getInt(e19);
                            int i38 = c11.getInt(e21);
                            int i39 = c11.getInt(e22);
                            String string19 = c11.isNull(e23) ? null : c11.getString(e23);
                            if (c11.isNull(e24)) {
                                i13 = i32;
                                valueOf = null;
                            } else {
                                valueOf = Integer.valueOf(c11.getInt(e24));
                                i13 = i32;
                            }
                            Integer valueOf3 = c11.isNull(i13) ? null : Integer.valueOf(c11.getInt(i13));
                            int i41 = e26;
                            int i42 = e11;
                            String string20 = c11.isNull(i41) ? null : c11.getString(i41);
                            int i43 = e27;
                            Integer valueOf4 = c11.isNull(i43) ? null : Integer.valueOf(c11.getInt(i43));
                            int i44 = e28;
                            int i45 = c11.getInt(i44);
                            int i46 = e29;
                            int i47 = c11.getInt(i46);
                            e29 = i46;
                            int i48 = e31;
                            if (c11.isNull(i48)) {
                                e31 = i48;
                                i14 = e32;
                                string = null;
                            } else {
                                string = c11.getString(i48);
                                e31 = i48;
                                i14 = e32;
                            }
                            if (c11.isNull(i14)) {
                                e32 = i14;
                                i15 = e33;
                                string2 = null;
                            } else {
                                string2 = c11.getString(i14);
                                e32 = i14;
                                i15 = e33;
                            }
                            if (c11.isNull(i15)) {
                                e33 = i15;
                                i16 = e34;
                                string3 = null;
                            } else {
                                string3 = c11.getString(i15);
                                e33 = i15;
                                i16 = e34;
                            }
                            if (c11.isNull(i16)) {
                                e34 = i16;
                                i17 = e35;
                                string4 = null;
                            } else {
                                string4 = c11.getString(i16);
                                e34 = i16;
                                i17 = e35;
                            }
                            int i49 = c11.getInt(i17);
                            e35 = i17;
                            int i50 = e36;
                            int i51 = c11.getInt(i50);
                            e36 = i50;
                            int i52 = e37;
                            if (c11.isNull(i52)) {
                                e37 = i52;
                                i18 = e38;
                                string5 = null;
                            } else {
                                string5 = c11.getString(i52);
                                e37 = i52;
                                i18 = e38;
                            }
                            if (c11.isNull(i18)) {
                                i19 = i18;
                                i22 = e12;
                                i21 = i13;
                                string6 = null;
                            } else {
                                i19 = i18;
                                i21 = i13;
                                string6 = c11.getString(i18);
                                i22 = e12;
                            }
                            try {
                                CategoryEntity.CategoryType categoryType = CategoryDao_Impl.this.__categoryTypeConverter.toCategoryType(string6);
                                int i53 = e39;
                                if (c11.isNull(i53)) {
                                    i23 = e41;
                                    string7 = null;
                                } else {
                                    string7 = c11.getString(i53);
                                    i23 = e41;
                                }
                                if (c11.isNull(i23)) {
                                    e39 = i53;
                                    i24 = e42;
                                    string8 = null;
                                } else {
                                    string8 = c11.getString(i23);
                                    e39 = i53;
                                    i24 = e42;
                                }
                                if (c11.isNull(i24)) {
                                    e42 = i24;
                                    i25 = e43;
                                    valueOf2 = null;
                                } else {
                                    e42 = i24;
                                    valueOf2 = Integer.valueOf(c11.getInt(i24));
                                    i25 = e43;
                                }
                                if (c11.isNull(i25)) {
                                    e43 = i25;
                                    i26 = e44;
                                    string9 = null;
                                } else {
                                    e43 = i25;
                                    string9 = c11.getString(i25);
                                    i26 = e44;
                                }
                                int i54 = c11.getInt(i26);
                                e44 = i26;
                                int i55 = e45;
                                if (c11.isNull(i55)) {
                                    e45 = i55;
                                    i27 = e46;
                                    string10 = null;
                                } else {
                                    e45 = i55;
                                    string10 = c11.getString(i55);
                                    i27 = e46;
                                }
                                if (c11.isNull(i27)) {
                                    e46 = i27;
                                    i28 = e47;
                                    string11 = null;
                                } else {
                                    e46 = i27;
                                    string11 = c11.getString(i27);
                                    i28 = e47;
                                }
                                int i56 = c11.getInt(i28);
                                e47 = i28;
                                int i57 = e48;
                                if (c11.isNull(i57)) {
                                    e48 = i57;
                                    i29 = e49;
                                    string12 = null;
                                } else {
                                    e48 = i57;
                                    string12 = c11.getString(i57);
                                    i29 = e49;
                                }
                                if (c11.isNull(i29)) {
                                    e49 = i29;
                                    i31 = e50;
                                    string13 = null;
                                } else {
                                    e49 = i29;
                                    string13 = c11.getString(i29);
                                    i31 = e50;
                                }
                                if (c11.isNull(i31)) {
                                    e50 = i31;
                                    string14 = null;
                                } else {
                                    e50 = i31;
                                    string14 = c11.getString(i31);
                                }
                                arrayList.add(new CategoryEntity(i33, i34, string15, string16, string17, string18, i35, i36, i37, i38, i39, string19, valueOf, valueOf3, string20, valueOf4, i45, i47, string, string2, string3, string4, i49, i51, string5, categoryType, string7, string8, valueOf2, string9, i54, string10, string11, i56, string12, string13, string14));
                                e41 = i23;
                                e11 = i42;
                                e26 = i41;
                                e27 = i43;
                                e12 = i22;
                                e28 = i44;
                                e38 = i19;
                                i32 = i21;
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

    @Override // com.forsale.app.datalayer.repositories.CategoryDao
    public Object getHomeCategoriesImages(int i11, zz.a<? super List<String>> aVar) {
        final v i12 = v.i("SELECT image FROM  categories WHERE region_id == ? AND parent_id == 0  AND image IS NOT NULL AND image != '' ", 1);
        i12.d1(1, i11);
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<List<String>>() { // from class: com.forsale.app.datalayer.repositories.CategoryDao_Impl.19
            @Override // java.util.concurrent.Callable
            public List<String> call() throws Exception {
                Cursor c11 = j4.b.c(CategoryDao_Impl.this.__db, i12, false, null);
                try {
                    ArrayList arrayList = new ArrayList(c11.getCount());
                    while (c11.moveToNext()) {
                        arrayList.add(c11.isNull(0) ? null : c11.getString(0));
                    }
                    return arrayList;
                } finally {
                    c11.close();
                    i12.release();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.CategoryDao
    public Object getHomeCategoriesVerticals(int i11, zz.a<? super List<String>> aVar) {
        final v i12 = v.i("SELECT vertical_image FROM  categories WHERE region_id == ? AND parent_id == 0  AND vertical_image IS NOT NULL AND vertical_image != '' ", 1);
        i12.d1(1, i11);
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<List<String>>() { // from class: com.forsale.app.datalayer.repositories.CategoryDao_Impl.18
            @Override // java.util.concurrent.Callable
            public List<String> call() throws Exception {
                Cursor c11 = j4.b.c(CategoryDao_Impl.this.__db, i12, false, null);
                try {
                    ArrayList arrayList = new ArrayList(c11.getCount());
                    while (c11.moveToNext()) {
                        arrayList.add(c11.isNull(0) ? null : c11.getString(0));
                    }
                    return arrayList;
                } finally {
                    c11.close();
                    i12.release();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.CategoryDao
    public Flow<List<CategoryEntity>> getMatchedCategories(String str) {
        final v i11 = v.i("SELECT * FROM categories WHERE categories.is_alt_cat != 1 AND categories.allow_uploading = 1 AND (categories.name_en like ? OR categories.name_ar like ?)", 2);
        if (str == null) {
            i11.u1(1);
        } else {
            i11.Q0(1, str);
        }
        if (str == null) {
            i11.u1(2);
        } else {
            i11.Q0(2, str);
        }
        return CoroutinesRoom.a(this.__db, true, new String[]{CategoryEntity.CATEGORIES_TABLE}, new Callable<List<CategoryEntity>>() { // from class: com.forsale.app.datalayer.repositories.CategoryDao_Impl.29
            protected void finalize() {
                i11.release();
            }

            @Override // java.util.concurrent.Callable
            public List<CategoryEntity> call() throws Exception {
                Integer valueOf;
                int i12;
                String string;
                int i13;
                String string2;
                int i14;
                String string3;
                int i15;
                String string4;
                int i16;
                String string5;
                int i17;
                int i18;
                int i19;
                String string6;
                int i21;
                String string7;
                int i22;
                String string8;
                int i23;
                Integer valueOf2;
                int i24;
                String string9;
                int i25;
                String string10;
                int i26;
                String string11;
                int i27;
                String string12;
                int i28;
                String string13;
                int i29;
                String string14;
                CategoryDao_Impl.this.__db.beginTransaction();
                try {
                    try {
                        Cursor c11 = j4.b.c(CategoryDao_Impl.this.__db, i11, false, null);
                        try {
                            int e11 = j4.a.e(c11, "id");
                            int e12 = j4.a.e(c11, "region_id");
                            int e13 = j4.a.e(c11, "system_name");
                            int e14 = j4.a.e(c11, "name_en");
                            int e15 = j4.a.e(c11, "name_ar");
                            int e16 = j4.a.e(c11, "image");
                            int e17 = j4.a.e(c11, "parent_id");
                            int e18 = j4.a.e(c11, "display_order");
                            int e19 = j4.a.e(c11, CategoryEntity.ALLOW_UPLOADING);
                            int e21 = j4.a.e(c11, CategoryEntity.IS_FILTERABLE);
                            int e22 = j4.a.e(c11, CategoryEntity.STEPS);
                            int e23 = j4.a.e(c11, "promote_animation");
                            int e24 = j4.a.e(c11, CategoryEntity.IS_ALTERNATE_VIEW);
                            int e25 = j4.a.e(c11, CategoryEntity.ALLOW_SEARCH);
                            try {
                                int e26 = j4.a.e(c11, CategoryEntity.ATTRIBUTE_VALUES);
                                int e27 = j4.a.e(c11, CategoryEntity.IS_EXPENDABLE);
                                int e28 = j4.a.e(c11, CategoryEntity.ALLOW_DISTRICT_FILTERING);
                                int e29 = j4.a.e(c11, CategoryEntity.HAS_PLANS);
                                int e31 = j4.a.e(c11, CategoryEntity.FILTERABLE_LABEL_EN);
                                int e32 = j4.a.e(c11, CategoryEntity.FILTERABLE_LABEL_AR);
                                int e33 = j4.a.e(c11, CategoryEntity.RULE_SET);
                                int e34 = j4.a.e(c11, CategoryEntity.CLASSIFICATION);
                                int e35 = j4.a.e(c11, CategoryEntity.ALLOW_POWER_PIN_VIEW);
                                int e36 = j4.a.e(c11, CategoryEntity.ALLOW_POWER_PIN_ADD);
                                int e37 = j4.a.e(c11, CategoryEntity.FULL_PATH);
                                int e38 = j4.a.e(c11, "category_type");
                                int e39 = j4.a.e(c11, "filtering_classification_ar");
                                int e41 = j4.a.e(c11, "filtering_classification_en");
                                int e42 = j4.a.e(c11, "is_indexed");
                                int e43 = j4.a.e(c11, CategoryEntity.VERTICAL_IMAGE);
                                int e44 = j4.a.e(c11, "max_home_top_banners");
                                int e45 = j4.a.e(c11, "relatives");
                                int e46 = j4.a.e(c11, CategoryEntity.FEATURED_IMAGE);
                                int e47 = j4.a.e(c11, "is_alt_cat");
                                int e48 = j4.a.e(c11, CategoryEntity.FILTRATION_SETTINGS);
                                int e49 = j4.a.e(c11, CategoryEntity.SECTIONS);
                                int e50 = j4.a.e(c11, CategoryEntity.SLUG);
                                int i31 = e25;
                                ArrayList arrayList = new ArrayList(c11.getCount());
                                while (c11.moveToNext()) {
                                    int i32 = c11.getInt(e11);
                                    int i33 = c11.getInt(e12);
                                    String string15 = c11.isNull(e13) ? null : c11.getString(e13);
                                    String string16 = c11.isNull(e14) ? null : c11.getString(e14);
                                    String string17 = c11.isNull(e15) ? null : c11.getString(e15);
                                    String string18 = c11.isNull(e16) ? null : c11.getString(e16);
                                    int i34 = c11.getInt(e17);
                                    int i35 = c11.getInt(e18);
                                    int i36 = c11.getInt(e19);
                                    int i37 = c11.getInt(e21);
                                    int i38 = c11.getInt(e22);
                                    String string19 = c11.isNull(e23) ? null : c11.getString(e23);
                                    if (c11.isNull(e24)) {
                                        i12 = i31;
                                        valueOf = null;
                                    } else {
                                        valueOf = Integer.valueOf(c11.getInt(e24));
                                        i12 = i31;
                                    }
                                    Integer valueOf3 = c11.isNull(i12) ? null : Integer.valueOf(c11.getInt(i12));
                                    int i39 = e26;
                                    int i41 = e11;
                                    String string20 = c11.isNull(i39) ? null : c11.getString(i39);
                                    int i42 = e27;
                                    Integer valueOf4 = c11.isNull(i42) ? null : Integer.valueOf(c11.getInt(i42));
                                    int i43 = e28;
                                    int i44 = c11.getInt(i43);
                                    int i45 = e29;
                                    int i46 = c11.getInt(i45);
                                    e29 = i45;
                                    int i47 = e31;
                                    if (c11.isNull(i47)) {
                                        e31 = i47;
                                        i13 = e32;
                                        string = null;
                                    } else {
                                        string = c11.getString(i47);
                                        e31 = i47;
                                        i13 = e32;
                                    }
                                    if (c11.isNull(i13)) {
                                        e32 = i13;
                                        i14 = e33;
                                        string2 = null;
                                    } else {
                                        string2 = c11.getString(i13);
                                        e32 = i13;
                                        i14 = e33;
                                    }
                                    if (c11.isNull(i14)) {
                                        e33 = i14;
                                        i15 = e34;
                                        string3 = null;
                                    } else {
                                        string3 = c11.getString(i14);
                                        e33 = i14;
                                        i15 = e34;
                                    }
                                    if (c11.isNull(i15)) {
                                        e34 = i15;
                                        i16 = e35;
                                        string4 = null;
                                    } else {
                                        string4 = c11.getString(i15);
                                        e34 = i15;
                                        i16 = e35;
                                    }
                                    int i48 = c11.getInt(i16);
                                    e35 = i16;
                                    int i49 = e36;
                                    int i50 = c11.getInt(i49);
                                    e36 = i49;
                                    int i51 = e37;
                                    if (c11.isNull(i51)) {
                                        e37 = i51;
                                        i17 = e38;
                                        string5 = null;
                                    } else {
                                        string5 = c11.getString(i51);
                                        e37 = i51;
                                        i17 = e38;
                                    }
                                    if (c11.isNull(i17)) {
                                        i18 = i17;
                                        i21 = e12;
                                        i19 = i12;
                                        string6 = null;
                                    } else {
                                        i18 = i17;
                                        i19 = i12;
                                        string6 = c11.getString(i17);
                                        i21 = e12;
                                    }
                                    try {
                                        CategoryEntity.CategoryType categoryType = CategoryDao_Impl.this.__categoryTypeConverter.toCategoryType(string6);
                                        int i52 = e39;
                                        if (c11.isNull(i52)) {
                                            i22 = e41;
                                            string7 = null;
                                        } else {
                                            string7 = c11.getString(i52);
                                            i22 = e41;
                                        }
                                        if (c11.isNull(i22)) {
                                            e39 = i52;
                                            i23 = e42;
                                            string8 = null;
                                        } else {
                                            string8 = c11.getString(i22);
                                            e39 = i52;
                                            i23 = e42;
                                        }
                                        if (c11.isNull(i23)) {
                                            e42 = i23;
                                            i24 = e43;
                                            valueOf2 = null;
                                        } else {
                                            e42 = i23;
                                            valueOf2 = Integer.valueOf(c11.getInt(i23));
                                            i24 = e43;
                                        }
                                        if (c11.isNull(i24)) {
                                            e43 = i24;
                                            i25 = e44;
                                            string9 = null;
                                        } else {
                                            e43 = i24;
                                            string9 = c11.getString(i24);
                                            i25 = e44;
                                        }
                                        int i53 = c11.getInt(i25);
                                        e44 = i25;
                                        int i54 = e45;
                                        if (c11.isNull(i54)) {
                                            e45 = i54;
                                            i26 = e46;
                                            string10 = null;
                                        } else {
                                            e45 = i54;
                                            string10 = c11.getString(i54);
                                            i26 = e46;
                                        }
                                        if (c11.isNull(i26)) {
                                            e46 = i26;
                                            i27 = e47;
                                            string11 = null;
                                        } else {
                                            e46 = i26;
                                            string11 = c11.getString(i26);
                                            i27 = e47;
                                        }
                                        int i55 = c11.getInt(i27);
                                        e47 = i27;
                                        int i56 = e48;
                                        if (c11.isNull(i56)) {
                                            e48 = i56;
                                            i28 = e49;
                                            string12 = null;
                                        } else {
                                            e48 = i56;
                                            string12 = c11.getString(i56);
                                            i28 = e49;
                                        }
                                        if (c11.isNull(i28)) {
                                            e49 = i28;
                                            i29 = e50;
                                            string13 = null;
                                        } else {
                                            e49 = i28;
                                            string13 = c11.getString(i28);
                                            i29 = e50;
                                        }
                                        if (c11.isNull(i29)) {
                                            e50 = i29;
                                            string14 = null;
                                        } else {
                                            e50 = i29;
                                            string14 = c11.getString(i29);
                                        }
                                        arrayList.add(new CategoryEntity(i32, i33, string15, string16, string17, string18, i34, i35, i36, i37, i38, string19, valueOf, valueOf3, string20, valueOf4, i44, i46, string, string2, string3, string4, i48, i50, string5, categoryType, string7, string8, valueOf2, string9, i53, string10, string11, i55, string12, string13, string14));
                                        e41 = i22;
                                        e11 = i41;
                                        e26 = i39;
                                        e27 = i42;
                                        e12 = i21;
                                        e28 = i43;
                                        e38 = i18;
                                        i31 = i19;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        c11.close();
                                        throw th;
                                    }
                                }
                                CategoryDao_Impl.this.__db.setTransactionSuccessful();
                                c11.close();
                                CategoryDao_Impl.this.__db.endTransaction();
                                return arrayList;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        CategoryDao_Impl.this.__db.endTransaction();
                        throw th;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    CategoryDao_Impl.this.__db.endTransaction();
                    throw th;
                }
            }
        });
    }

    @Override // com.forsale.app.datalayer.repositories.CategoryDao
    public Object getMatchedCategoriesQuery(final l lVar, zz.a<? super List<CategoryEntity>> aVar) {
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<List<CategoryEntity>>() { // from class: com.forsale.app.datalayer.repositories.CategoryDao_Impl.38
            @Override // java.util.concurrent.Callable
            public List<CategoryEntity> call() throws Exception {
                Cursor c11 = j4.b.c(CategoryDao_Impl.this.__db, lVar, false, null);
                try {
                    ArrayList arrayList = new ArrayList(c11.getCount());
                    while (c11.moveToNext()) {
                        arrayList.add(CategoryDao_Impl.this.__entityCursorConverter_comForsaleAppDatalayerDatabaseCategoryEntity(c11));
                    }
                    return arrayList;
                } finally {
                    c11.close();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.CategoryDao
    public Object getParentCategoryByClassification(CategoryEntity.Classification classification, zz.a<? super CategoryEntity> aVar) {
        final v i11 = v.i("SELECT * FROM  categories WHERE parent_id == 0 AND classification == ? LIMIT 1", 1);
        String classificationTypeConverter = this.__classificationTypeConverter.toString(classification);
        if (classificationTypeConverter == null) {
            i11.u1(1);
        } else {
            i11.Q0(1, classificationTypeConverter);
        }
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<CategoryEntity>() { // from class: com.forsale.app.datalayer.repositories.CategoryDao_Impl.28
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public CategoryEntity call() throws Exception {
                AnonymousClass28 anonymousClass28;
                CategoryEntity categoryEntity;
                Integer valueOf;
                int i12;
                String string;
                int i13;
                Integer valueOf2;
                int i14;
                String string2;
                int i15;
                String string3;
                int i16;
                String string4;
                int i17;
                String string5;
                int i18;
                String string6;
                int i19;
                String string7;
                int i21;
                String string8;
                int i22;
                Integer valueOf3;
                int i23;
                String string9;
                int i24;
                String string10;
                int i25;
                String string11;
                int i26;
                String string12;
                int i27;
                Cursor c11 = j4.b.c(CategoryDao_Impl.this.__db, i11, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "region_id");
                    int e13 = j4.a.e(c11, "system_name");
                    int e14 = j4.a.e(c11, "name_en");
                    int e15 = j4.a.e(c11, "name_ar");
                    int e16 = j4.a.e(c11, "image");
                    int e17 = j4.a.e(c11, "parent_id");
                    int e18 = j4.a.e(c11, "display_order");
                    int e19 = j4.a.e(c11, CategoryEntity.ALLOW_UPLOADING);
                    int e21 = j4.a.e(c11, CategoryEntity.IS_FILTERABLE);
                    int e22 = j4.a.e(c11, CategoryEntity.STEPS);
                    int e23 = j4.a.e(c11, "promote_animation");
                    int e24 = j4.a.e(c11, CategoryEntity.IS_ALTERNATE_VIEW);
                    int e25 = j4.a.e(c11, CategoryEntity.ALLOW_SEARCH);
                    try {
                        int e26 = j4.a.e(c11, CategoryEntity.ATTRIBUTE_VALUES);
                        int e27 = j4.a.e(c11, CategoryEntity.IS_EXPENDABLE);
                        int e28 = j4.a.e(c11, CategoryEntity.ALLOW_DISTRICT_FILTERING);
                        int e29 = j4.a.e(c11, CategoryEntity.HAS_PLANS);
                        int e31 = j4.a.e(c11, CategoryEntity.FILTERABLE_LABEL_EN);
                        int e32 = j4.a.e(c11, CategoryEntity.FILTERABLE_LABEL_AR);
                        int e33 = j4.a.e(c11, CategoryEntity.RULE_SET);
                        int e34 = j4.a.e(c11, CategoryEntity.CLASSIFICATION);
                        int e35 = j4.a.e(c11, CategoryEntity.ALLOW_POWER_PIN_VIEW);
                        int e36 = j4.a.e(c11, CategoryEntity.ALLOW_POWER_PIN_ADD);
                        int e37 = j4.a.e(c11, CategoryEntity.FULL_PATH);
                        int e38 = j4.a.e(c11, "category_type");
                        int e39 = j4.a.e(c11, "filtering_classification_ar");
                        int e41 = j4.a.e(c11, "filtering_classification_en");
                        int e42 = j4.a.e(c11, "is_indexed");
                        int e43 = j4.a.e(c11, CategoryEntity.VERTICAL_IMAGE);
                        int e44 = j4.a.e(c11, "max_home_top_banners");
                        int e45 = j4.a.e(c11, "relatives");
                        int e46 = j4.a.e(c11, CategoryEntity.FEATURED_IMAGE);
                        int e47 = j4.a.e(c11, "is_alt_cat");
                        int e48 = j4.a.e(c11, CategoryEntity.FILTRATION_SETTINGS);
                        int e49 = j4.a.e(c11, CategoryEntity.SECTIONS);
                        int e50 = j4.a.e(c11, CategoryEntity.SLUG);
                        if (c11.moveToFirst()) {
                            int i28 = c11.getInt(e11);
                            int i29 = c11.getInt(e12);
                            String string13 = c11.isNull(e13) ? null : c11.getString(e13);
                            String string14 = c11.isNull(e14) ? null : c11.getString(e14);
                            String string15 = c11.isNull(e15) ? null : c11.getString(e15);
                            String string16 = c11.isNull(e16) ? null : c11.getString(e16);
                            int i31 = c11.getInt(e17);
                            int i32 = c11.getInt(e18);
                            int i33 = c11.getInt(e19);
                            int i34 = c11.getInt(e21);
                            int i35 = c11.getInt(e22);
                            String string17 = c11.isNull(e23) ? null : c11.getString(e23);
                            Integer valueOf4 = c11.isNull(e24) ? null : Integer.valueOf(c11.getInt(e24));
                            if (c11.isNull(e25)) {
                                i12 = e26;
                                valueOf = null;
                            } else {
                                valueOf = Integer.valueOf(c11.getInt(e25));
                                i12 = e26;
                            }
                            if (c11.isNull(i12)) {
                                i13 = e27;
                                string = null;
                            } else {
                                string = c11.getString(i12);
                                i13 = e27;
                            }
                            if (c11.isNull(i13)) {
                                i14 = e28;
                                valueOf2 = null;
                            } else {
                                valueOf2 = Integer.valueOf(c11.getInt(i13));
                                i14 = e28;
                            }
                            int i36 = c11.getInt(i14);
                            int i37 = c11.getInt(e29);
                            if (c11.isNull(e31)) {
                                i15 = e32;
                                string2 = null;
                            } else {
                                string2 = c11.getString(e31);
                                i15 = e32;
                            }
                            if (c11.isNull(i15)) {
                                i16 = e33;
                                string3 = null;
                            } else {
                                string3 = c11.getString(i15);
                                i16 = e33;
                            }
                            if (c11.isNull(i16)) {
                                i17 = e34;
                                string4 = null;
                            } else {
                                string4 = c11.getString(i16);
                                i17 = e34;
                            }
                            if (c11.isNull(i17)) {
                                i18 = e35;
                                string5 = null;
                            } else {
                                string5 = c11.getString(i17);
                                i18 = e35;
                            }
                            int i38 = c11.getInt(i18);
                            int i39 = c11.getInt(e36);
                            if (c11.isNull(e37)) {
                                i19 = e38;
                                string6 = null;
                            } else {
                                string6 = c11.getString(e37);
                                i19 = e38;
                            }
                            anonymousClass28 = this;
                            try {
                                CategoryEntity.CategoryType categoryType = CategoryDao_Impl.this.__categoryTypeConverter.toCategoryType(c11.isNull(i19) ? null : c11.getString(i19));
                                if (c11.isNull(e39)) {
                                    i21 = e41;
                                    string7 = null;
                                } else {
                                    string7 = c11.getString(e39);
                                    i21 = e41;
                                }
                                if (c11.isNull(i21)) {
                                    i22 = e42;
                                    string8 = null;
                                } else {
                                    string8 = c11.getString(i21);
                                    i22 = e42;
                                }
                                if (c11.isNull(i22)) {
                                    i23 = e43;
                                    valueOf3 = null;
                                } else {
                                    valueOf3 = Integer.valueOf(c11.getInt(i22));
                                    i23 = e43;
                                }
                                if (c11.isNull(i23)) {
                                    i24 = e44;
                                    string9 = null;
                                } else {
                                    string9 = c11.getString(i23);
                                    i24 = e44;
                                }
                                int i41 = c11.getInt(i24);
                                if (c11.isNull(e45)) {
                                    i25 = e46;
                                    string10 = null;
                                } else {
                                    string10 = c11.getString(e45);
                                    i25 = e46;
                                }
                                if (c11.isNull(i25)) {
                                    i26 = e47;
                                    string11 = null;
                                } else {
                                    string11 = c11.getString(i25);
                                    i26 = e47;
                                }
                                int i42 = c11.getInt(i26);
                                if (c11.isNull(e48)) {
                                    i27 = e49;
                                    string12 = null;
                                } else {
                                    string12 = c11.getString(e48);
                                    i27 = e49;
                                }
                                categoryEntity = new CategoryEntity(i28, i29, string13, string14, string15, string16, i31, i32, i33, i34, i35, string17, valueOf4, valueOf, string, valueOf2, i36, i37, string2, string3, string4, string5, i38, i39, string6, categoryType, string7, string8, valueOf3, string9, i41, string10, string11, i42, string12, c11.isNull(i27) ? null : c11.getString(i27), c11.isNull(e50) ? null : c11.getString(e50));
                            } catch (Throwable th2) {
                                th = th2;
                                c11.close();
                                i11.release();
                                throw th;
                            }
                        } else {
                            anonymousClass28 = this;
                            categoryEntity = null;
                        }
                        c11.close();
                        i11.release();
                        return categoryEntity;
                    } catch (Throwable th3) {
                        th = th3;
                        anonymousClass28 = this;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    anonymousClass28 = this;
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.CategoryDao
    public Object getSubCategoriesCountByParentId(int i11, int i12, zz.a<? super Integer> aVar) {
        final v i13 = v.i("SELECT COUNT(id) FROM  categories WHERE region_id == ? AND parent_id == ?", 2);
        i13.d1(1, i11);
        i13.d1(2, i12);
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<Integer>() { // from class: com.forsale.app.datalayer.repositories.CategoryDao_Impl.23
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                Integer num = null;
                Cursor c11 = j4.b.c(CategoryDao_Impl.this.__db, i13, false, null);
                try {
                    if (c11.moveToFirst() && !c11.isNull(0)) {
                        num = Integer.valueOf(c11.getInt(0));
                    }
                    return num;
                } finally {
                    c11.close();
                    i13.release();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.CategoryDao
    public Object getVerticalIdNameOfCategory(final l lVar, zz.a<? super CategoryBrief> aVar) {
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<CategoryBrief>() { // from class: com.forsale.app.datalayer.repositories.CategoryDao_Impl.37
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public CategoryBrief call() throws Exception {
                Cursor c11 = j4.b.c(CategoryDao_Impl.this.__db, lVar, false, null);
                try {
                    return c11.moveToFirst() ? CategoryDao_Impl.this.__entityCursorConverter_comForsaleAppDatalayerDatabaseCategoryBrief(c11) : null;
                } finally {
                    c11.close();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.CategoryDao
    public Object insertAllCategories(final List<CategoryEntity> list, zz.a<? super List<Long>> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<List<Long>>() { // from class: com.forsale.app.datalayer.repositories.CategoryDao_Impl.6
            @Override // java.util.concurrent.Callable
            public List<Long> call() throws Exception {
                CategoryDao_Impl.this.__db.beginTransaction();
                try {
                    List<Long> insertAndReturnIdsList = CategoryDao_Impl.this.__insertionAdapterOfCategoryEntity.insertAndReturnIdsList(list);
                    CategoryDao_Impl.this.__db.setTransactionSuccessful();
                    return insertAndReturnIdsList;
                } finally {
                    CategoryDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.CategoryDao
    public Object insertCategory(final CategoryEntity categoryEntity, zz.a<? super Long> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Long>() { // from class: com.forsale.app.datalayer.repositories.CategoryDao_Impl.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() throws Exception {
                CategoryDao_Impl.this.__db.beginTransaction();
                try {
                    Long valueOf = Long.valueOf(CategoryDao_Impl.this.__insertionAdapterOfCategoryEntity.insertAndReturnId(categoryEntity));
                    CategoryDao_Impl.this.__db.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    CategoryDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.CategoryDao
    public Object intersectCategories(List<Integer> list, List<Integer> list2, zz.a<? super List<Integer>> aVar) {
        StringBuilder b11 = e.b();
        b11.append("SELECT id FROM categories where id in (");
        int size = list2.size();
        e.a(b11, size);
        b11.append(") AND parent_id  IN (");
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
        for (Integer num2 : list) {
            if (num2 == null) {
                i11.u1(i13);
            } else {
                i11.d1(i13, num2.intValue());
            }
            i13++;
        }
        return CoroutinesRoom.b(this.__db, true, j4.b.a(), new Callable<List<Integer>>() { // from class: com.forsale.app.datalayer.repositories.CategoryDao_Impl.24
            @Override // java.util.concurrent.Callable
            public List<Integer> call() throws Exception {
                CategoryDao_Impl.this.__db.beginTransaction();
                try {
                    Cursor c11 = j4.b.c(CategoryDao_Impl.this.__db, i11, false, null);
                    ArrayList arrayList = new ArrayList(c11.getCount());
                    while (c11.moveToNext()) {
                        arrayList.add(c11.isNull(0) ? null : Integer.valueOf(c11.getInt(0)));
                    }
                    CategoryDao_Impl.this.__db.setTransactionSuccessful();
                    c11.close();
                    i11.release();
                    return arrayList;
                } finally {
                    CategoryDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.CategoryDao
    public Object updateCategory(final CategoryEntity categoryEntity, zz.a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.repositories.CategoryDao_Impl.9
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                CategoryDao_Impl.this.__db.beginTransaction();
                try {
                    CategoryDao_Impl.this.__db.setTransactionSuccessful();
                    return Integer.valueOf(CategoryDao_Impl.this.__updateAdapterOfCategoryEntity.handle(categoryEntity) + 0);
                } finally {
                    CategoryDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.CategoryDao
    public Object deleteAllCategories(zz.a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.repositories.CategoryDao_Impl.10
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                m acquire = CategoryDao_Impl.this.__preparedStmtOfDeleteAllCategories.acquire();
                try {
                    CategoryDao_Impl.this.__db.beginTransaction();
                    Integer valueOf = Integer.valueOf(acquire.O());
                    CategoryDao_Impl.this.__db.setTransactionSuccessful();
                    CategoryDao_Impl.this.__db.endTransaction();
                    return valueOf;
                } finally {
                    CategoryDao_Impl.this.__preparedStmtOfDeleteAllCategories.release(acquire);
                }
            }
        }, aVar);
    }
}
