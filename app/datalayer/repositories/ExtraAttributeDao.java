package com.forsale.app.datalayer.repositories;

import androidx.lifecycle.LiveData;
import com.forsale.app.datalayer.database.ExtraAttributeEntity;
import java.util.List;
/* compiled from: ExtraAttributeDao.kt */
/* loaded from: classes2.dex */
public interface ExtraAttributeDao {
    Object deleteAllExtraAttributes(List<ExtraAttributeEntity> list, zz.a<? super Integer> aVar);

    Object deleteAllExtraAttributes(zz.a<? super Integer> aVar);

    Object deleteExtraAttribute(ExtraAttributeEntity extraAttributeEntity, zz.a<? super Integer> aVar);

    LiveData<List<ExtraAttributeEntity>> getAllExtraAttributes();

    Object getAllExtraAttributesSuspend(zz.a<? super List<ExtraAttributeEntity>> aVar);

    LiveData<ExtraAttributeEntity> getExtraAttributeById(int i11);

    Object getExtraAttributeByIds(List<Integer> list, zz.a<? super List<ExtraAttributeEntity>> aVar);

    Object insertAllExtraAttributes(List<ExtraAttributeEntity> list, zz.a<? super List<Long>> aVar);

    Object insertExtraAttribute(ExtraAttributeEntity extraAttributeEntity, zz.a<? super Long> aVar);

    Object updateExtraAttribute(ExtraAttributeEntity extraAttributeEntity, zz.a<? super Integer> aVar);
}
