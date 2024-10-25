package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.database.ExtraAttributeEntity;
import com.forsale.app.datalayer.database.ExtraAttributeFlatGroupEntity;
import com.forsale.app.datalayer.database.ExtraAttributeOptionEntity;
import com.forsale.app.features.postad.extraattributes.enums.AttributeScope;
import com.forsale.app.features.postad.extraattributes.enums.AttributeType;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.s;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
/* compiled from: ExtraAttributeRawRepository.kt */
/* loaded from: classes2.dex */
public final class ExtraAttributeRawRepository {
    public static final int $stable = 0;
    private final ExtraAttributeOptionDao extraAttributeOptionDao;
    private final ExtraAttributeRawDao extraAttributeRawDao;

    public ExtraAttributeRawRepository(ExtraAttributeRawDao extraAttributeRawDao, ExtraAttributeOptionDao extraAttributeOptionDao) {
        o.i(extraAttributeRawDao, "extraAttributeRawDao");
        o.i(extraAttributeOptionDao, "extraAttributeOptionDao");
        this.extraAttributeRawDao = extraAttributeRawDao;
        this.extraAttributeOptionDao = extraAttributeOptionDao;
    }

    private final l4.a getAttributesGroupedByCategoryIdsQuery(String str, AttributeScope attributeScope) {
        l4.a aVar;
        if (attributeScope == null) {
            aVar = new l4.a("SELECT extra_attributes.* \nFROM DISTINCT categories_extra_attributes\ninner join extra_attributes \non extra_attributes.id=categories_extra_attributes.attribute_id\nwhere categories_extra_attributes.cat_id in (" + str + ")\n");
        } else {
            String value = attributeScope.getValue();
            aVar = new l4.a("SELECT DISTINCT extra_attributes.* \nFROM categories_extra_attributes\ninner join extra_attributes \non extra_attributes.id=categories_extra_attributes.attribute_id\nand scope = \"" + value + "\"\nwhere categories_extra_attributes.cat_id in (" + str + ")\n");
        }
        String g11 = aVar.g();
        x10.a.b("Query: " + g11, new Object[0]);
        return aVar;
    }

    private final l4.a getAttributesInCategoriesWithTypeQuery(String str, AttributeType attributeType) {
        String value = attributeType.getValue();
        return new l4.a("select DISTINCT extra_attributes.* from extra_attributes inner join categories_extra_attributes on extra_attributes.id =  categories_extra_attributes.attribute_id \nwhere extra_attributes.type = '" + value + "' and categories_extra_attributes.cat_id in (" + str + ")");
    }

    private final l4.a getCategoriesNestedByCategoryIdQuery(int i11) {
        return new l4.a("WITH CTE AS (SELECT id, parent_id, id AS CategoryID FROM  categories WHERE parent_id= 0 UNION ALL SELECT t.id, t.parent_id,  t.id|| ', ' || CategoryID AS CategoryID FROM  categories t INNER JOIN CTE c ON t.parent_id = c.id) SELECT  CTE.CategoryID FROM CTE where CTE.id= " + i11 + "  ORDER BY CTE.id");
    }

