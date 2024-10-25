package com.forsale.adserver.datalayer.bannerdata;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.i0;
import kotlin.collections.j0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: createBanner.kt */
/* loaded from: classes2.dex */
public final class ScreenBannerTypes {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ ScreenBannerTypes[] $VALUES;
    public static final a Companion;
    private static final Map<String, ScreenBannerTypes> map;
    private final String type;
    public static final ScreenBannerTypes LANDING_PAGE = new ScreenBannerTypes("LANDING_PAGE", 0, "landing");
    public static final ScreenBannerTypes FIXED_FOOTER = new ScreenBannerTypes("FIXED_FOOTER", 1, "fixed_footer");
    public static final ScreenBannerTypes SLIDING_BIG = new ScreenBannerTypes("SLIDING_BIG", 2, "sliding_big");
    public static final ScreenBannerTypes SLIDING_SMALL = new ScreenBannerTypes("SLIDING_SMALL", 3, "sliding_small");
    public static final ScreenBannerTypes HOME_TOP = new ScreenBannerTypes("HOME_TOP", 4, "home_top");
    public static final ScreenBannerTypes CATEGORIES_SLIDING = new ScreenBannerTypes("CATEGORIES_SLIDING", 5, "categories_sliding");
    public static final ScreenBannerTypes HOME_SLIDING = new ScreenBannerTypes("HOME_SLIDING", 6, "home_sliding");

    /* compiled from: createBanner.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ScreenBannerTypes a(String type) {
            Object i11;
            o.i(type, "type");
            String lowerCase = "LANDING_PAGE".toLowerCase();
            o.h(lowerCase, "toLowerCase(...)");
            if (!o.d(type, lowerCase)) {
                i11 = j0.i(ScreenBannerTypes.map, type);
                return (ScreenBannerTypes) i11;
            }
            return ScreenBannerTypes.LANDING_PAGE;
        }
    }

    private static final /* synthetic */ ScreenBannerTypes[] $values() {
        return new ScreenBannerTypes[]{LANDING_PAGE, FIXED_FOOTER, SLIDING_BIG, SLIDING_SMALL, HOME_TOP, CATEGORIES_SLIDING, HOME_SLIDING};
    }

    static {
        int e11;
        int d11;
        ScreenBannerTypes[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        ScreenBannerTypes[] values = values();
        e11 = i0.e(values.length);
        d11 = m00.o.d(e11, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(d11);
        for (ScreenBannerTypes screenBannerTypes : values) {
            linkedHashMap.put(screenBannerTypes.type, screenBannerTypes);
        }
        map = linkedHashMap;
    }

    private ScreenBannerTypes(String str, int i11, String str2) {
        this.type = str2;
    }

    public static a00.a<ScreenBannerTypes> getEntries() {
        return $ENTRIES;
    }

    public static ScreenBannerTypes valueOf(String str) {
        return (ScreenBannerTypes) Enum.valueOf(ScreenBannerTypes.class, str);
    }

    public static ScreenBannerTypes[] values() {
        return (ScreenBannerTypes[]) $VALUES.clone();
    }

    public final String getType() {
        return this.type;
    }
}
