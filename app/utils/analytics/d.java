package com.forsale.app.utils.analytics;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustConfig;
import com.adjust.sdk.AdjustEvent;
import com.adjust.sdk.AdjustEventFailure;
import com.adjust.sdk.AdjustEventSuccess;
import com.adjust.sdk.LogLevel;
import com.adjust.sdk.OnEventTrackingFailedListener;
import com.adjust.sdk.OnEventTrackingSucceededListener;
import com.forsale.app.utils.TypeExtensionsKt;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import t9.y0;
/* compiled from: AdjustLogger.kt */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final Application f40014a;

    /* renamed from: b  reason: collision with root package name */
    private final com.forsale.app.utils.analytics.a f40015b;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AdjustLogger.kt */
    /* loaded from: classes3.dex */
    public static final class a implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity p02, Bundle bundle) {
            o.i(p02, "p0");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity p02) {
            o.i(p02, "p0");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity p02) {
            o.i(p02, "p0");
            Adjust.onPause();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity p02) {
            o.i(p02, "p0");
            Adjust.onResume();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity p02, Bundle p12) {
            o.i(p02, "p0");
            o.i(p12, "p1");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity p02) {
            o.i(p02, "p0");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity p02) {
            o.i(p02, "p0");
        }
    }

    public d(Application app, com.forsale.app.utils.analytics.a adjustEventMapper) {
        o.i(app, "app");
        o.i(adjustEventMapper, "adjustEventMapper");
        this.f40014a = app;
        this.f40015b = adjustEventMapper;
    }

    private static final void d(Map<String, ? extends Object> map, AdjustEvent adjustEvent) {
        boolean z11;
        Double d11;
        if (map != null && !map.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            return;
        }
        Object obj = map.get(AggregatedAllAnalyticsLogger.CustomParameterName.REVENUE.getValue());
        String str = null;
        if (obj instanceof Double) {
            d11 = (Double) obj;
        } else {
            d11 = null;
        }
        Object obj2 = map.get(AggregatedAllAnalyticsLogger.CustomParameterName.REVENUE_CURRENCY.getValue());
        if (obj2 instanceof String) {
            str = (String) obj2;
        }
        if (d11 != null) {
            double doubleValue = d11.doubleValue();
            if (str != null) {
                adjustEvent.setRevenue(doubleValue, str);
            }
        }
    }

    private static final void e(Map<String, ? extends Object> map, AdjustEvent adjustEvent) {
        List list;
        if (map != null) {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                boolean z11 = true;
                String str = null;
                if (entry.getValue() instanceof String) {
                    Object value = entry.getValue();
                    o.g(value, "null cannot be cast to non-null type kotlin.String");
                    String str2 = (String) value;
                    if (str2.length() != 0) {
                        z11 = false;
                    }
                    if (!z11) {
                        str = str2;
                    }
                    if (str != null) {
                        adjustEvent.addPartnerParameter(entry.getKey(), str);
                    }
                } else if (entry.getValue() instanceof List) {
                    Object value2 = entry.getValue();
                    if (value2 instanceof List) {
                        list = (List) value2;
                    } else {
                        list = null;
                    }
                    String d11 = TypeExtensionsKt.d(list);
                    if (d11.length() != 0) {
                        z11 = false;
                    }
                    if (!z11) {
                        str = d11;
                    }
                    if (str != null) {
                        adjustEvent.addPartnerParameter(entry.getKey(), str);
                    }
                }
            }
        }
    }

    private final String f(String str) {
        AggregatedAllAnalyticsLogger.CustomEvents a11 = AggregatedAllAnalyticsLogger.CustomEvents.Companion.a(str);
        if (a11 != null) {
            return this.f40015b.c(a11);
        }
        AggregatedAllAnalyticsLogger.ListingsVisitedEvents a12 = AggregatedAllAnalyticsLogger.ListingsVisitedEvents.Companion.a(str);
        if (a12 != null) {
            return this.f40015b.d(a12);
        }
        AggregatedAllAnalyticsLogger.AdvActionEvents a13 = AggregatedAllAnalyticsLogger.AdvActionEvents.Companion.a(str);
        if (a13 != null) {
            return this.f40015b.b(a13);
        }
        CreateEditAdvActionType a14 = CreateEditAdvActionType.Companion.a(str);
        if (a14 != null) {
            return this.f40015b.e(a14);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(AdjustEventSuccess adjustEventSuccess) {
        JSONObject jSONObject = adjustEventSuccess.jsonResponse;
        x10.a.b("Adjust: setOnEventTrackingSucceededListener " + jSONObject, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(AdjustEventFailure adjustEventFailure) {
        JSONObject jSONObject = adjustEventFailure.jsonResponse;
        x10.a.b("Adjust: setOnEventTrackingFailedListener " + jSONObject, new Object[0]);
    }

    public final void c(String eventName, Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
        o.i(eventName, "eventName");
        String f11 = f(eventName);
        if (f11 != null) {
            AdjustEvent adjustEvent = new AdjustEvent(f11);
            e(map, adjustEvent);
            d(map2, adjustEvent);
            x10.a.b("Adjust: name: " + eventName + " | token: " + f11 + " | properties: " + map + " | confidentialAttributes:  " + map2, new Object[0]);
            Adjust.trackEvent(adjustEvent);
        }
    }

    public final void g() {
        String string = this.f40014a.getString(y0.f70759y);
        o.h(string, "getString(...)");
        AdjustConfig adjustConfig = new AdjustConfig(this.f40014a, string, AdjustConfig.ENVIRONMENT_PRODUCTION, true);
        adjustConfig.setLogLevel(LogLevel.WARN);
        adjustConfig.setOnEventTrackingSucceededListener(new OnEventTrackingSucceededListener() { // from class: com.forsale.app.utils.analytics.b
            @Override // com.adjust.sdk.OnEventTrackingSucceededListener
            public final void onFinishedEventTrackingSucceeded(AdjustEventSuccess adjustEventSuccess) {
                d.h(adjustEventSuccess);
            }
        });
        adjustConfig.setOnEventTrackingFailedListener(new OnEventTrackingFailedListener() { // from class: com.forsale.app.utils.analytics.c
            @Override // com.adjust.sdk.OnEventTrackingFailedListener
            public final void onFinishedEventTrackingFailed(AdjustEventFailure adjustEventFailure) {
                d.i(adjustEventFailure);
            }
        });
        Adjust.onCreate(adjustConfig);
        this.f40014a.registerActivityLifecycleCallbacks(new a());
    }
}
