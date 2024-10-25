package com.forsale.app.features.categories.listingdetails;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;
/* compiled from: HomeAnalyticsPayload.kt */
/* loaded from: classes2.dex */
public final class HomeAnalyticsPayload implements Parcelable {
    public static final Parcelable.Creator<HomeAnalyticsPayload> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    public static final int f25092e = 8;

    /* renamed from: a  reason: collision with root package name */
    private final Integer f25093a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f25094b;

    /* renamed from: c  reason: collision with root package name */
    private final Integer f25095c;

    /* renamed from: d  reason: collision with root package name */
    private final String f25096d;

    /* compiled from: HomeAnalyticsPayload.kt */
    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<HomeAnalyticsPayload> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final HomeAnalyticsPayload createFromParcel(Parcel parcel) {
            Integer valueOf;
            Integer valueOf2;
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
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            return new HomeAnalyticsPayload(valueOf, valueOf2, num, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final HomeAnalyticsPayload[] newArray(int i11) {
            return new HomeAnalyticsPayload[i11];
        }
    }

    public HomeAnalyticsPayload(Integer num, Integer num2, Integer num3, String str) {
        this.f25093a = num;
        this.f25094b = num2;
        this.f25095c = num3;
        this.f25096d = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeAnalyticsPayload)) {
            return false;
        }
        HomeAnalyticsPayload homeAnalyticsPayload = (HomeAnalyticsPayload) obj;
        if (o.d(this.f25093a, homeAnalyticsPayload.f25093a) && o.d(this.f25094b, homeAnalyticsPayload.f25094b) && o.d(this.f25095c, homeAnalyticsPayload.f25095c) && o.d(this.f25096d, homeAnalyticsPayload.f25096d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        Integer num = this.f25093a;
        int i11 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i12 = hashCode * 31;
        Integer num2 = this.f25094b;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        Integer num3 = this.f25095c;
        if (num3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num3.hashCode();
        }
        int i14 = (i13 + hashCode3) * 31;
        String str = this.f25096d;
        if (str != null) {
            i11 = str.hashCode();
        }
        return i14 + i11;
    }

    public String toString() {
        Integer num = this.f25093a;
        Integer num2 = this.f25094b;
        Integer num3 = this.f25095c;
        String str = this.f25096d;
        return "HomeAnalyticsPayload(sourceSectionOrder=" + num + ", sourceItemOrder=" + num2 + ", sourceCarouselTotalItems=" + num3 + ", recommendationCriteria=" + str + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        o.i(out, "out");
        Integer num = this.f25093a;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        Integer num2 = this.f25094b;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num2.intValue());
        }
        Integer num3 = this.f25095c;
        if (num3 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num3.intValue());
        }
        out.writeString(this.f25096d);
    }
}
