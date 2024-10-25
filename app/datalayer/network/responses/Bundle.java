package com.forsale.app.datalayer.network.responses;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.datalayer.network.responses.BundlesResponse;
import com.google.android.gms.ads.AdRequest;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: BundlesResponse.kt */
/* loaded from: classes2.dex */
public final class Bundle implements Parcelable {
    @c("addons")
    private final List<Addon> addons;
    @c("badge")
    private final String badgeUrl;
    @c("bundles_features")
    private final List<BundleFeature> bundleFeatures;
    @c("description")
    private final String description;
    @c("extend_period")
    private final Integer extendPeriod;
    @c("id")

    /* renamed from: id  reason: collision with root package name */
    private final int f22347id;
    @c("is_free")
    private final Integer isFree;
    @c("name")
    private final String name;
    @c("next_page")
    private final BundlesResponse.NextStep nextPage;
    @c("price")
    private final float price;
    @c("recommended")
    private final String recommended;
    @c("views")
    private final Integer views;
    @c("visibility_link")
    private final String visibilityLink;
    public static final Parcelable.Creator<Bundle> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: BundlesResponse.kt */
    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<Bundle> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Bundle createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            o.i(parcel, "parcel");
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                for (int i11 = 0; i11 != readInt2; i11++) {
                    arrayList.add(Addon.CREATOR.createFromParcel(parcel));
                }
            }
            BundlesResponse.NextStep valueOf = BundlesResponse.NextStep.valueOf(parcel.readString());
            float readFloat = parcel.readFloat();
            String readString3 = parcel.readString();
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt3);
                for (int i12 = 0; i12 != readInt3; i12++) {
                    arrayList3.add(BundleFeature.CREATOR.createFromParcel(parcel));
                }
                arrayList2 = arrayList3;
            }
            return new Bundle(readInt, readString, readString2, arrayList, valueOf, readFloat, readString3, valueOf2, arrayList2, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Bundle[] newArray(int i11) {
            return new Bundle[i11];
        }
    }

    public Bundle(int i11, String name, String description, List<Addon> list, BundlesResponse.NextStep nextPage, float f11, String str, Integer num, List<BundleFeature> list2, String str2, String str3, Integer num2, Integer num3) {
        o.i(name, "name");
        o.i(description, "description");
        o.i(nextPage, "nextPage");
        this.f22347id = i11;
        this.name = name;
        this.description = description;
        this.addons = list;
        this.nextPage = nextPage;
        this.price = f11;
        this.recommended = str;
        this.views = num;
        this.bundleFeatures = list2;
        this.badgeUrl = str2;
        this.visibilityLink = str3;
        this.isFree = num2;
        this.extendPeriod = num3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Bundle copy$default(Bundle bundle, int i11, String str, String str2, List list, BundlesResponse.NextStep nextStep, float f11, String str3, Integer num, List list2, String str4, String str5, Integer num2, Integer num3, int i12, Object obj) {
        int i13;
        String str6;
        String str7;
        List<Addon> list3;
        BundlesResponse.NextStep nextStep2;
        float f12;
        String str8;
        Integer num4;
        List<BundleFeature> list4;
        String str9;
        String str10;
        Integer num5;
        Integer num6;
        if ((i12 & 1) != 0) {
            i13 = bundle.f22347id;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            str6 = bundle.name;
        } else {
            str6 = str;
        }
        if ((i12 & 4) != 0) {
            str7 = bundle.description;
        } else {
            str7 = str2;
        }
        if ((i12 & 8) != 0) {
            list3 = bundle.addons;
        } else {
            list3 = list;
        }
        if ((i12 & 16) != 0) {
            nextStep2 = bundle.nextPage;
        } else {
            nextStep2 = nextStep;
        }
        if ((i12 & 32) != 0) {
            f12 = bundle.price;
        } else {
            f12 = f11;
        }
        if ((i12 & 64) != 0) {
            str8 = bundle.recommended;
        } else {
            str8 = str3;
        }
        if ((i12 & 128) != 0) {
            num4 = bundle.views;
        } else {
            num4 = num;
        }
        if ((i12 & 256) != 0) {
            list4 = bundle.bundleFeatures;
        } else {
            list4 = list2;
        }
        if ((i12 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
            str9 = bundle.badgeUrl;
        } else {
            str9 = str4;
        }
        if ((i12 & 1024) != 0) {
            str10 = bundle.visibilityLink;
        } else {
            str10 = str5;
        }
        if ((i12 & RecyclerView.l.FLAG_MOVED) != 0) {
            num5 = bundle.isFree;
        } else {
            num5 = num2;
        }
        if ((i12 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            num6 = bundle.extendPeriod;
        } else {
            num6 = num3;
        }
        return bundle.copy(i13, str6, str7, list3, nextStep2, f12, str8, num4, list4, str9, str10, num5, num6);
    }

    public final int component1() {
        return this.f22347id;
    }

    public final String component10() {
        return this.badgeUrl;
    }

    public final String component11() {
        return this.visibilityLink;
    }

    public final Integer component12() {
        return this.isFree;
    }

    public final Integer component13() {
        return this.extendPeriod;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.description;
    }

    public final List<Addon> component4() {
        return this.addons;
    }

    public final BundlesResponse.NextStep component5() {
        return this.nextPage;
    }

    public final float component6() {
        return this.price;
    }

    public final String component7() {
        return this.recommended;
    }

    public final Integer component8() {
        return this.views;
    }

    public final List<BundleFeature> component9() {
        return this.bundleFeatures;
    }

    public final Bundle copy(int i11, String name, String description, List<Addon> list, BundlesResponse.NextStep nextPage, float f11, String str, Integer num, List<BundleFeature> list2, String str2, String str3, Integer num2, Integer num3) {
        o.i(name, "name");
        o.i(description, "description");
        o.i(nextPage, "nextPage");
        return new Bundle(i11, name, description, list, nextPage, f11, str, num, list2, str2, str3, num2, num3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Bundle)) {
            return false;
        }
        Bundle bundle = (Bundle) obj;
        if (this.f22347id == bundle.f22347id && o.d(this.name, bundle.name) && o.d(this.description, bundle.description) && o.d(this.addons, bundle.addons) && this.nextPage == bundle.nextPage && Float.compare(this.price, bundle.price) == 0 && o.d(this.recommended, bundle.recommended) && o.d(this.views, bundle.views) && o.d(this.bundleFeatures, bundle.bundleFeatures) && o.d(this.badgeUrl, bundle.badgeUrl) && o.d(this.visibilityLink, bundle.visibilityLink) && o.d(this.isFree, bundle.isFree) && o.d(this.extendPeriod, bundle.extendPeriod)) {
            return true;
        }
        return false;
    }

    public final List<Addon> getAddons() {
        return this.addons;
    }

    public final String getBadgeUrl() {
        return this.badgeUrl;
    }

    public final List<BundleFeature> getBundleFeatures() {
        return this.bundleFeatures;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Integer getExtendPeriod() {
        return this.extendPeriod;
    }

    public final boolean getHasTag() {
        String str = this.recommended;
        if (str == null || str.length() <= 0) {
            return false;
        }
        return true;
    }

    public final boolean getHasViews() {
        Integer num = this.views;
        if (num != null && (num == null || num.intValue() != 0)) {
            return true;
        }
        return false;
    }

    public final int getId() {
        return this.f22347id;
    }

    public final String getName() {
        return this.name;
    }

    public final BundlesResponse.NextStep getNextPage() {
        return this.nextPage;
    }

    public final float getPrice() {
        return this.price;
    }

    public final String getRecommended() {
        return this.recommended;
    }

    public final Integer getViews() {
        return this.views;
    }

    public final String getVisibilityLink() {
        return this.visibilityLink;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8 = ((((Integer.hashCode(this.f22347id) * 31) + this.name.hashCode()) * 31) + this.description.hashCode()) * 31;
        List<Addon> list = this.addons;
        int i11 = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int hashCode9 = (((((hashCode8 + hashCode) * 31) + this.nextPage.hashCode()) * 31) + Float.hashCode(this.price)) * 31;
        String str = this.recommended;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i12 = (hashCode9 + hashCode2) * 31;
        Integer num = this.views;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        List<BundleFeature> list2 = this.bundleFeatures;
        if (list2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = list2.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        String str2 = this.badgeUrl;
        if (str2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str2.hashCode();
        }
        int i15 = (i14 + hashCode5) * 31;
        String str3 = this.visibilityLink;
        if (str3 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str3.hashCode();
        }
        int i16 = (i15 + hashCode6) * 31;
        Integer num2 = this.isFree;
        if (num2 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = num2.hashCode();
        }
        int i17 = (i16 + hashCode7) * 31;
        Integer num3 = this.extendPeriod;
        if (num3 != null) {
            i11 = num3.hashCode();
        }
        return i17 + i11;
    }

    public final Integer isFree() {
        return this.isFree;
    }

    public String toString() {
        int i11 = this.f22347id;
        String str = this.name;
        String str2 = this.description;
        List<Addon> list = this.addons;
        BundlesResponse.NextStep nextStep = this.nextPage;
        float f11 = this.price;
        String str3 = this.recommended;
        Integer num = this.views;
        List<BundleFeature> list2 = this.bundleFeatures;
        String str4 = this.badgeUrl;
        String str5 = this.visibilityLink;
        Integer num2 = this.isFree;
        Integer num3 = this.extendPeriod;
        return "Bundle(id=" + i11 + ", name=" + str + ", description=" + str2 + ", addons=" + list + ", nextPage=" + nextStep + ", price=" + f11 + ", recommended=" + str3 + ", views=" + num + ", bundleFeatures=" + list2 + ", badgeUrl=" + str4 + ", visibilityLink=" + str5 + ", isFree=" + num2 + ", extendPeriod=" + num3 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        o.i(out, "out");
        out.writeInt(this.f22347id);
        out.writeString(this.name);
        out.writeString(this.description);
        List<Addon> list = this.addons;
        if (list == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list.size());
            for (Addon addon : list) {
                addon.writeToParcel(out, i11);
            }
        }
        out.writeString(this.nextPage.name());
        out.writeFloat(this.price);
        out.writeString(this.recommended);
        Integer num = this.views;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        List<BundleFeature> list2 = this.bundleFeatures;
        if (list2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list2.size());
            for (BundleFeature bundleFeature : list2) {
                bundleFeature.writeToParcel(out, i11);
            }
        }
        out.writeString(this.badgeUrl);
        out.writeString(this.visibilityLink);
        Integer num2 = this.isFree;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num2.intValue());
        }
        Integer num3 = this.extendPeriod;
        if (num3 == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(num3.intValue());
    }

    public /* synthetic */ Bundle(int i11, String str, String str2, List list, BundlesResponse.NextStep nextStep, float f11, String str3, Integer num, List list2, String str4, String str5, Integer num2, Integer num3, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, str, str2, list, (i12 & 16) != 0 ? BundlesResponse.NextStep.AddonsPage : nextStep, f11, str3, (i12 & 128) != 0 ? null : num, list2, (i12 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : str4, (i12 & 1024) != 0 ? null : str5, num2, num3);
    }
}
