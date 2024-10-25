package com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics;

import android.os.Parcel;
import android.os.Parcelable;
import com.forsale.app.features.categories.listingdetails.ListingDetailsAnalyticSource;
import com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: ListingDetailsEventKeys.kt */
/* loaded from: classes2.dex */
public final class ItemArgs implements Parcelable {
    public static final Parcelable.Creator<ItemArgs> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final int f26315a;

    /* renamed from: b  reason: collision with root package name */
    private final String f26316b;

    /* renamed from: c  reason: collision with root package name */
    private final String f26317c;

    /* renamed from: d  reason: collision with root package name */
    private final ListingDetailsAnalyticSource f26318d;

    /* renamed from: e  reason: collision with root package name */
    private final String f26319e;

    /* renamed from: f  reason: collision with root package name */
    private final String f26320f;

    /* renamed from: g  reason: collision with root package name */
    private final ListingDetailsSearchAnalyticsData f26321g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f26322h;

    /* compiled from: ListingDetailsEventKeys.kt */
    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<ItemArgs> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final ItemArgs createFromParcel(Parcel parcel) {
            ListingDetailsSearchAnalyticsData createFromParcel;
            boolean z11;
            o.i(parcel, "parcel");
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            ListingDetailsAnalyticSource listingDetailsAnalyticSource = (ListingDetailsAnalyticSource) parcel.readParcelable(ItemArgs.class.getClassLoader());
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = ListingDetailsSearchAnalyticsData.CREATOR.createFromParcel(parcel);
            }
            ListingDetailsSearchAnalyticsData listingDetailsSearchAnalyticsData = createFromParcel;
            if (parcel.readInt() != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            return new ItemArgs(readInt, readString, readString2, listingDetailsAnalyticSource, readString3, readString4, listingDetailsSearchAnalyticsData, z11);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final ItemArgs[] newArray(int i11) {
            return new ItemArgs[i11];
        }
    }

    public ItemArgs() {
        this(0, null, null, null, null, null, null, false, 255, null);
    }

    public final ListingDetailsAnalyticSource a() {
        return this.f26318d;
    }

    public final String b() {
        return this.f26320f;
    }

    public final boolean c() {
        return this.f26322h;
    }

    public final int d() {
        return this.f26315a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f26317c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemArgs)) {
            return false;
        }
        ItemArgs itemArgs = (ItemArgs) obj;
        if (this.f26315a == itemArgs.f26315a && o.d(this.f26316b, itemArgs.f26316b) && o.d(this.f26317c, itemArgs.f26317c) && o.d(this.f26318d, itemArgs.f26318d) && o.d(this.f26319e, itemArgs.f26319e) && o.d(this.f26320f, itemArgs.f26320f) && o.d(this.f26321g, itemArgs.f26321g) && this.f26322h == itemArgs.f26322h) {
            return true;
        }
        return false;
    }

    public final ListingDetailsSearchAnalyticsData f() {
        return this.f26321g;
    }

    public final String g() {
        return this.f26316b;
    }

    public final String h() {
        return this.f26319e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = Integer.hashCode(this.f26315a) * 31;
        String str = this.f26316b;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = (hashCode6 + hashCode) * 31;
        String str2 = this.f26317c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        ListingDetailsAnalyticSource listingDetailsAnalyticSource = this.f26318d;
        if (listingDetailsAnalyticSource == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = listingDetailsAnalyticSource.hashCode();
        }
        int i14 = (i13 + hashCode3) * 31;
        String str3 = this.f26319e;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i15 = (i14 + hashCode4) * 31;
        String str4 = this.f26320f;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i16 = (i15 + hashCode5) * 31;
        ListingDetailsSearchAnalyticsData listingDetailsSearchAnalyticsData = this.f26321g;
        if (listingDetailsSearchAnalyticsData != null) {
            i11 = listingDetailsSearchAnalyticsData.hashCode();
        }
        int i17 = (i16 + i11) * 31;
        boolean z11 = this.f26322h;
        int i18 = z11;
        if (z11 != 0) {
            i18 = 1;
        }
        return i17 + i18;
    }

    public String toString() {
        int i11 = this.f26315a;
        String str = this.f26316b;
        String str2 = this.f26317c;
        ListingDetailsAnalyticSource listingDetailsAnalyticSource = this.f26318d;
        String str3 = this.f26319e;
        String str4 = this.f26320f;
        ListingDetailsSearchAnalyticsData listingDetailsSearchAnalyticsData = this.f26321g;
        boolean z11 = this.f26322h;
        return "ItemArgs(itemPosition=" + i11 + ", source=" + str + ", listingStatus=" + str2 + ", analyticsSource=" + listingDetailsAnalyticSource + ", sourceFilterName=" + str3 + ", filtersPlace=" + str4 + ", searchAnalyticsData=" + listingDetailsSearchAnalyticsData + ", fromDetails=" + z11 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        o.i(out, "out");
        out.writeInt(this.f26315a);
        out.writeString(this.f26316b);
        out.writeString(this.f26317c);
        out.writeParcelable(this.f26318d, i11);
        out.writeString(this.f26319e);
        out.writeString(this.f26320f);
        ListingDetailsSearchAnalyticsData listingDetailsSearchAnalyticsData = this.f26321g;
        if (listingDetailsSearchAnalyticsData == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            listingDetailsSearchAnalyticsData.writeToParcel(out, i11);
        }
        out.writeInt(this.f26322h ? 1 : 0);
    }

    public ItemArgs(int i11, String str, String str2, ListingDetailsAnalyticSource listingDetailsAnalyticSource, String str3, String str4, ListingDetailsSearchAnalyticsData listingDetailsSearchAnalyticsData, boolean z11) {
        this.f26315a = i11;
        this.f26316b = str;
        this.f26317c = str2;
        this.f26318d = listingDetailsAnalyticSource;
        this.f26319e = str3;
        this.f26320f = str4;
        this.f26321g = listingDetailsSearchAnalyticsData;
        this.f26322h = z11;
    }

    public /* synthetic */ ItemArgs(int i11, String str, String str2, ListingDetailsAnalyticSource listingDetailsAnalyticSource, String str3, String str4, ListingDetailsSearchAnalyticsData listingDetailsSearchAnalyticsData, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? -1 : i11, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : listingDetailsAnalyticSource, (i12 & 16) != 0 ? null : str3, (i12 & 32) != 0 ? null : str4, (i12 & 64) == 0 ? listingDetailsSearchAnalyticsData : null, (i12 & 128) != 0 ? true : z11);
    }
}
