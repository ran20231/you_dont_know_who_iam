package com.forsale.app.features.more.user.profile;
/* compiled from: ProfileEvents.kt */
/* loaded from: classes2.dex */
public final class w implements e0 {

    /* renamed from: a  reason: collision with root package name */
    private final String f33712a;

    public w(String url) {
        kotlin.jvm.internal.o.i(url, "url");
        this.f33712a = url;
    }

    public final String a() {
        return this.f33712a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof w) && kotlin.jvm.internal.o.d(this.f33712a, ((w) obj).f33712a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f33712a.hashCode();
    }

    public String toString() {
        String str = this.f33712a;
        return "Twitter(url=" + str + ")";
    }
}
