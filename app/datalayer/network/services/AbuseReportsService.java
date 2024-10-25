package com.forsale.app.datalayer.network.services;

import com.forsale.app.datalayer.network.entities.ReportAbuseEntity;
import com.forsale.app.datalayer.network.entities.ReportAbuseUserEntity;
import com.forsale.app.datalayer.network.requestsbodies.ReportAbuseBody;
import com.forsale.app.datalayer.network.requestsbodies.ReportAbuseUserBody;
import i10.a;
import i10.o;
/* compiled from: AbuseReportsService.kt */
/* loaded from: classes2.dex */
public interface AbuseReportsService {
    @o("AbuseReports/Report")
    Object reportAbuse(@a ReportAbuseBody reportAbuseBody, zz.a<? super ReportAbuseEntity> aVar);

    @o("AbuseReports/report_user")
    Object reportUserAbuse(@a ReportAbuseUserBody reportAbuseUserBody, zz.a<? super ReportAbuseUserEntity> aVar);
}
