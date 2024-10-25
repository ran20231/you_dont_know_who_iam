package com.forsale.app.datalayer.database;

import kotlin.jvm.internal.o;
import up.c;
/* compiled from: MasterDataLinkModel.kt */
/* loaded from: classes2.dex */
public final class MasterDataLinkModel {
    public static final int $stable = 0;
    @c("facebook")
    private final String facebook;
    @c("instagram")
    private final String instagram;
    @c("twitter")
    private final String twitter;
    @c("youtube")
    private final String youtube;

    public MasterDataLinkModel(String youtube, String twitter, String facebook, String instagram) {
        o.i(youtube, "youtube");
        o.i(twitter, "twitter");
        o.i(facebook, "facebook");
        o.i(instagram, "instagram");
        this.youtube = youtube;
        this.twitter = twitter;
        this.facebook = facebook;
        this.instagram = instagram;
    }

    public static /* synthetic */ MasterDataLinkModel copy$default(MasterDataLinkModel masterDataLinkModel, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = masterDataLinkModel.youtube;
        }
        if ((i11 & 2) != 0) {
            str2 = masterDataLinkModel.twitter;
        }
        if ((i11 & 4) != 0) {
            str3 = masterDataLinkModel.facebook;
        }
        if ((i11 & 8) != 0) {
            str4 = masterDataLinkModel.instagram;
        }
        return masterDataLinkModel.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.youtube;
    }

    public final String component2() {
        return this.twitter;
    }

    public final String component3() {
        return this.facebook;
    }

    public final String component4() {
        return this.instagram;
    }

    public final MasterDataLinkModel copy(String youtube, String twitter, String facebook, String instagram) {
        o.i(youtube, "youtube");
        o.i(twitter, "twitter");
        o.i(facebook, "facebook");
        o.i(instagram, "instagram");
        return new MasterDataLinkModel(youtube, twitter, facebook, instagram);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MasterDataLinkModel)) {
            return false;
        }
        MasterDataLinkModel masterDataLinkModel = (MasterDataLinkModel) obj;
        if (o.d(this.youtube, masterDataLinkModel.youtube) && o.d(this.twitter, masterDataLinkModel.twitter) && o.d(this.facebook, masterDataLinkModel.facebook) && o.d(this.instagram, masterDataLinkModel.instagram)) {
            return true;
        }
        return false;
    }

    public final String getFacebook() {
        return this.facebook;
    }

    public final String getInstagram() {
        return this.instagram;
    }

    public final String getTwitter() {
        return this.twitter;
    }

    public final String getYoutube() {
        return this.youtube;
    }

    public int hashCode() {
        return (((((this.youtube.hashCode() * 31) + this.twitter.hashCode()) * 31) + this.facebook.hashCode()) * 31) + this.instagram.hashCode();
    }

    public String toString() {
        String str = this.youtube;
        String str2 = this.twitter;
        String str3 = this.facebook;
        String str4 = this.instagram;
        return "MasterDataLinkModel(youtube=" + str + ", twitter=" + str2 + ", facebook=" + str3 + ", instagram=" + str4 + ")";
    }
}
