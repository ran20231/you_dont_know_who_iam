package com.forsale.app.datalayer.network.services;

import com.forsale.app.datalayer.network.entities.CmsEntity;
import com.forsale.app.datalayer.network.requestsbodies.CmsBody;
import i10.a;
import i10.o;
import i10.s;
/* compiled from: CmsService.kt */
/* loaded from: classes2.dex */
public interface CmsService {
    @o("CmsPages/{type}")
    Object getCms(@a CmsBody cmsBody, @s("type") String str, zz.a<? super CmsEntity> aVar);
}
