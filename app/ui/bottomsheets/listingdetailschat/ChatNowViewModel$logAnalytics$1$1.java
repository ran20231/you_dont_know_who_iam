package com.forsale.app.ui.bottomsheets.listingdetailschat;

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
/* compiled from: ChatNowViewModel.kt */
@d(c = "com.forsale.app.ui.bottomsheets.listingdetailschat.ChatNowViewModel$logAnalytics$1$1", f = "ChatNowViewModel.kt", l = {l8.a.f62266c, 51}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ChatNowViewModel$logAnalytics$1$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f38149a;

    /* renamed from: b  reason: collision with root package name */
    int f38150b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ChatNowViewModel f38151c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ AggregatedAllAnalyticsLogger.AdvActionEvents f38152d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ListingItemDetails f38153e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ boolean f38154f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ boolean f38155g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatNowViewModel$logAnalytics$1$1(ChatNowViewModel chatNowViewModel, AggregatedAllAnalyticsLogger.AdvActionEvents advActionEvents, ListingItemDetails listingItemDetails, boolean z11, boolean z12, zz.a<? super ChatNowViewModel$logAnalytics$1$1> aVar) {
        super(2, aVar);
        this.f38151c = chatNowViewModel;
        this.f38152d = advActionEvents;
        this.f38153e = listingItemDetails;
        this.f38154f = z11;
        this.f38155g = z12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ChatNowViewModel$logAnalytics$1$1(this.f38151c, this.f38152d, this.f38153e, this.f38154f, this.f38155g, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        AggregatedAllAnalyticsLogger r11;
        jj.b bVar;
        Object a11;
        Object a02;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f38150b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    f.b(obj);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r11 = (AggregatedAllAnalyticsLogger) this.f38149a;
            f.b(obj);
            a11 = obj;
        } else {
            f.b(obj);
            r11 = this.f38151c.r();
            bVar = this.f38151c.f38145l0;
            kj.b c11 = bVar.c();
            this.f38149a = r11;
            this.f38150b = 1;
            a11 = c11.a(this);
            if (a11 == f11) {
                return f11;
            }
        }
        TranslationRepository.Translation j11 = this.f38151c.w0().j();
        Boolean m11 = this.f38151c.w0().m();
        UserType k11 = this.f38151c.w0().k();
        int e11 = this.f38151c.w0().e();
        String g11 = this.f38151c.w0().g();
        ListingDetailsAnalyticSource a12 = this.f38151c.w0().a();
        List<String> i12 = this.f38151c.w0().i();
        ListingsAnalytics$FiltersPlace b11 = this.f38151c.w0().b();
        ListingDetailsSearchAnalyticsData h11 = this.f38151c.w0().h();
        AggregatedAllAnalyticsLogger.AdvActionEvents advActionEvents = this.f38152d;
        ListingItemDetails listingItemDetails = this.f38153e;
        boolean z11 = this.f38154f;
        boolean z12 = this.f38155g;
        this.f38149a = null;
        this.f38150b = 2;
        a02 = AggregatedAllAnalyticsLoggerKt.a0(r11, advActionEvents, listingItemDetails, (String) a11, j11, (r43 & 16) != 0 ? false : z11, (r43 & 32) != 0 ? false : z12, (r43 & 64) != 0 ? false : false, (r43 & 128) != 0 ? null : null, (r43 & 256) != 0 ? null : null, (r43 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : g11, (r43 & 1024) != 0 ? null : m11, (r43 & RecyclerView.l.FLAG_MOVED) != 0 ? null : k11, (r43 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? -1 : e11, (r43 & 8192) != 0 ? null : i12, (r43 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : b11, (32768 & r43) != 0 ? null : h11, (65536 & r43) != 0 ? null : a12, (r43 & 131072) != 0 ? new Pair[0] : null, this);
        if (a02 == f11) {
            return f11;
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((ChatNowViewModel$logAnalytics$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
