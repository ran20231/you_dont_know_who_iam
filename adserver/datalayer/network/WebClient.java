package com.forsale.adserver.datalayer.network;

import android.content.Context;
import android.content.SharedPreferences;
import b9.c;
import b9.g;
import b9.h;
import b9.j;
import b9.k;
import g00.l;
import java.io.File;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import wz.p;
import x8.e;
import x8.i;
/* compiled from: WebClient.kt */
/* loaded from: classes2.dex */
public final class WebClient implements CoroutineScope {

    /* renamed from: j  reason: collision with root package name */
    public static final a f20700j = new a(null);

    /* renamed from: x  reason: collision with root package name */
    public static final int f20701x = 8;

    /* renamed from: a  reason: collision with root package name */
    private final i f20702a;

    /* renamed from: b  reason: collision with root package name */
    private final e f20703b;

    /* renamed from: c  reason: collision with root package name */
    private final g f20704c;

    /* renamed from: d  reason: collision with root package name */
    private final b9.e f20705d;

    /* renamed from: e  reason: collision with root package name */
    private final SharedPreferences f20706e;

    /* renamed from: f  reason: collision with root package name */
    private final Context f20707f;

    /* renamed from: g  reason: collision with root package name */
    private final CoroutineExceptionHandler f20708g;

    /* renamed from: h  reason: collision with root package name */
    private final CoroutineContext f20709h;

    /* renamed from: i  reason: collision with root package name */
    private final String f20710i;

    /* compiled from: WebClient.kt */
    /* loaded from: classes2.dex */
    public static final class AdServerDBException extends Exception {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AdServerDBException(String message, Exception exception) {
            super(message, exception);
            o.i(message, "message");
            o.i(exception, "exception");
        }
    }

