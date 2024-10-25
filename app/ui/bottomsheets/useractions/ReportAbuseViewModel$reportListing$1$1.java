package com.forsale.app.ui.bottomsheets.useractions;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ReportAbuseViewModel.kt */
@d(c = "com.forsale.app.ui.bottomsheets.useractions.ReportAbuseViewModel$reportListing$1$1", f = "ReportAbuseViewModel.kt", l = {92, l8.a.f62268e}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ReportAbuseViewModel$reportListing$1$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f39197a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ReportAbuseViewModel f39198b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f39199c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportAbuseViewModel$reportListing$1$1(ReportAbuseViewModel reportAbuseViewModel, String str, zz.a<? super ReportAbuseViewModel$reportListing$1$1> aVar) {
        super(2, aVar);
        this.f39198b = reportAbuseViewModel;
        this.f39199c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ReportAbuseViewModel$reportListing$1$1(this.f39198b, this.f39199c, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r6.f39197a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.f.b(r7)
            goto L4e
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            kotlin.f.b(r7)
            goto L2c
        L1e:
            kotlin.f.b(r7)
            com.forsale.app.ui.bottomsheets.useractions.ReportAbuseViewModel r7 = r6.f39198b
            r6.f39197a = r3
            java.lang.Object r7 = r7.y0(r6)
            if (r7 != r0) goto L2c
            return r0
        L2c:
            java.lang.String r7 = (java.lang.String) r7
            com.forsale.app.ui.bottomsheets.useractions.ReportAbuseViewModel r1 = r6.f39198b
            java.lang.Integer r1 = r1.C0()
            int r1 = r1.intValue()
            java.lang.String r4 = r6.f39199c
            com.forsale.app.datalayer.network.requestsbodies.ReportAbuseBody r5 = new com.forsale.app.datalayer.network.requestsbodies.ReportAbuseBody
            r5.<init>(r7, r1, r4)
            com.forsale.app.ui.bottomsheets.useractions.ReportAbuseViewModel r7 = r6.f39198b
            com.forsale.app.datalayer.network.services.AbuseReportsService r7 = com.forsale.app.ui.bottomsheets.useractions.ReportAbuseViewModel.v0(r7)
            r6.f39197a = r2
            java.lang.Object r7 = r7.reportAbuse(r5, r6)
            if (r7 != r0) goto L4e
            return r0
        L4e:
            com.forsale.app.datalayer.network.entities.ReportAbuseEntity r7 = (com.forsale.app.datalayer.network.entities.ReportAbuseEntity) r7
            com.forsale.app.ui.bottomsheets.useractions.ReportAbuseViewModel r0 = r6.f39198b
            int r7 = r7.getReported()
            boolean r7 = com.forsale.app.utils.TypeExtensionsKt.h0(r7)
            r1 = 0
            if (r7 != r3) goto L71
            com.forsale.app.utils.OneShotEventHandler r7 = r0.E0()
            com.forsale.app.datalayer.repositories.ApplicationResourcesRepository r0 = com.forsale.app.ui.bottomsheets.useractions.ReportAbuseViewModel.w0(r0)
            int r2 = t9.y0.W8
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = r0.getString(r2, r1)
            r7.i(r0)
            goto L86
        L71:
            if (r7 != 0) goto L86
            com.forsale.app.utils.OneShotEventHandler r7 = r0.E0()
            com.forsale.app.datalayer.repositories.ApplicationResourcesRepository r0 = com.forsale.app.ui.bottomsheets.useractions.ReportAbuseViewModel.w0(r0)
            int r2 = t9.y0.O4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = r0.getString(r2, r1)
            r7.i(r0)
        L86:
            wz.p r7 = wz.p.f75480a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.ui.bottomsheets.useractions.ReportAbuseViewModel$reportListing$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((ReportAbuseViewModel$reportListing$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
