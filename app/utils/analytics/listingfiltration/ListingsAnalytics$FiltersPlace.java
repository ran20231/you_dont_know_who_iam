package com.forsale.app.utils.analytics.listingfiltration;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.i0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ListingsAnalytics.kt */
/* loaded from: classes3.dex */
public final class ListingsAnalytics$FiltersPlace {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ ListingsAnalytics$FiltersPlace[] $VALUES;
    public static final a Companion;
    private static final Map<String, ListingsAnalytics$FiltersPlace> map;
    private final String keyName;
    public static final ListingsAnalytics$FiltersPlace PREDEFINED_FILTERS = new ListingsAnalytics$FiltersPlace("PREDEFINED_FILTERS", 0, "Predefined Filters");
    public static final ListingsAnalytics$FiltersPlace ALL_FILTERS = new ListingsAnalytics$FiltersPlace("ALL_FILTERS", 1, "All Filters");
    public static final ListingsAnalytics$FiltersPlace EXPOSED_FILTERS = new ListingsAnalytics$FiltersPlace("EXPOSED_FILTERS", 2, "Exposed Filters");
    public static final ListingsAnalytics$FiltersPlace EMPTY_SCREEN = new ListingsAnalytics$FiltersPlace("EMPTY_SCREEN", 3, "Empty Search Result");

    /* compiled from: ListingsAnalytics.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ListingsAnalytics$FiltersPlace a(String type) {
            o.i(type, "type");
            return (ListingsAnalytics$FiltersPlace) ListingsAnalytics$FiltersPlace.map.get(type);
        }
    }

    private static final /* synthetic */ ListingsAnalytics$FiltersPlace[] $values() {
        return new ListingsAnalytics$FiltersPlace[]{PREDEFINED_FILTERS, ALL_FILTERS, EXPOSED_FILTERS, EMPTY_SCREEN};
    }

    static {
        int e11;
        int d11;
        ListingsAnalytics$FiltersPlace[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        ListingsAnalytics$FiltersPlace[] values = values();
        e11 = i0.e(values.length);
        d11 = m00.o.d(e11, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(d11);
        for (ListingsAnalytics$FiltersPlace listingsAnalytics$FiltersPlace : values) {
            linkedHashMap.put(listingsAnalytics$FiltersPlace.keyName, listingsAnalytics$FiltersPlace);
        }
        map = linkedHashMap;
    }

    private ListingsAnalytics$FiltersPlace(String str, int i11, String str2) {
        this.keyName = str2;
    }

    public static a00.a<ListingsAnalytics$FiltersPlace> getEntries() {
        return $ENTRIES;
    }

    public static ListingsAnalytics$FiltersPlace valueOf(String str) {
        return (ListingsAnalytics$FiltersPlace) Enum.valueOf(ListingsAnalytics$FiltersPlace.class, str);
    }

    public static ListingsAnalytics$FiltersPlace[] values() {
        return (ListingsAnalytics$FiltersPlace[]) $VALUES.clone();
    }

    public final String getKeyName() {
        return this.keyName;
    }
}
