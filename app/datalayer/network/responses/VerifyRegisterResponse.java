package com.forsale.app.datalayer.network.responses;

import com.leanplum.internal.Constants;
import java.util.List;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: VerifyRegisterResponse.kt */
/* loaded from: classes2.dex */
public final class VerifyRegisterResponse {
    public static final int $stable = 8;
    @c("data")
    private final List<Object> data;
    @c(Constants.Params.MESSAGE)
    private final String message;

    public VerifyRegisterResponse(List<? extends Object> data, String message) {
        o.i(data, "data");
        o.i(message, "message");
        this.data = data;
        this.message = message;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VerifyRegisterResponse copy$default(VerifyRegisterResponse verifyRegisterResponse, List list, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = verifyRegisterResponse.data;
        }
        if ((i11 & 2) != 0) {
            str = verifyRegisterResponse.message;
        }
        return verifyRegisterResponse.copy(list, str);
    }

    public final List<Object> component1() {
        return this.data;
    }

    public final String component2() {
        return this.message;
    }

    public final VerifyRegisterResponse copy(List<? extends Object> data, String message) {
        o.i(data, "data");
        o.i(message, "message");
        return new VerifyRegisterResponse(data, message);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerifyRegisterResponse)) {
            return false;
        }
        VerifyRegisterResponse verifyRegisterResponse = (VerifyRegisterResponse) obj;
        if (o.d(this.data, verifyRegisterResponse.data) && o.d(this.message, verifyRegisterResponse.message)) {
            return true;
        }
        return false;
    }

    public final List<Object> getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return (this.data.hashCode() * 31) + this.message.hashCode();
    }

    public String toString() {
        List<Object> list = this.data;
        String str = this.message;
        return "VerifyRegisterResponse(data=" + list + ", message=" + str + ")";
    }
}
