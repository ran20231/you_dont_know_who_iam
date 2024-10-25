package com.forsale.app.features.categories.listings.filtration.fullFiltration.filterModels;

import android.os.Parcel;
import android.os.Parcelable;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.network.requestsbodies.GetListingsBody;
import com.forsale.app.datalayer.network.responses.ListingsResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
/* compiled from: AllFiltersPayload.kt */
/* loaded from: classes2.dex */
public final class AllFiltersPayload implements Parcelable {
    public static final Parcelable.Creator<AllFiltersPayload> CREATOR = new a();

    /* renamed from: d  reason: collision with root package name */
    public static final int f29229d = 8;

    /* renamed from: a  reason: collision with root package name */
    private final CategoryEntity f29230a;

    /* renamed from: b  reason: collision with root package name */
    private final List<ListingsResponse.UISettings.FiltrationSetting> f29231b;

    /* renamed from: c  reason: collision with root package name */
    private final GetListingsBody.FiltrationData f29232c;

    /* compiled from: AllFiltersPayload.kt */
    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<AllFiltersPayload> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final AllFiltersPayload createFromParcel(Parcel parcel) {
            GetListingsBody.FiltrationData createFromParcel;
            o.i(parcel, "parcel");
            CategoryEntity createFromParcel2 = CategoryEntity.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i11 = 0; i11 != readInt; i11++) {
                arrayList.add(ListingsResponse.UISettings.FiltrationSetting.CREATOR.createFromParcel(parcel));
            }
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = GetListingsBody.FiltrationData.CREATOR.createFromParcel(parcel);
            }
            return new AllFiltersPayload(createFromParcel2, arrayList, createFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final AllFiltersPayload[] newArray(int i11) {
            return new AllFiltersPayload[i11];
        }
    }

    public AllFiltersPayload(CategoryEntity parentCategory, List<ListingsResponse.UISettings.FiltrationSetting> filtrationSettings, GetListingsBody.FiltrationData filtrationData) {
        o.i(parentCategory, "parentCategory");
        o.i(filtrationSettings, "filtrationSettings");
        this.f29230a = parentCategory;
        this.f29231b = filtrationSettings;
        this.f29232c = filtrationData;
    }

    public final List<ListingsResponse.UISettings.FiltrationSetting> a() {
        return this.f29231b;
    }

    public final CategoryEntity b() {
        return this.f29230a;
    }

    public final GetListingsBody.FiltrationData c() {
        return this.f29232c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AllFiltersPayload)) {
            return false;
        }
        AllFiltersPayload allFiltersPayload = (AllFiltersPayload) obj;
        if (o.d(this.f29230a, allFiltersPayload.f29230a) && o.d(this.f29231b, allFiltersPayload.f29231b) && o.d(this.f29232c, allFiltersPayload.f29232c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.f29230a.hashCode() * 31) + this.f29231b.hashCode()) * 31;
        GetListingsBody.FiltrationData filtrationData = this.f29232c;
        if (filtrationData == null) {
            hashCode = 0;
        } else {
            hashCode = filtrationData.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        CategoryEntity categoryEntity = this.f29230a;
        List<ListingsResponse.UISettings.FiltrationSetting> list = this.f29231b;
        GetListingsBody.FiltrationData filtrationData = this.f29232c;
        return "AllFiltersPayload(parentCategory=" + categoryEntity + ", filtrationSettings=" + list + ", preSelectedFilters=" + filtrationData + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        o.i(out, "out");
        this.f29230a.writeToParcel(out, i11);
        List<ListingsResponse.UISettings.FiltrationSetting> list = this.f29231b;
        out.writeInt(list.size());
        for (ListingsResponse.UISettings.FiltrationSetting filtrationSetting : list) {
            filtrationSetting.writeToParcel(out, i11);
        }
        GetListingsBody.FiltrationData filtrationData = this.f29232c;
        if (filtrationData == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        filtrationData.writeToParcel(out, i11);
    }
}
