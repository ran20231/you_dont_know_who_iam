package com.forsale.app.datalayer.network.errorhandling;

import com.forsale.app.datalayer.network.errorhandling.ForSaleDataResult;
/* compiled from: ErrorMapper.kt */
/* loaded from: classes2.dex */
public interface ErrorMapper {
    ForSaleDataResult.Error mapHttpError(NetworkErrorModel networkErrorModel);

    ForSaleDataResult.Error mapNetworkError(Throwable th2);
}
