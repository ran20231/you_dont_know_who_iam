package com.forsale.app.datalayer.network.requestsbodies;

import com.forsale.app.datalayer.database.MasterDataModel;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: MasterDataBody.kt */
/* loaded from: classes2.dex */
public final class MasterDataBody {
    public static final int $stable = 0;
    @c(MasterDataModel.LAST_UPDATE_DATETIME)
    private final String lastUpdateDatetime;

    public MasterDataBody(String lastUpdateDatetime) {
        o.i(lastUpdateDatetime, "lastUpdateDatetime");
        this.lastUpdateDatetime = lastUpdateDatetime;
    }

    public static /* synthetic */ MasterDataBody copy$default(MasterDataBody masterDataBody, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = masterDataBody.lastUpdateDatetime;
        }
        return masterDataBody.copy(str);
    }

    public final String component1() {
        return this.lastUpdateDatetime;
    }

    public final MasterDataBody copy(String lastUpdateDatetime) {
        o.i(lastUpdateDatetime, "lastUpdateDatetime");
        return new MasterDataBody(lastUpdateDatetime);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof MasterDataBody) && o.d(this.lastUpdateDatetime, ((MasterDataBody) obj).lastUpdateDatetime)) {
            return true;
        }
        return false;
    }

    public final String getLastUpdateDatetime() {
        return this.lastUpdateDatetime;
    }

    public int hashCode() {
        return this.lastUpdateDatetime.hashCode();
    }

    public String toString() {
        String str = this.lastUpdateDatetime;
        return "MasterDataBody(lastUpdateDatetime=" + str + ")";
    }
}
