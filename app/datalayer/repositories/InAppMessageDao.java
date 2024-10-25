package com.forsale.app.datalayer.repositories;

import androidx.lifecycle.LiveData;
import com.forsale.app.datalayer.database.InAppMessageEntity;
import com.forsale.app.datalayer.database.InAppType;
import java.util.List;
/* compiled from: InAppMessageDao.kt */
/* loaded from: classes2.dex */
public interface InAppMessageDao {
    Object deleteAllInAppMessages(List<InAppMessageEntity> list, zz.a<? super Integer> aVar);

    Object deleteExpiredInAppMessages(String str, zz.a<? super Integer> aVar);

    Object deleteInAppMessage(InAppMessageEntity inAppMessageEntity, zz.a<? super Integer> aVar);

    Object deleteInAppMessageById(int i11, zz.a<? super Integer> aVar);

    Object getAllInAppMessageSuspendedByTypeAndCat(InAppType inAppType, int i11, zz.a<? super List<InAppMessageEntity>> aVar);

    Object getAllInAppMessageSuspendedByTypeAndCat(InAppType inAppType, List<Integer> list, zz.a<? super List<InAppMessageEntity>> aVar);

    LiveData<List<InAppMessageEntity>> getAllInAppMessages();

    Object getAllInAppMessagesSuspended(zz.a<? super List<InAppMessageEntity>> aVar);

    Object getExpiredInAppMessages(String str, zz.a<? super List<InAppMessageEntity>> aVar);

    LiveData<InAppMessageEntity> getInAppMessageById(int i11);

    LiveData<InAppMessageEntity> getInAppMessageByType(InAppType inAppType);

    LiveData<InAppMessageEntity> getInAppMessageByTypeAndCategoryId(InAppType inAppType, int i11);

    Object getInAppMessageSuspendedById(int i11, zz.a<? super InAppMessageEntity> aVar);

    Object getInAppMessageSuspendedByType(InAppType inAppType, zz.a<? super InAppMessageEntity> aVar);

    Object getInAppMessageSuspendedByTypeAndCategoryId(InAppType inAppType, int i11, zz.a<? super InAppMessageEntity> aVar);

    Object getInAppMessageSuspendedByTypeAndCategoryId(InAppType inAppType, List<Integer> list, zz.a<? super InAppMessageEntity> aVar);

    Object insertAllInAppMessages(List<InAppMessageEntity> list, zz.a<? super List<Long>> aVar);

    Object insertInAppMessage(InAppMessageEntity inAppMessageEntity, zz.a<? super Long> aVar);

    Object updateInAppMessage(InAppMessageEntity inAppMessageEntity, zz.a<? super Integer> aVar);
}
