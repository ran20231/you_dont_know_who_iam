package com.forsale.app.features.categories.home.allverticals;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.i0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AllVerticalsSectionType.kt */
/* loaded from: classes2.dex */
public final class AllVerticalsSectionType {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ AllVerticalsSectionType[] $VALUES;
    public static final a Companion;
    private static final Map<String, AllVerticalsSectionType> map;
    private final String sectionName;
    public static final AllVerticalsSectionType CATEGORY = new AllVerticalsSectionType("CATEGORY", 0, "Categories");
    public static final AllVerticalsSectionType BUSINESS = new AllVerticalsSectionType("BUSINESS", 1, "Businesses");
    public static final AllVerticalsSectionType AUTO_FEATURED_ADS = new AllVerticalsSectionType("AUTO_FEATURED_ADS", 2, "Auto Featured Ads");
    public static final AllVerticalsSectionType BUSINESS_COMMERCIAL_ADS = new AllVerticalsSectionType("BUSINESS_COMMERCIAL_ADS", 3, "Commercial Slider");
    public static final AllVerticalsSectionType GAM = new AllVerticalsSectionType("GAM", 4, "GAM");
    public static final AllVerticalsSectionType NEW_ARRIVALS = new AllVerticalsSectionType("NEW_ARRIVALS", 5, "New Arrivals");
    public static final AllVerticalsSectionType FEATURED_ADS = new AllVerticalsSectionType("FEATURED_ADS", 6, "Other Featured Ads");
    public static final AllVerticalsSectionType BROWS_AND_EXPLORE = new AllVerticalsSectionType("BROWS_AND_EXPLORE", 7, "Not implemented Yet");

    /* compiled from: AllVerticalsSectionType.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AllVerticalsSectionType a(String type) {
            o.i(type, "type");
            return (AllVerticalsSectionType) AllVerticalsSectionType.map.get(type);
        }
    }

    private static final /* synthetic */ AllVerticalsSectionType[] $values() {
        return new AllVerticalsSectionType[]{CATEGORY, BUSINESS, AUTO_FEATURED_ADS, BUSINESS_COMMERCIAL_ADS, GAM, NEW_ARRIVALS, FEATURED_ADS, BROWS_AND_EXPLORE};
    }

    static {
        int e11;
        int d11;
        AllVerticalsSectionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        AllVerticalsSectionType[] values = values();
        e11 = i0.e(values.length);
        d11 = m00.o.d(e11, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(d11);
        for (AllVerticalsSectionType allVerticalsSectionType : values) {
            linkedHashMap.put(allVerticalsSectionType.sectionName, allVerticalsSectionType);
        }
        map = linkedHashMap;
    }

    private AllVerticalsSectionType(String str, int i11, String str2) {
        this.sectionName = str2;
    }

    public static a00.a<AllVerticalsSectionType> getEntries() {
        return $ENTRIES;
    }

    public static AllVerticalsSectionType valueOf(String str) {
        return (AllVerticalsSectionType) Enum.valueOf(AllVerticalsSectionType.class, str);
    }

    public static AllVerticalsSectionType[] values() {
        return (AllVerticalsSectionType[]) $VALUES.clone();
    }

    public final String getSectionName() {
        return this.sectionName;
    }
}
