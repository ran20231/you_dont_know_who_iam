package com.forsale.app.features.more.user.profile;
/* compiled from: ProfileEvents.kt */
/* loaded from: classes2.dex */
public final class v implements e0 {

    /* renamed from: a  reason: collision with root package name */
    private final String f33711a;

    public v(String url) {
        kotlin.jvm.internal.o.i(url, "url");
        this.f33711a = url;
    }

    public final String a() {
        return this.f33711a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof v) && kotlin.jvm.internal.o.d(this.f33711a, ((v) obj).f33711a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f33711a.hashCode();
    }

    public String toString() {
        String str = this.f33711a;
        return "Instagram(url=" + str + ")";
    }
}
