package com.forsale.app.features.more.mytransactions;

import androidx.lifecycle.b0;
import androidx.paging.i;
import com.forsale.app.base.ViewStates;
import com.forsale.app.datalayer.network.entities.MyTransactionEntity;
import com.forsale.app.datalayer.network.interceptors.ConnectivityInterceptor;
import com.forsale.app.datalayer.network.services.BillingService;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* compiled from: MyTransactionDataSource.kt */
/* loaded from: classes2.dex */
public final class MyTransactionDataSource extends i<Integer, MyTransactionEntity.Record> implements CoroutineScope {

    /* renamed from: b  reason: collision with root package name */
    private final b0<ViewStates> f31964b;

    /* renamed from: c  reason: collision with root package name */
    private final String f31965c;

    /* renamed from: d  reason: collision with root package name */
    private final MutableSharedFlow<Integer> f31966d;

    /* renamed from: e  reason: collision with root package name */
    private final BillingService f31967e;

    /* renamed from: f  reason: collision with root package name */
    private int f31968f;

    /* renamed from: g  reason: collision with root package name */
    private final CoroutineExceptionHandler f31969g;

    /* renamed from: h  reason: collision with root package name */
    private final CoroutineContext f31970h;

    /* compiled from: MyTransactionDataSource.kt */
    /* loaded from: classes2.dex */
    public interface a {
        MyTransactionDataSource a(b0<ViewStates> b0Var, String str, MutableSharedFlow<Integer> mutableSharedFlow);
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MyTransactionDataSource f31981a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CoroutineExceptionHandler.Key key, MyTransactionDataSource myTransactionDataSource) {
            super(key);
            this.f31981a = myTransactionDataSource;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            x10.a.b(th2.getMessage(), new Object[0]);
            if (th2 instanceof ConnectivityInterceptor.ConnectivityException) {
                this.f31981a.B().postValue(ViewStates.CONNECTION_ERROR);
            } else {
                this.f31981a.B().postValue(ViewStates.ERROR);
            }
        }
    }

    public MyTransactionDataSource(b0<ViewStates> statesLiveData, String phone, MutableSharedFlow<Integer> snackBarEvent, BillingService billingService) {
        o.i(statesLiveData, "statesLiveData");
        o.i(phone, "phone");
        o.i(snackBarEvent, "snackBarEvent");
        o.i(billingService, "billingService");
        this.f31964b = statesLiveData;
        this.f31965c = phone;
        this.f31966d = snackBarEvent;
        this.f31967e = billingService;
        this.f31968f = 1;
        b bVar = new b(CoroutineExceptionHandler.Key, this);
        this.f31969g = bVar;
        this.f31970h = Dispatchers.getIO().plus(bVar);
    }

    public final String A() {
        return this.f31965c;
    }

    public final b0<ViewStates> B() {
        return this.f31964b;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f31970h;
    }

    @Override // androidx.paging.i
    public void j(i.d<Integer> params, i.a<Integer, MyTransactionEntity.Record> callback) {
        o.i(params, "params");
        o.i(callback, "callback");
        int intValue = params.f14141a.intValue();
        if (intValue == 1) {
            this.f31964b.postValue(ViewStates.LOADING);
        }
        BuildersKt__Builders_commonKt.launch$default(this, new ud.b(CoroutineExceptionHandler.Key, intValue, this), null, new MyTransactionDataSource$loadAfter$lambda$4$$inlined$loadData$1(this, intValue, null, callback, intValue), 2, null);
    }

    @Override // androidx.paging.i
    public void l(i.d<Integer> params, i.a<Integer, MyTransactionEntity.Record> callback) {
        o.i(params, "params");
        o.i(callback, "callback");
    }

    @Override // androidx.paging.i
    public void o(i.c<Integer> params, i.b<Integer, MyTransactionEntity.Record> callback) {
        o.i(params, "params");
        o.i(callback, "callback");
        int i11 = this.f31968f;
        if (i11 == 1) {
            this.f31964b.postValue(ViewStates.LOADING);
        }
        BuildersKt__Builders_commonKt.launch$default(this, new ud.b(CoroutineExceptionHandler.Key, i11, this), null, new MyTransactionDataSource$loadInitial$$inlined$loadData$1(this, i11, null, callback, this), 2, null);
    }
}
