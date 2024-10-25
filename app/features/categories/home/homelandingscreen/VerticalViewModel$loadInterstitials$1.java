package com.forsale.app.features.categories.home.homelandingscreen;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VerticalViewModel.kt */
@d(c = "com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$loadInterstitials$1", f = "VerticalViewModel.kt", l = {269, 271, 274}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class VerticalViewModel$loadInterstitials$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f24024a;

    /* renamed from: b  reason: collision with root package name */
    Object f24025b;

    /* renamed from: c  reason: collision with root package name */
    int f24026c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ VerticalViewModel f24027d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalViewModel$loadInterstitials$1(VerticalViewModel verticalViewModel, zz.a<? super VerticalViewModel$loadInterstitials$1> aVar) {
        super(2, aVar);
        this.f24027d = verticalViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new VerticalViewModel$loadInterstitials$1(this.f24027d, aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a8, code lost:
        if (r1 == null) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r11.f24026c
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L38
            if (r1 == r5) goto L2c
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            kotlin.f.b(r12)
            goto Lbf
        L17:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1f:
            java.lang.Object r1 = r11.f24025b
            com.google.android.gms.ads.admanager.AdManagerAdRequest r1 = (com.google.android.gms.ads.admanager.AdManagerAdRequest) r1
            java.lang.Object r3 = r11.f24024a
            com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel r3 = (com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel) r3
            kotlin.f.b(r12)
            goto L9f
        L2c:
            java.lang.Object r1 = r11.f24025b
            com.forsale.app.datalayer.database.CategoryEntity r1 = (com.forsale.app.datalayer.database.CategoryEntity) r1
            java.lang.Object r6 = r11.f24024a
            com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel r6 = (com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel) r6
            kotlin.f.b(r12)
            goto L60
        L38:
            kotlin.f.b(r12)
            com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel r12 = r11.f24027d
            androidx.lifecycle.b0 r12 = com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel.L0(r12)
            java.lang.Object r12 = r12.getValue()
            r1 = r12
            com.forsale.app.datalayer.database.CategoryEntity r1 = (com.forsale.app.datalayer.database.CategoryEntity) r1
            if (r1 == 0) goto Laa
            com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel r12 = r11.f24027d
            com.forsale.app.features.categories.home.homelandingscreen.VerticalRepository r6 = com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel.K0(r12)
            r11.f24024a = r12
            r11.f24025b = r1
            r11.f24026c = r5
            java.lang.Object r6 = r6.e(r1, r11)
            if (r6 != r0) goto L5d
            return r0
        L5d:
            r10 = r6
            r6 = r12
            r12 = r10
        L60:
            com.google.android.gms.ads.admanager.AdManagerAdRequest r12 = (com.google.android.gms.ads.admanager.AdManagerAdRequest) r12
            if (r12 == 0) goto La7
            int r7 = r1.getId()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "***************** ad request "
            r8.append(r9)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r8 = 0
            java.lang.Object[] r8 = new java.lang.Object[r8]
            x10.a.b(r7, r8)
            com.forsale.app.utils.OneShotEventHandler r7 = r6.y1()
            kotlin.Pair r8 = new kotlin.Pair
            int r1 = r1.getId()
            java.lang.Integer r1 = kotlin.coroutines.jvm.internal.a.d(r1)
            r8.<init>(r1, r12)
            r11.f24024a = r6
            r11.f24025b = r12
            r11.f24026c = r3
            java.lang.Object r1 = r7.f(r8, r11)
            if (r1 != r0) goto L9d
            return r0
        L9d:
            r1 = r12
            r3 = r6
        L9f:
            java.util.concurrent.atomic.AtomicBoolean r12 = com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel.U0(r3)
            r12.lazySet(r5)
            goto La8
        La7:
            r1 = r4
        La8:
            if (r1 != 0) goto Lc1
        Laa:
            com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel r12 = r11.f24027d
            kotlinx.coroutines.flow.MutableSharedFlow r12 = com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel.N0(r12)
            wz.p r1 = wz.p.f75480a
            r11.f24024a = r4
            r11.f24025b = r4
            r11.f24026c = r2
            java.lang.Object r12 = r12.emit(r1, r11)
            if (r12 != r0) goto Lbf
            return r0
        Lbf:
            wz.p r12 = wz.p.f75480a
        Lc1:
            wz.p r12 = wz.p.f75480a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$loadInterstitials$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((VerticalViewModel$loadInterstitials$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
