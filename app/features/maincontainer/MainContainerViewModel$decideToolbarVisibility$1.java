package com.forsale.app.features.maincontainer;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainContainerViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.maincontainer.MainContainerViewModel$decideToolbarVisibility$1", f = "MainContainerViewModel.kt", l = {358, 360}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MainContainerViewModel$decideToolbarVisibility$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f31506a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f31507b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ HomeToolbars f31508c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ MainContainerViewModel f31509d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainContainerViewModel$decideToolbarVisibility$1(HomeToolbars homeToolbars, MainContainerViewModel mainContainerViewModel, zz.a<? super MainContainerViewModel$decideToolbarVisibility$1> aVar) {
        super(2, aVar);
        this.f31508c = homeToolbars;
        this.f31509d = mainContainerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        MainContainerViewModel$decideToolbarVisibility$1 mainContainerViewModel$decideToolbarVisibility$1 = new MainContainerViewModel$decideToolbarVisibility$1(this.f31508c, this.f31509d, aVar);
        mainContainerViewModel$decideToolbarVisibility$1.f31507b = obj;
        return mainContainerViewModel$decideToolbarVisibility$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r6.f31506a
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L23
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L13
            kotlin.f.b(r7)
            goto L58
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            java.lang.Object r1 = r6.f31507b
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.f.b(r7)
            goto L3f
        L23:
            kotlin.f.b(r7)
            java.lang.Object r7 = r6.f31507b
            kotlinx.coroutines.CoroutineScope r7 = (kotlinx.coroutines.CoroutineScope) r7
            com.forsale.app.features.maincontainer.HomeToolbars r1 = r6.f31508c
            if (r1 == 0) goto L42
            com.forsale.app.features.maincontainer.MainContainerViewModel r5 = r6.f31509d
            com.forsale.app.utils.OneShotEventHandler r5 = r5.n1()
            r6.f31507b = r7
            r6.f31506a = r4
            java.lang.Object r7 = r5.f(r1, r6)
            if (r7 != r0) goto L3f
            return r0
        L3f:
            wz.p r7 = wz.p.f75480a
            goto L43
        L42:
            r7 = r2
        L43:
            if (r7 != 0) goto L58
            com.forsale.app.features.maincontainer.MainContainerViewModel r7 = r6.f31509d
            com.forsale.app.utils.OneShotEventHandler r7 = r7.n1()
            com.forsale.app.features.maincontainer.HomeToolbars r1 = com.forsale.app.features.maincontainer.HomeToolbars.MAIN_TOOLBAR
            r6.f31507b = r2
            r6.f31506a = r3
            java.lang.Object r7 = r7.f(r1, r6)
            if (r7 != r0) goto L58
            return r0
        L58:
            wz.p r7 = wz.p.f75480a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.maincontainer.MainContainerViewModel$decideToolbarVisibility$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((MainContainerViewModel$decideToolbarVisibility$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
