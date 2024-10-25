package com.forsale.app.datalayer.repositories;

import androidx.lifecycle.LiveData;
import com.forsale.app.datalayer.database.CategoryWithSubCategories;
import java.util.List;
/* compiled from: CategoryWithSubCategoriesDao.kt */
/* loaded from: classes2.dex */
public interface CategoryWithSubCategoriesDao {
    LiveData<List<CategoryWithSubCategories>> getCategoryWithSubCategoriesByParentId(int i11, int i12);

    Object getCategoryWithSubCategoriesByParentIdSuspended(int i11, int i12, zz.a<? super List<CategoryWithSubCategories>> aVar);

    LiveData<List<CategoryWithSubCategories>> getHomeCategoryWithSubCategories(int i11);

    Object getHomeCategoryWithSubCategoriesSuspended(int i11, zz.a<? super List<CategoryWithSubCategories>> aVar);
}
