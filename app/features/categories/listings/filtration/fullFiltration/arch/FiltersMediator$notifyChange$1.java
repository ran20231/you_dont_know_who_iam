package com.forsale.app.features.categories.listings.filtration.fullFiltration.arch;

import com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FiltersMediator.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator$notifyChange$1", f = "FiltersMediator.kt", l = {FacebookMediationAdapter.ERROR_MAPPING_NATIVE_ASSETS, FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD, 112, 112}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class FiltersMediator$notifyChange$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f29111a;

    /* renamed from: b  reason: collision with root package name */
    int f29112b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ FilterViewModel<?, ?, ?> f29113c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ FiltersMediator f29114d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FiltersMediator$notifyChange$1(FilterViewModel<?, ?, ?> filterViewModel, FiltersMediator filtersMediator, a<? super FiltersMediator$notifyChange$1> aVar) {
        super(2, aVar);
        this.f29113c = filterViewModel;
        this.f29114d = filtersMediator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new FiltersMediator$notifyChange$1(this.f29113c, this.f29114d, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0066 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r7.f29112b
            r2 = 4
            r3 = 3
            r4 = 1
            r5 = 2
            if (r1 == 0) goto L32
            if (r1 == r4) goto L2c
            if (r1 == r5) goto L28
            if (r1 == r3) goto L24
            if (r1 == r2) goto L1c
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1c:
            java.lang.Object r0 = r7.f29111a
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            kotlin.f.b(r8)
            goto L78
        L24:
            kotlin.f.b(r8)
            goto L67
        L28:
            kotlin.f.b(r8)     // Catch: java.lang.Throwable -> L30
            goto L51
        L2c:
            kotlin.f.b(r8)     // Catch: java.lang.Throwable -> L30
            goto L40
        L30:
            r8 = move-exception
            goto L6a
        L32:
            kotlin.f.b(r8)
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel<?, ?, ?> r8 = r7.f29113c     // Catch: java.lang.Throwable -> L30
            r7.f29112b = r4     // Catch: java.lang.Throwable -> L30
            java.lang.Object r8 = r8.i(r7)     // Catch: java.lang.Throwable -> L30
            if (r8 != r0) goto L40
            return r0
        L40:
            com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator r8 = r7.f29114d     // Catch: java.lang.Throwable -> L30
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel<?, ?, ?> r1 = r7.f29113c     // Catch: java.lang.Throwable -> L30
            java.util.List r4 = r8.i()     // Catch: java.lang.Throwable -> L30
            r7.f29112b = r5     // Catch: java.lang.Throwable -> L30
            java.lang.Object r8 = com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator.a(r8, r1, r4, r7)     // Catch: java.lang.Throwable -> L30
            if (r8 != r0) goto L51
            return r0
        L51:
            com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator r8 = r7.f29114d     // Catch: java.lang.Throwable -> L30
            java.util.List r1 = r8.i()     // Catch: java.lang.Throwable -> L30
            r4 = 0
            r6 = 0
            com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator.g(r8, r1, r4, r5, r6)     // Catch: java.lang.Throwable -> L30
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel<?, ?, ?> r8 = r7.f29113c
            r7.f29112b = r3
            java.lang.Object r8 = r8.X(r7)
            if (r8 != r0) goto L67
            return r0
        L67:
            wz.p r8 = wz.p.f75480a
            return r8
        L6a:
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel<?, ?, ?> r1 = r7.f29113c
            r7.f29111a = r8
            r7.f29112b = r2
            java.lang.Object r1 = r1.X(r7)
            if (r1 != r0) goto L77
            return r0
        L77:
            r0 = r8
        L78:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator$notifyChange$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((FiltersMediator$notifyChange$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
