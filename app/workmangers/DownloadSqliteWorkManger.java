package com.forsale.app.workmangers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.forsale.app.datalayer.database.DBManager;
import com.forsale.app.datalayer.repositories.DownloadFileService;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: DownloadSqliteWorkManger.kt */
/* loaded from: classes3.dex */
public final class DownloadSqliteWorkManger extends CoroutineWorker {

    /* renamed from: h  reason: collision with root package name */
    public static final a f40560h = new a(null);

    /* renamed from: i  reason: collision with root package name */
    public static final int f40561i = 8;

    /* renamed from: d  reason: collision with root package name */
    private final Context f40562d;

    /* renamed from: e  reason: collision with root package name */
    private final DownloadFileService f40563e;

    /* renamed from: f  reason: collision with root package name */
    private final DBManager f40564f;

    /* renamed from: g  reason: collision with root package name */
    private DownloadMasterDataStatus f40565g;

    /* compiled from: DownloadSqliteWorkManger.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadSqliteWorkManger(Context context, WorkerParameters workerParams, DownloadFileService downloadRepo, DBManager dbManger) {
        super(context, workerParams);
        o.i(context, "context");
        o.i(workerParams, "workerParams");
        o.i(downloadRepo, "downloadRepo");
        o.i(dbManger, "dbManger");
        this.f40562d = context;
        this.f40563e = downloadRepo;
        this.f40564f = dbManger;
        this.f40565g = DownloadMasterDataStatus.INIT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.String r9, zz.a<? super java.lang.Boolean> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.forsale.app.workmangers.DownloadSqliteWorkManger$downloadFile$1
            if (r0 == 0) goto L13
            r0 = r10
            com.forsale.app.workmangers.DownloadSqliteWorkManger$downloadFile$1 r0 = (com.forsale.app.workmangers.DownloadSqliteWorkManger$downloadFile$1) r0
            int r1 = r0.f40575e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40575e = r1
            goto L18
        L13:
            com.forsale.app.workmangers.DownloadSqliteWorkManger$downloadFile$1 r0 = new com.forsale.app.workmangers.DownloadSqliteWorkManger$downloadFile$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f40573c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f40575e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r9 = r0.f40572b
            kotlin.jvm.internal.Ref$BooleanRef r9 = (kotlin.jvm.internal.Ref$BooleanRef) r9
            java.lang.Object r0 = r0.f40571a
            kotlin.jvm.internal.Ref$BooleanRef r0 = (kotlin.jvm.internal.Ref$BooleanRef) r0
            kotlin.f.b(r10)
            goto L9e
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            java.lang.Object r9 = r0.f40572b
            kotlin.jvm.internal.Ref$BooleanRef r9 = (kotlin.jvm.internal.Ref$BooleanRef) r9
            java.lang.Object r2 = r0.f40571a
            com.forsale.app.workmangers.DownloadSqliteWorkManger r2 = (com.forsale.app.workmangers.DownloadSqliteWorkManger) r2
            kotlin.f.b(r10)
            goto L63
        L48:
            kotlin.f.b(r10)
            kotlin.jvm.internal.Ref$BooleanRef r10 = new kotlin.jvm.internal.Ref$BooleanRef
            r10.<init>()
            com.forsale.app.datalayer.repositories.DownloadFileService r2 = r8.f40563e
            r0.f40571a = r8
            r0.f40572b = r10
            r0.f40575e = r4
            java.lang.Object r9 = r2.download(r9, r0)
            if (r9 != r1) goto L5f
            return r1
        L5f:
            r2 = r8
            r7 = r10
            r10 = r9
            r9 = r7
        L63:
            retrofit2.w r10 = (retrofit2.w) r10
            java.lang.Object r10 = r10.a()
            okhttp3.ResponseBody r10 = (okhttp3.ResponseBody) r10
            if (r10 == 0) goto La7
            com.forsale.app.workmangers.DownloadMasterDataStatus r4 = com.forsale.app.workmangers.DownloadMasterDataStatus.DOWNLOAD
            r2.f40565g = r4
            okhttp3.MediaType r4 = r10.contentType()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "********************************** file download "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]
            x10.a.b(r4, r5)
            byte[] r10 = r10.bytes()
            r0.f40571a = r9
            r0.f40572b = r9
            r0.f40575e = r3
            java.lang.Object r10 = r2.l(r10, r0)
            if (r10 != r1) goto L9d
            return r1
        L9d:
            r0 = r9
        L9e:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            r9.f61774a = r10
            r9 = r0
        La7:
            boolean r9 = r9.f61774a
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.a.a(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.workmangers.DownloadSqliteWorkManger.k(java.lang.String, zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(byte[] r5, zz.a<? super java.lang.Boolean> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.forsale.app.workmangers.DownloadSqliteWorkManger$saveDBFile$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.workmangers.DownloadSqliteWorkManger$saveDBFile$1 r0 = (com.forsale.app.workmangers.DownloadSqliteWorkManger$saveDBFile$1) r0
            int r1 = r0.f40579d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40579d = r1
            goto L18
        L13:
            com.forsale.app.workmangers.DownloadSqliteWorkManger$saveDBFile$1 r0 = new com.forsale.app.workmangers.DownloadSqliteWorkManger$saveDBFile$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f40577b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f40579d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f40576a
            com.forsale.app.workmangers.DownloadSqliteWorkManger r5 = (com.forsale.app.workmangers.DownloadSqliteWorkManger) r5
            kotlin.f.b(r6)
            goto L46
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.f.b(r6)
            com.forsale.app.datalayer.database.DBManager r6 = r4.f40564f
            r0.f40576a = r4
            r0.f40579d = r3
            java.lang.Object r6 = r6.saveTempFile(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            r5 = r4
        L46:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != r3) goto L51
            com.forsale.app.workmangers.DownloadMasterDataStatus r0 = com.forsale.app.workmangers.DownloadMasterDataStatus.SAVE_DB_FILE
            goto L55
        L51:
            if (r6 != 0) goto L5c
            com.forsale.app.workmangers.DownloadMasterDataStatus r0 = com.forsale.app.workmangers.DownloadMasterDataStatus.FAILED_SAVE_DB_FILE
        L55:
            r5.f40565g = r0
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.a.a(r6)
            return r5
        L5c:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.workmangers.DownloadSqliteWorkManger.l(byte[], zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0098  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(zz.a<? super androidx.work.ListenableWorker.a> r11) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.workmangers.DownloadSqliteWorkManger.a(zz.a):java.lang.Object");
    }
}
