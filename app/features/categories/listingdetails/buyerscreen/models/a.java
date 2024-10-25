package com.forsale.app.features.categories.listingdetails.buyerscreen.models;

import com.forsale.app.features.categories.listingdetails.buyerscreen.models.MediaTypes;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.ListingMediaType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.o;
/* compiled from: MediaTypes.kt */
/* loaded from: classes2.dex */
public final class a {
    public static final ListingMediaType a(MediaTypes mediaTypes) {
        o.i(mediaTypes, "<this>");
        if (mediaTypes instanceof MediaTypes.Images) {
            return ListingMediaType.Image;
        }
        if (mediaTypes instanceof MediaTypes.ThreeDTour) {
            return ListingMediaType.ThreeDTour;
        }
        if (o.d(mediaTypes, MediaTypes.Video.f26313a)) {
            return ListingMediaType.Video;
        }
        if (mediaTypes instanceof MediaTypes.PDF) {
            return ListingMediaType.PDF;
        }
        if (mediaTypes instanceof MediaTypes.Map) {
            return ListingMediaType.Map;
        }
        throw new NoWhenBranchMatchedException();
    }
}
