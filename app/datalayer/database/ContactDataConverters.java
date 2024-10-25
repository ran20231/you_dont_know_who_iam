package com.forsale.app.datalayer.database;

import com.google.gson.d;
import com.google.gson.reflect.a;
import java.util.List;
import kotlin.collections.r;
import kotlin.jvm.internal.o;
/* compiled from: ContactDataConverters.kt */
/* loaded from: classes2.dex */
public final class ContactDataConverters {
    public static final int $stable = 0;

    public final List<ContactData> toContactData(String str) {
        List<ContactData> list;
        List<ContactData> n11;
        if (str != null) {
            list = (List) new d().l(str, new a<List<? extends ContactData>>() { // from class: com.forsale.app.datalayer.database.ContactDataConverters$toContactData$1$1
            }.getType());
        } else {
            list = null;
        }
        if (list == null) {
            n11 = r.n();
            return n11;
        }
        return list;
    }

    public final String toString(List<ContactData> list) {
        if (list != null) {
            String t11 = new d().t(list);
            o.h(t11, "toJson(...)");
            return t11;
        }
        return "";
    }
}
