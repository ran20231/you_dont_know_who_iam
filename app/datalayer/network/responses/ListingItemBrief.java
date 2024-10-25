package com.forsale.app.datalayer.network.responses;

import android.os.Parcel;
import android.os.Parcelable;
import com.forsale.adserver.view.models.AdType;
import com.forsale.adserver.view.models.AdsModel;
import com.forsale.app.datalayer.database.ExtraAttributeEntity;
import com.forsale.app.datalayer.database.ExtraAttributeOptionEntity;
import com.forsale.app.datalayer.database.SearchPlaceholderKeywordEntity;
import com.forsale.app.datalayer.network.entities.ExtraAttr;
import com.forsale.app.datalayer.network.requestsbodies.UserType;
import com.forsale.app.datalayer.network.responses.listingdetails.ItemStatus;
import com.forsale.app.features.postad.extraattributes.enums.AttributeType;
import com.forsale.app.utils.LocaleManager;
import com.forsale.app.utils.itemutils.TextHolder;
import com.forsale.app.utils.l;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.r;
import kotlin.collections.s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.text.StringsKt__StringsKt;
import up.c;
/* compiled from: ListingItemBrief.kt */
/* loaded from: classes2.dex */
public final class ListingItemBrief extends ListingItemBase implements Parcelable {
    public static final String LISTING_ITEM_BRIEF_TABLE = "listing_item_brief";
    @c("thumb")
    private final String _thumb;
    @c(ListingItemDetails.ARCHIVE_REASON)
    private String archiveReason;
    private List<AttrInfo> attrsInfo;
    @c("cat_id")
    private final int catId;
    private transient TextHolder catName;
    private final String contact;
    @c(ListingItemBase.DATE_PUBLISHED)
    private final String datePublished;
    @c(ListingItemBase.DATE_SORT)
    private final String dateSort;
    @c("description")
    private final String description;
    @c(ListingItemBase.DISTRICT_NAME)
    private final String districtNameDefault;
    @c("district_name_localize")
    private final DistrictName districtNameLocalize;
    @c(ListingItemBase.DO_NOT_DISTURB)
    private final String doNotDisturb;
    @c(ListingItemBase.EXPIRE_SOON)
    private final Integer expireSoon;
    @c(ListingItemDetails.ATTRIBUTES)
    private List<ExtraAttr> extraAttrs;

    /* renamed from: id  reason: collision with root package name */
    private final int f22351id;
    private final String image;
    @c(ListingItemBase.IMAGES_COUNT)
    private final int imagesCount;
    @c(ListingItemBase.IS_ANON)
    private final int isAnon;
    @c(ListingItemBase.IS_HIDE_MY_NUMBER)
    private final int isHideMyNumber;
    @c(ListingItemBase.IS_PREM)
    private final int isPrem;
    @c(ListingItemBase.IS_VIDEO_PAID)
    private final int isVideoPaid;
    @c(ListingItemBase.IS_VOIP)
    private final int isVoip;
    private transient TextHolder parentCatName;
    @c("phone")
    private final String phone;
    private final double price;
    @c(ListingItemBase.REG_ID)
    private final int regId;
    private final ItemStatus status;
    private final String title;
    private final String url;
    @c("user_type")
    private final UserType userType;
    @c("virtual_tour_thumb")
    private final String virtualTourThumb;
    @c(ListingItemBase.WAS_PROMOTED)
    private final int wasPromoted;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ListingItemBrief> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: ListingItemBrief.kt */
    /* loaded from: classes2.dex */
    public static final class AttrInfo {
        public static final int $stable = 8;
        private final String iconUrl;

        /* renamed from: id  reason: collision with root package name */
        private final int f22352id;
        private final String nameAr;
        private final String nameEn;
        private final ExtraAttributeOptionEntity option;
        private final AttributeType type;
        private final ExtraAttributeEntity.AttrUnit unit;
        private String value;

        /* compiled from: ListingItemBrief.kt */
        /* loaded from: classes2.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AttributeType.values().length];
                try {
                    iArr[AttributeType.NUMBER.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AttributeType.BOOL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AttributeType.DROP_DOWN.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AttributeType.TEXT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[AttributeType.FILE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public AttrInfo(int i11, String nameEn, String nameAr, AttributeType type, String iconUrl, String value, ExtraAttributeEntity.AttrUnit attrUnit, ExtraAttributeOptionEntity extraAttributeOptionEntity) {
            o.i(nameEn, "nameEn");
            o.i(nameAr, "nameAr");
            o.i(type, "type");
            o.i(iconUrl, "iconUrl");
            o.i(value, "value");
            this.f22352id = i11;
            this.nameEn = nameEn;
            this.nameAr = nameAr;
            this.type = type;
            this.iconUrl = iconUrl;
            this.value = value;
            this.unit = attrUnit;
            this.option = extraAttributeOptionEntity;
        }

        public static /* synthetic */ AttrInfo copy$default(AttrInfo attrInfo, int i11, String str, String str2, AttributeType attributeType, String str3, String str4, ExtraAttributeEntity.AttrUnit attrUnit, ExtraAttributeOptionEntity extraAttributeOptionEntity, int i12, Object obj) {
            int i13;
            String str5;
            String str6;
            AttributeType attributeType2;
            String str7;
            String str8;
            ExtraAttributeEntity.AttrUnit attrUnit2;
            ExtraAttributeOptionEntity extraAttributeOptionEntity2;
            if ((i12 & 1) != 0) {
                i13 = attrInfo.f22352id;
            } else {
                i13 = i11;
            }
            if ((i12 & 2) != 0) {
                str5 = attrInfo.nameEn;
            } else {
                str5 = str;
            }
            if ((i12 & 4) != 0) {
                str6 = attrInfo.nameAr;
            } else {
                str6 = str2;
            }
            if ((i12 & 8) != 0) {
                attributeType2 = attrInfo.type;
            } else {
                attributeType2 = attributeType;
            }
            if ((i12 & 16) != 0) {
                str7 = attrInfo.iconUrl;
            } else {
                str7 = str3;
            }
            if ((i12 & 32) != 0) {
                str8 = attrInfo.value;
            } else {
                str8 = str4;
            }
            if ((i12 & 64) != 0) {
                attrUnit2 = attrInfo.unit;
            } else {
                attrUnit2 = attrUnit;
            }
            if ((i12 & 128) != 0) {
                extraAttributeOptionEntity2 = attrInfo.option;
            } else {
                extraAttributeOptionEntity2 = extraAttributeOptionEntity;
            }
            return attrInfo.copy(i13, str5, str6, attributeType2, str7, str8, attrUnit2, extraAttributeOptionEntity2);
        }

