package com.forsale.app.features.maincontainer;

import com.forsale.adserver.view.models.AdsModel;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainContainerActivity.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.maincontainer.MainContainerActivity$navigateToAdminListingDetails$1", f = "MainContainerActivity.kt", l = {255, 256}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MainContainerActivity$navigateToAdminListingDetails$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f31389a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MainContainerActivity f31390b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Integer f31391c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ AdsModel f31392d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ boolean f31393e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainContainerActivity$navigateToAdminListingDetails$1(MainContainerActivity mainContainerActivity, Integer num, AdsModel adsModel, boolean z11, zz.a<? super MainContainerActivity$navigateToAdminListingDetails$1> aVar) {
        super(2, aVar);
        this.f31390b = mainContainerActivity;
        this.f31391c = num;
        this.f31392d = adsModel;
        this.f31393e = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new MainContainerActivity$navigateToAdminListingDetails$1(this.f31390b, this.f31391c, this.f31392d, this.f31393e, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r5.f31389a
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L1e
            if (r1 == r2) goto L1a
            if (r1 != r3) goto L12
            kotlin.f.b(r6)
            goto L65
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            kotlin.f.b(r6)
            goto L4c
        L1e:
            kotlin.f.b(r6)
            com.forsale.app.features.maincontainer.MainContainerActivity r6 = r5.f31390b
            boolean r6 = com.forsale.app.features.maincontainer.MainContainerActivity.V0(r6)
            if (r6 == 0) goto L41
            com.forsale.app.features.maincontainer.MainContainerActivity r6 = r5.f31390b
            com.forsale.app.features.maincontainer.MainContainerViewModel r1 = r6.x0()
            java.util.concurrent.atomic.AtomicReference r1 = r1.f1()
            java.lang.Object r1 = r1.get()
            java.lang.String r4 = "get(...)"
            kotlin.jvm.internal.o.h(r1, r4)
            com.forsale.app.features.maincontainer.HomeTabs r1 = (com.forsale.app.features.maincontainer.HomeTabs) r1
            r6.i2(r1)
        L41:
            r5.f31389a = r2
            r1 = 100
            java.lang.Object r6 = kotlinx.coroutines.DelayKt.delay(r1, r5)
            if (r6 != r0) goto L4c
            return r0
        L4c:
            java.lang.Integer r6 = r5.f31391c
            if (r6 == 0) goto L71
            com.forsale.app.features.maincontainer.MainContainerActivity r6 = r5.f31390b
            com.forsale.app.features.maincontainer.MainContainerViewModel r6 = r6.x0()
            java.lang.Integer r1 = r5.f31391c
            int r1 = r1.intValue()
            r5.f31389a = r3
            java.lang.Object r6 = r6.A1(r1, r5)
            if (r6 != r0) goto L65
            return r0
        L65:
            com.forsale.adserver.view.models.AdsModel r6 = (com.forsale.adserver.view.models.AdsModel) r6
            if (r6 == 0) goto L7c
            com.forsale.app.features.maincontainer.MainContainerActivity r0 = r5.f31390b
            boolean r1 = r5.f31393e
            com.forsale.app.features.maincontainer.MainContainerActivity.Y0(r0, r6, r1)
            goto L7c
        L71:
            com.forsale.adserver.view.models.AdsModel r6 = r5.f31392d
            if (r6 == 0) goto L7c
            com.forsale.app.features.maincontainer.MainContainerActivity r0 = r5.f31390b
            r1 = 0
            r2 = 0
            com.forsale.app.features.maincontainer.MainContainerActivity.I1(r0, r6, r1, r3, r2)
        L7c:
            wz.p r6 = wz.p.f75480a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.maincontainer.MainContainerActivity$navigateToAdminListingDetails$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((MainContainerActivity$navigateToAdminListingDetails$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
