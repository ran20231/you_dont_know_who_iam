package com.forsale.app.datalayer.database;

import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: InterstitialCacheEntity.kt */
/* loaded from: classes2.dex */
public final class InterstitialCacheEntity {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final String ID = "cat_id";
    public static final String INTERSTITIAL_TABLE_NAME = "interstitial_table_name";
    private final int catId;

    /* compiled from: InterstitialCacheEntity.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public InterstitialCacheEntity(int i11) {
        this.catId = i11;
    }

    public static /* synthetic */ InterstitialCacheEntity copy$default(InterstitialCacheEntity interstitialCacheEntity, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = interstitialCacheEntity.catId;
        }
        return interstitialCacheEntity.copy(i11);
    }

    public final int component1() {
        return this.catId;
    }

    public final InterstitialCacheEntity copy(int i11) {
        return new InterstitialCacheEntity(i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof InterstitialCacheEntity) && this.catId == ((InterstitialCacheEntity) obj).catId) {
            return true;
        }
        return false;
    }

    public final int getCatId() {
        return this.catId;
    }

    public int hashCode() {
        return Integer.hashCode(this.catId);
    }

    public String toString() {
        int i11 = this.catId;
        return "InterstitialCacheEntity(catId=" + i11 + ")";
    }
}
