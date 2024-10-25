package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.database.BottomTipEntity;
import java.util.List;
import wz.p;
/* compiled from: BottomTipDao.kt */
/* loaded from: classes2.dex */
public interface BottomTipDao {
    Object deleteAllBottomTips(zz.a<? super Integer> aVar);

    Object getAllBottomTips(zz.a<? super List<BottomTipEntity>> aVar);

    Object getSingle(int i11, zz.a<? super BottomTipEntity> aVar);

    Object onInsertAll(List<BottomTipEntity> list, zz.a<? super p> aVar);

    Object onInsertSingle(BottomTipEntity bottomTipEntity, zz.a<? super p> aVar);

    Object resetLastShow(zz.a<? super p> aVar);

    Object updateSingleTip(int i11, zz.a<? super p> aVar);

    Object updateTip(int i11, String str, int i12, int i13, int i14, int i15, zz.a<? super p> aVar);

    Object updateTipAndResetCount(int i11, String str, int i12, int i13, int i14, int i15, int i16, zz.a<? super p> aVar);
}
