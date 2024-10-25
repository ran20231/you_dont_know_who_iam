package com.forsale.adserver.view.composeViews.commercialList;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CommercialListViewModel.kt */
@d(c = "com.forsale.adserver.view.composeViews.commercialList.CommercialListViewModel$loadMoreOffers$1", f = "CommercialListViewModel.kt", l = {58, 59, 61, 62}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CommercialListViewModel$loadMoreOffers$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f21020a;

    /* renamed from: b  reason: collision with root package name */
    int f21021b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ CommercialListViewModel f21022c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommercialListViewModel$loadMoreOffers$1(CommercialListViewModel commercialListViewModel, zz.a<? super CommercialListViewModel$loadMoreOffers$1> aVar) {
        super(2, aVar);
        this.f21022c = commercialListViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CommercialListViewModel$loadMoreOffers$1(this.f21022c, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a8 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r8.f21021b
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r1 == 0) goto L32
            if (r1 == r6) goto L2e
            if (r1 == r4) goto L2a
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1a
            kotlin.f.b(r9)
            goto La9
        L1a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L22:
            java.lang.Object r1 = r8.f21020a
            com.forsale.adserver.view.composeViews.commercialList.CommercialListViewModel r1 = (com.forsale.adserver.view.composeViews.commercialList.CommercialListViewModel) r1
            kotlin.f.b(r9)
            goto L93
        L2a:
            kotlin.f.b(r9)
            goto L67
        L2e:
            kotlin.f.b(r9)
            goto L4e
        L32:
            kotlin.f.b(r9)
            com.forsale.adserver.view.composeViews.commercialList.CommercialListViewModel r9 = r8.f21022c
            int r9 = r9.k()
            if (r9 != r6) goto L4e
            com.forsale.adserver.view.composeViews.commercialList.CommercialListViewModel r9 = r8.f21022c
            kotlinx.coroutines.flow.MutableSharedFlow r9 = r9.j()
            com.forsale.adserver.view.composeViews.commercialList.CommercialListViewModel$a$f r1 = com.forsale.adserver.view.composeViews.commercialList.CommercialListViewModel.a.f.f21013a
            r8.f21021b = r6
            java.lang.Object r9 = r9.emit(r1, r8)
            if (r9 != r0) goto L4e
            return r0
        L4e:
            com.forsale.adserver.view.composeViews.commercialList.CommercialListViewModel r9 = r8.f21022c
            int r9 = r9.k()
            if (r9 <= r6) goto L67
            com.forsale.adserver.view.composeViews.commercialList.CommercialListViewModel r9 = r8.f21022c
            kotlinx.coroutines.flow.MutableSharedFlow r9 = r9.j()
            com.forsale.adserver.view.composeViews.commercialList.CommercialListViewModel$a$b r1 = com.forsale.adserver.view.composeViews.commercialList.CommercialListViewModel.a.b.f21009a
            r8.f21021b = r4
            java.lang.Object r9 = r9.emit(r1, r8)
            if (r9 != r0) goto L67
            return r0
        L67:
            com.forsale.adserver.view.composeViews.commercialList.CommercialListViewModel r9 = r8.f21022c
            java.util.List r9 = r9.g()
            boolean r1 = r9.isEmpty()
            if (r1 != 0) goto L74
            goto L75
        L74:
            r9 = r5
        L75:
            if (r9 == 0) goto La9
            com.forsale.adserver.view.composeViews.commercialList.CommercialListViewModel r1 = r8.f21022c
            com.forsale.adserver.usecases.offersInteractors.LoadOffersByIdsInteractor r4 = com.forsale.adserver.view.composeViews.commercialList.CommercialListViewModel.f(r1)
            int r7 = r1.k()
            int r7 = r7 - r6
            java.lang.Object r9 = r9.get(r7)
            java.util.List r9 = (java.util.List) r9
            r8.f21020a = r1
            r8.f21021b = r3
            java.lang.Object r9 = r4.d(r9, r8)
            if (r9 != r0) goto L93
            return r0
        L93:
            java.util.List r9 = (java.util.List) r9
            kotlinx.coroutines.MainCoroutineDispatcher r3 = kotlinx.coroutines.Dispatchers.getMain()
            com.forsale.adserver.view.composeViews.commercialList.CommercialListViewModel$loadMoreOffers$1$2$1$1 r4 = new com.forsale.adserver.view.composeViews.commercialList.CommercialListViewModel$loadMoreOffers$1$2$1$1
            r4.<init>(r1, r9, r5)
            r8.f21020a = r5
            r8.f21021b = r2
            java.lang.Object r9 = kotlinx.coroutines.BuildersKt.withContext(r3, r4, r8)
            if (r9 != r0) goto La9
            return r0
        La9:
            wz.p r9 = wz.p.f75480a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.adserver.view.composeViews.commercialList.CommercialListViewModel$loadMoreOffers$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((CommercialListViewModel$loadMoreOffers$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
