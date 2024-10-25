package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.database.CategoryDistrict;
import java.util.List;
/* compiled from: CategoryDistrictDao.kt */
/* loaded from: classes2.dex */
public interface CategoryDistrictDao {

    /* compiled from: CategoryDistrictDao.kt */
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object getCategoryDistrictByCategoryId$default(CategoryDistrictDao categoryDistrictDao, int i11, int i12, zz.a aVar, int i13, Object obj) {
            if (obj == null) {
                if ((i13 & 2) != 0) {
                    i12 = 1;
                }
                return categoryDistrictDao.getCategoryDistrictByCategoryId(i11, i12, aVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCategoryDistrictByCategoryId");
        }
    }

    Object deleteAllCategoryDistricts(List<CategoryDistrict> list, zz.a<? super Integer> aVar);

    Object deleteAllCategoryDistricts(zz.a<? super Integer> aVar);

    Object deleteCategoryDistrict(CategoryDistrict categoryDistrict, zz.a<? super Integer> aVar);

    Object getAllCategoryDistrictsSuspend(zz.a<? super List<CategoryDistrict>> aVar);

    Object getCategoryDistrictByCategoryId(int i11, int i12, zz.a<? super CategoryDistrict> aVar);

    Object insertAllCategoryDistrict(List<CategoryDistrict> list, zz.a<? super List<Long>> aVar);

    Object insertCategoryDistrict(CategoryDistrict categoryDistrict, zz.a<? super Long> aVar);

    Object updateCategoryDistrict(CategoryDistrict categoryDistrict, zz.a<? super Integer> aVar);
}
