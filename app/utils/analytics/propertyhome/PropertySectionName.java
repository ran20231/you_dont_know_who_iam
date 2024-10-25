package com.forsale.app.utils.analytics.propertyhome;

import a00.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PropertySectionName.kt */
/* loaded from: classes3.dex */
public final class PropertySectionName {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ PropertySectionName[] $VALUES;
    private final int sectionOrder;
    private final String value;
    public static final PropertySectionName SUB_CATEGORIES = new PropertySectionName("SUB_CATEGORIES", 0, "Sub Categories", 0);
    public static final PropertySectionName FOR_SALE_REALTY = new PropertySectionName("FOR_SALE_REALTY", 1, "4sale Realty", 1);
    public static final PropertySectionName PROPERTY_SERVICES = new PropertySectionName("PROPERTY_SERVICES", 2, "Property Services", 2);
    public static final PropertySectionName HOT_ZONE = new PropertySectionName("HOT_ZONE", 3, "Hot Zone", 3);
    public static final PropertySectionName COMMERCIAL = new PropertySectionName("COMMERCIAL", 4, "Commercial", 4);
    public static final PropertySectionName RECOMMENDED_FILTERS = new PropertySectionName("RECOMMENDED_FILTERS", 5, "Recommended Filters", 5);

    private static final /* synthetic */ PropertySectionName[] $values() {
        return new PropertySectionName[]{SUB_CATEGORIES, FOR_SALE_REALTY, PROPERTY_SERVICES, HOT_ZONE, COMMERCIAL, RECOMMENDED_FILTERS};
    }

    static {
        PropertySectionName[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private PropertySectionName(String str, int i11, String str2, int i12) {
        this.value = str2;
        this.sectionOrder = i12;
    }

    public static a<PropertySectionName> getEntries() {
        return $ENTRIES;
    }

    public static PropertySectionName valueOf(String str) {
        return (PropertySectionName) Enum.valueOf(PropertySectionName.class, str);
    }

    public static PropertySectionName[] values() {
        return (PropertySectionName[]) $VALUES.clone();
    }

    public final int getSectionOrder() {
        return this.sectionOrder;
    }

    public final String getValue() {
        return this.value;
    }
}