    private final List<Integer> getDropdownOptionIds(List<ExtraAttributeEntity> list) {
        int y11;
        List<Integer> c02;
        boolean z11;
        ArrayList<ExtraAttributeEntity> arrayList = new ArrayList();
        for (Object obj : list) {
            if (AttributeType.DROP_DOWN == AttributeType.Companion.a(((ExtraAttributeEntity) obj).getType())) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                arrayList.add(obj);
            }
        }
        y11 = s.y(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(y11);
        for (ExtraAttributeEntity extraAttributeEntity : arrayList) {
            arrayList2.add(Integer.valueOf(extraAttributeEntity.getId()));
        }
        c02 = CollectionsKt___CollectionsKt.c0(arrayList2);
        return c02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getExtraAttributeOptionByOptionIds(List<Integer> list, zz.a<? super List<ExtraAttributeOptionEntity>> aVar) {
        return this.extraAttributeOptionDao.getExtraAttributeOptionsByOptionIds(list, aVar);
    }

    private final l4.a getExtraAttributesByIdsQuery(String str) {
        return new l4.a("SELECT * FROM  extra_attributes WHERE id in (" + str + ")");
    }

    private final l4.a getFilterableAttributesInCategoriesWithTypes(String str) {
        String value = AttributeType.NUMBER.getValue();
        String value2 = AttributeType.DROP_DOWN.getValue();
        return new l4.a("select DISTINCT extra_attributes.* from extra_attributes inner join categories_extra_attributes on extra_attributes.id =  categories_extra_attributes.attribute_id \nwhere (extra_attributes.type ='" + value + "' or extra_attributes.type = '" + value2 + "')  and extra_attributes.is_filterable = 1 and categories_extra_attributes.cat_id in (" + str + ") ORDER BY extra_attributes.display_order ASC");
    }

    private final l4.a getParentCategoryQuery(int i11) {
        return new l4.a("select  parent_id from  categories where id = " + i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getAttributesCountByCategoryId(int r6, zz.a<? super java.lang.Integer> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.forsale.app.datalayer.repositories.ExtraAttributeRawRepository$getAttributesCountByCategoryId$1
            if (r0 == 0) goto L13
            r0 = r7
            com.forsale.app.datalayer.repositories.ExtraAttributeRawRepository$getAttributesCountByCategoryId$1 r0 = (com.forsale.app.datalayer.repositories.ExtraAttributeRawRepository$getAttributesCountByCategoryId$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.ExtraAttributeRawRepository$getAttributesCountByCategoryId$1 r0 = new com.forsale.app.datalayer.repositories.ExtraAttributeRawRepository$getAttributesCountByCategoryId$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r7)
            goto L5b
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.L$0
            com.forsale.app.datalayer.repositories.ExtraAttributeRawRepository r6 = (com.forsale.app.datalayer.repositories.ExtraAttributeRawRepository) r6
            kotlin.f.b(r7)
            goto L4b
        L3c:
            kotlin.f.b(r7)
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r7 = r5.getCategoriesNestedByCategoryId(r6, r0)
            if (r7 != r1) goto L4a
            return r1
        L4a:
            r6 = r5
        L4b:
            java.lang.String r7 = (java.lang.String) r7
            com.forsale.app.features.postad.extraattributes.enums.AttributeScope r2 = com.forsale.app.features.postad.extraattributes.enums.AttributeScope.LISTING
            r4 = 0
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r7 = r6.getAttributesGroupedByCategoryIds(r7, r2, r0)
            if (r7 != r1) goto L5b
            return r1
        L5b:
            java.util.List r7 = (java.util.List) r7
            int r6 = r7.size()
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.a.d(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.ExtraAttributeRawRepository.getAttributesCountByCategoryId(int, zz.a):java.lang.Object");
    }

    public final Object getAttributesGroupedByCategoryIds(String str, AttributeScope attributeScope, zz.a<? super List<ExtraAttributeFlatGroupEntity>> aVar) {
        return this.extraAttributeRawDao.getAttributesGroupedByCategoryIds(getAttributesGroupedByCategoryIdsQuery(str, attributeScope), aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067 A[PHI: r8 
      PHI: (r8v6 java.lang.Object) = (r8v5 java.lang.Object), (r8v1 java.lang.Object) binds: [B:21:0x0064, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getAttributesWithCategoryIdOfType(com.forsale.app.features.postad.extraattributes.enums.AttributeType r6, int r7, zz.a<? super java.util.List<com.forsale.app.datalayer.database.ExtraAttributeEntity>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.forsale.app.datalayer.repositories.ExtraAttributeRawRepository$getAttributesWithCategoryIdOfType$1
            if (r0 == 0) goto L13
            r0 = r8
            com.forsale.app.datalayer.repositories.ExtraAttributeRawRepository$getAttributesWithCategoryIdOfType$1 r0 = (com.forsale.app.datalayer.repositories.ExtraAttributeRawRepository$getAttributesWithCategoryIdOfType$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.ExtraAttributeRawRepository$getAttributesWithCategoryIdOfType$1 r0 = new com.forsale.app.datalayer.repositories.ExtraAttributeRawRepository$getAttributesWithCategoryIdOfType$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r8)
            goto L67
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.L$1
            com.forsale.app.features.postad.extraattributes.enums.AttributeType r6 = (com.forsale.app.features.postad.extraattributes.enums.AttributeType) r6
            java.lang.Object r7 = r0.L$0
            com.forsale.app.datalayer.repositories.ExtraAttributeRawRepository r7 = (com.forsale.app.datalayer.repositories.ExtraAttributeRawRepository) r7
            kotlin.f.b(r8)
            goto L51
        L40:
            kotlin.f.b(r8)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r8 = r5.getCategoriesNestedByCategoryId(r7, r0)
            if (r8 != r1) goto L50
            return r1
        L50:
            r7 = r5
        L51:
            java.lang.String r8 = (java.lang.String) r8
            com.forsale.app.datalayer.repositories.ExtraAttributeRawDao r2 = r7.extraAttributeRawDao
            l4.a r6 = r7.getAttributesInCategoriesWithTypeQuery(r8, r6)
            r7 = 0
            r0.L$0 = r7
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r8 = r2.getAttributesInCategoriesWithType(r6, r0)
            if (r8 != r1) goto L67
            return r1
        L67:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.ExtraAttributeRawRepository.getAttributesWithCategoryIdOfType(com.forsale.app.features.postad.extraattributes.enums.AttributeType, int, zz.a):java.lang.Object");
    }

    public final Object getCategoriesNestedByCategoryId(int i11, zz.a<? super String> aVar) {
        return this.extraAttributeRawDao.getCategoriesNestedByCategoryId(getCategoriesNestedByCategoryIdQuery(i11), aVar);
    }

    public final Object getExtraAttributeOptionById(int i11, zz.a<? super ExtraAttributeOptionEntity> aVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new ExtraAttributeRawRepository$getExtraAttributeOptionById$2(this, i11, null), aVar);
    }

    public final Object getExtraAttributeOptionsBuAttributeId(int i11, zz.a<? super List<ExtraAttributeOptionEntity>> aVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new ExtraAttributeRawRepository$getExtraAttributeOptionsBuAttributeId$2(this, i11, null), aVar);
    }

    public final Object getExtraAttributeOptionsByIds(List<Integer> list, zz.a<? super List<String>> aVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new ExtraAttributeRawRepository$getExtraAttributeOptionsByIds$2(this, list, null), aVar);
    }

    public final Object getExtraAttributeOptionsListByAttributeIds(List<Integer> list, zz.a<? super List<ExtraAttributeOptionEntity>> aVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new ExtraAttributeRawRepository$getExtraAttributeOptionsListByAttributeIds$2(list, this, null), aVar);
    }

    public final Object getExtraAttributesById(int i11, zz.a<? super ExtraAttributeEntity> aVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new ExtraAttributeRawRepository$getExtraAttributesById$2(this, i11, null), aVar);
    }

    public final Object getExtraAttributesByIds(String str, zz.a<? super List<ExtraAttributeEntity>> aVar) {
        return this.extraAttributeRawDao.getExtraAttributesByIds(getExtraAttributesByIdsQuery(str), aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c A[LOOP:0: B:24:0x0076->B:26:0x007c, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getFilterableAttributesWithCategoryIdAsFilterSettings(int r20, zz.a<? super java.util.List<com.forsale.app.datalayer.network.responses.ListingsResponse.UISettings.FiltrationSetting>> r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            boolean r2 = r1 instanceof com.forsale.app.datalayer.repositories.ExtraAttributeRawRepository$getFilterableAttributesWithCategoryIdAsFilterSettings$1
            if (r2 == 0) goto L17
            r2 = r1
            com.forsale.app.datalayer.repositories.ExtraAttributeRawRepository$getFilterableAttributesWithCategoryIdAsFilterSettings$1 r2 = (com.forsale.app.datalayer.repositories.ExtraAttributeRawRepository$getFilterableAttributesWithCategoryIdAsFilterSettings$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            com.forsale.app.datalayer.repositories.ExtraAttributeRawRepository$getFilterableAttributesWithCategoryIdAsFilterSettings$1 r2 = new com.forsale.app.datalayer.repositories.ExtraAttributeRawRepository$getFilterableAttributesWithCategoryIdAsFilterSettings$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.f()
            int r4 = r2.label
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L40
            if (r4 == r6) goto L38
            if (r4 != r5) goto L30
            kotlin.f.b(r1)
            goto L65
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L38:
            java.lang.Object r4 = r2.L$0
            com.forsale.app.datalayer.repositories.ExtraAttributeRawRepository r4 = (com.forsale.app.datalayer.repositories.ExtraAttributeRawRepository) r4
            kotlin.f.b(r1)
            goto L51
        L40:
            kotlin.f.b(r1)
            r2.L$0 = r0
            r2.label = r6
            r1 = r20
            java.lang.Object r1 = r0.getCategoriesNestedByCategoryId(r1, r2)
            if (r1 != r3) goto L50
            return r3
        L50:
            r4 = r0
        L51:
            java.lang.String r1 = (java.lang.String) r1
            com.forsale.app.datalayer.repositories.ExtraAttributeRawDao r6 = r4.extraAttributeRawDao
            l4.a r1 = r4.getFilterableAttributesInCategoriesWithTypes(r1)
            r4 = 0
            r2.L$0 = r4
            r2.label = r5
            java.lang.Object r1 = r6.getAttributesInCategoriesWithType(r1, r2)
            if (r1 != r3) goto L65
            return r3
        L65:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.p.y(r1, r3)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L76:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lc0
            java.lang.Object r3 = r1.next()
            com.forsale.app.datalayer.database.ExtraAttributeEntity r3 = (com.forsale.app.datalayer.database.ExtraAttributeEntity) r3
            com.forsale.app.datalayer.network.responses.ListingsResponse$UISettings$FiltrationSetting r15 = new com.forsale.app.datalayer.network.responses.ListingsResponse$UISettings$FiltrationSetting
            r5 = 0
            r6 = 0
            com.forsale.app.datalayer.network.responses.ListingsResponse$UISettings$FiltrationSetting$FilterType r7 = com.forsale.app.datalayer.network.responses.ListingsResponse.UISettings.FiltrationSetting.FilterType.ATTRIBUTE
            com.forsale.app.datalayer.network.responses.ListingsResponse$UISettings$FiltrationSetting$ViewType r8 = r3.getViewType()
            com.forsale.app.datalayer.network.responses.ListingsResponse$UISettings$FiltrationSetting$ExposeType r9 = r3.getExposedType()
            com.forsale.app.datalayer.network.responses.ListingsResponse$UISettings$Label r10 = new com.forsale.app.datalayer.network.responses.ListingsResponse$UISettings$Label
            java.lang.String r4 = r3.getNameAr()
            java.lang.String r11 = r3.getNameEn()
            r10.<init>(r4, r11)
            com.forsale.app.datalayer.network.responses.ListingsResponse$UISettings$FiltrationSetting$SelectionType r11 = r3.getSelectionType()
            r12 = 0
            int r4 = r3.getId()
            java.lang.Integer r13 = kotlin.coroutines.jvm.internal.a.d(r4)
            java.lang.String r14 = r3.getType()
            r3 = 0
            r16 = 1155(0x483, float:1.618E-42)
            r17 = 0
            r4 = r15
            r18 = r15
            r15 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r3 = r18
            r2.add(r3)
            goto L76
        Lc0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.ExtraAttributeRawRepository.getFilterableAttributesWithCategoryIdAsFilterSettings(int, zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getOptions(java.util.List<com.forsale.app.datalayer.database.ExtraAttributeEntity> r6, java.util.List<com.forsale.app.datalayer.network.entities.ExtraAttr> r7, zz.a<? super java.util.List<com.forsale.app.datalayer.database.ExtraAttributeOptionEntity>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.forsale.app.datalayer.repositories.ExtraAttributeRawRepository$getOptions$1
            if (r0 == 0) goto L13
            r0 = r8
            com.forsale.app.datalayer.repositories.ExtraAttributeRawRepository$getOptions$1 r0 = (com.forsale.app.datalayer.repositories.ExtraAttributeRawRepository$getOptions$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.ExtraAttributeRawRepository$getOptions$1 r0 = new com.forsale.app.datalayer.repositories.ExtraAttributeRawRepository$getOptions$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r8)
            goto L9a
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.f.b(r8)
            java.util.List r6 = r5.getDropdownOptionIds(r6)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
        L43:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L62
            java.lang.Object r2 = r7.next()
            r4 = r2
            com.forsale.app.datalayer.network.entities.ExtraAttr r4 = (com.forsale.app.datalayer.network.entities.ExtraAttr) r4
            int r4 = r4.getId()
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.a.d(r4)
            boolean r4 = r6.contains(r4)
            if (r4 == 0) goto L43
            r8.add(r2)
            goto L43
        L62:
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r7 = kotlin.collections.p.y(r8, r7)
            r6.<init>(r7)
            java.util.Iterator r7 = r8.iterator()
        L71:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L8d
            java.lang.Object r8 = r7.next()
            com.forsale.app.datalayer.network.entities.ExtraAttr r8 = (com.forsale.app.datalayer.network.entities.ExtraAttr) r8
            java.lang.String r8 = r8.getValue()
            int r8 = java.lang.Integer.parseInt(r8)
            java.lang.Integer r8 = kotlin.coroutines.jvm.internal.a.d(r8)
            r6.add(r8)
            goto L71
        L8d:
            java.util.List r6 = kotlin.collections.p.c0(r6)
            r0.label = r3
            java.lang.Object r8 = r5.getExtraAttributeOptionByOptionIds(r6, r0)
            if (r8 != r1) goto L9a
            return r1
        L9a:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.List r6 = kotlin.collections.p.c0(r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.ExtraAttributeRawRepository.getOptions(java.util.List, java.util.List, zz.a):java.lang.Object");
    }

    public final Object getExtraAttributesByIds(List<Integer> list, zz.a<? super List<ExtraAttributeEntity>> aVar) {
        return this.extraAttributeRawDao.getExtraAttributesByIds(list, aVar);
    }
}
