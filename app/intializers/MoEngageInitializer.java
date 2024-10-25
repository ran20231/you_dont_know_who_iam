package com.forsale.app.intializers;

import android.app.Application;
import android.content.Context;
import com.google.firebase.perf.metrics.Trace;
import com.moengage.core.MoEngage;
import cp.e;
import dj.i;
import java.util.List;
import kotlin.collections.q;
import kotlin.jvm.internal.o;
import pf.f;
import wz.p;
/* compiled from: MoEngageInitializer.kt */
/* loaded from: classes2.dex */
public final class MoEngageInitializer implements o4.a<p> {

    /* renamed from: a  reason: collision with root package name */
    public MoEngage f37559a;

    /* renamed from: b  reason: collision with root package name */
    public f f37560b;

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
        Application application;
        Trace e11 = e.e("appStart_initializer_MoEngage");
        o.i(context, "context");
        a.f37573b.a(context).b(this);
        MoEngage.f49009b.b(d());
        p pVar = null;
        if (context instanceof Application) {
            application = (Application) context;
        } else {
            application = null;
        }
        if (application != null) {
            application.registerActivityLifecycleCallbacks(e());
            pVar = p.f75480a;
        }
        if (pVar == null) {
            i.f54287a.invoke().f(new IllegalArgumentException("Context must be an Application context"));
        }
        e11.stop();
    }

    public final MoEngage d() {
        MoEngage moEngage = this.f37559a;
        if (moEngage != null) {
            return moEngage;
        }
        o.w("moEngage");
        return null;
    }

    public final f e() {
        f fVar = this.f37560b;
        if (fVar != null) {
            return fVar;
        }
        o.w("moEngageActivityCallbacks");
        return null;
    }
}
