package com.forsale.app.datalayer.network.entities;

import up.c;
/* compiled from: RemoveFavoriteEntity.kt */
/* loaded from: classes2.dex */
public final class RemoveFavoriteEntity {
    public static final int $stable = 0;
    @c("is_removed")
    private final int isRemoved;
    @c("user_adv_id")
    private final int userAdvId;

    public RemoveFavoriteEntity(int i11, int i12) {
        this.userAdvId = i11;
        this.isRemoved = i12;
    }

    public static /* synthetic */ RemoveFavoriteEntity copy$default(RemoveFavoriteEntity removeFavoriteEntity, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = removeFavoriteEntity.userAdvId;
        }
        if ((i13 & 2) != 0) {
            i12 = removeFavoriteEntity.isRemoved;
        }
        return removeFavoriteEntity.copy(i11, i12);
    }

    public final int component1() {
        return this.userAdvId;
    }

    public final int component2() {
        return this.isRemoved;
    }

    public final RemoveFavoriteEntity copy(int i11, int i12) {
        return new RemoveFavoriteEntity(i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemoveFavoriteEntity)) {
            return false;
        }
        RemoveFavoriteEntity removeFavoriteEntity = (RemoveFavoriteEntity) obj;
        if (this.userAdvId == removeFavoriteEntity.userAdvId && this.isRemoved == removeFavoriteEntity.isRemoved) {
            return true;
        }
        return false;
    }

    public final int getUserAdvId() {
        return this.userAdvId;
    }

    public int hashCode() {
        return (Integer.hashCode(this.userAdvId) * 31) + Integer.hashCode(this.isRemoved);
    }

    public final int isRemoved() {
        return this.isRemoved;
    }

    public String toString() {
        int i11 = this.userAdvId;
        int i12 = this.isRemoved;
        return "RemoveFavoriteEntity(userAdvId=" + i11 + ", isRemoved=" + i12 + ")";
    }
}
