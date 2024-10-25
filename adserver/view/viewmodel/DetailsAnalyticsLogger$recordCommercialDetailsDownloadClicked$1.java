package com.forsale.adserver.view.viewmodel;

import com.forsale.adserver.utils.InitAnalytics;
import com.forsale.adserver.view.models.AdType;
import com.forsale.adserver.view.models.AdsModel;
import com.forsale.analytics.commercial.CommercialItemDetailsSource;
import com.forsale.analytics.commercial.CommercialType;
import com.forsale.analytics.commercial.a;
import commercial.CommercialPinEventsData;
import g00.p;
import java.util.List;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DetailsAnalyticsLogger.kt */
@d(c = "com.forsale.adserver.view.viewmodel.DetailsAnalyticsLogger$recordCommercialDetailsDownloadClicked$1", f = "DetailsAnalyticsLogger.kt", l = {335}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class DetailsAnalyticsLogger$recordCommercialDetailsDownloadClicked$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f21672a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ DetailsAnalyticsLogger f21673b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AdsModel f21674c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsAnalyticsLogger$recordCommercialDetailsDownloadClicked$1(DetailsAnalyticsLogger detailsAnalyticsLogger, AdsModel adsModel, a<? super DetailsAnalyticsLogger$recordCommercialDetailsDownloadClicked$1> aVar) {
        super(2, aVar);
        this.f21673b = detailsAnalyticsLogger;
        this.f21674c = adsModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new DetailsAnalyticsLogger$recordCommercialDetailsDownloadClicked$1(this.f21673b, this.f21674c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        Object q11;
        String i11;
        Integer num;
        CommercialPinEventsData.CommercialPinAttributes r11;
        f11 = b.f();
        int i12 = this.f21672a;
        if (i12 != 0) {
            if (i12 == 1) {
                f.b(obj);
                q11 = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            DetailsAnalyticsLogger detailsAnalyticsLogger = this.f21673b;
            AdsModel adsModel = this.f21674c;
            this.f21672a = 1;
            q11 = detailsAnalyticsLogger.q(adsModel, this);
            if (q11 == f11) {
                return f11;
            }
        }
        AdsModel adsModel2 = this.f21674c;
        DetailsAnalyticsLogger detailsAnalyticsLogger2 = this.f21673b;
        a.AbstractC0245a abstractC0245a = (a.AbstractC0245a) q11;
        if (adsModel2.a() == AdType.PIN) {
            r11 = detailsAnalyticsLogger2.r(adsModel2);
            InitAnalytics.f20835a.m(detailsAnalyticsLogger2.e().i(new CommercialPinEventsData.CommercialPinAttributes.b(r11.b(), r11.e(), r11.c(), r11.i(), r11.f(), r11.a(), r11.d(), r11.h(), r11.g())));
        } else {
            CommercialType d11 = abstractC0245a.d();
            CommercialItemDetailsSource j11 = abstractC0245a.j();
            List<String> h11 = abstractC0245a.h();
            List<String> p11 = abstractC0245a.p();
            Integer a11 = abstractC0245a.a();
            String b11 = abstractC0245a.b();
            Boolean e11 = abstractC0245a.e();
            Integer k11 = abstractC0245a.k();
            String l11 = abstractC0245a.l();
            Integer m11 = abstractC0245a.m();
            List<Integer> n11 = abstractC0245a.n();
            List<String> o11 = abstractC0245a.o();
            Integer i13 = abstractC0245a.i();
            i11 = detailsAnalyticsLogger2.i(detailsAnalyticsLogger2.f().a(), abstractC0245a.b());
            Integer b12 = detailsAnalyticsLogger2.f().b();
            if (adsModel2.a() == AdType.BUSINESS_COMMERCIAL) {
                num = kotlin.coroutines.jvm.internal.a.d(adsModel2.g());
            } else {
                num = null;
            }
            InitAnalytics.f20835a.k(detailsAnalyticsLogger2.d().k(new a.AbstractC0245a.b(d11, j11, h11, p11, a11, b11, e11, k11, l11, m11, n11, o11, i13, i11, b12, num)));
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((DetailsAnalyticsLogger$recordCommercialDetailsDownloadClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
