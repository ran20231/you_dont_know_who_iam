package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.database.InAppDatabase;
import com.forsale.app.datalayer.network.services.MessagingService;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes2.dex */
public final class InAppRepository_Factory implements dagger.internal.b<InAppRepository> {
    private final vz.a<CoroutineScope> csProvider;
    private final vz.a<ImagesRepository> imagesRepositoryProvider;
    private final vz.a<InAppDatabase> inAppDatabaseProvider;
    private final vz.a<InAppMessageDao> inAppMessageDaoProvider;
    private final vz.a<MessagingService> messagingServiceProvider;
    private final vz.a<jj.b> prefProvider;

    public InAppRepository_Factory(vz.a<MessagingService> aVar, vz.a<InAppDatabase> aVar2, vz.a<InAppMessageDao> aVar3, vz.a<jj.b> aVar4, vz.a<CoroutineScope> aVar5, vz.a<ImagesRepository> aVar6) {
        this.messagingServiceProvider = aVar;
        this.inAppDatabaseProvider = aVar2;
        this.inAppMessageDaoProvider = aVar3;
        this.prefProvider = aVar4;
        this.csProvider = aVar5;
        this.imagesRepositoryProvider = aVar6;
    }

    public static InAppRepository_Factory create(vz.a<MessagingService> aVar, vz.a<InAppDatabase> aVar2, vz.a<InAppMessageDao> aVar3, vz.a<jj.b> aVar4, vz.a<CoroutineScope> aVar5, vz.a<ImagesRepository> aVar6) {
        return new InAppRepository_Factory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
    }

    public static InAppRepository newInstance(MessagingService messagingService, InAppDatabase inAppDatabase, InAppMessageDao inAppMessageDao, jj.b bVar, CoroutineScope coroutineScope, ImagesRepository imagesRepository) {
        return new InAppRepository(messagingService, inAppDatabase, inAppMessageDao, bVar, coroutineScope, imagesRepository);
    }

    @Override // vz.a
    public InAppRepository get() {
        return newInstance(this.messagingServiceProvider.get(), this.inAppDatabaseProvider.get(), this.inAppMessageDaoProvider.get(), this.prefProvider.get(), this.csProvider.get(), this.imagesRepositoryProvider.get());
    }
}
