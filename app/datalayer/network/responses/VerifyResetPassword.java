package com.forsale.app.datalayer.network.responses;

import com.forsale.app.datalayer.network.responses.AuthResponse;
import com.leanplum.internal.Constants;
import java.util.List;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: VerifyResetPassword.kt */
/* loaded from: classes2.dex */
public final class VerifyResetPassword {
    public static final int $stable = 8;
    @c("data")
    private final List<AuthResponse.Data> data;
    @c(Constants.Params.MESSAGE)
    private final String message;

    public VerifyResetPassword(List<AuthResponse.Data> data, String str) {
        o.i(data, "data");
        this.data = data;
        this.message = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VerifyResetPassword copy$default(VerifyResetPassword verifyResetPassword, List list, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = verifyResetPassword.data;
        }
        if ((i11 & 2) != 0) {
            str = verifyResetPassword.message;
        }
        return verifyResetPassword.copy(list, str);
    }

    public final List<AuthResponse.Data> component1() {
        return this.data;
    }

    public final String component2() {
        return this.message;
    }

    public final VerifyResetPassword copy(List<AuthResponse.Data> data, String str) {
        o.i(data, "data");
        return new VerifyResetPassword(data, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerifyResetPassword)) {
            return false;
        }
        VerifyResetPassword verifyResetPassword = (VerifyResetPassword) obj;
        if (o.d(this.data, verifyResetPassword.data) && o.d(this.message, verifyResetPassword.message)) {
            return true;
        }
        return false;
    }

    public final List<AuthResponse.Data> getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.data.hashCode() * 31;
        String str = this.message;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        List<AuthResponse.Data> list = this.data;
        String str = this.message;
        return "VerifyResetPassword(data=" + list + ", message=" + str + ")";
    }
}
