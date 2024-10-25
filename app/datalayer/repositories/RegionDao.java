package com.forsale.app.datalayer.repositories;

import androidx.lifecycle.LiveData;
import com.forsale.app.datalayer.database.RegionEntity;
import java.util.List;
import kotlinx.coroutines.flow.Flow;
/* compiled from: RegionDao.kt */
/* loaded from: classes2.dex */
public interface RegionDao {
    Object deleteAllRegions(List<RegionEntity> list, zz.a<? super Integer> aVar);

    Object deleteAllRegions(zz.a<? super Integer> aVar);

    Object deleteRegion(RegionEntity regionEntity, zz.a<? super Integer> aVar);

    LiveData<List<RegionEntity>> getAllRegions();

    Object getAllRegionsSuspend(zz.a<? super List<RegionEntity>> aVar);

    LiveData<RegionEntity> getRegionById(int i11);

    Object getRegionByIdAsync(int i11, zz.a<? super RegionEntity> aVar);

    Object getRegionByIdNullable(int i11, zz.a<? super RegionEntity> aVar);

    Flow<RegionEntity> getRegionFlowById(int i11);

    Object getRegionObjectById(int i11, zz.a<? super RegionEntity> aVar);

    Object insertAllRegions(List<RegionEntity> list, zz.a<? super List<Long>> aVar);

    Object insertRegion(RegionEntity regionEntity, zz.a<? super Long> aVar);

    Object updateRegion(RegionEntity regionEntity, zz.a<? super Integer> aVar);
}
