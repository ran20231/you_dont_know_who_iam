package com.forsale.app.utils.analytics;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.i0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m00.o;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Models.kt */
/* loaded from: classes3.dex */
public final class NotificationOpenedFrom {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ NotificationOpenedFrom[] $VALUES;
    public static final a Companion;
    public static final NotificationOpenedFrom NOTIFICATIONS_SCREEN = new NotificationOpenedFrom("NOTIFICATIONS_SCREEN", 0, "Notifications_Screen");
    public static final NotificationOpenedFrom PUSH_MESSAGE = new NotificationOpenedFrom("PUSH_MESSAGE", 1, "Push_Message");
    private static final Map<String, NotificationOpenedFrom> map;
    private final String value;

    /* compiled from: Models.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static final /* synthetic */ NotificationOpenedFrom[] $values() {
        return new NotificationOpenedFrom[]{NOTIFICATIONS_SCREEN, PUSH_MESSAGE};
    }

    static {
        int e11;
        int d11;
        NotificationOpenedFrom[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        NotificationOpenedFrom[] values = values();
        e11 = i0.e(values.length);
        d11 = o.d(e11, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(d11);
        for (NotificationOpenedFrom notificationOpenedFrom : values) {
            linkedHashMap.put(notificationOpenedFrom.value, notificationOpenedFrom);
        }
        map = linkedHashMap;
    }

    private NotificationOpenedFrom(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<NotificationOpenedFrom> getEntries() {
        return $ENTRIES;
    }

    public static NotificationOpenedFrom valueOf(String str) {
        return (NotificationOpenedFrom) Enum.valueOf(NotificationOpenedFrom.class, str);
    }

    public static NotificationOpenedFrom[] values() {
        return (NotificationOpenedFrom[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
