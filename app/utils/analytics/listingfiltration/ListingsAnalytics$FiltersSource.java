package com.forsale.app.utils.analytics.listingfiltration;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ListingsAnalytics.kt */
/* loaded from: classes3.dex */
public final class ListingsAnalytics$FiltersSource {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ ListingsAnalytics$FiltersSource[] $VALUES;
    public static final ListingsAnalytics$FiltersSource DIRECT_LINK = new ListingsAnalytics$FiltersSource("DIRECT_LINK", 0, "Direct Link");
    private final String keyName;

    private static final /* synthetic */ ListingsAnalytics$FiltersSource[] $values() {
        return new ListingsAnalytics$FiltersSource[]{DIRECT_LINK};
    }

    static {
        ListingsAnalytics$FiltersSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ListingsAnalytics$FiltersSource(String str, int i11, String str2) {
        this.keyName = str2;
    }

    public static a00.a<ListingsAnalytics$FiltersSource> getEntries() {
        return $ENTRIES;
    }

    public static ListingsAnalytics$FiltersSource valueOf(String str) {
        return (ListingsAnalytics$FiltersSource) Enum.valueOf(ListingsAnalytics$FiltersSource.class, str);
    }

    public static ListingsAnalytics$FiltersSource[] values() {
        return (ListingsAnalytics$FiltersSource[]) $VALUES.clone();
    }

    public final String getKeyName() {
        return this.keyName;
    }
}
