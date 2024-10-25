package com.forsale.app.utils.itemutils;

import android.os.Parcel;
import android.os.Parcelable;
import e2.h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: ComposeViewPadding.kt */
/* loaded from: classes3.dex */
public final class ComposeViewPadding implements Parcelable {
    public static final Parcelable.Creator<ComposeViewPadding> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    public static final int f40291e = 8;

    /* renamed from: a  reason: collision with root package name */
    private final float f40292a;

    /* renamed from: b  reason: collision with root package name */
    private final float f40293b;

    /* renamed from: c  reason: collision with root package name */
    private final float f40294c;

    /* renamed from: d  reason: collision with root package name */
    private final float f40295d;

    /* compiled from: ComposeViewPadding.kt */
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<ComposeViewPadding> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final ComposeViewPadding createFromParcel(Parcel parcel) {
            o.i(parcel, "parcel");
            return new ComposeViewPadding(((h) parcel.readValue(ComposeViewPadding.class.getClassLoader())).q(), ((h) parcel.readValue(ComposeViewPadding.class.getClassLoader())).q(), ((h) parcel.readValue(ComposeViewPadding.class.getClassLoader())).q(), ((h) parcel.readValue(ComposeViewPadding.class.getClassLoader())).q(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final ComposeViewPadding[] newArray(int i11) {
            return new ComposeViewPadding[i11];
        }
    }

    public /* synthetic */ ComposeViewPadding(float f11, float f12, float f13, float f14, DefaultConstructorMarker defaultConstructorMarker) {
        this(f11, f12, f13, f14);
    }

    public final float a() {
        return this.f40295d;
    }

    public final float b() {
        return this.f40294c;
    }

    public final float c() {
        return this.f40292a;
    }

    public final float d() {
        return this.f40293b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComposeViewPadding)) {
            return false;
        }
        ComposeViewPadding composeViewPadding = (ComposeViewPadding) obj;
        if (h.n(this.f40292a, composeViewPadding.f40292a) && h.n(this.f40293b, composeViewPadding.f40293b) && h.n(this.f40294c, composeViewPadding.f40294c) && h.n(this.f40295d, composeViewPadding.f40295d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((h.o(this.f40292a) * 31) + h.o(this.f40293b)) * 31) + h.o(this.f40294c)) * 31) + h.o(this.f40295d);
    }

    public String toString() {
        String p11 = h.p(this.f40292a);
        String p12 = h.p(this.f40293b);
        String p13 = h.p(this.f40294c);
        String p14 = h.p(this.f40295d);
        return "ComposeViewPadding(start=" + p11 + ", top=" + p12 + ", end=" + p13 + ", bottom=" + p14 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        o.i(out, "out");
        out.writeValue(h.f(this.f40292a));
        out.writeValue(h.f(this.f40293b));
        out.writeValue(h.f(this.f40294c));
        out.writeValue(h.f(this.f40295d));
    }

    private ComposeViewPadding(float f11, float f12, float f13, float f14) {
        this.f40292a = f11;
        this.f40293b = f12;
        this.f40294c = f13;
        this.f40295d = f14;
    }
}
