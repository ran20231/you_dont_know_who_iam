package com.forsale.app.datalayer.database;

import com.forsale.app.datalayer.network.requestsbodies.GetListingsBody;
import com.google.gson.d;
import com.google.gson.reflect.a;
import kotlin.jvm.internal.o;
/* compiled from: FiltrationDataConverters.kt */
/* loaded from: classes2.dex */
public final class FiltrationDataConverters {
    public static final int $stable = 0;

    public final GetListingsBody.FiltrationData toFiltrationData(String str) {
        if (str != null) {
            return (GetListingsBody.FiltrationData) new d().l(str, new a<GetListingsBody.FiltrationData>() { // from class: com.forsale.app.datalayer.database.FiltrationDataConverters$toFiltrationData$1$1
            }.getType());
        }
        return null;
    }

    public final String toString(GetListingsBody.FiltrationData filtrationData) {
        if (filtrationData != null) {
            String t11 = new d().t(filtrationData);
            o.h(t11, "toJson(...)");
            return t11;
        }
        return "";
    }
}
