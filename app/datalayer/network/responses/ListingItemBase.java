package com.forsale.app.datalayer.network.responses;

import com.forsale.app.datalayer.network.responses.listingdetails.ItemStatus;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ListingItemBase.kt */
/* loaded from: classes2.dex */
public abstract class ListingItemBase {
    public static final int $stable = 0;
    public static final String CAT_ID = "cat_id";
    public static final Companion Companion = new Companion(null);
    public static final String DATE_PUBLISHED = "date_published";
    public static final String DATE_SORT = "date_sort";
    public static final String DESCRIPTION = "description";
    public static final String DISTRICT_NAME = "district_name";
    public static final String DO_NOT_DISTURB = "do_not_disturb";
    public static final String EXPIRE_SOON = "expire_soon";
    public static final String IMAGES_COUNT = "images_count";
    public static final String IS_ANON = "is_anon";
    public static final String IS_HIDE_MY_NUMBER = "is_hide_my_number";
    public static final String IS_PREM = "is_prem";
    public static final String IS_VIDEO_PAID = "is_video_paid";
    public static final String IS_VOIP = "is_voip";
    public static final String PHONE = "phone";
    public static final String REG_ID = "reg_id";
    public static final String VIRTUAL_TOUR_THUMB = "virtual_tour_thumb";
    public static final String WAS_PROMOTED = "was_promoted";

    /* compiled from: ListingItemBase.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public abstract int getCatId();

    public abstract String getContact();

    public abstract String getDatePublished();

    public abstract String getDateSort();

    public abstract String getDoNotDisturb();

    public abstract int getId();

    public abstract int getImagesCount();

    public abstract String getPhone();

    public abstract double getPrice();

    public abstract int getRegId();

    public abstract ItemStatus getStatus();

    public abstract String getTitle();

    public abstract String getUrl();

    public abstract int getWasPromoted();

    public abstract int isAnon();

    public abstract int isHideMyNumber();

    public abstract int isPrem();

    public abstract int isVideoPaid();

    public abstract int isVoip();

    public static /* synthetic */ void getDatePublished$annotations() {
    }
}
