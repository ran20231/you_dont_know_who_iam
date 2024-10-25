package com.forsale.designSystem.layouts;

import androidx.compose.ui.text.a0;
import b1.t1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: Cards.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final int f41890a;

    /* renamed from: b  reason: collision with root package name */
    private final int f41891b;

    /* renamed from: c  reason: collision with root package name */
    private final a0 f41892c;

    /* renamed from: d  reason: collision with root package name */
    private final a0 f41893d;

    /* renamed from: e  reason: collision with root package name */
    private final long f41894e;

    public /* synthetic */ a(int i11, int i12, a0 a0Var, a0 a0Var2, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, i12, a0Var, a0Var2, j11);
    }

    public final long a() {
        return this.f41894e;
    }

    public final a0 b() {
        return this.f41893d;
    }

    public final int c() {
        return this.f41891b;
    }

    public final int d() {
        return this.f41890a;
    }

    public final a0 e() {
        return this.f41892c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f41890a == aVar.f41890a && this.f41891b == aVar.f41891b && o.d(this.f41892c, aVar.f41892c) && o.d(this.f41893d, aVar.f41893d) && t1.q(this.f41894e, aVar.f41894e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.f41890a) * 31) + Integer.hashCode(this.f41891b)) * 31) + this.f41892c.hashCode()) * 31) + this.f41893d.hashCode()) * 31) + t1.w(this.f41894e);
    }

    public String toString() {
        return "CardSimpleData(maxTitleLines=" + this.f41890a + ", maxDescriptionLines=" + this.f41891b + ", titleTypography=" + this.f41892c + ", descriptionTypography=" + this.f41893d + ", descriptionColor=" + ((Object) t1.x(this.f41894e)) + ')';
    }

    private a(int i11, int i12, a0 titleTypography, a0 descriptionTypography, long j11) {
        o.i(titleTypography, "titleTypography");
        o.i(descriptionTypography, "descriptionTypography");
        this.f41890a = i11;
        this.f41891b = i12;
        this.f41892c = titleTypography;
        this.f41893d = descriptionTypography;
        this.f41894e = j11;
    }
}
