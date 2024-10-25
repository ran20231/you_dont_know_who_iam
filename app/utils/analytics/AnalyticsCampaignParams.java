package com.forsale.app.utils.analytics;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AnalyticsCampaignParams.kt */
/* loaded from: classes3.dex */
public final class AnalyticsCampaignParams {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ AnalyticsCampaignParams[] $VALUES;
    private final String value;
    public static final AnalyticsCampaignParams UTM_CAMPAIGN = new AnalyticsCampaignParams("UTM_CAMPAIGN", 0, "utm_campaign");
    public static final AnalyticsCampaignParams UTM_MEDIUM = new AnalyticsCampaignParams("UTM_MEDIUM", 1, "utm_medium");
    public static final AnalyticsCampaignParams CAMPAIGN_ID = new AnalyticsCampaignParams("CAMPAIGN_ID", 2, "campaign_id");
    public static final AnalyticsCampaignParams CAMPAIGN_SOURCE = new AnalyticsCampaignParams("CAMPAIGN_SOURCE", 3, "campaign_source");
    public static final AnalyticsCampaignParams UTM_SOURCE = new AnalyticsCampaignParams("UTM_SOURCE", 4, "utm_source");
    public static final AnalyticsCampaignParams GCLID = new AnalyticsCampaignParams("GCLID", 5, "gclid");

    private static final /* synthetic */ AnalyticsCampaignParams[] $values() {
        return new AnalyticsCampaignParams[]{UTM_CAMPAIGN, UTM_MEDIUM, CAMPAIGN_ID, CAMPAIGN_SOURCE, UTM_SOURCE, GCLID};
    }

    static {
        AnalyticsCampaignParams[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private AnalyticsCampaignParams(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<AnalyticsCampaignParams> getEntries() {
        return $ENTRIES;
    }

    public static AnalyticsCampaignParams valueOf(String str) {
        return (AnalyticsCampaignParams) Enum.valueOf(AnalyticsCampaignParams.class, str);
    }

    public static AnalyticsCampaignParams[] values() {
        return (AnalyticsCampaignParams[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
