package com.forsale.app.utils.analytics;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EventGroups.kt */
/* loaded from: classes3.dex */
public final class EventGroups {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ EventGroups[] $VALUES;
    private final String value;
    public static final EventGroups AD_SERVER = new EventGroups("AD_SERVER", 0, "Ad Server");
    public static final EventGroups CATEGORIES = new EventGroups("CATEGORIES", 1, "Categories");
    public static final EventGroups LISTINGS = new EventGroups("LISTINGS", 2, "Listings");
    public static final EventGroups MY_LISTINGS = new EventGroups("MY_LISTINGS", 3, "My Listings");
    public static final EventGroups ADD_LISTING = new EventGroups("ADD_LISTING", 4, "Add Listing");
    public static final EventGroups EDIT_LISTING = new EventGroups("EDIT_LISTING", 5, "Edit Listing");

    private static final /* synthetic */ EventGroups[] $values() {
        return new EventGroups[]{AD_SERVER, CATEGORIES, LISTINGS, MY_LISTINGS, ADD_LISTING, EDIT_LISTING};
    }

    static {
        EventGroups[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private EventGroups(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<EventGroups> getEntries() {
        return $ENTRIES;
    }

    public static EventGroups valueOf(String str) {
        return (EventGroups) Enum.valueOf(EventGroups.class, str);
    }

    public static EventGroups[] values() {
        return (EventGroups[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
