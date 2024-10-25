package com.forsale.app.datalayer.network.errorhandling.errorserializer;

import com.forsale.app.datalayer.network.entities.errors.ValidationErrorModel;
import com.forsale.app.datalayer.network.entities.errors.ValidationErrorModelKt;
import com.forsale.app.datalayer.network.errorhandling.NetworkErrorModel;
import com.google.gson.JsonSyntaxException;
import com.google.gson.d;
import dj.i;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
/* compiled from: ValidationErrorSerializer.kt */
/* loaded from: classes2.dex */
public final class ValidationErrorSerializer implements ErrorModelSerializer {
    public static final int $stable = 8;
    private final d gson;

    public ValidationErrorSerializer(d gson) {
        o.i(gson, "gson");
        this.gson = gson;
    }

    @Override // com.forsale.app.datalayer.network.errorhandling.errorserializer.ErrorModelSerializer
    public NetworkErrorModel serialize(int i11, String str) {
        try {
            Object k11 = this.gson.k(str, ValidationErrorModel.class);
            o.h(k11, "fromJson(...)");
            return ValidationErrorModelKt.toNetworkErrorModel((ValidationErrorModel) k11, i11);
        } catch (JsonSyntaxException unused) {
            i invoke = i.f54287a.invoke();
            String i12 = s.b(ValidationErrorModel.class).i();
            invoke.c("Deserialization to model " + i12 + " failed");
            return null;
        }
    }
}
