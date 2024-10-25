package com.forsale.app.features.categories.listingdetails;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: ShareText.kt */
/* loaded from: classes2.dex */
public final class ShareText implements Parcelable {
    public static final Parcelable.Creator<ShareText> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    public static final int f25435e = 8;

    /* renamed from: a  reason: collision with root package name */
    private final String f25436a;

    /* renamed from: b  reason: collision with root package name */
    private final String f25437b;

    /* renamed from: c  reason: collision with root package name */
    private final String f25438c;

    /* renamed from: d  reason: collision with root package name */
    private final List<String> f25439d;

    /* compiled from: ShareText.kt */
    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<ShareText> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final ShareText createFromParcel(Parcel parcel) {
            o.i(parcel, "parcel");
            return new ShareText(parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final ShareText[] newArray(int i11) {
            return new ShareText[i11];
        }
    }

    public ShareText(String sharedLink, String title, String description, List<String> list) {
        o.i(sharedLink, "sharedLink");
        o.i(title, "title");
        o.i(description, "description");
        this.f25436a = sharedLink;
        this.f25437b = title;
        this.f25438c = description;
        this.f25439d = list;
    }

    public final String a() {
        return this.f25438c;
    }

    public final String b() {
        return this.f25436a;
    }

    public final String c() {
        return this.f25437b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareText)) {
            return false;
        }
        ShareText shareText = (ShareText) obj;
        if (o.d(this.f25436a, shareText.f25436a) && o.d(this.f25437b, shareText.f25437b) && o.d(this.f25438c, shareText.f25438c) && o.d(this.f25439d, shareText.f25439d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((this.f25436a.hashCode() * 31) + this.f25437b.hashCode()) * 31) + this.f25438c.hashCode()) * 31;
        List<String> list = this.f25439d;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        String str = this.f25436a;
        String str2 = this.f25437b;
        String str3 = this.f25438c;
        List<String> list = this.f25439d;
        return "ShareText(sharedLink=" + str + ", title=" + str2 + ", description=" + str3 + ", image=" + list + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        o.i(out, "out");
        out.writeString(this.f25436a);
        out.writeString(this.f25437b);
        out.writeString(this.f25438c);
        out.writeStringList(this.f25439d);
    }

    public /* synthetic */ ShareText(String str, String str2, String str3, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i11 & 8) != 0 ? null : list);
    }
}
