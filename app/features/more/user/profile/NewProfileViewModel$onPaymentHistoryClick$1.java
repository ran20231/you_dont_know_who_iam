package com.forsale.app.features.more.user.profile;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewProfileViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.user.profile.NewProfileViewModel$onPaymentHistoryClick$1", f = "NewProfileViewModel.kt", l = {191}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class NewProfileViewModel$onPaymentHistoryClick$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f33621a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NewProfileViewModel f33622b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewProfileViewModel$onPaymentHistoryClick$1(NewProfileViewModel newProfileViewModel, zz.a<? super NewProfileViewModel$onPaymentHistoryClick$1> aVar) {
        super(2, aVar);
        this.f33622b = newProfileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new NewProfileViewModel$onPaymentHistoryClick$1(this.f33622b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        f fVar;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f33621a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            mutableSharedFlow = this.f33622b.C;
            b0 b0Var = b0.f33692a;
            this.f33621a = 1;
            if (mutableSharedFlow.emit(b0Var, this) == f11) {
                return f11;
            }
        }
        fVar = this.f33622b.f33542c;
        fVar.f();
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((NewProfileViewModel$onPaymentHistoryClick$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
