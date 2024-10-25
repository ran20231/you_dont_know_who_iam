package com.forsale.app.utils.analytics;

import kotlin.jvm.internal.o;
/* compiled from: AnalyticsCampaign.kt */
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final String f40018a;

    /* renamed from: b  reason: collision with root package name */
    private final String f40019b;

    public h(String str, String str2) {
        this.f40018a = str;
        this.f40019b = str2;
    }

    public final String a() {
        return this.f40019b;
    }

    public final String b() {
        return this.f40018a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (o.d(this.f40018a, hVar.f40018a) && o.d(this.f40019b, hVar.f40019b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        String str = this.f40018a;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = hashCode * 31;
        String str2 = this.f40019b;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    public String toString() {
        String str = this.f40018a;
        String str2 = this.f40019b;
        return "AnalyticsCampaign(source=" + str + ", id=" + str2 + ")";
    }
}
