package com.forsale.app.features.more.support;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SupportViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.support.SupportViewModel$onMyTicketsClick$1", f = "SupportViewModel.kt", l = {84}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SupportViewModel$onMyTicketsClick$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f32853a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SupportViewModel f32854b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportViewModel$onMyTicketsClick$1(SupportViewModel supportViewModel, zz.a<? super SupportViewModel$onMyTicketsClick$1> aVar) {
        super(2, aVar);
        this.f32854b = supportViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new SupportViewModel$onMyTicketsClick$1(this.f32854b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f32853a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            mutableSharedFlow = this.f32854b.f32829r0;
            wz.p pVar = wz.p.f75480a;
            this.f32853a = 1;
            if (mutableSharedFlow.emit(pVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((SupportViewModel$onMyTicketsClick$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}