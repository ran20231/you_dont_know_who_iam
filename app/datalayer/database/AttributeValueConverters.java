package com.forsale.app.datalayer.database;

import com.google.gson.d;
import com.google.gson.reflect.a;
import java.util.List;
import kotlin.jvm.internal.o;
/* compiled from: AttributeValueConverters.kt */
/* loaded from: classes2.dex */
public final class AttributeValueConverters {
    public static final int $stable = 0;

    public final List<AttributeValue> toAttributeValue(String str) {
        if (str != null) {
            return (List) new d().l(str, new a<List<? extends AttributeValue>>() { // from class: com.forsale.app.datalayer.database.AttributeValueConverters$toAttributeValue$1$1
            }.getType());
        }
        return null;
    }

    public final String toString(List<AttributeValue> list) {
        if (list != null) {
            String t11 = new d().t(list);
            o.h(t11, "toJson(...)");
            return t11;
        }
        return "";
    }
}
