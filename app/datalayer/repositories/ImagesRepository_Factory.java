package com.forsale.app.datalayer.repositories;

import android.content.Context;
/* loaded from: classes2.dex */
public final class ImagesRepository_Factory implements dagger.internal.b<ImagesRepository> {
    private final vz.a<Context> applicationContextProvider;

    public ImagesRepository_Factory(vz.a<Context> aVar) {
        this.applicationContextProvider = aVar;
    }

    public static ImagesRepository_Factory create(vz.a<Context> aVar) {
        return new ImagesRepository_Factory(aVar);
    }

    public static ImagesRepository newInstance(Context context) {
        return new ImagesRepository(context);
    }

    @Override // vz.a
    public ImagesRepository get() {
        return newInstance(this.applicationContextProvider.get());
    }
}
