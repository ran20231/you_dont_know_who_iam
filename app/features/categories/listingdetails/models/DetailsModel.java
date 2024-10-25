package com.forsale.app.features.categories.listingdetails.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.forsale.app.datalayer.network.entities.ExtraAttr;
import com.forsale.app.datalayer.network.entities.ExtraInfo;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.network.responses.listingdetails.BuyerListingDetailsResponseModel;
import com.forsale.app.datalayer.network.responses.listingdetails.ItemStatus;
import com.forsale.app.datalayer.network.responses.listingdetails.ListingSource;
import com.forsale.app.datalayer.network.responses.listingdetails.ListingSourceApp;
import com.forsale.app.datalayer.network.responses.listingdetails.ListingType;
import com.forsale.app.datalayer.network.responses.listingdetails.ListingUser;
import com.forsale.app.utils.TypeExtensionsKt;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.q;
import kotlin.collections.r;
import kotlin.collections.s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: DetailsModel.kt */
/* loaded from: classes2.dex */
public final class DetailsModel implements Parcelable {
    public static final Parcelable.Creator<DetailsModel> CREATOR = new a();

    /* renamed from: d  reason: collision with root package name */
    public static final int f26998d = 8;

    /* renamed from: a  reason: collision with root package name */
    private final CommonData f26999a;

    /* renamed from: b  reason: collision with root package name */
    private final BuyerData f27000b;

    /* renamed from: c  reason: collision with root package name */
    private final SellerData f27001c;

