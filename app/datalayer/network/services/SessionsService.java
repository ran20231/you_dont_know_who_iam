package com.forsale.app.datalayer.network.services;

import com.forsale.app.datalayer.network.entities.SessionEntity;
import com.forsale.app.datalayer.network.requestsbodies.SessionBody;
import i10.a;
import i10.o;
/* compiled from: SessionsService.kt */
/* loaded from: classes2.dex */
public interface SessionsService {
    @o("Sessions/getSession")
    Object getSession(@a SessionBody sessionBody, zz.a<? super SessionEntity> aVar);
}
