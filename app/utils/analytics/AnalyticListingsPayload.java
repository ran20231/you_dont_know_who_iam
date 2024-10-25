package com.forsale.app.utils.analytics;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;
/* compiled from: AnalyticsListingsSource.kt */
/* loaded from: classes3.dex */
public final class AnalyticListingsPayload implements Parcelable {
    public static final Parcelable.Creator<AnalyticListingsPayload> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final int f39970b = 8;

    /* renamed from: a  reason: collision with root package name */
    private final String f39971a;

    /* compiled from: AnalyticsListingsSource.kt */
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<AnalyticListingsPayload> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final AnalyticListingsPayload createFromParcel(Parcel parcel) {
            o.i(parcel, "parcel");
            return new AnalyticListingsPayload(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final AnalyticListingsPayload[] newArray(int i11) {
            return new AnalyticListingsPayload[i11];
        }
    }

    public AnalyticListingsPayload(String str) {
        this.f39971a = str;
    }

    public final String a() {
        return this.f39971a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof AnalyticListingsPayload) && o.d(this.f39971a, ((AnalyticListingsPayload) obj).f39971a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f39971a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        String str = this.f39971a;
        return "AnalyticListingsPayload(sectionName=" + str + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        o.i(out, "out");
        out.writeString(this.f39971a);
    }
}
