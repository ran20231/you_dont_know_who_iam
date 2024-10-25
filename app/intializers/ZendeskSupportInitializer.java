package com.forsale.app.intializers;

import android.content.Context;
import com.forsale.app.utils.facades.ZendeskSupport;
import com.google.firebase.perf.metrics.Trace;
import cp.e;
import java.util.List;
import kotlin.collections.q;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: ZendeskSupportInitializer.kt */
/* loaded from: classes2.dex */
public final class ZendeskSupportInitializer implements o4.a<p> {

    /* renamed from: a  reason: collision with root package name */
    public ZendeskSupport f37572a;

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
        Trace e11 = e.e("appStart_initializer_zendeskSupport");
        o.i(context, "context");
        a.f37573b.a(context).s(this);
        d().k();
        e11.stop();
    }

    public final ZendeskSupport d() {
        ZendeskSupport zendeskSupport = this.f37572a;
        if (zendeskSupport != null) {
            return zendeskSupport;
        }
        o.w("zendeskSupport");
        return null;
    }
}
