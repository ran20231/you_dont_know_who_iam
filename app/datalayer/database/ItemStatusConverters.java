package com.forsale.app.datalayer.database;

import com.forsale.app.datalayer.network.responses.listingdetails.ItemStatus;
import com.google.gson.d;
import com.google.gson.reflect.a;
/* compiled from: ItemStatusConverters.kt */
/* loaded from: classes2.dex */
public final class ItemStatusConverters {
    public static final int $stable = 0;

    public final ItemStatus toItemStatus(String str) {
        if (str != null) {
            return (ItemStatus) new d().l(str, new a<ItemStatus>() { // from class: com.forsale.app.datalayer.database.ItemStatusConverters$toItemStatus$1$1
            }.getType());
        }
        return null;
    }

    public final String toString(ItemStatus itemStatus) {
        String str;
        if (itemStatus != null) {
            str = new d().t(itemStatus);
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }
}
