package com.forsale.app.utils.analytics;

import android.app.Application;
import android.content.Context;
import com.forsale.app.utils.observers.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONObject;
import t9.y0;
/* compiled from: AmplitudeLogger.kt */
/* loaded from: classes3.dex */
public final class AmplitudeLogger implements com.forsale.app.utils.observers.a, CoroutineScope {

    /* renamed from: a  reason: collision with root package name */
    private final Context f39961a;

    /* renamed from: b  reason: collision with root package name */
    private final jj.b f39962b;

    /* renamed from: c  reason: collision with root package name */
    private final CoroutineContext f39963c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f39964d;

    /* renamed from: e  reason: collision with root package name */
    private final List<String> f39965e;

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.coroutines.a implements CoroutineExceptionHandler {
        public a(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            x10.a.b(th2.getMessage(), new Object[0]);
        }
    }

    public AmplitudeLogger(Context app, jj.b pref) {
        boolean z11;
        o.i(app, "app");
        o.i(pref, "pref");
        this.f39961a = app;
        this.f39962b = pref;
        this.f39963c = new a(CoroutineExceptionHandler.Key);
        this.f39964d = p();
        this.f39965e = new ArrayList();
        String j11 = j();
        if (j11.length() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        j11 = z11 ? j11 : null;
        if (j11 != null) {
            o(j11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void d(AmplitudeLogger amplitudeLogger, String str, Map map, Map map2, EventGroups eventGroups, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            map = null;
        }
        if ((i11 & 4) != 0) {
            map2 = null;
        }
        if ((i11 & 8) != 0) {
            eventGroups = null;
        }
        amplitudeLogger.b(str, map, map2, eventGroups);
    }

    private final void g() {
        s6.c h11 = h();
        if (h11 != null) {
            h11.n();
        }
    }

    private final s6.c h() {
        boolean z11;
        String j11 = j();
        if (j11.length() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            j11 = null;
        }
        if (j11 == null) {
            return null;
        }
        s6.c z12 = s6.a.a().z(this.f39961a.getApplicationContext(), this.f39961a.getString(y0.F));
        Context context = this.f39961a;
        o.g(context, "null cannot be cast to non-null type android.app.Application");
        z12.p((Application) context);
        z12.h0(true);
        z12.a0(2);
        z12.V(j11);
        z12.W(20000);
        return z12;
    }

    private final String j() {
        Object runBlocking$default;
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new AmplitudeLogger$getDeviceId$1(this, null), 1, null);
        return (String) runBlocking$default;
    }

    private final void o(String str) {
        s6.c h11 = h();
        if (h11 != null) {
            h11.V(str);
        }
    }

    private final boolean p() {
        Object runBlocking$default;
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new AmplitudeLogger$isAmplitudeAnalyticsEnabled$1(this, null), 1, null);
        return ((Boolean) runBlocking$default).booleanValue();
    }

    private final void y(Integer num) {
        s6.c h11;
        String str;
        if (isEnabled() && (h11 = h()) != null) {
            if (num != null) {
                str = num.toString();
            } else {
                str = null;
            }
            h11.d0(str);
        }
    }

    public final void b(String eventName, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, EventGroups eventGroups) {
        String str;
        String str2;
        Set<String> set;
        Collection<? extends Object> collection;
        o.i(eventName, "eventName");
        if (!isEnabled() || this.f39965e.contains(eventName)) {
            return;
        }
        JSONObject jSONObject = null;
        if (map != null) {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                String key = entry.getKey();
                arrayList.add(" " + ((Object) key) + ": " + entry.getValue());
            }
            str = CollectionsKt___CollectionsKt.t0(arrayList, " \n ", null, null, 0, null, null, 62, null);
        } else {
            str = null;
        }
        String str3 = "************* Attributes ************* \n " + str;
        if (map2 != null) {
            ArrayList arrayList2 = new ArrayList(map2.size());
            for (Map.Entry<String, ? extends Object> entry2 : map2.entrySet()) {
                String key2 = entry2.getKey();
                arrayList2.add(" " + ((Object) key2) + ": " + entry2.getValue());
            }
            str2 = CollectionsKt___CollectionsKt.t0(arrayList2, " \n ", null, null, 0, null, null, 62, null);
        } else {
            str2 = null;
        }
        String str4 = " ****************************** Event : " + eventName + " ******************************  ";
        x10.a.b(str4 + " \n " + str3 + " \n " + ("************* Metrics ************* \n " + str2), new Object[0]);
        if (map2 != null) {
            set = map2.keySet();
        } else {
            set = null;
        }
        if (map2 != null) {
            collection = map2.values();
        } else {
            collection = null;
        }
        x10.a.b("Amplitude addEvent Metrics " + set + ": " + collection, new Object[0]);
        if (eventGroups != null) {
            jSONObject = new JSONObject().put("Event Group", eventGroups.getValue());
        }
        s6.c h11 = h();
        if (h11 != null) {
            h11.F(eventName, new JSONObject(k.f40026a.a(map, map2)), jSONObject);
        }
    }

    public final void f(List<? extends Pair<? extends UserProperties, ? extends Object>> properties) {
        o.i(properties, "properties");
        if (!isEnabled()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        Iterator<T> it2 = properties.iterator();
        while (it2.hasNext()) {
            Pair pair = (Pair) it2.next();
            jSONObject.put(((UserProperties) pair.c()).getValue(), pair.d());
        }
        s6.c h11 = h();
        if (h11 != null) {
            h11.e0(jSONObject);
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f39963c;
    }

    @Override // com.forsale.app.utils.observers.a
    public boolean isEnabled() {
        return this.f39964d;
    }

    public final List<String> k() {
        return this.f39965e;
    }

    public final String l() {
        s6.c h11 = h();
        if (h11 != null) {
            return h11.v();
        }
        return null;
    }

    public final void m() {
        o(j());
    }

    @Override // com.forsale.app.utils.observers.a
    public void q() {
        a.C0459a.a(this);
    }

    public final void r(int i11) {
        y(Integer.valueOf(i11));
    }

    public final void v() {
        y(null);
        g();
    }

    public void w(boolean z11) {
        this.f39964d = z11;
    }
}
