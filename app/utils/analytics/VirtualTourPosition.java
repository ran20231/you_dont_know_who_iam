package com.forsale.app.utils.analytics;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VirtualTourPosition.kt */
/* loaded from: classes3.dex */
public final class VirtualTourPosition {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ VirtualTourPosition[] $VALUES;
    private final String value;
    public static final VirtualTourPosition MEDIA_SLIDER = new VirtualTourPosition("MEDIA_SLIDER", 0, "Media Slider");
    public static final VirtualTourPosition LISTING_DESCRIPTION = new VirtualTourPosition("LISTING_DESCRIPTION", 1, "Listing Description");

    private static final /* synthetic */ VirtualTourPosition[] $values() {
        return new VirtualTourPosition[]{MEDIA_SLIDER, LISTING_DESCRIPTION};
    }

    static {
        VirtualTourPosition[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private VirtualTourPosition(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<VirtualTourPosition> getEntries() {
        return $ENTRIES;
    }

    public static VirtualTourPosition valueOf(String str) {
        return (VirtualTourPosition) Enum.valueOf(VirtualTourPosition.class, str);
    }

    public static VirtualTourPosition[] values() {
        return (VirtualTourPosition[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
