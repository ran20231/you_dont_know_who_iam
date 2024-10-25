package com.forsale.app.datalayer.network.services;

import com.forsale.app.datalayer.database.MasterDataModel;
import com.forsale.app.datalayer.network.requestsbodies.MasterDataBody;
import i10.a;
import i10.o;
/* compiled from: MasterDataService.kt */
/* loaded from: classes2.dex */
public interface MasterDataService {
    @o("MasterData/getMasterData")
    Object getMasterData(@a MasterDataBody masterDataBody, zz.a<? super MasterDataModel> aVar);
}
