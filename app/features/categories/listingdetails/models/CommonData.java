package com.forsale.app.features.categories.listingdetails.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.forsale.app.datalayer.network.responses.listingdetails.BuyerListingDetailsResponseModel;
import com.forsale.app.features.categories.listingdetails.buyerctas.CTAsVisibility;
import com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesMapper;
import com.forsale.app.features.categories.user.profile.UserProfileData;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
/* compiled from: DetailsModel.kt */
/* loaded from: classes2.dex */
public final class CommonData implements Parcelable {
    public static final Parcelable.Creator<CommonData> CREATOR = new a();

    /* renamed from: a0  reason: collision with root package name */
    public static final int f26984a0 = 8;
    private final List<AttributesMapper.AttributesDataModel> A;
    private final List<BuyerListingDetailsResponseModel.Data.Listing.ExtraAttribute> B;
    private final String C;
    private final String D;
    private final List<String> E;
    private final String F;
    private final BuyerListingDetailsResponseModel.Data.Listing.ExtraInfo.VirtualTour G;
    private final BuyerListingDetailsResponseModel.Data.Listing.ExtraInfo H;
    private final boolean I;
    private final String J;
    private final List<String> K;
    private final Boolean L;
    private final Boolean M;
    private final BuyerListingDetailsResponseModel.Data.Listing.User N;
    private final boolean O;
    private final boolean P;
    private final CTAsVisibility Q;
    private final int R;
    private final String S;
    private final String T;
    private final BuyerListingDetailsResponseModel.ListingType U;
    private final String V;
    private final UserProfileData W;
    private final boolean X;
    private final boolean Y;
    private final boolean Z;

    /* renamed from: a  reason: collision with root package name */
    private final String f26985a;

    /* renamed from: b  reason: collision with root package name */
    private final String f26986b;

    /* renamed from: c  reason: collision with root package name */
    private final String f26987c;

    /* renamed from: d  reason: collision with root package name */
    private final String f26988d;

    /* renamed from: e  reason: collision with root package name */
    private final String f26989e;

    /* renamed from: f  reason: collision with root package name */
    private final String f26990f;

    /* renamed from: g  reason: collision with root package name */
    private final int f26991g;

    /* renamed from: h  reason: collision with root package name */
    private final String f26992h;

    /* renamed from: i  reason: collision with root package name */
    private final String f26993i;

    /* renamed from: j  reason: collision with root package name */
    private final String f26994j;

    /* renamed from: x  reason: collision with root package name */
    private final String f26995x;

    /* renamed from: y  reason: collision with root package name */
    private final String f26996y;

    /* renamed from: z  reason: collision with root package name */
    private final int f26997z;

