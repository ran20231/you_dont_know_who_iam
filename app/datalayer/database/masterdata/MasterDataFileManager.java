package com.forsale.app.datalayer.database.masterdata;

import android.content.Context;
import com.forsale.app.datalayer.database.MasterDataDatabase;
import com.forsale.app.datalayer.repositories.DownloadFileService;
import g00.a;
import kotlin.coroutines.intrinsics.b;
import kotlin.d;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import wz.h;
import wz.p;
/* compiled from: MasterDataFileManager.kt */
/* loaded from: classes2.dex */
public final class MasterDataFileManager {
    public static final int $stable = 8;
    private final Context appContext;
    private final DownloadFileService downloadFileService;
    private final CoroutineDispatcher ioDispatcher;
    private final MasterDataDatabase masterDataDB;
    private final h masterDataFilePath$delegate;

    public MasterDataFileManager(DownloadFileService downloadFileService, CoroutineDispatcher ioDispatcher, Context appContext, MasterDataDatabase masterDataDB) {
        h a11;
        o.i(downloadFileService, "downloadFileService");
        o.i(ioDispatcher, "ioDispatcher");
        o.i(appContext, "appContext");
        o.i(masterDataDB, "masterDataDB");
        this.downloadFileService = downloadFileService;
        this.ioDispatcher = ioDispatcher;
        this.appContext = appContext;
        this.masterDataDB = masterDataDB;
        a11 = d.a(new a<String>() { // from class: com.forsale.app.datalayer.database.masterdata.MasterDataFileManager$masterDataFilePath$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            public final String invoke() {
                Context context;
                context = MasterDataFileManager.this.appContext;
                return context.getDatabasePath("4sale_new_release_14_x_x.sqlite").getAbsolutePath();
            }
        });
        this.masterDataFilePath$delegate = a11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getMasterDataFilePath() {
        return (String) this.masterDataFilePath$delegate.getValue();
    }

