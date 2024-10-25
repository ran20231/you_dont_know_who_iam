package com.forsale.app.datalayer.repositories;

import androidx.lifecycle.LiveData;
import com.forsale.app.datalayer.database.LocationEntity;
import java.util.List;
import kotlinx.coroutines.flow.Flow;
/* compiled from: LocationDao.kt */
/* loaded from: classes2.dex */
public interface LocationDao {
    Object deleteAllLocations(List<LocationEntity> list, zz.a<? super Integer> aVar);

    Object deleteAllLocations(zz.a<? super Integer> aVar);

    Object deleteLocation(LocationEntity locationEntity, zz.a<? super Integer> aVar);

    Flow<List<LocationEntity>> getAllLocations(int i11);

    Object getAllLocationsSuspend(zz.a<? super List<LocationEntity>> aVar);

    LiveData<LocationEntity> getLocationById(int i11);

    Object getLocationSuspendById(int i11, zz.a<? super LocationEntity> aVar);

    Object insertAllLocations(List<LocationEntity> list, zz.a<? super List<Long>> aVar);

    Object insertLocation(LocationEntity locationEntity, zz.a<? super Long> aVar);

    Object updateLocation(LocationEntity locationEntity, zz.a<? super Integer> aVar);
}
