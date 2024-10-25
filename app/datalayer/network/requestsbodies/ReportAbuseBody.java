package com.forsale.app.datalayer.network.requestsbodies;

import kotlin.jvm.internal.o;
import up.c;
/* compiled from: ReportAbuseBody.kt */
/* loaded from: classes2.dex */
public final class ReportAbuseBody {
    public static final int $stable = 0;
    @c(GetListingsBaseBody.ADV_ID)
    private final int advId;
    @c("comment")
    private final String comment;
    @c("reporter_udid")
    private final String reporterUdId;

    public ReportAbuseBody(String reporterUdId, int i11, String comment) {
        o.i(reporterUdId, "reporterUdId");
        o.i(comment, "comment");
        this.reporterUdId = reporterUdId;
        this.advId = i11;
        this.comment = comment;
    }

    public static /* synthetic */ ReportAbuseBody copy$default(ReportAbuseBody reportAbuseBody, String str, int i11, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = reportAbuseBody.reporterUdId;
        }
        if ((i12 & 2) != 0) {
            i11 = reportAbuseBody.advId;
        }
        if ((i12 & 4) != 0) {
            str2 = reportAbuseBody.comment;
        }
        return reportAbuseBody.copy(str, i11, str2);
    }

    public final String component1() {
        return this.reporterUdId;
    }

    public final int component2() {
        return this.advId;
    }

    public final String component3() {
        return this.comment;
    }

    public final ReportAbuseBody copy(String reporterUdId, int i11, String comment) {
        o.i(reporterUdId, "reporterUdId");
        o.i(comment, "comment");
        return new ReportAbuseBody(reporterUdId, i11, comment);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportAbuseBody)) {
            return false;
        }
        ReportAbuseBody reportAbuseBody = (ReportAbuseBody) obj;
        if (o.d(this.reporterUdId, reportAbuseBody.reporterUdId) && this.advId == reportAbuseBody.advId && o.d(this.comment, reportAbuseBody.comment)) {
            return true;
        }
        return false;
    }

    public final int getAdvId() {
        return this.advId;
    }

    public final String getComment() {
        return this.comment;
    }

    public final String getReporterUdId() {
        return this.reporterUdId;
    }

    public int hashCode() {
        return (((this.reporterUdId.hashCode() * 31) + Integer.hashCode(this.advId)) * 31) + this.comment.hashCode();
    }

    public String toString() {
        String str = this.reporterUdId;
        int i11 = this.advId;
        String str2 = this.comment;
        return "ReportAbuseBody(reporterUdId=" + str + ", advId=" + i11 + ", comment=" + str2 + ")";
    }
}
