package com.forsale.app.workmangers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.forsale.app.datalayer.repositories.ExpireSoonRepository;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: ExpireSoonViewedWorker.kt */
/* loaded from: classes3.dex */
public final class ExpireSoonViewedWorker extends CoroutineWorker {

    /* renamed from: g  reason: collision with root package name */
    public static final a f40580g = new a(null);

    /* renamed from: h  reason: collision with root package name */
    public static final int f40581h = 8;

    /* renamed from: d  reason: collision with root package name */
    private final Context f40582d;

    /* renamed from: e  reason: collision with root package name */
    private final WorkerParameters f40583e;

    /* renamed from: f  reason: collision with root package name */
    private final ExpireSoonRepository f40584f;

    /* compiled from: ExpireSoonViewedWorker.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpireSoonViewedWorker(Context ctx, WorkerParameters params, ExpireSoonRepository expireSoonRepository) {
        super(ctx, params);
        o.i(ctx, "ctx");
        o.i(params, "params");
        o.i(expireSoonRepository, "expireSoonRepository");
        this.f40582d = ctx;
        this.f40583e = params;
        this.f40584f = expireSoonRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(zz.a<? super androidx.work.ListenableWorker.a> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.forsale.app.workmangers.ExpireSoonViewedWorker$doWork$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.workmangers.ExpireSoonViewedWorker$doWork$1 r0 = (com.forsale.app.workmangers.ExpireSoonViewedWorker$doWork$1) r0
            int r1 = r0.f40587c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40587c = r1
            goto L18
        L13:
            com.forsale.app.workmangers.ExpireSoonViewedWorker$doWork$1 r0 = new com.forsale.app.workmangers.ExpireSoonViewedWorker$doWork$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f40585a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f40587c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r6)
            goto L47
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            kotlin.f.b(r6)
            kotlinx.coroutines.CoroutineDispatcher r6 = kotlinx.coroutines.Dispatchers.getIO()
            com.forsale.app.workmangers.ExpireSoonViewedWorker$doWork$2 r2 = new com.forsale.app.workmangers.ExpireSoonViewedWorker$doWork$2
            r4 = 0
            r2.<init>(r5, r4)
            r0.f40587c = r3
            java.lang.Object r6 = kotlinx.coroutines.BuildersKt.withContext(r6, r2, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            java.lang.String r0 = "withContext(...)"
            kotlin.jvm.internal.o.h(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.workmangers.ExpireSoonViewedWorker.a(zz.a):java.lang.Object");
    }
}
