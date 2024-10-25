package com.forsale.app.datalayer.network.responses;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.datalayer.database.CategoryDistrict;
import com.google.android.gms.ads.AdRequest;
import kotlin.jvm.internal.o;
import kotlin.text.StringsKt__StringsKt;
import up.c;
/* compiled from: AddonsResponse.kt */
/* loaded from: classes2.dex */
public final class Addon implements Parcelable {
    @c("badge_name")
    private final String badgeName;
    @c("cat_id")
    private final int catId;
    @c("description")
    private final String description;
    @c(CategoryDistrict.DISTRICT_ID)
    private final int districtId;
    @c("help")
    private final String help;
    @c("help_url")
    private final String helpUrl;
    @c("hint")
    private final Hint hint;
    @c("id")

    /* renamed from: id  reason: collision with root package name */
    private final String f22345id;
    @c("image")
    private final String image;
    private transient boolean includedInBundle;
    @c("name")
    private final String name;
    @c("price")
    private final float price;
    @c("system_name")
    private final String systemName;
    public static final Parcelable.Creator<Addon> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: AddonsResponse.kt */
    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<Addon> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Addon createFromParcel(Parcel parcel) {
            o.i(parcel, "parcel");
            return new Addon(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readFloat(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Hint.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Addon[] newArray(int i11) {
            return new Addon[i11];
        }
    }

    public Addon(String id2, String systemName, String image, float f11, int i11, int i12, String helpUrl, String name, String description, String help, String str, Hint hint) {
        o.i(id2, "id");
        o.i(systemName, "systemName");
        o.i(image, "image");
        o.i(helpUrl, "helpUrl");
        o.i(name, "name");
        o.i(description, "description");
        o.i(help, "help");
        this.f22345id = id2;
        this.systemName = systemName;
        this.image = image;
        this.price = f11;
        this.catId = i11;
        this.districtId = i12;
        this.helpUrl = helpUrl;
        this.name = name;
        this.description = description;
        this.help = help;
        this.badgeName = str;
        this.hint = hint;
    }

    public static /* synthetic */ Addon copy$default(Addon addon, String str, String str2, String str3, float f11, int i11, int i12, String str4, String str5, String str6, String str7, String str8, Hint hint, int i13, Object obj) {
        String str9;
        String str10;
        String str11;
        float f12;
        int i14;
        int i15;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        Hint hint2;
        if ((i13 & 1) != 0) {
            str9 = addon.f22345id;
        } else {
            str9 = str;
        }
        if ((i13 & 2) != 0) {
            str10 = addon.systemName;
        } else {
            str10 = str2;
        }
        if ((i13 & 4) != 0) {
            str11 = addon.image;
        } else {
            str11 = str3;
        }
        if ((i13 & 8) != 0) {
            f12 = addon.price;
        } else {
            f12 = f11;
        }
        if ((i13 & 16) != 0) {
            i14 = addon.catId;
        } else {
            i14 = i11;
        }
        if ((i13 & 32) != 0) {
            i15 = addon.districtId;
        } else {
            i15 = i12;
        }
        if ((i13 & 64) != 0) {
            str12 = addon.helpUrl;
        } else {
            str12 = str4;
        }
        if ((i13 & 128) != 0) {
            str13 = addon.name;
        } else {
            str13 = str5;
        }
        if ((i13 & 256) != 0) {
            str14 = addon.description;
        } else {
            str14 = str6;
        }
        if ((i13 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
            str15 = addon.help;
        } else {
            str15 = str7;
        }
        if ((i13 & 1024) != 0) {
            str16 = addon.badgeName;
        } else {
            str16 = str8;
        }
        if ((i13 & RecyclerView.l.FLAG_MOVED) != 0) {
            hint2 = addon.hint;
        } else {
            hint2 = hint;
        }
        return addon.copy(str9, str10, str11, f12, i14, i15, str12, str13, str14, str15, str16, hint2);
    }

    public final String component1() {
        return this.f22345id;
    }

    public final String component10() {
        return this.help;
    }

    public final String component11() {
        return this.badgeName;
    }

    public final Hint component12() {
        return this.hint;
    }

    public final String component2() {
        return this.systemName;
    }

    public final String component3() {
        return this.image;
    }

    public final float component4() {
        return this.price;
    }

    public final int component5() {
        return this.catId;
    }

    public final int component6() {
        return this.districtId;
    }

    public final String component7() {
        return this.helpUrl;
    }

    public final String component8() {
        return this.name;
    }

    public final String component9() {
        return this.description;
    }

    public final Addon copy(String id2, String systemName, String image, float f11, int i11, int i12, String helpUrl, String name, String description, String help, String str, Hint hint) {
        o.i(id2, "id");
        o.i(systemName, "systemName");
        o.i(image, "image");
        o.i(helpUrl, "helpUrl");
        o.i(name, "name");
        o.i(description, "description");
        o.i(help, "help");
        return new Addon(id2, systemName, image, f11, i11, i12, helpUrl, name, description, help, str, hint);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Addon)) {
            return false;
        }
        Addon addon = (Addon) obj;
        if (o.d(this.f22345id, addon.f22345id) && o.d(this.systemName, addon.systemName) && o.d(this.image, addon.image) && Float.compare(this.price, addon.price) == 0 && this.catId == addon.catId && this.districtId == addon.districtId && o.d(this.helpUrl, addon.helpUrl) && o.d(this.name, addon.name) && o.d(this.description, addon.description) && o.d(this.help, addon.help) && o.d(this.badgeName, addon.badgeName) && o.d(this.hint, addon.hint)) {
            return true;
        }
        return false;
    }

    public final String getBadgeName() {
        return this.badgeName;
    }

    public final int getCatId() {
        return this.catId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getDistrictId() {
        return this.districtId;
    }

    public final String getHelp() {
        return this.help;
    }

    public final String getHelpUrl() {
        return this.helpUrl;
    }

    public final Hint getHint() {
        return this.hint;
    }

    public final String getId() {
        return this.f22345id;
    }

    public final String getImage() {
        return this.image;
    }

    public final boolean getIncludedInBundle() {
        return this.includedInBundle;
    }

    public final String getName() {
        return this.name;
    }

    public final float getPrice() {
        return this.price;
    }

    public final String getSystemName() {
        return this.systemName;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((((((((((((this.f22345id.hashCode() * 31) + this.systemName.hashCode()) * 31) + this.image.hashCode()) * 31) + Float.hashCode(this.price)) * 31) + Integer.hashCode(this.catId)) * 31) + Integer.hashCode(this.districtId)) * 31) + this.helpUrl.hashCode()) * 31) + this.name.hashCode()) * 31) + this.description.hashCode()) * 31) + this.help.hashCode()) * 31;
        String str = this.badgeName;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = (hashCode2 + hashCode) * 31;
        Hint hint = this.hint;
        if (hint != null) {
            i11 = hint.hashCode();
        }
        return i12 + i11;
    }

    public final boolean isPowerPin() {
        boolean L;
        L = StringsKt__StringsKt.L(this.f22345id, "power_pin", true);
        return L;
    }

    public final boolean isPromote() {
        boolean L;
        L = StringsKt__StringsKt.L(this.f22345id, "promoted_post", true);
        return L;
    }

    public final boolean isVideo() {
        return o.d(this.f22345id, "video");
    }

    public final void setIncludedInBundle(boolean z11) {
        this.includedInBundle = z11;
    }

    public String toString() {
        String str = this.f22345id;
        String str2 = this.systemName;
        String str3 = this.image;
        float f11 = this.price;
        int i11 = this.catId;
        int i12 = this.districtId;
        String str4 = this.helpUrl;
        String str5 = this.name;
        String str6 = this.description;
        String str7 = this.help;
        String str8 = this.badgeName;
        Hint hint = this.hint;
        return "Addon(id=" + str + ", systemName=" + str2 + ", image=" + str3 + ", price=" + f11 + ", catId=" + i11 + ", districtId=" + i12 + ", helpUrl=" + str4 + ", name=" + str5 + ", description=" + str6 + ", help=" + str7 + ", badgeName=" + str8 + ", hint=" + hint + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        o.i(out, "out");
        out.writeString(this.f22345id);
        out.writeString(this.systemName);
        out.writeString(this.image);
        out.writeFloat(this.price);
        out.writeInt(this.catId);
        out.writeInt(this.districtId);
        out.writeString(this.helpUrl);
        out.writeString(this.name);
        out.writeString(this.description);
        out.writeString(this.help);
        out.writeString(this.badgeName);
        Hint hint = this.hint;
        if (hint == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        hint.writeToParcel(out, i11);
    }
}
