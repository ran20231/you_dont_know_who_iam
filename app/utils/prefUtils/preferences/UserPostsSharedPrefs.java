package com.forsale.app.utils.prefUtils.preferences;

import com.forsale.app.datalayer.network.entities.BusinessType;
import com.forsale.app.utils.prefUtils.DataStoreExtensionsKt;
import d3.c;
import h3.a;
import java.util.Set;
import kotlin.collections.q0;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: UserPostsSharedPrefs.kt */
/* loaded from: classes3.dex */
public final class UserPostsSharedPrefs {

    /* renamed from: i  reason: collision with root package name */
    public static final a f40498i = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public static final int f40499j = 8;

    /* renamed from: a  reason: collision with root package name */
    private final c<h3.a> f40500a;

    /* renamed from: b  reason: collision with root package name */
    private final a.C0641a<Set<String>> f40501b;

    /* renamed from: c  reason: collision with root package name */
    private final a.C0641a<Boolean> f40502c;

    /* renamed from: d  reason: collision with root package name */
    private final a.C0641a<Boolean> f40503d;

    /* renamed from: e  reason: collision with root package name */
    private final a.C0641a<String> f40504e;

    /* renamed from: f  reason: collision with root package name */
    private final a.C0641a<String> f40505f;

    /* renamed from: g  reason: collision with root package name */
    private final a.C0641a<Boolean> f40506g;

    /* renamed from: h  reason: collision with root package name */
    private final a.C0641a<Set<String>> f40507h;

