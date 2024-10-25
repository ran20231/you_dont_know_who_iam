package com.forsale.app.features.more.buymoretoken.billingpackage;

import androidx.lifecycle.b0;
import androidx.lifecycle.k0;
import com.forsale.app.base.ViewStates;
import com.forsale.app.base.viewmodels.BaseStatefulViewModel;
import com.forsale.app.datalayer.network.responses.BillingPackagesResponse;
import com.forsale.app.datalayer.network.services.PaymentService;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import com.forsale.app.utils.analytics.KnetPaymentType;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.Dispatchers;
/* compiled from: BillingPackagesViewModel.kt */
/* loaded from: classes2.dex */
public final class BillingPackagesViewModel extends BaseStatefulViewModel {

    /* renamed from: l0  reason: collision with root package name */
    private final boolean f31731l0;

    /* renamed from: m0  reason: collision with root package name */
    private final String f31732m0;

    /* renamed from: n0  reason: collision with root package name */
    private final com.forsale.app.utils.analytics.g f31733n0;

    /* renamed from: o0  reason: collision with root package name */
    private final jj.b f31734o0;

    /* renamed from: p0  reason: collision with root package name */
    private final PaymentService f31735p0;

    /* renamed from: q0  reason: collision with root package name */
    private final wz.h f31736q0;

    /* renamed from: r0  reason: collision with root package name */
    private final wz.h f31737r0;

    /* renamed from: s0  reason: collision with root package name */
    private final CoroutineExceptionHandler f31738s0;

    /* renamed from: t0  reason: collision with root package name */
    private final CoroutineContext f31739t0;

    /* compiled from: BillingPackagesViewModel.kt */
    /* loaded from: classes2.dex */
    public interface a {
        BillingPackagesViewModel a(boolean z11, String str, k0 k0Var);
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BillingPackagesViewModel f31740a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CoroutineExceptionHandler.Key key, BillingPackagesViewModel billingPackagesViewModel) {
            super(key);
            this.f31740a = billingPackagesViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            String message = th2.getMessage();
            x10.a.b("4SALE_ERROR:: " + message, new Object[0]);
            this.f31740a.v0().postValue(ViewStates.ERROR);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingPackagesViewModel(boolean z11, String str, com.forsale.app.utils.analytics.g aggregatedAnalyticsLogger, jj.b prefs, PaymentService paymentService, final k0 savedStateHandle, BaseRepository baseRepository) {
        super(baseRepository);
        wz.h a11;
        wz.h a12;
        o.i(aggregatedAnalyticsLogger, "aggregatedAnalyticsLogger");
        o.i(prefs, "prefs");
        o.i(paymentService, "paymentService");
        o.i(savedStateHandle, "savedStateHandle");
        o.i(baseRepository, "baseRepository");
        this.f31731l0 = z11;
        this.f31732m0 = str;
        this.f31733n0 = aggregatedAnalyticsLogger;
        this.f31734o0 = prefs;
        this.f31735p0 = paymentService;
        a11 = kotlin.d.a(new g00.a<Integer>() { // from class: com.forsale.app.features.more.buymoretoken.billingpackage.BillingPackagesViewModel$paymentOptionId$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // g00.a
            public final Integer invoke() {
                return Integer.valueOf(a.f31766d.b(k0.this).b().getId());
            }
        });
        this.f31736q0 = a11;
        a12 = kotlin.d.a(new g00.a<b0<List<? extends BillingPackagesResponse.Package>>>() { // from class: com.forsale.app.features.more.buymoretoken.billingpackage.BillingPackagesViewModel$items$2
            @Override // g00.a
            /* renamed from: invoke */
            public final b0<List<? extends BillingPackagesResponse.Package>> invoke2() {
                return new b0<>();
            }
        });
        this.f31737r0 = a12;
        b bVar = new b(CoroutineExceptionHandler.Key, this);
        this.f31738s0 = bVar;
        this.f31739t0 = Dispatchers.getIO().plus(bVar);
        aggregatedAnalyticsLogger.c(false, KnetPaymentType.PACKAGE);
        C0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int A0() {
        return ((Number) this.f31736q0.getValue()).intValue();
    }

    private final void D0() {
        AggregatedAllAnalyticsLoggerKt.w0(r(), AggregatedAllAnalyticsLogger.CustomEvents.PAYMENT_PACKAGES_VISITED, true, true);
    }

    public final String B0() {
        return this.f31732m0;
    }

    public final void C0() {
        v0().postValue(ViewStates.LOADING);
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new BillingPackagesViewModel$loadData$1(this, null), 3, null);
    }

    public final void E0() {
        D0();
    }

    @Override // com.forsale.app.base.viewmodels.BaseViewModel, kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f31739t0;
    }

    public final boolean y0() {
        return this.f31731l0;
    }

    public final b0<List<BillingPackagesResponse.Package>> z0() {
        return (b0) this.f31737r0.getValue();
    }
}
