package com.forsale.app.workmangers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.forsale.app.datalayer.repositories.ListingDetailsEntityRepository;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: ClearListingCachedWorkManger.kt */
/* loaded from: classes3.dex */
public final class ClearListingCachedWorkManger extends CoroutineWorker {

    /* renamed from: g  reason: collision with root package name */
    public static final a f40552g = new a(null);

    /* renamed from: h  reason: collision with root package name */
    public static final int f40553h = 8;

    /* renamed from: d  reason: collision with root package name */
    private final Context f40554d;

    /* renamed from: e  reason: collision with root package name */
    private final WorkerParameters f40555e;

    /* renamed from: f  reason: collision with root package name */
    public ListingDetailsEntityRepository f40556f;

    /* compiled from: ClearListingCachedWorkManger.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClearListingCachedWorkManger(Context context, WorkerParameters params) {
        super(context, params);
        o.i(context, "context");
        o.i(params, "params");
        this.f40554d = context;
        this.f40555e = params;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(zz.a<? super androidx.work.ListenableWorker.a> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.forsale.app.workmangers.ClearListingCachedWorkManger$doWork$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.workmangers.ClearListingCachedWorkManger$doWork$1 r0 = (com.forsale.app.workmangers.ClearListingCachedWorkManger$doWork$1) r0
            int r1 = r0.f40559c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40559c = r1
            goto L18
        L13:
            com.forsale.app.workmangers.ClearListingCachedWorkManger$doWork$1 r0 = new com.forsale.app.workmangers.ClearListingCachedWorkManger$doWork$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f40557a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f40559c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            kotlin.f.b(r6)     // Catch: java.lang.Exception -> L51
            goto L42
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            kotlin.f.b(r6)
            com.forsale.app.datalayer.repositories.ListingDetailsEntityRepository r6 = r5.i()     // Catch: java.lang.Exception -> L51
            r0.f40559c = r4     // Catch: java.lang.Exception -> L51
            java.lang.Object r6 = r6.deleteSuspended(r0)     // Catch: java.lang.Exception -> L51
            if (r6 != r1) goto L42
            return r1
        L42:
            java.lang.String r6 = "updateCache::WorkManger Delete Success"
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L51
            x10.a.b(r6, r0)     // Catch: java.lang.Exception -> L51
            androidx.work.ListenableWorker$a r6 = androidx.work.ListenableWorker.a.d()     // Catch: java.lang.Exception -> L51
            kotlin.jvm.internal.o.f(r6)     // Catch: java.lang.Exception -> L51
            goto L5f
        L51:
            java.lang.String r6 = "updateCache::WorkManger Delete Failed"
            java.lang.Object[] r0 = new java.lang.Object[r3]
            x10.a.b(r6, r0)
            androidx.work.ListenableWorker$a r6 = androidx.work.ListenableWorker.a.a()
            kotlin.jvm.internal.o.f(r6)
        L5f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.workmangers.ClearListingCachedWorkManger.a(zz.a):java.lang.Object");
    }

    public final ListingDetailsEntityRepository i() {
        ListingDetailsEntityRepository listingDetailsEntityRepository = this.f40556f;
        if (listingDetailsEntityRepository != null) {
            return listingDetailsEntityRepository;
        }
        o.w("listingDetailsEntityRepository");
        return null;
    }
}
