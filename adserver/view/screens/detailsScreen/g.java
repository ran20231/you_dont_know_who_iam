package com.forsale.adserver.view.screens.detailsScreen;

import android.content.Context;
import android.content.Intent;
import com.forsale.adserver.view.models.AdGeneralModel;
/* compiled from: DetailsActivity.kt */
/* loaded from: classes2.dex */
public final class g {
    public static final void a(Context context, AdGeneralModel adDetails, boolean z11, boolean z12, Integer num, String str, String str2, String str3, Integer num2) {
        kotlin.jvm.internal.o.i(context, "<this>");
        kotlin.jvm.internal.o.i(adDetails, "adDetails");
        Intent intent = new Intent(context, DetailsActivity.class);
        intent.putExtra("AD_DETAILS", adDetails);
        intent.putExtra("IS_OFFER", z11);
        intent.putExtra("IS_SPLASH", z12);
        intent.putExtra("OFFER_CATEGORY_ID", num);
        intent.putExtra("OFFER_CATEGORY_NAME", str);
        if (str2 != null) {
            intent.putExtra("BANNER_TYPE", str2);
        }
        if (str3 != null) {
            intent.putExtra("BANNER_SCREEN", str3);
        }
        if (num2 != null) {
            num2.intValue();
            intent.putExtra("CATEGORY_ID", num2.intValue());
        }
        context.startActivity(intent);
    }
}
