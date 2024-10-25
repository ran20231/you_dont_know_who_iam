package com.forsale.app.utils.observers;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.d0;
import com.forsale.app.datalayer.repositories.InAppRepository;
import com.forsale.app.utils.observers.a;
import kotlin.jvm.internal.o;
/* compiled from: InAppObserver.kt */
/* loaded from: classes3.dex */
public final class InAppObserver implements a {

    /* renamed from: a  reason: collision with root package name */
    private final InAppRepository f40380a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f40381b;

    public InAppObserver(InAppRepository inAppRepository) {
        o.i(inAppRepository, "inAppRepository");
        this.f40380a = inAppRepository;
        this.f40381b = true;
    }

    @Override // com.forsale.app.utils.observers.a
    public boolean isEnabled() {
        return this.f40381b;
    }

    @d0(Lifecycle.Event.ON_STOP)
    public final void onMoveToBackground() {
        this.f40380a.saveInAppMessageConsumed(0);
    }

    @d0(Lifecycle.Event.ON_START)
    public final void onMoveToForeground() {
        this.f40380a.getInAppMessages();
    }

    @Override // com.forsale.app.utils.observers.a
    public void q() {
        a.C0459a.a(this);
    }
}
