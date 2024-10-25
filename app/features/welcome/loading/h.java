package com.forsale.app.features.welcome.loading;

import com.forsale.app.datalayer.network.entities.SessionEntity;
import com.forsale.app.features.welcome.loading.LoadingViewModel;
import kotlin.jvm.internal.o;
/* compiled from: LoadingViewModel.kt */
/* loaded from: classes2.dex */
public final class h implements LoadingViewModel.c {

    /* renamed from: a  reason: collision with root package name */
    private final SessionEntity.AppStatus f37386a;

    public h(SessionEntity.AppStatus status) {
        o.i(status, "status");
        this.f37386a = status;
    }

    public final SessionEntity.AppStatus a() {
        return this.f37386a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof h) && this.f37386a == ((h) obj).f37386a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f37386a.hashCode();
    }

    public String toString() {
        SessionEntity.AppStatus appStatus = this.f37386a;
        return "SpecialAppStatus(status=" + appStatus + ")";
    }
}
