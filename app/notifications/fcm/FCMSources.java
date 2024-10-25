package com.forsale.app.notifications.fcm;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FCMSources.kt */
/* loaded from: classes2.dex */
public final class FCMSources {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ FCMSources[] $VALUES;
    public static final FCMSources PUSH_NOTIFICATION = new FCMSources("PUSH_NOTIFICATION", 0);

    private static final /* synthetic */ FCMSources[] $values() {
        return new FCMSources[]{PUSH_NOTIFICATION};
    }

    static {
        FCMSources[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private FCMSources(String str, int i11) {
    }

    public static a00.a<FCMSources> getEntries() {
        return $ENTRIES;
    }

    public static FCMSources valueOf(String str) {
        return (FCMSources) Enum.valueOf(FCMSources.class, str);
    }

    public static FCMSources[] values() {
        return (FCMSources[]) $VALUES.clone();
    }
}
