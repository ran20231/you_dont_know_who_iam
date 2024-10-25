package com.forsale.app.utils.analytics.listingfiltration;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ListingsAnalytics.kt */
/* loaded from: classes3.dex */
public final class ListingsAnalytics$FilterMethod {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ ListingsAnalytics$FilterMethod[] $VALUES;
    public static final ListingsAnalytics$FilterMethod SCOPED_SEARCH = new ListingsAnalytics$FilterMethod("SCOPED_SEARCH", 0, "Scoped Search");
    public static final ListingsAnalytics$FilterMethod SELECTED_BY_USER = new ListingsAnalytics$FilterMethod("SELECTED_BY_USER", 1, "Selected By User");
    private final String keyName;

    private static final /* synthetic */ ListingsAnalytics$FilterMethod[] $values() {
        return new ListingsAnalytics$FilterMethod[]{SCOPED_SEARCH, SELECTED_BY_USER};
    }

    static {
        ListingsAnalytics$FilterMethod[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ListingsAnalytics$FilterMethod(String str, int i11, String str2) {
        this.keyName = str2;
    }

    public static a00.a<ListingsAnalytics$FilterMethod> getEntries() {
        return $ENTRIES;
    }

    public static ListingsAnalytics$FilterMethod valueOf(String str) {
        return (ListingsAnalytics$FilterMethod) Enum.valueOf(ListingsAnalytics$FilterMethod.class, str);
    }

    public static ListingsAnalytics$FilterMethod[] values() {
        return (ListingsAnalytics$FilterMethod[]) $VALUES.clone();
    }

    public final String getKeyName() {
        return this.keyName;
    }
}
