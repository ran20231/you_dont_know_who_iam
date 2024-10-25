package com.forsale.designSystem;

import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: ClickableSingle.kt */
/* loaded from: classes3.dex */
final class b implements a {

    /* renamed from: b  reason: collision with root package name */
    private long f40766b;

    private final long b() {
        return System.currentTimeMillis();
    }

    @Override // com.forsale.designSystem.a
    public void a(g00.a<p> event) {
        o.i(event, "event");
        if (b() - this.f40766b >= 300) {
            event.invoke();
        }
        this.f40766b = b();
    }
}
