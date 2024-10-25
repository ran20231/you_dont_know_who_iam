package com.forsale.app.datalayer.network.responses;

import android.os.Parcel;
import android.os.Parcelable;
import com.forsale.app.datalayer.network.entities.ExtraAttr;
import com.forsale.app.datalayer.network.requestsbodies.AdvancedSearchBody;
import com.forsale.app.utils.TypeExtensionsKt;
import com.google.android.gms.ads.AdRequest;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: ItemSubscriptionResponse.kt */
/* loaded from: classes2.dex */
public final class ItemSubscriptionResponse implements Parcelable {
    private final List<ExtraAttr> attributes;
    @c("category_id")
    private final Integer categoryId;
    @c("districts_ids")
    private final List<Integer> districtsIds;
    @c("end_date")
    private final String endDate;

    /* renamed from: id  reason: collision with root package name */
    private final int f22350id;
    @c(AdvancedSearchBody.IMAGE_ONLY)
    private final int imgOnly;
    @c(AdvancedSearchBody.NEAR_ME)
    private final int nearMe;
    private final Integer price;
    @c("start_date")
    private final String startDate;
    @c("susbscription_txt")
    private final String susbscriptionTxt;
    @c(AdvancedSearchBody.VIDEO_ONLY)
    private final int videoOnly;
    public static final Parcelable.Creator<ItemSubscriptionResponse> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: ItemSubscriptionResponse.kt */
    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<ItemSubscriptionResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ItemSubscriptionResponse createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            o.i(parcel, "parcel");
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt);
                for (int i11 = 0; i11 != readInt; i11++) {
                    arrayList3.add(ExtraAttr.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList3;
            }
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString = parcel.readString();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            int readInt5 = parcel.readInt();
            if (parcel.readInt() != 0) {
                int readInt6 = parcel.readInt();
                arrayList2 = new ArrayList(readInt6);
                for (int i12 = 0; i12 != readInt6; i12++) {
                    arrayList2.add(Integer.valueOf(parcel.readInt()));
                }
            }
            return new ItemSubscriptionResponse(arrayList, valueOf, readString, readInt2, readInt3, readInt4, valueOf2, readString2, readString3, readInt5, arrayList2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ItemSubscriptionResponse[] newArray(int i11) {
            return new ItemSubscriptionResponse[i11];
        }
    }

    public ItemSubscriptionResponse(List<ExtraAttr> list, Integer num, String endDate, int i11, int i12, int i13, Integer num2, String startDate, String str, int i14, List<Integer> list2) {
        o.i(endDate, "endDate");
        o.i(startDate, "startDate");
        this.attributes = list;
        this.categoryId = num;
        this.endDate = endDate;
        this.f22350id = i11;
        this.imgOnly = i12;
        this.nearMe = i13;
        this.price = num2;
        this.startDate = startDate;
        this.susbscriptionTxt = str;
        this.videoOnly = i14;
        this.districtsIds = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ItemSubscriptionResponse copy$default(ItemSubscriptionResponse itemSubscriptionResponse, List list, Integer num, String str, int i11, int i12, int i13, Integer num2, String str2, String str3, int i14, List list2, int i15, Object obj) {
        List<ExtraAttr> list3;
        Integer num3;
        String str4;
        int i16;
        int i17;
        int i18;
        Integer num4;
        String str5;
        String str6;
        int i19;
        List<Integer> list4;
        if ((i15 & 1) != 0) {
            list3 = itemSubscriptionResponse.attributes;
        } else {
            list3 = list;
        }
        if ((i15 & 2) != 0) {
            num3 = itemSubscriptionResponse.categoryId;
        } else {
            num3 = num;
        }
        if ((i15 & 4) != 0) {
            str4 = itemSubscriptionResponse.endDate;
        } else {
            str4 = str;
        }
        if ((i15 & 8) != 0) {
            i16 = itemSubscriptionResponse.f22350id;
        } else {
            i16 = i11;
        }
        if ((i15 & 16) != 0) {
            i17 = itemSubscriptionResponse.imgOnly;
        } else {
            i17 = i12;
        }
        if ((i15 & 32) != 0) {
            i18 = itemSubscriptionResponse.nearMe;
        } else {
            i18 = i13;
        }
        if ((i15 & 64) != 0) {
            num4 = itemSubscriptionResponse.price;
        } else {
            num4 = num2;
        }
        if ((i15 & 128) != 0) {
            str5 = itemSubscriptionResponse.startDate;
        } else {
            str5 = str2;
        }
        if ((i15 & 256) != 0) {
            str6 = itemSubscriptionResponse.susbscriptionTxt;
        } else {
            str6 = str3;
        }
        if ((i15 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
            i19 = itemSubscriptionResponse.videoOnly;
        } else {
            i19 = i14;
        }
        if ((i15 & 1024) != 0) {
            list4 = itemSubscriptionResponse.districtsIds;
        } else {
            list4 = list2;
        }
        return itemSubscriptionResponse.copy(list3, num3, str4, i16, i17, i18, num4, str5, str6, i19, list4);
    }

    public final List<ExtraAttr> component1() {
        return this.attributes;
    }

    public final int component10() {
        return this.videoOnly;
    }

    public final List<Integer> component11() {
        return this.districtsIds;
    }

    public final Integer component2() {
        return this.categoryId;
    }

    public final String component3() {
        return this.endDate;
    }

    public final int component4() {
        return this.f22350id;
    }

    public final int component5() {
        return this.imgOnly;
    }

    public final int component6() {
        return this.nearMe;
    }

    public final Integer component7() {
        return this.price;
    }

    public final String component8() {
        return this.startDate;
    }

    public final String component9() {
        return this.susbscriptionTxt;
    }

    public final ItemSubscriptionResponse copy(List<ExtraAttr> list, Integer num, String endDate, int i11, int i12, int i13, Integer num2, String startDate, String str, int i14, List<Integer> list2) {
        o.i(endDate, "endDate");
        o.i(startDate, "startDate");
        return new ItemSubscriptionResponse(list, num, endDate, i11, i12, i13, num2, startDate, str, i14, list2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemSubscriptionResponse)) {
            return false;
        }
        ItemSubscriptionResponse itemSubscriptionResponse = (ItemSubscriptionResponse) obj;
        if (o.d(this.attributes, itemSubscriptionResponse.attributes) && o.d(this.categoryId, itemSubscriptionResponse.categoryId) && o.d(this.endDate, itemSubscriptionResponse.endDate) && this.f22350id == itemSubscriptionResponse.f22350id && this.imgOnly == itemSubscriptionResponse.imgOnly && this.nearMe == itemSubscriptionResponse.nearMe && o.d(this.price, itemSubscriptionResponse.price) && o.d(this.startDate, itemSubscriptionResponse.startDate) && o.d(this.susbscriptionTxt, itemSubscriptionResponse.susbscriptionTxt) && this.videoOnly == itemSubscriptionResponse.videoOnly && o.d(this.districtsIds, itemSubscriptionResponse.districtsIds)) {
            return true;
        }
        return false;
    }

    public final List<ExtraAttr> getAttributes() {
        return this.attributes;
    }

    public final Integer getCategoryId() {
        return this.categoryId;
    }

    public final List<Integer> getDistrictsIds() {
        return this.districtsIds;
    }

    public final String getEndDate() {
        return this.endDate;
    }

    public final int getId() {
        return this.f22350id;
    }

    public final int getImgOnly() {
        return this.imgOnly;
    }

    public final int getNearMe() {
        return this.nearMe;
    }

    public final Integer getPrice() {
        return this.price;
    }

    public final String getStartDate() {
        return this.startDate;
    }

    public final String getSusbscriptionTxt() {
        return this.susbscriptionTxt;
    }

    public final int getVideoOnly() {
        return this.videoOnly;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        List<ExtraAttr> list = this.attributes;
        int i11 = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i12 = hashCode * 31;
        Integer num = this.categoryId;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int hashCode5 = (((((((((i12 + hashCode2) * 31) + this.endDate.hashCode()) * 31) + Integer.hashCode(this.f22350id)) * 31) + Integer.hashCode(this.imgOnly)) * 31) + Integer.hashCode(this.nearMe)) * 31;
        Integer num2 = this.price;
        if (num2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num2.hashCode();
        }
        int hashCode6 = (((hashCode5 + hashCode3) * 31) + this.startDate.hashCode()) * 31;
        String str = this.susbscriptionTxt;
        if (str == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str.hashCode();
        }
        int hashCode7 = (((hashCode6 + hashCode4) * 31) + Integer.hashCode(this.videoOnly)) * 31;
        List<Integer> list2 = this.districtsIds;
        if (list2 != null) {
            i11 = list2.hashCode();
        }
        return hashCode7 + i11;
    }

    public final boolean isAdvancedSearch() {
        boolean z11;
        List<ExtraAttr> list = this.attributes;
        if (list != null && !list.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11 && !TypeExtensionsKt.h0(this.videoOnly) && !TypeExtensionsKt.h0(this.imgOnly) && !TypeExtensionsKt.h0(this.nearMe) && !TypeExtensionsKt.i0(this.price)) {
            return false;
        }
        return true;
    }

    public String toString() {
        List<ExtraAttr> list = this.attributes;
        Integer num = this.categoryId;
        String str = this.endDate;
        int i11 = this.f22350id;
        int i12 = this.imgOnly;
        int i13 = this.nearMe;
        Integer num2 = this.price;
        String str2 = this.startDate;
        String str3 = this.susbscriptionTxt;
        int i14 = this.videoOnly;
        List<Integer> list2 = this.districtsIds;
        return "ItemSubscriptionResponse(attributes=" + list + ", categoryId=" + num + ", endDate=" + str + ", id=" + i11 + ", imgOnly=" + i12 + ", nearMe=" + i13 + ", price=" + num2 + ", startDate=" + str2 + ", susbscriptionTxt=" + str3 + ", videoOnly=" + i14 + ", districtsIds=" + list2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        o.i(out, "out");
        List<ExtraAttr> list = this.attributes;
        if (list == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list.size());
            for (ExtraAttr extraAttr : list) {
                extraAttr.writeToParcel(out, i11);
            }
        }
        Integer num = this.categoryId;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        out.writeString(this.endDate);
        out.writeInt(this.f22350id);
        out.writeInt(this.imgOnly);
        out.writeInt(this.nearMe);
        Integer num2 = this.price;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num2.intValue());
        }
        out.writeString(this.startDate);
        out.writeString(this.susbscriptionTxt);
        out.writeInt(this.videoOnly);
        List<Integer> list2 = this.districtsIds;
        if (list2 == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(list2.size());
        for (Integer num3 : list2) {
            out.writeInt(num3.intValue());
        }
    }

    public /* synthetic */ ItemSubscriptionResponse(List list, Integer num, String str, int i11, int i12, int i13, Integer num2, String str2, String str3, int i14, List list2, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, num, str, i11, i12, i13, num2, str2, str3, i14, (i15 & 1024) != 0 ? null : list2);
    }
}
