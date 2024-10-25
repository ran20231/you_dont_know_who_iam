package com.forsale.app.features.powerpins;

import com.forsale.app.datalayer.database.CategoryEntity;
import kotlin.jvm.internal.o;
import up.c;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ListingsScreenType.kt */
/* loaded from: classes2.dex */
public final class ListingsScreenType {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ ListingsScreenType[] $VALUES;
    private final String type;
    @c("splash")
    public static final ListingsScreenType SPLASH = new ListingsScreenType("SPLASH", 0, "splash");
    @c("offers")
    public static final ListingsScreenType OFFERS = new ListingsScreenType("OFFERS", 1, "offers");
    @c("home")
    public static final ListingsScreenType HOME = new ListingsScreenType("HOME", 2, "home");
    @c(CategoryEntity.CATEGORIES_TABLE)
    public static final ListingsScreenType HOME_CATEGORIES = new ListingsScreenType("HOME_CATEGORIES", 3, CategoryEntity.CATEGORIES_TABLE);
    @c(CategoryEntity.CATEGORIES_TABLE)
    public static final ListingsScreenType CATEGORIES = new ListingsScreenType("CATEGORIES", 4, CategoryEntity.CATEGORIES_TABLE);
    @c(CategoryEntity.CATEGORIES_TABLE)
    public static final ListingsScreenType CATEGORY_LISTINGS = new ListingsScreenType("CATEGORY_LISTINGS", 5, CategoryEntity.CATEGORIES_TABLE);
    @c("spotlight")
    public static final ListingsScreenType SPOTLIGHT = new ListingsScreenType("SPOTLIGHT", 6, "spotlight");
    @c("spotlight_all")
    public static final ListingsScreenType SPOTLIGHT_ALL = new ListingsScreenType("SPOTLIGHT_ALL", 7, "spotlight_all");
    @c("new_arrivals")
    public static final ListingsScreenType NEW_ARRIVALS = new ListingsScreenType("NEW_ARRIVALS", 8, "new_arrivals");
    @c("hot_zone")
    public static final ListingsScreenType HOT_ZONE = new ListingsScreenType("HOT_ZONE", 9, "hot_zone");
    @c("featured")
    public static final ListingsScreenType FEATURED = new ListingsScreenType("FEATURED", 10, "featured");
    @c("business_commercial")
    public static final ListingsScreenType BUSINESS_COMMERCIAL = new ListingsScreenType("BUSINESS_COMMERCIAL", 11, "business_commercial");

    /* compiled from: ListingsScreenType.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f36452a;

        static {
            int[] iArr = new int[ListingsScreenType.values().length];
            try {
                iArr[ListingsScreenType.HOME_CATEGORIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f36452a = iArr;
        }
    }

    private static final /* synthetic */ ListingsScreenType[] $values() {
        return new ListingsScreenType[]{SPLASH, OFFERS, HOME, HOME_CATEGORIES, CATEGORIES, CATEGORY_LISTINGS, SPOTLIGHT, SPOTLIGHT_ALL, NEW_ARRIVALS, HOT_ZONE, FEATURED, BUSINESS_COMMERCIAL};
    }

    static {
        ListingsScreenType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ListingsScreenType(String str, int i11, String str2) {
        this.type = str2;
    }

    public static a00.a<ListingsScreenType> getEntries() {
        return $ENTRIES;
    }

    public static ListingsScreenType valueOf(String str) {
        return (ListingsScreenType) Enum.valueOf(ListingsScreenType.class, str);
    }

    public static ListingsScreenType[] values() {
        return (ListingsScreenType[]) $VALUES.clone();
    }

    public final String getType() {
        return this.type;
    }

    public final String toPowerPinAnalyticsString() {
        String str;
        boolean z11;
        String h11;
        if (a.f36452a[ordinal()] == 1) {
            str = "home";
        } else {
            str = this.type;
        }
        if (str.length() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            StringBuilder sb2 = new StringBuilder();
            h11 = kotlin.text.c.h(str.charAt(0));
            sb2.append((Object) h11);
            String substring = str.substring(1);
            o.h(substring, "substring(...)");
            sb2.append(substring);
            return sb2.toString();
        }
        return str;
    }
}
