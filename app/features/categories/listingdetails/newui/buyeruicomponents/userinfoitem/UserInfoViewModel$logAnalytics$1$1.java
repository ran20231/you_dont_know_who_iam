package com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.userinfoitem;

import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.repositories.TranslationRepository;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import com.google.android.gms.ads.AdRequest;
import g00.p;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.http2.Http2;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UserInfoViewModel.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.userinfoitem.UserInfoViewModel$logAnalytics$1$1", f = "UserInfoViewModel.kt", l = {57}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class UserInfoViewModel$logAnalytics$1$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f27599a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ UserInfoViewModel f27600b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AggregatedAllAnalyticsLogger.AdvActionEvents f27601c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ListingItemDetails f27602d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ boolean f27603e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ boolean f27604f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserInfoViewModel$logAnalytics$1$1(UserInfoViewModel userInfoViewModel, AggregatedAllAnalyticsLogger.AdvActionEvents advActionEvents, ListingItemDetails listingItemDetails, boolean z11, boolean z12, a<? super UserInfoViewModel$logAnalytics$1$1> aVar) {
        super(2, aVar);
        this.f27600b = userInfoViewModel;
        this.f27601c = advActionEvents;
        this.f27602d = listingItemDetails;
        this.f27603e = z11;
        this.f27604f = z12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new UserInfoViewModel$logAnalytics$1$1(this.f27600b, this.f27601c, this.f27602d, this.f27603e, this.f27604f, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger;
        String str;
        TranslationRepository.Translation translation;
        Object a02;
        f11 = b.f();
        int i11 = this.f27599a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            aggregatedAllAnalyticsLogger = this.f27600b.f27586g;
            if (aggregatedAllAnalyticsLogger != null) {
                AggregatedAllAnalyticsLogger.AdvActionEvents advActionEvents = this.f27601c;
                ListingItemDetails listingItemDetails = this.f27602d;
                str = this.f27600b.f27589j;
                translation = this.f27600b.f27585f;
                boolean z11 = this.f27603e;
                boolean z12 = this.f27604f;
                this.f27599a = 1;
                a02 = AggregatedAllAnalyticsLoggerKt.a0(aggregatedAllAnalyticsLogger, advActionEvents, listingItemDetails, str, translation, (r43 & 16) != 0 ? false : z11, (r43 & 32) != 0 ? false : z12, (r43 & 64) != 0 ? false : false, (r43 & 128) != 0 ? null : null, (r43 & 256) != 0 ? null : null, (r43 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : null, (r43 & 1024) != 0 ? null : null, (r43 & RecyclerView.l.FLAG_MOVED) != 0 ? null : null, (r43 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? -1 : 0, (r43 & 8192) != 0 ? null : null, (r43 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : null, (32768 & r43) != 0 ? null : null, (65536 & r43) != 0 ? null : null, (r43 & 131072) != 0 ? new Pair[0] : null, this);
                if (a02 == f11) {
                    return f11;
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((UserInfoViewModel$logAnalytics$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
