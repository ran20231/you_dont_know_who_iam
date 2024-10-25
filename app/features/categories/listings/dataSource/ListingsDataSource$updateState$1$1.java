package com.forsale.app.features.categories.listings.dataSource;

import com.forsale.app.features.categories.listings.PagedListingsDecorator;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingsDataSource.kt */
@d(c = "com.forsale.app.features.categories.listings.dataSource.ListingsDataSource$updateState$1$1", f = "ListingsDataSource.kt", l = {85}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ListingsDataSource$updateState$1$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f28937a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ListingsDataSource f28938b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Throwable f28939c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingsDataSource$updateState$1$1(ListingsDataSource listingsDataSource, Throwable th2, a<? super ListingsDataSource$updateState$1$1> aVar) {
        super(2, aVar);
        this.f28938b = listingsDataSource;
        this.f28939c = th2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new ListingsDataSource$updateState$1$1(this.f28938b, this.f28939c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        PagedListingsDecorator pagedListingsDecorator;
        f11 = b.f();
        int i11 = this.f28937a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            pagedListingsDecorator = this.f28938b.f28906c;
            String th2 = this.f28939c.toString();
            this.f28937a = 1;
            if (PagedListingsDecorator.r(pagedListingsDecorator, th2, null, this, 2, null) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((ListingsDataSource$updateState$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
