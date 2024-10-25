package com.forsale.app.features.postad.bundles;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BundlesSemantics.kt */
/* loaded from: classes2.dex */
public final class BundlesSemantics {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ BundlesSemantics[] $VALUES;
    private final String testTag;
    public static final BundlesSemantics PreviousExperienceCTA = new BundlesSemantics("PreviousExperienceCTA", 0, "BundlesPreviousExperienceCTA");
    public static final BundlesSemantics NextStepCTA = new BundlesSemantics("NextStepCTA", 1, "BundlesNextStepCTA");
    public static final BundlesSemantics BundleCardContainer = new BundlesSemantics("BundleCardContainer", 2, "BundleCardContainer");

    private static final /* synthetic */ BundlesSemantics[] $values() {
        return new BundlesSemantics[]{PreviousExperienceCTA, NextStepCTA, BundleCardContainer};
    }

    static {
        BundlesSemantics[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private BundlesSemantics(String str, int i11, String str2) {
        this.testTag = str2;
    }

    public static a00.a<BundlesSemantics> getEntries() {
        return $ENTRIES;
    }

    public static BundlesSemantics valueOf(String str) {
        return (BundlesSemantics) Enum.valueOf(BundlesSemantics.class, str);
    }

    public static BundlesSemantics[] values() {
        return (BundlesSemantics[]) $VALUES.clone();
    }

    public final String getTestTag() {
        return this.testTag;
    }
}
