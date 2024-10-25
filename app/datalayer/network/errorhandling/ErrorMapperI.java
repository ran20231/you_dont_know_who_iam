package com.forsale.app.datalayer.network.errorhandling;

import com.forsale.app.datalayer.network.errorhandling.ForSaleDataResult;
import dj.i;
import java.io.IOException;
import kotlin.jvm.internal.o;
import x10.a;
/* compiled from: ErrorMapperI.kt */
/* loaded from: classes2.dex */
public final class ErrorMapperI implements ErrorMapper {
    public static final int $stable = 0;

    @Override // com.forsale.app.datalayer.network.errorhandling.ErrorMapper
    public ForSaleDataResult.Error mapHttpError(NetworkErrorModel networkErrorModel) {
        ForSaleDataResult.Error unAuthorizedUserError;
        if (networkErrorModel != null) {
            int code = networkErrorModel.getCode();
            if (code != 401) {
                if (code != 403) {
                    if (code != 422) {
                        int code2 = networkErrorModel.getCode();
                        String message = networkErrorModel.getMessage();
                        a.b("Unexpected error: " + code2 + ":: " + message, new Object[0]);
                        i invoke = i.f54287a.invoke();
                        int code3 = networkErrorModel.getCode();
                        String message2 = networkErrorModel.getMessage();
                        invoke.f(new Exception("Unexpected error " + code3 + ": " + message2));
                        ForSaleDataResult.Companion companion = ForSaleDataResult.Companion;
                        String message3 = networkErrorModel.getMessage();
                        unAuthorizedUserError = companion.unExpectedError(new Exception("Unexpected error: " + message3));
                    } else {
                        String message4 = networkErrorModel.getMessage();
                        a.b("error: 422:: " + message4, new Object[0]);
                        unAuthorizedUserError = ForSaleDataResult.Companion.validationError(networkErrorModel);
                    }
                } else {
                    String message5 = networkErrorModel.getMessage();
                    a.b("error: 403:: " + message5, new Object[0]);
                    unAuthorizedUserError = ForSaleDataResult.Companion.blockedUserError(networkErrorModel.getMessage());
                }
            } else {
                String message6 = networkErrorModel.getMessage();
                a.b("error: 401:: " + message6, new Object[0]);
                unAuthorizedUserError = ForSaleDataResult.Companion.unAuthorizedUserError(networkErrorModel.getMessage());
            }
            if (unAuthorizedUserError != null) {
                return unAuthorizedUserError;
            }
        }
        i.f54287a.invoke().c("Failed to serialize the error model");
        return ForSaleDataResult.Companion.unExpectedError(new IllegalArgumentException("Failed to serialize the error model"));
    }

    @Override // com.forsale.app.datalayer.network.errorhandling.ErrorMapper
    public ForSaleDataResult.Error mapNetworkError(Throwable exception) {
        o.i(exception, "exception");
        if (exception instanceof IOException) {
            return ForSaleDataResult.Companion.internetError();
        }
        i.f54287a.invoke().f(exception);
        return ForSaleDataResult.Companion.unExpectedError(exception);
    }
}
