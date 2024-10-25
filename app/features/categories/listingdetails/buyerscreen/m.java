package com.forsale.app.features.categories.listingdetails.buyerscreen;

import android.content.Context;
import java.util.Arrays;
import kotlin.jvm.internal.w;
import t9.y0;
/* compiled from: BuyerListingDetailsFragment.kt */
/* loaded from: classes2.dex */
public final class m {
    public static final String a(Context context, String shareLink) {
        kotlin.jvm.internal.o.i(context, "<this>");
        kotlin.jvm.internal.o.i(shareLink, "shareLink");
        w wVar = w.f61809a;
        String string = context.getString(y0.f70527jf);
        kotlin.jvm.internal.o.h(string, "getString(...)");
        String format = String.format(string, Arrays.copyOf(new Object[]{context.getString(y0.f70544kf), shareLink}, 2));
        kotlin.jvm.internal.o.h(format, "format(...)");
        return format;
    }
}
