package com.forsale.app.datalayer.network.responses.listingdetails;

import com.forsale.app.datalayer.database.InAppMessageEntity;
import com.forsale.app.datalayer.network.requestsbodies.GetListingsBody;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: OtherStatusAll.kt */
/* loaded from: classes2.dex */
public final class OtherStatusAll {
    public static final int $stable = 0;
    @c("addon_id")
    private final String addonId;
    private final String app;
    @c("category_id")
    private final String categoryId;
    @c("category_name")
    private final String categoryName;
    @c(InAppMessageEntity.ITEM_ID)
    private final String itemId;
    @c(GetListingsBody.SCREEN_TYPE)
    private final String screenType;

    public OtherStatusAll(String addonId, String app, String categoryId, String categoryName, String itemId, String str) {
        o.i(addonId, "addonId");
        o.i(app, "app");
        o.i(categoryId, "categoryId");
        o.i(categoryName, "categoryName");
        o.i(itemId, "itemId");
        this.addonId = addonId;
        this.app = app;
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.itemId = itemId;
        this.screenType = str;
    }

    public static /* synthetic */ OtherStatusAll copy$default(OtherStatusAll otherStatusAll, String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = otherStatusAll.addonId;
        }
        if ((i11 & 2) != 0) {
            str2 = otherStatusAll.app;
        }
        String str7 = str2;
        if ((i11 & 4) != 0) {
            str3 = otherStatusAll.categoryId;
        }
        String str8 = str3;
        if ((i11 & 8) != 0) {
            str4 = otherStatusAll.categoryName;
        }
        String str9 = str4;
        if ((i11 & 16) != 0) {
            str5 = otherStatusAll.itemId;
        }
        String str10 = str5;
        if ((i11 & 32) != 0) {
            str6 = otherStatusAll.screenType;
        }
        return otherStatusAll.copy(str, str7, str8, str9, str10, str6);
    }

    public final String component1() {
        return this.addonId;
    }

    public final String component2() {
        return this.app;
    }

    public final String component3() {
        return this.categoryId;
    }

    public final String component4() {
        return this.categoryName;
    }

    public final String component5() {
        return this.itemId;
    }

    public final String component6() {
        return this.screenType;
    }

    public final OtherStatusAll copy(String addonId, String app, String categoryId, String categoryName, String itemId, String str) {
        o.i(addonId, "addonId");
        o.i(app, "app");
        o.i(categoryId, "categoryId");
        o.i(categoryName, "categoryName");
        o.i(itemId, "itemId");
        return new OtherStatusAll(addonId, app, categoryId, categoryName, itemId, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OtherStatusAll)) {
            return false;
        }
        OtherStatusAll otherStatusAll = (OtherStatusAll) obj;
        if (o.d(this.addonId, otherStatusAll.addonId) && o.d(this.app, otherStatusAll.app) && o.d(this.categoryId, otherStatusAll.categoryId) && o.d(this.categoryName, otherStatusAll.categoryName) && o.d(this.itemId, otherStatusAll.itemId) && o.d(this.screenType, otherStatusAll.screenType)) {
            return true;
        }
        return false;
    }

    public final String getAddonId() {
        return this.addonId;
    }

    public final String getApp() {
        return this.app;
    }

    public final String getCategoryId() {
        return this.categoryId;
    }

    public final String getCategoryName() {
        return this.categoryName;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final String getScreenType() {
        return this.screenType;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((this.addonId.hashCode() * 31) + this.app.hashCode()) * 31) + this.categoryId.hashCode()) * 31) + this.categoryName.hashCode()) * 31) + this.itemId.hashCode()) * 31;
        String str = this.screenType;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        String str = this.addonId;
        String str2 = this.app;
        String str3 = this.categoryId;
        String str4 = this.categoryName;
        String str5 = this.itemId;
        String str6 = this.screenType;
        return "OtherStatusAll(addonId=" + str + ", app=" + str2 + ", categoryId=" + str3 + ", categoryName=" + str4 + ", itemId=" + str5 + ", screenType=" + str6 + ")";
    }
}
