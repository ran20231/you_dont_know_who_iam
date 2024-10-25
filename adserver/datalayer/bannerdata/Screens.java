package com.forsale.adserver.datalayer.bannerdata;

import com.forsale.app.datalayer.database.CategoryEntity;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.i0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: createBanner.kt */
/* loaded from: classes2.dex */
public final class Screens {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ Screens[] $VALUES;
    public static final a Companion;
    private static final Map<String, Screens> map;
    private final String screenName;
    public static final Screens HOME_SCREEN = new Screens("HOME_SCREEN", 0, "home_screen");
    public static final Screens CATEGORIES = new Screens("CATEGORIES", 1, CategoryEntity.CATEGORIES_TABLE);
    public static final Screens LISTINGS = new Screens("LISTINGS", 2, "listings");
    public static final Screens ITEM_DETAILS = new Screens("ITEM_DETAILS", 3, "item_details");
    public static final Screens DEFAULT = new Screens("DEFAULT", 4, "Default");

    /* compiled from: createBanner.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Screens a(String type) {
            o.i(type, "type");
            return (Screens) Screens.map.get(type);
        }
    }

    private static final /* synthetic */ Screens[] $values() {
        return new Screens[]{HOME_SCREEN, CATEGORIES, LISTINGS, ITEM_DETAILS, DEFAULT};
    }

    static {
        int e11;
        int d11;
        Screens[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        Screens[] values = values();
        e11 = i0.e(values.length);
        d11 = m00.o.d(e11, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(d11);
        for (Screens screens : values) {
            linkedHashMap.put(screens.screenName, screens);
        }
        map = linkedHashMap;
    }

    private Screens(String str, int i11, String str2) {
        this.screenName = str2;
    }

    public static a00.a<Screens> getEntries() {
        return $ENTRIES;
    }

    public static Screens valueOf(String str) {
        return (Screens) Enum.valueOf(Screens.class, str);
    }

    public static Screens[] values() {
        return (Screens[]) $VALUES.clone();
    }

    public final String getScreenName() {
        return this.screenName;
    }
}
