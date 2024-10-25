package com.forsale.app.ui.bottomsheets.wanteditems;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AddWantedItemViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.ui.bottomsheets.wanteditems.AddWantedItemViewModel$addWantedItem$1", f = "AddWantedItemViewModel.kt", l = {84, 82}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class AddWantedItemViewModel$addWantedItem$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f39244a;

    /* renamed from: b  reason: collision with root package name */
    int f39245b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AddWantedItemViewModel f39246c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddWantedItemViewModel$addWantedItem$1(AddWantedItemViewModel addWantedItemViewModel, zz.a<? super AddWantedItemViewModel$addWantedItem$1> aVar) {
        super(2, aVar);
        this.f39246c = addWantedItemViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new AddWantedItemViewModel$addWantedItem$1(this.f39246c, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a9  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r9.f39245b
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L24
            if (r1 == r4) goto L1c
            if (r1 != r2) goto L14
            kotlin.f.b(r10)
            goto L94
        L14:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1c:
            java.lang.Object r1 = r9.f39244a
            com.forsale.app.datalayer.network.services.ItemSubscriptionsService r1 = (com.forsale.app.datalayer.network.services.ItemSubscriptionsService) r1
            kotlin.f.b(r10)
            goto L42
        L24:
            kotlin.f.b(r10)
            com.forsale.app.ui.bottomsheets.wanteditems.AddWantedItemViewModel r10 = r9.f39246c
            com.forsale.app.datalayer.network.services.ItemSubscriptionsService r1 = com.forsale.app.ui.bottomsheets.wanteditems.AddWantedItemViewModel.w0(r10)
            com.forsale.app.ui.bottomsheets.wanteditems.AddWantedItemViewModel r10 = r9.f39246c
            jj.b r10 = com.forsale.app.ui.bottomsheets.wanteditems.AddWantedItemViewModel.x0(r10)
            kj.b r10 = r10.c()
            r9.f39244a = r1
            r9.f39245b = r4
            java.lang.Object r10 = r10.a(r9)
            if (r10 != r0) goto L42
            return r0
        L42:
            java.lang.String r10 = (java.lang.String) r10
            com.forsale.app.ui.bottomsheets.wanteditems.AddWantedItemViewModel r5 = r9.f39246c
            androidx.lifecycle.b0 r5 = r5.B0()
            java.lang.Object r5 = r5.getValue()
            com.forsale.app.datalayer.database.CategoryEntity r5 = (com.forsale.app.datalayer.database.CategoryEntity) r5
            if (r5 == 0) goto L5b
            int r5 = r5.getId()
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.a.d(r5)
            goto L5c
        L5b:
            r5 = r3
        L5c:
            com.forsale.app.ui.bottomsheets.wanteditems.AddWantedItemViewModel r6 = r9.f39246c
            androidx.lifecycle.b0 r6 = r6.D0()
            java.lang.Object r6 = r6.getValue()
            com.forsale.app.datalayer.database.DistrictEntity r6 = (com.forsale.app.datalayer.database.DistrictEntity) r6
            if (r6 == 0) goto L6f
            int r6 = r6.getId()
            goto L70
        L6f:
            r6 = r4
        L70:
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.a.d(r6)
            java.util.List r6 = kotlin.collections.p.e(r6)
            com.forsale.app.ui.bottomsheets.wanteditems.AddWantedItemViewModel r7 = r9.f39246c
            androidx.lifecycle.b0 r7 = r7.K0()
            java.lang.Object r7 = r7.getValue()
            java.lang.String r7 = (java.lang.String) r7
            com.forsale.app.datalayer.network.requestsbodies.AddItemSubscriptionBody r8 = new com.forsale.app.datalayer.network.requestsbodies.AddItemSubscriptionBody
            r8.<init>(r10, r5, r6, r7)
            r9.f39244a = r3
            r9.f39245b = r2
            java.lang.Object r10 = r1.addItemSubscription(r8, r9)
            if (r10 != r0) goto L94
            return r0
        L94:
            com.forsale.app.ui.bottomsheets.wanteditems.AddWantedItemViewModel r0 = r9.f39246c
            com.forsale.app.datalayer.network.responses.ItemSubscriptionResponse r10 = (com.forsale.app.datalayer.network.responses.ItemSubscriptionResponse) r10
            int r1 = r10.getId()
            if (r1 == 0) goto La9
            com.forsale.app.ui.bottomsheets.wanteditems.AddWantedItemViewModel.y0(r0, r10)
            com.forsale.app.utils.OneShotEventHandler r10 = r0.G0()
            com.forsale.app.utils.OneShotEventHandler.d(r10, r3, r4, r3)
            goto Lb2
        La9:
            com.forsale.app.utils.OneShotEventHandler r10 = r0.J0()
            wz.p r0 = wz.p.f75480a
            r10.i(r0)
        Lb2:
            wz.p r10 = wz.p.f75480a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.ui.bottomsheets.wanteditems.AddWantedItemViewModel$addWantedItem$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((AddWantedItemViewModel$addWantedItem$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
