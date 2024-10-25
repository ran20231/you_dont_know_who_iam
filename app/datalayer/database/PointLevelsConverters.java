package com.forsale.app.datalayer.database;

import com.google.gson.d;
import com.google.gson.reflect.a;
/* compiled from: PointLevelsConverters.kt */
/* loaded from: classes2.dex */
public final class PointLevelsConverters {
    public static final int $stable = 0;

    public final PointLevels toPointLevels(String str) {
        if (str != null) {
            return (PointLevels) new d().l(str, new a<PointLevels>() { // from class: com.forsale.app.datalayer.database.PointLevelsConverters$toPointLevels$1$1
            }.getType());
        }
        return null;
    }

    public final String toString(PointLevels pointLevels) {
        String str;
        if (pointLevels != null) {
            str = new d().t(pointLevels);
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }
}
