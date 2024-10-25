package com.forsale.app.datalayer.network.requestsbodies;

import kotlin.jvm.internal.o;
import up.c;
/* compiled from: FollowToggleBody.kt */
/* loaded from: classes2.dex */
public final class FollowToggleBody {
    public static final int $stable = 0;
    @c("phone")
    private final String phone;
    @c("phone_to_follow")
    private final String phoneToFollow;
    @c("type")
    private final int type;

    public FollowToggleBody(String phone, String phoneToFollow, int i11) {
        o.i(phone, "phone");
        o.i(phoneToFollow, "phoneToFollow");
        this.phone = phone;
        this.phoneToFollow = phoneToFollow;
        this.type = i11;
    }

    public static /* synthetic */ FollowToggleBody copy$default(FollowToggleBody followToggleBody, String str, String str2, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = followToggleBody.phone;
        }
        if ((i12 & 2) != 0) {
            str2 = followToggleBody.phoneToFollow;
        }
        if ((i12 & 4) != 0) {
            i11 = followToggleBody.type;
        }
        return followToggleBody.copy(str, str2, i11);
    }

    public final String component1() {
        return this.phone;
    }

    public final String component2() {
        return this.phoneToFollow;
    }

    public final int component3() {
        return this.type;
    }

    public final FollowToggleBody copy(String phone, String phoneToFollow, int i11) {
        o.i(phone, "phone");
        o.i(phoneToFollow, "phoneToFollow");
        return new FollowToggleBody(phone, phoneToFollow, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FollowToggleBody)) {
            return false;
        }
        FollowToggleBody followToggleBody = (FollowToggleBody) obj;
        if (o.d(this.phone, followToggleBody.phone) && o.d(this.phoneToFollow, followToggleBody.phoneToFollow) && this.type == followToggleBody.type) {
            return true;
        }
        return false;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getPhoneToFollow() {
        return this.phoneToFollow;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.phone.hashCode() * 31) + this.phoneToFollow.hashCode()) * 31) + Integer.hashCode(this.type);
    }

    public String toString() {
        String str = this.phone;
        String str2 = this.phoneToFollow;
        int i11 = this.type;
        return "FollowToggleBody(phone=" + str + ", phoneToFollow=" + str2 + ", type=" + i11 + ")";
    }
}
