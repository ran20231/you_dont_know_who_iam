package com.forsale.app.features.categories.listings.dataSource;

import androidx.lifecycle.b0;
import com.forsale.app.features.categories.listings.PagedListingsDecorator;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingsDataSourceFactory.kt */
@d(c = "com.forsale.app.features.categories.listings.dataSource.ListingsDataSourceFactory$refresh$2", f = "ListingsDataSourceFactory.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ListingsDataSourceFactory$refresh$2 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f28949a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ListingsDataSourceFactory f28950b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PagedListingsDecorator f28951c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingsDataSourceFactory$refresh$2(ListingsDataSourceFactory listingsDataSourceFactory, PagedListingsDecorator pagedListingsDecorator, a<? super ListingsDataSourceFactory$refresh$2> aVar) {
        super(2, aVar);
        this.f28950b = listingsDataSourceFactory;
        this.f28951c = pagedListingsDecorator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new ListingsDataSourceFactory$refresh$2(this.f28950b, this.f28951c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b0 b0Var;
        b0 b0Var2;
        b0 b0Var3;
        b.f();
        if (this.f28949a == 0) {
            f.b(obj);
            b0Var = this.f28950b.f28944e;
            PagedListingsDecorator pagedListingsDecorator = this.f28951c;
            if (pagedListingsDecorator == null) {
                b0Var3 = this.f28950b.f28944e;
                T value = b0Var3.getValue();
                o.f(value);
                pagedListingsDecorator = (PagedListingsDecorator) value;
            }
            b0Var.setValue(pagedListingsDecorator);
            b0Var2 = this.f28950b.f28946g;
            ListingsDataSource listingsDataSource = (ListingsDataSource) b0Var2.getValue();
            if (listingsDataSource != null) {
                listingsDataSource.invalidate();
                return wz.p.f75480a;
            }
            return null;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((ListingsDataSourceFactory$refresh$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
