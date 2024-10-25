package com.forsale.app.datalayer.database;

import com.forsale.app.utils.NotificationTypes;
import kotlin.jvm.internal.o;
/* compiled from: NotificationTypesConverter.kt */
/* loaded from: classes2.dex */
public final class NotificationTypesConverter {
    public static final int $stable = 0;

    public final NotificationTypes toInAppNotificationType(String str) {
        NotificationTypes[] values;
        for (NotificationTypes notificationTypes : NotificationTypes.values()) {
            if (o.d(notificationTypes.name(), str)) {
                return notificationTypes;
            }
        }
        return null;
    }

    public final String toString(NotificationTypes notificationTypes) {
        if (notificationTypes != null) {
            return notificationTypes.name();
        }
        return null;
    }
}
