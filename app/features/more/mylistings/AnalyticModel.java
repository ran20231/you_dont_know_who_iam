package com.forsale.app.features.more.mylistings;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;
/* compiled from: AnalyticModel.kt */
/* loaded from: classes2.dex */
public final class AnalyticModel implements Parcelable {
    public static final Parcelable.Creator<AnalyticModel> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    public static final int f31900e = 8;

    /* renamed from: a  reason: collision with root package name */
    private final int f31901a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f31902b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f31903c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f31904d;

    /* compiled from: AnalyticModel.kt */
    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<AnalyticModel> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final AnalyticModel createFromParcel(Parcel parcel) {
            boolean z11;
            boolean z12;
            o.i(parcel, "parcel");
            int readInt = parcel.readInt();
            boolean z13 = true;
            if (parcel.readInt() != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (parcel.readInt() != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (parcel.readInt() == 0) {
                z13 = false;
            }
            return new AnalyticModel(readInt, z11, z12, z13);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final AnalyticModel[] newArray(int i11) {
            return new AnalyticModel[i11];
        }
    }

    public AnalyticModel(int i11, boolean z11, boolean z12, boolean z13) {
        this.f31901a = i11;
        this.f31902b = z11;
        this.f31903c = z12;
        this.f31904d = z13;
    }

    public final int a() {
        return this.f31901a;
    }

    public final boolean b() {
        return this.f31904d;
    }

    public final boolean c() {
        return this.f31902b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnalyticModel)) {
            return false;
        }
        AnalyticModel analyticModel = (AnalyticModel) obj;
        if (this.f31901a == analyticModel.f31901a && this.f31902b == analyticModel.f31902b && this.f31903c == analyticModel.f31903c && this.f31904d == analyticModel.f31904d) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = Integer.hashCode(this.f31901a) * 31;
        boolean z11 = this.f31902b;
        int i11 = 1;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int i13 = (hashCode + i12) * 31;
        boolean z12 = this.f31903c;
        int i14 = z12;
        if (z12 != 0) {
            i14 = 1;
        }
        int i15 = (i13 + i14) * 31;
        boolean z13 = this.f31904d;
        if (!z13) {
            i11 = z13 ? 1 : 0;
        }
        return i15 + i11;
    }

    public String toString() {
        int i11 = this.f31901a;
        boolean z11 = this.f31902b;
        boolean z12 = this.f31903c;
        boolean z13 = this.f31904d;
        return "AnalyticModel(adId=" + i11 + ", isAnonymous=" + z11 + ", isVoip=" + z12 + ", wasPromoted=" + z13 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        o.i(out, "out");
        out.writeInt(this.f31901a);
        out.writeInt(this.f31902b ? 1 : 0);
        out.writeInt(this.f31903c ? 1 : 0);
        out.writeInt(this.f31904d ? 1 : 0);
    }
}
