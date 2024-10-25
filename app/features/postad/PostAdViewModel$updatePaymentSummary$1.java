package com.forsale.app.features.postad;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.PostAdViewModel$updatePaymentSummary$1", f = "PostAdViewModel.kt", l = {653}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdViewModel$updatePaymentSummary$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f34187a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdViewModel f34188b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ qf.c f34189c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdViewModel$updatePaymentSummary$1(PostAdViewModel postAdViewModel, qf.c cVar, zz.a<? super PostAdViewModel$updatePaymentSummary$1> aVar) {
        super(2, aVar);
        this.f34188b = postAdViewModel;
        this.f34189c = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdViewModel$updatePaymentSummary$1(this.f34188b, this.f34189c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableStateFlow mutableStateFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f34187a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            mutableStateFlow = this.f34188b.f33935h2;
            qf.c cVar = this.f34189c;
            this.f34187a = 1;
            if (mutableStateFlow.emit(cVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdViewModel$updatePaymentSummary$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
