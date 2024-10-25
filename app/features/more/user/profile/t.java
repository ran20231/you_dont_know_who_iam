package com.forsale.app.features.more.user.profile;

import com.forsale.app.datalayer.network.entities.qrsessions.ForSaleWebSession;
import java.util.List;
/* compiled from: ProfileEvents.kt */
/* loaded from: classes2.dex */
public final class t implements e0 {

    /* renamed from: a  reason: collision with root package name */
    private final List<ForSaleWebSession> f33709a;

    public t(List<ForSaleWebSession> sessions) {
        kotlin.jvm.internal.o.i(sessions, "sessions");
        this.f33709a = sessions;
    }

    public final List<ForSaleWebSession> a() {
        return this.f33709a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof t) && kotlin.jvm.internal.o.d(this.f33709a, ((t) obj).f33709a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f33709a.hashCode();
    }

    public String toString() {
        List<ForSaleWebSession> list = this.f33709a;
        return "WebSessions(sessions=" + list + ")";
    }
}
