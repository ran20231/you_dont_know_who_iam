package com.forsale.app.datalayer.database;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: MasterDataImageBaseUrls.kt */
/* loaded from: classes2.dex */
public final class MasterDataImageBaseUrls {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final String HOME_VERTICAL_BIG = "home_vertical_big";
    public static final String HOME_VERTICAL_SMALL = "home_vertical_small";
    public static final String MEDIA_BIG = "media_big";
    public static final String MEDIA_THUMBNAIL = "media_thumbnail";
    @c(HOME_VERTICAL_BIG)
    private final String homeVerticalBig;
    @c(HOME_VERTICAL_SMALL)
    private final String homeVerticalSmall;
    @c(MEDIA_BIG)
    private final String mediaBig;
    @c(MEDIA_THUMBNAIL)
    private final String mediaThumbnail;

    /* compiled from: MasterDataImageBaseUrls.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public MasterDataImageBaseUrls(String homeVerticalBig, String homeVerticalSmall, String mediaBig, String mediaThumbnail) {
        o.i(homeVerticalBig, "homeVerticalBig");
        o.i(homeVerticalSmall, "homeVerticalSmall");
        o.i(mediaBig, "mediaBig");
        o.i(mediaThumbnail, "mediaThumbnail");
        this.homeVerticalBig = homeVerticalBig;
        this.homeVerticalSmall = homeVerticalSmall;
        this.mediaBig = mediaBig;
        this.mediaThumbnail = mediaThumbnail;
    }

    public final String getHomeVerticalBig() {
        return this.homeVerticalBig;
    }

    public final String getHomeVerticalSmall() {
        return this.homeVerticalSmall;
    }

    public final String getMediaBig() {
        return this.mediaBig;
    }

    public final String getMediaThumbnail() {
        return this.mediaThumbnail;
    }
}
