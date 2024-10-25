package com.forsale.app.features.maincontainer;

import com.google.android.gms.common.Scopes;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HomeTabs.kt */
/* loaded from: classes2.dex */
public final class HomeTabs {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ HomeTabs[] $VALUES;
    private final int index;
    private final String tabId;
    public static final HomeTabs INDEX_HOME = new HomeTabs("INDEX_HOME", 0, 0, "home");
    public static final HomeTabs INDEX_OFFERS = new HomeTabs("INDEX_OFFERS", 1, 1, "offers");
    public static final HomeTabs INDEX_POST_AD = new HomeTabs("INDEX_POST_AD", 2, 2, "plf");
    public static final HomeTabs INDEX_SEARCH = new HomeTabs("INDEX_SEARCH", 3, 3, "search");
    public static final HomeTabs INDEX_PROFILE = new HomeTabs("INDEX_PROFILE", 4, 4, Scopes.PROFILE);

    private static final /* synthetic */ HomeTabs[] $values() {
        return new HomeTabs[]{INDEX_HOME, INDEX_OFFERS, INDEX_POST_AD, INDEX_SEARCH, INDEX_PROFILE};
    }

    static {
        HomeTabs[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private HomeTabs(String str, int i11, int i12, String str2) {
        this.index = i12;
        this.tabId = str2;
    }

    public static a00.a<HomeTabs> getEntries() {
        return $ENTRIES;
    }

    public static HomeTabs valueOf(String str) {
        return (HomeTabs) Enum.valueOf(HomeTabs.class, str);
    }

    public static HomeTabs[] values() {
        return (HomeTabs[]) $VALUES.clone();
    }

    public final int getIndex() {
        return this.index;
    }

    public final String getTabId() {
        return this.tabId;
    }
}
