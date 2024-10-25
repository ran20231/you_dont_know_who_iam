package com.forsale.app.utils.observers;

import androidx.lifecycle.h0;
import androidx.lifecycle.r;
/* compiled from: ApplicationLifeCycleObserver.kt */
/* loaded from: classes3.dex */
public interface a extends r {

    /* compiled from: ApplicationLifeCycleObserver.kt */
    /* renamed from: com.forsale.app.utils.observers.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0459a {
        public static void a(a aVar) {
            if (aVar.isEnabled()) {
                h0.f12830i.a().getLifecycle().a(aVar);
            }
        }
    }

    boolean isEnabled();

    void q();
}
