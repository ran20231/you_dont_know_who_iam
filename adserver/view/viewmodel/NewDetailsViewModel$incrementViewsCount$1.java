package com.forsale.adserver.view.viewmodel;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewDetailsViewModel.kt */
@d(c = "com.forsale.adserver.view.viewmodel.NewDetailsViewModel$incrementViewsCount$1", f = "NewDetailsViewModel.kt", l = {275, 282, 286}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class NewDetailsViewModel$incrementViewsCount$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f21769a;

    /* renamed from: b  reason: collision with root package name */
    int f21770b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ NewDetailsViewModel f21771c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewDetailsViewModel$incrementViewsCount$1(NewDetailsViewModel newDetailsViewModel, a<? super NewDetailsViewModel$incrementViewsCount$1> aVar) {
        super(2, aVar);
        this.f21771c = newDetailsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new NewDetailsViewModel$incrementViewsCount$1(this.f21771c, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r8.f21770b
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2a
            if (r1 == r4) goto L26
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            kotlin.f.b(r9)
            goto L96
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            java.lang.Object r1 = r8.f21769a
            com.forsale.adserver.view.viewmodel.NewDetailsViewModel r1 = (com.forsale.adserver.view.viewmodel.NewDetailsViewModel) r1
            kotlin.f.b(r9)
            goto L76
        L26:
            kotlin.f.b(r9)
            goto L3e
        L2a:
            kotlin.f.b(r9)
            com.forsale.adserver.view.viewmodel.NewDetailsViewModel r9 = r8.f21771c
            kotlinx.coroutines.flow.MutableStateFlow r9 = com.forsale.adserver.view.viewmodel.NewDetailsViewModel.D(r9)
            j9.f$c r1 = j9.f.c.f60482a
            r8.f21770b = r4
            java.lang.Object r9 = r9.emit(r1, r8)
            if (r9 != r0) goto L3e
            return r0
        L3e:
            com.forsale.adserver.view.viewmodel.NewDetailsViewModel r9 = r8.f21771c
            kotlinx.coroutines.flow.StateFlow r9 = r9.L()
            java.lang.Object r9 = r9.getValue()
            com.forsale.adserver.view.models.AdsModel r9 = (com.forsale.adserver.view.models.AdsModel) r9
            if (r9 == 0) goto L96
            com.forsale.adserver.view.viewmodel.NewDetailsViewModel r1 = r8.f21771c
            boolean r5 = r9.o()
            if (r5 == 0) goto L59
            java.lang.Integer r9 = r9.n()
            goto L78
        L59:
            com.forsale.adserver.view.viewmodel.ImpressionsViewModel r5 = com.forsale.adserver.view.viewmodel.NewDetailsViewModel.o(r1)
            com.forsale.adserver.view.models.AdType r6 = r9.a()
            com.forsale.adserver.view.models.AdType r7 = com.forsale.adserver.view.models.AdType.OFFER
            if (r6 != r7) goto L66
            goto L67
        L66:
            r4 = 0
        L67:
            int r9 = r9.g()
            r8.f21769a = r1
            r8.f21770b = r3
            java.lang.Object r9 = r5.s(r4, r9, r8)
            if (r9 != r0) goto L76
            return r0
        L76:
            java.lang.Integer r9 = (java.lang.Integer) r9
        L78:
            if (r9 != 0) goto L7b
            goto L81
        L7b:
            int r3 = r9.intValue()
            if (r3 == 0) goto L96
        L81:
            kotlinx.coroutines.flow.MutableStateFlow r1 = com.forsale.adserver.view.viewmodel.NewDetailsViewModel.D(r1)
            j9.f$d r3 = new j9.f$d
            r3.<init>(r9)
            r9 = 0
            r8.f21769a = r9
            r8.f21770b = r2
            java.lang.Object r9 = r1.emit(r3, r8)
            if (r9 != r0) goto L96
            return r0
        L96:
            wz.p r9 = wz.p.f75480a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.adserver.view.viewmodel.NewDetailsViewModel$incrementViewsCount$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((NewDetailsViewModel$incrementViewsCount$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
