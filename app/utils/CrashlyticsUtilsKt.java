package com.forsale.app.utils;

import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: CrashlyticsUtils.kt */
/* loaded from: classes3.dex */
public final class CrashlyticsUtilsKt {
    public static final void a(String screenName, g00.l<? super tn.b, wz.p> parametersBlock) {
        kotlin.jvm.internal.o.i(screenName, "screenName");
        kotlin.jvm.internal.o.i(parametersBlock, "parametersBlock");
        FirebaseAnalytics a11 = tn.a.a(zo.a.f77775a);
        tn.b bVar = new tn.b();
        bVar.b("screen_name", screenName);
        parametersBlock.invoke(bVar);
        a11.a("screen_view", bVar.a());
    }

    public static /* synthetic */ void b(String str, g00.l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar = new g00.l<tn.b, wz.p>() { // from class: com.forsale.app.utils.CrashlyticsUtilsKt$logScreenVisited$1
                public final void b(tn.b bVar) {
                    kotlin.jvm.internal.o.i(bVar, "$this$null");
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ wz.p invoke(tn.b bVar) {
                    b(bVar);
                    return wz.p.f75480a;
                }
            };
        }
        a(str, lVar);
    }
}
