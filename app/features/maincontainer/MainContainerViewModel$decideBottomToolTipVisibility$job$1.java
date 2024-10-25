package com.forsale.app.features.maincontainer;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainContainerViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.maincontainer.MainContainerViewModel$decideBottomToolTipVisibility$job$1", f = "MainContainerViewModel.kt", l = {382, 384, 387, 392, 397}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MainContainerViewModel$decideBottomToolTipVisibility$job$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f31498a;

    /* renamed from: b  reason: collision with root package name */
    Object f31499b;

    /* renamed from: c  reason: collision with root package name */
    int f31500c;

    /* renamed from: d  reason: collision with root package name */
    private /* synthetic */ Object f31501d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ MainContainerViewModel f31502e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainContainerViewModel$decideBottomToolTipVisibility$job$1(MainContainerViewModel mainContainerViewModel, zz.a<? super MainContainerViewModel$decideBottomToolTipVisibility$job$1> aVar) {
        super(2, aVar);
        this.f31502e = mainContainerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        MainContainerViewModel$decideBottomToolTipVisibility$job$1 mainContainerViewModel$decideBottomToolTipVisibility$job$1 = new MainContainerViewModel$decideBottomToolTipVisibility$job$1(this.f31502e, aVar);
        mainContainerViewModel$decideBottomToolTipVisibility$job$1.f31501d = obj;
        return mainContainerViewModel$decideBottomToolTipVisibility$job$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2 A[Catch: all -> 0x00ec, TryCatch #2 {all -> 0x0021, blocks: (B:10:0x001c, B:55:0x010a, B:57:0x010f, B:16:0x002c, B:19:0x0035, B:43:0x00c0, B:46:0x00c6, B:22:0x0046, B:38:0x008d, B:40:0x00a2, B:25:0x004e, B:32:0x006d, B:34:0x0072, B:28:0x005a), top: B:63:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c6 A[Catch: all -> 0x00ec, TRY_LEAVE, TryCatch #2 {all -> 0x0021, blocks: (B:10:0x001c, B:55:0x010a, B:57:0x010f, B:16:0x002c, B:19:0x0035, B:43:0x00c0, B:46:0x00c6, B:22:0x0046, B:38:0x008d, B:40:0x00a2, B:25:0x004e, B:32:0x006d, B:34:0x0072, B:28:0x005a), top: B:63:0x000c }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.maincontainer.MainContainerViewModel$decideBottomToolTipVisibility$job$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((MainContainerViewModel$decideBottomToolTipVisibility$job$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
