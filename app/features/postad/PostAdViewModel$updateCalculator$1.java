package com.forsale.app.features.postad;

import com.forsale.app.models.CalculatorEntity;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.PostAdViewModel$updateCalculator$1", f = "PostAdViewModel.kt", l = {649}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdViewModel$updateCalculator$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f34174a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdViewModel f34175b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ CalculatorEntity f34176c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdViewModel$updateCalculator$1(PostAdViewModel postAdViewModel, CalculatorEntity calculatorEntity, zz.a<? super PostAdViewModel$updateCalculator$1> aVar) {
        super(2, aVar);
        this.f34175b = postAdViewModel;
        this.f34176c = calculatorEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdViewModel$updateCalculator$1(this.f34175b, this.f34176c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableStateFlow mutableStateFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f34174a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            mutableStateFlow = this.f34175b.f33931f2;
            CalculatorEntity calculatorEntity = this.f34176c;
            this.f34174a = 1;
            if (mutableStateFlow.emit(calculatorEntity, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdViewModel$updateCalculator$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
