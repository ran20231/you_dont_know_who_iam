package com.forsale.app.datalayer.database;

import com.google.gson.d;
import com.google.gson.reflect.a;
import java.util.ArrayList;
/* compiled from: ArrayListStringConverter.kt */
/* loaded from: classes2.dex */
public final class ArrayListStringConverter {
    public static final int $stable = 0;

    public final ArrayList<String> toArrayListString(String str) {
        if (str != null) {
            return (ArrayList) new d().l(str, new a<ArrayList<String>>() { // from class: com.forsale.app.datalayer.database.ArrayListStringConverter$toArrayListString$1$1
            }.getType());
        }
        return null;
    }

    public final String toString(ArrayList<String> arrayList) {
        String str;
        if (arrayList != null) {
            str = new d().t(arrayList);
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }
}
