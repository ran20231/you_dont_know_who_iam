package com.forsale.app.notifications;

import a00.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NotificationChannels.kt */
/* loaded from: classes2.dex */
public final class NotificationChannels {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ NotificationChannels[] $VALUES;
    public static final NotificationChannels DEFAULT = new NotificationChannels("DEFAULT", 0);

    /* renamed from: id  reason: collision with root package name */
    private final String f37588id = name();

    private static final /* synthetic */ NotificationChannels[] $values() {
        return new NotificationChannels[]{DEFAULT};
    }

    static {
        NotificationChannels[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private NotificationChannels(String str, int i11) {
    }

    public static a<NotificationChannels> getEntries() {
        return $ENTRIES;
    }

    public static NotificationChannels valueOf(String str) {
        return (NotificationChannels) Enum.valueOf(NotificationChannels.class, str);
    }

    public static NotificationChannels[] values() {
        return (NotificationChannels[]) $VALUES.clone();
    }

    public final String getId() {
        return this.f37588id;
    }
}
