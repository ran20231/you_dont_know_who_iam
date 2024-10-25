package com.forsale.app.datalayer.network.requestsbodies;

import kotlin.jvm.internal.o;
import up.c;
/* compiled from: ReportAbuseUserBody.kt */
/* loaded from: classes2.dex */
public final class ReportAbuseUserBody {
    public static final int $stable = 0;
    @c("comment")
    private final String comment;
    @c("phone")
    private final String phone;
    @c("reporter_udid")
    private final String reporterUdId;

    public ReportAbuseUserBody(String reporterUdId, String phone, String comment) {
        o.i(reporterUdId, "reporterUdId");
        o.i(phone, "phone");
        o.i(comment, "comment");
        this.reporterUdId = reporterUdId;
        this.phone = phone;
        this.comment = comment;
    }

    public static /* synthetic */ ReportAbuseUserBody copy$default(ReportAbuseUserBody reportAbuseUserBody, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = reportAbuseUserBody.reporterUdId;
        }
        if ((i11 & 2) != 0) {
            str2 = reportAbuseUserBody.phone;
        }
        if ((i11 & 4) != 0) {
            str3 = reportAbuseUserBody.comment;
        }
        return reportAbuseUserBody.copy(str, str2, str3);
    }

    public final String component1() {
        return this.reporterUdId;
    }

    public final String component2() {
        return this.phone;
    }

    public final String component3() {
        return this.comment;
    }

    public final ReportAbuseUserBody copy(String reporterUdId, String phone, String comment) {
        o.i(reporterUdId, "reporterUdId");
        o.i(phone, "phone");
        o.i(comment, "comment");
        return new ReportAbuseUserBody(reporterUdId, phone, comment);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportAbuseUserBody)) {
            return false;
        }
        ReportAbuseUserBody reportAbuseUserBody = (ReportAbuseUserBody) obj;
        if (o.d(this.reporterUdId, reportAbuseUserBody.reporterUdId) && o.d(this.phone, reportAbuseUserBody.phone) && o.d(this.comment, reportAbuseUserBody.comment)) {
            return true;
        }
        return false;
    }

    public final String getComment() {
        return this.comment;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getReporterUdId() {
        return this.reporterUdId;
    }

    public int hashCode() {
        return (((this.reporterUdId.hashCode() * 31) + this.phone.hashCode()) * 31) + this.comment.hashCode();
    }

    public String toString() {
        String str = this.reporterUdId;
        String str2 = this.phone;
        String str3 = this.comment;
        return "ReportAbuseUserBody(reporterUdId=" + str + ", phone=" + str2 + ", comment=" + str3 + ")";
    }
}
