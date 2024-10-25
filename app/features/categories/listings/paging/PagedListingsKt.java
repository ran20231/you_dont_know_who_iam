package com.forsale.app.features.categories.listings.paging;

import android.annotation.SuppressLint;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.f;
import androidx.compose.runtime.z;
import androidx.paging.PagingData;
import androidx.paging.compose.LazyPagingItems;
import androidx.paging.compose.LazyPagingItemsKt;
import androidx.paging.f;
import com.forsale.app.datalayer.network.requestsbodies.MyListingsType;
import com.forsale.app.features.categories.listings.ListingsTypes;
import com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt;
import com.forsale.app.features.categories.listings.paging.b;
import d4.d;
import e2.h;
import g00.l;
import g00.q;
import g00.r;
import j0.d1;
import j0.k0;
import j0.n1;
import j0.u;
import j0.v0;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import w.c;
import wz.p;
import x.j;
/* compiled from: PagedListings.kt */
/* loaded from: classes2.dex */
public final class PagedListingsKt {

    /* compiled from: PagedListings.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f30985a;

        static {
            int[] iArr = new int[ListingsTypes.values().length];
            try {
                iArr[ListingsTypes.MY_LISTINGS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f30985a = iArr;
        }
    }

    @SuppressLint({"UnrememberedMutableState"})
    public static final void a(final MyListingsType selectedFilter, final List<? extends MyListingsType> allFilters, final l<? super MyListingsType, p> onSingleFilterSelect, final ListingsTypes listingsType, final Flow<PagingData<x9.b<?>>> list, final int i11, final c boxScope, final l<? super b, p> onLoadStateChanged, final l<? super Integer, p> setMaxItem, final g00.a<p> upButtonClicked, final g00.a<p> onBackPressed, final g00.a<p> onRetry, androidx.compose.runtime.a aVar, final int i12, final int i13) {
        androidx.compose.runtime.a aVar2;
        final l lVar;
        LazyListState lazyListState;
        o.i(selectedFilter, "selectedFilter");
        o.i(allFilters, "allFilters");
        o.i(onSingleFilterSelect, "onSingleFilterSelect");
        o.i(listingsType, "listingsType");
        o.i(list, "list");
        o.i(boxScope, "boxScope");
        o.i(onLoadStateChanged, "onLoadStateChanged");
        o.i(setMaxItem, "setMaxItem");
        o.i(upButtonClicked, "upButtonClicked");
        o.i(onBackPressed, "onBackPressed");
        o.i(onRetry, "onRetry");
        androidx.compose.runtime.a h11 = aVar.h(-527223744);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-527223744, i12, i13, "com.forsale.app.features.categories.listings.paging.PagedListings (PagedListings.kt:53)");
        }
        final LazyPagingItems b11 = LazyPagingItemsKt.b(list, null, h11, 8, 1);
        h11.C(773894976);
        h11.C(-492369756);
        Object D = h11.D();
        a.C0064a c0064a = androidx.compose.runtime.a.f7182a;
        if (D == c0064a.a()) {
            f fVar = new f(u.j(EmptyCoroutineContext.f61739a, h11));
            h11.u(fVar);
            D = fVar;
        }
        h11.S();
        final CoroutineScope a11 = ((f) D).a();
        h11.S();
        final LazyListState c11 = LazyListStateKt.c(0, 0, h11, 0, 3);
        h11.C(-492369756);
        Object D2 = h11.D();
        if (D2 == c0064a.a()) {
            D2 = c0.e(Boolean.FALSE, null, 2, null);
            h11.u(D2);
        }
        h11.S();
        final k0 k0Var = (k0) D2;
        h11.C(1157296644);
        boolean T = h11.T(c11);
        Object D3 = h11.D();
        if (T || D3 == c0064a.a()) {
            D3 = new PagedListingsKt$PagedListings$scrollAction$1$1(c11, null);
            h11.u(D3);
        }
        h11.S();
        l lVar2 = (l) D3;
        h11.C(-492369756);
        Object D4 = h11.D();
        if (D4 == c0064a.a()) {
            D4 = z.d(new g00.a<Integer>() { // from class: com.forsale.app.features.categories.listings.paging.PagedListingsKt$PagedListings$maxItemReached$2$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // g00.a
                public final Integer invoke() {
                    Object w02;
                    w02 = CollectionsKt___CollectionsKt.w0(LazyListState.this.x().c());
                    j jVar = (j) w02;
                    if (jVar != null) {
                        Integer valueOf = Integer.valueOf(jVar.getIndex());
                        if (valueOf.intValue() > i11) {
                            return valueOf;
                        }
                        return null;
                    }
                    return null;
                }
            });
            h11.u(D4);
        }
        h11.S();
        n1 n1Var = (n1) D4;
        Integer b12 = b(n1Var);
        Integer num = b12 != null ? b12 : null;
        h11.C(511388516);
        boolean T2 = h11.T(n1Var) | h11.T(setMaxItem);
        Object D5 = h11.D();
        if (T2 || D5 == c0064a.a()) {
            D5 = new PagedListingsKt$PagedListings$2$1(n1Var, setMaxItem, null);
            h11.u(D5);
        }
        h11.S();
        u.d(num, (g00.p) D5, h11, 64);
        d i14 = b11.i();
        h11.C(1157296644);
        boolean T3 = h11.T(i14);
        Object D6 = h11.D();
        if (T3 || D6 == c0064a.a()) {
            D6 = z.d(new g00.a<Boolean>() { // from class: com.forsale.app.features.categories.listings.paging.PagedListingsKt$PagedListings$showPager$2$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // g00.a
                public final Boolean invoke() {
                    return Boolean.valueOf(b11.i().a() instanceof f.b);
                }
            });
            h11.u(D6);
        }
        h11.S();
        n1 n1Var2 = (n1) D6;
        d i15 = b11.i();
        h11.C(1157296644);
        boolean T4 = h11.T(i15);
        Object D7 = h11.D();
        if (T4 || D7 == c0064a.a()) {
            D7 = z.d(new g00.a<Boolean>() { // from class: com.forsale.app.features.categories.listings.paging.PagedListingsKt$PagedListings$showContent$2$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // g00.a
                public final Boolean invoke() {
                    return Boolean.valueOf(!(b11.i().d() instanceof f.b));
                }
            });
            h11.u(D7);
        }
        h11.S();
        n1 n1Var3 = (n1) D7;
        b b13 = com.forsale.app.features.categories.listings.paging.a.b(b11);
        if (b13 instanceof b.d) {
            h11.C(-1557777466);
            onLoadStateChanged.invoke(b13);
            CategoryListingsViewKt.r(listingsType, h11, (i12 >> 9) & 14, 0);
            h11.S();
        } else if (b13 instanceof b.C0337b) {
            h11.C(-1557777321);
            androidx.compose.ui.c i16 = PaddingKt.i(androidx.compose.ui.c.f7566a, h.l(40));
            boolean a12 = ((b.C0337b) b13).a();
            h11.C(1157296644);
            boolean T5 = h11.T(onRetry);
            Object D8 = h11.D();
            if (T5 || D8 == c0064a.a()) {
                D8 = new g00.a<p>() { // from class: com.forsale.app.features.categories.listings.paging.PagedListingsKt$PagedListings$3$1
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
                        onRetry.invoke();
                    }
                };
                h11.u(D8);
            }
            h11.S();
            StatesKt.b(i16, a12, (g00.a) D8, h11, 6, 0);
            h11.S();
        } else if (b13 instanceof b.a) {
            h11.C(-1557777031);
            h11.C(1157296644);
            boolean T6 = h11.T(onBackPressed);
            Object D9 = h11.D();
            if (T6 || D9 == c0064a.a()) {
                D9 = new g00.a<p>() { // from class: com.forsale.app.features.categories.listings.paging.PagedListingsKt$PagedListings$4$1
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
                        onBackPressed.invoke();
                    }
                };
                h11.u(D9);
            }
            h11.S();
            StatesKt.a(listingsType, (g00.a) D9, h11, (i12 >> 9) & 14);
            h11.S();
        } else if (b13 instanceof hd.a) {
            h11.C(-1557776831);
            h11.S();
        } else {
            h11.C(-1557776812);
            h11.S();
        }
        h11.C(-1557776798);
        if (d(n1Var3)) {
            lazyListState = c11;
            aVar2 = h11;
            lVar = lVar2;
            LazyDslKt.a(null, lazyListState, null, false, null, null, null, false, new l<LazyListScope, p>() { // from class: com.forsale.app.features.categories.listings.paging.PagedListingsKt$PagedListings$5
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                public final void b(LazyListScope LazyColumn) {
                    o.i(LazyColumn, "$this$LazyColumn");
                    PagedListingsKt.g(LazyColumn, ListingsTypes.this, selectedFilter, allFilters, onSingleFilterSelect);
                    int g11 = b11.g();
                    final LazyPagingItems<x9.b<?>> lazyPagingItems = b11;
                    final k0<Boolean> k0Var2 = k0Var;
                    LazyListScope.e(LazyColumn, g11, null, null, r0.b.c(1670849608, true, new r<x.a, Integer, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.paging.PagedListingsKt$PagedListings$5.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(4);
                        }

                        public final void b(x.a items, int i17, androidx.compose.runtime.a aVar3, int i18) {
                            int i19;
                            o.i(items, "$this$items");
                            if ((i18 & 112) == 0) {
                                if (aVar3.d(i17)) {
                                    i19 = 32;
                                } else {
                                    i19 = 16;
                                }
                                i18 |= i19;
                            }
                            if ((i18 & 721) == 144 && aVar3.i()) {
                                aVar3.L();
                                return;
                            }
                            if (androidx.compose.runtime.c.I()) {
                                androidx.compose.runtime.c.U(1670849608, i18, -1, "com.forsale.app.features.categories.listings.paging.PagedListings.<anonymous>.<anonymous> (PagedListings.kt:127)");
                            }
                            x9.b<?> f11 = lazyPagingItems.f(i17);
                            k0<Boolean> k0Var3 = k0Var2;
                            boolean z11 = true;
                            if (i17 != lazyPagingItems.g() - 1) {
                                z11 = false;
                            }
                            k0Var3.setValue(Boolean.valueOf(z11));
                            ListingsCardsKt.f(f11, i17, aVar3, i18 & 112);
                            if (androidx.compose.runtime.c.I()) {
                                androidx.compose.runtime.c.T();
                            }
                        }

                        @Override // g00.r
                        public /* bridge */ /* synthetic */ p d(x.a aVar3, Integer num2, androidx.compose.runtime.a aVar4, Integer num3) {
                            b(aVar3, num2.intValue(), aVar4, num3.intValue());
                            return p.f75480a;
                        }
                    }), 6, null);
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(LazyListScope lazyListScope) {
                    b(lazyListScope);
                    return p.f75480a;
                }
            }, aVar2, 0, 253);
        } else {
            aVar2 = h11;
            lVar = lVar2;
            lazyListState = c11;
        }
        aVar2.S();
        androidx.compose.runtime.a aVar3 = aVar2;
        aVar3.C(-1557776129);
        if (c(n1Var2) && !((Boolean) k0Var.getValue()).booleanValue()) {
            StatesKt.c(PaddingKt.m(boxScope.e(androidx.compose.ui.c.f7566a, v0.b.f74009a.m()), 0.0f, h.l(32), 0.0f, 0.0f, 13, null), aVar3, 0);
        }
        aVar3.S();
        CategoryListingsViewKt.w(PaddingKt.i(boxScope.e(androidx.compose.ui.c.f7566a, v0.b.f74009a.c()), h.l(16)), lazyListState.r() > 4, new g00.a<p>() { // from class: com.forsale.app.features.categories.listings.paging.PagedListingsKt$PagedListings$6$2

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: PagedListings.kt */
            @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.paging.PagedListingsKt$PagedListings$6$2$1", f = "PagedListings.kt", l = {154}, m = "invokeSuspend")
            /* renamed from: com.forsale.app.features.categories.listings.paging.PagedListingsKt$PagedListings$6$2$1  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super p>, Object> {

                /* renamed from: a  reason: collision with root package name */
                int f30964a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ l<zz.a<? super p>, Object> f30965b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(l<? super zz.a<? super p>, ? extends Object> lVar, zz.a<? super AnonymousClass1> aVar) {
                    super(2, aVar);
                    this.f30965b = lVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final zz.a<p> create(Object obj, zz.a<?> aVar) {
                    return new AnonymousClass1(this.f30965b, aVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object f11;
                    f11 = kotlin.coroutines.intrinsics.b.f();
                    int i11 = this.f30964a;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            kotlin.f.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        kotlin.f.b(obj);
                        l<zz.a<? super p>, Object> lVar = this.f30965b;
                        this.f30964a = 1;
                        if (lVar.invoke(this) == f11) {
                            return f11;
                        }
                    }
                    return p.f75480a;
                }

                @Override // g00.p
                public final Object invoke(CoroutineScope coroutineScope, zz.a<? super p> aVar) {
                    return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(p.f75480a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
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
                BuildersKt__Builders_commonKt.launch$default(CoroutineScope.this, null, null, new AnonymousClass1(lVar, null), 3, null);
                upButtonClicked.invoke();
            }
        }, aVar3, 0);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = aVar3.l();
        if (l11 == null) {
            return;
        }
        l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.paging.PagedListingsKt$PagedListings$7
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void b(androidx.compose.runtime.a aVar4, int i17) {
                PagedListingsKt.a(MyListingsType.this, allFilters, onSingleFilterSelect, listingsType, list, i11, boxScope, onLoadStateChanged, setMaxItem, upButtonClicked, onBackPressed, onRetry, aVar4, v0.a(i12 | 1), v0.a(i13));
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar4, Integer num2) {
                b(aVar4, num2.intValue());
                return p.f75480a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer b(n1<Integer> n1Var) {
        return n1Var.getValue();
    }

    private static final boolean c(n1<Boolean> n1Var) {
        return n1Var.getValue().booleanValue();
    }

    private static final boolean d(n1<Boolean> n1Var) {
        return n1Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(LazyListScope lazyListScope, ListingsTypes listingsTypes, final MyListingsType myListingsType, final List<? extends MyListingsType> list, final l<? super MyListingsType, p> lVar) {
        if (a.f30985a[listingsTypes.ordinal()] == 1) {
            LazyListScope.l(lazyListScope, null, null, r0.b.c(-1503114574, true, new q<x.a, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.paging.PagedListingsKt$filters$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                public final void b(x.a item, androidx.compose.runtime.a aVar, int i11) {
                    o.i(item, "$this$item");
                    if ((i11 & 81) == 16 && aVar.i()) {
                        aVar.L();
                        return;
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(-1503114574, i11, -1, "com.forsale.app.features.categories.listings.paging.filters.<anonymous> (PagedListings.kt:171)");
                    }
                    ListingsCardsKt.g(MyListingsType.this, list, lVar, aVar, 64);
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                }

                @Override // g00.q
                public /* bridge */ /* synthetic */ p invoke(x.a aVar, androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar, aVar2, num.intValue());
                    return p.f75480a;
                }
            }), 3, null);
        }
    }
}
