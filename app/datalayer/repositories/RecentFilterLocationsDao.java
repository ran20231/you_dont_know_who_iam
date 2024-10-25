package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.database.RecentLocationsEntity;
import java.util.List;
import kotlinx.coroutines.flow.Flow;
/* compiled from: RecentFilterLocationsDao.kt */
/* loaded from: classes2.dex */
public interface RecentFilterLocationsDao {
    void deleteRecentLocations(int i11);

    Flow<List<RecentLocationsEntity>> getRecentLocations(int i11);

    void insert(List<RecentLocationsEntity> list);
}
