package com.forsale.app.features.categories.listings.dataSource;

import androidx.lifecycle.b0;
import androidx.paging.i;
import com.forsale.app.base.ViewStates;
import com.forsale.app.datalayer.network.ResponseWrapper;
import com.forsale.app.datalayer.network.interceptors.ConnectivityInterceptor;
import com.forsale.app.features.categories.listings.PagedListingsDecorator;
import com.forsale.app.features.categories.listings.category.CategoryListingsViewModel;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;
import wz.p;
/* compiled from: ListingsDataSource.kt */
/* loaded from: classes2.dex */
public final class ListingsDataSource extends i<Integer, x9.b<?>> {

    /* renamed from: b  reason: collision with root package name */
    private final CoroutineScope f28905b;

    /* renamed from: c  reason: collision with root package name */
    private final PagedListingsDecorator f28906c;

    /* renamed from: d  reason: collision with root package name */
    private final b0<ViewStates> f28907d;

    /* renamed from: e  reason: collision with root package name */
    private final b0<Boolean> f28908e;

    /* renamed from: f  reason: collision with root package name */
    private final MutableStateFlow<CategoryListingsViewModel.c> f28909f;

    /* renamed from: g  reason: collision with root package name */
    private g00.a<? extends Object> f28910g;

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ListingsDataSource f28911a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f28912b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ i.d f28913c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ i.a f28914d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CoroutineExceptionHandler.Key key, ListingsDataSource listingsDataSource, int i11, i.d dVar, i.a aVar) {
            super(key);
            this.f28911a = listingsDataSource;
            this.f28912b = i11;
            this.f28913c = dVar;
            this.f28914d = aVar;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            final ListingsDataSource listingsDataSource = this.f28911a;
            final i.d dVar = this.f28913c;
            final i.a aVar = this.f28914d;
            listingsDataSource.f28910g = new g00.a<p>() { // from class: com.forsale.app.features.categories.listings.dataSource.ListingsDataSource$loadAfter$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    ListingsDataSource.this.j(dVar, aVar);
                }
            };
            this.f28911a.G(th2, this.f28912b);
            this.f28911a.K(ViewStates.ERROR, this.f28912b, th2);
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ListingsDataSource f28915a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f28916b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CoroutineExceptionHandler.Key key, ListingsDataSource listingsDataSource, int i11) {
            super(key);
            this.f28915a = listingsDataSource;
            this.f28916b = i11;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            this.f28915a.K(ViewStates.ERROR, this.f28916b, th2);
            this.f28915a.G(th2, this.f28916b);
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ListingsDataSource f28917a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f28918b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(CoroutineExceptionHandler.Key key, ListingsDataSource listingsDataSource, int i11) {
            super(key);
            this.f28917a = listingsDataSource;
            this.f28918b = i11;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            this.f28917a.K(ViewStates.ERROR, 1, th2);
            this.f28917a.G(th2, this.f28918b);
            this.f28917a.f28908e.postValue(Boolean.FALSE);
        }
    }

    public ListingsDataSource(CoroutineScope coroutineScope, PagedListingsDecorator pagedListingsDecorator, b0<ViewStates> statesLiveData, b0<Boolean> initialLoading, MutableStateFlow<CategoryListingsViewModel.c> mutableStateFlow) {
        o.i(coroutineScope, "coroutineScope");
        o.i(pagedListingsDecorator, "pagedListingsDecorator");
        o.i(statesLiveData, "statesLiveData");
        o.i(initialLoading, "initialLoading");
        this.f28905b = coroutineScope;
        this.f28906c = pagedListingsDecorator;
        this.f28907d = statesLiveData;
        this.f28908e = initialLoading;
        this.f28909f = mutableStateFlow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(Throwable th2, int i11) {
        if (i11 > 1) {
            MutableStateFlow<CategoryListingsViewModel.c> mutableStateFlow = this.f28909f;
            if (mutableStateFlow != null) {
                mutableStateFlow.setValue(new CategoryListingsViewModel.c.a.b(th2 instanceof ConnectivityInterceptor.ConnectivityException));
                return;
            }
            return;
        }
        MutableStateFlow<CategoryListingsViewModel.c> mutableStateFlow2 = this.f28909f;
        if (mutableStateFlow2 != null) {
            mutableStateFlow2.setValue(new CategoryListingsViewModel.c.C0310c(th2 instanceof ConnectivityInterceptor.ConnectivityException));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object H(int i11, zz.a<? super p> aVar) {
        Object f11;
        Object f12;
        if (i11 > 1) {
            MutableStateFlow<CategoryListingsViewModel.c> mutableStateFlow = this.f28909f;
            if (mutableStateFlow != null) {
                Object emit = mutableStateFlow.emit(CategoryListingsViewModel.c.a.C0308a.f28461a, aVar);
                f12 = kotlin.coroutines.intrinsics.b.f();
                if (emit == f12) {
                    return emit;
                }
                return p.f75480a;
            }
        } else {
            MutableStateFlow<CategoryListingsViewModel.c> mutableStateFlow2 = this.f28909f;
            if (mutableStateFlow2 != null) {
                Object emit2 = mutableStateFlow2.emit(CategoryListingsViewModel.c.e.f28467a, aVar);
                f11 = kotlin.coroutines.intrinsics.b.f();
                if (emit2 == f11) {
                    return emit2;
                }
                return p.f75480a;
            }
        }
        return p.f75480a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object I(boolean z11, zz.a<? super p> aVar) {
        Object f11;
        MutableStateFlow<CategoryListingsViewModel.c> mutableStateFlow = this.f28909f;
        if (mutableStateFlow != null) {
            Object emit = mutableStateFlow.emit(new CategoryListingsViewModel.c.a.C0309c(z11), aVar);
            f11 = kotlin.coroutines.intrinsics.b.f();
            if (emit == f11) {
                return emit;
            }
            return p.f75480a;
        }
        return p.f75480a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object J(ListingsDataSource listingsDataSource, boolean z11, zz.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return listingsDataSource.I(z11, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(ViewStates viewStates, int i11, Throwable th2) {
        if (th2 != null) {
            if (i11 == 1) {
                BuildersKt__Builders_commonKt.launch$default(this.f28905b, null, null, new ListingsDataSource$updateState$1$1(this, th2, null), 3, null);
            }
            if (th2 instanceof ConnectivityInterceptor.ConnectivityException) {
                if (i11 > 1) {
                    this.f28907d.postValue(ViewStates.RETRY_CONNECTION_ERROR);
                    return;
                } else {
                    this.f28907d.postValue(ViewStates.CONNECTION_ERROR);
                    return;
                }
            } else if (!(th2 instanceof ResponseWrapper.ResponseErrorException)) {
                if (i11 > 1) {
                    this.f28907d.postValue(ViewStates.RETRY_ERROR);
                    return;
                } else {
                    this.f28907d.postValue(ViewStates.ERROR);
                    return;
                }
            } else {
                return;
            }
        }
        this.f28907d.postValue(viewStates);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void L(ListingsDataSource listingsDataSource, ViewStates viewStates, int i11, Throwable th2, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            th2 = null;
        }
        listingsDataSource.K(viewStates, i11, th2);
    }

    public final void F() {
        g00.a<? extends Object> aVar = this.f28910g;
        this.f28910g = null;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // androidx.paging.i
    public void j(i.d<Integer> params, i.a<Integer, x9.b<?>> callback) {
        o.i(params, "params");
        o.i(callback, "callback");
        int intValue = params.f14141a.intValue();
        BuildersKt__Builders_commonKt.launch$default(this.f28905b, Dispatchers.getIO().plus(new a(CoroutineExceptionHandler.Key, this, intValue, params, callback)), null, new ListingsDataSource$loadAfter$2(this, intValue, callback, null), 2, null);
    }

    @Override // androidx.paging.i
    public void l(i.d<Integer> params, i.a<Integer, x9.b<?>> callback) {
        o.i(params, "params");
        o.i(callback, "callback");
        int intValue = params.f14141a.intValue();
        BuildersKt__Builders_commonKt.launch$default(this.f28905b, Dispatchers.getIO().plus(new b(CoroutineExceptionHandler.Key, this, intValue)), null, new ListingsDataSource$loadBefore$2(this, intValue, callback, null), 2, null);
    }

    @Override // androidx.paging.i
    public void o(i.c<Integer> params, i.b<Integer, x9.b<?>> callback) {
        o.i(params, "params");
        o.i(callback, "callback");
        this.f28908e.postValue(Boolean.TRUE);
        BuildersKt__Builders_commonKt.launch$default(this.f28905b, Dispatchers.getIO().plus(new c(CoroutineExceptionHandler.Key, this, 1)), null, new ListingsDataSource$loadInitial$2(this, 1, callback, null), 2, null);
    }
}
