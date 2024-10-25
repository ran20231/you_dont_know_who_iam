package com.forsale.app.datalayer.database;

import com.forsale.app.utils.TopLevelUtilityFunctionsKt;
import com.google.gson.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: MasterDataMiscModel.kt */
/* loaded from: classes2.dex */
public final class MasterDataMiscModel {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final String MISC_JSON = "misc_json";
    @c("draft_image")
    private final String draftImage;
    @c(CategoryEntity.FEATURED_IMAGE)
    private final String featuredImage;
    @c("pin_image")
    private final String pinImage;
    @c("pin_waiting_image")
    private final String pinWaitingImage;
    @c("quarantine_image")
    private final String quarantineImage;

    /* compiled from: MasterDataMiscModel.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String convertToJsonString(MasterDataMiscModel miscModel) {
            o.i(miscModel, "miscModel");
            return TopLevelUtilityFunctionsKt.f(miscModel);
        }

        public final MasterDataMiscModel convertToMasterDataMiscModel(String str) {
            boolean z11;
            Object k11;
            if (str != null && str.length() != 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11) {
                k11 = null;
            } else {
                k11 = new d().k(str, MasterDataMiscModel.class);
            }
            return (MasterDataMiscModel) k11;
        }

        public final MasterDataMiscModel createDefaultMasterDataMisc() {
            return new MasterDataMiscModel("https://d3cxve53lbqhxv.cloudfront.net/images/static/new_pinning_addon.png", "https://d3cxve53lbqhxv.cloudfront.net/images/static/ic_waiting.png", "https://d3cxve53lbqhxv.cloudfront.net/images/static/ic_draft.png", "https://d3cxve53lbqhxv.cloudfront.net/images/static/ic_quarntine.png", "https://d3cxve53lbqhxv.cloudfront.net/images/static/new_pinning_addon.png");
        }
    }

    public MasterDataMiscModel(String pinImage, String pinWaitingImage, String draftImage, String quarantineImage, String featuredImage) {
        o.i(pinImage, "pinImage");
        o.i(pinWaitingImage, "pinWaitingImage");
        o.i(draftImage, "draftImage");
        o.i(quarantineImage, "quarantineImage");
        o.i(featuredImage, "featuredImage");
        this.pinImage = pinImage;
        this.pinWaitingImage = pinWaitingImage;
        this.draftImage = draftImage;
        this.quarantineImage = quarantineImage;
        this.featuredImage = featuredImage;
    }

    public static /* synthetic */ MasterDataMiscModel copy$default(MasterDataMiscModel masterDataMiscModel, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = masterDataMiscModel.pinImage;
        }
        if ((i11 & 2) != 0) {
            str2 = masterDataMiscModel.pinWaitingImage;
        }
        String str6 = str2;
        if ((i11 & 4) != 0) {
            str3 = masterDataMiscModel.draftImage;
        }
        String str7 = str3;
        if ((i11 & 8) != 0) {
            str4 = masterDataMiscModel.quarantineImage;
        }
        String str8 = str4;
        if ((i11 & 16) != 0) {
            str5 = masterDataMiscModel.featuredImage;
        }
        return masterDataMiscModel.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.pinImage;
    }

    public final String component2() {
        return this.pinWaitingImage;
    }

    public final String component3() {
        return this.draftImage;
    }

    public final String component4() {
        return this.quarantineImage;
    }

    public final String component5() {
        return this.featuredImage;
    }

    public final MasterDataMiscModel copy(String pinImage, String pinWaitingImage, String draftImage, String quarantineImage, String featuredImage) {
        o.i(pinImage, "pinImage");
        o.i(pinWaitingImage, "pinWaitingImage");
        o.i(draftImage, "draftImage");
        o.i(quarantineImage, "quarantineImage");
        o.i(featuredImage, "featuredImage");
        return new MasterDataMiscModel(pinImage, pinWaitingImage, draftImage, quarantineImage, featuredImage);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MasterDataMiscModel)) {
            return false;
        }
        MasterDataMiscModel masterDataMiscModel = (MasterDataMiscModel) obj;
        if (o.d(this.pinImage, masterDataMiscModel.pinImage) && o.d(this.pinWaitingImage, masterDataMiscModel.pinWaitingImage) && o.d(this.draftImage, masterDataMiscModel.draftImage) && o.d(this.quarantineImage, masterDataMiscModel.quarantineImage) && o.d(this.featuredImage, masterDataMiscModel.featuredImage)) {
            return true;
        }
        return false;
    }

    public final String getDraftImage() {
        return this.draftImage;
    }

    public final String getFeaturedImage() {
        return this.featuredImage;
    }

    public final String getPinImage() {
        return this.pinImage;
    }

    public final String getPinWaitingImage() {
        return this.pinWaitingImage;
    }

    public final String getQuarantineImage() {
        return this.quarantineImage;
    }

    public int hashCode() {
        return (((((((this.pinImage.hashCode() * 31) + this.pinWaitingImage.hashCode()) * 31) + this.draftImage.hashCode()) * 31) + this.quarantineImage.hashCode()) * 31) + this.featuredImage.hashCode();
    }

    public String toString() {
        String str = this.pinImage;
        String str2 = this.pinWaitingImage;
        String str3 = this.draftImage;
        String str4 = this.quarantineImage;
        String str5 = this.featuredImage;
        return "MasterDataMiscModel(pinImage=" + str + ", pinWaitingImage=" + str2 + ", draftImage=" + str3 + ", quarantineImage=" + str4 + ", featuredImage=" + str5 + ")";
    }
}
