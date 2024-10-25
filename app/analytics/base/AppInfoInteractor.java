package com.forsale.app.analytics.base;

import android.content.Context;
import com.forsale.app.datalayer.repositories.RegionsRepository;
import com.forsale.app.utils.ContextExtensionsKt;
import com.forsale.app.utils.UiMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.o;
/* compiled from: AppInfoInteractor.kt */
/* loaded from: classes2.dex */
public final class AppInfoInteractor {

    /* renamed from: a  reason: collision with root package name */
    private final jj.b f21960a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f21961b;

    /* renamed from: c  reason: collision with root package name */
    private final RegionsRepository f21962c;

    /* compiled from: AppInfoInteractor.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f21963a;

        static {
            int[] iArr = new int[UiMode.values().length];
            try {
                iArr[UiMode.Night.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UiMode.Light.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f21963a = iArr;
        }
    }

    public AppInfoInteractor(jj.b pref, Context app, RegionsRepository regionsRepository) {
        o.i(pref, "pref");
        o.i(app, "app");
        o.i(regionsRepository, "regionsRepository");
        this.f21960a = pref;
        this.f21961b = app;
        this.f21962c = regionsRepository;
    }

    private final boolean b() {
        int i11 = a.f21963a[ContextExtensionsKt.o(this.f21961b).ordinal()];
        if (i11 == 1) {
            return true;
        }
        if (i11 == 2) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Integer r7, zz.a<? super com.forsale.app.analytics.base.d> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.forsale.app.analytics.base.AppInfoInteractor$invoke$1
            if (r0 == 0) goto L13
            r0 = r8
            com.forsale.app.analytics.base.AppInfoInteractor$invoke$1 r0 = (com.forsale.app.analytics.base.AppInfoInteractor$invoke$1) r0
            int r1 = r0.f21968e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21968e = r1
            goto L18
        L13:
            com.forsale.app.analytics.base.AppInfoInteractor$invoke$1 r0 = new com.forsale.app.analytics.base.AppInfoInteractor$invoke$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f21966c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f21968e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r7 = r0.f21965b
            com.forsale.app.datalayer.database.RegionEntity r7 = (com.forsale.app.datalayer.database.RegionEntity) r7
            java.lang.Object r0 = r0.f21964a
            com.forsale.app.analytics.base.AppInfoInteractor r0 = (com.forsale.app.analytics.base.AppInfoInteractor) r0
            kotlin.f.b(r8)
            goto L6e
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            java.lang.Object r7 = r0.f21964a
            com.forsale.app.analytics.base.AppInfoInteractor r7 = (com.forsale.app.analytics.base.AppInfoInteractor) r7
            kotlin.f.b(r8)
            goto L55
        L44:
            kotlin.f.b(r8)
            com.forsale.app.datalayer.repositories.RegionsRepository r8 = r6.f21962c
            r0.f21964a = r6
            r0.f21968e = r4
            java.lang.Object r8 = r8.getRegion(r7, r0)
            if (r8 != r1) goto L54
            return r1
        L54:
            r7 = r6
        L55:
            com.forsale.app.datalayer.database.RegionEntity r8 = (com.forsale.app.datalayer.database.RegionEntity) r8
            jj.b r2 = r7.f21960a
            kj.b r2 = r2.c()
            r0.f21964a = r7
            r0.f21965b = r8
            r0.f21968e = r3
            java.lang.Object r0 = r2.a(r0)
            if (r0 != r1) goto L6a
            return r1
        L6a:
            r5 = r0
            r0 = r7
            r7 = r8
            r8 = r5
        L6e:
            java.lang.String r8 = (java.lang.String) r8
            android.content.Context r1 = r0.f21961b
            com.forsale.app.utils.DeviceType r1 = com.forsale.app.utils.ContextExtensionsKt.r(r1)
            android.content.Context r2 = r0.f21961b
            r3 = 0
            boolean r2 = com.forsale.app.utils.ContextExtensionsKt.b(r2, r3, r4, r3)
            boolean r0 = r0.b()
            com.forsale.app.analytics.base.d$b r3 = new com.forsale.app.analytics.base.d$b
            r3.<init>(r8, r1, r2, r0)
            com.forsale.app.analytics.base.d$c r8 = new com.forsale.app.analytics.base.d$c
            int r0 = r7.getId()
            java.lang.String r7 = r7.getName()
            r8.<init>(r0, r7)
            com.forsale.app.analytics.base.d r7 = new com.forsale.app.analytics.base.d
            r7.<init>(r3, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.analytics.base.AppInfoInteractor.a(java.lang.Integer, zz.a):java.lang.Object");
    }
}
