package com.forsale.app.datalayer.repositories;

import androidx.lifecycle.LiveData;
import com.forsale.app.datalayer.database.ExtraAttributeGroupEntity;
import java.util.List;
/* compiled from: ExtraAttributeGroupDao.kt */
/* loaded from: classes2.dex */
public interface ExtraAttributeGroupDao {
    Object deleteAllExtraAttributeGroups(List<ExtraAttributeGroupEntity> list, zz.a<? super Integer> aVar);

    Object deleteAllExtraAttributeGroups(zz.a<? super Integer> aVar);

    Object deleteExtraAttributeGroup(ExtraAttributeGroupEntity extraAttributeGroupEntity, zz.a<? super Integer> aVar);

    LiveData<List<ExtraAttributeGroupEntity>> getAllExtraAttributeGroups();

    Object getAllExtraAttributeGroupsSuspend(zz.a<? super List<ExtraAttributeGroupEntity>> aVar);

    LiveData<ExtraAttributeGroupEntity> getExtraAttributeGroupById(int i11);

    Object insertAllExtraAttributeGroups(List<ExtraAttributeGroupEntity> list, zz.a<? super List<Long>> aVar);

    Object insertExtraAttributeGroup(ExtraAttributeGroupEntity extraAttributeGroupEntity, zz.a<? super Long> aVar);

    Object updateExtraAttributeGroup(ExtraAttributeGroupEntity extraAttributeGroupEntity, zz.a<? super Integer> aVar);
}
