package com.forsale.app.features.expiresoon;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ExpireSoonOptionsViewModel.kt */
@d(c = "com.forsale.app.features.expiresoon.ExpireSoonOptionsViewModel$enableBoost$1", f = "ExpireSoonOptionsViewModel.kt", l = {105, FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ExpireSoonOptionsViewModel$enableBoost$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f31275a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ExpireSoonOptionsViewModel f31276b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f31277c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpireSoonOptionsViewModel$enableBoost$1(ExpireSoonOptionsViewModel expireSoonOptionsViewModel, boolean z11, zz.a<? super ExpireSoonOptionsViewModel$enableBoost$1> aVar) {
        super(2, aVar);
        this.f31276b = expireSoonOptionsViewModel;
        this.f31277c = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ExpireSoonOptionsViewModel$enableBoost$1(this.f31276b, this.f31277c, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r5.f31275a
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            kotlin.f.b(r6)
            goto L54
        L13:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1b:
            kotlin.f.b(r6)
            goto L2d
        L1f:
            kotlin.f.b(r6)
            com.forsale.app.features.expiresoon.ExpireSoonOptionsViewModel r6 = r5.f31276b
            r5.f31275a = r3
            java.lang.Object r6 = com.forsale.app.features.expiresoon.ExpireSoonOptionsViewModel.v0(r6, r5)
            if (r6 != r0) goto L2d
            return r0
        L2d:
            if (r6 != 0) goto L3d
            com.forsale.app.features.expiresoon.ExpireSoonOptionsViewModel r6 = r5.f31276b
            androidx.lifecycle.b0 r6 = com.forsale.app.features.expiresoon.ExpireSoonOptionsViewModel.w0(r6)
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.a.a(r4)
            r6.postValue(r0)
            goto L86
        L3d:
            com.forsale.app.features.expiresoon.ExpireSoonOptionsViewModel r6 = r5.f31276b
            com.forsale.app.utils.c0 r6 = com.forsale.app.features.expiresoon.ExpireSoonOptionsViewModel.x0(r6)
            boolean r6 = r6.e()
            if (r6 != 0) goto L79
            com.forsale.app.features.expiresoon.ExpireSoonOptionsViewModel r6 = r5.f31276b
            r5.f31275a = r2
            java.lang.Object r6 = com.forsale.app.features.expiresoon.ExpireSoonOptionsViewModel.v0(r6, r5)
            if (r6 != r0) goto L54
            return r0
        L54:
            com.forsale.app.datalayer.network.entities.ListingDetailsEntity r6 = (com.forsale.app.datalayer.network.entities.ListingDetailsEntity) r6
            if (r6 == 0) goto L65
            java.lang.Boolean r6 = r6.getHasAddons()
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.a.a(r4)
            boolean r6 = kotlin.jvm.internal.o.d(r6, r0)
            goto L66
        L65:
            r6 = r4
        L66:
            if (r6 == 0) goto L69
            goto L79
        L69:
            com.forsale.app.features.expiresoon.ExpireSoonOptionsViewModel r6 = r5.f31276b
            androidx.lifecycle.b0 r6 = com.forsale.app.features.expiresoon.ExpireSoonOptionsViewModel.w0(r6)
            boolean r0 = r5.f31277c
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.a.a(r0)
            r6.postValue(r0)
            goto L86
        L79:
            com.forsale.app.features.expiresoon.ExpireSoonOptionsViewModel r6 = r5.f31276b
            androidx.lifecycle.b0 r6 = com.forsale.app.features.expiresoon.ExpireSoonOptionsViewModel.w0(r6)
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.a.a(r4)
            r6.postValue(r0)
        L86:
            wz.p r6 = wz.p.f75480a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.expiresoon.ExpireSoonOptionsViewModel$enableBoost$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((ExpireSoonOptionsViewModel$enableBoost$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
