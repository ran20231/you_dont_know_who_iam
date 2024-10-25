package com.forsale.app.datalayer.repositories;

import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes2.dex */
public final class TranslationRepository_Factory implements dagger.internal.b<TranslationRepository> {
    private final vz.a<CoroutineScope> csProvider;
    private final vz.a<jj.b> prefUtilsProvider;

    public TranslationRepository_Factory(vz.a<jj.b> aVar, vz.a<CoroutineScope> aVar2) {
        this.prefUtilsProvider = aVar;
        this.csProvider = aVar2;
    }

    public static TranslationRepository_Factory create(vz.a<jj.b> aVar, vz.a<CoroutineScope> aVar2) {
        return new TranslationRepository_Factory(aVar, aVar2);
    }

    public static TranslationRepository newInstance(jj.b bVar, CoroutineScope coroutineScope) {
        return new TranslationRepository(bVar, coroutineScope);
    }

    @Override // vz.a
    public TranslationRepository get() {
        return newInstance(this.prefUtilsProvider.get(), this.csProvider.get());
    }
}
