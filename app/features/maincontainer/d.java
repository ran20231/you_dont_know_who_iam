package com.forsale.app.features.maincontainer;

import c4.d;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.o;
/* compiled from: AppBarConfiguration.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements d.b, k {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ g00.a f31564a;

    public d(g00.a function) {
        o.i(function, "function");
        this.f31564a = function;
    }

    @Override // c4.d.b
    public final /* synthetic */ boolean a() {
        return ((Boolean) this.f31564a.invoke()).booleanValue();
    }

    @Override // kotlin.jvm.internal.k
    public final wz.e<?> c() {
        return this.f31564a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d.b) || !(obj instanceof k)) {
            return false;
        }
        return o.d(c(), ((k) obj).c());
    }

    public final int hashCode() {
        return c().hashCode();
    }
}
