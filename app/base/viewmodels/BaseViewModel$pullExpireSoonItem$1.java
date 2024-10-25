package com.forsale.app.base.viewmodels;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseViewModel.kt */
@d(c = "com.forsale.app.base.viewmodels.BaseViewModel$pullExpireSoonItem$1", f = "BaseViewModel.kt", l = {170}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BaseViewModel$pullExpireSoonItem$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f22289a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BaseViewModel f22290b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ g00.a<wz.p> f22291c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseViewModel$pullExpireSoonItem$1(BaseViewModel baseViewModel, g00.a<wz.p> aVar, a<? super BaseViewModel$pullExpireSoonItem$1> aVar2) {
        super(2, aVar2);
        this.f22290b = baseViewModel;
        this.f22291c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new BaseViewModel$pullExpireSoonItem$1(this.f22290b, this.f22291c, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r5.f22289a
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.f.b(r6)
            goto L3c
        Lf:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L17:
            kotlin.f.b(r6)
            com.forsale.app.base.viewmodels.BaseViewModel r6 = r5.f22290b
            com.forsale.app.datalayer.repositories.ExpireSoonRepository r6 = r6.v()
            com.forsale.app.datalayer.network.responses.AboutToExpireListing r6 = r6.pull()
            if (r6 == 0) goto L3f
            com.forsale.app.base.viewmodels.BaseViewModel r1 = r5.f22290b
            g00.a<wz.p> r3 = r5.f22291c
            kotlinx.coroutines.flow.MutableSharedFlow r1 = com.forsale.app.base.viewmodels.BaseViewModel.g(r1)
            kotlin.Pair r4 = new kotlin.Pair
            r4.<init>(r6, r3)
            r5.f22289a = r2
            java.lang.Object r6 = r1.emit(r4, r5)
            if (r6 != r0) goto L3c
            return r0
        L3c:
            wz.p r6 = wz.p.f75480a
            goto L40
        L3f:
            r6 = 0
        L40:
            if (r6 != 0) goto L47
            g00.a<wz.p> r6 = r5.f22291c
            r6.invoke()
        L47:
            wz.p r6 = wz.p.f75480a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.base.viewmodels.BaseViewModel$pullExpireSoonItem$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((BaseViewModel$pullExpireSoonItem$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
