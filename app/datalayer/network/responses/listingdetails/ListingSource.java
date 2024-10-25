package com.forsale.app.datalayer.network.responses.listingdetails;

import a00.a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.i0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ListingSource.kt */
/* loaded from: classes2.dex */
public final class ListingSource {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ListingSource[] $VALUES;
    public static final Companion Companion;
    private static final Map<String, ListingSource> map;
    private final String value;
    @c("4sale-mobile")
    public static final ListingSource FORSALE_MOBILE = new ListingSource("FORSALE_MOBILE", 0, "4sale-mobile");
    @c("q8car-mobile")
    public static final ListingSource Q8CAR_MOBILE = new ListingSource("Q8CAR_MOBILE", 1, "q8car-mobile");
    @c("4sale-website")
    public static final ListingSource FORSALE_WEBSITE = new ListingSource("FORSALE_WEBSITE", 2, "4sale-website");
    @c("q8car-website")
    public static final ListingSource Q8CAR_WEBSITE = new ListingSource("Q8CAR_WEBSITE", 3, "q8car-website");
    @c("4sale-admin-commercial")
    public static final ListingSource FORSALE_ADMIN_COMMERCIAL = new ListingSource("FORSALE_ADMIN_COMMERCIAL", 4, "4sale-admin-commercial");
    @c("q8car-admin-commercial")
    public static final ListingSource Q8CAR_ADMIN_COMMERCIAL = new ListingSource("Q8CAR_ADMIN_COMMERCIAL", 5, "q8car-admin-commercial");
    @c("4sale-admin-normal")
    public static final ListingSource FORSALE_ADMIN_NORMAL = new ListingSource("FORSALE_ADMIN_NORMAL", 6, "4sale-admin-normal");
    @c("q8car-admin-normal")
    public static final ListingSource Q8CAR_ADMIN_NORMAL = new ListingSource("Q8CAR_ADMIN_NORMAL", 7, "q8car-admin-normal");
    @c("q8car-office")
    public static final ListingSource Q8CAR_OFFICE = new ListingSource("Q8CAR_OFFICE", 8, "q8car-office");
    @c("q8car")
    public static final ListingSource Q8CAR = new ListingSource("Q8CAR", 9, "q8car");
    @c("4sale-property-office")
    public static final ListingSource FORSALE_PROPERTY_OFFICE = new ListingSource("FORSALE_PROPERTY_OFFICE", 10, "4sale-property-office");

    /* compiled from: ListingSource.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ListingSource from(String type) {
            o.i(type, "type");
            return (ListingSource) ListingSource.map.get(type);
        }
    }

    private static final /* synthetic */ ListingSource[] $values() {
        return new ListingSource[]{FORSALE_MOBILE, Q8CAR_MOBILE, FORSALE_WEBSITE, Q8CAR_WEBSITE, FORSALE_ADMIN_COMMERCIAL, Q8CAR_ADMIN_COMMERCIAL, FORSALE_ADMIN_NORMAL, Q8CAR_ADMIN_NORMAL, Q8CAR_OFFICE, Q8CAR, FORSALE_PROPERTY_OFFICE};
    }

    static {
        int e11;
        int d11;
        ListingSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new Companion(null);
        ListingSource[] values = values();
        e11 = i0.e(values.length);
        d11 = m00.o.d(e11, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(d11);
        for (ListingSource listingSource : values) {
            linkedHashMap.put(listingSource.value, listingSource);
        }
        map = linkedHashMap;
    }

    private ListingSource(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a<ListingSource> getEntries() {
        return $ENTRIES;
    }

    public static ListingSource valueOf(String str) {
        return (ListingSource) Enum.valueOf(ListingSource.class, str);
    }

    public static ListingSource[] values() {
        return (ListingSource[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
