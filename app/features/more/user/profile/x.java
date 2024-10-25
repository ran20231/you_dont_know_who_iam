package com.forsale.app.features.more.user.profile;
/* compiled from: ProfileEvents.kt */
/* loaded from: classes2.dex */
public final class x implements e0 {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f33713a;

    public x(boolean z11) {
        this.f33713a = z11;
    }

    public final boolean a() {
        return this.f33713a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof x) && this.f33713a == ((x) obj).f33713a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        boolean z11 = this.f33713a;
        if (z11) {
            return 1;
        }
        return z11 ? 1 : 0;
    }

    public String toString() {
        boolean z11 = this.f33713a;
        return "Chat(requireUpdate=" + z11 + ")";
    }
}
