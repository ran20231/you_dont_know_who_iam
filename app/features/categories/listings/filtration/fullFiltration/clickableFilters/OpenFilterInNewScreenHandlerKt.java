package com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters;

import androidx.fragment.app.Fragment;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel;
import com.forsale.app.utils.LifeCycleUtilsKt;
import g00.p;
import kotlin.Triple;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.SharedFlow;
/* compiled from: OpenFilterInNewScreenHandler.kt */
/* loaded from: classes2.dex */
public final class OpenFilterInNewScreenHandlerKt {
    public static final void a(Fragment fragment, SharedFlow<? extends Triple<? extends FilterViewModel<?, ?, ?>, ? extends a, Integer>> onFilterClicked, p<? super com.forsale.app.utils.analytics.listingfiltration.a, ? super Integer, wz.p> analyticsBlock) {
        o.i(fragment, "<this>");
        o.i(onFilterClicked, "onFilterClicked");
        o.i(analyticsBlock, "analyticsBlock");
        LifeCycleUtilsKt.b(fragment, new OpenFilterInNewScreenHandlerKt$observeFilterClicked$2(onFilterClicked, fragment, analyticsBlock, null));
    }

    public static /* synthetic */ void b(Fragment fragment, SharedFlow sharedFlow, p pVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            pVar = new p<com.forsale.app.utils.analytics.listingfiltration.a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.OpenFilterInNewScreenHandlerKt$observeFilterClicked$1
                public final void b(com.forsale.app.utils.analytics.listingfiltration.a aVar, int i12) {
                    o.i(aVar, "<anonymous parameter 0>");
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(com.forsale.app.utils.analytics.listingfiltration.a aVar, Integer num) {
                    b(aVar, num.intValue());
                    return wz.p.f75480a;
                }
            };
        }
        a(fragment, sharedFlow, pVar);
    }
}