    /* compiled from: DetailsModel.kt */
    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<CommonData> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final CommonData createFromParcel(Parcel parcel) {
            int i11;
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            BuyerListingDetailsResponseModel.Data.Listing.ExtraInfo.VirtualTour createFromParcel;
            BuyerListingDetailsResponseModel.Data.Listing.ExtraInfo createFromParcel2;
            boolean z11;
            boolean z12;
            Boolean valueOf;
            boolean z13;
            Boolean valueOf2;
            BuyerListingDetailsResponseModel.Data.Listing.User createFromParcel3;
            boolean z14;
            boolean z15;
            BuyerListingDetailsResponseModel.ListingType createFromParcel4;
            boolean z16;
            boolean z17;
            boolean z18;
            o.i(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            int readInt = parcel.readInt();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            String readString11 = parcel.readString();
            int readInt2 = parcel.readInt();
            if (parcel.readInt() == 0) {
                i11 = readInt2;
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt3);
                i11 = readInt2;
                int i12 = 0;
                while (i12 != readInt3) {
                    arrayList4.add(parcel.readSerializable());
                    i12++;
                    readInt3 = readInt3;
                }
                arrayList = arrayList4;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = arrayList;
                arrayList3 = null;
            } else {
                int readInt4 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(readInt4);
                arrayList2 = arrayList;
                int i13 = 0;
                while (i13 != readInt4) {
                    arrayList5.add(BuyerListingDetailsResponseModel.Data.Listing.ExtraAttribute.CREATOR.createFromParcel(parcel));
                    i13++;
                    readInt4 = readInt4;
                }
                arrayList3 = arrayList5;
            }
            String readString12 = parcel.readString();
            String readString13 = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            String readString14 = parcel.readString();
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = BuyerListingDetailsResponseModel.Data.Listing.ExtraInfo.VirtualTour.CREATOR.createFromParcel(parcel);
            }
            BuyerListingDetailsResponseModel.Data.Listing.ExtraInfo.VirtualTour virtualTour = createFromParcel;
            if (parcel.readInt() == 0) {
                createFromParcel2 = null;
            } else {
                createFromParcel2 = BuyerListingDetailsResponseModel.Data.Listing.ExtraInfo.CREATOR.createFromParcel(parcel);
            }
            BuyerListingDetailsResponseModel.Data.Listing.ExtraInfo extraInfo = createFromParcel2;
            if (parcel.readInt() != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            String readString15 = parcel.readString();
            ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                valueOf = Boolean.valueOf(z12);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                valueOf2 = Boolean.valueOf(z13);
            }
            if (parcel.readInt() == 0) {
                createFromParcel3 = null;
            } else {
                createFromParcel3 = BuyerListingDetailsResponseModel.Data.Listing.User.CREATOR.createFromParcel(parcel);
            }
            BuyerListingDetailsResponseModel.Data.Listing.User user = createFromParcel3;
            if (parcel.readInt() != 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (parcel.readInt() != 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            CTAsVisibility cTAsVisibility = (CTAsVisibility) parcel.readSerializable();
            int readInt5 = parcel.readInt();
            String readString16 = parcel.readString();
            String readString17 = parcel.readString();
            if (parcel.readInt() == 0) {
                createFromParcel4 = null;
            } else {
                createFromParcel4 = BuyerListingDetailsResponseModel.ListingType.CREATOR.createFromParcel(parcel);
            }
            BuyerListingDetailsResponseModel.ListingType listingType = createFromParcel4;
            String readString18 = parcel.readString();
            UserProfileData userProfileData = (UserProfileData) parcel.readParcelable(CommonData.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (parcel.readInt() != 0) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (parcel.readInt() != 0) {
                z18 = true;
            } else {
                z18 = false;
            }
            return new CommonData(readString, readString2, readString3, readString4, readString5, readString6, readInt, readString7, readString8, readString9, readString10, readString11, i11, arrayList2, arrayList3, readString12, readString13, createStringArrayList, readString14, virtualTour, extraInfo, z11, readString15, createStringArrayList2, valueOf, valueOf2, user, z14, z15, cTAsVisibility, readInt5, readString16, readString17, listingType, readString18, userProfileData, z16, z17, z18);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final CommonData[] newArray(int i11) {
            return new CommonData[i11];
        }
    }

    public CommonData(String advId, String slug, String catId, String catName, String catFullPath, String catClassification, int i11, String title, String str, String dateSort, String str2, String str3, int i12, List<AttributesMapper.AttributesDataModel> list, List<BuyerListingDetailsResponseModel.Data.Listing.ExtraAttribute> list2, String str4, String str5, List<String> list3, String str6, BuyerListingDetailsResponseModel.Data.Listing.ExtraInfo.VirtualTour virtualTour, BuyerListingDetailsResponseModel.Data.Listing.ExtraInfo extraInfo, boolean z11, String phone, List<String> list4, Boolean bool, Boolean bool2, BuyerListingDetailsResponseModel.Data.Listing.User user, boolean z12, boolean z13, CTAsVisibility ctasVisibility, int i13, String regionName, String str7, BuyerListingDetailsResponseModel.ListingType listingType, String str8, UserProfileData userProfileData, boolean z14, boolean z15, boolean z16) {
        o.i(advId, "advId");
        o.i(slug, "slug");
        o.i(catId, "catId");
        o.i(catName, "catName");
        o.i(catFullPath, "catFullPath");
        o.i(catClassification, "catClassification");
        o.i(title, "title");
        o.i(dateSort, "dateSort");
        o.i(phone, "phone");
        o.i(ctasVisibility, "ctasVisibility");
        o.i(regionName, "regionName");
        this.f26985a = advId;
        this.f26986b = slug;
        this.f26987c = catId;
        this.f26988d = catName;
        this.f26989e = catFullPath;
        this.f26990f = catClassification;
        this.f26991g = i11;
        this.f26992h = title;
        this.f26993i = str;
        this.f26994j = dateSort;
        this.f26995x = str2;
        this.f26996y = str3;
        this.f26997z = i12;
        this.A = list;
        this.B = list2;
        this.C = str4;
        this.D = str5;
        this.E = list3;
        this.F = str6;
        this.G = virtualTour;
        this.H = extraInfo;
        this.I = z11;
        this.J = phone;
        this.K = list4;
        this.L = bool;
        this.M = bool2;
        this.N = user;
        this.O = z12;
        this.P = z13;
        this.Q = ctasVisibility;
        this.R = i13;
        this.S = regionName;
        this.T = str7;
        this.U = listingType;
        this.V = str8;
        this.W = userProfileData;
        this.X = z14;
        this.Y = z15;
        this.Z = z16;
    }

    public final String A() {
        return this.S;
    }

    public final String B() {
        return this.V;
    }

    public final boolean C() {
        return this.I;
    }

    public final String D() {
        return this.f26986b;
    }

    public final String E() {
        return this.f26992h;
    }

    public final BuyerListingDetailsResponseModel.Data.Listing.User F() {
        return this.N;
    }

    public final UserProfileData G() {
        return this.W;
    }

    public final String H() {
        return this.F;
    }

    public final int I() {
        return this.f26997z;
    }

    public final BuyerListingDetailsResponseModel.Data.Listing.ExtraInfo.VirtualTour J() {
        return this.G;
    }

    public final boolean K() {
        return this.O;
    }

    public final boolean L() {
        return this.Y;
    }

    public final Boolean M() {
        return this.L;
    }

    public final Boolean N() {
        return this.M;
    }

    public final boolean O() {
        return this.Z;
    }

    public final CommonData a(String advId, String slug, String catId, String catName, String catFullPath, String catClassification, int i11, String title, String str, String dateSort, String str2, String str3, int i12, List<AttributesMapper.AttributesDataModel> list, List<BuyerListingDetailsResponseModel.Data.Listing.ExtraAttribute> list2, String str4, String str5, List<String> list3, String str6, BuyerListingDetailsResponseModel.Data.Listing.ExtraInfo.VirtualTour virtualTour, BuyerListingDetailsResponseModel.Data.Listing.ExtraInfo extraInfo, boolean z11, String phone, List<String> list4, Boolean bool, Boolean bool2, BuyerListingDetailsResponseModel.Data.Listing.User user, boolean z12, boolean z13, CTAsVisibility ctasVisibility, int i13, String regionName, String str7, BuyerListingDetailsResponseModel.ListingType listingType, String str8, UserProfileData userProfileData, boolean z14, boolean z15, boolean z16) {
        o.i(advId, "advId");
        o.i(slug, "slug");
        o.i(catId, "catId");
        o.i(catName, "catName");
        o.i(catFullPath, "catFullPath");
        o.i(catClassification, "catClassification");
        o.i(title, "title");
        o.i(dateSort, "dateSort");
        o.i(phone, "phone");
        o.i(ctasVisibility, "ctasVisibility");
        o.i(regionName, "regionName");
        return new CommonData(advId, slug, catId, catName, catFullPath, catClassification, i11, title, str, dateSort, str2, str3, i12, list, list2, str4, str5, list3, str6, virtualTour, extraInfo, z11, phone, list4, bool, bool2, user, z12, z13, ctasVisibility, i13, regionName, str7, listingType, str8, userProfileData, z14, z15, z16);
    }

    public final String c() {
        return this.f26985a;
    }

    public final List<AttributesMapper.AttributesDataModel> d() {
        return this.A;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final List<BuyerListingDetailsResponseModel.Data.Listing.ExtraAttribute> e() {
        return this.B;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonData)) {
            return false;
        }
        CommonData commonData = (CommonData) obj;
        if (o.d(this.f26985a, commonData.f26985a) && o.d(this.f26986b, commonData.f26986b) && o.d(this.f26987c, commonData.f26987c) && o.d(this.f26988d, commonData.f26988d) && o.d(this.f26989e, commonData.f26989e) && o.d(this.f26990f, commonData.f26990f) && this.f26991g == commonData.f26991g && o.d(this.f26992h, commonData.f26992h) && o.d(this.f26993i, commonData.f26993i) && o.d(this.f26994j, commonData.f26994j) && o.d(this.f26995x, commonData.f26995x) && o.d(this.f26996y, commonData.f26996y) && this.f26997z == commonData.f26997z && o.d(this.A, commonData.A) && o.d(this.B, commonData.B) && o.d(this.C, commonData.C) && o.d(this.D, commonData.D) && o.d(this.E, commonData.E) && o.d(this.F, commonData.F) && o.d(this.G, commonData.G) && o.d(this.H, commonData.H) && this.I == commonData.I && o.d(this.J, commonData.J) && o.d(this.K, commonData.K) && o.d(this.L, commonData.L) && o.d(this.M, commonData.M) && o.d(this.N, commonData.N) && this.O == commonData.O && this.P == commonData.P && o.d(this.Q, commonData.Q) && this.R == commonData.R && o.d(this.S, commonData.S) && o.d(this.T, commonData.T) && this.U == commonData.U && o.d(this.V, commonData.V) && o.d(this.W, commonData.W) && this.X == commonData.X && this.Y == commonData.Y && this.Z == commonData.Z) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.P;
    }

    public final boolean g() {
        return this.X;
    }

    public final String h() {
        return this.f26990f;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
        int hashCode17;
        int hashCode18;
        int hashCode19 = ((((((((((((((this.f26985a.hashCode() * 31) + this.f26986b.hashCode()) * 31) + this.f26987c.hashCode()) * 31) + this.f26988d.hashCode()) * 31) + this.f26989e.hashCode()) * 31) + this.f26990f.hashCode()) * 31) + Integer.hashCode(this.f26991g)) * 31) + this.f26992h.hashCode()) * 31;
        String str = this.f26993i;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode20 = (((hashCode19 + hashCode) * 31) + this.f26994j.hashCode()) * 31;
        String str2 = this.f26995x;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (hashCode20 + hashCode2) * 31;
        String str3 = this.f26996y;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int hashCode21 = (((i12 + hashCode3) * 31) + Integer.hashCode(this.f26997z)) * 31;
        List<AttributesMapper.AttributesDataModel> list = this.A;
        if (list == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = list.hashCode();
        }
        int i13 = (hashCode21 + hashCode4) * 31;
        List<BuyerListingDetailsResponseModel.Data.Listing.ExtraAttribute> list2 = this.B;
        if (list2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = list2.hashCode();
        }
        int i14 = (i13 + hashCode5) * 31;
        String str4 = this.C;
        if (str4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str4.hashCode();
        }
        int i15 = (i14 + hashCode6) * 31;
        String str5 = this.D;
        if (str5 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str5.hashCode();
        }
        int i16 = (i15 + hashCode7) * 31;
        List<String> list3 = this.E;
        if (list3 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = list3.hashCode();
        }
        int i17 = (i16 + hashCode8) * 31;
        String str6 = this.F;
        if (str6 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str6.hashCode();
        }
        int i18 = (i17 + hashCode9) * 31;
        BuyerListingDetailsResponseModel.Data.Listing.ExtraInfo.VirtualTour virtualTour = this.G;
        if (virtualTour == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = virtualTour.hashCode();
        }
        int i19 = (i18 + hashCode10) * 31;
        BuyerListingDetailsResponseModel.Data.Listing.ExtraInfo extraInfo = this.H;
        if (extraInfo == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = extraInfo.hashCode();
        }
        int i21 = (i19 + hashCode11) * 31;
        boolean z11 = this.I;
        int i22 = 1;
        int i23 = z11;
        if (z11 != 0) {
            i23 = 1;
        }
        int hashCode22 = (((i21 + i23) * 31) + this.J.hashCode()) * 31;
        List<String> list4 = this.K;
        if (list4 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = list4.hashCode();
        }
        int i24 = (hashCode22 + hashCode12) * 31;
        Boolean bool = this.L;
        if (bool == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = bool.hashCode();
        }
        int i25 = (i24 + hashCode13) * 31;
        Boolean bool2 = this.M;
        if (bool2 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = bool2.hashCode();
        }
        int i26 = (i25 + hashCode14) * 31;
        BuyerListingDetailsResponseModel.Data.Listing.User user = this.N;
        if (user == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = user.hashCode();
        }
        int i27 = (i26 + hashCode15) * 31;
        boolean z12 = this.O;
        int i28 = z12;
        if (z12 != 0) {
            i28 = 1;
        }
        int i29 = (i27 + i28) * 31;
        boolean z13 = this.P;
        int i31 = z13;
        if (z13 != 0) {
            i31 = 1;
        }
        int hashCode23 = (((((((i29 + i31) * 31) + this.Q.hashCode()) * 31) + Integer.hashCode(this.R)) * 31) + this.S.hashCode()) * 31;
        String str7 = this.T;
        if (str7 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = str7.hashCode();
        }
        int i32 = (hashCode23 + hashCode16) * 31;
        BuyerListingDetailsResponseModel.ListingType listingType = this.U;
        if (listingType == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = listingType.hashCode();
        }
        int i33 = (i32 + hashCode17) * 31;
        String str8 = this.V;
        if (str8 == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = str8.hashCode();
        }
        int i34 = (i33 + hashCode18) * 31;
        UserProfileData userProfileData = this.W;
        if (userProfileData != null) {
            i11 = userProfileData.hashCode();
        }
        int i35 = (i34 + i11) * 31;
        boolean z14 = this.X;
        int i36 = z14;
        if (z14 != 0) {
            i36 = 1;
        }
        int i37 = (i35 + i36) * 31;
        boolean z15 = this.Y;
        int i38 = z15;
        if (z15 != 0) {
            i38 = 1;
        }
        int i39 = (i37 + i38) * 31;
        boolean z16 = this.Z;
        if (!z16) {
            i22 = z16 ? 1 : 0;
        }
        return i39 + i22;
    }

    public final String i() {
        return this.f26989e;
    }

    public final String j() {
        return this.f26987c;
    }

    public final String k() {
        return this.f26988d;
    }

    public final List<String> l() {
        return this.K;
    }

    public final CTAsVisibility m() {
        return this.Q;
    }

    public final String n() {
        return this.f26994j;
    }

    public final String o() {
        return this.f26993i;
    }

    public final String p() {
        return this.D;
    }

    public final String q() {
        return this.C;
    }

    public final int r() {
        return this.f26991g;
    }

    public final BuyerListingDetailsResponseModel.Data.Listing.ExtraInfo s() {
        return this.H;
    }

    public final List<String> t() {
        return this.E;
    }

    public String toString() {
        String str = this.f26985a;
        String str2 = this.f26986b;
        String str3 = this.f26987c;
        String str4 = this.f26988d;
        String str5 = this.f26989e;
        String str6 = this.f26990f;
        int i11 = this.f26991g;
        String str7 = this.f26992h;
        String str8 = this.f26993i;
        String str9 = this.f26994j;
        String str10 = this.f26995x;
        String str11 = this.f26996y;
        int i12 = this.f26997z;
        List<AttributesMapper.AttributesDataModel> list = this.A;
        List<BuyerListingDetailsResponseModel.Data.Listing.ExtraAttribute> list2 = this.B;
        String str12 = this.C;
        String str13 = this.D;
        List<String> list3 = this.E;
        String str14 = this.F;
        BuyerListingDetailsResponseModel.Data.Listing.ExtraInfo.VirtualTour virtualTour = this.G;
        BuyerListingDetailsResponseModel.Data.Listing.ExtraInfo extraInfo = this.H;
        boolean z11 = this.I;
        String str15 = this.J;
        List<String> list4 = this.K;
        Boolean bool = this.L;
        Boolean bool2 = this.M;
        BuyerListingDetailsResponseModel.Data.Listing.User user = this.N;
        boolean z12 = this.O;
        boolean z13 = this.P;
        CTAsVisibility cTAsVisibility = this.Q;
        int i13 = this.R;
        String str16 = this.S;
        String str17 = this.T;
        BuyerListingDetailsResponseModel.ListingType listingType = this.U;
        String str18 = this.V;
        UserProfileData userProfileData = this.W;
        boolean z14 = this.X;
        boolean z15 = this.Y;
        boolean z16 = this.Z;
        return "CommonData(advId=" + str + ", slug=" + str2 + ", catId=" + str3 + ", catName=" + str4 + ", catFullPath=" + str5 + ", catClassification=" + str6 + ", districtId=" + i11 + ", title=" + str7 + ", description=" + str8 + ", dateSort=" + str9 + ", price=" + str10 + ", priceWithCurrency=" + str11 + ", viewsCount=" + i12 + ", attributes=" + list + ", attrs=" + list2 + ", districtFullPath=" + str12 + ", districtEnFullPath=" + str13 + ", images=" + list3 + ", videoUrl=" + str14 + ", virtualTour=" + virtualTour + ", extraInfo=" + extraInfo + ", showMap=" + z11 + ", phone=" + str15 + ", contacts=" + list4 + ", isHideMyNumber=" + bool + ", isPrivateMessageEnabled=" + bool2 + ", user=" + user + ", isAnanoymous=" + z12 + ", canChat=" + z13 + ", ctasVisibility=" + cTAsVisibility + ", regionId=" + i13 + ", regionName=" + str16 + ", listingSource=" + str17 + ", listingType=" + listingType + ", sellerMemberSince=" + str18 + ", userProfileData=" + userProfileData + ", canOpenSellerProfile=" + z14 + ", isFollower=" + z15 + ", isRealtyUser=" + z16 + ")";
    }

    public final String u() {
        return this.T;
    }

    public final BuyerListingDetailsResponseModel.ListingType v() {
        return this.U;
    }

    public final String w() {
        return this.J;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        o.i(out, "out");
        out.writeString(this.f26985a);
        out.writeString(this.f26986b);
        out.writeString(this.f26987c);
        out.writeString(this.f26988d);
        out.writeString(this.f26989e);
        out.writeString(this.f26990f);
        out.writeInt(this.f26991g);
        out.writeString(this.f26992h);
        out.writeString(this.f26993i);
        out.writeString(this.f26994j);
        out.writeString(this.f26995x);
        out.writeString(this.f26996y);
        out.writeInt(this.f26997z);
        List<AttributesMapper.AttributesDataModel> list = this.A;
        if (list == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list.size());
            for (AttributesMapper.AttributesDataModel attributesDataModel : list) {
                out.writeSerializable(attributesDataModel);
            }
        }
        List<BuyerListingDetailsResponseModel.Data.Listing.ExtraAttribute> list2 = this.B;
        if (list2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list2.size());
            for (BuyerListingDetailsResponseModel.Data.Listing.ExtraAttribute extraAttribute : list2) {
                extraAttribute.writeToParcel(out, i11);
            }
        }
        out.writeString(this.C);
        out.writeString(this.D);
        out.writeStringList(this.E);
        out.writeString(this.F);
        BuyerListingDetailsResponseModel.Data.Listing.ExtraInfo.VirtualTour virtualTour = this.G;
        if (virtualTour == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            virtualTour.writeToParcel(out, i11);
        }
        BuyerListingDetailsResponseModel.Data.Listing.ExtraInfo extraInfo = this.H;
        if (extraInfo == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            extraInfo.writeToParcel(out, i11);
        }
        out.writeInt(this.I ? 1 : 0);
        out.writeString(this.J);
        out.writeStringList(this.K);
        Boolean bool = this.L;
        if (bool == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.M;
        if (bool2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        BuyerListingDetailsResponseModel.Data.Listing.User user = this.N;
        if (user == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            user.writeToParcel(out, i11);
        }
        out.writeInt(this.O ? 1 : 0);
        out.writeInt(this.P ? 1 : 0);
        out.writeSerializable(this.Q);
        out.writeInt(this.R);
        out.writeString(this.S);
        out.writeString(this.T);
        BuyerListingDetailsResponseModel.ListingType listingType = this.U;
        if (listingType == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            listingType.writeToParcel(out, i11);
        }
        out.writeString(this.V);
        out.writeParcelable(this.W, i11);
        out.writeInt(this.X ? 1 : 0);
        out.writeInt(this.Y ? 1 : 0);
        out.writeInt(this.Z ? 1 : 0);
    }

    public final String x() {
        return this.f26995x;
    }

    public final String y() {
        return this.f26996y;
    }

    public final int z() {
        return this.R;
    }
}
