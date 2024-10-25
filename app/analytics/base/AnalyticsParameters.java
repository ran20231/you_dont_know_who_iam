package com.forsale.app.analytics.base;

import com.forsale.app.analytics.base.kits.AnalyticKitTypes;
import g00.l;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.j0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import wz.h;
import wz.p;
/* compiled from: AnalyticsParameters.kt */
/* loaded from: classes2.dex */
public final class AnalyticsParameters {

    /* renamed from: b  reason: collision with root package name */
    public static final a f21956b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f21957c = 8;

    /* renamed from: a  reason: collision with root package name */
    private final h f21958a;

    /* compiled from: AnalyticsParameters.kt */
    /* loaded from: classes2.dex */
    public static final class a implements l<l<? super AnalyticsParameters, ? extends p>, AnalyticsParameters> {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // g00.l
        /* renamed from: b */
        public AnalyticsParameters invoke(l<? super AnalyticsParameters, p> paramsBuilder) {
            o.i(paramsBuilder, "paramsBuilder");
            AnalyticsParameters analyticsParameters = new AnalyticsParameters(null);
            paramsBuilder.invoke(analyticsParameters);
            return analyticsParameters;
        }
    }

    public /* synthetic */ AnalyticsParameters(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final Map<AnalyticKitTypes, Map<String, Object>> a() {
        return (Map) this.f21958a.getValue();
    }

    public static /* synthetic */ void d(AnalyticsParameters analyticsParameters, String str, Object obj, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            str = "";
        }
        if ((i11 & 2) != 0) {
            obj = "";
        }
        analyticsParameters.c(str, obj);
    }

    public final Map<String, Object> b(AnalyticKitTypes targetKit) {
        Map<String, Object> o11;
        o.i(targetKit, "targetKit");
        Map<String, Object> map = a().get(targetKit);
        if (map == null) {
            map = j0.h();
        }
        Map<String, Object> map2 = a().get(AnalyticKitTypes.ALL);
        if (map2 == null) {
            map2 = j0.h();
        }
        o11 = j0.o(map, map2);
        return o11;
    }

    public final void c(String parameterKey, Object value) {
        o.i(parameterKey, "parameterKey");
        o.i(value, "value");
        Map<AnalyticKitTypes, Map<String, Object>> a11 = a();
        AnalyticKitTypes analyticKitTypes = AnalyticKitTypes.ALL;
        Map<String, Object> map = a11.get(analyticKitTypes);
        if (map == null) {
            map = new LinkedHashMap<>();
        }
        map.put(parameterKey, value);
        a().put(analyticKitTypes, map);
    }

    private AnalyticsParameters() {
        h a11;
        a11 = kotlin.d.a(new g00.a<Map<AnalyticKitTypes, Map<String, Object>>>() { // from class: com.forsale.app.analytics.base.AnalyticsParameters$map$2
            @Override // g00.a
            public final Map<AnalyticKitTypes, Map<String, Object>> invoke() {
                return new LinkedHashMap();
            }
        });
        this.f21958a = a11;
    }
}
