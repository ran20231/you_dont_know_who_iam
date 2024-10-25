package com.forsale.app.features.categories.listings.dataSource;

import androidx.paging.i;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
import l8.a;
import x9.b;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingsDataSource.kt */
@d(c = "com.forsale.app.features.categories.listings.dataSource.ListingsDataSource$loadAfter$2", f = "ListingsDataSource.kt", l = {59, 60, a.f62267d}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ListingsDataSource$loadAfter$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f28922a;

    /* renamed from: b  reason: collision with root package name */
    int f28923b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ListingsDataSource f28924c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f28925d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ i.a<Integer, b<?>> f28926e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingsDataSource$loadAfter$2(ListingsDataSource listingsDataSource, int i11, i.a<Integer, b<?>> aVar, zz.a<? super ListingsDataSource$loadAfter$2> aVar2) {
        super(2, aVar2);
        this.f28924c = listingsDataSource;
        this.f28925d = i11;
        this.f28926e = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ListingsDataSource$loadAfter$2(this.f28924c, this.f28925d, this.f28926e, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r12.f28923b
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L25
            if (r1 == r4) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            kotlin.f.b(r13)
            goto L72
        L15:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1d:
            kotlin.f.b(r13)
            goto L46
        L21:
            kotlin.f.b(r13)
            goto L35
        L25:
            kotlin.f.b(r13)
            com.forsale.app.features.categories.listings.dataSource.ListingsDataSource r13 = r12.f28924c
            int r1 = r12.f28925d
            r12.f28923b = r4
            java.lang.Object r13 = com.forsale.app.features.categories.listings.dataSource.ListingsDataSource.B(r13, r1, r12)
            if (r13 != r0) goto L35
            return r0
        L35:
            com.forsale.app.features.categories.listings.dataSource.ListingsDataSource r13 = r12.f28924c
            com.forsale.app.features.categories.listings.PagedListingsDecorator r13 = com.forsale.app.features.categories.listings.dataSource.ListingsDataSource.z(r13)
            int r1 = r12.f28925d
            r12.f28923b = r3
            java.lang.Object r13 = r13.t(r1, r12)
            if (r13 != r0) goto L46
            return r0
        L46:
            com.forsale.app.features.categories.listings.dataSource.ListingsDataSource r1 = r12.f28924c
            int r7 = r12.f28925d
            androidx.paging.i$a<java.lang.Integer, x9.b<?>> r3 = r12.f28926e
            r11 = r13
            kotlin.Pair r11 = (kotlin.Pair) r11
            com.forsale.app.base.ViewStates r6 = com.forsale.app.base.ViewStates.CONTENT
            r8 = 0
            r9 = 4
            r10 = 0
            r5 = r1
            com.forsale.app.features.categories.listings.dataSource.ListingsDataSource.L(r5, r6, r7, r8, r9, r10)
            java.lang.Object r5 = r11.d()
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r6 = r11.c()
            r3.a(r5, r6)
            r12.f28922a = r13
            r12.f28923b = r2
            r13 = 0
            r2 = 0
            java.lang.Object r13 = com.forsale.app.features.categories.listings.dataSource.ListingsDataSource.J(r1, r13, r12, r4, r2)
            if (r13 != r0) goto L72
            return r0
        L72:
            wz.p r13 = wz.p.f75480a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.dataSource.ListingsDataSource$loadAfter$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((ListingsDataSource$loadAfter$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
