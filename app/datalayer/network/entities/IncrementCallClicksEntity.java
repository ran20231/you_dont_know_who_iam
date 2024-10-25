package com.forsale.app.datalayer.network.entities;

import up.c;
/* compiled from: IncrementCallClicksEntity.kt */
/* loaded from: classes2.dex */
public final class IncrementCallClicksEntity {
    public static final int $stable = 0;
    @c("success")
    private final int success;

    public IncrementCallClicksEntity(int i11) {
        this.success = i11;
    }

    public static /* synthetic */ IncrementCallClicksEntity copy$default(IncrementCallClicksEntity incrementCallClicksEntity, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = incrementCallClicksEntity.success;
        }
        return incrementCallClicksEntity.copy(i11);
    }

    public final int component1() {
        return this.success;
    }

    public final IncrementCallClicksEntity copy(int i11) {
        return new IncrementCallClicksEntity(i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof IncrementCallClicksEntity) && this.success == ((IncrementCallClicksEntity) obj).success) {
            return true;
        }
        return false;
    }

    public final int getSuccess() {
        return this.success;
    }

    public int hashCode() {
        return Integer.hashCode(this.success);
    }

    public String toString() {
        int i11 = this.success;
        return "IncrementCallClicksEntity(success=" + i11 + ")";
    }
}
