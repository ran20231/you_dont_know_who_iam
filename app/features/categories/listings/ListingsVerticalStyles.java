package com.forsale.app.features.categories.listings;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.i0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m00.o;
import up.c;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ListingsVerticalStyles.kt */
/* loaded from: classes2.dex */
public final class ListingsVerticalStyles {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ ListingsVerticalStyles[] $VALUES;
    public static final a Companion;
    private static final Map<String, ListingsVerticalStyles> map;
    private final String value;
    @c("Property")
    public static final ListingsVerticalStyles PROPERTY = new ListingsVerticalStyles("PROPERTY", 0, "Property");
    @c("Jobs")
    public static final ListingsVerticalStyles JOBS = new ListingsVerticalStyles("JOBS", 1, "Jobs");
    @c("Automotive")
    public static final ListingsVerticalStyles AUTOMOTIVE = new ListingsVerticalStyles("AUTOMOTIVE", 2, "Automotive");
    @c("Electronics")
    public static final ListingsVerticalStyles ELECTRONICS = new ListingsVerticalStyles("ELECTRONICS", 3, "Electronics");
    @c("Buy&Sell")
    public static final ListingsVerticalStyles BUY_AND_SELL = new ListingsVerticalStyles("BUY_AND_SELL", 4, "Buy&Sell");
    @c("Services")
    public static final ListingsVerticalStyles SERVICES = new ListingsVerticalStyles("SERVICES", 5, "Services");

    /* compiled from: ListingsVerticalStyles.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static final /* synthetic */ ListingsVerticalStyles[] $values() {
        return new ListingsVerticalStyles[]{PROPERTY, JOBS, AUTOMOTIVE, ELECTRONICS, BUY_AND_SELL, SERVICES};
    }

    static {
        int e11;
        int d11;
        ListingsVerticalStyles[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        ListingsVerticalStyles[] values = values();
        e11 = i0.e(values.length);
        d11 = o.d(e11, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(d11);
        for (ListingsVerticalStyles listingsVerticalStyles : values) {
            linkedHashMap.put(listingsVerticalStyles.value, listingsVerticalStyles);
        }
        map = linkedHashMap;
    }

    private ListingsVerticalStyles(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<ListingsVerticalStyles> getEntries() {
        return $ENTRIES;
    }

    public static ListingsVerticalStyles valueOf(String str) {
        return (ListingsVerticalStyles) Enum.valueOf(ListingsVerticalStyles.class, str);
    }

    public static ListingsVerticalStyles[] values() {
        return (ListingsVerticalStyles[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
