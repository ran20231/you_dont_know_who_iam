package com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FilterViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel$onFilterClicked$1", f = "FilterViewModel.kt", l = {160, 161, 162, 164, 165}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class FilterViewModel$onFilterClicked$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f29457a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ FilterViewModel<FD, FR, E> f29458b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f29459c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilterViewModel$onFilterClicked$1(FilterViewModel<FD, FR, E> filterViewModel, int i11, a<? super FilterViewModel$onFilterClicked$1> aVar) {
        super(2, aVar);
        this.f29458b = filterViewModel;
        this.f29459c = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new FilterViewModel$onFilterClicked$1(this.f29458b, this.f29459c, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007f A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r8.f29457a
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L33
            if (r1 == r6) goto L2f
            if (r1 == r5) goto L2b
            if (r1 == r4) goto L27
            if (r1 == r3) goto L23
            if (r1 != r2) goto L1b
            kotlin.f.b(r9)
            goto L80
        L1b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L23:
            kotlin.f.b(r9)
            goto L75
        L27:
            kotlin.f.b(r9)
            goto L6a
        L2b:
            kotlin.f.b(r9)
            goto L4c
        L2f:
            kotlin.f.b(r9)
            goto L41
        L33:
            kotlin.f.b(r9)
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel<FD, FR, E> r9 = r8.f29458b
            r8.f29457a = r6
            java.lang.Object r9 = r9.i(r8)
            if (r9 != r0) goto L41
            return r0
        L41:
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel<FD, FR, E> r9 = r8.f29458b
            r8.f29457a = r5
            java.lang.Object r9 = r9.P(r8)
            if (r9 != r0) goto L4c
            return r0
        L4c:
            com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.a r9 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.a) r9
            if (r9 == 0) goto L6a
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel<FD, FR, E> r1 = r8.f29458b
            int r5 = r8.f29459c
            kotlinx.coroutines.flow.MutableSharedFlow r6 = com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel.c(r1)
            kotlin.Triple r7 = new kotlin.Triple
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.a.d(r5)
            r7.<init>(r1, r9, r5)
            r8.f29457a = r4
            java.lang.Object r9 = r6.emit(r7, r8)
            if (r9 != r0) goto L6a
            return r0
        L6a:
            r8.f29457a = r3
            r3 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r9 = kotlinx.coroutines.DelayKt.delay(r3, r8)
            if (r9 != r0) goto L75
            return r0
        L75:
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel<FD, FR, E> r9 = r8.f29458b
            r8.f29457a = r2
            java.lang.Object r9 = r9.X(r8)
            if (r9 != r0) goto L80
            return r0
        L80:
            wz.p r9 = wz.p.f75480a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel$onFilterClicked$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((FilterViewModel$onFilterClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
