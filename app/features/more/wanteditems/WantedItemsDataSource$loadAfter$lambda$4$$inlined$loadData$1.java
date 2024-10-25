package com.forsale.app.features.more.wanteditems;

import androidx.databinding.ObservableBoolean;
import androidx.lifecycle.b0;
import androidx.paging.i;
import com.forsale.app.base.ViewStates;
import com.forsale.app.datalayer.network.requestsbodies.GetSubscriptionsBody;
import com.forsale.app.datalayer.network.responses.ItemSubscriptionResponse;
import com.forsale.app.datalayer.network.responses.ItemSubscriptionsResponse;
import com.forsale.app.datalayer.network.services.ItemSubscriptionsService;
import g00.p;
import java.util.List;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: WantedItemsDataSource.kt */
@d(c = "com.forsale.app.features.more.wanteditems.WantedItemsDataSource$loadAfter$lambda$4$$inlined$loadData$1", f = "WantedItemsDataSource.kt", l = {73}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class WantedItemsDataSource$loadAfter$lambda$4$$inlined$loadData$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f33748a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ WantedItemsDataSource f33749b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f33750c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ i.a f33751d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f33752e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WantedItemsDataSource$loadAfter$lambda$4$$inlined$loadData$1(WantedItemsDataSource wantedItemsDataSource, int i11, zz.a aVar, i.a aVar2, int i12) {
        super(2, aVar);
        this.f33749b = wantedItemsDataSource;
        this.f33750c = i11;
        this.f33751d = aVar2;
        this.f33752e = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new WantedItemsDataSource$loadAfter$lambda$4$$inlined$loadData$1(this.f33749b, this.f33750c, aVar, this.f33751d, this.f33752e);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        ItemSubscriptionsService itemSubscriptionsService;
        String str;
        ObservableBoolean observableBoolean;
        b0 b0Var;
        b0 b0Var2;
        f11 = b.f();
        int i11 = this.f33748a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            itemSubscriptionsService = this.f33749b.f33743f;
            str = this.f33749b.f33742e;
            GetSubscriptionsBody getSubscriptionsBody = new GetSubscriptionsBody(str, this.f33750c, 30);
            this.f33748a = 1;
            obj = itemSubscriptionsService.getSubscriptions(getSubscriptionsBody, this);
            if (obj == f11) {
                return f11;
            }
        }
        WantedItemsDataSource wantedItemsDataSource = this.f33749b;
        ItemSubscriptionsResponse itemSubscriptionsResponse = (ItemSubscriptionsResponse) obj;
        int totalSubscriptions = itemSubscriptionsResponse.getTotalSubscriptions();
        observableBoolean = wantedItemsDataSource.f33741d;
        observableBoolean.k(true);
        if (totalSubscriptions == 0) {
            b0Var2 = wantedItemsDataSource.f33739b;
            b0Var2.postValue(ViewStates.Empty);
        } else {
            List<ItemSubscriptionResponse> subscriptions = itemSubscriptionsResponse.getSubscriptions();
            b0Var = wantedItemsDataSource.f33739b;
            b0Var.postValue(ViewStates.CONTENT);
            this.f33751d.a(subscriptions, kotlin.coroutines.jvm.internal.a.d(this.f33752e + 1));
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((WantedItemsDataSource$loadAfter$lambda$4$$inlined$loadData$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
