package com.forsale.adserver.view.screens.detailsScreen;

import android.content.Context;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.fragment.app.FragmentManager;
import com.forsale.adserver.utils.InitAnalytics;
import com.forsale.adserver.view.models.AdsModel;
import com.forsale.adserver.view.models.DetailsIntention;
import com.forsale.adserver.view.models.DetailsModel;
import com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet;
import com.forsale.analytics.commercial.CommercialItemDetailsSource;
import com.forsale.analytics.commercial.CommercialPageSource;
import commercial.CommercialTabName;
import j0.d1;
import j0.v0;
import j9.c;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
/* compiled from: NewDetailsBottomSheet.kt */
/* loaded from: classes2.dex */
public final class NewDetailsBottomSheetKt {
    public static final void a(final boolean z11, final g00.a<wz.p> aVar, androidx.compose.runtime.a aVar2, final int i11) {
        int i12;
        androidx.compose.runtime.a aVar3;
        int i13;
        int i14;
        androidx.compose.runtime.a h11 = aVar2.h(-775407461);
        if ((i11 & 14) == 0) {
            if (h11.a(z11)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.F(aVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && h11.i()) {
            h11.L();
            aVar3 = h11;
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-775407461, i12, -1, "com.forsale.adserver.view.screens.detailsScreen.ShowDownloadFeedBack (NewDetailsBottomSheet.kt:587)");
            }
            if (z11) {
                aVar3 = h11;
                FeedbackSnackBarKt.a(p1.g.b(l8.h.f62339h, h11, 0), PaddingKt.m(androidx.compose.ui.c.f7566a, 0.0f, 0.0f, 0.0f, e2.h.l(80), 7, null), null, null, 0.0f, null, Boolean.TRUE, null, null, aVar, h11, ((i12 << 24) & 1879048192) | 1572912, 444);
            } else {
                aVar3 = h11;
                x10.a.b(" ShowDownloadFeedBack:: Download FAILED ", new Object[0]);
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = aVar3.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheetKt$ShowDownloadFeedBack$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar4, int i15) {
                    NewDetailsBottomSheetKt.a(z11, aVar, aVar4, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }

    private static final void d(Context context, AdsModel adsModel) {
        if (adsModel.e()) {
            if (adsModel.o()) {
                InitAnalytics.f20835a.g().invoke(String.valueOf(adsModel.g()));
                return;
            }
            com.forsale.adserver.usecases.a d11 = h9.n.f57475c.a(context).d();
            BuildersKt__Builders_commonKt.launch$default(d11, null, null, new NewDetailsBottomSheetKt$incrementViewsCount$1$1(adsModel, d11, null), 3, null);
        }
    }

    public static final void e(Context context, AdsModel adDetails, g00.l<? super CommercialPageSource, wz.p> lVar, List<Integer> masterCatIds, FragmentManager fragmentManager, DetailsIntention intention, CommercialItemDetailsSource source, a aVar, g00.l<? super Boolean, wz.p> isDialogShown) {
        CommercialTabName commercialTabName;
        Integer num;
        Boolean bool;
        Integer num2;
        String str;
        Integer num3;
        Integer num4;
        kotlin.jvm.internal.o.i(context, "<this>");
        kotlin.jvm.internal.o.i(adDetails, "adDetails");
        kotlin.jvm.internal.o.i(masterCatIds, "masterCatIds");
        kotlin.jvm.internal.o.i(fragmentManager, "fragmentManager");
        kotlin.jvm.internal.o.i(intention, "intention");
        kotlin.jvm.internal.o.i(source, "source");
        kotlin.jvm.internal.o.i(isDialogShown, "isDialogShown");
        if (adDetails.f()) {
            i(context, adDetails);
            return;
        }
        NewDetailsBottomSheet.a aVar2 = NewDetailsBottomSheet.C;
        Integer num5 = null;
        if (aVar != null) {
            commercialTabName = aVar.a();
        } else {
            commercialTabName = null;
        }
        if (aVar != null) {
            num = aVar.b();
        } else {
            num = null;
        }
        if (aVar != null) {
            bool = aVar.h();
        } else {
            bool = null;
        }
        if (aVar != null) {
            num2 = aVar.e();
        } else {
            num2 = null;
        }
        if (aVar != null) {
            str = aVar.f();
        } else {
            str = null;
        }
        if (aVar != null) {
            num3 = aVar.g();
        } else {
            num3 = null;
        }
        if (aVar != null) {
            num4 = aVar.c();
        } else {
            num4 = null;
        }
        if (aVar != null) {
            num5 = aVar.d();
        }
        aVar2.a(adDetails, null, true, new DetailsModel(source, intention, commercialTabName, num, masterCatIds, bool, num2, str, num3, num4, num5), fragmentManager, lVar, isDialogShown);
    }

    public static /* synthetic */ void f(Context context, AdsModel adsModel, g00.l lVar, List list, FragmentManager fragmentManager, DetailsIntention detailsIntention, CommercialItemDetailsSource commercialItemDetailsSource, a aVar, g00.l lVar2, int i11, Object obj) {
        g00.l lVar3;
        List list2;
        DetailsIntention detailsIntention2;
        CommercialItemDetailsSource commercialItemDetailsSource2;
        a aVar2;
        NewDetailsBottomSheetKt$launchDetailsDialogue$1 newDetailsBottomSheetKt$launchDetailsDialogue$1;
        List n11;
        if ((i11 & 2) != 0) {
            lVar3 = null;
        } else {
            lVar3 = lVar;
        }
        if ((i11 & 4) != 0) {
            n11 = kotlin.collections.r.n();
            list2 = n11;
        } else {
            list2 = list;
        }
        if ((i11 & 16) != 0) {
            detailsIntention2 = DetailsIntention.ALL_SCREEN;
        } else {
            detailsIntention2 = detailsIntention;
        }
        if ((i11 & 32) != 0) {
            commercialItemDetailsSource2 = CommercialItemDetailsSource.COMMERCIAL_SCREEN;
        } else {
            commercialItemDetailsSource2 = commercialItemDetailsSource;
        }
        if ((i11 & 64) != 0) {
            aVar2 = null;
        } else {
            aVar2 = aVar;
        }
        if ((i11 & 128) != 0) {
            newDetailsBottomSheetKt$launchDetailsDialogue$1 = new g00.l<Boolean, wz.p>() { // from class: com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheetKt$launchDetailsDialogue$1
                public final void invoke(boolean z11) {
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ wz.p invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return wz.p.f75480a;
                }
            };
        } else {
            newDetailsBottomSheetKt$launchDetailsDialogue$1 = lVar2;
        }
        e(context, adsModel, lVar3, list2, fragmentManager, detailsIntention2, commercialItemDetailsSource2, aVar2, newDetailsBottomSheetKt$launchDetailsDialogue$1);
    }

    public static final void g(Context context, String adId, boolean z11, g00.l<? super CommercialPageSource, wz.p> lVar, List<Integer> masterCatIds, FragmentManager fragmentManager, DetailsIntention intention, CommercialItemDetailsSource source, a aVar, g00.l<? super Boolean, wz.p> isDialogShown) {
        CommercialTabName commercialTabName;
        Integer num;
        Boolean bool;
        Integer num2;
        String str;
        Integer num3;
        kotlin.jvm.internal.o.i(context, "<this>");
        kotlin.jvm.internal.o.i(adId, "adId");
        kotlin.jvm.internal.o.i(masterCatIds, "masterCatIds");
        kotlin.jvm.internal.o.i(fragmentManager, "fragmentManager");
        kotlin.jvm.internal.o.i(intention, "intention");
        kotlin.jvm.internal.o.i(source, "source");
        kotlin.jvm.internal.o.i(isDialogShown, "isDialogShown");
        NewDetailsBottomSheet.a aVar2 = NewDetailsBottomSheet.C;
        Integer num4 = null;
        if (aVar != null) {
            commercialTabName = aVar.a();
        } else {
            commercialTabName = null;
        }
        if (aVar != null) {
            num = aVar.b();
        } else {
            num = null;
        }
        if (aVar != null) {
            bool = aVar.h();
        } else {
            bool = null;
        }
        if (aVar != null) {
            num2 = aVar.e();
        } else {
            num2 = null;
        }
        if (aVar != null) {
            str = aVar.f();
        } else {
            str = null;
        }
        if (aVar != null) {
            num3 = aVar.g();
        } else {
            num3 = null;
        }
        if (aVar != null) {
            num4 = aVar.c();
        }
        aVar2.a(null, adId, z11, new DetailsModel(source, intention, commercialTabName, num, masterCatIds, bool, num2, str, num3, num4, null, 1024, null), fragmentManager, lVar, isDialogShown);
    }

    public static /* synthetic */ void h(Context context, String str, boolean z11, g00.l lVar, List list, FragmentManager fragmentManager, DetailsIntention detailsIntention, CommercialItemDetailsSource commercialItemDetailsSource, a aVar, g00.l lVar2, int i11, Object obj) {
        g00.l lVar3;
        List list2;
        DetailsIntention detailsIntention2;
        CommercialItemDetailsSource commercialItemDetailsSource2;
        a aVar2;
        NewDetailsBottomSheetKt$loadAdDialogueById$1 newDetailsBottomSheetKt$loadAdDialogueById$1;
        List n11;
        if ((i11 & 4) != 0) {
            lVar3 = null;
        } else {
            lVar3 = lVar;
        }
        if ((i11 & 8) != 0) {
            n11 = kotlin.collections.r.n();
            list2 = n11;
        } else {
            list2 = list;
        }
        if ((i11 & 32) != 0) {
            detailsIntention2 = DetailsIntention.ALL_SCREEN;
        } else {
            detailsIntention2 = detailsIntention;
        }
        if ((i11 & 64) != 0) {
            commercialItemDetailsSource2 = CommercialItemDetailsSource.COMMERCIAL_SCREEN;
        } else {
            commercialItemDetailsSource2 = commercialItemDetailsSource;
        }
        if ((i11 & 128) != 0) {
            aVar2 = null;
        } else {
            aVar2 = aVar;
        }
        if ((i11 & 256) != 0) {
            newDetailsBottomSheetKt$loadAdDialogueById$1 = new g00.l<Boolean, wz.p>() { // from class: com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheetKt$loadAdDialogueById$1
                public final void invoke(boolean z12) {
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ wz.p invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return wz.p.f75480a;
                }
            };
        } else {
            newDetailsBottomSheetKt$loadAdDialogueById$1 = lVar2;
        }
        g(context, str, z11, lVar3, list2, fragmentManager, detailsIntention2, commercialItemDetailsSource2, aVar2, newDetailsBottomSheetKt$loadAdDialogueById$1);
    }

    public static final void i(Context context, AdsModel adsModel) {
        c.a aVar = j9.c.f60468a;
        String l11 = adsModel.l();
        String m11 = adsModel.m();
        kotlin.jvm.internal.o.f(m11);
        aVar.c(new c.b(context, l11, m11));
        d(context, adsModel);
    }
}
