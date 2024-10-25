package com.forsale.adserver.view.viewmodel;

import com.forsale.adserver.utils.InitAnalytics;
import com.forsale.adserver.view.models.AdsModel;
import com.forsale.adserver.view.models.DetailsModel;
import com.forsale.analytics.AnalyticsType;
import com.forsale.analytics.commercial.CommercialEventsData;
import com.forsale.analytics.commercial.CommercialItemDetailsSource;
import commercial.CommercialPinEventsData;
import commercial.CommercialTabName;
import i9.b;
import java.util.List;
import kotlin.collections.q;
import kotlin.collections.r;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
/* compiled from: DetailsAnalyticsLogger.kt */
/* loaded from: classes2.dex */
public final class DetailsAnalyticsLogger {

    /* renamed from: a  reason: collision with root package name */
    private final DetailsModel f21663a;

    /* renamed from: b  reason: collision with root package name */
    private final AdsModel f21664b;

    /* renamed from: c  reason: collision with root package name */
    private final CoroutineScope f21665c;

    /* renamed from: d  reason: collision with root package name */
    private final b f21666d;

    /* renamed from: e  reason: collision with root package name */
    private final CommercialEventsData f21667e;

    /* renamed from: f  reason: collision with root package name */
    private final CommercialPinEventsData f21668f;

    /* compiled from: DetailsAnalyticsLogger.kt */
    /* loaded from: classes2.dex */
    public interface a {
        DetailsAnalyticsLogger a(DetailsModel detailsModel, AdsModel adsModel, CoroutineScope coroutineScope);
    }

    public DetailsAnalyticsLogger(DetailsModel detailsModel, AdsModel adsModel, CoroutineScope coroutineScope, b masterCategoriesByCatIdInteractor, CommercialEventsData commercialEventsData, CommercialPinEventsData commercialPinEventsData) {
        o.i(detailsModel, "detailsModel");
        o.i(coroutineScope, "coroutineScope");
        o.i(masterCategoriesByCatIdInteractor, "masterCategoriesByCatIdInteractor");
        o.i(commercialEventsData, "commercialEventsData");
        o.i(commercialPinEventsData, "commercialPinEventsData");
        this.f21663a = detailsModel;
        this.f21664b = adsModel;
        this.f21665c = coroutineScope;
        this.f21666d = masterCategoriesByCatIdInteractor;
        this.f21667e = commercialEventsData;
        this.f21668f = commercialPinEventsData;
    }

    private final Object g(zz.a<? super List<Integer>> aVar) {
        Integer num;
        AdsModel adsModel = this.f21664b;
        if (adsModel != null) {
            num = adsModel.i();
        } else {
            num = null;
        }
        if (num != null) {
            return this.f21666d.a(this.f21664b.i().intValue(), aVar);
        }
        List<Integer> d11 = this.f21663a.d();
        if (d11.isEmpty()) {
            return null;
        }
        return d11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String i(CommercialTabName commercialTabName, String str) {
        if (commercialTabName != CommercialTabName.CATEGORY) {
            if (commercialTabName != null) {
                return commercialTabName.getValue();
            }
            return null;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(com.forsale.adserver.view.models.AdsModel r25, zz.a<? super com.forsale.analytics.commercial.a.AbstractC0245a> r26) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.adserver.view.viewmodel.DetailsAnalyticsLogger.q(com.forsale.adserver.view.models.AdsModel, zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CommercialPinEventsData.CommercialPinAttributes r(AdsModel adsModel) {
        DetailsModel detailsModel = this.f21663a;
        return new CommercialPinEventsData.CommercialPinAttributes.f(adsModel.g(), detailsModel.f(), adsModel.k() != null ? q.e(adsModel.k()) : r.n(), adsModel.k() != null ? q.e(adsModel.k()) : r.n(), detailsModel.j(), adsModel.d(), detailsModel.e(), detailsModel.h(), detailsModel.g());
    }

    public final CommercialEventsData d() {
        return this.f21667e;
    }

    public final CommercialPinEventsData e() {
        return this.f21668f;
    }

    public final DetailsModel f() {
        return this.f21663a;
    }

    public final void h(String itemId, AnalyticsType target) {
        o.i(itemId, "itemId");
        o.i(target, "target");
        InitAnalytics.f20835a.f().invoke(itemId, target);
    }

    public final void j(AdsModel advModel) {
        o.i(advModel, "advModel");
        BuildersKt__Builders_commonKt.launch$default(this.f21665c, Dispatchers.getIO(), null, new DetailsAnalyticsLogger$recordCommercialDetailsCloseClicked$1(this, advModel, null), 2, null);
    }

    public final void k(AdsModel advModel) {
        o.i(advModel, "advModel");
        BuildersKt__Builders_commonKt.launch$default(this.f21665c, Dispatchers.getIO(), null, new DetailsAnalyticsLogger$recordCommercialDetailsDownloadClicked$1(this, advModel, null), 2, null);
    }

    public final void l(AdsModel advModel, String phoneNumber) {
        o.i(advModel, "advModel");
        o.i(phoneNumber, "phoneNumber");
        BuildersKt__Builders_commonKt.launch$default(this.f21665c, Dispatchers.getIO(), null, new DetailsAnalyticsLogger$recordCommercialDetailsPhoneClicked$1(advModel, this, phoneNumber, null), 2, null);
    }

    public final void m(AdsModel advModel) {
        o.i(advModel, "advModel");
        BuildersKt__Builders_commonKt.launch$default(this.f21665c, Dispatchers.getIO(), null, new DetailsAnalyticsLogger$recordCommercialDetailsPhoneIconClicked$1(advModel, this, null), 2, null);
    }

    public final void n(AdsModel advModel) {
        o.i(advModel, "advModel");
        BuildersKt__Builders_commonKt.launch$default(this.f21665c, Dispatchers.getIO(), null, new DetailsAnalyticsLogger$recordCommercialDetailsShareClicked$1(this, advModel, null), 2, null);
    }

    public final void o(AdsModel advModel, CommercialItemDetailsSource source) {
        o.i(advModel, "advModel");
        o.i(source, "source");
        BuildersKt__Builders_commonKt.launch$default(this.f21665c, Dispatchers.getIO(), null, new DetailsAnalyticsLogger$recordCommercialDetailsVisited$1(advModel, this, source, null), 2, null);
    }

    public final void p(AdsModel advModel, String whatsappNumber) {
        o.i(advModel, "advModel");
        o.i(whatsappNumber, "whatsappNumber");
        BuildersKt__Builders_commonKt.launch$default(this.f21665c, Dispatchers.getIO(), null, new DetailsAnalyticsLogger$recordCommercialDetailsWhatsappDirected$1(advModel, this, whatsappNumber, null), 2, null);
    }
}
