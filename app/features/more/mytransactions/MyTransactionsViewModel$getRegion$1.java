package com.forsale.app.features.more.mytransactions;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MyTransactionsViewModel.kt */
@d(c = "com.forsale.app.features.more.mytransactions.MyTransactionsViewModel$getRegion$1", f = "MyTransactionsViewModel.kt", l = {l8.a.f62267d, 64, 64}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MyTransactionsViewModel$getRegion$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f32045a;

    /* renamed from: b  reason: collision with root package name */
    int f32046b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ MyTransactionsViewModel f32047c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyTransactionsViewModel$getRegion$1(MyTransactionsViewModel myTransactionsViewModel, zz.a<? super MyTransactionsViewModel$getRegion$1> aVar) {
        super(2, aVar);
        this.f32047c = myTransactionsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new MyTransactionsViewModel$getRegion$1(this.f32047c, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0066 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r6.f32046b
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L2a
            if (r1 == r4) goto L26
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            kotlin.f.b(r7)
            goto L67
        L16:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1e:
            java.lang.Object r1 = r6.f32045a
            com.forsale.app.features.more.mytransactions.MyTransactionsViewModel r1 = (com.forsale.app.features.more.mytransactions.MyTransactionsViewModel) r1
            kotlin.f.b(r7)
            goto L57
        L26:
            kotlin.f.b(r7)
            goto L3c
        L2a:
            kotlin.f.b(r7)
            com.forsale.app.features.more.mytransactions.MyTransactionsViewModel r7 = r6.f32047c
            com.forsale.app.utils.facades.user.UserProfileInteractor r7 = com.forsale.app.features.more.mytransactions.MyTransactionsViewModel.w0(r7)
            r6.f32046b = r4
            java.lang.Object r7 = r7.i(r6)
            if (r7 != r0) goto L3c
            return r0
        L3c:
            com.forsale.app.features.more.mytransactions.MyTransactionsViewModel r1 = r6.f32047c
            com.forsale.app.datalayer.database.UserEntity r7 = (com.forsale.app.datalayer.database.UserEntity) r7
            com.forsale.app.datalayer.repositories.RegionsRepository r4 = r1.I()
            if (r7 == 0) goto L4b
            java.lang.Integer r7 = r7.getRegionId()
            goto L4c
        L4b:
            r7 = r5
        L4c:
            r6.f32045a = r1
            r6.f32046b = r3
            java.lang.Object r7 = r4.getRegion(r7, r6)
            if (r7 != r0) goto L57
            return r0
        L57:
            com.forsale.app.features.more.mytransactions.MyTransactionsViewModel$getRegion$1$1$1 r3 = new com.forsale.app.features.more.mytransactions.MyTransactionsViewModel$getRegion$1$1$1
            r3.<init>(r1, r5)
            r6.f32045a = r5
            r6.f32046b = r2
            java.lang.Object r7 = com.forsale.app.utils.CoroutinesExtensionsKt.a(r7, r3, r6)
            if (r7 != r0) goto L67
            return r0
        L67:
            wz.p r7 = wz.p.f75480a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.mytransactions.MyTransactionsViewModel$getRegion$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((MyTransactionsViewModel$getRegion$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
