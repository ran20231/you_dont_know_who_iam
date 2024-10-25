package com.forsale.app.features.categories.listingdetails;

import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.datalayer.network.requestsbodies.UserType;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.listingfiltration.ListingsAnalytics$FiltersPlace;
import com.google.android.gms.ads.AdRequest;
import g00.p;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.http2.Http2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingDetailsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel$logAnalytics$1", f = "ListingDetailsViewModel.kt", l = {264}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ListingDetailsViewModel$logAnalytics$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f25395a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ListingDetailsViewModel f25396b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AggregatedAllAnalyticsLogger.AdvActionEvents f25397c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f25398d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ String f25399e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ boolean f25400f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ boolean f25401g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ boolean f25402h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ String f25403i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ ListingDetailsAnalyticSource f25404j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingDetailsViewModel$logAnalytics$1(ListingDetailsViewModel listingDetailsViewModel, AggregatedAllAnalyticsLogger.AdvActionEvents advActionEvents, String str, String str2, boolean z11, boolean z12, boolean z13, String str3, ListingDetailsAnalyticSource listingDetailsAnalyticSource, zz.a<? super ListingDetailsViewModel$logAnalytics$1> aVar) {
        super(2, aVar);
        this.f25396b = listingDetailsViewModel;
        this.f25397c = advActionEvents;
        this.f25398d = str;
        this.f25399e = str2;
        this.f25400f = z11;
        this.f25401g = z12;
        this.f25402h = z13;
        this.f25403i = str3;
        this.f25404j = listingDetailsAnalyticSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ListingDetailsViewModel$logAnalytics$1(this.f25396b, this.f25397c, this.f25398d, this.f25399e, this.f25400f, this.f25401g, this.f25402h, this.f25403i, this.f25404j, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        Object Y;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f25395a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            ListingDetailsRepository j12 = this.f25396b.j1();
            int W0 = this.f25396b.W0();
            Boolean z12 = this.f25396b.z1();
            UserType u12 = this.f25396b.u1();
            List<String> q12 = this.f25396b.q1();
            ListingsAnalytics$FiltersPlace R0 = this.f25396b.R0();
            ListingDetailsSearchAnalyticsData k12 = this.f25396b.k1();
            AggregatedAllAnalyticsLogger.AdvActionEvents advActionEvents = this.f25397c;
            String str = this.f25398d;
            String str2 = this.f25399e;
            boolean z11 = this.f25400f;
            boolean z13 = this.f25401g;
            boolean z14 = this.f25402h;
            String str3 = this.f25403i;
            ListingDetailsAnalyticSource listingDetailsAnalyticSource = this.f25404j;
            this.f25395a = 1;
            Y = j12.Y(advActionEvents, W0, (r37 & 4) != 0 ? null : str, (r37 & 8) != 0 ? null : str2, (r37 & 16) != 0 ? true : z11, (r37 & 32) != 0 ? true : z13, (r37 & 64) != 0 ? false : z14, (r37 & 128) != 0 ? null : null, (r37 & 256) != 0 ? null : str3, (r37 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : listingDetailsAnalyticSource, (r37 & 1024) != 0 ? null : z12, (r37 & RecyclerView.l.FLAG_MOVED) != 0 ? null : u12, (r37 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : q12, (r37 & 8192) != 0 ? null : R0, (r37 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : k12, this);
            if (Y == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((ListingDetailsViewModel$logAnalytics$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
