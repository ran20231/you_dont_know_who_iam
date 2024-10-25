package com.forsale.app.utils.prefUtils.preferences;

import com.forsale.app.datalayer.network.responses.ListingsResponse;
import com.forsale.app.utils.prefUtils.DataStoreExtensionsKt;
import d3.c;
import h3.a;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: UserSharedPref.kt */
/* loaded from: classes3.dex */
public final class UserSharedPref {

    /* renamed from: i  reason: collision with root package name */
    public static final a f40515i = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public static final int f40516j = 8;

    /* renamed from: a  reason: collision with root package name */
    private final c<h3.a> f40517a;

    /* renamed from: b  reason: collision with root package name */
    private final a.C0641a<String> f40518b;

    /* renamed from: c  reason: collision with root package name */
    private final a.C0641a<String> f40519c;

    /* renamed from: d  reason: collision with root package name */
    private final a.C0641a<Integer> f40520d;

    /* renamed from: e  reason: collision with root package name */
    private final a.C0641a<String> f40521e;

    /* renamed from: f  reason: collision with root package name */
    private final a.C0641a<String> f40522f;

    /* renamed from: g  reason: collision with root package name */
    private final a.C0641a<Integer> f40523g;

    /* renamed from: h  reason: collision with root package name */
    private final a.C0641a<String> f40524h;

    /* compiled from: UserSharedPref.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public UserSharedPref(c<h3.a> dataStore) {
        o.i(dataStore, "dataStore");
        this.f40517a = dataStore;
        this.f40518b = h3.c.f("user_status_key");
        this.f40519c = h3.c.f("user_phone");
        this.f40520d = h3.c.d("default_vertical_id");
        this.f40521e = h3.c.f(ListingsResponse.RECOMMENDED_EXPIRY_DATE);
        this.f40522f = h3.c.f("recommended_source");
        this.f40523g = h3.c.d("power_pin_tutorial_seen");
        this.f40524h = h3.c.f("access_token");
    }

    public final Object a(zz.a<? super String> aVar) {
        return DataStoreExtensionsKt.a(this.f40517a, this.f40521e, "", aVar);
    }

    public final Object b(zz.a<? super String> aVar) {
        return DataStoreExtensionsKt.a(this.f40517a, this.f40522f, "", aVar);
    }

    public final Object c(zz.a<? super String> aVar) {
        return DataStoreExtensionsKt.a(this.f40517a, this.f40524h, "", aVar);
    }

    public final Object d(zz.a<? super String> aVar) {
        return DataStoreExtensionsKt.a(this.f40517a, this.f40519c, "", aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(zz.a<? super wz.p> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.forsale.app.utils.prefUtils.preferences.UserSharedPref$removeRecommendedData$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.utils.prefUtils.preferences.UserSharedPref$removeRecommendedData$1 r0 = (com.forsale.app.utils.prefUtils.preferences.UserSharedPref$removeRecommendedData$1) r0
            int r1 = r0.f40528d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40528d = r1
            goto L18
        L13:
            com.forsale.app.utils.prefUtils.preferences.UserSharedPref$removeRecommendedData$1 r0 = new com.forsale.app.utils.prefUtils.preferences.UserSharedPref$removeRecommendedData$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f40526b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f40528d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r6)
            goto L5f
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.f40525a
            com.forsale.app.utils.prefUtils.preferences.UserSharedPref r2 = (com.forsale.app.utils.prefUtils.preferences.UserSharedPref) r2
            kotlin.f.b(r6)
            goto L4f
        L3c:
            kotlin.f.b(r6)
            d3.c<h3.a> r6 = r5.f40517a
            h3.a$a<java.lang.String> r2 = r5.f40521e
            r0.f40525a = r5
            r0.f40528d = r4
            java.lang.Object r6 = com.forsale.app.utils.prefUtils.DataStoreExtensionsKt.c(r6, r2, r0)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r2 = r5
        L4f:
            d3.c<h3.a> r6 = r2.f40517a
            h3.a$a<java.lang.String> r2 = r2.f40522f
            r4 = 0
            r0.f40525a = r4
            r0.f40528d = r3
            java.lang.Object r6 = com.forsale.app.utils.prefUtils.DataStoreExtensionsKt.c(r6, r2, r0)
            if (r6 != r1) goto L5f
            return r1
        L5f:
            wz.p r6 = wz.p.f75480a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.prefUtils.preferences.UserSharedPref.e(zz.a):java.lang.Object");
    }

    public final Object f(zz.a<? super p> aVar) {
        Object f11;
        Object c11 = DataStoreExtensionsKt.c(this.f40517a, this.f40524h, aVar);
        f11 = b.f();
        if (c11 == f11) {
            return c11;
        }
        return p.f75480a;
    }

    public final Object g(String str, zz.a<? super p> aVar) {
        Object f11;
        Object d11 = DataStoreExtensionsKt.d(this.f40517a, this.f40521e, str, aVar);
        f11 = b.f();
        if (d11 == f11) {
            return d11;
        }
        return p.f75480a;
    }

    public final Object h(String str, zz.a<? super p> aVar) {
        Object f11;
        Object d11 = DataStoreExtensionsKt.d(this.f40517a, this.f40524h, str, aVar);
        f11 = b.f();
        if (d11 == f11) {
            return d11;
        }
        return p.f75480a;
    }

    public final Object i(String str, zz.a<? super p> aVar) {
        Object f11;
        Object d11 = DataStoreExtensionsKt.d(this.f40517a, this.f40519c, str, aVar);
        f11 = b.f();
        if (d11 == f11) {
            return d11;
        }
        return p.f75480a;
    }

    public final Object j(int i11, zz.a<? super p> aVar) {
        Object f11;
        Object d11 = DataStoreExtensionsKt.d(this.f40517a, this.f40520d, kotlin.coroutines.jvm.internal.a.d(i11), aVar);
        f11 = b.f();
        if (d11 == f11) {
            return d11;
        }
        return p.f75480a;
    }
}
