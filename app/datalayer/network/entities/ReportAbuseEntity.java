package com.forsale.app.datalayer.network.entities;

import com.forsale.app.datalayer.network.requestsbodies.GetListingsBaseBody;
import up.c;
/* compiled from: ReportAbuseEntity.kt */
/* loaded from: classes2.dex */
public final class ReportAbuseEntity {
    public static final int $stable = 0;
    @c(GetListingsBaseBody.ADV_ID)
    private final int advId;
    @c("reported")
    private final int reported;

    public ReportAbuseEntity(int i11, int i12) {
        this.advId = i11;
        this.reported = i12;
    }

    public static /* synthetic */ ReportAbuseEntity copy$default(ReportAbuseEntity reportAbuseEntity, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = reportAbuseEntity.advId;
        }
        if ((i13 & 2) != 0) {
            i12 = reportAbuseEntity.reported;
        }
        return reportAbuseEntity.copy(i11, i12);
    }

    public final int component1() {
        return this.advId;
    }

    public final int component2() {
        return this.reported;
    }

    public final ReportAbuseEntity copy(int i11, int i12) {
        return new ReportAbuseEntity(i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportAbuseEntity)) {
            return false;
        }
        ReportAbuseEntity reportAbuseEntity = (ReportAbuseEntity) obj;
        if (this.advId == reportAbuseEntity.advId && this.reported == reportAbuseEntity.reported) {
            return true;
        }
        return false;
    }

    public final int getAdvId() {
        return this.advId;
    }

    public final int getReported() {
        return this.reported;
    }

    public int hashCode() {
        return (Integer.hashCode(this.advId) * 31) + Integer.hashCode(this.reported);
    }

    public String toString() {
        int i11 = this.advId;
        int i12 = this.reported;
        return "ReportAbuseEntity(advId=" + i11 + ", reported=" + i12 + ")";
    }
}
