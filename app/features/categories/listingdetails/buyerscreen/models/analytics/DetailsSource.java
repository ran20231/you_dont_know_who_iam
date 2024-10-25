package com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DetailsSource.kt */
/* loaded from: classes2.dex */
public final class DetailsSource {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ DetailsSource[] $VALUES;
    public static final a Companion;
    private final String value;
    public static final DetailsSource LISTING_DETAILS_PAGE = new DetailsSource("LISTING_DETAILS_PAGE", 0, "Listing Details Page");
    public static final DetailsSource DIRECT_LINK = new DetailsSource("DIRECT_LINK", 1, "Direct Link");

    /* compiled from: DetailsSource.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final DetailsSource a(boolean z11) {
            if (z11) {
                return DetailsSource.LISTING_DETAILS_PAGE;
            }
            if (!z11) {
                return DetailsSource.DIRECT_LINK;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    private static final /* synthetic */ DetailsSource[] $values() {
        return new DetailsSource[]{LISTING_DETAILS_PAGE, DIRECT_LINK};
    }

    static {
        DetailsSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
    }

    private DetailsSource(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<DetailsSource> getEntries() {
        return $ENTRIES;
    }

    public static DetailsSource valueOf(String str) {
        return (DetailsSource) Enum.valueOf(DetailsSource.class, str);
    }

    public static DetailsSource[] values() {
        return (DetailsSource[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
