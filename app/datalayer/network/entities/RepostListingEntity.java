package com.forsale.app.datalayer.network.entities;

import up.c;
/* compiled from: RepostListingEntity.kt */
/* loaded from: classes2.dex */
public final class RepostListingEntity {
    public static final int $stable = 0;
    @c("is_repost")
    private final int isRepost;
    @c("new_user_adv_id")
    private final int newUserAdvId;
    @c("old_user_adv_id")
    private final int oldUserAdvId;

    public RepostListingEntity(int i11, int i12, int i13) {
        this.oldUserAdvId = i11;
        this.newUserAdvId = i12;
        this.isRepost = i13;
    }

    public static /* synthetic */ RepostListingEntity copy$default(RepostListingEntity repostListingEntity, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = repostListingEntity.oldUserAdvId;
        }
        if ((i14 & 2) != 0) {
            i12 = repostListingEntity.newUserAdvId;
        }
        if ((i14 & 4) != 0) {
            i13 = repostListingEntity.isRepost;
        }
        return repostListingEntity.copy(i11, i12, i13);
    }

    public final int component1() {
        return this.oldUserAdvId;
    }

    public final int component2() {
        return this.newUserAdvId;
    }

    public final int component3() {
        return this.isRepost;
    }

    public final RepostListingEntity copy(int i11, int i12, int i13) {
        return new RepostListingEntity(i11, i12, i13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RepostListingEntity)) {
            return false;
        }
        RepostListingEntity repostListingEntity = (RepostListingEntity) obj;
        if (this.oldUserAdvId == repostListingEntity.oldUserAdvId && this.newUserAdvId == repostListingEntity.newUserAdvId && this.isRepost == repostListingEntity.isRepost) {
            return true;
        }
        return false;
    }

    public final int getNewUserAdvId() {
        return this.newUserAdvId;
    }

    public final int getOldUserAdvId() {
        return this.oldUserAdvId;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.oldUserAdvId) * 31) + Integer.hashCode(this.newUserAdvId)) * 31) + Integer.hashCode(this.isRepost);
    }

    public final int isRepost() {
        return this.isRepost;
    }

    public String toString() {
        int i11 = this.oldUserAdvId;
        int i12 = this.newUserAdvId;
        int i13 = this.isRepost;
        return "RepostListingEntity(oldUserAdvId=" + i11 + ", newUserAdvId=" + i12 + ", isRepost=" + i13 + ")";
    }
}
