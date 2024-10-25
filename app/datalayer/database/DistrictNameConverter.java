package com.forsale.app.datalayer.database;

import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.google.gson.d;
import com.google.gson.reflect.a;
/* compiled from: DistrictNameConverter.kt */
/* loaded from: classes2.dex */
public final class DistrictNameConverter {
    public static final int $stable = 0;

    public final ListingItemBrief.DistrictName toDistrict(String str) {
        if (str != null) {
            return (ListingItemBrief.DistrictName) new d().l(str, new a<ListingItemBrief.DistrictName>() { // from class: com.forsale.app.datalayer.database.DistrictNameConverter$toDistrict$1$1
            }.getType());
        }
        return null;
    }

    public final String toString(ListingItemBrief.DistrictName districtName) {
        if (districtName != null) {
            return new d().t(districtName);
        }
        return null;
    }
}
