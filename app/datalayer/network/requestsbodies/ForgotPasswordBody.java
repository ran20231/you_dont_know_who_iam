package com.forsale.app.datalayer.network.requestsbodies;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: ForgotPasswordBody.kt */
/* loaded from: classes2.dex */
public final class ForgotPasswordBody {
    public static final int $stable = 0;
    @c("method")
    private final String method;
    @c("phone")
    private final String phone;

    public ForgotPasswordBody(String phone, String str) {
        o.i(phone, "phone");
        this.phone = phone;
        this.method = str;
    }

    public static /* synthetic */ ForgotPasswordBody copy$default(ForgotPasswordBody forgotPasswordBody, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = forgotPasswordBody.phone;
        }
        if ((i11 & 2) != 0) {
            str2 = forgotPasswordBody.method;
        }
        return forgotPasswordBody.copy(str, str2);
    }

    public final String component1() {
        return this.phone;
    }

    public final String component2() {
        return this.method;
    }

    public final ForgotPasswordBody copy(String phone, String str) {
        o.i(phone, "phone");
        return new ForgotPasswordBody(phone, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ForgotPasswordBody)) {
            return false;
        }
        ForgotPasswordBody forgotPasswordBody = (ForgotPasswordBody) obj;
        if (o.d(this.phone, forgotPasswordBody.phone) && o.d(this.method, forgotPasswordBody.method)) {
            return true;
        }
        return false;
    }

    public final String getMethod() {
        return this.method;
    }

    public final String getPhone() {
        return this.phone;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.phone.hashCode() * 31;
        String str = this.method;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        String str = this.phone;
        String str2 = this.method;
        return "ForgotPasswordBody(phone=" + str + ", method=" + str2 + ")";
    }

    public /* synthetic */ ForgotPasswordBody(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2);
    }
}
