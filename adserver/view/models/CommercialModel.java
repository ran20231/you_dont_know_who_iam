package com.forsale.adserver.view.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.forsale.analytics.commercial.CommercialPageSource;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: CommercialModel.kt */
/* loaded from: classes2.dex */
public final class CommercialModel implements Parcelable {
    public static final Parcelable.Creator<CommercialModel> CREATOR = new a();

    /* renamed from: d  reason: collision with root package name */
    public static final int f21063d = 8;

    /* renamed from: a  reason: collision with root package name */
    private final CommercialPageSource f21064a;

    /* renamed from: b  reason: collision with root package name */
    private final Boolean f21065b;

    /* renamed from: c  reason: collision with root package name */
    private final String f21066c;

    /* compiled from: CommercialModel.kt */
    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<CommercialModel> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final CommercialModel createFromParcel(Parcel parcel) {
            CommercialPageSource valueOf;
            boolean z11;
            o.i(parcel, "parcel");
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = CommercialPageSource.valueOf(parcel.readString());
            }
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                bool = Boolean.valueOf(z11);
            }
            return new CommercialModel(valueOf, bool, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final CommercialModel[] newArray(int i11) {
            return new CommercialModel[i11];
        }
    }

    public CommercialModel() {
        this(null, null, null, 7, null);
    }

    public final Boolean a() {
        return this.f21065b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommercialModel)) {
            return false;
        }
        CommercialModel commercialModel = (CommercialModel) obj;
        if (this.f21064a == commercialModel.f21064a && o.d(this.f21065b, commercialModel.f21065b) && o.d(this.f21066c, commercialModel.f21066c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        CommercialPageSource commercialPageSource = this.f21064a;
        int i11 = 0;
        if (commercialPageSource == null) {
            hashCode = 0;
        } else {
            hashCode = commercialPageSource.hashCode();
        }
        int i12 = hashCode * 31;
        Boolean bool = this.f21065b;
        if (bool == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        String str = this.f21066c;
        if (str != null) {
            i11 = str.hashCode();
        }
        return i13 + i11;
    }

    public String toString() {
        CommercialPageSource commercialPageSource = this.f21064a;
        Boolean bool = this.f21065b;
        String str = this.f21066c;
        return "CommercialModel(source=" + commercialPageSource + ", isSourceSectionSelectedByUser=" + bool + ", vertical=" + str + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        o.i(out, "out");
        CommercialPageSource commercialPageSource = this.f21064a;
        if (commercialPageSource == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(commercialPageSource.name());
        }
        Boolean bool = this.f21065b;
        if (bool == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool.booleanValue() ? 1 : 0);
        }
        out.writeString(this.f21066c);
    }

    public CommercialModel(CommercialPageSource commercialPageSource, Boolean bool, String str) {
        this.f21064a = commercialPageSource;
        this.f21065b = bool;
        this.f21066c = str;
    }

    public /* synthetic */ CommercialModel(CommercialPageSource commercialPageSource, Boolean bool, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? CommercialPageSource.NAVBAR : commercialPageSource, (i11 & 2) != 0 ? null : bool, (i11 & 4) != 0 ? null : str);
    }
}
