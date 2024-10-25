package com.forsale.app.datalayer.database;

import com.forsale.app.datalayer.network.entities.ExtraInfo;
import com.google.gson.d;
import com.google.gson.reflect.a;
/* compiled from: ExtraInfoConverter.kt */
/* loaded from: classes2.dex */
public final class ExtraInfoConverter {
    public static final int $stable = 0;

    public final ExtraInfo toExtraInfo(String str) {
        if (str != null) {
            return (ExtraInfo) new d().l(str, new a<ExtraInfo>() { // from class: com.forsale.app.datalayer.database.ExtraInfoConverter$toExtraInfo$1$1
            }.getType());
        }
        return null;
    }

    public final String toString(ExtraInfo extraInfo) {
        String str;
        if (extraInfo != null) {
            str = new d().t(extraInfo);
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }
}
