package com.forsale.app.utils;

import android.content.Context;
import com.forsale.app.utils.analytics.UserProperties;
import com.forsale.app.utils.analytics.k;
import com.moengage.core.Properties;
import com.moengage.core.analytics.MoEAnalyticsHelper;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
/* compiled from: MoEngageLogger.kt */
/* loaded from: classes3.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    private final Context f40534a;

    public s(Context appContext) {
        kotlin.jvm.internal.o.i(appContext, "appContext");
        this.f40534a = appContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void b(s sVar, String str, Map map, Map map2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            map = null;
        }
        if ((i11 & 4) != 0) {
            map2 = null;
        }
        sVar.a(str, map, map2);
    }

    public final void a(String eventName, Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
        kotlin.jvm.internal.o.i(eventName, "eventName");
        x10.a.e("MoEngage LOGGER Event Name:: " + eventName + " Properties:: " + map, new Object[0]);
        Properties properties = new Properties();
        k.a aVar = com.forsale.app.utils.analytics.k.f40026a;
        Map<String, Object> a11 = aVar.a(map, map2);
        if (a11 != null) {
            for (Map.Entry<String, Object> entry : aVar.c(a11).entrySet()) {
                properties.b(entry.getKey(), entry.getValue());
            }
        }
        MoEAnalyticsHelper.f49027a.u(this.f40534a, eventName, properties);
    }

    public final void c(List<? extends Pair<? extends UserProperties, ? extends Object>> properties) {
        kotlin.jvm.internal.o.i(properties, "properties");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it2 = properties.iterator();
        while (it2.hasNext()) {
            Pair pair = (Pair) it2.next();
            linkedHashMap.put(((UserProperties) pair.c()).getValue(), pair.d());
        }
        MoEAnalyticsHelper.f49027a.n(this.f40534a, linkedHashMap);
    }

    public final void d() {
        wr.b.f75267a.c(this.f40534a);
    }

    public final void e(String userId) {
        kotlin.jvm.internal.o.i(userId, "userId");
        MoEAnalyticsHelper.f49027a.j(this.f40534a, userId);
    }

    public final void f() {
        MoEAnalyticsHelper.f49027a.s(this.f40534a);
    }
}
