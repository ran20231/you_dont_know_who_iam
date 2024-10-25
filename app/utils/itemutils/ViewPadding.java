package com.forsale.app.utils.itemutils;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: ViewPadding.kt */
/* loaded from: classes3.dex */
public final class ViewPadding implements Parcelable {
    public static final Parcelable.Creator<ViewPadding> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    public static final int f40317e = 8;

    /* renamed from: a  reason: collision with root package name */
    private final Integer f40318a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f40319b;

    /* renamed from: c  reason: collision with root package name */
    private final Integer f40320c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f40321d;

    /* compiled from: ViewPadding.kt */
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<ViewPadding> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final ViewPadding createFromParcel(Parcel parcel) {
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
            return new ViewPadding(valueOf, valueOf2, valueOf3, num);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final ViewPadding[] newArray(int i11) {
            return new ViewPadding[i11];
        }
    }

    public ViewPadding() {
        this(null, null, null, null, 15, null);
    }

    public final Integer a() {
        return this.f40321d;
    }

    public final Integer b() {
        return this.f40319b;
    }

    public final Integer c() {
        return this.f40318a;
    }

    public final Integer d() {
        return this.f40320c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewPadding)) {
            return false;
        }
        ViewPadding viewPadding = (ViewPadding) obj;
        if (o.d(this.f40318a, viewPadding.f40318a) && o.d(this.f40319b, viewPadding.f40319b) && o.d(this.f40320c, viewPadding.f40320c) && o.d(this.f40321d, viewPadding.f40321d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        Integer num = this.f40318a;
        int i11 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i12 = hashCode * 31;
        Integer num2 = this.f40319b;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        Integer num3 = this.f40320c;
        if (num3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num3.hashCode();
        }
        int i14 = (i13 + hashCode3) * 31;
        Integer num4 = this.f40321d;
        if (num4 != null) {
            i11 = num4.hashCode();
        }
        return i14 + i11;
    }

    public String toString() {
        Integer num = this.f40318a;
        Integer num2 = this.f40319b;
        Integer num3 = this.f40320c;
        Integer num4 = this.f40321d;
        return "ViewPadding(startPadding=" + num + ", endPadding=" + num2 + ", topPadding=" + num3 + ", bottomPadding=" + num4 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        o.i(out, "out");
        Integer num = this.f40318a;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        Integer num2 = this.f40319b;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num2.intValue());
        }
        Integer num3 = this.f40320c;
        if (num3 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num3.intValue());
        }
        Integer num4 = this.f40321d;
        if (num4 == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(num4.intValue());
    }

    public ViewPadding(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f40318a = num;
        this.f40319b = num2;
        this.f40320c = num3;
        this.f40321d = num4;
    }

    public /* synthetic */ ViewPadding(Integer num, Integer num2, Integer num3, Integer num4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : num2, (i11 & 4) != 0 ? null : num3, (i11 & 8) != 0 ? null : num4);
    }
}
