package com.forsale.app.intializers;

import android.content.Context;
import java.util.List;
import kotlin.collections.q;
import kotlin.jvm.internal.o;
import pf.d;
import wz.p;
/* compiled from: TimberInitializer.kt */
/* loaded from: classes2.dex */
public final class TimberInitializer implements o4.a<p> {

    /* renamed from: a  reason: collision with root package name */
    public d f37570a;

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
        o.i(context, "context");
        a.f37573b.a(context).n(this);
        x10.a.f(d());
    }

    public final d d() {
        d dVar = this.f37570a;
        if (dVar != null) {
            return dVar;
        }
        o.w("forSaleTimberDebugTree");
        return null;
    }
}
