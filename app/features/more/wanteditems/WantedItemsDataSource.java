package com.forsale.app.features.more.wanteditems;

import androidx.databinding.ObservableBoolean;
import androidx.lifecycle.b0;
import androidx.paging.i;
import com.forsale.app.base.ViewStates;
import com.forsale.app.datalayer.network.responses.ItemSubscriptionResponse;
import com.forsale.app.datalayer.network.services.ItemSubscriptionsService;
import java.util.ArrayList;
import java.util.List;
import je.c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* compiled from: WantedItemsDataSource.kt */
/* loaded from: classes2.dex */
public final class WantedItemsDataSource extends i<Integer, ItemSubscriptionResponse> implements CoroutineScope {

    /* renamed from: b  reason: collision with root package name */
    private final b0<ViewStates> f33739b;

    /* renamed from: c  reason: collision with root package name */
    private final MutableSharedFlow<Integer> f33740c;

    /* renamed from: d  reason: collision with root package name */
    private final ObservableBoolean f33741d;

    /* renamed from: e  reason: collision with root package name */
    private final String f33742e;

    /* renamed from: f  reason: collision with root package name */
    private final ItemSubscriptionsService f33743f;

    /* renamed from: g  reason: collision with root package name */
    private final CoroutineExceptionHandler f33744g;

    /* renamed from: h  reason: collision with root package name */
    private final CoroutineContext f33745h;

    /* renamed from: i  reason: collision with root package name */
    private final List<DisposableHandle> f33746i;

    /* renamed from: j  reason: collision with root package name */
    private int f33747j;

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.a implements CoroutineExceptionHandler {
        public a(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            String message = th2.getMessage();
            x10.a.b("4SALE_ERROR:: " + message, new Object[0]);
        }
    }

    public WantedItemsDataSource(b0<ViewStates> statesLiveData, MutableSharedFlow<Integer> snackBarEvent, ObservableBoolean enableActionBar, String deviceId, ItemSubscriptionsService itemSubscriptionsService) {
        o.i(statesLiveData, "statesLiveData");
        o.i(snackBarEvent, "snackBarEvent");
        o.i(enableActionBar, "enableActionBar");
        o.i(deviceId, "deviceId");
        o.i(itemSubscriptionsService, "itemSubscriptionsService");
        this.f33739b = statesLiveData;
        this.f33740c = snackBarEvent;
        this.f33741d = enableActionBar;
        this.f33742e = deviceId;
        this.f33743f = itemSubscriptionsService;
        a aVar = new a(CoroutineExceptionHandler.Key);
        this.f33744g = aVar;
        this.f33745h = Dispatchers.getIO().plus(aVar);
        this.f33746i = new ArrayList();
        this.f33747j = 1;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f33745h;
    }

    @Override // androidx.paging.i
    public void j(i.d<Integer> params, i.a<Integer, ItemSubscriptionResponse> callback) {
        o.i(params, "params");
        o.i(callback, "callback");
        int intValue = params.f14141a.intValue();
        if (intValue == 1) {
            this.f33739b.postValue(ViewStates.LOADING);
        }
        BuildersKt__Builders_commonKt.launch$default(this, new c(CoroutineExceptionHandler.Key, this, intValue), null, new WantedItemsDataSource$loadAfter$lambda$4$$inlined$loadData$1(this, intValue, null, callback, intValue), 2, null);
    }

    @Override // androidx.paging.i
    public void l(i.d<Integer> params, i.a<Integer, ItemSubscriptionResponse> callback) {
        o.i(params, "params");
        o.i(callback, "callback");
    }

    @Override // androidx.paging.i
    public void o(i.c<Integer> params, i.b<Integer, ItemSubscriptionResponse> callback) {
        o.i(params, "params");
        o.i(callback, "callback");
        int i11 = this.f33747j;
        if (i11 == 1) {
            this.f33739b.postValue(ViewStates.LOADING);
        }
        BuildersKt__Builders_commonKt.launch$default(this, new c(CoroutineExceptionHandler.Key, this, i11), null, new WantedItemsDataSource$loadInitial$$inlined$loadData$1(this, i11, null, callback, this), 2, null);
    }
}
