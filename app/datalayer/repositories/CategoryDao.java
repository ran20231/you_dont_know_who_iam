package com.forsale.app.datalayer.repositories;

import androidx.lifecycle.LiveData;
import com.forsale.app.datalayer.database.CategoryAndParentCategoryNamesView;
import com.forsale.app.datalayer.database.CategoryBrief;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.database.CategoryTreeBrief;
import com.forsale.app.datalayer.database.CategoryView;
import com.forsale.app.datalayer.database.CousinCategory;
import java.util.List;
import kotlinx.coroutines.flow.Flow;
import l4.l;
/* compiled from: CategoryDao.kt */
/* loaded from: classes2.dex */
public interface CategoryDao {
    Object deleteAllCategories(List<CategoryEntity> list, zz.a<? super Integer> aVar);

    Object deleteAllCategories(zz.a<? super Integer> aVar);

    Object deleteCategory(CategoryEntity categoryEntity, zz.a<? super Integer> aVar);

    LiveData<List<CategoryEntity>> getAllCategories(int i11);

    Object getAllCategoriesAsList(int i11, zz.a<? super List<CategoryEntity>> aVar);

    Object getAllCategoriesSuspend(zz.a<? super List<CategoryEntity>> aVar);

    Object getCategoriesByClassification(int i11, CategoryEntity.Classification classification, zz.a<? super List<CategoryEntity>> aVar);

    Object getCategoriesByIds(List<Integer> list, zz.a<? super List<CategoryEntity>> aVar);

    Object getCategoriesByParentId(int i11, int i12, zz.a<? super List<CategoryEntity>> aVar);

    Object getCategoriesByParentIdAndClassifications(int i11, int i12, List<? extends CategoryEntity.Classification> list, zz.a<? super List<CategoryEntity>> aVar);

    LiveData<List<CategoryEntity>> getCategoriesByParentIdLiveData(int i11, int i12);

    Object getCategoriesCousins(l lVar, zz.a<? super List<CousinCategory>> aVar);

    Object getCategoriesIdsInParentIds(int i11, List<Integer> list, zz.a<? super List<Integer>> aVar);

    Object getCategoriesInParentIds(int i11, List<Integer> list, zz.a<? super List<CategoryView>> aVar);

    Object getCategoriesNameEnByIds(List<Integer> list, zz.a<? super List<String>> aVar);

    Object getCategoriesNestedByCategoryId(l lVar, zz.a<? super List<String>> aVar);

    Object getCategoriesParentIdsNotInChildrenParentsQuery(l lVar, zz.a<? super List<Integer>> aVar);

    Object getCategoryAndParentCategoryName(int i11, zz.a<? super CategoryAndParentCategoryNamesView> aVar);

    Object getCategoryById(int i11, zz.a<? super CategoryEntity> aVar);

    LiveData<CategoryEntity> getCategoryByIdLiveData(int i11);

    Object getCategoryBySlug(String str, zz.a<? super CategoryEntity> aVar);

    Object getCategorySuspendById(int i11, zz.a<? super CategoryEntity> aVar);

    Object getCategoryTreeQuery(l lVar, zz.a<? super CategoryTreeBrief> aVar);

    LiveData<List<CategoryEntity>> getHomeCategories(int i11);

    Object getHomeCategoriesImages(int i11, zz.a<? super List<String>> aVar);

    Object getHomeCategoriesVerticals(int i11, zz.a<? super List<String>> aVar);

    Flow<List<CategoryEntity>> getMatchedCategories(String str);

    Object getMatchedCategoriesQuery(l lVar, zz.a<? super List<CategoryEntity>> aVar);

    Object getParentCategoryByClassification(CategoryEntity.Classification classification, zz.a<? super CategoryEntity> aVar);

    Object getSubCategoriesCountByParentId(int i11, int i12, zz.a<? super Integer> aVar);

    Object getVerticalIdNameOfCategory(l lVar, zz.a<? super CategoryBrief> aVar);

    Object insertAllCategories(List<CategoryEntity> list, zz.a<? super List<Long>> aVar);

    Object insertCategory(CategoryEntity categoryEntity, zz.a<? super Long> aVar);

    Object intersectCategories(List<Integer> list, List<Integer> list2, zz.a<? super List<Integer>> aVar);

    Object updateCategory(CategoryEntity categoryEntity, zz.a<? super Integer> aVar);
}
