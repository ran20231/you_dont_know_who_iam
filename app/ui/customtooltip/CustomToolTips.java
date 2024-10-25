package com.forsale.app.ui.customtooltip;

import a00.a;
import com.google.android.gms.common.Scopes;
import com.leanplum.internal.Constants;
import up.c;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CustomToolTips.kt */
/* loaded from: classes3.dex */
public final class CustomToolTips {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CustomToolTips[] $VALUES;
    private final String value;
    @c("home")
    public static final CustomToolTips HOME = new CustomToolTips("HOME", 0, "Home");
    @c("offers")
    public static final CustomToolTips OFFERS = new CustomToolTips("OFFERS", 1, "Offers");
    @c("post_ad")
    public static final CustomToolTips POST_AD = new CustomToolTips("POST_AD", 2, "Post Listing");
    @c("search")
    public static final CustomToolTips SEARCH = new CustomToolTips("SEARCH", 3, "Search");
    @c(Scopes.PROFILE)
    public static final CustomToolTips PROFILE = new CustomToolTips("PROFILE", 4, "Profile");
    @c(Constants.Keys.MESSAGES)
    public static final CustomToolTips MESSAGES = new CustomToolTips("MESSAGES", 5, "Messages");

    private static final /* synthetic */ CustomToolTips[] $values() {
        return new CustomToolTips[]{HOME, OFFERS, POST_AD, SEARCH, PROFILE, MESSAGES};
    }

    static {
        CustomToolTips[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private CustomToolTips(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a<CustomToolTips> getEntries() {
        return $ENTRIES;
    }

    public static CustomToolTips valueOf(String str) {
        return (CustomToolTips) Enum.valueOf(CustomToolTips.class, str);
    }

    public static CustomToolTips[] values() {
        return (CustomToolTips[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
