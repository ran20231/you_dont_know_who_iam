package com.forsale.app.datalayer.repositories;

import androidx.lifecycle.LiveData;
import com.forsale.app.datalayer.database.CategoryAndParentCategoryNamesView;
import com.forsale.app.datalayer.database.CategoryDistrict;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.database.CategoryTreeBrief;
import com.forsale.app.datalayer.database.CategoryView;
import com.forsale.app.datalayer.database.CategoryWithSubCategories;
import com.forsale.app.datalayer.database.CousinCategory;
import com.forsale.app.datalayer.network.requestsbodies.GetListingsBody;
import com.forsale.app.datalayer.repositories.CategoryDistrictDao;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
/* compiled from: CategoriesRepositories.kt */
/* loaded from: classes2.dex */
public final class CategoriesRepositories {
    public static final int $stable = 8;
    private final CategoryDao categoryDao;
    private final CategoryDistrictDao categoryDistrictDao;
    private final CategoryWithSubCategoriesDao categoryWithSubCategoriesDao;
    private final MasterDataRepository masterDataRepository;
    private final RegionsRepository regionsRepository;

    public CategoriesRepositories(CategoryWithSubCategoriesDao categoryWithSubCategoriesDao, CategoryDao categoryDao, RegionsRepository regionsRepository, CategoryDistrictDao categoryDistrictDao, MasterDataRepository masterDataRepository) {
        o.i(categoryWithSubCategoriesDao, "categoryWithSubCategoriesDao");
        o.i(categoryDao, "categoryDao");
        o.i(regionsRepository, "regionsRepository");
        o.i(categoryDistrictDao, "categoryDistrictDao");
        o.i(masterDataRepository, "masterDataRepository");
        this.categoryWithSubCategoriesDao = categoryWithSubCategoriesDao;
        this.categoryDao = categoryDao;
        this.regionsRepository = regionsRepository;
        this.categoryDistrictDao = categoryDistrictDao;
        this.masterDataRepository = masterDataRepository;
    }

