package com.forsale.app.datalayer.network.entities.errors;

import com.forsale.app.datalayer.network.errorhandling.NetworkErrorModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.o;
/* compiled from: ValidationErrorModel.kt */
/* loaded from: classes2.dex */
public final class ValidationErrorModelKt {
    public static final NetworkErrorModel toNetworkErrorModel(ValidationErrorModel validationErrorModel, int i11) {
        ArrayList arrayList;
        Object k02;
        o.i(validationErrorModel, "<this>");
        String message = validationErrorModel.getMessage();
        Map<String, List<String>> errors = validationErrorModel.getErrors();
        if (errors != null) {
            arrayList = new ArrayList(errors.size());
            for (Map.Entry<String, List<String>> entry : errors.entrySet()) {
                k02 = CollectionsKt___CollectionsKt.k0(entry.getValue());
                arrayList.add(new NetworkErrorModel.Error(entry.getKey(), (String) k02));
            }
        } else {
            arrayList = null;
        }
        return new NetworkErrorModel(i11, message, arrayList);
    }
}
