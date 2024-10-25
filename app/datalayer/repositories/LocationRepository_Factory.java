package com.forsale.app.datalayer.repositories;

import android.content.Context;
/* loaded from: classes2.dex */
public final class LocationRepository_Factory implements dagger.internal.b<LocationRepository> {
    private final vz.a<Context> contextProvider;

    public LocationRepository_Factory(vz.a<Context> aVar) {
        this.contextProvider = aVar;
    }

    public static LocationRepository_Factory create(vz.a<Context> aVar) {
        return new LocationRepository_Factory(aVar);
    }

    public static LocationRepository newInstance(Context context) {
        return new LocationRepository(context);
    }

    @Override // vz.a
    public LocationRepository get() {
        return newInstance(this.contextProvider.get());
    }
}
