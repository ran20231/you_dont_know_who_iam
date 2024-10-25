package com.forsale.app.datalayer.network.services;

import com.forsale.app.datalayer.network.requestsbodies.AddItemSubscriptionBody;
import com.forsale.app.datalayer.network.requestsbodies.DeleteItemSubscriptionBody;
import com.forsale.app.datalayer.network.requestsbodies.GetListingsBody;
import com.forsale.app.datalayer.network.requestsbodies.GetSubscriptionsBody;
import com.forsale.app.datalayer.network.responses.ItemSubscriptionResponse;
import com.forsale.app.datalayer.network.responses.ItemSubscriptionsResponse;
import com.forsale.app.datalayer.network.responses.ListingsResponse;
import i10.a;
import i10.o;
/* compiled from: ItemSubscriptionsService.kt */
/* loaded from: classes2.dex */
public interface ItemSubscriptionsService {
    @o("ItemSubscriptions/Subscribe")
    Object addItemSubscription(@a AddItemSubscriptionBody addItemSubscriptionBody, zz.a<? super ItemSubscriptionResponse> aVar);

    @o("ItemSubscriptions/Unsubscribe")
    Object deleteItemSubscription(@a DeleteItemSubscriptionBody deleteItemSubscriptionBody, zz.a<? super Integer> aVar);

    @o("ItemSubscriptions/getListingsSearch")
    Object getListingsSearch(@a GetListingsBody getListingsBody, zz.a<? super ListingsResponse> aVar);

    @o("ItemSubscriptions/getSubscriptions")
    Object getSubscriptions(@a GetSubscriptionsBody getSubscriptionsBody, zz.a<? super ItemSubscriptionsResponse> aVar);
}
