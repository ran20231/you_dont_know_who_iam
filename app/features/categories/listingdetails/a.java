package com.forsale.app.features.categories.listingdetails;
/* compiled from: DateDetails.kt */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final int f25440a;

    /* renamed from: b  reason: collision with root package name */
    private final int f25441b;

    /* renamed from: c  reason: collision with root package name */
    private final int f25442c;

    /* renamed from: d  reason: collision with root package name */
    private final int f25443d;

    /* renamed from: e  reason: collision with root package name */
    private final int f25444e;

    /* renamed from: f  reason: collision with root package name */
    private final int f25445f;

    public a(int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f25440a = i11;
        this.f25441b = i12;
        this.f25442c = i13;
        this.f25443d = i14;
        this.f25444e = i15;
        this.f25445f = i16;
    }

    public final int a() {
        return this.f25442c;
    }

    public final int b() {
        return this.f25443d;
    }

    public final int c() {
        return this.f25444e;
    }

    public final int d() {
        return this.f25440a;
    }

    public final int e() {
        return this.f25445f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f25440a == aVar.f25440a && this.f25441b == aVar.f25441b && this.f25442c == aVar.f25442c && this.f25443d == aVar.f25443d && this.f25444e == aVar.f25444e && this.f25445f == aVar.f25445f) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f25441b;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f25440a) * 31) + Integer.hashCode(this.f25441b)) * 31) + Integer.hashCode(this.f25442c)) * 31) + Integer.hashCode(this.f25443d)) * 31) + Integer.hashCode(this.f25444e)) * 31) + Integer.hashCode(this.f25445f);
    }

    public String toString() {
        int i11 = this.f25440a;
        int i12 = this.f25441b;
        int i13 = this.f25442c;
        int i14 = this.f25443d;
        int i15 = this.f25444e;
        int i16 = this.f25445f;
        return "DateDetails(diffMonths=" + i11 + ", diffWeeks=" + i12 + ", diffDays=" + i13 + ", diffHours=" + i14 + ", diffMinutes=" + i15 + ", diffSeconds=" + i16 + ")";
    }
}
