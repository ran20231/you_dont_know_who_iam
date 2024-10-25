package com.forsale.app.features.more.user.profile;
/* compiled from: ProfileEvents.kt */
/* loaded from: classes2.dex */
public final class u implements e0 {

    /* renamed from: a  reason: collision with root package name */
    private final String f33710a;

    public u(String url) {
        kotlin.jvm.internal.o.i(url, "url");
        this.f33710a = url;
    }

    public final String a() {
        return this.f33710a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof u) && kotlin.jvm.internal.o.d(this.f33710a, ((u) obj).f33710a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f33710a.hashCode();
    }

    public String toString() {
        String str = this.f33710a;
        return "Facebook(url=" + str + ")";
    }
}