        private final String getLocalizedValue(String str) {
            if (LocaleManager.f39597a.r()) {
                return l.a(str);
            }
            return str;
        }

        private final String getUnitStringValue() {
            ExtraAttributeEntity.LocalUnit unit;
            ExtraAttributeEntity.LocalUnit unit2;
            ExtraAttributeEntity.LocalUnit unit3;
            String str = null;
            try {
                int parseInt = Integer.parseInt(this.value);
                if (parseInt != 1) {
                    if (parseInt != 2) {
                        ExtraAttributeEntity.AttrUnit attrUnit = this.unit;
                        if (attrUnit != null && (unit3 = attrUnit.getUnit()) != null) {
                            str = unit3.getPlural();
                        }
                    } else {
                        ExtraAttributeEntity.AttrUnit attrUnit2 = this.unit;
                        if (attrUnit2 != null && (unit2 = attrUnit2.getUnit()) != null) {
                            str = unit2.getDual();
                        }
                    }
                } else {
                    ExtraAttributeEntity.AttrUnit attrUnit3 = this.unit;
                    if (attrUnit3 != null && (unit = attrUnit3.getUnit()) != null) {
                        str = unit.getSingular();
                    }
                }
            } catch (Exception unused) {
            }
            return str;
        }

        private final String getUnitStringValueLocalized(boolean z11) {
            ExtraAttributeEntity.LocalUnit en2;
            String singular;
            ExtraAttributeEntity.LocalUnit en3;
            ExtraAttributeEntity.LocalUnit en4;
            try {
                int parseInt = Integer.parseInt(this.value);
                if (parseInt != 1) {
                    if (parseInt != 2) {
                        if (z11) {
                            ExtraAttributeEntity.AttrUnit attrUnit = this.unit;
                            if (attrUnit == null || (en4 = attrUnit.getAr()) == null) {
                                return null;
                            }
                        } else {
                            ExtraAttributeEntity.AttrUnit attrUnit2 = this.unit;
                            if (attrUnit2 == null || (en4 = attrUnit2.getEn()) == null) {
                                return null;
                            }
                        }
                        singular = en4.getPlural();
                    } else {
                        if (z11) {
                            ExtraAttributeEntity.AttrUnit attrUnit3 = this.unit;
                            if (attrUnit3 == null || (en3 = attrUnit3.getAr()) == null) {
                                return null;
                            }
                        } else {
                            ExtraAttributeEntity.AttrUnit attrUnit4 = this.unit;
                            if (attrUnit4 == null || (en3 = attrUnit4.getEn()) == null) {
                                return null;
                            }
                        }
                        singular = en3.getDual();
                    }
                } else {
                    if (z11) {
                        ExtraAttributeEntity.AttrUnit attrUnit5 = this.unit;
                        if (attrUnit5 == null || (en2 = attrUnit5.getAr()) == null) {
                            return null;
                        }
                    } else {
                        ExtraAttributeEntity.AttrUnit attrUnit6 = this.unit;
                        if (attrUnit6 == null || (en2 = attrUnit6.getEn()) == null) {
                            return null;
                        }
                    }
                    singular = en2.getSingular();
                }
                return singular;
            } catch (Exception unused) {
                return null;
            }
        }

        private final String getValueWithUnit() {
            String attributeLocalizedValue = getAttributeLocalizedValue();
            String unitStringValue = getUnitStringValue();
            if (unitStringValue == null) {
                unitStringValue = "";
            }
            return attributeLocalizedValue + " " + unitStringValue;
        }

        public final int component1() {
            return this.f22352id;
        }

        public final String component2() {
            return this.nameEn;
        }

        public final String component3() {
            return this.nameAr;
        }

        public final AttributeType component4() {
            return this.type;
        }

        public final String component5() {
            return this.iconUrl;
        }

        public final String component6() {
            return this.value;
        }

        public final ExtraAttributeEntity.AttrUnit component7() {
            return this.unit;
        }

        public final ExtraAttributeOptionEntity component8() {
            return this.option;
        }

