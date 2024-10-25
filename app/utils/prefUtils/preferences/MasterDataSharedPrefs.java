package com.forsale.app.utils.prefUtils.preferences;

import com.forsale.app.datalayer.database.HomeTooltipSettings;
import com.forsale.app.datalayer.database.MasterDataImageBaseUrls;
import com.forsale.app.datalayer.database.MasterDataMiscModel;
import com.forsale.app.datalayer.database.MasterDataModel;
import com.forsale.app.datalayer.database.MasterDataPowerPinsSettings;
import com.forsale.app.utils.prefUtils.DataStoreExtensionsKt;
import d3.c;
import h3.a;
import java.util.Set;
import kotlin.collections.q0;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.Flow;
import tv.teads.sdk.AdOpportunityTrackerView;
import wz.p;
/* compiled from: MasterDataSharedPrefs.kt */
/* loaded from: classes3.dex */
public final class MasterDataSharedPrefs {

    /* renamed from: s  reason: collision with root package name */
    public static final a f40469s = new a(null);

    /* renamed from: t  reason: collision with root package name */
    public static final int f40470t = 8;

    /* renamed from: a  reason: collision with root package name */
    private final c<h3.a> f40471a;

    /* renamed from: b  reason: collision with root package name */
    private final a.C0641a<String> f40472b;

    /* renamed from: c  reason: collision with root package name */
    private final a.C0641a<String> f40473c;

    /* renamed from: d  reason: collision with root package name */
    private final a.C0641a<Integer> f40474d;

    /* renamed from: e  reason: collision with root package name */
    private final a.C0641a<Set<String>> f40475e;

    /* renamed from: f  reason: collision with root package name */
    private final a.C0641a<Set<String>> f40476f;

    /* renamed from: g  reason: collision with root package name */
    private final a.C0641a<Integer> f40477g;

    /* renamed from: h  reason: collision with root package name */
    private final a.C0641a<String> f40478h;

    /* renamed from: i  reason: collision with root package name */
    private final a.C0641a<String> f40479i;

    /* renamed from: j  reason: collision with root package name */
    private final a.C0641a<String> f40480j;

    /* renamed from: k  reason: collision with root package name */
    private final a.C0641a<String> f40481k;

    /* renamed from: l  reason: collision with root package name */
    private final a.C0641a<String> f40482l;

    /* renamed from: m  reason: collision with root package name */
    private final a.C0641a<String> f40483m;

    /* renamed from: n  reason: collision with root package name */
    private final a.C0641a<Integer> f40484n;

    /* renamed from: o  reason: collision with root package name */
    private final a.C0641a<Integer> f40485o;

    /* renamed from: p  reason: collision with root package name */
    private final a.C0641a<Integer> f40486p;

    /* renamed from: q  reason: collision with root package name */
    private final a.C0641a<String> f40487q;

    /* renamed from: r  reason: collision with root package name */
    private final a.C0641a<Integer> f40488r;

