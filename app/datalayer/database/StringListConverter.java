package com.forsale.app.datalayer.database;

import com.google.gson.d;
import com.google.gson.reflect.a;
import java.util.List;
/* compiled from: StringListConverter.kt */
/* loaded from: classes2.dex */
public final class StringListConverter {
    public static final int $stable = 0;

    public final String toString(List<String> list) {
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

    public final List<String> toStringList(String str) {
        if (str != null) {
            return (List) new d().l(str, new a<List<? extends String>>() { // from class: com.forsale.app.datalayer.database.StringListConverter$toStringList$1$1
            }.getType());
        }
        return null;
    }
}
