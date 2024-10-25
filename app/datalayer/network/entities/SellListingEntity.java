package com.forsale.app.datalayer.network.entities;

import up.c;
/* compiled from: SellListingEntity.kt */
/* loaded from: classes2.dex */
public final class SellListingEntity {
    public static final int $stable = 0;
    @c("is_sold")
    private final int isSold;
    @c("user_adv_id")
    private final int userAdvId;

    public SellListingEntity(int i11, int i12) {
        this.userAdvId = i11;
        this.isSold = i12;
    }

    public static /* synthetic */ SellListingEntity copy$default(SellListingEntity sellListingEntity, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = sellListingEntity.userAdvId;
        }
        if ((i13 & 2) != 0) {
            i12 = sellListingEntity.isSold;
        }
        return sellListingEntity.copy(i11, i12);
    }

    public final int component1() {
        return this.userAdvId;
    }

    public final int component2() {
        return this.isSold;
    }

    public final SellListingEntity copy(int i11, int i12) {
        return new SellListingEntity(i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SellListingEntity)) {
            return false;
        }
        SellListingEntity sellListingEntity = (SellListingEntity) obj;
        if (this.userAdvId == sellListingEntity.userAdvId && this.isSold == sellListingEntity.isSold) {
            return true;
        }
        return false;
    }

    public final int getUserAdvId() {
        return this.userAdvId;
    }

    public int hashCode() {
        return (Integer.hashCode(this.userAdvId) * 31) + Integer.hashCode(this.isSold);
    }

    public final int isSold() {
        return this.isSold;
    }

    public String toString() {
        int i11 = this.userAdvId;
        int i12 = this.isSold;
        return "SellListingEntity(userAdvId=" + i11 + ", isSold=" + i12 + ")";
    }
}
