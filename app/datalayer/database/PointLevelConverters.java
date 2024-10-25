package com.forsale.app.datalayer.database;

import com.google.gson.d;
import com.google.gson.reflect.a;
import kotlin.jvm.internal.o;
/* compiled from: PointLevelConverters.kt */
/* loaded from: classes2.dex */
public final class PointLevelConverters {
    public static final int $stable = 0;

    public final PointLevel toPointLevel(String str) {
        if (str != null) {
            return (PointLevel) new d().l(str, new a<PointLevel>() { // from class: com.forsale.app.datalayer.database.PointLevelConverters$toPointLevel$1$1
            }.getType());
        }
        return null;
    }

    public final String toString(PointLevel pointLevel) {
        if (pointLevel != null) {
            String t11 = new d().t(pointLevel);
            o.h(t11, "toJson(...)");
            return t11;
        }
        return "";
    }
}
