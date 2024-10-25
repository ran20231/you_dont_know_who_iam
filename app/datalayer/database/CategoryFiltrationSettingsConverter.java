package com.forsale.app.datalayer.database;

import com.forsale.app.datalayer.network.responses.ListingsResponse;
import com.google.gson.d;
import com.google.gson.reflect.a;
import java.util.List;
import kotlin.jvm.internal.o;
/* compiled from: CategoryFiltrationSettingsConverter.kt */
/* loaded from: classes2.dex */
public final class CategoryFiltrationSettingsConverter {
    public static final int $stable = 0;

    public final List<ListingsResponse.UISettings.FiltrationSetting> toFiltrationSettings(String str) {
        if (str != null) {
            return (List) new d().l(str, new a<List<? extends ListingsResponse.UISettings.FiltrationSetting>>() { // from class: com.forsale.app.datalayer.database.CategoryFiltrationSettingsConverter$toFiltrationSettings$1$1
            }.getType());
        }
        return null;
    }

    public final String toString(List<ListingsResponse.UISettings.FiltrationSetting> list) {
        if (list != null) {
            String t11 = new d().t(list);
            o.h(t11, "toJson(...)");
            return t11;
        }
        return "";
    }
}
