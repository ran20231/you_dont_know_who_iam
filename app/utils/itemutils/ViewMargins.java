package com.forsale.app.utils.itemutils;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: ViewMargins.kt */
/* loaded from: classes3.dex */
public final class ViewMargins implements Parcelable {
    public static final Parcelable.Creator<ViewMargins> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    public static final int f40312e = 8;

    /* renamed from: a  reason: collision with root package name */
    private Integer f40313a;

    /* renamed from: b  reason: collision with root package name */
    private Integer f40314b;

    /* renamed from: c  reason: collision with root package name */
    private Integer f40315c;

    /* renamed from: d  reason: collision with root package name */
    private Integer f40316d;

    /* compiled from: ViewMargins.kt */
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<ViewMargins> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final ViewMargins createFromParcel(Parcel parcel) {
            Integer valueOf;
            Integer valueOf2;
            Integer valueOf3;
            o.i(parcel, "parcel");
            Integer num = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            return new ViewMargins(valueOf, valueOf2, valueOf3, num);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final ViewMargins[] newArray(int i11) {
            return new ViewMargins[i11];
        }
    }

    public ViewMargins() {
        this(null, null, null, null, 15, null);
    }

    public final Integer a() {
        return this.f40316d;
    }

    public final Integer b() {
        return this.f40314b;
    }

    public final Integer c() {
        return this.f40313a;
    }

    public final Integer d() {
        return this.f40315c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewMargins)) {
            return false;
        }
        ViewMargins viewMargins = (ViewMargins) obj;
        if (o.d(this.f40313a, viewMargins.f40313a) && o.d(this.f40314b, viewMargins.f40314b) && o.d(this.f40315c, viewMargins.f40315c) && o.d(this.f40316d, viewMargins.f40316d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        Integer num = this.f40313a;
        int i11 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i12 = hashCode * 31;
        Integer num2 = this.f40314b;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        Integer num3 = this.f40315c;
        if (num3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num3.hashCode();
        }
        int i14 = (i13 + hashCode3) * 31;
        Integer num4 = this.f40316d;
        if (num4 != null) {
            i11 = num4.hashCode();
        }
        return i14 + i11;
    }

    public String toString() {
        Integer num = this.f40313a;
        Integer num2 = this.f40314b;
        Integer num3 = this.f40315c;
        Integer num4 = this.f40316d;
        return "ViewMargins(startMargin=" + num + ", endMargin=" + num2 + ", topMargin=" + num3 + ", bottomMargin=" + num4 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        o.i(out, "out");
        Integer num = this.f40313a;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        Integer num2 = this.f40314b;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num2.intValue());
        }
        Integer num3 = this.f40315c;
        if (num3 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num3.intValue());
        }
        Integer num4 = this.f40316d;
        if (num4 == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(num4.intValue());
    }

    public ViewMargins(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f40313a = num;
        this.f40314b = num2;
        this.f40315c = num3;
        this.f40316d = num4;
    }

    public /* synthetic */ ViewMargins(Integer num, Integer num2, Integer num3, Integer num4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : num2, (i11 & 4) != 0 ? null : num3, (i11 & 8) != 0 ? null : num4);
    }
}