    public static /* synthetic */ Object getCategoriesByClassification$default(CategoriesRepositories categoriesRepositories, int i11, CategoryEntity.Classification classification, zz.a aVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 1;
        }
        return categoriesRepositories.getCategoriesByClassification(i11, classification, aVar);
    }

    public static /* synthetic */ Object getCategoriesByParentIdAndClassifications$default(CategoriesRepositories categoriesRepositories, int i11, int i12, List list, zz.a aVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 1;
        }
        return categoriesRepositories.getCategoriesByParentIdAndClassifications(i11, i12, list, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l4.a getCategoriesCousinsQuery(List<Integer> list) {
        String t02;
        String t03;
        List<Integer> list2 = list;
        t02 = CollectionsKt___CollectionsKt.t0(list2, ",", null, null, 0, null, null, 62, null);
        t03 = CollectionsKt___CollectionsKt.t0(list2, ",", null, null, 0, null, null, 62, null);
        return new l4.a("SELECT id, name_ar, name_en, id as cousins_ids, display_order, parent_id from categories \nwhere filtering_classification_en ='NULL' and filtering_classification_ar ='NULL'  and parent_id IN (" + t02 + ") \nunion all  \n SELECT id, filtering_classification_ar, filtering_classification_en, GROUP_CONCAT(id) as cousins_ids, display_order, parent_id \nfrom categories where filtering_classification_en != 'NULL' and filtering_classification_ar !='NULL' and parent_id IN (" + t03 + ") \ngroup by filtering_classification_en, filtering_classification_ar ORDER BY display_order asc ");
    }

    public static /* synthetic */ Object getCategoriesNested$default(CategoriesRepositories categoriesRepositories, Integer num, zz.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = null;
        }
        return categoriesRepositories.getCategoriesNested(num, aVar);
    }

    public static /* synthetic */ Object getCategoriesNestedSuspended$default(CategoriesRepositories categoriesRepositories, Integer num, zz.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = null;
        }
        return categoriesRepositories.getCategoriesNestedSuspended(num, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l4.a getCategoriesParentIdsNotInChildrenParentsQuery(List<Integer> list, List<Integer> list2) {
        String t02;
        String t03;
        t02 = CollectionsKt___CollectionsKt.t0(list, ",", null, null, 0, null, null, 62, null);
        t03 = CollectionsKt___CollectionsKt.t0(list2, ",", null, null, 0, null, null, 62, null);
        return new l4.a("WITH CTE AS (select Id  from categories where categories.id in (" + t02 + ") ) \n SELECT  * from CTE where id NOT in (SELECT  categories.parent_id  from categories where categories.id in (" + t03 + ") )");
    }

    private final l4.a getCategoryRuleSetNestedQuery(List<Integer> list) {
        String t02;
        t02 = CollectionsKt___CollectionsKt.t0(list, ",", null, null, 0, null, null, 62, null);
        return new l4.a("WITH recursive cte_categories (id, name_en, name_ar, parent_id, ruleset) AS (  SELECT c.id, c.name_en, c.name_ar, c.parent_id, c.ruleset  FROM CATEGORIES c  WHERE c.id  in (" + t02 + ")  UNION ALL  SELECT c.id, c.name_en, c.name_ar, c.parent_id, c.ruleset  FROM CATEGORIES c join cte_categories cc  on cc.parent_id = c.id where (cc.ruleset is null OR cc.ruleset == 'NULL') ) SELECT DISTINCT ruleset FROM cte_categories  WHERE (ruleset is not null AND ruleset != 'NULL')");
    }

    private final l4.a getCategoryTreeQuery(int i11) {
        return new l4.a("WITH CTE AS (SELECT id, parent_id, id AS CategoryID, name_en  as NameEn, name_ar  as NameAr,  category_type as CategoryType FROM  categories  WHERE category_type == 'sub_categories' OR parent_id ==0  UNION ALL  SELECT  t.id, t.parent_id,  t.id|| ', ' || CategoryID AS CategoryID,  t.name_en || ', ' || NameEn As NameEn,  t.name_ar || ', ' || NameAr As NameAr,  t.category_type || ', ' || CategoryType As CategoryType  FROM  categories t INNER JOIN CTE c ON t.parent_id = c.id)  SELECT  CTE.CategoryID AS category_ids, CTE.NameEn AS category_names_en, CTE.NameAr AS category_names_ar, CTE.CategoryType AS category_types  FROM CTE where CTE.id== " + i11 + "   ORDER BY CTE.id limit 1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getCategoryWithSubCategoriesByParentId(int i11, int i12, zz.a<? super LiveData<List<CategoryWithSubCategories>>> aVar) {
        return this.categoryWithSubCategoriesDao.getCategoryWithSubCategoriesByParentId(i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getHomeCategoryWithSubCategories(int i11, zz.a<? super LiveData<List<CategoryWithSubCategories>>> aVar) {
        return this.categoryWithSubCategoriesDao.getHomeCategoryWithSubCategories(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l4.a getMatchedCategoriesQueryArabicKeywords(String str, List<String> list) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            sb2.append(" OR categories.name_ar like '%" + ((String) it2.next()) + "%' ");
        }
        String str2 = "SELECT * FROM categories WHERE categories.is_alt_cat != 1 AND (categories.allow_uploading = 1 OR categories.allow_search = 1) AND (categories.name_en like '%" + str + "%' " + ((Object) sb2) + " ) ";
        x10.a.b("Query: Search Query " + str2, new Object[0]);
        return new l4.a(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getMultipleCategoryRuleSet(java.util.List<java.lang.Integer> r6, zz.a<? super java.util.List<com.forsale.app.datalayer.database.CategoryRuleSet.RuleSet>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.forsale.app.datalayer.repositories.CategoriesRepositories$getMultipleCategoryRuleSet$1
            if (r0 == 0) goto L13
            r0 = r7
            com.forsale.app.datalayer.repositories.CategoriesRepositories$getMultipleCategoryRuleSet$1 r0 = (com.forsale.app.datalayer.repositories.CategoriesRepositories$getMultipleCategoryRuleSet$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.CategoriesRepositories$getMultipleCategoryRuleSet$1 r0 = new com.forsale.app.datalayer.repositories.CategoriesRepositories$getMultipleCategoryRuleSet$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.L$0
            java.util.List r6 = (java.util.List) r6
            kotlin.f.b(r7)
            goto L51
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.f.b(r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            com.forsale.app.datalayer.repositories.CategoryDao r2 = r5.categoryDao
            l4.a r6 = r5.getCategoryRuleSetNestedQuery(r6)
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r6 = r2.getCategoriesNestedByCategoryId(r6, r0)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r4 = r7
            r7 = r6
            r6 = r4
        L51:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L57:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L72
            java.lang.Object r0 = r7.next()
            java.lang.String r0 = (java.lang.String) r0
            com.forsale.app.datalayer.database.CategoryRuleSetConverters r1 = new com.forsale.app.datalayer.database.CategoryRuleSetConverters
            r1.<init>()
            com.forsale.app.datalayer.database.CategoryRuleSet$RuleSet r0 = r1.toRuleSetConfiguration(r0)
            if (r0 == 0) goto L57
            r6.add(r0)
            goto L57
        L72:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.CategoriesRepositories.getMultipleCategoryRuleSet(java.util.List, zz.a):java.lang.Object");
    }

    private final l4.a getVerticalIdNameOfCategoryQuery(int i11) {
        return new l4.a(" WITH recursive cte_categories (id, name_en, parent_id) AS (  SELECT c.id, c.name_en, c.parent_id  FROM CATEGORIES c  WHERE c.id  == " + i11 + "  UNION ALL  SELECT c.id, c.name_en, c.parent_id  FROM CATEGORIES c  join cte_categories cc  on cc.parent_id = c.id  )  SELECT DISTINCT id, name_en FROM cte_categories  WHERE (parent_id ==0 ) ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object imageBaseUrlHomeVerticalBig(zz.a<? super String> aVar) {
        return this.masterDataRepository.imageBaseUrlHomeVerticalBig(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object imageBaseUrlHomeVerticalSmall(zz.a<? super String> aVar) {
        return this.masterDataRepository.imageBaseUrlHomeVerticalSmall(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064 A[PHI: r7 
      PHI: (r7v8 java.lang.Object) = (r7v7 java.lang.Object), (r7v1 java.lang.Object) binds: [B:20:0x0061, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object subCategoriesCount(int r6, zz.a<? super java.lang.Integer> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.forsale.app.datalayer.repositories.CategoriesRepositories$subCategoriesCount$1
            if (r0 == 0) goto L13
            r0 = r7
            com.forsale.app.datalayer.repositories.CategoriesRepositories$subCategoriesCount$1 r0 = (com.forsale.app.datalayer.repositories.CategoriesRepositories$subCategoriesCount$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.CategoriesRepositories$subCategoriesCount$1 r0 = new com.forsale.app.datalayer.repositories.CategoriesRepositories$subCategoriesCount$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r7)
            goto L64
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            int r6 = r0.I$0
            java.lang.Object r2 = r0.L$0
            com.forsale.app.datalayer.repositories.CategoryDao r2 = (com.forsale.app.datalayer.repositories.CategoryDao) r2
            kotlin.f.b(r7)
            goto L52
        L3e:
            kotlin.f.b(r7)
            com.forsale.app.datalayer.repositories.CategoryDao r2 = r5.categoryDao
            com.forsale.app.datalayer.repositories.RegionsRepository r7 = r5.regionsRepository
            r0.L$0 = r2
            r0.I$0 = r6
            r0.label = r4
            java.lang.Object r7 = r7.getCurrentRegionId(r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r4 = 0
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r7 = r2.getSubCategoriesCountByParentId(r7, r6, r0)
            if (r7 != r1) goto L64
            return r1
        L64:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.CategoriesRepositories.subCategoriesCount(int, zz.a):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0006, code lost:
        r2 = kotlin.text.r.k(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object from(com.forsale.app.datalayer.network.entities.ForeSaleFCMMessage r2, zz.a<? super com.forsale.app.datalayer.database.CategoryEntity> r3) {
        /*
            r1 = this;
            java.lang.String r2 = r2.getId()
            if (r2 == 0) goto L20
            java.lang.Integer r2 = kotlin.text.k.k(r2)
            if (r2 == 0) goto L20
            int r2 = r2.intValue()
            com.forsale.app.datalayer.repositories.CategoryDao r0 = r1.categoryDao
            java.lang.Object r2 = r0.getCategoryById(r2, r3)
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.f()
            if (r2 != r3) goto L1d
            return r2
        L1d:
            com.forsale.app.datalayer.database.CategoryEntity r2 = (com.forsale.app.datalayer.database.CategoryEntity) r2
            goto L21
        L20:
            r2 = 0
        L21:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.CategoriesRepositories.from(com.forsale.app.datalayer.network.entities.ForeSaleFCMMessage, zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060 A[PHI: r6 
      PHI: (r6v8 java.lang.Object) = (r6v7 java.lang.Object), (r6v1 java.lang.Object) binds: [B:20:0x005d, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getAllCategories(zz.a<? super java.util.List<com.forsale.app.datalayer.database.CategoryEntity>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.forsale.app.datalayer.repositories.CategoriesRepositories$getAllCategories$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.datalayer.repositories.CategoriesRepositories$getAllCategories$1 r0 = (com.forsale.app.datalayer.repositories.CategoriesRepositories$getAllCategories$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.CategoriesRepositories$getAllCategories$1 r0 = new com.forsale.app.datalayer.repositories.CategoriesRepositories$getAllCategories$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r6)
            goto L60
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.L$0
            com.forsale.app.datalayer.repositories.CategoryDao r2 = (com.forsale.app.datalayer.repositories.CategoryDao) r2
            kotlin.f.b(r6)
            goto L4e
        L3c:
            kotlin.f.b(r6)
            com.forsale.app.datalayer.repositories.CategoryDao r2 = r5.categoryDao
            com.forsale.app.datalayer.repositories.RegionsRepository r6 = r5.regionsRepository
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r6 = r6.getCurrentRegionId(r0)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r4 = 0
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r2.getAllCategoriesAsList(r6, r0)
            if (r6 != r1) goto L60
            return r1
        L60:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.CategoriesRepositories.getAllCategories(zz.a):java.lang.Object");
    }

    public final Object getCategoriesByClassification(int i11, CategoryEntity.Classification classification, zz.a<? super List<CategoryEntity>> aVar) {
        return this.categoryDao.getCategoriesByClassification(i11, classification, aVar);
    }

    public final Object getCategoriesByIds(List<Integer> list, zz.a<? super List<CategoryEntity>> aVar) {
        return this.categoryDao.getCategoriesByIds(list, aVar);
    }

    public final Object getCategoriesByParentId(int i11, int i12, zz.a<? super List<CategoryEntity>> aVar) {
        return this.categoryDao.getCategoriesByParentId(i12, i11, aVar);
    }

    public final Object getCategoriesByParentIdAndClassifications(int i11, int i12, List<? extends CategoryEntity.Classification> list, zz.a<? super List<CategoryEntity>> aVar) {
        return this.categoryDao.getCategoriesByParentIdAndClassifications(i11, i12, list, aVar);
    }

    public final Object getCategoriesCousins(List<Integer> list, zz.a<? super List<CousinCategory>> aVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new CategoriesRepositories$getCategoriesCousins$2(this, list, null), aVar);
    }

    public final Object getCategoriesIdsInParentIds(List<Integer> list, zz.a<? super List<Integer>> aVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new CategoriesRepositories$getCategoriesIdsInParentIds$2(this, list, null), aVar);
    }

    public final Object getCategoriesInParentIds(List<Integer> list, zz.a<? super List<CategoryView>> aVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new CategoriesRepositories$getCategoriesInParentIds$2(this, list, null), aVar);
    }

    public final Object getCategoriesNameEnByIds(List<Integer> list, zz.a<? super List<String>> aVar) {
        return this.categoryDao.getCategoriesNameEnByIds(list, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getCategoriesNested(java.lang.Integer r9, zz.a<? super androidx.lifecycle.LiveData<java.util.List<com.forsale.app.datalayer.database.CategoryWithSubCategories>>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.forsale.app.datalayer.repositories.CategoriesRepositories$getCategoriesNested$1
            if (r0 == 0) goto L13
            r0 = r10
            com.forsale.app.datalayer.repositories.CategoriesRepositories$getCategoriesNested$1 r0 = (com.forsale.app.datalayer.repositories.CategoriesRepositories$getCategoriesNested$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.CategoriesRepositories$getCategoriesNested$1 r0 = new com.forsale.app.datalayer.repositories.CategoriesRepositories$getCategoriesNested$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 0
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L5a
            if (r2 == r7) goto L4c
            if (r2 == r6) goto L44
            if (r2 == r5) goto L3c
            if (r2 != r4) goto L34
            kotlin.f.b(r10)
            goto Lae
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            java.lang.Object r9 = r0.L$0
            com.forsale.app.datalayer.repositories.CategoriesRepositories r9 = (com.forsale.app.datalayer.repositories.CategoriesRepositories) r9
            kotlin.f.b(r10)
            goto L9d
        L44:
            java.lang.Object r9 = r0.L$0
            com.forsale.app.datalayer.repositories.CategoriesRepositories r9 = (com.forsale.app.datalayer.repositories.CategoriesRepositories) r9
            kotlin.f.b(r10)
            goto L8a
        L4c:
            int r9 = r0.I$0
            java.lang.Object r2 = r0.L$1
            com.forsale.app.datalayer.repositories.CategoriesRepositories r2 = (com.forsale.app.datalayer.repositories.CategoriesRepositories) r2
            java.lang.Object r7 = r0.L$0
            com.forsale.app.datalayer.repositories.CategoriesRepositories r7 = (com.forsale.app.datalayer.repositories.CategoriesRepositories) r7
            kotlin.f.b(r10)
            goto L76
        L5a:
            kotlin.f.b(r10)
            if (r9 == 0) goto L8f
            int r9 = r9.intValue()
            com.forsale.app.datalayer.repositories.RegionsRepository r10 = r8.regionsRepository
            r0.L$0 = r8
            r0.L$1 = r8
            r0.I$0 = r9
            r0.label = r7
            java.lang.Object r10 = r10.getCurrentRegionId(r0)
            if (r10 != r1) goto L74
            return r1
        L74:
            r2 = r8
            r7 = r2
        L76:
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            r0.L$0 = r7
            r0.L$1 = r3
            r0.label = r6
            java.lang.Object r10 = r2.getCategoryWithSubCategoriesByParentId(r10, r9, r0)
            if (r10 != r1) goto L89
            return r1
        L89:
            r9 = r7
        L8a:
            androidx.lifecycle.LiveData r10 = (androidx.lifecycle.LiveData) r10
            if (r10 != 0) goto Lb0
            goto L90
        L8f:
            r9 = r8
        L90:
            com.forsale.app.datalayer.repositories.RegionsRepository r10 = r9.regionsRepository
            r0.L$0 = r9
            r0.label = r5
            java.lang.Object r10 = r10.getCurrentRegionId(r0)
            if (r10 != r1) goto L9d
            return r1
        L9d:
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            r0.L$0 = r3
            r0.label = r4
            java.lang.Object r10 = r9.getHomeCategoryWithSubCategories(r10, r0)
            if (r10 != r1) goto Lae
            return r1
        Lae:
            androidx.lifecycle.LiveData r10 = (androidx.lifecycle.LiveData) r10
        Lb0:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.CategoriesRepositories.getCategoriesNested(java.lang.Integer, zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getCategoriesNestedSuspended(java.lang.Integer r10, zz.a<? super java.util.List<com.forsale.app.datalayer.database.CategoryWithSubCategories>> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.forsale.app.datalayer.repositories.CategoriesRepositories$getCategoriesNestedSuspended$1
            if (r0 == 0) goto L13
            r0 = r11
            com.forsale.app.datalayer.repositories.CategoriesRepositories$getCategoriesNestedSuspended$1 r0 = (com.forsale.app.datalayer.repositories.CategoriesRepositories$getCategoriesNestedSuspended$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.CategoriesRepositories$getCategoriesNestedSuspended$1 r0 = new com.forsale.app.datalayer.repositories.CategoriesRepositories$getCategoriesNestedSuspended$1
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 0
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L5a
            if (r2 == r7) goto L4c
            if (r2 == r6) goto L44
            if (r2 == r5) goto L3c
            if (r2 != r4) goto L34
            kotlin.f.b(r11)
            goto Lb4
        L34:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3c:
            java.lang.Object r10 = r0.L$0
            com.forsale.app.datalayer.repositories.CategoryWithSubCategoriesDao r10 = (com.forsale.app.datalayer.repositories.CategoryWithSubCategoriesDao) r10
            kotlin.f.b(r11)
            goto La3
        L44:
            java.lang.Object r10 = r0.L$0
            com.forsale.app.datalayer.repositories.CategoriesRepositories r10 = (com.forsale.app.datalayer.repositories.CategoriesRepositories) r10
            kotlin.f.b(r11)
            goto L8b
        L4c:
            int r10 = r0.I$0
            java.lang.Object r2 = r0.L$1
            com.forsale.app.datalayer.repositories.CategoryWithSubCategoriesDao r2 = (com.forsale.app.datalayer.repositories.CategoryWithSubCategoriesDao) r2
            java.lang.Object r7 = r0.L$0
            com.forsale.app.datalayer.repositories.CategoriesRepositories r7 = (com.forsale.app.datalayer.repositories.CategoriesRepositories) r7
            kotlin.f.b(r11)
            goto L77
        L5a:
            kotlin.f.b(r11)
            if (r10 == 0) goto L90
            int r10 = r10.intValue()
            com.forsale.app.datalayer.repositories.CategoryWithSubCategoriesDao r2 = r9.categoryWithSubCategoriesDao
            com.forsale.app.datalayer.repositories.RegionsRepository r11 = r9.regionsRepository
            r0.L$0 = r9
            r0.L$1 = r2
            r0.I$0 = r10
            r0.label = r7
            java.lang.Object r11 = r11.getCurrentRegionId(r0)
            if (r11 != r1) goto L76
            return r1
        L76:
            r7 = r9
        L77:
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            r0.L$0 = r7
            r0.L$1 = r3
            r0.label = r6
            java.lang.Object r11 = r2.getCategoryWithSubCategoriesByParentIdSuspended(r11, r10, r0)
            if (r11 != r1) goto L8a
            return r1
        L8a:
            r10 = r7
        L8b:
            java.util.List r11 = (java.util.List) r11
            if (r11 != 0) goto Lb6
            goto L91
        L90:
            r10 = r9
        L91:
            com.forsale.app.datalayer.repositories.CategoryWithSubCategoriesDao r11 = r10.categoryWithSubCategoriesDao
            com.forsale.app.datalayer.repositories.RegionsRepository r10 = r10.regionsRepository
            r0.L$0 = r11
            r0.label = r5
            java.lang.Object r10 = r10.getCurrentRegionId(r0)
            if (r10 != r1) goto La0
            return r1
        La0:
            r8 = r11
            r11 = r10
            r10 = r8
        La3:
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            r0.L$0 = r3
            r0.label = r4
            java.lang.Object r11 = r10.getHomeCategoryWithSubCategoriesSuspended(r11, r0)
            if (r11 != r1) goto Lb4
            return r1
        Lb4:
            java.util.List r11 = (java.util.List) r11
        Lb6:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.CategoriesRepositories.getCategoriesNestedSuspended(java.lang.Integer, zz.a):java.lang.Object");
    }

    public final Object getCategoriesParentIdsNotInChildrenParents(List<Integer> list, List<Integer> list2, zz.a<? super List<Integer>> aVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new CategoriesRepositories$getCategoriesParentIdsNotInChildrenParents$2(this, list, list2, null), aVar);
    }

    public final Object getCategoriesWithParentId(int i11, zz.a<? super List<CategoryEntity>> aVar) {
        return this.categoryDao.getCategoriesByParentId(1, i11, aVar);
    }

    public final Object getCategoriesWithParentIdAsLiveData(int i11, zz.a<? super LiveData<List<CategoryEntity>>> aVar) {
        return this.categoryDao.getCategoriesByParentIdLiveData(1, i11);
    }

    public final Object getCategory(int i11, zz.a<? super CategoryEntity> aVar) {
        return this.categoryDao.getCategoryById(i11, aVar);
    }

    public final Object getCategoryAndParentCategoryNames(int i11, zz.a<? super CategoryAndParentCategoryNamesView> aVar) {
        return this.categoryDao.getCategoryAndParentCategoryName(i11, aVar);
    }

    public final Object getCategoryBySlug(String str, zz.a<? super CategoryEntity> aVar) {
        return this.categoryDao.getCategoryBySlug(str, aVar);
    }

    public final Object getCategoryDistrictByCategoryId(int i11, zz.a<? super CategoryDistrict> aVar) {
        return CategoryDistrictDao.DefaultImpls.getCategoryDistrictByCategoryId$default(this.categoryDistrictDao, i11, 0, aVar, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getCategoryRuleSet(int r5, zz.a<? super com.forsale.app.datalayer.database.CategoryRuleSet.RuleSet> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.forsale.app.datalayer.repositories.CategoriesRepositories$getCategoryRuleSet$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.datalayer.repositories.CategoriesRepositories$getCategoryRuleSet$1 r0 = (com.forsale.app.datalayer.repositories.CategoriesRepositories$getCategoryRuleSet$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.CategoriesRepositories$getCategoryRuleSet$1 r0 = new com.forsale.app.datalayer.repositories.CategoriesRepositories$getCategoryRuleSet$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r6)
            goto L4b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.f.b(r6)
            com.forsale.app.datalayer.repositories.CategoryDao r6 = r4.categoryDao
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.a.d(r5)
            java.util.List r5 = kotlin.collections.p.e(r5)
            l4.a r5 = r4.getCategoryRuleSetNestedQuery(r5)
            r0.label = r3
            java.lang.Object r6 = r6.getCategoriesNestedByCategoryId(r5, r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            java.util.List r6 = (java.util.List) r6
            r5 = r6
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            r5 = r5 ^ r3
            if (r5 == 0) goto L68
            com.forsale.app.datalayer.database.CategoryRuleSetConverters r5 = new com.forsale.app.datalayer.database.CategoryRuleSetConverters
            r5.<init>()
            r0 = 0
            java.lang.Object r6 = r6.get(r0)
            java.lang.String r6 = (java.lang.String) r6
            com.forsale.app.datalayer.database.CategoryRuleSet$RuleSet r5 = r5.toRuleSetConfiguration(r6)
            goto L69
        L68:
            r5 = 0
        L69:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.CategoriesRepositories.getCategoryRuleSet(int, zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getCategorySystemName(int r5, zz.a<? super java.lang.String> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.forsale.app.datalayer.repositories.CategoriesRepositories$getCategorySystemName$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.datalayer.repositories.CategoriesRepositories$getCategorySystemName$1 r0 = (com.forsale.app.datalayer.repositories.CategoriesRepositories$getCategorySystemName$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.CategoriesRepositories$getCategorySystemName$1 r0 = new com.forsale.app.datalayer.repositories.CategoriesRepositories$getCategorySystemName$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.f.b(r6)
            com.forsale.app.datalayer.repositories.CategoryDao r6 = r4.categoryDao
            r0.label = r3
            java.lang.Object r6 = r6.getCategoryById(r5, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            com.forsale.app.datalayer.database.CategoryEntity r6 = (com.forsale.app.datalayer.database.CategoryEntity) r6
            if (r6 == 0) goto L49
            java.lang.String r5 = r6.getSystemName()
            if (r5 != 0) goto L4b
        L49:
            java.lang.String r5 = ""
        L4b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.CategoriesRepositories.getCategorySystemName(int, zz.a):java.lang.Object");
    }

    public final Object getCategoryTree(int i11, zz.a<? super CategoryTreeBrief> aVar) {
        return this.categoryDao.getCategoryTreeQuery(getCategoryTreeQuery(i11), aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d3  */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00aa -> B:31:0x00ac). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getMainCategoriesWithVerticalImage(boolean r13, zz.a<? super java.util.List<com.forsale.app.datalayer.database.CategoryEntity>> r14) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.CategoriesRepositories.getMainCategoriesWithVerticalImage(boolean, zz.a):java.lang.Object");
    }

    public final Object getMatchedCategories(String str, List<String> list, zz.a<? super List<CategoryEntity>> aVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new CategoriesRepositories$getMatchedCategories$2(this, str, list, null), aVar);
    }

    public final Object getPriceRange(List<Integer> list, zz.a<? super GetListingsBody.FiltrationData.Range> aVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new CategoriesRepositories$getPriceRange$2(this, list, null), aVar);
    }

    public final Object getRealtyCategory(zz.a<? super CategoryEntity> aVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new CategoriesRepositories$getRealtyCategory$2(this, null), aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getVerticalIdNameOfCategory(com.forsale.app.datalayer.database.CategoryEntity r5, zz.a<? super kotlin.Pair<java.lang.Integer, java.lang.String>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.forsale.app.datalayer.repositories.CategoriesRepositories$getVerticalIdNameOfCategory$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.datalayer.repositories.CategoriesRepositories$getVerticalIdNameOfCategory$1 r0 = (com.forsale.app.datalayer.repositories.CategoriesRepositories$getVerticalIdNameOfCategory$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.CategoriesRepositories$getVerticalIdNameOfCategory$1 r0 = new com.forsale.app.datalayer.repositories.CategoriesRepositories$getVerticalIdNameOfCategory$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r6)
            goto L5e
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.f.b(r6)
            int r6 = r5.getParentId()
            if (r6 != 0) goto L4b
            int r6 = r5.getId()
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.a.d(r6)
            java.lang.String r5 = r5.getNameEn()
            kotlin.Pair r5 = wz.i.a(r6, r5)
            goto L70
        L4b:
            com.forsale.app.datalayer.repositories.CategoryDao r6 = r4.categoryDao
            int r5 = r5.getParentId()
            l4.a r5 = r4.getVerticalIdNameOfCategoryQuery(r5)
            r0.label = r3
            java.lang.Object r6 = r6.getVerticalIdNameOfCategory(r5, r0)
            if (r6 != r1) goto L5e
            return r1
        L5e:
            com.forsale.app.datalayer.database.CategoryBrief r6 = (com.forsale.app.datalayer.database.CategoryBrief) r6
            int r5 = r6.getId()
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.a.d(r5)
            java.lang.String r6 = r6.getNameEn()
            kotlin.Pair r5 = wz.i.a(r5, r6)
        L70:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.CategoriesRepositories.getVerticalIdNameOfCategory(com.forsale.app.datalayer.database.CategoryEntity, zz.a):java.lang.Object");
    }

    public final Object getVerticals(zz.a<? super List<CategoryEntity>> aVar) {
        return this.categoryDao.getCategoriesByParentId(1, 0, aVar);
    }

    public final Object intersectCategories(List<Integer> list, List<Integer> list2, zz.a<? super List<Integer>> aVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new CategoriesRepositories$intersectCategories$2(this, list, list2, null), aVar);
    }

    public final boolean nextHasSubCategories(CategoryEntity category) {
        o.i(category, "category");
        if (category.getCategoryType() == CategoryEntity.CategoryType.SUB_CATEGORIES) {
            return true;
        }
        return false;
    }

    public final boolean nextIsNormalListings(CategoryEntity category) {
        o.i(category, "category");
        if (category.getCategoryType() != CategoryEntity.CategoryType.SUB_CATEGORIES) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056 A[LOOP:0: B:18:0x0050->B:20:0x0056, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object validateCategoriesIdsByIds(java.util.List<java.lang.Integer> r5, zz.a<? super java.util.List<java.lang.Integer>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.forsale.app.datalayer.repositories.CategoriesRepositories$validateCategoriesIdsByIds$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.datalayer.repositories.CategoriesRepositories$validateCategoriesIdsByIds$1 r0 = (com.forsale.app.datalayer.repositories.CategoriesRepositories$validateCategoriesIdsByIds$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.CategoriesRepositories$validateCategoriesIdsByIds$1 r0 = new com.forsale.app.datalayer.repositories.CategoriesRepositories$validateCategoriesIdsByIds$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.f.b(r6)
            com.forsale.app.datalayer.repositories.CategoryDao r6 = r4.categoryDao
            r0.label = r3
            java.lang.Object r6 = r6.getCategoriesByIds(r5, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r5 = new java.util.ArrayList
            r0 = 10
            int r0 = kotlin.collections.p.y(r6, r0)
            r5.<init>(r0)
            java.util.Iterator r6 = r6.iterator()
        L50:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L68
            java.lang.Object r0 = r6.next()
            com.forsale.app.datalayer.database.CategoryEntity r0 = (com.forsale.app.datalayer.database.CategoryEntity) r0
            int r0 = r0.getId()
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.a.d(r0)
            r5.add(r0)
            goto L50
        L68:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.CategoriesRepositories.validateCategoriesIdsByIds(java.util.List, zz.a):java.lang.Object");
    }

    public final Object getCategoryDistrictByCategoryId(int i11, int i12, zz.a<? super CategoryDistrict> aVar) {
        return this.categoryDistrictDao.getCategoryDistrictByCategoryId(i11, i12, aVar);
    }
}
