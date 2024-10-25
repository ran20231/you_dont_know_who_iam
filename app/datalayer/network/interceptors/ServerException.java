package com.forsale.app.datalayer.network.interceptors;

import java.io.IOException;
/* compiled from: AuthInterceptor.kt */
/* loaded from: classes2.dex */
public final class ServerException extends IOException {
    public static final int $stable = 0;
    private final int errorCode;

    public ServerException(int i11, String str) {
        super(str);
        this.errorCode = i11;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }
}