    /* compiled from: UserPostsSharedPrefs.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public UserPostsSharedPrefs(c<h3.a> dataStore) {
        o.i(dataStore, "dataStore");
        this.f40500a = dataStore;
        this.f40501b = h3.c.g("SharedPreferences_ContactNumbers_Key");
        this.f40502c = h3.c.a("allow_hide_my_number_preferences_key");
        this.f40503d = h3.c.a("allow_do_not_disturb_preferences_key");
        this.f40504e = h3.c.f("do_not_disturb_value_preferences_key");
        this.f40505f = h3.c.f("business_type");
        this.f40506g = h3.c.a("post_ad_anonymous");
        this.f40507h = h3.c.g("ALREADY_VIEWED_CATEGORY_IMAGE_TUTORIAL");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(zz.a<? super wz.p> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.forsale.app.utils.prefUtils.preferences.UserPostsSharedPrefs$clearAllUserPostsData$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.utils.prefUtils.preferences.UserPostsSharedPrefs$clearAllUserPostsData$1 r0 = (com.forsale.app.utils.prefUtils.preferences.UserPostsSharedPrefs$clearAllUserPostsData$1) r0
            int r1 = r0.f40511d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40511d = r1
            goto L18
        L13:
            com.forsale.app.utils.prefUtils.preferences.UserPostsSharedPrefs$clearAllUserPostsData$1 r0 = new com.forsale.app.utils.prefUtils.preferences.UserPostsSharedPrefs$clearAllUserPostsData$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f40509b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f40511d
            switch(r2) {
                case 0: goto L59;
                case 1: goto L51;
                case 2: goto L49;
                case 3: goto L41;
                case 4: goto L39;
                case 5: goto L30;
                case 6: goto L2b;
                default: goto L23;
            }
        L23:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2b:
            kotlin.f.b(r6)
            goto Lbe
        L30:
            java.lang.Object r2 = r0.f40508a
            com.forsale.app.utils.prefUtils.preferences.UserPostsSharedPrefs r2 = (com.forsale.app.utils.prefUtils.preferences.UserPostsSharedPrefs) r2
            kotlin.f.b(r6)
            goto Lad
        L39:
            java.lang.Object r2 = r0.f40508a
            com.forsale.app.utils.prefUtils.preferences.UserPostsSharedPrefs r2 = (com.forsale.app.utils.prefUtils.preferences.UserPostsSharedPrefs) r2
            kotlin.f.b(r6)
            goto L9d
        L41:
            java.lang.Object r2 = r0.f40508a
            com.forsale.app.utils.prefUtils.preferences.UserPostsSharedPrefs r2 = (com.forsale.app.utils.prefUtils.preferences.UserPostsSharedPrefs) r2
            kotlin.f.b(r6)
            goto L8d
        L49:
            java.lang.Object r2 = r0.f40508a
            com.forsale.app.utils.prefUtils.preferences.UserPostsSharedPrefs r2 = (com.forsale.app.utils.prefUtils.preferences.UserPostsSharedPrefs) r2
            kotlin.f.b(r6)
            goto L7d
        L51:
            java.lang.Object r2 = r0.f40508a
            com.forsale.app.utils.prefUtils.preferences.UserPostsSharedPrefs r2 = (com.forsale.app.utils.prefUtils.preferences.UserPostsSharedPrefs) r2
            kotlin.f.b(r6)
            goto L6d
        L59:
            kotlin.f.b(r6)
            d3.c<h3.a> r6 = r5.f40500a
            h3.a$a<java.util.Set<java.lang.String>> r2 = r5.f40501b
            r0.f40508a = r5
            r3 = 1
            r0.f40511d = r3
            java.lang.Object r6 = com.forsale.app.utils.prefUtils.DataStoreExtensionsKt.c(r6, r2, r0)
            if (r6 != r1) goto L6c
            return r1
        L6c:
            r2 = r5
        L6d:
            d3.c<h3.a> r6 = r2.f40500a
            h3.a$a<java.lang.Boolean> r3 = r2.f40503d
            r0.f40508a = r2
            r4 = 2
            r0.f40511d = r4
            java.lang.Object r6 = com.forsale.app.utils.prefUtils.DataStoreExtensionsKt.c(r6, r3, r0)
            if (r6 != r1) goto L7d
            return r1
        L7d:
            d3.c<h3.a> r6 = r2.f40500a
            h3.a$a<java.lang.String> r3 = r2.f40504e
            r0.f40508a = r2
            r4 = 3
            r0.f40511d = r4
            java.lang.Object r6 = com.forsale.app.utils.prefUtils.DataStoreExtensionsKt.c(r6, r3, r0)
            if (r6 != r1) goto L8d
            return r1
        L8d:
            d3.c<h3.a> r6 = r2.f40500a
            h3.a$a<java.lang.Boolean> r3 = r2.f40502c
            r0.f40508a = r2
            r4 = 4
            r0.f40511d = r4
            java.lang.Object r6 = com.forsale.app.utils.prefUtils.DataStoreExtensionsKt.c(r6, r3, r0)
            if (r6 != r1) goto L9d
            return r1
        L9d:
            d3.c<h3.a> r6 = r2.f40500a
            h3.a$a<java.lang.String> r3 = r2.f40505f
            r0.f40508a = r2
            r4 = 5
            r0.f40511d = r4
            java.lang.Object r6 = com.forsale.app.utils.prefUtils.DataStoreExtensionsKt.c(r6, r3, r0)
            if (r6 != r1) goto Lad
            return r1
        Lad:
            d3.c<h3.a> r6 = r2.f40500a
            h3.a$a<java.lang.Boolean> r2 = r2.f40506g
            r3 = 0
            r0.f40508a = r3
            r3 = 6
            r0.f40511d = r3
            java.lang.Object r6 = com.forsale.app.utils.prefUtils.DataStoreExtensionsKt.c(r6, r2, r0)
            if (r6 != r1) goto Lbe
            return r1
        Lbe:
            wz.p r6 = wz.p.f75480a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.prefUtils.preferences.UserPostsSharedPrefs.a(zz.a):java.lang.Object");
    }

    public final Object b(zz.a<? super Boolean> aVar) {
        return DataStoreExtensionsKt.a(this.f40500a, this.f40502c, kotlin.coroutines.jvm.internal.a.a(false), aVar);
    }

    public final Object c(zz.a<? super Set<String>> aVar) {
        Set e11;
        c<h3.a> cVar = this.f40500a;
        a.C0641a<Set<String>> c0641a = this.f40501b;
        e11 = q0.e();
        return DataStoreExtensionsKt.a(cVar, c0641a, e11, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(zz.a<? super com.forsale.app.datalayer.network.entities.BusinessType> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.forsale.app.utils.prefUtils.preferences.UserPostsSharedPrefs$getBusinessType$1
            if (r0 == 0) goto L13
            r0 = r5
            com.forsale.app.utils.prefUtils.preferences.UserPostsSharedPrefs$getBusinessType$1 r0 = (com.forsale.app.utils.prefUtils.preferences.UserPostsSharedPrefs$getBusinessType$1) r0
            int r1 = r0.f40514c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40514c = r1
            goto L18
        L13:
            com.forsale.app.utils.prefUtils.preferences.UserPostsSharedPrefs$getBusinessType$1 r0 = new com.forsale.app.utils.prefUtils.preferences.UserPostsSharedPrefs$getBusinessType$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f40512a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f40514c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r5)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.f.b(r5)
            d3.c<h3.a> r5 = r4.f40500a
            h3.a$a<java.lang.String> r2 = r4.f40505f
            r0.f40514c = r3
            java.lang.String r3 = "PERSONAL"
            java.lang.Object r5 = com.forsale.app.utils.prefUtils.DataStoreExtensionsKt.a(r5, r2, r3, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            java.lang.String r5 = (java.lang.String) r5
            com.forsale.app.datalayer.network.entities.BusinessType r5 = com.forsale.app.datalayer.network.entities.BusinessType.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.prefUtils.preferences.UserPostsSharedPrefs.d(zz.a):java.lang.Object");
    }

    public final Object e(zz.a<? super Set<String>> aVar) {
        Set e11;
        c<h3.a> cVar = this.f40500a;
        a.C0641a<Set<String>> c0641a = this.f40507h;
        e11 = q0.e();
        return DataStoreExtensionsKt.a(cVar, c0641a, e11, aVar);
    }

    public final Object f(zz.a<? super Boolean> aVar) {
        return DataStoreExtensionsKt.a(this.f40500a, this.f40506g, kotlin.coroutines.jvm.internal.a.a(false), aVar);
    }

    public final Object g(boolean z11, zz.a<? super p> aVar) {
        Object f11;
        Object d11 = DataStoreExtensionsKt.d(this.f40500a, this.f40502c, kotlin.coroutines.jvm.internal.a.a(z11), aVar);
        f11 = b.f();
        if (d11 == f11) {
            return d11;
        }
        return p.f75480a;
    }

    public final Object h(Set<String> set, zz.a<? super p> aVar) {
        Object f11;
        Object d11 = DataStoreExtensionsKt.d(this.f40500a, this.f40501b, set, aVar);
        f11 = b.f();
        if (d11 == f11) {
            return d11;
        }
        return p.f75480a;
    }

    public final Object i(BusinessType businessType, zz.a<? super p> aVar) {
        Object f11;
        Object d11 = DataStoreExtensionsKt.d(this.f40500a, this.f40505f, businessType.name(), aVar);
        f11 = b.f();
        if (d11 == f11) {
            return d11;
        }
        return p.f75480a;
    }

    public final Object j(Set<String> set, zz.a<? super p> aVar) {
        Object f11;
        Object d11 = DataStoreExtensionsKt.d(this.f40500a, this.f40507h, set, aVar);
        f11 = b.f();
        if (d11 == f11) {
            return d11;
        }
        return p.f75480a;
    }

    public final Object k(boolean z11, zz.a<? super p> aVar) {
        Object f11;
        Object d11 = DataStoreExtensionsKt.d(this.f40500a, this.f40506g, kotlin.coroutines.jvm.internal.a.a(z11), aVar);
        f11 = b.f();
        if (d11 == f11) {
            return d11;
        }
        return p.f75480a;
    }
}