    /* compiled from: DetailsModel.kt */
    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<DetailsModel> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final DetailsModel createFromParcel(Parcel parcel) {
            BuyerData createFromParcel;
            o.i(parcel, "parcel");
            CommonData createFromParcel2 = CommonData.CREATOR.createFromParcel(parcel);
            SellerData sellerData = null;
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = BuyerData.CREATOR.createFromParcel(parcel);
            }
            BuyerData buyerData = createFromParcel;
            if (parcel.readInt() != 0) {
                sellerData = SellerData.CREATOR.createFromParcel(parcel);
            }
            return new DetailsModel(createFromParcel2, buyerData, sellerData);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final DetailsModel[] newArray(int i11) {
            return new DetailsModel[i11];
        }
    }

    public DetailsModel(CommonData commonData, BuyerData buyerData, SellerData sellerData) {
        o.i(commonData, "commonData");
        this.f26999a = commonData;
        this.f27000b = buyerData;
        this.f27001c = sellerData;
    }

    public static /* synthetic */ DetailsModel b(DetailsModel detailsModel, CommonData commonData, BuyerData buyerData, SellerData sellerData, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            commonData = detailsModel.f26999a;
        }
        if ((i11 & 2) != 0) {
            buyerData = detailsModel.f27000b;
        }
        if ((i11 & 4) != 0) {
            sellerData = detailsModel.f27001c;
        }
        return detailsModel.a(commonData, buyerData, sellerData);
    }

    public final DetailsModel a(CommonData commonData, BuyerData buyerData, SellerData sellerData) {
        o.i(commonData, "commonData");
        return new DetailsModel(commonData, buyerData, sellerData);
    }

    public final BuyerData c() {
        return this.f27000b;
    }

    public final CommonData d() {
        return this.f26999a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final ListingItemDetails e() {
        ListingSource listingSource;
        String str;
        int i11;
        float f11;
        float f12;
        String str2;
        String str3;
        List n11;
        List n12;
        ArrayList arrayList;
        int i12;
        List e11;
        int i13;
        int i14;
        double d11;
        ListingItemDetails.BundleDetails bundleDetails;
        int y11;
        BuyerListingDetailsResponseModel.Data.Listing.ExtraInfo.LocationInfo locationInfo;
        Double lat;
        BuyerListingDetailsResponseModel.Data.Listing.ExtraInfo.LocationInfo locationInfo2;
        Double lon;
        String t02;
        int parseInt = Integer.parseInt(this.f26999a.c());
        int parseInt2 = Integer.parseInt(this.f26999a.c());
        int r11 = this.f26999a.r();
        ListingSourceApp listingSourceApp = ListingSourceApp.FORSALE;
        if (this.f26999a.u() != null) {
            listingSource = ListingSource.Companion.from(this.f26999a.u());
        } else {
            listingSource = null;
        }
        String w11 = this.f26999a.w();
        List<String> l11 = this.f26999a.l();
        if (l11 != null) {
            t02 = CollectionsKt___CollectionsKt.t0(l11, ",", null, null, 0, null, null, 62, null);
            str = t02;
        } else {
            str = null;
        }
        ListingType listingType = ListingType.ACTIVE;
        Boolean N = this.f26999a.N();
        if (N != null) {
            i11 = TypeExtensionsKt.H0(N.booleanValue());
        } else {
            i11 = 1;
        }
        int i15 = i11;
        BuyerListingDetailsResponseModel.Data.Listing.ExtraInfo s11 = this.f26999a.s();
        if (s11 != null && (locationInfo2 = s11.getLocationInfo()) != null && (lon = locationInfo2.getLon()) != null) {
            f11 = (float) lon.doubleValue();
        } else {
            f11 = 0.0f;
        }
        BuyerListingDetailsResponseModel.Data.Listing.ExtraInfo s12 = this.f26999a.s();
        if (s12 != null && (locationInfo = s12.getLocationInfo()) != null && (lat = locationInfo.getLat()) != null) {
            f12 = (float) lat.doubleValue();
        } else {
            f12 = 0.0f;
        }
        String o11 = this.f26999a.o();
        String H = this.f26999a.H();
        BuyerListingDetailsResponseModel.Data.Listing.ExtraInfo.VirtualTour J = this.f26999a.J();
        if (J != null) {
            str2 = J.getThumb();
        } else {
            str2 = null;
        }
        BuyerListingDetailsResponseModel.Data.Listing.ExtraInfo.VirtualTour J2 = this.f26999a.J();
        if (J2 != null) {
            str3 = J2.getUrl();
        } else {
            str3 = null;
        }
        List<String> t11 = this.f26999a.t();
        n11 = r.n();
        List<BuyerListingDetailsResponseModel.Data.Listing.ExtraAttribute> e12 = this.f26999a.e();
        if (e12 == null) {
            n12 = r.n();
            arrayList = n12;
        } else {
            List<BuyerListingDetailsResponseModel.Data.Listing.ExtraAttribute> list = e12;
            y11 = s.y(list, 10);
            ArrayList arrayList2 = new ArrayList(y11);
            for (BuyerListingDetailsResponseModel.Data.Listing.ExtraAttribute extraAttribute : list) {
                arrayList2.add(new ExtraAttr(extraAttribute.getId(), extraAttribute.getValue(), null, 4, null));
            }
            arrayList = arrayList2;
        }
        BuyerData buyerData = this.f27000b;
        if (buyerData != null) {
            i12 = TypeExtensionsKt.H0(buyerData.a());
        } else {
            i12 = 0;
        }
        int I = this.f26999a.I();
        ListingUser fromDetailsUser = ListingUser.Companion.fromDetailsUser(this.f26999a.F());
        int parseInt3 = Integer.parseInt(this.f26999a.j());
        e11 = q.e(Integer.valueOf(this.f26999a.r()));
        String w12 = this.f26999a.w();
        String n13 = this.f26999a.n();
        List<String> t12 = this.f26999a.t();
        if (t12 != null) {
            i13 = t12.size();
        } else {
            i13 = 0;
        }
        Boolean M = this.f26999a.M();
        if (M != null) {
            i14 = TypeExtensionsKt.H0(M.booleanValue());
        } else {
            i14 = 0;
        }
        int H0 = TypeExtensionsKt.H0(this.f26999a.K());
        String x11 = this.f26999a.x();
        if (x11 != null) {
            d11 = Double.parseDouble(x11);
        } else {
            d11 = Utils.DOUBLE_EPSILON;
        }
        double d12 = d11;
        int z11 = this.f26999a.z();
        ItemStatus itemStatus = ItemStatus.NORMAL;
        String E = this.f26999a.E();
        ExtraInfo fromDetailsExtraInfo = ExtraInfo.Companion.fromDetailsExtraInfo(this.f26999a.s());
        SellerData sellerData = this.f27001c;
        if (sellerData != null) {
            bundleDetails = sellerData.a();
        } else {
            bundleDetails = null;
        }
        return new ListingItemDetails(parseInt2, r11, "", listingSourceApp, listingSource, w11, str, listingType, null, null, i15, 0, f11, f12, null, o11, "", "", H, null, str2, str3, t11, 1, null, null, n11, null, null, null, arrayList, i12, I, fromDetailsUser, parseInt3, e11, w12, n13, null, null, null, null, null, parseInt, i13, i14, H0, 0, 1, 0, d12, z11, itemStatus, E, null, 0, null, null, fromDetailsExtraInfo, 0, 0, null, null, null, null, null, bundleDetails, null, 0, -134217728, 11, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DetailsModel)) {
            return false;
        }
        DetailsModel detailsModel = (DetailsModel) obj;
        if (o.d(this.f26999a, detailsModel.f26999a) && o.d(this.f27000b, detailsModel.f27000b) && o.d(this.f27001c, detailsModel.f27001c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f26999a.hashCode() * 31;
        BuyerData buyerData = this.f27000b;
        int i11 = 0;
        if (buyerData == null) {
            hashCode = 0;
        } else {
            hashCode = buyerData.hashCode();
        }
        int i12 = (hashCode2 + hashCode) * 31;
        SellerData sellerData = this.f27001c;
        if (sellerData != null) {
            i11 = sellerData.hashCode();
        }
        return i12 + i11;
    }

    public String toString() {
        CommonData commonData = this.f26999a;
        BuyerData buyerData = this.f27000b;
        SellerData sellerData = this.f27001c;
        return "DetailsModel(commonData=" + commonData + ", buyerData=" + buyerData + ", sellerData=" + sellerData + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        o.i(out, "out");
        this.f26999a.writeToParcel(out, i11);
        BuyerData buyerData = this.f27000b;
        if (buyerData == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            buyerData.writeToParcel(out, i11);
        }
        SellerData sellerData = this.f27001c;
        if (sellerData == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        sellerData.writeToParcel(out, i11);
    }

    public /* synthetic */ DetailsModel(CommonData commonData, BuyerData buyerData, SellerData sellerData, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(commonData, (i11 & 2) != 0 ? null : buyerData, (i11 & 4) != 0 ? null : sellerData);
    }
}
