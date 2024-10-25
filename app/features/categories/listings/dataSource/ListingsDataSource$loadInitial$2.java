package com.forsale.app.features.categories.listings.dataSource;

import androidx.paging.i;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
import x9.b;
import zz.a;
/* compiled from: ListingsDataSource.kt */
@d(c = "com.forsale.app.features.categories.listings.dataSource.ListingsDataSource$loadInitial$2", f = "ListingsDataSource.kt", l = {38, 39, 40, 45, 47}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ListingsDataSource$loadInitial$2 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f28932a;

    /* renamed from: b  reason: collision with root package name */
    int f28933b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ListingsDataSource f28934c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f28935d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ i.b<Integer, b<?>> f28936e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingsDataSource$loadInitial$2(ListingsDataSource listingsDataSource, int i11, i.b<Integer, b<?>> bVar, a<? super ListingsDataSource$loadInitial$2> aVar) {
        super(2, aVar);
        this.f28934c = listingsDataSource;
        this.f28935d = i11;
        this.f28936e = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new ListingsDataSource$loadInitial$2(this.f28934c, this.f28935d, this.f28936e, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r13.f28933b
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L31
            if (r1 == r6) goto L2d
            if (r1 == r5) goto L29
            if (r1 == r4) goto L25
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            goto L20
        L18:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L20:
            kotlin.f.b(r14)
            goto Lc2
        L25:
            kotlin.f.b(r14)
            goto L63
        L29:
            kotlin.f.b(r14)
            goto L54
        L2d:
            kotlin.f.b(r14)
            goto L47
        L31:
            kotlin.f.b(r14)
            com.forsale.app.features.categories.listings.dataSource.ListingsDataSource r14 = r13.f28934c
            kotlinx.coroutines.flow.MutableStateFlow r14 = com.forsale.app.features.categories.listings.dataSource.ListingsDataSource.y(r14)
            if (r14 == 0) goto L47
            com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$c$e r1 = com.forsale.app.features.categories.listings.category.CategoryListingsViewModel.c.e.f28467a
            r13.f28933b = r6
            java.lang.Object r14 = r14.emit(r1, r13)
            if (r14 != r0) goto L47
            return r0
        L47:
            com.forsale.app.features.categories.listings.dataSource.ListingsDataSource r14 = r13.f28934c
            int r1 = r13.f28935d
            r13.f28933b = r5
            java.lang.Object r14 = com.forsale.app.features.categories.listings.dataSource.ListingsDataSource.B(r14, r1, r13)
            if (r14 != r0) goto L54
            return r0
        L54:
            com.forsale.app.features.categories.listings.dataSource.ListingsDataSource r14 = r13.f28934c
            com.forsale.app.features.categories.listings.PagedListingsDecorator r14 = com.forsale.app.features.categories.listings.dataSource.ListingsDataSource.z(r14)
            r13.f28933b = r4
            java.lang.Object r14 = r14.s(r13)
            if (r14 != r0) goto L63
            return r0
        L63:
            com.forsale.app.features.categories.listings.dataSource.ListingsDataSource r1 = r13.f28934c
            int r9 = r13.f28935d
            androidx.paging.i$b<java.lang.Integer, x9.b<?>> r4 = r13.f28936e
            r5 = r14
            kotlin.Pair r5 = (kotlin.Pair) r5
            com.forsale.app.base.ViewStates r8 = com.forsale.app.base.ViewStates.CONTENT
            r10 = 0
            r11 = 4
            r12 = 0
            r7 = r1
            com.forsale.app.features.categories.listings.dataSource.ListingsDataSource.L(r7, r8, r9, r10, r11, r12)
            androidx.lifecycle.b0 r7 = com.forsale.app.features.categories.listings.dataSource.ListingsDataSource.x(r1)
            r8 = 0
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.a.a(r8)
            r7.postValue(r8)
            java.lang.Object r7 = r5.d()
            java.util.List r7 = (java.util.List) r7
            r8 = 0
            java.lang.Object r5 = r5.c()
            r4.b(r7, r8, r5)
            com.forsale.app.features.categories.listings.PagedListingsDecorator r4 = com.forsale.app.features.categories.listings.dataSource.ListingsDataSource.z(r1)
            boolean r4 = r4.o()
            if (r4 == 0) goto Lb7
            kotlinx.coroutines.flow.MutableStateFlow r2 = com.forsale.app.features.categories.listings.dataSource.ListingsDataSource.y(r1)
            if (r2 == 0) goto Lc2
            com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$c$b r4 = new com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$c$b
            com.forsale.app.features.categories.listings.PagedListingsDecorator r1 = com.forsale.app.features.categories.listings.dataSource.ListingsDataSource.z(r1)
            boolean r1 = r1.p()
            r4.<init>(r1)
            r13.f28932a = r14
            r13.f28933b = r3
            java.lang.Object r14 = r2.emit(r4, r13)
            if (r14 != r0) goto Lc2
            return r0
        Lb7:
            r13.f28932a = r14
            r13.f28933b = r2
            java.lang.Object r14 = com.forsale.app.features.categories.listings.dataSource.ListingsDataSource.C(r1, r6, r13)
            if (r14 != r0) goto Lc2
            return r0
        Lc2:
            wz.p r14 = wz.p.f75480a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.dataSource.ListingsDataSource$loadInitial$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((ListingsDataSource$loadInitial$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
