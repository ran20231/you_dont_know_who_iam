package com.forsale.app.features.categories.listings.filtration.full.filterModels;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: ParentGroupModel.kt */
/* loaded from: classes2.dex */
public final class ParentGroupModel implements Parcelable {
    public static final Parcelable.Creator<ParentGroupModel> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public static final int f29060f = 8;

    /* renamed from: a  reason: collision with root package name */
    private final int f29061a;

    /* renamed from: b  reason: collision with root package name */
    private final String f29062b;

    /* renamed from: c  reason: collision with root package name */
    private final String f29063c;

    /* renamed from: d  reason: collision with root package name */
    private final String f29064d;

    /* renamed from: e  reason: collision with root package name */
    private final int f29065e;

    /* compiled from: ParentGroupModel.kt */
    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<ParentGroupModel> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final ParentGroupModel createFromParcel(Parcel parcel) {
            o.i(parcel, "parcel");
            return new ParentGroupModel(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final ParentGroupModel[] newArray(int i11) {
            return new ParentGroupModel[i11];
        }
    }

    public ParentGroupModel(int i11, String label, String labelAr, String labelEn, int i12) {
        o.i(label, "label");
        o.i(labelAr, "labelAr");
        o.i(labelEn, "labelEn");
        this.f29061a = i11;
        this.f29062b = label;
        this.f29063c = labelAr;
        this.f29064d = labelEn;
        this.f29065e = i12;
    }

    public final int a() {
        return this.f29061a;
    }

    public final String b() {
        return this.f29062b;
    }

    public final String c() {
        return this.f29063c;
    }

    public final String d() {
        return this.f29064d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int e() {
        return this.f29065e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParentGroupModel)) {
            return false;
        }
        ParentGroupModel parentGroupModel = (ParentGroupModel) obj;
        if (this.f29061a == parentGroupModel.f29061a && o.d(this.f29062b, parentGroupModel.f29062b) && o.d(this.f29063c, parentGroupModel.f29063c) && o.d(this.f29064d, parentGroupModel.f29064d) && this.f29065e == parentGroupModel.f29065e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.f29061a) * 31) + this.f29062b.hashCode()) * 31) + this.f29063c.hashCode()) * 31) + this.f29064d.hashCode()) * 31) + Integer.hashCode(this.f29065e);
    }

    public String toString() {
        int i11 = this.f29061a;
        String str = this.f29062b;
        String str2 = this.f29063c;
        String str3 = this.f29064d;
        int i12 = this.f29065e;
        return "ParentGroupModel(id=" + i11 + ", label=" + str + ", labelAr=" + str2 + ", labelEn=" + str3 + ", sortOrder=" + i12 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        o.i(out, "out");
        out.writeInt(this.f29061a);
        out.writeString(this.f29062b);
        out.writeString(this.f29063c);
        out.writeString(this.f29064d);
        out.writeInt(this.f29065e);
    }

    public /* synthetic */ ParentGroupModel(int i11, String str, String str2, String str3, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, str, str2, str3, (i13 & 16) != 0 ? 1 : i12);
    }
}
