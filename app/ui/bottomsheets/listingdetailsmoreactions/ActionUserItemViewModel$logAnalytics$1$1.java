package com.forsale.app.ui.bottomsheets.listingdetailsmoreactions;

import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.datalayer.network.requestsbodies.UserType;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.repositories.TranslationRepository;
import com.forsale.app.features.categories.listingdetails.ListingDetailsAnalyticSource;
import com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import com.forsale.app.utils.analytics.listingfiltration.ListingsAnalytics$FiltersPlace;
import com.google.android.gms.ads.AdRequest;
import g00.p;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.http2.Http2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ActionUserItemViewModel.kt */
@d(c = "com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.ActionUserItemViewModel$logAnalytics$1$1", f = "ActionUserItemViewModel.kt", l = {138}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ActionUserItemViewModel$logAnalytics$1$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f38336a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ActionUserItemViewModel f38337b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AggregatedAllAnalyticsLogger.AdvActionEvents f38338c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ListingItemDetails f38339d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ boolean f38340e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ boolean f38341f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ boolean f38342g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ AggregatedAllAnalyticsLogger.AnalyticsPosition f38343h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ String f38344i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionUserItemViewModel$logAnalytics$1$1(ActionUserItemViewModel actionUserItemViewModel, AggregatedAllAnalyticsLogger.AdvActionEvents advActionEvents, ListingItemDetails listingItemDetails, boolean z11, boolean z12, boolean z13, AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition, String str, zz.a<? super ActionUserItemViewModel$logAnalytics$1$1> aVar) {
        super(2, aVar);
        this.f38337b = actionUserItemViewModel;
        this.f38338c = advActionEvents;
        this.f38339d = listingItemDetails;
        this.f38340e = z11;
        this.f38341f = z12;
        this.f38342g = z13;
        this.f38343h = analyticsPosition;
        this.f38344i = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ActionUserItemViewModel$logAnalytics$1$1(this.f38337b, this.f38338c, this.f38339d, this.f38340e, this.f38341f, this.f38342g, this.f38343h, this.f38344i, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        Object a02;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f38336a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            AggregatedAllAnalyticsLogger h11 = this.f38337b.h();
            String j11 = this.f38337b.j();
            TranslationRepository.Translation A = this.f38337b.A();
            Boolean G = this.f38337b.G();
            UserType B = this.f38337b.B();
            ListingDetailsAnalyticSource o11 = this.f38337b.o();
            ListingDetailsSearchAnalyticsData v11 = this.f38337b.v();
            List<String> y11 = this.f38337b.y();
            ListingsAnalytics$FiltersPlace k11 = this.f38337b.k();
            String x11 = this.f38337b.x();
            int m11 = this.f38337b.m();
            AggregatedAllAnalyticsLogger.AdvActionEvents advActionEvents = this.f38338c;
            ListingItemDetails listingItemDetails = this.f38339d;
            boolean z11 = this.f38340e;
            boolean z12 = this.f38341f;
            boolean z13 = this.f38342g;
            AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition = this.f38343h;
            String str = this.f38344i;
            this.f38336a = 1;
            a02 = AggregatedAllAnalyticsLoggerKt.a0(h11, advActionEvents, listingItemDetails, j11, A, (r43 & 16) != 0 ? false : z11, (r43 & 32) != 0 ? false : z12, (r43 & 64) != 0 ? false : z13, (r43 & 128) != 0 ? null : analyticsPosition, (r43 & 256) != 0 ? null : str, (r43 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : x11, (r43 & 1024) != 0 ? null : G, (r43 & RecyclerView.l.FLAG_MOVED) != 0 ? null : B, (r43 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? -1 : m11, (r43 & 8192) != 0 ? null : y11, (r43 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : k11, (32768 & r43) != 0 ? null : v11, (65536 & r43) != 0 ? null : o11, (r43 & 131072) != 0 ? new Pair[0] : null, this);
            if (a02 == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((ActionUserItemViewModel$logAnalytics$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
