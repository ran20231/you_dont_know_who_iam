package com.forsale.app.datalayer.network.entities;

import kotlin.jvm.internal.o;
import up.c;
/* compiled from: GetUserAutoRepostsEntity.kt */
/* loaded from: classes2.dex */
public final class GetUserAutoRepostsEntity {
    public static final int $stable = 0;
    @c("allow_auto_renew")
    private final Integer allowAutoRenew;
    @c("repost_auto_renew")
    private final Integer repostAutoRenew;

    public GetUserAutoRepostsEntity(Integer num, Integer num2) {
        this.allowAutoRenew = num;
        this.repostAutoRenew = num2;
    }

    public static /* synthetic */ GetUserAutoRepostsEntity copy$default(GetUserAutoRepostsEntity getUserAutoRepostsEntity, Integer num, Integer num2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = getUserAutoRepostsEntity.allowAutoRenew;
        }
        if ((i11 & 2) != 0) {
            num2 = getUserAutoRepostsEntity.repostAutoRenew;
        }
        return getUserAutoRepostsEntity.copy(num, num2);
    }

    public final Integer component1() {
        return this.allowAutoRenew;
    }

    public final Integer component2() {
        return this.repostAutoRenew;
    }

    public final GetUserAutoRepostsEntity copy(Integer num, Integer num2) {
        return new GetUserAutoRepostsEntity(num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetUserAutoRepostsEntity)) {
            return false;
        }
        GetUserAutoRepostsEntity getUserAutoRepostsEntity = (GetUserAutoRepostsEntity) obj;
        if (o.d(this.allowAutoRenew, getUserAutoRepostsEntity.allowAutoRenew) && o.d(this.repostAutoRenew, getUserAutoRepostsEntity.repostAutoRenew)) {
            return true;
        }
        return false;
    }

    public final Integer getAllowAutoRenew() {
        return this.allowAutoRenew;
    }

    public final Integer getRepostAutoRenew() {
        return this.repostAutoRenew;
    }

    public int hashCode() {
        int hashCode;
        Integer num = this.allowAutoRenew;
        int i11 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i12 = hashCode * 31;
        Integer num2 = this.repostAutoRenew;
        if (num2 != null) {
            i11 = num2.hashCode();
        }
        return i12 + i11;
    }

    public String toString() {
        Integer num = this.allowAutoRenew;
        Integer num2 = this.repostAutoRenew;
        return "GetUserAutoRepostsEntity(allowAutoRenew=" + num + ", repostAutoRenew=" + num2 + ")";
    }
}
