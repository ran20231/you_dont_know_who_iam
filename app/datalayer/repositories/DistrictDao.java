package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.database.AreaWithBlocks;
import com.forsale.app.datalayer.database.DistrictEntity;
import java.util.List;
import l4.l;
/* compiled from: DistrictDao.kt */
/* loaded from: classes2.dex */
public interface DistrictDao {
    Object deleteAllDistricts(List<DistrictEntity> list, zz.a<? super Integer> aVar);

    Object deleteAllDistricts(zz.a<? super Integer> aVar);

    Object deleteDistrict(DistrictEntity districtEntity, zz.a<? super Integer> aVar);

    Object getAllDistricts(int i11, zz.a<? super List<DistrictEntity>> aVar);

    Object getAllDistrictsByLevel(int i11, int i12, zz.a<? super List<DistrictEntity>> aVar);

    Object getAllDistrictsByLevelAndParentId(int i11, int i12, int i13, zz.a<? super List<DistrictEntity>> aVar);

    Object getAllDistrictsByLevelAndParentIds(int i11, int i12, List<Integer> list, zz.a<? super List<DistrictEntity>> aVar);

    Object getAllDistrictsSuspend(zz.a<? super List<DistrictEntity>> aVar);

    Object getAreasWithBlocks(List<Integer> list, int i11, zz.a<? super List<AreaWithBlocks>> aVar);

    Object getDistrictById(int i11, zz.a<? super DistrictEntity> aVar);

    Object getDistrictsByIdORParentId(List<Integer> list, zz.a<? super List<AreaWithBlocks>> aVar);

    Object getDistrictsByIds(List<Integer> list, zz.a<? super List<DistrictEntity>> aVar);

    Object getDistrictsByMainDistrictId(int i11, zz.a<? super List<DistrictEntity>> aVar);

    Object getDistrictsNameEnByIds(List<Integer> list, zz.a<? super List<String>> aVar);

    Object getDistrictsNestedByDistrictId(l lVar, zz.a<? super String> aVar);

    Object getDistrictsParentIdsNotInChildrenParents(l lVar, zz.a<? super List<Integer>> aVar);

    Object getParentByLeafParents(int i11, int i12, List<String> list, zz.a<? super List<DistrictEntity>> aVar);

    Object getParentLevel(List<String> list, int i11, zz.a<? super DistrictEntity> aVar);

    Object getParents(List<Integer> list, zz.a<? super List<String>> aVar);

    Object insertAllDistricts(List<DistrictEntity> list, zz.a<? super List<Long>> aVar);

    Object insertDistrict(DistrictEntity districtEntity, zz.a<? super Long> aVar);

    Object intersectDistricts(List<String> list, List<Integer> list2, zz.a<? super List<Integer>> aVar);

    Object searchAreasWithBlocks(List<Integer> list, String str, zz.a<? super List<AreaWithBlocks>> aVar);

    Object updateDistrict(DistrictEntity districtEntity, zz.a<? super Integer> aVar);
}
