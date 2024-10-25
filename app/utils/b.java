package com.forsale.app.utils;
/* compiled from: ViewsExtensions.kt */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final String f40075a;

    /* renamed from: b  reason: collision with root package name */
    private final String f40076b;

    /* renamed from: c  reason: collision with root package name */
    private final Integer f40077c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f40078d;

    /* renamed from: e  reason: collision with root package name */
    private final g00.a<wz.p> f40079e;

    /* renamed from: f  reason: collision with root package name */
    private final g00.a<wz.p> f40080f;

    public b(String title, String message, Integer num, Integer num2, g00.a<wz.p> onPositiveClicked, g00.a<wz.p> onNegativeClicked) {
        kotlin.jvm.internal.o.i(title, "title");
        kotlin.jvm.internal.o.i(message, "message");
        kotlin.jvm.internal.o.i(onPositiveClicked, "onPositiveClicked");
        kotlin.jvm.internal.o.i(onNegativeClicked, "onNegativeClicked");
        this.f40075a = title;
        this.f40076b = message;
        this.f40077c = num;
        this.f40078d = num2;
        this.f40079e = onPositiveClicked;
        this.f40080f = onNegativeClicked;
    }

    public final String a() {
        return this.f40076b;
    }

    public final Integer b() {
        return this.f40078d;
    }

    public final g00.a<wz.p> c() {
        return this.f40080f;
    }

    public final g00.a<wz.p> d() {
        return this.f40079e;
    }

    public final Integer e() {
        return this.f40077c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (kotlin.jvm.internal.o.d(this.f40075a, bVar.f40075a) && kotlin.jvm.internal.o.d(this.f40076b, bVar.f40076b) && kotlin.jvm.internal.o.d(this.f40077c, bVar.f40077c) && kotlin.jvm.internal.o.d(this.f40078d, bVar.f40078d) && kotlin.jvm.internal.o.d(this.f40079e, bVar.f40079e) && kotlin.jvm.internal.o.d(this.f40080f, bVar.f40080f)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f40075a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.f40075a.hashCode() * 31) + this.f40076b.hashCode()) * 31;
        Integer num = this.f40077c;
        int i11 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i12 = (hashCode2 + hashCode) * 31;
        Integer num2 = this.f40078d;
        if (num2 != null) {
            i11 = num2.hashCode();
        }
        return ((((i12 + i11) * 31) + this.f40079e.hashCode()) * 31) + this.f40080f.hashCode();
    }

    public String toString() {
        String str = this.f40075a;
        String str2 = this.f40076b;
        Integer num = this.f40077c;
        Integer num2 = this.f40078d;
        g00.a<wz.p> aVar = this.f40079e;
        g00.a<wz.p> aVar2 = this.f40080f;
        return "AlertDialogParameters(title=" + str + ", message=" + str2 + ", positiveTextResId=" + num + ", negativeTextResId=" + num2 + ", onPositiveClicked=" + aVar + ", onNegativeClicked=" + aVar2 + ")";
    }
}
