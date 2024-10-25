package com.forsale.app.datalayer.database;

import kotlin.jvm.internal.DefaultConstructorMarker;
import up.c;
/* compiled from: MasterDataAnalyticsModel.kt */
/* loaded from: classes2.dex */
public final class MasterDataAnalyticsModel {
    public static final int $stable = 0;
    public static final String AMPLITUDE_ANALYTICS_ENABLED = "amplitude_analytics_enabled";
    public static final String APPBOY_ENABLED = "appboy_enabled";
    public static final String AWS_ANALYTICS_ENABLED = "aws_analytics_enabled";
    public static final Companion Companion = new Companion(null);
    public static final String FACEBOOK_ANALYTICS_ENABLED = "facebook_analytics_enabled";
    public static final String GOOGLE_ANALYTICS_ENABLED = "google_analytics_enabled";
    public static final String LEANPLUM_ANALYTICS_ENABLED = "leanplum_analytics_enabled";
    @c(AMPLITUDE_ANALYTICS_ENABLED)
    private final int amplitudeEnabled;
    @c(APPBOY_ENABLED)
    private final int appboyEnabled;
    @c(AWS_ANALYTICS_ENABLED)
    private final int awsAnalyticsEnabled;
    @c(FACEBOOK_ANALYTICS_ENABLED)
    private final int facebookAnalyticsEnabled;
    @c(GOOGLE_ANALYTICS_ENABLED)
    private final int googleAnalyticsEnabled;
    @c(LEANPLUM_ANALYTICS_ENABLED)
    private final int leanplumEnabled;

    /* compiled from: MasterDataAnalyticsModel.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public MasterDataAnalyticsModel(int i11, int i12, int i13, int i14, int i15, int i16) {
        this.awsAnalyticsEnabled = i11;
        this.googleAnalyticsEnabled = i12;
        this.facebookAnalyticsEnabled = i13;
        this.appboyEnabled = i14;
        this.amplitudeEnabled = i15;
        this.leanplumEnabled = i16;
    }

    public static /* synthetic */ MasterDataAnalyticsModel copy$default(MasterDataAnalyticsModel masterDataAnalyticsModel, int i11, int i12, int i13, int i14, int i15, int i16, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            i11 = masterDataAnalyticsModel.awsAnalyticsEnabled;
        }
        if ((i17 & 2) != 0) {
            i12 = masterDataAnalyticsModel.googleAnalyticsEnabled;
        }
        int i18 = i12;
        if ((i17 & 4) != 0) {
            i13 = masterDataAnalyticsModel.facebookAnalyticsEnabled;
        }
        int i19 = i13;
        if ((i17 & 8) != 0) {
            i14 = masterDataAnalyticsModel.appboyEnabled;
        }
        int i21 = i14;
        if ((i17 & 16) != 0) {
            i15 = masterDataAnalyticsModel.amplitudeEnabled;
        }
        int i22 = i15;
        if ((i17 & 32) != 0) {
            i16 = masterDataAnalyticsModel.leanplumEnabled;
        }
        return masterDataAnalyticsModel.copy(i11, i18, i19, i21, i22, i16);
    }

    public final int component1() {
        return this.awsAnalyticsEnabled;
    }

    public final int component2() {
        return this.googleAnalyticsEnabled;
    }

    public final int component3() {
        return this.facebookAnalyticsEnabled;
    }

    public final int component4() {
        return this.appboyEnabled;
    }

    public final int component5() {
        return this.amplitudeEnabled;
    }

    public final int component6() {
        return this.leanplumEnabled;
    }

    public final MasterDataAnalyticsModel copy(int i11, int i12, int i13, int i14, int i15, int i16) {
        return new MasterDataAnalyticsModel(i11, i12, i13, i14, i15, i16);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MasterDataAnalyticsModel)) {
            return false;
        }
        MasterDataAnalyticsModel masterDataAnalyticsModel = (MasterDataAnalyticsModel) obj;
        if (this.awsAnalyticsEnabled == masterDataAnalyticsModel.awsAnalyticsEnabled && this.googleAnalyticsEnabled == masterDataAnalyticsModel.googleAnalyticsEnabled && this.facebookAnalyticsEnabled == masterDataAnalyticsModel.facebookAnalyticsEnabled && this.appboyEnabled == masterDataAnalyticsModel.appboyEnabled && this.amplitudeEnabled == masterDataAnalyticsModel.amplitudeEnabled && this.leanplumEnabled == masterDataAnalyticsModel.leanplumEnabled) {
            return true;
        }
        return false;
    }

    public final int getAmplitudeEnabled() {
        return this.amplitudeEnabled;
    }

    public final int getAppboyEnabled() {
        return this.appboyEnabled;
    }

    public final int getAwsAnalyticsEnabled() {
        return this.awsAnalyticsEnabled;
    }

    public final int getFacebookAnalyticsEnabled() {
        return this.facebookAnalyticsEnabled;
    }

    public final int getGoogleAnalyticsEnabled() {
        return this.googleAnalyticsEnabled;
    }

    public final int getLeanplumEnabled() {
        return this.leanplumEnabled;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.awsAnalyticsEnabled) * 31) + Integer.hashCode(this.googleAnalyticsEnabled)) * 31) + Integer.hashCode(this.facebookAnalyticsEnabled)) * 31) + Integer.hashCode(this.appboyEnabled)) * 31) + Integer.hashCode(this.amplitudeEnabled)) * 31) + Integer.hashCode(this.leanplumEnabled);
    }

    public String toString() {
        int i11 = this.awsAnalyticsEnabled;
        int i12 = this.googleAnalyticsEnabled;
        int i13 = this.facebookAnalyticsEnabled;
        int i14 = this.appboyEnabled;
        int i15 = this.amplitudeEnabled;
        int i16 = this.leanplumEnabled;
        return "MasterDataAnalyticsModel(awsAnalyticsEnabled=" + i11 + ", googleAnalyticsEnabled=" + i12 + ", facebookAnalyticsEnabled=" + i13 + ", appboyEnabled=" + i14 + ", amplitudeEnabled=" + i15 + ", leanplumEnabled=" + i16 + ")";
    }
}
