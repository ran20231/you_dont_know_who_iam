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
@d(c = "com.forsale.adserver.view.viewmodel.DetailsAnalyticsLogger$recordCommercialDetailsWhatsappDirected$1", f = "DetailsAnalyticsLogger.kt", l = {303}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class DetailsAnalyticsLogger$recordCommercialDetailsWhatsappDirected$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f21689a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AdsModel f21690b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ DetailsAnalyticsLogger f21691c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f21692d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsAnalyticsLogger$recordCommercialDetailsWhatsappDirected$1(AdsModel adsModel, DetailsAnalyticsLogger detailsAnalyticsLogger, String str, a<? super DetailsAnalyticsLogger$recordCommercialDetailsWhatsappDirected$1> aVar) {
        super(2, aVar);
        this.f21690b = adsModel;
        this.f21691c = detailsAnalyticsLogger;
        this.f21692d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new DetailsAnalyticsLogger$recordCommercialDetailsWhatsappDirected$1(this.f21690b, this.f21691c, this.f21692d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        Object q11;
        CommercialPinEventsData.CommercialPinAttributes r11;
        String i11;
        Integer num;
        f11 = b.f();
        int i12 = this.f21689a;
        if (i12 != 0) {
            if (i12 == 1) {
                f.b(obj);
                q11 = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            if (this.f21690b.a() == AdType.PIN) {
                r11 = this.f21691c.r(this.f21690b);
                String str = this.f21692d;
                DetailsAnalyticsLogger detailsAnalyticsLogger = this.f21691c;
                InitAnalytics.f20835a.m(detailsAnalyticsLogger.e().i(new CommercialPinEventsData.CommercialPinAttributes.g(r11.b(), r11.e(), r11.c(), r11.i(), r11.f(), r11.a(), r11.d(), str, r11.h(), r11.g())));
                return wz.p.f75480a;
            }
            DetailsAnalyticsLogger detailsAnalyticsLogger2 = this.f21691c;
            AdsModel adsModel = this.f21690b;
            this.f21689a = 1;
            q11 = detailsAnalyticsLogger2.q(adsModel, this);
            if (q11 == f11) {
                return f11;
            }
        }
        String str2 = this.f21692d;
        DetailsAnalyticsLogger detailsAnalyticsLogger3 = this.f21691c;
        AdsModel adsModel2 = this.f21690b;
        a.AbstractC0245a abstractC0245a = (a.AbstractC0245a) q11;
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
        i11 = detailsAnalyticsLogger3.i(detailsAnalyticsLogger3.f().a(), abstractC0245a.b());
        Integer b12 = detailsAnalyticsLogger3.f().b();
        if (adsModel2.a() == AdType.BUSINESS_COMMERCIAL) {
            num = kotlin.coroutines.jvm.internal.a.d(adsModel2.g());
        } else {
            num = null;
        }
        InitAnalytics.f20835a.k(detailsAnalyticsLogger3.d().k(new a.AbstractC0245a.g(d11, j11, h11, p11, str2, a11, b11, e11, k11, l11, m11, n11, o11, i13, i11, b12, num)));
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((DetailsAnalyticsLogger$recordCommercialDetailsWhatsappDirected$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
