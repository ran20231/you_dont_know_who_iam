package com.forsale.app.utils.analytics;

import com.forsale.app.analytics.base.AnalyticsParameters;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.q;
import kotlin.collections.r;
import kotlin.jvm.internal.o;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.s;
/* compiled from: CommonListingsEventsKey.kt */
/* loaded from: classes3.dex */
public final class j {
    public static final List<Pair<String, String>> a(AnalyticsParameters analyticsParameters, List<String> parts, String levelKey) {
        List<Pair<String, String>> n11;
        boolean v11;
        o.i(analyticsParameters, "<this>");
        o.i(parts, "parts");
        o.i(levelKey, "levelKey");
        n11 = r.n();
        int i11 = 0;
        for (Object obj : parts) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                r.x();
            }
            String str = (String) obj;
            if (i11 > 0) {
                String str2 = levelKey + i12;
                v11 = s.v(str);
                if (!v11) {
                    n11 = CollectionsKt___CollectionsKt.F0(n11, wz.i.a(str2, str));
                }
            }
            i11 = i12;
        }
        return n11;
    }

    public static final void b(AnalyticsParameters analyticsParameters, i commonListingsModel) {
        o.i(analyticsParameters, "<this>");
        o.i(commonListingsModel, "commonListingsModel");
        analyticsParameters.c("RegionID", Integer.valueOf(commonListingsModel.e()));
        analyticsParameters.c("RegionName", commonListingsModel.f());
        analyticsParameters.c("CategoryID", commonListingsModel.b());
        analyticsParameters.c("CategoryName", commonListingsModel.c());
        analyticsParameters.c("CategoryFullPath", commonListingsModel.a());
    }

    private static final List<Pair<String, List<String>>> c(List<String> list, String str) {
        List<Pair<String, List<String>>> n11;
        boolean v11;
        List e11;
        n11 = r.n();
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                r.x();
            }
            String str2 = (String) obj;
            String str3 = str + i11;
            v11 = s.v(str2);
            if (!v11) {
                e11 = q.e(str2);
                n11 = CollectionsKt___CollectionsKt.F0(n11, wz.i.a(str3, e11));
            }
            i11 = i12;
        }
        return n11;
    }

    public static final List<Pair<String, String>> d(AnalyticsParameters analyticsParameters, String str, String verticalKey, String levelKey) {
        List<Pair<String, String>> n11;
        List F0;
        Object k02;
        List F02;
        List<Pair<String, String>> E0;
        o.i(analyticsParameters, "<this>");
        o.i(verticalKey, "verticalKey");
        o.i(levelKey, "levelKey");
        n11 = r.n();
        if (str != null) {
            F0 = StringsKt__StringsKt.F0(str, new String[]{"--_--"}, false, 0, 6, null);
            if (!F0.isEmpty()) {
                k02 = CollectionsKt___CollectionsKt.k0(F0);
                F02 = CollectionsKt___CollectionsKt.F0(n11, wz.i.a(verticalKey, k02));
                E0 = CollectionsKt___CollectionsKt.E0(F02, a(analyticsParameters, F0, levelKey));
                return E0;
            }
            return n11;
        }
        return n11;
    }

    public static /* synthetic */ List e(AnalyticsParameters analyticsParameters, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = "Vertical";
        }
        if ((i11 & 4) != 0) {
            str3 = "CategoryLevel";
        }
        return d(analyticsParameters, str, str2, str3);
    }

    public static final List<Pair<String, List<String>>> f(AnalyticsParameters analyticsParameters, String str, String levelKeyName) {
        List<Pair<String, List<String>>> n11;
        List E0;
        List<Pair<String, List<String>>> E02;
        o.i(analyticsParameters, "<this>");
        o.i(levelKeyName, "levelKeyName");
        n11 = r.n();
        if (str != null) {
            E0 = StringsKt__StringsKt.E0(str, new char[]{','}, false, 0, 6, null);
            if (true ^ E0.isEmpty()) {
                E02 = CollectionsKt___CollectionsKt.E0(n11, c(E0, levelKeyName));
                return E02;
            }
            return n11;
        }
        return n11;
    }
}
