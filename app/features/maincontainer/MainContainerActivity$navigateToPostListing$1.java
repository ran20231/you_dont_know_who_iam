package com.forsale.app.features.maincontainer;

import com.forsale.app.utils.analytics.PLFSource;
import com.leanplum.internal.ResourceQualifiers;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainContainerActivity.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.maincontainer.MainContainerActivity$navigateToPostListing$1", f = "MainContainerActivity.kt", l = {ResourceQualifiers.Qualifier.AnonymousClass14.DENSITY_TV, 214}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MainContainerActivity$navigateToPostListing$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f31414a;

    /* renamed from: b  reason: collision with root package name */
    int f31415b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ MainContainerActivity f31416c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ PLFSource f31417d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainContainerActivity$navigateToPostListing$1(MainContainerActivity mainContainerActivity, PLFSource pLFSource, zz.a<? super MainContainerActivity$navigateToPostListing$1> aVar) {
        super(2, aVar);
        this.f31416c = mainContainerActivity;
        this.f31417d = pLFSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new MainContainerActivity$navigateToPostListing$1(this.f31416c, this.f31417d, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r8.f31415b
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L22
            if (r1 == r2) goto L1e
            if (r1 != r3) goto L16
            java.lang.Object r0 = r8.f31414a
            zf.b r0 = (zf.b) r0
            kotlin.f.b(r9)
            goto L6f
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            kotlin.f.b(r9)
            goto L5a
        L22:
            kotlin.f.b(r9)
            com.forsale.app.features.maincontainer.MainContainerActivity r9 = r8.f31416c
            boolean r9 = com.forsale.app.features.maincontainer.MainContainerActivity.V0(r9)
            if (r9 == 0) goto L45
            com.forsale.app.features.maincontainer.MainContainerActivity r9 = r8.f31416c
            com.forsale.app.features.maincontainer.MainContainerViewModel r1 = r9.x0()
            java.util.concurrent.atomic.AtomicReference r1 = r1.f1()
            java.lang.Object r1 = r1.get()
            java.lang.String r4 = "get(...)"
            kotlin.jvm.internal.o.h(r1, r4)
            com.forsale.app.features.maincontainer.HomeTabs r1 = (com.forsale.app.features.maincontainer.HomeTabs) r1
            r9.i2(r1)
        L45:
            com.forsale.app.features.maincontainer.MainContainerActivity r9 = r8.f31416c
            cx.a r9 = r9.s1()
            java.lang.Object r9 = r9.get()
            ag.a r9 = (ag.a) r9
            r8.f31415b = r2
            java.lang.Object r9 = r9.a(r8)
            if (r9 != r0) goto L5a
            return r0
        L5a:
            zf.b r9 = (zf.b) r9
            com.forsale.app.features.maincontainer.MainContainerActivity r1 = r8.f31416c
            com.forsale.app.features.maincontainer.MainContainerViewModel r1 = r1.x0()
            r8.f31414a = r9
            r8.f31415b = r3
            java.lang.Object r1 = r1.z1(r8)
            if (r1 != r0) goto L6d
            return r0
        L6d:
            r0 = r9
            r9 = r1
        L6f:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L91
            com.forsale.app.features.maincontainer.MainContainerActivity r9 = r8.f31416c
            com.forsale.app.features.auth.e r1 = r9.l1()
            com.forsale.app.utils.analytics.auth.AuthenticationSourcePage r2 = com.forsale.app.utils.analytics.auth.AuthenticationSourcePage.ADD_LISTING
            com.forsale.app.features.auth.login.SignInIntention r3 = com.forsale.app.features.auth.login.SignInIntention.POST_AD
            r4 = 0
            com.forsale.app.features.maincontainer.MainContainerActivity$navigateToPostListing$1$1 r5 = new com.forsale.app.features.maincontainer.MainContainerActivity$navigateToPostListing$1$1
            com.forsale.app.features.maincontainer.MainContainerActivity r9 = r8.f31416c
            com.forsale.app.utils.analytics.PLFSource r6 = r8.f31417d
            r5.<init>()
            r6 = 4
            r7 = 0
            com.forsale.app.features.auth.e.a.a(r1, r2, r3, r4, r5, r6, r7)
            goto La8
        L91:
            com.forsale.app.features.maincontainer.MainContainerActivity r9 = r8.f31416c
            androidx.activity.result.b r9 = com.forsale.app.features.maincontainer.MainContainerActivity.S0(r9)
            com.forsale.app.features.maincontainer.MainContainerActivity r1 = r8.f31416c
            zf.a$c r2 = new zf.a$c
            com.forsale.app.utils.analytics.PLFSource r4 = r8.f31417d
            r5 = 0
            r2.<init>(r4, r5, r3, r5)
            android.content.Intent r0 = r0.b(r1, r2)
            r9.a(r0)
        La8:
            wz.p r9 = wz.p.f75480a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.maincontainer.MainContainerActivity$navigateToPostListing$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((MainContainerActivity$navigateToPostListing$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
