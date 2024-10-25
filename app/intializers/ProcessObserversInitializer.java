package com.forsale.app.intializers;

import android.content.Context;
import com.forsale.app.features.expiresoon.ExpireSoonProcessObserver;
import com.forsale.app.utils.analytics.AWSEventsLogger;
import com.forsale.app.utils.analytics.LeanPlumLogger;
import com.forsale.app.utils.observers.AdServerObserver;
import com.forsale.app.utils.observers.InAppObserver;
import com.forsale.app.utils.observers.UserActivityObserver;
import com.google.firebase.perf.metrics.Trace;
import cp.e;
import java.util.List;
import kotlin.collections.q;
import kotlin.collections.r;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: ProcessObserversInitializer.kt */
/* loaded from: classes2.dex */
public final class ProcessObserversInitializer implements o4.a<p> {

    /* renamed from: a  reason: collision with root package name */
    public InAppObserver f37564a;

    /* renamed from: b  reason: collision with root package name */
    public UserActivityObserver f37565b;

    /* renamed from: c  reason: collision with root package name */
    public ExpireSoonProcessObserver f37566c;

    /* renamed from: d  reason: collision with root package name */
    public AdServerObserver f37567d;

    /* renamed from: e  reason: collision with root package name */
    public AWSEventsLogger f37568e;

    /* renamed from: f  reason: collision with root package name */
    public LeanPlumLogger f37569f;

    @Override // o4.a
    public List<Class<? extends o4.a<?>>> a() {
        List<Class<? extends o4.a<?>>> e11;
        e11 = q.e(DependencyGraphInitializer.class);
        return e11;
    }

    @Override // o4.a
    public /* bridge */ /* synthetic */ p b(Context context) {
        c(context);
        return p.f75480a;
    }

    public void c(Context context) {
        List<com.forsale.app.utils.observers.a> q11;
        Trace e11 = e.e("appStart_initializer_processObservers");
        o.i(context, "context");
        a.f37573b.a(context).l(this);
        q11 = r.q(g(), i(), f(), h(), e(), d());
        for (com.forsale.app.utils.observers.a aVar : q11) {
            aVar.q();
        }
        e11.stop();
    }

    public final AdServerObserver d() {
        AdServerObserver adServerObserver = this.f37567d;
        if (adServerObserver != null) {
            return adServerObserver;
        }
        o.w("adServerObserver");
        return null;
    }

    public final AWSEventsLogger e() {
        AWSEventsLogger aWSEventsLogger = this.f37568e;
        if (aWSEventsLogger != null) {
            return aWSEventsLogger;
        }
        o.w("awsEventLogger");
        return null;
    }

    public final ExpireSoonProcessObserver f() {
        ExpireSoonProcessObserver expireSoonProcessObserver = this.f37566c;
        if (expireSoonProcessObserver != null) {
            return expireSoonProcessObserver;
        }
        o.w("expireSoonProcessObserver");
        return null;
    }

    public final InAppObserver g() {
        InAppObserver inAppObserver = this.f37564a;
        if (inAppObserver != null) {
            return inAppObserver;
        }
        o.w("inAppObserver");
        return null;
    }

    public final LeanPlumLogger h() {
        LeanPlumLogger leanPlumLogger = this.f37569f;
        if (leanPlumLogger != null) {
            return leanPlumLogger;
        }
        o.w("leanPlumLogger");
        return null;
    }

    public final UserActivityObserver i() {
        UserActivityObserver userActivityObserver = this.f37565b;
        if (userActivityObserver != null) {
            return userActivityObserver;
        }
        o.w("userActivityObserver");
        return null;
    }
}
