package com.forsale.app.datalayer.database;

import com.google.gson.d;
import com.google.gson.reflect.a;
/* compiled from: InAppActionConverter.kt */
/* loaded from: classes2.dex */
public final class InAppActionConverter {
    public static final int $stable = 0;

    public final InAppAction toInAppAction(String str) {
        if (str != null) {
            return (InAppAction) new d().l(str, new a<InAppAction>() { // from class: com.forsale.app.datalayer.database.InAppActionConverter$toInAppAction$1$1
            }.getType());
        }
        return null;
    }

    public final String toString(InAppAction inAppAction) {
        String str;
        if (inAppAction != null) {
            str = new d().t(inAppAction);
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }
}
