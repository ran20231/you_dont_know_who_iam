package com.forsale.app.features.postad;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PLFActivity.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.PLFActivity$nextClicked$1", f = "PLFActivity.kt", l = {283}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PLFActivity$nextClicked$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f33871a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PLFActivity f33872b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PLFActivity$nextClicked$1(PLFActivity pLFActivity, zz.a<? super PLFActivity$nextClicked$1> aVar) {
        super(2, aVar);
        this.f33872b = pLFActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PLFActivity$nextClicked$1(this.f33872b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f33871a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            MutableSharedFlow<wz.p> H2 = this.f33872b.x0().H2();
            wz.p pVar = wz.p.f75480a;
            this.f33871a = 1;
            if (H2.emit(pVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PLFActivity$nextClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
