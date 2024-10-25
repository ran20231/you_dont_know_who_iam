package com.forsale.app.features.more.buymoretoken.paymentoption;

import androidx.lifecycle.r0;
import com.forsale.app.base.ViewStates;
import com.forsale.app.base.viewmodels.BaseStatefulViewModel;
import com.forsale.app.datalayer.network.ResponseWrapper;
import com.forsale.app.datalayer.network.entities.PaymentOptionEntity;
import com.forsale.app.datalayer.network.interceptors.ConnectivityInterceptor;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.datalayer.repositories.PaymentOptionRepository;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.SupervisorKt;
/* compiled from: PaymentOptionsViewModel.kt */
/* loaded from: classes2.dex */
public final class PaymentOptionsViewModel extends BaseStatefulViewModel {

    /* renamed from: l0  reason: collision with root package name */
    private final boolean f31819l0;

    /* renamed from: m0  reason: collision with root package name */
    private final String f31820m0;

    /* renamed from: n0  reason: collision with root package name */
    private final PaymentOptionRepository f31821n0;

    /* renamed from: o0  reason: collision with root package name */
    private final CoroutineContext f31822o0;

    /* renamed from: p0  reason: collision with root package name */
    private final OneShotEventHandler<PaymentOptionEntity> f31823p0;

    /* renamed from: q0  reason: collision with root package name */
    private final OneShotEventHandler<List<PaymentOptionEntity>> f31824q0;

    /* compiled from: PaymentOptionsViewModel.kt */
    /* loaded from: classes2.dex */
    public interface a {
        PaymentOptionsViewModel a(boolean z11, String str);
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PaymentOptionsViewModel f31825a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CoroutineExceptionHandler.Key key, PaymentOptionsViewModel paymentOptionsViewModel) {
            super(key);
            this.f31825a = paymentOptionsViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            if (th2 instanceof ConnectivityInterceptor.ConnectivityException) {
                this.f31825a.v0().postValue(ViewStates.CONNECTION_ERROR);
            } else if (th2 instanceof ResponseWrapper.ResponseErrorException) {
                this.f31825a.v0().postValue(ViewStates.ERROR);
                BuildersKt__Builders_commonKt.launch$default(r0.a(this.f31825a), null, null, new PaymentOptionsViewModel$coroutineContext$1$1(this.f31825a, th2, null), 3, null);
            } else {
                this.f31825a.v0().postValue(ViewStates.ERROR);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentOptionsViewModel(boolean z11, String str, PaymentOptionRepository paymentOptionRepository, BaseRepository baseRepository) {
        super(baseRepository);
        o.i(paymentOptionRepository, "paymentOptionRepository");
        o.i(baseRepository, "baseRepository");
        this.f31819l0 = z11;
        this.f31820m0 = str;
        this.f31821n0 = paymentOptionRepository;
        this.f31822o0 = super.getCoroutineContext().plus(SupervisorKt.SupervisorJob$default(null, 1, null)).plus(new b(CoroutineExceptionHandler.Key, this));
        this.f31823p0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f31824q0 = new OneShotEventHandler<>(null, 0, 3, null);
    }

    private final void C0() {
        AggregatedAllAnalyticsLoggerKt.x0(r(), AggregatedAllAnalyticsLogger.CustomEvents.PAYMENT_OPTIONS_VISITED, false, false, 6, null);
    }

    public final OneShotEventHandler<List<PaymentOptionEntity>> A0() {
        return this.f31824q0;
    }

    public final void B0() {
        v0().postValue(ViewStates.LOADING);
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new PaymentOptionsViewModel$loadPaymentOptions$1(this, null), 3, null);
    }

    public final void D0() {
        C0();
    }

    @Override // com.forsale.app.base.viewmodels.BaseViewModel, kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f31822o0;
    }

    public final boolean x0() {
        return this.f31819l0;
    }

    public final String y0() {
        return this.f31820m0;
    }

    public final OneShotEventHandler<PaymentOptionEntity> z0() {
        return this.f31823p0;
    }
}
