package com.forsale.app.datalayer.repositories;

import androidx.lifecycle.LiveData;
import com.forsale.app.datalayer.database.ExtraAttributeOptionEntity;
import java.util.List;
/* compiled from: ExtraAttributeOptionDao.kt */
/* loaded from: classes2.dex */
public interface ExtraAttributeOptionDao {
    Object deleteAllExtraAttributeOptions(List<ExtraAttributeOptionEntity> list, zz.a<? super Integer> aVar);

    Object deleteAllExtraAttributeOptions(zz.a<? super Integer> aVar);

    Object deleteExtraAttributeOption(ExtraAttributeOptionEntity extraAttributeOptionEntity, zz.a<? super Integer> aVar);

    LiveData<List<ExtraAttributeOptionEntity>> getAllExtraAttributeOptions();

    Object getAllExtraAttributeOptionsSuspend(zz.a<? super List<ExtraAttributeOptionEntity>> aVar);

    Object getExtraAttributeOptionById(int i11, zz.a<? super ExtraAttributeOptionEntity> aVar);

    Object getExtraAttributeOptionsBuAttributeId(int i11, zz.a<? super List<ExtraAttributeOptionEntity>> aVar);

    Object getExtraAttributeOptionsByIds(List<Integer> list, zz.a<? super List<String>> aVar);

    Object getExtraAttributeOptionsByOptionIds(List<Integer> list, zz.a<? super List<ExtraAttributeOptionEntity>> aVar);

    Object getExtraAttributeOptionsListByAttributeIds(List<Integer> list, zz.a<? super List<ExtraAttributeOptionEntity>> aVar);

    Object insertAllExtraAttributeOptions(List<ExtraAttributeOptionEntity> list, zz.a<? super List<Long>> aVar);

    Object insertExtraAttributeOption(ExtraAttributeOptionEntity extraAttributeOptionEntity, zz.a<? super Long> aVar);

    Object updateExtraAttributeOption(ExtraAttributeOptionEntity extraAttributeOptionEntity, zz.a<? super Integer> aVar);
}