    /* compiled from: WebClient.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.coroutines.a implements CoroutineExceptionHandler {
        public b(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            String message = th2.getMessage();
            x10.a.b("AdServer: Handler:" + message, new Object[0]);
        }
    }

    public WebClient(i offersDao, e categoriesDao, g endPoint, b9.e downloadRepository, SharedPreferences sharedPreference, Context context) {
        o.i(offersDao, "offersDao");
        o.i(categoriesDao, "categoriesDao");
        o.i(endPoint, "endPoint");
        o.i(downloadRepository, "downloadRepository");
        o.i(sharedPreference, "sharedPreference");
        o.i(context, "context");
        this.f20702a = offersDao;
        this.f20703b = categoriesDao;
        this.f20704c = endPoint;
        this.f20705d = downloadRepository;
        this.f20706e = sharedPreference;
        this.f20707f = context;
        b bVar = new b(CoroutineExceptionHandler.Key);
        this.f20708g = bVar;
        this.f20709h = Dispatchers.getIO().plus(bVar);
        this.f20710i = "adserver_sqlite_url";
    }

    private final Object A(zz.a<? super p> aVar) {
        Object v11 = v(aVar);
        if (v11 == kotlin.coroutines.intrinsics.a.f()) {
            return v11;
        }
        return p.f75480a;
    }

    private final void f() {
        this.f20707f.deleteDatabase("4SALE_db");
    }

    private final void g() {
        File file = new File(this.f20707f.getDatabasePath("adserver_file.sqlite").getAbsolutePath());
        if (file.exists()) {
            try {
                file.delete();
            } catch (Exception e11) {
                x10.a.c(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.String r5, zz.a<? super byte[]> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.forsale.adserver.datalayer.network.WebClient$downloadDB$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.adserver.datalayer.network.WebClient$downloadDB$1 r0 = (com.forsale.adserver.datalayer.network.WebClient$downloadDB$1) r0
            int r1 = r0.f20719d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20719d = r1
            goto L18
        L13:
            com.forsale.adserver.datalayer.network.WebClient$downloadDB$1 r0 = new com.forsale.adserver.datalayer.network.WebClient$downloadDB$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f20717b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f20719d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f20716a
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
            b9.e r6 = r4.f20705d     // Catch: java.lang.Exception -> L84
            r0.f20716a = r5     // Catch: java.lang.Exception -> L84
            r0.f20719d = r3     // Catch: java.lang.Exception -> L84
            java.lang.Object r6 = r6.a(r5, r0)     // Catch: java.lang.Exception -> L84
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
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Exception -> L84
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
            com.forsale.adserver.datalayer.network.WebClient$AdServerDBException r6 = new com.forsale.adserver.datalayer.network.WebClient$AdServerDBException
            java.lang.String r0 = "Error downloading AdServer"
            r6.<init>(r0, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.adserver.datalayer.network.WebClient.j(java.lang.String, zz.a):java.lang.Object");
    }

    private final boolean p(String str) {
        return !o.d(str, this.f20706e.getString(this.f20710i, ""));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(zz.a<? super f9.b> r20) {
        /*
            Method dump skipped, instructions count: 187
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.adserver.datalayer.network.WebClient.r(zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(zz.a<? super wz.p> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.forsale.adserver.datalayer.network.WebClient$queryRealDatabase$1
            if (r0 == 0) goto L13
            r0 = r5
            com.forsale.adserver.datalayer.network.WebClient$queryRealDatabase$1 r0 = (com.forsale.adserver.datalayer.network.WebClient$queryRealDatabase$1) r0
            int r1 = r0.f20729d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20729d = r1
            goto L18
        L13:
            com.forsale.adserver.datalayer.network.WebClient$queryRealDatabase$1 r0 = new com.forsale.adserver.datalayer.network.WebClient$queryRealDatabase$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f20727b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f20729d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f20726a
            com.forsale.adserver.datalayer.network.WebClient r0 = (com.forsale.adserver.datalayer.network.WebClient) r0
            kotlin.f.b(r5)
            goto L46
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.f.b(r5)
            x8.e r5 = r4.f20703b
            r0.f20726a = r4
            r0.f20729d = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            r0 = r4
        L46:
            java.util.List r5 = (java.util.List) r5
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            r5 = r5 ^ r3
            if (r5 == 0) goto L57
            r0.g()
            wz.p r5 = wz.p.f75480a
            return r5
        L57:
            com.forsale.adserver.datalayer.network.WebClient$AdServerDBException r5 = new com.forsale.adserver.datalayer.network.WebClient$AdServerDBException
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            java.lang.String r1 = "AD serverd not verified"
            r5.<init>(r1, r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.adserver.datalayer.network.WebClient.v(zz.a):java.lang.Object");
    }

    public static /* synthetic */ Object x(WebClient webClient, int i11, long j11, long j12, double d11, l lVar, zz.a aVar, int i12, Object obj) {
        int i13;
        long j13;
        long j14;
        double d12;
        if ((i12 & 1) != 0) {
            i13 = 3;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            j13 = 100;
        } else {
            j13 = j11;
        }
        if ((i12 & 4) != 0) {
            j14 = 1000;
        } else {
            j14 = j12;
        }
        if ((i12 & 8) != 0) {
            d12 = 2.0d;
        } else {
            d12 = d11;
        }
        return webClient.w(i13, j13, j14, d12, lVar, aVar);
    }

    private final void y(String str) {
        SharedPreferences.Editor edit = this.f20706e.edit();
        edit.putString(this.f20710i, str);
        edit.apply();
    }

