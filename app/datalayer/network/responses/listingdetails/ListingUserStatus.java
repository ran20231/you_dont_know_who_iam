package com.forsale.app.datalayer.network.responses.listingdetails;

import a00.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import up.c;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ListingUserStatus.kt */
/* loaded from: classes2.dex */
public final class ListingUserStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ListingUserStatus[] $VALUES;
    private final String value;
    @c("blocked")
    public static final ListingUserStatus BLOCKED = new ListingUserStatus("BLOCKED", 0, "blocked");
    @c(AppMeasurementSdk.ConditionalUserProperty.ACTIVE)
    public static final ListingUserStatus ACTIVE = new ListingUserStatus("ACTIVE", 1, AppMeasurementSdk.ConditionalUserProperty.ACTIVE);

    private static final /* synthetic */ ListingUserStatus[] $values() {
        return new ListingUserStatus[]{BLOCKED, ACTIVE};
    }

    static {
        ListingUserStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ListingUserStatus(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a<ListingUserStatus> getEntries() {
        return $ENTRIES;
    }

    public static ListingUserStatus valueOf(String str) {
        return (ListingUserStatus) Enum.valueOf(ListingUserStatus.class, str);
    }

    public static ListingUserStatus[] values() {
        return (ListingUserStatus[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
