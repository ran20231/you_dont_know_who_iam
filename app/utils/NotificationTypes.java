package com.forsale.app.utils;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.maps.model.PinConfig;
import com.leanplum.messagetemplates.MessageTemplateConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NotificationTypes.kt */
/* loaded from: classes3.dex */
public final class NotificationTypes {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ NotificationTypes[] $VALUES;
    public static final a Companion;
    private static final Map<String, NotificationTypes> map;
    private final String value;
    @up.c("text")
    public static final NotificationTypes TEXT = new NotificationTypes("TEXT", 0, "text");
    @up.c("offers")
    public static final NotificationTypes OFFER = new NotificationTypes("OFFER", 1, "offers");
    @up.c("banner")
    public static final NotificationTypes BANNER = new NotificationTypes("BANNER", 2, "banner");
    @up.c("url")
    public static final NotificationTypes URL = new NotificationTypes(MessageTemplateConstants.Args.URL, 3, "url");
    @up.c("user_adv")
    public static final NotificationTypes USER_ADV = new NotificationTypes("USER_ADV", 4, "user_adv");
    @up.c("admin_adv")
    public static final NotificationTypes ADMIN_ADV = new NotificationTypes("ADMIN_ADV", 5, "admin_adv");
    @up.c("rate")
    public static final NotificationTypes RATE = new NotificationTypes("RATE", 6, "rate");
    @up.c("item_deleted")
    public static final NotificationTypes ITEM_DELETED = new NotificationTypes("ITEM_DELETED", 7, "item_deleted");
    @up.c("chat_deleted")
    public static final NotificationTypes CHAT_DELETED = new NotificationTypes("CHAT_DELETED", 8, "chat_deleted");
    @up.c("payments")
    public static final NotificationTypes PAYMENTS = new NotificationTypes("PAYMENTS", 9, "payments");
    @up.c("userverify")
    public static final NotificationTypes USER_VERIFY = new NotificationTypes("USER_VERIFY", 10, "userverify");
    @up.c("providerprofile")
    public static final NotificationTypes PROVIDER_PROFILE = new NotificationTypes("PROVIDER_PROFILE", 11, "providerprofile");
    @up.c("featured_offers")
    public static final NotificationTypes FEATURED_OFFERS = new NotificationTypes("FEATURED_OFFERS", 12, "featured_offers");
    @up.c("category")
    public static final NotificationTypes CATEGORY = new NotificationTypes("CATEGORY", 13, "category");
    @up.c("listings")
    public static final NotificationTypes LISTINGS = new NotificationTypes("LISTINGS", 14, "listings");
    @up.c("offer_category")
    public static final NotificationTypes OFFER_CATEGORY = new NotificationTypes("OFFER_CATEGORY", 15, "offer_category");
    @up.c("following")
    public static final NotificationTypes FOLLOWING = new NotificationTypes("FOLLOWING", 16, "following");
    @up.c("followers")
    public static final NotificationTypes FOLLOWERS = new NotificationTypes("FOLLOWERS", 17, "followers");
    @up.c("chat_message")
    public static final NotificationTypes CHAT_MESSAGE = new NotificationTypes("CHAT_MESSAGE", 18, "chat_message");
    @up.c("seller")
    public static final NotificationTypes POST_AD = new NotificationTypes("POST_AD", 19, "seller");
    @up.c("favourites")
    public static final NotificationTypes MY_FAVOURITES = new NotificationTypes("MY_FAVOURITES", 20, "favourites");
    @up.c("wanted_items")
    public static final NotificationTypes WANTED_ITEMS = new NotificationTypes("WANTED_ITEMS", 21, "wanted_items");
    @up.c("gam")
    public static final NotificationTypes GAM = new NotificationTypes("GAM", 22, "gam");
    @up.c("my_listings")
    public static final NotificationTypes MY_LISTINGS = new NotificationTypes("MY_LISTINGS", 23, "my_listings");
    @up.c("announcement")
    public static final NotificationTypes ANNOUNCEMENT = new NotificationTypes("ANNOUNCEMENT", 24, "announcement");
    @up.c("engagement")
    public static final NotificationTypes ENGAGEMENT = new NotificationTypes("ENGAGEMENT", 25, "engagement");
    @up.c("rating")
    public static final NotificationTypes RATING = new NotificationTypes("RATING", 26, "rating");
    @up.c("search")
    public static final NotificationTypes SEARCH = new NotificationTypes("SEARCH", 27, "search");
    @up.c(Scopes.PROFILE)
    public static final NotificationTypes PROFILE = new NotificationTypes("PROFILE", 28, Scopes.PROFILE);
    @up.c("virtual_tour")
    public static final NotificationTypes VIRTUAL_TOUR = new NotificationTypes("VIRTUAL_TOUR", 29, "virtual_tour");

