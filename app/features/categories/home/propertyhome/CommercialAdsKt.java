package com.forsale.app.features.categories.home.propertyhome;

import com.forsale.adserver.view.composeViews.commercialList.CommercialHorizontalListKt;
import com.forsale.adserver.view.models.AdGeneralModel;
import g00.p;
import j0.d1;
import j0.v0;
import java.util.List;
import kotlin.jvm.internal.o;
/* compiled from: CommercialAds.kt */
/* loaded from: classes2.dex */
public final class CommercialAdsKt {
    public static final void a(final List<Integer> categoriesList, final p<? super AdGeneralModel, ? super com.forsale.adserver.view.screens.detailsScreen.a, wz.p> onAdClickedCallBack, final boolean z11, final g00.a<wz.p> onSeeAllCommercialClickedCallBack, androidx.compose.runtime.a aVar, final int i11) {
        o.i(categoriesList, "categoriesList");
        o.i(onAdClickedCallBack, "onAdClickedCallBack");
        o.i(onSeeAllCommercialClickedCallBack, "onSeeAllCommercialClickedCallBack");
        androidx.compose.runtime.a h11 = aVar.h(-1927163434);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-1927163434, i11, -1, "com.forsale.app.features.categories.home.propertyhome.CommercialAdsCarousel (CommercialAds.kt:17)");
        }
        h11.C(1157296644);
        boolean T = h11.T(onAdClickedCallBack);
        Object D = h11.D();
        if (T || D == androidx.compose.runtime.a.f7182a.a()) {
            D = new p<AdGeneralModel, com.forsale.adserver.view.screens.detailsScreen.a, wz.p>() { // from class: com.forsale.app.features.categories.home.propertyhome.CommercialAdsKt$CommercialAdsCarousel$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(AdGeneralModel ad2, com.forsale.adserver.view.screens.detailsScreen.a commercialAnalyticPayload) {
                    o.i(ad2, "ad");
                    o.i(commercialAnalyticPayload, "commercialAnalyticPayload");
                    onAdClickedCallBack.invoke(ad2, commercialAnalyticPayload);
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(AdGeneralModel adGeneralModel, com.forsale.adserver.view.screens.detailsScreen.a aVar2) {
                    b(adGeneralModel, aVar2);
                    return wz.p.f75480a;
                }
            };
            h11.u(D);
        }
        h11.S();
        p pVar = (p) D;
        h11.C(1157296644);
        boolean T2 = h11.T(onSeeAllCommercialClickedCallBack);
        Object D2 = h11.D();
        if (T2 || D2 == androidx.compose.runtime.a.f7182a.a()) {
            D2 = new g00.a<wz.p>() { // from class: com.forsale.app.features.categories.home.propertyhome.CommercialAdsKt$CommercialAdsCarousel$2$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // g00.a
                public /* bridge */ /* synthetic */ wz.p invoke() {
                    invoke2();
                    return wz.p.f75480a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    onSeeAllCommercialClickedCallBack.invoke();
                }
            };
            h11.u(D2);
        }
        h11.S();
        CommercialHorizontalListKt.a(categoriesList, null, null, z11, null, pVar, (g00.a) D2, h11, ((i11 << 3) & 7168) | 8, 22);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.home.propertyhome.CommercialAdsKt$CommercialAdsCarousel$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i12) {
                    CommercialAdsKt.a(categoriesList, onAdClickedCallBack, z11, onSeeAllCommercialClickedCallBack, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }
}