        public final AttrInfo copy(int i11, String nameEn, String nameAr, AttributeType type, String iconUrl, String value, ExtraAttributeEntity.AttrUnit attrUnit, ExtraAttributeOptionEntity extraAttributeOptionEntity) {
            o.i(nameEn, "nameEn");
            o.i(nameAr, "nameAr");
            o.i(type, "type");
            o.i(iconUrl, "iconUrl");
            o.i(value, "value");
            return new AttrInfo(i11, nameEn, nameAr, type, iconUrl, value, attrUnit, extraAttributeOptionEntity);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AttrInfo)) {
                return false;
            }
            AttrInfo attrInfo = (AttrInfo) obj;
            if (this.f22352id == attrInfo.f22352id && o.d(this.nameEn, attrInfo.nameEn) && o.d(this.nameAr, attrInfo.nameAr) && this.type == attrInfo.type && o.d(this.iconUrl, attrInfo.iconUrl) && o.d(this.value, attrInfo.value) && o.d(this.unit, attrInfo.unit) && o.d(this.option, attrInfo.option)) {
                return true;
            }
            return false;
        }

        public final String getAttributeDisplayText() {
            int i11 = WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    return "";
                }
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 == 5) {
                            return "";
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    return getName();
                }
                ExtraAttributeOptionEntity extraAttributeOptionEntity = this.option;
                if (extraAttributeOptionEntity != null) {
                    return extraAttributeOptionEntity.getName();
                }
                return null;
            }
            return getValueWithUnit();
        }

        public final Pair<String, String> getAttributeDisplayTextLocalized() {
            String nameAr;
            int i11 = WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()];
            String str = "";
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4 && i11 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        ExtraAttributeOptionEntity extraAttributeOptionEntity = this.option;
                        String str2 = (extraAttributeOptionEntity == null || (str2 = extraAttributeOptionEntity.getNameEn()) == null) ? "" : "";
                        ExtraAttributeOptionEntity extraAttributeOptionEntity2 = this.option;
                        if (extraAttributeOptionEntity2 != null && (nameAr = extraAttributeOptionEntity2.getNameAr()) != null) {
                            str = nameAr;
                        }
                        return new Pair<>(str2, str);
                    }
                }
                return new Pair<>("", "");
            }
            l lVar = l.f40329a;
            String b11 = lVar.b(this.value);
            String unitStringValueLocalized = getUnitStringValueLocalized(false);
            if (unitStringValueLocalized == null) {
                unitStringValueLocalized = "";
            }
            String str3 = b11 + " " + unitStringValueLocalized;
            String a11 = l.a(lVar.b(this.value));
            String unitStringValueLocalized2 = getUnitStringValueLocalized(true);
            if (unitStringValueLocalized2 != null) {
                str = unitStringValueLocalized2;
            }
            return new Pair<>(str3, a11 + " " + str);
        }

        public final String getAttributeLocalizedValue() {
            try {
                return getLocalizedValue(l.f40329a.b(this.value));
            } catch (Exception unused) {
                return this.value;
            }
        }

        public final String getIconUrl() {
            return this.iconUrl;
        }

        public final int getId() {
            return this.f22352id;
        }

        public final String getName() {
            CharSequence Z0;
            CharSequence Z02;
            if (LocaleManager.f39597a.r()) {
                String str = this.nameAr;
                if (str != null) {
                    Z02 = StringsKt__StringsKt.Z0(str);
                    return Z02.toString();
                }
                return null;
            }
            String str2 = this.nameEn;
            if (str2 != null) {
                Z0 = StringsKt__StringsKt.Z0(str2);
                return Z0.toString();
            }
            return null;
        }

        public final String getNameAr() {
            return this.nameAr;
        }

        public final String getNameEn() {
            return this.nameEn;
        }

        public final ExtraAttributeOptionEntity getOption() {
            return this.option;
        }

        public final AttributeType getType() {
            return this.type;
        }

        public final ExtraAttributeEntity.AttrUnit getUnit() {
            return this.unit;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = ((((((((((Integer.hashCode(this.f22352id) * 31) + this.nameEn.hashCode()) * 31) + this.nameAr.hashCode()) * 31) + this.type.hashCode()) * 31) + this.iconUrl.hashCode()) * 31) + this.value.hashCode()) * 31;
            ExtraAttributeEntity.AttrUnit attrUnit = this.unit;
            int i11 = 0;
            if (attrUnit == null) {
                hashCode = 0;
            } else {
                hashCode = attrUnit.hashCode();
            }
            int i12 = (hashCode2 + hashCode) * 31;
            ExtraAttributeOptionEntity extraAttributeOptionEntity = this.option;
            if (extraAttributeOptionEntity != null) {
                i11 = extraAttributeOptionEntity.hashCode();
            }
            return i12 + i11;
        }

        public final void setValue(String str) {
            o.i(str, "<set-?>");
            this.value = str;
        }

        public String toString() {
            int i11 = this.f22352id;
            String str = this.nameEn;
            String str2 = this.nameAr;
            AttributeType attributeType = this.type;
            String str3 = this.iconUrl;
            String str4 = this.value;
            ExtraAttributeEntity.AttrUnit attrUnit = this.unit;
            ExtraAttributeOptionEntity extraAttributeOptionEntity = this.option;
            return "AttrInfo(id=" + i11 + ", nameEn=" + str + ", nameAr=" + str2 + ", type=" + attributeType + ", iconUrl=" + str3 + ", value=" + str4 + ", unit=" + attrUnit + ", option=" + extraAttributeOptionEntity + ")";
        }
    }

    /* compiled from: ListingItemBrief.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ListingItemBrief mockItemBrief(int i11) {
            return new ListingItemBrief("", "", -1, "", "", "", "", i11, 0, 0, 0, 0, 0, 0, Utils.DOUBLE_EPSILON, -1, ItemStatus.NORMAL, "", "", 1, "", null, null, "", null, null, null, null, 201326592, null);
        }
    }

    /* compiled from: ListingItemBrief.kt */
    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<ListingItemBrief> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ListingItemBrief createFromParcel(Parcel parcel) {
            int i11;
            ArrayList arrayList;
            o.i(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            int readInt5 = parcel.readInt();
            int readInt6 = parcel.readInt();
            int readInt7 = parcel.readInt();
            int readInt8 = parcel.readInt();
            double readDouble = parcel.readDouble();
            int readInt9 = parcel.readInt();
            ItemStatus valueOf = parcel.readInt() == 0 ? null : ItemStatus.valueOf(parcel.readString());
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            int readInt10 = parcel.readInt();
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            DistrictName createFromParcel = parcel.readInt() == 0 ? null : DistrictName.CREATOR.createFromParcel(parcel);
            String readString11 = parcel.readString();
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString12 = parcel.readString();
            if (parcel.readInt() == 0) {
                i11 = readInt7;
                arrayList = null;
            } else {
                int readInt11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt11);
                i11 = readInt7;
                int i12 = 0;
                while (i12 != readInt11) {
                    arrayList2.add(ExtraAttr.CREATOR.createFromParcel(parcel));
                    i12++;
                    readInt11 = readInt11;
                }
                arrayList = arrayList2;
            }
            return new ListingItemBrief(readString, readString2, readInt, readString3, readString4, readString5, readString6, readInt2, readInt3, readInt4, readInt5, readInt6, i11, readInt8, readDouble, readInt9, valueOf, readString7, readString8, readInt10, readString9, readString10, createFromParcel, readString11, valueOf2, readString12, arrayList, parcel.readInt() == 0 ? null : UserType.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ListingItemBrief[] newArray(int i11) {
            return new ListingItemBrief[i11];
        }
    }

    /* compiled from: ListingItemBrief.kt */
    /* loaded from: classes2.dex */
    public static final class DistrictName implements Parcelable {
        @c(SearchPlaceholderKeywordEntity.AR)
        private final String Ar;
        @c(SearchPlaceholderKeywordEntity.EN)
        private final String En;
        public static final Parcelable.Creator<DistrictName> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: ListingItemBrief.kt */
        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<DistrictName> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DistrictName createFromParcel(Parcel parcel) {
                o.i(parcel, "parcel");
                return new DistrictName(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DistrictName[] newArray(int i11) {
                return new DistrictName[i11];
            }
        }

        public DistrictName(String str, String str2) {
            this.Ar = str;
            this.En = str2;
        }

        public static /* synthetic */ DistrictName copy$default(DistrictName districtName, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = districtName.Ar;
            }
            if ((i11 & 2) != 0) {
                str2 = districtName.En;
            }
            return districtName.copy(str, str2);
        }

        public final String component1() {
            return this.Ar;
        }

        public final String component2() {
            return this.En;
        }

        public final DistrictName copy(String str, String str2) {
            return new DistrictName(str, str2);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DistrictName)) {
                return false;
            }
            DistrictName districtName = (DistrictName) obj;
            if (o.d(this.Ar, districtName.Ar) && o.d(this.En, districtName.En)) {
                return true;
            }
            return false;
        }

        public final String getAr() {
            return this.Ar;
        }

        public final String getEn() {
            return this.En;
        }

        public final String getName() {
            CharSequence Z0;
            CharSequence Z02;
            if (LocaleManager.f39597a.r()) {
                String str = this.Ar;
                if (str != null) {
                    Z02 = StringsKt__StringsKt.Z0(str);
                    return Z02.toString();
                }
                return null;
            }
            String str2 = this.En;
            if (str2 != null) {
                Z0 = StringsKt__StringsKt.Z0(str2);
                return Z0.toString();
            }
            return null;
        }

        public int hashCode() {
            int hashCode;
            String str = this.Ar;
            int i11 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i12 = hashCode * 31;
            String str2 = this.En;
            if (str2 != null) {
                i11 = str2.hashCode();
            }
            return i12 + i11;
        }

        public String toString() {
            String str = this.Ar;
            String str2 = this.En;
            return "DistrictName(Ar=" + str + ", En=" + str2 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            o.i(out, "out");
            out.writeString(this.Ar);
            out.writeString(this.En);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ ListingItemBrief(java.lang.String r32, java.lang.String r33, int r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, int r39, int r40, int r41, int r42, int r43, int r44, int r45, double r46, int r48, com.forsale.app.datalayer.network.responses.listingdetails.ItemStatus r49, java.lang.String r50, java.lang.String r51, int r52, java.lang.String r53, java.lang.String r54, com.forsale.app.datalayer.network.responses.ListingItemBrief.DistrictName r55, java.lang.String r56, java.lang.Integer r57, java.lang.String r58, java.util.List r59, com.forsale.app.datalayer.network.requestsbodies.UserType r60, int r61, kotlin.jvm.internal.DefaultConstructorMarker r62) {
        /*
            r31 = this;
            r0 = 65536(0x10000, float:9.18355E-41)
            r0 = r61 & r0
            if (r0 == 0) goto Lb
            com.forsale.app.datalayer.network.responses.listingdetails.ItemStatus r0 = com.forsale.app.datalayer.network.responses.listingdetails.ItemStatus.NORMAL
            r19 = r0
            goto Ld
        Lb:
            r19 = r49
        Ld:
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r0 = r61 & r0
            if (r0 == 0) goto L1a
            java.util.List r0 = kotlin.collections.p.n()
            r29 = r0
            goto L1c
        L1a:
            r29 = r59
        L1c:
            r0 = 134217728(0x8000000, float:3.85186E-34)
            r0 = r61 & r0
            if (r0 == 0) goto L26
            r0 = 0
            r30 = r0
            goto L28
        L26:
            r30 = r60
        L28:
            r1 = r31
            r2 = r32
            r3 = r33
            r4 = r34
            r5 = r35
            r6 = r36
            r7 = r37
            r8 = r38
            r9 = r39
            r10 = r40
            r11 = r41
            r12 = r42
            r13 = r43
            r14 = r44
            r15 = r45
            r16 = r46
            r18 = r48
            r20 = r50
            r21 = r51
            r22 = r52
            r23 = r53
            r24 = r54
            r25 = r55
            r26 = r56
            r27 = r57
            r28 = r58
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.network.responses.ListingItemBrief.<init>(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, int, int, int, int, double, int, com.forsale.app.datalayer.network.responses.listingdetails.ItemStatus, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, com.forsale.app.datalayer.network.responses.ListingItemBrief$DistrictName, java.lang.String, java.lang.Integer, java.lang.String, java.util.List, com.forsale.app.datalayer.network.requestsbodies.UserType, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    private final String component2() {
        return this._thumb;
    }

    private final String getAttributeValue(int i11) {
        Object obj;
        boolean z11;
        List<ExtraAttr> list = this.extraAttrs;
        if (list == null) {
            return null;
        }
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                obj = it2.next();
                if (((ExtraAttr) obj).getId() == i11) {
                    z11 = true;
                    continue;
                } else {
                    z11 = false;
                    continue;
                }
                if (z11) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        ExtraAttr extraAttr = (ExtraAttr) obj;
        if (extraAttr == null) {
            return null;
        }
        return extraAttr.getValue();
    }

    private final List<AttrInfo> getItemAttributesInfo(List<AttrInfo> list) {
        List n11;
        int y11;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                AttrInfo attrInfo = (AttrInfo) obj;
                List<ExtraAttr> list2 = this.extraAttrs;
                if (list2 == null) {
                    n11 = r.n();
                } else {
                    List<ExtraAttr> list3 = list2;
                    y11 = s.y(list3, 10);
                    n11 = new ArrayList(y11);
                    for (ExtraAttr extraAttr : list3) {
                        n11.add(Integer.valueOf(extraAttr.getId()));
                    }
                }
                if (n11.contains(Integer.valueOf(attrInfo.getId()))) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        return null;
    }

    public static /* synthetic */ AdsModel toAdsModel$default(ListingItemBrief listingItemBrief, AdType adType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            adType = AdType.PIN;
        }
        return listingItemBrief.toAdsModel(adType);
    }

    public final String component1() {
        return this.image;
    }

    public final int component10() {
        return this.isHideMyNumber;
    }

    public final int component11() {
        return this.isAnon;
    }

    public final int component12() {
        return this.isPrem;
    }

    public final int component13() {
        return this.isVideoPaid;
    }

    public final int component14() {
        return this.isVoip;
    }

    public final double component15() {
        return this.price;
    }

    public final int component16() {
        return this.regId;
    }

    public final ItemStatus component17() {
        return this.status;
    }

    public final String component18() {
        return this.title;
    }

    public final String component19() {
        return this.url;
    }

    public final int component20() {
        return this.wasPromoted;
    }

    public final String component21() {
        return this.phone;
    }

    public final String component22() {
        return this.districtNameDefault;
    }

    public final DistrictName component23() {
        return this.districtNameLocalize;
    }

    public final String component24() {
        return this.description;
    }

    public final Integer component25() {
        return this.expireSoon;
    }

    public final String component26() {
        return this.virtualTourThumb;
    }

    public final List<ExtraAttr> component27() {
        return this.extraAttrs;
    }

    public final UserType component28() {
        return this.userType;
    }

    public final int component3() {
        return this.catId;
    }

    public final String component4() {
        return this.contact;
    }

    public final String component5() {
        return this.datePublished;
    }

    public final String component6() {
        return this.dateSort;
    }

    public final String component7() {
        return this.doNotDisturb;
    }

    public final int component8() {
        return this.f22351id;
    }

    public final int component9() {
        return this.imagesCount;
    }

    public final ListingItemBrief copy(String str, String str2, int i11, String str3, String str4, String str5, String str6, int i12, int i13, int i14, int i15, int i16, int i17, int i18, double d11, int i19, ItemStatus itemStatus, String str7, String str8, int i21, String str9, String str10, DistrictName districtName, String str11, Integer num, String str12, List<ExtraAttr> list, UserType userType) {
        return new ListingItemBrief(str, str2, i11, str3, str4, str5, str6, i12, i13, i14, i15, i16, i17, i18, d11, i19, itemStatus, str7, str8, i21, str9, str10, districtName, str11, num, str12, list, userType);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListingItemBrief)) {
            return false;
        }
        ListingItemBrief listingItemBrief = (ListingItemBrief) obj;
        if (o.d(this.image, listingItemBrief.image) && o.d(this._thumb, listingItemBrief._thumb) && this.catId == listingItemBrief.catId && o.d(this.contact, listingItemBrief.contact) && o.d(this.datePublished, listingItemBrief.datePublished) && o.d(this.dateSort, listingItemBrief.dateSort) && o.d(this.doNotDisturb, listingItemBrief.doNotDisturb) && this.f22351id == listingItemBrief.f22351id && this.imagesCount == listingItemBrief.imagesCount && this.isHideMyNumber == listingItemBrief.isHideMyNumber && this.isAnon == listingItemBrief.isAnon && this.isPrem == listingItemBrief.isPrem && this.isVideoPaid == listingItemBrief.isVideoPaid && this.isVoip == listingItemBrief.isVoip && Double.compare(this.price, listingItemBrief.price) == 0 && this.regId == listingItemBrief.regId && this.status == listingItemBrief.status && o.d(this.title, listingItemBrief.title) && o.d(this.url, listingItemBrief.url) && this.wasPromoted == listingItemBrief.wasPromoted && o.d(this.phone, listingItemBrief.phone) && o.d(this.districtNameDefault, listingItemBrief.districtNameDefault) && o.d(this.districtNameLocalize, listingItemBrief.districtNameLocalize) && o.d(this.description, listingItemBrief.description) && o.d(this.expireSoon, listingItemBrief.expireSoon) && o.d(this.virtualTourThumb, listingItemBrief.virtualTourThumb) && o.d(this.extraAttrs, listingItemBrief.extraAttrs) && this.userType == listingItemBrief.userType) {
            return true;
        }
        return false;
    }

    public final String getArchiveReason() {
        return this.archiveReason;
    }

    public final List<AttrInfo> getAttrsInfo() {
        return this.attrsInfo;
    }

    @Override // com.forsale.app.datalayer.network.responses.ListingItemBase
    public int getCatId() {
        return this.catId;
    }

    public final TextHolder getCatName() {
        return this.catName;
    }

    @Override // com.forsale.app.datalayer.network.responses.ListingItemBase
    public String getContact() {
        return this.contact;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0006, code lost:
        r0 = kotlin.text.StringsKt__StringsKt.F0(r0, new java.lang.String[]{","}, false, 0, 6, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<java.lang.String> getContactNumbers() {
        /*
            r6 = this;
            java.lang.String r0 = r6.getContact()
            if (r0 == 0) goto L16
            java.lang.String r1 = ","
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            java.util.List r0 = kotlin.text.k.F0(r0, r1, r2, r3, r4, r5)
            if (r0 != 0) goto L22
        L16:
            java.lang.String r0 = r6.getContact()
            if (r0 == 0) goto L21
            java.util.List r0 = kotlin.collections.p.e(r0)
            goto L22
        L21:
            r0 = 0
        L22:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.network.responses.ListingItemBrief.getContactNumbers():java.util.List");
    }

    @Override // com.forsale.app.datalayer.network.responses.ListingItemBase
    public String getDatePublished() {
        return this.datePublished;
    }

    @Override // com.forsale.app.datalayer.network.responses.ListingItemBase
    public String getDateSort() {
        return this.dateSort;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDistrictName() {
        DistrictName districtName = this.districtNameLocalize;
        if (districtName != null) {
            return districtName.getName();
        }
        return null;
    }

    public final String getDistrictNameDefault() {
        return this.districtNameDefault;
    }

    public final DistrictName getDistrictNameLocalize() {
        return this.districtNameLocalize;
    }

    @Override // com.forsale.app.datalayer.network.responses.ListingItemBase
    public String getDoNotDisturb() {
        return this.doNotDisturb;
    }

    public final Integer getExpireSoon() {
        return this.expireSoon;
    }

    public final List<ExtraAttr> getExtraAttrs() {
        return this.extraAttrs;
    }

    @Override // com.forsale.app.datalayer.network.responses.ListingItemBase
    public int getId() {
        return this.f22351id;
    }

    public final String getImage() {
        return this.image;
    }

    @Override // com.forsale.app.datalayer.network.responses.ListingItemBase
    public int getImagesCount() {
        return this.imagesCount;
    }

    public final TextHolder getParentCatName() {
        return this.parentCatName;
    }

    @Override // com.forsale.app.datalayer.network.responses.ListingItemBase
    public String getPhone() {
        return this.phone;
    }

    @Override // com.forsale.app.datalayer.network.responses.ListingItemBase
    public double getPrice() {
        return this.price;
    }

    @Override // com.forsale.app.datalayer.network.responses.ListingItemBase
    public int getRegId() {
        return this.regId;
    }

    @Override // com.forsale.app.datalayer.network.responses.ListingItemBase
    public ItemStatus getStatus() {
        return this.status;
    }

    public final String getThumb() {
        if (getImagesCount() == 0) {
            return null;
        }
        return this._thumb;
    }

    @Override // com.forsale.app.datalayer.network.responses.ListingItemBase
    public String getTitle() {
        return this.title;
    }

    @Override // com.forsale.app.datalayer.network.responses.ListingItemBase
    public String getUrl() {
        return this.url;
    }

    public final UserType getUserType() {
        return this.userType;
    }

    public final String getVirtualTourThumb() {
        return this.virtualTourThumb;
    }

    @Override // com.forsale.app.datalayer.network.responses.ListingItemBase
    public int getWasPromoted() {
        return this.wasPromoted;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        String str = this.image;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = hashCode * 31;
        String str2 = this._thumb;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode17 = (((i12 + hashCode2) * 31) + Integer.hashCode(this.catId)) * 31;
        String str3 = this.contact;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (hashCode17 + hashCode3) * 31;
        String str4 = this.datePublished;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        String str5 = this.dateSort;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i15 = (i14 + hashCode5) * 31;
        String str6 = this.doNotDisturb;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int hashCode18 = (((((((((((((((((((i15 + hashCode6) * 31) + Integer.hashCode(this.f22351id)) * 31) + Integer.hashCode(this.imagesCount)) * 31) + Integer.hashCode(this.isHideMyNumber)) * 31) + Integer.hashCode(this.isAnon)) * 31) + Integer.hashCode(this.isPrem)) * 31) + Integer.hashCode(this.isVideoPaid)) * 31) + Integer.hashCode(this.isVoip)) * 31) + Double.hashCode(this.price)) * 31) + Integer.hashCode(this.regId)) * 31;
        ItemStatus itemStatus = this.status;
        if (itemStatus == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = itemStatus.hashCode();
        }
        int i16 = (hashCode18 + hashCode7) * 31;
        String str7 = this.title;
        if (str7 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str7.hashCode();
        }
        int i17 = (i16 + hashCode8) * 31;
        String str8 = this.url;
        if (str8 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str8.hashCode();
        }
        int hashCode19 = (((i17 + hashCode9) * 31) + Integer.hashCode(this.wasPromoted)) * 31;
        String str9 = this.phone;
        if (str9 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str9.hashCode();
        }
        int i18 = (hashCode19 + hashCode10) * 31;
        String str10 = this.districtNameDefault;
        if (str10 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str10.hashCode();
        }
        int i19 = (i18 + hashCode11) * 31;
        DistrictName districtName = this.districtNameLocalize;
        if (districtName == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = districtName.hashCode();
        }
        int i21 = (i19 + hashCode12) * 31;
        String str11 = this.description;
        if (str11 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = str11.hashCode();
        }
        int i22 = (i21 + hashCode13) * 31;
        Integer num = this.expireSoon;
        if (num == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = num.hashCode();
        }
        int i23 = (i22 + hashCode14) * 31;
        String str12 = this.virtualTourThumb;
        if (str12 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = str12.hashCode();
        }
        int i24 = (i23 + hashCode15) * 31;
        List<ExtraAttr> list = this.extraAttrs;
        if (list == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = list.hashCode();
        }
        int i25 = (i24 + hashCode16) * 31;
        UserType userType = this.userType;
        if (userType != null) {
            i11 = userType.hashCode();
        }
        return i25 + i11;
    }

    @Override // com.forsale.app.datalayer.network.responses.ListingItemBase
    public int isAnon() {
        return this.isAnon;
    }

    @Override // com.forsale.app.datalayer.network.responses.ListingItemBase
    public int isHideMyNumber() {
        return this.isHideMyNumber;
    }

    @Override // com.forsale.app.datalayer.network.responses.ListingItemBase
    public int isPrem() {
        return this.isPrem;
    }

    @Override // com.forsale.app.datalayer.network.responses.ListingItemBase
    public int isVideoPaid() {
        return this.isVideoPaid;
    }

    @Override // com.forsale.app.datalayer.network.responses.ListingItemBase
    public int isVoip() {
        return this.isVoip;
    }

    public final void setArchiveReason(String str) {
        this.archiveReason = str;
    }

    public final void setAttrsInfo(List<AttrInfo> list) {
        this.attrsInfo = list;
    }

    public final void setCatName(TextHolder textHolder) {
        this.catName = textHolder;
    }

    public final void setExtraAttrs(List<ExtraAttr> list) {
        this.extraAttrs = list;
    }

    public final void setParentCatName(TextHolder textHolder) {
        this.parentCatName = textHolder;
    }

    public final AdsModel toAdsModel(AdType adType) {
        String phone;
        o.i(adType, "adType");
        int id2 = getId();
        String title = getTitle();
        if (title == null) {
            title = "";
        }
        String str = title;
        String str2 = this.image;
        List<String> contactNumbers = getContactNumbers();
        if (contactNumbers == null || (phone = contactNumbers.get(0)) == null) {
            phone = getPhone();
        }
        return new AdsModel(id2, str, str2, phone, Integer.valueOf(getCatId()), adType, null, null, null, null, null, getUrl(), 1792, null);
    }

    public String toString() {
        String str = this.image;
        String str2 = this._thumb;
        int i11 = this.catId;
        String str3 = this.contact;
        String str4 = this.datePublished;
        String str5 = this.dateSort;
        String str6 = this.doNotDisturb;
        int i12 = this.f22351id;
        int i13 = this.imagesCount;
        int i14 = this.isHideMyNumber;
        int i15 = this.isAnon;
        int i16 = this.isPrem;
        int i17 = this.isVideoPaid;
        int i18 = this.isVoip;
        double d11 = this.price;
        int i19 = this.regId;
        ItemStatus itemStatus = this.status;
        String str7 = this.title;
        String str8 = this.url;
        int i21 = this.wasPromoted;
        String str9 = this.phone;
        String str10 = this.districtNameDefault;
        DistrictName districtName = this.districtNameLocalize;
        String str11 = this.description;
        Integer num = this.expireSoon;
        String str12 = this.virtualTourThumb;
        List<ExtraAttr> list = this.extraAttrs;
        UserType userType = this.userType;
        return "ListingItemBrief(image=" + str + ", _thumb=" + str2 + ", catId=" + i11 + ", contact=" + str3 + ", datePublished=" + str4 + ", dateSort=" + str5 + ", doNotDisturb=" + str6 + ", id=" + i12 + ", imagesCount=" + i13 + ", isHideMyNumber=" + i14 + ", isAnon=" + i15 + ", isPrem=" + i16 + ", isVideoPaid=" + i17 + ", isVoip=" + i18 + ", price=" + d11 + ", regId=" + i19 + ", status=" + itemStatus + ", title=" + str7 + ", url=" + str8 + ", wasPromoted=" + i21 + ", phone=" + str9 + ", districtNameDefault=" + str10 + ", districtNameLocalize=" + districtName + ", description=" + str11 + ", expireSoon=" + num + ", virtualTourThumb=" + str12 + ", extraAttrs=" + list + ", userType=" + userType + ")";
    }

    public final void updateAttrsInfo(List<AttrInfo> list, List<ExtraAttributeOptionEntity> list2) {
        int y11;
        ExtraAttributeOptionEntity extraAttributeOptionEntity;
        Object obj;
        List<AttrInfo> itemAttributesInfo = getItemAttributesInfo(list);
        ArrayList arrayList = null;
        if (itemAttributesInfo != null) {
            List<AttrInfo> list3 = itemAttributesInfo;
            y11 = s.y(list3, 10);
            ArrayList arrayList2 = new ArrayList(y11);
            for (AttrInfo attrInfo : list3) {
                String attributeValue = getAttributeValue(attrInfo.getId());
                if (attributeValue == null) {
                    attributeValue = "";
                }
                String str = attributeValue;
                if (list2 != null) {
                    Iterator<T> it2 = list2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj = it2.next();
                            if (o.d(String.valueOf(((ExtraAttributeOptionEntity) obj).getId()), str)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    extraAttributeOptionEntity = (ExtraAttributeOptionEntity) obj;
                } else {
                    extraAttributeOptionEntity = null;
                }
                arrayList2.add(AttrInfo.copy$default(attrInfo, 0, null, null, null, null, str, null, extraAttributeOptionEntity, 95, null));
            }
            arrayList = arrayList2;
        }
        this.attrsInfo = arrayList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        o.i(out, "out");
        out.writeString(this.image);
        out.writeString(this._thumb);
        out.writeInt(this.catId);
        out.writeString(this.contact);
        out.writeString(this.datePublished);
        out.writeString(this.dateSort);
        out.writeString(this.doNotDisturb);
        out.writeInt(this.f22351id);
        out.writeInt(this.imagesCount);
        out.writeInt(this.isHideMyNumber);
        out.writeInt(this.isAnon);
        out.writeInt(this.isPrem);
        out.writeInt(this.isVideoPaid);
        out.writeInt(this.isVoip);
        out.writeDouble(this.price);
        out.writeInt(this.regId);
        ItemStatus itemStatus = this.status;
        if (itemStatus == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(itemStatus.name());
        }
        out.writeString(this.title);
        out.writeString(this.url);
        out.writeInt(this.wasPromoted);
        out.writeString(this.phone);
        out.writeString(this.districtNameDefault);
        DistrictName districtName = this.districtNameLocalize;
        if (districtName == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            districtName.writeToParcel(out, i11);
        }
        out.writeString(this.description);
        Integer num = this.expireSoon;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        out.writeString(this.virtualTourThumb);
        List<ExtraAttr> list = this.extraAttrs;
        if (list == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list.size());
            for (ExtraAttr extraAttr : list) {
                extraAttr.writeToParcel(out, i11);
            }
        }
        UserType userType = this.userType;
        if (userType == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        userType.writeToParcel(out, i11);
    }

    public ListingItemBrief(String str, String str2, int i11, String str3, String str4, String str5, String str6, int i12, int i13, int i14, int i15, int i16, int i17, int i18, double d11, int i19, ItemStatus itemStatus, String str7, String str8, int i21, String str9, String str10, DistrictName districtName, String str11, Integer num, String str12, List<ExtraAttr> list, UserType userType) {
        this.image = str;
        this._thumb = str2;
        this.catId = i11;
        this.contact = str3;
        this.datePublished = str4;
        this.dateSort = str5;
        this.doNotDisturb = str6;
        this.f22351id = i12;
        this.imagesCount = i13;
        this.isHideMyNumber = i14;
        this.isAnon = i15;
        this.isPrem = i16;
        this.isVideoPaid = i17;
        this.isVoip = i18;
        this.price = d11;
        this.regId = i19;
        this.status = itemStatus;
        this.title = str7;
        this.url = str8;
        this.wasPromoted = i21;
        this.phone = str9;
        this.districtNameDefault = str10;
        this.districtNameLocalize = districtName;
        this.description = str11;
        this.expireSoon = num;
        this.virtualTourThumb = str12;
        this.extraAttrs = list;
        this.userType = userType;
    }
}
