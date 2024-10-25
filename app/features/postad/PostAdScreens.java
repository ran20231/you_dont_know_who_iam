package com.forsale.app.features.postad;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PostAdScreens.kt */
/* loaded from: classes2.dex */
public final class PostAdScreens {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ PostAdScreens[] $VALUES;
    public static final PostAdScreens MAIN_INFO_SCREEN = new PostAdScreens("MAIN_INFO_SCREEN", 0);
    public static final PostAdScreens MEDIA_SCREEN = new PostAdScreens("MEDIA_SCREEN", 1);
    public static final PostAdScreens ATTRIBUTES_SCREEN = new PostAdScreens("ATTRIBUTES_SCREEN", 2);
    public static final PostAdScreens EXTRA_INFO_SCREEN = new PostAdScreens("EXTRA_INFO_SCREEN", 3);
    public static final PostAdScreens PLANS_SCREEN = new PostAdScreens("PLANS_SCREEN", 4);
    public static final PostAdScreens ADDONS_SCREEN = new PostAdScreens("ADDONS_SCREEN", 5);
    public static final PostAdScreens LOCATION_SCREEN = new PostAdScreens("LOCATION_SCREEN", 6);
    public static final PostAdScreens CHOOSE_CATEGORY_SCREEN = new PostAdScreens("CHOOSE_CATEGORY_SCREEN", 7);
    public static final PostAdScreens CALCULATOR_SCREEN = new PostAdScreens("CALCULATOR_SCREEN", 8);
    public static final PostAdScreens BILLING_PACKAGES_SCREEN = new PostAdScreens("BILLING_PACKAGES_SCREEN", 9);
    public static final PostAdScreens PAYMENT_HISTORY_SCREEN = new PostAdScreens("PAYMENT_HISTORY_SCREEN", 10);
    public static final PostAdScreens PAYMENT_HISTORY_DETAILS_SCREEN = new PostAdScreens("PAYMENT_HISTORY_DETAILS_SCREEN", 11);
    public static final PostAdScreens BUNDLES_SCREEN = new PostAdScreens("BUNDLES_SCREEN", 12);

    private static final /* synthetic */ PostAdScreens[] $values() {
        return new PostAdScreens[]{MAIN_INFO_SCREEN, MEDIA_SCREEN, ATTRIBUTES_SCREEN, EXTRA_INFO_SCREEN, PLANS_SCREEN, ADDONS_SCREEN, LOCATION_SCREEN, CHOOSE_CATEGORY_SCREEN, CALCULATOR_SCREEN, BILLING_PACKAGES_SCREEN, PAYMENT_HISTORY_SCREEN, PAYMENT_HISTORY_DETAILS_SCREEN, BUNDLES_SCREEN};
    }

    static {
        PostAdScreens[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private PostAdScreens(String str, int i11) {
    }

    public static a00.a<PostAdScreens> getEntries() {
        return $ENTRIES;
    }

    public static PostAdScreens valueOf(String str) {
        return (PostAdScreens) Enum.valueOf(PostAdScreens.class, str);
    }

    public static PostAdScreens[] values() {
        return (PostAdScreens[]) $VALUES.clone();
    }
}
