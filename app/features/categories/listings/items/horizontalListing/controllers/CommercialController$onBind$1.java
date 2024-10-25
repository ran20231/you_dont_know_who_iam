package com.forsale.app.features.categories.listings.items.horizontalListing.controllers;

import androidx.recyclerview.widget.RecyclerView;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* compiled from: CommercialController.kt */
@d(c = "com.forsale.app.features.categories.listings.items.horizontalListing.controllers.CommercialController$onBind$1", f = "CommercialController.kt", l = {45}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CommercialController$onBind$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f30792a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CommercialController f30793b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ RecyclerView f30794c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ RecyclerView.o f30795d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommercialController$onBind$1(CommercialController commercialController, RecyclerView recyclerView, RecyclerView.o oVar, a<? super CommercialController$onBind$1> aVar) {
        super(2, aVar);
        this.f30793b = commercialController;
        this.f30794c = recyclerView;
        this.f30795d = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new CommercialController$onBind$1(this.f30793b, this.f30794c, this.f30795d, aVar);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:12:0x0027). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r5.f30792a
            r2 = 1
            if (r1 == 0) goto L18
            if (r1 != r2) goto L10
            kotlin.f.b(r6)
            r6 = r5
            goto L27
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L18:
            kotlin.f.b(r6)
            r6 = r5
        L1c:
            r6.f30792a = r2
            r3 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r1 = kotlinx.coroutines.DelayKt.delay(r3, r6)
            if (r1 != r0) goto L27
            return r0
        L27:
            com.forsale.app.features.categories.listings.items.horizontalListing.controllers.CommercialController r1 = r6.f30793b
            kotlinx.coroutines.sync.Mutex r1 = com.forsale.app.features.categories.listings.items.horizontalListing.controllers.CommercialController.c(r1)
            boolean r1 = r1.isLocked()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "is locked : "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            x10.a.b(r1, r3)
            com.forsale.app.features.categories.listings.items.horizontalListing.controllers.CommercialController r1 = r6.f30793b
            kotlinx.coroutines.sync.Mutex r1 = com.forsale.app.features.categories.listings.items.horizontalListing.controllers.CommercialController.c(r1)
            boolean r1 = r1.isLocked()
            if (r1 != 0) goto L1c
            com.forsale.app.features.categories.listings.items.horizontalListing.controllers.CommercialController r1 = r6.f30793b
            androidx.recyclerview.widget.RecyclerView r3 = r6.f30794c
            androidx.recyclerview.widget.RecyclerView$o r4 = r6.f30795d
            androidx.recyclerview.widget.GridLayoutManager r4 = (androidx.recyclerview.widget.GridLayoutManager) r4
            com.forsale.app.features.categories.listings.items.horizontalListing.controllers.CommercialController.d(r1, r3, r4)
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.items.horizontalListing.controllers.CommercialController$onBind$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((CommercialController$onBind$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
