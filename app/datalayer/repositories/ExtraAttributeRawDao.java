package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.database.ExtraAttributeEntity;
import com.forsale.app.datalayer.database.ExtraAttributeFlatGroupEntity;
import java.util.List;
import l4.l;
/* compiled from: ExtraAttributeRawDao.kt */
/* loaded from: classes2.dex */
public interface ExtraAttributeRawDao {
    Object getAttributesGroupedByCategoryIds(l lVar, zz.a<? super List<ExtraAttributeFlatGroupEntity>> aVar);

    Object getAttributesInCategoriesWithType(l lVar, zz.a<? super List<ExtraAttributeEntity>> aVar);

    Object getCategoriesNestedByCategoryId(l lVar, zz.a<? super String> aVar);

    Object getExtraAttributeWithId(int i11, zz.a<? super ExtraAttributeEntity> aVar);

    Object getExtraAttributesByIds(List<Integer> list, zz.a<? super List<ExtraAttributeEntity>> aVar);

    Object getExtraAttributesByIds(l lVar, zz.a<? super List<ExtraAttributeEntity>> aVar);
}
