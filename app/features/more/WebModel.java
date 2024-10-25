package com.forsale.app.features.more;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: WebModel.kt */
/* loaded from: classes2.dex */
public final class WebModel implements Parcelable {
    public static final Parcelable.Creator<WebModel> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    public static final int f31612e = 8;

    /* renamed from: a  reason: collision with root package name */
    private final String f31613a;

    /* renamed from: b  reason: collision with root package name */
    private final String f31614b;

    /* renamed from: c  reason: collision with root package name */
    private final String f31615c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f31616d;

    /* compiled from: WebModel.kt */
    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<WebModel> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final WebModel createFromParcel(Parcel parcel) {
            boolean z11;
            o.i(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            return new WebModel(readString, readString2, readString3, z11);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final WebModel[] newArray(int i11) {
            return new WebModel[i11];
        }
    }

    public WebModel(String title, String str, String str2, boolean z11) {
        o.i(title, "title");
        this.f31613a = title;
        this.f31614b = str;
        this.f31615c = str2;
        this.f31616d = z11;
    }

    public final String a() {
        return this.f31614b;
    }

    public final String b() {
        return this.f31615c;
    }

    public final boolean c() {
        return this.f31616d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        o.i(out, "out");
        out.writeString(this.f31613a);
        out.writeString(this.f31614b);
        out.writeString(this.f31615c);
        out.writeInt(this.f31616d ? 1 : 0);
    }

    public /* synthetic */ WebModel(String str, String str2, String str3, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? false : z11);
    }
}