    /* compiled from: MasterDataSharedPrefs.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public MasterDataSharedPrefs(c<h3.a> dataStore) {
        o.i(dataStore, "dataStore");
        this.f40471a = dataStore;
        this.f40472b = h3.c.f(MasterDataModel.LAST_UPDATE_TIMESTAMP);
        this.f40473c = h3.c.f(MasterDataModel.LAST_UPDATE_DATETIME);
        this.f40474d = h3.c.d(MasterDataModel.COLLAPSE_HOME_RECOMMENDED);
        this.f40475e = h3.c.g(MasterDataPowerPinsSettings.POWER_PINS_VIEW_ENABLED_LOCATIONS);
        this.f40476f = h3.c.g(MasterDataPowerPinsSettings.POWER_PINS_ADD_ENABLED_LOCATIONS);
        this.f40477g = h3.c.d(MasterDataPowerPinsSettings.POWER_PIN_IMAGE_DURATION_IN_MS);
        this.f40478h = h3.c.f(MasterDataPowerPinsSettings.POWER_PINS_TUTORIAL_URL_EN);
        this.f40479i = h3.c.f(MasterDataPowerPinsSettings.POWER_PINS_TUTORIAL_URL_AR);
        this.f40480j = h3.c.f(MasterDataImageBaseUrls.HOME_VERTICAL_BIG);
        this.f40481k = h3.c.f(MasterDataImageBaseUrls.HOME_VERTICAL_SMALL);
        this.f40482l = h3.c.f(MasterDataImageBaseUrls.MEDIA_BIG);
        this.f40483m = h3.c.f(MasterDataImageBaseUrls.MEDIA_THUMBNAIL);
        this.f40484n = h3.c.d("max_views_sessions");
        this.f40485o = h3.c.d(HomeTooltipSettings.HOME_TOOLTIP_WAITING_MILLISECONDS);
        this.f40486p = h3.c.d("duration_milliseconds");
        this.f40487q = h3.c.f(MasterDataMiscModel.MISC_JSON);
        this.f40488r = h3.c.d(MasterDataModel.IS_PM_ENABLED);
    }

    public final Object A(String str, zz.a<? super p> aVar) {
        Object f11;
        Object d11 = DataStoreExtensionsKt.d(this.f40471a, this.f40473c, str, aVar);
        f11 = b.f();
        if (d11 == f11) {
            return d11;
        }
        return p.f75480a;
    }

    public final Object B(String str, zz.a<? super p> aVar) {
        Object f11;
        Object d11 = DataStoreExtensionsKt.d(this.f40471a, this.f40472b, str, aVar);
        f11 = b.f();
        if (d11 == f11) {
            return d11;
        }
        return p.f75480a;
    }

    public final Object C(MasterDataMiscModel masterDataMiscModel, zz.a<? super p> aVar) {
        Object f11;
        c<h3.a> cVar = this.f40471a;
        a.C0641a<String> c0641a = this.f40487q;
        String convertToJsonString = MasterDataMiscModel.Companion.convertToJsonString(masterDataMiscModel);
        if (convertToJsonString == null) {
            convertToJsonString = "";
        }
        Object d11 = DataStoreExtensionsKt.d(cVar, c0641a, convertToJsonString, aVar);
        f11 = b.f();
        if (d11 == f11) {
            return d11;
        }
        return p.f75480a;
    }

    public final Object D(Set<String> set, zz.a<? super p> aVar) {
        Object f11;
        Object d11 = DataStoreExtensionsKt.d(this.f40471a, this.f40476f, set, aVar);
        f11 = b.f();
        if (d11 == f11) {
            return d11;
        }
        return p.f75480a;
    }

    public final Object E(int i11, zz.a<? super p> aVar) {
        Object f11;
        Object d11 = DataStoreExtensionsKt.d(this.f40471a, this.f40477g, kotlin.coroutines.jvm.internal.a.d(i11), aVar);
        f11 = b.f();
        if (d11 == f11) {
            return d11;
        }
        return p.f75480a;
    }

    public final Object F(String str, zz.a<? super p> aVar) {
        Object f11;
        Object d11 = DataStoreExtensionsKt.d(this.f40471a, this.f40479i, str, aVar);
        f11 = b.f();
        if (d11 == f11) {
            return d11;
        }
        return p.f75480a;
    }

    public final Object G(String str, zz.a<? super p> aVar) {
        Object f11;
        Object d11 = DataStoreExtensionsKt.d(this.f40471a, this.f40478h, str, aVar);
        f11 = b.f();
        if (d11 == f11) {
            return d11;
        }
        return p.f75480a;
    }

    public final Object H(Set<String> set, zz.a<? super p> aVar) {
        Object f11;
        Object d11 = DataStoreExtensionsKt.d(this.f40471a, this.f40475e, set, aVar);
        f11 = b.f();
        if (d11 == f11) {
            return d11;
        }
        return p.f75480a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(zz.a<? super wz.p> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.forsale.app.utils.prefUtils.preferences.MasterDataSharedPrefs$clearUpdatesTracker$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.utils.prefUtils.preferences.MasterDataSharedPrefs$clearUpdatesTracker$1 r0 = (com.forsale.app.utils.prefUtils.preferences.MasterDataSharedPrefs$clearUpdatesTracker$1) r0
            int r1 = r0.f40492d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40492d = r1
            goto L18
        L13:
            com.forsale.app.utils.prefUtils.preferences.MasterDataSharedPrefs$clearUpdatesTracker$1 r0 = new com.forsale.app.utils.prefUtils.preferences.MasterDataSharedPrefs$clearUpdatesTracker$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f40490b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f40492d
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
            java.lang.Object r2 = r0.f40489a
            com.forsale.app.utils.prefUtils.preferences.MasterDataSharedPrefs r2 = (com.forsale.app.utils.prefUtils.preferences.MasterDataSharedPrefs) r2
            kotlin.f.b(r6)
            goto L4f
        L3c:
            kotlin.f.b(r6)
            d3.c<h3.a> r6 = r5.f40471a
            h3.a$a<java.lang.String> r2 = r5.f40473c
            r0.f40489a = r5
            r0.f40492d = r4
            java.lang.Object r6 = com.forsale.app.utils.prefUtils.DataStoreExtensionsKt.c(r6, r2, r0)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r2 = r5
        L4f:
            d3.c<h3.a> r6 = r2.f40471a
            h3.a$a<java.lang.String> r2 = r2.f40472b
            r4 = 0
            r0.f40489a = r4
            r0.f40492d = r3
            java.lang.Object r6 = com.forsale.app.utils.prefUtils.DataStoreExtensionsKt.c(r6, r2, r0)
            if (r6 != r1) goto L5f
            return r1
        L5f:
            wz.p r6 = wz.p.f75480a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.prefUtils.preferences.MasterDataSharedPrefs.a(zz.a):java.lang.Object");
    }

    public final Object b(zz.a<? super Integer> aVar) {
        return DataStoreExtensionsKt.a(this.f40471a, this.f40486p, kotlin.coroutines.jvm.internal.a.d(AdOpportunityTrackerView.TIMEOUT), aVar);
    }

    public final Object c(zz.a<? super Integer> aVar) {
        return DataStoreExtensionsKt.a(this.f40471a, this.f40484n, kotlin.coroutines.jvm.internal.a.d(10), aVar);
    }

    public final Object d(zz.a<? super Integer> aVar) {
        return DataStoreExtensionsKt.a(this.f40471a, this.f40485o, kotlin.coroutines.jvm.internal.a.d(3000), aVar);
    }

    public final Object e(zz.a<? super String> aVar) {
        return DataStoreExtensionsKt.a(this.f40471a, this.f40480j, "", aVar);
    }

    public final Object f(zz.a<? super String> aVar) {
        return DataStoreExtensionsKt.a(this.f40471a, this.f40481k, "", aVar);
    }

    public final Object g(zz.a<? super String> aVar) {
        return DataStoreExtensionsKt.a(this.f40471a, this.f40482l, "", aVar);
    }

    public final Object h(zz.a<? super String> aVar) {
        return DataStoreExtensionsKt.a(this.f40471a, this.f40483m, "", aVar);
    }

    public final Object i(zz.a<? super Integer> aVar) {
        return DataStoreExtensionsKt.a(this.f40471a, this.f40474d, kotlin.coroutines.jvm.internal.a.d(1), aVar);
    }

    public final Object j(zz.a<? super Integer> aVar) {
        return DataStoreExtensionsKt.a(this.f40471a, this.f40488r, kotlin.coroutines.jvm.internal.a.d(0), aVar);
    }

    public final Object k(zz.a<? super String> aVar) {
        return DataStoreExtensionsKt.a(this.f40471a, this.f40472b, "", aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(zz.a<? super com.forsale.app.datalayer.database.MasterDataMiscModel> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.forsale.app.utils.prefUtils.preferences.MasterDataSharedPrefs$getMisc$1
            if (r0 == 0) goto L13
            r0 = r7
            com.forsale.app.utils.prefUtils.preferences.MasterDataSharedPrefs$getMisc$1 r0 = (com.forsale.app.utils.prefUtils.preferences.MasterDataSharedPrefs$getMisc$1) r0
            int r1 = r0.f40496d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40496d = r1
            goto L18
        L13:
            com.forsale.app.utils.prefUtils.preferences.MasterDataSharedPrefs$getMisc$1 r0 = new com.forsale.app.utils.prefUtils.preferences.MasterDataSharedPrefs$getMisc$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f40494b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f40496d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f40493a
            com.forsale.app.datalayer.database.MasterDataMiscModel$Companion r0 = (com.forsale.app.datalayer.database.MasterDataMiscModel.Companion) r0
            kotlin.f.b(r7)
            goto L4e
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            kotlin.f.b(r7)
            com.forsale.app.datalayer.database.MasterDataMiscModel$Companion r7 = com.forsale.app.datalayer.database.MasterDataMiscModel.Companion
            d3.c<h3.a> r2 = r6.f40471a
            h3.a$a<java.lang.String> r4 = r6.f40487q
            r0.f40493a = r7
            r0.f40496d = r3
            java.lang.String r3 = ""
            java.lang.Object r0 = com.forsale.app.utils.prefUtils.DataStoreExtensionsKt.a(r2, r4, r3, r0)
            if (r0 != r1) goto L4b
            return r1
        L4b:
            r5 = r0
            r0 = r7
            r7 = r5
        L4e:
            java.lang.String r7 = (java.lang.String) r7
            com.forsale.app.datalayer.database.MasterDataMiscModel r7 = r0.convertToMasterDataMiscModel(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.prefUtils.preferences.MasterDataSharedPrefs.l(zz.a):java.lang.Object");
    }

    public final Object m(zz.a<? super Set<String>> aVar) {
        Set e11;
        c<h3.a> cVar = this.f40471a;
        a.C0641a<Set<String>> c0641a = this.f40476f;
        e11 = q0.e();
        return DataStoreExtensionsKt.a(cVar, c0641a, e11, aVar);
    }

    public final Flow<Integer> n() {
        return DataStoreExtensionsKt.b(this.f40471a, this.f40477g, 3000);
    }

    public final Object o(zz.a<? super String> aVar) {
        return DataStoreExtensionsKt.a(this.f40471a, this.f40479i, "", aVar);
    }

    public final Object p(zz.a<? super String> aVar) {
        return DataStoreExtensionsKt.a(this.f40471a, this.f40478h, "", aVar);
    }

    public final Object q(zz.a<? super Set<String>> aVar) {
        Set e11;
        c<h3.a> cVar = this.f40471a;
        a.C0641a<Set<String>> c0641a = this.f40475e;
        e11 = q0.e();
        return DataStoreExtensionsKt.a(cVar, c0641a, e11, aVar);
    }

    public final Object r(int i11, zz.a<? super p> aVar) {
        Object f11;
        Object d11 = DataStoreExtensionsKt.d(this.f40471a, this.f40486p, kotlin.coroutines.jvm.internal.a.d(i11), aVar);
        f11 = b.f();
        if (d11 == f11) {
            return d11;
        }
        return p.f75480a;
    }

    public final Object s(int i11, zz.a<? super p> aVar) {
        Object f11;
        Object d11 = DataStoreExtensionsKt.d(this.f40471a, this.f40484n, kotlin.coroutines.jvm.internal.a.d(i11), aVar);
        f11 = b.f();
        if (d11 == f11) {
            return d11;
        }
        return p.f75480a;
    }

    public final Object t(int i11, zz.a<? super p> aVar) {
        Object f11;
        Object d11 = DataStoreExtensionsKt.d(this.f40471a, this.f40485o, kotlin.coroutines.jvm.internal.a.d(i11), aVar);
        f11 = b.f();
        if (d11 == f11) {
            return d11;
        }
        return p.f75480a;
    }

    public final Object u(String str, zz.a<? super p> aVar) {
        Object f11;
        Object d11 = DataStoreExtensionsKt.d(this.f40471a, this.f40480j, str, aVar);
        f11 = b.f();
        if (d11 == f11) {
            return d11;
        }
        return p.f75480a;
    }

    public final Object v(String str, zz.a<? super p> aVar) {
        Object f11;
        Object d11 = DataStoreExtensionsKt.d(this.f40471a, this.f40481k, str, aVar);
        f11 = b.f();
        if (d11 == f11) {
            return d11;
        }
        return p.f75480a;
    }

    public final Object w(String str, zz.a<? super p> aVar) {
        Object f11;
        Object d11 = DataStoreExtensionsKt.d(this.f40471a, this.f40482l, str, aVar);
        f11 = b.f();
        if (d11 == f11) {
            return d11;
        }
        return p.f75480a;
    }

    public final Object x(String str, zz.a<? super p> aVar) {
        Object f11;
        Object d11 = DataStoreExtensionsKt.d(this.f40471a, this.f40483m, str, aVar);
        f11 = b.f();
        if (d11 == f11) {
            return d11;
        }
        return p.f75480a;
    }

    public final Object y(int i11, zz.a<? super p> aVar) {
        Object f11;
        Object d11 = DataStoreExtensionsKt.d(this.f40471a, this.f40474d, kotlin.coroutines.jvm.internal.a.d(i11), aVar);
        f11 = b.f();
        if (d11 == f11) {
            return d11;
        }
        return p.f75480a;
    }

    public final Object z(int i11, zz.a<? super p> aVar) {
        Object f11;
        Object d11 = DataStoreExtensionsKt.d(this.f40471a, this.f40488r, kotlin.coroutines.jvm.internal.a.d(i11), aVar);
        f11 = b.f();
        if (d11 == f11) {
            return d11;
        }
        return p.f75480a;
    }
}
