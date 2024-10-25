package com.forsale.designSystem.pagerindicator;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;
/* compiled from: PageControl.kt */
/* loaded from: classes3.dex */
public final class RangeChanged implements Parcelable {
    public static final Parcelable.Creator<RangeChanged> CREATOR = new a();

    /* renamed from: c  reason: collision with root package name */
    public static final int f42054c = 8;

    /* renamed from: a  reason: collision with root package name */
    private final int f42055a;

    /* renamed from: b  reason: collision with root package name */
    private final int f42056b;

    /* compiled from: PageControl.kt */
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<RangeChanged> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final RangeChanged createFromParcel(Parcel parcel) {
            o.i(parcel, "parcel");
            return new RangeChanged(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final RangeChanged[] newArray(int i11) {
            return new RangeChanged[i11];
        }
    }

    public RangeChanged(int i11, int i12) {
        this.f42055a = i11;
        this.f42056b = i12;
    }

    public final int a() {
        return this.f42056b;
    }

    public final int b() {
        return this.f42055a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RangeChanged)) {
            return false;
        }
        RangeChanged rangeChanged = (RangeChanged) obj;
        if (this.f42055a == rangeChanged.f42055a && this.f42056b == rangeChanged.f42056b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f42055a) * 31) + Integer.hashCode(this.f42056b);
    }

    public String toString() {
        return "RangeChanged(startIndex=" + this.f42055a + ", endIndex=" + this.f42056b + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        o.i(out, "out");
        out.writeInt(this.f42055a);
        out.writeInt(this.f42056b);
    }
}
