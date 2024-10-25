package com.forsale.app.datalayer.database;

import com.forsale.app.datalayer.network.entities.ExtraAttr;
import com.google.gson.d;
import com.google.gson.reflect.a;
import java.util.List;
/* compiled from: ExtraAttrConverter.kt */
/* loaded from: classes2.dex */
public final class ExtraAttrConverter {
    public static final int $stable = 0;

    public final List<ExtraAttr> toExtraAttr(String str) {
        if (str != null) {
            return (List) new d().l(str, new a<List<? extends ExtraAttr>>() { // from class: com.forsale.app.datalayer.database.ExtraAttrConverter$toExtraAttr$1$1
            }.getType());
        }
        return null;
    }

    public final String toString(List<ExtraAttr> list) {
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
