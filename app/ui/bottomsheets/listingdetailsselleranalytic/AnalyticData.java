package com.forsale.app.ui.bottomsheets.listingdetailsselleranalytic;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: AnalyticData.kt */
/* loaded from: classes3.dex */
public final class AnalyticData implements Parcelable {
    public static final a CREATOR = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final int f38769a;

    /* renamed from: b  reason: collision with root package name */
    private final int f38770b;

    /* renamed from: c  reason: collision with root package name */
    private final int f38771c;

    /* renamed from: d  reason: collision with root package name */
    private final int f38772d;

    /* compiled from: AnalyticData.kt */
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<AnalyticData> {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public AnalyticData createFromParcel(Parcel parcel) {
            o.i(parcel, "parcel");
            return new AnalyticData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public AnalyticData[] newArray(int i11) {
            return new AnalyticData[i11];
        }
    }

    public AnalyticData(int i11, int i12, int i13, int i14) {
        this.f38769a = i11;
        this.f38770b = i12;
        this.f38771c = i13;
        this.f38772d = i14;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnalyticData)) {
            return false;
        }
        AnalyticData analyticData = (AnalyticData) obj;
        if (this.f38769a == analyticData.f38769a && this.f38770b == analyticData.f38770b && this.f38771c == analyticData.f38771c && this.f38772d == analyticData.f38772d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f38769a) * 31) + Integer.hashCode(this.f38770b)) * 31) + Integer.hashCode(this.f38771c)) * 31) + Integer.hashCode(this.f38772d);
    }

    public String toString() {
        int i11 = this.f38769a;
        int i12 = this.f38770b;
        int i13 = this.f38771c;
        int i14 = this.f38772d;
        return "AnalyticData(viewsCount=" + i11 + ", callCount=" + i12 + ", favouriteCount=" + i13 + ", adId=" + i14 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i11) {
        o.i(dest, "dest");
        dest.writeInt(this.f38769a);
        dest.writeInt(this.f38770b);
        dest.writeInt(this.f38771c);
        dest.writeInt(this.f38772d);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnalyticData(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        o.i(parcel, "parcel");
    }
}
