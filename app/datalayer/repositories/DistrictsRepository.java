package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.database.AreaWithBlocks;
import com.forsale.app.datalayer.database.DistrictEntity;
import com.forsale.app.features.postad.location.LocationLevels;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.i0;
import kotlin.collections.q;
import kotlin.collections.s;
import kotlin.jvm.internal.o;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
/* compiled from: DistrictsRepository.kt */
/* loaded from: classes2.dex */
public final class DistrictsRepository {
    public static final int $stable = 8;
    private final DistrictDao districtDao;
    private final RegionsRepository regionsRepository;

    public DistrictsRepository(DistrictDao districtDao, RegionsRepository regionsRepository) {
        o.i(districtDao, "districtDao");
        o.i(regionsRepository, "regionsRepository");
        this.districtDao = districtDao;
        this.regionsRepository = regionsRepository;
    }

    private final List<DistrictEntity> districtsToTree(List<DistrictEntity> list, int i11) {
        int y11;
        int e11;
        int d11;
        List<DistrictEntity> X0;
        DistrictEntity districtEntity;
        ArrayList<DistrictEntity> treeChildren;
        List<DistrictEntity> list2 = list;
        y11 = s.y(list2, 10);
        e11 = i0.e(y11);
        d11 = m00.o.d(e11, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(d11);
        for (Object obj : list2) {
            DistrictEntity districtEntity2 = (DistrictEntity) obj;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list2) {
                boolean z11 = true;
                if (((DistrictEntity) obj2).getLevel() != 1) {
                    z11 = false;
                }
                if (z11) {
                    arrayList.add(obj2);
                }
            }
            linkedHashMap.put(arrayList, obj);
        }
        HashMap hashMap = new HashMap();
        for (DistrictEntity districtEntity3 : list2) {
            if (!hashMap.containsKey(Integer.valueOf(districtEntity3.getId()))) {
                hashMap.put(Integer.valueOf(districtEntity3.getId()), districtEntity3);
            }
            if (hashMap.containsKey(Integer.valueOf(districtEntity3.getParentId())) && (districtEntity = (DistrictEntity) hashMap.get(Integer.valueOf(districtEntity3.getParentId()))) != null && (treeChildren = districtEntity.getTreeChildren()) != null) {
                treeChildren.add(districtEntity3);
            }
        }
        Collection values = hashMap.values();
        o.h(values, "<get-values>(...)");
        X0 = CollectionsKt___CollectionsKt.X0(values);
        return X0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getAllAreaWithBlocks(List<Integer> list, zz.a<? super List<AreaWithBlocks>> aVar) {
        return this.districtDao.getAreasWithBlocks(list, LocationLevels.AREA.getLevel(), aVar);
    }

    public static /* synthetic */ Object getAreasWithBlocks$default(DistrictsRepository districtsRepository, List list, String str, zz.a aVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        return districtsRepository.getAreasWithBlocks(list, str, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getDistrictNestedIds(int i11, zz.a<? super String> aVar) {
        return this.districtDao.getDistrictsNestedByDistrictId(getDistrictsNestedByDistrictIdQuery(i11), aVar);
    }

    private final l4.a getDistrictsNestedByDistrictIdQuery(int i11) {
        return new l4.a("WITH CTE AS (SELECT id, parent_id, id AS DistrictID FROM  districts WHERE parent_id= 0 UNION ALL SELECT t.id, t.parent_id,  t.id|| ', ' || DistrictID AS DistrictID FROM  districts t INNER JOIN CTE c ON t.parent_id = c.id) SELECT  CTE.DistrictID FROM CTE where CTE.id= " + i11 + "  ORDER BY CTE.id");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l4.a getDistrictsParentIdsNotInChildrenParentsQuery(List<Integer> list, List<Integer> list2) {
        String t02;
        String t03;
        t02 = CollectionsKt___CollectionsKt.t0(list, ",", null, null, 0, null, null, 62, null);
        t03 = CollectionsKt___CollectionsKt.t0(list2, ",", null, null, 0, null, null, 62, null);
        return new l4.a("WITH CTE AS (select Id  from districts where districts.id in (" + t02 + ") )\n SELECT  * from CTE where id NOT in (SELECT  districts.parent_id  from districts where districts.id in (" + t03 + ") )");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getParentByLeafParents(int r13, java.lang.String r14, zz.a<? super java.util.List<com.forsale.app.datalayer.database.DistrictEntity>> r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof com.forsale.app.datalayer.repositories.DistrictsRepository$getParentByLeafParents$1
            if (r0 == 0) goto L13
            r0 = r15
            com.forsale.app.datalayer.repositories.DistrictsRepository$getParentByLeafParents$1 r0 = (com.forsale.app.datalayer.repositories.DistrictsRepository$getParentByLeafParents$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.DistrictsRepository$getParentByLeafParents$1 r0 = new com.forsale.app.datalayer.repositories.DistrictsRepository$getParentByLeafParents$1
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L43
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.f.b(r15)
            goto L8d
        L2d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L35:
            int r13 = r0.I$0
            java.lang.Object r14 = r0.L$1
            java.util.List r14 = (java.util.List) r14
            java.lang.Object r2 = r0.L$0
            com.forsale.app.datalayer.repositories.DistrictsRepository r2 = (com.forsale.app.datalayer.repositories.DistrictsRepository) r2
            kotlin.f.b(r15)
            goto L76
        L43:
            kotlin.f.b(r15)
            if (r14 == 0) goto L51
            boolean r15 = kotlin.text.k.v(r14)
            if (r15 == 0) goto L4f
            goto L51
        L4f:
            r15 = 0
            goto L52
        L51:
            r15 = r4
        L52:
            if (r15 == 0) goto L55
            return r5
        L55:
            java.lang.String r15 = ","
            java.lang.String[] r7 = new java.lang.String[]{r15}
            r8 = 0
            r9 = 0
            r10 = 6
            r11 = 0
            r6 = r14
            java.util.List r14 = kotlin.text.k.F0(r6, r7, r8, r9, r10, r11)
            com.forsale.app.datalayer.repositories.RegionsRepository r15 = r12.regionsRepository
            r0.L$0 = r12
            r0.L$1 = r14
            r0.I$0 = r13
            r0.label = r4
            java.lang.Object r15 = r15.getCurrentRegion(r0)
            if (r15 != r1) goto L75
            return r1
        L75:
            r2 = r12
        L76:
            com.forsale.app.datalayer.database.RegionEntity r15 = (com.forsale.app.datalayer.database.RegionEntity) r15
            if (r15 == 0) goto L90
            com.forsale.app.datalayer.repositories.DistrictDao r2 = r2.districtDao
            int r15 = r15.getId()
            r0.L$0 = r5
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r15 = r2.getParentByLeafParents(r15, r13, r14, r0)
            if (r15 != r1) goto L8d
            return r1
        L8d:
            r5 = r15
            java.util.List r5 = (java.util.List) r5
        L90:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.DistrictsRepository.getParentByLeafParents(int, java.lang.String, zz.a):java.lang.Object");
    }

    public static /* synthetic */ Object getParentLevel$default(DistrictsRepository districtsRepository, String str, int i11, zz.a aVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = LocationLevels.DISTRICT.getLevel();
        }
        return districtsRepository.getParentLevel(str, i11, aVar);
    }

    public final Object getAllAreas(zz.a<? super List<DistrictEntity>> aVar) {
        return getAllDistrictsByLevel(LocationLevels.AREA.getLevel(), aVar);
    }

    public final Object getAllBlocks(zz.a<? super List<DistrictEntity>> aVar) {
        return getAllDistrictsByLevel(LocationLevels.BLOCK.getLevel(), aVar);
    }

    public final Object getAllDistricts(zz.a<? super List<DistrictEntity>> aVar) {
        return getAllDistrictsByLevel(LocationLevels.DISTRICT.getLevel(), aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getAllDistrictsByLevel(int r6, zz.a<? super java.util.List<com.forsale.app.datalayer.database.DistrictEntity>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.forsale.app.datalayer.repositories.DistrictsRepository$getAllDistrictsByLevel$1
            if (r0 == 0) goto L13
            r0 = r7
            com.forsale.app.datalayer.repositories.DistrictsRepository$getAllDistrictsByLevel$1 r0 = (com.forsale.app.datalayer.repositories.DistrictsRepository$getAllDistrictsByLevel$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.DistrictsRepository$getAllDistrictsByLevel$1 r0 = new com.forsale.app.datalayer.repositories.DistrictsRepository$getAllDistrictsByLevel$1
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
            goto L65
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            int r6 = r0.I$0
            java.lang.Object r2 = r0.L$0
            com.forsale.app.datalayer.repositories.DistrictsRepository r2 = (com.forsale.app.datalayer.repositories.DistrictsRepository) r2
            kotlin.f.b(r7)
            goto L51
        L3e:
            kotlin.f.b(r7)
            com.forsale.app.datalayer.repositories.RegionsRepository r7 = r5.regionsRepository
            r0.L$0 = r5
            r0.I$0 = r6
            r0.label = r4
            java.lang.Object r7 = r7.getCurrentRegion(r0)
            if (r7 != r1) goto L50
            return r1
        L50:
            r2 = r5
        L51:
            com.forsale.app.datalayer.database.RegionEntity r7 = (com.forsale.app.datalayer.database.RegionEntity) r7
            com.forsale.app.datalayer.repositories.DistrictDao r2 = r2.districtDao
            int r7 = r7.getId()
            r4 = 0
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r7 = r2.getAllDistrictsByLevel(r7, r6, r0)
            if (r7 != r1) goto L65
            return r1
        L65:
            java.util.List r7 = (java.util.List) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.DistrictsRepository.getAllDistrictsByLevel(int, zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getAllDistrictsByLevelAndParentId(int r6, int r7, zz.a<? super java.util.List<com.forsale.app.datalayer.database.DistrictEntity>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.forsale.app.datalayer.repositories.DistrictsRepository$getAllDistrictsByLevelAndParentId$1
            if (r0 == 0) goto L13
            r0 = r8
            com.forsale.app.datalayer.repositories.DistrictsRepository$getAllDistrictsByLevelAndParentId$1 r0 = (com.forsale.app.datalayer.repositories.DistrictsRepository$getAllDistrictsByLevelAndParentId$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.DistrictsRepository$getAllDistrictsByLevelAndParentId$1 r0 = new com.forsale.app.datalayer.repositories.DistrictsRepository$getAllDistrictsByLevelAndParentId$1
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
            goto L69
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            int r7 = r0.I$1
            int r6 = r0.I$0
            java.lang.Object r2 = r0.L$0
            com.forsale.app.datalayer.repositories.DistrictsRepository r2 = (com.forsale.app.datalayer.repositories.DistrictsRepository) r2
            kotlin.f.b(r8)
            goto L55
        L40:
            kotlin.f.b(r8)
            com.forsale.app.datalayer.repositories.RegionsRepository r8 = r5.regionsRepository
            r0.L$0 = r5
            r0.I$0 = r6
            r0.I$1 = r7
            r0.label = r4
            java.lang.Object r8 = r8.getCurrentRegion(r0)
            if (r8 != r1) goto L54
            return r1
        L54:
            r2 = r5
        L55:
            com.forsale.app.datalayer.database.RegionEntity r8 = (com.forsale.app.datalayer.database.RegionEntity) r8
            com.forsale.app.datalayer.repositories.DistrictDao r2 = r2.districtDao
            int r8 = r8.getId()
            r4 = 0
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r8 = r2.getAllDistrictsByLevelAndParentId(r8, r6, r7, r0)
            if (r8 != r1) goto L69
            return r1
        L69:
            java.util.List r8 = (java.util.List) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.DistrictsRepository.getAllDistrictsByLevelAndParentId(int, int, zz.a):java.lang.Object");
    }

    public final Object getAllDistrictsByLevelAndParentIds(int i11, List<Integer> list, zz.a<? super List<DistrictEntity>> aVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new DistrictsRepository$getAllDistrictsByLevelAndParentIds$2(this, i11, list, null), aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getAllLocations(zz.a<? super java.util.List<com.forsale.app.datalayer.database.DistrictEntity>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.forsale.app.datalayer.repositories.DistrictsRepository$getAllLocations$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.datalayer.repositories.DistrictsRepository$getAllLocations$1 r0 = (com.forsale.app.datalayer.repositories.DistrictsRepository$getAllLocations$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.DistrictsRepository$getAllLocations$1 r0 = new com.forsale.app.datalayer.repositories.DistrictsRepository$getAllLocations$1
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
            goto L61
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.L$0
            com.forsale.app.datalayer.repositories.DistrictsRepository r2 = (com.forsale.app.datalayer.repositories.DistrictsRepository) r2
            kotlin.f.b(r6)
            goto L4d
        L3c:
            kotlin.f.b(r6)
            com.forsale.app.datalayer.repositories.RegionsRepository r6 = r5.regionsRepository
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r6.getCurrentRegion(r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            r2 = r5
        L4d:
            com.forsale.app.datalayer.database.RegionEntity r6 = (com.forsale.app.datalayer.database.RegionEntity) r6
            com.forsale.app.datalayer.repositories.DistrictDao r2 = r2.districtDao
            int r6 = r6.getId()
            r4 = 0
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r2.getAllDistricts(r6, r0)
            if (r6 != r1) goto L61
            return r1
        L61:
            java.util.List r6 = (java.util.List) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.DistrictsRepository.getAllLocations(zz.a):java.lang.Object");
    }

    public final Object getAreasWithBlocks(List<Integer> list, String str, zz.a<? super List<AreaWithBlocks>> aVar) {
        if (list == null) {
            list = q.e(kotlin.coroutines.jvm.internal.a.d(1));
        }
        return getAllAreaWithBlocks(list, aVar);
    }

    public final Object getDistrictByDistrictId(int i11, zz.a<? super DistrictEntity> aVar) {
        return this.districtDao.getDistrictById(i11, aVar);
    }

    public final Object getDistrictsByIdORParentId(List<Integer> list, zz.a<? super List<AreaWithBlocks>> aVar) {
        return this.districtDao.getDistrictsByIdORParentId(list, aVar);
    }

    public final Object getDistrictsByIds(List<Integer> list, zz.a<? super List<DistrictEntity>> aVar) {
        return this.districtDao.getDistrictsByIds(list, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getDistrictsByMainDistrictId(zz.a<? super java.util.List<com.forsale.app.datalayer.database.DistrictEntity>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.forsale.app.datalayer.repositories.DistrictsRepository$getDistrictsByMainDistrictId$1
            if (r0 == 0) goto L13
            r0 = r7
            com.forsale.app.datalayer.repositories.DistrictsRepository$getDistrictsByMainDistrictId$1 r0 = (com.forsale.app.datalayer.repositories.DistrictsRepository$getDistrictsByMainDistrictId$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.DistrictsRepository$getDistrictsByMainDistrictId$1 r0 = new com.forsale.app.datalayer.repositories.DistrictsRepository$getDistrictsByMainDistrictId$1
            r0.<init>(r6, r7)
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
            goto L69
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            java.lang.Object r2 = r0.L$0
            com.forsale.app.datalayer.repositories.DistrictsRepository r2 = (com.forsale.app.datalayer.repositories.DistrictsRepository) r2
            kotlin.f.b(r7)
            goto L4d
        L3c:
            kotlin.f.b(r7)
            com.forsale.app.datalayer.repositories.RegionsRepository r7 = r6.regionsRepository
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r7 = r7.getCurrentRegion(r0)
            if (r7 != r1) goto L4c
            return r1
        L4c:
            r2 = r6
        L4d:
            com.forsale.app.datalayer.database.RegionEntity r7 = (com.forsale.app.datalayer.database.RegionEntity) r7
            r5 = 0
            if (r7 == 0) goto L6c
            com.forsale.app.datalayer.repositories.DistrictDao r2 = r2.districtDao
            java.lang.Integer r7 = r7.getMainDistrictId()
            if (r7 == 0) goto L5e
            int r4 = r7.intValue()
        L5e:
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r7 = r2.getDistrictsByMainDistrictId(r4, r0)
            if (r7 != r1) goto L69
            return r1
        L69:
            r5 = r7
            java.util.List r5 = (java.util.List) r5
        L6c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.DistrictsRepository.getDistrictsByMainDistrictId(zz.a):java.lang.Object");
    }

    public final Object getDistrictsNameEnByIds(List<Integer> list, zz.a<? super List<String>> aVar) {
        return this.districtDao.getDistrictsNameEnByIds(list, aVar);
    }

    public final Object getDistrictsParentIdsNotInChildrenParents(List<Integer> list, List<Integer> list2, zz.a<? super List<Integer>> aVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new DistrictsRepository$getDistrictsParentIdsNotInChildrenParents$2(this, list, list2, null), aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ab A[LOOP:0: B:25:0x00a5->B:27:0x00ab, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cc A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getDistrictsRecursive(java.util.List<com.forsale.app.datalayer.database.DistrictEntity> r12, zz.a<? super java.util.List<com.forsale.app.datalayer.database.DistrictEntity>> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.forsale.app.datalayer.repositories.DistrictsRepository$getDistrictsRecursive$1
            if (r0 == 0) goto L13
            r0 = r13
            com.forsale.app.datalayer.repositories.DistrictsRepository$getDistrictsRecursive$1 r0 = (com.forsale.app.datalayer.repositories.DistrictsRepository$getDistrictsRecursive$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.DistrictsRepository$getDistrictsRecursive$1 r0 = new com.forsale.app.datalayer.repositories.DistrictsRepository$getDistrictsRecursive$1
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 10
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            kotlin.f.b(r13)
            goto Lcd
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            java.lang.Object r12 = r0.L$0
            com.forsale.app.datalayer.repositories.DistrictsRepository r12 = (com.forsale.app.datalayer.repositories.DistrictsRepository) r12
            kotlin.f.b(r13)
            goto L83
        L3f:
            kotlin.f.b(r13)
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r13 = new java.util.ArrayList
            int r2 = kotlin.collections.p.y(r12, r3)
            r13.<init>(r2)
            java.util.Iterator r12 = r12.iterator()
        L51:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L69
            java.lang.Object r2 = r12.next()
            com.forsale.app.datalayer.database.DistrictEntity r2 = (com.forsale.app.datalayer.database.DistrictEntity) r2
            int r2 = r2.getId()
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.a.d(r2)
            r13.add(r2)
            goto L51
        L69:
            java.util.List r12 = kotlin.collections.p.X0(r13)
            java.lang.Object r12 = kotlin.collections.p.k0(r12)
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            r0.L$0 = r11
            r0.label = r5
            java.lang.Object r13 = r11.getDistrictNestedIds(r12, r0)
            if (r13 != r1) goto L82
            return r1
        L82:
            r12 = r11
        L83:
            r5 = r13
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r13 = ","
            java.lang.String[] r6 = new java.lang.String[]{r13}
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            java.util.List r13 = kotlin.text.k.F0(r5, r6, r7, r8, r9, r10)
            com.forsale.app.datalayer.repositories.DistrictDao r12 = r12.districtDao
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = kotlin.collections.p.y(r13, r3)
            r2.<init>(r3)
            java.util.Iterator r13 = r13.iterator()
        La5:
            boolean r3 = r13.hasNext()
            if (r3 == 0) goto Lbd
            java.lang.Object r3 = r13.next()
            java.lang.String r3 = (java.lang.String) r3
            int r3 = java.lang.Integer.parseInt(r3)
            java.lang.Integer r3 = kotlin.coroutines.jvm.internal.a.d(r3)
            r2.add(r3)
            goto La5
        Lbd:
            java.util.List r13 = kotlin.collections.p.X0(r2)
            r2 = 0
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r13 = r12.getDistrictsByIds(r13, r0)
            if (r13 != r1) goto Lcd
            return r1
        Lcd:
            java.util.List r13 = (java.util.List) r13
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.DistrictsRepository.getDistrictsRecursive(java.util.List, zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getDistrictsTree(zz.a<? super java.util.List<com.forsale.app.datalayer.database.DistrictEntity>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.forsale.app.datalayer.repositories.DistrictsRepository$getDistrictsTree$1
            if (r0 == 0) goto L13
            r0 = r7
            com.forsale.app.datalayer.repositories.DistrictsRepository$getDistrictsTree$1 r0 = (com.forsale.app.datalayer.repositories.DistrictsRepository$getDistrictsTree$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.DistrictsRepository$getDistrictsTree$1 r0 = new com.forsale.app.datalayer.repositories.DistrictsRepository$getDistrictsTree$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r1 = r0.L$1
            com.forsale.app.datalayer.database.RegionEntity r1 = (com.forsale.app.datalayer.database.RegionEntity) r1
            java.lang.Object r0 = r0.L$0
            com.forsale.app.datalayer.repositories.DistrictsRepository r0 = (com.forsale.app.datalayer.repositories.DistrictsRepository) r0
            kotlin.f.b(r7)
            goto L6d
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L3c:
            java.lang.Object r2 = r0.L$0
            com.forsale.app.datalayer.repositories.DistrictsRepository r2 = (com.forsale.app.datalayer.repositories.DistrictsRepository) r2
            kotlin.f.b(r7)
            goto L55
        L44:
            kotlin.f.b(r7)
            com.forsale.app.datalayer.repositories.RegionsRepository r7 = r6.regionsRepository
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r7 = r7.getCurrentRegion(r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            r2 = r6
        L55:
            com.forsale.app.datalayer.database.RegionEntity r7 = (com.forsale.app.datalayer.database.RegionEntity) r7
            com.forsale.app.datalayer.repositories.DistrictDao r4 = r2.districtDao
            int r5 = r7.getId()
            r0.L$0 = r2
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r0 = r4.getAllDistricts(r5, r0)
            if (r0 != r1) goto L6a
            return r1
        L6a:
            r1 = r7
            r7 = r0
            r0 = r2
        L6d:
            java.util.List r7 = (java.util.List) r7
            int r1 = r1.getId()
            java.util.List r7 = r0.districtsToTree(r7, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.DistrictsRepository.getDistrictsTree(zz.a):java.lang.Object");
    }

    public final Object getMainDistricts(zz.a<? super List<DistrictEntity>> aVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new DistrictsRepository$getMainDistricts$2(this, null), aVar);
    }

    public final Object getParentDistrictByLeafParents(String str, zz.a<? super List<DistrictEntity>> aVar) {
        return getParentByLeafParents(LocationLevels.DISTRICT.getLevel(), str, aVar);
    }

    public final Object getParentLevel(String str, int i11, zz.a<? super DistrictEntity> aVar) {
        List<String> F0;
        DistrictDao districtDao = this.districtDao;
        F0 = StringsKt__StringsKt.F0(str, new String[]{","}, false, 0, 6, null);
        return districtDao.getParentLevel(F0, i11, aVar);
    }

    public final Object getParents(List<Integer> list, zz.a<? super List<String>> aVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new DistrictsRepository$getParents$2(this, list, null), aVar);
    }

    public final Object intersectDistricts(List<Integer> list, List<Integer> list2, zz.a<? super List<Integer>> aVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new DistrictsRepository$intersectDistricts$2(this, list, list2, null), aVar);
    }
}
