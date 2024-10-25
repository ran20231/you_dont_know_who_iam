package com.forsale.app.datalayer.database;

import com.forsale.app.datalayer.network.entities.AddonsRequested;
import com.google.gson.d;
import com.google.gson.reflect.a;
import java.util.List;
/* compiled from: AddonsRequestedConverter.kt */
/* loaded from: classes2.dex */
public final class AddonsRequestedConverter {
    public static final int $stable = 0;

    public final List<AddonsRequested> toAddonsRequested(String str) {
        if (str != null) {
            return (List) new d().l(str, new a<List<? extends AddonsRequested>>() { // from class: com.forsale.app.datalayer.database.AddonsRequestedConverter$toAddonsRequested$1$1
            }.getType());
        }
        return null;
    }

    public final String toString(List<AddonsRequested> list) {
        String str;
        if (list != null) {
            str = new d().t(list);
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }
}
