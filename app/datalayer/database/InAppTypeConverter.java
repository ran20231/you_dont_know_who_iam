package com.forsale.app.datalayer.database;

import com.google.gson.d;
import com.google.gson.reflect.a;
/* compiled from: InAppTypeConverter.kt */
/* loaded from: classes2.dex */
public final class InAppTypeConverter {
    public static final int $stable = 0;

    public final InAppType toInAppType(String str) {
        if (str != null) {
            return (InAppType) new d().l(str, new a<InAppType>() { // from class: com.forsale.app.datalayer.database.InAppTypeConverter$toInAppType$1$1
            }.getType());
        }
        return null;
    }

    public final String toString(InAppType inAppType) {
        String str;
        if (inAppType != null) {
            str = new d().t(inAppType);
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }
}
