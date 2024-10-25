package com.forsale.app.datalayer.database;

import com.google.gson.d;
import com.google.gson.reflect.a;
import java.util.List;
/* compiled from: IntegerListConverter.kt */
/* loaded from: classes2.dex */
public final class IntegerListConverter {
    public static final int $stable = 0;

    public final String fromIntList(List<Integer> list) {
        if (list != null) {
            return new d().t(list);
        }
        return null;
    }

    public final List<Integer> fromString(String str) {
        if (str != null) {
            return (List) new d().l(str, new a<List<? extends Integer>>() { // from class: com.forsale.app.datalayer.database.IntegerListConverter$fromString$1$1
            }.getType());
        }
        return null;
    }
}
