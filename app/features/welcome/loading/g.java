package com.forsale.app.features.welcome.loading;

import com.forsale.app.datalayer.network.entities.SessionEntity;
import com.forsale.app.features.welcome.loading.LoadingViewModel;
import kotlin.jvm.internal.o;
/* compiled from: LoadingViewModel.kt */
/* loaded from: classes2.dex */
public final class g implements LoadingViewModel.c {

    /* renamed from: a  reason: collision with root package name */
    private final SessionEntity f37385a;

    public g(SessionEntity sessionEntity) {
        o.i(sessionEntity, "sessionEntity");
        this.f37385a = sessionEntity;
    }

    public final SessionEntity a() {
        return this.f37385a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof g) && o.d(this.f37385a, ((g) obj).f37385a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f37385a.hashCode();
    }

    public String toString() {
        SessionEntity sessionEntity = this.f37385a;
        return "NoSpecialAppStatus(sessionEntity=" + sessionEntity + ")";
    }
}
