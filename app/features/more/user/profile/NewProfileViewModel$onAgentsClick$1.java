package com.forsale.app.features.more.user.profile;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewProfileViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.user.profile.NewProfileViewModel$onAgentsClick$1", f = "NewProfileViewModel.kt", l = {293}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class NewProfileViewModel$onAgentsClick$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f33585a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NewProfileViewModel f33586b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewProfileViewModel$onAgentsClick$1(NewProfileViewModel newProfileViewModel, zz.a<? super NewProfileViewModel$onAgentsClick$1> aVar) {
        super(2, aVar);
        this.f33586b = newProfileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new NewProfileViewModel$onAgentsClick$1(this.f33586b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        f fVar;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f33585a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            mutableSharedFlow = this.f33586b.C;
            h hVar = h.f33697a;
            this.f33585a = 1;
            if (mutableSharedFlow.emit(hVar, this) == f11) {
                return f11;
            }
        }
        fVar = this.f33586b.f33542c;
        fVar.b();
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((NewProfileViewModel$onAgentsClick$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
