package com.forsale.app.datalayer.database.masterdata;
/* compiled from: MasterDataExceptions.kt */
/* loaded from: classes2.dex */
public class MasterDataExceptions extends Exception {
    public static final int $stable = 0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MasterDataExceptions(com.forsale.app.datalayer.database.masterdata.MasterDataStages r4, java.lang.Throwable r5) {
        /*
            r3 = this;
            java.lang.String r0 = "stage"
            kotlin.jvm.internal.o.i(r4, r0)
            java.lang.String r0 = "cause"
            kotlin.jvm.internal.o.i(r5, r0)
            java.lang.String r4 = r4.getStageName()
            java.lang.String r0 = r5.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Error during "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ": "
            r1.append(r4)
            r1.append(r0)
            java.lang.String r4 = r1.toString()
            r3.<init>(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.database.masterdata.MasterDataExceptions.<init>(com.forsale.app.datalayer.database.masterdata.MasterDataStages, java.lang.Throwable):void");
    }
}
