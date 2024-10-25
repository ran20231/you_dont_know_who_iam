package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.network.services.MessagingService;
/* loaded from: classes2.dex */
public final class NotificationMessagesRepository_Factory implements dagger.internal.b<NotificationMessagesRepository> {
    private final vz.a<MessagingService> messagingServiceProvider;
    private final vz.a<jj.b> prefsProvider;

    public NotificationMessagesRepository_Factory(vz.a<jj.b> aVar, vz.a<MessagingService> aVar2) {
        this.prefsProvider = aVar;
        this.messagingServiceProvider = aVar2;
    }

    public static NotificationMessagesRepository_Factory create(vz.a<jj.b> aVar, vz.a<MessagingService> aVar2) {
        return new NotificationMessagesRepository_Factory(aVar, aVar2);
    }

    public static NotificationMessagesRepository newInstance(jj.b bVar, MessagingService messagingService) {
        return new NotificationMessagesRepository(bVar, messagingService);
    }

    @Override // vz.a
    public NotificationMessagesRepository get() {
        return newInstance(this.prefsProvider.get(), this.messagingServiceProvider.get());
    }
}
