package com.forsale.app.datalayer.network.entities;

import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import up.c;
/* compiled from: AddFavoriteEntity.kt */
/* loaded from: classes2.dex */
public final class AddFavoriteEntity {
    public static final int $stable = 0;
    @c(ListingItemDetails.IS_FAVORITE)
    private final int isFavorite;
    @c("user_adv_id")
    private final int userAdvId;

    public AddFavoriteEntity(int i11, int i12) {
        this.userAdvId = i11;
        this.isFavorite = i12;
    }

    public static /* synthetic */ AddFavoriteEntity copy$default(AddFavoriteEntity addFavoriteEntity, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = addFavoriteEntity.userAdvId;
        }
        if ((i13 & 2) != 0) {
            i12 = addFavoriteEntity.isFavorite;
        }
        return addFavoriteEntity.copy(i11, i12);
    }

    public final int component1() {
        return this.userAdvId;
    }

    public final int component2() {
        return this.isFavorite;
    }

    public final AddFavoriteEntity copy(int i11, int i12) {
        return new AddFavoriteEntity(i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddFavoriteEntity)) {
            return false;
        }
        AddFavoriteEntity addFavoriteEntity = (AddFavoriteEntity) obj;
        if (this.userAdvId == addFavoriteEntity.userAdvId && this.isFavorite == addFavoriteEntity.isFavorite) {
            return true;
        }
        return false;
    }

    public final int getUserAdvId() {
        return this.userAdvId;
    }

    public int hashCode() {
        return (Integer.hashCode(this.userAdvId) * 31) + Integer.hashCode(this.isFavorite);
    }

    public final int isFavorite() {
        return this.isFavorite;
    }

    public String toString() {
        int i11 = this.userAdvId;
        int i12 = this.isFavorite;
        return "AddFavoriteEntity(userAdvId=" + i11 + ", isFavorite=" + i12 + ")";
    }
}
