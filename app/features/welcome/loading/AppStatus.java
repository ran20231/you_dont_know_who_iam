package com.forsale.app.features.welcome.loading;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppStatus.kt */
/* loaded from: classes2.dex */
public final class AppStatus {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ AppStatus[] $VALUES;
    public static final AppStatus NoInternetConnection = new AppStatus("NoInternetConnection", 0);
    public static final AppStatus UnderMaintenance = new AppStatus("UnderMaintenance", 1);
    public static final AppStatus ForceUpdate = new AppStatus("ForceUpdate", 2);

    private static final /* synthetic */ AppStatus[] $values() {
        return new AppStatus[]{NoInternetConnection, UnderMaintenance, ForceUpdate};
    }

    static {
        AppStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private AppStatus(String str, int i11) {
    }

    public static a00.a<AppStatus> getEntries() {
        return $ENTRIES;
    }

    public static AppStatus valueOf(String str) {
        return (AppStatus) Enum.valueOf(AppStatus.class, str);
    }

    public static AppStatus[] values() {
        return (AppStatus[]) $VALUES.clone();
    }
}
