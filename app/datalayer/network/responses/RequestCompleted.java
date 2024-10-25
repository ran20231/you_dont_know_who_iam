package com.forsale.app.datalayer.network.responses;

import com.leanplum.internal.Constants;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: RequestCompleted.kt */
/* loaded from: classes2.dex */
public final class RequestCompleted {
    public static final int $stable = 0;
    @c(Constants.Params.MESSAGE)
    private final String message;

    public RequestCompleted(String str) {
        this.message = str;
    }

    public static /* synthetic */ RequestCompleted copy$default(RequestCompleted requestCompleted, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = requestCompleted.message;
        }
        return requestCompleted.copy(str);
    }

    public final String component1() {
        return this.message;
    }

    public final RequestCompleted copy(String str) {
        return new RequestCompleted(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof RequestCompleted) && o.d(this.message, ((RequestCompleted) obj).message)) {
            return true;
        }
        return false;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        String str = this.message;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        String str = this.message;
        return "RequestCompleted(message=" + str + ")";
    }
}
