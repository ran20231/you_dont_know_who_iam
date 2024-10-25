package com.forsale.app.features.auth.login;

import a00.a;
import com.forsale.app.utils.analytics.auth.AuthenticationSourcePage;
import t9.y0;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SignInIntention.kt */
/* loaded from: classes2.dex */
public final class SignInIntention {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SignInIntention[] $VALUES;
    public static final SignInIntention CHAT;
    public static final SignInIntention DEFAULT;
    public static final SignInIntention FAVORITE_FROM_DEEPLINK;
    public static final SignInIntention FAVORITE_FROM_PROFILE;
    public static final SignInIntention FOLLOW;
    public static final SignInIntention MY_LISTINGS_FROM_DEEPLINK;
    public static final SignInIntention MY_LISTINGS_FROM_PROFILE;
    public static final SignInIntention REPORT;
    private final AuthenticationSourcePage authenticationSourcePage;
    private final int description;
    private final String intention;
    private final int title;
    public static final SignInIntention POST_AD = new SignInIntention("POST_AD", 0, "post_ad", y0.K9, y0.J9, AuthenticationSourcePage.ADD_LISTING);
    public static final SignInIntention FAVORITE = new SignInIntention("FAVORITE", 1, "favorite", y0.E9, y0.D9, AuthenticationSourcePage.LISTING_DETAILS_FAVORITE);

    private static final /* synthetic */ SignInIntention[] $values() {
        return new SignInIntention[]{POST_AD, FAVORITE, FAVORITE_FROM_PROFILE, FAVORITE_FROM_DEEPLINK, REPORT, FOLLOW, CHAT, MY_LISTINGS_FROM_PROFILE, MY_LISTINGS_FROM_DEEPLINK, DEFAULT};
    }

    static {
        int i11 = y0.E9;
        int i12 = y0.D9;
        AuthenticationSourcePage authenticationSourcePage = AuthenticationSourcePage.PROFILE;
        FAVORITE_FROM_PROFILE = new SignInIntention("FAVORITE_FROM_PROFILE", 2, "favorite", i11, i12, authenticationSourcePage);
        FAVORITE_FROM_DEEPLINK = new SignInIntention("FAVORITE_FROM_DEEPLINK", 3, "favorite", y0.E9, y0.D9, authenticationSourcePage);
        REPORT = new SignInIntention("REPORT", 4, "report", y0.M9, y0.L9, AuthenticationSourcePage.LISTING_DETAILS_REPORT);
        FOLLOW = new SignInIntention("FOLLOW", 5, "follow", y0.G9, y0.F9, AuthenticationSourcePage.LISTING_DETAILS_SELLER_FOLLOW);
        CHAT = new SignInIntention("CHAT", 6, "chat", y0.C9, y0.B9, AuthenticationSourcePage.LISTING_DETAILS_CHAT);
        MY_LISTINGS_FROM_PROFILE = new SignInIntention("MY_LISTINGS_FROM_PROFILE", 7, "mylistings", y0.I9, y0.H9, authenticationSourcePage);
        MY_LISTINGS_FROM_DEEPLINK = new SignInIntention("MY_LISTINGS_FROM_DEEPLINK", 8, "mylistings", y0.I9, y0.H9, authenticationSourcePage);
        DEFAULT = new SignInIntention("DEFAULT", 9, "default", y0.A9, y0.f70785z9, authenticationSourcePage);
        SignInIntention[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private SignInIntention(String str, int i11, String str2, int i12, int i13, AuthenticationSourcePage authenticationSourcePage) {
        this.intention = str2;
        this.title = i12;
        this.description = i13;
        this.authenticationSourcePage = authenticationSourcePage;
    }

    public static a<SignInIntention> getEntries() {
        return $ENTRIES;
    }

    public static SignInIntention valueOf(String str) {
        return (SignInIntention) Enum.valueOf(SignInIntention.class, str);
    }

    public static SignInIntention[] values() {
        return (SignInIntention[]) $VALUES.clone();
    }

    public final AuthenticationSourcePage getAuthenticationSourcePage() {
        return this.authenticationSourcePage;
    }

    public final int getDescription() {
        return this.description;
    }

    public final String getIntention() {
        return this.intention;
    }

    public final int getTitle() {
        return this.title;
    }
}
