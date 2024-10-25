package com.forsale.app.datalayer.network.errorhandling.errorserializer;

import com.google.gson.d;
import dagger.internal.b;
import vz.a;
/* loaded from: classes2.dex */
public final class ValidationErrorSerializer_Factory implements b<ValidationErrorSerializer> {
    private final a<d> gsonProvider;

    public ValidationErrorSerializer_Factory(a<d> aVar) {
        this.gsonProvider = aVar;
    }

    public static ValidationErrorSerializer_Factory create(a<d> aVar) {
        return new ValidationErrorSerializer_Factory(aVar);
    }

    public static ValidationErrorSerializer newInstance(d dVar) {
        return new ValidationErrorSerializer(dVar);
    }

    @Override // vz.a
    public ValidationErrorSerializer get() {
        return newInstance(this.gsonProvider.get());
    }
}
