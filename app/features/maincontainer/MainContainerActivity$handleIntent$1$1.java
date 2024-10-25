package com.forsale.app.features.maincontainer;

import android.content.Intent;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainContainerActivity.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.maincontainer.MainContainerActivity$handleIntent$1$1", f = "MainContainerActivity.kt", l = {456}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MainContainerActivity$handleIntent$1$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f31353a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MainContainerActivity f31354b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Intent f31355c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f31356d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainContainerActivity$handleIntent$1$1(MainContainerActivity mainContainerActivity, Intent intent, boolean z11, zz.a<? super MainContainerActivity$handleIntent$1$1> aVar) {
        super(2, aVar);
        this.f31354b = mainContainerActivity;
        this.f31355c = intent;
        this.f31356d = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new MainContainerActivity$handleIntent$1$1(this.f31354b, this.f31355c, this.f31356d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f31353a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            Intent intent = this.f31355c;
            boolean z11 = this.f31356d;
            MainContainerActivity mainContainerActivity = this.f31354b;
            this.f31353a = 1;
            if (this.f31354b.n1().get().b(intent, z11, mainContainerActivity, mainContainerActivity, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((MainContainerActivity$handleIntent$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
