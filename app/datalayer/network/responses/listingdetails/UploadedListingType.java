package com.forsale.app.datalayer.network.responses.listingdetails;

import a00.a;
import up.c;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UploadedListingType.kt */
/* loaded from: classes2.dex */
public final class UploadedListingType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ UploadedListingType[] $VALUES;
    @c("business_commercial")
    public static final UploadedListingType BUSINESS_COMMERCIAL = new UploadedListingType("BUSINESS_COMMERCIAL", 0, "business_commercial");
    @c("default")
    public static final UploadedListingType DEFAULT = new UploadedListingType("DEFAULT", 1, "default");
    private final String value;

    private static final /* synthetic */ UploadedListingType[] $values() {
        return new UploadedListingType[]{BUSINESS_COMMERCIAL, DEFAULT};
    }

    static {
        UploadedListingType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private UploadedListingType(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a<UploadedListingType> getEntries() {
        return $ENTRIES;
    }

    public static UploadedListingType valueOf(String str) {
        return (UploadedListingType) Enum.valueOf(UploadedListingType.class, str);
    }

    public static UploadedListingType[] values() {
        return (UploadedListingType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
