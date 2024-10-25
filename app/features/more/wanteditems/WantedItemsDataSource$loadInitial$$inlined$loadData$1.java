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
@d(c = "com.forsale.app.features.more.wanteditems.WantedItemsDataSource$loadInitial$$inlined$loadData$1", f = "WantedItemsDataSource.kt", l = {73}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class WantedItemsDataSource$loadInitial$$inlined$loadData$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f33753a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ WantedItemsDataSource f33754b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f33755c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ i.b f33756d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ WantedItemsDataSource f33757e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WantedItemsDataSource$loadInitial$$inlined$loadData$1(WantedItemsDataSource wantedItemsDataSource, int i11, zz.a aVar, i.b bVar, WantedItemsDataSource wantedItemsDataSource2) {
        super(2, aVar);
        this.f33754b = wantedItemsDataSource;
        this.f33755c = i11;
        this.f33756d = bVar;
        this.f33757e = wantedItemsDataSource2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new WantedItemsDataSource$loadInitial$$inlined$loadData$1(this.f33754b, this.f33755c, aVar, this.f33756d, this.f33757e);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        ItemSubscriptionsService itemSubscriptionsService;
        String str;
        ObservableBoolean observableBoolean;
        b0 b0Var;
        int i11;
        b0 b0Var2;
        f11 = b.f();
        int i12 = this.f33753a;
        if (i12 != 0) {
            if (i12 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            itemSubscriptionsService = this.f33754b.f33743f;
            str = this.f33754b.f33742e;
            GetSubscriptionsBody getSubscriptionsBody = new GetSubscriptionsBody(str, this.f33755c, 30);
            this.f33753a = 1;
            obj = itemSubscriptionsService.getSubscriptions(getSubscriptionsBody, this);
            if (obj == f11) {
                return f11;
            }
        }
        WantedItemsDataSource wantedItemsDataSource = this.f33754b;
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
            i.b bVar = this.f33756d;
            i11 = this.f33757e.f33747j;
            bVar.b(subscriptions, null, kotlin.coroutines.jvm.internal.a.d(i11 + 1));
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((WantedItemsDataSource$loadInitial$$inlined$loadData$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
