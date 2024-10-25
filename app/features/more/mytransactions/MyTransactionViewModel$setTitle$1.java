package com.forsale.app.features.more.mytransactions;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MyTransactionViewModel.kt */
@d(c = "com.forsale.app.features.more.mytransactions.MyTransactionViewModel$setTitle$1", f = "MyTransactionViewModel.kt", l = {49}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MyTransactionViewModel$setTitle$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f32006a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f32007b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ MyTransactionViewModel f32008c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyTransactionViewModel$setTitle$1(MyTransactionViewModel myTransactionViewModel, zz.a<? super MyTransactionViewModel$setTitle$1> aVar) {
        super(2, aVar);
        this.f32008c = myTransactionViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        MyTransactionViewModel$setTitle$1 myTransactionViewModel$setTitle$1 = new MyTransactionViewModel$setTitle$1(this.f32008c, aVar);
        myTransactionViewModel$setTitle$1.f32007b = obj;
        return myTransactionViewModel$setTitle$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r5.f32006a
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1c
            if (r1 != r2) goto L14
            java.lang.Object r0 = r5.f32007b
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
            kotlin.f.b(r6)
            goto L44
        L14:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1c:
            kotlin.f.b(r6)
            java.lang.Object r6 = r5.f32007b
            kotlinx.coroutines.CoroutineScope r6 = (kotlinx.coroutines.CoroutineScope) r6
            com.forsale.app.features.more.mytransactions.MyTransactionViewModel r1 = r5.f32008c
            com.forsale.app.datalayer.network.entities.MyTransactionEntity$Record r1 = r1.m()
            java.lang.Integer r1 = r1.getCatId()
            if (r1 == 0) goto L47
            com.forsale.app.features.more.mytransactions.MyTransactionViewModel r4 = r5.f32008c
            int r1 = r1.intValue()
            com.forsale.app.datalayer.repositories.CategoriesRepositories r4 = com.forsale.app.features.more.mytransactions.MyTransactionViewModel.b(r4)
            r5.f32007b = r6
            r5.f32006a = r2
            java.lang.Object r6 = r4.getCategory(r1, r5)
            if (r6 != r0) goto L44
            return r0
        L44:
            com.forsale.app.datalayer.database.CategoryEntity r6 = (com.forsale.app.datalayer.database.CategoryEntity) r6
            goto L48
        L47:
            r6 = r3
        L48:
            com.forsale.app.features.more.mytransactions.MyTransactionViewModel r0 = r5.f32008c
            com.forsale.app.datalayer.network.entities.MyTransactionEntity$Record r0 = r0.m()
            java.util.List r0 = r0.getDistrictsIds()
            if (r0 == 0) goto L5c
            com.forsale.app.features.more.mytransactions.MyTransactionViewModel r1 = r5.f32008c
            com.forsale.app.features.more.mytransactions.MyTransactionViewModel.g(r1, r6, r0)
            wz.p r0 = wz.p.f75480a
            goto L5d
        L5c:
            r0 = r3
        L5d:
            if (r0 != 0) goto L65
            com.forsale.app.features.more.mytransactions.MyTransactionViewModel r0 = r5.f32008c
            r1 = 2
            com.forsale.app.features.more.mytransactions.MyTransactionViewModel.l(r0, r6, r3, r1, r3)
        L65:
            wz.p r6 = wz.p.f75480a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.mytransactions.MyTransactionViewModel$setTitle$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((MyTransactionViewModel$setTitle$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