    /* compiled from: NotificationTypes.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final NotificationTypes a(String type) {
            NotificationTypes notificationTypes;
            kotlin.jvm.internal.o.i(type, "type");
            if (TypeExtensionsKt.P(type)) {
                notificationTypes = NotificationTypes.URL;
            } else {
                notificationTypes = (NotificationTypes) NotificationTypes.map.get(type);
            }
            if (notificationTypes == null) {
                return NotificationTypes.TEXT;
            }
            return notificationTypes;
        }
    }

    /* compiled from: NotificationTypes.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f39622a;

        static {
            int[] iArr = new int[NotificationTypes.values().length];
            try {
                iArr[NotificationTypes.PROVIDER_PROFILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NotificationTypes.ITEM_DELETED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NotificationTypes.CHAT_DELETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NotificationTypes.CHAT_MESSAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[NotificationTypes.USER_VERIFY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[NotificationTypes.FOLLOWING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[NotificationTypes.FOLLOWERS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[NotificationTypes.TEXT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[NotificationTypes.RATE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[NotificationTypes.BANNER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[NotificationTypes.FEATURED_OFFERS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[NotificationTypes.OFFER_CATEGORY.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[NotificationTypes.OFFER.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[NotificationTypes.ADMIN_ADV.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[NotificationTypes.USER_ADV.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[NotificationTypes.CATEGORY.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[NotificationTypes.LISTINGS.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[NotificationTypes.PAYMENTS.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[NotificationTypes.URL.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[NotificationTypes.GAM.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[NotificationTypes.RATING.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[NotificationTypes.ENGAGEMENT.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[NotificationTypes.POST_AD.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[NotificationTypes.PROFILE.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[NotificationTypes.MY_FAVOURITES.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[NotificationTypes.SEARCH.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            f39622a = iArr;
        }
    }

    private static final /* synthetic */ NotificationTypes[] $values() {
        return new NotificationTypes[]{TEXT, OFFER, BANNER, URL, USER_ADV, ADMIN_ADV, RATE, ITEM_DELETED, CHAT_DELETED, PAYMENTS, USER_VERIFY, PROVIDER_PROFILE, FEATURED_OFFERS, CATEGORY, LISTINGS, OFFER_CATEGORY, FOLLOWING, FOLLOWERS, CHAT_MESSAGE, POST_AD, MY_FAVOURITES, WANTED_ITEMS, GAM, MY_LISTINGS, ANNOUNCEMENT, ENGAGEMENT, RATING, SEARCH, PROFILE, VIRTUAL_TOUR};
    }

    static {
        int e11;
        int d11;
        NotificationTypes[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        NotificationTypes[] values = values();
        e11 = kotlin.collections.i0.e(values.length);
        d11 = m00.o.d(e11, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(d11);
        for (NotificationTypes notificationTypes : values) {
            linkedHashMap.put(notificationTypes.value, notificationTypes);
        }
        map = linkedHashMap;
    }

    private NotificationTypes(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<NotificationTypes> getEntries() {
        return $ENTRIES;
    }

    public static NotificationTypes valueOf(String str) {
        return (NotificationTypes) Enum.valueOf(NotificationTypes.class, str);
    }

    public static NotificationTypes[] values() {
        return (NotificationTypes[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public final int mapToInboxIcon() {
        switch (b.f39622a[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return t9.q0.J0;
            case 9:
                return t9.q0.M0;
            case 10:
            case 11:
            case 12:
            case 13:
            case 20:
                return t9.q0.f69771l1;
            case 14:
            case 15:
                return t9.q0.f69755h1;
            case 16:
            case 17:
                return t9.q0.f69759i1;
            case 18:
                return t9.q0.f69751g1;
            case 19:
                return t9.q0.f69775m1;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return t9.q0.M0;
            case 22:
                return t9.q0.K0;
            case ConnectionResult.API_DISABLED /* 23 */:
                return t9.q0.O0;
            case 24:
                return t9.q0.L0;
            case 25:
                return t9.q0.I0;
            case PinConfig.BITMAP_WIDTH_DP /* 26 */:
                return t9.q0.N0;
            default:
                return t9.q0.J0;
        }
    }

    public final int mapToNotificationIcon() {
        switch (b.f39622a[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return t9.q0.f69763j1;
            case 9:
                return t9.q0.M0;
            case 10:
            case 11:
            case 12:
            case 13:
                return t9.q0.f69771l1;
            case 14:
            case 15:
                return t9.q0.f69755h1;
            case 16:
                return t9.q0.f69759i1;
            case 17:
                return t9.q0.f69767k1;
            case 18:
                return t9.q0.f69751g1;
            case 19:
                return t9.q0.f69775m1;
            default:
                return t9.q0.f69763j1;
        }
    }
}
