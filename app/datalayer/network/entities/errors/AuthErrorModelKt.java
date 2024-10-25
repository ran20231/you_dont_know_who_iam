package com.forsale.app.datalayer.network.entities.errors;

import com.forsale.app.datalayer.network.errorhandling.NetworkErrorModel;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.o;
/* compiled from: AuthErrorModel.kt */
/* loaded from: classes2.dex */
public final class AuthErrorModelKt {
    public static final NetworkErrorModel toNetworkErrorModel(AuthErrorModel authErrorModel, int i11) {
        ArrayList arrayList;
        o.i(authErrorModel, "<this>");
        String message = authErrorModel.getMessage();
        Map<String, String> errors = authErrorModel.getErrors();
        if (errors != null) {
            arrayList = new ArrayList(errors.size());
            for (Map.Entry<String, String> entry : errors.entrySet()) {
                arrayList.add(new NetworkErrorModel.Error(entry.getKey(), entry.getValue()));
            }
        } else {
            arrayList = null;
        }
        return new NetworkErrorModel(i11, message, arrayList);
    }
}
