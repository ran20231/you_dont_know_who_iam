package com.forsale.app.utils.analytics.auth;

import a00.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AuthenticationSourcePage.kt */
/* loaded from: classes3.dex */
public final class AuthenticationSourcePage {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AuthenticationSourcePage[] $VALUES;
    private final String value;
    public static final AuthenticationSourcePage PROFILE = new AuthenticationSourcePage("PROFILE", 0, "Profile");
    public static final AuthenticationSourcePage LISTING_DETAILS_FAVORITE = new AuthenticationSourcePage("LISTING_DETAILS_FAVORITE", 1, "Listing Details Favorite");
    public static final AuthenticationSourcePage LISTING_DETAILS_CHAT = new AuthenticationSourcePage("LISTING_DETAILS_CHAT", 2, "Listing Details Chat");
    public static final AuthenticationSourcePage LISTING_DETAILS_SELLER_FOLLOW = new AuthenticationSourcePage("LISTING_DETAILS_SELLER_FOLLOW", 3, "Listing Details Seller Follow");
    public static final AuthenticationSourcePage LISTING_DETAILS_REPORT = new AuthenticationSourcePage("LISTING_DETAILS_REPORT", 4, "Listing Details Report");
    public static final AuthenticationSourcePage SELLER_REPORT = new AuthenticationSourcePage("SELLER_REPORT", 5, "Seller Report");
    public static final AuthenticationSourcePage ADD_LISTING = new AuthenticationSourcePage("ADD_LISTING", 6, "Add Listing");
    public static final AuthenticationSourcePage LOGIN = new AuthenticationSourcePage("LOGIN", 7, "Login");
    public static final AuthenticationSourcePage SIGNUP = new AuthenticationSourcePage("SIGNUP", 8, "Signup");
    public static final AuthenticationSourcePage DEEP_LINK = new AuthenticationSourcePage("DEEP_LINK", 9, "Deep link");

    private static final /* synthetic */ AuthenticationSourcePage[] $values() {
        return new AuthenticationSourcePage[]{PROFILE, LISTING_DETAILS_FAVORITE, LISTING_DETAILS_CHAT, LISTING_DETAILS_SELLER_FOLLOW, LISTING_DETAILS_REPORT, SELLER_REPORT, ADD_LISTING, LOGIN, SIGNUP, DEEP_LINK};
    }

    static {
        AuthenticationSourcePage[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private AuthenticationSourcePage(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a<AuthenticationSourcePage> getEntries() {
        return $ENTRIES;
    }

    public static AuthenticationSourcePage valueOf(String str) {
        return (AuthenticationSourcePage) Enum.valueOf(AuthenticationSourcePage.class, str);
    }

    public static AuthenticationSourcePage[] values() {
        return (AuthenticationSourcePage[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
