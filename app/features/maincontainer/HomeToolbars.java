package com.forsale.app.features.maincontainer;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HomeToolbars.kt */
/* loaded from: classes2.dex */
public final class HomeToolbars {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ HomeToolbars[] $VALUES;
    public static final HomeToolbars MAIN_TOOLBAR = new HomeToolbars("MAIN_TOOLBAR", 0);
    public static final HomeToolbars SUB_CATEGORY_TOOLBAR = new HomeToolbars("SUB_CATEGORY_TOOLBAR", 1);
    public static final HomeToolbars SEARCH_TOOLBAR = new HomeToolbars("SEARCH_TOOLBAR", 2);
    public static final HomeToolbars NONE = new HomeToolbars("NONE", 3);

    private static final /* synthetic */ HomeToolbars[] $values() {
        return new HomeToolbars[]{MAIN_TOOLBAR, SUB_CATEGORY_TOOLBAR, SEARCH_TOOLBAR, NONE};
    }

    static {
        HomeToolbars[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private HomeToolbars(String str, int i11) {
    }

    public static a00.a<HomeToolbars> getEntries() {
        return $ENTRIES;
    }

    public static HomeToolbars valueOf(String str) {
        return (HomeToolbars) Enum.valueOf(HomeToolbars.class, str);
    }

    public static HomeToolbars[] values() {
        return (HomeToolbars[]) $VALUES.clone();
    }
}
