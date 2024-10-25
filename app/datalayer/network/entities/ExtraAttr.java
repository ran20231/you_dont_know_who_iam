package com.forsale.app.datalayer.network.entities;

import android.os.Parcel;
import android.os.Parcelable;
import com.forsale.app.datalayer.database.AttributeValue;
import com.leanplum.internal.Constants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: ListingDetailsEntity.kt */
/* loaded from: classes2.dex */
public final class ExtraAttr implements Parcelable {
    @c("id")

    /* renamed from: id  reason: collision with root package name */
    private final int f22329id;
    @c(Constants.Keys.SIZE)
    private String size;
    @c(AttributeValue.VALUE)
    private String value;
    public static final Parcelable.Creator<ExtraAttr> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: ListingDetailsEntity.kt */
    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<ExtraAttr> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExtraAttr createFromParcel(Parcel parcel) {
            o.i(parcel, "parcel");
            return new ExtraAttr(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExtraAttr[] newArray(int i11) {
            return new ExtraAttr[i11];
        }
    }

    public ExtraAttr(int i11, String value, String str) {
        o.i(value, "value");
        this.f22329id = i11;
        this.value = value;
        this.size = str;
    }

    public static /* synthetic */ ExtraAttr copy$default(ExtraAttr extraAttr, int i11, String str, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = extraAttr.f22329id;
        }
        if ((i12 & 2) != 0) {
            str = extraAttr.value;
        }
        if ((i12 & 4) != 0) {
            str2 = extraAttr.size;
        }
        return extraAttr.copy(i11, str, str2);
    }

    public final int component1() {
        return this.f22329id;
    }

    public final String component2() {
        return this.value;
    }

    public final String component3() {
        return this.size;
    }

    public final ExtraAttr copy(int i11, String value, String str) {
        o.i(value, "value");
        return new ExtraAttr(i11, value, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtraAttr)) {
            return false;
        }
        ExtraAttr extraAttr = (ExtraAttr) obj;
        if (this.f22329id == extraAttr.f22329id && o.d(this.value, extraAttr.value) && o.d(this.size, extraAttr.size)) {
            return true;
        }
        return false;
    }

    public final int getId() {
        return this.f22329id;
    }

    public final String getSize() {
        return this.size;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((Integer.hashCode(this.f22329id) * 31) + this.value.hashCode()) * 31;
        String str = this.size;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final void setSize(String str) {
        this.size = str;
    }

    public final void setValue(String str) {
        o.i(str, "<set-?>");
        this.value = str;
    }

    public String toString() {
        int i11 = this.f22329id;
        String str = this.value;
        String str2 = this.size;
        return "ExtraAttr(id=" + i11 + ", value=" + str + ", size=" + str2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        o.i(out, "out");
        out.writeInt(this.f22329id);
        out.writeString(this.value);
        out.writeString(this.size);
    }

    public /* synthetic */ ExtraAttr(int i11, String str, String str2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, str, (i12 & 4) != 0 ? null : str2);
    }
}