    private final Object z(byte[] bArr, zz.a<? super p> aVar) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new WebClient$saveDatabaseFile$2(this, bArr, null), aVar);
        if (withContext == kotlin.coroutines.intrinsics.a.f()) {
            return withContext;
        }
        return p.f75480a;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f20709h;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(zz.a<? super wz.p> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.forsale.adserver.datalayer.network.WebClient$downloadAndSaveDB$1
            if (r0 == 0) goto L13
            r0 = r10
            com.forsale.adserver.datalayer.network.WebClient$downloadAndSaveDB$1 r0 = (com.forsale.adserver.datalayer.network.WebClient$downloadAndSaveDB$1) r0
            int r1 = r0.f20715e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20715e = r1
            goto L18
        L13:
            com.forsale.adserver.datalayer.network.WebClient$downloadAndSaveDB$1 r0 = new com.forsale.adserver.datalayer.network.WebClient$downloadAndSaveDB$1
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.f20713c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f20715e
            r3 = 4
            r4 = 2
            r5 = 3
            r6 = 1
            if (r2 == 0) goto L63
            if (r2 == r6) goto L5b
            if (r2 == r4) goto L4f
            if (r2 == r5) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r1 = r0.f20712b
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f20711a
            com.forsale.adserver.datalayer.network.WebClient r0 = (com.forsale.adserver.datalayer.network.WebClient) r0
            kotlin.f.b(r10)
            goto Lb2
        L3b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L43:
            java.lang.Object r2 = r0.f20712b
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r0.f20711a
            com.forsale.adserver.datalayer.network.WebClient r4 = (com.forsale.adserver.datalayer.network.WebClient) r4
            kotlin.f.b(r10)
            goto La0
        L4f:
            java.lang.Object r2 = r0.f20712b
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r0.f20711a
            com.forsale.adserver.datalayer.network.WebClient r4 = (com.forsale.adserver.datalayer.network.WebClient) r4
            kotlin.f.b(r10)
            goto L91
        L5b:
            java.lang.Object r2 = r0.f20711a
            com.forsale.adserver.datalayer.network.WebClient r2 = (com.forsale.adserver.datalayer.network.WebClient) r2
            kotlin.f.b(r10)
            goto L72
        L63:
            kotlin.f.b(r10)
            r0.f20711a = r9
            r0.f20715e = r6
            java.lang.Object r10 = r9.r(r0)
            if (r10 != r1) goto L71
            return r1
        L71:
            r2 = r9
        L72:
            f9.b r10 = (f9.b) r10
            if (r10 == 0) goto Lb5
            java.lang.String r7 = r10.a()
            com.forsale.adserver.utils.LocaleManager r8 = com.forsale.adserver.utils.LocaleManager.f20849a
            r10.b()
            r8.m(r5)
            r0.f20711a = r2
            r0.f20712b = r7
            r0.f20715e = r4
            java.lang.Object r10 = r2.j(r7, r0)
            if (r10 != r1) goto L8f
            return r1
        L8f:
            r4 = r2
            r2 = r7
        L91:
            byte[] r10 = (byte[]) r10
            r0.f20711a = r4
            r0.f20712b = r2
            r0.f20715e = r5
            java.lang.Object r10 = r4.z(r10, r0)
            if (r10 != r1) goto La0
            return r1
        La0:
            r4.f()
            r0.f20711a = r4
            r0.f20712b = r2
            r0.f20715e = r3
            java.lang.Object r10 = r4.A(r0)
            if (r10 != r1) goto Lb0
            return r1
        Lb0:
            r1 = r2
            r0 = r4
        Lb2:
            r0.y(r1)
        Lb5:
            androidx.lifecycle.b0 r10 = com.forsale.adserver.utils.viewsUtils.UtilsKt.d()
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.a.a(r6)
            r10.postValue(r0)
            wz.p r10 = wz.p.f75480a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.adserver.datalayer.network.WebClient.h(zz.a):java.lang.Object");
    }

    public final Object k(int i11, String str, zz.a<? super b9.b> aVar) {
        return this.f20704c.a(new b9.a(kotlin.coroutines.jvm.internal.a.d(i11), str), aVar);
    }

    public final Deferred<b9.b> l(int i11, String deviceId, String clickType) {
        o.i(deviceId, "deviceId");
        o.i(clickType, "clickType");
        return this.f20704c.d(new c(i11, deviceId, clickType));
    }

    public final Object m(int i11, String str, zz.a<? super b9.i> aVar) {
        return this.f20704c.b(new h(kotlin.coroutines.jvm.internal.a.d(i11), str), aVar);
    }

    public final Deferred<b9.i> o(int i11, String deviceId, String clickType) {
        o.i(deviceId, "deviceId");
        o.i(clickType, "clickType");
        return this.f20704c.f(new k(i11, deviceId, clickType));
    }

    public final Deferred<b9.b> q(int i11, String clickType) {
        o.i(clickType, "clickType");
        return this.f20704c.g(new b9.a(Integer.valueOf(i11), clickType));
    }

    public final Deferred<f9.a> s(int i11) {
        return this.f20704c.e(new j(Integer.valueOf(i11)));
    }

    public final Deferred<b9.i> t(int i11, String clickType) {
        o.i(clickType, "clickType");
        return this.f20704c.h(new h(Integer.valueOf(i11), clickType));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0094 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00d7 -> B:17:0x0053). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object w(int r21, long r22, long r24, double r26, g00.l<? super zz.a<? super T>, ? extends java.lang.Object> r28, zz.a<? super T> r29) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.adserver.datalayer.network.WebClient.w(int, long, long, double, g00.l, zz.a):java.lang.Object");
    }
}
