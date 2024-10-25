package com.forsale.app.datalayer.repositories;

import com.forsale.app.utils.analytics.AWSEventsLogger;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.AmplitudeLogger;
import com.forsale.app.utils.analytics.FacebookEventsLogger;
import com.forsale.app.utils.analytics.FirebaseEventsLogger;
import com.forsale.app.utils.analytics.LeanPlumLogger;
import com.forsale.app.utils.analytics.h;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: AnalyticsRepository.kt */
/* loaded from: classes2.dex */
public final class AnalyticsRepository {
    public static final int $stable = 8;
    private final AmplitudeLogger amplitudeLogger;
    private final AggregatedAllAnalyticsLogger analyticsLogger;
    private final AWSEventsLogger awsEventsLogger;
    private final FacebookEventsLogger facebookEventsLogger;
    private final FirebaseEventsLogger firebaseEventsLogger;
    private final LeanPlumLogger leanPlumLogger;
    private final MasterDataRepository masterDataRepository;
    private final RegionsRepository regionsRepository;

    public AnalyticsRepository(RegionsRepository regionsRepository, MasterDataRepository masterDataRepository, AWSEventsLogger awsEventsLogger, FacebookEventsLogger facebookEventsLogger, FirebaseEventsLogger firebaseEventsLogger, AggregatedAllAnalyticsLogger analyticsLogger, AmplitudeLogger amplitudeLogger, LeanPlumLogger leanPlumLogger) {
        o.i(regionsRepository, "regionsRepository");
        o.i(masterDataRepository, "masterDataRepository");
        o.i(awsEventsLogger, "awsEventsLogger");
        o.i(facebookEventsLogger, "facebookEventsLogger");
        o.i(firebaseEventsLogger, "firebaseEventsLogger");
        o.i(analyticsLogger, "analyticsLogger");
        o.i(amplitudeLogger, "amplitudeLogger");
        o.i(leanPlumLogger, "leanPlumLogger");
        this.regionsRepository = regionsRepository;
        this.masterDataRepository = masterDataRepository;
        this.awsEventsLogger = awsEventsLogger;
        this.facebookEventsLogger = facebookEventsLogger;
        this.firebaseEventsLogger = firebaseEventsLogger;
        this.analyticsLogger = analyticsLogger;
        this.amplitudeLogger = amplitudeLogger;
        this.leanPlumLogger = leanPlumLogger;
    }

    public final Object updateAnalyticsCampaign(h hVar, zz.a<? super p> aVar) {
        Object f11;
        Object emit = this.analyticsLogger.r().emit(hVar, aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (emit == f11) {
            return emit;
        }
        return p.f75480a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateAnalyticsLoggerCountryData(zz.a<? super wz.p> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.forsale.app.datalayer.repositories.AnalyticsRepository$updateAnalyticsLoggerCountryData$1
            if (r0 == 0) goto L13
            r0 = r9
            com.forsale.app.datalayer.repositories.AnalyticsRepository$updateAnalyticsLoggerCountryData$1 r0 = (com.forsale.app.datalayer.repositories.AnalyticsRepository$updateAnalyticsLoggerCountryData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.AnalyticsRepository$updateAnalyticsLoggerCountryData$1 r0 = new com.forsale.app.datalayer.repositories.AnalyticsRepository$updateAnalyticsLoggerCountryData$1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L5f
            if (r2 == r5) goto L53
            if (r2 == r4) goto L42
            if (r2 != r3) goto L3a
            int r1 = r0.I$0
            java.lang.Object r2 = r0.L$1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r0.L$0
            com.forsale.app.datalayer.repositories.AnalyticsRepository r0 = (com.forsale.app.datalayer.repositories.AnalyticsRepository) r0
            kotlin.f.b(r9)
            goto La5
        L3a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L42:
            int r2 = r0.I$0
            java.lang.Object r4 = r0.L$1
            com.forsale.app.datalayer.repositories.AnalyticsRepository r4 = (com.forsale.app.datalayer.repositories.AnalyticsRepository) r4
            java.lang.Object r5 = r0.L$0
            com.forsale.app.datalayer.repositories.AnalyticsRepository r5 = (com.forsale.app.datalayer.repositories.AnalyticsRepository) r5
            kotlin.f.b(r9)
            r7 = r4
            r4 = r2
            r2 = r7
            goto L8d
        L53:
            java.lang.Object r2 = r0.L$1
            com.forsale.app.datalayer.repositories.AnalyticsRepository r2 = (com.forsale.app.datalayer.repositories.AnalyticsRepository) r2
            java.lang.Object r5 = r0.L$0
            com.forsale.app.datalayer.repositories.AnalyticsRepository r5 = (com.forsale.app.datalayer.repositories.AnalyticsRepository) r5
            kotlin.f.b(r9)
            goto L73
        L5f:
            kotlin.f.b(r9)
            com.forsale.app.datalayer.repositories.RegionsRepository r9 = r8.regionsRepository
            r0.L$0 = r8
            r0.L$1 = r8
            r0.label = r5
            java.lang.Object r9 = r9.getCurrentRegionId(r0)
            if (r9 != r1) goto L71
            return r1
        L71:
            r2 = r8
            r5 = r2
        L73:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            com.forsale.app.datalayer.repositories.RegionsRepository r6 = r5.regionsRepository
            r0.L$0 = r5
            r0.L$1 = r2
            r0.I$0 = r9
            r0.label = r4
            java.lang.Object r4 = r6.getCurrentRegionName(r0)
            if (r4 != r1) goto L8a
            return r1
        L8a:
            r7 = r4
            r4 = r9
            r9 = r7
        L8d:
            java.lang.String r9 = (java.lang.String) r9
            com.forsale.app.datalayer.repositories.RegionsRepository r5 = r5.regionsRepository
            r0.L$0 = r2
            r0.L$1 = r9
            r0.I$0 = r4
            r0.label = r3
            java.lang.Object r0 = r5.getCurrentRegionCurrency(r0)
            if (r0 != r1) goto La0
            return r1
        La0:
            r1 = r4
            r7 = r2
            r2 = r9
            r9 = r0
            r0 = r7
        La5:
            java.lang.String r9 = (java.lang.String) r9
            r0.updateAnalyticsLoggerCountryData(r1, r2, r9)
            wz.p r9 = wz.p.f75480a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.AnalyticsRepository.updateAnalyticsLoggerCountryData(zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateAnalyticsLoggerEnableAnalyticsData(zz.a<? super wz.p> r10) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.AnalyticsRepository.updateAnalyticsLoggerEnableAnalyticsData(zz.a):java.lang.Object");
    }

    public final void updateDeviceId() {
        this.amplitudeLogger.m();
        this.leanPlumLogger.m();
    }

    private final void updateAnalyticsLoggerCountryData(int i11, String str, String str2) {
        this.analyticsLogger.X().postValue(Integer.valueOf(i11));
        this.facebookEventsLogger.e().postValue(str);
        this.firebaseEventsLogger.e().postValue(str);
        this.analyticsLogger.Y().postValue(str);
        this.facebookEventsLogger.d().postValue(str2);
        this.firebaseEventsLogger.d().postValue(str2);
    }
}
