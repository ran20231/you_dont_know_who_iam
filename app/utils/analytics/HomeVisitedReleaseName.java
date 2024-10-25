package com.forsale.app.utils.analytics;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HomeVisitedAnalytics.kt */
/* loaded from: classes3.dex */
public final class HomeVisitedReleaseName {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ HomeVisitedReleaseName[] $VALUES;
    public static final HomeVisitedReleaseName SINGLE_HOME = new HomeVisitedReleaseName("SINGLE_HOME", 0, "Single Home V1");
    public static final HomeVisitedReleaseName VERTICAL_PAGE = new HomeVisitedReleaseName("VERTICAL_PAGE", 1, "Vertical Page");
    private final String value;

    private static final /* synthetic */ HomeVisitedReleaseName[] $values() {
        return new HomeVisitedReleaseName[]{SINGLE_HOME, VERTICAL_PAGE};
    }

    static {
        HomeVisitedReleaseName[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private HomeVisitedReleaseName(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<HomeVisitedReleaseName> getEntries() {
        return $ENTRIES;
    }

    public static HomeVisitedReleaseName valueOf(String str) {
        return (HomeVisitedReleaseName) Enum.valueOf(HomeVisitedReleaseName.class, str);
    }

    public static HomeVisitedReleaseName[] values() {
        return (HomeVisitedReleaseName[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
