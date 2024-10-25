package com.forsale.app.datalayer.network.requestsbodies;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: CancelUserAutoRepostsBody.kt */
/* loaded from: classes2.dex */
public final class CancelUserAutoRepostsBody {
    public static final int $stable = 0;
    @c("allow_auto_renew")
    private final int allowAutoRenew;
    @c("phone")
    private final String phone;
    @c("repost_auto_renew")
    private final int repostAutoRenew;

    public CancelUserAutoRepostsBody(String phone, int i11, int i12) {
        o.i(phone, "phone");
        this.phone = phone;
        this.repostAutoRenew = i11;
        this.allowAutoRenew = i12;
    }

    public static /* synthetic */ CancelUserAutoRepostsBody copy$default(CancelUserAutoRepostsBody cancelUserAutoRepostsBody, String str, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = cancelUserAutoRepostsBody.phone;
        }
        if ((i13 & 2) != 0) {
            i11 = cancelUserAutoRepostsBody.repostAutoRenew;
        }
        if ((i13 & 4) != 0) {
            i12 = cancelUserAutoRepostsBody.allowAutoRenew;
        }
        return cancelUserAutoRepostsBody.copy(str, i11, i12);
    }

    public final String component1() {
        return this.phone;
    }

    public final int component2() {
        return this.repostAutoRenew;
    }

    public final int component3() {
        return this.allowAutoRenew;
    }

    public final CancelUserAutoRepostsBody copy(String phone, int i11, int i12) {
        o.i(phone, "phone");
        return new CancelUserAutoRepostsBody(phone, i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CancelUserAutoRepostsBody)) {
            return false;
        }
        CancelUserAutoRepostsBody cancelUserAutoRepostsBody = (CancelUserAutoRepostsBody) obj;
        if (o.d(this.phone, cancelUserAutoRepostsBody.phone) && this.repostAutoRenew == cancelUserAutoRepostsBody.repostAutoRenew && this.allowAutoRenew == cancelUserAutoRepostsBody.allowAutoRenew) {
            return true;
        }
        return false;
    }

    public final int getAllowAutoRenew() {
        return this.allowAutoRenew;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final int getRepostAutoRenew() {
        return this.repostAutoRenew;
    }

    public int hashCode() {
        return (((this.phone.hashCode() * 31) + Integer.hashCode(this.repostAutoRenew)) * 31) + Integer.hashCode(this.allowAutoRenew);
    }

    public String toString() {
        String str = this.phone;
        int i11 = this.repostAutoRenew;
        int i12 = this.allowAutoRenew;
        return "CancelUserAutoRepostsBody(phone=" + str + ", repostAutoRenew=" + i11 + ", allowAutoRenew=" + i12 + ")";
    }

    public /* synthetic */ CancelUserAutoRepostsBody(String str, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i11, (i13 & 4) != 0 ? 0 : i12);
    }
}
