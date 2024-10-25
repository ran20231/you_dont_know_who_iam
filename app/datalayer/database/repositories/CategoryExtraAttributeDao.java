package com.forsale.app.datalayer.database.repositories;

import androidx.lifecycle.LiveData;
import com.forsale.app.datalayer.database.CategoryExtraAttributeEntity;
import java.util.List;
import zz.a;
/* compiled from: CategoryExtraAttributeDao.kt */
/* loaded from: classes2.dex */
public interface CategoryExtraAttributeDao {
    Object deleteAllCategoryExtraAttributes(List<CategoryExtraAttributeEntity> list, a<? super Integer> aVar);

    Object deleteAllCategoryExtraAttributes(a<? super Integer> aVar);

    Object deleteCategoryExtraAttribute(CategoryExtraAttributeEntity categoryExtraAttributeEntity, a<? super Integer> aVar);

    LiveData<List<CategoryExtraAttributeEntity>> getAllCategoryExtraAttributes();

    Object getAllCategoryExtraAttributesSuspend(a<? super List<CategoryExtraAttributeEntity>> aVar);

    LiveData<CategoryExtraAttributeEntity> getCategoryExtraAttributeById(int i11);

    Object insertAllCategoryExtraAttributes(List<CategoryExtraAttributeEntity> list, a<? super List<Long>> aVar);

    Object insertCategoryExtraAttribute(CategoryExtraAttributeEntity categoryExtraAttributeEntity, a<? super Long> aVar);

    Object updateCategoryExtraAttribute(CategoryExtraAttributeEntity categoryExtraAttributeEntity, a<? super Integer> aVar);
}
