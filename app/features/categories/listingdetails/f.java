package com.forsale.app.features.categories.listingdetails;

import kotlin.jvm.internal.o;
/* compiled from: ListingDetailsOwnerActions.kt */
/* loaded from: classes2.dex */
public final class f {
    public static final ListingDetailsOwnerActions a(String str) {
        ListingDetailsOwnerActions[] values;
        for (ListingDetailsOwnerActions listingDetailsOwnerActions : ListingDetailsOwnerActions.values()) {
            if (o.d(listingDetailsOwnerActions.getValue(), str)) {
                return listingDetailsOwnerActions;
            }
        }
        return null;
    }
}
