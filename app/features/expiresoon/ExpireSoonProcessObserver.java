package com.forsale.app.features.expiresoon;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.d0;
import androidx.work.ExistingWorkPolicy;
import androidx.work.d;
import androidx.work.k;
import androidx.work.q;
import com.forsale.app.datalayer.repositories.ExpireSoonRepository;
import com.forsale.app.utils.observers.a;
import com.forsale.app.workmangers.ExpireSoonViewedWorker;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.o;
/* compiled from: ExpireSoonProcessObserver.kt */
/* loaded from: classes2.dex */
public final class ExpireSoonProcessObserver implements com.forsale.app.utils.observers.a {

    /* renamed from: a  reason: collision with root package name */
    private final q f31293a;

    /* renamed from: b  reason: collision with root package name */
    private final ExpireSoonRepository f31294b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f31295c;

    public ExpireSoonProcessObserver(q worker, ExpireSoonRepository expireSoonRep) {
        o.i(worker, "worker");
        o.i(expireSoonRep, "expireSoonRep");
        this.f31293a = worker;
        this.f31294b = expireSoonRep;
        this.f31295c = true;
    }

    @d0(Lifecycle.Event.ON_STOP)
    private final void onAppProcessStop() {
        int[] W0;
        boolean z11;
        d a11;
        k b11;
        W0 = CollectionsKt___CollectionsKt.W0(this.f31294b.getViewedAdsIds());
        if (W0.length == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!(!z11)) {
            W0 = null;
        }
        if (W0 != null && (a11 = new d.a().g("viewed_expire_ids_key", W0).a()) != null && (b11 = new k.a(ExpireSoonViewedWorker.class).h(a11).b()) != null) {
            this.f31293a.f(ExpireSoonViewedWorker.class.getName(), ExistingWorkPolicy.REPLACE, b11);
        }
    }

    @Override // com.forsale.app.utils.observers.a
    public boolean isEnabled() {
        return this.f31295c;
    }

    @Override // com.forsale.app.utils.observers.a
    public void q() {
        a.C0459a.a(this);
    }
}
