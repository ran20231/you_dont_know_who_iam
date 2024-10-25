package com.forsale.app.features.categories.listings.dataSource;

import androidx.paging.PagingSource;
import androidx.paging.m;
import com.forsale.app.features.categories.listings.PagedListingsDecorator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.o;
import x9.b;
import zz.a;
/* compiled from: NewListingsDataSource.kt */
/* loaded from: classes2.dex */
public final class NewListingsDataSource extends PagingSource<Integer, b<?>> {

    /* renamed from: b  reason: collision with root package name */
    private final PagedListingsDecorator f28952b;

    public NewListingsDataSource(PagedListingsDecorator pagedListingsDecorator) {
        o.i(pagedListingsDecorator, "pagedListingsDecorator");
        this.f28952b = pagedListingsDecorator;
    }

    private final Object i(int i11, a<? super Pair<Integer, ? extends List<? extends b<?>>>> aVar) {
        if (i11 == 1) {
            return this.f28952b.s(aVar);
        }
        return this.f28952b.t(i11, aVar);
    }

    private final Object k(int i11, a<? super Pair<Integer, ? extends List<? extends b<?>>>> aVar) {
        return i(i11, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d A[Catch: Exception -> 0x006a, TryCatch #0 {Exception -> 0x006a, blocks: (B:12:0x0027, B:24:0x004f, B:28:0x0062, B:27:0x005d, B:17:0x0036, B:19:0x003e, B:21:0x0044), top: B:33:0x0021 }] */
    @Override // androidx.paging.PagingSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(androidx.paging.PagingSource.a<java.lang.Integer> r5, zz.a<? super androidx.paging.PagingSource.b<java.lang.Integer, x9.b<?>>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.forsale.app.features.categories.listings.dataSource.NewListingsDataSource$load$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.features.categories.listings.dataSource.NewListingsDataSource$load$1 r0 = (com.forsale.app.features.categories.listings.dataSource.NewListingsDataSource$load$1) r0
            int r1 = r0.f28956d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28956d = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listings.dataSource.NewListingsDataSource$load$1 r0 = new com.forsale.app.features.categories.listings.dataSource.NewListingsDataSource$load$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f28954b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f28956d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            int r5 = r0.f28953a
            kotlin.f.b(r6)     // Catch: java.lang.Exception -> L6a
            goto L4f
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.f.b(r6)
            java.lang.Object r5 = r5.a()     // Catch: java.lang.Exception -> L6a
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Exception -> L6a
            if (r5 == 0) goto L43
            int r5 = r5.intValue()     // Catch: java.lang.Exception -> L6a
            goto L44
        L43:
            r5 = r3
        L44:
            r0.f28953a = r5     // Catch: java.lang.Exception -> L6a
            r0.f28956d = r3     // Catch: java.lang.Exception -> L6a
            java.lang.Object r6 = r4.k(r5, r0)     // Catch: java.lang.Exception -> L6a
            if (r6 != r1) goto L4f
            return r1
        L4f:
            kotlin.Pair r6 = (kotlin.Pair) r6     // Catch: java.lang.Exception -> L6a
            androidx.paging.PagingSource$b$b r0 = new androidx.paging.PagingSource$b$b     // Catch: java.lang.Exception -> L6a
            java.lang.Object r1 = r6.d()     // Catch: java.lang.Exception -> L6a
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Exception -> L6a
            if (r5 != r3) goto L5d
            r5 = 0
            goto L62
        L5d:
            int r5 = r5 - r3
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.a.d(r5)     // Catch: java.lang.Exception -> L6a
        L62:
            java.lang.Object r6 = r6.c()     // Catch: java.lang.Exception -> L6a
            r0.<init>(r1, r5, r6)     // Catch: java.lang.Exception -> L6a
            return r0
        L6a:
            r5 = move-exception
            androidx.paging.PagingSource$b$a r6 = new androidx.paging.PagingSource$b$a
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.dataSource.NewListingsDataSource.f(androidx.paging.PagingSource$a, zz.a):java.lang.Object");
    }

    @Override // androidx.paging.PagingSource
    /* renamed from: j */
    public Integer d(m<Integer, b<?>> state) {
        Integer e11;
        Integer valueOf;
        Integer j11;
        o.i(state, "state");
        Integer d11 = state.d();
        if (d11 == null) {
            return null;
        }
        int intValue = d11.intValue();
        PagingSource.b.C0141b<Integer, b<?>> c11 = state.c(intValue);
        if (c11 != null && (j11 = c11.j()) != null) {
            valueOf = Integer.valueOf(j11.intValue() + 1);
        } else {
            PagingSource.b.C0141b<Integer, b<?>> c12 = state.c(intValue);
            if (c12 == null || (e11 = c12.e()) == null) {
                return null;
            }
            valueOf = Integer.valueOf(e11.intValue() - 1);
        }
        return valueOf;
    }
}
