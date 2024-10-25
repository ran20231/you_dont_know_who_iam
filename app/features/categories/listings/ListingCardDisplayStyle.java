package com.forsale.app.features.categories.listings;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.i0;
import kotlin.collections.r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ListingCardDisplayStyle.kt */
/* loaded from: classes2.dex */
public final class ListingCardDisplayStyle {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ ListingCardDisplayStyle[] $VALUES;
    public static final a Companion;
    private static final Map<String, ListingCardDisplayStyle> map;
    private final String value;
    @c("full_screen")
    public static final ListingCardDisplayStyle FULL_SCREEN = new ListingCardDisplayStyle("FULL_SCREEN", 0, "full_screen");
    @c("half_screen")
    public static final ListingCardDisplayStyle HALF_SCREEN = new ListingCardDisplayStyle("HALF_SCREEN", 1, "half_screen");
    @c("full_screen_no_image")
    public static final ListingCardDisplayStyle FULL_SCREEN_NO_IMAGE = new ListingCardDisplayStyle("FULL_SCREEN_NO_IMAGE", 2, "full_screen_no_image");
    @c("full_screen_for_property")
    public static final ListingCardDisplayStyle FULL_SCREEN_FOR_PROPERTY = new ListingCardDisplayStyle("FULL_SCREEN_FOR_PROPERTY", 3, "full_screen_for_property");
    @c("full_screen_title_attributes")
    public static final ListingCardDisplayStyle FULL_SCREEN_TITLE_ATTRIBUTES = new ListingCardDisplayStyle("FULL_SCREEN_TITLE_ATTRIBUTES", 4, "full_screen_title_attributes");
    @c("full_screen_title_description")
    public static final ListingCardDisplayStyle FULL_SCREEN_TITLE_DESCRIPTION = new ListingCardDisplayStyle("FULL_SCREEN_TITLE_DESCRIPTION", 5, "full_screen_title_description");
    public static final ListingCardDisplayStyle GENERAL = new ListingCardDisplayStyle("GENERAL", 6, "GENERAL");

    /* compiled from: ListingCardDisplayStyle.kt */
    /* loaded from: classes2.dex */
    public static final class a {

        /* compiled from: ListingCardDisplayStyle.kt */
        /* renamed from: com.forsale.app.features.categories.listings.ListingCardDisplayStyle$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C0305a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f27996a;

            static {
                int[] iArr = new int[ListingDecoratorTypes.values().length];
                try {
                    iArr[ListingDecoratorTypes.CATEGORY_LISTINGS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ListingDecoratorTypes.GENERAL_LISTINGS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f27996a = iArr;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ListingCardDisplayStyle a(String type) {
            o.i(type, "type");
            return (ListingCardDisplayStyle) ListingCardDisplayStyle.map.get(type);
        }

        public final List<ListingCardDisplayStyle> b(ListingDecoratorTypes listingDecoratorTypes) {
            List<ListingCardDisplayStyle> q11;
            List<ListingCardDisplayStyle> q12;
            o.i(listingDecoratorTypes, "listingDecoratorTypes");
            int i11 = C0305a.f27996a[listingDecoratorTypes.ordinal()];
            if (i11 == 1 || i11 == 2) {
                q11 = r.q(ListingCardDisplayStyle.FULL_SCREEN_NO_IMAGE, ListingCardDisplayStyle.FULL_SCREEN_TITLE_ATTRIBUTES, ListingCardDisplayStyle.FULL_SCREEN_TITLE_DESCRIPTION);
                return q11;
            }
            q12 = r.q(ListingCardDisplayStyle.FULL_SCREEN, ListingCardDisplayStyle.HALF_SCREEN, ListingCardDisplayStyle.FULL_SCREEN_NO_IMAGE, ListingCardDisplayStyle.FULL_SCREEN_FOR_PROPERTY);
            return q12;
        }
    }

    private static final /* synthetic */ ListingCardDisplayStyle[] $values() {
        return new ListingCardDisplayStyle[]{FULL_SCREEN, HALF_SCREEN, FULL_SCREEN_NO_IMAGE, FULL_SCREEN_FOR_PROPERTY, FULL_SCREEN_TITLE_ATTRIBUTES, FULL_SCREEN_TITLE_DESCRIPTION, GENERAL};
    }

    static {
        int e11;
        int d11;
        ListingCardDisplayStyle[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        ListingCardDisplayStyle[] values = values();
        e11 = i0.e(values.length);
        d11 = m00.o.d(e11, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(d11);
        for (ListingCardDisplayStyle listingCardDisplayStyle : values) {
            linkedHashMap.put(listingCardDisplayStyle.value, listingCardDisplayStyle);
        }
        map = linkedHashMap;
    }

    private ListingCardDisplayStyle(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<ListingCardDisplayStyle> getEntries() {
        return $ENTRIES;
    }

    public static ListingCardDisplayStyle valueOf(String str) {
        return (ListingCardDisplayStyle) Enum.valueOf(ListingCardDisplayStyle.class, str);
    }

    public static ListingCardDisplayStyle[] values() {
        return (ListingCardDisplayStyle[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
