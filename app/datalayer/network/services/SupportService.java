package com.forsale.app.datalayer.network.services;

import com.forsale.app.datalayer.network.entities.LogErrorEntity;
import com.forsale.app.datalayer.network.requestsbodies.LogErrorBody;
import i10.a;
import i10.o;
/* compiled from: SupportService.kt */
/* loaded from: classes2.dex */
public interface SupportService {
    @o("Support/LogErrorAndroid")
    Object logError(@a LogErrorBody logErrorBody, zz.a<? super LogErrorEntity> aVar);
}
