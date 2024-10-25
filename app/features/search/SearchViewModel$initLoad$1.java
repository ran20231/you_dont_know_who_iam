package com.forsale.app.features.search;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SearchViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.search.SearchViewModel$initLoad$1", f = "SearchViewModel.kt", l = {123, 125, 127, 130}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SearchViewModel$initLoad$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f36862a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SearchViewModel f36863b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel$initLoad$1(SearchViewModel searchViewModel, zz.a<? super SearchViewModel$initLoad$1> aVar) {
        super(2, aVar);
        this.f36863b = searchViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new SearchViewModel$initLoad$1(this.f36863b, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r9.f36862a
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L30
            if (r1 == r5) goto L2c
            if (r1 == r4) goto L26
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1a
            kotlin.f.b(r10)     // Catch: java.lang.Throwable -> L2a
            goto L8d
        L1a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L22:
            kotlin.f.b(r10)     // Catch: java.lang.Throwable -> L2a
            goto L67
        L26:
            kotlin.f.b(r10)     // Catch: java.lang.Throwable -> L2a
            goto L4d
        L2a:
            r10 = move-exception
            goto L99
        L2c:
            kotlin.f.b(r10)
            goto L3e
        L30:
            kotlin.f.b(r10)
            r9.f36862a = r5
            r7 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r10 = kotlinx.coroutines.DelayKt.delay(r7, r9)
            if (r10 != r0) goto L3e
            return r0
        L3e:
            com.forsale.app.features.search.SearchViewModel r10 = r9.f36863b     // Catch: java.lang.Throwable -> L2a
            com.forsale.app.datalayer.repositories.RegionsRepository r10 = r10.I()     // Catch: java.lang.Throwable -> L2a
            r9.f36862a = r4     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r10 = r10.getCurrentRegion(r9)     // Catch: java.lang.Throwable -> L2a
            if (r10 != r0) goto L4d
            return r0
        L4d:
            com.forsale.app.features.search.SearchViewModel r1 = r9.f36863b     // Catch: java.lang.Throwable -> L2a
            androidx.lifecycle.b0 r1 = com.forsale.app.features.search.SearchViewModel.E0(r1)     // Catch: java.lang.Throwable -> L2a
            com.forsale.app.datalayer.database.RegionEntity r10 = (com.forsale.app.datalayer.database.RegionEntity) r10     // Catch: java.lang.Throwable -> L2a
            r1.postValue(r10)     // Catch: java.lang.Throwable -> L2a
            com.forsale.app.features.search.SearchViewModel r10 = r9.f36863b     // Catch: java.lang.Throwable -> L2a
            com.forsale.app.datalayer.repositories.MasterDataRepository r10 = com.forsale.app.features.search.SearchViewModel.A0(r10)     // Catch: java.lang.Throwable -> L2a
            r9.f36862a = r3     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r10 = r10.getMasterDataMiscModel(r9)     // Catch: java.lang.Throwable -> L2a
            if (r10 != r0) goto L67
            return r0
        L67:
            com.forsale.app.features.search.SearchViewModel r1 = r9.f36863b     // Catch: java.lang.Throwable -> L2a
            androidx.lifecycle.b0 r1 = com.forsale.app.features.search.SearchViewModel.B0(r1)     // Catch: java.lang.Throwable -> L2a
            com.forsale.app.datalayer.database.MasterDataMiscModel r10 = (com.forsale.app.datalayer.database.MasterDataMiscModel) r10     // Catch: java.lang.Throwable -> L2a
            r1.postValue(r10)     // Catch: java.lang.Throwable -> L2a
            com.forsale.app.features.search.SearchViewModel r10 = r9.f36863b     // Catch: java.lang.Throwable -> L2a
            androidx.lifecycle.b0 r10 = com.forsale.app.features.search.SearchViewModel.M0(r10)     // Catch: java.lang.Throwable -> L2a
            com.forsale.app.features.search.SearchViewModel r1 = r9.f36863b     // Catch: java.lang.Throwable -> L2a
            java.util.List r1 = com.forsale.app.features.search.SearchViewModel.w0(r1)     // Catch: java.lang.Throwable -> L2a
            r10.postValue(r1)     // Catch: java.lang.Throwable -> L2a
            com.forsale.app.features.search.SearchViewModel r10 = r9.f36863b     // Catch: java.lang.Throwable -> L2a
            r9.f36862a = r2     // Catch: java.lang.Throwable -> L2a
            r1 = 0
            java.lang.Object r10 = com.forsale.app.features.search.SearchViewModel.y1(r10, r6, r9, r5, r1)     // Catch: java.lang.Throwable -> L2a
            if (r10 != r0) goto L8d
            return r0
        L8d:
            com.forsale.app.features.search.SearchViewModel r10 = r9.f36863b     // Catch: java.lang.Throwable -> L2a
            androidx.lifecycle.b0 r10 = r10.v0()     // Catch: java.lang.Throwable -> L2a
            com.forsale.app.base.ViewStates r0 = com.forsale.app.base.ViewStates.CONTENT     // Catch: java.lang.Throwable -> L2a
            r10.postValue(r0)     // Catch: java.lang.Throwable -> L2a
            goto L9e
        L99:
            com.forsale.app.features.search.SearchViewModel r0 = r9.f36863b     // Catch: java.lang.Throwable -> Lae
            com.forsale.app.features.search.SearchViewModel.O0(r0, r10)     // Catch: java.lang.Throwable -> Lae
        L9e:
            com.forsale.app.features.search.SearchViewModel r10 = r9.f36863b
            androidx.lifecycle.b0 r10 = com.forsale.app.features.search.SearchViewModel.N0(r10)
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.a.a(r6)
            r10.postValue(r0)
            wz.p r10 = wz.p.f75480a
            return r10
        Lae:
            r10 = move-exception
            com.forsale.app.features.search.SearchViewModel r0 = r9.f36863b
            androidx.lifecycle.b0 r0 = com.forsale.app.features.search.SearchViewModel.N0(r0)
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.a.a(r6)
            r0.postValue(r1)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.search.SearchViewModel$initLoad$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((SearchViewModel$initLoad$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
