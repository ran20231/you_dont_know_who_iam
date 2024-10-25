package com.forsale.app.features.more.user.profile;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewProfileViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.user.profile.NewProfileViewModel$onBuyTokenClick$1", f = "NewProfileViewModel.kt", l = {162}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class NewProfileViewModel$onBuyTokenClick$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f33587a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NewProfileViewModel f33588b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewProfileViewModel$onBuyTokenClick$1(NewProfileViewModel newProfileViewModel, zz.a<? super NewProfileViewModel$onBuyTokenClick$1> aVar) {
        super(2, aVar);
        this.f33588b = newProfileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new NewProfileViewModel$onBuyTokenClick$1(this.f33588b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        f fVar;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f33587a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            mutableSharedFlow = this.f33588b.C;
            k kVar = k.f33700a;
            this.f33587a = 1;
            if (mutableSharedFlow.emit(kVar, this) == f11) {
                return f11;
            }
        }
        fVar = this.f33588b.f33542c;
        fVar.d();
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((NewProfileViewModel$onBuyTokenClick$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