    public final Object cleanUpDownloadedFile(zz.a<? super p> aVar) {
        Object f11;
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new MasterDataFileManager$cleanUpDownloadedFile$2(this, null), aVar);
        f11 = b.f();
        if (withContext == f11) {
            return withContext;
        }
        return p.f75480a;
    }

    public final Object cleanUpRoomDB(zz.a<? super p> aVar) {
        Object f11;
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new MasterDataFileManager$cleanUpRoomDB$2(this, null), aVar);
        f11 = b.f();
        if (withContext == f11) {
            return withContext;
        }
        return p.f75480a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object downloadDatabaseFile(java.lang.String r5, zz.a<? super byte[]> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.forsale.app.datalayer.database.masterdata.MasterDataFileManager$downloadDatabaseFile$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.datalayer.database.masterdata.MasterDataFileManager$downloadDatabaseFile$1 r0 = (com.forsale.app.datalayer.database.masterdata.MasterDataFileManager$downloadDatabaseFile$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.database.masterdata.MasterDataFileManager$downloadDatabaseFile$1 r0 = new com.forsale.app.datalayer.database.masterdata.MasterDataFileManager$downloadDatabaseFile$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            java.lang.String r5 = (java.lang.String) r5
            kotlin.f.b(r6)     // Catch: java.lang.Exception -> L84
            goto L45
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.f.b(r6)
            com.forsale.app.datalayer.repositories.DownloadFileService r6 = r4.downloadFileService     // Catch: java.lang.Exception -> L84
            r0.L$0 = r5     // Catch: java.lang.Exception -> L84
            r0.label = r3     // Catch: java.lang.Exception -> L84
            java.lang.Object r6 = r6.download(r5, r0)     // Catch: java.lang.Exception -> L84
            if (r6 != r1) goto L45
            return r1
        L45:
            retrofit2.w r6 = (retrofit2.w) r6     // Catch: java.lang.Exception -> L84
            boolean r0 = r6.e()     // Catch: java.lang.Exception -> L84
            if (r0 == 0) goto L4f
            r0 = r6
            goto L50
        L4f:
            r0 = 0
        L50:
            if (r0 == 0) goto L61
            java.lang.Object r0 = r0.a()     // Catch: java.lang.Exception -> L84
            okhttp3.ResponseBody r0 = (okhttp3.ResponseBody) r0     // Catch: java.lang.Exception -> L84
            if (r0 == 0) goto L61
            byte[] r0 = r0.bytes()     // Catch: java.lang.Exception -> L84
            if (r0 == 0) goto L61
            return r0
        L61:
            com.forsale.app.datalayer.database.masterdata.DownloadException r0 = new com.forsale.app.datalayer.database.masterdata.DownloadException     // Catch: java.lang.Exception -> L84
            int r6 = r6.b()     // Catch: java.lang.Exception -> L84
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L84
            r1.<init>()     // Catch: java.lang.Exception -> L84
            java.lang.String r2 = "Failed to download database from "
            r1.append(r2)     // Catch: java.lang.Exception -> L84
            r1.append(r5)     // Catch: java.lang.Exception -> L84
            java.lang.String r5 = ". Response code: "
            r1.append(r5)     // Catch: java.lang.Exception -> L84
            r1.append(r6)     // Catch: java.lang.Exception -> L84
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Exception -> L84
            r0.<init>(r5)     // Catch: java.lang.Exception -> L84
            throw r0     // Catch: java.lang.Exception -> L84
        L84:
            r5 = move-exception
            dj.i$a r6 = dj.i.f54287a
            dj.i r6 = r6.invoke()
            com.forsale.app.datalayer.database.masterdata.MasterDataStages r0 = com.forsale.app.datalayer.database.masterdata.MasterDataStages.DOWNLOADING
            java.lang.String r0 = r0.getStageName()
            r6.c(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.database.masterdata.MasterDataFileManager.downloadDatabaseFile(java.lang.String, zz.a):java.lang.Object");
    }

    public final Object saveDatabaseFile(byte[] bArr, zz.a<? super p> aVar) {
        Object f11;
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new MasterDataFileManager$saveDatabaseFile$2(this, bArr, null), aVar);
        f11 = b.f();
        if (withContext == f11) {
            return withContext;
        }
        return p.f75480a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0050 A[Catch: Exception -> 0x0029, TRY_ENTER, TryCatch #0 {Exception -> 0x0029, blocks: (B:11:0x0025, B:21:0x0045, B:25:0x0050, B:26:0x0057, B:18:0x0036), top: B:29:0x0021 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object verifyDatabaseIntegrity(zz.a<? super wz.p> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.forsale.app.datalayer.database.masterdata.MasterDataFileManager$verifyDatabaseIntegrity$1
            if (r0 == 0) goto L13
            r0 = r5
            com.forsale.app.datalayer.database.masterdata.MasterDataFileManager$verifyDatabaseIntegrity$1 r0 = (com.forsale.app.datalayer.database.masterdata.MasterDataFileManager$verifyDatabaseIntegrity$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.database.masterdata.MasterDataFileManager$verifyDatabaseIntegrity$1 r0 = new com.forsale.app.datalayer.database.masterdata.MasterDataFileManager$verifyDatabaseIntegrity$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.f.b(r5)     // Catch: java.lang.Exception -> L29
            goto L45
        L29:
            r5 = move-exception
            goto L58
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.f.b(r5)
            com.forsale.app.datalayer.database.MasterDataDatabase r5 = r4.masterDataDB     // Catch: java.lang.Exception -> L29
            com.forsale.app.datalayer.repositories.RegionDao r5 = r5.regionDao()     // Catch: java.lang.Exception -> L29
            r0.label = r3     // Catch: java.lang.Exception -> L29
            java.lang.Object r5 = r5.getAllRegionsSuspend(r0)     // Catch: java.lang.Exception -> L29
            if (r5 != r1) goto L45
            return r1
        L45:
            java.util.List r5 = (java.util.List) r5     // Catch: java.lang.Exception -> L29
            boolean r5 = r5.isEmpty()     // Catch: java.lang.Exception -> L29
            if (r5 != 0) goto L50
            wz.p r5 = wz.p.f75480a
            return r5
        L50:
            com.forsale.app.datalayer.database.masterdata.DatabaseIntegrityException r5 = new com.forsale.app.datalayer.database.masterdata.DatabaseIntegrityException     // Catch: java.lang.Exception -> L29
            java.lang.String r0 = "Database verification failed, no regions found."
            r5.<init>(r0)     // Catch: java.lang.Exception -> L29
            throw r5     // Catch: java.lang.Exception -> L29
        L58:
            dj.i$a r0 = dj.i.f54287a
            dj.i r0 = r0.invoke()
            com.forsale.app.datalayer.database.masterdata.MasterDataStages r1 = com.forsale.app.datalayer.database.masterdata.MasterDataStages.VERIFYING
            java.lang.String r1 = r1.getStageName()
            r0.c(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.database.masterdata.MasterDataFileManager.verifyDatabaseIntegrity(zz.a):java.lang.Object");
    }
}
