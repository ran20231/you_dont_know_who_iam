package com.forsale.app.features.categories.listings.dataSource;

import androidx.paging.i;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
import x9.b;
import zz.a;
/* compiled from: ListingsDataSource.kt */
@d(c = "com.forsale.app.features.categories.listings.dataSource.ListingsDataSource$loadBefore$2", f = "ListingsDataSource.kt", l = {74, 75, 77}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ListingsDataSource$loadBefore$2 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f28927a;

    /* renamed from: b  reason: collision with root package name */
    int f28928b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ListingsDataSource f28929c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f28930d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ i.a<Integer, b<?>> f28931e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingsDataSource$loadBefore$2(ListingsDataSource listingsDataSource, int i11, i.a<Integer, b<?>> aVar, a<? super ListingsDataSource$loadBefore$2> aVar2) {
        super(2, aVar2);
        this.f28929c = listingsDataSource;
        this.f28930d = i11;
        this.f28931e = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new ListingsDataSource$loadBefore$2(this.f28929c, this.f28930d, this.f28931e, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0069 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r7.f28928b
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L25
            if (r1 == r4) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            kotlin.f.b(r8)
            goto L6a
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1d:
            kotlin.f.b(r8)
            goto L46
        L21:
            kotlin.f.b(r8)
            goto L35
        L25:
            kotlin.f.b(r8)
            com.forsale.app.features.categories.listings.dataSource.ListingsDataSource r8 = r7.f28929c
            int r1 = r7.f28930d
            r7.f28928b = r4
            java.lang.Object r8 = com.forsale.app.features.categories.listings.dataSource.ListingsDataSource.B(r8, r1, r7)
            if (r8 != r0) goto L35
            return r0
        L35:
            com.forsale.app.features.categories.listings.dataSource.ListingsDataSource r8 = r7.f28929c
            com.forsale.app.features.categories.listings.PagedListingsDecorator r8 = com.forsale.app.features.categories.listings.dataSource.ListingsDataSource.z(r8)
            int r1 = r7.f28930d
            r7.f28928b = r3
            java.lang.Object r8 = r8.t(r1, r7)
            if (r8 != r0) goto L46
            return r0
        L46:
            androidx.paging.i$a<java.lang.Integer, x9.b<?>> r1 = r7.f28931e
            int r3 = r7.f28930d
            com.forsale.app.features.categories.listings.dataSource.ListingsDataSource r5 = r7.f28929c
            r6 = r8
            kotlin.Pair r6 = (kotlin.Pair) r6
            java.lang.Object r6 = r6.d()
            java.util.List r6 = (java.util.List) r6
            int r3 = r3 - r4
            java.lang.Integer r3 = kotlin.coroutines.jvm.internal.a.d(r3)
            r1.a(r6, r3)
            r7.f28927a = r8
            r7.f28928b = r2
            r8 = 0
            r1 = 0
            java.lang.Object r8 = com.forsale.app.features.categories.listings.dataSource.ListingsDataSource.J(r5, r8, r7, r4, r1)
            if (r8 != r0) goto L6a
            return r0
        L6a:
            wz.p r8 = wz.p.f75480a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.dataSource.ListingsDataSource$loadBefore$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((ListingsDataSource$loadBefore$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
