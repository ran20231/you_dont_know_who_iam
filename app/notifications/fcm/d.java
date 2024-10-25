package com.forsale.app.notifications.fcm;

import com.forsale.app.datalayer.repositories.ForSaleMessagingRepository;
/* compiled from: ForSaleMessagingService_MembersInjector.java */
/* loaded from: classes2.dex */
public final class d implements cx.b<ForSaleMessagingService> {
    public static void a(ForSaleMessagingService forSaleMessagingService, FCMNotificationPusher fCMNotificationPusher) {
        forSaleMessagingService.f37607b = fCMNotificationPusher;
    }

    public static void b(ForSaleMessagingService forSaleMessagingService, ForSaleMessagingRepository forSaleMessagingRepository) {
        forSaleMessagingService.f37609d = forSaleMessagingRepository;
    }
}
