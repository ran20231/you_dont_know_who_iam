package com.forsale.app.utils.prefUtils.preferences;

import com.forsale.app.utils.prefUtils.DataStoreExtensionsKt;
import com.google.gson.ToNumberPolicy;
import com.google.gson.d;
import com.google.gson.e;
import d3.c;
import h3.a;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import oa.f;
import wz.p;
/* compiled from: ContinueBrowsingPrefs.kt */
/* loaded from: classes3.dex */
public final class ContinueBrowsingPrefs {

    /* renamed from: d  reason: collision with root package name */
    public static final a f40441d = new a(null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f40442e = 8;

    /* renamed from: a  reason: collision with root package name */
    private final c<h3.a> f40443a;

    /* renamed from: b  reason: collision with root package name */
    private final a.C0641a<String> f40444b;

    /* renamed from: c  reason: collision with root package name */
    private final d f40445c;

    /* compiled from: ContinueBrowsingPrefs.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ContinueBrowsingPrefs(c<h3.a> dataStore) {
        o.i(dataStore, "dataStore");
        this.f40443a = dataStore;
        this.f40444b = h3.c.f("continueBrowsingData");
        this.f40445c = new e().g(ToNumberPolicy.LONG_OR_DOUBLE).b();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(zz.a<? super oa.f> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.forsale.app.utils.prefUtils.preferences.ContinueBrowsingPrefs$getContinueBrowsingData$1
            if (r0 == 0) goto L13
            r0 = r5
            com.forsale.app.utils.prefUtils.preferences.ContinueBrowsingPrefs$getContinueBrowsingData$1 r0 = (com.forsale.app.utils.prefUtils.preferences.ContinueBrowsingPrefs$getContinueBrowsingData$1) r0
            int r1 = r0.f40449d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40449d = r1
            goto L18
        L13:
            com.forsale.app.utils.prefUtils.preferences.ContinueBrowsingPrefs$getContinueBrowsingData$1 r0 = new com.forsale.app.utils.prefUtils.preferences.ContinueBrowsingPrefs$getContinueBrowsingData$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f40447b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f40449d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f40446a
            com.forsale.app.utils.prefUtils.preferences.ContinueBrowsingPrefs r0 = (com.forsale.app.utils.prefUtils.preferences.ContinueBrowsingPrefs) r0
            kotlin.f.b(r5)
            goto L4a
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.f.b(r5)
            d3.c<h3.a> r5 = r4.f40443a
            h3.a$a<java.lang.String> r2 = r4.f40444b
            r0.f40446a = r4
            r0.f40449d = r3
            java.lang.String r3 = ""
            java.lang.Object r5 = com.forsale.app.utils.prefUtils.DataStoreExtensionsKt.a(r5, r2, r3, r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            r0 = r4
        L4a:
            java.lang.String r5 = (java.lang.String) r5
            com.google.gson.d r0 = r0.f40445c
            java.lang.Class<oa.f> r1 = oa.f.class
            java.lang.Object r5 = r0.k(r5, r1)
            oa.f r5 = (oa.f) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.prefUtils.preferences.ContinueBrowsingPrefs.a(zz.a):java.lang.Object");
    }

    public final Object b(f fVar, zz.a<? super p> aVar) {
        Object f11;
        c<h3.a> cVar = this.f40443a;
        a.C0641a<String> c0641a = this.f40444b;
        String t11 = new d().t(fVar);
        o.h(t11, "toJson(...)");
        Object d11 = DataStoreExtensionsKt.d(cVar, c0641a, t11, aVar);
        f11 = b.f();
        if (d11 == f11) {
            return d11;
        }
        return p.f75480a;
    }
}
