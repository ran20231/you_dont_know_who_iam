package com.forsale.app.features.more.payment;

import androidx.lifecycle.b0;
import androidx.paging.i;
import com.forsale.app.base.ViewStates;
import com.forsale.app.datalayer.network.entities.PaymentHistoryEntity;
import com.forsale.app.datalayer.network.interceptors.ConnectivityInterceptor;
import com.forsale.app.datalayer.network.services.BillingService;
import de.j;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* compiled from: PaymentHistoryDataSource.kt */
/* loaded from: classes2.dex */
public final class PaymentHistoryDataSource extends i<Integer, PaymentHistoryEntity.PaymentRecord> implements CoroutineScope {

    /* renamed from: b  reason: collision with root package name */
    private final b0<ViewStates> f32708b;

    /* renamed from: c  reason: collision with root package name */
    private final MutableSharedFlow<Integer> f32709c;

    /* renamed from: d  reason: collision with root package name */
    private final BillingService f32710d;

    /* renamed from: e  reason: collision with root package name */
    private final String f32711e;

    /* renamed from: f  reason: collision with root package name */
    private int f32712f;

    /* renamed from: g  reason: collision with root package name */
    private final CoroutineExceptionHandler f32713g;

    /* renamed from: h  reason: collision with root package name */
    private final CoroutineContext f32714h;

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PaymentHistoryDataSource f32725a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CoroutineExceptionHandler.Key key, PaymentHistoryDataSource paymentHistoryDataSource) {
            super(key);
            this.f32725a = paymentHistoryDataSource;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            x10.a.b(th2.getMessage(), new Object[0]);
            if (th2 instanceof ConnectivityInterceptor.ConnectivityException) {
                this.f32725a.B().postValue(ViewStates.CONNECTION_ERROR);
            } else {
                this.f32725a.B().postValue(ViewStates.ERROR);
            }
        }
    }

    public PaymentHistoryDataSource(b0<ViewStates> statesLiveData, MutableSharedFlow<Integer> snackBarEvent, BillingService billingService, String deviceId) {
        o.i(statesLiveData, "statesLiveData");
        o.i(snackBarEvent, "snackBarEvent");
        o.i(billingService, "billingService");
        o.i(deviceId, "deviceId");
        this.f32708b = statesLiveData;
        this.f32709c = snackBarEvent;
        this.f32710d = billingService;
        this.f32711e = deviceId;
        this.f32712f = 1;
        a aVar = new a(CoroutineExceptionHandler.Key, this);
        this.f32713g = aVar;
        this.f32714h = Dispatchers.getIO().plus(aVar);
    }

    public final b0<ViewStates> B() {
        return this.f32708b;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f32714h;
    }

    @Override // androidx.paging.i
    public void j(i.d<Integer> params, i.a<Integer, PaymentHistoryEntity.PaymentRecord> callback) {
        o.i(params, "params");
        o.i(callback, "callback");
        int intValue = params.f14141a.intValue();
        if (intValue == 1) {
            this.f32708b.postValue(ViewStates.LOADING);
        }
        BuildersKt__Builders_commonKt.launch$default(this, new j(CoroutineExceptionHandler.Key, intValue, this), null, new PaymentHistoryDataSource$loadAfter$lambda$4$$inlined$loadData$1(this, intValue, null, callback, intValue), 2, null);
    }

    @Override // androidx.paging.i
    public void l(i.d<Integer> params, i.a<Integer, PaymentHistoryEntity.PaymentRecord> callback) {
        o.i(params, "params");
        o.i(callback, "callback");
    }

    @Override // androidx.paging.i
    public void o(i.c<Integer> params, i.b<Integer, PaymentHistoryEntity.PaymentRecord> callback) {
        o.i(params, "params");
        o.i(callback, "callback");
        int i11 = this.f32712f;
        if (i11 == 1) {
            this.f32708b.postValue(ViewStates.LOADING);
        }
        BuildersKt__Builders_commonKt.launch$default(this, new j(CoroutineExceptionHandler.Key, i11, this), null, new PaymentHistoryDataSource$loadInitial$$inlined$loadData$1(this, i11, null, callback, this), 2, null);
    }
}
