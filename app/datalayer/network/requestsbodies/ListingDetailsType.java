package com.forsale.app.datalayer.network.requestsbodies;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: GetListingDetailsBody.kt */
/* loaded from: classes2.dex */
public abstract class ListingDetailsType {
    public static final int $stable = 0;

    /* compiled from: GetListingDetailsBody.kt */
    /* loaded from: classes2.dex */
    public static final class AdvId extends ListingDetailsType {
        public static final int $stable = 0;
        private final int advId;

        public AdvId(int i11) {
            super(null);
            this.advId = i11;
        }

        public final int getAdvId() {
            return this.advId;
        }
    }

    /* compiled from: GetListingDetailsBody.kt */
    /* loaded from: classes2.dex */
    public static final class Slug extends ListingDetailsType {
        public static final int $stable = 0;
        private final String slug;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Slug(String slug) {
            super(null);
            o.i(slug, "slug");
            this.slug = slug;
        }

        public final String getSlug() {
            return this.slug;
        }
    }

    private ListingDetailsType() {
    }

    public /* synthetic */ ListingDetailsType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
