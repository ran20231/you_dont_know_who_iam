package com.forsale.app.ui.bottomsheets.wanteditems;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DeleteWantedItemViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.ui.bottomsheets.wanteditems.DeleteWantedItemViewModel$deleteWantedItem$1", f = "DeleteWantedItemViewModel.kt", l = {42, 42}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class DeleteWantedItemViewModel$deleteWantedItem$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f39273a;

    /* renamed from: b  reason: collision with root package name */
    int f39274b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ DeleteWantedItemViewModel f39275c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteWantedItemViewModel$deleteWantedItem$1(DeleteWantedItemViewModel deleteWantedItemViewModel, zz.a<? super DeleteWantedItemViewModel$deleteWantedItem$1> aVar) {
        super(2, aVar);
        this.f39275c = deleteWantedItemViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new DeleteWantedItemViewModel$deleteWantedItem$1(this.f39275c, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r7.f39274b
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L23
            if (r1 == r4) goto L1b
            if (r1 != r2) goto L13
            kotlin.f.b(r8)
            goto L5d
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            java.lang.Object r1 = r7.f39273a
            com.forsale.app.datalayer.network.services.ItemSubscriptionsService r1 = (com.forsale.app.datalayer.network.services.ItemSubscriptionsService) r1
            kotlin.f.b(r8)
            goto L41
        L23:
            kotlin.f.b(r8)
            com.forsale.app.ui.bottomsheets.wanteditems.DeleteWantedItemViewModel r8 = r7.f39275c
            com.forsale.app.datalayer.network.services.ItemSubscriptionsService r1 = com.forsale.app.ui.bottomsheets.wanteditems.DeleteWantedItemViewModel.w0(r8)
            com.forsale.app.ui.bottomsheets.wanteditems.DeleteWantedItemViewModel r8 = r7.f39275c
            jj.b r8 = com.forsale.app.ui.bottomsheets.wanteditems.DeleteWantedItemViewModel.x0(r8)
            kj.b r8 = r8.c()
            r7.f39273a = r1
            r7.f39274b = r4
            java.lang.Object r8 = r8.a(r7)
            if (r8 != r0) goto L41
            return r0
        L41:
            java.lang.String r8 = (java.lang.String) r8
            com.forsale.app.ui.bottomsheets.wanteditems.DeleteWantedItemViewModel r5 = r7.f39275c
            com.forsale.app.datalayer.network.responses.ItemSubscriptionResponse r5 = com.forsale.app.ui.bottomsheets.wanteditems.DeleteWantedItemViewModel.v0(r5)
            int r5 = r5.getId()
            com.forsale.app.datalayer.network.requestsbodies.DeleteItemSubscriptionBody r6 = new com.forsale.app.datalayer.network.requestsbodies.DeleteItemSubscriptionBody
            r6.<init>(r8, r5)
            r7.f39273a = r3
            r7.f39274b = r2
            java.lang.Object r8 = r1.deleteItemSubscription(r6, r7)
            if (r8 != r0) goto L5d
            return r0
        L5d:
            com.forsale.app.ui.bottomsheets.wanteditems.DeleteWantedItemViewModel r0 = r7.f39275c
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            boolean r8 = com.forsale.app.utils.TypeExtensionsKt.h0(r8)
            if (r8 == 0) goto L7a
            com.forsale.app.datalayer.network.responses.ItemSubscriptionResponse r8 = com.forsale.app.ui.bottomsheets.wanteditems.DeleteWantedItemViewModel.v0(r0)
            com.forsale.app.ui.bottomsheets.wanteditems.DeleteWantedItemViewModel.y0(r0, r8)
            com.forsale.app.utils.OneShotEventHandler r8 = r0.A0()
            com.forsale.app.utils.OneShotEventHandler.d(r8, r3, r4, r3)
            goto L83
        L7a:
            com.forsale.app.utils.OneShotEventHandler r8 = r0.B0()
            wz.p r0 = wz.p.f75480a
            r8.i(r0)
        L83:
            wz.p r8 = wz.p.f75480a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.ui.bottomsheets.wanteditems.DeleteWantedItemViewModel$deleteWantedItem$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((DeleteWantedItemViewModel$deleteWantedItem$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
