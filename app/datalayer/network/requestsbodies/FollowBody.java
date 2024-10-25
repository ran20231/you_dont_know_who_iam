package com.forsale.app.datalayer.network.requestsbodies;

import kotlin.jvm.internal.o;
import up.c;
/* compiled from: FollowBody.kt */
/* loaded from: classes2.dex */
public final class FollowBody {
    public static final int $stable = 0;
    @c(AdvancedSearchBody.PAGE)
    private final int page;
    @c("page_size")
    private final int pageSize;
    @c("phone")
    private final String phone;

    public FollowBody(int i11, int i12, String phone) {
        o.i(phone, "phone");
        this.page = i11;
        this.pageSize = i12;
        this.phone = phone;
    }

    public static /* synthetic */ FollowBody copy$default(FollowBody followBody, int i11, int i12, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = followBody.page;
        }
        if ((i13 & 2) != 0) {
            i12 = followBody.pageSize;
        }
        if ((i13 & 4) != 0) {
            str = followBody.phone;
        }
        return followBody.copy(i11, i12, str);
    }

    public final int component1() {
        return this.page;
    }

    public final int component2() {
        return this.pageSize;
    }

    public final String component3() {
        return this.phone;
    }

    public final FollowBody copy(int i11, int i12, String phone) {
        o.i(phone, "phone");
        return new FollowBody(i11, i12, phone);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FollowBody)) {
            return false;
        }
        FollowBody followBody = (FollowBody) obj;
        if (this.page == followBody.page && this.pageSize == followBody.pageSize && o.d(this.phone, followBody.phone)) {
            return true;
        }
        return false;
    }

    public final int getPage() {
        return this.page;
    }

    public final int getPageSize() {
        return this.pageSize;
    }

    public final String getPhone() {
        return this.phone;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.page) * 31) + Integer.hashCode(this.pageSize)) * 31) + this.phone.hashCode();
    }

    public String toString() {
        int i11 = this.page;
        int i12 = this.pageSize;
        String str = this.phone;
        return "FollowBody(page=" + i11 + ", pageSize=" + i12 + ", phone=" + str + ")";
    }
}
