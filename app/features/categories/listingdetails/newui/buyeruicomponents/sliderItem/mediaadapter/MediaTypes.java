package com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.sliderItem.mediaadapter;

import a00.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MediaItem.kt */
/* loaded from: classes2.dex */
public final class MediaTypes {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MediaTypes[] $VALUES;
    public static final MediaTypes VIRTUAL_TOUR = new MediaTypes("VIRTUAL_TOUR", 0);
    public static final MediaTypes VIDEO = new MediaTypes("VIDEO", 1);
    public static final MediaTypes IMAGES = new MediaTypes("IMAGES", 2);

    private static final /* synthetic */ MediaTypes[] $values() {
        return new MediaTypes[]{VIRTUAL_TOUR, VIDEO, IMAGES};
    }

    static {
        MediaTypes[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private MediaTypes(String str, int i11) {
    }

    public static a<MediaTypes> getEntries() {
        return $ENTRIES;
    }

    public static MediaTypes valueOf(String str) {
        return (MediaTypes) Enum.valueOf(MediaTypes.class, str);
    }

    public static MediaTypes[] values() {
        return (MediaTypes[]) $VALUES.clone();
    }
}
