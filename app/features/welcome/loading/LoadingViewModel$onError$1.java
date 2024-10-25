package com.forsale.app.features.welcome.loading;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoadingViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.welcome.loading.LoadingViewModel$onError$1", f = "LoadingViewModel.kt", l = {137, 138, 143, 152, 160, 162}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class LoadingViewModel$onError$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f37276a;

    /* renamed from: b  reason: collision with root package name */
    Object f37277b;

    /* renamed from: c  reason: collision with root package name */
    Object f37278c;

    /* renamed from: d  reason: collision with root package name */
    int f37279d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ boolean f37280e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ boolean f37281f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ LoadingViewModel f37282g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ Throwable f37283h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingViewModel$onError$1(boolean z11, boolean z12, LoadingViewModel loadingViewModel, Throwable th2, zz.a<? super LoadingViewModel$onError$1> aVar) {
        super(2, aVar);
        this.f37280e = z11;
        this.f37281f = z12;
        this.f37282g = loadingViewModel;
        this.f37283h = th2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new LoadingViewModel$onError$1(this.f37280e, this.f37281f, this.f37282g, this.f37283h, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0116  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x009f -> B:31:0x00a6). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00fc -> B:48:0x0103). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.welcome.loading.LoadingViewModel$onError$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((LoadingViewModel$onError$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
