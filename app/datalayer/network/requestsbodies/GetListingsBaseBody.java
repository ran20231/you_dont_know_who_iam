package com.forsale.app.datalayer.network.requestsbodies;

import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: GetListingsBaseBody.kt */
/* loaded from: classes2.dex */
public abstract class GetListingsBaseBody {
    public static final int $stable = 0;
    public static final String ADV_ID = "adv_id";
    public static final String CATEGORY_ID = "category_id";
    public static final Companion Companion = new Companion(null);
    public static final String DEVICE_ID = "device_id";
    public static final String PAGE_SIZE = "page_size";
    public static final String REGION_ID = "region_id";
    public static final String SEARCH_STRING = "search_string";
    public static final String THUMB_SIZE = "thumb_size";

    /* compiled from: GetListingsBaseBody.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public abstract String getLang();

    public abstract int getPage();

    public abstract int getPageSize();

    public abstract int getRegionId();

    public abstract String getSearchString();

    public abstract int getThumbSize();

    public abstract String getTranslation();
}
