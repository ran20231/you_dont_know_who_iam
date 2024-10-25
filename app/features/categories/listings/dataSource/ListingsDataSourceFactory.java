package com.forsale.app.features.categories.listings.dataSource;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.b0;
import androidx.paging.DataSource;
import com.forsale.app.base.ViewStates;
import com.forsale.app.features.categories.listings.PagedListingsDecorator;
import com.forsale.app.features.categories.listings.category.CategoryListingsViewModel;
import g00.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;
import wz.p;
import x9.b;
/* compiled from: ListingsDataSourceFactory.kt */
/* loaded from: classes2.dex */
public final class ListingsDataSourceFactory extends DataSource.Factory<Integer, b<?>> {

    /* renamed from: a  reason: collision with root package name */
    private final CoroutineScope f28940a;

    /* renamed from: b  reason: collision with root package name */
    private final b0<ViewStates> f28941b;

    /* renamed from: c  reason: collision with root package name */
    private final b0<Boolean> f28942c;

    /* renamed from: d  reason: collision with root package name */
    private final MutableStateFlow<CategoryListingsViewModel.c> f28943d;

    /* renamed from: e  reason: collision with root package name */
    private final b0<PagedListingsDecorator> f28944e;

    /* renamed from: f  reason: collision with root package name */
    private final LiveData<PagedListingsDecorator> f28945f;

    /* renamed from: g  reason: collision with root package name */
    private final b0<ListingsDataSource> f28946g;

    /* renamed from: h  reason: collision with root package name */
    private a<p> f28947h;

    public /* synthetic */ ListingsDataSourceFactory(CoroutineScope coroutineScope, PagedListingsDecorator pagedListingsDecorator, b0 b0Var, b0 b0Var2, MutableStateFlow mutableStateFlow, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineScope, pagedListingsDecorator, (i11 & 4) != 0 ? new b0(ViewStates.INITIAL) : b0Var, (i11 & 8) != 0 ? new b0(Boolean.FALSE) : b0Var2, (i11 & 16) != 0 ? null : mutableStateFlow);
    }

    @Override // androidx.paging.DataSource.Factory
    public DataSource<Integer, b<?>> create() {
        CoroutineScope coroutineScope = this.f28940a;
        PagedListingsDecorator value = this.f28944e.getValue();
        o.f(value);
        ListingsDataSource listingsDataSource = new ListingsDataSource(coroutineScope, value, this.f28941b, this.f28942c, this.f28943d);
        this.f28946g.postValue(listingsDataSource);
        this.f28947h = new a<p>() { // from class: com.forsale.app.features.categories.listings.dataSource.ListingsDataSourceFactory$create$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            public /* bridge */ /* synthetic */ p invoke() {
                invoke2();
                return p.f75480a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                b0 b0Var;
                b0Var = ListingsDataSourceFactory.this.f28946g;
                ListingsDataSource listingsDataSource2 = (ListingsDataSource) b0Var.getValue();
                if (listingsDataSource2 != null) {
                    listingsDataSource2.F();
                }
            }
        };
        return listingsDataSource;
    }

    public final LiveData<PagedListingsDecorator> f() {
        return this.f28945f;
    }

    public final Object g(PagedListingsDecorator pagedListingsDecorator, zz.a<? super p> aVar) {
        return BuildersKt.withContext(Dispatchers.getMain(), new ListingsDataSourceFactory$refresh$2(this, pagedListingsDecorator, null), aVar);
    }

    public final void h() {
        a<p> aVar = this.f28947h;
        if (aVar == null) {
            o.w("retryRequest");
            aVar = null;
        }
        aVar.invoke();
    }

    public ListingsDataSourceFactory(CoroutineScope coroutineScope, PagedListingsDecorator pagedListingsDecorator, b0<ViewStates> statesLiveData, b0<Boolean> initialLoading, MutableStateFlow<CategoryListingsViewModel.c> mutableStateFlow) {
        o.i(coroutineScope, "coroutineScope");
        o.i(pagedListingsDecorator, "pagedListingsDecorator");
        o.i(statesLiveData, "statesLiveData");
        o.i(initialLoading, "initialLoading");
        this.f28940a = coroutineScope;
        this.f28941b = statesLiveData;
        this.f28942c = initialLoading;
        this.f28943d = mutableStateFlow;
        b0<PagedListingsDecorator> b0Var = new b0<>(pagedListingsDecorator);
        this.f28944e = b0Var;
        this.f28945f = b0Var;
        this.f28946g = new b0<>();
    }
}
