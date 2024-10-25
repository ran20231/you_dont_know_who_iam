package com.forsale.app.datalayer.network.errorhandling.errorserializer;

import com.google.gson.d;
import dagger.internal.b;
import vz.a;
/* loaded from: classes2.dex */
public final class AuthErrorSerializer_Factory implements b<AuthErrorSerializer> {
    private final a<d> gsonProvider;

    public AuthErrorSerializer_Factory(a<d> aVar) {
        this.gsonProvider = aVar;
    }

    public static AuthErrorSerializer_Factory create(a<d> aVar) {
        return new AuthErrorSerializer_Factory(aVar);
    }

    public static AuthErrorSerializer newInstance(d dVar) {
        return new AuthErrorSerializer(dVar);
    }

    @Override // vz.a
    public AuthErrorSerializer get() {
        return newInstance(this.gsonProvider.get());
    }
}
