package com.forsale.app.utils.analytics;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.d0;
import com.forsale.app.App;
import com.forsale.app.utils.analytics.k;
import com.forsale.app.utils.observers.a;
import com.leanplum.Leanplum;
import com.leanplum.callbacks.VariablesChangedCallback;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import t9.y0;
/* compiled from: LeanPlumLogger.kt */
/* loaded from: classes3.dex */
public final class LeanPlumLogger implements com.forsale.app.utils.observers.a, CoroutineScope {

    /* renamed from: a  reason: collision with root package name */
    private final App f40000a;

    /* renamed from: b  reason: collision with root package name */
    private final jj.b f40001b;

    /* renamed from: c  reason: collision with root package name */
    private final sf.a f40002c;

    /* renamed from: d  reason: collision with root package name */
    private final CoroutineContext f40003d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f40004e;

    /* compiled from: LeanPlumLogger.kt */
    /* loaded from: classes3.dex */
    public static final class a extends VariablesChangedCallback {
        a() {
        }

        @Override // com.leanplum.callbacks.VariablesChangedCallback
        public void variablesChanged() {
            Leanplum.track("Launch");
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.coroutines.a implements CoroutineExceptionHandler {
        public b(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            x10.a.b(th2.getMessage(), new Object[0]);
        }
    }

    public LeanPlumLogger(App app, jj.b preferenceUtils, sf.a inAppMessageTemplates) {
        o.i(app, "app");
        o.i(preferenceUtils, "preferenceUtils");
        o.i(inAppMessageTemplates, "inAppMessageTemplates");
        this.f40000a = app;
        this.f40001b = preferenceUtils;
        this.f40002c = inAppMessageTemplates;
        this.f40003d = new b(CoroutineExceptionHandler.Key);
        this.f40004e = o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void h(LeanPlumLogger leanPlumLogger, String str, Map map, Map map2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            map = null;
        }
        if ((i11 & 4) != 0) {
            map2 = null;
        }
        leanPlumLogger.g(str, map, map2);
    }

    private final boolean o() {
        Object runBlocking$default;
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new LeanPlumLogger$isLeanplumAnalyticsEnabled$1(this, null), 1, null);
        return ((Boolean) runBlocking$default).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w() {
        Leanplum.setAppIdForProductionMode(this.f40000a.getString(y0.M5), this.f40000a.getString(y0.N5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y() {
        Leanplum.addVariablesChangedHandler(new a());
    }

    public final void g(String eventName, Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
        Map<String, Object> map3;
        o.i(eventName, "eventName");
        if (!isEnabled()) {
            return;
        }
        x10.a.e("LEANPLUM LOGGER Event Name:: " + eventName + " Properties:: " + map, new Object[0]);
        k.a aVar = k.f40026a;
        Map<String, Object> a11 = aVar.a(map, map2);
        if (a11 != null) {
            map3 = aVar.c(a11);
        } else {
            map3 = null;
        }
        Leanplum.track(eventName, map3);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f40003d;
    }

    @Override // com.forsale.app.utils.observers.a
    public boolean isEnabled() {
        return this.f40004e;
    }

    public final void j(List<? extends Pair<? extends UserProperties, ? extends Object>> properties) {
        o.i(properties, "properties");
        if (!isEnabled()) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it2 = properties.iterator();
        while (it2.hasNext()) {
            Pair pair = (Pair) it2.next();
            linkedHashMap.put(((UserProperties) pair.c()).getValue(), pair.d());
        }
        Leanplum.setUserAttributes(linkedHashMap);
    }

    public final void k() {
        Leanplum.forceContentUpdate();
    }

    public final App l() {
        return this.f40000a;
    }

    public final void m() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new LeanPlumLogger$initialize$1(this, null), 3, null);
    }

    @d0(Lifecycle.Event.ON_STOP)
    public final void onMoveToBackground() {
        k();
    }

    public final void p() {
        Leanplum.setUserId(null);
    }

    @Override // com.forsale.app.utils.observers.a
    public void q() {
        a.C0459a.a(this);
    }

    public final void r(String userId) {
        o.i(userId, "userId");
        Leanplum.setUserId(userId);
    }

    public void v(boolean z11) {
        this.f40004e = z11;
    }
}
