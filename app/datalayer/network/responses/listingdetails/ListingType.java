package com.forsale.app.datalayer.network.responses.listingdetails;

import a00.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import up.c;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ListingType.kt */
/* loaded from: classes2.dex */
public final class ListingType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ListingType[] $VALUES;
    @c(AppMeasurementSdk.ConditionalUserProperty.ACTIVE)
    public static final ListingType ACTIVE = new ListingType("ACTIVE", 0, AppMeasurementSdk.ConditionalUserProperty.ACTIVE);
    @c("archived")
    public static final ListingType ARCHIVED = new ListingType("ARCHIVED", 1, "archived");
    private final String value;

    private static final /* synthetic */ ListingType[] $values() {
        return new ListingType[]{ACTIVE, ARCHIVED};
    }

    static {
        ListingType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ListingType(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a<ListingType> getEntries() {
        return $ENTRIES;
    }

    public static ListingType valueOf(String str) {
        return (ListingType) Enum.valueOf(ListingType.class, str);
    }

    public static ListingType[] values() {
        return (ListingType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
