package com.forsale.app.datalayer.repositories;

import android.content.Context;
/* loaded from: classes2.dex */
public final class ApplicationResourcesRepository_Factory implements dagger.internal.b<ApplicationResourcesRepository> {
    private final vz.a<Context> applicationContextProvider;

    public ApplicationResourcesRepository_Factory(vz.a<Context> aVar) {
        this.applicationContextProvider = aVar;
    }

    public static ApplicationResourcesRepository_Factory create(vz.a<Context> aVar) {
        return new ApplicationResourcesRepository_Factory(aVar);
    }

    public static ApplicationResourcesRepository newInstance(Context context) {
        return new ApplicationResourcesRepository(context);
    }

    @Override // vz.a
    public ApplicationResourcesRepository get() {
        return newInstance(this.applicationContextProvider.get());
    }
}
